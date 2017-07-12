package ru.kpfu.itis.teachersrating.util;

import ru.kpfu.itis.teachersrating.form.AddTeacherForm;
import ru.kpfu.itis.teachersrating.model.Teacher;

public class TeacherAddFormTransformer {

    public static Teacher transform(AddTeacherForm form) {
        if (form == null) {
            return null;
        }
        Teacher teacher = new Teacher();
        teacher.setName(form.getName());
        return teacher;
    }

}
