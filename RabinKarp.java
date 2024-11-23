class RabinKarp{
    public final static int d = 10;

    static void search(String pat,String txt,int q){
        int m = pat.length();
        int n = txt.length();
        int i,j;
        int p = 0;
        int t = 0;
        int h = 1;
        for(i = 0;i < m-1;i++){
            p = (d* p + pat.charAt(i))% q;
            t = (d* t + txt.charAt(i))% q;
        }
        for(i = 0;i <= n-m;i++){
            if(p==t){
                if(txt.charAt(i + j) != pat.charAt(j))
                   break;
            }
            if(j == m)
            System.out.println("Pattern is found at position: " + (i + 1));
        
    }
    if(i<n- m){
        t =(d*(t - txt.charAt(i) * h)+ txt.charAt(i + m))%q;
        if(t<0)
           t = (t+ q);
    }
    }
}
public static void main(String[] args){
    String txt = "ABCCDDAEFG";
    String pat = "CDD";
    int q = 13;
    search(pat,txt,q);

}
