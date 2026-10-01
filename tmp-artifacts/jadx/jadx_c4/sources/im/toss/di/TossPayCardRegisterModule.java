package im.toss.di;

import android.content.Context;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp;
import o.GriverLocalAuthDialogExtension;
import o.GriverManifest27;
import o.GriverManifest28;
import o.clearNestedRecyclerViewIfNotNested;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossPayCardRegisterModule {
    private static int IAuthTabCallback = 0;
    public static final TossPayCardRegisterModule onExtraCallback = new TossPayCardRegisterModule();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 77;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
        }
    }

    private TossPayCardRegisterModule() {
    }

    public final clearNestedRecyclerViewIfNotNested onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        clearNestedRecyclerViewIfNotNested clearnestedrecyclerviewifnotnested = new clearNestedRecyclerViewIfNotNested(context);
        clearnestedrecyclerviewifnotnested.onNavigationEvent("");
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return clearnestedrecyclerviewifnotnested;
    }

    @Singleton
    public final GriverLocalAuthDialogExtension onNavigationEvent(@NotNull GeckoHubImp geckoHubImp, @NotNull GriverManifest27 griverManifest27, @NotNull clearNestedRecyclerViewIfNotNested clearnestedrecyclerviewifnotnested) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(geckoHubImp, "");
        Intrinsics.checkNotNullParameter(griverManifest27, "");
        Intrinsics.checkNotNullParameter(clearnestedrecyclerviewifnotnested, "");
        GriverManifest28 griverManifest28 = new GriverManifest28(geckoHubImp, griverManifest27, clearnestedrecyclerviewifnotnested);
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return griverManifest28;
    }
}
