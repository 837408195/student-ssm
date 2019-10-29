package service;

import java.util.List;
import bean.Student;

public interface StudentService {
	public void addStudent(Student student);
	public void deleteStudent(int id);
	public void updateStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudent() throws Exception;
}
