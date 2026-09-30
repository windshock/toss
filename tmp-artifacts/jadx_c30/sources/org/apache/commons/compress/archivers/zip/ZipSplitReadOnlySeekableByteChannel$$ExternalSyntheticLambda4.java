package org.apache.commons.compress.archivers.zip;

import java.nio.channels.SeekableByteChannel;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ List f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f$0.add((SeekableByteChannel) obj);
    }
}
