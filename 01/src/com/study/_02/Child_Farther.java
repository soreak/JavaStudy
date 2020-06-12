package com.study._02;

public class Child_Farther {
    public static void main(String[] args) {
        A c = new C();
        //子类可以继承父类的私有成员
        c.setA(1);
        System.out.println(c.getA());
        c.print();
        //c.setC(); //父类无法调用子类里 除开继承的 的其他方法
        c.setA(10);
    }

    public static class A extends Object{
        private int a;

        public int getA(){
            return a;
        }
        public void setA(int a){
            this.a=a;
        }
        public void print(){
            System.out.println("这里是A");
        }

    }
    public static class B extends A{
        private int b;

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
        @Override
        public void print(){
            System.out.println("这里是B");
        }


    }
    public static class C extends B {
        private int c;
        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }
        @Override
        public void print(){
            System.out.println("这里是C");
        }

    }
}
