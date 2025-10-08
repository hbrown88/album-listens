package src;
import org.w3c.dom.*; // a programming interface for HTML and XML documents that represents the document's structure as a tree of objects, or "nodes"
import javax.swing.text.html.HTML;
import javax.xml.parsers.*; // (DocumentBuilder & Document Builder Factory) provides a set of classes and interfaces for parsing XML documents. It is part of the Java API for XML Processing (JAXP) and offers a pluggable architecture for working with different XML parsers.
import java.io.File; //provides classes for performing input and output operations, including interacting with the file system. The central class for representing files and directories is java.io.File 


/*
 * Questions:
 * 1. How many albums should be returned?
 * 2. How do I input a delay so it isn't spat out at once?
 * 3. What desing options can I implement so the output isnt so bland?
 * 4. Could I possibly return the album cover?
 */

 /*
  * What I need to know:
  * 1. The Document interface represents the entire HTML or XML document. (org.w3c.dom)
  * 2. The Element interface represents an element in an HTML or XML document.
  * 3. The Node interface is the primary datatype for the entire Document Object Model.	
  * 4. The NodeList interface provides the abstraction of an ordered collection of nodes, without defining or constraining how this collection is implemented.
  */

 /*
  * Terminology:
  * XML File: A text-based file using custom, extensible markup tags to structure and organize data in a hierarchical, tree-like format
  */

  // CODE STARTS HERE

  public class AlbumListens {
    public static void main(String[] args) throws Exception {
        File xmlFile = new File("music_library.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // Declaration of a factory class that is used to create DocumentBuilder instances
        DocumentBuilder builder = factory.newDocumentBuilder(); // DocumentBuilder is an API that provides a way to parse XML documents and create a DOM (Document Object Model) representation of the document

        Document doc = builder.parse(xmlFile); // SAXException, IOException possible
        doc.getDocumentElement().normalize();

        NodeList keyNodes = doc.getElementsByTagName("key");
       //System.out.println(keyNodes.getLength());

       //Print every album name
       for (int i = 0; i < keyNodes.getLength) {
            
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       /*
        for (int i = 0; i < keyNodes.getLength(); i++) {
            Node keyNode = keyNodes.item(i);
            if (keyNode.getNodeType() == Node.ELEMENT_NODE) {
                String keyContent = keyNode.getTextContent();
                Node sibling = keyNode.getNextSibling();

                // Skip non-element siblings (e.g., text nodes, whitespace)
                while (sibling != null && sibling.getNodeType() != Node.ELEMENT_NODE) { //Node.ELEMENT_NODE is 
                    System.out.println(Node.ELEMENT_NODE);
                    sibling = sibling.getNextSibling();
                }
                // Check if the sibling is an element node and has the tag name "string"

                if (sibling != null && sibling.getNodeName().equals("string")) {
                    String stringContent = sibling.getTextContent();
                    System.out.println("Key: " + keyContent + ", Value: " + stringContent);
                }
            }
            if(i==10){
                break;
            }
        }
        */

    }
}
