package ru.kpfu.itis.teachersrating.model;

import org.hibernate.annotations.SortNatural;

import javax.persistence.*;
import java.util.SortedSet;

@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @SortNatural
    @OrderBy
    @OneToMany(mappedBy = "survey", cascade = CascadeType.ALL, orphanRemoval = true)
    private SortedSet<Question> questions;

    public Survey() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SortedSet<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(SortedSet<Question> questions) {
        this.questions = questions;
    }
}
