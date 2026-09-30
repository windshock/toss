package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class SPHINCSPlusKeyGenerationParameters extends KeyGenerationParameters {
    private final SPHINCSPlusParameters parameters;

    public SPHINCSPlusKeyGenerationParameters(SecureRandom secureRandom, SPHINCSPlusParameters sPHINCSPlusParameters) {
        super(secureRandom, -1);
        this.parameters = sPHINCSPlusParameters;
    }

    SPHINCSPlusParameters getParameters() {
        return this.parameters;
    }
}
