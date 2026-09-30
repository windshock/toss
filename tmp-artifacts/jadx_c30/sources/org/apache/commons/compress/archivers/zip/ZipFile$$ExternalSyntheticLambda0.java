package org.apache.commons.compress.archivers.zip;

import java.util.function.Consumer;
import java.util.function.Function;
import o.TTWebsiteActivity2;
import o.dj15;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ZipFile$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ dj15 f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        TTWebsiteActivity2 tTWebsiteActivity2 = (TTWebsiteActivity2) obj;
        this.f$0.asBinder.computeIfAbsent(tTWebsiteActivity2.getName(), new Function() { // from class: org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return dj15.onExtraCallbackWithResult((String) obj2);
            }
        }).addLast(tTWebsiteActivity2);
    }
}
