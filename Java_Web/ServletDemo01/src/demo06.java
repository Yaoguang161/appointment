package requset06;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @className Servlet.java
 * @description: 使用 HttpServletRequest 对象，操作请求域数据。
 * @author: Asaki
 * @createDate: 2021/11/14 21:31
 */

@WebServlet("/demo06")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.print("嗨客网(www.haicoder.net)<br/>");
        pw.print("<br/>");
        // 请求域中创建键和值
        request.setAttribute("user","HaiCoder");
        request.setAttribute("password",123);
        // 获取请求域中的键和值
        pw.write("<h3>获取请求域的键和值</h3>");
        String user = (String) request.getAttribute("user");
        Integer password = (Integer) request.getAttribute("password");
        // 在页面显示
        pw.write("用户名：" + user + "<hr/>");
        pw.write("密码：" + password + "<hr/>");
        // 删除请求域的键和值
        pw.write("<h3>删除请求域的键和值</h3>");
        request.removeAttribute("user");
        // 再次获取请求域中的键和值
        pw.write("<h3>再次获取请求域中的键和值</h3>");
        user = (String) request.getAttribute("user");
        password = (Integer) request.getAttribute("password");
        // 页面显示
        pw.write("用户名：" + user + "<hr/>");
        pw.write("密码：" + password + "<hr/>");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}