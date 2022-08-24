public class ArbolMain {

    public static void main(String[] args) {
        
        Nodo  arbol = new Nodo();


        arbol.insertar(8);
        arbol.insertar(3);
        arbol.insertar(1);
        arbol.insertar(6);
        arbol.insertar(10);
        arbol.insertar(14);
        arbol.insertar(13);
        arbol.insertar(4);
        arbol.insertar(6);
       
        System.out.println();
        
        System.out.println(" Arbol de números enteros impreso por pantalla");
        arbol.ejecutarAccion(new ImprimirEnPantalla());

        System.out.println();
        System.out.println("Valores del vector ordenados en forma ascendente");
        System.out.println();
        
        CrearVectorOrdenAscendente accionCrearVectorOrdenASC = new CrearVectorOrdenAscendente();
        arbol.ejecutarAccion(accionCrearVectorOrdenASC);
        System.out.println(accionCrearVectorOrdenASC.getValores());

        System.out.println();
        System.out.println("Valores del vector ordenados  en forma descendente");
        System.out.println();
        
        CrearVectorOrdenDescendente accionCrearVectorOrdenDESC = new CrearVectorOrdenDescendente();
        arbol.ejecutarAccion(accionCrearVectorOrdenDESC);
        System.out.println(accionCrearVectorOrdenDESC.getValores());

        System.out.println();
        System.out.println("Cantidad de elementos ");

        ContarCantidadElementosVector accionContarElementosVEctor = new ContarCantidadElementosVector();
        arbol.ejecutarAccion(accionContarElementosVEctor);
        System.out.println("Total  elementos del vector: " + accionContarElementosVEctor.getCantidad());

        System.out.println();
        System.out.println("Vector: menor elemento");
        BuscarMenorElementoVector accionBuscarMenor = new BuscarMenorElementoVector();
        arbol.ejecutarAccion(accionBuscarMenor);
        System.out.println("Menor elemento: "+ accionBuscarMenor.getMenor());

        System.out.println();
        System.out.println("Vector: mayor elemento");

        BuscarMayorElementoVector accionBuscarMayor = new BuscarMayorElementoVector();
        arbol.ejecutarAccion(accionBuscarMayor);
        System.out.println("Mayor elemento: "+ accionBuscarMayor.getMayor());
        System.out.println();
        
        ///////////////// ARBOL ANIMALES //////////////////////////
        
        Nodo arbolString = new Nodo();

        arbolString.insertar("gato");
        arbolString.insertar("canario");
        arbolString.insertar("perro");
        arbolString.insertar("conejo");
        arbolString.insertar("liebre");
        arbolString.insertar("jabalí");
        arbolString.insertar("carpincho");
        arbolString.insertar("zorro");
        arbolString.insertar("aguilucho");

        System.out.println();
        
        System.out.println("Arbol de animales impreso por pantalla");
        System.out.println();

        arbolString.ejecutarAccion(new ImprimirEnPantalla());

        System.out.println();
        System.out.println("Valores del vector ordenados en forma ascendente");
        System.out.println();
        
        accionCrearVectorOrdenASC = new CrearVectorOrdenAscendente();
        arbolString.ejecutarAccion(accionCrearVectorOrdenASC);
        System.out.println(accionCrearVectorOrdenASC.getValores());

        System.out.println();
        System.out.println("Valores del vector ordenados  en forma descendente");
        System.out.println();

        accionCrearVectorOrdenDESC = new CrearVectorOrdenDescendente();
        arbolString.ejecutarAccion(accionCrearVectorOrdenDESC);
        System.out.println(accionCrearVectorOrdenDESC.getValores());

        System.out.println();
        System.out.println("Cantidad de elementos ");

        accionContarElementosVEctor = new ContarCantidadElementosVector();
        arbolString.ejecutarAccion(accionContarElementosVEctor);
        System.out.println("Total  elementos del vector: " + accionContarElementosVEctor.getCantidad());

        System.out.println();
        System.out.println("Vector: menor elemento");

        accionBuscarMenor = new BuscarMenorElementoVector();
        arbolString.ejecutarAccion(accionBuscarMenor);
        System.out.println("Menor elemento: "+ accionBuscarMenor.getMenor());

        System.out.println();
        System.out.println("Vector: mayor elemento");

        accionBuscarMayor = new BuscarMayorElementoVector();
        arbolString.ejecutarAccion(accionBuscarMayor);
        System.out.println("Mayor elemento: "+ accionBuscarMayor.getMayor());
        System.out.println();
        
        //////////////////// ARBOL EMPLEADOS ///////////////////////

        System.out.println();

        Empleado empl1 = new Empleado("Juan", "García", 25458123, 7253, 100000);
        Empleado empl2 = new Empleado("María", "Pérez",23581111, 1222, 150000);
        Empleado empl3 = new Empleado("Pedro", "Ruiz", 27888954, 2375, 120000);
        Empleado empl4 = new Empleado("Federico", "Pérez", 12515712, 8253, 80000);
        Empleado empl5 = new Empleado("Facundo", "Quiroga", 33229331, 8002, 60400);
        Empleado empl6 = new Empleado("Rosa", "Blotta", 35252232, 9253, 140500);
        Empleado empl7 = new Empleado("Florencia", "Paz", 15811654, 1530, 110000);

        Nodo arbolEmpleado = new Nodo();

        arbolEmpleado.insertar(empl1);
        arbolEmpleado.insertar(empl2);
        arbolEmpleado.insertar(empl3);
        arbolEmpleado.insertar(empl4);
        arbolEmpleado.insertar(empl5);
        arbolEmpleado.insertar(empl6);
        arbolEmpleado.insertar(empl7);

        System.out.println();
        
        System.out.println("Arbol de Empleados impreso por pantalla");
        System.out.println();

        arbolEmpleado.ejecutarAccion(new ImprimirEnPantalla());

        System.out.println();
        System.out.println("Valores del vector ordenados en forma ascendente por Nº de legajo");
        System.out.println();

        accionCrearVectorOrdenASC = new CrearVectorOrdenAscendente();
        arbolEmpleado.ejecutarAccion(accionCrearVectorOrdenASC);
        System.out.println(accionCrearVectorOrdenASC.getValores());

        System.out.println();
        System.out.println("Valores del vector ordenados  en forma descendente por Nº de legajo");
        System.out.println();

        accionCrearVectorOrdenDESC = new CrearVectorOrdenDescendente();
        arbolEmpleado.ejecutarAccion(accionCrearVectorOrdenDESC);
        System.out.println(accionCrearVectorOrdenDESC.getValores());

        System.out.println();
        System.out.println("Cantidad de elementos ");

        accionContarElementosVEctor = new ContarCantidadElementosVector();
        arbolEmpleado.ejecutarAccion(accionContarElementosVEctor);
        System.out.println("Total  elementos del vector: " + accionContarElementosVEctor.getCantidad());

        System.out.println();
        System.out.println("Vector: menor elemento");

        accionBuscarMenor = new BuscarMenorElementoVector();
        arbolEmpleado.ejecutarAccion(accionBuscarMenor);
        System.out.println("Menor elemento: "+ accionBuscarMenor.getMenor());

        System.out.println();
        System.out.println("Vector: mayor elemento");

        accionBuscarMayor = new BuscarMayorElementoVector();
        arbolEmpleado.ejecutarAccion(accionBuscarMayor);
        System.out.println("Mayor elemento: "+ accionBuscarMayor.getMayor());
    }
}
