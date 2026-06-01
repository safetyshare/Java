package project.dao;

import project.bean.Student;

import java.util.List;

public interface StudentDao {
    List<Student> lookAllStudent();

    boolean addStudent(Student student);

    Student lookStudentById(String sid);

    List<Student> lookStudentByName(String sname);

    boolean updateStudent(Student student);

    boolean deleteStudent(String sid);
}
