package Genéricos;


    public class DobleLista<T> {

        DobleNodo head = null;
        DobleNodo tail = null;
        
    public void PushFront (T key){
        
        DobleNodo<T> list1 = new DobleNodo<T>(key);
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
    public void PushBack (T key){
        DobleNodo<T> nodo2 = new DobleNodo<T>(key);
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
    public void PopBack(){
        
        if(this.head == null){
            System.out.println("Error! Empty List");
        }
        if( this.head == this.tail){
            this.tail = null;
            this.head = tail;
        }else{
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
            
        }    
    }
    public void DisplayList(){
        if(this.head == null){
            System.out.print("Lista Vacia");
        }
        DobleNodo p = this.head;
        while ( p!= null){
            System.out.print(p.getKey());
            p = p.getNext();
        }
    }
    public void PopFront(T key){
        if(this.head == null){
            System.out.println("Error! Empty List");
        }if( this.head == this.tail){
            this.head = null;
            this.tail = head;
        }else{
            this.head = this.head.getNext();
            this.head.setPrev(null);
            
        } 
        
    }
    public boolean TopFront(){
        return this.head == null && this.tail == null;
    }
    public void AddBefore(DobleNodo nodo, T key){
         DobleNodo nodo2 = new DobleNodo(key);
         nodo2.setNext(nodo);
         nodo2.setPrev(nodo.getPrev());
         nodo.setPrev(nodo2);
         if(nodo2.getPrev() !=null){
             nodo2.setNext(nodo2);
             nodo2.setPrev(nodo2);
         }if(this.head == nodo){
             this.head = nodo2;
             nodo.setPrev(nodo2);
             nodo2.setNext(nodo);
             nodo2.setPrev(head);
         }
    }
    public void AddAfter(DobleNodo nodo, T key){
        DobleNodo nodo2 = new DobleNodo(key);
         nodo2.setNext(nodo.getNext());
         nodo2.setPrev(nodo);
         nodo.setNext(nodo2);
         if(nodo2.getNext() !=null){
             nodo2.setNext(nodo2);
             nodo2.setPrev(nodo2);
         }if(this.tail == nodo){
             this.tail = nodo2;
         }
    }
    
};    