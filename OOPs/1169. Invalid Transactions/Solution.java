import java.util.*;
class details{
    int time,amount,index;
    String city;
    details(int time,int amount,String city,int index){
        this.time=time;
        this.amount=amount;
        this.city=city;
        this.index=index;
    }
}
class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        int n=transactions.length;
        List<String> ans = new ArrayList<>();
        HashMap<String,List<details>>s1=new HashMap<>();
        boolean index[]=new boolean[n];
        for(int i=0;i<transactions.length;i++){
            String arr[]=transactions[i].split(",");
            String name=arr[0];
            int time=Integer.parseInt(arr[1]);
            int amount=Integer.parseInt(arr[2]);
            String city=arr[3];
            if(amount>1000)
                index[i]=true;
           
                if(s1.containsKey(name)){
                    List<details> d=s1.get(name);
                    for(details det:d){
                        if(Math.abs(det.time-time)<=60 && !det.city.equals(city)){
                            index[det.index]=true;
                            index[i]=true;
                        }
                    }
                    
                }
            
            s1.putIfAbsent(name,new ArrayList<>());
            s1.get(name).add(new details(time,amount,city,i));
        }
        for(int i=0;i<n;i++){
            if(index[i])ans.add(transactions[i]);
        }
        return ans;
    }
}