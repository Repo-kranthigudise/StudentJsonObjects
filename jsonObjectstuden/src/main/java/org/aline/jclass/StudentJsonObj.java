package org.aline.jclass;

import org.json.simple.JSONObject;

public class StudentJsonObj {

	public static void main(String[] args) {
		JSONObject sobj=new JSONObject();
		Student s=new Student(1, "kranthi","cse");
		Student s1=new Student(3, "akash","EEE");
		Student s2=new Student(2, "sunder","ese");
		sobj.put(1,s);
		sobj.put(2,s1);
		sobj.put(3,s2);
		System.out.println(sobj);
	}

}
