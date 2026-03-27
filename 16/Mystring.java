/*rearranging its char from last to first
class Mystring{
	static void info(){
		int i;
		String s="Anusha";
		for(i=0;i<s.length();i++){
			System.out.print(s.charAt(i));
		}
	}
}
*/
class Mystring{
	static void info(){
		int i;
		String s="Anusha";
		for(i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}
}
