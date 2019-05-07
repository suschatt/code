package XML;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Element;
import org.w3c.dom.Text;



public class CreateXML {

	public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, FileNotFoundException, TransformerException {
		DocumentBuilderFactory f= DocumentBuilderFactory.newInstance();
		DocumentBuilder b = f.newDocumentBuilder();
		org.w3c.dom.Document doc = b.newDocument();
		
		Element rootle = doc.createElement("Students");
		Element studentle = doc.createElement("Student");
		Element namele = doc.createElement("Name");
		
		Text t1=doc.createTextNode("Susmit");
		
		namele.appendChild(t1);
		studentle.appendChild(namele);
		rootle.appendChild(studentle);
		doc.appendChild(rootle);
		
		Transformer t=TransformerFactory.newInstance().newTransformer();
		t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("C:\\\\Users\\SayaniB\\Documents\\Java_Projects\\test_data\\Student.xml")));
		System.out.println("XML Generated");
		
		
		
		
		
		
		

	}

}
