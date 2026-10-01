package org.bouncycastle.operator;

import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface AADProcessor {
    OutputStream getAADStream();

    byte[] getMAC();
}
