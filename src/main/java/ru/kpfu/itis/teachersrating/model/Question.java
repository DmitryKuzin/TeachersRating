package ru.kpfu.itis.teachersrating.model;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question implements Comparable<Question> {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column
    private String text;

    @Column(name = "order_num")
    private Integer order;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public int compareTo(Question o) {
        final int BEFORE = -1;
        final int AFTER = 1;
        if (o == null) {
            return BEFORE;
        }
        Comparable<Integer> thisQuestionOptionOrder = this.getOrder();
        Comparable<Integer> oQuestionOptionOrder = o.getOrder();
        if (thisQuestionOptionOrder == null) {
            return AFTER;
        } else if (oQuestionOptionOrder == null) {
            return BEFORE;
        } else {
            return thisQuestionOptionOrder.compareTo(o.getOrder());
        }
    }
}
