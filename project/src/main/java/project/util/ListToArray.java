package project.util;

import java.util.List;

import project.bean.Student;

public class ListToArray {
	public static String [][] toArray(List<Student> list) {
		  String [][] arr=new String[list.size()][6];
		  for(int i=0;i<list.size();i++) {
			  Student student=list.get(i);
			  arr[i][0]=student.getSid();
			  arr[i][1]=student.getSname();
			  arr[i][2]=student.getSclass();
			  arr[i][3]=student.getAddress();
			  arr[i][4]=student.getTeleNumber();		  
			  arr[i][5]=student.getQQ();
		  }
		  return arr;
	  }

}
