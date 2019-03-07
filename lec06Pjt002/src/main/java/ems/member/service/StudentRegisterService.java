// 학생을 등록하는 클래스 //


package ems.member.service;

import ems.member.Student;
import ems.member.dao.StudentDao;


public class StudentRegisterService {
	
	private StudentDao studentDao;
	
	public StudentRegisterService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void register(Student student) {
		String sNum = student.getsNum();
		
		if(verify(student.getsNum())) {
			studentDao.insert(student);
		}else {
			System.out.println("The student has alreay registered");
		}
	}
	
	// verify : 확인하다
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student == null?true:false;
	}
}
