class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> r;
        for(int i=0;i<nums.size()-1;i++){
          for(int j=i+1;j<nums.size();j++){
                if(nums.at(i)+nums.at(j)==target){
                    r.push_back(i);
                    r.push_back(j);
                }     
            }
        }
        return r;
    }
};
