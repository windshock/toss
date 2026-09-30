package im.toss.features.edoc;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import o.getLegacyJavaModule;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EDocHomeTabActivity$onWarmupCompleted extends getLegacyJavaModule {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    final /* synthetic */ EDocHomeTabActivity onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDocHomeTabActivity$onWarmupCompleted(@NotNull EDocHomeTabActivity eDocHomeTabActivity, LinearLayoutManager linearLayoutManager) {
        super(linearLayoutManager);
        Intrinsics.checkNotNullParameter(linearLayoutManager, "");
        this.onWarmupCompleted = eDocHomeTabActivity;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            EDocHomeTabActivity.IAuthTabCallbackStubProxy(this.onWarmupCompleted).ICustomTabsCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EDocHomeTabActivity.IAuthTabCallbackStubProxy(this.onWarmupCompleted).ICustomTabsCallback();
        int i3 = onNavigationEvent + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
