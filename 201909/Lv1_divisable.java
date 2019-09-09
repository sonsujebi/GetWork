import java.util.*;
class Solution {
  public int[] solution(int[] arr, int divisor) {
      int[] answer = {-1};
      int idx = arr.length;
      ArrayList<Integer> list = new ArrayList<>();

      for(int i = 0 ; i < idx ; i++)
      {
            if(arr[i] % divisor == 0)
                list.add(arr[i]);
      }
      Collections.sort(list);
      if( list.size() != 0)
      {
          answer = new int[list.size()];
          for(int i = 0 ; i < list.size() ; i++)
              answer[i] = list.get(i);
      }
      return answer;
  }
}