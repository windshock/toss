package im.toss.core.webkit;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda3 implements deserializeFloat {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setBackgroundAlpha.onExtraCallback(this.f$0, obj);
        int i4 = onExtraCallback + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
