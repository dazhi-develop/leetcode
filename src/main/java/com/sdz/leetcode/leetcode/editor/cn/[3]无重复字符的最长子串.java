package com.sdz.leetcode.leetcode.editor.cn;//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window


import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "abccefgj";

        System.out.println(solution.lengthOfLongestSubstring(str));

    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null && s.length() == 0) {
            return 0;
        }
        int i = 0, j = 0, maxLength = 0;
        Set<Character> characterSet = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (!characterSet.contains(s.charAt(j))) {
                characterSet.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                characterSet.remove(s.charAt(i++));
            }
        }

        return maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
