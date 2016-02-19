package fr.agefospme.rfi.domaine.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.agefospme.rfi.domaine.Individu;

public interface IndividuRepository extends JpaRepository<Individu, Long> {
	Individu findByNir(String nir);

	// Rechercher un individu à partir de son NIR et de son nom de naissance
	Individu findByNirAndNomDeNaissance(String nir, String nomDeNaissance);

	// Rechercher un individu à partir de son identifiant métier
	Individu findByIdMetier(String idMetier);

	@Query("select ind.idMetier from Individu ind")
	List<String> getListeIdMetier();
//Nom de naissance  - Prenom - Civilite - Date de naissance
	Individu findByNirAndNomDeNaissanceAndPrenomAndCiviliteAndDateDeNaissance(
			String nir, String nom, String prenom, String civilite, Date datenais);

	Individu findByNirAndNomDeNaissanceNot(String nir, String nom);

	// Creer un individu

	// Modifier un individu

}
