package leetcode;

//note that there is KMP alg

public class E_28_ImplementstrStr {
    public int strStr(String haystack, String needle) {
        
        if(needle.equals("")) return 0;
        
	   	char[] hayStackArr = haystack.toCharArray();
		char[] needleArr = needle.toCharArray();
		for(int i=0; i<hayStackArr.length - needleArr.length + 1; i++) {
			int j = 0;
			if(hayStackArr[i] == needleArr[0]) {
				boolean flag = true;
				for(j = 0; j<needleArr.length; j++) {
					if(hayStackArr[i+j]!=needleArr[j]) flag = false;
				}
				if(flag == true) return i;
			}
		}
		return -1;
    }
    
    //using substring
    public int strStr2(String haystack, String needle) {

        if(haystack == null || needle == null || needle.length() > haystack.length()){
            return -1;
        }
        for(int i = 0; i < haystack.length() - needle.length() + 1; i ++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
    	E_28_ImplementstrStr o = new E_28_ImplementstrStr();
    	System.out.println(o.strStr("a", "a"));
    }



}
