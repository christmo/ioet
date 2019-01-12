package com.ioet.acme;

import com.ioet.acme.data.Period;
import com.ioet.acme.process.InputProcessor;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputProcessorTest {

    @Test
    public void processLine() {
        String input = "RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00";

        InputProcessor processor = new InputProcessor(input);
        String name = processor.name();
        List<Period> periods = processor.periods();

        assertThat(name).isEqualTo("RENE");
        assertThat(periods.size()).isEqualTo(5);
        assertThat(periods).containsSubsequence(
                new Period("MO10:00-12:00"),
                new Period("TU10:00-12:00"),
                new Period("TH01:00-03:00"),
                new Period("SA14:00-18:00"),
                new Period("SU20:00-21:00")
        );
    }


}
