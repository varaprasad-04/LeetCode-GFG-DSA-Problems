import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'countSubarraysWithSumAndMaxAtMost' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY nums
     *  2. LONG_INTEGER k
     *  3. LONG_INTEGER M
     */

    public static long countSubarraysWithSumAndMaxAtMost(List<Integer> nums, long k, long M) {
        long c=0;
        if (nums.isEmpty()) return 0;
        HashMap<Long,Integer>s1=new HashMap<>();
        long sum=0;
        s1.put(0l,1);
        for(int i=0;i<nums.size();i++){
            int e=nums.get(i);
            if(e>M){
                s1.clear();
                 s1.put(0l,1);
                sum=0;
                continue;
            }
            else{
                sum+=e;
                long dif=sum-k;
                if(s1.containsKey(dif)){
                    c+=s1.get(dif);
                }
                s1.put(sum, s1.getOrDefault(sum, 0) + 1);
            }
        }
        
        return c;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> nums = IntStream.range(0, numsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long k = Long.parseLong(bufferedReader.readLine().trim());

        long M = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.countSubarraysWithSumAndMaxAtMost(nums, k, M);

        System.out.println(result);

        bufferedReader.close();
    }
}
