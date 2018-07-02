/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai;

/**
 *
 * @author guest1Day
 */
//クラスの宣言
public class Class1 {
//フィールドの宣言
public String name= null;
public int age = 0;
public String address = null;
    //メソッドの宣言
    public void setProfile(String n,int a,String add){
        this.name = n;
        this.age = a;
        this.address = add;
    }
    public void printprofile(){
        System.out.print("名前:"+name+",");
        System.out.print("年齢:"+age+"歳"+",");
        System.out.print("住所:"+address);
    }
}
