/**
 */
package StudyProgramme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see StudyProgramme.StudyProgrammePackage
 * @generated
 */
public interface StudyProgrammeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyProgrammeFactory eINSTANCE = StudyProgramme.impl.StudyProgrammeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme</em>'.
	 * @generated
	 */
	Programme createProgramme();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semester</em>'.
	 * @generated
	 */
	Semester createSemester();

	/**
	 * Returns a new object of class '<em>Programme Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme Course</em>'.
	 * @generated
	 */
	ProgrammeCourse createProgrammeCourse();

	/**
	 * Returns a new object of class '<em>specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>specialization</em>'.
	 * @generated
	 */
	specialization createspecialization();

	/**
	 * Returns a new object of class '<em>Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Group</em>'.
	 * @generated
	 */
	CourseGroup createCourseGroup();

	/**
	 * Returns a new object of class '<em>Specialized Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialized Semester</em>'.
	 * @generated
	 */
	SpecializedSemester createSpecializedSemester();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StudyProgrammePackage getStudyProgrammePackage();

} //StudyProgrammeFactory
