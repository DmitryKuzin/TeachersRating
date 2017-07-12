package ru.kpfu.itis.teachersrating.form;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Size;

public class TeacherForm {
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 30, message = "Максимальная длина 30 символов")
    private String firstname;

    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 30, message = "Максимальная длина 30 символов")
    private String lastname;

    private MultipartFile file;

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

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
