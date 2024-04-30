import java.util.HashSet;
import java.util.Set;

class Solution {
  boolean isHappy(int n) {
    Set<Integer> usedIntegers = new HashSet<>();
    while (true) {
      int sum = 0;
      while (n != 0) {
        sum += Math.pow(n % 10, 2.0);
        n = n / 10;
      }
      if (sum == 1) return true;
      n = sum;
      if (usedIntegers.contains(n))
        return false;
      usedIntegers.add(n);
    }
  }

}