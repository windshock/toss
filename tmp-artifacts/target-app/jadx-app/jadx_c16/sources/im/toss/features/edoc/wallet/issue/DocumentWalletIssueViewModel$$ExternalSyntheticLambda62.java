package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeIntNullableCollection;
import o.deserializeIp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda62 implements deserializeIntNullableCollection {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipExtraCommand = FileBridgeExtension3.extraCommand(this.f$0, obj);
        int i4 = IAuthTabCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeipExtraCommand;
        }
        throw null;
    }
}
