import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @className demo03.java
 * @description: 通过HttpServletRequest对象, 获取请求头中的user-agent的值,可以得出浏览器类型
 * @author: Asaki
 * @createDate: 2021/11/9 10:12
 */
/*题目解决思路:
* 1.使用@WebServlet注解的方式创建Servlet
* 2.通过HttpServletRequest对象,获取请求头user-agent的值
* 3.根据user-agent的值,输出浏览器类型*/
@WebServlet("/demo03")
public class demo03 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应的内容类型和编码
        response.setContentType("text/html;charset=utf-8");

        /*
        * response.setContentType("text/html;charset=utf-8");
		 * 等于
         * response.setHeader("content-type", "text/html");
		 * response.setCharacterEncoding("utf-8");
		 * 两句
		 * 
		 * 但是response.setContentType("text/html;charset=utf-8");
		 * 中的charset有比setEncoding多一个作用：
		 * 		不仅能设置输出数据的编码；还能告诉浏览器自适应当前的编码
		 */

        // 通过响应对象获取打印流
        PrintWriter pw = response.getWriter();
        pw.print("嗨客网(www.haicoder.net)<br/>");
        pw.print("<br/>");
        // 获取浏览器类型
        String userAgent = request.getHeader("user-agent");
        if (userAgent.contains("Edg")) {
            //3.输出浏览器的类型
            pw.print("您的浏览器是：Edge" );
        }
        else if(userAgent.contains("OPR")) {
            pw.print("您的浏览器是：Opera" );
        }
        else if(userAgent.contains("Chrome")) {
            pw.print("您的浏览器是：Chrome" );
        }
        else if(userAgent.contains("Safari")) {
            pw.print("您的浏览器是：Safari" );
        }
        else if(userAgent.contains("Firefox")) {
            pw.print("您的浏览器是：Firefox" );
        }
        else {
            pw.print("您的浏览器是：IE浏览器或其它");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
