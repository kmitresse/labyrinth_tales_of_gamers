/**
 */
package labyrinth_tales_of_gamers;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.MainCharacter#getNbDiscoveredNpc <em>Nb Discovered Npc</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.MainCharacter#getGame <em>Game</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.MainCharacter#getCurrentRoom <em>Current Room</em>}</li>
 * </ul>
 *
 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getMainCharacter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nbDiscoveredNpcBorned'"
 * @generated
 */
public interface MainCharacter extends Entity {
	/**
	 * Returns the value of the '<em><b>Nb Discovered Npc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Discovered Npc</em>' attribute.
	 * @see #setNbDiscoveredNpc(int)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getMainCharacter_NbDiscoveredNpc()
	 * @model required="true"
	 * @generated
	 */
	int getNbDiscoveredNpc();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.MainCharacter#getNbDiscoveredNpc <em>Nb Discovered Npc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Discovered Npc</em>' attribute.
	 * @see #getNbDiscoveredNpc()
	 * @generated
	 */
	void setNbDiscoveredNpc(int value);

	/**
	 * Returns the value of the '<em><b>Game</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Game#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' container reference.
	 * @see #setGame(Game)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getMainCharacter_Game()
	 * @see labyrinth_tales_of_gamers.Game#getPlayer
	 * @model opposite="player" required="true" transient="false"
	 * @generated
	 */
	Game getGame();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.MainCharacter#getGame <em>Game</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' container reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(Game value);

	/**
	 * Returns the value of the '<em><b>Current Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Room</em>' reference.
	 * @see #setCurrentRoom(Room)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getMainCharacter_CurrentRoom()
	 * @model required="true"
	 * @generated
	 */
	Room getCurrentRoom();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.MainCharacter#getCurrentRoom <em>Current Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Room</em>' reference.
	 * @see #getCurrentRoom()
	 * @generated
	 */
	void setCurrentRoom(Room value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nbDiscoveredNpc &gt;= 0 and self.nbDiscoveredNpc &lt;= self.game.nbNpc'"
	 * @generated
	 */
	boolean nbDiscoveredNpcBorned(DiagnosticChain diagnostics, Map<Object, Object> context);

} // MainCharacter
