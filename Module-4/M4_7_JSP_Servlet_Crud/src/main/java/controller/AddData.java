package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import model.Student;


@WebServlet("/add")
public class AddData extends HttpServlet {
	


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String phno = req.getParameter("phno");

		Student st = new Student();
		st.setFname(fname);
		st.setLname(lname);
		st.setEmail(email);
		st.setPass(pass);
		st.setPhno(phno);

		StudentDao dao = new StudentDao();
		int i = dao.addStudent(st);
		if (i > 0) {
			req.setAttribute("msg", "Registration successfully done");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}

}
