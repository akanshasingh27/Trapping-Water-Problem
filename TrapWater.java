package BasicArray;

public class TrapWater {
        public int trap(int[] a) {
          int n=a.length;
          int left[]=new int[n];
          int right[]=new int[n];
            int count=0;
            //position left at index
            left[0]=a[0];
            //position right at the last
            right[n-1]=a[n-1];
            
            //loop through left to find max size block
            for(int i=1;i<n;i++){
                left[i]=Math.max(left[i-1],a[i]);
                
            }
            
            //loop through right to find the max block size
            //run loop backward until i is not negative
            for (int i = n - 2; i >= 0; i--){
                right[i] = Math.max(a[i], right[i + 1]);
                
            }
            
            //now that we have found the max block size
            //find their min and subtract a[]
            
            for(int i=0;i<n;i++){
                count=count+(Math.min(left[i],right[i])-a[i]);
            }
            
                return count;
    
            
            
        }
    }
    
