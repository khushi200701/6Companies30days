// https://practice.geeksforgeeks.org/problems/squares-in-nn-chessboard1801/1

class Solution {
    static Long squaresInChessBoard(Long n) {
        // code here
        return (n*(n+1)*(2*n+1)/6);
    }
};
