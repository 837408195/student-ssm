package service;

import java.util.List;

import bean.Student;
import mapper.StudentMapper;

public class StudentServiceImpl implements StudentService{
	//serviceÒÀÀµÓÚdao(mapper)
	private StudentMapper studentMapper;
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	@Override
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
		
	}
	@Override
	public void deleteStudent(int id) {
		studentMapper.deleteStudent(id);
		
	}
	@Override
	public void updateStudent(Student student) {
		studentMapper.updateStudent(student);
		
	}
	@Override
	public Student getStudent(int id) {
		return studentMapper.getStudent(id);
	}
	@Override
	public List<Student> getAllStudent() throws Exception {
		return studentMapper.getAllStudent();
	}
	

}
