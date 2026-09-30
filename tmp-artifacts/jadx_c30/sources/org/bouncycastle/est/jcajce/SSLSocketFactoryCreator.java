package org.bouncycastle.est.jcajce;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface SSLSocketFactoryCreator {
    SSLSocketFactory createFactory() throws Exception;

    boolean isTrusted();
}
