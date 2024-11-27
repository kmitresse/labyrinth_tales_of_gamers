/**
 */
package labyrinthTalesOfGamers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labyrinthTalesOfGamers.Game#getPlayer <em>Player</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.Game#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(MainCharacter)
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getGame_Player()
	 * @model required="true"
	 * @generated
	 */
	MainCharacter getPlayer();

	/**
	 * Sets the value of the '{@link labyrinthTalesOfGamers.Game#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(MainCharacter value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link labyrinthTalesOfGamers.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage#getGame_Rooms()
	 * @model required="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void newGame();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String proposeChoices();

} // Game
