package fr.agefospme.referentiel.individu.commun;

import java.util.Date;

import org.joda.time.DateTime;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.agefospme.referentiel.individu.service.AdresseDto;
import fr.agefospme.referentiel.individu.service.IndividuInfoCreationDto;
import fr.agefospme.referentiel.individu.service.UtilisateurAgefosDto;

@ContextConfiguration(locations = { "classpath:rfi-business-contextTest.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractMetierTest {

	protected static IndividuInfoCreationDto mockValidInfoCreationDto() {
		String nir = "123456789NIRV";
		String nomDeNaissance = "VALENCIENNES";
		UtilisateurAgefosDto utilisateurAgefosDto = new UtilisateurAgefosDto(
				"login", "codeSite", "applicationOrigine");
		String codePostal = "codePostal";
		String adresseLigne1 = "adresseLigne1";
		String adresseLigne2 = "adresseLigne2";
		String adresseLigne3 = "adresseLigne3";
		String ville = "ville";
		String pays = "pays";
		String civilite = "1";
		boolean rattachementCPF = Boolean.TRUE;;
		Date dateDeNaissance = new DateTime(2000, 5, 18, 1, 1).toDate();
		String prenom = "PRENOM";
		String email ="yah";
		String telephone = "telephone";
		String situationProfessionnelle = "S";
		AdresseDto adresse = new AdresseDto(adresseLigne1, adresseLigne2,
				adresseLigne3, codePostal, ville, pays);

//		IndividuInfoCreationDto source = new IndividuInfoCreationDto(nir,
//				nomDeNaissance, prenom, civilite, situationProfessionnelle,
//				dateDeNaissance, adresse, telephone, email,
//				etablissementAgefos, utilisateurAgefosDto);
		
		
		IndividuInfoCreationDto dto= new IndividuInfoCreationDto();
		dto.setNir(nir);
		dto.setNomDeNaissance(nomDeNaissance);
		dto.setPrenom(prenom);
		dto.setCivilite(civilite);
		dto.setSituationProfessionnelle(situationProfessionnelle);
		dto.setTelephone(telephone);
		dto.setEmail(email);
		dto.setRattachementCPF(rattachementCPF);
		dto.setDateDeNaissance(dateDeNaissance);
		
		dto.setAdresseDto(adresse);
		dto.setUtilisateurAgefosDto(utilisateurAgefosDto);
		return dto;
	}

	protected static IndividuInfoCreationDto mockBadInfoCreationDto() {
		String nir = "123456789NIRE";
		String nomDeNaissance = "VALENCIENNES";
		UtilisateurAgefosDto utilisateurAgefosDto = new UtilisateurAgefosDto(
				"login", "codeSite", "applicationOrigine");
		String codePostal = "codePostal";
		String adresseLigne1 = "adresseLigne1";
		String adresseLigne2 = "adresseLigne2";
		String adresseLigne3 = "adresseLigne3";
		String ville = "ville";
		String pays = "pays";
		String civilite = "M";
		Date dateDeNaissance =  new DateTime(2000, 5, 18, 1, 1).toDate();
		String prenom =null;
		String email = "email";
		String telephone = "telephone";
		String situationProfessionnelle = "S";
		
		AdresseDto adresse = new AdresseDto(adresseLigne1, adresseLigne2,
				adresseLigne3, codePostal, ville, pays);
		boolean rattachementCPF=true;
		IndividuInfoCreationDto source = new IndividuInfoCreationDto(nir,
				nomDeNaissance, prenom, civilite, situationProfessionnelle,
				dateDeNaissance, adresse, telephone, email, rattachementCPF,
				utilisateurAgefosDto);
		return source;
	}

}
