/**
 */
package StudyProgramme.impl;

import StudyProgramme.Course;
import StudyProgramme.ProgrammeCourse;
import StudyProgramme.StudyProgrammePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.impl.ProgrammeCourseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link StudyProgramme.impl.ProgrammeCourseImpl#getProgrammeCourse <em>Programme Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeCourseImpl extends MinimalEObjectImpl.Container implements ProgrammeCourse {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgrammeCourse() <em>Programme Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeCourse()
	 * @generated
	 * @ordered
	 */
	protected Course programmeCourse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgrammePackage.Literals.PROGRAMME_COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.PROGRAMME_COURSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getProgrammeCourse() {
		if (programmeCourse != null && programmeCourse.eIsProxy()) {
			InternalEObject oldProgrammeCourse = (InternalEObject)programmeCourse;
			programmeCourse = (Course)eResolveProxy(oldProgrammeCourse);
			if (programmeCourse != oldProgrammeCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyProgrammePackage.PROGRAMME_COURSE__PROGRAMME_COURSE, oldProgrammeCourse, programmeCourse));
			}
		}
		return programmeCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetProgrammeCourse() {
		return programmeCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeCourse(Course newProgrammeCourse) {
		Course oldProgrammeCourse = programmeCourse;
		programmeCourse = newProgrammeCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.PROGRAMME_COURSE__PROGRAMME_COURSE, oldProgrammeCourse, programmeCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyProgrammePackage.PROGRAMME_COURSE__STATUS:
				return getStatus();
			case StudyProgrammePackage.PROGRAMME_COURSE__PROGRAMME_COURSE:
				if (resolve) return getProgrammeCourse();
				return basicGetProgrammeCourse();
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
			case StudyProgrammePackage.PROGRAMME_COURSE__STATUS:
				setStatus((String)newValue);
				return;
			case StudyProgrammePackage.PROGRAMME_COURSE__PROGRAMME_COURSE:
				setProgrammeCourse((Course)newValue);
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
			case StudyProgrammePackage.PROGRAMME_COURSE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case StudyProgrammePackage.PROGRAMME_COURSE__PROGRAMME_COURSE:
				setProgrammeCourse((Course)null);
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
			case StudyProgrammePackage.PROGRAMME_COURSE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case StudyProgrammePackage.PROGRAMME_COURSE__PROGRAMME_COURSE:
				return programmeCourse != null;
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ProgrammeCourseImpl
