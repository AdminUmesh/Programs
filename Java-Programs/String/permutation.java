//Print All permutation of given String

public class permutation {
    public static void permute(String s,int l,int r){
        if(l==r){
            System.out.println(s);
            return;
        }

        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            permute(s,l+1,r);
            s=swap(s,l,i);
        }
    }

    public static String swap(String s,int l,int i){
        char b[]=s.toCharArray();
        char ch=b[i];

        b[i]=b[l];
        b[l]=ch;

        return String.valueOf(b);
    }
        
     
	public static void main(String[] args) {
		String s="abc";
		int l=0;
		int r=s.length()-1;
        
		permute(s,l,r);
	}
}
