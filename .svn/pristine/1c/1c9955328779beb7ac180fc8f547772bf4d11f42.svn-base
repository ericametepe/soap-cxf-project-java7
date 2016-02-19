package fr.agefospme.rfi.ws;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.junit.Before;
import org.junit.Test;

import fr.agefospme.rfi.ws.gestionindividu.gen.GestionIndividuPortType;

public class GestionIndividuServiceImplTest {
	
	private ServerFactoryBean server;
	
	@Before
	public void setup(){
		server=new ServerFactoryBean();
		server.setAddress("http://localhost:9090/rfi/services/gestionindividu");
		server.setServiceClass(GestionIndividuPortType.class);
		server.setServiceBean(GestionIndividuServiceImpl.class);
		server.create();
		
	}

	@Test
	public void testCreerIndividu() {
	}

	@Test
	public void testConsulterIndividuParIdentifiantMetier() {
	}

	@Test
	public void testModifierIndividu() {
	}

	@Test
	public void testConsulterIndividuParNirEtNomDeNaissance() {
	}

}
