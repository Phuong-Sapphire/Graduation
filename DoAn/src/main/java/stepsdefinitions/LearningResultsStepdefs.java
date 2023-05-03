package stepsdefinitions;

import core.AppiumBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.elements.ReviewTheExamElement;
import pages.events.*;

public class LearningResultsStepdefs extends AppiumBase {
    HomePage homePage = new HomePage();
    LearningResultsPage learningResultsPage = new LearningResultsPage();
    ComponentPointPage componentPointPage = new ComponentPointPage();
    ExamScoresPage examScoresPage = new ExamScoresPage();
    ReviewTheExamPage reviewTheExamPage = new ReviewTheExamPage();
    SemesterAveragePage semesterAveragePage = new SemesterAveragePage();
    CumulativeOverallAveragePage cumulativeOverallAveragePage = new CumulativeOverallAveragePage();
    @And("click to learning results")
    public void clickToLearningResults(){
        homePage.clickToLearningResults();
    }

    @Then("verify learning results displays")
    public void verifyLearningResultsDisplays() {
        learningResultsPage.verifyDisplay();
    }

    @And("click to component point")
    public void clickToComponentPoint() {
        learningResultsPage.clickToComponentPoint();
    }

    @Then("verify component point displays")
    public void verifyComponentPointDisplays() {
        componentPointPage.verifyDisplay();
    }

    @And("click to exam scores")
    public void clickToExamScores() {
        learningResultsPage.clickToExamScore();
    }

    @Then("verify exam scores displays")
    public void verifyExamScoresDisplays() {
        examScoresPage.verifyDisplays();
    }

    @And("click to turn on the chart")
    public void clickToTurnOnTheChart() {
        examScoresPage.clickToChart();
    }

    @Then("verify the chart displays")
    public void verifyTheChartDisplays() {
        examScoresPage.verifyChartDisplays();
    }

    @And("click to review the exam")
    public void clickToReviewTheExam() {
        learningResultsPage.clickToReviewTheExam();
    }

    @Then("verify review the exam displays")
    public void verifyReviewTheExamDisplays() {
        reviewTheExamPage.verifyDisplays();
    }

    @And("click to semester average")
    public void clickToSemesterAverage() {
        learningResultsPage.clickToSemesterAverage();
    }

    @Then("verify semester average displays")
    public void verifySemesterAverageDisplays() {
        semesterAveragePage.verifyDisplays();
    }

    @And("click to chart")
    public void clickToChart() {
        semesterAveragePage.clickToChartButton();
    }

    @Then("verify semester average chart displays")
    public void verifySemesterAverageChartDisplays() {
        semesterAveragePage.verifyChartDisplay();
    }

    @And("click to cumulative overall average")
    public void clickToCumulativeOverallAverage() {
        learningResultsPage.clickToCumulativeOverallAverage();
    }

    @Then("verify cumulative overall average displays")
    public void verifyCumulativeOverallAverageDisplays() {
        cumulativeOverallAveragePage.verifyDisplays();
    }
}
