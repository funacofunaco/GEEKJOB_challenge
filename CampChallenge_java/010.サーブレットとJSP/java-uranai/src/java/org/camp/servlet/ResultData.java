/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//  campサーブレットのクラスです
package org.camp.servlet;
//JavaBeansルール①java.io.Serializableインターフェイスの実装
import java.io.Serializable;
//占い用　util.dateインターフェイスを実装
import java.util.Date;


/**
 *
 * @author Kubo
 */
//「Serializable」をクラス「ResultData」に反映させます↓
public class ResultData implements Serializable {
     //JavaBeansルール②フィールドはカプセル化（private）しよう
     private Date d;
     private String luck;
     //JAvaBeansルール③publicで引数なしのコンストラクタを作成
     //コンストラクタは「New」の処理がされた際に動くもの。
     //初期値設定に使うと思えば良さそう（要確認！）
     //JavaBeansの場合はコンストラクタを「空欄」にするというルールがある
     public ResultData(){
         //初期設定が欲しいときはこの中にセットするよ
     }
     //JavaBeansルール④Getterとsetterメソッドを入れる
     //メソッドとは？などは、次の課題で理解できるはず。今回は「JSPとサーブレットの連携を確かめる目的で部品を作っている」
     
     //変数「d（日付の変数）」についてのGetterとSetter
     public Date getD(){
         return d;
     }
     public void setD(Date d){
         this.d = d;
     }
     
     //変数「luck（文字の変数）」についてのGetterとSetter
     public String getLuck(){
         return luck;
     }
     public void setLuck(String luck){
         this.luck = luck;
     }
}
