package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import bean.Student;
import service.StudentService;
//@RequestMapping("controller")
@Controller   //将StudentController加入IOC容器（重复了）

public class StudentController {
	@Autowired
	@Qualifier("studentService")
	//控制器依赖于Service
	private StudentService studentService;
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	//列表
	@RequestMapping("list")
	public String list(Model model) throws Exception {
		model.addAttribute("students",studentService.getAllStudent());
		return "list";
	}
	//删除操作
	@RequestMapping("delete")
	public String testDelete(int id) {
		studentService.deleteStudent(id);
		return "redirect:list" ;
	}
	
	//编辑操作,进入编辑页面
	@RequestMapping("input")
	public String input(Integer id,Model model) {
		if(id!=null) {
			model.addAttribute("student",studentService.getStudent(id));
		}
		return "input";
	}
	
	//保存或更新操作
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
