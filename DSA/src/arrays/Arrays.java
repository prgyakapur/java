package arrays;
import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  int arr[] = {2,3,1,-4,3,-2,8};
		  int n = arr.length;
		  for (int i: arr) {
			  System.out.print(i);
		  }
		  System.out.println(" ");
		  System.out.println("output");
		 // System.out.println("Enter the size of array ");
	        //int n = sc.nextInt();
	        //int arr[] = new int[n];
	        
//	        for(int i =0; i<n;i++){
//	        	System.out.print("Enter the element "+ i+ " ");
//	            arr[i] = sc.nextInt();
//	        }

	        int num = sc.nextInt();
//	        
	        ///////////////////////////////////////////////////////////////
//	        //search element in an array
//	        for(int i =0; i<n;i++){
//	            if(arr[i]==num){
//	                System.out.println("the element is at " + i);
//	            }
	        
	        
	        
	        
	        //////////////////////////////////////////////////////////////
	        //delete element in an array
//	        int flag =0;
//	        for(int i=0;i<n;i++)
//	        {
//	        	if(arr[i]==num) {
//	        		
//	        		flag = 1;
//	        		for(int j=i;j<n-1;j++) {
//	        			arr[j] = arr[j+1];
//	        		}
//	        		 
//	        	}
//	        }
//	        if(flag ==1) {
//	        for(int i=0;i<n-1;i++) {
//	        	System.out.print(arr[i]);
//	        }
//	        }
//	        else {
//	        	System.out.println("element not found");
//	        }
//	        
	        
	        //////////////////////////////////////////////////////////////
	        //second largest element in an array
//	        int max = arr[0];
//	        for(int i =0;i<n;i++) {
//	        	if(max<arr[i]) {
//	        		max = arr[i]; //this is the largest element
//	        	}
//	        }
//	        int max2 = arr[0];
//	        for(int i =0;i<n;i++) {
//	        	if(arr[i]<max && arr[i]>max2) // should be less than max
//	        	{ 
//	        		max2 = arr[i];
//	        	} 
//	        }
//	        System.out.println(max2);
	        
			//////////////////////////////////////////////////////////
			//third largest element 
//	        int max3 = arr[0];
//	        for(int i =0;i<n;i++) {
//	        	if(arr[i]<max2 && arr[i]>max3) // should be less than max
//	        	{ 
//	        		max3 = arr[i];
//	        	} 
//	        }
//	        System.out.println(max3);
	        
	        

	        
	        
	        
	       /////////////////////////////////////////////////////////////
	       //remove duplicates from sorted array
	    //      ij
	     // 1 2 2 3 3 4 4 4 4
	     // 1 2 3 4   
//	      int j=0;                
//	      for(int i=0;i<n;i++) 
//	      {
//	    	  if(arr[i]!=arr[j]) {
//	    		  arr[j+1]= arr[i];
//	    		  j++;
//	    	  }
//	      }
//	   
//	      for (int i=0; i<j+1; i++)  
//	          System.out.println(arr[i] + " ");
	        
	        
	     ///////////////////////////////////////////////////////////////
	     //smallest element in array
//	        
//	     int min = Integer.MAX_VALUE;
//	     for(int i=0;i<n;i++) {
//	    	 if(a[i]<min) {
//	    		 min = a[i];
//	    	 }
//	     }
//	     System.out.println(min);
	        
	        
	        
	        /////////////////////////////////////////////////////////////
	        //check if array is sorted
//	        int flag =0;
//	        for(int i=0;i<n-1;i++) {
//	        	if(arr[i]>arr[i+1]) {
//	        		flag =1;
//	        		break;
//	        		
//	        	}
//	        }
//	        if(flag ==1) {
//	        System.out.println("array is not sorted");
//	        }
//	        else System.out.println("array is sorted");
	        
	        
	        
	        /////////////////////////////////////////////////////
	        //printing reverse array
//	        for(int i=n-1;i>=0;i--) {
//	        	System.out.println(arr[i]);
//	        }
	        
	        
	        
            ////////////////////////////////////////////////////////////////
	        //reverse the array
//	        int mid = n/2;
//	 
//	        int j = n-1;
//	        for(int i=0; i<mid;i++) {
//	        	int temp = arr[i];
//	        	arr[i] = arr[j];
//	        	arr[j] = temp;
//	        	j--;
//	        }
//	        for(int k=0;k<n;k++) {
//	        	System.out.print(arr[k]);
//	        }
	        
	        
	        
	        ////////////////////////////////////////////////////////////
	        //replace every element with the greatest element on its right
	       // 7 5 8 9 6 8 5 7 4 6 
	       // 7 5 8 9 6 7 8 
	
	         
	      
//	        int max = Integer.MIN_VALUE;
//	        for(int j=0;j<n;j++) {
//	        	max = 0;
//	        	for(int i=j+1;i<n;i++) {
//	        		if(arr[i]>max) max =arr[i];
//	        	
//	        	}
//	        	arr[j]= max;
//	        
//	        }
//	        for(int k=0;k<n;k++) {
//	        	System.out.print(arr[k]);
//	        }
	        
	        
	        
	        
	        //////////////////////////////////////////////////////
	        //leaders in an array
	        // 2 7 6 1 4 3 
	        
	        // 7 2 1 6 3 4 
//	        int curr = 0;
//	        
//	        for(int i=0;i<n-1;i++) {
//	        	curr = arr[i];
//	        	boolean isleader = true;
//	        	for(int j=i+1;j<n;j++) {
//	        	  if(arr[j]>curr) {
//	        			 isleader = false;
//	        			
//	        		}
//	        	}
//	        	if (isleader) {
//	        		System.out.println(arr[i]);
//	        	}
//	        }
//	        System.out.println(arr[n-1]);
	        
	        
	        
	        
	        ///////////////////////////////////////////////
	        //subarray
	        // number of elements of subarray = (size(size +1))/2
	        
	        
	        //maximum sum of subarray
	        //kadane's algo
	        // a[] = {6, -7, 4, -2, 1, 5, -4 } 
	               	       
//	        int currsum = 0;
//	        int maxsum = Integer.MIN_VALUE;
//	        
//	        for(int i=0;i<n;i++) {
//	        	currsum = currsum + arr[i];
//	        	if(currsum <0){
//	        			currsum = 0;
//							}
//	        	if(currsum > maxsum) {
//	        		maxsum = currsum;
//	        	}     	
//	        }
//
//	        System.out.println(maxsum);
		  
		  
		  
	        ///////////////////////////////////////////////////////////////////
	        //minimum sum of subarray
	        //kadane's algo
	        // a[] = {6, -7, 4, -2, 1, 5, -4 } 
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        /////////////////////////////////////////////////////////////////////
	        //water container
	        //two pointer method
	        // 1 8 6 2 4 5 8 3 7 
	        // 2 3 4 5 18 17 6 
	        
//	        int left = 0;
//	        int right = n-1;
//	        
//	        int maxarea = 0;
//	        
//	        while(left<=right){
//	        	int dist = right-left ;
//	        	//System.out.println(dist);
//	        	
//	        	int length = Math.min(arr[left],arr[right]);
//	        	//System.out.println(left + "left: " + arr[left] + " " + right + "right: " + arr[right]);
//	        	//System.out.println(length);
//	        	int area = dist * length;
//	        	maxarea = Math.max(maxarea, area);
//	        	
//	        	if(arr[left]<arr[right]) {
//	        		left++;
//	        	}
//	        	else {
//	        		right--;
//	        	}
//	        		
//	        }
//	        System.out.println(maxarea);
	        
	        
	        /////////////////////////////////////////////////////////////
	        //tapping rain water 
	        // 1 0 2 1 0 1 3 2 1 2 1  
	        
	        //left support 
//	        int[] l = new int[n];
//	        l[0] = arr[0];
//	        for(int i=1;i<n;i++) {
//	        	l[i] = Math.max(arr[i], l[i-1]);
//	        	//l[i] = left;
//	        	
//	        }
//	        for(int e: l)
//	        System.out.print(e);
//	        System.out.println(" ");
//	        
//	        
//	        //right support 
//	        int[] r = new int[n];
//	        r[n-1] = arr[n-1];
//	        for(int i=n-2;i>=0;i--) {
//	        	r[i] = Math.max(arr[i], r[i+1]);
//	        	//l[i] = left;
//	        	
//	        }
//	        for(int e: r)
//	        System.out.print(e);
//	        System.out.println(" ");
//	        
//	        //total water capacity
//	        int sum = 0;
//	        for(int i=0;i<n;i++) {
//	        	sum = sum + (Math.min(l[i], r[i]) - arr[i]);
//	        	
//	        }
//	        System.out.println("SUM "+ sum);
		  
		  
	        
		  //////////////////////////////////////////////////////////////////////////////
		  //frequency of all elements
		  //1,1,1,2,2,2,2,3,3,3,3,3,3,4
//		  int freq =0;
//		  for(int i = 0;i<n-1;i++) {
//			  if(arr[i] == arr[i+1]) {
//				  freq++;
//				  
//			  }
//			  else {
//
//				  System.out.println(arr[i] + " freq " + (freq+1));
//				  freq=0;
//			  }
//			  
//			  
//		  }
//		  System.out.println(arr[n-1]+ " freq " + (freq+1));
	
		  
		  
		  
		  /////////////////////////////////////////////
		  //consecutive length of longest 1s.
		  // 1110010111011111
		  
//		  int count =0;
//		  int countmax = 0;
//		  for(int i = 0;i<n;i++) {
//			  if(arr[i] ==1) {
//				  count++;
//			  }
//			  else { 
//				 count =0;
//			  }
//			  countmax = Math.max(countmax, count);
//		  }
//		  System.out.println(countmax);
		  
		  
		  /////////////////////////////////////////////////
		  //print all the zeros in the end
		  //8013005 
//		  int temp =0;
//		  for(int i=0;i<n;i++) {
//			  if(arr[i]!=0) { 
//				  arr[temp]=arr[i];
//				  temp++;
//			  } 
//			 
//		  }
//		  for(int i=temp;i<n;i++) { 
//			  arr[i] =0;
//		  }
//		  for(int i=0;i<n;i++)
//		  System.out.print(arr[i]);
	        
	        
	        
	        
	        //////////////////////////////////////////////////////
//	        Print indexes of maximum sum of subarray         
//	        int start = 0;
//	        int end = 0;
//
//	        int cursum = 0;
//	        int maxsum = Integer.MIN_VALUE;
//
//	        for(int i = 0; i < size; i++)
//	        {
//	            cursum += arr[i];
//
//	            if(cursum > maxsum)
//	            {
//	                maxsum = cursum;
//	                end = i;
//	            }
//	            if(cursum < 0)
//	            {
//	                cursum = 0;
//	                start = i+1;
//	            }
//
//	        }
//	        System.out.print("Max sum is = "+maxsum);
//	        System.out.println();
//	        for(int i = start; i<=end;i++)
//	        {
//	            System.out.print(arr[i]+" ");
//	        }
		  
		  
		  //////////////////////////////////////////////////
		  //Find if there is subarray with zero sum
	      // PREFIX SUM technique
	      // 2 3 1 -4 3 -2
	         
	        
//	       int[] prefixsum = new int[n];
//	       prefixsum[0] = arr[0];
//	       
//	       for(int i =1;i<n;i++) {
//	    	   prefixsum[i] = prefixsum[i-1]+arr[i];
//	    	   
//	       }
//	       for(int i=0;i<n;i++) {
//	    	   System.out.print(prefixsum[i]);
//	       }
//	       int count=0;
//	      
//	       for(int i=0;i<n;i++) {
//	    	   for(int j=i+1;j<n;j++) {
//	    		   if(prefixsum[i] == prefixsum[j]) 
//	    		   {
//	    		   count++;
//	    		   }
//	    	   }
//	    	   
//	     }
//	       	 System.out.println(" ");
//	    	  if(count>0) {
//	    		  System.out.println("subarray has zero sum subarray" + count);
//	    	  }
		  
		  
		  ///////////////////////
		  //BETTER APPROACH 
//		  
//		  Set<Integer> prefixsum = new HashSet<>();
//		  int sum = 0;
//		  int count=0;
//		  for(int i=0;i<n;i++) {
//			  sum = sum+arr[i];
//			  if(prefixsum.contains(sum)) {
//				  count++;
//				  
//			  }
//			  prefixsum.add(sum);
//		  }
//		  if(count>0) {
//    		  System.out.println("subarray has zero sum subarray" + count);
//    	  }
			  
		  
	}
}


