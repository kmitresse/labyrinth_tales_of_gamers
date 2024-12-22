/**
 */
package labyrinth_tales_of_gamers;

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
 *   <li>{@link labyrinth_tales_of_gamers.Entity#getName <em>Name</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Entity#isDiscovered <em>Discovered</em>}</li>
 * </ul>
 *
 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Discovered</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered</em>' attribute.
	 * @see #setDiscovered(boolean)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getEntity_Discovered()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isDiscovered();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Entity#isDiscovered <em>Discovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovered</em>' attribute.
	 * @see #isDiscovered()
	 * @generated
	 */
	void setDiscovered(boolean value);

} // Entity
