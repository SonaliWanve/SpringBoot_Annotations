package com.SpringBootAnnotations.SpringBootAnnotations;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired 
	@Qualifier("execution")

}
