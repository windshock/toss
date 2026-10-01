package im.toss.components.compose.extensions;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import o.RealImageLoaderKt;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.isInVideoUsage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TrackScreenKt$$ExternalSyntheticLambda5 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Map f$2;
    public final /* synthetic */ Map f$3;

    public /* synthetic */ TrackScreenKt$$ExternalSyntheticLambda5(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, long j, Map map, Map map2) {
        this.f$0 = textFieldScrollKtExternalSyntheticLambda0;
        this.f$1 = j;
        this.f$2 = map;
        this.f$3 = map2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageIAuthTabCallback = RealImageLoaderKt.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, (isInVideoUsage) obj);
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousageIAuthTabCallback;
    }
}
