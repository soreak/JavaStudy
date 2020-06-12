package com.study._03;

public class test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB a = new Mouse("1");
        computer.install(a);
    }

}


class Computer{
    public void install(USB usb) {
        usb.connect();
        if(usb instanceof Keyboard){
            Keyboard k = (Keyboard) usb;
            k.key();
        }else if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.anniu();
        }
        usb.unconnect();
    }
}

class Keyboard implements USB {
    public String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public void key(){
        System.out.println("key down");
    }
    @Override
    public void connect() {
        System.out.println(name + "keyboard connect");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "keyboard connect");
    }
}

class Mouse implements USB {
    public String name;

    public Mouse(String name) {
        this.name = name;
    }

    public void anniu(){
        System.out.println("anniu down");
    }

    @Override
    public void connect() {
        System.out.println(name+"mouse connect");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"mouse unconnect");
    }
}

interface USB {
    void connect();

    void unconnect();
}