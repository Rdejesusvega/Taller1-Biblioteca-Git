public class Mavenproject4 {
    
        interface Animal{
            void hacerSonido();
     }
    
        static class Perro implements Animal{
            @Override
                    public void hacerSonido(){
                        System.out.println("guau");
                    }
        }
        
       static class Gato implements Animal{
            @Override
            public void hacerSonido(){
                System.out.println("miau");
            }
        }
        
        static class Gallo implements Animal{
            @Override
            public void hacerSonido(){
                System.out.println("kikiriki");
            }
        }
    
    public static void main(String[] args) {
        
            Animal[] Granja = new Animal[3];
        
            Granja[0] = new Perro();
            Granja[1] = new Gato();
            Granja[2] = new Gallo();
        
            for (int i = 0; i < Granja.length; i++){
                Granja[i].hacerSonido();
        }
        
    }
}
