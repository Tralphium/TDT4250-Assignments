/**
 */
package StudyProgramme.impl;

import StudyProgramme.Course;
import StudyProgramme.SpecializedSemester;
import StudyProgramme.StudyProgrammePackage;
import StudyProgramme.specialization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.impl.specializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link StudyProgramme.impl.specializationImpl#getSpecializationCourse <em>Specialization Course</em>}</li>
 *   <li>{@link StudyProgramme.impl.specializationImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class specializationImpl extends MinimalEObjectImpl.Container implements specialization {
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
	 * The cached value of the '{@link #getSpecializationCourse() <em>Specialization Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationCourse()
	 * @generated
	 * @ordered
	 */
	protected Course specializationCourse;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecializedSemester> course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected specializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgrammePackage.Literals.SPECIALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getSpecializationCourse() {
		if (specializationCourse != null && specializationCourse.eIsProxy()) {
			InternalEObject oldSpecializationCourse = (InternalEObject)specializationCourse;
			specializationCourse = (Course)eResolveProxy(oldSpecializationCourse);
			if (specializationCourse != oldSpecializationCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyProgrammePackage.SPECIALIZATION__SPECIALIZATION_COURSE, oldSpecializationCourse, specializationCourse));
			}
		}
		return specializationCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetSpecializationCourse() {
		return specializationCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecializationCourse(Course newSpecializationCourse) {
		Course oldSpecializationCourse = specializationCourse;
		specializationCourse = newSpecializationCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SPECIALIZATION__SPECIALIZATION_COURSE, oldSpecializationCourse, specializationCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecializedSemester> getCourse() {
		if (course == null) {
			course = new EObjectResolvingEList<SpecializedSemester>(SpecializedSemester.class, this, StudyProgrammePackage.SPECIALIZATION__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyProgrammePackage.SPECIALIZATION__NAME:
				return getName();
			case StudyProgrammePackage.SPECIALIZATION__SPECIALIZATION_COURSE:
				if (resolve) return getSpecializationCourse();
				return basicGetSpecializationCourse();
			case StudyProgrammePackage.SPECIALIZATION__COURSE:
				return getCourse();
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
			case StudyProgrammePackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case StudyProgrammePackage.SPECIALIZATION__SPECIALIZATION_COURSE:
				setSpecializationCourse((Course)newValue);
				return;
			case StudyProgrammePackage.SPECIALIZATION__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends SpecializedSemester>)newValue);
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
			case StudyProgrammePackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyProgrammePackage.SPECIALIZATION__SPECIALIZATION_COURSE:
				setSpecializationCourse((Course)null);
				return;
			case StudyProgrammePackage.SPECIALIZATION__COURSE:
				getCourse().clear();
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
			case StudyProgrammePackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyProgrammePackage.SPECIALIZATION__SPECIALIZATION_COURSE:
				return specializationCourse != null;
			case StudyProgrammePackage.SPECIALIZATION__COURSE:
				return course != null && !course.isEmpty();
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

} //specializationImpl
