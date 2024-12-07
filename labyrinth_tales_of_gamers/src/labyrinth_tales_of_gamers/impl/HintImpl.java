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
 * An implementation of the model object '<em><b>Hint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.impl.HintImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.HintImpl#getCurrentRoom <em>Current Room</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.HintImpl#getNpc <em>Npc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HintImpl extends EntityImpl implements Hint {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNpc() <em>Npc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpc()
	 * @generated
	 * @ordered
	 */
	protected Npc npc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Labyrinth_tales_of_gamersPackage.Literals.HINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.HINT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getCurrentRoom() {
		if (eContainerFeatureID() != Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM) return null;
		return (Room)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentRoom(Room newCurrentRoom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCurrentRoom, Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRoom(Room newCurrentRoom) {
		if (newCurrentRoom != eInternalContainer() || (eContainerFeatureID() != Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM && newCurrentRoom != null)) {
			if (EcoreUtil.isAncestor(this, newCurrentRoom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCurrentRoom != null)
				msgs = ((InternalEObject)newCurrentRoom).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.ROOM__HINT, Room.class, msgs);
			msgs = basicSetCurrentRoom(newCurrentRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM, newCurrentRoom, newCurrentRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Npc getNpc() {
		if (npc != null && npc.eIsProxy()) {
			InternalEObject oldNpc = (InternalEObject)npc;
			npc = (Npc)eResolveProxy(oldNpc);
			if (npc != oldNpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Labyrinth_tales_of_gamersPackage.HINT__NPC, oldNpc, npc));
			}
		}
		return npc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Npc basicGetNpc() {
		return npc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNpc(Npc newNpc, NotificationChain msgs) {
		Npc oldNpc = npc;
		npc = newNpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.HINT__NPC, oldNpc, newNpc);
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
	public void setNpc(Npc newNpc) {
		if (newNpc != npc) {
			NotificationChain msgs = null;
			if (npc != null)
				msgs = ((InternalEObject)npc).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.NPC__HINT, Npc.class, msgs);
			if (newNpc != null)
				msgs = ((InternalEObject)newNpc).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.NPC__HINT, Npc.class, msgs);
			msgs = basicSetNpc(newNpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.HINT__NPC, newNpc, newNpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCurrentRoom((Room)otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.HINT__NPC:
				if (npc != null)
					msgs = ((InternalEObject)npc).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.NPC__HINT, Npc.class, msgs);
				return basicSetNpc((Npc)otherEnd, msgs);
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
			case Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM:
				return basicSetCurrentRoom(null, msgs);
			case Labyrinth_tales_of_gamersPackage.HINT__NPC:
				return basicSetNpc(null, msgs);
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
			case Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM:
				return eInternalContainer().eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__HINT, Room.class, msgs);
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
			case Labyrinth_tales_of_gamersPackage.HINT__LABEL:
				return getLabel();
			case Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM:
				return getCurrentRoom();
			case Labyrinth_tales_of_gamersPackage.HINT__NPC:
				if (resolve) return getNpc();
				return basicGetNpc();
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
			case Labyrinth_tales_of_gamersPackage.HINT__LABEL:
				setLabel((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM:
				setCurrentRoom((Room)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.HINT__NPC:
				setNpc((Npc)newValue);
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
			case Labyrinth_tales_of_gamersPackage.HINT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM:
				setCurrentRoom((Room)null);
				return;
			case Labyrinth_tales_of_gamersPackage.HINT__NPC:
				setNpc((Npc)null);
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
			case Labyrinth_tales_of_gamersPackage.HINT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM:
				return getCurrentRoom() != null;
			case Labyrinth_tales_of_gamersPackage.HINT__NPC:
				return npc != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //HintImpl
