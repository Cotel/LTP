package lineales.implementacionesDeModelos;

import lineales.modelos.Cola;

public class ColaAC <T> implements Cola<T> {
  // Definicion de atributos necesarios:
  final static int MAX = 100;

  // elArray, un array de tipo generico \verb"T para guardar los elementos de la Cola
  private T elArray[];
  //dos atributos primero y ultimo de tipo entero que mantienen una referencia a los indices
  // donde estan situados el primer y ultimo elemento de la Cola
  private int primero, ultimo;
  //atributo talla para representar la cantidad de elementos de la Cola
  private int talla;

  @SuppressWarnings({"unchecked"})
  public ColaAC() {
    elArray = (T[]) (new Object [MAX]); //(1)
    this.primero=0;
    this.ultimo=-1;
    this.talla=0;
  }

  @SuppressWarnings({"unchecked"})
  public void ampliarElArray() {
    T[] arrayAux = (T[]) (new Object [elArray.length * 2]);
    int i = 0;
    int tallaAux=talla;
    while(!this.esVacia()){
      try {
        arrayAux[i++] = this.desencolar();
      } catch (Exception e) {
        System.out.println("Error al intentar ampliar una cola");
      }
    }
    elArray = arrayAux;
    this.primero = 0;
    this.ultimo = tallaAux -1;
    this.talla = tallaAux;
  }

  public void encolar(T e) {
    if(talla == elArray.length){
      ampliarElArray();
    }
    talla++;
    ultimo = incrementar(ultimo);
    elArray[ultimo] = e;

  }

  public T desencolar() {
    if(talla == 0) return null;
    else {
      T aux = elArray[primero];
      primero = incrementar(primero);
      talla--;
      return aux;
    }
  }

  public int talla() {
    return this.talla;
  }

  public T primero(){
    return this.elArray[primero];
  }

  public boolean esVacia() {
    return this.talla == 0;
  }

  /** Devuelve la siguiente posicion ocupada del array modulo MAX.
    * Puede sustituirse por (i+1)%elArray.length
  **/
  private int incrementar(int i) {
    if(i == elArray.length -1){
      return 0;
    } else return i+1;
  }

  /** Devuelve el contenido de la cola con el formato
  *   <- elem0 <- elem1 <- elem2 <- ... <- elemN
  **/
  public String toString() {
    String res = "";
    for(int i=0; i<talla; i++) {
      res += "<- " + (elArray[primero+i]) +" ";
    }
    return res;
  }

}
