/**
 */
package labyrinth_tales_of_gamers.impl;

import labyrinth_tales_of_gamers.Hint;
import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage;
import labyrinth_tales_of_gamers.Npc;
import labyrinth_tales_of_gamers.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Npc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getHelloSentence <em>Hello Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#isDiscovered <em>Discovered</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getValidPropositionSentence <em>Valid Proposition Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getInvalidPropositionSentence <em>Invalid Proposition Sentence</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getCurrentRoom <em>Current Room</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getDiscoveredSentenceNpc <em>Discovered Sentence Npc</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.NpcImpl#getDiscoveredSentenceHint <em>Discovered Sentence Hint</em>}</li>
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
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected Hint hint;

	/**
	 * The default value of the '{@link #getDiscoveredSentenceNpc() <em>Discovered Sentence Npc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveredSentenceNpc()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVERED_SENTENCE_NPC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoveredSentenceNpc() <em>Discovered Sentence Npc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveredSentenceNpc()
	 * @generated
	 * @ordered
	 */
	protected String discoveredSentenceNpc = DISCOVERED_SENTENCE_NPC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscoveredSentenceHint() <em>Discovered Sentence Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveredSentenceHint()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVERED_SENTENCE_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoveredSentenceHint() <em>Discovered Sentence Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveredSentenceHint()
	 * @generated
	 * @ordered
	 */
	protected String discoveredSentenceHint = DISCOVERED_SENTENCE_HINT_EDEFAULT;

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
	public Hint getHint() {
		if (hint != null && hint.eIsProxy()) {
			InternalEObject oldHint = (InternalEObject)hint;
			hint = (Hint)eResolveProxy(oldHint);
			if (hint != oldHint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Labyrinth_tales_of_gamersPackage.NPC__HINT, oldHint, hint));
			}
		}
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hint basicGetHint() {
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHint(Hint newHint, NotificationChain msgs) {
		Hint oldHint = hint;
		hint = newHint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__HINT, oldHint, newHint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHint(Hint newHint) {
		if (newHint != hint) {
			NotificationChain msgs = null;
			if (hint != null)
				msgs = ((InternalEObject)hint).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.HINT__NPC, Hint.class, msgs);
			if (newHint != null)
				msgs = ((InternalEObject)newHint).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.HINT__NPC, Hint.class, msgs);
			msgs = basicSetHint(newHint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__HINT, newHint, newHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getCurrentRoom() {
		if (eContainerFeatureID() != Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM) return null;
		return (Room)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentRoom(Room newCurrentRoom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCurrentRoom, Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRoom(Room newCurrentRoom) {
		if (newCurrentRoom != eInternalContainer() || (eContainerFeatureID() != Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM && newCurrentRoom != null)) {
			if (EcoreUtil.isAncestor(this, newCurrentRoom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCurrentRoom != null)
				msgs = ((InternalEObject)newCurrentRoom).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.ROOM__NPC, Room.class, msgs);
			msgs = basicSetCurrentRoom(newCurrentRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM, newCurrentRoom, newCurrentRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscoveredSentenceNpc() {
		return discoveredSentenceNpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscoveredSentenceNpc(String newDiscoveredSentenceNpc) {
		String oldDiscoveredSentenceNpc = discoveredSentenceNpc;
		discoveredSentenceNpc = newDiscoveredSentenceNpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_NPC, oldDiscoveredSentenceNpc, discoveredSentenceNpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscoveredSentenceHint() {
		return discoveredSentenceHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscoveredSentenceHint(String newDiscoveredSentenceHint) {
		String oldDiscoveredSentenceHint = discoveredSentenceHint;
		discoveredSentenceHint = newDiscoveredSentenceHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_HINT, oldDiscoveredSentenceHint, discoveredSentenceHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.NPC__HINT:
				if (hint != null)
					msgs = ((InternalEObject)hint).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.HINT__NPC, Hint.class, msgs);
				return basicSetHint((Hint)otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCurrentRoom((Room)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.NPC__HINT:
				return basicSetHint(null, msgs);
			case Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM:
				return basicSetCurrentRoom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM:
				return eInternalContainer().eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__NPC, Room.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED:
				return isDiscovered();
			case Labyrinth_tales_of_gamersPackage.NPC__VALID_PROPOSITION_SENTENCE:
				return getValidPropositionSentence();
			case Labyrinth_tales_of_gamersPackage.NPC__INVALID_PROPOSITION_SENTENCE:
				return getInvalidPropositionSentence();
			case Labyrinth_tales_of_gamersPackage.NPC__HINT:
				if (resolve) return getHint();
				return basicGetHint();
			case Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM:
				return getCurrentRoom();
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_NPC:
				return getDiscoveredSentenceNpc();
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_HINT:
				return getDiscoveredSentenceHint();
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
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED:
				setDiscovered((Boolean)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__VALID_PROPOSITION_SENTENCE:
				setValidPropositionSentence((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__INVALID_PROPOSITION_SENTENCE:
				setInvalidPropositionSentence((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__HINT:
				setHint((Hint)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM:
				setCurrentRoom((Room)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_NPC:
				setDiscoveredSentenceNpc((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_HINT:
				setDiscoveredSentenceHint((String)newValue);
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
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED:
				setDiscovered(DISCOVERED_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__VALID_PROPOSITION_SENTENCE:
				setValidPropositionSentence(VALID_PROPOSITION_SENTENCE_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__INVALID_PROPOSITION_SENTENCE:
				setInvalidPropositionSentence(INVALID_PROPOSITION_SENTENCE_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__HINT:
				setHint((Hint)null);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM:
				setCurrentRoom((Room)null);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_NPC:
				setDiscoveredSentenceNpc(DISCOVERED_SENTENCE_NPC_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_HINT:
				setDiscoveredSentenceHint(DISCOVERED_SENTENCE_HINT_EDEFAULT);
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
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED:
				return discovered != DISCOVERED_EDEFAULT;
			case Labyrinth_tales_of_gamersPackage.NPC__VALID_PROPOSITION_SENTENCE:
				return VALID_PROPOSITION_SENTENCE_EDEFAULT == null ? validPropositionSentence != null : !VALID_PROPOSITION_SENTENCE_EDEFAULT.equals(validPropositionSentence);
			case Labyrinth_tales_of_gamersPackage.NPC__INVALID_PROPOSITION_SENTENCE:
				return INVALID_PROPOSITION_SENTENCE_EDEFAULT == null ? invalidPropositionSentence != null : !INVALID_PROPOSITION_SENTENCE_EDEFAULT.equals(invalidPropositionSentence);
			case Labyrinth_tales_of_gamersPackage.NPC__HINT:
				return hint != null;
			case Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM:
				return getCurrentRoom() != null;
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_NPC:
				return DISCOVERED_SENTENCE_NPC_EDEFAULT == null ? discoveredSentenceNpc != null : !DISCOVERED_SENTENCE_NPC_EDEFAULT.equals(discoveredSentenceNpc);
			case Labyrinth_tales_of_gamersPackage.NPC__DISCOVERED_SENTENCE_HINT:
				return DISCOVERED_SENTENCE_HINT_EDEFAULT == null ? discoveredSentenceHint != null : !DISCOVERED_SENTENCE_HINT_EDEFAULT.equals(discoveredSentenceHint);
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
		result.append(", discoveredSentenceNpc: ");
		result.append(discoveredSentenceNpc);
		result.append(", discoveredSentenceHint: ");
		result.append(discoveredSentenceHint);
		result.append(')');
		return result.toString();
	}

} //NpcImpl
