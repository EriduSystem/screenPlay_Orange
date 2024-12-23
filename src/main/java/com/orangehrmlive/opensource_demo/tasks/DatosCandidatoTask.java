package com.orangehrmlive.opensource_demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilExpectation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.orangehrmlive.opensource_demo.userInterfaces.AgendarEntrevistaIU.BUTTON_SCHEDULEINTERVIEW;
import static com.orangehrmlive.opensource_demo.userInterfaces.CompletarFormularioIU.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DatosCandidatoTask implements Task {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String email;
    private final String number;
    private final String keywords;

    public DatosCandidatoTask(String firstName, String middleName, String lastName, String email, String number, String keywords) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
        this.keywords = keywords;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntilExpectation<T> vacancyDropdown;
        actor.attemptsTo(
                Enter.theValue(firstName).into(INPUT_FIRST_NAME),
                Enter.theValue(middleName).into(INPUT_MIDDLE_NAME),
                Enter.theValue(lastName).into(INPUT_LAST_NAME),
                Click.on(DDL_VACANCY),
                Click.on(OPTION_SELECT),
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(number).into(INPUT_CONTACT_NUMBER),
                Enter.theValue(keywords).into(INPUT_KEYWORDS),
                Click.on(BUTTON_SAVE_POSTULATION)
        );
    }

    public static DatosCandidatoTask withDetails(String firstName, String middleName, String lastName, String email, String number, String keywords) {
        return new DatosCandidatoTask(firstName, middleName, lastName, email, number, keywords);
    }

}
