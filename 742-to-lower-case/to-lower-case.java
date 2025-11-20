class Solution {
    public String toLowerCase(String s) {
        int l=s.length();int a;char ch;
        char[] arr = s.toCharArray();
        for(int i=0;i<l;i++){
            a=(int)arr[i];
            if(a>=65 && a<=90){
                a=a+32;
                ch=(char)a;
                arr[i]=ch;
            }
        }
        return new String(arr);
    }
}