public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] res = new int [k];
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> count.get(a)-count.get(b));
        for(int key : count.keySet()){
            minHeap.add(key);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        while(k-- > 0){
            res[k]=minHeap.poll();
        }
        return res;
    }
}