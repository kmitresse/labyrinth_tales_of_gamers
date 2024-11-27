/**
 */
package labyrinthTalesOfGamers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage
 * @generated
 */
public interface LabyrinthTalesOfGamersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabyrinthTalesOfGamersFactory eINSTANCE = labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Main Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Character</em>'.
	 * @generated
	 */
	MainCharacter createMainCharacter();

	/**
	 * Returns a new object of class '<em>Npc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Npc</em>'.
	 * @generated
	 */
	Npc createNpc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LabyrinthTalesOfGamersPackage getLabyrinthTalesOfGamersPackage();

} //LabyrinthTalesOfGamersFactory
