package com.bdd.stepdefinition;

import com.bdd.step.opcommerceStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

import javax.crypto.spec.OAEPParameterSpec;

public class opcommerceStepDefinition {

    @Steps
    opcommerceStep opcommerceStep;

    @Dado("^que se necesita abrir la pagina nopCommerce registro en el navegador \"([^\"]*)\"$")
    public void queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(String navegador) throws Throwable {
        opcommerceStep.queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(navegador);
    }

    @Y("^seleccionar registro para ingresar al fumulario$")
    public void seleccionarRegistroParaIngresarAlFumulario() {
        opcommerceStep.seleccionarRegistroParaIngresarAlFumulario();
    }
    @Y("^seleccionar el género \"([^\"]*)\" usuario$")
    public void seleccionarElGéneroUsuario(String genero) throws Throwable {
        opcommerceStep.seleccionarElGéneroUsuario(genero);

    }
    @Y("^escribir \"([^\"]*)\" en el cuadro de texto de nombre$")
    public void escribirEnElCuadroDeTextoDeNombre(String nombre) throws Throwable {
        opcommerceStep.escribirEnElCuadroDeTextoDeNombre(nombre);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto de apellido$")
    public void escribirEnElCuadroDeTextoDeApellido(String apellido) throws Throwable {

        opcommerceStep.escribirEnElCuadroDeTextoDeApellido(apellido);
    }

    @Y("^seleccionar fecha de nacimiento\"([^\"]*)\" dia \"([^\"]*)\" mes \"([^\"]*)\" año$")
    public void seleccionarFechaDeNacimientoDiaMesAño(String dia, String mes, String año) throws Throwable {
        opcommerceStep.seleccionarFechaDeNacimientoDiaMesAño(dia, mes, año);
    }
    @Y("^escribir el \"([^\"]*)\" en el cuadro de texto de e-mail$")
    public void escribirElEnElCuadroDeTextoDeEMail(String correo) throws Throwable {
        opcommerceStep.escribirElEnElCuadroDeTextoDeEMail(correo);

    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto nombre compañia$")
    public void escribirEnElCuadroDeTextoNombreCompañia(String compañia) throws Throwable {
        opcommerceStep.escribirEnElCuadroDeTextoNombreCompañia(compañia);
    }

    @Y("^seleccionar opcion boletin \"([^\"]*)\"$")
    public void seleccionarOpcionBoletin(String si) throws Throwable {
        opcommerceStep.seleccionarOpcionBoletin(si);
    }

    @Y("^escribir contraseña como \"([^\"]*)\"$")
    public void escribirContraseñaComo(String contraseña) throws Throwable {
        opcommerceStep.escribirContraseñaComo(contraseña);
    }

    @Y("^confirmar contraseña como \"([^\"]*)\"$")
    public void confirmarContraseñaComo(String confPassword) throws Throwable {
        opcommerceStep.confirmarContraseñaComo(confPassword);
    }

    @Y("^hacemos click en register$")
    public void hacemosClickEnRegister() {
        opcommerceStep.hacemosClickEnRegister();
    }

    @Entonces("^validamos que se haya registrado correctamente$")
    public void validamosQueSeHayaRegistradoCorrectamente() {
        opcommerceStep.validamosQueSeHayaRegistradoCorrectamente();
    }


    // compra de producto
    @Dado("^que se necesita abrir la pagina nopCommerce login en el navegador \"([^\"]*)\"$")
    public void queSeNecesitaAbrirLaPaginaNopCommerceLoginEnElNavegador(String navegador) throws Throwable {
        opcommerceStep.queSeNecesitaAbrirLaPaginaNopCommerceLoginEnElNavegador(navegador);
    }

    @Y("^seleccionar login para agregar la direccipon y realizar una compra$")
    public void seleccionarLoginParaAgregarLaDirecciponYRealizarUnaCompra() {
        opcommerceStep.seleccionarLoginParaAgregarLaDirecciponYRealizarUnaCompra();
    }

    @Y("^hacemos click en boton login$")
    public void hacemosClickEnBotonLogin() {
        opcommerceStep.hacemosClickEnBotonLogin();
    }

    @Cuando("^quiero actualizar mi direccion click en My account$")
    public void quieroActualizarMiDireccionClickEnMyAccount() {
        opcommerceStep.quieroActualizarMiDireccionClickEnMyAccount();
    }

    @Y("^hacer click en Addresses$")
    public void hacerClickEnAddresses() {
        opcommerceStep.hacerClickEnAddresses();
    }

    @Y("^hacer click en boton ADD NEW$")
    public void hacerClickEnBotonADDNEW() {
        opcommerceStep.hacerClickEnBotonADDNEW();
    }

    // NUEVA DIRECCION
    @Y("^escribir \"([^\"]*)\" nuevo en el cuadro de texto nombre$")
    public void escribirNuevoEnElCuadroDeTextoNombre(String newNombre) throws Throwable {
        opcommerceStep.escribirNuevoEnElCuadroDeTextoNombre(newNombre);

    }

    @Y("^escribir \"([^\"]*)\" nuevo en el cuadro de texto apellido$")
    public void escribirNuevoEnElCuadroDeTextoApellido(String newApellido) throws Throwable {
        opcommerceStep.escribirNuevoEnElCuadroDeTextoApellido(newApellido);
    }

    @Y("^escribir el \"([^\"]*)\" nuevo en el cuadro de texto e-mail$")
    public void escribirElNuevoEnElCuadroDeTextoEMail(String newEmail) throws Throwable {
        opcommerceStep.escribirElNuevoEnElCuadroDeTextoEMail(newEmail);
    }
    @Y("^escribir \"([^\"]*)\" en el cuadro de texto compañia$")
    public void escribirEnElCuadroDeTextoCompañia(String compania) throws Throwable {
        opcommerceStep.escribirEnElCuadroDeTextoCompañia(compania);
    }


    @Y("^eligir el \"([^\"]*)\" en pais$")
    public void eligirElEnPais(String pais) throws Throwable {
        opcommerceStep.eligirElEnPais(pais);
    }

    @Y("^eligir el \"([^\"]*)\" en estado$")
    public void eligirElEnEstado(String estado) throws Throwable {
        opcommerceStep.eligirElEnEstado(estado);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto ciudad$")
    public void escribirEnElCuadroDeTextoCiudad(String ciudad) throws Throwable {
       opcommerceStep.escribirEnElCuadroDeTextoCiudad(ciudad);
    }

    @Y("^escribir \"([^\"]*)\" nuevo  en el cuadro de texto dirección$")
    public void escribirNuevoEnElCuadroDeTextoDirección(String direccion) throws Throwable {
       opcommerceStep.escribirNuevoEnElCuadroDeTextoDirección(direccion);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto codigo postal$")
    public void escribirEnElCuadroDeTextoCodigoPostal(String cpostal) throws Throwable {
        opcommerceStep.escribirEnElCuadroDeTextoCodigoPostal(cpostal);
    }

    @Y("^escribir \"([^\"]*)\" nuevo en el cuadro de texto número de telefono$")
    public void escribirNuevoEnElCuadroDeTextoNúmeroDeTelefono(String telefono) throws Throwable {
        opcommerceStep.escribirNuevoEnElCuadroDeTextoNúmeroDeTelefono(telefono);
    }

    @Y("^hacemos click en save$")
    public void hacemosClickEnSave() {
        opcommerceStep.hacemosClickEnSave();
    }

    @Cuando("^quiro realizar una compra click logo nopCommerce a pagina principal$")
    public void quiroRealizarUnaCompraClickLogoNopCommerceAPaginaPrincipal() {
        opcommerceStep.quiroRealizarUnaCompraClickLogoNopCommerceAPaginaPrincipal();
    }

    @Y("^escribir el \"([^\"]*)\" en cuadro de texto buscar$")
    public void escribirElEnCuadroDeTextoBuscar(String producto) throws Throwable {
        opcommerceStep.escribirElEnCuadroDeTextoBuscar(producto);
    }

    @Y("^hacer click en buscar$")
    public void hacerClickEnBuscar() {
        opcommerceStep.hacerClickEnBuscar();
    }

    @Y("^hacer click en nombre producto encontrado para detalle$")
    public void hacerClickEnNombreProductoEncontradoParaDetalle() {
        opcommerceStep.hacerClickEnNombreProductoEncontradoParaDetalle();
    }

    @Y("^hacer click en ADD TO CART para agregar al carito$")
    public void hacerClickEnADDTOCARTParaAgregarAlCarito() {
        opcommerceStep.hacerClickEnADDTOCARTParaAgregarAlCarito();
    }

    @Y("^hacer click en Shopping cart para comprar$")
    public void hacerClickEnShoppingCartParaComprar() {
        opcommerceStep.hacerClickEnShoppingCartParaComprar();
    }

    @Y("^hacer Checkbox para aceptar los terminos$")
    public void hacerCheckboxParaAceptarLosTerminos() {
        opcommerceStep.hacerCheckboxParaAceptarLosTerminos();
    }

    @Y("^hacer click en CHECKOUT para aceptar$")
    public void hacerClickEnCHECKOUTParaAceptar() {
        opcommerceStep.hacerClickEnCHECKOUTParaAceptar();
    }

    @Y("^hacer click en CONTINUE para validar la direccion$")
    public void hacerClickEnCONTINUEParaValidarLaDireccion() {
        opcommerceStep.hacerClickEnCONTINUEParaValidarLaDireccion();
    }

    @Y("^hacer click en CONTINUE para validar tipo de entrega$")
    public void hacerClickEnCONTINUEParaValidarTipoDeEntrega() {
        opcommerceStep.hacerClickEnCONTINUEParaValidarTipoDeEntrega();
    }

    @Y("^hacer click en CONTINUE para validar tipo de pago$")
    public void hacerClickEnCONTINUEParaValidarTipoDePago() {
        opcommerceStep.hacerClickEnCONTINUEParaValidarTipoDePago();
    }

    @Y("^hacer click en CONTINUE para validar datos$")
    public void hacerClickEnCONTINUEParaValidarDatos() {
        opcommerceStep.hacerClickEnCONTINUEParaValidarDatos();
    }

    @Y("^hacer click en CONTINUE para confirmar compra$")
    public void hacerClickEnCONTINUEParaConfirmarCompra() {
        opcommerceStep.hacerClickEnCONTINUEParaConfirmarCompra();
    }

    @Entonces("^validamos la compra exitosa$")
    public void validamosLaCompraExitosa() {
        opcommerceStep.validamosLaCompraExitosa();
    }




}











