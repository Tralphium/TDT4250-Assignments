/**
 */
package StudyProgramme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.ProgrammeCourse#getStatus <em>Status</em>}</li>
 *   <li>{@link StudyProgramme.ProgrammeCourse#getProgrammeCourse <em>Programme Course</em>}</li>
 * </ul>
 *
 * @see StudyProgramme.StudyProgrammePackage#getProgrammeCourse()
 * @model
 * @generated
 */
public interface ProgrammeCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see StudyProgramme.StudyProgrammePackage#getProgrammeCourse_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link StudyProgramme.ProgrammeCourse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Programme Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Course</em>' reference.
	 * @see #setProgrammeCourse(Course)
	 * @see StudyProgramme.StudyProgrammePackage#getProgrammeCourse_ProgrammeCourse()
	 * @model required="true"
	 * @generated
	 */
	Course getProgrammeCourse();

	/**
	 * Sets the value of the '{@link StudyProgramme.ProgrammeCourse#getProgrammeCourse <em>Programme Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Course</em>' reference.
	 * @see #getProgrammeCourse()
	 * @generated
	 */
	void setProgrammeCourse(Course value);

} // ProgrammeCourse
