// class Solution {
// public:
//     void moveZeroes(vector<int>& nums) {
//         int left=0;
//        for(int right=0; right<nums.size(); right++){
//         if(nums[right] !=0) 
//         {
//             int temp = nums[left];
//             nums[left] = nums[right];
//             nums[right]= temp;
//             left++;


//         }
//        }
//     }
// };

#include<iostream>
#include<vector>
using namespace std;
int main(){
    int size;
    cout<<"Enter the size: ";
    cin>>size;

    vector<int> nums(size);
    cout<<"Enter the vector string: ";
    for(int i=0; i<size; i++){
        cin>>nums[i];
    }
    int left=0;
    for(int right=0; right<nums.size(); right++){
    if(nums[right] !=0) 
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right]= temp;
        left++;
    }
    }

    cout<<"ZeroMoved vector string: ";
    for(int i=0; i<size; i++){
        cout<<nums[i]<<" ";
    }

    return 0;
}