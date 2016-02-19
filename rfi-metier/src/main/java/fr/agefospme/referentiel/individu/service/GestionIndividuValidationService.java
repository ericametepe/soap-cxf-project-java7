package fr.agefospme.referentiel.individu.service;

import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampMalFormateException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampObligatoireManquantException;

public interface GestionIndividuValidationService {

	void validateInfoCreation(IndividuInfoCreationDto dto) throws GestionIndividuChampObligatoireManquantException, GestionIndividuChampMalFormateException ;
	
	void validateInfoModification(IndividuInfoModificationDto dto) throws GestionIndividuChampMalFormateException, GestionIndividuChampObligatoireManquantException;

	void validateInfoConsultationIdMetierDto(
			InfoConsultationIdMetierDto idMetierDto) throws GestionIndividuChampObligatoireManquantException, GestionIndividuChampMalFormateException;

	void validateConsultationNirNomDto(
			IndividuInfoConsultationNirNomDto consultationNirNomDto) throws GestionIndividuChampObligatoireManquantException, GestionIndividuChampMalFormateException;
}
