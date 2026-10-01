package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda43 implements deserializeIntNullableCollection {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            FileBridgeExtension3.ICustomTabsCallbackStubProxy(this.f$0, obj);
            throw null;
        }
        Boolean boolICustomTabsCallbackStubProxy = FileBridgeExtension3.ICustomTabsCallbackStubProxy(this.f$0, obj);
        int i3 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return boolICustomTabsCallbackStubProxy;
        }
        obj2.hashCode();
        throw null;
    }
}
