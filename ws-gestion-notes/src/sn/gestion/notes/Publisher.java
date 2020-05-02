package sn.gestion.notes;

import javax.xml.ws.Endpoint;

import sn.gestion.notes.service.impl.NotesWebServiceImpl;


/**
 * @author smagaye
 * Cette classe permet de publier le web service
 */
public class Publisher {
	public static void main(String[] args) {
		String uri = "http://localhost:8080/ws/gestion/notes/NoteWebService";
		Endpoint.publish(uri, new NotesWebServiceImpl());
		System.out.println("WSDL -> " + uri + "?wsdl");
	}
}