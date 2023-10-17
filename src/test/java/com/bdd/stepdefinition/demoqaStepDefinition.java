package com.bdd.stepdefinition;

import com.bdd.step.demoqaStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class demoqaStepDefinition {

    @Steps
    demoqaStep demoqaStep;

    @Dado("que se necesita abrir la pagina DEMOQA formularios en el navegador Chrome")
    public void abrir_la_pagina_DEMOQA_formularios_en_el_navegador_Chrome() {
        demoqaStep.abrir_la_pagina_DEMOQA_formularios_en_el_navegador_Chrome();
    }

    @Y("^escribimos nuestro nombre en el cuadro de texto Nombre$")
    public void escribimosNuestroNombreEnElCuadroDeTextoNombre() {
        demoqaStep.escribimosNuestroNombreEnElCuadroDeTextoNombre();
    }

    @Y("^escribimos nuestro apellido en el cuadro de texto Apellido$")
    public void escribimosNuestroApellidoEnElCuadroDeTextoApellido() {
        demoqaStep.escribimosNuestroApellidoEnElCuadroDeTextoApellido();
    }

    @Y("^escribimos nuestro correo en el cuadro de texto Correo$")
    public void escribimosNuestroCorreoEnElCuadroDeTextoCorreo() {
        demoqaStep.escribimosNuestroCorreoEnElCuadroDeTextoCorreo();
    }

    @Y("^selecionar el genero$")
    public void selecionarElGenero() {
        demoqaStep.seleccionarElGenero();
    }

    @Y("^escribimos nuestro nro en el cuadro de texto Número de telefono$")
    public void escribimosNuestroNroEnElCuadroDeTextoNúmeroDeTelefono() {
        demoqaStep.escribimosNuestroNroEnElCuadroDeTextoNúmeroDeTelefono();
    }

    @Y("^escribimos algun texto en el text area Dirección actual$")
    public void escribimosAlgunTextoEnElTextAreaDirecciónActual() {
        demoqaStep.escribimosAlgunTextoEnElTextAreaDirecciónActual();
    }

    @Y("^hacemos click en Submit$")
    public void hacemosClickEnSubmit() {
        demoqaStep.hacemosClickEnSubmit();


    }

    @Entonces("^validamos algun elemento$")
    public void validamos_algun_elemento() {

        demoqaStep.validamos_algun_elemento();
    }

    // Aplicando esquema del escenario
    @Dado("^que se necesita abrir la pagina DEMOQA formularios en el navegador \"([^\"]*)\"$")
    public void queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(String navegador) throws Throwable {

        demoqaStep.queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(navegador);

    }


    @Y("^escribir \"([^\"]*)\" en el cuadro de texto nombre$")
    public void escribirEnElCuadroDeTextoNombre(String nombre) throws Throwable {
        demoqaStep.escribirEnElCuadroDeTextoNombre(nombre);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto apellido$")
    public void escribirEnElCuadroDeTextoApellido(String apellido) throws Throwable {

        demoqaStep.escribirEnElCuadroDeTextoApellido(apellido);
    }

    @Y("^escribir el \"([^\"]*)\" en el cuadro de texto e-mail$")
    public void escribirElEnElCuadroDeTextoEMail(String correo) throws Throwable {
        demoqaStep.escribirElEnElCuadroDeTextoEMail(correo);

    }

    @Y("^seleccionar el género \"([^\"]*)\"$")
    public void seleccionarElGénero(String genero) throws Throwable {

        demoqaStep.seleccionarElGénero(genero);

    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto número de telefono$")
    public void escribirEnElCuadroDeTextoNúmeroDeTelefono(String nro_telefono) throws Throwable {
        demoqaStep.escribirEnElCuadroDeTextoNúmeroDeTelefono(nro_telefono);

    }

    @Y("^seleccionar \"([^\"]*)\" como la fecha de cumpleaños$")
    public void seleccionarComoLaFechaDeCumpleaños(String fecha_cumple) throws Throwable {
        demoqaStep.seleccionarComoLaFechaDeCumpleaños(fecha_cumple);

    }

    @Y("^seleccionar \"([^\"]*)\" como asignaturas$")
    public void seleccionarComoAsignaturas(String asignaturas) throws Throwable {

        demoqaStep.seleccionarComoAsignaturas(asignaturas);
    }

    @Y("^seleccionar \"([^\"]*)\" como hobbies$")
    public void seleccionarComoHobbies(String hobbies) throws Throwable {
        demoqaStep.seleccionarComoHobbies(hobbies);

    }

    @Y("^seleccionar la ruta de una imagen \"([^\"]*)\"$")
    public void seleccionarLaRutaDeUnaImagen(String ruta) throws Throwable {
        demoqaStep.seleccionarLaRutaDeUnaImagen(ruta);

    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto dirección$")
    public void escribirEnElCuadroDeTextoDirección(String direccion) throws Throwable {

        demoqaStep.escribirEnElCuadroDeTextoDirección(direccion);

    }

    @Y("^seleccionar el estado \"([^\"]*)\" y la ciudad \"([^\"]*)\"$")
    public void seleccionarElEstadoYLaCiudad(String estado, String ciudad) throws Throwable {
        demoqaStep.seleccionarElEstadoYLaCiudad(estado, ciudad);

    }

    @Entonces("^Validamos que se haya registrado correctamente$")
    public void validamosQueSeHayaRegistradoCorrectamente() {
        demoqaStep.validamosQueSeHayaRegistradoCorrectamente();
    }


}
