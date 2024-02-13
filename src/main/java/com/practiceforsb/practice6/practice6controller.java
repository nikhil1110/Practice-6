package com.practiceforsb.practice6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class practice6controller {

 @RequestMapping("/dream1")
public String dream1()
  { return "hello this is dream1";
	}
 @RequestMapping("/dream2/{name}/")
 public String dream2(@PathVariable String name, @RequestParam int id)
 {
	 return "hello "+name+" your id is "+(id+10);
 }
 @GetMapping("/")
 public kid ok()
 {
	 kid a = new kid("nikhil",25,"noida");
	 return a;
	 
	 
 }
}
