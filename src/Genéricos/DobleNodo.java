package Genéricos;

    public class DobleNodo<T> {

        private T key;
        private DobleNodo<T> next;
        private DobleNodo<T> prev;
    
        public DobleNodo( T key, DobleNodo<T> top, DobleNodo<T> head){
            this.key = key;
            this.next = top;
            this.prev = head;
        } 
        public DobleNodo ( T key){
            this.key = key;
            next = null;
            prev = null;
        }
        public DobleNodo(){
            
        }
        
        
        public void setKey(T key){
            this.key = key;
        }
        
        public void setNext(DobleNodo<T> DobleNodo){
            next = DobleNodo;
        }
        public void setPrev(DobleNodo<T> DobleNodo){
            prev = DobleNodo;
        }
        
        public T getKey(){return this.key;}
        public DobleNodo<T> getNext() {return next;}
        public DobleNodo<T> getPrev() {return prev;}
        
    };    
