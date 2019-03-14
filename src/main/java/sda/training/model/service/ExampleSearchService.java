package sda.training.model.service;

import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.training.model.Cat;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Service
public class ExampleSearchService {

    private final EntityManager entityManager;
    private FullTextEntityManager fullTextEntityManager;

    @Autowired
    public ExampleSearchService(final EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @PostConstruct
    private void initializeHibernateSearch() {
        try {
             fullTextEntityManager
                    = Search.getFullTextEntityManager(entityManager);
            fullTextEntityManager.createIndexer().startAndWait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void search(String text) {
        // create the query using Hibernate Search query DSL
        QueryBuilder queryBuilder =
                fullTextEntityManager.getSearchFactory()
                        .buildQueryBuilder()
                        .forEntity(Cat.class).get();

        // a very basic query by keywords
        Query query =
                queryBuilder
                        .keyword()
                        .onFields("name",
                                "city",
                                "email")
                        .matching(text)
                        .createQuery();
    }


}
