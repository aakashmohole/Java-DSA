package RecursionProblems;

public class qb_countContiguousSubstring {
    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(findCount(str, 0, 0));
    }

    public static int findCount(String str, int start, int end) {
        if (start >= str.length()) { // Base case: stop when start reaches end
            return 0;
        }
        if (end >= str.length()) { // When `end` reaches the end, move `start` forward
            return findCount(str, start + 1, start + 1);
        }

        int count = 0;
        if (str.charAt(start) == str.charAt(end)) {
            count = 1; // Count this valid substring
        }

        return count + findCount(str, start, end + 1); // Move `end` forward
    }
}
