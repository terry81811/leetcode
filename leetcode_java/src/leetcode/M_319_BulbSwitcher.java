package leetcode;

public class M_319_BulbSwitcher {
    public int bulbSwitch(int n) {
    	int result = (int) Math.floor(Math.sqrt((double)n));
    	System.out.println(result);
    	
		return result;
    }
    
    public static void main(String[] args) {
    	M_319_BulbSwitcher o = new M_319_BulbSwitcher();
    	o.bulbSwitch(37);
    }
}
