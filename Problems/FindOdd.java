class Main {
  public static void main(String[] args) {

    int[] numbers = {8,3,1,6,2,4,5,9};
    int count = 0;

    for(int i=0;i<numbers.length;i++){
      if(numbers[i]%2!=0)
        count++;
    }
   System.out.println("The number of odd numbers in the list are: "+count);      
        
  }
}
