package ru.kpfu.itis.teachersrating.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstname;

    @Column(name = "last_name", nullable = false)
    private String lastname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column
    private String description;

    @Column(name = "image_path")
    private String imagePath;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "institute_teacher",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "institute_id"))
    private Set<Institute> institutes;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TeacherAssessmentSurveyResponse> surveyResponses;

    @Column(name = "workplace")
    private String workplace;

    public Teacher() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Set<Institute> getInstitutes() {
        return institutes;
    }

    public void setInstitutes(Set<Institute> institutes) {
        this.institutes = institutes;
    }

    public List<TeacherAssessmentSurveyResponse> getSurveyResponses() {
        return surveyResponses;
    }

    public void setSurveyResponses(List<TeacherAssessmentSurveyResponse> surveyResponses) {
        this.surveyResponses = surveyResponses;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
