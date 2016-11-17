/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Schumaiquer
 */
public class MarsRovers {

    
    public static void main(String[] args) {
        
        char direcao;
        char[] comandos;
        
        Scanner sc = new Scanner(System.in);
           
        System.out.println("Para encerrar: no momento de entrar com um novo rover basta digitar 0 0 N");
        System.out.println("Entre com o tamanho de Plateau: ");
        
        int x = sc.nextInt();
        int y = sc.nextInt(); 
        
        Coordenada aux = new Coordenada(x, y);
 
        ArrayList<Controle> lista = new ArrayList<Controle>();
        
          while(true){
            System.out.println("Entre com a localização e direção de um novo Rover: ");
            x = sc.nextInt(); 
            y = sc.nextInt();
            if(x==0 && y==0)
                break;
            
            aux.setX(x);
            aux.setY(y);
            
            direcao = sc.next(".").charAt(0);
            Controle controle = new Controle(aux, direcao);
            
            System.out.println("Entre com os movimentos do Rover: ");
            sc.nextLine();
            comandos = sc.nextLine().toCharArray();
            
            for(char z:comandos){
                controle.comandar(z);
            }
            lista.add(controle);
}
                  for(Controle w: lista){
            System.out.println(w.getPosicao().getX() + " " + w.getPosicao().getY() + " " + w.getDirecao());
}
    }
    
  
    
}
