package im.toss.features.edoc.wallet;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.NativeExceptionsManagerSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletWebActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ DocumentWalletWebActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = DocumentWalletWebActivity.onExtraCallback(this.f$0, (NativeExceptionsManagerSpec) obj);
        int i4 = IAuthTabCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
