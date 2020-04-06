package com.elsevier.eols.ckstudent.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.elsevier.eols.coreframework.DataCreation.NonElsevier.Canvas.UserCreation;
import com.elsevier.eols.coreframework.DataCreation.NonElsevier.RegressionTestData.UserDetails;
import com.elsevier.eols.coreframework.PageObjects.CkStudent.CkStudentInstructor.CreateAQuizPages.InstructorBuildAnAssessmentPage;
import com.elsevier.eols.coreframework.PageObjects.NonElsevier.canvas.CanvasCoursePage;
import com.elsevier.eols.coreframework.PageObjects.NonElsevier.canvas.CanvasLoginPage;
import com.elsevier.eols.coreframework.utilities.*;

public class InstructorAssignmentTests extends BaseTest {
  Map<String, Map<String, List<UserDetails>>> userMap3;
  Map<String, List<UserDetails>> userMap2;
  List<UserDetails> instructorList;
  List<UserDetails> studentList;

  @Test
  public void instructorCreatesAssignment() throws Exception {

    CanvasLoginPage canvasLoginPage = new CanvasLoginPage(driver.get());
    CanvasCoursePage canvasCoursePage = new CanvasCoursePage(driver.get());
    UserCreation userCreation = new UserCreation(driver.get());
    InstructorBuildAnAssessmentPage instructorBuildAnAssessmentPage =
        new InstructorBuildAnAssessmentPage(driver.get());
    userMap3 = new HashMap<>();
    instructorList = new ArrayList<>();
    instructorList = userCreation.createInstructorCanvasUser(1, "testing1", instructorList);
    userMap3 =
        userCreation.createCourseStuds(
            userMap2,
            userMap3,
            instructorList,
            1,
            "testing1",
            "CanvasKey",
            "secret",
            "CKS_Test1.csv");

    for (Map.Entry<String, Map<String, List<UserDetails>>> entry : userMap3.entrySet()) {
      String courseId = entry.getKey();
      userMap2 = entry.getValue();
      for (Map.Entry<String, List<UserDetails>> entry1 : userMap2.entrySet()) {
        String instructorEmail = entry1.getKey();
        System.out.println("++++++++++++++++Instructor email is ++++++++++++" + instructorEmail);
        studentList = new ArrayList<>();
        studentList = entry1.getValue();
        System.out.println("++++++++++++++Student list is ++++++++++++++++" + studentList);
        canvasLoginPage.loginToCanvasCoursePage(courseId, instructorEmail, "testing1");
        canvasCoursePage.launchAppfromCourses();
        instructorBuildAnAssessmentPage.createAssignmentDueTomorrow("sampletest", 3);
      }
    }
  }

  @Test
  public void instructorCreatesAssignmentForOneStu() throws Exception {
    CanvasLoginPage canvasLoginPage = new CanvasLoginPage(driver.get());
    CanvasCoursePage canvasCoursePage = new CanvasCoursePage(driver.get());
    UserCreation userCreation = new UserCreation(driver.get());
    InstructorBuildAnAssessmentPage instructorBuildAnAssessmentPage =
        new InstructorBuildAnAssessmentPage(driver.get());
    userMap3 = new HashMap<>();
    instructorList = new ArrayList<>();
    instructorList = userCreation.createInstructorCanvasUser(1, "testing1", instructorList);
    userMap3 =
        userCreation.createCourseStuds(
            userMap2,
            userMap3,
            instructorList,
            3,
            "testing1",
            "CanvasKey",
            "secret",
            "CKS_Test1.csv");

    for (Map.Entry<String, Map<String, List<UserDetails>>> entry : userMap3.entrySet()) {
      String courseId = entry.getKey();
      userMap2 = entry.getValue();
      for (Map.Entry<String, List<UserDetails>> entry1 : userMap2.entrySet()) {
        String instructorEmail = entry1.getKey();
        System.out.println("++++++++++++++++Instructor email is ++++++++++++" + instructorEmail);
        studentList = new ArrayList<>();
        studentList = entry1.getValue();
        System.out.println("++++++++++++++Student list is ++++++++++++++++" + studentList);
        canvasLoginPage.loginToCanvasCoursePage(courseId, instructorEmail, "testing1");
        canvasCoursePage.launchAppfromCourses();
        instructorBuildAnAssessmentPage.createAssignmentForOneStuDueTomorrow("sampletest", 3);
      }
    }
  }
}
