package com.ioet.acme;

import com.ioet.acme.process.CasesFile;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class MainTest {

    private File file;

    @Before
    public void setUp() {
        ClassLoader classLoader = getClass().getClassLoader();
        file = new File(Objects.requireNonNull(classLoader.getResource("test-file.txt")).getFile());
        System.out.println(file.getAbsolutePath());
    }

    @Test
    public void readFile() {
        CasesFile casesFile = new CasesFile(file);
        List<String> rows = casesFile.read();

        Assertions.assertThat(rows).isNotEmpty();
        Assertions.assertThat(rows.size()).isEqualTo(7);
    }

    @Test
    public void casesLines() {
        CasesFile casesFile = new CasesFile(file);
        List<String> cases = casesFile.cases();

        Assertions.assertThat(cases.size()).isEqualTo(2);
    }

}
