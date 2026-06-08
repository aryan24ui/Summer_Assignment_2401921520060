class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count letters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        // Use letters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (freq[ch - 'a'] == 0) {
                return false;
            }

            freq[ch - 'a']--;
        }

        return true;
    }
}
