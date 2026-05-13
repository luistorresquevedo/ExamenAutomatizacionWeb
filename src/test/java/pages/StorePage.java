package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StorePage {

    private WebDriver driver;
    private Object optTratamiento;

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }
    public void open(String url) {
        driver.get(url);
    }
    public void dirigirseALogin() {
        WebElement login = driver.findElement(By.xpath("//span[@class='hidden-sm-down' and text()='Iniciar sesión']"));
        login.click();
    }
    public void creeCuenta() {
        WebElement Cuenta = driver.findElement(By.xpath("//a[@data-link-action='display-register-form']"));
        Cuenta.click();
    }

    public void registroUsuario( String nombre, String apellido, String correo, String contrasena, String fechaNacimiento) {
        WebElement tratamiento = driver.findElement(By.id("field-id_gender-1"));
        tratamiento.click();
        WebElement name = driver.findElement(By.id("field-firstname"));
        WebElement lastname = driver.findElement(By.id("field-lastname"));
        WebElement email = driver.findElement(By.id("field-email"));
        WebElement password = driver.findElement(By.id("field-password"));
        WebElement fecNac = driver.findElement(By.id("field-birthday"));
        WebElement terminos = driver.findElement(By.xpath("//input[@name='psgdpr']"));
        terminos.click();
        WebElement privacidad = driver.findElement(By.xpath("//input[@name='customer_privacy']"));
        privacidad.click();
        name.sendKeys(nombre);
        lastname.sendKeys(apellido);
        email.sendKeys(correo);
        password.sendKeys(contrasena);
        fecNac.sendKeys(fechaNacimiento);
    }

    public void buttonGuardar() throws InterruptedException {
        WebElement Guardar = driver.findElement(By.xpath("//button[@data-link-action='save-customer']"));
        Guardar.click();
        Thread.sleep(5000);
    }

}
