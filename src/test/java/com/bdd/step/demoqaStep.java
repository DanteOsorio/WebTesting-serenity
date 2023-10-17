package com.bdd.step;

import com.bdd.page.demoqaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class demoqaStep extends ScenarioSteps {

    demoqaPage demoqaPage;

    @Step
    public void abrir_la_pagina_DEMOQA_formularios_en_el_navegador_Chrome() {
        demoqaPage.abrir_la_pagina_DEMOQA_formularios_en_el_navegador_Chrome();
    }

    @Step
    public void escribimosNuestroNombreEnElCuadroDeTextoNombre() {
        demoqaPage.escribimosNuestroNombreEnElCuadroDeTextoNombre();
    }

    @Step
    public void escribimosNuestroApellidoEnElCuadroDeTextoApellido() {
        demoqaPage.escribimosNuestroApellidoEnElCuadroDeTextoApellido();
    }

    @Step
    public void escribimosNuestroCorreoEnElCuadroDeTextoCorreo() {
        demoqaPage.escribimosNuestroCorreoEnElCuadroDeTextoCorreo();
    }

    public void seleccionarElGenero() {
        demoqaPage.seleccionarElGenero();
    }
    @Step
    public void escribimosNuestroNroEnElCuadroDeTextoNúmeroDeTelefono() {
        demoqaPage.escribimosNuestroNroEnElCuadroDeTextoNúmeroDeTelefono();
    }

    @Step
    public void escribimosAlgunTextoEnElTextAreaDirecciónActual() {
        demoqaPage.escribimosAlgunTextoEnElTextAreaDirecciónActual();
    }

    @Step
    public void hacemosClickEnSubmit() {
        demoqaPage.hacemosClickEnSubmit();
    }

    @Step
    public void validamos_algun_elemento() {
        demoqaPage.validamos_algun_elemento();
    }

    //----------------------------------------------------------------
    // Aplicamdo esquema del escenario
    @Step
    public void queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(String navegador) {
        demoqaPage.queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(navegador);
    }

    @Step
    public void escribirEnElCuadroDeTextoNombre(String nombre) {
        demoqaPage.escribirEnElCuadroDeTextoNombre(nombre);
    }

    @Step
    public void escribirEnElCuadroDeTextoApellido(String apellido) {
        demoqaPage.escribirEnElCuadroDeTextoApellido(apellido);
    }

    @Step
    public void escribirElEnElCuadroDeTextoEMail(String correo) {
        demoqaPage.escribirElEnElCuadroDeTextoEMail(correo);
    }

    @Step
    public void seleccionarElGénero(String genero) {

        demoqaPage.seleccionarElGénero(genero);
    }

    @Step
    public void escribirEnElCuadroDeTextoNúmeroDeTelefono(String nro_telefono) {
        demoqaPage.escribirEnElCuadroDeTextoNúmeroDeTelefono(nro_telefono);
    }

    @Step
    public void seleccionarComoLaFechaDeCumpleaños(String fecha_cumple) {
        demoqaPage.seleccionarComoLaFechaDeCumpleaños(fecha_cumple);
    }

    @Step
    public void seleccionarComoAsignaturas(String asignaturas) {

        demoqaPage.seleccionarComoAsignaturas(asignaturas);
    }

    @Step
    public void seleccionarComoHobbies(String hobbies) {
        demoqaPage.seleccionarComoHobbies(hobbies);
    }

    @Step
    public void seleccionarLaRutaDeUnaImagen(String ruta) {
        demoqaPage.seleccionarLaRutaDeUnaImagen(ruta);
    }

    @Step
    public void escribirEnElCuadroDeTextoDirección(String direccion) {
        demoqaPage.escribirEnElCuadroDeTextoDirección(direccion);

    }

    @Step
    public void seleccionarElEstadoYLaCiudad(String estado, String ciudad) {
        demoqaPage.seleccionarElEstadoYLaCiudad(estado,ciudad);
    }

    @Step
    public void validamosQueSeHayaRegistradoCorrectamente() {
        demoqaPage.validamosQueSeHayaRegistradoCorrectamente();
    }


}















