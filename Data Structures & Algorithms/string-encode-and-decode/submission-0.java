class Solution {

    public String encode(List<String> strs) {
        String s="";
        for(String str:strs){
            s=s+str.length()+"#"+str;
        }
        return s;
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int j=0;
        int i=0;
        while(i<str.length()){
            j=i;
            // I couldnt think of the solution in first place, i was stuck thinking of what algorithm i need to use. Checked the solution. Because this is a decode and encode problem , we had to consider length of the string with a dummy delimiter.
            // The while loop here is very important, reason being if replaced with a if it will give infinite loop error.
            while(str.charAt(j)!='#') j++;
            int length=Integer.parseInt(str.substring(i,j));
            String substr=str.substring(j+1,j+1+length);
            res.add(substr);
            i=j+1+length;
            
        }
        return res;
    }
}
