package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface StagedAgreement extends BasicAgreement {
    AsymmetricKeyParameter calculateStage(CipherParameters cipherParameters);
}
