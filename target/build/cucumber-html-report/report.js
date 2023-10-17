$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/web/opcommerce.feature");
formatter.feature({
  "name": "registranos y realizar una compra en la web nopCommerce",
  "description": "  Como usuario\n  Quiero probar la funcionabilidad del fomulario de registro de usuario y compra de producto\n  Para validar su correcto funcionamiento",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@nopCommerce"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Completar el formulario de registro de usuario nopCommerce",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@REGISTRO"
    }
  ]
});
formatter.step({
  "name": "que se necesita abrir la pagina nopCommerce registro en el navegador \"\u003cNAVEGADOR\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "seleccionar registro para ingresar al fumulario",
  "keyword": "Y "
});
formatter.step({
  "name": "seleccionar el género \"\u003cGENERO\u003e\" usuario",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cNOMBRE\u003e\" en el cuadro de texto de nombre",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cAPELLIDO\u003e\" en el cuadro de texto de apellido",
  "keyword": "Y "
});
formatter.step({
  "name": "seleccionar fecha de nacimiento\"\u003cDIA\u003e\" dia \"\u003cMES\u003e\" mes \"\u003cANIO\u003e\" año",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir el \"\u003cCORREO\u003e\" en el cuadro de texto de e-mail",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cNOMBRE-COMPANIA\u003e\" en el cuadro de texto nombre compañia",
  "keyword": "Y "
});
formatter.step({
  "name": "seleccionar opcion boletin \"\u003cNEWSLETTER\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir contraseña como \"\u003cPASSWORD\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "confirmar contraseña como \"\u003cCONFIRM-PASSWORD\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "hacemos click en register",
  "keyword": "Y "
});
formatter.step({
  "name": "validamos que se haya registrado correctamente",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "NAVEGADOR",
        "GENERO",
        "NOMBRE",
        "APELLIDO",
        "DIA",
        "MES",
        "ANIO",
        "CORREO",
        "NOMBRE-COMPANIA",
        "NEWSLETTER",
        "PASSWORD",
        "CONFIRM-PASSWORD"
      ]
    },
    {
      "cells": [
        "chrome",
        "Male",
        "luis",
        "pancho",
        "28",
        "April",
        "2009",
        "ddd@man.com",
        "tecnico sac",
        "si",
        "123456",
        "123456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Completar el formulario de registro de usuario nopCommerce",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@nopCommerce"
    },
    {
      "name": "@REGISTRO"
    }
  ]
});
formatter.step({
  "name": "que se necesita abrir la pagina nopCommerce registro en el navegador \"chrome\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "opcommerceStepDefinition.queSeNecesitaAbrirLaPaginaDEMOQAFormulariosEnElNavegador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar registro para ingresar al fumulario",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.seleccionarRegistroParaIngresarAlFumulario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar el género \"Male\" usuario",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.seleccionarElGéneroUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"luis\" en el cuadro de texto de nombre",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirEnElCuadroDeTextoDeNombre(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"pancho\" en el cuadro de texto de apellido",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirEnElCuadroDeTextoDeApellido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar fecha de nacimiento\"28\" dia \"April\" mes \"2009\" año",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.seleccionarFechaDeNacimientoDiaMesAño(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir el \"ddd@man.com\" en el cuadro de texto de e-mail",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirElEnElCuadroDeTextoDeEMail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"tecnico sac\" en el cuadro de texto nombre compañia",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirEnElCuadroDeTextoNombreCompañia(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar opcion boletin \"si\"",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.seleccionarOpcionBoletin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir contraseña como \"123456\"",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirContraseñaComo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmar contraseña como \"123456\"",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.confirmarContraseñaComo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacemos click en register",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.hacemosClickEnRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validamos que se haya registrado correctamente",
  "keyword": "Entonces "
});
formatter.match({
  "location": "opcommerceStepDefinition.validamosQueSeHayaRegistradoCorrectamente()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Iniciar sesion, agregar la dirección y hacer una compra",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@LOGIN"
    }
  ]
});
formatter.step({
  "name": "que se necesita abrir la pagina nopCommerce login en el navegador \"\u003cNAVEGADOR\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "seleccionar login para agregar la direccipon y realizar una compra",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir el \"\u003cCORREO\u003e\" en el cuadro de texto de e-mail",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir contraseña como \"\u003cPASSWORD\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "hacemos click en boton login",
  "keyword": "Y "
});
formatter.step({
  "name": "quiero actualizar mi direccion click en My account",
  "keyword": "Cuando "
});
formatter.step({
  "name": "hacer click en Addresses",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en boton ADD NEW",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cNEW_NOMBRE\u003e\" nuevo en el cuadro de texto nombre",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cNEW_APELLIDO\u003e\" nuevo en el cuadro de texto apellido",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir el \"\u003cNEW_CORREO\u003e\" nuevo en el cuadro de texto e-mail",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cCOMPANY\u003e\" en el cuadro de texto compañia",
  "keyword": "Y "
});
formatter.step({
  "name": "eligir el \"\u003cPAIS\u003e\" en pais",
  "keyword": "Y "
});
formatter.step({
  "name": "eligir el \"\u003cESTADO\u003e\" en estado",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cCIUDAD\u003e\" en el cuadro de texto ciudad",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cDIRECCION\u003e\" nuevo  en el cuadro de texto dirección",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cCODIGO_P\u003e\" en el cuadro de texto codigo postal",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cTELEFONO\u003e\" nuevo en el cuadro de texto número de telefono",
  "keyword": "Y "
});
formatter.step({
  "name": "hacemos click en save",
  "keyword": "Y "
});
formatter.step({
  "name": "quiro realizar una compra click logo nopCommerce a pagina principal",
  "keyword": "Cuando "
});
formatter.step({
  "name": "escribir el \"\u003cPRODUCTO\u003e\" en cuadro de texto buscar",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en buscar",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en nombre producto encontrado para detalle",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en ADD TO CART para agregar al carito",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en Shopping cart para comprar",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer Checkbox para aceptar los terminos",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en CHECKOUT para aceptar",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en CONTINUE para validar la direccion",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en CONTINUE para validar tipo de entrega",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en CONTINUE para validar tipo de pago",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en CONTINUE para validar datos",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en CONTINUE para confirmar compra",
  "keyword": "Y "
});
formatter.step({
  "name": "validamos la compra exitosa",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "NAVEGADOR",
        "CORREO",
        "PASSWORD",
        "NEW_NOMBRE",
        "NEW_APELLIDO",
        "NEW_CORREO",
        "COMPANY",
        "PAIS",
        "ESTADO",
        "CIUDAD",
        "DIRECCION",
        "CODIGO_P",
        "TELEFONO",
        "PRODUCTO"
      ]
    },
    {
      "cells": [
        "chrome",
        "ddd@man.com",
        "123456",
        "luis segusndo",
        "pancho II",
        "ert@man.com",
        "bueno",
        "United States",
        "Alabama",
        "Alabama",
        "por aqui",
        "111",
        "123456789",
        "Nokia Lumia 1020"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Iniciar sesion, agregar la dirección y hacer una compra",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@nopCommerce"
    },
    {
      "name": "@LOGIN"
    }
  ]
});
formatter.step({
  "name": "que se necesita abrir la pagina nopCommerce login en el navegador \"chrome\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "opcommerceStepDefinition.queSeNecesitaAbrirLaPaginaNopCommerceLoginEnElNavegador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar login para agregar la direccipon y realizar una compra",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.seleccionarLoginParaAgregarLaDirecciponYRealizarUnaCompra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir el \"ddd@man.com\" en el cuadro de texto de e-mail",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirElEnElCuadroDeTextoDeEMail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir contraseña como \"123456\"",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirContraseñaComo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacemos click en boton login",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.hacemosClickEnBotonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quiero actualizar mi direccion click en My account",
  "keyword": "Cuando "
});
formatter.match({
  "location": "opcommerceStepDefinition.quieroActualizarMiDireccionClickEnMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en Addresses",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.hacerClickEnAddresses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en boton ADD NEW",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.hacerClickEnBotonADDNEW()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"luis segusndo\" nuevo en el cuadro de texto nombre",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirNuevoEnElCuadroDeTextoNombre(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"pancho II\" nuevo en el cuadro de texto apellido",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirNuevoEnElCuadroDeTextoApellido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir el \"ert@man.com\" nuevo en el cuadro de texto e-mail",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirElNuevoEnElCuadroDeTextoEMail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"bueno\" en el cuadro de texto compañia",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirEnElCuadroDeTextoCompañia(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eligir el \"United States\" en pais",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.eligirElEnPais(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eligir el \"Alabama\" en estado",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.eligirElEnEstado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"Alabama\" en el cuadro de texto ciudad",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirEnElCuadroDeTextoCiudad(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"por aqui\" nuevo  en el cuadro de texto dirección",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirNuevoEnElCuadroDeTextoDirección(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"111\" en el cuadro de texto codigo postal",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirEnElCuadroDeTextoCodigoPostal(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"123456789\" nuevo en el cuadro de texto número de telefono",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirNuevoEnElCuadroDeTextoNúmeroDeTelefono(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacemos click en save",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.hacemosClickEnSave()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quiro realizar una compra click logo nopCommerce a pagina principal",
  "keyword": "Cuando "
});
formatter.match({
  "location": "opcommerceStepDefinition.quiroRealizarUnaCompraClickLogoNopCommerceAPaginaPrincipal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir el \"Nokia Lumia 1020\" en cuadro de texto buscar",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.escribirElEnCuadroDeTextoBuscar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en buscar",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.hacerClickEnBuscar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en nombre producto encontrado para detalle",
  "keyword": "Y "
});
formatter.match({
  "location": "opcommerceStepDefinition.hacerClickEnNombreProductoEncontradoParaDetalle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en ADD TO CART para agregar al carito",
  "keyword": "Y "
});
});