public class CountKSubStr{
        int countkDist(String str, int k){
            Set<Character> countUnique = new HashSet<>();
            for(int i=0;i<str.length();i++){
                countUnique.add(str.charAt(i));
            }
            if(countUnique.size()<k){
                return 0;
            }
            int slow=0, fast=0,count=0;
            Set<Character> set = new HashSet<>();
            while(fast<str.length() && slow<=fast){
                set.add(str.charAt(fast));
                if(set.size()<=k){
                    if(set.size()==k){count++;}
                    fast++;
                }else{
                    slow++;
                    fast=slow;
                    set.clear();
                }
            }
            return count;
        }
    
    public static void main(String[] args) 
    { 
        CountKSubStr ob = new CountKSubStr(); 
        String ch = "aabab"; 
        int k = 2; 
        System.out.println("Total substrings with exactly " + 
                           k +    " distinct characters : "
                           + ob.countkDist(ch, k)); 
    }
}
