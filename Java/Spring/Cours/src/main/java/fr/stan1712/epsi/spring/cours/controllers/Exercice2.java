package fr.stan1712.epsi.spring.cours.controllers;

import fr.stan1712.epsi.spring.cours.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path="/")
@RestController
public class Exercice2 {

	@PostMapping("/user")
	public String insert(@RequestBody User obj)
	{
		System.out.println(obj.getFirstName());

		return "Data Inserted";
	}

}
