package leetcode;

public class E_278_FirstBadVersion {
	
	public boolean isBadVersion(int n) {
		return true;
	}
	
	//binary search, time limit exceed
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid;
        if(n<2) return n;
        
        while(start!=end) {
        	mid = start + (end - start) / 2; //low+high may out-range the integer type
            if(isBadVersion(mid)) {
            	if(!isBadVersion(mid-1)) {
            		return mid;
            	}

                end = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
    
    //recursion, stack overflow
    public int searchBadVersion(int start, int end) {
        if(start == end) return start;
        int n = (start + end) / 2;
        if(isBadVersion(n)) {
            return searchBadVersion(start, n);
            
        }else { 
            return searchBadVersion(n+1, end);
        }
    }
    
    public static void main(String args[]) {
    	E_278_FirstBadVersion o = new E_278_FirstBadVersion();
    	o.firstBadVersion(3);
//    	System.out.println(3/2);
    }
}
