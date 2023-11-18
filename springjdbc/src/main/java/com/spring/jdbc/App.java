package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Programing gone start" );
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    	
     StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
/*  Student student = new Student();
  student.setId(147);
  student.setName("Right Brother");
  student.setCity("America");
  int result = studentDao.insert(student);
    System.out.println("One row affected.. "+result);*/
   
//    Student student = new Student();
//    
//    student.setName("Mark Wantey");
//    student.setCity("Mars");
//    student.setId(6);
//    int result = studentDao.change(student);
//    System.out.println("Changed Successfully!.."+ result);
  
     
//     int result =studentDao.delete(147);
//     System.out.println("Deleted Succesfully"+result);
//   
     
     
     
     
     
//     Student student = studentDao.getStudent(456);
//     System.out.println(student);
   
    
    List<Student>students=studentDao.getAllStuent();
    
    for(Student s:students) {
    	System.out.println(s);
    }
    
    }
     
}
//40