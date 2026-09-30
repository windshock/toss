package org.bouncycastle.mime;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface MimeMultipartContext extends MimeContext {
    MimeContext createContext(int i) throws IOException;
}
