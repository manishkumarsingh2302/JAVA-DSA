//✅ Method Overloading (Compile-Time Polymorphism)
Definition:
Jab ek hi class mein ek hi naam ke multiple methods hon, lekin unka parameters (arguments) alag ho — to usse method overloading kehte hain.

Example:




class MathOOPS{
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
