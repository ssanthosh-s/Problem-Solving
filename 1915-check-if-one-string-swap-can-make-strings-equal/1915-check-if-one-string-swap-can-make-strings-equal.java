class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       int count=0;
       int c1=0;
       int c2=0;
       int c3=0;
       int c4=0;
       for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            if(count==1){
                c2=s1.charAt(i);
                c4=s2.charAt(i);
            }
            else{
                c1=s1.charAt(i);
                c3=s2.charAt(i);
            }
            count++;
        }
       }
       if(count>2)return false;
       if(c1==c4 && c3==c2) return true;
       return false;
    }
}