import javax.swing.*;

public class CompraProductos {
    public static void main(String[] args) {
        // Valores Fijos
        final double VALOR_IVA = 1.21;
        final double VALOR_GANANCIA = 1.15;
        double compra_final;

        // Input Cliente
        String nombreProductoUno;
        String precioProductoInputUno;
        double precioProductoUno;

        String nombreProductoDos;
        String precioProductoInputDos;
        double precioProductoDos;

        String nombreProductoTres;
        String precioProductoInputTres;
        double precioProductoTres;

        String nombreProductoCuatro;
        String precioProductoInputCuatro;
        double precioProductoCuatro;

        String nombreProductoCinco;
        String precioProductoInputCinco;
        double precioProductoCinco;

        //=============================================================
        String eleccionProducto;

        JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora de productos");

        nombreProductoUno = JOptionPane.showInputDialog("Ingrese el NOMBRE del Producto 1");
        precioProductoInputUno = JOptionPane.showInputDialog(null, "Ingresa el PRECIO del Producto 1");
        precioProductoUno = Double.parseDouble(precioProductoInputUno);
        // SUGERENCIA DESARROLLO:  Seria ideal agregar un validador tanto para producto en blanco/no completado y
        // para precio no numerico y precio en blanco (ver sugerencia anexa en validacion final)

        nombreProductoDos = JOptionPane.showInputDialog("Ingrese el NOMBRE del Producto 2");
        precioProductoInputDos = JOptionPane.showInputDialog(null, "Ingresa el PRECIO del Producto 2");
        precioProductoDos = Double.parseDouble(precioProductoInputDos);
        // SUGERENCIA DESARROLLO:  Seria ideal agregar un validador tanto para producto en blanco/no completado y
        // para precio no numerico y precio en blanco (ver sugerencia anexa en validacion final)

        nombreProductoTres = JOptionPane.showInputDialog("Ingrese el NOMBRE del Producto 3");
        precioProductoInputTres = JOptionPane.showInputDialog(null, "Ingresa el PRECIO del Product 3");
        precioProductoTres = Double.parseDouble(precioProductoInputTres);
        // SUGERENCIA DESARROLLO:  Seria ideal agregar un validador tanto para producto en blanco/no completado y
        // para precio no numerico y precio en blanco (ver sugerencia anexa en validacion final)

        nombreProductoCuatro = JOptionPane.showInputDialog("Ingrese el NOMBRE del Producto 4");
        precioProductoInputCuatro = JOptionPane.showInputDialog(null, "Ingresa el PRECIO del Producto 4");
        precioProductoCuatro = Double.parseDouble(precioProductoInputCuatro);
        // SUGERENCIA DESARROLLO:  Seria ideal agregar un validador tanto para producto en blanco/no completado y
        // para precio no numerico y precio en blanco (ver sugerencia anexa en validacion final)

        nombreProductoCinco = JOptionPane.showInputDialog("Ingrese el NOMBRE del Producto 5");
        precioProductoInputCinco = JOptionPane.showInputDialog(null, "Ingresa el PRECIO del Producto 5");
        precioProductoCinco = Double.parseDouble(precioProductoInputCinco);
        // SUGERENCIA DESARROLLO:  Seria ideal agregar un validador tanto para producto en blanco/no completado y
        // para precio no numerico y precio en blanco (ver sugerencia anexa en validacion final)


        JOptionPane.showMessageDialog(null, "Este es el listado de productos ingresados: \n" + nombreProductoUno + ": $" + precioProductoUno + "\n" + nombreProductoDos + ": $" + precioProductoDos + "\n" + nombreProductoTres + ": $" + precioProductoTres + "\n" + nombreProductoCuatro + ": $" + precioProductoCuatro + "\n" + nombreProductoCinco + ": $" + precioProductoCinco);


        // HINT: Utilizacion de tokens para evitar ingreso manual de palabras previniendo errores
        // de tipeo del usuario + reduccion de codigo
        eleccionProducto = JOptionPane.showInputDialog("Elija el numero del producto que desea comprar (seleccionado del 1 al 5)" + "\n" + "1 > " + nombreProductoUno + "\n" + "2 > " + nombreProductoDos + "\n" + "3 > " + nombreProductoTres + "\n" + "4 > " + nombreProductoCuatro + "\n" + "5 > " + nombreProductoCinco);


        //SUGERENCIA DESARROLLO: Utilizar Cases para optimizar y reducir codigo
        if (eleccionProducto.equals("1")) {
            compra_final = precioProductoUno * VALOR_IVA * VALOR_GANANCIA;
            JOptionPane.showMessageDialog(null, "El valor de su compra de " + nombreProductoUno + " es de\n$" + compra_final);
            // SUGERENCIA DESARROLLO:  Es importante tener una validacion inicial al momento de ingresar los datos, ya que el riesgo es:
            // 1. El nombre del producto aparecera en blanco (si asi fue el caso de ingreso).
            // 2. En cuanto al calculo, de ingresar 0/sin dato/valor no numerico, el calculo fallara.

        } else if (eleccionProducto.equals("2")) {
            compra_final = precioProductoDos * VALOR_IVA * VALOR_GANANCIA;
            JOptionPane.showMessageDialog(null, "El valor de su compra de " + nombreProductoDos + " es de\n$" + compra_final);
            // SUGERENCIA DESARROLLO:  Es importante tener una validacion inicial al momento de ingresar los datos, ya que el riesgo es:
            // 1. El nombre del producto aparecera en blanco (si asi fue el caso de ingreso).
            // 2. En cuanto al calculo, de ingresar 0/sin dato/valor no numerico, el calculo fallara.

        } else if (eleccionProducto.equals("3")) {
            compra_final = precioProductoTres * VALOR_IVA * VALOR_GANANCIA;
            JOptionPane.showMessageDialog(null, "El valor de su compra de " + nombreProductoTres + " es de\n$" + compra_final);

            // SUGERENCIA DESARROLLO:  Es importante tener una validacion inicial al momento de ingresar los datos, ya que el riesgo es:
            // 1. El nombre del producto aparecera en blanco (si asi fue el caso de ingreso).
            // 2. En cuanto al calculo, de ingresar 0/sin dato/valor no numerico, el calculo fallara.

        } else if (eleccionProducto.equals("4")) {
            compra_final = precioProductoCuatro * VALOR_IVA * VALOR_GANANCIA;
            JOptionPane.showMessageDialog(null, "El valor de su compra de " + nombreProductoCuatro + " es de\n$" + compra_final);

            // SUGERENCIA DESARROLLO:  Es importante tener una validacion inicial al momento de ingresar los datos, ya que el riesgo es:
            // 1. El nombre del producto aparecera en blanco (si asi fue el caso de ingreso).
            // 2. En cuanto al calculo, de ingresar 0/sin dato/valor no numerico, el calculo fallara.

        } else if (eleccionProducto.equals("5")) {
            compra_final = precioProductoCinco * VALOR_IVA * VALOR_GANANCIA;
            JOptionPane.showMessageDialog(null, "El valor de su compra de " + nombreProductoCinco + " es de\n$" + compra_final);

            // SUGERENCIA DESARROLLO:  Es importante tener una validacion inicial al momento de ingresar los datos, ya que el riesgo es:
            // 1. El nombre del producto aparecera en blanco (si asi fue el caso de ingreso).
            // 2. En cuanto al calculo, de ingresar 0/sin dato/valor no numerico, el calculo fallara.

        } else if (eleccionProducto.equals("")) {
            JOptionPane.showMessageDialog(null, "No se ha ingresado ningun producto. \n Vuelva pronto!");

        } else{
            JOptionPane.showMessageDialog(null, "El producto no esta en la lista.");
        }

        System.out.println("Programa finalizado.");
    }
}
