package training.spring.validation.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import training.spring.validation.bean.Employee;

@Controller
@RequestMapping("forms/validationform.html")
public class ValidationController {
	@RequestMapping(method=RequestMethod.GET)
	public String checkValidationForm(@Valid Employee emp,BindingResult result,Map<String,Employee> mapModel) {
		System.out.println("@Valid annotation trigger spring validation to be reflected on object which is related to it");
		System.out.println("binding result is a spring object which can hold the result of validatio and bining the errors occuredd");
		if(result.hasErrors()) {
			System.out.println("erroroccured,now the dispatcherservlet will identify the registration form"+"with its suffix as configures in configuration file");
			return "registrationform";
		}
		System.out.println("proper data(without errors) is available in emp obj is kept in map");
		   mapModel.put("empKey",emp);
		   return "validationsuccess";
		
	}
}
