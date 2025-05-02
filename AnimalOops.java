//✅ Method Overriding (Run-Time Polymorphism)
Definition:
Jab parent class ka method child class mein same name aur same parameters ke saath dobara likha jata hai, to usse method overriding kehte hain.

Example:





class AnimalOops {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends AnimalOops {
    void sound() {
        System.out.println("Dog barks");
    }
}
