/**
 * 
 */
package io.console.tictactoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author SyedAtyabHussain
 *
 */
class TicTacToeTest {

    /**
     * Test method for {@link io.console.tictactoe.TicTacToe#subtract(int, int)}.
     */
    @Test
    @DisplayName("Subtract two positive integers")
    void testPositiveSubtract() {
        TicTacToe tttInstance = new TicTacToe();
        assertEquals(2, tttInstance.subtract(5, 3));
        assertEquals(-2, tttInstance.subtract(3, 5));
    }
    
    @Test
    @DisplayName("Subtract two negative integers")
    void testNegativeSubtract() {
        TicTacToe tttInstance = new TicTacToe();
        assertEquals(0, tttInstance.subtract(-1, -1));
    }
    
    @Test
    @DisplayName("Subtract two random integers")
    void testRandomSubtract() {
        TicTacToe tttInstance = new TicTacToe();
        assertEquals(0, tttInstance.subtract(0, 0));
    }
    
    @Test
    @DisplayName("Fetched data from API in the form of HashMap")
    void testGetData() {
        TicTacToe tttInstance = new TicTacToe();
        
        assertNotNull(tttInstance.getData());
        assertEquals(true, tttInstance.getData().containsKey("status"));
        assertEquals(true, tttInstance.getData().containsKey("data"));
    }
}
