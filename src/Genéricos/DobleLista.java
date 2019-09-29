package Genéricos;


    public class DobleLista<T> {

        DobleNodo head = null;
        DobleNodo tail = null;
        
    public void PushFront (int key){
        
        DobleNodo<Integer> list1 = new DobleNodo<Integer>(key);
        if(this.head == null){
            this.tail = list1;
            this.head = tail;
        }else{
            head = list1.getNext();
            tail = null;
            this.head = list1;
            head = this.head.getNext().getPrev();
        }
        if ( this.tail == null){
            this.tail = this.head;        
        }
        
    }
    public void PushBack (int key){
        DobleNodo<Integer> nodo2 = new DobleNodo<Integer>(key);
        nodo2.setNext(null);
        tail = nodo2.getPrev();
        if(this.head == null){
            this.tail =  nodo2;
            this.head = tail;
        }else {
            nodo2 = this.tail.getNext();
            nodo2.setPrev(this.tail);
            this.tail = nodo2;
        }
    }
    public DobleNodo FindByKey(T key){
        DobleNodo dn = null;
        DobleNodo p = this.head;
        while (p != null){
            if(p.getKey() == key){
                dn= p;
                break;
            }
        }
        return dn;
    }
    public void PopBak(){
        
        if(this.head == null){
            System.out.println("Error! Empty List");
        }
        if( this.head == this.tail){
            this.tail = null;
            this.head = tail;
        }else{
            
            this.tail.setNext(null);
        }    
    }
    
};    