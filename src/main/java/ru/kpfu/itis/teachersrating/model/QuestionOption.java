package ru.kpfu.itis.teachersrating.model;

import javax.persistence.*;

@Entity
@Table(name = "question_option")
public class QuestionOption implements Comparable<QuestionOption> {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String value;

    @Column(nullable = false)
    private String text;

    @Column(name = "order_num")
    private Integer order;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public QuestionOption() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public int compareTo(QuestionOption o) {
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
