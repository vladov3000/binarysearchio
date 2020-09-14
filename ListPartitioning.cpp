#include "solution.hpp"
using namespace std;


class Solution {
    public:
    vector<string> solve(vector<string>& strs) {
        int next = 0;
        string colors[] = { "red", "green", "blue" };
        for (string c : colors) {
            for (int i = 0; i < strs.size(); i++) {
                if (strs[i] == c) {
                    swap(strs[next++], strs[i]);
                }
            }
        }
        return strs;
    }
};
