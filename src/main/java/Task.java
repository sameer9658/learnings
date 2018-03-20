

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TEST_CASE_RUNNING_STATUS")
public class Task {

    @Column(name="TEST_ID",nullable = false)
    private int testId;

    @Column(name="CURRENT_STEP",nullable = false)
    private int currentStep;
    @Column(name="ID",nullable = false)
    private String id;

    @Column(name="TEST_STATUS",nullable = false)
    private String testStatus;

    @Column(name="TEST_EXECUTOR_ID",nullable = false)
    private String testExecutorId;

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public int getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(int currentStep) {
        this.currentStep = currentStep;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    public String getTestExecutorId() {
        return testExecutorId;
    }

    public void setTestExecutorId(String testExecutorId) {
        this.testExecutorId = testExecutorId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "testId=" + testId +
                ", currentStep=" + currentStep +
                ", id='" + id + '\'' +
                ", testStatus='" + testStatus + '\'' +
                ", testExecutorId='" + testExecutorId + '\'' +
                '}';
    }
}
