package com.devops.demo.record;

public class RecordDemo {

	public static void main(String[] args) {
		//record对象创建后不能被修改
		UserRecord userRecord = new UserRecord(1L, "aa");
		System.out.println(userRecord.userId());
		System.out.println(userRecord.userName());
		
		UserRecord userRecord2 = new UserRecord(1L, "aa");
		//record对象属性相同，就相等
		System.out.println(userRecord.equals(userRecord2));
	}
}
