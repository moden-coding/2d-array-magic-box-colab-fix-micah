public class App {
	public static void main(String[] args){
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		System.out.println(isMagic(a)); //true
		int[][] b = {
			{1,1,2},
			{3,2,3},
			{1,4,1}
		};
		System.out.println(isMagic(b)); //false
		int[][] c = {
			{1,1,1},
			{2,2,2}
		};
		System.out.println(isMagic(c)); //false
		int[][] d = {
			{8,1,6},
			{3,5,7},
			{4,9,2}
		};
		System.out.println(isMagic(d)); //true
	}
	
	public static boolean isMagic(int[][] array){
		for(int i=0;i<array.length;i++){
            if(array[i].length != array.length){
                return false; 
            }
        }
        int Sum = 0;
        for(int j=0;j<array.length;j++){
            Sum += array[0][j];
        }
    
        for(int i=0;i<array.length;i++){
            int rowSum = 0;
            for(int j=0;j<array.length;j++){
                rowSum += array[i][j];
            }
            if(rowSum != Sum){
                return false;
            }
        }
        
        for(int j=0;j<array.length;j++){
            int colSum = 0;
            for(int i=0;i<array.length;i++){
                colSum += array[i][j];
            }
            if(colSum != Sum){
                return false;
            }
        }
        
        int firstDiagSum = 0;
        for(int i=0;i<array.length;i++){
            firstDiagSum += array[i][i];
        }
        if(firstDiagSum != Sum){
            return false;
        }
        
        int secondDiagSum = 0;
        for(int i=0;i<array.length;i++){
            secondDiagSum += array[i][array.length-1-i];
        }
        if(secondDiagSum != Sum){
            return false;
        }
        return true;
    }
	
}
