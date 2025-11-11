public int majorityElement(int[] nums) {
       int higher = 0;
        int major = nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer o : nums){
            map.put(o,map.getOrDefault(o,0)+1);

            if(map.get(o) > higher){
                higher = map.get(o);
                major = o;
            }
        }
        return major;
    }
