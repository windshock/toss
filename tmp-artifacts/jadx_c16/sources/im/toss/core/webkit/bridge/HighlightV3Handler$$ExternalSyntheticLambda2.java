package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getAppDataMetadata;
import o.getFaceBitmapToByteArray;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HighlightV3Handler$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getAppDataMetadata f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = getFaceBitmapToByteArray.onNavigationEvent(this.f$0, (startRunning) obj);
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
