class Solution {
      public int solution(int n) {
          int answer = 0;
          
          int[] number = new int[n+1];
          
          //2���� n������ ���� �迭�� �ִ´�.
          for(int i=2; i<=n; i++) {
              number[i] = i;
          }
          
          //2���� �����ؼ� ���� ������� 0���� �����.
          //�Ŀ� 0�̸� �Ѿ�� �ƴϸ� ���� ������� �ٽ� 0���� �����.
          for(int i=2; i<=n; i++) {
              if(number[i]==0) continue;
              
              for(int j= 2*i; j<=n; j += i) {
                  number[j] = 0;
              }
          }
          
          //�迭���� 0�� �ƴ� �͵��� ������ ���ش�.
          for(int i=0; i<number.length; i++) {
              if(number[i]!=0) {
                  answer++;
              }
          }
          
          return answer;
      }
    }