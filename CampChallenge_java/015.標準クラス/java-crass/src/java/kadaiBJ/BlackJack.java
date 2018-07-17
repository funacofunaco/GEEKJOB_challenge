/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadaiBJ;
import java.util.ArrayList;
/**
 *
 * @author guest1Day
 */
public class BlackJack {

    public static void main(String[] args){
        System.out.println("ブラックジャックを開始します");
    
        User user1 = new User();
        Dealer dealer1 = new Dealer();
        
        ArrayList<Integer> u1cards = new ArrayList<Integer>();
        
        System.out.println("ユーザーにカードを二枚配ります");
        user1.setCard(dealer1.Deal());
        System.out.println(user1.myCards);
        
        System.out.println("ユーザーのカードを合計します");
        System.out.println(user1.open());
    
        System.out.println("ユーザーの合計値が17を超えていますか？");
        System.out.println(user1.checkSum());
    
        while(user1.checkSum()==false){
        System.out.println("Hitします。");
        user1.setCard(dealer1.Hit());
        System.out.println(user1.myCards);
        System.out.println(user1.open());
        user1.checkSum();
        }
        System.out.println("Hitを終了します"); 
        
        if(user1.open()>21){
            System.out.println("ユーザーの負けです！");
            System.exit(0);
        }else if(user1.open()==21){
            System.out.println("ユーザーの勝ちです！");
            System.exit(0);
        }
        //Dealer1のターン    

        ArrayList<Integer> d1cards =new ArrayList<Integer>();    
        
        System.out.println("ディーラーにカードを二枚配ります");
        dealer1.setCard(dealer1.Deal());
        System.out.println(dealer1.myCards);

        System.out.println("ディーラーのカードを合計します");
        System.out.println(dealer1.open());

        System.out.println("ディーラーの合計値が17を超えていますか？");
        System.out.println(dealer1.checkSum());
        
        
        while(dealer1.open()<17){
        System.out.println("合計が17より下なのでHitします。");
        dealer1.setCard(dealer1.Hit());
        System.out.println(dealer1.myCards);
        System.out.println(dealer1.open());
        dealer1.checkSum();
        }
        if(user1.open()>dealer1.open()){
                   System.out.println("userに負けてるのでHitします");
        dealer1.setCard(dealer1.Hit());
        System.out.println(dealer1.myCards);
        System.out.println(dealer1.open()); 
        }
        
        System.out.println("Hitを終了します");

        if(dealer1.open()>21){
            System.out.println("ディーラーの負けです！");
            System.exit(0);
        }else if(dealer1.open()==21){
            System.out.println("ディーラーの勝ちです！");
            System.exit(0);
        }
        
        System.out.println("ユーザーの手札は"+user1.myCards);
        System.out.println("ユーザーの合計は"+user1.open());
        System.out.println();

        System.out.println("ディーラーの手札は"+dealer1.myCards);
        System.out.println("ディーラーの合計は"+dealer1.open());
        System.out.println();        
        
        if(user1.open()>dealer1.open()){
            System.out.println("ユーザーの勝ち");
        }else if(user1.open()==dealer1.open()){
            System.out.println("引き分けです！");
        }else{
            System.out.println("ディーラーの勝ち！");
        }
        
    }

    

}
    
    

  
