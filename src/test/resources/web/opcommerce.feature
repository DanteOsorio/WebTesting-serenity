#language: es
@nopCommerce
Característica: registranos y realizar una compra en la web nopCommerce
  Como usuario
  Quiero probar la funcionabilidad del fomulario de registro de usuario y compra de producto
  Para validar su correcto funcionamiento
  ## ESCENARIO 1
  @REGISTRO
  Esquema del escenario: Completar el formulario de registro de usuario nopCommerce
    Dado que se necesita abrir la pagina nopCommerce registro en el navegador "<NAVEGADOR>"
    Y seleccionar registro para ingresar al fumulario
    Y seleccionar el género "<GENERO>" usuario
    Y escribir "<NOMBRE>" en el cuadro de texto de nombre
    Y escribir "<APELLIDO>" en el cuadro de texto de apellido
    Y seleccionar fecha de nacimiento"<DIA>" dia "<MES>" mes "<ANIO>" año
    Y escribir el "<CORREO>" en el cuadro de texto de e-mail
    Y escribir "<NOMBRE-COMPANIA>" en el cuadro de texto nombre compañia
    Y seleccionar opcion boletin "<NEWSLETTER>"
    Y escribir contraseña como "<PASSWORD>"
    Y confirmar contraseña como "<CONFIRM-PASSWORD>"
    Y hacemos click en register
    Entonces validamos que se haya registrado correctamente

    Ejemplos:
      | NAVEGADOR | GENERO | NOMBRE | APELLIDO | DIA | MES   | ANIO | CORREO      | NOMBRE-COMPANIA | NEWSLETTER | PASSWORD | CONFIRM-PASSWORD |
      | chrome    | Male   | luis   | pancho   | 28  | April | 2009 | ddd@man.com | tecnico sac     | si         | 123456   | 123456           |
# ACEPTA LAS NOTIFICACIONES

#ESCENARIO 2
  @LOGIN
  Esquema del escenario: Iniciar sesion, agregar la dirección y hacer una compra
    Dado que se necesita abrir la pagina nopCommerce login en el navegador "<NAVEGADOR>"
    Y seleccionar login para agregar la direccipon y realizar una compra
    Y escribir el "<CORREO>" en el cuadro de texto de e-mail
    Y escribir contraseña como "<PASSWORD>"
    Y hacemos click en boton login
    Cuando quiero actualizar mi direccion click en My account
    Y hacer click en Addresses
    Y hacer click en boton ADD NEW
    Y escribir "<NEW_NOMBRE>" nuevo en el cuadro de texto nombre
    Y escribir "<NEW_APELLIDO>" nuevo en el cuadro de texto apellido
    Y escribir el "<NEW_CORREO>" nuevo en el cuadro de texto e-mail
    Y escribir "<COMPANY>" en el cuadro de texto compañia
    Y eligir el "<PAIS>" en pais
    Y eligir el "<ESTADO>" en estado
    Y escribir "<CIUDAD>" en el cuadro de texto ciudad
    Y escribir "<DIRECCION>" nuevo  en el cuadro de texto dirección
    Y escribir "<CODIGO_P>" en el cuadro de texto codigo postal
    Y escribir "<TELEFONO>" nuevo en el cuadro de texto número de telefono
    Y hacemos click en save
    Cuando quiro realizar una compra click logo nopCommerce a pagina principal
    Y escribir el "<PRODUCTO>" en cuadro de texto buscar
    Y hacer click en buscar
    Y hacer click en nombre producto encontrado para detalle
    Y hacer click en ADD TO CART para agregar al carito
    Y hacer click en Shopping cart para comprar
    Y hacer Checkbox para aceptar los terminos
    Y hacer click en CHECKOUT para aceptar
    Y hacer click en CONTINUE para validar la direccion
    Y hacer click en CONTINUE para validar tipo de entrega
    Y hacer click en CONTINUE para validar tipo de pago
    Y hacer click en CONTINUE para validar datos
    Y hacer click en CONTINUE para confirmar compra

    Entonces validamos la compra exitosa

    Ejemplos:
      | NAVEGADOR | CORREO      | PASSWORD | NEW_NOMBRE    | NEW_APELLIDO | NEW_CORREO  | COMPANY | PAIS          | ESTADO  | CIUDAD  | DIRECCION | CODIGO_P | TELEFONO  | PRODUCTO         |
      | chrome    | ddd@man.com | 123456   | luis segusndo | pancho II    | ert@man.com | bueno   | United States | Alabama | Alabama | por aqui  | 111      | 123456789 | Nokia Lumia 1020 |



 # EL ESCENACRIO 1 ES PARA EL REGISTRO EN LA PLATAFORMA
 # EL ESCENARIO 2 ES PARA EL LOGIN Y REALIZAR UNA COMPRA
 #SE COSIDERA EL PAIS DE REGITRO EEUU Y ESTADO ALABAMA CUIDAD ALABAMA






