class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ls=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String num=String.valueOf(i);
            if(i%3==0 && i%5==0){
                ls.add("FizzBuzz");
            }else if(i%3==0){
                ls.add("Fizz");
            }else if(i%5==0){
                ls.add("Buzz");
            }else{
                ls.add(num);
            }
        }
        return ls;
    }
}