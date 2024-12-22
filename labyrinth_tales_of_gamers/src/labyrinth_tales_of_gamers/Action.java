/**
 */
package labyrinth_tales_of_gamers;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.Action#getLabel <em>Label</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Action#getName <em>Name</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Action#getInformations <em>Informations</em>}</li>
 * </ul>
 *
 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='labelAction'"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getAction_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Action#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"static Label"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getAction_Name()
	 * @model default="static Label" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Informations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informations</em>' attribute.
	 * @see #setInformations(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getAction_Informations()
	 * @model required="true"
	 * @generated
	 */
	String getInformations();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Action#getInformations <em>Informations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informations</em>' attribute.
	 * @see #getInformations()
	 * @generated
	 */
	void setInformations(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.label = \'MOVE\' or self.label = \'TALK\' or self.label = \'ASK_HINT\' or self.label = \'READ\' or self.label = \'PROPOSE\''"
	 * @generated
	 */
	boolean labelAction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Action
