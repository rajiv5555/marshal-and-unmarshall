/**
 * 
 */
package jaxbdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * @author Raji
 *
 */
public class MarshallingTest {

	/**
	 * @param args
	 */
	//note: for marshalling you need to note two point.
	//1)customer class must be jaxb compliant using @XMLRootElement
	//2)must have no -arg constructor
	//3)if we remove @xmltype from entity class then jaxb will marshall based on albhabetical order.
	public static void main(String[] args) {
		try {
			JAXBContext jax=JAXBContext.newInstance(customers.class);
			Marshaller m=jax.createMarshaller();
			customers c=new customers("1","rajiv","ranjan");
			FileOutputStream f=new FileOutputStream("cust.xml");
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			m.marshal(c,f);
			f.close();
		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
