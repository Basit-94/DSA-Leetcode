class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordlist = new HashSet<>(wordList);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));

        while(!q.isEmpty()) {
            String word = q.peek().first;
            int dist = q.peek().second;
            q.remove();
            if(word.equals(endWord)) {
                return dist;
            }

            for(int i=0;i<beginWord.length();i++) {
                char arr[] = word.toCharArray();

                for(char c='a';c<='z';c++) {
                    arr[i] = c;
                    String newWord = new String(arr);
                    if(wordlist.contains(newWord)) {
                        wordlist.remove(newWord);
                        q.add(new Pair(newWord,dist+1));
                    }
                }

            }
        }

        return 0;
    }
}
class Pair {
    String first;
    int second;
    Pair(String first,int second) {
        this.first = first;
        this.second = second;
    }
}