package com.agefos.composant.rfi.repository;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;

import fr.agefospme.rfi.domaine.DonneesRFI;
import fr.agefospme.rfi.domaine.repository.DonneesRFIRepository;

@DatabaseSetup(value = "data-ref.xml")
@DatabaseTearDown(value = "data-ref.xml")
public class DonneesRFIRepositoryTest extends AbstractRepository {

	@Autowired
	private DonneesRFIRepository donneReferentielRepository;
	
	@Test
	public void testfindListCodeSituationPro(){
		List<String> codes=donneReferentielRepository.findListCodeSituationPro();
		assertTrue(codes.size()==3);
		System.out.println("findListCodeSituationPro SITPRO VALUES======================> "+ codes);
	}
	
	@Test
	public void testFindListCodeCivivilite(){
		List<String> codes=donneReferentielRepository.findListCodeCivivilite();
		assertTrue(codes.size()==2);
		System.out.println("testFindListCodeCivivilite CIVILITE VALUES======================> "+ codes);
	}
	
	@Test
	public void testFindListCode(){
		List<String> codes=donneReferentielRepository.findListCode();
		System.out.println("ALL CODE VALUES=============="+codes);
		assertTrue(codes.size()>0);
	}

	@Test
	public void testfindByCodeListeAndCodeOK() {
		String code="1";
		String codeListe="000CIV";
		DonneesRFI donneesRFI=donneReferentielRepository.findByCodeListeAndCode(codeListe, code);
		assertTrue(donneesRFI.getCode().equals(code));
		assertTrue(donneesRFI.getCodeListe().equals(codeListe));
		
		System.out.println("========= "+donneesRFI.toString());
	}
	
	
	@Test
	public void testfindByCodeListeAndCodeFail() {
		String code="8";
		String codeListe="000CIV";
		DonneesRFI donneesRFI=donneReferentielRepository.findByCodeListeAndCode(codeListe, code);
		assertTrue(donneesRFI==null);
		

	}

	@Test
	public void testFindAll() {
		List<DonneesRFI> referentiels = donneReferentielRepository.findAll();
		assertTrue(referentiels.size() > 0);
	}

	@Test
	public void testSaveS() {
		DonneesRFI entity = new DonneesRFI("123456", "CODESIX", "Code Six",
				"Code Six pour les test");
		DonneesRFI donneReferentielS = donneReferentielRepository.save(entity);
		assertTrue(donneReferentielS.equals(entity));

	}

	@Test
	public void testFindOne() {
		DonneesRFI donneReferentiel = null;
		int id = -1;
		donneReferentiel = donneReferentielRepository.findOne(id);
		assertTrue(donneReferentiel.getId() == -1L);

	}

	@Test
	public void testFindByNomListeCiviliteShoulBeOK() {
		String nomListe = "000CIV";
		List<DonneesRFI> refs = donneReferentielRepository
				.findByCodeListe(nomListe);
		assertTrue(refs.size() == 2);
	}

}
