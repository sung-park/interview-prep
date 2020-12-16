class Solution {
    public boolean isHappy(int n) {
		Set<Integer> checked = new HashSet<>();

		int result = n;
		do {
			if (checked.contains(result)) {
				return false;
			}
			checked.add(result);
			
			n = result;
			result = 0;
			while (n != 0) {
				result += (n % 10) * (n % 10);
				n = n / 10;
			}
		} while (result != 1); 
		
		return true;	
    }
}
