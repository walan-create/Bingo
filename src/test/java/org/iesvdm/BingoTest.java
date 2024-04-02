package org.iesvdm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class BingoTest {

  @Test
  void rellenarNumerosCarton(){
    int[][] array= new int[9][3];
    Bingo.rellenarNumerosCarton(array);
    boolean rango=true;

    for(int i=0;i<9;i++){
      for(int j=0;j<3;j++){
        System.out.println(10*(i+1)+" "+i*10+" "+array[i][j]);
        if ((array[i][j] > (10*(i+1))) || (array[i][j] < ((i*10)))) {
          rango=false;
        }
      }
    }
    assertTrue(rango);
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
    int [][] array=new int[9][3];
    Bingo.rellenarNumerosCarton(array);
    int fila=2;
    int posicion=4;
    boolean esta = Bingo.buscarFila(array,fila,posicion);
    if (array[posicion][fila]==-1){
      assertTrue(esta);
    }else if (!(array[posicion][fila] ==-1)){
      assertFalse(esta);
    }

  }

  @Test
  void buscarColumna(){
    int [][] array=new int[9][3];
    int contador=0;
    int posAleatoria=4;
    Bingo.rellenarNumerosCarton(array);
    Bingo.ponerBlancos(array);
    for(int j=0;j<3;j++){
      if(array[posAleatoria][j]==-1){
        contador++;
      }
    }
    if(contador==2){
      assertTrue(Bingo.buscarColumna(array,posAleatoria));
    }else{
      assertFalse(Bingo.buscarColumna(array,posAleatoria));
    }
  }

  @Test
  void buscarValorRepetido(){
    int[] array= {1,2,3,4,5};
    int elemento1=1;
    int elemento2=8;
    boolean respuesta1=false;
    boolean respuesta2=false;
    assertTrue(Bingo.buscarValorRepetido(array,elemento1));
    assertFalse(Bingo.buscarValorRepetido(array,elemento2));
  }

  @Test
  void pintarCarton(){
    int[][] array=new int[9][3];
    int[] bolas={1,2,8,25,27,89};
    int aciertos=0;
    Bingo.rellenarNumerosCarton(array);
    Bingo.pintarCarton(array,bolas);
    for(int i=0;i<9;i++){
      for(int j=0;j<3;j++){
        for(int k=0;k<bolas.length;k++){
          if(array[i][j]==bolas[k]){
            aciertos++;
          }
        }
      }
    }
    assertEquals(Bingo.pintarCarton(array,bolas),aciertos);
  }

  @Test
  void insertarAlFinal(){
    int[] array = {1,2,3,4,5,6,7,8,9};
    int[] esperado = {1,2,3,4,5,6,7,8,9,10};
    int diez=10;
    assertArrayEquals(Bingo.insertarAlFinal(array,diez),esperado);
  }

  @Test
  void ordenar(){
    int[] array = {1,4,2,8,6,9,7,3,5};
    int[] esperado = {1,2,3,4,5,6,7,8,9};
    assertArrayEquals(Bingo.ordenar(array),esperado);
  }
a
}
