package bean;

public class Student {
	private Integer id;
	private String sno;
	private String sname;
	private String sex;
	private String major;
	private String grade;
	private String cname;
	private	String aname;
	private String dorm;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String sno, String sname, String sex, String major, String grade, String cname,
			String aname, String dorm) {
		super();
		this.id = id;
		this.sno = sno;
		this.sname = sname;
		this.sex = sex;
		this.major = major;
		this.grade = grade;
		this.cname = cname;
		this.aname = aname;
		this.dorm = dorm;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getDorm() {
		return dorm;
	}
	public void setDorm(String dorm) {
		this.dorm = dorm;
	}
	
}
