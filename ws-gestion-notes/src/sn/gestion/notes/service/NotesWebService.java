package sn.gestion.notes.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author smagaye
 * 
 */
@WebService
public interface NotesWebService {
 
 @WebMethod public double moyenne(List<Integer> notes);
 
 @WebMethod public String nomComplet(String code);
 
 @WebMethod public int rang (String code);
 
}