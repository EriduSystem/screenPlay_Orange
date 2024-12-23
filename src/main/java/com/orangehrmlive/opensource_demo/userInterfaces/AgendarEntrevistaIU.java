package com.orangehrmlive.opensource_demo.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AgendarEntrevistaIU {
    public static final Target BUTTON_SCHEDULEINTERVIEW = Target.the("Scheduleinterview button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--success\"]");
    public static final Target INPUT_INTERVIEWTITLE = Target.the("Interviewtitle input").locatedBy("//*[@class=\"oxd-input oxd-input--active\"]");

    public static final Target DDL_INTERVIEWER = Target.the("Interviewer dropdown list").locatedBy("//label[text()='Interviewer']/following::input[1]");
    public static final Target OPTION_SELECT_INTERVIEWER = Target.the("Option interviewer list")
            .locatedBy("//input[@name='interviewer']/following-sibling::div[@class='oxd-select-option'][1]");



    public static final Target DATE_DATE = Target.the("date date").locatedBy("//*[@class=\"oxd-input oxd-input--active\"]");
    public static final Target BUTTON_SAVE_SCHEDULEINTERVIEW = Target.the("Savescheduleinterview button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");

}
