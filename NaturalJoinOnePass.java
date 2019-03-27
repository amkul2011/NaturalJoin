import java.util.Arrays;
/*The following code displays Natural Join of two relations namely,
 * R and S. R and S are initially on Disk and are represented here in the form
 * of 2-D arrays. Relation R has 4 attributes and Relation S has 2 attributes.
 * Nested loops represent comparison of every block of R with S 
 * block and evaluates the join condition.Finally the output is represented as 
 * output stream buffer of new relation with 5 attributes as its natural join which 
 * eliminates duplicate columns.
 * */

public class NaturalJoinOnePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	   int [][] R={{2,1,3,4},{4,5,6,7},{5,3,7,8},{9,10,11,12},{10,20,33,40},{25,27,30,49}};//Disk Storage
	   int [][] S={{2,9},{4,8},{5,6},{9,13},{10,23}};//Disk Storage
	   
	 /*Test int [][]R={{2,1,3,4},{5,3,7,8},{9,10,11,12}};
		  int [][] S={{2,9},{9,6}};*/
	   
	   int memory=S.length+1;//B(R)>M>B(S)
	   int i,j;
	   String opbuffer;//Output-buffer stream.
	   String str1;
	   String str2;
	   System.out.println("The Natural Join of Relations R and S is");
	   
	   //Loading and Comparison of R & S from Disk to RAM in given below and Output Display.
	   //Size of S<=M memory
	  // System.out.println(R.length);
	    //System.out.println(S[0].length);
	   for(i=0;i<R.length;i++){
			for(j=0;j<memory-1;j++) 
			
				{
				    if(R[i][0]==S[j][0]){
					int []Sarr=S[j];
					str1=Arrays.toString(R[i]);
					str2=str1.substring(0,str1.length()-1);
					opbuffer=str2+","+Sarr[1]+"]";
					System.out.println(opbuffer);
				  
				 
				}
		     }
			
		}
		
	}	

}
