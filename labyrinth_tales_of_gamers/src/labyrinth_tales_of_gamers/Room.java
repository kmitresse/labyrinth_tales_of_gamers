/**
 */
package labyrinth_tales_of_gamers;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link labyrinth_tales_of_gamers.Room#getNorth <em>North</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Room#getEast <em>East</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Room#getWest <em>West</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Room#getSouth <em>South</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Room#getHint <em>Hint</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Room#getName <em>Name</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Room#getGame <em>Game</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Room#getActions <em>Actions</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Room#getNpc <em>Npc</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Room#getBackendName <em>Backend Name</em>}</li>
 * </ul>
 *
 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='proposeActionImpliesNpcExists'"
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>North</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Room#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' reference.
	 * @see #setNorth(Room)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_North()
	 * @see labyrinth_tales_of_gamers.Room#getSouth
	 * @model opposite="south"
	 * @generated
	 */
	Room getNorth();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Room#getNorth <em>North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' reference.
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(Room value);

	/**
	 * Returns the value of the '<em><b>East</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Room#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' reference.
	 * @see #setEast(Room)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_East()
	 * @see labyrinth_tales_of_gamers.Room#getWest
	 * @model opposite="west"
	 * @generated
	 */
	Room getEast();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Room#getEast <em>East</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' reference.
	 * @see #getEast()
	 * @generated
	 */
	void setEast(Room value);

	/**
	 * Returns the value of the '<em><b>West</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Room#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' reference.
	 * @see #setWest(Room)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_West()
	 * @see labyrinth_tales_of_gamers.Room#getEast
	 * @model opposite="east"
	 * @generated
	 */
	Room getWest();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Room#getWest <em>West</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' reference.
	 * @see #getWest()
	 * @generated
	 */
	void setWest(Room value);

	/**
	 * Returns the value of the '<em><b>South</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Room#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' reference.
	 * @see #setSouth(Room)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_South()
	 * @see labyrinth_tales_of_gamers.Room#getNorth
	 * @model opposite="north"
	 * @generated
	 */
	Room getSouth();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Room#getSouth <em>South</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' reference.
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(Room value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' containment reference.
	 * @see #setHint(Hint)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_Hint()
	 * @model containment="true"
	 * @generated
	 */
	Hint getHint();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Room#getHint <em>Hint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' containment reference.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(Hint value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Game</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Game#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' container reference.
	 * @see #setGame(Game)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_Game()
	 * @see labyrinth_tales_of_gamers.Game#getRooms
	 * @model opposite="rooms" required="true" transient="false"
	 * @generated
	 */
	Game getGame();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Room#getGame <em>Game</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' container reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(Game value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link labyrinth_tales_of_gamers.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_Actions()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Npc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Npc</em>' containment reference.
	 * @see #setNpc(Npc)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_Npc()
	 * @model containment="true"
	 * @generated
	 */
	Npc getNpc();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Room#getNpc <em>Npc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Npc</em>' containment reference.
	 * @see #getNpc()
	 * @generated
	 */
	void setNpc(Npc value);

	/**
	 * Returns the value of the '<em><b>Backend Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Name</em>' attribute.
	 * @see #setBackendName(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getRoom_BackendName()
	 * @model required="true"
	 * @generated
	 */
	String getBackendName();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Room#getBackendName <em>Backend Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Name</em>' attribute.
	 * @see #getBackendName()
	 * @generated
	 */
	void setBackendName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.actions-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean existingAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.actions-&gt;exists(action | action.label = \'Demander l\\\'indice\') implies not self.npc.oclIsUndefined()'"
	 * @generated
	 */
	boolean npcActionImpliesNpcExists(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.actions-&gt;exists(action | action.label = \'Lire l\\\'indice\') implies not self.npc.oclIsUndefined()'"
	 * @generated
	 */
	boolean hintActionImpliesHintExists(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.actions-&gt;exists(action | action.label = \'Proposer un nom\') implies not self.npc.oclIsUndefined()'"
	 * @generated
	 */
	boolean proposeActionImpliesNpcExists(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.east &lt;&gt; self and self.north &lt;&gt; self and self.south &lt;&gt; self and self.west &lt;&gt; self'"
	 * @generated
	 */
	boolean notHisOwnExit(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.east &lt;&gt; null or self.north &lt;&gt; null or self.south &lt;&gt; null or self.west &lt;&gt; null'"
	 * @generated
	 */
	boolean existingAnExit(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Room
