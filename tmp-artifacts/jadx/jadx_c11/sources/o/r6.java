package o;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r6 extends RemoteViewsService {
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallback = 8;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = onExtraCallback + 37;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(@NotNull Intent intent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        r5ExternalSyntheticLambda1 r5externalsyntheticlambda1 = new r5ExternalSyntheticLambda1(applicationContext, intent);
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return r5externalsyntheticlambda1;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 31;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                return r8lambdaBOV2QNvOs4g5JwR24vJFBV1sIhk.onExtraCallback.onExtraCallback(context, r6.class, i);
            }
            Intrinsics.checkNotNullParameter(context, "");
            r8lambdaBOV2QNvOs4g5JwR24vJFBV1sIhk.onExtraCallback.onExtraCallback(context, r6.class, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onNavigationEvent(@NotNull Context context, int i, @NotNull OverviewMediumWidgetState.Success success) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(success, "");
            SharedPreferences sharedPreferences = context.getSharedPreferences("widget_overview_medium_prefs", 0);
            String strOnWarmupCompleted = wie2.Default.onWarmupCompleted(OverviewMediumWidgetState.Companion.serializer(), success);
            boolean zCommit = sharedPreferences.edit().putString("widget_state_medium_" + i, strOnWarmupCompleted).commit();
            try {
                Result.Companion companion = Result.Companion;
                q8a.onNavigationEvent.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("function", "OverviewMediumListRemoteViewsService.saveState"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("itemCount", Integer.valueOf(success.ICustomTabsCallback().IAuthTabCallbackStub().size())), getWrite.IAuthTabCallback("listItemCount", Integer.valueOf(success.ICustomTabsCallback().asInterface().size())), getWrite.IAuthTabCallback("success", Boolean.valueOf(zCommit))}));
                Result.constructor-impl(Unit.INSTANCE);
                int i3 = IAuthTabCallback + 41;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
            }
        }

        public final void onExtraCallback(@NotNull Context context, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            context.getSharedPreferences("widget_overview_medium_prefs", 0).edit().remove("widget_state_medium_" + i).apply();
            try {
                Result.Companion companion = Result.Companion;
                q8a.onNavigationEvent.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("function", "OverviewMediumListRemoteViewsService.clearState"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i))}));
                Result.constructor-impl(Unit.INSTANCE);
                int i3 = IAuthTabCallback + 77;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }
}
