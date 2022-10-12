class Caaa  // 定義類別Caaa
03 {
04     private int value;
05   
06     public Caaa()
07    {
08           this(10);// 試填寫此處的程式碼，使得呼叫此建構元時，value的值會被設定為10
09           System.out.println("value="+value) ;
10  }
11  public Caaa(int i)
12  {
13     value=i;
14     System.out.println ("value="+value);
15  }
16}
17 public class hw9_3
18 {
19    public static void main(String args[])
20    {
21       Caaa obj1=new Caaa();
22       Caaa obj2=new Caaa(12);
23     }
24 }
