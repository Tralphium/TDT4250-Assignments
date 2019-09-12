/**
 */
package StudyProgramme.impl;

import StudyProgramme.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyProgrammeFactoryImpl extends EFactoryImpl implements StudyProgrammeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StudyProgrammeFactory init() {
		try {
			StudyProgrammeFactory theStudyProgrammeFactory = (StudyProgrammeFactory)EPackage.Registry.INSTANCE.getEFactory(StudyProgrammePackage.eNS_URI);
			if (theStudyProgrammeFactory != null) {
				return theStudyProgrammeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StudyProgrammeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgrammeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StudyProgrammePackage.PROGRAMME: return createProgramme();
			case StudyProgrammePackage.COURSE: return createCourse();
			case StudyProgrammePackage.SEMESTER: return createSemester();
			case StudyProgrammePackage.PROGRAMME_COURSE: return createProgrammeCourse();
			case StudyProgrammePackage.SPECIALIZATION: return createspecialization();
			case StudyProgrammePackage.COURSE_GROUP: return createCourseGroup();
			case StudyProgrammePackage.SPECIALIZED_SEMESTER: return createSpecializedSemester();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeCourse createProgrammeCourse() {
		ProgrammeCourseImpl programmeCourse = new ProgrammeCourseImpl();
		return programmeCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public specialization createspecialization() {
		specializationImpl specialization = new specializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroup createCourseGroup() {
		CourseGroupImpl courseGroup = new CourseGroupImpl();
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecializedSemester createSpecializedSemester() {
		SpecializedSemesterImpl specializedSemester = new SpecializedSemesterImpl();
		return specializedSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyProgrammePackage getStudyProgrammePackage() {
		return (StudyProgrammePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StudyProgrammePackage getPackage() {
		return StudyProgrammePackage.eINSTANCE;
	}

} //StudyProgrammeFactoryImpl
