package com.stackroute.exe4;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
	
	public int compare(Student a,Student b)
	{
		if(a.getAge()!=b.getAge())
		{
		return b.getAge()-a.getAge();
		}
		else if(a.getName()!=b.getName())
		{
		return b.getName().compareTo(a.getName());	
		}
		else
		{
		return b.getiD()-a.getiD();
		}
	}

}

//class StudentSorterName implements Comparator<Student>{
//	public int compare(Student a,Student b)
//	{
//		return b.getName().compareTo(a.getName());
//	}
//}

//class StudentSorterID implements Comparator<Student>{
//	public int compare(Student a,Student b)
//	{
//		return b.getiD()-a.getiD();
//	} 
//}
