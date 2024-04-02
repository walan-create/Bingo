package org.iesvdm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class BingoTest {

  @Test
  void rellenarNumerosCarton(){
    int[][] arrayBi= new int[9][3];
    Bingo.rellenarNumerosCarton(arrayBi);

  }

  @Test
  void ponerBlancos(){
      int [][] array=new int[9][3];
      int contador=0;
      Bingo.rellenarNumerosCarton(array);
      Bingo.ponerBlancos(array);
      for(int i=0;i<9;i++){
        for(int j=0;j<3;j++){
          if(array[i][j]==-1){
            contador++;
          }
        }
      }
      assertEquals(12,contador);
  }

  @Test
  void buscarFila(){

  }

  @Test
  void buscarColumna(){

  }

  @Test
  void buscarValorRepetido(){

  }

  @Test
  void pintarCarton(){

  }

  @Test
  void insertarAlFinal(){

  }

  @Test
  void ordenar(){

  }

}
