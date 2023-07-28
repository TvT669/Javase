public class Migong{
	public static void main(String[]args){
		int[][]map = new int[8][7];
		for(int i = 0;i < map.length; i++){
			for(int j = 0;j < map[i].length;j++){
			map[i][j] = 0;
			map[0][j] = 1;
			map[7][j] = 1;
			map[i][0] = 1;
			map[i][6] = 1;
			map[3][1] = 1;
			map[3][2] = 1;
			}
		}
		B b = new B();
		b.isway(map,1,1);
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		

	}
}
class B{
	public boolean isway(int[][]map,int i,int j){
		if(map[6][5] == 2){
			return true;
		}
		else{
			if(map[i][j] == 0){
				map[i][j]=2;
				if(isway(map,i+1,j)){
					return true;
				}
				else if(isway(map,i,j+1)){
					return true;
				}
				else if(isway(map,i-1,j)){
					return true;
				}
				else if(isway(map,i,j-1)){
					return true;
				}
				else{
					map[i][j] = 3;
					return false;
				}

			}
			else{
				return false;
			}
		}
	}
	}
