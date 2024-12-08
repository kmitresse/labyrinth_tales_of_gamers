/**
 */
package labyrinth_tales_of_gamers.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.impl.GameImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.GameImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.GameImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.GameImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.GameImpl#getPrologue <em>Prologue</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.GameImpl#getEpilogue <em>Epilogue</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.GameImpl#getNbNpc <em>Nb Npc</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.GameImpl#getAim <em>Aim</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.GameImpl#getHowToPlay <em>How To Play</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected MainCharacter player;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected String subtitle = SUBTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrologue() <em>Prologue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrologue()
	 * @generated
	 * @ordered
	 */
	protected static final String PROLOGUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrologue() <em>Prologue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrologue()
	 * @generated
	 * @ordered
	 */
	protected String prologue = PROLOGUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpilogue() <em>Epilogue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpilogue()
	 * @generated
	 * @ordered
	 */
	protected static final String EPILOGUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpilogue() <em>Epilogue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpilogue()
	 * @generated
	 * @ordered
	 */
	protected String epilogue = EPILOGUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbNpc() <em>Nb Npc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbNpc()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_NPC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbNpc() <em>Nb Npc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbNpc()
	 * @generated
	 * @ordered
	 */
	protected int nbNpc = NB_NPC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAim() <em>Aim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAim()
	 * @generated
	 * @ordered
	 */
	protected static final String AIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAim() <em>Aim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAim()
	 * @generated
	 * @ordered
	 */
	protected String aim = AIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHowToPlay() <em>How To Play</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowToPlay()
	 * @generated
	 * @ordered
	 */
	protected static final String HOW_TO_PLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHowToPlay() <em>How To Play</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowToPlay()
	 * @generated
	 * @ordered
	 */
	protected String howToPlay = HOW_TO_PLAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Labyrinth_tales_of_gamersPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainCharacter getPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayer(MainCharacter newPlayer, NotificationChain msgs) {
		MainCharacter oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.GAME__PLAYER, oldPlayer, newPlayer);
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
	public void setPlayer(MainCharacter newPlayer) {
		if (newPlayer != player) {
			NotificationChain msgs = null;
			if (player != null)
				msgs = ((InternalEObject)player).eInverseRemove(this, Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME, MainCharacter.class, msgs);
			if (newPlayer != null)
				msgs = ((InternalEObject)newPlayer).eInverseAdd(this, Labyrinth_tales_of_gamersPackage.MAIN_CHARACTER__GAME, MainCharacter.class, msgs);
			msgs = basicSetPlayer(newPlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.GAME__PLAYER, newPlayer, newPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentWithInverseEList<Room>(Room.class, this, Labyrinth_tales_of_gamersPackage.GAME__ROOMS, Labyrinth_tales_of_gamersPackage.ROOM__GAME);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.GAME__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtitle(String newSubtitle) {
		String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.GAME__SUBTITLE, oldSubtitle, subtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrologue() {
		return prologue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrologue(String newPrologue) {
		String oldPrologue = prologue;
		prologue = newPrologue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.GAME__PROLOGUE, oldPrologue, prologue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEpilogue() {
		return epilogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEpilogue(String newEpilogue) {
		String oldEpilogue = epilogue;
		epilogue = newEpilogue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.GAME__EPILOGUE, oldEpilogue, epilogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNbNpc() {
		return nbNpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNbNpc(int newNbNpc) {
		int oldNbNpc = nbNpc;
		nbNpc = newNbNpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.GAME__NB_NPC, oldNbNpc, nbNpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAim() {
		return aim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAim(String newAim) {
		String oldAim = aim;
		aim = newAim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.GAME__AIM, oldAim, aim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHowToPlay() {
		return howToPlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHowToPlay(String newHowToPlay) {
		String oldHowToPlay = howToPlay;
		howToPlay = newHowToPlay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.GAME__HOW_TO_PLAY, oldHowToPlay, howToPlay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean nbNpcPositiveOrNull(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Game::nbNpcPositiveOrNull";
		try {
			/**
			 *
			 * inv nbNpcPositiveOrNull:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.nbNpc >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.GAME___NB_NPC_POSITIVE_OR_NULL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int nbNpc = this.getNbNpc();
				final /*@NonInvalid*/ IntegerValue BOXED_nbNpc = ValueUtil.integerValueOf(nbNpc);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_nbNpc, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.GAME__PLAYER:
				if (player != null)
					msgs = ((InternalEObject)player).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Labyrinth_tales_of_gamersPackage.GAME__PLAYER, null, msgs);
				return basicSetPlayer((MainCharacter)otherEnd, msgs);
			case Labyrinth_tales_of_gamersPackage.GAME__ROOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRooms()).basicAdd(otherEnd, msgs);
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
			case Labyrinth_tales_of_gamersPackage.GAME__PLAYER:
				return basicSetPlayer(null, msgs);
			case Labyrinth_tales_of_gamersPackage.GAME__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
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
			case Labyrinth_tales_of_gamersPackage.GAME__PLAYER:
				return getPlayer();
			case Labyrinth_tales_of_gamersPackage.GAME__ROOMS:
				return getRooms();
			case Labyrinth_tales_of_gamersPackage.GAME__TITLE:
				return getTitle();
			case Labyrinth_tales_of_gamersPackage.GAME__SUBTITLE:
				return getSubtitle();
			case Labyrinth_tales_of_gamersPackage.GAME__PROLOGUE:
				return getPrologue();
			case Labyrinth_tales_of_gamersPackage.GAME__EPILOGUE:
				return getEpilogue();
			case Labyrinth_tales_of_gamersPackage.GAME__NB_NPC:
				return getNbNpc();
			case Labyrinth_tales_of_gamersPackage.GAME__AIM:
				return getAim();
			case Labyrinth_tales_of_gamersPackage.GAME__HOW_TO_PLAY:
				return getHowToPlay();
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
			case Labyrinth_tales_of_gamersPackage.GAME__PLAYER:
				setPlayer((MainCharacter)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__TITLE:
				setTitle((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__SUBTITLE:
				setSubtitle((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__PROLOGUE:
				setPrologue((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__EPILOGUE:
				setEpilogue((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__NB_NPC:
				setNbNpc((Integer)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__AIM:
				setAim((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__HOW_TO_PLAY:
				setHowToPlay((String)newValue);
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
			case Labyrinth_tales_of_gamersPackage.GAME__PLAYER:
				setPlayer((MainCharacter)null);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__ROOMS:
				getRooms().clear();
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__SUBTITLE:
				setSubtitle(SUBTITLE_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__PROLOGUE:
				setPrologue(PROLOGUE_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__EPILOGUE:
				setEpilogue(EPILOGUE_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__NB_NPC:
				setNbNpc(NB_NPC_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__AIM:
				setAim(AIM_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.GAME__HOW_TO_PLAY:
				setHowToPlay(HOW_TO_PLAY_EDEFAULT);
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
			case Labyrinth_tales_of_gamersPackage.GAME__PLAYER:
				return player != null;
			case Labyrinth_tales_of_gamersPackage.GAME__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case Labyrinth_tales_of_gamersPackage.GAME__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Labyrinth_tales_of_gamersPackage.GAME__SUBTITLE:
				return SUBTITLE_EDEFAULT == null ? subtitle != null : !SUBTITLE_EDEFAULT.equals(subtitle);
			case Labyrinth_tales_of_gamersPackage.GAME__PROLOGUE:
				return PROLOGUE_EDEFAULT == null ? prologue != null : !PROLOGUE_EDEFAULT.equals(prologue);
			case Labyrinth_tales_of_gamersPackage.GAME__EPILOGUE:
				return EPILOGUE_EDEFAULT == null ? epilogue != null : !EPILOGUE_EDEFAULT.equals(epilogue);
			case Labyrinth_tales_of_gamersPackage.GAME__NB_NPC:
				return nbNpc != NB_NPC_EDEFAULT;
			case Labyrinth_tales_of_gamersPackage.GAME__AIM:
				return AIM_EDEFAULT == null ? aim != null : !AIM_EDEFAULT.equals(aim);
			case Labyrinth_tales_of_gamersPackage.GAME__HOW_TO_PLAY:
				return HOW_TO_PLAY_EDEFAULT == null ? howToPlay != null : !HOW_TO_PLAY_EDEFAULT.equals(howToPlay);
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
			case Labyrinth_tales_of_gamersPackage.GAME___NB_NPC_POSITIVE_OR_NULL__DIAGNOSTICCHAIN_MAP:
				return nbNpcPositiveOrNull((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (title: ");
		result.append(title);
		result.append(", subtitle: ");
		result.append(subtitle);
		result.append(", prologue: ");
		result.append(prologue);
		result.append(", epilogue: ");
		result.append(epilogue);
		result.append(", nbNpc: ");
		result.append(nbNpc);
		result.append(", aim: ");
		result.append(aim);
		result.append(", howToPlay: ");
		result.append(howToPlay);
		result.append(')');
		return result.toString();
	}

} //GameImpl
