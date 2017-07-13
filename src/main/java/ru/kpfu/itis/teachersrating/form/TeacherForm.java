package ru.kpfu.itis.teachersrating.form;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Size;
import java.util.List;

public class TeacherForm {
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 30, message = "Максимальная длина 30 символов")
    private String firstname;

    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 30, message = "Максимальная длина 30 символов")
    private String lastname;

    private List<Long> institute;

    private MultipartFile file;

    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 60, message = "Максимальная длина 60 символов")
    private String workplace;

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

    public List<Long> getInstitute() {
        return institute;
    }

    public void setInstitute(List<Long> institute) {
        this.institute = institute;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
