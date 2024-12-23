package com.orangehrmlive.opensource_demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.orangehrmlive.opensource_demo.userInterfaces.AgendarEntrevistaIU.*;
import static com.orangehrmlive.opensource_demo.userInterfaces.CompletarFormularioIU.OPTION_SELECT;

public class AgendarEntrevistaTask implements Task {
    private final String interviewerName;
    private final String interviewDate;

    public AgendarEntrevistaTask(String interviewerName, String interviewDate) {
        this.interviewerName = interviewerName;
        this.interviewDate = interviewDate;
    }

    public static AgendarEntrevistaTask withDetails(String interviewerName, String interviewDate) {
        return new AgendarEntrevistaTask(interviewerName, interviewDate);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Enter.theValue(interviewerName).into(DDL_INTERVIEWER),
                //WaitUntil.the(DDL_INTERVIEWER, WebElementStateMatchers.isVisible()).forNoMoreThan(6).seconds(),
                Enter.theValue(interviewerName).into(DDL_INTERVIEWER),

                // Esperar hasta que la opción del entrevistador sea visible
                WaitUntil.the(OPTION_SELECT_INTERVIEWER, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(6).seconds(),

                // Añadir un pequeño retraso para asegurarnos de que las opciones del dropdown se carguen correctamente
                WaitUntil.the(OPTION_SELECT_INTERVIEWER, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(6).seconds(), // Espera hasta que la opción sea clickeable

                Click.on(OPTION_SELECT_INTERVIEWER),
                Enter.theValue(interviewDate).into(DATE_DATE),
                Click.on(BUTTON_SAVE_SCHEDULEINTERVIEW)
        );


    }
}
