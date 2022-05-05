package co.com.ccogollo.nequitest.tasks;

import co.com.ccogollo.nequitest.userinterfaces.VistaAyuda;
import co.com.ccogollo.nequitest.userinterfaces.VistaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.ccogollo.nequitest.userinterfaces.VistaAyuda.*;
import static co.com.ccogollo.nequitest.userinterfaces.VistaHome.*;

public class Entrar implements Task {
    public static Entrar login() {
        return Tasks.instrumented(Entrar.class);
    }

    @Override
    public <T extends Actor> void performAs(T carlos) {
        carlos.attemptsTo(
                Click.on(BOTON_ENTRA)
        );
    }
}
