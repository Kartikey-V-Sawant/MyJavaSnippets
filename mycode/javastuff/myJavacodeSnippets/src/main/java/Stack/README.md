# Stack Implementaion.
  ###Description:- 
  _____________________________________________
    Stack is a linear data structure which performs operation using LIFO(Last in first out).
    It is used to represent list of objects e.g. stack of dishes, Stack of books,etc.
    It Contains three operation :-
    1.TOP:This points to the object which is at top of the stack.
    2.PUSH:This is used for inserting object to the top of the stack.
    3.POP:This is used for deleting object from the top of the stack.
    
  ####Implementation:-
  __________________________________________________
     
   1.Simple Stack.
   ____
     In this example we implemented a simple stack which performs push and pop operations.
     we created an class Mystack which contains the methods and some private data members for our stack operations.
     The private members that we declared holds the maxsize, an array and top of stack.
     Then we created constructor for our Mystack class which accepts the size of the stack.
     Here the top of stack will be initialized to -1.Now we created methods for stack operations.
     
     1.PUSH():-This method accepts integer that we want to push into the stack.
     Here we will increment the index of array (i.e top of stack) then store the integer in it.
     
     2.POP():-This method will decrement the index of the array then it change the top of the stack.
     
     3.TOP():-This method will return element which is at top of the stack.
     
     4.isEmpty():-This method is checking whether  the stack is empty or not.
     
     5.isFull():-This method checks the stack is full or not.
     
     6.currentSize():-This method returns the current size of stack.
     
     7.maxSize();- This method returns the max size of the stack. 
     
    Limitations:-This is just a simple stack that can represent a single stack.This code cannot be reused for creating 
    another stack.It can pass accept single data type at a time.In this simple stack we accept only integers.so it 
    becomes difficult to accept string or class.So to overcome this limitations we implemented a generic stack. 
        
   2.Generic Stack.
   ___
    Generics :- Generics allows us to accept arguments of any data type i.e it can accept integer,string,etc
    at a time.eg hashmap is a generic method it can accept integer ,string,etc..
    
   
   
   
   3.Stack Of Cars.
   
   4.Stack Of Stack
   
  

