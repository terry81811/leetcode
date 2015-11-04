package leetcode;

import java.util.Arrays;

public class E_223_RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int AreaA = Math.abs(C-A)*Math.abs(D-B);
        int AreaB = Math.abs(G-E)*Math.abs(H-F);
        int overlap = 0;
        
        if(Math.min(A,C) > Math.max(G,E) || Math.max(A,C) < Math.min(G,E)) return AreaA+AreaB;
        if(Math.min(B,D) > Math.max(F,H) || Math.max(B,D) < Math.min(F,H)) return AreaA+AreaB;
        
        int[] xAxis = {A,C,G,E};
        int[] yAxis = {B,D,F,H};
        Arrays.sort(xAxis);
        Arrays.sort(yAxis);
        overlap = (xAxis[2]-xAxis[1]) * (yAxis[2]-yAxis[1]);
        
        return AreaA+AreaB-overlap;
        
    }
}
