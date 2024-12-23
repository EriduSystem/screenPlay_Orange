package com.orangehrmlive.opensource_demo.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.orangehrmlive.opensource_demo.userInterfaces.AgregarCandidatoIU.*;
import static com.orangehrmlive.opensource_demo.utils.Constants.TIME_SHORT;

public class AgregarCandidatoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORY_RECRUITMENT)
        );
        try {
            Thread.sleep(TIME_SHORT);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(BUTTON_ADD)
        );
    }

    public static AgregarCandidatoTask addRecruitment() {
        return new AgregarCandidatoTask();
    }
}
