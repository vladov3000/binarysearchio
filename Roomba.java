import java.util.*;


class Solution {
    public boolean solve(String[] moves, int x, int y) {
        int[] pos = {0, 0};
        for (String mv : moves) {
            if (mv.equals("NORTH")) pos[1]++;
            else if (mv.equals("EAST")) pos[0]++;
            else if (mv.equals("WEST")) pos[0]--;
            else if (mv.equals("SOUTH")) pos[1]--;
        }
        return pos[0] == x && pos[1] == y;
    }
}
