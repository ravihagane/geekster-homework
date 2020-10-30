class Solution {
    public int mySqrt(int x) {
        
    double sq = (double)Math.sqrt(x);
    String _p = String.valueOf(sq);
    int index = _p.indexOf(".");
    String out = "";
        
    for (int i=0; i<index; i++) {
        out += _p.charAt(i);
    }
        
        return Integer.parseInt(out);
    }
}