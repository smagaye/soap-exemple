package sn.gestion.notes;

import java.util.ArrayList;
import java.util.List;

import sn.gestion.notes.service.impl.NotesWebService;
import sn.gestion.notes.service.impl.NotesWebServiceImplService;

/*
 * Cette Classe permet d'utiliser les services
 * exposés par le webservice ws-gestion-notes
 * 
 * */
public class Client {
	// Récupération du service exposé
	private static NotesWebService ws = new NotesWebServiceImplService().getNotesWebServiceImplPort() ;
	
	public static void main(String[] args) {
		// Numéro étudiant
		String codeEtudiant ="201305MHQ";
		
		// Liste des notes de l'étudiant
		List<Integer> notes = new ArrayList<>();
		notes.add(new Integer(12));
		notes.add(new Integer(18));
		
		// Recherche du nom de l'etudiant à partir du numéro étudiant
		String nomComplet = ws.nomComplet(codeEtudiant);
		
		// Calcul de la moyenne à partir de la liste de note fournie
		double moyenne = ws.moyenne(notes);
		
		// Détermination du rang selon le nom fourni
		int rang = ws.rang(nomComplet);
		
		System.out.println("Nom Complet : "+ nomComplet);
		System.out.println("Moyenne : "+ moyenne);
		System.out.println("Rang : "+ rang);
		
	}

}
