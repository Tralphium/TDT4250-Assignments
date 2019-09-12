/**
 */
package StudyProgramme.impl;

import StudyProgramme.Course;
import StudyProgramme.Semester;
import StudyProgramme.SpecializedSemester;
import StudyProgramme.StudyProgrammePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.impl.SemesterImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link StudyProgramme.impl.SemesterImpl#getCourseList <em>Course List</em>}</li>
 *   <li>{@link StudyProgramme.impl.SemesterImpl#getSpecialized <em>Specialized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseList() <em>Course List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseList()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courseList;

	/**
	 * The cached value of the '{@link #getSpecialized() <em>Specialized</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialized()
	 * @generated
	 * @ordered
	 */
	protected SpecializedSemester specialized;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgrammePackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SEMESTER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourseList() {
		if (courseList == null) {
			courseList = new EObjectContainmentEList<Course>(Course.class, this, StudyProgrammePackage.SEMESTER__COURSE_LIST);
		}
		return courseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecializedSemester getSpecialized() {
		if (specialized != null && specialized.eIsProxy()) {
			InternalEObject oldSpecialized = (InternalEObject)specialized;
			specialized = (SpecializedSemester)eResolveProxy(oldSpecialized);
			if (specialized != oldSpecialized) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyProgrammePackage.SEMESTER__SPECIALIZED, oldSpecialized, specialized));
			}
		}
		return specialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializedSemester basicGetSpecialized() {
		return specialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialized(SpecializedSemester newSpecialized) {
		SpecializedSemester oldSpecialized = specialized;
		specialized = newSpecialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SEMESTER__SPECIALIZED, oldSpecialized, specialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgrammePackage.SEMESTER__COURSE_LIST:
				return ((InternalEList<?>)getCourseList()).basicRemove(otherEnd, msgs);
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
			case StudyProgrammePackage.SEMESTER__NUMBER:
				return getNumber();
			case StudyProgrammePackage.SEMESTER__COURSE_LIST:
				return getCourseList();
			case StudyProgrammePackage.SEMESTER__SPECIALIZED:
				if (resolve) return getSpecialized();
				return basicGetSpecialized();
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
			case StudyProgrammePackage.SEMESTER__NUMBER:
				setNumber((Integer)newValue);
				return;
			case StudyProgrammePackage.SEMESTER__COURSE_LIST:
				getCourseList().clear();
				getCourseList().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyProgrammePackage.SEMESTER__SPECIALIZED:
				setSpecialized((SpecializedSemester)newValue);
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
			case StudyProgrammePackage.SEMESTER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case StudyProgrammePackage.SEMESTER__COURSE_LIST:
				getCourseList().clear();
				return;
			case StudyProgrammePackage.SEMESTER__SPECIALIZED:
				setSpecialized((SpecializedSemester)null);
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
			case StudyProgrammePackage.SEMESTER__NUMBER:
				return number != NUMBER_EDEFAULT;
			case StudyProgrammePackage.SEMESTER__COURSE_LIST:
				return courseList != null && !courseList.isEmpty();
			case StudyProgrammePackage.SEMESTER__SPECIALIZED:
				return specialized != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
