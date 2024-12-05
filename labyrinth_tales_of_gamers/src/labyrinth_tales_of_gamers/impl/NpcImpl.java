/**
 */
package labyrinth_tales_of_gamers.impl;

import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage;
import labyrinth_tales_of_gamers.Npc;
import labyrinth_tales_of_gamers.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Npc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getHelloSentence <em>Hello Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getHintPosition <em>Hint Position</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#isDiscovered <em>Discovered</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getValidPropositionSentence <em>Valid Proposition Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getInvalidPropositionSentence <em>Invalid Proposition Sentence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NpcImpl extends EntityImpl implements Npc {
	/**
	 * The default value of the '{@link #getHelloSentence() <em>Hello Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelloSentence()
	 * @generated
	 * @ordered
	 */
	protected static final String HELLO_SENTENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelloSentence() <em>Hello Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelloSentence()
	 * @generated
	 * @ordered
	 */
	protected String helloSentence = HELLO_SENTENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHintPosition() <em>Hint Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHintPosition()
	 * @generated
	 * @ordered
	 */
	protected Room hintPosition;

	/**
	 * The default value of the '{@link #isDiscovered() <em>Discovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscovered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCOVERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDiscovered() <em>Discovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscovered()
	 * @generated
	 * @ordered
	 */
	protected boolean discovered = DISCOVERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidPropositionSentence() <em>Valid Proposition Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidPropositionSentence()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_PROPOSITION_SENTENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidPropositionSentence() <em>Valid Proposition Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidPropositionSentence()
	 * @generated
	 * @ordered
	 */
	protected String validPropositionSentence = VALID_PROPOSITION_SENTENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvalidPropositionSentence() <em>Invalid Proposition Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidPropositionSentence()
	 * @generated
	 * @ordered
	 */
	protected static final String INVALID_PROPOSITION_SENTENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvalidPropositionSentence() <em>Invalid Proposition Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidPropositionSentence()
	 * @generated
	 * @ordered
	 */
	protected String invalidPropositionSentence = INVALID_PROPOSITION_SENTENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NpcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Labyrinth_tales_of_gamersPackage.Literals.NPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHelloSentence() {
		return helloSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelloSentence(String newHelloSentence) {
		String oldHelloSentence = helloSentence;
		helloSentence = newHelloSentence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__HELLO_SENTENCE, oldHelloSentence, helloSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getHintPosition() {
		if (hintPosition != null && hintPosition.eIsProxy()) {
			InternalEObject oldHintPosition = (InternalEObject)hintPosition;
			hintPosition = (Room)eResolveProxy(oldHintPosition);
			if (hintPosition != oldHintPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Labyrinth_tales_of_gamersPackage.NPC__HINT_POSITION, oldHintPosition, hintPosition));
			}
		}
		return hintPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetHintPosition() {
		return hintPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHintPosition(Room newHintPosition) {
		Room oldHintPosition = hintPosition;
		hintPosition = newHintPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__HINT_POSITION, oldHintPosition, hintPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDiscovered() {
		return discovered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscovered(boolean newDiscovered) {
		boolean oldDiscovered = discovered;
		discovered = newDiscovered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED, oldDiscovered, discovered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidPropositionSentence() {
		return validPropositionSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidPropositionSentence(String newValidPropositionSentence) {
		String oldValidPropositionSentence = validPropositionSentence;
		validPropositionSentence = newValidPropositionSentence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__VALID_PROPOSITION_SENTENCE, oldValidPropositionSentence, validPropositionSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvalidPropositionSentence() {
		return invalidPropositionSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvalidPropositionSentence(String newInvalidPropositionSentence) {
		String oldInvalidPropositionSentence = invalidPropositionSentence;
		invalidPropositionSentence = newInvalidPropositionSentence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__INVALID_PROPOSITION_SENTENCE, oldInvalidPropositionSentence, invalidPropositionSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.NPC__HELLO_SENTENCE:
				return getHelloSentence();
			case Labyrinth_tales_of_gamersPackage.NPC__HINT_POSITION:
				if (resolve) return getHintPosition();
				return basicGetHintPosition();
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED:
				return isDiscovered();
			case Labyrinth_tales_of_gamersPackage.NPC__VALID_PROPOSITION_SENTENCE:
				return getValidPropositionSentence();
			case Labyrinth_tales_of_gamersPackage.NPC__INVALID_PROPOSITION_SENTENCE:
				return getInvalidPropositionSentence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.NPC__HELLO_SENTENCE:
				setHelloSentence((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__HINT_POSITION:
				setHintPosition((Room)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED:
				setDiscovered((Boolean)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__VALID_PROPOSITION_SENTENCE:
				setValidPropositionSentence((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__INVALID_PROPOSITION_SENTENCE:
				setInvalidPropositionSentence((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.NPC__HELLO_SENTENCE:
				setHelloSentence(HELLO_SENTENCE_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__HINT_POSITION:
				setHintPosition((Room)null);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED:
				setDiscovered(DISCOVERED_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__VALID_PROPOSITION_SENTENCE:
				setValidPropositionSentence(VALID_PROPOSITION_SENTENCE_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__INVALID_PROPOSITION_SENTENCE:
				setInvalidPropositionSentence(INVALID_PROPOSITION_SENTENCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.NPC__HELLO_SENTENCE:
				return HELLO_SENTENCE_EDEFAULT == null ? helloSentence != null : !HELLO_SENTENCE_EDEFAULT.equals(helloSentence);
			case Labyrinth_tales_of_gamersPackage.NPC__HINT_POSITION:
				return hintPosition != null;
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED:
				return discovered != DISCOVERED_EDEFAULT;
			case Labyrinth_tales_of_gamersPackage.NPC__VALID_PROPOSITION_SENTENCE:
				return VALID_PROPOSITION_SENTENCE_EDEFAULT == null ? validPropositionSentence != null : !VALID_PROPOSITION_SENTENCE_EDEFAULT.equals(validPropositionSentence);
			case Labyrinth_tales_of_gamersPackage.NPC__INVALID_PROPOSITION_SENTENCE:
				return INVALID_PROPOSITION_SENTENCE_EDEFAULT == null ? invalidPropositionSentence != null : !INVALID_PROPOSITION_SENTENCE_EDEFAULT.equals(invalidPropositionSentence);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (helloSentence: ");
		result.append(helloSentence);
		result.append(", discovered: ");
		result.append(discovered);
		result.append(", validPropositionSentence: ");
		result.append(validPropositionSentence);
		result.append(", invalidPropositionSentence: ");
		result.append(invalidPropositionSentence);
		result.append(')');
		return result.toString();
	}

} //NpcImpl
