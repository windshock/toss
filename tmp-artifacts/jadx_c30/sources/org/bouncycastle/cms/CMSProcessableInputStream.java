package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.io.Streams;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class CMSProcessableInputStream implements CMSProcessable, CMSReadable {
    private InputStream input;
    private boolean used = false;

    public CMSProcessableInputStream(InputStream inputStream) {
        this.input = inputStream;
    }

    private void checkSingleUsage() {
        synchronized (this) {
            if (this.used) {
                throw new IllegalStateException("CMSProcessableInputStream can only be used once");
            }
            this.used = true;
        }
    }

    public Object getContent() {
        return getInputStream();
    }

    public InputStream getInputStream() {
        checkSingleUsage();
        return this.input;
    }

    public void write(OutputStream outputStream) throws CMSException, IOException {
        checkSingleUsage();
        Streams.pipeAll(this.input, outputStream);
        this.input.close();
    }
}
