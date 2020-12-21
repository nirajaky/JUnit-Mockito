package com.nirajaky;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    Calculator c = null;

//    CaluclatorService service = new CaluclatorService() {
//        @Override
//        public int add(int i, int j) {
//            return 0;
//        }
//    };

    // *********************MOCKITO**************************
            //============================
    //    CaluclatorService service = mock(CaluclatorService.class);

    //     OR
    @Mock
    CaluclatorService service;
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

            //============================

    @Before
    public void setup(){
        c = new Calculator(service);
        c.c = 0;
    }
    @Test
    public void testAdd()
    {
        //hardcoding the dependency Object
        when(service.add(2,3)).thenReturn(5);
        // Just if onlu JUint is required
        assertEquals(10, c.perform(2,3));

        // to verify that dependency of api service is used or not :
        // Note: It just check the Stub(fake) Object that we created through Mockito is used or not
        verify(service).add(2,3);
    }
}
