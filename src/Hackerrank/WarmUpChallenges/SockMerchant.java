package Hackerrank.WarmUpChallenges;
//https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

	public static void main(String[] args) {
		
		System.out.println("PRINTING PAIRS :\n");
		
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		
        Set<Integer> set = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < ar.length; i++) {
            if (set.contains(ar[i])) {
                pairs++;
                set.remove(ar[i]);
            } else {
                set.add(ar[i]);
            }
        }
        System.out.println("pair = "+pairs);
        
        //OR//
		
		/*Map<Integer, Integer> hm1 = new HashMap<>();

		for(int temp : ar) {
			
			if(hm1.containsKey(temp)) {
				hm1.put(temp, hm1.get(temp)+1);
			} 
			else {
				hm1.put(temp, 1);
			}
		}
		
		System.out.println(hm1);
		
		Collection<Integer> val = hm1.values();
		
		Iterator<Integer> itr2 = val.iterator();
		int pairs=0;

		while(itr2.hasNext()) {
			int i = (int)(itr2.next());
			pair = pair + i/2;
		}
		
		System.out.println("pair = :"+pair);
*/
////////////////////////////////////////////
        

////////////////////////////////////////////
	}

}
