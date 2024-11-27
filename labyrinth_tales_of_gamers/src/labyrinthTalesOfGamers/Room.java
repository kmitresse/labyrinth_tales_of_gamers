/**
 */
package labyrinthTalesOfGamers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labyrinthTalesOfGamers.Room#getNorth <em>North</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.Room#getEast <em>East</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.Room#getWest <em>West</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.Room#getSouth <em>South</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.Room#getEntities <em>Entities</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.Room#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>North</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinthTalesOfGamers.Room#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' reference.
	 * @see #setNorth(Room)
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getRoom_North()
	 * @see labyrinthTalesOfGamers.Room#getSouth
	 * @model opposite="south"
	 * @generated
	 */
	Room getNorth();

	/**
	 * Sets the value of the '{@link labyrinthTalesOfGamers.Room#getNorth <em>North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' reference.
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(Room value);

	/**
	 * Returns the value of the '<em><b>East</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinthTalesOfGamers.Room#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' reference.
	 * @see #setEast(Room)
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getRoom_East()
	 * @see labyrinthTalesOfGamers.Room#getWest
	 * @model opposite="west"
	 * @generated
	 */
	Room getEast();

	/**
	 * Sets the value of the '{@link labyrinthTalesOfGamers.Room#getEast <em>East</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' reference.
	 * @see #getEast()
	 * @generated
	 */
	void setEast(Room value);

	/**
	 * Returns the value of the '<em><b>West</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinthTalesOfGamers.Room#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' reference.
	 * @see #setWest(Room)
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getRoom_West()
	 * @see labyrinthTalesOfGamers.Room#getEast
	 * @model opposite="east"
	 * @generated
	 */
	Room getWest();

	/**
	 * Sets the value of the '{@link labyrinthTalesOfGamers.Room#getWest <em>West</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' reference.
	 * @see #getWest()
	 * @generated
	 */
	void setWest(Room value);

	/**
	 * Returns the value of the '<em><b>South</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinthTalesOfGamers.Room#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' reference.
	 * @see #setSouth(Room)
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getRoom_South()
	 * @see labyrinthTalesOfGamers.Room#getNorth
	 * @model opposite="north"
	 * @generated
	 */
	Room getSouth();

	/**
	 * Sets the value of the '{@link labyrinthTalesOfGamers.Room#getSouth <em>South</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' reference.
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(Room value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link labyrinthTalesOfGamers.Entity}.
	 * It is bidirectional and its opposite is '{@link labyrinthTalesOfGamers.Entity#getCurrentRoom <em>Current Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getRoom_Entities()
	 * @see labyrinthTalesOfGamers.Entity#getCurrentRoom
	 * @model opposite="currentRoom" upper="2"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getRoom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link labyrinthTalesOfGamers.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void introduce();

} // Room
