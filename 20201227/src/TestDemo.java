import java.util.Arrays;

/**
 * User:DELL
 * Date:2020-12-27
 * Time:14:10
 */
//public class TestDemo {
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public TestDemo(){
//
//    }
//
//    public TestDemo(String name,int age){
//        this.name="zhangsan";
//        this.age=12;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
public  class TestDemo{
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        for (int i = 0; i <arr1.length ; i++) {
            int tmp;
            tmp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=tmp;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));


    }
    public static void main1(String[] args) {
        int [] arr={22,1,4,2,5,7,9,6,8,11};
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if (arr[left]%2==0){
                left++;
            } else {
                if(arr[right]%2!=0) {
                    right--;
                } else {
                    int tmp=arr[left];
                    arr[left] =arr[right];
                    arr[right] =tmp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
