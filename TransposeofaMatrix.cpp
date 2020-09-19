#include "solution.hpp"
using namespace std;


class Solution {
    public:
    vector<vector<int>> solve(vector<vector<int>>& matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = i; j < matrix.size(); j++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        return matrix;
    }
};
