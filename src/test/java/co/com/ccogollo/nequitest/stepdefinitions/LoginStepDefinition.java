package co.com.ccogollo.nequitest.stepdefinitions;

import co.com.ccogollo.nequitest.models.Usuario;
import co.com.ccogollo.nequitest.questions.Visualiza;
import co.com.ccogollo.nequitest.tasks.Ayuda;
import co.com.ccogollo.nequitest.tasks.Diligenciar;
import co.com.ccogollo.nequitest.tasks.Entrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @Before
    public void prepareStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario este dentro de la aplicacion$")
    public void queElUsuarioEsteDentroDeLaAplicacion() {
        theActorCalled("Carlos").attemptsTo(Ayuda.vista(),
                Entrar.login());
    }

    @Cuando("^el usuario ingrese (\\d+), (\\d+) y presione el boton continuar$")
    public void elUsuarioIngreseYPresioneElBotonContinuar(int arg1, int arg2) {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.formularioNumero(arg1));
    }

    @Entonces("^saldra un mensaje de inicio correcto$")
    public void saldraUnMensajeDeInicioCorrecto() {

    }
}
