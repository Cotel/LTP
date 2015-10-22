import java.io.*;
import java.util.*;

public class UsoDeArrayList {
  public static void main(String[] args) {
      File fd;
      Scanner fichero;
      
      try {
          fd = new File("prueba.txt");
          fichero = new Scanner(fd);
          ArrayList<String> lista = new ArrayList<String>();
      
          while(fichero.hasNext()) {
              lista.add(fichero.nextLine());
            }
      
            java.util.Collections.sort(lista);
            System.out.println(lista.toString());
    } catch(Exception e) {
        System.out.println("Error");
    }
  }
}
