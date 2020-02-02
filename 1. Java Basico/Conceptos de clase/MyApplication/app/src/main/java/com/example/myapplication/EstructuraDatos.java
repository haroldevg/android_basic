package com.example.myapplication;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class EstructuraDatos {

    /*

        ArrayList es una lista dinamica que puedes ir agregando elementos.
        Cuando creas un arrayList debes indicar que tipo de variable contendra la lista

     */
    void arrList(){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(3);
        arr.add(1);
        arr.add(5);

        for(int i = 0;i< arr.size();i++){
            Log.d("ARRAYLIST",arr.get(i).toString());
        }
    }

    /*

        LinkedList es una lista dinamica que puedes ir agregando elementos.
        La diferencia entre linkedlist y arraylist es su perfomance al realizar operaciones como add, remove, get


     */

    void linkedList(){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(9);

        for(int i = 0;i< list.size();i++){
            Log.d("LINKEDILIST",list.get(i).toString());
        }
    }

    /*

        Stack es LIFO es decir "last in, first out" ultimo en entrar, primero en salir
        Queue es FIFO es decir "first in, first out" primer en entrar, primero en salir

        https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ4410L1Js2D2U3xgMyo47XGYt4sDnEwxKdm1Hg9MeoDrgnAoj8

     */

    void stack(){

        Stack<Integer> stackT = new Stack<>();

        stackT.push(1);
        stackT.push(2);
        stackT.push(3);
        stackT.push(4);
        stackT.push(5);

        for (int i = 0;i<stackT.size();i++){
            Log.d("STACK",stackT.pop().toString());
        }
    }

    void queue (){
        Queue<Integer> queueT = new LinkedList<>();
        queueT.add(1);
        queueT.add(2);
        queueT.add(3);
        queueT.add(4);
        queueT.add(5);

        Iterator<Integer> iterator = queueT.iterator();
        while(iterator.hasNext()){
            Log.d("QUEUEITERATOR",iterator.next().toString());
        }

        for(Integer object : queueT) {
            Log.d("QUEUEFOR", object.toString());
        }
    }

    /*

        HASHSET: Tiene el mismo comportamiento de una lista, sin embargo presenta estas propiedas:
        - Remueve duplicados
        - Permite nulos

        TREESET: Tiene el mismo comportamiento de una lista, sin embargo presenta estas propiedades:
        - Remueve duplicados
        - Ordena los elementos a traves de un comparador que tiene implementado internamente

     */

    void hashSet(){
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        Iterator<Integer> i = hashSet.iterator();
        while(i.hasNext()){
            Log.d("HASHSET", i.next().toString());
        }
    }

    void treeSet(){
        TreeSet<Integer> hashSet = new TreeSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        Iterator<Integer> i = hashSet.iterator();
        while(i.hasNext()){
            Log.d("HASHSET", i.next().toString());
        }
    }
}
