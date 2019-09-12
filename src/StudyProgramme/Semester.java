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
 *   <li>{@link StudyProgramme.Semester#getSpecialized <em>Specialized</em>}</li>
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
	 * Returns the value of the '<em><b>Course List</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgramme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course List</em>' containment reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getSemester_CourseList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourseList();

	/**
	 * Returns the value of the '<em><b>Specialized</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialized</em>' reference.
	 * @see #setSpecialized(SpecializedSemester)
	 * @see StudyProgramme.StudyProgrammePackage#getSemester_Specialized()
	 * @model
	 * @generated
	 */
	SpecializedSemester getSpecialized();

	/**
	 * Sets the value of the '{@link StudyProgramme.Semester#getSpecialized <em>Specialized</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialized</em>' reference.
	 * @see #getSpecialized()
	 * @generated
	 */
	void setSpecialized(SpecializedSemester value);

} // Semester
