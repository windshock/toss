package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda23 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            FileBridgeExtension3.IAuthTabCallbackDefault(this.f$0, (deserializeUriNullableCollection) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = FileBridgeExtension3.IAuthTabCallbackDefault(this.f$0, (deserializeUriNullableCollection) obj);
        int i3 = onWarmupCompleted + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }
}
