package com.ioet.acme;

import com.ioet.acme.branding.ACMEBranding;
import com.ioet.acme.branding.Branding;
import com.ioet.acme.process.CasesFile;

import java.io.File;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        File file = getFile(args);

        Branding branding = new ACMEBranding();
        branding.banner();
        branding.source(file);
        branding.printCases(new CasesFile(file));
    }

    private static File getFile(String[] args) {
        File file;
        if (args.length == 1) {
            file = new File(args[0]);
        } else {
            ClassLoader classLoader = Main.class.getClassLoader();
            file = new File(Objects.requireNonNull(classLoader.getResource("test-file.txt")).getFile());
        }
        return file;
    }

}
