package ua.QALightCourse.AQALesson7.questionsanswerstest;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.QALightCourse.AQALesson7.basetest.BaseTest;
import ua.QALightCourse.AQALesson7.pages.AnswerPage;
import ua.QALightCourse.AQALesson7.pages.HomePage;
import ua.QALightCourse.AQALesson7.pages.QuestionAndAnswersPage;


public class QuestionAnswersPositiveTest extends BaseTest {

    @Test
    @Description("This test verifies that user can get answer for selected question from Q&A page")
    @Epic("Q&A page")
    @Feature("Questions and answers")
    @Story("Get answer for selected question")
    @Link(name = "Requirements", url = "https://uk.wikipedia.org/wiki/Dia")
    @Issue("JIRA-14890")
    public void shouldGetAnswerForQuestion() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openQuestionAndAnswersSection();

        String question = "Що таке Дія?";
        String expectedAnswer = "Ми створюємо цифрову державу у центрі якої людина. Прозору і зрозумілу державу для людей. " +
                "Починаємо зміни: менше черг, більше життя. Дія — це взаємодія \"Держава і я”.\n" +
                "Дія — це застосунок в якому усі потрібні документи в одному місці, у вашому смартфоні. \n" +
                "Дія — це один портал, де можна отримати всі послуги онлайн: швидко, зручно та людяно. ";
        QuestionAndAnswersPage questionAndAnswersPage = new QuestionAndAnswersPage(getDriver());
        questionAndAnswersPage.chooseQuestion(question);

        AnswerPage answerPage = new AnswerPage(getDriver());
        String actualAnswer = answerPage.getAnswerFromQuestion();
        Assert.assertEquals(
                actualAnswer.replaceAll("\\s+", " ").trim(),
                expectedAnswer.replaceAll("\\s+", " ").trim()
        );
    }

}
