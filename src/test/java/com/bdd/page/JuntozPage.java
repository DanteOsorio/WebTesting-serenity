package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.event.TreeSelectionListener;
import java.awt.*;
import java.io.File;
import java.util.List;

@DefaultUrl("https://juntoz.com/")
public class JuntozPage extends PageObject {

    // CUADRO BUSQUEDA PEQUEÑO
    @FindBy(xpath = "//input[@id='inputSearchV2' and @placeholder='Busca en Juntoz.com']")
    private WebElement txt_busqueda_pequeno;

    // CUADRO BUSQUEDA GRANDE
    @FindBy(xpath = "//input[@id='inputSearchV2'and @placeholder='Buscar por producto, tienda o marca...']")
    private WebElement txt_busqueda_grande;

    //BOTON DE BUSCAR
    @FindBy(xpath = "//*[@id='searchBar']/div/div[1]/form/div/span/button")
    private WebElement txt_buscar;

    //TEXTO CONTADOR DE PRODUCTOS FINTRADOS
    @FindBy(xpath = "//strong[contains(text(),' productos')]")
    private WebElement lbl_cantidadproductos;

    //BOTON PARA DESPLEGAR CATEGORIAS
    @FindBy(xpath = "//div[@class='hamburger-menu']")
    private WebElement btn_categorias;


    public void Abrir_la_pagina_Juntoz_en_un_navegador() {

        String navegador = "chrome";

        Browser.Start(this,navegador);


    }

    public void escribirLAPTOPEnElCuadroDeBusqueda() {

        System.out.println("Escribiendo en el cuadro de búsqueda");

        //WebElement popup = getDriver().findElement(By.xpath("//w-div[@id='w-utxd53']/span"));
        WebDriverWait wait = new WebDriverWait(getDriver(), 50);
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//w-div[@role='dialog']//span")));
        popup.click();



        WebElement alert = getDriver().findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']"));
        alert.click();

      // getDriver().switchTo().alert().accept();
        String producto = "Laptop";

/*
       if( txt_busqueda_grande.isEnabled()){
           txt_busqueda_grande.sendKeys(producto);
       }else{
           txt_busqueda_pequeno.sendKeys(producto);
       }
*/

        try {
            txt_busqueda_grande.sendKeys(producto);
        } catch (Exception e) {
            txt_busqueda_pequeno.sendKeys(producto);
        }


    }

    public void hacerClickEnElBotónBuscar() {

        txt_buscar.click();

        try {
            Thread.sleep(50);
        } catch (Exception e) {
        }

    }

    public void validarQueSeEncuentrenResultados() {

        String cantidad_productos = lbl_cantidadproductos.getText();  //169 productos     0 productos

        //VALIDACIÓN
        if (cantidad_productos.equals("0 productos")) {
            Assert.fail("No se encontraron productos");
        } else {
            Assert.assertTrue(true);
        }

        //CIERRA EL NAVEGADOR
        getDriver().close();

    }



    //ESCENARIO02_JUNTOZ_PARAMETROS
    public void abrirLaPaginaJuntozEnElNavegador(String navegador) {

        Browser.Start(this,navegador);


    }

    public void escribirEnElCuadroDeBusqueda(String producto) {

        try {
            txt_busqueda_grande.sendKeys(producto);
        } catch (Exception e) {
            txt_busqueda_pequeno.sendKeys(producto);
        }
    }

    //@ESCENARIO03_JUNTOZ
    public void desplegarElPanelDeCategorías() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        getDriver().switchTo().alert().dismiss();
        btn_categorias.click();
    }

    public void seleccionarLaCategoría(String categoria) {

        WebElement btn_categoria = getDriver()
                //*[@id="first-container"]/a[11]/div
                .findElement(By.xpath("//body/div[@id='juntoz-sidenav']/div[@id='first-container']/a[11]"));
//        List<WebElement> elementos = btn_categoria.findElements(By.tagName("a"));
//
//        for (WebElement elemento : elementos) {
//            if (elemento.getText().equals(categoria)) {
//                elemento.click();
//            }
//        }
        btn_categoria.click();
        //getDriver().switchTo().alert().dismiss();
    }

    public void seleccionarLaSubcategoría(String subcategoria) throws AWTException {

        getDriver().switchTo().alert().dismiss();
        //getDriver().switchTo().defaultContent();
        //getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id='sub-container-title']/span")));
        //div[@id='sub-container-content']//a[text()='Antipulgas para Perros']
      WebElement btn_subcategoria = getDriver().findElement(By.xpath("//div[@id='sub-container-content']//a[text()='"+subcategoria+"']"));
      //  WebElement btn_subcategoria = getDriver().findElement(By.linkText(subcategoria));
        btn_subcategoria.click();
       // Robot robot = new Robot();
       // robot.mouseMove(0, 15);
       // WebElement btn_subcategoria2 = getDriver()
         //       .findElement(By.xpath("//*[@id='sub-container-content']/div/ul[2]/li[5]/a"));
//        WebElement elemento = driver.findElement(By.id("elementoId"));
//
//// Ejecuta un script de JavaScript para eliminar el atributo onmouseover
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].removeAttribute('onmouseover');", elemento);
       // try {
       //     Thread.sleep(2000);
      // } catch (Exception e) {
       // }
       // WebElement btn_subcategoria2 = getDriver().findElement(By.xpath("//*[@id='cat-mascotas']/div/ul[2]/li[5]/a"));
       // btn_subcategoria2.click();
      //  Actions action = new Actions(getDriver());
        // action.moveToElement(btn_subcategoria2).perform();
        //action.moveToElement(btn_subcategoria2).perform();

       // int coordenadaX = action.moveByOffset(0, 0).getX();
      //  int coordenadaY = action.moveByOffset(0, 0).getY();

// Imprime las coordenadas X e Y
        //System.out.println("Coordenada X: " + coordenadaX);
       // System.out.println("Coordenada Y: " + coordenadaY);


    }


}
