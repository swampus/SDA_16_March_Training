package sda.training.repositry;

import org.springframework.data.repository.CrudRepository;
import sda.training.model.Cat;

/*
 Classic way for spring-boot, but I don`t want you to use that,
 too abstract from hibernate, and too easy, explore EntityManger, Dao,
 Criteria, Or Hibernate Search
 */
public interface SomeRepository extends CrudRepository<Cat, Long>{

}
