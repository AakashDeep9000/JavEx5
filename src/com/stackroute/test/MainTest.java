package com.stackroute.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.stackroute.exe4.Student;
import com.stackroute.exe4.StudentSorter;

public class MainTest {

	@Test
	public void test() {
		Student s1 = new Student("sdfweq", 4637, 15);
		Student s2 = new Student("weiwo", 8274, 15);
		Student s3 = new Student("sdfweq", 9820, 15);
		Student s4 = new Student("oijcm", 6402, 19);
		Student s5 = new Student("qqoxm", 2930, 17);
		List<Student> studentArray = new ArrayList<Student>();
		studentArray.add(s1);
		studentArray.add(s2);
		studentArray.add(s3);
		studentArray.add(s4);
		studentArray.add(s5);
		List<Student> expec = new ArrayList<Student>();
		expec.add(s4);
		expec.add(s5);
		expec.add(s2);
		expec.add(s3);
		expec.add(s1);
		Collections.sort(studentArray, new StudentSorter());
		assertEquals(expec,studentArray);
	}

}
