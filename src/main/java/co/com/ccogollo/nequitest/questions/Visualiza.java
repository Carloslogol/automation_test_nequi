package co.com.ccogollo.nequitest.questions;

import co.com.ccogollo.nequitest.userinterfaces.VistaLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
public class Visualiza implements Question<Boolean> {

    public Visualiza() {}

    public static Visualiza nombreAplicacion(){
        return new Visualiza();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       
        return VistaLogin.IMAGEN_NEQUI.resolveFor(actor).isVisible();
    }
}
