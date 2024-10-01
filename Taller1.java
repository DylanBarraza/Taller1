import edu.princeton.cs.stdlib.*;

public class Taller1 {

    public static void main(String[] args) {

        /*
        Tamaño del lienzo
         */
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);

        StdDraw.show();
        StdDraw.setTitle("Minipaint");
        imprimirGuia();

        int teclaC =  67;
        int teclaS =  83;
        int teclaR = 82;
        int teclaG = 71;
        int teclaB = 66;
        int teclaMAS= 107;
        int teclaMENOS = 109;
        int tecla1 = 49;
        int tecla2 = 50;
        int tecla3 = 51;
        int tecla4 = 52;
        int tecla5 = 53;

        double tamañoNormal = 0.005;
        double tamaño = 0.0025;

        StdDraw.setPenRadius(tamañoNormal);
        StdDraw.setPenColor(StdDraw.BLACK);


        double ultimaPosicionX = -1;
        double ultimaPosicionY = -1;



        while (true) {

            // Dibujo en tiempo real

            if (StdDraw.isMousePressed()) {
                double posicionX = StdDraw.mouseX();
                double posicionY = StdDraw.mouseY();


                if (ultimaPosicionX != -1 && ultimaPosicionY != -1) {
                    StdDraw.line(ultimaPosicionX, ultimaPosicionY, posicionX, posicionY);
                }

                ultimaPosicionX = posicionX;
                ultimaPosicionY = posicionY;

            } else {
                ultimaPosicionX = -1;
                ultimaPosicionY = -1;

            // Limpiar linzo

            }  if (StdDraw.isKeyPressed(teclaC)) {
                StdDraw.clear();
                System.out.println("Se a limpiado el lienzo");

            // Guardar imagen como archivo

            } else if (StdDraw.isKeyPressed(teclaS)){
                StdDraw.save("dibujo.png");
                System.out.println("Guardando imagen");

            // Cambiar color del pincel
                // Rojo

            } else if (StdDraw.isKeyPressed(teclaR)) {
                StdDraw.setPenColor(StdDraw.RED);
                System.out.println("Tecla R: Color rojo");

                // Verde

            } else if (StdDraw.isKeyPressed(teclaG)) {
                StdDraw.setPenColor(StdDraw.GREEN);
                System.out.println("Tecla G, Color verde");

                // Azul

            } else if (StdDraw.isKeyPressed(teclaB)) {
                StdDraw.setPenColor(StdDraw.BLUE);

                System.out.println("Tecla B: Color azul");

                // Aumentar Tamaño


            } else if (StdDraw.isKeyPressed(teclaMAS)){
                StdDraw.setPenRadius(tamañoNormal + tamaño);
                System.out.println("Aumento el tamaño del pincel");

                // Disminuir tamaño

            }else if (StdDraw.isKeyPressed(teclaMENOS)) {
                StdDraw.setPenRadius(tamañoNormal - tamaño);
                System.out.println("Disminuyo el tamaño del pincel");




            } else if (StdDraw.isKeyPressed(tecla1)) {
                StdDraw.circle(StdDraw.mouseX(), StdDraw.mouseY(), 0.1);

            } else if (StdDraw.isKeyPressed(tecla2)) {

                StdDraw.square(StdDraw.mouseX(), StdDraw.mouseY(), 0.1);

            } else if (StdDraw.isKeyPressed(tecla3)) {

                // no se como colocarlo, pido mil disculpas


            } else if (StdDraw.isKeyPressed(tecla4)) {

                StdDraw.rectangle(StdDraw.mouseX(), StdDraw.mouseY(), 0.2, 0.1);

            } else if (StdDraw.isKeyPressed(tecla5)) {




            }

        }



    }
    /*
    menu de teclas para modificar el pincel o el lienzo
     */
    public static void imprimirGuia() {
        System.out.println(".::.:: Guia de Teclas ::.::. ");
        System.out.println(" ");
        System.out.println("C para limpiar el lienzo");
        System.out.println("S para guardar dibujo como imagen");
        System.out.println("R, G, B cambia el color del pincel a rojo, verde, azul");
        System.out.println("(+) y (-) aumenta o disminuye el tamaño del pincel");
        System.out.println(" ");
        System.out.println(".::.:: Dibujos de Formas Geometricas ::.::.");
        System.out.println(" ");
        System.out.println("1 para dibujar un circulo");
        System.out.println("2 para dibujar un cuadrado");
        System.out.println("3 para dibujar un triangulo");
        System.out.println("4 para dibujar un rectangulo");
        System.out.println("5 para dibujar un pentagono");

    }
}
