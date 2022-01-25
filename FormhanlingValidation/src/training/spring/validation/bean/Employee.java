package training.spring.validation.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Employee {
	@NotEmpty
	@Size(min=1,max=10)
private String userName;
	@NotNull
	@Min(18)
	@Max(110)
	@NumberFormat(style=Style.NUMBER)
private int age;
	@NotEmpty(message="Password not be blank")
	@Size(min=1,max=10,message="")
private String password;
	
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
