class Solution {
    public boolean sumGame(String num) {

        int mid = num.length() / 2;

        int left_sum = 0;
        int right_sum = 0;

        int leftq = 0;
        int rightq = 0;

        for (int i = 0; i < mid; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                leftq++;
            } else {
                left_sum = left_sum + (ch - '0');
            }
        }

        for (int i = mid; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                rightq++;
            } else {
                right_sum = right_sum + (ch - '0');
            }
        }

        int diff = left_sum - right_sum;
        int qdiff = leftq - rightq;

        if (diff * 2 == -9 * qdiff) {
            return false;
        } else {
            return true;
        }
    }
}