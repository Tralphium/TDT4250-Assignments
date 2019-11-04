/**
 */
package StudyProgramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.Department#getName <em>Name</em>}</li>
 *   <li>{@link StudyProgramme.Department#getCode <em>Code</em>}</li>
 *   <li>{@link StudyProgramme.Department#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link StudyProgramme.Department#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see StudyProgramme.StudyProgrammePackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StudyProgramme.StudyProgrammePackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StudyProgramme.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see StudyProgramme.StudyProgrammePackage#getDepartment_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link StudyProgramme.Department#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgramme.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getDepartment_Programmes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgramme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getDepartment_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

} // Department
