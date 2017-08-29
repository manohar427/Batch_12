
public class EnForLoop {

	public static void main(String[] args) {
       
		
		int all[] = {34,56,78,99,53,2,2,2,23,2323};
		
		for(int i=0;i<all.length;i++){
			System.out.println(all[i]);
		}
		System.out.println("============");
		for(int i : all){
			System.out.println(i);
		}
	}

}
