/**
 */
package labyrinthTalesOfGamers.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import labyrinthTalesOfGamers.Entity;
import labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage;
import labyrinthTalesOfGamers.Room;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labyrinthTalesOfGamers.impl.RoomImpl#getNorth <em>North</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.impl.RoomImpl#getEast <em>East</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.impl.RoomImpl#getWest <em>West</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.impl.RoomImpl#getSouth <em>South</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.impl.RoomImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link labyrinthTalesOfGamers.impl.RoomImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The cached value of the '{@link #getNorth() <em>North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected Room north;

	/**
	 * The cached value of the '{@link #getEast() <em>East</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected Room east;

	/**
	 * The cached value of the '{@link #getWest() <em>West</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected Room west;

	/**
	 * The cached value of the '{@link #getSouth() <em>South</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected Room south;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

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
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabyrinthTalesOfGamersPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getNorth() {
		if (north != null && north.eIsProxy()) {
			InternalEObject oldNorth = (InternalEObject)north;
			north = (Room)eResolveProxy(oldNorth);
			if (north != oldNorth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LabyrinthTalesOfGamersPackage.ROOM__NORTH, oldNorth, north));
			}
		}
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetNorth() {
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNorth(Room newNorth, NotificationChain msgs) {
		Room oldNorth = north;
		north = newNorth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ROOM__NORTH, oldNorth, newNorth);
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
	public void setNorth(Room newNorth) {
		if (newNorth != north) {
			NotificationChain msgs = null;
			if (north != null)
				msgs = ((InternalEObject)north).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__SOUTH, Room.class, msgs);
			if (newNorth != null)
				msgs = ((InternalEObject)newNorth).eInverseAdd(this, LabyrinthTalesOfGamersPackage.ROOM__SOUTH, Room.class, msgs);
			msgs = basicSetNorth(newNorth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ROOM__NORTH, newNorth, newNorth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getEast() {
		if (east != null && east.eIsProxy()) {
			InternalEObject oldEast = (InternalEObject)east;
			east = (Room)eResolveProxy(oldEast);
			if (east != oldEast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LabyrinthTalesOfGamersPackage.ROOM__EAST, oldEast, east));
			}
		}
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetEast() {
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEast(Room newEast, NotificationChain msgs) {
		Room oldEast = east;
		east = newEast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ROOM__EAST, oldEast, newEast);
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
	public void setEast(Room newEast) {
		if (newEast != east) {
			NotificationChain msgs = null;
			if (east != null)
				msgs = ((InternalEObject)east).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__WEST, Room.class, msgs);
			if (newEast != null)
				msgs = ((InternalEObject)newEast).eInverseAdd(this, LabyrinthTalesOfGamersPackage.ROOM__WEST, Room.class, msgs);
			msgs = basicSetEast(newEast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ROOM__EAST, newEast, newEast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getWest() {
		if (west != null && west.eIsProxy()) {
			InternalEObject oldWest = (InternalEObject)west;
			west = (Room)eResolveProxy(oldWest);
			if (west != oldWest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LabyrinthTalesOfGamersPackage.ROOM__WEST, oldWest, west));
			}
		}
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetWest() {
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWest(Room newWest, NotificationChain msgs) {
		Room oldWest = west;
		west = newWest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ROOM__WEST, oldWest, newWest);
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
	public void setWest(Room newWest) {
		if (newWest != west) {
			NotificationChain msgs = null;
			if (west != null)
				msgs = ((InternalEObject)west).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__EAST, Room.class, msgs);
			if (newWest != null)
				msgs = ((InternalEObject)newWest).eInverseAdd(this, LabyrinthTalesOfGamersPackage.ROOM__EAST, Room.class, msgs);
			msgs = basicSetWest(newWest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ROOM__WEST, newWest, newWest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getSouth() {
		if (south != null && south.eIsProxy()) {
			InternalEObject oldSouth = (InternalEObject)south;
			south = (Room)eResolveProxy(oldSouth);
			if (south != oldSouth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LabyrinthTalesOfGamersPackage.ROOM__SOUTH, oldSouth, south));
			}
		}
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetSouth() {
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSouth(Room newSouth, NotificationChain msgs) {
		Room oldSouth = south;
		south = newSouth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ROOM__SOUTH, oldSouth, newSouth);
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
	public void setSouth(Room newSouth) {
		if (newSouth != south) {
			NotificationChain msgs = null;
			if (south != null)
				msgs = ((InternalEObject)south).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__NORTH, Room.class, msgs);
			if (newSouth != null)
				msgs = ((InternalEObject)newSouth).eInverseAdd(this, LabyrinthTalesOfGamersPackage.ROOM__NORTH, Room.class, msgs);
			msgs = basicSetSouth(newSouth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ROOM__SOUTH, newSouth, newSouth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectWithInverseResolvingEList<Entity>(Entity.class, this, LabyrinthTalesOfGamersPackage.ROOM__ENTITIES, LabyrinthTalesOfGamersPackage.ENTITY__CURRENT_ROOM);
		}
		return entities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LabyrinthTalesOfGamersPackage.ROOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void introduce() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LabyrinthTalesOfGamersPackage.ROOM__NORTH:
				if (north != null)
					msgs = ((InternalEObject)north).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__SOUTH, Room.class, msgs);
				return basicSetNorth((Room)otherEnd, msgs);
			case LabyrinthTalesOfGamersPackage.ROOM__EAST:
				if (east != null)
					msgs = ((InternalEObject)east).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__WEST, Room.class, msgs);
				return basicSetEast((Room)otherEnd, msgs);
			case LabyrinthTalesOfGamersPackage.ROOM__WEST:
				if (west != null)
					msgs = ((InternalEObject)west).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__EAST, Room.class, msgs);
				return basicSetWest((Room)otherEnd, msgs);
			case LabyrinthTalesOfGamersPackage.ROOM__SOUTH:
				if (south != null)
					msgs = ((InternalEObject)south).eInverseRemove(this, LabyrinthTalesOfGamersPackage.ROOM__NORTH, Room.class, msgs);
				return basicSetSouth((Room)otherEnd, msgs);
			case LabyrinthTalesOfGamersPackage.ROOM__ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntities()).basicAdd(otherEnd, msgs);
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
			case LabyrinthTalesOfGamersPackage.ROOM__NORTH:
				return basicSetNorth(null, msgs);
			case LabyrinthTalesOfGamersPackage.ROOM__EAST:
				return basicSetEast(null, msgs);
			case LabyrinthTalesOfGamersPackage.ROOM__WEST:
				return basicSetWest(null, msgs);
			case LabyrinthTalesOfGamersPackage.ROOM__SOUTH:
				return basicSetSouth(null, msgs);
			case LabyrinthTalesOfGamersPackage.ROOM__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
			case LabyrinthTalesOfGamersPackage.ROOM__NORTH:
				if (resolve) return getNorth();
				return basicGetNorth();
			case LabyrinthTalesOfGamersPackage.ROOM__EAST:
				if (resolve) return getEast();
				return basicGetEast();
			case LabyrinthTalesOfGamersPackage.ROOM__WEST:
				if (resolve) return getWest();
				return basicGetWest();
			case LabyrinthTalesOfGamersPackage.ROOM__SOUTH:
				if (resolve) return getSouth();
				return basicGetSouth();
			case LabyrinthTalesOfGamersPackage.ROOM__ENTITIES:
				return getEntities();
			case LabyrinthTalesOfGamersPackage.ROOM__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LabyrinthTalesOfGamersPackage.ROOM__NORTH:
				setNorth((Room)newValue);
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__EAST:
				setEast((Room)newValue);
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__WEST:
				setWest((Room)newValue);
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__SOUTH:
				setSouth((Room)newValue);
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__NAME:
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
			case LabyrinthTalesOfGamersPackage.ROOM__NORTH:
				setNorth((Room)null);
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__EAST:
				setEast((Room)null);
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__WEST:
				setWest((Room)null);
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__SOUTH:
				setSouth((Room)null);
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__ENTITIES:
				getEntities().clear();
				return;
			case LabyrinthTalesOfGamersPackage.ROOM__NAME:
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
			case LabyrinthTalesOfGamersPackage.ROOM__NORTH:
				return north != null;
			case LabyrinthTalesOfGamersPackage.ROOM__EAST:
				return east != null;
			case LabyrinthTalesOfGamersPackage.ROOM__WEST:
				return west != null;
			case LabyrinthTalesOfGamersPackage.ROOM__SOUTH:
				return south != null;
			case LabyrinthTalesOfGamersPackage.ROOM__ENTITIES:
				return entities != null && !entities.isEmpty();
			case LabyrinthTalesOfGamersPackage.ROOM__NAME:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LabyrinthTalesOfGamersPackage.ROOM___INTRODUCE:
				introduce();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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

} //RoomImpl
