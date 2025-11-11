public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         double median = 0;
       int n1 =nums1.length;
       int n2 = nums2.length;
       int[] coarray = new int[n1+n2];
       for(int i = 0 ; i<nums1.length;i++){
           coarray[i] = nums1[i];
       }
       for(int j = 0 ; j<n2;j++){
           coarray[j+n1] =  nums2[j];
       }
        Arrays.sort(coarray);
       if(coarray.length % 2 != 0){
           median = coarray[coarray.length/2];
       }
       else{
           median = (double) (coarray[coarray.length / 2] + coarray[coarray.length / 2 - 1]) /2;
       }
       return median;
    }
