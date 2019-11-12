import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void add() {
        PerSon s1 = new PerSon("hung");
        assertEquals("Hello hung", s1.hello());
        assertEquals("Hello hai", s1.hello("hai"));
    }

}
