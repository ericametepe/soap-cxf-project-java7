package fr.agefospme.referentiel.individu.metier;

import org.springframework.core.convert.converter.Converter;

import fr.agefospme.referentiel.individu.service.IndividuInfoCreationDto;
import fr.agefospme.rfi.domaine.Adresse;
import fr.agefospme.rfi.domaine.Individu;

public class IndividuInfoCreationDtoToIndividuConverter implements
		Converter<IndividuInfoCreationDto, Individu> {

	public Individu convert(IndividuInfoCreationDto source) {
		Individu individu = null;
		if (source != null) {
			individu = new Individu();
			individu.setNomDeNaissance(source.getNomDeNaissance());
			individu.setPrenom(source.getPrenom());
			individu.setCivilite(source.getCivilite());
			individu.setSituationProfessionnelle(source.getSituationProfessionnelle());
			individu.setNir(source.getNir());
			individu.setTelephone(source.getTelephone());
			individu.setEmail(source.getEmail());
			individu.setDateDeNaissance(source.getDateDeNaissance());
			individu.setRattachementCPF(source.isRattachementCPF());
			
			
			if (source.getAdresseDto() != null) {
				Adresse adresse= new Adresse();
				
				adresse.setAdresseLigne1(source.getAdresseDto()
						.getAdresseLigne1());
				adresse.setAdresseLigne2(source.getAdresseDto()
						.getAdresseLigne2());
				adresse.setAdresseLigne3(source.getAdresseDto()
						.getAdresseLigne3());
				adresse.setCodePostal(source.getAdresseDto().getCodePostal());
				adresse.setVille(source.getAdresseDto().getVille());
				adresse.setPays(source.getAdresseDto().getPays());
				
				individu.setAdresseDomiciliation(adresse);
			}

			

		}
		return individu;
	}

}
