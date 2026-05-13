package steps;

import hooks.Hooks;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StorePage;

public class Steps {

    StorePage storepage = new StorePage(Hooks.driver);

    @Given("estoy en la página de la tienda {string}")
    public void abrirNavegador(String url) {
        storepage.open(url);

    }

    @When("doy click en la opción iniciar sesión")
    public void dirigeAIniciarSesión() {
        storepage.dirigirseALogin();
    }

    @And("doy click en el link text cree una cuenta aquí")
    public void doyClickCreeUnaCuentaAquí() {
        storepage.creeCuenta();
    }

    @And("lleno los campos del formulario para el registro Tratamiento {string}, {string}, {string}, {string}, {string}")
    public void CompletarFormularioRegistro( String nombre, String apellidos, String email, String contrasena, String fechaNacimiento) {
        storepage.registroUsuario( nombre, apellidos, email, contrasena, fechaNacimiento);

    }

    @And("doy click en el botón guardar")
    public void doyClickEnElBotónGuardar() throws InterruptedException {
        storepage.buttonGuardar();


    }

    @Then("debería visualizar mi usuario logeado en la pantalla")
    public void VisualizarMiUsuarioLogeado() {


    }

}
