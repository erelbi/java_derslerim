class Asker {
    public void selamVer() {
        System.out.println("Asker Selam verdi");
    }
    
}

class Er extends Asker{
    @Override
    public void selamVer(){
        System.out.println("Asker Selam verdi");
    }
}

class Yuzbasi extends Asker {
    public void selamver(){
        System.out.println("Yuzbası Selam veri");
        
    }
}

public class PolimorfizmOrnekBir{
    public static void hazirOl(Asker a){
        a.selamVer();
    }
}

