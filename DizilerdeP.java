package Diziler;

public class DizilerdeP {
    public static void main(String[] args) {

        String[][] pHarf=new String[6][4];

        for (int i = 0 ;i< pHarf.length;i++){
            for (int j = 0 ;j< pHarf[i].length;j++){
                if (i==0 || i==5||i==3){
                    pHarf[i][j]= " *";
                
                } else if (j==0||j==3) {
                    pHarf[i][j]=" *  ";
                    
                }else {
                    pHarf[i][j]=" ";
                }
            }
        }for (String[] row : pHarf){
            for (String col : row ){
                System.out.print(col);


    }
            System.out.println();

        }




    }}




