/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadaiBJ;
   //ArrayListをインストール
  import java.util.ArrayList;
/**
 *
 * @author guest1Day
 */

//抽象クラスの宣言
abstract class Human {

  //フィールドの宣言
  public ArrayList<Integer> myCards;  
  //メソッドの宣言
  
  //openメソッドの作成
  abstract public int open();
       //手札の足し算をする

  //setCardメソッドの作成
  abstract public void setCard(ArrayList<Integer> passedcards);
      //引いたカードを手札にセットする
  //
  abstract public boolean checkSum();
      //戻り値はboolean型。カードを引くかどうか判断する


}
