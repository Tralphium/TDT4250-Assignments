/**
 */
package StudyProgramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.Programme#getName <em>Name</em>}</li>
 *   <li>{@link StudyProgramme.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link StudyProgramme.Programme#getProgrammeSemester <em>Programme Semester</em>}</li>
 *   <li>{@link StudyProgramme.Programme#getProgrammeSpecializaton <em>Programme Specializaton</em>}</li>
 *   <li>{@link StudyProgramme.Programme#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see StudyProgramme.StudyProgrammePackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StudyProgramme.StudyProgrammePackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StudyProgramme.Programme#getName <em>Name</em>}' attribute.
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
	 * @see StudyProgramme.StudyProgrammePackage#getProgramme_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link StudyProgramme.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Programme Semester</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgramme.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Semester</em>' containment reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getProgramme_ProgrammeSemester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getProgrammeSemester();

	/**
	 * Returns the value of the '<em><b>Programme Specializaton</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgramme.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Specializaton</em>' containment reference list.
	 * @see StudyProgramme.StudyProgrammePackage#getProgramme_ProgrammeSpecializaton()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getProgrammeSpecializaton();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see StudyProgramme.StudyProgrammePackage#getProgramme_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link StudyProgramme.Programme#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // Programme
