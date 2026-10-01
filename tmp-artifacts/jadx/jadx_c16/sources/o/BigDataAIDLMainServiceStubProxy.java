package o;

import im.toss.features.main.library.R;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BigDataAIDLMainServiceStubProxy extends BigDataAIDLMainService {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public List<ExtHubPageContext> onExtraCallbackWithResult() {
        int i = 2 % 2;
        List<ExtHubPageContext> listListOf = CollectionsKt.listOf(new ExtHubPageContext(55, BigDataAIDLLiteService.IAuthTabCallback.onWarmupCompleted(), R.string.tab_title_home, (String) null, true, 8, (DefaultConstructorMarker) null));
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return listListOf;
    }
}
