package im.toss.features.edoc.wallet.issue;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import o.FileBridgeExtension3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda14 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Ref.IntRef f$0;
    public final /* synthetic */ int[] f$1;
    public final /* synthetic */ List f$2;

    public /* synthetic */ DocumentWalletIssueViewModel$$ExternalSyntheticLambda14(Ref.IntRef intRef, int[] iArr, List list) {
        this.f$0 = intRef;
        this.f$1 = iArr;
        this.f$2 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Ref.IntRef intRef = this.f$0;
        if (i3 == 0) {
            return FileBridgeExtension3.IAuthTabCallback(intRef, this.f$1, this.f$2, ((Integer) obj).intValue(), (List) obj2);
        }
        FileBridgeExtension3.IAuthTabCallback(intRef, this.f$1, this.f$2, ((Integer) obj).intValue(), (List) obj2);
        throw null;
    }
}
