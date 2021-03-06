package fr.agefospme.referentiel.individu.service;

import fr.agefospme.referentiel.individu.service.exception.DuplicateIndividuCreationException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampMalFormateException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampObligatoireManquantException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuNomAssocieIncorrectException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuNonTrouveException;

public interface GestionIndividuServiceManager {
	IndividuDto create(IndividuInfoCreationDto creationDto)
			throws GestionIndividuChampMalFormateException,
			DuplicateIndividuCreationException,
			GestionIndividuChampObligatoireManquantException;

	IndividuDto modifier(IndividuInfoModificationDto dto) throws GestionIndividuChampMalFormateException, GestionIndividuChampObligatoireManquantException, GestionIndividuNonTrouveException;

	IndividuDto consulter(InfoConsultationIdMetierDto idMetierDto)
			throws GestionIndividuChampMalFormateException,
			GestionIndividuChampObligatoireManquantException,
			GestionIndividuNonTrouveException;

	IndividuDto consulter(
			IndividuInfoConsultationNirNomDto individuInfoConsultationDto)
			throws GestionIndividuChampObligatoireManquantException,
			GestionIndividuChampMalFormateException,
			GestionIndividuNonTrouveException,
			GestionIndividuNomAssocieIncorrectException;

}
