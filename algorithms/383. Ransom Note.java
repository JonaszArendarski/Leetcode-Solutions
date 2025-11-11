public boolean canConstruct(String ransomNote, String magazine) {
      HashMap<Character,Integer> mag = new HashMap<>();
        HashMap<Character,Integer> note = new HashMap<>();
        char [] magtable = magazine.toCharArray();
        char[] not = ransomNote.toCharArray();
        for(Character c :  magtable){
            mag.put(c,mag.getOrDefault(c,0)+1);
        }
        for(Character ch : not){
            note.put(ch,note.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : note.entrySet()){
            char ch = entry.getKey();
            int needed = entry.getValue();
            int available = mag.getOrDefault(ch, 0);

            if (available < needed) {
                return false;
            }
        }
        return  true; 
    }
