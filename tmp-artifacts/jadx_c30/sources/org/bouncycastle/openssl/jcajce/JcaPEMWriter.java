package org.bouncycastle.openssl.jcajce;

import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.openssl.PEMEncryptor;
import org.bouncycastle.util.io.pem.PemGenerationException;
import org.bouncycastle.util.io.pem.PemObjectGenerator;
import org.bouncycastle.util.io.pem.PemWriter;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JcaPEMWriter extends PemWriter {
    public JcaPEMWriter(Writer writer) {
        super(writer);
    }

    public void writeObject(Object obj) throws PemGenerationException, IOException {
        writeObject(obj, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.io.pem.PemGenerationException */
    public void writeObject(Object obj, PEMEncryptor pEMEncryptor) throws PemGenerationException, IOException {
        try {
            super.writeObject(new JcaMiscPEMGenerator(obj, pEMEncryptor));
        } catch (PemGenerationException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    public void writeObject(PemObjectGenerator pemObjectGenerator) throws IOException {
        super.writeObject(pemObjectGenerator);
    }
}
