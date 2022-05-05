package co.com.ccogollo.nequitest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class VistaAyuda {

    public static final Target BOTON_REGRESAR = Target.the("Boton para regresar")
            .located(By.className("android.widget.Button"));

}
