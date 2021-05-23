package bridge_3;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(String args){
        try{
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("F:\\Ideaproject\\src\\bridge_3\\config.xml"));
            NodeList n1 = null;
            Node classNode = null;
            String cName = null;
            n1 =  doc.getElementsByTagName("className");
            if(args.equals("OS")) {
                classNode = n1.item(0).getFirstChild();
            } else if (args.equals("Player")){
                classNode = n1.item(1).getFirstChild();
            }
            cName = classNode.getNodeValue();
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
