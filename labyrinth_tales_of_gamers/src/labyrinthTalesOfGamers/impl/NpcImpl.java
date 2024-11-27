/**
 */
package labyrinthTalesOfGamers.impl;

import java.lang.reflect.InvocationTargetException;

import labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage;
import labyrinthTalesOfGamers.Npc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Npc</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NpcImpl extends EntityImpl implements Npc {
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
		return LabyrinthTalesOfGamersPackage.Literals.NPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void salute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void giveHintPosition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LabyrinthTalesOfGamersPackage.NPC___SALUTE:
				salute();
				return null;
			case LabyrinthTalesOfGamersPackage.NPC___GIVE_HINT_POSITION:
				giveHintPosition();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //NpcImpl
