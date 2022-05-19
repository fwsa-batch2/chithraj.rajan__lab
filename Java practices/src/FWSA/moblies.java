abstract class moblies {
        abstract void display();
        abstract void voicecall();
        abstract void camera();
    }
    
    class Samsung extends Mobile {
        void display(){
            System.out.println("Samsung Display is 6 inches");
        }
        void voicecall(){
            System.out.println("Samsung Enabled");
        }
        void camera(){
            System.out.println("Samsung Camera 64 MP");
        }
        void fiveG(){
            System.out.println("Samsung 5G");
        }
    }
    
    class Nokia extends Mobile{
        void display(){
            System.out.println("Nokia Display is 5 inches");
        }
        void voicecall(){
            System.out.println("Nokia Enabled");
        }
        void camera(){
            System.out.println("Nokia Camera 32 MP");
        }
    }
    
    class Mobiles{
        public static void main(String[] args) {
            Samsung samsung = new Samsung();
            samsung.camera();
            samsung.fiveG();
            Nokia nokia = new Nokia();
            nokia.camera();
        }
    }

