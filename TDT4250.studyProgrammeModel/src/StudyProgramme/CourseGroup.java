/**
 */
package StudyProgramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.CourseGroup#getCoursesInGroup <em>Courses In Group</em>}</li>
 *   <li>{@link StudyProgramme.CourseGroup#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see StudyProgramme.StudyProgrammePackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses In Group</b></em>' reference list.
	 * The list contents are of type {@link StudyProgramme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses In Group</em>' reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getCourseGroup_CoursesInGroup()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getCoursesInGroup();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see StudyProgramme.StudyProgrammePackage#getCourseGroup_Status()
	 * @model required="true"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link StudyProgramme.CourseGroup#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // CourseGroup
