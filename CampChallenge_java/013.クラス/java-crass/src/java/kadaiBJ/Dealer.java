package kadaiBJ;
   //ArrayListをインストール
  import java.util.ArrayList;
   //Randomをインストール
  import java.util.Random;

//クラスの宣言
class Dealer extends Human {
  //フィールドの宣言
  protected ArrayList<Integer> myCards;
  //トランプをすべて格納する変数Cards
  protected ArrayList<Integer> Cards;

//Dealer初期処理を実装する
public Dealer() {
    //myCardsを作る
    myCards =new ArrayList<Integer>();
    
    //Cards（山札）に13までのカードを4つセットする（計52枚になる）
    ArrayList<Integer> thiscards = new ArrayList<Integer>();
    for(int j =1;j<=4;j++){
        for(int i =1;i<=13;i++){
                thiscards.add(i);
        }
    }
    Cards =thiscards;  
}
//Dealer独自処理を実装。
//カードを2枚引いて渡す処理Deal
public ArrayList<Integer>Deal(){
    //1枚目を引いて、Dr1に数字を入れる。
    Random rand1 = new Random();
    Integer index1 =rand1.nextInt(Cards.size());
    int Dr1 =Cards.get(index1);
    //2枚目を引いて、Dr2に数字を入れる。    
    Random rand2 =new Random();
    Integer index2 =rand2.nextInt(Cards.size());
    int Dr2 =Cards.get(index2);
    //1~2枚目をArrayListDealに入れる。
    ArrayList<Integer>Deal = new ArrayList<Integer>();
    Deal.add(Dr1);
    Deal.add(Dr2);
    return Deal;
}
//カードを1枚引いて渡す処理Hit
public ArrayList<Integer> Hit(){
    ArrayList<Integer> Hit = new ArrayList<Integer>();
    Random rand = new Random();
    Integer index = rand.nextInt(Cards.size());
    int Hr = Cards.get(index);
    Hit.add(Hr);
    return Hit;
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
