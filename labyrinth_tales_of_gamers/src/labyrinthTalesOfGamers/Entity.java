/**
 */
package labyrinthTalesOfGamers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labyrinthTalesOfGamers.Entity#getCurrentRoom <em>Current Room</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.Entity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinthTalesOfGamers.Room#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Room</em>' reference.
	 * @see #setCurrentRoom(Room)
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getEntity_CurrentRoom()
	 * @see labyrinthTalesOfGamers.Room#getEntities
	 * @model opposite="entities" required="true"
	 * @generated
	 */
	Room getCurrentRoom();

	/**
	 * Sets the value of the '{@link labyrinthTalesOfGamers.Entity#getCurrentRoom <em>Current Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Room</em>' reference.
	 * @see #getCurrentRoom()
	 * @generated
	 */
	void setCurrentRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link labyrinthTalesOfGamers.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Entity
