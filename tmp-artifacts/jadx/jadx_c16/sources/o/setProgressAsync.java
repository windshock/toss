package o;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import im.toss.base.R$id;
import im.toss.base.R$layout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setProgressAsync {
    private static int IAuthTabCallback = 0;
    public static final setProgressAsync onExtraCallback = new setProgressAsync();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 61;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private setProgressAsync() {
    }

    public final boolean onExtraCallback(@NotNull Context context, @NotNull Class<?> cls) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cls, "");
        boolean zIAuthTabCallback = IAuthTabCallback(context, new ComponentName(context, cls));
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return zIAuthTabCallback;
    }

    public final boolean IAuthTabCallback(@NotNull Context context, @NotNull ComponentName componentName) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(componentName, "");
            onExtraCallback(context).contains(componentName);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(componentName, "");
        boolean zContains = onExtraCallback(context).contains(componentName);
        int i3 = onWarmupCompleted + 47;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zContains;
        }
        obj.hashCode();
        throw null;
    }

    private final List<ComponentName> onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List<ComponentName> listOnWarmupCompleted = ((isUsed) Response.onExtraCallback(context, isUsed.class)).IAuthTabCallbackStubProxy().onWarmupCompleted(context);
        int i4 = IAuthTabCallback + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return listOnWarmupCompleted;
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (iArr.length != 0) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.base_widget_unsupported_region);
            remoteViews.setOnClickPendingIntent(R$id.unsupported_widget_root, IAuthTabCallback(context));
            appWidgetManager.updateAppWidget(iArr, remoteViews);
        } else {
            int i4 = IAuthTabCallback + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private final PendingIntent IAuthTabCallback(Context context) {
        int i = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) zzaj.onNavigationEvent().extraCommand());
        intent.addFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return activity;
    }
}
