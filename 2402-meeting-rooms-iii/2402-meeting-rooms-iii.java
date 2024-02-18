class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        PriorityQueue<long[]> queue = new PriorityQueue<>(
                (a, b) -> a[0] == b[0] ? (int) (a[1] - b[1]) : (int) (a[0] - b[0]));
        // {next available time, room no.}

        int[] roomCount = new int[n]; 
        int result = 0;

        for (int i = 0; i < n; i++)
            queue.add(new long[] { 0, i });

        for (int[] meeting : meetings) {
            int time = meeting[0]; // new meeting start time

            while (queue.peek()[0] < time) // order all available room by room index
                queue.add(new long[] { time, queue.poll()[1] });

            long[] current = queue.poll();
            int curRoom = (int) current[1];
            long meetingEndTime = current[0] + (meeting[1] - meeting[0]); 
            roomCount[curRoom]++;

            if (roomCount[curRoom] > roomCount[result]) 
                result = curRoom;
            else if (roomCount[curRoom] == roomCount[result])
                result = Math.min(result, curRoom);

            queue.add(new long[] { meetingEndTime, curRoom });
        }

        return result;
    }
}