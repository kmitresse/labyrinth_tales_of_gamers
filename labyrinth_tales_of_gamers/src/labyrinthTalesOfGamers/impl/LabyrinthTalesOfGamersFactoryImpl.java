/**
 */
package labyrinthTalesOfGamers.impl;

import labyrinthTalesOfGamers.*;

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
public class LabyrinthTalesOfGamersFactoryImpl extends EFactoryImpl implements LabyrinthTalesOfGamersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabyrinthTalesOfGamersFactory init() {
		try {
			LabyrinthTalesOfGamersFactory theLabyrinthTalesOfGamersFactory = (LabyrinthTalesOfGamersFactory)EPackage.Registry.INSTANCE.getEFactory(LabyrinthTalesOfGamersPackage.eNS_URI);
			if (theLabyrinthTalesOfGamersFactory != null) {
				return theLabyrinthTalesOfGamersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LabyrinthTalesOfGamersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabyrinthTalesOfGamersFactoryImpl() {
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
			case LabyrinthTalesOfGamersPackage.GAME: return createGame();
			case LabyrinthTalesOfGamersPackage.ROOM: return createRoom();
			case LabyrinthTalesOfGamersPackage.MAIN_CHARACTER: return createMainCharacter();
			case LabyrinthTalesOfGamersPackage.NPC: return createNpc();
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
	public LabyrinthTalesOfGamersPackage getLabyrinthTalesOfGamersPackage() {
		return (LabyrinthTalesOfGamersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LabyrinthTalesOfGamersPackage getPackage() {
		return LabyrinthTalesOfGamersPackage.eINSTANCE;
	}

} //LabyrinthTalesOfGamersFactoryImpl
