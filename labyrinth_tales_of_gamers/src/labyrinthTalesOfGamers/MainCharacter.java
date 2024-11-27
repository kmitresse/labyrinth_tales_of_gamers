/**
 */
package labyrinthTalesOfGamers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Character</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getMainCharacter()
 * @model
 * @generated
 */
public interface MainCharacter extends Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model choicesRequired="true" choicesMany="true"
	 * @generated
	 */
	void selectChoices(EList<String> choices);

} // MainCharacter
