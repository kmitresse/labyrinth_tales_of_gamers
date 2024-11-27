/**
 */
package labyrinthTalesOfGamers.impl;

import labyrinthTalesOfGamers.Entity;
import labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage;
import labyrinthTalesOfGamers.Room;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labyrinthTalesOfGamers.impl.EntityImpl#getCurrentRoom <em>Current Room</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.impl.EntityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The cached value of the '{@link #getCurrentRoom() <em>Current Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRoom()
	 * @generated
	 * @ordered
	 */
	protected Room currentRoom;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabyrinthTalesOfGamersPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getCurrentRoom() {
		if (currentRoom != null && currentRoom.eIsProxy()) {
			InternalEObject oldCurrentRoom = (InternalEObject)currentRoom;
			currentRoom = (Room)eResolveProxy(oldCurrentRoom);
			if (currentRoom != oldCurrentRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM, oldCurrentRoom, currentRoom));
			}
		}
		return currentRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetCurrentRoom() {
		return currentRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentRoom(Room newCurrentRoom, NotificationChain msgs) {
		Room oldCurrentRoom = currentRoom;
		currentRoom = newCurrentRoom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM, oldCurrentRoom, newCurrentRoom);
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
	public void setCurrentRoom(Room newCurrentRoom) {
		if (newCurrentRoom != currentRoom) {
			NotificationChain msgs = null;
			if (currentRoom != null)
				msgs = ((InternalEObject)currentRoom).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__ENTITIES, Room.class, msgs);
			if (newCurrentRoom != null)
				msgs = ((InternalEObject)newCurrentRoom).eInverseAdd(this, LabyrinthTalesOfGamersPackage.ROOM__ENTITIES, Room.class, msgs);
			msgs = basicSetCurrentRoom(newCurrentRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM, newCurrentRoom, newCurrentRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM:
				if (currentRoom != null)
					msgs = ((InternalEObject)currentRoom).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__ENTITIES, Room.class, msgs);
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
			case LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM:
				if (resolve) return getCurrentRoom();
				return basicGetCurrentRoom();
			case LabyrinthTalesOfGamersPackage.ENTITY__NAME:
				return getName();
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
			case LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM:
				setCurrentRoom((Room)newValue);
				return;
			case LabyrinthTalesOfGamersPackage.ENTITY__NAME:
				setName((String)newValue);
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
			case LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM:
				setCurrentRoom((Room)null);
				return;
			case LabyrinthTalesOfGamersPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
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
			case LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM:
				return currentRoom != null;
			case LabyrinthTalesOfGamersPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
