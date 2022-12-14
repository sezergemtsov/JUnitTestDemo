import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MainTest {
    @Test
    public void binaryTreeTest() {
        //arrange
        final int[] exampleArr = {10, 11, 12};
        final int[][] expectedArr = {{0, 11, 0}, {10, 0, 12}};
        //act
        int[][] test = Main.binaryTree(exampleArr);
        //assert
        assertThat(test, equalTo(expectedArr));
    }

    @Test
    public void markTest() {
        //arrange
        final int[] exampleArr = {10, 11, 12};
        final int[][] modifiedArr = new int[2][3];
        final int[][] expectedArr = {{0, 11, 0}, {10, 0, 12}};
        //act
        int[][] result = Main.mark(exampleArr, modifiedArr, 0, 2, 0, 2);
        //assert
        assertThat(exampleArr, equalTo(result));
    }

    @Test
    public void printArr() {
        //arrange
        final int[][] exampleArr = {{0, 11, 0}, {10, 0, 12}};
        final String expectedResult = "  11  \n10  12";
        //act
        String result = Main.printArr(exampleArr);
        //assert
        assertThat(expectedResult, equalToIgnoringWhiteSpace(expectedResult));

        assertThat(result, startsWith(" "));
        assertThat(result, allOf(containsString("11"), containsString("\n"), endsWith("12")));
        assertThat(result, not(endsWith(" ")));

    }

}
