/**
 */
package labyrinth_tales_of_gamers.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import labyrinth_tales_of_gamers.Action;
import labyrinth_tales_of_gamers.Game;
import labyrinth_tales_of_gamers.Hint;
import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage;
import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersTables;
import labyrinth_tales_of_gamers.Npc;
import labyrinth_tales_of_gamers.Room;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getNorth <em>North</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getEast <em>East</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getWest <em>West</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getSouth <em>South</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getGame <em>Game</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getNpc <em>Npc</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.RoomImpl#getBackendName <em>Backend Name</em>}</li>
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
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected Hint hint;

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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getNpc() <em>Npc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpc()
	 * @generated
	 * @ordered
	 */
	protected Npc npc;

	/**
	 * The default value of the '{@link #getBackendName() <em>Backend Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendName()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendName() <em>Backend Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendName()
	 * @generated
	 * @ordered
	 */
	protected String backendName = BACKEND_NAME_EDEFAULT;

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
		return Labyrinth_tales_of_gamersPackage.Literals.ROOM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Labyrinth_tales_of_gamersPackage.ROOM__NORTH, oldNorth, north));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__NORTH, oldNorth, newNorth);
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
				msgs = ((InternalEObject)north).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__SOUTH, Room.class, msgs);
			if (newNorth != null)
				msgs = ((InternalEObject)newNorth).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.ROOM__SOUTH, Room.class, msgs);
			msgs = basicSetNorth(newNorth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__NORTH, newNorth, newNorth));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Labyrinth_tales_of_gamersPackage.ROOM__EAST, oldEast, east));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__EAST, oldEast, newEast);
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
				msgs = ((InternalEObject)east).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__WEST, Room.class, msgs);
			if (newEast != null)
				msgs = ((InternalEObject)newEast).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.ROOM__WEST, Room.class, msgs);
			msgs = basicSetEast(newEast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__EAST, newEast, newEast));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Labyrinth_tales_of_gamersPackage.ROOM__WEST, oldWest, west));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__WEST, oldWest, newWest);
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
				msgs = ((InternalEObject)west).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__EAST, Room.class, msgs);
			if (newWest != null)
				msgs = ((InternalEObject)newWest).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.ROOM__EAST, Room.class, msgs);
			msgs = basicSetWest(newWest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__WEST, newWest, newWest));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Labyrinth_tales_of_gamersPackage.ROOM__SOUTH, oldSouth, south));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__SOUTH, oldSouth, newSouth);
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
				msgs = ((InternalEObject)south).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__NORTH, Room.class, msgs);
			if (newSouth != null)
				msgs = ((InternalEObject)newSouth).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.ROOM__NORTH, Room.class, msgs);
			msgs = basicSetSouth(newSouth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__SOUTH, newSouth, newSouth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hint getHint() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__HINT, oldHint, newHint);
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
				msgs = ((InternalEObject)hint).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM, Hint.class, msgs);
			if (newHint != null)
				msgs = ((InternalEObject)newHint).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.HINT__CURRENT_ROOM, Hint.class, msgs);
			msgs = basicSetHint(newHint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__HINT, newHint, newHint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game getGame() {
		if (eContainerFeatureID() != Labyrinth_tales_of_gamersPackage.ROOM__GAME) return null;
		return (Game)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGame(Game newGame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGame, Labyrinth_tales_of_gamersPackage.ROOM__GAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGame(Game newGame) {
		if (newGame != eInternalContainer() || (eContainerFeatureID() != Labyrinth_tales_of_gamersPackage.ROOM__GAME && newGame != null)) {
			if (EcoreUtil.isAncestor(this, newGame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGame != null)
				msgs = ((InternalEObject)newGame).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.GAME__ROOMS, Game.class, msgs);
			msgs = basicSetGame(newGame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__GAME, newGame, newGame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, Labyrinth_tales_of_gamersPackage.ROOM__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Npc getNpc() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__NPC, oldNpc, newNpc);
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
				msgs = ((InternalEObject)npc).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM, Npc.class, msgs);
			if (newNpc != null)
				msgs = ((InternalEObject)newNpc).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.NPC__CURRENT_ROOM, Npc.class, msgs);
			msgs = basicSetNpc(newNpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__NPC, newNpc, newNpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackendName() {
		return backendName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackendName(String newBackendName) {
		String oldBackendName = backendName;
		backendName = newBackendName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ROOM__BACKEND_NAME, oldBackendName, backendName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean existingAction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::existingAction";
		try {
			/**
			 *
			 * inv existingAction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.actions->size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.ROOM___EXISTING_ACTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Action> actions = this.getActions();
				final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(Labyrinth_tales_of_gamersTables.ORD_CLSSid_Action_0, actions);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_actions);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean readActionImpliesHintExists(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::readActionImpliesHintExists";
		try {
			/**
			 *
			 * inv readActionImpliesHintExists:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.actions->exists(action | action.label = 'READ') implies
			 *         not self.hint.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.ROOM___READ_ACTION_IMPLIES_HINT_EXISTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						final /*@NonInvalid*/ List<Action> actions = this.getActions();
						final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(Labyrinth_tales_of_gamersTables.ORD_CLSSid_Action_0, actions);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_action.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Action action = (Action)ITERATOR_action.next();
							/**
							 * action.label = 'READ'
							 */
							/*@Caught*/ Object CAUGHT_eq;
							try {
								if (action == null) {
									throw new InvalidValueException("Null source for \'\'http://labyrinthtalesofgamers.com/\'::Action::label\'");
								}
								final /*@Thrown*/ String label = action.getLabel();
								final /*@Thrown*/ boolean eq = label.equals(Labyrinth_tales_of_gamersTables.STR_READ);
								CAUGHT_eq = eq;
							}
							catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
								accumulator = CAUGHT_eq;									// Cache an exception failure
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists = exists;
					}
					catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ Hint hint = this.getHint();
						final /*@NonInvalid*/ boolean oclIsUndefined = hint == null;
						final /*@NonInvalid*/ Boolean not;
						if (!oclIsUndefined) {
							not = ValueUtil.TRUE_VALUE;
						}
						else {
							if (oclIsUndefined) {
								not = ValueUtil.FALSE_VALUE;
							}
							else {
								not = null;
							}
						}
						if (not == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_exists instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_exists;
							}
							if ((CAUGHT_exists == null) || (not == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean askHintActionImpliesNpcExists(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::askHintActionImpliesNpcExists";
		try {
			/**
			 *
			 * inv askHintActionImpliesNpcExists:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.actions->exists(action | action.label = 'ASK_HINT') implies
			 *         not self.npc.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.ROOM___ASK_HINT_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						final /*@NonInvalid*/ List<Action> actions = this.getActions();
						final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(Labyrinth_tales_of_gamersTables.ORD_CLSSid_Action_0, actions);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_action.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Action action = (Action)ITERATOR_action.next();
							/**
							 * action.label = 'ASK_HINT'
							 */
							/*@Caught*/ Object CAUGHT_eq;
							try {
								if (action == null) {
									throw new InvalidValueException("Null source for \'\'http://labyrinthtalesofgamers.com/\'::Action::label\'");
								}
								final /*@Thrown*/ String label = action.getLabel();
								final /*@Thrown*/ boolean eq = label.equals(Labyrinth_tales_of_gamersTables.STR_ASK_HINT);
								CAUGHT_eq = eq;
							}
							catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
								accumulator = CAUGHT_eq;									// Cache an exception failure
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists = exists;
					}
					catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ Npc npc = this.getNpc();
						final /*@NonInvalid*/ boolean oclIsUndefined = npc == null;
						final /*@NonInvalid*/ Boolean not;
						if (!oclIsUndefined) {
							not = ValueUtil.TRUE_VALUE;
						}
						else {
							if (oclIsUndefined) {
								not = ValueUtil.FALSE_VALUE;
							}
							else {
								not = null;
							}
						}
						if (not == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_exists instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_exists;
							}
							if ((CAUGHT_exists == null) || (not == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean proposeActionImpliesNpcExists(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::proposeActionImpliesNpcExists";
		try {
			/**
			 *
			 * inv proposeActionImpliesNpcExists:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.actions->exists(action | action.label = 'PROPOSE') implies
			 *         not self.npc.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.ROOM___PROPOSE_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						final /*@NonInvalid*/ List<Action> actions = this.getActions();
						final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(Labyrinth_tales_of_gamersTables.ORD_CLSSid_Action_0, actions);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_action.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Action action = (Action)ITERATOR_action.next();
							/**
							 * action.label = 'PROPOSE'
							 */
							/*@Caught*/ Object CAUGHT_eq;
							try {
								if (action == null) {
									throw new InvalidValueException("Null source for \'\'http://labyrinthtalesofgamers.com/\'::Action::label\'");
								}
								final /*@Thrown*/ String label = action.getLabel();
								final /*@Thrown*/ boolean eq = label.equals(Labyrinth_tales_of_gamersTables.STR_PROPOSE);
								CAUGHT_eq = eq;
							}
							catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
								accumulator = CAUGHT_eq;									// Cache an exception failure
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists = exists;
					}
					catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ Npc npc = this.getNpc();
						final /*@NonInvalid*/ boolean oclIsUndefined = npc == null;
						final /*@NonInvalid*/ Boolean not;
						if (!oclIsUndefined) {
							not = ValueUtil.TRUE_VALUE;
						}
						else {
							if (oclIsUndefined) {
								not = ValueUtil.FALSE_VALUE;
							}
							else {
								not = null;
							}
						}
						if (not == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_exists instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_exists;
							}
							if ((CAUGHT_exists == null) || (not == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean talkActionImpliesNpcExists(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::talkActionImpliesNpcExists";
		try {
			/**
			 *
			 * inv talkActionImpliesNpcExists:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.actions->exists(action | action.label = 'TALK') implies
			 *         not self.npc.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.ROOM___TALK_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						final /*@NonInvalid*/ List<Action> actions = this.getActions();
						final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(Labyrinth_tales_of_gamersTables.ORD_CLSSid_Action_0, actions);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_action.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Action action = (Action)ITERATOR_action.next();
							/**
							 * action.label = 'TALK'
							 */
							/*@Caught*/ Object CAUGHT_eq;
							try {
								if (action == null) {
									throw new InvalidValueException("Null source for \'\'http://labyrinthtalesofgamers.com/\'::Action::label\'");
								}
								final /*@Thrown*/ String label = action.getLabel();
								final /*@Thrown*/ boolean eq = label.equals(Labyrinth_tales_of_gamersTables.STR_TALK);
								CAUGHT_eq = eq;
							}
							catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
								accumulator = CAUGHT_eq;									// Cache an exception failure
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists = exists;
					}
					catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ Npc npc = this.getNpc();
						final /*@NonInvalid*/ boolean oclIsUndefined = npc == null;
						final /*@NonInvalid*/ Boolean not;
						if (!oclIsUndefined) {
							not = ValueUtil.TRUE_VALUE;
						}
						else {
							if (oclIsUndefined) {
								not = ValueUtil.FALSE_VALUE;
							}
							else {
								not = null;
							}
						}
						if (not == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_exists instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_exists;
							}
							if ((CAUGHT_exists == null) || (not == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean notHisOwnExit(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::notHisOwnExit";
		try {
			/**
			 *
			 * inv notHisOwnExit:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.east <> self and self.north <> self and self.south <> self and self.west <> self
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.ROOM___NOT_HIS_OWN_EXIT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						final /*@NonInvalid*/ Room east = this.getEast();
						final /*@NonInvalid*/ boolean ne = !this.equals(east);
						final /*@NonInvalid*/ Boolean and;
						if (!ne) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ Room north = this.getNorth();
							final /*@NonInvalid*/ boolean ne_0 = !this.equals(north);
							if (!ne_0) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						final /*@Thrown*/ Boolean and_0;
						if (and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ Room south = this.getSouth();
							final /*@NonInvalid*/ boolean ne_1 = !this.equals(south);
							if (!ne_1) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								if (and == null) {
									and_0 = null;
								}
								else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_0 = and_0;
					}
					catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						final /*@NonInvalid*/ Room west = this.getWest();
						final /*@NonInvalid*/ boolean ne_2 = !this.equals(west);
						if (!ne_2) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if (CAUGHT_and_0 == null) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean existingAnExit(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::existingAnExit";
		try {
			/**
			 *
			 * inv existingAnExit:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.east.oclIsUndefined() or
			 *         not self.north.oclIsUndefined() or
			 *         not self.south.oclIsUndefined() or
			 *         not self.west.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.ROOM___EXISTING_AN_EXIT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_or_0;
					try {
						/*@Caught*/ Object CAUGHT_or;
						try {
							final /*@NonInvalid*/ Room east = this.getEast();
							final /*@NonInvalid*/ boolean oclIsUndefined = east == null;
							final /*@NonInvalid*/ Boolean not;
							if (!oclIsUndefined) {
								not = ValueUtil.TRUE_VALUE;
							}
							else {
								if (oclIsUndefined) {
									not = ValueUtil.FALSE_VALUE;
								}
								else {
									not = null;
								}
							}
							final /*@Thrown*/ Boolean or;
							if (not == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ Room north = this.getNorth();
								final /*@NonInvalid*/ boolean oclIsUndefined_0 = north == null;
								final /*@NonInvalid*/ Boolean not_0;
								if (!oclIsUndefined_0) {
									not_0 = ValueUtil.TRUE_VALUE;
								}
								else {
									if (oclIsUndefined_0) {
										not_0 = ValueUtil.FALSE_VALUE;
									}
									else {
										not_0 = null;
									}
								}
								if (not_0 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									if ((not == null) || (not_0 == null)) {
										or = null;
									}
									else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or = or;
						}
						catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_0;
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							or_0 = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ Room south = this.getSouth();
							final /*@NonInvalid*/ boolean oclIsUndefined_1 = south == null;
							final /*@NonInvalid*/ Boolean not_1;
							if (!oclIsUndefined_1) {
								not_1 = ValueUtil.TRUE_VALUE;
							}
							else {
								if (oclIsUndefined_1) {
									not_1 = ValueUtil.FALSE_VALUE;
								}
								else {
									not_1 = null;
								}
							}
							if (not_1 == ValueUtil.TRUE_VALUE) {
								or_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_or instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_or;
								}
								if ((CAUGHT_or == null) || (not_1 == null)) {
									or_0 = null;
								}
								else {
									or_0 = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or_0 = or_0;
					}
					catch (Exception e) {
						CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ Room west = this.getWest();
						final /*@NonInvalid*/ boolean oclIsUndefined_2 = west == null;
						final /*@NonInvalid*/ Boolean not_2;
						if (!oclIsUndefined_2) {
							not_2 = ValueUtil.TRUE_VALUE;
						}
						else {
							if (oclIsUndefined_2) {
								not_2 = ValueUtil.FALSE_VALUE;
							}
							else {
								not_2 = null;
							}
						}
						if (not_2 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_or_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_or_0;
							}
							if ((CAUGHT_or_0 == null) || (not_2 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.ROOM__NORTH:
				if (north != null)
					msgs = ((InternalEObject)north).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__SOUTH, Room.class, msgs);
				return basicSetNorth((Room)otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__EAST:
				if (east != null)
					msgs = ((InternalEObject)east).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__WEST, Room.class, msgs);
				return basicSetEast((Room)otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__WEST:
				if (west != null)
					msgs = ((InternalEObject)west).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__EAST, Room.class, msgs);
				return basicSetWest((Room)otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__SOUTH:
				if (south != null)
					msgs = ((InternalEObject)south).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.ROOM__NORTH, Room.class, msgs);
				return basicSetSouth((Room)otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__HINT:
				if (hint != null)
					msgs = ((InternalEObject)hint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Labyrinth_tales_of_gamersPackage.ROOM__HINT, null, msgs);
				return basicSetHint((Hint)otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__GAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGame((Game)otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__NPC:
				if (npc != null)
					msgs = ((InternalEObject)npc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Labyrinth_tales_of_gamersPackage.ROOM__NPC, null, msgs);
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
			case Labyrinth_tales_of_gamersPackage.ROOM__NORTH:
				return basicSetNorth(null, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__EAST:
				return basicSetEast(null, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__WEST:
				return basicSetWest(null, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__SOUTH:
				return basicSetSouth(null, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__HINT:
				return basicSetHint(null, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__GAME:
				return basicSetGame(null, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.ROOM__NPC:
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
			case Labyrinth_tales_of_gamersPackage.ROOM__GAME:
				return eInternalContainer().eInverseRemove(this, Labyrinth_tales_of_gamersPackage.GAME__ROOMS, Game.class, msgs);
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
			case Labyrinth_tales_of_gamersPackage.ROOM__NORTH:
				if (resolve) return getNorth();
				return basicGetNorth();
			case Labyrinth_tales_of_gamersPackage.ROOM__EAST:
				if (resolve) return getEast();
				return basicGetEast();
			case Labyrinth_tales_of_gamersPackage.ROOM__WEST:
				if (resolve) return getWest();
				return basicGetWest();
			case Labyrinth_tales_of_gamersPackage.ROOM__SOUTH:
				if (resolve) return getSouth();
				return basicGetSouth();
			case Labyrinth_tales_of_gamersPackage.ROOM__HINT:
				return getHint();
			case Labyrinth_tales_of_gamersPackage.ROOM__NAME:
				return getName();
			case Labyrinth_tales_of_gamersPackage.ROOM__GAME:
				return getGame();
			case Labyrinth_tales_of_gamersPackage.ROOM__ACTIONS:
				return getActions();
			case Labyrinth_tales_of_gamersPackage.ROOM__NPC:
				return getNpc();
			case Labyrinth_tales_of_gamersPackage.ROOM__BACKEND_NAME:
				return getBackendName();
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
			case Labyrinth_tales_of_gamersPackage.ROOM__NORTH:
				setNorth((Room)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__EAST:
				setEast((Room)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__WEST:
				setWest((Room)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__SOUTH:
				setSouth((Room)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__HINT:
				setHint((Hint)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__NAME:
				setName((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__GAME:
				setGame((Game)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__NPC:
				setNpc((Npc)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__BACKEND_NAME:
				setBackendName((String)newValue);
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
			case Labyrinth_tales_of_gamersPackage.ROOM__NORTH:
				setNorth((Room)null);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__EAST:
				setEast((Room)null);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__WEST:
				setWest((Room)null);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__SOUTH:
				setSouth((Room)null);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__HINT:
				setHint((Hint)null);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__GAME:
				setGame((Game)null);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__ACTIONS:
				getActions().clear();
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__NPC:
				setNpc((Npc)null);
				return;
			case Labyrinth_tales_of_gamersPackage.ROOM__BACKEND_NAME:
				setBackendName(BACKEND_NAME_EDEFAULT);
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
			case Labyrinth_tales_of_gamersPackage.ROOM__NORTH:
				return north != null;
			case Labyrinth_tales_of_gamersPackage.ROOM__EAST:
				return east != null;
			case Labyrinth_tales_of_gamersPackage.ROOM__WEST:
				return west != null;
			case Labyrinth_tales_of_gamersPackage.ROOM__SOUTH:
				return south != null;
			case Labyrinth_tales_of_gamersPackage.ROOM__HINT:
				return hint != null;
			case Labyrinth_tales_of_gamersPackage.ROOM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Labyrinth_tales_of_gamersPackage.ROOM__GAME:
				return getGame() != null;
			case Labyrinth_tales_of_gamersPackage.ROOM__ACTIONS:
				return actions != null && !actions.isEmpty();
			case Labyrinth_tales_of_gamersPackage.ROOM__NPC:
				return npc != null;
			case Labyrinth_tales_of_gamersPackage.ROOM__BACKEND_NAME:
				return BACKEND_NAME_EDEFAULT == null ? backendName != null : !BACKEND_NAME_EDEFAULT.equals(backendName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Labyrinth_tales_of_gamersPackage.ROOM___EXISTING_ACTION__DIAGNOSTICCHAIN_MAP:
				return existingAction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Labyrinth_tales_of_gamersPackage.ROOM___READ_ACTION_IMPLIES_HINT_EXISTS__DIAGNOSTICCHAIN_MAP:
				return readActionImpliesHintExists((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Labyrinth_tales_of_gamersPackage.ROOM___ASK_HINT_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP:
				return askHintActionImpliesNpcExists((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Labyrinth_tales_of_gamersPackage.ROOM___NOT_HIS_OWN_EXIT__DIAGNOSTICCHAIN_MAP:
				return notHisOwnExit((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Labyrinth_tales_of_gamersPackage.ROOM___PROPOSE_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP:
				return proposeActionImpliesNpcExists((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Labyrinth_tales_of_gamersPackage.ROOM___TALK_ACTION_IMPLIES_NPC_EXISTS__DIAGNOSTICCHAIN_MAP:
				return talkActionImpliesNpcExists((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Labyrinth_tales_of_gamersPackage.ROOM___EXISTING_AN_EXIT__DIAGNOSTICCHAIN_MAP:
				return existingAnExit((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", backendName: ");
		result.append(backendName);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
