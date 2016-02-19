package fr.agefospme.referentiel.individu.metier;

import org.springframework.core.convert.converter.Converter;

import fr.agefospme.referentiel.individu.service.AdresseDto;
import fr.agefospme.referentiel.individu.service.IndividuInfoCreationDto;
import fr.agefospme.rfi.domaine.Individu;

public class IndividuToIndividuInfoCreationDtoConverter implements
		Converter<Individu, IndividuInfoCreationDto>{

	public IndividuInfoCreationDto convert(Individu source) {
		IndividuInfoCreationDto dto = null;
	if(source!=null){
        dto= new IndividuInfoCreationDto();
		dto.setNir(source.getNir());
		dto.setPrenom(source.getPrenom());
		dto.setNomDeNaissance(source.getNomDeNaissance());
		dto.setEmail(source.getEmail());
		dto.setDateDeNaissance(source.getDateDeNaissance());
		dto.setCivilite(source.getCivilite());
		dto.setSituationProfessionnelle(source.getSituationProfessionnelle());
		dto.setTelephone(source.getTelephone());
		
		dto.setRattachementCPF(source.isRattachementCPF());

		if (source.getAdresseDomiciliation() != null) {
			
			AdresseDto adresseDto = new AdresseDto();
			
			adresseDto.setAdresseLigne1(source.getAdresseDomiciliation()
					.getAdresseLigne1());
			adresseDto.setAdresseLigne2(source.getAdresseDomiciliation()
					.getAdresseLigne2());
			adresseDto.setAdresseLigne3(source.getAdresseDomiciliation()
					.getAdresseLigne3());
			
			adresseDto.setCodePostal(source.getAdresseDomiciliation().getCodePostal());
			adresseDto.setVille(source.getAdresseDomiciliation().getVille());
			adresseDto.setPays(source.getAdresseDomiciliation().getPays());

			
			dto.setAdresseDto(adresseDto);

		}

		}

		return dto;
	}

}
