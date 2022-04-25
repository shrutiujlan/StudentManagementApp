package StudentManagementSystem.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UIController {


	@GetMapping(path = {"/","/students","/add-student/**","/view-student/**",})
	public String getView() {
		return "index";
	}
}
