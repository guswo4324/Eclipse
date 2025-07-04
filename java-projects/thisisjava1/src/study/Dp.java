package study;

/*

지원이에게 2진 수열을 가르쳐 주기 위해, 지원이 아버지는 그에게 타일들을 선물해주셨다. 

그리고 이 각각의 타일들은 0 또는 1이 쓰여 있는 낱장의 타일들이다.

어느 날 짓궂은 동주가 지원이의 공부를 방해하기 위해 
0이 쓰여진 낱장의 타일들을 붙여서 한 쌍으로 이루어진 00 타일들을 만들었다. 

결국 현재 1 하나만으로 이루어진 타일 또는 0타일을 두 개 붙인 한 쌍의 00타일들만이 남게 되었다.

그러므로 지원이는 타일로 더 이상 크기가 N인 모든 2진 수열을 만들 수 없게 되었다. 
예를 들어, N=1일 때 1만 만들 수 있고, N=2일 때는 00, 11을 만들 수 있다. 
(01, 10은 만들 수 없게 되었다.) 

또한 N=4일 때는 0011, 0000, 1001, 1100, 1111 등 총 5개의 2진 수열을 만들 수 있다.

우리의 목표는 N이 주어졌을 때 지원이가 만들 수 있는 모든 가짓수를 세는 것이다. 단 타일들은 무한히 많은 것으로 가정하자.

입력
첫 번째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 1,000,000)

출력
첫 번째 줄에 지원이가 만들 수 있는 길이가 N인 모든 2진 수열의 개수를 15746으로 나눈 나머지를 출력한다.

[입력]
4

[출력]
5

 */

import java.io.*;
public class Dp {
	static int size = 1000000;
	
	static int[] dp = new int[size];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		/* 기저 조건 설정
		 * 동적계획법(DP)에서 가장 기본적이면서 중요한 부분
		 * dp[1] = 1: 길이가 1일 때 가능한 경우의 수(예: 1 -> 1가지)
		 * dp[2] = 2: 길이가 2일 때 가능한 경우의 수(예: 11, 00 -> 2가지)
		 */
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		/*
		 * 메모이제이션을 위한 마킹
		 * DP 배열 조기화
		 * - DP를 재귀 방식 + 메모이제이션으로 구현할 때는, dp[n]이 이미 계산되었는지를 알아야 함
		 * 그래서 초기값을 -1로 설정해서
		 * dp[n] == -1이면 아직 안 구한 값 -> 계산 수행
		 * dp[n] != -1이면 이미 계산된 값 -> 저장된 값 그대로 사용
		 */
		for(int i = 3; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.println(tile1(N));
		System.out.println(tile2(N));
		System.out.println(tile3(N));
	}
	
	public static int tile1(int n) {
		if(dp[n] == -1) {
			dp[n] = (tile1(n - 1) + tile1(n - 2)) % 15746;
		}
		
		return dp[n];
	}
	
	public static int tile2(int n) {
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 15746;
		}
		
		return dp[n];
	}
	
	public static int tile3(int n) {
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		int a = 1;
		int b = 2;
		int result = 0;
		
		for(int i = 3; i <= n; i++) {
			result = (a + b) % 15746;
			a = b;
			b = result;
		}
		
		return result;
	}
}

/*

N = 1
경우의 수: 1 
개수: 1개

N = 2
경우의 수: 11, 00
개수: 2개

N = 3
경우의 수: 111, 100, 001
개수: 3개

N = 4
경우의 수: 1111, 1100, 1001, 0011, 0000
개수: 5개

N = 5
경우의 수: 11111, 11100, 11001, 10011, 00111, 10000, 00001, 00100
개수: 8개

... 개수가 파보나치 수의 수열처럼 증가

Tile(N) = Tile(N-1) + Tile(N-2)

*/
