/*natural no:123456789>1,div by 1 and itself
ex:2,3,5,7,11
*/
class Prime{
	static boolean isPrime(int n){
		for (int i=2; i<n; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
