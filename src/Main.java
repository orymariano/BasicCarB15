public class Main {

    public static void main(String[] args) {

        BasicStructure audi = new BasicStructure();
        audi.color="black";
        audi.model="A3";
        audi.power="5000cc";

<<<<<<< HEAD
        Engine x= new Engine();
        x.cylinders="8";
        x.size="1234cc";
        x.weight="6453kg";

        color col=new color();
        col.colorLights="True";
        col.colorTire="false";
        col.colorWindows="True";
=======
        engine x = new engine();
        x.cylinders="8";
        x.size="1234cc";
        x.weight="6453k";

        lights neon=new lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";
        
>>>>>>> lights

    }
}
