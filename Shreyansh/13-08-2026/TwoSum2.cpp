// OPTIMAL SOLUTION FOR THIS QUESTION 
// TIME COMPLEXITY IS O(N)
// class Solution {
// public:
//     vector<int> twoSum(vector<int>& numbers, int target) {
//         int left=0;
//         int right=numbers.size()-1;

//         while(left<right){
//             int sum = numbers[left]+numbers[right];

//             if(sum==target){
//                 return{left+1, right+1};
//             }
//             else if(sum<target){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }

//         return {};
//     }
// };


// BRUTE FORCE METHOD FOR THIS QUEESTION
//COMPLEXITY IS O(N^2)

// class Solution {
// public:
//     vector<int> twoSum(vector<int>& numbers, int target) {
//
//         for(int left=0; left<numbers.size();left++)
//         {
//             for(int right=left+1; i<=numbers.size(); right++)
//             {   
//                 if(numbers[left]+numbers[right]==target)
//                 {
//                     return {left+1, right+1};
//                 }
//             }
//         }
//     }
// };