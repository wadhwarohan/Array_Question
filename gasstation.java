class gasstation {
 public int canCompleteCircuit(int[] gas, int[] cost) {
 int n = gas.length;
 int totalTank = 0; // Total gas in the tank
 int currTank = 0; // Gas in the current tour
 int startingStation = 0; // Starting station index
 for (int i = 0; i < n; i++) {
 totalTank += gas[i] - cost[i]; // Calculate the total gas and cost difference
 // If the tank becomes negative, reset the starting station to the next station
 if (currTank < 0) {
 currTank = gas[i] - cost[i];
 startingStation = i;
 } else {
 currTank += gas[i] - cost[i];
 }
 }
 // If the total tank is negative, it means the car cannot complete a full circuit
 if (totalTank < 0) {
 return -1;
 } else {
 return startingStation;
 }
 
}
