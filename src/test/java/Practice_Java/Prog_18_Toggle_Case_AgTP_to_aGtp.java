package Practice_Java;

public class Prog_18_Toggle_Case_AgTP_to_aGtp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "HbTpMshT";
		String res ="";
		int leng= str.length();
		
		for(int i=0;i<leng;i++)
		{
			char c= str.charAt(i);
			
			if(c>='a'&&c<='z') // is lowercase convert to uppercase
			{
				res = res +(char)((int)c+((int)'A'-(int)'a'));
			}
			if(c>='A'&&c<='Z') // is uppercase convert to lowercase
			{
				res = res +(char)((int)c-((int)'A'-(int)'a'));
			}
		}
		
		System.out.println("Given data: "+str+"\nOutput data : "+res);
						
	}

}
