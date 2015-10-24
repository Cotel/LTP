package lineales.implementacionesDeModelos;

import lineales.modelos.Cola;
import java.util.*;

public class ColaAL<T> implements Cola<T> {
  private ArrayList<T> elArray;

  public ColaAL() {
    elArray = new ArrayList<T>();
  }

  public void encolar(T e) {
    elArray.add(e);
  }

  public T desencolar() {
    if(elArray.size() == 0) return null;
    else {
      T aux = elArray.get(0);
      elArray.remove(0);
      return aux;
    }
  }

  public int talla() {
    return elArray.size();
  }

  public T primero() {
    return elArray.get(0);
  }

  public boolean esVacia() {
    return elArray.isEmpty();
  }

  public String toString() {
      String res = "";
      for(int i=0; i<elArray.size(); i++) {
        res += "<- "+elArray.get(i)+" ";
      }
      return res;
  }




}
