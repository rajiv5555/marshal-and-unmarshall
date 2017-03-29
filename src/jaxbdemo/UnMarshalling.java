/**
 * 
 */
package jaxbdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * @author Raji
 *
 */
public class UnMarshalling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			JAXBContext jj=JAXBContext.newInstance(customers.class);
			Unmarshaller un=jj.createUnmarshaller();
			FileInputStream fin=new FileInputStream("cust.xml");
			customers cust=(customers) un.unmarshal(fin);
			fin.close();
			System.out.println(cust.getId());
			System.out.println(cust.getFname());
			System.out.println(cust.getLname());
		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
