package com.bdd.step;

import com.bdd.page.JuntozPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.awt.*;

public class JuntozStep extends ScenarioSteps {

    JuntozPage juntozPage;

    @Step
    public void Abrir_la_pagina_Juntoz_en_un_navegador() {
        juntozPage.Abrir_la_pagina_Juntoz_en_un_navegador();
    }

    @Step
    public void escribirLAPTOPEnElCuadroDeBusqueda(){
        juntozPage.escribirLAPTOPEnElCuadroDeBusqueda();
    }

    @Step
    public void hacerClickEnElBotónBuscar() {
        juntozPage.hacerClickEnElBotónBuscar();
    }

    @Step
    public void validarQueSeEncuentrenResultados() {
        juntozPage.validarQueSeEncuentrenResultados();
    }

    //ESCENARIO02_JUNTOZ_PARAMETROS
    @Step
    public void abrirLaPaginaJuntozEnElNavegador(String navegador) {
        juntozPage.abrirLaPaginaJuntozEnElNavegador(navegador);
    }

    @Step
    public void escribirEnElCuadroDeBusqueda(String producto) {
        juntozPage.escribirEnElCuadroDeBusqueda(producto);
    }

    //@ESCENARIO03_JUNTOZ
    @Step
    public void desplegarElPanelDeCategorías() {
        juntozPage.desplegarElPanelDeCategorías();
    }

    @Step
    public void seleccionarLaCategoría(String categoria) {
        juntozPage.seleccionarLaCategoría(categoria);
    }

    @Step
    public void seleccionarLaSubcategoría(String subcategoria) throws AWTException {
        juntozPage.seleccionarLaSubcategoría(subcategoria);
    }
}
