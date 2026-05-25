package ua.QALightCourse.AQALesson7.questionsanswerstest;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.QALightCourse.AQALesson7.basetest.BaseTest;
import ua.QALightCourse.AQALesson7.pages.AnswerPage;
import ua.QALightCourse.AQALesson7.pages.HomePage;
import ua.QALightCourse.AQALesson7.pages.QuestionAndAnswersPage;

public class QuestionAnswersNegativeTest extends BaseTest {

    @Test
    @Description("This test verifies that answer for selected question is not incorrect")
    @Epic("Q&A page")
    @Feature("Questions and answers")
    @Story("Verify incorrect answer for selected question")
    @Link(name = "Requirements", url = "https://uk.wikipedia.org/wiki/Dia")
    @Issue("JIRA-14892")
    public void shouldNotGetIncorrectAnswerForQuestion() {

        HomePage homePage = new HomePage(getDriver());
        homePage.openQuestionAndAnswersSection();

        String question = "Що таке Дія?";
        String incorrectAnswer = "Дія — це онлайн магазин електроніки.";
        QuestionAndAnswersPage questionAndAnswersPage = new QuestionAndAnswersPage(getDriver());
        questionAndAnswersPage.chooseQuestion(question);

        AnswerPage answerPage = new AnswerPage(getDriver());
        String actualAnswer = answerPage.getAnswerFromQuestion();
        Assert.assertNotEquals(actualAnswer, incorrectAnswer);

    }
}