package co.com.ccogollo.nequitest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class VistaHome {

    public static final Target BOTON_ENTRA = Target.the("Boton para entrar al loggin")
            .located(By.className("android.widget.Button"));

    public static final Target BOTON_CREAR_CUENTA = Target.the("Boton para registrar cuenta")
            .located(By.className("pa.com.nequi.MobileApp:class/android.view.View"));

    public static final Target BOTON_AYUDA = Target.the("Boton para ir a las ayudas")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]"));

}
