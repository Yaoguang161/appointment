/**
 * @className demo01.java
 * @description: 通过HttpServletRequest, 获取请求行中的信息
 * @author: Asaki
 * @createDate: 2021/11/8 16:50
 */

/*题目解决思路:
* 1.使用@WebServlet注解的方式创建Servlet
* 2.使用getMethod方法请求行中的请求方法
* 3.使用getRequsetURL方法获取请求行中的URL
* 4.使用GetProtocol方法获取协议和版本
* 5.使用getQueryString方法查询字符串
*
*
*
* */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo01")
public class demo01 extends HttpServlet{
/*    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //设置响应的内容类型和编码
        response.setContentType("Text/html;charset=utf-8");
        //通过响应对象获取获取打印流
        PrintWriter pw = response.getWriter();
        pw.print("嗨课网(www.haicoder.net)<br/>");
        pw.print("<br/>");
        //获取请求行的信息
        pw.print("获取请求中的方式: " +request.getMethod() + "<hr/>");
        pw.print("获取请求的URL: " +request.getRequestURI() + "<hr/>");
        pw.print("获取协议和版本: " +request.getProtocol() +"<hr/>");
        pw.print("获取查询字符串:" +request.getQueryString()+"<hr/>");
    }*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的内容类型和编码
        response.setContentType("text/html;charset=utf-8");
        // 通过响应对象获取打印流
        PrintWriter pw = response.getWriter();
        pw.print("嗨客网(www.haicoder.net)<br/>");
        pw.print("<br/>");
        // 获取请求行的信息
        pw.print("获取请求的方式：" + request.getMethod() + "<hr/>");
        pw.print("获取请求的URI：" + request.getRequestURI() + "<hr/>");
        pw.print("获取协议和版本：" + request.getProtocol() + "<hr/>");
        pw.print("获取查询字符串：" + request.getQueryString() + "<hr/>");
    }

}