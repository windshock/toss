package org.ejbca.cvc.example;

import java.io.File;
import org.ejbca.cvc.CertificateParser;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class Parse {
    private Parse() {
    }

    public static void main(String[] strArr) {
        try {
            System.out.println(CertificateParser.parseCVCObject(FileHelper.loadFile(new File("C:/cv_certs/mycert1.cvcert"))).getAsText());
        } catch (Exception unused) {
        }
    }
}
