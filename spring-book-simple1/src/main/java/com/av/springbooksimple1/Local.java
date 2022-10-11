package com.av.springbooksimple1;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Local {
	@GetMapping("time")
	public LocalDateTime getData()
	{
		return LocalDateTime.now();

	 }
	
}
