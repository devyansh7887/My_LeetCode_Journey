class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        
        double guess = x;
        while (true) {
            double next = 0.5 * (guess + x / guess);
            if (Math.abs(next - guess) < 1e-6) break;
            guess = next;
        }
        return (int) guess; // cast to int gives floor value
    }
}
