package com.ioet.acme.process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CasesFile {

    private final File file;

    public CasesFile(String path) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.file = new File(Objects.requireNonNull(classLoader.getResource(path)).getFile());
    }

    public CasesFile(File file) {
        this.file = file;
    }

    public List<String> read() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            String msg = String.format("Error Reading the file: %s\nError: %s", file.getAbsolutePath(), e.getMessage());
            System.err.println(msg);
        }

        return Collections.emptyList();
    }

    public List<String> cases() {
        String regex = "[A-Za-z]*=([A-Z]{2}\\d{2}:\\d{2}-\\d{2}:\\d{2},?)*";
        return read().stream()
                .filter(row -> row.matches(regex))
                .collect(Collectors.toList());
    }
}
