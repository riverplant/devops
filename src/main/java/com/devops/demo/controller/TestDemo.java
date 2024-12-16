package com.devops.demo.controller;

public class TestDemo {

	  public static void main(String[] args) {
	        Object obj = "Hello, Java 17!";

//	        String result = switch (obj) {
//	            case Integer i -> "Integer with value: " + i;
//	            case String s && s.length() > 10 -> "String longer than 10 characters: " + s;
//	            case String s -> "String: " + s;
//	            case null -> "Object is null";
//	            default -> "Unknown type";
//	        };

	        //System.out.println(result);
	    }
	  
	  public void switchTest() {		  
		  String name = "徐蔗";
		  String country = switch(name){

		    case "徐蔗","周瑜" -> "三国";
		    case "项羽","刘邦" -> "汉朝";

		     default -> "未知";
		  };
		  
		  String jsonString = """
		  		 
		  		""";
	  }
	  
	  
	  public void instanceOfTest() {		  
		  Object object = 1;
		  if ( object instanceof Integer i) {
			  System.out.println("Integer====" + i.intValue());
		  }else if (object instanceof String str) {
			  System.out.println("String======" + str.charAt(0));
		  }
	  }
	  
	  
	  
	  
	  

}
