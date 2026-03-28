class Demo{
	static void Info(int totalproduct, int sales,int maxsales){
		System.out.println("executing");
		if(totalproduct>=sales){
		System.out.println("total sales:"+sales);
		return;
		}
		if(totalproduct<=maxsales){
		System.out.println("highest sales"+maxsales);
		}
		}
}

