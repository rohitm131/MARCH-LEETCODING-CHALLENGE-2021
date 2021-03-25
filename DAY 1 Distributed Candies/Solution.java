class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> cset = new HashSet<>();

        for (int c : candyType)  cset.add(c);

        return Math.min(cset.size(), candyType.length / 2);
    }
}
