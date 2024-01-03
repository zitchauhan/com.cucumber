
package Array_Java;
public class SubstringEqual012 {
    static int getSubstringWithEqual012(String s) {
        int count = 0;
        int countZero = 0, countOne = 0, countTwo = 0;

        for (int i = 0; i < s.length(); i++) {
            countZero = 0;
            countOne = 0;
            countTwo = 0;

            for (int j = i; j < s.length(); j++) {
                
            	
            	if (s.charAt(j) == '0') countZero++;
                else if (s.charAt(j) == '1') countOne++;
                else countTwo++;

                if (countZero == countOne && countOne == countTwo) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "010201";
        System.out.println(getSubstringWithEqual012(str)); // Output: 3
    }
}
/// 0 =  4
//  1=   2 
//  2 =  1