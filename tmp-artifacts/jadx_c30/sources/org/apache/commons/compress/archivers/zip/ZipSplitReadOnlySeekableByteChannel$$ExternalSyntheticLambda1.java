package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ List f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f$0.add(((File) obj).toPath());
    }
}
