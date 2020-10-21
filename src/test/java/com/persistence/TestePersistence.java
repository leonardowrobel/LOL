package com.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "test")
public class TestePersistence {

    private Long id;
    private String title;

    public TestePersistence() {
    }

    public TestePersistence(Long id, String title) {
        this.id = id;
        this.title = title;
    }    

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
