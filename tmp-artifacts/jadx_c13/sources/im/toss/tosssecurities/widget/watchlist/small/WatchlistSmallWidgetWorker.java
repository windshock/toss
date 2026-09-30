package im.toss.tosssecurities.widget.watchlist.small;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.WorkerParameters;
import im.toss.tosssecurities.widget.watchlist.data.WatchlistWidgetWorker;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DiskLruCacheEntry;
import o.ToggleableAppBarItemExternalSyntheticLambda2;
import o.TooltipKtExternalSyntheticLambda10;
import o.TooltipKtExternalSyntheticLambda3;
import o.Tooltip_androidKtExternalSyntheticLambda0;
import o.TopAppBarStateExternalSyntheticLambda1;
import o.getWrite;
import o.q8ExternalSyntheticLambda4;
import o.r0e;
import o.registerClient;
import o.x_;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WatchlistSmallWidgetWorker extends WatchlistWidgetWorker {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final q8ExternalSyntheticLambda4 IAuthTabCallback;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = onWarmupCompleted + 73;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistSmallWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull DiskLruCacheEntry diskLruCacheEntry, @NotNull x_ x_Var, @NotNull registerClient registerclient) {
        super(context, workerParameters, diskLruCacheEntry, x_Var, registerclient);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(x_Var, "");
        Intrinsics.checkNotNullParameter(registerclient, "");
        this.IAuthTabCallback = q8ExternalSyntheticLambda4.small;
    }

    @Override // im.toss.tosssecurities.widget.watchlist.data.WatchlistWidgetWorker
    public q8ExternalSyntheticLambda4 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda4 = this.IAuthTabCallback;
        int i4 = i3 + 9;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return q8externalsyntheticlambda4;
    }

    @Override // im.toss.tosssecurities.widget.watchlist.data.WatchlistWidgetWorker
    public void onExtraCallback(@NotNull Context context, int i, @NotNull WatchlistWidgetState watchlistWidgetState) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(watchlistWidgetState, "");
            SecuritiesWatchlistSmallAppWidgetReceiver.Companion.onWarmupCompleted(context, i, watchlistWidgetState);
            int i4 = 36 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(watchlistWidgetState, "");
            SecuritiesWatchlistSmallAppWidgetReceiver.Companion.onWarmupCompleted(context, i, watchlistWidgetState);
        }
        int i5 = onExtraCallback + 125;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public static /* synthetic */ boolean onNavigationEvent(onWarmupCompleted onwarmupcompleted, Context context, int i, boolean z, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 109;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            if ((i2 & 4) != 0) {
                int i7 = i5 + 109;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            }
            return onwarmupcompleted.IAuthTabCallback(context, i, z);
        }

        public final void onExtraCallback(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "WATCHLIST_SMALL_");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "WATCHLIST_SMALL_");
            int i3 = onExtraCallback + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }

        public final boolean IAuthTabCallback(@NotNull Context context, int i, boolean z) {
            TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 79;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e r0eVar = r0e.onExtraCallbackWithResult;
            if (!z && r0eVar.IAuthTabCallback(context, "WATCHLIST_SMALL_", i)) {
                return false;
            }
            String str = "WATCHLIST_SMALL_" + i;
            if (z) {
                int i5 = onWarmupCompleted + 87;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda32 = TooltipKtExternalSyntheticLambda3.REPLACE;
                    throw null;
                }
                tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
            } else {
                tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.KEEP;
            }
            Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback2 = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(WatchlistSmallWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
            Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("tag", "WATCHLIST_SMALL_")};
            TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
            for (int i6 = 0; i6 < 2; i6++) {
                Pair pair = pairArr[i6];
                onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
            }
            TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback2.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("WATCHLIST_SMALL_").asBinder());
            return true;
        }

        public final void onNavigationEvent(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "WATCHLIST_SMALL_");
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) SecuritiesWatchlistSmallAppWidgetReceiver.class));
            Intrinsics.checkNotNull(appWidgetIds);
            for (int i2 : appWidgetIds) {
                r0e r0eVar = r0e.onExtraCallbackWithResult;
                String str = "WATCHLIST_SMALL_" + i2;
                TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
                Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback2 = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(WatchlistSmallWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
                Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i2)), getWrite.IAuthTabCallback("tag", "WATCHLIST_SMALL_")};
                TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
                int i3 = onExtraCallback + 19;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 0;
                while (i5 < 2) {
                    int i6 = onWarmupCompleted + 69;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Pair pair = pairArr[i5];
                    onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
                    i5++;
                    int i8 = onExtraCallback + 5;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 3 / 3;
                    }
                }
                TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
                Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
                TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback2.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("WATCHLIST_SMALL_").asBinder());
            }
        }
    }
}
