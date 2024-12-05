/**
 */
package labyrinth_tales_of_gamers.impl;

import labyrinth_tales_of_gamers.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Labyrinth_tales_of_gamersFactoryImpl extends EFactoryImpl implements Labyrinth_tales_of_gamersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Labyrinth_tales_of_gamersFactory init() {
		try {
			Labyrinth_tales_of_gamersFactory theLabyrinth_tales_of_gamersFactory = (Labyrinth_tales_of_gamersFactory)EPackage.Registry.INSTANCE.getEFactory(Labyrinth_tales_of_gamersPackage.eNS_URI);
			if (theLabyrinth_tales_of_gamersFactory != null) {
				return theLabyrinth_tales_of_gamersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Labyrinth_tales_of_gamersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Labyrinth_tales_of_gamersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Labyrinth_tales_of_gamersPackage.GAME: return createGame();
			case Labyrinth_tales_of_gamersPackage.ROOM: return createRoom();
			case Labyrinth_tales_of_gamersPackage.HINT: return createHint();
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER: return createMainCharacter();
			case Labyrinth_tales_of_gamersPackage.NPC: return createNpc();
			case Labyrinth_tales_of_gamersPackage.ACTION: return createAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hint createHint() {
		HintImpl hint = new HintImpl();
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainCharacter createMainCharacter() {
		MainCharacterImpl mainCharacter = new MainCharacterImpl();
		return mainCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Npc createNpc() {
		NpcImpl npc = new NpcImpl();
		return npc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Labyrinth_tales_of_gamersPackage getLabyrinth_tales_of_gamersPackage() {
		return (Labyrinth_tales_of_gamersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Labyrinth_tales_of_gamersPackage getPackage() {
		return Labyrinth_tales_of_gamersPackage.eINSTANCE;
	}

} //Labyrinth_tales_of_gamersFactoryImpl
