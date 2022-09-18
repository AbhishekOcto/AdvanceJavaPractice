package com.demo.lambda;
//
//    class InterfaceImpl implements MyInterface{ // 1. using class
//        @Override
//        public void sayHello(){
//            System.out.println("Hello");
//        }
//
//}

public class LambdaMain {
    public static void main(String[] args) {
        System.out.println("Learning Lambda Expression");
//        InterfaceImpl inter = new InterfaceImpl();
//        inter.sayHello();

//        MyInterface i1 = new MyInterface(){ //2. creating anonymous class
//            @Override
//            public void sayHello() {
//                System.out.println("This is first anonymous class");
//            }
//        };
//        i1.sayHello();
//
//        MyInterface i2 = new MyInterface(){
//            @Override
//            public void sayHello(){
//                System.out.println("THis is second anonymous class");
//
//            }
//        };
//        i2.sayHello();

        //using interface with the help of lambda
        MyInterface i = () -> System.out.println("Lambda expression");
        i.sayHello();
        MyInterface i2 = () -> System.out.println( "USing lambda second time");
        i2.sayHello();
    }
}
