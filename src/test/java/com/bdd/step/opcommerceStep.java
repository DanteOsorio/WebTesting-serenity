package com.bdd.step;

import com.bdd.page.opcommercePage;
import net.thucydides.core.annotations.Step;

public class opcommerceStep {
    opcommercePage opcommercePage;

    @Step
    public void queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(String navegador) {
        opcommercePage.queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(navegador);
    }

    @Step
    public void seleccionarRegistroParaIngresarAlFumulario() {
        opcommercePage.seleccionarRegistroParaIngresarAlFumulario();
    }
    @Step
    public void seleccionarElGéneroUsuario(String genero) {
        opcommercePage.seleccionarElGéneroUsuario(genero);
    }
    @Step
    public void escribirEnElCuadroDeTextoDeNombre(String nombre) {
        opcommercePage.escribirEnElCuadroDeTextoDeNombre(nombre);
    }

    @Step
    public void escribirEnElCuadroDeTextoDeApellido(String apellido) {
        opcommercePage.escribirEnElCuadroDeTextoDeApellido(apellido);
    }
    @Step
    public void seleccionarFechaDeNacimientoDiaMesAño(String dia, String mes, String año) {
        opcommercePage.seleccionarFechaDeNacimientoDiaMesAño(dia, mes, año);
    }
    @Step
    public void escribirElEnElCuadroDeTextoDeEMail(String correo) {
        opcommercePage.escribirElEnElCuadroDeTextoDeEMail(correo);
    }
    @Step
    public void escribirEnElCuadroDeTextoNombreCompañia(String compañia) {
        opcommercePage.escribirEnElCuadroDeTextoNombreCompañia(compañia);
    }

    @Step
    public void seleccionarOpcionBoletin(String si) {
        opcommercePage.seleccionarOpcionBoletin(si);
    }

    @Step
    public void escribirContraseñaComo(String contraseña) {
        opcommercePage.escribirContraseñaComo(contraseña);
    }

    @Step
    public void confirmarContraseñaComo(String confPassword) {
        opcommercePage.confirmarContraseñaComo(confPassword);
    }

    @Step
    public void hacemosClickEnRegister() {
        opcommercePage.hacemosClickEnRegister();
    }

    @Step
    public void validamosQueSeHayaRegistradoCorrectamente() {
        opcommercePage.validamosQueSeHayaRegistradoCorrectamente();
    }

    // compra de producto
    @Step
    public void queSeNecesitaAbrirLaPaginaNopCommerceLoginEnElNavegador(String navegador) {
        opcommercePage.queSeNecesitaAbrirLaPaginaNopCommerceLoginEnElNavegador(navegador);
    }

    @Step
    public void seleccionarLoginParaAgregarLaDirecciponYRealizarUnaCompra() {
        opcommercePage.seleccionarLoginParaAgregarLaDirecciponYRealizarUnaCompra();
    }

    @Step
    public void hacemosClickEnBotonLogin() {
        opcommercePage.hacemosClickEnBotonLogin();
    }

    @Step
    public void quieroActualizarMiDireccionClickEnMyAccount() {
        opcommercePage.quieroActualizarMiDireccionClickEnMyAccount();
    }

    @Step
    public void hacerClickEnAddresses() {
        opcommercePage.hacerClickEnAddresses();
    }

    @Step
    public void hacerClickEnBotonADDNEW() {
        opcommercePage.hacerClickEnBotonADDNEW();
    }

    @Step
    public void escribirNuevoEnElCuadroDeTextoNombre(String newNombre) {
        opcommercePage.escribirNuevoEnElCuadroDeTextoNombre(newNombre);
    }

    @Step
    public void escribirNuevoEnElCuadroDeTextoApellido(String newApellido) {
        opcommercePage.escribirNuevoEnElCuadroDeTextoApellido(newApellido);
    }

    @Step
    public void escribirElNuevoEnElCuadroDeTextoEMail(String newEmail) {
        opcommercePage.escribirElNuevoEnElCuadroDeTextoEMail(newEmail);
    }
    @Step
    public void escribirEnElCuadroDeTextoCompañia(String compania) {
        opcommercePage.escribirEnElCuadroDeTextoCompañia(compania);
    }
    @Step
    public void eligirElEnPais(String pais) {
        opcommercePage.eligirElEnPais(pais);
    }

    @Step
    public void eligirElEnEstado(String estado) {
        opcommercePage.eligirElEnEstado(estado);
    }

    @Step
    public void escribirEnElCuadroDeTextoCiudad(String ciudad) {
        opcommercePage.escribirEnElCuadroDeTextoCiudad(ciudad);
    }

    @Step
    public void escribirNuevoEnElCuadroDeTextoDirección(String direccion) {
        opcommercePage.escribirNuevoEnElCuadroDeTextoDirección(direccion);
    }

    @Step
    public void escribirEnElCuadroDeTextoCodigoPostal(String cpostal) {
        opcommercePage.escribirEnElCuadroDeTextoCodigoPostal(cpostal);
    }

    @Step
    public void escribirNuevoEnElCuadroDeTextoNúmeroDeTelefono(String telefono) {
        opcommercePage.escribirNuevoEnElCuadroDeTextoNúmeroDeTelefono(telefono);
    }

    @Step
    public void hacemosClickEnSave() {
        opcommercePage.hacemosClickEnSave();
    }

    @Step
    public void quiroRealizarUnaCompraClickLogoNopCommerceAPaginaPrincipal() {
        opcommercePage.quiroRealizarUnaCompraClickLogoNopCommerceAPaginaPrincipal();
    }

    @Step
    public void escribirElEnCuadroDeTextoBuscar(String producto) {
        opcommercePage.escribirElEnCuadroDeTextoBuscar(producto);
    }

    @Step
    public void hacerClickEnBuscar() {
        opcommercePage.hacerClickEnBuscar();
    }

    @Step
    public void hacerClickEnNombreProductoEncontradoParaDetalle() {
        opcommercePage.hacerClickEnNombreProductoEncontradoParaDetalle();
    }

    @Step
    public void hacerClickEnADDTOCARTParaAgregarAlCarito() {
        opcommercePage.hacerClickEnADDTOCARTParaAgregarAlCarito();
    }

    @Step
    public void hacerClickEnShoppingCartParaComprar() {
        opcommercePage.hacerClickEnShoppingCartParaComprar();
    }

    @Step
    public void hacerCheckboxParaAceptarLosTerminos() {
        opcommercePage.hacerCheckboxParaAceptarLosTerminos();
    }

    @Step
    public void hacerClickEnCHECKOUTParaAceptar() {
        opcommercePage.hacerClickEnCHECKOUTParaAceptar();
    }

    @Step
    public void hacerClickEnCONTINUEParaValidarLaDireccion() {
        opcommercePage.hacerClickEnCONTINUEParaValidarLaDireccion();
    }

    @Step
    public void hacerClickEnCONTINUEParaValidarTipoDeEntrega() {
        opcommercePage.hacerClickEnCONTINUEParaValidarTipoDeEntrega();
    }

    @Step
    public void hacerClickEnCONTINUEParaValidarTipoDePago() {
        opcommercePage.hacerClickEnCONTINUEParaValidarTipoDePago();
    }

    @Step
    public void hacerClickEnCONTINUEParaValidarDatos() {
        opcommercePage.hacerClickEnCONTINUEParaValidarDatos();
    }

    @Step
    public void hacerClickEnCONTINUEParaConfirmarCompra() {
        opcommercePage.hacerClickEnCONTINUEParaConfirmarCompra();
    }

    @Step
    public void validamosLaCompraExitosa() {
        opcommercePage.validamosLaCompraExitosa();
    }





}














