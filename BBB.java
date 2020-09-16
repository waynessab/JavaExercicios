/*
Queremos fazer um jogo deste tipo com personagens do BBB (Big Brother Brasil).
Para isso contamos com a sua ajuda!
Um BBB tem as seguintes características marcantes: nome e popularidade (0 a 10).
Eles sabem fazer só duas coisas: cantar sozinhos e brigar com outro BBB.
Construa uma classe em Java chamada BBB que siga as especificações:
a) Os atributos são privativos.
b) No construtor, o nome é carregado por parâmetro e a popularidade é inicializada com o valor 5.
c) Há um método de acesso para a popularidade.
d) Há um método chamado incremento, que aumenta a popularidade em 1 ponto, mas esta não pode passar do máximo (10).
e) Há um método chamado decremento que reduz em 1 ponto a popularidade do BBB. Caso esta chegue a zero, uma mensagem será emitida dizendo que o mesmo está eliminado.
f) O método cantar deve aumentar a popularidade em 1 ponto (use o método incremento do item d).
g) O método brigar com outro BBB (há interação entre objetos!) deve reduzir a popularidade de ambos em 1 ponto (use o método decremento do item e).*/
package wanessa.aula01poo;
import javax.swing.JOptionPane;
 //B) método construtor
/*
Queremos fazer um jogo deste tipo com personagens do BBB (Big Brother Brasil).
Para isso contamos com a sua ajuda!
Um BBB tem as seguintes características marcantes: nome e popularidade (0 a 10).
Eles sabem fazer só duas coisas: cantar sozinhos e brigar com outro BBB.
Construa uma classe em Java chamada BBB que siga as especificações:
a) Os atributos são privativos.
b) No construtor, o nome é carregado por parâmetro e a popularidade é inicializada com o valor 5.
c) Há um método de acesso para a popularidade.
d) Há um método chamado incremento, que aumenta a popularidade em 1 ponto, mas esta não pode passar do máximo (10).
e) Há um método chamado decremento que reduz em 1 ponto a popularidade do BBB. Caso esta chegue a zero, uma mensagem será emitida dizendo que o mesmo está eliminado.
f) O método cantar deve aumentar a popularidade em 1 ponto (use o método incremento do item d).
g) O método brigar com outro BBB (há interação entre objetos!) deve reduzir a popularidade de ambos em 1 ponto (use o método decremento do item e).*/
package wanessa.aula01poo;
import javax.swing.JOptionPane;
class BBB {
/*
Queremos fazer um jogo deste tipo com personagens do BBB (Big Brother Brasil).
Para isso contamos com a sua ajuda!
Um BBB tem as seguintes características marcantes: nome e popularidade (0 a 10).
Eles sabem fazer só duas coisas: cantar sozinhos e brigar com outro BBB.
Construa uma classe em Java chamada BBB que siga as especificações:
a) Os atributos são privativos.
b) No construtor, o nome é carregado por parâmetro e a popularidade é inicializada com o valor 5.
c) Há um método de acesso para a popularidade.
d) Há um método chamado incremento, que aumenta a popularidade em 1 ponto, mas esta não pode passar do máximo (10).
e) Há um método chamado decremento que reduz em 1 ponto a popularidade do BBB. Caso esta chegue a zero, uma mensagem será emitida dizendo que o mesmo está eliminado.
f) O método cantar deve aumentar a popularidade em 1 ponto (use o método incremento do item d).
g) O método brigar com outro BBB (há interação entre objetos!) deve reduzir a popularidade de ambos em 1 ponto (use o método decremento do item e).*/
/*
Queremos fazer um jogo deste tipo com personagens do BBB (Big Brother Brasil).
Para isso contamos com a sua ajuda!
Um BBB tem as seguintes características marcantes: nome e popularidade (0 a 10).
Eles sabem fazer só duas coisas: cantar sozinhos e brigar com outro BBB.
Construa uma classe em Java chamada BBB que siga as especificações:
a) Os atributos são privativos.
b) No construtor, o nome é carregado por parâmetro e a popularidade é inicializada com o valor 5.
c) Há um método de acesso para a popularidade.
d) Há um método chamado incremento, que aumenta a popularidade em 1 ponto, mas esta não pode passar do máximo (10).
e) Há um método chamado decremento que reduz em 1 ponto a popularidade do BBB. Caso esta chegue a zero, uma mensagem será emitida dizendo que o mesmo está eliminado.
f) O método cantar deve aumentar a popularidade em 1 ponto (use o método incremento do item d).
g) O método brigar com outro BBB (há interação entre objetos!) deve reduzir a popularidade de ambos em 1 ponto (use o método decremento do item e).*/
package wanessa.aula01poo;
import javax.swing.JOptionPane;
class BBB {
    //a) Atributos privativos
    private int popularidade;
    private String nome;
    //b) método construtor = sempre publico ; sem retorno; mesmo nome da classe; no caso BBB
    public BBB(String nome){
        this.nome = nome;//this = este objeto = referencia ao objeto; a variavel dentro do objeto é o atributo ; nome por parametro;Usar this quando o atributo e o parametro tiverem o mesmo nome;
        popularidade = 5;//popularidade inicia com 5
    }
    //Item C) método de acesso popularidade
    public int acessePopularidade(){
        return popularidade; //ele diz qual o valor de popularidade
    }
    //d) Há um método chamado incremento, que aumenta a popularidade em 1 ponto, mas esta não pode passar do máximo (10).
   // método modificador
    public void incremento (){
         popularidade++;//incrementa
         if(popularidade > 10){
             popularidade = 10;
         }
     }
    //e) Há um método chamado decremento que reduz em 1 ponto a popularidade do BBB. Caso esta chegue a zero, 
    //uma mensagem será emitida dizendo que o mesmo está eliminado.
    public void decremento (){
         popularidade = popularidade - 1;
          if(popularidade <= 0){
          JOptionPane.showMessageDialog(null,nome + " VOCE FOI ELIMINADO(A) :-;");
           }
     }
     //f) O método cantar deve aumentar a popularidade em 1 ponto (use o método incremento do item d).
    public void cantar (){
        incremento();//chama incremento
    }
         //g) O método brigar com outro BBB (há interação entre objetos!) 
    //deve reduzir a popularidade de ambos em 1 ponto 
    //(use o método decremento do item e).
    public void brigar(BBB outro){//vai brigar com outro BBB por isso é do tipo BBB
        this.decremento();//este objeto
        outro.decremento();//outro objeto
    }
    public void estado(){
        JOptionPane.showMessageDialog(null, nome + ", você tem "+ popularidade + " pontos de popularidade");
    }   
}
public class Exercicio5 {
    public static void main(String[] args) {
        
    }
    
}


    