/**바깥 클래스**/
class A {
    A() { System.out.println("A: 객체가 생성됨"); }

    /**인스턴스 멤버 클래스**/
    //private class B {
    class B {
        B() { System.out.println("B: 객체가 생성됨"); }
        int field1;
        //static int field2;
        void method1() {};
        //void method2() {}
    }

    /**정적 멤버 클래스**/
    //private class C {
    static class C {
        C() { System.out.println("C: 객체가 생성됨"); }
        int field1;
        static int field2;
        void method1() {}
        void method2() {}
    }

    /**로컬컬 클래스**/
    void method() {
        class D { 
        D() { System.out.println("D: 객체가 생성됨"); }
        int field1;
        //static int field2;
        void method1() {}
        //void method2() {}
    }
    // D.d = new D();
    // d.field1 = 3;
    // d.method1();
    }
}
