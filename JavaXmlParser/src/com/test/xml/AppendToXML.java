package com.test.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class AppendToXML {

	public static void addNodeToXML(String className)
		      throws ParserConfigurationException, SAXException, IOException, TransformerException
		{
		    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
		            .newInstance();
		    DocumentBuilder documentBuilder = documentBuilderFactory
		            .newDocumentBuilder();

		    /* parse existing file to DOM */
		    Document document = documentBuilder
		            .parse(new File("D:\\SelfStudy\\StudyWorkspace\\JavaXmlParser\\src\\testng.xml"));

		    StreamResult result = new StreamResult("D:\\SelfStudy\\StudyWorkspace\\JavaXmlParser\\src\\new.xml");
		    
		    NodeList classesNodeList = document.getElementsByTagName("classes");
		    Element classesNode = ((Element)classesNodeList.item(0));
		    
		    
		    Element newClassChild = document.createElement("class");
		    newClassChild.setTextContent(" ");
		    Attr classNameAttr = document.createAttribute("name");
		    classNameAttr.setValue(className);
		    newClassChild.setAttributeNode(classNameAttr);
		    
		    classesNode.appendChild(newClassChild);
		    
		    DOMSource source = new DOMSource(document);
		    
		    TransformerFactory transformerFactory = TransformerFactory.newInstance();
		    Transformer transformer = transformerFactory.newTransformer();
		   
		    transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
		    transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC,"yes"); 
		    transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "1");
		    transformer.transform(source, result);

		}
	
	public static void main(String[] args) {
		try {
			AppendToXML.addNodeToXML("TestClass");
		} catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
