package wanessa.aula01poo;
public class testeBBB {
    public static void main(String[] args) { 
       BBB Prior = new BBB("Felipe Prior");
       BBB Pyonglee = new BBB("Pyong Lee");
       
       Prior.estado();
       Pyonglee.estado();
       
       for(int i = 0; i<8;i++){
       Prior.cantar();}
       Prior.estado();
       
       for(int i = 0; i<5;i++){
       Prior.brigar(Pyonglee);
       Prior.estado();
       Pyonglee.estado();
       }
    }
}
