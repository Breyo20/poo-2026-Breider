package com.mycompany.clasesjava;

class Animal {
    void sonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Pato extends Animal{
    void sonido(){
        System.out.println("El pato graznea");
    }
}

class Lobo extends Animal{
    void sonido(){
        System.out.println("El lobo aulla");
    }
}

class Vaca extends Animal{
    void sonido(){
        System.out.println("La vaca hace mu   ");
    }
}
