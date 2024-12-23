package com.orangehrmlive.opensource_demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.orangehrmlive.opensource_demo.userInterfaces.IniciarSesionIU.TITLE_DASHBOARD;

public class ValidacionPaginaDashbordQuestion implements Question<Boolean> {
    private final String expectedText;

    public ValidacionPaginaDashbordQuestion(String expectedText) {
        this.expectedText = expectedText;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actualText = Text.of(TITLE_DASHBOARD).answeredBy(actor).toString();
        return actualText.contains(expectedText);
    }

    public static ValidacionPaginaDashbordQuestion isVisible(String expectedText) {
        return new ValidacionPaginaDashbordQuestion(expectedText);
    }
}
