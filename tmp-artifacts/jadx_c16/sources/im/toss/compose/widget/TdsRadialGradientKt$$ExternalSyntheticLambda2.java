package im.toss.compose.widget;

import kotlin.jvm.functions.Function1;
import o.readFully;
import o.removeTimestamp;
import o.setImageAssetsFolder;
import o.setIso;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsRadialGradientKt$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ removeTimestamp f$0;
    public final /* synthetic */ readFully f$1;
    public final /* synthetic */ float f$2;

    public /* synthetic */ TdsRadialGradientKt$$ExternalSyntheticLambda2(removeTimestamp removetimestamp, readFully readfully, float f) {
        this.f$0 = removetimestamp;
        this.f$1 = readfully;
        this.f$2 = f;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        removeTimestamp removetimestamp = this.f$0;
        if (i3 != 0) {
            return setImageAssetsFolder.onNavigationEvent(removetimestamp, this.f$1, this.f$2, (setIso) obj);
        }
        setImageAssetsFolder.onNavigationEvent(removetimestamp, this.f$1, this.f$2, (setIso) obj);
        throw null;
    }
}
