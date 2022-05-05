package co.com.ccogollo.nequitest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VistaLogin {

    public static final Target IMAGEN_NEQUI = Target.the("Imagen con nombre de aplicación")
            .located(By.id("sign-in_nequi-name_image"));

    public static final Target CAMPO_NUMERO = Target.the("Campo para ingresar número de telefono")
            .located(By.className("android.widget.EditText"));

    public static final Target BOTON_ENTRAR = Target.the("Boton para continuar el proceso de loggin")
            .located(By.className("android.widget.Button"));

}
