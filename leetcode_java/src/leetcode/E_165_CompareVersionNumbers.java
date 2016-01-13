package leetcode;

public class E_165_CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1Parts = version1.split("\\.");
        String[] v2Parts = version2.split("\\.");
        
        int i = 0;
        for(i=0; i<Math.min(v1Parts.length, v2Parts.length); i++) {
            if(Integer.valueOf(v1Parts[i]) > Integer.valueOf(v2Parts[i])) return 1;
            else if(Integer.valueOf(v1Parts[i]) < Integer.valueOf(v2Parts[i])) return -1;
        }
        
        //use this to check 1 vs 1.0.0.0.0
        for(;i<v1Parts.length;i++)if(Integer.parseInt(v1Parts[i])!=0)return 1;
        for(;i<v2Parts.length;i++)if(Integer.parseInt(v2Parts[i])!=0)return -1;
        return 0;
    }
    
    public static void main(String args[]) {
    	E_165_CompareVersionNumbers o = new E_165_CompareVersionNumbers();
    	o.compareVersion("1", "2");
    }
}
