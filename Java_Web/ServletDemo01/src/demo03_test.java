import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @className demo03_test.java
 * @description: 使用继承GenericServlet, 创建一个简单的Servlet
 * @author: Asaki
 * @createDate: 2021/11/8 16:46
 */
@WebServlet("/demo03_test")
public class demo03_test extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        // 通过响应对象获取打印流
        PrintWriter pw = response.getWriter();
        pw.write("嗨客网(www.haicoder.net)\n");
        // 输出内容到网页
        pw.write("<h1>注解方式创建Servlet</h1><hr/>");
        pw.write("<h2>这是继承GenericServlet实现Servlet程序</h2>");
    }
}