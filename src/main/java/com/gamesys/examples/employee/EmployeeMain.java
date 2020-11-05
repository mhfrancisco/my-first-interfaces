package com.gamesys.examples.employee;

public class EmployeeMain {

    public class A {

        void method1() {
            System.out.println("I am a method of A!!!!");
        }

    }

    private interface B {

        void method2();

    }

    public interface C {

    }

    public class D extends A implements B, C {

        @Override
        void method1() {
            super.method1();
        }

        @Override
        public void method2() {
            super.method1();
        }
    }

}
