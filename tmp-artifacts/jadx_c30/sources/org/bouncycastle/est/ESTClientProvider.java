package org.bouncycastle.est;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface ESTClientProvider {
    boolean isTrusted();

    ESTClient makeClient() throws ESTException;
}
