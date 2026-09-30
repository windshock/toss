package org.bouncycastle.crypto.generators;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class X448KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        X448PrivateKeyParameters x448PrivateKeyParameters = new X448PrivateKeyParameters(this.random);
        return new AsymmetricCipherKeyPair(x448PrivateKeyParameters.generatePublicKey(), x448PrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
    }
}
