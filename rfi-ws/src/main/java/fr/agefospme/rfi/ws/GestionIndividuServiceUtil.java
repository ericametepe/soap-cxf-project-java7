package fr.agefospme.rfi.ws;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class GestionIndividuServiceUtil {

	private static DatatypeFactory df = null;

	static {
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new IllegalStateException(
					"Error while trying to obtain a new instance of DatatypeFactory",
					e);
		}
	}

	public static Date convertXMLDateToDate(
			XMLGregorianCalendar xmlGregorianCalendar) {
		Date date = null;
		if (xmlGregorianCalendar != null) {
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
		}
		return date;

	}

	public static XMLGregorianCalendar asXMLGregorianCalendar(
			Date date) {
		if (date == null) {
			return null;
		} else {
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTimeInMillis(date.getTime());
			return df.newXMLGregorianCalendar(gc);
		}
	}
}
