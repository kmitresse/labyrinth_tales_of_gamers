/**
 */
package labyrinth_tales_of_gamers;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link labyrinth_tales_of_gamers.Game#getPlayer <em>Player</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Game#getRooms <em>Rooms</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Game#getTitle <em>Title</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Game#getPrologue <em>Prologue</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Game#getEpilogue <em>Epilogue</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Game#getNbNpc <em>Nb Npc</em>}</li>
 * </ul>
 *
 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getGame()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nbNpcPositiveOrNull'"
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.MainCharacter#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference.
	 * @see #setPlayer(MainCharacter)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getGame_Player()
	 * @see labyrinth_tales_of_gamers.MainCharacter#getGame
	 * @model opposite="game" containment="true" required="true"
	 * @generated
	 */
	MainCharacter getPlayer();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Game#getPlayer <em>Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' containment reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(MainCharacter value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link labyrinth_tales_of_gamers.Room}.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Room#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getGame_Rooms()
	 * @see labyrinth_tales_of_gamers.Room#getGame
	 * @model opposite="game" containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getGame_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Game#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Prologue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prologue</em>' attribute.
	 * @see #setPrologue(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getGame_Prologue()
	 * @model
	 * @generated
	 */
	String getPrologue();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Game#getPrologue <em>Prologue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prologue</em>' attribute.
	 * @see #getPrologue()
	 * @generated
	 */
	void setPrologue(String value);

	/**
	 * Returns the value of the '<em><b>Epilogue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epilogue</em>' attribute.
	 * @see #setEpilogue(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getGame_Epilogue()
	 * @model required="true"
	 * @generated
	 */
	String getEpilogue();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Game#getEpilogue <em>Epilogue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epilogue</em>' attribute.
	 * @see #getEpilogue()
	 * @generated
	 */
	void setEpilogue(String value);

	/**
	 * Returns the value of the '<em><b>Nb Npc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Npc</em>' attribute.
	 * @see #setNbNpc(int)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getGame_NbNpc()
	 * @model required="true"
	 * @generated
	 */
	int getNbNpc();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Game#getNbNpc <em>Nb Npc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Npc</em>' attribute.
	 * @see #getNbNpc()
	 * @generated
	 */
	void setNbNpc(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nbNpc &gt;= 0'"
	 * @generated
	 */
	boolean nbNpcPositiveOrNull(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Game