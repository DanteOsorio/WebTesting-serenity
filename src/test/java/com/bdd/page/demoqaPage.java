package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class demoqaPage extends PageObject {


    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement txt_nombre;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement txt_apellido;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement txt_correo;

    @FindBy(xpath = "//input[@id='userNumber']")
    WebElement txt_numerotelef;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement txta_direccion;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btn_enviar;

    @FindBy(xpath = "//label[text()='Female']")
    WebElement rbtn_femenino;
    @FindBy(xpath = "//label[text()='Male']")
    WebElement rbtn_masculino;
    @FindBy(xpath = "//label[text()='Other']")
    WebElement rbtn_otros;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    WebElement txt_fechacumple;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    WebElement txt_asignaturas;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    WebElement btn_cargarimagen;

    @FindBy(xpath = "//div[@id='state']//input")
    WebElement cbo_estado;
    @FindBy(xpath = "//div[@id='city']//input")
    WebElement cbo_city;

    @FindBy(xpath = "//div[text()='Thanks for submitting the form']")
    WebElement lbl_Thanks_for_submitting_the_form;


    public void abrir_la_pagina_DEMOQA_formularios_en_el_navegador_Chrome() {
        Browser.Start(this, "chrome");
    }

    public void escribimosNuestroNombreEnElCuadroDeTextoNombre() {
        this.txt_nombre.sendKeys("Heber David");
    }

    public void escribimosNuestroApellidoEnElCuadroDeTextoApellido() {
        txt_apellido.sendKeys("Alvarez Paredes");
    }

    public void escribimosNuestroCorreoEnElCuadroDeTextoCorreo() {
        txt_correo.sendKeys("abc@gmail.com");
    }

    public void seleccionarElGenero() {
        rbtn_masculino.click();
    }


    public void escribimosNuestroNroEnElCuadroDeTextoNúmeroDeTelefono() {
        txt_numerotelef.sendKeys("8526236852");
    }

    public void escribimosAlgunTextoEnElTextAreaDirecciónActual() {
        txta_direccion.sendKeys("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void hacemosClickEnSubmit() {


        Browser.Scroll(this, 1000);

        //Actions actions = new Actions(demoqaPage.this.getDriver());
        // actions.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT.).sendKeys(Keys.CONTROL).perform();
        // Esperar hasta que el elemento que recibe el clic no sea interactivo
        // WebDriverWait wait = new WebDriverWait(demoqaPage.this.getDriver(), 50);
        // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("fixedban")));
        // btn_enviar.click();
        JavascriptExecutor executor = (JavascriptExecutor) demoqaPage.this.getDriver();
        executor.executeScript("arguments[0].click();", btn_enviar);

//        try {
//            Thread.sleep(200);
//        } catch (Exception e) {
//        }

    }

    public void validamos_algun_elemento() {

        //validar si existe el elemento
        if (txt_nombre.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("El emenento txt_nombre no existe");
        }

    }

    // Aplicando sequema del escenario
    public void queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(String navegador) {
        Browser.Start(this, navegador);

    }

    public void escribirEnElCuadroDeTextoNombre(String nombre) {
        txt_nombre.sendKeys(nombre);
    }

    public void escribirEnElCuadroDeTextoApellido(String apellido) {
        txt_apellido.sendKeys(apellido);
    }

    public void escribirElEnElCuadroDeTextoEMail(String correo) {
        txt_correo.sendKeys(correo);
    }

    public void seleccionarElGénero(String genero) {

        //1
            /*
            switch (genero){
                case "Male":
                    rbtn_masculino.click();
                    break;
                case "Female":
                    rbtn_femenino.click();
                    break;
                case "Other":
                    rbtn_otros.click();
                    break;
                default:
                    Assert.fail("Se ingresó un género incorrecto");
                    break;
            }
            */


        //2

        try {
            WebElement radio_button = getDriver().findElement(By.xpath("//label[text()='" + genero + "']"));
            radio_button.click();
        } catch (Exception e) {
            Assert.fail("Se ingresó un género incorrecto");
        }


    }


    public void escribirEnElCuadroDeTextoNúmeroDeTelefono(String nro_telefono) {

        txt_numerotelef.sendKeys(nro_telefono);
    }

    public void seleccionarComoLaFechaDeCumpleaños(String fecha_cumple) {

        txt_fechacumple.sendKeys(Keys.CONTROL + "A");
        txt_fechacumple.sendKeys(fecha_cumple);
        txt_fechacumple.sendKeys(Keys.ENTER);

        /*
        try{
            Thread.sleep(5000);

        }catch (Exception e){}
        */

    }


    public void seleccionarComoAsignaturas(String asignaturas) {
        //Arts,Biology,Commerce
        String[] lista_asignaturas = asignaturas.split(",");
        // 0 - Arts
        // 1 - Biology
        // 2 - Commerce

        for (String asignatura : lista_asignaturas) {

            txt_asignaturas.sendKeys(asignatura);
            txt_asignaturas.sendKeys(Keys.ENTER);
        }


        Browser.Scroll(this, 500);
/*
        try{
            Thread.sleep(5000);
        }catch (Exception e){}
*/

    }


    public void seleccionarComoHobbies(String hobbies) {
        //Sports,Music
        String[] lista_hobbies = hobbies.split(",");
        // 0 Sports
        // 1 Music

        for (String hobbie : lista_hobbies) {

            try {
                WebElement checkbox = getDriver().findElement(By.xpath("//label[text()='" + hobbie + "']"));
                checkbox.click();
            } catch (Exception e) {
                Assert.fail("Se ha ingresado un hobbie incorrecto");
            }

        }
            /*
                    try{
                        Thread.sleep(5000);
                    }catch (Exception e){}
            */
    }


    public void seleccionarLaRutaDeUnaImagen(String ruta) {

        btn_cargarimagen.sendKeys(ruta);

    }


    public void escribirEnElCuadroDeTextoDirección(String direccion) {
        txta_direccion.sendKeys(direccion);
    }


    public void seleccionarElEstadoYLaCiudad(String estado, String ciudad) {

        cbo_estado.sendKeys(estado);
        cbo_estado.sendKeys(Keys.ENTER);

        cbo_city.sendKeys(ciudad);
        cbo_city.sendKeys(Keys.ENTER);

    }


    public void validamosQueSeHayaRegistradoCorrectamente() {

        if (lbl_Thanks_for_submitting_the_form.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Ha fallado en el registro del formulario");
        }


    }


}
