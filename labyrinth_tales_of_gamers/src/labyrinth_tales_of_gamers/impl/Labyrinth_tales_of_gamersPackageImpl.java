/**
 */
package labyrinth_tales_of_gamers.impl;

import labyrinth_tales_of_gamers.Action;
import labyrinth_tales_of_gamers.Entity;
import labyrinth_tales_of_gamers.Game;
import labyrinth_tales_of_gamers.Hint;
import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersFactory;
import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage;
import labyrinth_tales_of_gamers.MainCharacter;
import labyrinth_tales_of_gamers.Npc;
import labyrinth_tales_of_gamers.Room;

import labyrinth_tales_of_gamers.util.Labyrinth_tales_of_gamersValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Labyrinth_tales_of_gamersPackageImpl extends EPackageImpl implements Labyrinth_tales_of_gamersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainCharacterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Labyrinth_tales_of_gamersPackageImpl() {
		super(eNS_URI, Labyrinth_tales_of_gamersFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Labyrinth_tales_of_gamersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Labyrinth_tales_of_gamersPackage init() {
		if (isInited) return (Labyrinth_tales_of_gamersPackage)EPackage.Registry.INSTANCE.getEPackage(Labyrinth_tales_of_gamersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLabyrinth_tales_of_gamersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Labyrinth_tales_of_gamersPackageImpl theLabyrinth_tales_of_gamersPackage = registeredLabyrinth_tales_of_gamersPackage instanceof Labyrinth_tales_of_gamersPackageImpl ? (Labyrinth_tales_of_gamersPackageImpl)registeredLabyrinth_tales_of_gamersPackage : new Labyrinth_tales_of_gamersPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLabyrinth_tales_of_gamersPackage.createPackageContents();

		// Initialize created meta-data
		theLabyrinth_tales_of_gamersPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLabyrinth_tales_of_gamersPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return Labyrinth_tales_of_gamersValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLabyrinth_tales_of_gamersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Labyrinth_tales_of_gamersPackage.eNS_URI, theLabyrinth_tales_of_gamersPackage);
		return theLabyrinth_tales_of_gamersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_Player() {
		return (EReference)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_Rooms() {
		return (EReference)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_Title() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_Subtitle() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_Prologue() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_Epilogue() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_NbEnigmas() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_Aim() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_HowToPlay() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_Map() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_Actions() {
		return (EReference)gameEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGame__NbNpcPositiveOrNull__DiagnosticChain_Map() {
		return gameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_North() {
		return (EReference)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_East() {
		return (EReference)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_West() {
		return (EReference)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_South() {
		return (EReference)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_Hint() {
		return (EReference)roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_Name() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_Game() {
		return (EReference)roomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_Actions() {
		return (EReference)roomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_Npc() {
		return (EReference)roomEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_BackendName() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoom__ExistingAction__DiagnosticChain_Map() {
		return roomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoom__ReadActionImpliesHintExists__DiagnosticChain_Map() {
		return roomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoom__AskHintActionImpliesNpcExists__DiagnosticChain_Map() {
		return roomEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoom__ProposeActionImpliesNpcExists__DiagnosticChain_Map() {
		return roomEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoom__TalkActionImpliesNpcExists__DiagnosticChain_Map() {
		return roomEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoom__NotHisOwnExit__DiagnosticChain_Map() {
		return roomEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoom__ExistingAnExit__DiagnosticChain_Map() {
		return roomEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_Discovered() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHint() {
		return hintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHint_Label() {
		return (EAttribute)hintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHint_CurrentRoom() {
		return (EReference)hintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHint_Npc() {
		return (EReference)hintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMainCharacter() {
		return mainCharacterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMainCharacter_NbDiscoveredEnigmas() {
		return (EAttribute)mainCharacterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMainCharacter_Game() {
		return (EReference)mainCharacterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMainCharacter_CurrentRoom() {
		return (EReference)mainCharacterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainCharacter__NbDiscoveredNpcBorned__DiagnosticChain_Map() {
		return mainCharacterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNpc() {
		return npcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNpc_HelloSentence() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNpc_DiscoveredEnigma() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNpc_ValidPropositionSentence() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNpc_InvalidPropositionSentence() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNpc_Hint() {
		return (EReference)npcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNpc_CurrentRoom() {
		return (EReference)npcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNpc_DiscoveredEnigmaSentence() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNpc_DiscoveredSentenceHint() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNpc_EnigmaSentence() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNpc_HintSentence() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNpc_EnigmaSolution() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Label() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Informations() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__LabelAction__DiagnosticChain_Map() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Labyrinth_tales_of_gamersFactory getLabyrinth_tales_of_gamersFactory() {
		return (Labyrinth_tales_of_gamersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__PLAYER);
		createEReference(gameEClass, GAME__ROOMS);
		createEAttribute(gameEClass, GAME__TITLE);
		createEAttribute(gameEClass, GAME__SUBTITLE);
		createEAttribute(gameEClass, GAME__PROLOGUE);
		createEAttribute(gameEClass, GAME__EPILOGUE);
		createEAttribute(gameEClass, GAME__NB_ENIGMAS);
		createEAttribute(gameEClass, GAME__AIM);
		createEAttribute(gameEClass, GAME__HOW_TO_PLAY);
		createEAttribute(gameEClass, GAME__MAP);
		createEReference(gameEClass, GAME__ACTIONS);
		createEOperation(gameEClass, GAME___NB_NPC_POSITIVE_OR_NULL__DIAGNOSTICCHAIN_MAP);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__NORTH);
		createEReference(roomEClass, ROOM__EAST);
		createEReference(roomEClass, ROOM__WEST);
		createEReference(roomEClass, ROOM__SOUTH);
		createEReference(roomEClass, ROOM__HINT);
		createEAttribute(roomEClass, ROOM__NAME);
		createEReference(roomEClass, ROOM__GAME);
		createEReference(roomEClass, ROOM__ACTIONS);
		createEReference(roomEClass, ROOM__NPC);
		createEAttribute(roomEClass, ROOM__BACKEND_NAME);
		createEOperation(roomEClass, ROOM___EXISTING_ACTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(roomEClass, ROOM___READ_ACTION_IMPLIES_HINT_EXISTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(roomEClass, ROOM___ASK_HINT_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(roomEClass, ROOM___NOT_HIS_OWN_EXIT__DIAGNOSTICCHAIN_MAP);
		createEOperation(roomEClass, ROOM___PROPOSE_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(roomEClass, ROOM___TALK_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(roomEClass, ROOM___EXISTING_AN_EXIT__DIAGNOSTICCHAIN_MAP);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEAttribute(entityEClass, ENTITY__DISCOVERED);

		hintEClass = createEClass(HINT);
		createEAttribute(hintEClass, HINT__LABEL);
		createEReference(hintEClass, HINT__CURRENT_ROOM);
		createEReference(hintEClass, HINT__NPC);

		mainCharacterEClass = createEClass(MAIN_CHARACTER);
		createEAttribute(mainCharacterEClass, MAIN_CHARACTER__NB_DISCOVERED_ENIGMAS);
		createEReference(mainCharacterEClass, MAIN_CHARACTER__GAME);
		createEReference(mainCharacterEClass, MAIN_CHARACTER__CURRENT_ROOM);
		createEOperation(mainCharacterEClass, MAIN_CHARACTER___NB_DISCOVERED_NPC_BORNED__DIAGNOSTICCHAIN_MAP);

		npcEClass = createEClass(NPC);
		createEAttribute(npcEClass, NPC__HELLO_SENTENCE);
		createEAttribute(npcEClass, NPC__DISCOVERED_ENIGMA);
		createEAttribute(npcEClass, NPC__VALID_PROPOSITION_SENTENCE);
		createEAttribute(npcEClass, NPC__INVALID_PROPOSITION_SENTENCE);
		createEReference(npcEClass, NPC__HINT);
		createEReference(npcEClass, NPC__CURRENT_ROOM);
		createEAttribute(npcEClass, NPC__DISCOVERED_ENIGMA_SENTENCE);
		createEAttribute(npcEClass, NPC__DISCOVERED_SENTENCE_HINT);
		createEAttribute(npcEClass, NPC__ENIGMA_SENTENCE);
		createEAttribute(npcEClass, NPC__HINT_SENTENCE);
		createEAttribute(npcEClass, NPC__ENIGMA_SOLUTION);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__LABEL);
		createEAttribute(actionEClass, ACTION__NAME);
		createEAttribute(actionEClass, ACTION__INFORMATIONS);
		createEOperation(actionEClass, ACTION___LABEL_ACTION__DIAGNOSTICCHAIN_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hintEClass.getESuperTypes().add(this.getEntity());
		mainCharacterEClass.getESuperTypes().add(this.getEntity());
		npcEClass.getESuperTypes().add(this.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_Player(), this.getMainCharacter(), this.getMainCharacter_Game(), "player", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Rooms(), this.getRoom(), this.getRoom_Game(), "rooms", null, 1, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Title(), ecorePackage.getEString(), "title", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Subtitle(), ecorePackage.getEString(), "subtitle", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Prologue(), ecorePackage.getEString(), "prologue", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Epilogue(), ecorePackage.getEString(), "epilogue", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_NbEnigmas(), ecorePackage.getEInt(), "nbEnigmas", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Aim(), ecorePackage.getEString(), "aim", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_HowToPlay(), ecorePackage.getEString(), "howToPlay", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Map(), ecorePackage.getEString(), "map", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Actions(), this.getAction(), null, "actions", null, 1, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGame__NbNpcPositiveOrNull__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nbNpcPositiveOrNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_North(), this.getRoom(), this.getRoom_South(), "north", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_East(), this.getRoom(), this.getRoom_West(), "east", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_West(), this.getRoom(), this.getRoom_East(), "west", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_South(), this.getRoom(), this.getRoom_North(), "south", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Hint(), this.getHint(), this.getHint_CurrentRoom(), "hint", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Game(), this.getGame(), this.getGame_Rooms(), "game", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Actions(), this.getAction(), null, "actions", null, 1, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Npc(), this.getNpc(), this.getNpc_CurrentRoom(), "npc", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_BackendName(), ecorePackage.getEString(), "backendName", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRoom__ExistingAction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "existingAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRoom__ReadActionImpliesHintExists__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "readActionImpliesHintExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRoom__AskHintActionImpliesNpcExists__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "askHintActionImpliesNpcExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRoom__NotHisOwnExit__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notHisOwnExit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRoom__ProposeActionImpliesNpcExists__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "proposeActionImpliesNpcExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRoom__TalkActionImpliesNpcExists__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "talkActionImpliesNpcExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRoom__ExistingAnExit__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "existingAnExit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Discovered(), ecorePackage.getEBoolean(), "discovered", "true", 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hintEClass, Hint.class, "Hint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHint_Label(), ecorePackage.getEString(), "label", null, 1, 1, Hint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHint_CurrentRoom(), this.getRoom(), this.getRoom_Hint(), "currentRoom", null, 1, 1, Hint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHint_Npc(), this.getNpc(), this.getNpc_Hint(), "npc", null, 1, 1, Hint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainCharacterEClass, MainCharacter.class, "MainCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainCharacter_NbDiscoveredEnigmas(), ecorePackage.getEInt(), "nbDiscoveredEnigmas", null, 1, 1, MainCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainCharacter_Game(), this.getGame(), this.getGame_Player(), "game", null, 1, 1, MainCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainCharacter_CurrentRoom(), this.getRoom(), null, "currentRoom", null, 1, 1, MainCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMainCharacter__NbDiscoveredNpcBorned__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nbDiscoveredNpcBorned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(npcEClass, Npc.class, "Npc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNpc_HelloSentence(), ecorePackage.getEString(), "helloSentence", null, 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNpc_DiscoveredEnigma(), ecorePackage.getEBoolean(), "discoveredEnigma", "false", 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNpc_ValidPropositionSentence(), ecorePackage.getEString(), "validPropositionSentence", null, 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNpc_InvalidPropositionSentence(), ecorePackage.getEString(), "invalidPropositionSentence", null, 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNpc_Hint(), this.getHint(), this.getHint_Npc(), "hint", null, 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNpc_CurrentRoom(), this.getRoom(), this.getRoom_Npc(), "currentRoom", null, 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNpc_DiscoveredEnigmaSentence(), ecorePackage.getEString(), "discoveredEnigmaSentence", null, 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNpc_DiscoveredSentenceHint(), ecorePackage.getEString(), "discoveredSentenceHint", null, 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNpc_EnigmaSentence(), ecorePackage.getEString(), "enigmaSentence", null, 0, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNpc_HintSentence(), ecorePackage.getEString(), "hintSentence", null, 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNpc_EnigmaSolution(), ecorePackage.getEString(), "enigmaSolution", null, 1, 1, Npc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Label(), ecorePackage.getEString(), "label", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", "static Label", 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Informations(), ecorePackage.getEString(), "Informations", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAction__LabelAction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "labelAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (gameEClass,
		   source,
		   new String[] {
			   "constraints", "nbNpcPositiveOrNull"
		   });
		addAnnotation
		  (roomEClass,
		   source,
		   new String[] {
			   "constraints", "existingAnExit"
		   });
		addAnnotation
		  (mainCharacterEClass,
		   source,
		   new String[] {
			   "constraints", "nbDiscoveredNpcBorned"
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[] {
			   "constraints", "labelAction"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getGame__NbNpcPositiveOrNull__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.nbEnigmas >= 0"
		   });
		addAnnotation
		  (getRoom__ExistingAction__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.actions->size() > 0"
		   });
		addAnnotation
		  (getRoom__ReadActionImpliesHintExists__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.actions->exists(action | action.label = \'READ\') implies not self.hint.oclIsUndefined()"
		   });
		addAnnotation
		  (getRoom__AskHintActionImpliesNpcExists__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.actions->exists(action | action.label = \'ASK_HINT\') implies not self.npc.oclIsUndefined()"
		   });
		addAnnotation
		  (getRoom__NotHisOwnExit__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.east <> self and self.north <> self and self.south <> self and self.west <> self"
		   });
		addAnnotation
		  (getRoom__ProposeActionImpliesNpcExists__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.actions->exists(action | action.label = \'PROPOSE\') implies not self.npc.oclIsUndefined()"
		   });
		addAnnotation
		  (getRoom__TalkActionImpliesNpcExists__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.actions->exists(action | action.label = \'TALK\') implies not self.npc.oclIsUndefined()"
		   });
		addAnnotation
		  (getRoom__ExistingAnExit__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "not self.east.oclIsUndefined() or not self.north.oclIsUndefined() or not self.south.oclIsUndefined() or not self.west.oclIsUndefined()"
		   });
		addAnnotation
		  (getMainCharacter__NbDiscoveredNpcBorned__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.nbDiscoveredEnigmas>= 0 and self.nbDiscoveredEnigmas <= self.game.nbEnigmas"
		   });
		addAnnotation
		  (getAction__LabelAction__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.label = \'MOVE\' or self.label = \'TALK\' or self.label = \'ASK_HINT\' or self.label = \'READ\' or self.label = \'PROPOSE\'"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getGame_Rooms(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getRoom_Actions(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //Labyrinth_tales_of_gamersPackageImpl
