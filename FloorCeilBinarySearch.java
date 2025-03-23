public class FloorCeilBinarySearch {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int n = arr.length;
        int floor = -1;
        int ceil = -1;

        if(n==0) return new int[] {-1,-1}; //base case

        for(int i=0;i<n;i++){
            if(arr[i]<=x && (floor == -1 || arr[i]>floor)){
                floor = arr[i];
            }

            if(arr[i]>=x && (ceil == -1 || arr[i]<ceil)){
                ceil = arr[i];
            }
        }
        return new int[]{floor,ceil};
    }
}
