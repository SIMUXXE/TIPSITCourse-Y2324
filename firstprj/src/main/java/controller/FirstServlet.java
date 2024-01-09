package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Person;

@WebServlet(urlPatterns = {"/myPage", "/api/v1.0/people"})
public class FirstServlet extends HttpServlet {
	private List<Person> people = new ArrayList<>();
	public FirstServlet() {
		people.add(new Person(0, "Simone", "Esposito"));
		people.add(new Person(1, "Salvatore", "Caprio"));
		people.add(new Person(3, "Giuseppe", "Langellotti"));
		people.add(new Person(4, "Adriano", "Russo"));
		people.add(new Person(5, "Francesco", "Carrano"));
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	req.getRequestDispatcher("/index.jsp").forward(req, res);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/json");
		res.setCharacterEncoding("UTF-8");
		people.add(new Gson().fromJson(req.getReader(), Person.class));
		res.getWriter().print(new Gson().toJson(people));
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/json");
		res.setCharacterEncoding("UTF-8");
		Person person = new Gson().fromJson(req.getReader(), Person.class);
		for(Person p: people) {
			if(p.getId() == person.getId()) {
				p.setFirstname(person.getFirstname());
				p.setLastname(person.getLastname());
				break;
			}
		}
		res.getWriter().print("success");
	}
}