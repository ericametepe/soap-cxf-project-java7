package fr.agefospme.referentiel.individu.commun;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.core.convert.ConversionService;

import fr.agefospme.referentiel.individu.service.IndividuInfoCreationDto;
import fr.agefospme.rfi.domaine.Adresse;
import fr.agefospme.rfi.domaine.Individu;
import fr.agefospme.rfi.domaine.UtilisateurAgefos;

public class IndividuToDtoConverterTest extends AbstractMetierTest {
	@Inject
	private ConversionService conversionService;


	@Test
	public void testConvert() {
		boolean etablissementAgefos=Boolean.TRUE;
		UtilisateurAgefos utilisateurAgefos= new UtilisateurAgefos("login", "codeSite", "applicationOrigine");
		String prenom="prenom";
		String civilite="civilite";
		Adresse adresse= new Adresse("adresseLigne1", "adresseLigne2", "adresseLigne3", "codePostal", "ville", "pays");
		String situationProfessionnelle="situationProfessionnelle";
		String telephone="telephone";
		String nomDeNaissance="nomDeNaissance";
		Date dateDeNaissance=new  DateTime(2000, 5, 18, 1, 1).toDate();
		String email="email";
		String nir="1234567891011";
		
		boolean rattachementCPF=true;
		String idMetier="12345678";
		
		String pays="pays";
		String adresseLigne3="adresseLigne3";
		String adresseLigne2="adresseLigne2";
		String ville="ville";
		String codePostal="codePostal";
		String adresseLigne1="adresseLigne1";
		
		Adresse adresseDomiciliation= new Adresse(adresseLigne1, adresseLigne2, adresseLigne3, codePostal, ville, pays);
		
		Individu source= new Individu( idMetier, nir, nomDeNaissance, prenom, civilite, situationProfessionnelle, dateDeNaissance, telephone, adresseDomiciliation, email, rattachementCPF);
		
		IndividuInfoCreationDto dto=conversionService.convert(source,IndividuInfoCreationDto.class);
		System.out.println("=================="+dto.toString());
		assertTrue(StringUtils.equals(dto.getAdresseDto().getVille(),"ville"));
		assertTrue(StringUtils.equals(dto.getAdresseDto().getPays(),"pays"));
		assertTrue(StringUtils.equals(dto.getAdresseDto().getCodePostal(),"codePostal"));
		assertTrue(StringUtils.equals(dto.getAdresseDto().getAdresseLigne1(),"adresseLigne1"));
		assertTrue(StringUtils.equals(dto.getAdresseDto().getAdresseLigne2(),"adresseLigne2"));
		assertTrue(StringUtils.equals(dto.getAdresseDto().getAdresseLigne3(),"adresseLigne3"));


		

	}

}
