package tp8_ej6_Arbol_copy;


public class MainArbol {
    public static void main(String[] args) {
  

      Arbol arbol =  new ArbolBinario();
      arbol.insertar(8);
      arbol.insertar(3);
      arbol.insertar(1);
      arbol.insertar(6);
      arbol.insertar(10);
      arbol.insertar(14);
      arbol.insertar(13);
      arbol.insertar(4);
      arbol.insertar(6);

      arbol.recorrerEnOrdenEjecutarAccion(new ImprimirEnPantalla());
      CrearVectorValoresEnOrdenAscendente accionCrearVectorValoresEnOrdenAscendente =  new CrearVectorValoresEnOrdenAscendente();
      arbol.recorrerEnOrdenEjecutarAccion(accionCrearVectorValoresEnOrdenAscendente);
      System.out.println(accionCrearVectorValoresEnOrdenAscendente.getValores());

      CrearVectorValoresEnOrdenDescendente accionCrearVectorValoresEnOrdenDescendente =  new CrearVectorValoresEnOrdenDescendente();
      arbol.recorrerEnOrdenEjecutarAccion(accionCrearVectorValoresEnOrdenDescendente);
      System.out.println(accionCrearVectorValoresEnOrdenDescendente.getValores());

      ContarCantidadDeElementos accionConaContarCantidadDeElementos = new ContarCantidadDeElementos();
      arbol.recorrerEnOrdenEjecutarAccion(accionConaContarCantidadDeElementos);
      System.out.println(accionConaContarCantidadDeElementos.getCantidad());

      BuscarMenor accionBuscarMenor = new BuscarMenor();
      arbol.recorrerEnOrdenEjecutarAccion(accionBuscarMenor);
      System.out.println(accionBuscarMenor.getMenor());

      BuscarMayor accionBuscarMayor = new BuscarMayor();
      arbol.recorrerEnOrdenEjecutarAccion(accionBuscarMayor);
      System.out.println(accionBuscarMayor.getMayor());

    
        System.out.println();
 
        Arbol arbolString = new ArbolBinario();

        arbolString.insertar("gato");
        arbolString.insertar("perro");
        arbolString.insertar("conejo");
        arbolString.insertar("liebre");
        arbolString.insertar("jabalí");
        arbolString.insertar("carpincho");
        arbolString.insertar("zorro");
        arbolString.insertar("jabalí");
        arbolString.insertar("aguilucho");
        
        arbolString.recorrerEnOrdenEjecutarAccion(new ImprimirEnPantalla());
        
        accionCrearVectorValoresEnOrdenAscendente =  new CrearVectorValoresEnOrdenAscendente();
        arbolString.recorrerEnOrdenEjecutarAccion(accionCrearVectorValoresEnOrdenAscendente);
        System.out.println(accionCrearVectorValoresEnOrdenAscendente.getValores());
  
        accionCrearVectorValoresEnOrdenDescendente =  new CrearVectorValoresEnOrdenDescendente();
        arbolString.recorrerEnOrdenEjecutarAccion(accionCrearVectorValoresEnOrdenDescendente);
        System.out.println(accionCrearVectorValoresEnOrdenDescendente.getValores());
  
        accionConaContarCantidadDeElementos = new ContarCantidadDeElementos();
        arbolString.recorrerEnOrdenEjecutarAccion(accionConaContarCantidadDeElementos);
        System.out.println(accionConaContarCantidadDeElementos.getCantidad());
  
        accionBuscarMenor = new BuscarMenor();
        arbolString.recorrerEnOrdenEjecutarAccion(accionBuscarMenor);
        System.out.println(accionBuscarMenor.getMenor());
  
        accionBuscarMayor = new BuscarMayor();
        arbolString.recorrerEnOrdenEjecutarAccion(accionBuscarMayor);
        System.out.println(accionBuscarMayor.getMayor());
    

        System.out.println();

        Empleado empl1 = new Empleado("Juan", "García", 25458123, 7253, 100000);
        Empleado empl2 = new Empleado("María", "Pérez",23581111, 1222, 150000);
        Empleado empl3 = new Empleado("Pedro", "Ruiz", 27888954, 2375, 120000);
        Empleado empl4 = new Empleado("Federico", "Pérez", 12515712, 8253, 80000);
        Empleado empl5 = new Empleado("Facundo", "Quiroga", 33229331, 8002, 60400);
        Empleado empl6 = new Empleado("Rosa", "Blotta", 35252232, 9253, 140500);
        Empleado empl7 = new Empleado("Florencia", "Paz", 15811654, 1530, 110000);

        Arbol arbolEmpleado = new ArbolVector();

        arbolEmpleado.insertar(empl1);
        arbolEmpleado.insertar(empl2);
        arbolEmpleado.insertar(empl3);
        arbolEmpleado.insertar(empl4);
        arbolEmpleado.insertar(empl5);
        arbolEmpleado.insertar(empl6);
        arbolEmpleado.insertar(empl7);

        arbolEmpleado.recorrerEnOrdenEjecutarAccion(new ImprimirEnPantalla());
        System.out.println(" ASC");
        accionCrearVectorValoresEnOrdenAscendente =  new CrearVectorValoresEnOrdenAscendente();
        arbolEmpleado.recorrerEnOrdenEjecutarAccion(accionCrearVectorValoresEnOrdenAscendente);
        System.out.println(accionCrearVectorValoresEnOrdenAscendente.getValores());
        System.out.println("-----DESC-------");
        accionCrearVectorValoresEnOrdenDescendente =  new CrearVectorValoresEnOrdenDescendente();
        arbolEmpleado.recorrerEnOrdenEjecutarAccion(accionCrearVectorValoresEnOrdenDescendente);
        System.out.println(accionCrearVectorValoresEnOrdenDescendente.getValores());
 
        accionConaContarCantidadDeElementos = new ContarCantidadDeElementos();
        arbolEmpleado.recorrerEnOrdenEjecutarAccion(accionConaContarCantidadDeElementos);
        System.out.println(accionConaContarCantidadDeElementos.getCantidad());
 
        accionBuscarMenor = new BuscarMenor();
        arbolEmpleado.recorrerEnOrdenEjecutarAccion(accionBuscarMenor);
        System.out.println(accionBuscarMenor.getMenor());
 
        accionBuscarMayor = new BuscarMayor();
        arbolEmpleado.recorrerEnOrdenEjecutarAccion(accionBuscarMayor);
        System.out.println(accionBuscarMayor.getMayor());

      }
}
