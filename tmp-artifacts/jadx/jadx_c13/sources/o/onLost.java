package o;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtil;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtilKt;
import im.toss.securities.widget.watchlist.R;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class onLost {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    public static final onLost onExtraCallbackWithResult = new onLost();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 75;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i5) | i7)) | i9;
        int i11 = (~(i5 | i7)) | i9;
        int i12 = ~(i8 | i6);
        int i13 = i6 + i2 + i + (104229478 * i3) + ((-1414784667) * i4);
        int i14 = i13 * i13;
        int i15 = ((i6 * (-393484327)) - 513802240) + ((-393484327) * i2) + (i10 * 23337000) + (i11 * 23337000) + (23337000 * i12) + ((-370147328) * i) + ((-1784676352) * i3) + ((-1146093568) * i4) + ((-1043988480) * i14);
        int i16 = ((i6 * 256725217) - 1927268364) + (i2 * 256725217) + (i10 * 872) + (i11 * 872) + (i12 * 872) + (i * 256726089) + (i3 * (-1692676330)) + (i4 * (-87465523)) + (i14 * 964034560);
        return i15 + ((i16 * i16) * (-1055260672)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    private onLost() {
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final Map<String, Bitmap> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onWarmupCompleted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 115;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                return Intrinsics.areEqual(this.onWarmupCompleted, ((onWarmupCompleted) obj).onWarmupCompleted);
            }
            int i4 = onExtraCallback + 97;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 125;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 88 / 0;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = this.onWarmupCompleted.hashCode();
                int i3 = 38 / 0;
            } else {
                iHashCode = this.onWarmupCompleted.hashCode();
            }
            int i4 = onExtraCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ChartCache(chartBitmaps=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull Map<String, Bitmap> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.onWarmupCompleted = map;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 101;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                map = access8000.IAuthTabCallback();
                int i4 = onNavigationEvent + 111;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            this(map);
        }

        public final Map<String, Bitmap> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Map<String, Bitmap> map = this.onWarmupCompleted;
            int i4 = i3 + 95;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return map;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static abstract class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final boolean onNavigationEvent;

        public /* synthetic */ onNavigationEvent(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private onNavigationEvent(boolean z) {
            this.onNavigationEvent = z;
        }

        public boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 91;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            boolean z = this.onNavigationEvent;
            int i4 = i2 + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        /* renamed from: o.onLost$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0038onNavigationEvent extends onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            public static final C0038onNavigationEvent onNavigationEvent = new C0038onNavigationEvent();
            private static int onWarmupCompleted = 1;

            static {
                int i = onWarmupCompleted + 101;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 35 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 13;
                    onExtraCallback = i5 % 128;
                    return i5 % 2 != 0;
                }
                if (obj instanceof C0038onNavigationEvent) {
                    int i6 = i3 + 31;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
                int i8 = i3 + 21;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i3 + 75;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 21;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 1;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return 1533306751;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return "GeneralError";
                }
                throw null;
            }

            private C0038onNavigationEvent() {
                super(true, null);
            }
        }

        public static final class onExtraCallback extends onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

            static {
                int i = onExtraCallback + 109;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 1;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                if (this == obj || (obj instanceof onExtraCallback)) {
                    return true;
                }
                int i5 = i3 + 119;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return 28963321;
                }
                int i3 = 3 / 0;
                return 28963321;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 17;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = i2 + 89;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return "NetworkError";
                }
                throw null;
            }

            private onExtraCallback() {
                super(true, null);
            }
        }

        public static final class IAuthTabCallback extends onNavigationEvent {
            private static int IAuthTabCallback = 1;
            public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 21;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 77;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof IAuthTabCallback) {
                    return true;
                }
                int i4 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 25;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 31;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return -2035316300;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 17;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return "Maintenance";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallback() {
                super(false, null);
            }
        }

        public static final class onWarmupCompleted extends onNavigationEvent {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private final Long onExtraCallback;
            private final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg onWarmupCompleted;

            /* JADX WARN: Illegal instructions before constructor call */
            public onWarmupCompleted() {
                r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = null;
                this(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, 3, r8lambdabrizzqzhaizmdvstl2yymmz7zsg);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 113;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i4 + 31;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 14 / 0;
                    }
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    int i8 = i2 + 17;
                    onExtraCallbackWithResult = i8 % 128;
                    return i8 % 2 != 0;
                }
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
                if (this.onWarmupCompleted != onwarmupcompleted.onWarmupCompleted) {
                    int i9 = i4 + 77;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback)) {
                    return true;
                }
                int i11 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i11 % 128;
                return i11 % 2 != 0;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 17;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = this.onWarmupCompleted;
                if (r8lambdabrizzqzhaizmdvstl2yymmz7zsg == null) {
                    int i5 = i3 + 37;
                    onExtraCallbackWithResult = i5 % 128;
                    iHashCode = i5 % 2 != 0 ? 1 : 0;
                    int i6 = i3 + 97;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    iHashCode = r8lambdabrizzqzhaizmdvstl2yymmz7zsg.hashCode();
                }
                Long l = this.onExtraCallback;
                return (iHashCode * 31) + (l != null ? l.hashCode() : 0);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Empty(watchlistType=" + this.onWarmupCompleted + ", watchlistId=" + this.onExtraCallback + ")";
                int i2 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onWarmupCompleted(@Nullable r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, @Nullable Long l) {
                super(false, null);
                this.onWarmupCompleted = r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
                this.onExtraCallback = l;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onWarmupCompleted(r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onNavigationEvent + 79;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    r8lambdabrizzqzhaizmdvstl2yymmz7zsg = null;
                }
                if ((i & 2) != 0) {
                    int i5 = onNavigationEvent + 71;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    l = null;
                }
                this(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, l);
            }

            public final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 79;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = this.onWarmupCompleted;
                int i5 = i2 + 31;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
            }

            public final Long onWarmupCompleted() {
                Long l;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 5;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    l = this.onExtraCallback;
                    int i4 = 90 / 0;
                } else {
                    l = this.onExtraCallback;
                }
                int i5 = i2 + 55;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return l;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteViews IAuthTabCallback(onLost onlost, Context context, int i, WatchlistWidgetState watchlistWidgetState, boolean z, onWarmupCompleted onwarmupcompleted, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            onwarmupcompleted = new onWarmupCompleted(null, 1, 0 == true ? 1 : 0);
        }
        RemoteViews remoteViewsOnExtraCallbackWithResult = onlost.onExtraCallbackWithResult(context, i, watchlistWidgetState, z2, onwarmupcompleted);
        int i6 = IAuthTabCallback + 11;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return remoteViewsOnExtraCallbackWithResult;
    }

    public final RemoteViews onExtraCallbackWithResult(@NotNull Context context, int i, @NotNull WatchlistWidgetState watchlistWidgetState, boolean z, @NotNull onWarmupCompleted onwarmupcompleted) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(watchlistWidgetState, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        q8a.onNavigationEvent.IAuthTabCallback(i);
        if (watchlistWidgetState instanceof WatchlistWidgetState.ProductSuccess) {
            return onWarmupCompleted(context, i, (WatchlistWidgetState.ProductSuccess) watchlistWidgetState, z, onwarmupcompleted);
        }
        if (watchlistWidgetState instanceof WatchlistWidgetState.IndexSuccess) {
            int i5 = onWarmupCompleted + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return (RemoteViews) onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, context, Integer.valueOf(i), (WatchlistWidgetState.IndexSuccess) watchlistWidgetState, Boolean.valueOf(z), onwarmupcompleted}, -1759471870, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1759471871);
        }
        if (watchlistWidgetState instanceof WatchlistWidgetState.Loading) {
            int i7 = onWarmupCompleted + 95;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            RemoteViews remoteViewsOnExtraCallbackWithResult = onExtraCallbackWithResult(context, i, watchlistWidgetState, z);
            int i9 = onWarmupCompleted + 75;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return remoteViewsOnExtraCallbackWithResult;
        }
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = null;
        if (watchlistWidgetState instanceof WatchlistWidgetState.Error) {
            int i11 = IAuthTabCallback + 21;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                return (RemoteViews) onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, context, Integer.valueOf(i), watchlistWidgetState, Boolean.valueOf(z), onNavigationEvent.C0038onNavigationEvent.onNavigationEvent}, 6852895, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -6852895);
            }
            throw null;
        }
        if (watchlistWidgetState instanceof WatchlistWidgetState.NetworkError) {
            return (RemoteViews) onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, context, Integer.valueOf(i), watchlistWidgetState, Boolean.valueOf(z), onNavigationEvent.onExtraCallback.onWarmupCompleted}, 6852895, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -6852895);
        }
        if (watchlistWidgetState instanceof WatchlistWidgetState.NotLoggedInError) {
            return (RemoteViews) onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, context, Integer.valueOf(i), watchlistWidgetState, Boolean.valueOf(z), new onNavigationEvent.onWarmupCompleted(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, 3, r8lambdabrizzqzhaizmdvstl2yymmz7zsg)}, 6852895, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -6852895);
        }
        if (!(watchlistWidgetState instanceof WatchlistWidgetState.Maintenance)) {
            if (watchlistWidgetState instanceof WatchlistWidgetState.SettingInProgress) {
                return onExtraCallbackWithResult(context, i, watchlistWidgetState, z);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i12 = IAuthTabCallback + 29;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return (RemoteViews) onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, context, Integer.valueOf(i), watchlistWidgetState, Boolean.valueOf(z), onNavigationEvent.IAuthTabCallback.onExtraCallback}, 6852895, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -6852895);
    }

    private final RemoteViews onWarmupCompleted(Context context, int i, WatchlistWidgetState.ProductSuccess productSuccess, boolean z, onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            ((List) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1766261298, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{productSuccess}, iOnExtraCallback2, iOnExtraCallback, -1766261296)).isEmpty();
            throw null;
        }
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (((List) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1766261298, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{productSuccess}, iOnExtraCallback4, iOnExtraCallback3, -1766261296)).isEmpty()) {
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess000 = productSuccess.access000();
            int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (RemoteViews) onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, context, Integer.valueOf(i), productSuccess, Boolean.valueOf(z), new onNavigationEvent.onWarmupCompleted(r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess000, (Long) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1744908740, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{productSuccess}, iOnExtraCallback6, iOnExtraCallback5, -1744908739))}, 6852895, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -6852895);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_watchlist_medium_main);
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        int i4 = R.id.widget_root;
        RemoteViewsThemeUtil.onExtraCallbackWithResult(remoteViewsThemeUtil, remoteViews, context, i4, productSuccess.onNavigationEvent(), productSuccess.onExtraCallbackWithResult(), 0, 0, 0, BERTags.FLAGS, (Object) null);
        remoteViewsThemeUtil.onExtraCallbackWithResult(remoteViews, R.id.bottom_gradient, productSuccess.onNavigationEvent(), productSuccess.onExtraCallbackWithResult());
        float f = context.getResources().getConfiguration().fontScale;
        int i5 = R.id.title;
        remoteViews.setTextViewText(i5, productSuccess.asInterface());
        remoteViews.setTextViewTextSize(i5, 1, r1.onExtraCallback(13.0f, f, 0.0f, 2, (Object) null));
        charset charsetVar = charset.onExtraCallbackWithResult;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        remoteViews.setTextColor(i5, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar}), context, productSuccess.onNavigationEvent(), (Float) null, 4, (Object) null)));
        int i6 = R.id.timestamp;
        remoteViews.setTextViewText(i6, productSuccess.IAuthTabCallbackStub());
        remoteViews.setTextViewTextSize(i6, 1, r1.onExtraCallback(context, R.dimen.watchlist_medium_timestamp_text_size));
        remoteViews.setTextColor(i6, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar.prefetch().IAuthTabCallback(), charsetVar.postMessage().onExtraCallbackWithResult()), context, productSuccess.onNavigationEvent(), (Float) null, 4, (Object) null)));
        int i7 = R.id.refresh_icon;
        remoteViews.setImageViewResource(i7, im.toss.securities.widget.common.R.drawable.icon_system_refresh_outlined);
        DisplaySetting displaySettingOnNavigationEvent = productSuccess.onNavigationEvent();
        r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
        remoteViewsThemeUtil.onNavigationEvent(remoteViews, context, displaySettingOnNavigationEvent, r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), new int[]{i7});
        int i8 = R.id.setting_icon;
        remoteViews.setImageViewResource(i8, im.toss.securities.widget.common.R.drawable.icon_system_setting_outlined);
        remoteViewsThemeUtil.onNavigationEvent(remoteViews, context, productSuccess.onNavigationEvent(), r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), new int[]{i8});
        if (!z) {
            int i9 = onWarmupCompleted + 93;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0 ? Build.VERSION.SDK_INT >= 31 : Build.VERSION.SDK_INT >= 95) {
                int iOnExtraCallback7 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback8 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                remoteViews.setRemoteAdapter(R.id.item_container, rC_(context, i, (List) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1766261298, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{productSuccess}, iOnExtraCallback8, iOnExtraCallback7, -1766261296), productSuccess.access000(), productSuccess.onNavigationEvent(), onwarmupcompleted));
            } else {
                remoteViews.setRemoteAdapter(R.id.item_container, r8lambdaBOV2QNvOs4g5JwR24vJFBV1sIhk.onExtraCallback.onExtraCallback(context, AFi1zSDK.class, i));
            }
            int i10 = R.id.item_container;
            AFi1vSDK aFi1vSDK = AFi1vSDK.onWarmupCompleted;
            remoteViews.setPendingIntentTemplate(i10, aFi1vSDK.IAuthTabCallback(context, i));
            int iOnExtraCallback9 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback10 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            remoteViews.setOnClickPendingIntent(i4, aFi1vSDK.onWarmupCompleted(context, i, (Long) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1744908740, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{productSuccess}, iOnExtraCallback10, iOnExtraCallback9, -1744908739)));
            remoteViews.setOnClickPendingIntent(R.id.refresh_button, aFi1vSDK.onExtraCallbackWithResult(context, i));
            remoteViews.setOnClickPendingIntent(R.id.setting_button, aFi1vSDK.onExtraCallback(context, i));
        }
        int iOnExtraCallback11 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback12 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        for (WatchlistWidgetState.RowItem rowItem : (List) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1766261298, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{productSuccess}, iOnExtraCallback12, iOnExtraCallback11, -1766261296)) {
            q8a q8aVar = q8a.onNavigationEvent;
            String strOnTransact = rowItem.onTransact();
            int iOnExtraCallback13 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            q8aVar.onExtraCallback(i, strOnTransact + ((String) WatchlistWidgetState.RowItem.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1235089590, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{rowItem}, iOnExtraCallback13, -1235089589)) + rowItem.access100());
            int i11 = IAuthTabCallback + 23;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
        }
        return remoteViews;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        RemoteViews remoteViews;
        int i;
        onLost onlost = (onLost) objArr[0];
        Context context = (Context) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 3;
        WatchlistWidgetState.IndexSuccess indexSuccess = (WatchlistWidgetState.IndexSuccess) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[5];
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = null;
        if (indexSuccess.asInterface().isEmpty()) {
            return (RemoteViews) onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{onlost, context, Integer.valueOf(iIntValue), indexSuccess, Boolean.valueOf(zBooleanValue), new onNavigationEvent.onWarmupCompleted(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, i2, r8lambdabrizzqzhaizmdvstl2yymmz7zsg)}, 6852895, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -6852895);
        }
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_watchlist_medium_main);
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        int i6 = R.id.widget_root;
        RemoteViewsThemeUtil.onExtraCallbackWithResult(remoteViewsThemeUtil, remoteViews2, context, i6, indexSuccess.onNavigationEvent(), indexSuccess.onExtraCallbackWithResult(), 0, 0, 0, BERTags.FLAGS, (Object) null);
        remoteViewsThemeUtil.onExtraCallbackWithResult(remoteViews2, R.id.bottom_gradient, indexSuccess.onNavigationEvent(), indexSuccess.onExtraCallbackWithResult());
        float f = context.getResources().getConfiguration().fontScale;
        int i7 = R.id.title;
        remoteViews2.setTextViewText(i7, indexSuccess.IAuthTabCallbackDefault());
        remoteViews2.setTextViewTextSize(i7, 1, r1.onExtraCallback(13.0f, f, 0.0f, 2, (Object) null));
        charset charsetVar = charset.onExtraCallbackWithResult;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        remoteViews2.setTextColor(i7, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar}), context, indexSuccess.onNavigationEvent(), (Float) null, 4, (Object) null)));
        int i8 = R.id.timestamp;
        remoteViews2.setTextViewText(i8, (String) WatchlistWidgetState.IndexSuccess.onWarmupCompleted(new Object[]{indexSuccess}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -802450113, 802450114, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()));
        remoteViews2.setTextViewTextSize(i8, 1, r1.onExtraCallback(context, R.dimen.watchlist_medium_timestamp_text_size));
        remoteViews2.setTextColor(i8, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar.prefetch().IAuthTabCallback(), charsetVar.postMessage().onExtraCallbackWithResult()), context, indexSuccess.onNavigationEvent(), (Float) null, 4, (Object) null)));
        int i9 = R.id.refresh_icon;
        remoteViews2.setImageViewResource(i9, im.toss.securities.widget.common.R.drawable.icon_system_refresh_outlined);
        DisplaySetting displaySettingOnNavigationEvent = indexSuccess.onNavigationEvent();
        r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
        remoteViewsThemeUtil.onNavigationEvent(remoteViews2, context, displaySettingOnNavigationEvent, r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), new int[]{i9});
        int i10 = R.id.setting_icon;
        remoteViews2.setImageViewResource(i10, im.toss.securities.widget.common.R.drawable.icon_system_setting_outlined);
        remoteViewsThemeUtil.onNavigationEvent(remoteViews2, context, indexSuccess.onNavigationEvent(), r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), new int[]{i10});
        if (zBooleanValue) {
            remoteViews = remoteViews2;
            i = iIntValue;
        } else {
            int i11 = onWarmupCompleted + 99;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0 ? Build.VERSION.SDK_INT >= 31 : Build.VERSION.SDK_INT >= 18) {
                remoteViews = remoteViews2;
                remoteViews.setRemoteAdapter(R.id.item_container, onlost.rC_(context, iIntValue, indexSuccess.asInterface(), r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.INDEX, indexSuccess.onNavigationEvent(), onwarmupcompleted));
                i = iIntValue;
            } else {
                remoteViews = remoteViews2;
                i = iIntValue;
                remoteViews.setRemoteAdapter(R.id.item_container, r8lambdaBOV2QNvOs4g5JwR24vJFBV1sIhk.onExtraCallback.onExtraCallback(context, AFi1zSDK.class, i));
            }
            int i12 = R.id.item_container;
            AFi1vSDK aFi1vSDK = AFi1vSDK.onWarmupCompleted;
            remoteViews.setPendingIntentTemplate(i12, aFi1vSDK.IAuthTabCallback(context, i));
            remoteViews.setOnClickPendingIntent(i6, AFi1vSDK.onNavigationEvent(aFi1vSDK, context, i, null, 4, null));
            remoteViews.setOnClickPendingIntent(R.id.refresh_button, aFi1vSDK.onExtraCallbackWithResult(context, i));
            remoteViews.setOnClickPendingIntent(R.id.setting_button, aFi1vSDK.onExtraCallback(context, i));
        }
        for (WatchlistWidgetState.RowItem rowItem : indexSuccess.asInterface()) {
            q8a q8aVar = q8a.onNavigationEvent;
            String strOnTransact = rowItem.onTransact();
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            q8aVar.onExtraCallback(i, strOnTransact + ((String) WatchlistWidgetState.RowItem.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1235089590, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{rowItem}, iOnExtraCallback, -1235089589)) + rowItem.access100());
        }
        return remoteViews;
    }

    private final RemoteViews onExtraCallbackWithResult(Context context, int i, WatchlistWidgetState watchlistWidgetState, boolean z) {
        int i2 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_watchlist_medium_loading);
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        int i3 = R.id.widget_root;
        RemoteViewsThemeUtil.onExtraCallbackWithResult(remoteViewsThemeUtil, remoteViews, context, i3, watchlistWidgetState.onNavigationEvent(), watchlistWidgetState.onExtraCallbackWithResult(), 0, 0, 0, BERTags.FLAGS, (Object) null);
        onExtraCallback(remoteViews, watchlistWidgetState.onNavigationEvent(), watchlistWidgetState.onExtraCallbackWithResult());
        if (!z) {
            int i4 = onWarmupCompleted + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            remoteViews.setOnClickPendingIntent(i3, AFi1vSDK.onWarmupCompleted.onNavigationEvent(context, i));
            int i6 = onWarmupCompleted + 29;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return remoteViews;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PendingIntent pendingIntentOnNavigationEvent;
        onLost onlost = (onLost) objArr[0];
        Context context = (Context) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        WatchlistWidgetState watchlistWidgetState = (WatchlistWidgetState) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[5];
        int i = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_watchlist_medium_error);
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        int i2 = R.id.widget_root;
        RemoteViewsThemeUtil.onExtraCallbackWithResult(remoteViewsThemeUtil, remoteViews, context, i2, watchlistWidgetState.onNavigationEvent(), watchlistWidgetState.onExtraCallbackWithResult(), 0, 0, 0, BERTags.FLAGS, (Object) null);
        String strOnExtraCallbackWithResult = onlost.onExtraCallbackWithResult(context, onnavigationevent);
        int i3 = R.id.error_content;
        remoteViews.setTextViewText(i3, strOnExtraCallbackWithResult);
        remoteViews.setTextColor(i3, ByteOrderedDataOutputStream.onNavigationEvent(onlost.onExtraCallbackWithResult(context, watchlistWidgetState.onNavigationEvent())));
        if (onnavigationevent.onExtraCallback()) {
            int i4 = IAuthTabCallback + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = R.id.refresh_button;
            remoteViews.setViewVisibility(i6, 0);
            remoteViewsThemeUtil.onNavigationEvent(remoteViews, context, watchlistWidgetState.onNavigationEvent(), r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.IAuthTabCallback(), new int[]{i6});
        } else {
            remoteViews.setViewVisibility(R.id.refresh_button, 8);
            int i7 = onWarmupCompleted + 33;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        Object[] objArr2 = {q8a.onNavigationEvent, Integer.valueOf(iIntValue), strOnExtraCallbackWithResult};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr2, -1919848074, iOnExtraCallback2, 1919848088);
        if (!zBooleanValue) {
            if (onnavigationevent instanceof onNavigationEvent.onWarmupCompleted) {
                int i9 = IAuthTabCallback + 93;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    pendingIntentOnNavigationEvent = AFi1vSDK.onWarmupCompleted.onWarmupCompleted(context, iIntValue, ((onNavigationEvent.onWarmupCompleted) onnavigationevent).onWarmupCompleted());
                    int i10 = 17 / 0;
                } else {
                    pendingIntentOnNavigationEvent = AFi1vSDK.onWarmupCompleted.onWarmupCompleted(context, iIntValue, ((onNavigationEvent.onWarmupCompleted) onnavigationevent).onWarmupCompleted());
                }
            } else {
                pendingIntentOnNavigationEvent = AFi1vSDK.onWarmupCompleted.onNavigationEvent(context, iIntValue);
                int i11 = IAuthTabCallback + 77;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
            }
            remoteViews.setOnClickPendingIntent(i2, pendingIntentOnNavigationEvent);
            if (onnavigationevent.onExtraCallback()) {
                int i13 = IAuthTabCallback + 97;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 == 0) {
                    remoteViews.setOnClickPendingIntent(R.id.refresh_button, AFi1vSDK.onWarmupCompleted.onExtraCallbackWithResult(context, iIntValue));
                    throw null;
                }
                remoteViews.setOnClickPendingIntent(R.id.refresh_button, AFi1vSDK.onWarmupCompleted.onExtraCallbackWithResult(context, iIntValue));
            }
        }
        return remoteViews;
    }

    private final String onExtraCallbackWithResult(Context context, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = onnavigationevent instanceof onNavigationEvent.C0038onNavigationEvent;
            obj.hashCode();
            throw null;
        }
        if (onnavigationevent instanceof onNavigationEvent.C0038onNavigationEvent) {
            String string = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_error_content_medium);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (onnavigationevent instanceof onNavigationEvent.onExtraCallback) {
            int i4 = i3 + 83;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_network_error_content_medium_title), "");
                throw null;
            }
            String string2 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_network_error_content_medium_title);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (onnavigationevent instanceof onNavigationEvent.IAuthTabCallback) {
            int i5 = i3 + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            String string3 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_maintenance_medium);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (!(onnavigationevent instanceof onNavigationEvent.onWarmupCompleted)) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = i3 + 99;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        String string4 = ((onNavigationEvent.onWarmupCompleted) onnavigationevent).onExtraCallbackWithResult() == r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.RECENT_WATCH ? context.getString(R.string.toss_securities_widget_watchlist_medium_empty_recent) : context.getString(R.string.toss_securities_widget_watchlist_medium_empty);
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    private final long onExtraCallbackWithResult(Context context, DisplaySetting displaySetting) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.asBinder(), context, displaySetting, (Float) null, 4, (Object) null);
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return jIAuthTabCallback;
    }

    private final void onExtraCallback(RemoteViews remoteViews, DisplaySetting displaySetting, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_6, displaySetting), CollectionsKt__CollectionsJVMKt.listOf(getWrite.IAuthTabCallback(Float.valueOf(1.0f), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_title)))));
        int iIAuthTabCallback = remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_10, displaySetting);
        r0c r0cVar = r0c.onWarmupCompleted;
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, iIAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(0)), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_row1_bar))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(1)), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_row2_bar))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(2)), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_row3_bar)))}));
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.CIRCLE, displaySetting), CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(0)), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_row1_logo))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(1)), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_row2_logo))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(2)), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_row3_logo)))}));
        int i4 = onWarmupCompleted + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[PHI: r5
      0x004b: PHI (r5v10 java.lang.Object) = (r5v5 java.lang.Object), (r5v11 java.lang.Object) binds: [B:13:0x0049, B:10:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RemoteViews.RemoteCollectionItems rC_(Context context, int i, List<WatchlistWidgetState.RowItem> list, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, DisplaySetting displaySetting, onWarmupCompleted onwarmupcompleted) throws Throwable {
        Object next;
        int i2 = 2 % 2;
        RemoteViews.RemoteCollectionItems.Builder hasStableIds = q7ExternalSyntheticLambda0.rb_().setHasStableIds(true);
        Iterator<T> it = list.iterator();
        int i3 = IAuthTabCallback + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (it.hasNext()) {
            int i6 = IAuthTabCallback + 21;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                next = it.next();
                int i7 = 59 / 0;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
            } else {
                next = it.next();
                if (i5 < 0) {
                }
            }
            WatchlistWidgetState.RowItem rowItem = (WatchlistWidgetState.RowItem) next;
            hasStableIds.addItem(i5, z_.onExtraCallback(z_.onExtraCallback, context, i, rowItem, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, displaySetting, onwarmupcompleted.onWarmupCompleted().get(rowItem.IAuthTabCallbackStub()), false, 64, null));
            i5++;
        }
        RemoteViews.RemoteCollectionItems remoteCollectionItemsBuild = hasStableIds.build();
        Intrinsics.checkNotNullExpressionValue(remoteCollectionItemsBuild, "");
        return remoteCollectionItemsBuild;
    }

    private final RemoteViews onWarmupCompleted(Context context, int i, WatchlistWidgetState watchlistWidgetState, boolean z, onNavigationEvent onnavigationevent) {
        return (RemoteViews) onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, context, Integer.valueOf(i), watchlistWidgetState, Boolean.valueOf(z), onnavigationevent}, 6852895, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -6852895);
    }

    private final RemoteViews IAuthTabCallback(Context context, int i, WatchlistWidgetState.IndexSuccess indexSuccess, boolean z, onWarmupCompleted onwarmupcompleted) {
        return (RemoteViews) onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, context, Integer.valueOf(i), indexSuccess, Boolean.valueOf(z), onwarmupcompleted}, -1759471870, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1759471871);
    }
}
