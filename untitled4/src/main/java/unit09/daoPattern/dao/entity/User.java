package main.java.unit09.daoPattern.dao.entity;

import main.java.unit05.Data;

@Data   //Lombok注解
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String username;
	private String password;
	private String realname;
	private String mobile;
	private int age=0;

	public void setUsername(String un) {
	}

	public void setPassword(String password) {
	}

	public void setRealname(String realname) {
	}

	public void setMobile(String mobile) {
	}

	public void setAge(int age) {
	}

	public String getUsername() {
	}

	public String getPassword() {
	}

	/*public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
     //选中实体类属性-->右键，选择Source-->Generate toString()，即可自动生成
     @Override
     public String toString() {
         return "User [username=" + username + ", password=" + password + ", realname=" 
 + realname + ", mobile=" + mobile+ ", age=" + age + "]";
	}*/
}
