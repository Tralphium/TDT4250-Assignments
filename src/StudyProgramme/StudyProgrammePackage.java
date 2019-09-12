/**
 */
package StudyProgramme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see StudyProgramme.StudyProgrammeFactory
 * @model kind="package"
 * @generated
 */
public interface StudyProgrammePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StudyProgramme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://TDT4250/studyProgrammeModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TDT4250.studyProgrammeModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyProgrammePackage eINSTANCE = StudyProgramme.impl.StudyProgrammePackageImpl.init();

	/**
	 * The meta object id for the '{@link StudyProgramme.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StudyProgramme.impl.ProgrammeImpl
	 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__CODE = 1;

	/**
	 * The feature id for the '<em><b>Programme Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_COURSE = 2;

	/**
	 * The feature id for the '<em><b>Programme Semester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Programme Specializaton</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_SPECIALIZATON = 4;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StudyProgramme.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StudyProgramme.impl.CourseImpl
	 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StudyProgramme.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StudyProgramme.impl.SemesterImpl
	 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Course List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Specialized</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPECIALIZED = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StudyProgramme.impl.ProgrammeCourseImpl <em>Programme Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StudyProgramme.impl.ProgrammeCourseImpl
	 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getProgrammeCourse()
	 * @generated
	 */
	int PROGRAMME_COURSE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_COURSE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Programme Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_COURSE__PROGRAMME_COURSE = 1;

	/**
	 * The number of structural features of the '<em>Programme Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_COURSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Programme Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StudyProgramme.impl.specializationImpl <em>specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StudyProgramme.impl.specializationImpl
	 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getspecialization()
	 * @generated
	 */
	int SPECIALIZATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specialization Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SPECIALIZATION_COURSE = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__COURSE = 2;

	/**
	 * The number of structural features of the '<em>specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StudyProgramme.impl.CourseGroupImpl <em>Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StudyProgramme.impl.CourseGroupImpl
	 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getCourseGroup()
	 * @generated
	 */
	int COURSE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Courses In Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__COURSES_IN_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__NAME = 1;

	/**
	 * The number of structural features of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StudyProgramme.impl.SpecializedSemesterImpl <em>Specialized Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StudyProgramme.impl.SpecializedSemesterImpl
	 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getSpecializedSemester()
	 * @generated
	 */
	int SPECIALIZED_SEMESTER = 6;

	/**
	 * The feature id for the '<em><b>Default Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_SEMESTER__DEFAULT_COURSES = 0;

	/**
	 * The feature id for the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_SEMESTER__NUM = 1;

	/**
	 * The number of structural features of the '<em>Specialized Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_SEMESTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specialized Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_SEMESTER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link StudyProgramme.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see StudyProgramme.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StudyProgramme.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.Programme#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see StudyProgramme.Programme#getCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link StudyProgramme.Programme#getProgrammeCourse <em>Programme Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programme Course</em>'.
	 * @see StudyProgramme.Programme#getProgrammeCourse()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_ProgrammeCourse();

	/**
	 * Returns the meta object for the containment reference list '{@link StudyProgramme.Programme#getProgrammeSemester <em>Programme Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programme Semester</em>'.
	 * @see StudyProgramme.Programme#getProgrammeSemester()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_ProgrammeSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link StudyProgramme.Programme#getProgrammeSpecializaton <em>Programme Specializaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programme Specializaton</em>'.
	 * @see StudyProgramme.Programme#getProgrammeSpecializaton()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_ProgrammeSpecializaton();

	/**
	 * Returns the meta object for class '{@link StudyProgramme.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see StudyProgramme.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StudyProgramme.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see StudyProgramme.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see StudyProgramme.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for class '{@link StudyProgramme.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see StudyProgramme.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.Semester#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see StudyProgramme.Semester#getNumber()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link StudyProgramme.Semester#getCourseList <em>Course List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course List</em>'.
	 * @see StudyProgramme.Semester#getCourseList()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_CourseList();

	/**
	 * Returns the meta object for the reference '{@link StudyProgramme.Semester#getSpecialized <em>Specialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialized</em>'.
	 * @see StudyProgramme.Semester#getSpecialized()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Specialized();

	/**
	 * Returns the meta object for class '{@link StudyProgramme.ProgrammeCourse <em>Programme Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme Course</em>'.
	 * @see StudyProgramme.ProgrammeCourse
	 * @generated
	 */
	EClass getProgrammeCourse();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.ProgrammeCourse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see StudyProgramme.ProgrammeCourse#getStatus()
	 * @see #getProgrammeCourse()
	 * @generated
	 */
	EAttribute getProgrammeCourse_Status();

	/**
	 * Returns the meta object for the reference '{@link StudyProgramme.ProgrammeCourse#getProgrammeCourse <em>Programme Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme Course</em>'.
	 * @see StudyProgramme.ProgrammeCourse#getProgrammeCourse()
	 * @see #getProgrammeCourse()
	 * @generated
	 */
	EReference getProgrammeCourse_ProgrammeCourse();

	/**
	 * Returns the meta object for class '{@link StudyProgramme.specialization <em>specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>specialization</em>'.
	 * @see StudyProgramme.specialization
	 * @generated
	 */
	EClass getspecialization();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StudyProgramme.specialization#getName()
	 * @see #getspecialization()
	 * @generated
	 */
	EAttribute getspecialization_Name();

	/**
	 * Returns the meta object for the reference '{@link StudyProgramme.specialization#getSpecializationCourse <em>Specialization Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialization Course</em>'.
	 * @see StudyProgramme.specialization#getSpecializationCourse()
	 * @see #getspecialization()
	 * @generated
	 */
	EReference getspecialization_SpecializationCourse();

	/**
	 * Returns the meta object for the reference list '{@link StudyProgramme.specialization#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see StudyProgramme.specialization#getCourse()
	 * @see #getspecialization()
	 * @generated
	 */
	EReference getspecialization_Course();

	/**
	 * Returns the meta object for class '{@link StudyProgramme.CourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Group</em>'.
	 * @see StudyProgramme.CourseGroup
	 * @generated
	 */
	EClass getCourseGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link StudyProgramme.CourseGroup#getCoursesInGroup <em>Courses In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses In Group</em>'.
	 * @see StudyProgramme.CourseGroup#getCoursesInGroup()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_CoursesInGroup();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.CourseGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StudyProgramme.CourseGroup#getName()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_Name();

	/**
	 * Returns the meta object for class '{@link StudyProgramme.SpecializedSemester <em>Specialized Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialized Semester</em>'.
	 * @see StudyProgramme.SpecializedSemester
	 * @generated
	 */
	EClass getSpecializedSemester();

	/**
	 * Returns the meta object for the containment reference '{@link StudyProgramme.SpecializedSemester#getDefaultCourses <em>Default Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Courses</em>'.
	 * @see StudyProgramme.SpecializedSemester#getDefaultCourses()
	 * @see #getSpecializedSemester()
	 * @generated
	 */
	EReference getSpecializedSemester_DefaultCourses();

	/**
	 * Returns the meta object for the attribute '{@link StudyProgramme.SpecializedSemester#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num</em>'.
	 * @see StudyProgramme.SpecializedSemester#getNum()
	 * @see #getSpecializedSemester()
	 * @generated
	 */
	EAttribute getSpecializedSemester_Num();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyProgrammeFactory getStudyProgrammeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link StudyProgramme.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StudyProgramme.impl.ProgrammeImpl
		 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__CODE = eINSTANCE.getProgramme_Code();

		/**
		 * The meta object literal for the '<em><b>Programme Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__PROGRAMME_COURSE = eINSTANCE.getProgramme_ProgrammeCourse();

		/**
		 * The meta object literal for the '<em><b>Programme Semester</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__PROGRAMME_SEMESTER = eINSTANCE.getProgramme_ProgrammeSemester();

		/**
		 * The meta object literal for the '<em><b>Programme Specializaton</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__PROGRAMME_SPECIALIZATON = eINSTANCE.getProgramme_ProgrammeSpecializaton();

		/**
		 * The meta object literal for the '{@link StudyProgramme.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StudyProgramme.impl.CourseImpl
		 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '{@link StudyProgramme.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StudyProgramme.impl.SemesterImpl
		 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NUMBER = eINSTANCE.getSemester_Number();

		/**
		 * The meta object literal for the '<em><b>Course List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSE_LIST = eINSTANCE.getSemester_CourseList();

		/**
		 * The meta object literal for the '<em><b>Specialized</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SPECIALIZED = eINSTANCE.getSemester_Specialized();

		/**
		 * The meta object literal for the '{@link StudyProgramme.impl.ProgrammeCourseImpl <em>Programme Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StudyProgramme.impl.ProgrammeCourseImpl
		 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getProgrammeCourse()
		 * @generated
		 */
		EClass PROGRAMME_COURSE = eINSTANCE.getProgrammeCourse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME_COURSE__STATUS = eINSTANCE.getProgrammeCourse_Status();

		/**
		 * The meta object literal for the '<em><b>Programme Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_COURSE__PROGRAMME_COURSE = eINSTANCE.getProgrammeCourse_ProgrammeCourse();

		/**
		 * The meta object literal for the '{@link StudyProgramme.impl.specializationImpl <em>specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StudyProgramme.impl.specializationImpl
		 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getspecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getspecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getspecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Specialization Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SPECIALIZATION_COURSE = eINSTANCE.getspecialization_SpecializationCourse();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__COURSE = eINSTANCE.getspecialization_Course();

		/**
		 * The meta object literal for the '{@link StudyProgramme.impl.CourseGroupImpl <em>Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StudyProgramme.impl.CourseGroupImpl
		 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getCourseGroup()
		 * @generated
		 */
		EClass COURSE_GROUP = eINSTANCE.getCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Courses In Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__COURSES_IN_GROUP = eINSTANCE.getCourseGroup_CoursesInGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__NAME = eINSTANCE.getCourseGroup_Name();

		/**
		 * The meta object literal for the '{@link StudyProgramme.impl.SpecializedSemesterImpl <em>Specialized Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StudyProgramme.impl.SpecializedSemesterImpl
		 * @see StudyProgramme.impl.StudyProgrammePackageImpl#getSpecializedSemester()
		 * @generated
		 */
		EClass SPECIALIZED_SEMESTER = eINSTANCE.getSpecializedSemester();

		/**
		 * The meta object literal for the '<em><b>Default Courses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZED_SEMESTER__DEFAULT_COURSES = eINSTANCE.getSpecializedSemester_DefaultCourses();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZED_SEMESTER__NUM = eINSTANCE.getSpecializedSemester_Num();

	}

} //StudyProgrammePackage
