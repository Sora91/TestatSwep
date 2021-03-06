package de.hrw.swep.biblio.persistence;



import java.util.Set;

import de.hrw.swep.biblio.persistence.dto.BenutzerDTO;
import de.hrw.swep.biblio.persistence.dto.BuchDTO;
import de.hrw.swep.biblio.persistence.dto.GebuehrDTO;

/**
 * Schnittstelle zum Datenbankzugriff
 * @author M. Friedrich
 *
 */
public interface DBInterface {
  /**
   * Liefert den Benutzer mit der gegebenen ID zurueck
   * @param id die Benutzer-ID
   * @return das Benutzerobjekt
   */
  BenutzerDTO getBenutzerById(long id);

  /**
   * Liefert die Benutzer mit dem gegebenen Namen zurueck
   * @param name der Benutzername
   * @return die Benutzerobjekte
   */
  Set<BenutzerDTO> getBenutzerByName(String name);

  /**
   * Liefert alle Buecher eines Autors zurueck
   * @param autor der Name des Autors
   * @return die Buchobjekte
   */
  Set<BuchDTO> getBuchByAutor(String autor);

  /**
   * Liefert die Buecher mit dem gegebenen Titel zurueck
   * @param title der Buchtitel
   * @return die Buchobjekte
   */
  Set<BuchDTO> getBuchByTitle(String title);
  
  /**
   * Liefert die Gebuehren eines Users
   * @param id der Gebuehren
   * @return die Gebuehrobjekte
   */

  Set<GebuehrDTO> getGebuehrenByUserId(long id);
}
