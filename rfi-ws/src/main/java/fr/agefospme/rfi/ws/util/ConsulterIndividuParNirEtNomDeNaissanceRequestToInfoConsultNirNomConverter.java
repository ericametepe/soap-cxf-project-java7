package fr.agefospme.rfi.ws.util;

import org.springframework.core.convert.converter.Converter;

import fr.agefospme.referentiel.individu.service.IndividuInfoConsultationNirNomDto;
import fr.agefospme.rfi.ws.gestionindividu.gen.ConsulterIndividuParNirEtNomDeNaissanceRequest;

public class ConsulterIndividuParNirEtNomDeNaissanceRequestToInfoConsultNirNomConverter
		implements
		Converter<ConsulterIndividuParNirEtNomDeNaissanceRequest, IndividuInfoConsultationNirNomDto> {

	@Override
	public IndividuInfoConsultationNirNomDto convert(
			ConsulterIndividuParNirEtNomDeNaissanceRequest source) {
		
		IndividuInfoConsultationNirNomDto consultationNirNomDto = null;

		if (source != null) {
			consultationNirNomDto = new IndividuInfoConsultationNirNomDto();
			consultationNirNomDto.setNir(source.getNir());
			consultationNirNomDto.setNomDeNaissance(source.getNomDeNaissance());
			return consultationNirNomDto;
		}
		return consultationNirNomDto;

	}
}
