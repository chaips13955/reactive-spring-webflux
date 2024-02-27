import spock.lang.Specification

import static org.junit.Assert.assertTrue;

class TestTestController extends   Specification {

    //todo:  simple test for groovy configuration
    def "Test the testController"()
    {
         given:
        int first = 2;
        int second = 4;

        when:
        int result = 2 + 2;

        then:
        assertTrue(result == 4)
    }

}
