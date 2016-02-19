package fr.agefospme.rfi.ws;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class GestionIndividuServiceUtilTest {

	XMLGregorianCalendar xgcal = null;
	private DatatypeFactory dataFactory;

	@Before
	public void init() {
		GregorianCalendar gcal = (GregorianCalendar) GregorianCalendar
				.getInstance();
		
		try {
			dataFactory=DatatypeFactory.newInstance();
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);

		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testXMLtoDate() {
		Date date=xgcal.toGregorianCalendar().getTime();
		assertNotNull(xgcal);
		System.out.println(xgcal);
		assertNotNull(date);
	}
	
	@Test
	public void testDateToXML(){
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(new Date().getTime());
		XMLGregorianCalendar xmlGregorianCalendar=dataFactory.newXMLGregorianCalendar(gc);
		assertNotNull(xmlGregorianCalendar);
		System.out.println(""+xmlGregorianCalendar);
	}

}
