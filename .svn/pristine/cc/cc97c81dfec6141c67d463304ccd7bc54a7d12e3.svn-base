package fr.agefospme.referentiel.individu.metier;

import org.springframework.core.convert.converter.Converter;

import fr.agefospme.referentiel.individu.service.AdresseDto;
import fr.agefospme.referentiel.individu.service.IndividuDto;
import fr.agefospme.rfi.domaine.Individu;

public class IndividuToIndividuDtoConverter implements Converter<Individu, IndividuDto> {

	public IndividuToIndividuDtoConverter() {
		
	}

	public IndividuDto convert(Individu source) {
		IndividuDto dto= null;
		
		if(source!=null){
	        dto= new IndividuDto();
	        
			dto.setIdMetier(source.getIdMetier());
	        dto.setNir(source.getNir());
			dto.setIdMetier(source.getIdMetier());
			dto.setPrenom(source.getPrenom());
			dto.setNomDeNaissance(source.getNomDeNaissance());
			dto.setDateDeNaissance(source.getDateDeNaissance());
			dto.setCivilite(source.getCivilite());
			dto.setSituationProfessionnelle(source.getSituationProfessionnelle());
			dto.setEmail(source.getEmail());
			dto.setTelephone(source.getTelephone());
			dto.setRattachementCPF(source.isRattachementCPF());

			if (source.getAdresseDomiciliation() != null) {
				AdresseDto adresseDto= new AdresseDto();
				adresseDto.setAdresseLigne1(source
						.getAdresseDomiciliation().getAdresseLigne1());
				adresseDto.setAdresseLigne2(source
						.getAdresseDomiciliation().getAdresseLigne2());
				adresseDto.setAdresseLigne3(source
						.getAdresseDomiciliation().getAdresseLigne3());
				adresseDto.setCodePostal(source
						.getAdresseDomiciliation().getCodePostal());
				adresseDto.setVille(source
						.getAdresseDomiciliation().getVille());
				adresseDto.setPays(source
						.getAdresseDomiciliation().getPays());
				
				dto.setAdresseDto(adresseDto);

			}

			}

			return dto;
		}
	}

