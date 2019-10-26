/**
 */
package StudyProgramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.Semester#getNumber <em>Number</em>}</li>
 *   <li>{@link StudyProgramme.Semester#getCourseList <em>Course List</em>}</li>
 *   <li>{@link StudyProgramme.Semester#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link StudyProgramme.Semester#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link StudyProgramme.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link StudyProgramme.Semester#getCreditConstraint <em>Credit Constraint</em>}</li>
 * </ul>
 *
 * @see StudyProgramme.StudyProgrammePackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see StudyProgramme.StudyProgrammePackage#getSemester_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link StudyProgramme.Semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course List</b></em>' reference list.
	 * The list contents are of type {@link StudyProgramme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course List</em>' reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getSemester_CourseList()
	 * @model
	 * @generated
	 */
	EList<Course> getCourseList();

	/**
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgramme.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getSemester_CourseGroups()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

	/**
	 * Returns the value of the '<em><b>Total Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Credits</em>' attribute.
	 * @see #setTotalCredits(float)
	 * @see StudyProgramme.StudyProgrammePackage#getSemester_TotalCredits()
	 * @model
	 * @generated
	 */
	float getTotalCredits();

	/**
	 * Sets the value of the '{@link StudyProgramme.Semester#getTotalCredits <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Credits</em>' attribute.
	 * @see #getTotalCredits()
	 * @generated
	 */
	void setTotalCredits(float value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see #setSeason(String)
	 * @see StudyProgramme.StudyProgrammePackage#getSemester_Season()
	 * @model
	 * @generated
	 */
	String getSeason();

	/**
	 * Sets the value of the '{@link StudyProgramme.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(String value);

	/**
	 * Returns the value of the '<em><b>Credit Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Constraint</em>' attribute.
	 * @see #setCreditConstraint(int)
	 * @see StudyProgramme.StudyProgrammePackage#getSemester_CreditConstraint()
	 * @model dataType="StudyProgramme.credits"
	 * @generated
	 */
	int getCreditConstraint();

	/**
	 * Sets the value of the '{@link StudyProgramme.Semester#getCreditConstraint <em>Credit Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Constraint</em>' attribute.
	 * @see #getCreditConstraint()
	 * @generated
	 */
	void setCreditConstraint(int value);

} // Semester
