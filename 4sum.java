class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
        if(nums == null || nums.length ==0)
        {
            return arr;
        }
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0;i<n;++i)
        {
            
            for(int j = i+1;j<n;++j)
            {
                int res = target - nums[i]-nums[j];
                if(j+1<n)
                {
                    int lef = j+1;
                    int rig = n-1;
                    
                    while(lef<rig)
                    {
                        if(nums[lef]+nums[rig]<res)
                            ++lef;
                        else if(nums[lef]+nums[rig]>res)
                            --rig;
                        else
                        {
                            List<Integer> indices = new ArrayList<Integer>();
                            indices.add(nums[i]);
                            indices.add(nums[j]);
                            indices.add(nums[lef]);
                            indices.add(nums[rig]);
                            arr.add(indices);
                            while(nums[lef] == indices.get(2) && lef<rig)
                                lef++;
                            while(nums[rig] == indices.get(3) && lef<rig)
                                rig--;
                        }
                        
                    }
                }
                while(j+1<n && nums[j]==nums[j+1])
                    j++;
            }
            while(i+1<n && nums[i]==nums[i+1])
                    i++;
        }
        return arr;
        
    }
}