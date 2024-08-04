package com.tnp.cruddemo;

import com.tnp.cruddemo.dao.StudentDAO;
import com.tnp.cruddemo.entities.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
//	createMultipleStudents(studentDAO, 500);
//			readStudent(studentDAO, 200);
//			readAllStudents(studentDAO);
//			findByLastname(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO, 3);
//			deleteAllStudents(studentDAO);
//
		};
	}


	private void deleteStudent(StudentDAO studentDAO, int id){
		studentDAO.deleteStudent(id);
		System.out.println("Student deleted");
	}

	private void updateStudent(StudentDAO studentDAO) {
		int id = 1;
		Student student = studentDAO.findStudent(id);
		student.setFirstName("Mario");
		studentDAO.updateStudent(student);
		System.out.println("Student updated.");

	}


	private void createMultipleStudents(StudentDAO studentDAO, int size) {
		for(int i = 0; i< size; i++){
			Student newSTD = new Student("Student"+i, "STDLast"+i, "studend"+i+"@edu.com");
			studentDAO.save(newSTD);
			System.out.println("Created studen number "+i);
		}
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating student object...");
		Student tmpStudnet = new Student("Paol", "Marku", "paol@topnotch-programmer.com");

		System.out.println("Saving student");
		studentDAO.save(tmpStudnet);

		System.out.println("Generated id: " + tmpStudnet.getId());
	}

	private void readStudent(StudentDAO studentDAO, int id){
		System.out.println("Searching for student with id " + id);
		Student found = studentDAO.findStudent(id);
		if(found != null){
			System.out.println("Found");
			System.out.println(found.toString());
		}else {
			System.out.println("Student not found 404");
		}

	}

	private void readAllStudents(StudentDAO studentDAO){
		List<Student> allStudnets = studentDAO.findAll();

		for(Student std : allStudnets){
			System.out.println(std.toString());
		}
	}

	private void findByLastname(StudentDAO studentDAO){
		List <Student> students = studentDAO.findByLastName("Marku");

		for(Student std : students){
			System.out.println(std.toString());
		}
	}

	private void deleteAllStudents(StudentDAO studentDAO){
		int rows = studentDAO.deleteAll();
		System.out.println("Deleted " + rows + " rows of data.");
	}

}
