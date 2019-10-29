package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import bean.Student;
import service.StudentService;
//@RequestMapping("controller")
@Controller   //��StudentController����IOC�������ظ��ˣ�

public class StudentController {
	@Autowired
	@Qualifier("studentService")
	//������������Service
	private StudentService studentService;
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	//�б�
	@RequestMapping("list")
	public String list(Model model) throws Exception {
		model.addAttribute("students",studentService.getAllStudent());
		return "list";
	}
	//ɾ������
	@RequestMapping("delete")
	public String testDelete(int id) {
		studentService.deleteStudent(id);
		return "redirect:list" ;
	}
	
	//�༭����,����༭ҳ��
	@RequestMapping("input")
	public String input(Integer id,Model model) {
		if(id!=null) {
			model.addAttribute("student",studentService.getStudent(id));
		}
		return "input";
	}
	
	//�������²���
	@RequestMapping("saveOrUpdate")
	public String saveOrUpdate(Student student) {
		if(student.getId()==null) {
			studentService.addStudent(student);
		}else {
			studentService.updateStudent(student);
		}
		return "redirect:list" ;
	}
}
