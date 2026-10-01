package org.bouncycastle.cms;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface CMSProcessable {
    Object getContent();

    void write(OutputStream outputStream) throws CMSException, IOException;
}
