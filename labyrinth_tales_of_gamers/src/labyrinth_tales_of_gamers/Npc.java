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
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getHintPosition <em>Hint Position</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#isDiscovered <em>Discovered</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getValidPropositionSentence <em>Valid Proposition Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getInvalidPropositionSentence <em>Invalid Proposition Sentence</em>}</li>
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
	 * Returns the value of the '<em><b>Hint Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint Position</em>' reference.
	 * @see #setHintPosition(Room)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_HintPosition()
	 * @model required="true"
	 * @generated
	 */
	Room getHintPosition();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getHintPosition <em>Hint Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint Position</em>' reference.
	 * @see #getHintPosition()
	 * @generated
	 */
	void setHintPosition(Room value);

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

} // Npc
