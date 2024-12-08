/**
 */
package labyrinth_tales_of_gamers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Npc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getHelloSentence <em>Hello Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#isDiscovered <em>Discovered</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getValidPropositionSentence <em>Valid Proposition Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getInvalidPropositionSentence <em>Invalid Proposition Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getHint <em>Hint</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getCurrentRoom <em>Current Room</em>}</li>
 * </ul>
 *
 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc()
 * @model
 * @generated
 */
public interface Npc extends Entity {
	/**
	 * Returns the value of the '<em><b>Hello Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hello Sentence</em>' attribute.
	 * @see #setHelloSentence(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_HelloSentence()
	 * @model
	 * @generated
	 */
	String getHelloSentence();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getHelloSentence <em>Hello Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hello Sentence</em>' attribute.
	 * @see #getHelloSentence()
	 * @generated
	 */
	void setHelloSentence(String value);

	/**
	 * Returns the value of the '<em><b>Discovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered</em>' attribute.
	 * @see #setDiscovered(boolean)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_Discovered()
	 * @model required="true"
	 * @generated
	 */
	boolean isDiscovered();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#isDiscovered <em>Discovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovered</em>' attribute.
	 * @see #isDiscovered()
	 * @generated
	 */
	void setDiscovered(boolean value);

	/**
	 * Returns the value of the '<em><b>Valid Proposition Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Proposition Sentence</em>' attribute.
	 * @see #setValidPropositionSentence(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_ValidPropositionSentence()
	 * @model
	 * @generated
	 */
	String getValidPropositionSentence();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getValidPropositionSentence <em>Valid Proposition Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Proposition Sentence</em>' attribute.
	 * @see #getValidPropositionSentence()
	 * @generated
	 */
	void setValidPropositionSentence(String value);

	/**
	 * Returns the value of the '<em><b>Invalid Proposition Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Proposition Sentence</em>' attribute.
	 * @see #setInvalidPropositionSentence(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_InvalidPropositionSentence()
	 * @model required="true"
	 * @generated
	 */
	String getInvalidPropositionSentence();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getInvalidPropositionSentence <em>Invalid Proposition Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Proposition Sentence</em>' attribute.
	 * @see #getInvalidPropositionSentence()
	 * @generated
	 */
	void setInvalidPropositionSentence(String value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Hint#getNpc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' reference.
	 * @see #setHint(Hint)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_Hint()
	 * @see labyrinth_tales_of_gamers.Hint#getNpc
	 * @model opposite="npc"
	 * @generated
	 */
	Hint getHint();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getHint <em>Hint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' reference.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(Hint value);

	/**
	 * Returns the value of the '<em><b>Current Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Room#getNpc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Room</em>' container reference.
	 * @see #setCurrentRoom(Room)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_CurrentRoom()
	 * @see labyrinth_tales_of_gamers.Room#getNpc
	 * @model opposite="npc" required="true" transient="false"
	 * @generated
	 */
	Room getCurrentRoom();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getCurrentRoom <em>Current Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Room</em>' container reference.
	 * @see #getCurrentRoom()
	 * @generated
	 */
	void setCurrentRoom(Room value);

} // Npc
