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
 *   <li>{@link labyrinth_tales_of_gamers.Npc#isDiscoveredEnigma <em>Discovered Enigma</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getValidPropositionSentence <em>Valid Proposition Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getInvalidPropositionSentence <em>Invalid Proposition Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getHint <em>Hint</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getCurrentRoom <em>Current Room</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getDiscoveredEnigmaSentence <em>Discovered Enigma Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getDiscoveredSentenceHint <em>Discovered Sentence Hint</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getEnigmaSentence <em>Enigma Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getHintSentence <em>Hint Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Npc#getEnigmaSolution <em>Enigma Solution</em>}</li>
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Discovered Enigma</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered Enigma</em>' attribute.
	 * @see #setDiscoveredEnigma(boolean)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_DiscoveredEnigma()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDiscoveredEnigma();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#isDiscoveredEnigma <em>Discovered Enigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovered Enigma</em>' attribute.
	 * @see #isDiscoveredEnigma()
	 * @generated
	 */
	void setDiscoveredEnigma(boolean value);

	/**
	 * Returns the value of the '<em><b>Valid Proposition Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Proposition Sentence</em>' attribute.
	 * @see #setValidPropositionSentence(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_ValidPropositionSentence()
	 * @model required="true"
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
	 * @model opposite="npc" required="true"
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

	/**
	 * Returns the value of the '<em><b>Discovered Enigma Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered Enigma Sentence</em>' attribute.
	 * @see #setDiscoveredEnigmaSentence(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_DiscoveredEnigmaSentence()
	 * @model required="true"
	 * @generated
	 */
	String getDiscoveredEnigmaSentence();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getDiscoveredEnigmaSentence <em>Discovered Enigma Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovered Enigma Sentence</em>' attribute.
	 * @see #getDiscoveredEnigmaSentence()
	 * @generated
	 */
	void setDiscoveredEnigmaSentence(String value);

	/**
	 * Returns the value of the '<em><b>Discovered Sentence Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered Sentence Hint</em>' attribute.
	 * @see #setDiscoveredSentenceHint(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_DiscoveredSentenceHint()
	 * @model required="true"
	 * @generated
	 */
	String getDiscoveredSentenceHint();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getDiscoveredSentenceHint <em>Discovered Sentence Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovered Sentence Hint</em>' attribute.
	 * @see #getDiscoveredSentenceHint()
	 * @generated
	 */
	void setDiscoveredSentenceHint(String value);

	/**
	 * Returns the value of the '<em><b>Enigma Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enigma Sentence</em>' attribute.
	 * @see #setEnigmaSentence(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_EnigmaSentence()
	 * @model
	 * @generated
	 */
	String getEnigmaSentence();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getEnigmaSentence <em>Enigma Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enigma Sentence</em>' attribute.
	 * @see #getEnigmaSentence()
	 * @generated
	 */
	void setEnigmaSentence(String value);

	/**
	 * Returns the value of the '<em><b>Hint Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint Sentence</em>' attribute.
	 * @see #setHintSentence(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_HintSentence()
	 * @model required="true"
	 * @generated
	 */
	String getHintSentence();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getHintSentence <em>Hint Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint Sentence</em>' attribute.
	 * @see #getHintSentence()
	 * @generated
	 */
	void setHintSentence(String value);

	/**
	 * Returns the value of the '<em><b>Enigma Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enigma Solution</em>' attribute.
	 * @see #setEnigmaSolution(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getNpc_EnigmaSolution()
	 * @model required="true"
	 * @generated
	 */
	String getEnigmaSolution();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Npc#getEnigmaSolution <em>Enigma Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enigma Solution</em>' attribute.
	 * @see #getEnigmaSolution()
	 * @generated
	 */
	void setEnigmaSolution(String value);

} // Npc
