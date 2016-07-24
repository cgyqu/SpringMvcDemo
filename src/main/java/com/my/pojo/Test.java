package com.my.pojo;


public class Test {
	private int id;
	
	private String name;
	
	private String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
//	public static void main(String[] args) {
//		Test test=new Test();
//		test.setId(1);
//		test.setName("test");
//		test.setName("this is test");
//		String json=new Gson().toJson(test);
//	    System.out.println(json);
//	}
}
