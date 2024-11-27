/**
 */
package labyrinthTalesOfGamers.impl;

import java.lang.reflect.InvocationTargetException;

import labyrinthTalesOfGamers.LabyrinthTalesOfGamersPackage;
import labyrinthTalesOfGamers.MainCharacter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MainCharacterImpl extends EntityImpl implements MainCharacter {
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
		return LabyrinthTalesOfGamersPackage.Literals.MAIN_CHARACTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void selectChoices(EList<String> choices) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LabyrinthTalesOfGamersPackage.MAIN_CHARACTER___SELECT_CHOICES__ELIST:
				selectChoices((EList<String>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MainCharacterImpl
