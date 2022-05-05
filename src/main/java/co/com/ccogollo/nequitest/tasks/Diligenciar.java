package co.com.ccogollo.nequitest.tasks;

import co.com.ccogollo.nequitest.models.Usuario;
import co.com.ccogollo.nequitest.userinterfaces.VistaLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.ccogollo.nequitest.userinterfaces.VistaLogin.*;

public class Diligenciar implements Task {

    private int numero;

    public Diligenciar(int numero) {
        this.numero = numero;
    }
    public static Diligenciar formularioNumero(int numero){
      return Tasks.instrumented(Diligenciar.class, numero);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(String.valueOf(numero)).into(CAMPO_NUMERO),
                Click.on(BOTON_ENTRAR));
    }
}
