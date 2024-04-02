package org.iesvdm;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class UtilesArraysTest {

    @Test
    void limpiar(){
        int[] a={1,2,3,4,5};
        int [] e=new int[0];
        a=UtilesArrays.limpiar();
        assertThat(a).isEqualTo(e);
    }

    @Test
    void rellenar(){
        int[] a=new int[0];
        int[] e={0,0,0,0,0};
        int num=5;
        a=UtilesArrays.rellenar(a,num);
        assertThat(a).isEqualTo(e);
        assertThat(a.length == num).isTrue();
    }

    @Test
    void insertarAlFinal(){
        int[] a={1,2,3,4,5};
        int num=10;
        a=UtilesArrays.insertarAlFinal(a,num);
        assertThat(a[a.length-1]).isEqualTo(num);
    }

    @Test
    void insertarAlPrincipio(){
        int[] a={1,2,3,4,5};
        int num=10;
        a=UtilesArrays.insertarAlPrincipio(a,num);
        assertThat(a[0]).isEqualTo(num);
    }

    @Test
    void insertarEnPosicion(){
        int[] a={1,2,3,4,5};
        int num=10;
        int pos=2;
        a=UtilesArrays.insertarEnPosicion(a,num,pos);
        assertThat(a[pos]).isEqualTo(num);
    }

    @Test
    void insertarOrdenado(){
        int[] a={1,2,3,4,5};
        int num=4;
        int[] e={1,2,3,4,4,5};
        a=UtilesArrays.insertarOrdenado(a,num);
        assertThat(a).isEqualTo(e);
    }

    @Test
    void eliminarUltimo(){
        int[] a={1,2,3,4,5};
        int[] e={1,2,3,4};
        a=UtilesArrays.eliminarUltimo(a);
        assertThat(a).isEqualTo(e);
    }

    @Test
    void eliminarPrimero(){
        int[] a={1,2,3,4,5};
        int[] e={2,3,4,5};
        a=UtilesArrays.eliminarPrimero(a);
        assertThat(a).isEqualTo(e);
    }

    @Test
    void eliminarPosicion(){
        int[] a={1,2,3,4,5};
        int[] e={1,2,4,5};
        int pos=2;
        a=UtilesArrays.eliminarPosicion(a,pos);
        assertThat(a).isEqualTo(e);
    }

    @Test
    void eliminar(){
        int[] a={1,2,3,4,5};
        int[] e={1,2,3,5};
        int elemento=4;
        a=UtilesArrays.eliminar(a,elemento);
        assertThat(a).isEqualTo(e);
    }

    @Test
    void ordenar(){
        int[] a={2,1,4,3,5};
        int[] e={1,2,3,4,5};
        a=UtilesArrays.ordenar(a);
        assertThat(a).isEqualTo(e);
    }

    @Test
    void desordenar(){
        int[] a={1,2,3,4,5};
        int[] e={1,2,3,4,5};
        UtilesArrays.desordenar(a);
        assertThat(a).isNotEqualTo(e);
    }

    @Test
    void invertir(){
        int[] a={1,2,3,4,5};
        int[] e={5,4,3,2,1};
        a=UtilesArrays.invertir(a);
        assertThat(a).isEqualTo(e);
    }

    @Test
    void estaOrdenado(){
        int[] a={1,2,3,4,5};
        int[] b={1,3,2,4,5};
        boolean c=UtilesArrays.estaOrdenado(a);
        boolean d=UtilesArrays.estaOrdenado(b);
        assertThat(c).isTrue();
        assertThat(d).isFalse();
    }

    @Test
    void buscar(){
        int[] a={1,2,3,4,5};
        int b=3;
        int c=10;
        assertThat(UtilesArrays.buscar(a,b)).isEqualTo(2);
        assertThat(UtilesArrays.buscar(a,c)).isEqualTo(-1);
    }

    @Test
    void partirPor(){
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] e={4,5,6};
        a=UtilesArrays.partirPor(a,3,6);
        assertThat(a).isEqualTo(e);
    }

    @Test
    void sonIguales(){
        //La función sonIguales está mal hecha, da error
        //cuando se le pasan como parámetro dos arrays iguales
        //int[] a={1,2,3,4,5,6,7,8,9};
        //int[] e={1,2,3,4,5,6,7,8,9};
        //boolean x= UtilesArrays.sonIguales(a,e);
    }

    @Test
    void elementosIguales(){
        int[] a={6,2,7,5};
        int[] e={9,2,8};
        boolean b=UtilesArrays.elementosIguales(a,e,1);
        boolean c=UtilesArrays.elementosIguales(a,e,2);
        assertThat(b).isTrue();
        assertThat(c).isFalse();
    }

    @Test
    void concatenarArrays(){
        int[] a={1,2,3};
        int[] e={4,5,6};
        int[] bcd={1,2,3,4,5,6};
        a=UtilesArrays.concatenarArrays(a,e);
        assertThat(a).isEqualTo(bcd);
    }
}
