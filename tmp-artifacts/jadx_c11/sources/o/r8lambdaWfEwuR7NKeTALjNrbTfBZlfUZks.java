package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtil;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtilKt;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.OverviewPrice;
import im.toss.securities.widget.overview.R;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumListItem;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import im.toss.securities.widget.overview.ui.medium.model.OverviewUiData;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks onNavigationEvent = new r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks();
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[Currency.values().length];
            try {
                iArr[Currency.USD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Currency.KRW.ordinal()] = 2;
                int i = IAuthTabCallback + 35;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 4 / 2;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[checkDuration.values().length];
            try {
                iArr2[checkDuration.UP.ordinal()] = 1;
                int i4 = IAuthTabCallback + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[checkDuration.DOWN.ordinal()] = 2;
                int i7 = IAuthTabCallback + 7;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 5;
                } else {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            onWarmupCompleted = iArr2;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i6 | i7);
        int i9 = i5 | i8;
        int i10 = ~i5;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i5)) | (~(i10 | i2));
        int i13 = i2 + i5 + i4 + (513088896 * i) + ((-1342203445) * i3);
        int i14 = i13 * i13;
        int i15 = (665020156 * i2) + 661520384 + (1303681286 * i5) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i4) + ((-771751936) * i) + (1382285312 * i3) + ((-350355456) * i14);
        int i16 = ((i2 * (-363642324)) - 614971735) + (i5 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i4 * (-363641803)) + (i * (-2127225984)) + (i3 * (-1080704249)) + (i14 * (-1523187712));
        return i15 + ((i16 * i16) * (-227409920)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks() {
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final Map<String, Bitmap> onExtraCallbackWithResult;
        private final Map<String, Bitmap> onNavigationEvent;

        /* JADX WARN: Illegal instructions before constructor call */
        public onNavigationEvent() {
            Map map = null;
            this(map, map, 3, map);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = onExtraCallback + 29;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!(!Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult))) {
                return Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent);
            }
            int i4 = onExtraCallback + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode();
            int i4 = onWarmupCompleted + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ImageCache(logoBitmaps=" + this.onExtraCallbackWithResult + ", badgeIconBitmaps=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 21;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onNavigationEvent(@NotNull Map<String, Bitmap> map, @NotNull Map<String, Bitmap> map2) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            this.onExtraCallbackWithResult = map;
            this.onNavigationEvent = map2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                map = access8100.onNavigationEvent();
                int i2 = onExtraCallback + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = onExtraCallback + 55;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    access8100.onNavigationEvent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                map2 = access8100.onNavigationEvent();
            }
            this(map, map2);
        }

        public final Map<String, Bitmap> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final Map<String, Bitmap> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Map<String, Bitmap> map = this.onNavigationEvent;
            int i5 = i2 + 63;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return map;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static abstract class onWarmupCompleted {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final boolean onExtraCallback;

        public /* synthetic */ onWarmupCompleted(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private onWarmupCompleted(boolean z) {
            this.onExtraCallback = z;
        }

        public boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            boolean z = this.onExtraCallback;
            int i4 = i3 + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public static final class onExtraCallback extends onWarmupCompleted {
            public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallbackWithResult + 57;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 125;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj || (obj instanceof onExtraCallback)) {
                    return true;
                }
                int i4 = i2 + 39;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return 1258763126;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 99;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 1;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return "GeneralError";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onExtraCallback() {
                super(true, null);
            }
        }

        public static final class onExtraCallbackWithResult extends onWarmupCompleted {
            public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 5;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 49;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof onExtraCallbackWithResult) {
                    int i4 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
                int i6 = onExtraCallback + 39;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 19;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 74 / 0;
                }
                int i5 = i2 + 29;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return -245580304;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 23;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 119;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return "NetworkError";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onExtraCallbackWithResult() {
                super(true, null);
            }
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallback + 3;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 73 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 7;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i2 + 81;
                    onExtraCallbackWithResult = i6 % 128;
                    return i6 % 2 != 0;
                }
                if (obj instanceof onNavigationEvent) {
                    return true;
                }
                int i7 = i4 + 71;
                onNavigationEvent = i7 % 128;
                return i7 % 2 != 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 57;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 97;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return 1142416093;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 93;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 != 0) {
                    int i4 = 29 / 0;
                }
                int i5 = i3 + 57;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return "Maintenance";
            }

            private onNavigationEvent() {
                super(false, null);
            }
        }

        public static final class IAuthTabCallback extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

            static {
                int i = onNavigationEvent + 29;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
            
                if ((r6 instanceof o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onWarmupCompleted.IAuthTabCallback) != false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r1 = r1 + 103;
                o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onWarmupCompleted.IAuthTabCallback.onExtraCallbackWithResult = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                if ((r1 % 2) == 0) goto L11;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 33;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 85 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 11;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 117;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return -285359495;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 119;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 27;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return "NoAsset";
            }

            private IAuthTabCallback() {
                super(false, null);
            }
        }

        /* renamed from: o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0059onWarmupCompleted extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            public static final C0059onWarmupCompleted onExtraCallbackWithResult = new C0059onWarmupCompleted();
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 125;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
            
                if ((r7 instanceof o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onWarmupCompleted.C0059onWarmupCompleted) != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
            
                r1 = r1 + 111;
                r7 = r1 % 128;
                o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onWarmupCompleted.C0059onWarmupCompleted.onExtraCallback = r7;
                r1 = r1 % 2;
                r7 = r7 + 99;
                o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onWarmupCompleted.C0059onWarmupCompleted.onNavigationEvent = r7 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
            
                if ((r7 % 2) != 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r7 = r3 + 7;
                o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onWarmupCompleted.C0059onWarmupCompleted.onNavigationEvent = r7 % 128;
                r7 = r7 % 2;
                r3 = r3 + 1;
                o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onWarmupCompleted.C0059onWarmupCompleted.onNavigationEvent = r3 % 128;
                r3 = r3 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 39;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 == 0) {
                    int i5 = 64 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 73;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 39;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return 318789644;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return "NotTradeableUser";
                }
                throw null;
            }

            private C0059onWarmupCompleted() {
                super(false, null);
            }
        }
    }

    public static /* synthetic */ RemoteViews IAuthTabCallback(r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks r8lambdawfewur7nketaljnrbtfbzlfuzks, Context context, int i, OverviewMediumWidgetState overviewMediumWidgetState, boolean z, onNavigationEvent onnavigationevent, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 63;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 48) != 0) {
            int i6 = i4 + 119;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            Map map = null;
            onnavigationevent = new onNavigationEvent(map, map, 3, map);
        }
        return r8lambdawfewur7nketaljnrbtfbzlfuzks.onNavigationEvent(context, i, overviewMediumWidgetState, z2, onnavigationevent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final RemoteViews onNavigationEvent(@NotNull Context context, int i, @NotNull OverviewMediumWidgetState overviewMediumWidgetState, boolean z, @NotNull onNavigationEvent onnavigationevent) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(overviewMediumWidgetState, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        q8a.onNavigationEvent.IAuthTabCallback(i);
        if (overviewMediumWidgetState instanceof OverviewMediumWidgetState.Success) {
            int i5 = onExtraCallback + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            OverviewMediumWidgetState.Success success = (OverviewMediumWidgetState.Success) overviewMediumWidgetState;
            return success.ICustomTabsCallback().IAuthTabCallbackStub().isEmpty() ? onWarmupCompleted(context, i, overviewMediumWidgetState, z, onWarmupCompleted.IAuthTabCallback.onWarmupCompleted, success.onTransact()) : onNavigationEvent(context, i, success, z, onnavigationevent);
        }
        if (overviewMediumWidgetState instanceof OverviewMediumWidgetState.AllHidden) {
            return onWarmupCompleted(context, i, (OverviewMediumWidgetState.AllHidden) overviewMediumWidgetState, z);
        }
        if (overviewMediumWidgetState instanceof OverviewMediumWidgetState.Loading) {
            int i7 = onExtraCallback + 95;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return onWarmupCompleted(context, i, overviewMediumWidgetState, z);
        }
        if (overviewMediumWidgetState instanceof OverviewMediumWidgetState.Error) {
            int i9 = onExtraCallback + 9;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return onNavigationEvent(this, context, i, overviewMediumWidgetState, z, onWarmupCompleted.onExtraCallback.IAuthTabCallback, null, 32, null);
        }
        if (overviewMediumWidgetState instanceof OverviewMediumWidgetState.NetworkError) {
            return onNavigationEvent(this, context, i, overviewMediumWidgetState, z, onWarmupCompleted.onExtraCallbackWithResult.IAuthTabCallback, null, 32, null);
        }
        if (overviewMediumWidgetState instanceof OverviewMediumWidgetState.NotTradeableUser) {
            return onNavigationEvent(this, context, i, overviewMediumWidgetState, z, onWarmupCompleted.C0059onWarmupCompleted.onExtraCallbackWithResult, null, 32, null);
        }
        if (overviewMediumWidgetState instanceof OverviewMediumWidgetState.Maintenance) {
            return onNavigationEvent(this, context, i, overviewMediumWidgetState, z, onWarmupCompleted.onNavigationEvent.IAuthTabCallback, null, 32, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0466 A[PHI: r8 r12
      0x0466: PHI (r8v10 double) = (r8v9 double), (r8v12 double) binds: [B:134:0x0464, B:131:0x045c] A[DONT_GENERATE, DONT_INLINE]
      0x0466: PHI (r12v5 android.widget.RemoteViews) = (r12v4 android.widget.RemoteViews), (r12v7 android.widget.RemoteViews) binds: [B:134:0x0464, B:131:0x045c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x038d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RemoteViews onNavigationEvent(Context context, int i, OverviewMediumWidgetState.Success success, boolean z, onNavigationEvent onnavigationevent) throws NoWhenBranchMatchedException {
        String string;
        Double dOnNavigationEvent;
        String strIAuthTabCallback;
        Double dIAuthTabCallback;
        String str;
        String str2;
        String str3;
        int i2;
        int iOnNavigationEvent;
        int i3;
        Double dOnNavigationEvent2;
        double dDoubleValue;
        double d;
        int i4;
        double dAbs;
        Pair pairIAuthTabCallback;
        Double dOnNavigationEvent3;
        Double dOnNavigationEvent4;
        RemoteViews remoteViews;
        double d2;
        CipherSuiteCompanion cipherSuiteCompanionOnExtraCallback;
        String str4;
        Double dIAuthTabCallback2;
        boolean z2;
        int i5;
        int i6 = 2 % 2;
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_overview_medium_main);
        OverviewUiData overviewUiDataICustomTabsCallback = success.ICustomTabsCallback();
        onNavigationEvent(new Object[]{this, remoteViews2, context, success.onExtraCallback(), Float.valueOf(success.onNavigationEvent())}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 2074333974, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -2074333973, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        if (!z) {
            int i7 = onExtraCallback + 121;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            remoteViews2.setOnClickPendingIntent(R.id.widget_root, r7.onExtraCallbackWithResult.onWarmupCompleted(context, i, success.onTransact()));
        }
        if (((HostnamesKt) OverviewMediumWidgetState.Success.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1011696420, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{success}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1011696421)) == HostnamesKt.PARENTS) {
            string = success.readTypedObject() + "의 투자";
        } else {
            string = context.getString(R.string.toss_securities_widget_overview_title);
            Intrinsics.checkNotNull(string);
        }
        String str5 = string;
        int i9 = R.id.title_text;
        remoteViews2.setTextViewText(i9, str5);
        charset charsetVar = charset.onExtraCallbackWithResult;
        remoteViews2.setTextColor(i9, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar}), context, success.onExtraCallback(), null, 4, null)));
        int i10 = R.id.time_text;
        remoteViews2.setTextViewText(i10, success.IAuthTabCallbackStubProxy());
        remoteViews2.setTextColor(i10, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar.prefetch().IAuthTabCallback(), charsetVar.postMessage().onExtraCallbackWithResult()), context, success.onExtraCallback(), null, 4, null)));
        if (!z) {
            remoteViews2.setOnClickPendingIntent(R.id.refresh_button, r7.onExtraCallbackWithResult.onExtraCallback(context, i));
        }
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        DisplaySetting displaySettingOnExtraCallback = success.onExtraCallback();
        r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
        remoteViewsThemeUtil.onNavigationEvent(remoteViews2, context, displaySettingOnExtraCallback, r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), R.id.refresh_button);
        if (!z) {
            remoteViews2.setOnClickPendingIntent(R.id.setting_button, (PendingIntent) r7.onNavigationEvent(-1356263763, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1356263763, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{r7.onExtraCallbackWithResult, context, Integer.valueOf(i)}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()));
        }
        remoteViewsThemeUtil.onNavigationEvent(remoteViews2, context, success.onExtraCallback(), r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), R.id.setting_button);
        if (success.extraCallbackWithResult()) {
            if (overviewUiDataICustomTabsCallback.asBinder() == null) {
                strIAuthTabCallback = overviewUiDataICustomTabsCallback.IAuthTabCallbackDefault();
                if (strIAuthTabCallback == null) {
                    int i11 = onWarmupCompleted + 43;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    str = "";
                }
            } else {
                OverviewPrice overviewPriceOnWarmupCompleted = overviewUiDataICustomTabsCallback.onWarmupCompleted(success.access100());
                int i13 = onExtraCallback.onExtraCallbackWithResult[success.access000().ordinal()];
                if (i13 == 1) {
                    if (overviewPriceOnWarmupCompleted != null && (dOnNavigationEvent = overviewPriceOnWarmupCompleted.onNavigationEvent()) != null) {
                        Currency currency = Currency.USD;
                        Resources resources = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "");
                        strIAuthTabCallback = isHealthy.IAuthTabCallback(dOnNavigationEvent, currency, resources, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
                        if (strIAuthTabCallback != null) {
                        }
                    }
                    int i112 = onWarmupCompleted + 43;
                    onExtraCallback = i112 % 128;
                    int i122 = i112 % 2;
                    str = "";
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i14 = onWarmupCompleted + 113;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    if (overviewPriceOnWarmupCompleted != null && (dIAuthTabCallback = overviewPriceOnWarmupCompleted.IAuthTabCallback()) != null) {
                        int i16 = onExtraCallback + 79;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                        Currency currency2 = Currency.KRW;
                        Resources resources2 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "");
                        strIAuthTabCallback = isHealthy.IAuthTabCallback(dIAuthTabCallback, currency2, resources2, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
                        if (strIAuthTabCallback == null) {
                        }
                    }
                    int i1122 = onWarmupCompleted + 43;
                    onExtraCallback = i1122 % 128;
                    int i1222 = i1122 % 2;
                    str = "";
                }
            }
            int i18 = R.id.amount_text;
            remoteViews2.setTextViewText(i18, str);
            if (success.extraCallbackWithResult()) {
                str2 = str;
                str3 = "";
                iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar.ICustomTabsServiceDefault().IAuthTabCallback(), charsetVar.validateRelationship().onExtraCallbackWithResult()), context, success.onExtraCallback(), null, 4, null));
                i2 = i18;
            } else {
                str2 = str;
                str3 = "";
                i2 = i18;
                iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar}), context, success.onExtraCallback(), null, 4, null));
            }
            remoteViews2.setTextColor(i2, iOnNavigationEvent);
            if (overviewUiDataICustomTabsCallback.access100() == null || overviewUiDataICustomTabsCallback.IAuthTabCallbackStubProxy() != null) {
                OverviewPrice overviewPriceOnExtraCallback = overviewUiDataICustomTabsCallback.onExtraCallback(success.access100());
                OverviewPrice overviewPrice = (OverviewPrice) OverviewUiData.onNavigationEvent(new Object[]{overviewUiDataICustomTabsCallback, Boolean.valueOf(success.access100())}, 1240185852, -1240185849, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                Currency currencyAccess000 = success.access000();
                int[] iArr = onExtraCallback.onExtraCallbackWithResult;
                i3 = iArr[currencyAccess000.ordinal()];
                if (i3 != 1) {
                    if (overviewPriceOnExtraCallback != null && (dOnNavigationEvent2 = overviewPriceOnExtraCallback.onNavigationEvent()) != null) {
                        dDoubleValue = dOnNavigationEvent2.doubleValue();
                        d = dDoubleValue;
                    }
                    d = 0.0d;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (overviewPriceOnExtraCallback != null) {
                        int i19 = onWarmupCompleted + 59;
                        onExtraCallback = i19 % 128;
                        if (i19 % 2 == 0) {
                            overviewPriceOnExtraCallback.IAuthTabCallback();
                            throw null;
                        }
                        Double dIAuthTabCallback3 = overviewPriceOnExtraCallback.IAuthTabCallback();
                        if (dIAuthTabCallback3 != null) {
                            dDoubleValue = dIAuthTabCallback3.doubleValue();
                            d = dDoubleValue;
                        }
                    }
                    d = 0.0d;
                }
                i4 = iArr[success.access000().ordinal()];
                if (i4 != 1) {
                    discard discardVar = discard.onExtraCallback;
                    String str6 = discardVar.onExtraCallbackWithResult().format((overviewPriceOnExtraCallback == null || (dOnNavigationEvent4 = overviewPriceOnExtraCallback.onNavigationEvent()) == null) ? 0.0d : dOnNavigationEvent4.doubleValue());
                    NumberFormat numberFormatOnExtraCallback = discardVar.onExtraCallback();
                    if (overviewPrice == null || (dOnNavigationEvent3 = overviewPrice.onNavigationEvent()) == null) {
                        dAbs = 0.0d;
                    } else {
                        int i20 = onExtraCallback + 51;
                        onWarmupCompleted = i20 % 128;
                        if (i20 % 2 != 0) {
                            dAbs = Math.abs(dOnNavigationEvent3.doubleValue());
                            int i21 = 71 / 0;
                        } else {
                            dAbs = Math.abs(dOnNavigationEvent3.doubleValue());
                        }
                    }
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(str6, numberFormatOnExtraCallback.format(dAbs));
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    discard discardVar2 = discard.onExtraCallback;
                    String str7 = discardVar2.onWarmupCompleted().format((overviewPriceOnExtraCallback == null || (dIAuthTabCallback2 = overviewPriceOnExtraCallback.IAuthTabCallback()) == null) ? 0.0d : dIAuthTabCallback2.doubleValue());
                    NumberFormat numberFormatOnExtraCallback2 = discardVar2.onExtraCallback();
                    if (overviewPrice != null) {
                        int i22 = onWarmupCompleted + 23;
                        onExtraCallback = i22 % 128;
                        if (i22 % 2 == 0) {
                            overviewPrice.IAuthTabCallback();
                            throw null;
                        }
                        Double dIAuthTabCallback4 = overviewPrice.IAuthTabCallback();
                        double dAbs2 = dIAuthTabCallback4 != null ? Math.abs(dIAuthTabCallback4.doubleValue()) : 0.0d;
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(str7, numberFormatOnExtraCallback2.format(dAbs2));
                    }
                }
                String str8 = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
                String str9 = (String) pairIAuthTabCallback.IAuthTabCallback();
                StringBuilder sb = new StringBuilder();
                if (success.extraCallbackWithResult()) {
                    remoteViews = remoteViews2;
                    d2 = d;
                    if (d2 > 0.0d) {
                        sb.append("+");
                    } else if (d2 < 0.0d) {
                        sb.append("-");
                    }
                    sb.append(str9);
                } else {
                    int i23 = onWarmupCompleted + 43;
                    onExtraCallback = i23 % 128;
                    if (i23 % 2 == 0) {
                        remoteViews = remoteViews2;
                        d2 = d;
                        if (d2 > 0.0d) {
                            sb.append("+");
                        }
                        sb.append(str8);
                        sb.append(" (" + str9 + ")");
                    } else {
                        remoteViews = remoteViews2;
                        d2 = d;
                        if (d2 > 0.0d) {
                        }
                        sb.append(str8);
                        sb.append(" (" + str9 + ")");
                    }
                }
                String string2 = sb.toString();
                cipherSuiteCompanionOnExtraCallback = r8lambdamkedlq34espa96f3czorktst52c.onExtraCallback(d2);
                str4 = string2;
            } else {
                String strAccess000 = overviewUiDataICustomTabsCallback.access000();
                if (strAccess000 == null) {
                    strAccess000 = str3;
                }
                checkDuration checkduration = (checkDuration) OverviewUiData.onNavigationEvent(new Object[]{overviewUiDataICustomTabsCallback}, -1964713930, 1964713932, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                int i24 = checkduration == null ? -1 : onExtraCallback.onWarmupCompleted[checkduration.ordinal()];
                cipherSuiteCompanionOnExtraCallback = i24 != 1 ? i24 != 2 ? r8lambdamkedlq34espa96f3czorktst52c.onWarmupCompleted() : r8lambdamkedlq34espa96f3czorktst52c.onExtraCallback() : r8lambdamkedlq34espa96f3czorktst52c.onExtraCallbackWithResult();
                str4 = strAccess000;
                remoteViews = remoteViews2;
            }
            int i25 = R.id.profit_text;
            remoteViews.setTextViewText(i25, str4);
            remoteViews.setTextColor(i25, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(cipherSuiteCompanionOnExtraCallback, context, success.onExtraCallback(), null, 4, null)));
            remoteViewsThemeUtil.onExtraCallbackWithResult(remoteViews, R.id.bottom_gradient, success.onExtraCallback(), success.onNavigationEvent());
            z2 = CollectionsKt.firstOrNull(overviewUiDataICustomTabsCallback.asInterface()) instanceof OverviewMediumListItem.FolderHeader;
            int i26 = R.id.list_top_spacer;
            if (z2) {
                i5 = 0;
            } else {
                int i27 = onWarmupCompleted + 37;
                onExtraCallback = i27 % 128;
                i5 = i27 % 2 == 0 ? 21 : 8;
            }
            remoteViews.setViewVisibility(i26, i5);
            if (overviewUiDataICustomTabsCallback.IAuthTabCallbackStub().isEmpty()) {
                int i28 = R.id.stock_list;
                remoteViews.setViewVisibility(i28, 0);
                if (Build.VERSION.SDK_INT >= 31) {
                    int i29 = onExtraCallback + 69;
                    onWarmupCompleted = i29 % 128;
                    int i30 = i29 % 2;
                    remoteViews.setRemoteAdapter(i28, rc_(context, overviewUiDataICustomTabsCallback.asInterface(), success, onnavigationevent, z));
                } else {
                    remoteViews.setRemoteAdapter(i28, r6.Companion.onNavigationEvent(context, i));
                }
                if (!z) {
                    remoteViews.setPendingIntentTemplate(i28, r7.onExtraCallbackWithResult.IAuthTabCallback(context, i));
                }
            } else {
                remoteViews.setViewVisibility(R.id.stock_list, 8);
            }
            q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{q8a.onNavigationEvent, Integer.valueOf(i), str5 + str2 + str4 + success.IAuthTabCallbackStubProxy()}, -1919848074, getKekid.onExtraCallback(), 1919848088);
            return remoteViews;
        }
        strIAuthTabCallback = context.getString(R.string.toss_securities_hide_amount);
        Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback, "");
        str = strIAuthTabCallback;
        int i182 = R.id.amount_text;
        remoteViews2.setTextViewText(i182, str);
        if (success.extraCallbackWithResult()) {
        }
        remoteViews2.setTextColor(i2, iOnNavigationEvent);
        if (overviewUiDataICustomTabsCallback.access100() == null) {
            OverviewPrice overviewPriceOnExtraCallback2 = overviewUiDataICustomTabsCallback.onExtraCallback(success.access100());
            OverviewPrice overviewPrice2 = (OverviewPrice) OverviewUiData.onNavigationEvent(new Object[]{overviewUiDataICustomTabsCallback, Boolean.valueOf(success.access100())}, 1240185852, -1240185849, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            Currency currencyAccess0002 = success.access000();
            int[] iArr2 = onExtraCallback.onExtraCallbackWithResult;
            i3 = iArr2[currencyAccess0002.ordinal()];
            if (i3 != 1) {
            }
            i4 = iArr2[success.access000().ordinal()];
            if (i4 != 1) {
            }
            String str82 = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
            String str92 = (String) pairIAuthTabCallback.IAuthTabCallback();
            StringBuilder sb2 = new StringBuilder();
            if (success.extraCallbackWithResult()) {
            }
            String string22 = sb2.toString();
            cipherSuiteCompanionOnExtraCallback = r8lambdamkedlq34espa96f3czorktst52c.onExtraCallback(d2);
            str4 = string22;
        }
        int i252 = R.id.profit_text;
        remoteViews.setTextViewText(i252, str4);
        remoteViews.setTextColor(i252, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(cipherSuiteCompanionOnExtraCallback, context, success.onExtraCallback(), null, 4, null)));
        remoteViewsThemeUtil.onExtraCallbackWithResult(remoteViews, R.id.bottom_gradient, success.onExtraCallback(), success.onNavigationEvent());
        z2 = CollectionsKt.firstOrNull(overviewUiDataICustomTabsCallback.asInterface()) instanceof OverviewMediumListItem.FolderHeader;
        int i262 = R.id.list_top_spacer;
        if (z2) {
        }
        remoteViews.setViewVisibility(i262, i5);
        if (overviewUiDataICustomTabsCallback.IAuthTabCallbackStub().isEmpty()) {
        }
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{q8a.onNavigationEvent, Integer.valueOf(i), str5 + str2 + str4 + success.IAuthTabCallbackStubProxy()}, -1919848074, getKekid.onExtraCallback(), 1919848088);
        return remoteViews;
    }

    private final RemoteViews onWarmupCompleted(Context context, int i, OverviewMediumWidgetState.AllHidden allHidden, boolean z) {
        String str;
        int i2 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_overview_medium_all_hidden);
        onNavigationEvent(new Object[]{this, remoteViews, context, allHidden.onExtraCallback(), Float.valueOf(allHidden.onNavigationEvent())}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 2074333974, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -2074333973, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        if (!z) {
            int i3 = onExtraCallback + 115;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                remoteViews.setOnClickPendingIntent(R.id.widget_root, r7.onExtraCallbackWithResult.onWarmupCompleted(context, i, allHidden.asInterface()));
                int i4 = 86 / 0;
            } else {
                remoteViews.setOnClickPendingIntent(R.id.widget_root, r7.onExtraCallbackWithResult.onWarmupCompleted(context, i, allHidden.asInterface()));
            }
        }
        if (allHidden.onTransact() == HostnamesKt.PARENTS) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            str = ((String) OverviewMediumWidgetState.AllHidden.onWarmupCompleted(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1566650418, -1566650418, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{allHidden})) + "의 투자";
        } else {
            String string = context.getString(R.string.toss_securities_widget_overview_title);
            Intrinsics.checkNotNull(string);
            int i5 = onWarmupCompleted + 49;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            str = string;
        }
        int i7 = R.id.title_text;
        remoteViews.setTextViewText(i7, str);
        charset charsetVar = charset.onExtraCallbackWithResult;
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        remoteViews.setTextColor(i7, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, iOnWarmupCompleted, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar}), context, allHidden.onExtraCallback(), null, 4, null)));
        int i8 = R.id.time_text;
        remoteViews.setTextViewText(i8, allHidden.IAuthTabCallbackStub());
        remoteViews.setTextColor(i8, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar.prefetch().IAuthTabCallback(), charsetVar.postMessage().onExtraCallbackWithResult()), context, allHidden.onExtraCallback(), null, 4, null)));
        if (!z) {
            remoteViews.setOnClickPendingIntent(R.id.refresh_button, r7.onExtraCallbackWithResult.onExtraCallback(context, i));
        }
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        DisplaySetting displaySettingOnExtraCallback = allHidden.onExtraCallback();
        r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
        remoteViewsThemeUtil.onNavigationEvent(remoteViews, context, displaySettingOnExtraCallback, r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), R.id.refresh_button);
        if (!z) {
            remoteViews.setOnClickPendingIntent(R.id.setting_button, (PendingIntent) r7.onNavigationEvent(-1356263763, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1356263763, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{r7.onExtraCallbackWithResult, context, Integer.valueOf(i)}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()));
        }
        remoteViewsThemeUtil.onNavigationEvent(remoteViews, context, allHidden.onExtraCallback(), r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), R.id.setting_button);
        String string2 = context.getString(R.string.toss_securities_hidden_stock_medium);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        int i9 = R.id.content_text;
        remoteViews.setTextViewText(i9, string2);
        remoteViews.setTextColor(i9, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdamkedlq34espa96f3czorktst52c.asBinder(), context, allHidden.onExtraCallback(), null, 4, null)));
        Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(i), str + string2 + allHidden.IAuthTabCallbackStub()};
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, -1919848074, getKekid.onExtraCallback(), 1919848088);
        return remoteViews;
    }

    private final RemoteViews onWarmupCompleted(Context context, int i, OverviewMediumWidgetState overviewMediumWidgetState, boolean z) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_overview_medium_loading);
        Object[] objArr = {this, remoteViews, context, overviewMediumWidgetState.onExtraCallback(), Float.valueOf(overviewMediumWidgetState.onNavigationEvent())};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        onNavigationEvent(objArr, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 2074333974, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -2074333973, iOnExtraCallback);
        onExtraCallbackWithResult(remoteViews, overviewMediumWidgetState.onExtraCallback(), overviewMediumWidgetState.onNavigationEvent());
        if (!z) {
            remoteViews.setOnClickPendingIntent(R.id.widget_root, r7.onExtraCallbackWithResult.onNavigationEvent(context, i));
            int i3 = onWarmupCompleted + 125;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = onExtraCallback + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return remoteViews;
        }
        throw null;
    }

    static /* synthetic */ RemoteViews onNavigationEvent(r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks r8lambdawfewur7nketaljnrbtfbzlfuzks, Context context, int i, OverviewMediumWidgetState overviewMediumWidgetState, boolean z, onWarmupCompleted onwarmupcompleted, String str, int i2, Object obj) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 8) != 0) {
            int i7 = i4 + 105;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            str = null;
        }
        RemoteViews remoteViewsOnWarmupCompleted = r8lambdawfewur7nketaljnrbtfbzlfuzks.onWarmupCompleted(context, i, overviewMediumWidgetState, z2, onwarmupcompleted, str);
        int i9 = onExtraCallback + 25;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return remoteViewsOnWarmupCompleted;
    }

    private final RemoteViews onWarmupCompleted(Context context, int i, OverviewMediumWidgetState overviewMediumWidgetState, boolean z, onWarmupCompleted onwarmupcompleted, String str) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_overview_medium_error);
        Object[] objArr = {this, remoteViews, context, overviewMediumWidgetState.onExtraCallback(), Float.valueOf(overviewMediumWidgetState.onNavigationEvent())};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        onNavigationEvent(objArr, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 2074333974, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -2074333973, iOnExtraCallback);
        String strIAuthTabCallback = IAuthTabCallback(context, onwarmupcompleted);
        int i3 = R.id.error_content;
        remoteViews.setTextViewText(i3, strIAuthTabCallback);
        Object[] objArr2 = {this, context, overviewMediumWidgetState.onExtraCallback()};
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        remoteViews.setTextColor(i3, ByteOrderedDataOutputStream.onNavigationEvent(((Long) onNavigationEvent(objArr2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 934324839, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -934324839, iOnExtraCallback2)).longValue()));
        if (onwarmupcompleted.onExtraCallbackWithResult()) {
            int i4 = R.id.refresh_button;
            remoteViews.setViewVisibility(i4, 0);
            RemoteViewsThemeUtil.onNavigationEvent.onNavigationEvent(remoteViews, context, overviewMediumWidgetState.onExtraCallback(), r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.IAuthTabCallback(), i4);
            int i5 = onWarmupCompleted + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            remoteViews.setViewVisibility(R.id.refresh_button, 8);
        }
        Object[] objArr3 = {q8a.onNavigationEvent, Integer.valueOf(i), strIAuthTabCallback};
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback3, objArr3, -1919848074, iOnExtraCallback4, 1919848088);
        if (!z) {
            int i7 = onExtraCallback + 63;
            onWarmupCompleted = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                remoteViews.setOnClickPendingIntent(R.id.widget_root, r7.onExtraCallbackWithResult.onWarmupCompleted(context, i, str));
                onwarmupcompleted.onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            int i8 = R.id.widget_root;
            r7 r7Var = r7.onExtraCallbackWithResult;
            remoteViews.setOnClickPendingIntent(i8, r7Var.onWarmupCompleted(context, i, str));
            if (onwarmupcompleted.onExtraCallbackWithResult()) {
                int i9 = onWarmupCompleted + 125;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    remoteViews.setOnClickPendingIntent(R.id.refresh_button, r7Var.onExtraCallback(context, i));
                    throw null;
                }
                remoteViews.setOnClickPendingIntent(R.id.refresh_button, r7Var.onExtraCallback(context, i));
            }
        }
        return remoteViews;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String IAuthTabCallback(Context context, onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (onwarmupcompleted instanceof onWarmupCompleted.onExtraCallback) {
            String string = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_error_content_medium);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 47 / 0;
            }
            return string;
        }
        if (onwarmupcompleted instanceof onWarmupCompleted.onExtraCallbackWithResult) {
            String string2 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_network_error_content_medium_title);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            int i4 = onWarmupCompleted + 61;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
            return string2;
        }
        if (onwarmupcompleted instanceof onWarmupCompleted.onNavigationEvent) {
            String string3 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_maintenance_medium);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            int i6 = onExtraCallback + 53;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return string3;
            }
            throw null;
        }
        if (!(onwarmupcompleted instanceof onWarmupCompleted.IAuthTabCallback)) {
            if (!(onwarmupcompleted instanceof onWarmupCompleted.C0059onWarmupCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            String string4 = context.getString(R.string.toss_securities_widget_overview_medium_need_login);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            return string4;
        }
        int i7 = onWarmupCompleted + 93;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            String string5 = context.getString(R.string.toss_securities_widget_overview_medium_no_asset_content);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            return string5;
        }
        String string6 = context.getString(R.string.toss_securities_widget_overview_medium_no_asset_content);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        int i8 = 53 / 0;
        return string6;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CipherSuiteCompanion cipherSuiteCompanionAsBinder;
        Float f;
        int i;
        Context context = (Context) objArr[1];
        DisplaySetting displaySetting = (DisplaySetting) objArr[2];
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            cipherSuiteCompanionAsBinder = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.asBinder();
            f = null;
            i = 2;
        } else {
            cipherSuiteCompanionAsBinder = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.asBinder();
            f = null;
            i = 4;
        }
        long jIAuthTabCallback = RemoteViewsThemeUtilKt.IAuthTabCallback(cipherSuiteCompanionAsBinder, context, displaySetting, f, i, null);
        int i4 = onWarmupCompleted + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Long.valueOf(jIAuthTabCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        RemoteViews remoteViews = (RemoteViews) objArr[1];
        Context context = (Context) objArr[2];
        DisplaySetting displaySetting = (DisplaySetting) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RemoteViewsThemeUtil.onExtraCallbackWithResult(RemoteViewsThemeUtil.onNavigationEvent, remoteViews, context, R.id.widget_root, displaySetting, fFloatValue, 0, 0, 0, 224, null);
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onExtraCallbackWithResult(RemoteViews remoteViews, DisplaySetting displaySetting, float f) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_5, displaySetting), CollectionsKt.listOf(getWrite.IAuthTabCallback(Float.valueOf(0.8f), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_header)))));
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_6, displaySetting), CollectionsKt.listOf(getWrite.IAuthTabCallback(Float.valueOf(1.0f), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_amount)))));
        int iIAuthTabCallback = remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_10, displaySetting);
        r0c r0cVar = r0c.onWarmupCompleted;
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, iIAuthTabCallback, CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(0)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_item1))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(1)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_item2))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(2)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_item3)))}));
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.CIRCLE, displaySetting), CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(0)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_item1_logo))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(1)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_item2_logo))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(2)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_item3_logo)))}));
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final RemoteViews.RemoteCollectionItems rc_(Context context, List<? extends OverviewMediumListItem> list, OverviewMediumWidgetState.Success success, onNavigationEvent onnavigationevent, boolean z) {
        OverviewMediumListItem.Stock stock;
        OverviewItemInfo overviewItemInfoIAuthTabCallback;
        Bitmap bitmap;
        r2a r2aVarIAuthTabCallback;
        String strIAuthTabCallbackStub;
        int i = 2 % 2;
        RemoteViews.RemoteCollectionItems.Builder viewTypeCount = q7ExternalSyntheticLambda0.rb_().setHasStableIds(true).setViewTypeCount(2);
        for (OverviewMediumListItem overviewMediumListItem : list) {
            int i2 = onExtraCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (overviewMediumListItem instanceof OverviewMediumListItem.Stock) {
                stock = (OverviewMediumListItem.Stock) overviewMediumListItem;
                int i4 = onExtraCallback + 67;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                stock = null;
            }
            if (stock != null) {
                overviewItemInfoIAuthTabCallback = stock.IAuthTabCallback();
                int i6 = onWarmupCompleted + 103;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                overviewItemInfoIAuthTabCallback = null;
            }
            if (overviewItemInfoIAuthTabCallback == null || (strIAuthTabCallbackStub = overviewItemInfoIAuthTabCallback.IAuthTabCallbackStub()) == null) {
                bitmap = null;
            } else {
                int i8 = onWarmupCompleted + 113;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                bitmap = onnavigationevent.onExtraCallbackWithResult().get(strIAuthTabCallbackStub);
            }
            viewTypeCount.addItem(overviewMediumListItem.onNavigationEvent(), r5b.onExtraCallback.IAuthTabCallback(context, overviewMediumListItem, success, bitmap, (overviewItemInfoIAuthTabCallback == null || (r2aVarIAuthTabCallback = r5ExternalSyntheticLambda0.IAuthTabCallback(overviewItemInfoIAuthTabCallback)) == null) ? null : onnavigationevent.IAuthTabCallback().get(r2aVarIAuthTabCallback.IAuthTabCallback()), z));
        }
        RemoteViews.RemoteCollectionItems remoteCollectionItemsBuild = viewTypeCount.build();
        Intrinsics.checkNotNullExpressionValue(remoteCollectionItemsBuild, "");
        return remoteCollectionItemsBuild;
    }

    private final void onWarmupCompleted(RemoteViews remoteViews, Context context, DisplaySetting displaySetting, float f) {
        Object[] objArr = {this, remoteViews, context, displaySetting, Float.valueOf(f)};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        onNavigationEvent(objArr, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 2074333974, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -2074333973, iOnExtraCallback);
    }

    private final long onWarmupCompleted(Context context, DisplaySetting displaySetting) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return ((Long) onNavigationEvent(new Object[]{this, context, displaySetting}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 934324839, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -934324839, iOnExtraCallback)).longValue();
    }
}
