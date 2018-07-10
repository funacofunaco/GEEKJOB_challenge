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
class User extends Human {

    public User(){
    //myCardsを作る
    myCards =new ArrayList<Integer>();    
    }
    
 //setCardメソッドの実装
@Override
public void setCard(ArrayList<Integer> passedcards){
    //ここで引いたカードを手札に入れる
    //myCardsにaddする。DealやHitから受け取る→DealやHitはArrayListで戻るから、引数はArrayList
    for(int i =0;i<passedcards.size();i++){    
        this.myCards.add(passedcards.get(i));
    }
    //HitとDealをどう判断させるの？→ブラックジャック.javaの実行順で考えればいい。
    }


//openメソッドの実装
public int open(){
   //ここで手札の合計をする
   int open = 0;
   for(int i=0;i<myCards.size();i++){
       if(myCards.get(i) >= 10){
       open =open + 10;
       }else{
       open = open + myCards.get(i);
       }
   }
   return open;
}

 public boolean checkSum(){
    //voolean型になるように。
    //合計値openを考える
    if(open()>17){
        boolean checkSum = true;
        return checkSum;    
        }else{
            boolean checkSum = false; 
            return checkSum;
        }
    }       
}



