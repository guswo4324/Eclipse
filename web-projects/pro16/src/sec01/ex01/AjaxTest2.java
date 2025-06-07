package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxTest2
 */
@WebServlet("/ajaxTest2")
public class AjaxTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String result = "";
		PrintWriter writer = response.getWriter();
		//도서 정보를 XML로 작성한 후 클라이언트로 전송
		//pro16으로 접근 시 WebContent 하위 image 폴더의 image1.jpg를 표시
		result = "<main><book>" + "<title><![CDATA[초보자를 위한 버섯 프로그래밍]]></title>"
				+ "<writer><![CDATA[버섯 | 박현재]]></writer>"
				+ "<image><![CDATA[http://localhost:8090/pro16/image/버섯.jfif]]></image>" + "</book>" + "<book>"
				+ "<title><![CDATA[모두의 버섯]]></title>" + "<writer><![CDATA[폭탄버섯]]></writer>"
				+ "<image><![CDATA[http://localhost:8090/pro16/image/버섯.jfif]]></image>" + "</book></main>";
		System.out.println(result);
		writer.print(result);
	}

}