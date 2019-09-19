/**
 */
package StudyProgramme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialized Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.SpecializedSemester#getDefaultCourses <em>Default Courses</em>}</li>
 *   <li>{@link StudyProgramme.SpecializedSemester#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see StudyProgramme.StudyProgrammePackage#getSpecializedSemester()
 * @model
 * @generated
 */
public interface SpecializedSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Courses</em>' containment reference.
	 * @see #setDefaultCourses(CourseGroup)
	 * @see StudyProgramme.StudyProgrammePackage#getSpecializedSemester_DefaultCourses()
	 * @model containment="true"
	 * @generated
	 */
	CourseGroup getDefaultCourses();

	/**
	 * Sets the value of the '{@link StudyProgramme.SpecializedSemester#getDefaultCourses <em>Default Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Courses</em>' containment reference.
	 * @see #getDefaultCourses()
	 * @generated
	 */
	void setDefaultCourses(CourseGroup value);

	/**
	 * Returns the value of the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' attribute.
	 * @see #setNum(int)
	 * @see StudyProgramme.StudyProgrammePackage#getSpecializedSemester_Num()
	 * @model
	 * @generated
	 */
	int getNum();

	/**
	 * Sets the value of the '{@link StudyProgramme.SpecializedSemester#getNum <em>Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' attribute.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(int value);

} // SpecializedSemester
