package project.dao.impl;

import project.bean.Student;
import project.dao.StudentDao;
import project.db.*;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> lookAllStudent() {
        // 关键：让selectall()返回查询到的学生列表，并接收这个列表
        @SuppressWarnings("unchecked")
        List<Student> studentList = select.selectall();
        return studentList; // 返回实际数据，而非空列表
    }

    @Override
    public boolean addStudent(Student student) {
        return Insert.insert(student); // 确保Insert.insert()能正确执行并返回是否成功
    }

    @Override
    public Student lookStudentById(String sid) {
        // 关键：接收按学号查询的单个学生对象
        Student student =select.selectStudentBySID(sid);
        return student; // 返回查询到的学生（null则表示无数据）
    }

    @Override
    public List<Student> lookStudentByName(String sname) {
        // 关键：接收按姓名查询的学生列表
        @SuppressWarnings("unchecked")
        List<Student> studentList = select.selectStudentByName(sname);
        return studentList; // 返回实际数据，而非空列表
    }

    @Override
    public boolean updateStudent(Student student) {
        return update.Update(student); // 确保Update()返回是否修改成功
    }

    @Override
    public boolean deleteStudent(String sid) {
        return delete.deleteSid(sid); // 确保deleteSid()返回是否删除成功
    }
}