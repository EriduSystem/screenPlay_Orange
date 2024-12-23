package com.orangehrmlive.opensource_demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.orangehrmlive.opensource_demo.userInterfaces.AgendarEntrevistaIU.*;
import static com.orangehrmlive.opensource_demo.userInterfaces.ListaCortaIU.*;

public class ListaCortaPostulacionTask implements Task {
    public static ListaCortaPostulacionTask shorList() {
        return new ListaCortaPostulacionTask();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

            Click.on(BUTTON_SHORLIST),
            Click.on(BUTTON_SAVE_SHORLIST),
            Click.on(BUTTON_SCHEDULEINTERVIEW)
        );

    }
}
