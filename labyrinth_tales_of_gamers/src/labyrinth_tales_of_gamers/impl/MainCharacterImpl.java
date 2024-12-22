/**
 */
package labyrinth_tales_of_gamers.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import labyrinth_tales_of_gamers.Game;
import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage;
import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersTables;
import labyrinth_tales_of_gamers.MainCharacter;
import labyrinth_tales_of_gamers.Room;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.impl.MainCharacterImpl#getNbDiscoveredEnigmas <em>Nb Discovered Enigmas</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.MainCharacterImpl#getGame <em>Game</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.MainCharacterImpl#getCurrentRoom <em>Current Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainCharacterImpl extends EntityImpl implements MainCharacter {
	/**
	 * The default value of the '{@link #getNbDiscoveredEnigmas() <em>Nb Discovered Enigmas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbDiscoveredEnigmas()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_DISCOVERED_ENIGMAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbDiscoveredEnigmas() <em>Nb Discovered Enigmas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbDiscoveredEnigmas()
	 * @generated
	 * @ordered
	 */
	protected int nbDiscoveredEnigmas = NB_DISCOVERED_ENIGMAS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainCharacterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Labyrinth_tales_of_gamersPackage.Literals.MAIN_CHARACTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNbDiscoveredEnigmas() {
		return nbDiscoveredEnigmas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNbDiscoveredEnigmas(int newNbDiscoveredEnigmas) {
		int oldNbDiscoveredEnigmas = nbDiscoveredEnigmas;
		nbDiscoveredEnigmas = newNbDiscoveredEnigmas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__NB_DISCOVERED_ENIGMAS, oldNbDiscoveredEnigmas, nbDiscoveredEnigmas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game getGame() {
		if (eContainerFeatureID() != Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME) return null;
		return (Game)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGame(Game newGame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGame, Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGame(Game newGame) {
		if (newGame != eInternalContainer() || (eContainerFeatureID() != Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME && newGame != null)) {
			if (EcoreUtil.isAncestor(this, newGame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGame != null)
				msgs = ((InternalEObject)newGame).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.GAME__PLAYER, Game.class, msgs);
			msgs = basicSetGame(newGame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME, newGame, newGame));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__CURRENT_ROOM, oldCurrentRoom, currentRoom));
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
	@Override
	public void setCurrentRoom(Room newCurrentRoom) {
		Room oldCurrentRoom = currentRoom;
		currentRoom = newCurrentRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__CURRENT_ROOM, oldCurrentRoom, currentRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean nbDiscoveredNpcBorned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "MainCharacter::nbDiscoveredNpcBorned";
		try {
			/**
			 *
			 * inv nbDiscoveredNpcBorned:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.nbDiscoveredEnigmas >= 0 and self.nbDiscoveredEnigmas <= self.game.nbEnigmas
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.MAIN_CHARACTER___NB_DISCOVERED_NPC_BORNED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int nbDiscoveredEnigmas_0 = this.getNbDiscoveredEnigmas();
				final /*@NonInvalid*/ IntegerValue BOXED_nbDiscoveredEnigmas_0 = ValueUtil.integerValueOf(nbDiscoveredEnigmas_0);
				final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_nbDiscoveredEnigmas_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!ge) {
					result = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ Game game = this.getGame();
					final /*@NonInvalid*/ int nbEnigmas = game.getNbEnigmas();
					final /*@NonInvalid*/ IntegerValue BOXED_nbEnigmas = ValueUtil.integerValueOf(nbEnigmas);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_nbDiscoveredEnigmas_0, BOXED_nbEnigmas).booleanValue();
					if (!le_0) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = ValueUtil.TRUE_VALUE;
					}
				}
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGame((Game)otherEnd, msgs);
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
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME:
				return basicSetGame(null, msgs);
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
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME:
				return eInternalContainer().eInverseRemove(this, Labyrinth_tales_of_gamersPackage.GAME__PLAYER, Game.class, msgs);
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
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__NB_DISCOVERED_ENIGMAS:
				return getNbDiscoveredEnigmas();
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME:
				return getGame();
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__CURRENT_ROOM:
				if (resolve) return getCurrentRoom();
				return basicGetCurrentRoom();
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
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__NB_DISCOVERED_ENIGMAS:
				setNbDiscoveredEnigmas((Integer)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME:
				setGame((Game)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__CURRENT_ROOM:
				setCurrentRoom((Room)newValue);
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
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__NB_DISCOVERED_ENIGMAS:
				setNbDiscoveredEnigmas(NB_DISCOVERED_ENIGMAS_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME:
				setGame((Game)null);
				return;
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__CURRENT_ROOM:
				setCurrentRoom((Room)null);
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
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__NB_DISCOVERED_ENIGMAS:
				return nbDiscoveredEnigmas != NB_DISCOVERED_ENIGMAS_EDEFAULT;
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME:
				return getGame() != null;
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__CURRENT_ROOM:
				return currentRoom != null;
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
			case Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER___NB_DISCOVERED_NPC_BORNED__DIAGNOSTICCHAIN_MAP:
				return nbDiscoveredNpcBorned((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (nbDiscoveredEnigmas: ");
		result.append(nbDiscoveredEnigmas);
		result.append(')');
		return result.toString();
	}

} //MainCharacterImpl
