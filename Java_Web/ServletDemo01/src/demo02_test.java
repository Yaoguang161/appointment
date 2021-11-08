import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @className demo02_test.java
 * @description:
 * @author: Asaki
 * @createDate: 2021/11/8 16:43
 */

@WebServlet("/demo02_test")
public class demo02_test extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        response.setContentType("text/html;charset=utf-8");
        // 通过响应对象获取打印流
        PrintWriter pw = response.getWriter();
        pw.write("嗨客网(www.haicoder.net)\n");
        // 输出内容到网页
        pw.write("<h1>注解方式创建Servlet</h1><hr/>");
        pw.write("<h2>第二个Servlet程序</h2>");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}