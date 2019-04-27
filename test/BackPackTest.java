

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BackPackTest {
	@Test
	public void testBackPack(){
		int m = 10; // 背包的容量为10
		int n = 3; // 放入物体个数
		//放入的三个物体重量分别为3， 4， 5；价值分别为4， 5， 6
		int w[] = {3,4,5};
		int p[] = {4,5,6};
		int c[][] = BackPack.BackPack_Solution(m,n,w,p);
		for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(c[i][j] + "\t");
                if (j == m) {
                    System.out.println();
                }
            }
        }
		int result[][] = {
			{0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,4,4,4,4,4,4,4,4},
			{0,0,0,4,5,5,5,9,9,9,9},
			{0,0,0,4,5,6,6,9,10,11,11}
		};
		assertArrayEquals(result, c);
	}
}
