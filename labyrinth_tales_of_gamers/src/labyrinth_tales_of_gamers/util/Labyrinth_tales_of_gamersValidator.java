/**
 */
package labyrinth_tales_of_gamers.util;

import java.util.Map;

import labyrinth_tales_of_gamers.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage
 * @generated
 */
public class Labyrinth_tales_of_gamersValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Labyrinth_tales_of_gamersValidator INSTANCE = new Labyrinth_tales_of_gamersValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "labyrinth_tales_of_gamers";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nb Npc Positive Or Null' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__NB_NPC_POSITIVE_OR_NULL = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Existing Action' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__EXISTING_ACTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Npc Action Implies Npc Exists' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__NPC_ACTION_IMPLIES_NPC_EXISTS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hint Action Implies Hint Exists' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__HINT_ACTION_IMPLIES_HINT_EXISTS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Propose Action Implies Npc Exists' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__PROPOSE_ACTION_IMPLIES_NPC_EXISTS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not His Own Exit' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__NOT_HIS_OWN_EXIT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Existing An Exit' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__EXISTING_AN_EXIT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nb Discovered Npc Borned' of 'Main Character'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAIN_CHARACTER__NB_DISCOVERED_NPC_BORNED = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Label Action' of 'Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTION__LABEL_ACTION = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Labyrinth_tales_of_gamersValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Labyrinth_tales_of_gamersPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Labyrinth_tales_of_gamersPackage.GAME:
				return validateGame((Game)value, diagnostics, context);
			case Labyrinth_tales_of_gamersPackage.ROOM:
				return validateRoom((Room)value, diagnostics, context);
			case Labyrinth_tales_of_gamersPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case Labyrinth_tales_of_gamersPackage.HINT:
				return validateHint((Hint)value, diagnostics, context);
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER:
				return validateMainCharacter((MainCharacter)value, diagnostics, context);
			case Labyrinth_tales_of_gamersPackage.NPC:
				return validateNpc((Npc)value, diagnostics, context);
			case Labyrinth_tales_of_gamersPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(game, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_nbNpcPositiveOrNull(game, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nbNpcPositiveOrNull constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_nbNpcPositiveOrNull(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.nbNpcPositiveOrNull(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(room, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_proposeActionImpliesNpcExists(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_notHisOwnExit(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_existingAnExit(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_existingAction(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_npcActionImpliesNpcExists(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_hintActionImpliesHintExists(room, diagnostics, context);
		return result;
	}

	/**
	 * Validates the proposeActionImpliesNpcExists constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_proposeActionImpliesNpcExists(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.proposeActionImpliesNpcExists(diagnostics, context);
	}

	/**
	 * Validates the existingAnExit constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_existingAnExit(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.existingAnExit(diagnostics, context);
	}

	/**
	 * Validates the existingAction constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_existingAction(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.existingAction(diagnostics, context);
	}

	/**
	 * Validates the npcActionImpliesNpcExists constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_npcActionImpliesNpcExists(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.npcActionImpliesNpcExists(diagnostics, context);
	}

	/**
	 * Validates the hintActionImpliesHintExists constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_hintActionImpliesHintExists(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.hintActionImpliesHintExists(diagnostics, context);
	}

	/**
	 * Validates the notHisOwnExit constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_notHisOwnExit(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.notHisOwnExit(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHint(Hint hint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainCharacter(MainCharacter mainCharacter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mainCharacter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mainCharacter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mainCharacter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mainCharacter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mainCharacter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mainCharacter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mainCharacter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mainCharacter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mainCharacter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMainCharacter_nbDiscoveredNpcBorned(mainCharacter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nbDiscoveredNpcBorned constraint of '<em>Main Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainCharacter_nbDiscoveredNpcBorned(MainCharacter mainCharacter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mainCharacter.nbDiscoveredNpcBorned(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNpc(Npc npc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(npc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_labelAction(action, diagnostics, context);
		return result;
	}

	/**
	 * Validates the labelAction constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_labelAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return action.labelAction(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Labyrinth_tales_of_gamersValidator
