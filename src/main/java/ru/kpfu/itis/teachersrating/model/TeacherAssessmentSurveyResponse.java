package ru.kpfu.itis.teachersrating.model;

import javax.persistence.*;

@Entity
@Table(name = "ta_survey_response")
public class TeacherAssessmentSurveyResponse {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToOne(targetEntity = SurveyResponse.class)
    @JoinColumn(nullable = false, name = "survey_response_id")
    private SurveyResponse surveyResponse;

    public TeacherAssessmentSurveyResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public SurveyResponse getSurveyResponse() {
        return surveyResponse;
    }

    public void setSurveyResponse(SurveyResponse surveyResponse) {
        this.surveyResponse = surveyResponse;
    }
}
