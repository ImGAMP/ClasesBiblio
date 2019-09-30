/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genéricos;
import Genéricos.DobleNodo;
import Genéricos.Nodo;
/**
 *
 * @author usuario
 */
public class Queue<T> {
    private DobleNodo head;
    private DobleNodo tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void enQueue(DobleNodo nodo){
        if(this.head== null && this.tail==null){
            this.head= nodo;
        }
        nodo.setNext(null);
        nodo.setPrev(this.tail);
        this.tail = nodo;
        this.size++;
        
    }
    public void deQueue(DobleNodo nodo){
        if(this.head== null && this.tail==null){
            System.out.print("No se puede ejecutar");
        }else{
            this.head = this.head.getNext();
            this.head.setPrev(null);
            this.size--;
        }
    }
    public boolean IsEmpty(DobleNodo nodo){
        return this.head == null && this.tail==null;
        
    } 
    public boolean IsEmpty(Queue nodo){
        return this.head == null && this.tail==null;
        
    }
    
    
    
    
    
}
