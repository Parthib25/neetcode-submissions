class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;

        Stack<Character> st=new Stack();
        HashMap<Character,Character> brMap=new HashMap<>();
        brMap.put('}','{');
        brMap.put(')','(');
        brMap.put(']','[');
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'){
                    if(!st.empty() && st.peek()==brMap.get(s.charAt(i))){
                        st.pop();
                    }else{
                        st.push(s.charAt(i));
                    }
            }else{
               st.push(s.charAt(i)); 
            }
        }

        if(st.empty()) return true;

        return false;
    }
}
