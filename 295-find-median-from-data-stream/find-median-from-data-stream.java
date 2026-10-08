class MedianFinder {
    PriorityQueue<Integer>minHeap=new PriorityQueue<>();
    PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(minHeap.size()==0) minHeap.add(num);
        else{
            if(minHeap.peek()>num) maxHeap.add(num);
            else minHeap.add(num);
        }
        if(minHeap.size()==maxHeap.size()+2) 
        maxHeap.add(minHeap.remove());
        if(maxHeap.size()==minHeap.size()+2)
        minHeap.add(maxHeap.remove());
    }
    
    public double findMedian() {
        if(minHeap.size()==maxHeap.size()+1)
        return (double)minHeap.peek();
        else if(maxHeap.size()==minHeap.size()+1)
        return (double)maxHeap.peek();
        else{
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }
    }
}