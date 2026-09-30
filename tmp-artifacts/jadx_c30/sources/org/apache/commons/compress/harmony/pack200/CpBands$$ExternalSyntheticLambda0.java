package org.apache.commons.compress.harmony.pack200;

import java.util.function.Consumer;
import o.PAGErrorCode;
import o.PAGLoadListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CpBands$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ PAGLoadListener f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        PAGLoadListener.onExtraCallbackWithResult(this.f$0, (PAGErrorCode) obj);
    }
}
