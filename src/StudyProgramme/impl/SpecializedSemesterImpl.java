/**
 */
package StudyProgramme.impl;

import StudyProgramme.CourseGroup;
import StudyProgramme.SpecializedSemester;
import StudyProgramme.StudyProgrammePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialized Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.impl.SpecializedSemesterImpl#getDefaultCourses <em>Default Courses</em>}</li>
 *   <li>{@link StudyProgramme.impl.SpecializedSemesterImpl#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializedSemesterImpl extends MinimalEObjectImpl.Container implements SpecializedSemester {
	/**
	 * The cached value of the '{@link #getDefaultCourses() <em>Default Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCourses()
	 * @generated
	 * @ordered
	 */
	protected CourseGroup defaultCourses;

	/**
	 * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum()
	 * @generated
	 * @ordered
	 */
	protected int num = NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializedSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgrammePackage.Literals.SPECIALIZED_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroup getDefaultCourses() {
		return defaultCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultCourses(CourseGroup newDefaultCourses, NotificationChain msgs) {
		CourseGroup oldDefaultCourses = defaultCourses;
		defaultCourses = newDefaultCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SPECIALIZED_SEMESTER__DEFAULT_COURSES, oldDefaultCourses, newDefaultCourses);
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
	public void setDefaultCourses(CourseGroup newDefaultCourses) {
		if (newDefaultCourses != defaultCourses) {
			NotificationChain msgs = null;
			if (defaultCourses != null)
				msgs = ((InternalEObject)defaultCourses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyProgrammePackage.SPECIALIZED_SEMESTER__DEFAULT_COURSES, null, msgs);
			if (newDefaultCourses != null)
				msgs = ((InternalEObject)newDefaultCourses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyProgrammePackage.SPECIALIZED_SEMESTER__DEFAULT_COURSES, null, msgs);
			msgs = basicSetDefaultCourses(newDefaultCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SPECIALIZED_SEMESTER__DEFAULT_COURSES, newDefaultCourses, newDefaultCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNum() {
		return num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum(int newNum) {
		int oldNum = num;
		num = newNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SPECIALIZED_SEMESTER__NUM, oldNum, num));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgrammePackage.SPECIALIZED_SEMESTER__DEFAULT_COURSES:
				return basicSetDefaultCourses(null, msgs);
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
			case StudyProgrammePackage.SPECIALIZED_SEMESTER__DEFAULT_COURSES:
				return getDefaultCourses();
			case StudyProgrammePackage.SPECIALIZED_SEMESTER__NUM:
				return getNum();
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
			case StudyProgrammePackage.SPECIALIZED_SEMESTER__DEFAULT_COURSES:
				setDefaultCourses((CourseGroup)newValue);
				return;
			case StudyProgrammePackage.SPECIALIZED_SEMESTER__NUM:
				setNum((Integer)newValue);
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
			case StudyProgrammePackage.SPECIALIZED_SEMESTER__DEFAULT_COURSES:
				setDefaultCourses((CourseGroup)null);
				return;
			case StudyProgrammePackage.SPECIALIZED_SEMESTER__NUM:
				setNum(NUM_EDEFAULT);
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
			case StudyProgrammePackage.SPECIALIZED_SEMESTER__DEFAULT_COURSES:
				return defaultCourses != null;
			case StudyProgrammePackage.SPECIALIZED_SEMESTER__NUM:
				return num != NUM_EDEFAULT;
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
		result.append(" (num: ");
		result.append(num);
		result.append(')');
		return result.toString();
	}

} //SpecializedSemesterImpl
