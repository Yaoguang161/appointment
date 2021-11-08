/**
 * @className demo02.java
 * @description: 通过HttpServletRequest对象, 获取请求头中相关信息
 * @author: Asaki
 * @createDate: 2021/11/8 20:38
 */
/*解决思路:
* 1.使用@WebServlet注解的方式创建Servlet
* 2.使用headerNames方法获取所有请求头的名称
* 3.使用getHeader方法根据请求头名称获取值
* */

import com.sun.net.httpserver.HttpServer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.EnumMap;
import java.util.Enumeration;

@WebServlet("/demo02")
public class demo02 extends HttpServlet {

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
        // 获取请求头的名称
        Enumeration<String> headerNames = request.getHeaderNames();
        // 遍历所有请求头
        while(headerNames.hasMoreElements()){
            // 获取请求头名称
            String name = headerNames.nextElement();
            // 根据头查询信息
            String value = request.getHeader(name);
            // 输出信息
            pw.print("名称：" + name + " 值：" + value + "<hr/>");
        }
    }
}