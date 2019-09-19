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
 *   <li>{@link StudyProgramme.CourseGroup#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see StudyProgramme.StudyProgrammePackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses In Group</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgramme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses In Group</em>' containment reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getCourseGroup_CoursesInGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCoursesInGroup();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StudyProgramme.StudyProgrammePackage#getCourseGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StudyProgramme.CourseGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CourseGroup
