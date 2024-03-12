import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLParsingExample {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("data.xml");

            NodeList nodeList = document.getElementsByTagName("student");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    int age = Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent());
                    System.out.println("Student: " + name + ", Age: " + age);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
