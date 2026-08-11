class Solution {
    public int[] sortArray(int[] arr) {
     mergeSort(arr);
     return arr;   
    }

    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        int idx=0;
        
        for(int i=0; i<a.length; i++){
            a[i]=arr[idx++];
        }
        for(int i=0; i<b.length; i++){
            b[i]=arr[idx++];
        }
        mergeSort(a); mergeSort(b);

        merge(a,b,arr);
    }

    public static void merge(int[] a,int[] b,int[] arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                arr[k++]=b[j++];
            }else{
                arr[k++]=a[i++];
            }
        }
        while(i<a.length){
            arr[k++]=a[i++];
        }
        while(j<b.length){
            arr[k++]=b[j++];
        }
    }
}