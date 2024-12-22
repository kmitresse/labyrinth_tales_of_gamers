/**
 */
package labyrinth_tales_of_gamers.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import labyrinth_tales_of_gamers.Action;
import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage;

import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersTables;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labyrinth_tales_of_gamers.impl.ActionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link labyrinth_tales_of_gamers.impl.ActionImpl#getInformations <em>Informations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "static Label";

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
	 * The default value of the '{@link #getInformations() <em>Informations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformations()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformations() <em>Informations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformations()
	 * @generated
	 * @ordered
	 */
	protected String informations = INFORMATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Labyrinth_tales_of_gamersPackage.Literals.ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ACTION__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInformations() {
		return informations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformations(String newInformations) {
		String oldInformations = informations;
		informations = newInformations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Labyrinth_tales_of_gamersPackage.ACTION__INFORMATIONS, oldInformations, informations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean labelAction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Action::labelAction";
		try {
			/**
			 *
			 * inv labelAction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.label = 'MOVE' or self.label = 'TALK' or self.label = 'ASK_HINT' or self.label = 'READ' or self.label = 'PROPOSE'
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Labyrinth_tales_of_gamersPackage.Literals.ACTION___LABEL_ACTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Labyrinth_tales_of_gamersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String label_3 = this.getLabel();
					/*@Caught*/ Object CAUGHT_or_1;
					try {
						/*@Caught*/ Object CAUGHT_or_0;
						try {
							final /*@NonInvalid*/ boolean eq = label_3.equals(Labyrinth_tales_of_gamersTables.STR_MOVE);
							final /*@NonInvalid*/ Boolean or;
							if (eq) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean eq_0 = label_3.equals(Labyrinth_tales_of_gamersTables.STR_TALK);
								if (eq_0) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean or_0;
							if (or == ValueUtil.TRUE_VALUE) {
								or_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean eq_1 = label_3.equals(Labyrinth_tales_of_gamersTables.STR_ASK_HINT);
								if (eq_1) {
									or_0 = ValueUtil.TRUE_VALUE;
								}
								else {
									if (or == null) {
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
						final /*@Thrown*/ Boolean or_1;
						if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
							or_1 = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean eq_2 = label_3.equals(Labyrinth_tales_of_gamersTables.STR_READ);
							if (eq_2) {
								or_1 = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_or_0 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_or_0;
								}
								if (CAUGHT_or_0 == null) {
									or_1 = null;
								}
								else {
									or_1 = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or_1 = or_1;
					}
					catch (Exception e) {
						CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean eq_3 = label_3.equals(Labyrinth_tales_of_gamersTables.STR_PROPOSE);
						if (eq_3) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_or_1 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_or_1;
							}
							if (CAUGHT_or_1 == null) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Labyrinth_tales_of_gamersPackage.ACTION__LABEL:
				return getLabel();
			case Labyrinth_tales_of_gamersPackage.ACTION__NAME:
				return getName();
			case Labyrinth_tales_of_gamersPackage.ACTION__INFORMATIONS:
				return getInformations();
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
			case Labyrinth_tales_of_gamersPackage.ACTION__LABEL:
				setLabel((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ACTION__NAME:
				setName((String)newValue);
				return;
			case Labyrinth_tales_of_gamersPackage.ACTION__INFORMATIONS:
				setInformations((String)newValue);
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
			case Labyrinth_tales_of_gamersPackage.ACTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Labyrinth_tales_of_gamersPackage.ACTION__INFORMATIONS:
				setInformations(INFORMATIONS_EDEFAULT);
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
			case Labyrinth_tales_of_gamersPackage.ACTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Labyrinth_tales_of_gamersPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Labyrinth_tales_of_gamersPackage.ACTION__INFORMATIONS:
				return INFORMATIONS_EDEFAULT == null ? informations != null : !INFORMATIONS_EDEFAULT.equals(informations);
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
			case Labyrinth_tales_of_gamersPackage.ACTION___LABEL_ACTION__DIAGNOSTICCHAIN_MAP:
				return labelAction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(", Informations: ");
		result.append(informations);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
