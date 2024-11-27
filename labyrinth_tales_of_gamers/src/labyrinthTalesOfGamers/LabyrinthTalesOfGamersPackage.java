/**
 */
package labyrinthTalesOfGamers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see labyrinthTalesOfGamers.LabyrinthTalesOfGamersFactory
 * @model kind="package"
 * @generated
 */
public interface LabyrinthTalesOfGamersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "labyrinthTalesOfGamers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.labyrinthtalesofgamers.com/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "labyrinthTalesOfGamers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabyrinthTalesOfGamersPackage eINSTANCE = labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl.init();

	/**
	 * The meta object id for the '{@link labyrinthTalesOfGamers.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinthTalesOfGamers.impl.GameImpl
	 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ROOMS = 1;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>New Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___NEW_GAME = 0;

	/**
	 * The operation id for the '<em>Propose Choices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___PROPOSE_CHOICES = 1;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link labyrinthTalesOfGamers.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinthTalesOfGamers.impl.RoomImpl
	 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>North</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NORTH = 0;

	/**
	 * The feature id for the '<em><b>East</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__EAST = 1;

	/**
	 * The feature id for the '<em><b>West</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WEST = 2;

	/**
	 * The feature id for the '<em><b>South</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SOUTH = 3;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ENTITIES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 5;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Introduce</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___INTRODUCE = 0;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link labyrinthTalesOfGamers.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinthTalesOfGamers.impl.EntityImpl
	 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Current Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CURRENT_ROOM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labyrinthTalesOfGamers.impl.MainCharacterImpl <em>Main Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinthTalesOfGamers.impl.MainCharacterImpl
	 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getMainCharacter()
	 * @generated
	 */
	int MAIN_CHARACTER = 3;

	/**
	 * The feature id for the '<em><b>Current Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER__CURRENT_ROOM = ENTITY__CURRENT_ROOM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER__NAME = ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Main Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Select Choices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER___SELECT_CHOICES__ELIST = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link labyrinthTalesOfGamers.impl.NpcImpl <em>Npc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinthTalesOfGamers.impl.NpcImpl
	 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getNpc()
	 * @generated
	 */
	int NPC = 4;

	/**
	 * The feature id for the '<em><b>Current Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__CURRENT_ROOM = ENTITY__CURRENT_ROOM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__NAME = ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Npc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Salute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC___SALUTE = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Give Hint Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC___GIVE_HINT_POSITION = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Npc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link labyrinthTalesOfGamers.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see labyrinthTalesOfGamers.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the reference '{@link labyrinthTalesOfGamers.Game#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see labyrinthTalesOfGamers.Game#getPlayer()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Player();

	/**
	 * Returns the meta object for the reference list '{@link labyrinthTalesOfGamers.Game#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see labyrinthTalesOfGamers.Game#getRooms()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Rooms();

	/**
	 * Returns the meta object for the '{@link labyrinthTalesOfGamers.Game#newGame() <em>New Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Game</em>' operation.
	 * @see labyrinthTalesOfGamers.Game#newGame()
	 * @generated
	 */
	EOperation getGame__NewGame();

	/**
	 * Returns the meta object for the '{@link labyrinthTalesOfGamers.Game#proposeChoices() <em>Propose Choices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propose Choices</em>' operation.
	 * @see labyrinthTalesOfGamers.Game#proposeChoices()
	 * @generated
	 */
	EOperation getGame__ProposeChoices();

	/**
	 * Returns the meta object for class '{@link labyrinthTalesOfGamers.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see labyrinthTalesOfGamers.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference '{@link labyrinthTalesOfGamers.Room#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>North</em>'.
	 * @see labyrinthTalesOfGamers.Room#getNorth()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_North();

	/**
	 * Returns the meta object for the reference '{@link labyrinthTalesOfGamers.Room#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>East</em>'.
	 * @see labyrinthTalesOfGamers.Room#getEast()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_East();

	/**
	 * Returns the meta object for the reference '{@link labyrinthTalesOfGamers.Room#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>West</em>'.
	 * @see labyrinthTalesOfGamers.Room#getWest()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_West();

	/**
	 * Returns the meta object for the reference '{@link labyrinthTalesOfGamers.Room#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>South</em>'.
	 * @see labyrinthTalesOfGamers.Room#getSouth()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_South();

	/**
	 * Returns the meta object for the reference list '{@link labyrinthTalesOfGamers.Room#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see labyrinthTalesOfGamers.Room#getEntities()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Entities();

	/**
	 * Returns the meta object for the attribute '{@link labyrinthTalesOfGamers.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see labyrinthTalesOfGamers.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the '{@link labyrinthTalesOfGamers.Room#introduce() <em>Introduce</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Introduce</em>' operation.
	 * @see labyrinthTalesOfGamers.Room#introduce()
	 * @generated
	 */
	EOperation getRoom__Introduce();

	/**
	 * Returns the meta object for class '{@link labyrinthTalesOfGamers.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see labyrinthTalesOfGamers.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link labyrinthTalesOfGamers.Entity#getCurrentRoom <em>Current Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Room</em>'.
	 * @see labyrinthTalesOfGamers.Entity#getCurrentRoom()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_CurrentRoom();

	/**
	 * Returns the meta object for the attribute '{@link labyrinthTalesOfGamers.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see labyrinthTalesOfGamers.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for class '{@link labyrinthTalesOfGamers.MainCharacter <em>Main Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Character</em>'.
	 * @see labyrinthTalesOfGamers.MainCharacter
	 * @generated
	 */
	EClass getMainCharacter();

	/**
	 * Returns the meta object for the '{@link labyrinthTalesOfGamers.MainCharacter#selectChoices(org.eclipse.emf.common.util.EList) <em>Select Choices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select Choices</em>' operation.
	 * @see labyrinthTalesOfGamers.MainCharacter#selectChoices(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getMainCharacter__SelectChoices__EList();

	/**
	 * Returns the meta object for class '{@link labyrinthTalesOfGamers.Npc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Npc</em>'.
	 * @see labyrinthTalesOfGamers.Npc
	 * @generated
	 */
	EClass getNpc();

	/**
	 * Returns the meta object for the '{@link labyrinthTalesOfGamers.Npc#salute() <em>Salute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Salute</em>' operation.
	 * @see labyrinthTalesOfGamers.Npc#salute()
	 * @generated
	 */
	EOperation getNpc__Salute();

	/**
	 * Returns the meta object for the '{@link labyrinthTalesOfGamers.Npc#giveHintPosition() <em>Give Hint Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Give Hint Position</em>' operation.
	 * @see labyrinthTalesOfGamers.Npc#giveHintPosition()
	 * @generated
	 */
	EOperation getNpc__GiveHintPosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LabyrinthTalesOfGamersFactory getLabyrinthTalesOfGamersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link labyrinthTalesOfGamers.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinthTalesOfGamers.impl.GameImpl
		 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYER = eINSTANCE.getGame_Player();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ROOMS = eINSTANCE.getGame_Rooms();

		/**
		 * The meta object literal for the '<em><b>New Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___NEW_GAME = eINSTANCE.getGame__NewGame();

		/**
		 * The meta object literal for the '<em><b>Propose Choices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___PROPOSE_CHOICES = eINSTANCE.getGame__ProposeChoices();

		/**
		 * The meta object literal for the '{@link labyrinthTalesOfGamers.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinthTalesOfGamers.impl.RoomImpl
		 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>North</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__NORTH = eINSTANCE.getRoom_North();

		/**
		 * The meta object literal for the '<em><b>East</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__EAST = eINSTANCE.getRoom_East();

		/**
		 * The meta object literal for the '<em><b>West</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WEST = eINSTANCE.getRoom_West();

		/**
		 * The meta object literal for the '<em><b>South</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SOUTH = eINSTANCE.getRoom_South();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ENTITIES = eINSTANCE.getRoom_Entities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Introduce</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___INTRODUCE = eINSTANCE.getRoom__Introduce();

		/**
		 * The meta object literal for the '{@link labyrinthTalesOfGamers.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinthTalesOfGamers.impl.EntityImpl
		 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Current Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CURRENT_ROOM = eINSTANCE.getEntity_CurrentRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '{@link labyrinthTalesOfGamers.impl.MainCharacterImpl <em>Main Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinthTalesOfGamers.impl.MainCharacterImpl
		 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getMainCharacter()
		 * @generated
		 */
		EClass MAIN_CHARACTER = eINSTANCE.getMainCharacter();

		/**
		 * The meta object literal for the '<em><b>Select Choices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAIN_CHARACTER___SELECT_CHOICES__ELIST = eINSTANCE.getMainCharacter__SelectChoices__EList();

		/**
		 * The meta object literal for the '{@link labyrinthTalesOfGamers.impl.NpcImpl <em>Npc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinthTalesOfGamers.impl.NpcImpl
		 * @see labyrinthTalesOfGamers.impl.LabyrinthTalesOfGamersPackageImpl#getNpc()
		 * @generated
		 */
		EClass NPC = eINSTANCE.getNpc();

		/**
		 * The meta object literal for the '<em><b>Salute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NPC___SALUTE = eINSTANCE.getNpc__Salute();

		/**
		 * The meta object literal for the '<em><b>Give Hint Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NPC___GIVE_HINT_POSITION = eINSTANCE.getNpc__GiveHintPosition();

	}

} //LabyrinthTalesOfGamersPackage
