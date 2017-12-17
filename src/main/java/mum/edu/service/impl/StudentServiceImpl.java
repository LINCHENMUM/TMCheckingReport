package mum.edu.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import mum.edu.dao.StudentDao;
import mum.edu.domain.Student;
import mum.edu.service.StudentService;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao;

    @Override
    @Transactional
    public Student save(Student student) {
        long id = studentDao.save(student);
        return studentDao.get(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }

    @Override
    @Transactional
    public Student update(Student student) {
        return studentDao.update(student);
    }

    public StudentServiceImpl(){

    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
