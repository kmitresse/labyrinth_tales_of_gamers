/**
 */
package labyrinth_tales_of_gamers;

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
 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Labyrinth_tales_of_gamersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "labyrinth_tales_of_gamers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://labyrinthtalesofgamers.com/";

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
	Labyrinth_tales_of_gamersPackage eINSTANCE = labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl.init();

	/**
	 * The meta object id for the '{@link labyrinth_tales_of_gamers.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinth_tales_of_gamers.impl.GameImpl
	 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ROOMS = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SUBTITLE = 3;

	/**
	 * The feature id for the '<em><b>Prologue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PROLOGUE = 4;

	/**
	 * The feature id for the '<em><b>Epilogue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__EPILOGUE = 5;

	/**
	 * The feature id for the '<em><b>Nb Enigmas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__NB_ENIGMAS = 6;

	/**
	 * The feature id for the '<em><b>Aim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__AIM = 7;

	/**
	 * The feature id for the '<em><b>How To Play</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__HOW_TO_PLAY = 8;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__MAP = 9;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ACTIONS = 10;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Nb Npc Positive Or Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___NB_NPC_POSITIVE_OR_NULL__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link labyrinth_tales_of_gamers.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinth_tales_of_gamers.impl.RoomImpl
	 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getRoom()
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
	 * The feature id for the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 5;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__GAME = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ACTIONS = 7;

	/**
	 * The feature id for the '<em><b>Npc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NPC = 8;

	/**
	 * The feature id for the '<em><b>Backend Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BACKEND_NAME = 9;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Not His Own Exit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___NOT_HIS_OWN_EXIT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Existing An Exit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___EXISTING_AN_EXIT__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Existing Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___EXISTING_ACTION__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Npc Action Implies Npc Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___NPC_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Hint Action Implies Hint Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___HINT_ACTION_IMPLIES_HINT_EXISTS__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Propose Action Implies Npc Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___PROPOSE_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link labyrinth_tales_of_gamers.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinth_tales_of_gamers.impl.EntityImpl
	 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Discovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISCOVERED = 1;

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
	 * The meta object id for the '{@link labyrinth_tales_of_gamers.impl.HintImpl <em>Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinth_tales_of_gamers.impl.HintImpl
	 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getHint()
	 * @generated
	 */
	int HINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Discovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT__DISCOVERED = ENTITY__DISCOVERED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT__LABEL = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT__CURRENT_ROOM = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Npc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT__NPC = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labyrinth_tales_of_gamers.impl.MainCharacterImpl <em>Main Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinth_tales_of_gamers.impl.MainCharacterImpl
	 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getMainCharacter()
	 * @generated
	 */
	int MAIN_CHARACTER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Discovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER__DISCOVERED = ENTITY__DISCOVERED;

	/**
	 * The feature id for the '<em><b>Nb Discovered Enigmas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER__NB_DISCOVERED_ENIGMAS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER__GAME = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER__CURRENT_ROOM = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Main Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Nb Discovered Npc Borned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER___NB_DISCOVERED_NPC_BORNED__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CHARACTER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link labyrinth_tales_of_gamers.impl.NpcImpl <em>Npc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinth_tales_of_gamers.impl.NpcImpl
	 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getNpc()
	 * @generated
	 */
	int NPC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Discovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DISCOVERED = ENTITY__DISCOVERED;

	/**
	 * The feature id for the '<em><b>Hello Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__HELLO_SENTENCE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Discovered Enigma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DISCOVERED_ENIGMA = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid Proposition Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__VALID_PROPOSITION_SENTENCE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invalid Proposition Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__INVALID_PROPOSITION_SENTENCE = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__HINT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__CURRENT_ROOM = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Discovered Enigma Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DISCOVERED_ENIGMA_SENTENCE = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Discovered Sentence Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DISCOVERED_SENTENCE_HINT = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Enigma Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__ENIGMA_SENTENCE = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hint Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__HINT_SENTENCE = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Enigma Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__ENIGMA_SOLUTION = ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Npc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Npc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labyrinth_tales_of_gamers.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labyrinth_tales_of_gamers.impl.ActionImpl
	 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Informations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INFORMATIONS = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Label Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___LABEL_ACTION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link labyrinth_tales_of_gamers.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see labyrinth_tales_of_gamers.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference '{@link labyrinth_tales_of_gamers.Game#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getPlayer()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Player();

	/**
	 * Returns the meta object for the containment reference list '{@link labyrinth_tales_of_gamers.Game#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getRooms()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Rooms();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Game#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getTitle()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Title();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Game#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getSubtitle()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Subtitle();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Game#getPrologue <em>Prologue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prologue</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getPrologue()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Prologue();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Game#getEpilogue <em>Epilogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epilogue</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getEpilogue()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Epilogue();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Game#getNbEnigmas <em>Nb Enigmas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Enigmas</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getNbEnigmas()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_NbEnigmas();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Game#getAim <em>Aim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aim</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getAim()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Aim();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Game#getHowToPlay <em>How To Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>How To Play</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getHowToPlay()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_HowToPlay();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Game#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getMap()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link labyrinth_tales_of_gamers.Game#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see labyrinth_tales_of_gamers.Game#getActions()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Actions();

	/**
	 * Returns the meta object for the '{@link labyrinth_tales_of_gamers.Game#nbNpcPositiveOrNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nb Npc Positive Or Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nb Npc Positive Or Null</em>' operation.
	 * @see labyrinth_tales_of_gamers.Game#nbNpcPositiveOrNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__NbNpcPositiveOrNull__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link labyrinth_tales_of_gamers.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see labyrinth_tales_of_gamers.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference '{@link labyrinth_tales_of_gamers.Room#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>North</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getNorth()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_North();

	/**
	 * Returns the meta object for the reference '{@link labyrinth_tales_of_gamers.Room#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>East</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getEast()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_East();

	/**
	 * Returns the meta object for the reference '{@link labyrinth_tales_of_gamers.Room#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>West</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getWest()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_West();

	/**
	 * Returns the meta object for the reference '{@link labyrinth_tales_of_gamers.Room#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>South</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getSouth()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_South();

	/**
	 * Returns the meta object for the containment reference '{@link labyrinth_tales_of_gamers.Room#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getHint()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Hint();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the container reference '{@link labyrinth_tales_of_gamers.Room#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getGame()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Game();

	/**
	 * Returns the meta object for the containment reference list '{@link labyrinth_tales_of_gamers.Room#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getActions()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link labyrinth_tales_of_gamers.Room#getNpc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Npc</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getNpc()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Npc();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Room#getBackendName <em>Backend Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Name</em>'.
	 * @see labyrinth_tales_of_gamers.Room#getBackendName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_BackendName();

	/**
	 * Returns the meta object for the '{@link labyrinth_tales_of_gamers.Room#existingAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Existing Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Existing Action</em>' operation.
	 * @see labyrinth_tales_of_gamers.Room#existingAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__ExistingAction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link labyrinth_tales_of_gamers.Room#npcActionImpliesNpcExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Npc Action Implies Npc Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Npc Action Implies Npc Exists</em>' operation.
	 * @see labyrinth_tales_of_gamers.Room#npcActionImpliesNpcExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__NpcActionImpliesNpcExists__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link labyrinth_tales_of_gamers.Room#hintActionImpliesHintExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Hint Action Implies Hint Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hint Action Implies Hint Exists</em>' operation.
	 * @see labyrinth_tales_of_gamers.Room#hintActionImpliesHintExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__HintActionImpliesHintExists__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link labyrinth_tales_of_gamers.Room#proposeActionImpliesNpcExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Propose Action Implies Npc Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propose Action Implies Npc Exists</em>' operation.
	 * @see labyrinth_tales_of_gamers.Room#proposeActionImpliesNpcExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__ProposeActionImpliesNpcExists__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link labyrinth_tales_of_gamers.Room#notHisOwnExit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not His Own Exit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not His Own Exit</em>' operation.
	 * @see labyrinth_tales_of_gamers.Room#notHisOwnExit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__NotHisOwnExit__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link labyrinth_tales_of_gamers.Room#existingAnExit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Existing An Exit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Existing An Exit</em>' operation.
	 * @see labyrinth_tales_of_gamers.Room#existingAnExit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__ExistingAnExit__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link labyrinth_tales_of_gamers.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see labyrinth_tales_of_gamers.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see labyrinth_tales_of_gamers.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Entity#isDiscovered <em>Discovered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovered</em>'.
	 * @see labyrinth_tales_of_gamers.Entity#isDiscovered()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Discovered();

	/**
	 * Returns the meta object for class '{@link labyrinth_tales_of_gamers.Hint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hint</em>'.
	 * @see labyrinth_tales_of_gamers.Hint
	 * @generated
	 */
	EClass getHint();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Hint#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see labyrinth_tales_of_gamers.Hint#getLabel()
	 * @see #getHint()
	 * @generated
	 */
	EAttribute getHint_Label();

	/**
	 * Returns the meta object for the container reference '{@link labyrinth_tales_of_gamers.Hint#getCurrentRoom <em>Current Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Current Room</em>'.
	 * @see labyrinth_tales_of_gamers.Hint#getCurrentRoom()
	 * @see #getHint()
	 * @generated
	 */
	EReference getHint_CurrentRoom();

	/**
	 * Returns the meta object for the reference '{@link labyrinth_tales_of_gamers.Hint#getNpc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Npc</em>'.
	 * @see labyrinth_tales_of_gamers.Hint#getNpc()
	 * @see #getHint()
	 * @generated
	 */
	EReference getHint_Npc();

	/**
	 * Returns the meta object for class '{@link labyrinth_tales_of_gamers.MainCharacter <em>Main Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Character</em>'.
	 * @see labyrinth_tales_of_gamers.MainCharacter
	 * @generated
	 */
	EClass getMainCharacter();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.MainCharacter#getNbDiscoveredEnigmas <em>Nb Discovered Enigmas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Discovered Enigmas</em>'.
	 * @see labyrinth_tales_of_gamers.MainCharacter#getNbDiscoveredEnigmas()
	 * @see #getMainCharacter()
	 * @generated
	 */
	EAttribute getMainCharacter_NbDiscoveredEnigmas();

	/**
	 * Returns the meta object for the container reference '{@link labyrinth_tales_of_gamers.MainCharacter#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see labyrinth_tales_of_gamers.MainCharacter#getGame()
	 * @see #getMainCharacter()
	 * @generated
	 */
	EReference getMainCharacter_Game();

	/**
	 * Returns the meta object for the reference '{@link labyrinth_tales_of_gamers.MainCharacter#getCurrentRoom <em>Current Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Room</em>'.
	 * @see labyrinth_tales_of_gamers.MainCharacter#getCurrentRoom()
	 * @see #getMainCharacter()
	 * @generated
	 */
	EReference getMainCharacter_CurrentRoom();

	/**
	 * Returns the meta object for the '{@link labyrinth_tales_of_gamers.MainCharacter#nbDiscoveredNpcBorned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nb Discovered Npc Borned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nb Discovered Npc Borned</em>' operation.
	 * @see labyrinth_tales_of_gamers.MainCharacter#nbDiscoveredNpcBorned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMainCharacter__NbDiscoveredNpcBorned__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link labyrinth_tales_of_gamers.Npc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Npc</em>'.
	 * @see labyrinth_tales_of_gamers.Npc
	 * @generated
	 */
	EClass getNpc();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Npc#getHelloSentence <em>Hello Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hello Sentence</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getHelloSentence()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_HelloSentence();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Npc#isDiscoveredEnigma <em>Discovered Enigma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovered Enigma</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#isDiscoveredEnigma()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_DiscoveredEnigma();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Npc#getValidPropositionSentence <em>Valid Proposition Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Proposition Sentence</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getValidPropositionSentence()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_ValidPropositionSentence();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Npc#getInvalidPropositionSentence <em>Invalid Proposition Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Proposition Sentence</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getInvalidPropositionSentence()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_InvalidPropositionSentence();

	/**
	 * Returns the meta object for the reference '{@link labyrinth_tales_of_gamers.Npc#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hint</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getHint()
	 * @see #getNpc()
	 * @generated
	 */
	EReference getNpc_Hint();

	/**
	 * Returns the meta object for the container reference '{@link labyrinth_tales_of_gamers.Npc#getCurrentRoom <em>Current Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Current Room</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getCurrentRoom()
	 * @see #getNpc()
	 * @generated
	 */
	EReference getNpc_CurrentRoom();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Npc#getDiscoveredEnigmaSentence <em>Discovered Enigma Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovered Enigma Sentence</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getDiscoveredEnigmaSentence()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_DiscoveredEnigmaSentence();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Npc#getDiscoveredSentenceHint <em>Discovered Sentence Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovered Sentence Hint</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getDiscoveredSentenceHint()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_DiscoveredSentenceHint();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Npc#getEnigmaSentence <em>Enigma Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enigma Sentence</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getEnigmaSentence()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_EnigmaSentence();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Npc#getHintSentence <em>Hint Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint Sentence</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getHintSentence()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_HintSentence();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Npc#getEnigmaSolution <em>Enigma Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enigma Solution</em>'.
	 * @see labyrinth_tales_of_gamers.Npc#getEnigmaSolution()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_EnigmaSolution();

	/**
	 * Returns the meta object for class '{@link labyrinth_tales_of_gamers.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see labyrinth_tales_of_gamers.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Action#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see labyrinth_tales_of_gamers.Action#getLabel()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Label();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see labyrinth_tales_of_gamers.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link labyrinth_tales_of_gamers.Action#getInformations <em>Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Informations</em>'.
	 * @see labyrinth_tales_of_gamers.Action#getInformations()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Informations();

	/**
	 * Returns the meta object for the '{@link labyrinth_tales_of_gamers.Action#labelAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Label Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Label Action</em>' operation.
	 * @see labyrinth_tales_of_gamers.Action#labelAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAction__LabelAction__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Labyrinth_tales_of_gamersFactory getLabyrinth_tales_of_gamersFactory();

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
		 * The meta object literal for the '{@link labyrinth_tales_of_gamers.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinth_tales_of_gamers.impl.GameImpl
		 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYER = eINSTANCE.getGame_Player();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ROOMS = eINSTANCE.getGame_Rooms();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__TITLE = eINSTANCE.getGame_Title();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__SUBTITLE = eINSTANCE.getGame_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Prologue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__PROLOGUE = eINSTANCE.getGame_Prologue();

		/**
		 * The meta object literal for the '<em><b>Epilogue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__EPILOGUE = eINSTANCE.getGame_Epilogue();

		/**
		 * The meta object literal for the '<em><b>Nb Enigmas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__NB_ENIGMAS = eINSTANCE.getGame_NbEnigmas();

		/**
		 * The meta object literal for the '<em><b>Aim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__AIM = eINSTANCE.getGame_Aim();

		/**
		 * The meta object literal for the '<em><b>How To Play</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__HOW_TO_PLAY = eINSTANCE.getGame_HowToPlay();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__MAP = eINSTANCE.getGame_Map();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ACTIONS = eINSTANCE.getGame_Actions();

		/**
		 * The meta object literal for the '<em><b>Nb Npc Positive Or Null</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___NB_NPC_POSITIVE_OR_NULL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__NbNpcPositiveOrNull__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link labyrinth_tales_of_gamers.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinth_tales_of_gamers.impl.RoomImpl
		 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getRoom()
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
		 * The meta object literal for the '<em><b>Hint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HINT = eINSTANCE.getRoom_Hint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__GAME = eINSTANCE.getRoom_Game();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ACTIONS = eINSTANCE.getRoom_Actions();

		/**
		 * The meta object literal for the '<em><b>Npc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__NPC = eINSTANCE.getRoom_Npc();

		/**
		 * The meta object literal for the '<em><b>Backend Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__BACKEND_NAME = eINSTANCE.getRoom_BackendName();

		/**
		 * The meta object literal for the '<em><b>Existing Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___EXISTING_ACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__ExistingAction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Npc Action Implies Npc Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___NPC_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__NpcActionImpliesNpcExists__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Hint Action Implies Hint Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___HINT_ACTION_IMPLIES_HINT_EXISTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__HintActionImpliesHintExists__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Propose Action Implies Npc Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___PROPOSE_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__ProposeActionImpliesNpcExists__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Not His Own Exit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___NOT_HIS_OWN_EXIT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__NotHisOwnExit__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Existing An Exit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___EXISTING_AN_EXIT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__ExistingAnExit__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link labyrinth_tales_of_gamers.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinth_tales_of_gamers.impl.EntityImpl
		 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Discovered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DISCOVERED = eINSTANCE.getEntity_Discovered();

		/**
		 * The meta object literal for the '{@link labyrinth_tales_of_gamers.impl.HintImpl <em>Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinth_tales_of_gamers.impl.HintImpl
		 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getHint()
		 * @generated
		 */
		EClass HINT = eINSTANCE.getHint();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HINT__LABEL = eINSTANCE.getHint_Label();

		/**
		 * The meta object literal for the '<em><b>Current Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HINT__CURRENT_ROOM = eINSTANCE.getHint_CurrentRoom();

		/**
		 * The meta object literal for the '<em><b>Npc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HINT__NPC = eINSTANCE.getHint_Npc();

		/**
		 * The meta object literal for the '{@link labyrinth_tales_of_gamers.impl.MainCharacterImpl <em>Main Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinth_tales_of_gamers.impl.MainCharacterImpl
		 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getMainCharacter()
		 * @generated
		 */
		EClass MAIN_CHARACTER = eINSTANCE.getMainCharacter();

		/**
		 * The meta object literal for the '<em><b>Nb Discovered Enigmas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_CHARACTER__NB_DISCOVERED_ENIGMAS = eINSTANCE.getMainCharacter_NbDiscoveredEnigmas();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_CHARACTER__GAME = eINSTANCE.getMainCharacter_Game();

		/**
		 * The meta object literal for the '<em><b>Current Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_CHARACTER__CURRENT_ROOM = eINSTANCE.getMainCharacter_CurrentRoom();

		/**
		 * The meta object literal for the '<em><b>Nb Discovered Npc Borned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAIN_CHARACTER___NB_DISCOVERED_NPC_BORNED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMainCharacter__NbDiscoveredNpcBorned__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link labyrinth_tales_of_gamers.impl.NpcImpl <em>Npc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinth_tales_of_gamers.impl.NpcImpl
		 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getNpc()
		 * @generated
		 */
		EClass NPC = eINSTANCE.getNpc();

		/**
		 * The meta object literal for the '<em><b>Hello Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__HELLO_SENTENCE = eINSTANCE.getNpc_HelloSentence();

		/**
		 * The meta object literal for the '<em><b>Discovered Enigma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__DISCOVERED_ENIGMA = eINSTANCE.getNpc_DiscoveredEnigma();

		/**
		 * The meta object literal for the '<em><b>Valid Proposition Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__VALID_PROPOSITION_SENTENCE = eINSTANCE.getNpc_ValidPropositionSentence();

		/**
		 * The meta object literal for the '<em><b>Invalid Proposition Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__INVALID_PROPOSITION_SENTENCE = eINSTANCE.getNpc_InvalidPropositionSentence();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPC__HINT = eINSTANCE.getNpc_Hint();

		/**
		 * The meta object literal for the '<em><b>Current Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPC__CURRENT_ROOM = eINSTANCE.getNpc_CurrentRoom();

		/**
		 * The meta object literal for the '<em><b>Discovered Enigma Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__DISCOVERED_ENIGMA_SENTENCE = eINSTANCE.getNpc_DiscoveredEnigmaSentence();

		/**
		 * The meta object literal for the '<em><b>Discovered Sentence Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__DISCOVERED_SENTENCE_HINT = eINSTANCE.getNpc_DiscoveredSentenceHint();

		/**
		 * The meta object literal for the '<em><b>Enigma Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__ENIGMA_SENTENCE = eINSTANCE.getNpc_EnigmaSentence();

		/**
		 * The meta object literal for the '<em><b>Hint Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__HINT_SENTENCE = eINSTANCE.getNpc_HintSentence();

		/**
		 * The meta object literal for the '<em><b>Enigma Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__ENIGMA_SOLUTION = eINSTANCE.getNpc_EnigmaSolution();

		/**
		 * The meta object literal for the '{@link labyrinth_tales_of_gamers.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labyrinth_tales_of_gamers.impl.ActionImpl
		 * @see labyrinth_tales_of_gamers.impl.Labyrinth_tales_of_gamersPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__LABEL = eINSTANCE.getAction_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Informations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__INFORMATIONS = eINSTANCE.getAction_Informations();

		/**
		 * The meta object literal for the '<em><b>Label Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___LABEL_ACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAction__LabelAction__DiagnosticChain_Map();

	}

} //Labyrinth_tales_of_gamersPackage
