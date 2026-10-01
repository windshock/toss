package im.toss.features.mobileid.impl.glance;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import kotlin.jvm.internal.Intrinsics;
import o.LazyListStateExternalSyntheticLambda0;
import o.config;
import o.toJSONBytesWithFastJsonConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MobileIdAppWidgetReceiver extends config {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    public static final int onNavigationEvent = GlanceAppWidgetReceiver.onWarmupCompleted | LazyListStateExternalSyntheticLambda0.onWarmupCompleted;
    private static int onTransact;
    private final LazyListStateExternalSyntheticLambda0 onExtraCallbackWithResult = new toJSONBytesWithFastJsonConfig();

    static {
        int i = IAuthTabCallback + 81;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public LazyListStateExternalSyntheticLambda0 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 107;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        LazyListStateExternalSyntheticLambda0 lazyListStateExternalSyntheticLambda0 = this.onExtraCallbackWithResult;
        int i5 = i2 + 29;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return lazyListStateExternalSyntheticLambda0;
    }

    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(appWidgetManager, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            super.onUpdate(context, appWidgetManager, iArr);
            return;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onUpdate(context, appWidgetManager, iArr);
        throw null;
    }

    public void onDeleted(@NotNull Context context, @NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onDeleted(context, iArr);
        int i4 = onTransact + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.config
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
