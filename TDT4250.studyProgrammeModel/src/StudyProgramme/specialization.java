/**
 */
package StudyProgramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.specialization#getName <em>Name</em>}</li>
 *   <li>{@link StudyProgramme.specialization#getSpecializationCourse <em>Specialization Course</em>}</li>
 *   <li>{@link StudyProgramme.specialization#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see StudyProgramme.StudyProgrammePackage#getspecialization()
 * @model
 * @generated
 */
public interface specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StudyProgramme.StudyProgrammePackage#getspecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StudyProgramme.specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialization Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization Course</em>' reference.
	 * @see #setSpecializationCourse(Course)
	 * @see StudyProgramme.StudyProgrammePackage#getspecialization_SpecializationCourse()
	 * @model
	 * @generated
	 */
	Course getSpecializationCourse();

	/**
	 * Sets the value of the '{@link StudyProgramme.specialization#getSpecializationCourse <em>Specialization Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization Course</em>' reference.
	 * @see #getSpecializationCourse()
	 * @generated
	 */
	void setSpecializationCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link StudyProgramme.SpecializedSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getspecialization_Course()
	 * @model required="true"
	 * @generated
	 */
	EList<SpecializedSemester> getCourse();

} // specialization
