public class Mavenproject4 {
    
    static class Animal{
        public void hacersonido(){
            System.out.println("inserte un sonido");
        }
    }
        static class Perro extends Animal{
            @Override
                    public void hacersonido(){
                        System.out.println("guau");
                    }
        }
        
       static class Gato extends Animal{
            @Override
            public void hacersonido(){
                System.out.println("miau");
            }
        }
        
        static class Gallo extends Animal{
            @Override
            public void hacersonido(){
                System.out.println("kikiriki");
            }
        }
    
    public static void main(String[] args) {
        
            Animal[] Granja = new Animal[3];
        
            Granja[0] = new Perro();
            Granja[1] = new Gato();
            Granja[2] = new Gallo();
        
            for (int i = 0; i < Granja.length; i++){
                Granja[i].hacersonido();
        }
        
    }
}
