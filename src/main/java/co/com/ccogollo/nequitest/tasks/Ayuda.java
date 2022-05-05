package co.com.ccogollo.nequitest.tasks;

import co.com.ccogollo.nequitest.userinterfaces.VistaAyuda;
import co.com.ccogollo.nequitest.userinterfaces.VistaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Ayuda implements Task {


    public static Ayuda vista(){
        return Tasks.instrumented(Ayuda.class);
    }

    @Override
    public <T extends Actor> void performAs(T carlos) {

        carlos.attemptsTo(
                Click.on(VistaHome.BOTON_AYUDA),
                Click.on(VistaAyuda.BOTON_REGRESAR)
        );

    }
}
