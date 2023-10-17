package com.bdd.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://demo.nopcommerce.com/")
public class opcommercePage extends PageObject {

    @FindBy(xpath = "//a[text()='Register']")
    WebElement lbl_regidtro;
    //fechaNacimiento
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement txt_nombre;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement txt_apellido;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement txt_correo;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement cb_dia;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement cb_mes;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement cb_anio;
    //compañia
    @FindBy(xpath = "//input[@id='Company']")
    WebElement txt_compania;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement cbox_si;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement conf_password;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement btn_registar;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement exito;
    // ESCENARIO 2 COMPRA DE PRODUCTO
    @FindBy(xpath = "//a[text()='Log in']")
    WebElement lbl_login;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement btn_login;
    @FindBy(xpath = "//a[text()='My account']")
    WebElement lbl_myaccout;
    @FindBy(xpath = "//li[@class='customer-addresses inactive' ] //a[text()='Addresses'] ")
    WebElement lbl_addreses;
    @FindBy(xpath = "//button[text()='Add new']")
    WebElement btn_addNew;
    // Add new addresess
    @FindBy(xpath = "//input[@id='Address_FirstName']")
    WebElement txt_newNombre;
    @FindBy(xpath = "//input[@id='Address_LastName']")
    WebElement txt_newApellido;
    @FindBy(xpath = "//input[@id='Address_Email']")
    WebElement txt_newEmail;
    @FindBy(xpath = "//input[@id='Address_Company']")
    WebElement txt_comp;
    //select[@id="Address_CountryId"]/option[2]
    @FindBy(xpath = "//select[@id='Address_CountryId']/option")
    WebElement cb_pais;
    @FindBy(xpath = "//select[@id='Address_StateProvinceId']/option")
    WebElement cb_estado;
    @FindBy(xpath = "//input[@id='Address_City']")
    WebElement txt_cuidad;
    @FindBy(xpath = "//input[@id='Address_Address1']")
    WebElement txt_direccion1;
    @FindBy(xpath = "//input[@id='Address_ZipPostalCode']")
    WebElement txt_cpostal;
    @FindBy(xpath = "//input[@id='Address_PhoneNumber']")
    WebElement txt_phone;
    @FindBy(xpath = "//button[text()='Save']")
    WebElement btn_saveD;
    //PARA COMPRA
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement img_nopCommerce;

    @FindBy(xpath = "//input[@id='small-searchterms']")
    WebElement txt_buscar;
    @FindBy(xpath = "//button[text()='Search']")
    WebElement btn_buscar;
    @FindBy(xpath = "//h2[@class='product-title']//a[@href='/nokia-lumia-1020']")
    WebElement nombreProducto;
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement btn_addToCard;
    @FindBy(xpath = "//li[@id='topcartlink']//a[@href='/cart']")
    WebElement lbl_shopping;

    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement terminos;
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement btn_checkout;
    //conf
    @FindBy(xpath = "//*[@id='billing-buttons-container']")
    WebElementFacade btn_Billing;
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement btn_ShippingMethod;
    @FindBy(xpath = "//button[@onclick='PaymentMethod.save()']")
    WebElement btn_PaymentMethod;
    @FindBy(xpath = "//button[@onclick='PaymentInfo.save()']")
    WebElement btn_PaymentInfo;
    @FindBy(xpath = "//button[@onclick='ConfirmOrder.save()']")
    WebElement btn_ConfirmOrder;
    @FindBy(xpath = "//h1[text()='Thank you']")
    WebElement txt_ThankYou;


    public void queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(String navegador) {
        Browser.Start(this, navegador);
      //  getDriver().switchTo().defaultContent();

        //getDriver().switchTo().frame(getDriver().findElement(By.xpath("//iframe[@src='https://demo.nopcommerce.com/']")));
    }

    public void seleccionarRegistroParaIngresarAlFumulario() {
        System.out.println("hello");
        lbl_regidtro.click();
        System.out.println("hello2");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
    public void seleccionarElGéneroUsuario(String genero) {

        try {
            WebElement radio_button = getDriver().findElement(By.xpath("//div[@id='gender']//label[text()='" + genero + "']"));
            radio_button.click();
        } catch (Exception e) {
            Assert.fail("Se ingresó un género incorrecto");
        }

    }
    public void escribirEnElCuadroDeTextoDeNombre(String nombre) {
        txt_nombre.sendKeys(nombre);
    }

    public void escribirEnElCuadroDeTextoDeApellido(String apellido) {
        txt_apellido.sendKeys(apellido);
    }
    public void seleccionarFechaDeNacimientoDiaMesAño(String dia, String mes, String año) {
        cb_dia.sendKeys(dia);
        cb_dia.sendKeys(Keys.ENTER);
        cb_mes.sendKeys(mes);
        cb_mes.sendKeys(Keys.ENTER);
        cb_anio.sendKeys(año);
        cb_anio.sendKeys(Keys.ENTER);

        Browser.Scroll(this, 500);
    }

    public void escribirElEnElCuadroDeTextoDeEMail(String correo) {
        txt_correo.sendKeys(correo);
    }
    public void escribirEnElCuadroDeTextoNombreCompañia(String compañia) {
        txt_compania.sendKeys(compañia);

    }

    public void seleccionarOpcionBoletin(String si) {
        cbox_si.sendKeys(si);

    }

    public void escribirContraseñaComo(String contraseña) {
        password.sendKeys(contraseña);

    }

    public void confirmarContraseñaComo(String confPassword) {
        conf_password.sendKeys(confPassword);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    public void hacemosClickEnRegister() {
        btn_registar.click();

    }

    public void validamosQueSeHayaRegistradoCorrectamente() {
        //validar si existe el elemento
        if (exito.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Registro incorrecto");
        }

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }

    // COMPRA DE PRODUCTO

    public void queSeNecesitaAbrirLaPaginaNopCommerceLoginEnElNavegador(String navegador) {
        Browser.Start(this, navegador);
       // getDriver().switchTo().defaultContent();
      //  getDriver().switchTo().frame(getDriver().findElement(By.xpath("//iframe[@src='https://demo.nopcommerce.com/']")));
    }

    public void seleccionarLoginParaAgregarLaDirecciponYRealizarUnaCompra() {
        System.out.println("hello");
        lbl_login.click();
        System.out.println("hello2");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    public void hacemosClickEnBotonLogin() {

        btn_login.click();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    public void quieroActualizarMiDireccionClickEnMyAccount() {
        lbl_myaccout.click();
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
    }

    public void hacerClickEnAddresses() {
        lbl_addreses.click();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    public void hacerClickEnBotonADDNEW() {
        btn_addNew.click();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    // NUEVA DIRECCION
    public void escribirNuevoEnElCuadroDeTextoNombre(String newNombre) {
        txt_newNombre.sendKeys(newNombre);

    }

    public void escribirNuevoEnElCuadroDeTextoApellido(String newApellido) {
        txt_newApellido.sendKeys(newApellido);

    }

    public void escribirElNuevoEnElCuadroDeTextoEMail(String newEmail) {
        txt_newEmail.sendKeys(newEmail);
    }

    public void escribirEnElCuadroDeTextoCompañia(String compania) {
        txt_comp.sendKeys(compania);
    }

    public void eligirElEnPais(String pais) {
        Browser.Scroll(this, 500);
        WebElement selectPais = getDriver()
                .findElement(By.xpath("//select[@id='Address_CountryId']//option[text()='" + pais + "']"));
        selectPais.click();

        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }

    public void eligirElEnEstado(String estado) {

        WebElement selectEsta = getDriver()
               .findElement(By.xpath("//*[@id='Address_StateProvinceId']"));
        selectEsta.click();

        WebElement selectEstado = getDriver()
                .findElement(By.xpath("//select[@id='Address_StateProvinceId']//option[text()='" + estado + "']"));

    }

    public void escribirEnElCuadroDeTextoCiudad(String ciudad) {
        txt_cuidad.sendKeys(ciudad);

    }

    public void escribirNuevoEnElCuadroDeTextoDirección(String direccion) {
        txt_direccion1.sendKeys(direccion);

    }

    public void escribirEnElCuadroDeTextoCodigoPostal(String cpostal) {
        txt_cpostal.sendKeys(cpostal);

    }

    public void escribirNuevoEnElCuadroDeTextoNúmeroDeTelefono(String telefono) {
        txt_phone.sendKeys(telefono);

    }

    public void hacemosClickEnSave() {
        btn_saveD.click();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    public void quiroRealizarUnaCompraClickLogoNopCommerceAPaginaPrincipal() {
        img_nopCommerce.click();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    public void escribirElEnCuadroDeTextoBuscar(String producto) {
        txt_buscar.sendKeys(producto);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

    }

    public void hacerClickEnBuscar() {
        btn_buscar.click();
        Browser.Scroll(this, 500);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    public void hacerClickEnNombreProductoEncontradoParaDetalle() {
        nombreProducto.click();
        //  Browser.Scroll(this,400);
    }

    public void hacerClickEnADDTOCARTParaAgregarAlCarito() {

        btn_addToCard.click();

        WebElement close = getDriver().findElement(By.xpath("//span[@class='close']"));
        close.click();

    }

    public void hacerClickEnShoppingCartParaComprar() {
        lbl_shopping.click();
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
        }
    }

    public void hacerCheckboxParaAceptarLosTerminos() {
        Browser.Scroll(this, 500);
        terminos.click();
    }

    public void hacerClickEnCHECKOUTParaAceptar() {
        btn_checkout.click();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    public void hacerClickEnCONTINUEParaValidarLaDireccion() {

        getDriver().switchTo().defaultContent();
        getDriver().switchTo().frame(getDriver().findElement(By.xpath("//iframe[@src='https://demo.nopcommerce.com/']")));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        btn_Billing.click();
    }

    public void hacerClickEnCONTINUEParaValidarTipoDeEntrega() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        btn_ShippingMethod.click();
    }

    public void hacerClickEnCONTINUEParaValidarTipoDePago() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        btn_PaymentMethod.click();

    }

    public void hacerClickEnCONTINUEParaValidarDatos() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        btn_PaymentInfo.click();
        Browser.Scroll(this, 300);
    }

    public void hacerClickEnCONTINUEParaConfirmarCompra() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        btn_ConfirmOrder.click();
    }

    public void validamosLaCompraExitosa() {

        if (txt_ThankYou.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se pudo realizar la compra");
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }




}






















