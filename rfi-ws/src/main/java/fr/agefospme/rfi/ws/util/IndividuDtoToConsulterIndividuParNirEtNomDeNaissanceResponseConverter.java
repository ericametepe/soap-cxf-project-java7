package fr.agefospme.rfi.ws.util;

import org.springframework.core.convert.converter.Converter;

import fr.agefospme.referentiel.individu.service.IndividuDto;
import fr.agefospme.rfi.ws.GestionIndividuServiceUtil;
import fr.agefospme.rfi.ws.gestionindividu.gen.Addresse;
import fr.agefospme.rfi.ws.gestionindividu.gen.ConsulterIndividuParNirEtNomDeNaissanceResponse;

public class IndividuDtoToConsulterIndividuParNirEtNomDeNaissanceResponseConverter
		implements
		Converter<IndividuDto, ConsulterIndividuParNirEtNomDeNaissanceResponse> {

	@Override
	public ConsulterIndividuParNirEtNomDeNaissanceResponse convert(
			IndividuDto source) {

		ConsulterIndividuParNirEtNomDeNaissanceResponse response = new ConsulterIndividuParNirEtNomDeNaissanceResponse();
		
		response.setIdMetier(source.getIdMetier());
		response.setNomDeNaissance(source.getNomDeNaissance());
		response.setCivilite(source.getCivilite());
		response.setPrenom(source.getPrenom());
		response.setDateDeNaissance(GestionIndividuServiceUtil
				.asXMLGregorianCalendar(source.getDateDeNaissance()));
		response.setSituationProfessionnelle(source
				.getSituationProfessionnelle());
		response.setRattachementCPF(source.isRattachementCPF());
		response.setEmail(source.getEmail());
		response.setTelephone(source.getTelephone());

		if (source.getAdresseDto() != null) {

			Addresse adresse = new Addresse();

			adresse.setAdresseLigne1(source.getAdresseDto().getAdresseLigne1());
			adresse.setAdresseLigne2(source.getAdresseDto().getAdresseLigne2());
			adresse.setAdresseLigne3(source.getAdresseDto().getAdresseLigne3());
			adresse.setCodePostal(source.getAdresseDto().getCodePostal());
			adresse.setVille(source.getAdresseDto().getVille());
			adresse.setPays(source.getAdresseDto().getPays());

			response.setAdresseDeDomiciliation(adresse);
		}

		return response;
	}

}
