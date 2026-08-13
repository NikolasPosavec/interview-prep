class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Queue<int[][]> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            queue.add(new int[][]{{position[i], speed[i]}});
        }

        while(queue.size() > 1) {
            int[][] arr1 = queue.poll();
            int[][] arr2 = queue.poll();
            int[][] result = new int[arr1.length + arr2.length][2];
            int p1 = 0, p2 = 0, k = 0;
            while(p1 < arr1.length && p2 < arr2.length) {
                if(arr1[p1][0] <= arr2[p2][0]) {
                    result[k++] = arr1[p1++];
                } else {
                    result[k++] = arr2[p2++];
                }
            }
            while(p1 < arr1.length) result[k++] = arr1[p1++];
            while(p2 < arr2.length) result[k++] = arr2[p2++];
            queue.add(result);
        }

        int[][] cars = queue.poll();  

        int fleets = 0;
        double curTime = 0;
        for(int i = cars.length - 1; i >= 0; i--) {
            double time = (double)(target - cars[i][0]) / cars[i][1];
            if(time > curTime) {
                fleets++;
                curTime = time;
            }
        }
        return fleets;
    }
}