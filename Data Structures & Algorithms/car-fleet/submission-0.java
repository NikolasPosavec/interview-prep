class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> fleets = new Stack<>();
        for(int i = 0; i < position.length; i++) {
            if(!fleets.contains(Math.ceil((target - position[i]) / speed[i]))) {
                fleets.push(Math.ceil((target - position[i]) / speed[i]));
            }
        }
        return fleets.size();
    }
}
