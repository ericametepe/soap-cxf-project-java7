package com.agefos.composant.rfi.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;

import fr.agefospme.rfi.domaine.Adresse;
import fr.agefospme.rfi.domaine.Individu;
import fr.agefospme.rfi.domaine.repository.IndividuRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:RepositoryTest-context.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
		DependencyInjectionTestExecutionListener.class,
		DbUnitTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@DatabaseSetup(value = "individuData.xml")
@DatabaseTearDown(value = "individuData.xml")
public class IndividuRepositoryTest {

	@Autowired
	private IndividuRepository individuRepository;
	
	@Test
	public void testFindByNirAndNomDeNaissanceNotOK(){
		String nir="1234567891234";
		String nom="DUPONTEL";
		Individu individu=individuRepository.findByNirAndNomDeNaissanceNot(nir, nom);
		
		assertNotNull(individu.getId());
		System.out.println("============================>"+individu.toString());
	}
	
	
	@Test
	public void testfindByNirAndNomDeNaissanceAndPrenomAndCiviliteAndDateDeNaissanceOK(){
		Individu individu=null;
		String nir="1234567891234";
		String civilite="1";
		String nom="DUPONT";
		//2000-05-25
		Date datenais=new DateTime(2000, 05, 25, 0, 0).toDate();
		String prenom="TAXAN";
		 individu=individuRepository.findByNirAndNomDeNaissanceAndPrenomAndCiviliteAndDateDeNaissance(nir, nom, prenom, civilite, datenais);
		assertNotNull(individu);
		System.out.println("======================"+individu.toString());
	}
	
	@Test
	public void testGetListeIdMetier(){
		List<String> idMetiers= new ArrayList<String>();
		idMetiers=individuRepository.getListeIdMetier();
		assertTrue(idMetiers.size()==2);
		System.out.println("==========listing idMetiers===="+idMetiers);
	}

	@Test
	public void testModifySituationProfessionnelleIndiviConnuShouldBeOK() {

		String idMetier = "12345678";
		Individu individuToModify = null;
		String situationProfessionnelle="P";

		individuToModify = individuRepository.findByIdMetier(idMetier);

		if (individuToModify != null) {

			individuToModify.setSituationProfessionnelle(situationProfessionnelle);

			Individu individuS = individuRepository.save(individuToModify);
			assertTrue(individuS.getId() != null);
			assertTrue(StringUtils.equals(individuS.getSituationProfessionnelle(), situationProfessionnelle));

		}

	}

	@Test
	public void testFindByNirShouldBeOK() {
		Individu individu = null;
		String nir = "1234567891234";
		individu = individuRepository.findByNir(nir);
		assertNotNull(individu);
		assertEquals(individu.getNir(), nir);
	}

	@Test
	public void testFindByNirAndNomDeNaissance() {
		String nir = "1234567891234";
		String nomDeNaissance = "DUPONT";

		Individu individu = individuRepository.findByNirAndNomDeNaissance(nir,
				nomDeNaissance);
		assertEquals(individu.getNir(), nir);
		assertEquals(individu.getNomDeNaissance(), nomDeNaissance);

	}

	@Test
	public void testCountAllRows() {
		assertTrue(individuRepository.count() == 2);

	}

	@Test
	public void testSaveS() {

		String nomDeNaissance = "BERNARD";
		String civilite = "M";

		String telephone = "11552565";
		String prenom = "TAXAN";
		String login = "login";
		String email = "ykodjo@yahoo.fr";
		String ville = "PARIS";
		String codePostal = "93100";
		String nir = "1234567891236";
		String pays = "FRANCE";
		boolean rattachementCPF=true;
		Date dateDeNaissance = new DateTime(1980, 5, 18,1,1).toDate();

	
		String situationProfessionnelle="S";
		String adresseLigne1="adresseLigne1";
		String adresseLigne3="adresseLigne3";
		String adresseLigne2="adresseLigne2";
		String idMetier="12345670";
		
		Adresse adresseDomiciliation= new Adresse(adresseLigne1, adresseLigne2, adresseLigne3, codePostal, ville, pays);
		
		
		Individu individu2 = new Individu(idMetier, nir, nomDeNaissance, prenom, civilite, situationProfessionnelle, dateDeNaissance, telephone, adresseDomiciliation, email, rattachementCPF);
		Individu individuS = individuRepository.save(individu2);

		assertEquals(individuS.getNir(), nir);
		assertEquals(individuS.getNomDeNaissance(), nomDeNaissance);

	}

	@Test
	public void testFindOneShouldBeOK() {
		Long id = -2L;
		Individu individu = individuRepository.findOne(id);
		assertNotNull(individu);
		assertEquals(individu.getId(), id);
	}

}
