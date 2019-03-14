package sda.training.model;

import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

@Entity
@Indexed
@Table(name = "cat_passport")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passport_id")
    private Long id;

    @Column(name = "passport_content", columnDefinition = "LONGTEXT")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
