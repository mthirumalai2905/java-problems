## Finding the max sum of the subarray 
<br>
`Kadane`

**Approach**
``java
int[] arr = {5,4,-1,7,8}
//find the max sum of the subarray
``

__BruteForce__
`O(n^3)` & `O(n^2)`
``java
for(int i = 0; i < arr.length; i++){
    for(int j = i; j < ar.length; j++){
      //  ........
    }
}
``

__Optimized__
