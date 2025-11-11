public String reverseWords(String s) {
        int firstLett = 0;
        int lastLett = 0;
        StringBuilder rev = new StringBuilder();
        while (lastLett <= s.length()){
            if( lastLett == s.length() || s.charAt(lastLett) == ' ') {
                StringBuilder word = new StringBuilder(s.substring(firstLett, lastLett));
                rev.append(word.reverse());

                if (lastLett != s.length()) {
                    rev.append(' ');
                }
                lastLett++;
                firstLett = lastLett;

            } else{
                lastLett++;
            }
        }
        return rev.toString();
    }
