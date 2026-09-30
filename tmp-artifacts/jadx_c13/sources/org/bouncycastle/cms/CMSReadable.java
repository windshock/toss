package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes13.dex */
interface CMSReadable {
    InputStream getInputStream() throws CMSException, IOException;
}
