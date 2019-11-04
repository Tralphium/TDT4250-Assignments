/**
 */
package StudyProgramme.impl;

import StudyProgramme.Course;
import StudyProgramme.CourseGroup;
import StudyProgramme.Semester;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link StudyProgramme.impl.SemesterImpl#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link StudyProgramme.impl.SemesterImpl#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link StudyProgramme.impl.SemesterImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link StudyProgramme.impl.SemesterImpl#getCreditConstraint <em>Credit Constraint</em>}</li>
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
	 * The cached value of the '{@link #getCourseList() <em>Course List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseList()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courseList;

	/**
	 * The cached value of the '{@link #getCourseGroups() <em>Course Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> courseGroups;

	/**
	 * The default value of the '{@link #getTotalCredits() <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalCredits() <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredits()
	 * @generated
	 * @ordered
	 */
	protected float totalCredits = TOTAL_CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final String SEASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected String season = SEASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditConstraint() <em>Credit Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDIT_CONSTRAINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreditConstraint() <em>Credit Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditConstraint()
	 * @generated
	 * @ordered
	 */
	protected int creditConstraint = CREDIT_CONSTRAINT_EDEFAULT;

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
			courseList = new EObjectResolvingEList<Course>(Course.class, this, StudyProgrammePackage.SEMESTER__COURSE_LIST);
		}
		return courseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseGroup> getCourseGroups() {
		if (courseGroups == null) {
			courseGroups = new EObjectContainmentEList<CourseGroup>(CourseGroup.class, this, StudyProgrammePackage.SEMESTER__COURSE_GROUPS);
		}
		return courseGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalCredits() {
		return totalCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCredits(float newTotalCredits) {
		float oldTotalCredits = totalCredits;
		totalCredits = newTotalCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SEMESTER__TOTAL_CREDITS, oldTotalCredits, totalCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeason(String newSeason) {
		String oldSeason = season;
		season = newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SEMESTER__SEASON, oldSeason, season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCreditConstraint() {
		return creditConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditConstraint(int newCreditConstraint) {
		int oldCreditConstraint = creditConstraint;
		creditConstraint = newCreditConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.SEMESTER__CREDIT_CONSTRAINT, oldCreditConstraint, creditConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgrammePackage.SEMESTER__COURSE_GROUPS:
				return ((InternalEList<?>)getCourseGroups()).basicRemove(otherEnd, msgs);
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
			case StudyProgrammePackage.SEMESTER__COURSE_GROUPS:
				return getCourseGroups();
			case StudyProgrammePackage.SEMESTER__TOTAL_CREDITS:
				return getTotalCredits();
			case StudyProgrammePackage.SEMESTER__SEASON:
				return getSeason();
			case StudyProgrammePackage.SEMESTER__CREDIT_CONSTRAINT:
				return getCreditConstraint();
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
			case StudyProgrammePackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				getCourseGroups().addAll((Collection<? extends CourseGroup>)newValue);
				return;
			case StudyProgrammePackage.SEMESTER__TOTAL_CREDITS:
				setTotalCredits((Float)newValue);
				return;
			case StudyProgrammePackage.SEMESTER__SEASON:
				setSeason((String)newValue);
				return;
			case StudyProgrammePackage.SEMESTER__CREDIT_CONSTRAINT:
				setCreditConstraint((Integer)newValue);
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
			case StudyProgrammePackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				return;
			case StudyProgrammePackage.SEMESTER__TOTAL_CREDITS:
				setTotalCredits(TOTAL_CREDITS_EDEFAULT);
				return;
			case StudyProgrammePackage.SEMESTER__SEASON:
				setSeason(SEASON_EDEFAULT);
				return;
			case StudyProgrammePackage.SEMESTER__CREDIT_CONSTRAINT:
				setCreditConstraint(CREDIT_CONSTRAINT_EDEFAULT);
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
			case StudyProgrammePackage.SEMESTER__COURSE_GROUPS:
				return courseGroups != null && !courseGroups.isEmpty();
			case StudyProgrammePackage.SEMESTER__TOTAL_CREDITS:
				return totalCredits != TOTAL_CREDITS_EDEFAULT;
			case StudyProgrammePackage.SEMESTER__SEASON:
				return SEASON_EDEFAULT == null ? season != null : !SEASON_EDEFAULT.equals(season);
			case StudyProgrammePackage.SEMESTER__CREDIT_CONSTRAINT:
				return creditConstraint != CREDIT_CONSTRAINT_EDEFAULT;
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
		result.append(", totalCredits: ");
		result.append(totalCredits);
		result.append(", season: ");
		result.append(season);
		result.append(", creditConstraint: ");
		result.append(creditConstraint);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
