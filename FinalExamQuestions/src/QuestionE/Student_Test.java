package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Harry", "James", "Potter", dBirthDate, "123 Some St.","(123)-456-7890", "hpotter@hogwarts.edu", "BUSINESS");
		Student stu3 = new Student("Hermione", "Jean", "Granger", dBirthDate, "123 Some St.","(123)-456-7890", "hgranger@hogwarts.edu", "CHEM");
		Student stu4 = new Student("Ron", "Bilius", "Weasley", dBirthDate,  "123 Some St.","(123)-456-7890", "rweasley@hogwarts.edu", "ENGINEERING");
		Student stu5 = new Student("Neville", "Frank", "Longbottom", dBirthDate,  "123 Some St.","(123)-456-7890", "nlongbottom@hogwarts.edu", "COMPSCI");
		
		HashMap<UUID, Student> students = new HashMap<UUID, Student>();
		students.put(stu1.getPersonID(), stu1);
		students.put(stu2.getPersonID(), stu2);
		students.put(stu3.getPersonID(), stu3);
		students.put(stu4.getPersonID(), stu4);
		students.put(stu5.getPersonID(), stu5);
		
		
		assertTrue(students.size() == 5);
	}

}
