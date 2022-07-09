package com.gaetan1903.paintapplication;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class A {

    public B b;
    private final C c;
    public ArrayList<D> d;
    private ArrayList<E> e;

    public A(B b, ArrayList<D> d) {
        this.b = b;
        this.d.addAll(d);

        this.c = new C(this);
        this.e = new ArrayList();
    }

    public A(ArrayList <D> d){
        this(null, d);
    }

    public C getC(){
        return this.c ;
    }

    public void addE(){
        this.e.add(new E(this));
    }

    public E getE(int index){
        return this.e.get(index);
    }

    public A clone(){
        return new A( this.b, new ArrayList<D>(this.d) );
    }


}
