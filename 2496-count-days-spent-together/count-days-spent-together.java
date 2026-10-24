class Solution {

      private int convert(String date, int[] month) {
        int m = (date.charAt(0) - '0') * 10
              + (date.charAt(1) - '0');

        int d = (date.charAt(3) - '0') * 10
              + (date.charAt(4) - '0');

        int total = d;

        for (int i = 0; i < m - 1; i++) {
            total += month[i];
        }

        return total;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};

        int aliceArrival = convert(arriveAlice,month);
        int aliceDeparture= convert(leaveAlice,month);
        int bobArrival = convert(arriveBob, month);
        int bobDeparture = convert(leaveBob, month);

        int arrival = Math.max(aliceArrival,bobArrival);
        int departure = Math.min(aliceDeparture, bobDeparture);

        if(arrival>departure) return 0;

        return departure-arrival+1;

        



        



       
        
    }
}