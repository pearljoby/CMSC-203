import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CryptoManagerTestStudent {

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception { 
    }
// test method to check if the string is in bound 
    @Test
    public void testIsStringInBounds() {
        assertTrue(CryptoManager.isStringInBounds("CRYPTO"));
        assertFalse(CryptoManager.isStringInBounds("Hello123"));
    }
// Test method to to test caesar encryption
    @Test
    public void testCaesarEncryption() {
        assertEquals("URYBEO", CryptoManager.caesarEncryption("HELLO", 13));
        assertEquals("XYZ", CryptoManager.caesarEncryption("ABC", 23));
        assertEquals("FNIJFNW", CryptoManager.caesarEncryption("CRYPTO", 5));
    }
// test method to test bellaso encryptipn 
    @Test
    public void testBellasoEncryption() {
        assertEquals("VJNNC!MX", CryptoManager.bellasoEncryption("HELLO", "KEYWORD"));
        assertEquals("WRJYYQWG!IH", CryptoManager.bellasoEncryption("CRYPTO", "PASS"));
    }
   // Test method to to test caesar decryption

    @Test
    public void testCaesarDecryption() {
        assertEquals("HELLO", CryptoManager.caesarDecryption("URYBEO", 13));
        assertEquals("ABC", CryptoManager.caesarDecryption("XYZ", 23));
        assertEquals("CRYPTO", CryptoManager.caesarDecryption("FNIJFNW", 5));
    }
    // Test method to to test bellaso decryption
    @Test
    public void testBellasoDecryption() {
        assertEquals("HELLO", CryptoManager.bellasoDecryption("VJNNC!MX", "KEYWORD"));
        assertEquals("CRYPTO", CryptoManager.bellasoDecryption("WRJYYQWG!IH", "PASS"));
    }
}