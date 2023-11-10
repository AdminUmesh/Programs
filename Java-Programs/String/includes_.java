// Print string after _ which is length is greater than 4

public class includes_
{
	public static void main(String[] args) {
	    int count=0;
	    String str1 ="";
	    String str="jj_uhi_555_jfkd";
	    for(int i=0; i<str.length(); i++){
	      
	        if(str.charAt(i) == '_'){
	            count=0;
	            str1 ="";
	            i++;
	        }
	        if(str.charAt(i)=='_' && count<4){
	            count=0;
	            str1="";
	        }
	        count++;
	        str1=str1+str.charAt(i);
	    }
		System.out.println(str1);
	}
}