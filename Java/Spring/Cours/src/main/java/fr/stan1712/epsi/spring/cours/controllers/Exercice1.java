package fr.stan1712.epsi.spring.cours.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequestMapping(path="/")
@RestController
public class Exercice1 {

	@RequestMapping(path="/", method=RequestMethod.GET)
	public void getConsole() {
		System.out.println("coucou");
	}

	@RequestMapping(path="/string", method=RequestMethod.GET)
	public String getString() {
		return "ceci est une chaîne de caractères";
	}

	

	static class Fruit {
		private int nbre = 42;
		public String gout() {
			return "wow c bon";
		}
	}
	@RequestMapping(path="/object", method=RequestMethod.GET)
	public Fruit getObject() {
		return new Fruit();
	}

	@RequestMapping(path="/list", method=RequestMethod.GET)
	public ArrayList<String> getList() {
		final ArrayList<String> list = new ArrayList<String>();
		list.add("salut");
		list.add("bjr");
		list.add("cc");

		return list;
	}

}
