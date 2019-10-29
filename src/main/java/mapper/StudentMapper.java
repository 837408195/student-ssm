package mapper;

import java.util.List;

import bean.Student;

public interface StudentMapper {
	public void addStudent(Student student);
	public void deleteStudent(int id);
	public void updateStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudent() throws Exception;
}

