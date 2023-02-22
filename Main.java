import java.util.Arrays;
class Main {
  public static void main(String[] args) {

    //tests
    
   System.out.println(sortString("helloworld")); //dehllloorw
   System.out.println(sortString("javascript"));  //aacijprstv
   System.out.println(sortString("algorithm"));  //aghilmort
   System.out.println(sortString("barack"));  //aabckr
   System.out.println(sortString("parviz")); //aiprvz
   System.out.println(sortString("stamlo")); // almost
  }


  public static char[] sortString(String str){
       //implement here
     char []arr = str.toCharArray();
        Arrays.sort(arr);
        return arr;

    }
}