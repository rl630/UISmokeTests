package com.elsevier.eols.coreframework.PageObjects.CkStudent.CkStudentInstructor.CreateAQuizPages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.elsevier.eols.coreframework.PageObjects.NonElsevier.BasePage;
import com.elsevier.eols.coreframework.utilities.Driver;
import com.elsevier.eols.coreframework.utilities.DriverUtilities;
import com.elsevier.eols.coreframework.utilities.Utilities;

public class InstructorBuildAnAssessmentPage extends BasePage {

  @FindBy(id = "cancelAssignment")
  WebElement cancelButton;

  @FindBy(xpath = "//span[contains(text(),'Build an Assessment')]")
  WebElement buildAnAssessmentBtn;

  @FindBy(css = "[id*='field-input-assessmentName']")
  WebElement assignmentTextBox;

  @FindBy(xpath = "//div[contains(@class, 'c-els-field__message')]")
  WebElement assignmentErrorMsg;

  @FindBy(xpath = "//span[text()='Random selection']")
  WebElement randomSelectionRadio;

  @FindBy(css = "select[id*='field-input-questionBank']")
  WebElement questionSetDropDown;

  @FindBy(css = "select[id*='field-input-topicOrganization']")
  WebElement taxonomyDropDown;

  @FindBy(css = "[id*='field-input-date-assessmentAvailableDate']")
  WebElement startDateInput;

  @FindBy(css = "[id*='field-input-date-assessmentDueTime']")
  WebElement dueDateInput;

  @FindBy(id = "assignAssessmentButton")
  WebElement assignBtn;

  @FindBy(xpath = "//label[input[@value='STUDENT']]")
  WebElement someStudentsRadio;

  @FindBy(xpath = "//label[input[contains(@name,'topic')]]")
  List<WebElement> topics;

  @FindBy(xpath = "//label[input[contains(@name,'student')][@type='checkbox']]")
  List<WebElement> students;

  @FindBy(id = "navBottomBack")
  WebElement backButton;

  @FindBy(xpath = "//div[@id='field-wrap-customOption']//p")
  WebElement customSelectionText;

  @FindBy(xpath = "//*[contains(text(), 'Random selection')]//following-sibling::p")
  WebElement randomSelectionText;

  @FindBy(xpath = "//*[contains(@name, 'randomOption')]")
  WebElement randomSelectionRadioBtn;

  @FindBy(id = "field-input-customOption")
  WebElement customSelectionRadioBtn;

  @FindBy(xpath = "//div[@class='c-header-navigation__icon-wrapper o-els-flex-layout__item']")
  WebElement closeBuildAssessmentPage;

  @FindBy(name = "assessmentDueTime_time_hour")
  private WebElement dueHourSelectInput;

  @FindBy(name = "assessmentDueTime_time_minute")
  private WebElement dueMinSelectInput;

  @FindBy(css = "[id*='field-wrap-incrementHour-time-assessmentDueTime'] [title='Chevron Up']")
  private WebElement dueHourIconUp;

  @FindBy(css = "[id*='field-wrap-incrementHour-time-assessmentDueTime'] [title='Chevron Down']")
  private WebElement dueHourIconDown;

  @FindBy(css = "[id*='field-wrap-incrementMinute-time-assessmentDueTime'] [title='Chevron Up']")
  private WebElement dueMinIconUp;

  @FindBy(css = "[id*='field-wrap-incrementMinute-time-assessmentDueTime'] [title='Chevron Down']")
  private WebElement dueMinIconDown;

  @FindBy(id = "addQuestions")
  private WebElement addQuestionsBtn;

  @FindBy(css = "[class*='group__item']")
  List<WebElement> tabList;

  @FindBy(css = "#listQuestion b")
  private WebElement questionAmount;

  @FindBy(css = "div[class*='sub-topics'] div")
  WebElement filtersArea;

  @FindBy(css = "div[class*='sub-topics'] span[class*='text']")
  List<WebElement> filtersOptions;

  @FindBy(xpath = "//div[@id='listQuestion']//button")
  private List<WebElement> listQuestion;

  @FindBy(id = "listQuestion")
  private WebElement listQuestionSection;

  @FindBy(id = "selectQuestionDoneButton")
  private WebElement selectQuestionDoneBtn;

  @FindBy(xpath = "//div[@id='selectQuestionModal']//button[@id='cancelAssignment']")
  WebElement cancelAssignmentButton;

  @FindBy(xpath = "//span[@class='assessment__question-option-summary-count']")
  WebElement addedQuestionText;

  @FindBy(xpath = "//span[contains(text(),'View Question')]")
  private WebElement viewQuestionsLink;

  @FindBy(xpath = "//div[@class='o-els-flex-layout__item']/button[@id='cancelModalButton']")
  WebElement cancelPopupButton;

  @FindBy(xpath = "//div[@id='questionDetailsModal']/div/div/div")
  List<WebElement> viewFullQuestion;

  @FindBy(
    xpath =
        "//p[contains(text(),'Assign to all students enrolled in this course, now or in the future.')]"
  )
  private WebElement assignToAll;

  @FindBy(xpath = "//div[@class='o-els-flex-layout__item u-els-padding-top-1o2']")
  private WebElement studentsPicto;

  @FindBy(xpath = "//h2[contains(text(),'All students')]")
  private WebElement allStudentLabel;

  @FindBy(xpath = "//div[@class='u-els-line-height-single']")
  private WebElement nameOfTheCourse;

  @FindBy(id = "editAssignees")
  private WebElement editAssigneeBtn;

  @FindBy(name = "questionBank")
  private WebElement customQuestionSetDropDown;

  @FindBy(name = "instructorQuestionBank")
  private WebElement randomQuestionSetDropDown;

  @FindBy(id = "addTopics")
  private WebElement addTopicsBtn;

  @FindBy(xpath = "//label[@class='c-els-field__label']/span/h3")
  private WebElement NameAssessmentLabel;

  @FindBy(id = "field-input-assessmentName")
  WebElement NameAssessmentTextBox;

  @FindBy(xpath = "//div[contains(text(),'Letters and Numbers Only')]")
  private WebElement LettersAndNumbersText;

  @FindBy(css = "[id*='field-input-assessmentName']")
  WebElement assessmentNameTextBox;

  @FindBy(xpath = "//h4[@class='u-els-padding-top-1o4 u-els-padding-bottom-1o4']")
  List<WebElement> numberOfTopics;

  @FindBy(xpath = "//div[@class='assessment__select-topic']//p")
  WebElement selectTotalTopic;

  @FindBy(id = "c-els-modal__button-selectStudentModalId--cancel")
  WebElement warningCancelBtn;

  @FindBy(id = "c-els-modal__button-selectStudentModalId--confirm")
  WebElement warningContinueBtn;

  @FindBy(xpath = "//span[contains(text(),'Only selected students will be assigned')]")
  private WebElement WarningSelectStudentMessage;

  @FindBy(id = "field-input-studentSelectAll")
  WebElement allCourseStudentsRadioBtn;

  @FindBy(
    xpath =
        "//div[@class='c-els-modal__window u-els-width-1o2 u-els-width-1o1@tablet u-els-padding-1x1o2 u-els-padding-3o4@mobile']"
  )
  WebElement warningMsg;

  @FindBy(xpath = "//span[text()='Choose questions']")
  WebElement chooseQuestionRadioBtn;

  @FindBy(id = "field-input-studentNameFilter")
  private WebElement studentNameFilterTextBox;

  @FindBy(id = "selectStudentDoneButton")
  private WebElement selectStudentsDoneBtn;

  @FindBy(id = "selectStudentDoneButton")
  private List<WebElement> studentDoneButton;

  @FindBy(id = "field-input-studentSelectSome")
  private WebElement selectSomeStuBtn;

  @FindBy(css = "[id*='field-input']")
  private WebElement specificStudent;

  @FindBy(id = "selectStudentDoneButton")
  private WebElement selectStudentDoneButton;

  DriverUtilities du = new DriverUtilities(driver);
  CkStudentAddQuestionsPage CkStudentAddQuestionsPage;

  public static final String CREATE_QUIZ_DATE_FORMAT = "dd/MM/YYYY";
  private final String DATE_REGEX = "(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])/\\d{4}";

  /**
   * CreateAQuizPageInstructor constructor.
   *
   * <p>Uses superclass BasePage constructor.
   *
   * @param driver the {@link Driver} instance used to create page object
   */
  public InstructorBuildAnAssessmentPage(Driver driver) {
    super(driver);
    CkStudentAddQuestionsPage = new CkStudentAddQuestionsPage(driver);
  }

  /** Clicks the cancel button */
  public void clickCancel() {
    driver.waitFor(cancelButton).click();
    LOGGER.info("Clicked the cancel button");
  }

  /** Clicks create a quiz assignment button */
  public void clickBuildAnAssessmentBtn() {
    driver.waitFor(buildAnAssessmentBtn).click();
    LOGGER.info("Clicked the create quiz assignment");
  }

  /**
   * Enters the assignment name
   *
   * @param assignmentName String
   */
  public void enterAssignmentName(String assignmentName) {
    assignmentTextBox.sendKeys(assignmentName);
  }

  /**
   * Displays the Error message
   *
   * @return boolean
   */
  public String validateAssignmentNameErrorMsg() {
    String warning = assignmentErrorMsg.getText();
    LOGGER.info("Found error message: " + warning);
    return warning;
  }

  /**
   * Validates the Error message
   *
   * @param expectedMessage String
   * @return boolean Returns true if found an error message
   */
  public boolean validateErrorMessageIsGone(String expectedMessage) {
    driver.waitForAngularJSReady();
    if (driver.getPageSource().contains(expectedMessage)) {
      LOGGER.info("Found error message");
      return true;
    }
    LOGGER.info("Did not find any error message");
    return false;
  }

  /** Sets random selection option */
  public void setRandomSelection() {
    driver.waitFor(randomSelectionRadio).click();
    LOGGER.info("Set random selection option");
  }

  /** Selects the first question set */
  public void selectFirstQuestionSet() {
    Select dropDown = new Select(questionSetDropDown);
    if (!dropDown.getOptions().isEmpty()) {
      dropDown.selectByIndex(0);
      LOGGER.info("Selected the first question set");
    }
  }

  /** Selects the first topic organization */
  public void selectFirstTopicOrganization() {
    Select dropDown = new Select(taxonomyDropDown);
    if (!dropDown.getOptions().isEmpty()) {
      dropDown.selectByIndex(0);
      LOGGER.info("Selected the first topic organization");
    }
  }

  /** Selects the first topic */
  public void selectFirstTopic() {
    driver.waitForAngularJSReady();
    if (!topics.isEmpty()) {
      topics.get(0).click();
      LOGGER.info("Selected the first topic");
    }
  }

  /**
   * Sets the due date
   *
   * @param date date String in format "MM/dd/yyyy"
   */
  public void setDueDate(String date) throws SkipException {
    setDate(dueDateInput, date);
  }

  /**
   * Sets the available from date
   *
   * @param date date String in format "MM/dd/yyyy"
   */
  public void setAvailableFromDate(String date) throws SkipException {
    setDate(startDateInput, date);
  }

  /**
   * Returns true if 'Assign Assessment' button is enabled
   *
   * @return boolean
   */
  public boolean isAssignAssessmentEnabled() {
    boolean isEnabled = driver.waitFor(assignBtn).isEnabled();
    LOGGER.info(
        "Checked that 'Assign Assessment' button is " + (isEnabled ? "enabled" : "disabled"));
    return isEnabled;
  }

  /** Sets some students option */
  public void setSomeStudents() {
    driver.waitFor(someStudentsRadio).click();
    LOGGER.info("Set some students option");
  }

  /** Selects the first available student */
  public void selectTheFirstStudent() {
    driver.waitForAngularJSReady();
    if (!students.isEmpty()) {
      students.get(0).click();
      LOGGER.info("Selected the first student");
    }
  }

  /**
   * Displays the custom selection text message
   *
   * @return String - text for custom selection
   */
  public String validateCustomSelectionText() {
    String customSelectionTextMsg = driver.waitFor(customSelectionText).getText();
    LOGGER.info("Found Custom Selection Text Message: " + customSelectionTextMsg);
    return customSelectionTextMsg;
  }

  /**
   * Displays the random selection text message
   *
   * @return String - Text for random selection button
   */
  public String validateRandomSelectionText() {
    String randomSelectionTextMsg = driver.waitFor(randomSelectionText).getText();
    LOGGER.info("Found Random Selection Text Message: " + randomSelectionTextMsg);
    return randomSelectionTextMsg;
  }

  /**
   * Displays the random selection radio button
   *
   * @return boolean - true if random selection radio btn is selected
   */
  public boolean validateRandomSelectionRadioButton() {
    boolean randomSelectionRadioBtn = driver.waitFor(randomSelectionRadio).isSelected();
    LOGGER.info("Found Random Selection Text Message: " + randomSelectionRadioBtn);
    return randomSelectionRadioBtn;
  }

  /**
   * Displays Custom selection radio button
   *
   * @return boolean - true if the custom radio btn is selected
   */
  public boolean validateCustomSelectionRadioButton() {
    boolean selected = customSelectionRadioBtn.isSelected();
    LOGGER.info("Found Custom Selection Text Message: " + selected);
    return selected;
  }

  /**
   * Return true if all elements are displayed in Available Date section, false otherwise
   *
   * @return boolean
   */
  public boolean verifyAvailableDateSectionElements() {
    driver.waitUntilJSReady();
    WebElement ancestor =
        startDateInput.findElement(By.xpath(".//ancestor::div[contains(@class,'text-left')]"));
    return Stream.of(
            ancestor.findElement(By.xpath(".//h3")),
            ancestor.findElement(By.xpath(".//p")),
            ancestor.findElement(By.xpath(".//*[contains(@class, 'datepicker')]")),
            ancestor.findElement(By.xpath(".//*[local-name() = 'svg'][contains(@class,'c-els')]")),
            ancestor.findElement(By.xpath(".//select[contains(@id,'Hour')]")),
            ancestor.findElement(
                By.xpath(".//div[contains(@id,'Hour')]//div[contains(@class,'up')]")),
            ancestor.findElement(
                By.xpath(".//div[contains(@id,'Hour')]//div[contains(@class,'down')]")),
            ancestor.findElement(By.xpath(".//select[contains(@id,'Min')]")),
            ancestor.findElement(
                By.xpath(".//div[contains(@id,'Min')]//div[contains(@class,'up')]")),
            ancestor.findElement(
                By.xpath(".//div[contains(@id,'Min')]//div[contains(@class,'down')]")),
            ancestor.findElement(By.xpath(".//button")))
        .peek(
            e ->
                LOGGER.info(
                    String.format("Element %s is %s displayed", e, e.isDisplayed() ? "" : "not")))
        .allMatch(WebElement::isDisplayed);
  }

  /** Clicks 'Up' icon for due hours */
  public void clickUpIconForDueHours() {
    dueHourIconUp.click();
  }

  /** Clicks 'Down' icon for due hours */
  public void clickDownIconForDueHours() {
    dueHourIconDown.click();
  }

  /** Clicks 'Up' icon for due minutes */
  public void clickUpIconForDueMinutes() {
    dueMinIconUp.click();
  }

  /** Clicks 'Down' icon for due minutes */
  public void clickDownIconForDueMinutes() {
    dueMinIconDown.click();
  }

  /**
   * Returns current due hour
   *
   * @return int
   */
  public int getCurrentDueHour() {
    return Integer.valueOf(du.getSelectedComboboxItemText(dueHourSelectInput));
  }

  /**
   * Returns current due minute
   *
   * @return int
   */
  public int getCurrentDueMinute() {
    return Integer.valueOf(du.getSelectedComboboxItemText(dueMinSelectInput));
  }

  /**
   * Retrieves a text of active tab header
   *
   * @return String - active tab header
   * @throws Exception
   */
  public String getActiveTabText() throws Exception {
    return tabList
        .stream()
        .filter(we -> we.getAttribute("class").contains("active"))
        .peek(we -> LOGGER.info(String.format("Active tab is %s", we.getText())))
        .findFirst()
        .orElseThrow(Exception::new)
        .getText();
  }

  /**
   * Retrieves the number of questions available from a page
   *
   * @return int - number of questions
   */
  public int getAmountOfQuestionsAvailable() {
    driver.waitUntilJSReady();
    int amount = Integer.parseInt(questionAmount.getText().replace(",", ""));
    LOGGER.info(String.format("Actual amount of questions available is %s", amount));
    return amount;
  }

  /**
   * Retrieves the selected question set
   *
   * @return String
   */
  public String getQuestionSet() {
    driver.waitUntilJSReady();
    return new Select(questionSetDropDown).getFirstSelectedOption().getText();
  }

  /**
   * Retrieves the selected Topic Organisation
   *
   * @return String
   */
  public String getSelectedTopic() {
    driver.waitUntilJSReady();
    return new Select(taxonomyDropDown).getFirstSelectedOption().getText();
  }

  /**
   * Returns true if Topic checkboxes are visible, false otherwise
   *
   * @return boolean
   */
  public boolean verifyTopicsVisibility() {
    driver.waitUntilJSReady();
    boolean displayed = !filtersOptions.isEmpty();
    LOGGER.info("Verify filters are visibile: " + displayed);
    return displayed;
  }

  /**
   * Select Question set by index, wait while pageLoader is displayed
   *
   * @param i - int, index, starts from 0
   */
  public void selectQuestionSet(int i) {
    new Select(questionSetDropDown).selectByIndex(i);
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(
        ExpectedConditions.invisibilityOfElementLocated(
            By.cssSelector("div[class*='c-els-page']")));
    driver.waitUntilJSReady();
  }

  /**
   * Select Topic organisation by index, wait while pageLoader is displayed
   *
   * @param i - int, index, starts from 0
   */
  public void selectTopic(int i) {
    new Select(taxonomyDropDown).selectByIndex(i);
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(
        ExpectedConditions.invisibilityOfElementLocated(
            By.cssSelector("div[class*='c-els-page']")));
    driver.waitUntilJSReady();
  }

  /**
   * Retrieves the list of visible Topic checkboxes
   *
   * @return List<String> - list of visible topic titles
   */
  public List<String> getListOfVisibleTopicsOptions() {
    driver.waitUntilJSReady();
    return filtersOptions
        .stream()
        .map(e -> e.findElement(By.xpath(".//ancestor::div[contains(@class,'1o2')]")))
        .filter(WebElement::isDisplayed)
        .map(WebElement::getText)
        .map(String::trim)
        .peek(s -> LOGGER.info(String.format("Retrieved filter option: %s", s)))
        .collect(Collectors.toList());
  }

  /** Click Add questions button */
  public void clickAddQuestions() {
    addQuestionsBtn.click();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(
        ExpectedConditions.invisibilityOfElementLocated(
            By.cssSelector("div[class*='c-els-page']")));
    driver.waitUntilJSReady();
  }

  /** Clicks the add question button */
  public void clickAddQuestionsBtn() {
    driver.waitFor(addQuestionsBtn).click();
    LOGGER.info("Clicked the add questions button");
  }
  /** MY STUFF */
  /** Clicks only for some students button */
  public void clickSelectSomeStuBtn() {
    driver.waitFor(selectSomeStuBtn).click();
    LOGGER.info("Clicked select some students button");
  }
  /** Clicks the first student that appears */
  public void clickFirstStudent() {
    driver.waitFor(specificStudent).click();
    LOGGER.info("Clicks the first student that appears");
  }

  /** Clicks the done button on edit assignees */
  public void clicksDoneEditAssignees() {
    driver.waitFor(selectStudentDoneButton).click();
    LOGGER.info("Clicks the done button for edit assignees");
  }

  /** selecting the number of questions clicking done button */
  public void selectNumberOfQuestions(int numQuestionToSelect) {
    driver.waitFor(listQuestionSection);
    for (int i = 0; i < numQuestionToSelect; i++) {
      driver.waitFor(listQuestion.get(i)).click();
    }
    driver.waitFor(selectQuestionDoneBtn).click();
  }

  /** Clicks the assign assignment button */
  public void clickAssignBtn() {
    driver.waitFor(assignBtn).click();
    LOGGER.info("Clicked the assignment button");
  }

  /**
   * Creates an assignment due tomorrow
   *
   * @param assignmentName String
   * @param numberOfQuestions int
   * @throws InterruptedException
   */
  public void createAssignmentDueTomorrow(String assignmentName, int numberOfQuestions)
      throws InterruptedException {
    /* should no longer be needed */ maximizeWindow();
    String tomorrow = Utilities.getFormattedDate(1, CREATE_QUIZ_DATE_FORMAT);
    clickBuildAnAssessmentBtn();
    setDueDate(tomorrow);
    enterAssignmentName(assignmentName);
    TimeUnit.SECONDS.sleep(2);
    addQuestionsBtn.click();
    selectSecondQuestionSet();
    CkStudentAddQuestionsPage.addSeveralQuestions(numberOfQuestions);
    assignBtn.click();
    driver.waitForClickable(closeBuildAssessmentPage).click();
    LOGGER.debug(
        "Created assignment "
            + assignmentName
            + " with "
            + numberOfQuestions
            + " questions due tomorrow ");
  }

  public void createAssignmentForOneStuDueTomorrow(String assignmentName, int numberOfQuestions)
      throws InterruptedException {
    /* should no longer be needed */ maximizeWindow();
    String tomorrow = Utilities.getFormattedDate(1, CREATE_QUIZ_DATE_FORMAT);
    clickBuildAnAssessmentBtn();
    setDueDate(tomorrow);
    enterAssignmentName(assignmentName);
    TimeUnit.SECONDS.sleep(2);
    addQuestionsBtn.click();
    selectSecondQuestionSet();
    CkStudentAddQuestionsPage.addSeveralQuestions(numberOfQuestions);
    clickEditAssigneesBtn();
    clickSelectSomeStuBtn();
    clickFirstStudent();
    clicksDoneEditAssignees();
    assignBtn.click();
    driver.waitForClickable(closeBuildAssessmentPage).click();
    LOGGER.debug(
        "Created assignment "
            + assignmentName
            + " with "
            + numberOfQuestions
            + " questions due tomorrow ");
  }

  /** Clicks the view question link */
  public void clickViewQuestionsLink() {
    driver.waitFor(viewQuestionsLink).click();
    LOGGER.info("Clicked the add questions Link");
  }

  /**
   * validates the popup and clicks the popup cancel button
   *
   * @return int- returns the size of the question
   */
  public int checkViewFullQuestion() {
    driver.waitFor(cancelPopupButton).click();
    LOGGER.info("Clicks the cancel popup button");
    return viewFullQuestion.size();
  }

  /** Selects the number of question without clicking done button */
  public void selectNumberOfQuestionsWithoutDone(int numQuestionToSelect) {
    driver.waitFor(listQuestionSection);
    for (int i = 0; i < numQuestionToSelect; i++) {
      driver.waitFor(listQuestion.get(i)).click();
    }
  }

  /** Clicks the cancel button */
  public void clickCancelAssignment() {
    driver.waitFor(cancelAssignmentButton).click();
    LOGGER.info("Clicked the cancel assignment button");
  }

  /** Shows the number of question selected */
  public String getnumberOfQuestion() {
    driver.waitUntilJSReady();
    return driver.waitFor(addedQuestionText).getText();
  }

  /**
   * validates the text message
   *
   * @return text
   */
  public String validateAssignToAllStudentsText() {
    return driver.waitFor(assignToAll).getText();
  }

  /**
   * validates the student picto
   *
   * @return picto is displayed
   */
  public boolean validateStudentsPicto() {
    return driver.waitFor(studentsPicto).isDisplayed();
  }

  /**
   * validates the student label
   *
   * @return text
   */
  public String validateStudentsLabel() {
    return driver.waitFor(allStudentLabel).getText();
  }

  /**
   * validates the course is displayed
   *
   * @return course
   */
  public boolean validateStudentsCourse() {
    return driver.waitFor(nameOfTheCourse).isDisplayed();
  }

  /**
   * validates the edit assignee button is present
   *
   * @return
   */
  public boolean validateEditAssigneeBtn() {
    return driver.waitFor(editAssigneeBtn).isDisplayed();
  }

  /**
   * If drop-down contains string questionSet, result is true else false
   *
   * @returns true
   */
  public boolean verifyCustomDropDownContains(String questionSet) {
    Select dropDown = new Select(customQuestionSetDropDown);
    ArrayList<String> optionStrings = new ArrayList<>();
    int totalOptions = dropDown.getOptions().size();
    LOGGER.debug("THERE ARE THIS MANY OPTIONS " + totalOptions);
    for (int i = 0; i < totalOptions; i++) {
      dropDown.selectByIndex(i);
      WebElement options = dropDown.getFirstSelectedOption();
      optionStrings.add(options.getAttribute("label"));
      LOGGER.debug("found these options " + optionStrings);
      if (optionStrings.contains(questionSet)) {
        LOGGER.info("Found question set " + questionSet);
        return Boolean.TRUE;
      }
    }
    return Boolean.FALSE;
  }

  /**
   * If drop-down contains string questionSet, result is true else false
   *
   * @returns true
   */
  public boolean verifyRandomDropDownContains(String questionSet) {
    Select dropDown = new Select(randomQuestionSetDropDown);
    ArrayList<String> optionStrings = new ArrayList<>();
    int totalOptions = dropDown.getOptions().size();
    LOGGER.debug("THERE ARE THIS MANY OPTIONS " + totalOptions);
    for (int i = 0; i < totalOptions; i++) {
      dropDown.selectByIndex(i);
      WebElement options = dropDown.getFirstSelectedOption();
      optionStrings.add(options.getAttribute("label"));
      LOGGER.debug("found these options " + optionStrings);
      if (optionStrings.contains(questionSet)) {
        LOGGER.info("Found question set " + questionSet);
        return Boolean.TRUE;
      }
    }
    return Boolean.FALSE;
  }

  /** Clicks the add topics button */
  public void clickAddTopicssBtn() {
    driver.waitFor(addTopicsBtn).click();
    LOGGER.info("Clicked the add questions button");
  }

  /**
   * validates the name assignment label
   *
   * @return text
   */
  public String validateNameAssessmentLabel() {
    LOGGER.info("The text label is present");
    return driver.waitFor(NameAssessmentLabel).getText();
  }

  /**
   * validates the Text-box (Empty by Default)
   *
   * @return text
   */
  public boolean validateNameAssessmentTextBoxEmpty() {
    LOGGER.info("The text-box is empty by default");
    return driver.waitFor(NameAssessmentTextBox).isDisplayed();
  }

  /**
   * validates the text label
   *
   * @return text
   */
  public String validateLettersAndNumbersText() {
    LOGGER.info("The name assignment label is present");
    return driver.waitFor(LettersAndNumbersText).getText();
  }

  /** Enters the assignment name */
  public void enterAssessmentTextBoxName(String assessmentName) {
    assessmentNameTextBox.clear();
    assessmentNameTextBox.sendKeys("");
    assessmentNameTextBox.sendKeys(assessmentName);
  }

  /** Clicks the assessment card */
  public void clickAssessmentCard(String assessmentName) {
    driver
        .findElement(
            By.xpath(
                "//div[@class='o-els-container']//h3[text()='"
                    + assessmentName
                    + "']//following-sibling::div/div/button"))
        .click();
    LOGGER.info("Clicks the Edit button of assessment card");
  }

  /**
   * Validates the new assessment name \
   *
   * @return true
   */
  public boolean verifyAssessmentNameInCard(String assessmentName) {
    boolean flag =
        driver
            .findElement(
                By.xpath("//div[@class='o-els-container']//h3[text()='" + assessmentName + "']"))
            .isDisplayed();
    LOGGER.info("Updated assessment name is displayed");
    return flag;
  }

  /** Selects the number of topic count */
  public void selectNoOfTopicCount(int count) {
    for (int i = 0; i <= numberOfTopics.size(); i++) {
      if (i <= count - 1) {
        numberOfTopics.get(i).click();
      }
    }
  }

  /**
   * Displays the total topics selected
   *
   * @return string- displays the number of topics selected
   */
  public String getSelectedTopicCount() {
    LOGGER.info("displays the number of topics selected");
    return driver.waitFor(selectTotalTopic).getText();
  }

  /** Selects the second question set */
  public void selectSecondQuestionSet() {
    Select dropDown = new Select(questionSetDropDown);
    if (!dropDown.getOptions().isEmpty()) {
      dropDown.selectByIndex(1);
      LOGGER.info("Selected the second question set");
    }
  }

  /** Selects the second topic organization */
  public void selectSecondTopicOrganization() {
    Select dropDown = new Select(taxonomyDropDown);
    if (!dropDown.getOptions().isEmpty()) {
      dropDown.selectByIndex(1);
      LOGGER.info("Selected the second topic organization");
    }
  }

  /** Clicks the edit assignees button */
  public void clickEditAssigneesBtn() {
    driver.waitFor(editAssigneeBtn).click();
    LOGGER.info("Clicked the edit assignees button");
  }
  /**
   * validates the Select Student warning cancel button is present
   *
   * @return
   */
  public boolean validateWarningCancelBtn() {
    LOGGER.info("The Warning cancel button is displayed");
    return driver.waitFor(warningCancelBtn).isDisplayed();
  }

  /**
   * validates the Select Student Warning Continue button is present
   *
   * @return
   */
  public boolean validateWarningContinueBtn() {
    LOGGER.info("The Warning Contiue button is displayed");
    return driver.waitFor(warningContinueBtn).isDisplayed();
  }

  /**
   * validates the warning message
   *
   * @return text
   */
  public String validateWarningStudentMessage() {
    LOGGER.info("The Student Warning message is present");
    return driver.waitFor(WarningSelectStudentMessage).getText();
  }

  /** Clicks the Select Student Cancel button */
  public void clickSelectStudentWarningbtn() {
    driver.waitFor(warningCancelBtn).click();
    LOGGER.info("Clicks the Select Student cancel button");
  }

  /**
   * Displays all course students selection radio button
   *
   * @return boolean - true if the all course students radio btn is selected
   */
  public boolean validateAllCourseStudentsRadioButton() {
    boolean selected = allCourseStudentsRadioBtn.isSelected();
    LOGGER.info("All course Students remains selected: " + selected);
    return selected;
  }

  /**
   * Displays un-selected students listed radio button
   *
   * @return boolean - selected
   */
  public boolean validateDoneBtn() {
    boolean selected = studentDoneButton.get(0).isEnabled();
    LOGGER.info("Selects the done button");
    return selected;
  }

  /** Enters the assignment name */
  public void enterFilterStudentsName(String filterStudentName) {
    studentNameFilterTextBox.clear();
    studentNameFilterTextBox.sendKeys("");
    studentNameFilterTextBox.sendKeys(filterStudentName);
  }

  /** Clicks the Select students Warning Continue button */
  public void selectStudentWarningContinueBtn() {
    driver.waitFor(warningContinueBtn).click();
    LOGGER.info("clicks the continue button");
  }

  /**
   * validates the the warning message
   *
   * @return boolean- returns the size of the warning message
   */
  public boolean warningMessage() {
    LOGGER.info("To validate the warning message");
    return warningMsg.isDisplayed();
  }

  /** Select the Choose question option */
  public void selectsChooseQuestion() {
    driver.waitFor(chooseQuestionRadioBtn).click();
    LOGGER.info("Selects Choose question option");
  }
}
