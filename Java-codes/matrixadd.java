public class MatrixAdd{  
public static void main(String args[]){  
//creating two matrices    
int x[][]={{1,3,4},{2,4,3},{3,4,5}};    
int y[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
//creating another matrix to store the sum of two matrices    
int z[][]=new int[2][2];  //2 rows and 2 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<2;i++){    
for(int j=0;j<2;j++){    
z[i][j]=x[i][j]+y[i][j];    //use - for subtraction  
System.out.print(z[i][j]+" ");    
}    
System.out.println();//new line    
}    
}}  
