package fr.agefospme.rfi.domaine.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.agefospme.rfi.domaine.Individu;
@Repository
public class IndividuDaoImpl implements IndividuDao {
	@Autowired
	private IndividuRepository individuRepository;

	public Individu create(Individu individu) {
		Individu individuS=null;
		if(individu!=null){
			 individuS=individuRepository.save(individu);
		}
		return individuS;
	}

}
