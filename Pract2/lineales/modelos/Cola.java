package lineales.modelos;

public interface Cola<T> {
  // metodos Modificadores del estado de una Cola

  /** inserta el Elemento en una Cola situandolo al final
      @param e elemento a insertar
      **/
  void encolar(T e);

  /** Consulta y extrae el primer elemento, solo si la cola no está vacía
      @return elemento desencolado
      **/
  T desencolar();

  // metodos consultores del estado de una cola

  int talla();

  T primero();

  boolean esVacia();
}
