package fr.agefospme.rfi.domaine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.agefospme.rfi.domaine.DonneesRFI;

public interface DonneesRFIRepository  extends JpaRepository<DonneesRFI, Integer> {
	List<DonneesRFI>findByCodeListe(String codeListe );
	DonneesRFI findByCodeListeAndCode(String codeListe, String code);
	@Query("select d.code from DonneesRFI d")
	List<String> findListCode();
	@Query("select d.code from DonneesRFI d where d.codeListe='000CIV'")
	List<String> findListCodeCivivilite();
	@Query("select d.code from DonneesRFI d where d.codeListe='SITPRO'")
	List<String> findListCodeSituationPro();

	
	


}
