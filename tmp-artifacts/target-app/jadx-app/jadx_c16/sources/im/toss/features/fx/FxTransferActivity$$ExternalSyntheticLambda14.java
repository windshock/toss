package im.toss.features.fx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BrickModuleImplExternalSyntheticLambda3;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda14 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ BrickModuleImplExternalSyntheticLambda3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            FxTransferActivity.onExtraCallback(this.f$0, (deserializeUriNullableCollection) obj);
            throw null;
        }
        Unit unitOnExtraCallback = FxTransferActivity.onExtraCallback(this.f$0, (deserializeUriNullableCollection) obj);
        int i3 = onExtraCallback + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
