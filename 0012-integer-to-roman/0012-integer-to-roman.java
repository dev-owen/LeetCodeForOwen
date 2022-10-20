class Solution {
    static final int M = 1000;
    static final int D = 500;
    static final int C = 100;
    static final int L = 50;
    static final int X = 10;
    static final int V = 5;
    static final int I = 1;
    
    public String intToRoman(int num) {
        String answer = "";
        int remainder = num;
        while (remainder >= M - C) {
            if(remainder >= M) {
                remainder -= M;
                answer += "M";
            }
            if(900 <= remainder && remainder < M) {
                answer += "CM";
                remainder -= 900;
            }
            if(400 <= remainder && remainder < D) {
                answer += "CD";
                remainder -= 400;
            }
            if(90 <= remainder && remainder < C) {
                answer += "XC";
                remainder -= 90;
            }
            if(40 <= remainder && remainder < L) {
                answer += "XL";
                remainder -= 40;
            }
            if(9 <= remainder && remainder < X) {
                answer += "IX";
                remainder -= 9;
            }
            if(4 <= remainder && remainder < V) {
                answer += "IV";
                remainder -= 4;
            }
        }
        while (remainder >= D - C) {
            if(remainder >= D) {
                remainder -= D;
                answer += "D";
            }
            if(400 <= remainder && remainder < D) {
                answer += "CD";
                remainder -= 400;
            }
            if(90 <= remainder && remainder < C) {
                answer += "XC";
                remainder -= 90;
            }
            if(40 <= remainder && remainder < L) {
                answer += "XL";
                remainder -= 40;
            }
            if(9 <= remainder && remainder < X) {
                answer += "IX";
                remainder -= 9;
            }
            if(4 <= remainder && remainder < V) {
                answer += "IV";
                remainder -= 4;
            }
        }
        while (remainder >= C - X) {
            if(remainder >= C) {
                remainder -= C;
                answer += "C";
            }
            if(90 <= remainder && remainder < C) {
                answer += "XC";
                remainder -= 90;
            }
            if(40 <= remainder && remainder < L) {
                answer += "XL";
                remainder -= 40;
            }
            if(9 <= remainder && remainder < X) {
                answer += "IX";
                remainder -= 9;
            }
            if(4 <= remainder && remainder < V) {
                answer += "IV";
                remainder -= 4;
            }
        }
        while (remainder >= L - X) {
            if(remainder >= L) {
                remainder -= L;
                answer += "L";
            }
            if(40 <= remainder && remainder < L) {
                answer += "XL";
                remainder -= 40;
            }
            if(9 <= remainder && remainder < X) {
                answer += "IX";
                remainder -= 9;
            }
            if(4 <= remainder && remainder < V) {
                answer += "IV";
                remainder -= 4;
            }
        }
        while (remainder >= X - I) {
            if(remainder >= X) {
                remainder -= X;
                answer += "X";
            }
            if(9 <= remainder && remainder < X) {
                answer += "IX";
                remainder -= 9;
            }
            if(4 <= remainder && remainder < V) {
                answer += "IV";
                remainder -= 4;
            }
        }
        while (remainder >= V - I) {
            if(remainder >= V) {
                remainder -= V;
                answer += "V";
            }
            if(4 <= remainder && remainder < V) {
                answer += "IV";
                remainder -= 4;
            }
        }
        while (remainder >= I) {
            remainder -= I;
            answer += "I";
        }

        return answer;
    }
}