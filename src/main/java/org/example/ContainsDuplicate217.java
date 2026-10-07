package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicate217 {

    public static void main(String[] args){
        Solution solution =  new Solution();

        System.out.println(solution.containsDuplicate(new int []{1, 1, 3, 4}));
    }

}

class Solution {
    public boolean containsDuplicate(int[] nums) {

        if (nums.length<2){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}

