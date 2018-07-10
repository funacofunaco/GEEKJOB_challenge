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
public class Main2 {
    public static void main(String[]args){
    Class2 roomMate = new Class2();
    roomMate.setProfile("酒井",26,"名古屋市");
    roomMate.printprofile();
    System.out.print(",　クリアします　,");
    roomMate.clearProfile();
    roomMate.printprofile();
    } 
}
