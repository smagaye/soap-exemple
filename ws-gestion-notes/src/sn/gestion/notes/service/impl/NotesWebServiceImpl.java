package sn.gestion.notes.service.impl;

import java.util.HashMap;

import java.util.List;
import javax.jws.WebService;

import sn.gestion.notes.service.NotesWebService;

/**
 * @author smagaye
 * Cette classe implémente les services de l'interface NotesWebService
 */
@WebService(endpointInterface = "sn.gestion.notes.service.NotesWebService")
public class NotesWebServiceImpl implements NotesWebService {
	

	private HashMap<String, String> listeEtudiant = new HashMap<>();
	
	private HashMap<String, String> classement = new HashMap<>();

	/**
	 * Constructeur de la classe
	 */
	public NotesWebServiceImpl() {
		// Initialisation des différentes listes
		
		listeEtudiant.put("201305MHQ", "Ada Gaye");
		listeEtudiant.put("201607HYU", "Fanta Cissé");
		listeEtudiant.put("201402SNX", "Mamadou Sylla");
		
		classement.put("Ada Gaye","3");
		classement.put("Fanta Cissé","1");
		classement.put("Mamadou Sylla","2");
	}

	
	/**
	 * Cette méthode prend en argument une liste de nombres
	 * puis détermine la moyenne
	 * 
	 */
	@Override
	public double moyenne(List<Integer> notes) {
		double moyenne = 0;
		int nombreEvaluation = notes.size();
		for (int note : notes) {
			moyenne = moyenne + note / nombreEvaluation;
		}
		return moyenne;
	}

	/**
	 * Cette méthode permet d'obtenir le nom de l'étudiant
	 * grace à l'identifiant fourni en parametre
	 * 
	 */
	@Override
	public String nomComplet(String code) {
		return listeEtudiant.get(code);
	}

	/**
	 * Cette méthode permet d'obtenir le classement de l'étudiant
	 * à partir du nom fourni
	 * 
	 */
	@Override
	public int rang(String nom) {
		return Integer.parseInt(classement.get(nom));
	}

}