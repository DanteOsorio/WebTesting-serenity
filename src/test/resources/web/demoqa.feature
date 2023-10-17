#language: es

@FEATURE_DEMOQA
Característica: Llenar dormulario de la web demoqa
  Como Usuario
  Quiero probar la funcionalidad del formulario de la web demoqa
  Para validar su correcto funcionamiento

  @DEMOQA_01
  Escenario: Validar cuadros de texto del formulario
    Dado que se necesita abrir la pagina DEMOQA formularios en el navegador Chrome
    Y escribimos nuestro nombre en el cuadro de texto Nombre
    Y escribimos nuestro apellido en el cuadro de texto Apellido
    Y escribimos nuestro correo en el cuadro de texto Correo
    Y selecionar el genero
    Y escribimos nuestro nro en el cuadro de texto Número de telefono
    Y escribimos algun texto en el text area Dirección actual
    Y hacemos click en Submit
    Entonces validamos algun elemento


  @DEMOQA_02
  Esquema del escenario: Completar el formulario DEMOQA
    Dado que se necesita abrir la pagina DEMOQA formularios en el navegador "<NAVEGADOR>"
    Y escribir "<NOMBRE>" en el cuadro de texto nombre
    Y escribir "<APELLIDO>" en el cuadro de texto apellido
    Y escribir el "<CORREO>" en el cuadro de texto e-mail
    Y seleccionar el género "<GENERO>"
    Y escribir "<NÚMERO TELEFONO>" en el cuadro de texto número de telefono
    Y seleccionar "<FECHA CUMPLEAÑOS>" como la fecha de cumpleaños
    Y seleccionar "<ASIGNATURAS>" como asignaturas
    Y seleccionar "<HOBBIES>" como hobbies
    Y seleccionar la ruta de una imagen "<RUTA IMAGEN>"
    Y escribir "<DIRECCIÓN>" en el cuadro de texto dirección
    Y seleccionar el estado "<ESTADO>" y la ciudad "<CIUDAD>"
    Y hacemos click en Submit
    Entonces Validamos que se haya registrado correctamente

    Ejemplos:
      | NAVEGADOR | NOMBRE   | APELLIDO | CORREO          | GENERO | NÚMERO TELEFONO | FECHA CUMPLEAÑOS | ASIGNATURAS           | HOBBIES              | RUTA IMAGEN          | DIRECCIÓN | ESTADO  | CIUDAD |
      | chrome    | Carolina | Paredes  | caro@gmail.com  | Female | 1111111111      | 12/11/2000       | Arts,Commerce         | Sports,Music,Reading | C:\prueba\tarea.png | LIMA      | NCR     | Delhi  |



# PARA EL CAMPO Newsletter solo acepta valores SI Y NO


