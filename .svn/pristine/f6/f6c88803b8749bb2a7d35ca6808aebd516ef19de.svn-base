package fr.agefospme.referentiel.individu.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.stereotype.Component;

import fr.agefospme.rfi.domaine.repository.IndividuRepository;
@Component
public class GestionIndividuRandomIdGeneratorImpl implements GestionIndividuRandomIdGenerator {
	private static final int LONGUEUR_ID_METIER = 8;
	private static final String LEFT_PAD_CHAR = "0";
	@Inject
	private IndividuRepository repository;
	
	public String getRandomId(){
		RandomDataGenerator randomData = new RandomDataGenerator(); 
		randomData.reSeedSecure(1000);
		long value=0;
    	boolean test = true;
		int i = 0;
		while(i<1000 && test){
		    value = randomData.nextSecureLong(1, 99999999);
		   
		    if( !repository.getListeIdMetier().contains(value)){
		    	 test = false;
		    }
		}
		    
		return StringUtils.leftPad(Long.toString(value), LONGUEUR_ID_METIER, LEFT_PAD_CHAR);
	}
	

	public void setRepository(IndividuRepository repository) {
		this.repository = repository;
	}

}
