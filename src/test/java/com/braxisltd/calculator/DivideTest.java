package com.braxisltd.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DivideTest {

    @Test
    public void shouldDivide() throws Exception {
      assertThat(new Divide().operate(new Value("2"), new Value("2")), is(new Value("1")));
    }
}
