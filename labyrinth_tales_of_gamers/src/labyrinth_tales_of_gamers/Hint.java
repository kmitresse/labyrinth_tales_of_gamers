/**
 */
package labyrinth_tales_of_gamers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.Hint#getLabel <em>Label</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Hint#getCurrentRoom <em>Current Room</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.Hint#getNpc <em>Npc</em>}</li>
 * </ul>
 *
 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getHint()
 * @model
 * @generated
 */
public interface Hint extends Entity {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getHint_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Hint#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Current Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Room#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Room</em>' container reference.
	 * @see #setCurrentRoom(Room)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getHint_CurrentRoom()
	 * @see labyrinth_tales_of_gamers.Room#getHint
	 * @model opposite="hint" required="true" transient="false"
	 * @generated
	 */
	Room getCurrentRoom();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Hint#getCurrentRoom <em>Current Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Room</em>' container reference.
	 * @see #getCurrentRoom()
	 * @generated
	 */
	void setCurrentRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Npc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link labyrinth_tales_of_gamers.Npc#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Npc</em>' reference.
	 * @see #setNpc(Npc)
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#getHint_Npc()
	 * @see labyrinth_tales_of_gamers.Npc#getHint
	 * @model opposite="hint" required="true"
	 * @generated
	 */
	Npc getNpc();

	/**
	 * Sets the value of the '{@link labyrinth_tales_of_gamers.Hint#getNpc <em>Npc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Npc</em>' reference.
	 * @see #getNpc()
	 * @generated
	 */
	void setNpc(Npc value);

} // Hint
