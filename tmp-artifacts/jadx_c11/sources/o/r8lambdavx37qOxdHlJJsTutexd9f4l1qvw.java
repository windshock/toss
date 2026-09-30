package o;

import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtil;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtilKt;
import im.toss.securities.widget.data.model.overview.OverviewPrice;
import im.toss.securities.widget.data.model.overview.WidgetOverview;
import im.toss.securities.widget.overview.R;
import im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.setApTextSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdavx37qOxdHlJJsTutexd9f4l1qvw {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final r8lambdavx37qOxdHlJJsTutexd9f4l1qvw onNavigationEvent = new r8lambdavx37qOxdHlJJsTutexd9f4l1qvw();
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[DisplaySetting.values().length];
            try {
                iArr[DisplaySetting.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySetting.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySetting.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallback = iArr;
            int[] iArr2 = new int[Currency.values().length];
            try {
                iArr2[Currency.USD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Currency.KRW.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            onNavigationEvent = iArr2;
            int[] iArr3 = new int[checkDuration.values().length];
            try {
                iArr3[checkDuration.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[checkDuration.DOWN.ordinal()] = 2;
                int i = onWarmupCompleted + 117;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            IAuthTabCallback = iArr3;
            int i4 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        int i = onWarmupCompleted + 77;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i6);
        int i11 = (~i6) | i7;
        int i12 = i10 | (~(i11 | i4));
        int i13 = (~(i6 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i3));
        int i15 = i3 + i4 + i + (783392123 * i2) + ((-786872706) * i5);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i3) + 1729888256 + (218870266 * i4) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i) + ((-1731985408) * i2) + ((-471334912) * i5) + ((-600899584) * i16);
        int i18 = (i3 * 375823119) + 1642083618 + (i4 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i * 375824245) + (i2 * (-117547465)) + (i5 * 763984278) + (i16 * (-763691008));
        return i17 + ((i18 * i18) * 1830354944) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private r8lambdavx37qOxdHlJJsTutexd9f4l1qvw() {
    }

    public static abstract class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final boolean onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private IAuthTabCallback(boolean z) {
            this.onWarmupCompleted = z;
        }

        public boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public static final class onNavigationEvent extends IAuthTabCallback {
            public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 123;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
            
                if ((r6 instanceof o.r8lambdavx37qOxdHlJJsTutexd9f4l1qvw.IAuthTabCallback.onNavigationEvent) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
            
                r1 = r1 + 37;
                o.r8lambdavx37qOxdHlJJsTutexd9f4l1qvw.IAuthTabCallback.onNavigationEvent.onExtraCallbackWithResult = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 51;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 40 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 7;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 96 / 0;
                }
                int i5 = i2 + 25;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return -657136202;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 25;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return "GeneralError";
            }

            private onNavigationEvent() {
                super(true, null);
            }
        }

        /* renamed from: o.r8lambdavx37qOxdHlJJsTutexd9f4l1qvw$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0062IAuthTabCallback extends IAuthTabCallback {
            public static final C0062IAuthTabCallback IAuthTabCallback = new C0062IAuthTabCallback();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 3;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
            
                if ((r7 instanceof o.r8lambdavx37qOxdHlJJsTutexd9f4l1qvw.IAuthTabCallback.C0062IAuthTabCallback) != false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                r1 = r1 + 109;
                o.r8lambdavx37qOxdHlJJsTutexd9f4l1qvw.IAuthTabCallback.C0062IAuthTabCallback.onExtraCallbackWithResult = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            
                if ((r1 % 2) != 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
            
                r1 = r1 + 65;
                o.r8lambdavx37qOxdHlJJsTutexd9f4l1qvw.IAuthTabCallback.C0062IAuthTabCallback.onExtraCallbackWithResult = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r3 = r3 + 95;
                o.r8lambdavx37qOxdHlJJsTutexd9f4l1qvw.IAuthTabCallback.C0062IAuthTabCallback.onNavigationEvent = r3 % 128;
                r3 = r3 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 119;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                if (i3 % 2 == 0) {
                    int i5 = 71 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return 2133487664;
                }
                int i3 = 98 / 0;
                return 2133487664;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 93;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 1;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return "NetworkError";
                }
                throw null;
            }

            private C0062IAuthTabCallback() {
                super(true, null);
            }
        }

        public static final class onExtraCallbackWithResult extends IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 1;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 101;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    return false;
                }
                int i4 = IAuthTabCallback + 51;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return 1219160221;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 99;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 8 / 0;
                }
                int i5 = i2 + 27;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return "Maintenance";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onExtraCallbackWithResult() {
                super(false, null);
            }
        }

        public static final class onExtraCallback extends IAuthTabCallback {
            public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 3;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj || (obj instanceof onExtraCallback)) {
                    return true;
                }
                int i2 = onWarmupCompleted + 13;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 99;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 3;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return 58304569;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 23;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 97;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return "NoAsset";
            }

            private onExtraCallback() {
                super(false, null);
            }
        }

        public static final class onWarmupCompleted extends IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            static {
                int i = IAuthTabCallback + 9;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                if (this == obj || (obj instanceof onWarmupCompleted)) {
                    return true;
                }
                int i5 = i3 + 57;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 1;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return -1037374900;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 25;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 17;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return "NotTradeableUser";
            }

            private onWarmupCompleted() {
                super(false, null);
            }
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        r8lambdavx37qOxdHlJJsTutexd9f4l1qvw r8lambdavx37qoxdhljjstutexd9f4l1qvw = (r8lambdavx37qOxdHlJJsTutexd9f4l1qvw) objArr[0];
        Context context = (Context) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        OverviewSmallWidgetState overviewSmallWidgetState = (OverviewSmallWidgetState) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        if ((iIntValue2 & 8) != 0) {
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            zBooleanValue = false;
        }
        RemoteViews remoteViewsOnExtraCallbackWithResult = r8lambdavx37qoxdhljjstutexd9f4l1qvw.onExtraCallbackWithResult(context, iIntValue, overviewSmallWidgetState, zBooleanValue);
        int i4 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return remoteViewsOnExtraCallbackWithResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews onExtraCallbackWithResult(@NotNull Context context, int i, @NotNull OverviewSmallWidgetState overviewSmallWidgetState, boolean z) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(overviewSmallWidgetState, "");
        q8a.onNavigationEvent.IAuthTabCallback(i);
        if (overviewSmallWidgetState instanceof OverviewSmallWidgetState.Success) {
            OverviewSmallWidgetState.Success success = (OverviewSmallWidgetState.Success) overviewSmallWidgetState;
            List<String> listAsBinder = success.asBinder();
            if (listAsBinder instanceof Collection) {
                int i3 = IAuthTabCallback + 53;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    listAsBinder.isEmpty();
                    throw null;
                }
                if (!listAsBinder.isEmpty()) {
                    Iterator<T> it = listAsBinder.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()) != null) {
                            int i4 = onExtraCallbackWithResult + 71;
                            IAuthTabCallback = i4 % 128;
                            if (i4 % 2 != 0) {
                                onExtraCallbackWithResult(context, i, success, z);
                                throw null;
                            }
                            RemoteViews remoteViewsOnExtraCallbackWithResult = onExtraCallbackWithResult(context, i, success, z);
                            int i5 = onExtraCallbackWithResult + 1;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            return remoteViewsOnExtraCallbackWithResult;
                        }
                    }
                }
            }
            return onNavigationEvent(context, i, overviewSmallWidgetState, z, IAuthTabCallback.onExtraCallback.IAuthTabCallback, success.asInterface());
        }
        if (overviewSmallWidgetState instanceof OverviewSmallWidgetState.AllHidden) {
            int i7 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return (RemoteViews) IAuthTabCallback(new Object[]{this, context, Integer.valueOf(i), (OverviewSmallWidgetState.AllHidden) overviewSmallWidgetState, Boolean.valueOf(z)}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -666413526, 666413527, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
            }
            throw null;
        }
        if (overviewSmallWidgetState instanceof OverviewSmallWidgetState.Loading) {
            return onExtraCallback(context, i, overviewSmallWidgetState, z);
        }
        if (overviewSmallWidgetState instanceof OverviewSmallWidgetState.Error) {
            int i8 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return onNavigationEvent(this, context, i, overviewSmallWidgetState, z, IAuthTabCallback.onNavigationEvent.IAuthTabCallback, null, 32, null);
        }
        if (!(!(overviewSmallWidgetState instanceof OverviewSmallWidgetState.NetworkError))) {
            return onNavigationEvent(this, context, i, overviewSmallWidgetState, z, IAuthTabCallback.C0062IAuthTabCallback.IAuthTabCallback, null, 32, null);
        }
        if (overviewSmallWidgetState instanceof OverviewSmallWidgetState.NotTradeableUser) {
            int i10 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i10 % 128;
            return i10 % 2 == 0 ? onNavigationEvent(this, context, i, overviewSmallWidgetState, z, IAuthTabCallback.onWarmupCompleted.onWarmupCompleted, null, 70, null) : onNavigationEvent(this, context, i, overviewSmallWidgetState, z, IAuthTabCallback.onWarmupCompleted.onWarmupCompleted, null, 32, null);
        }
        if (overviewSmallWidgetState instanceof OverviewSmallWidgetState.Maintenance) {
            return onNavigationEvent(this, context, i, overviewSmallWidgetState, z, IAuthTabCallback.onExtraCallbackWithResult.onExtraCallbackWithResult, null, 32, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RemoteViews onExtraCallbackWithResult(Context context, int i, OverviewSmallWidgetState.Success success, boolean z) throws NoWhenBranchMatchedException {
        String str;
        String string;
        String strIAuthTabCallback;
        Double dIAuthTabCallback;
        int i2;
        int i3;
        int i4;
        String str2;
        int iOnNavigationEvent;
        Double dOnNavigationEvent;
        double dDoubleValue;
        int i5;
        Pair pairIAuthTabCallback;
        Double dOnNavigationEvent2;
        Double dOnNavigationEvent3;
        String str3;
        CipherSuiteCompanion cipherSuiteCompanionOnWarmupCompleted;
        double dDoubleValue2;
        Double dIAuthTabCallback2;
        Double dIAuthTabCallback3;
        int i6;
        int i7 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_overview_small_main);
        WidgetOverview.Overview overviewIAuthTabCallback_Parcel = success.IAuthTabCallback_Parcel();
        float f = context.getResources().getConfiguration().fontScale;
        onNavigationEvent(remoteViews, context, success.onWarmupCompleted(), success.onNavigationEvent());
        if (!z) {
            int i8 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = R.id.widget_root;
            s2a s2aVar = s2a.onWarmupCompleted;
            remoteViews.setOnClickPendingIntent(i10, s2aVar.onExtraCallbackWithResult(context, i, success.asInterface()));
            remoteViews.setOnClickPendingIntent(R.id.refresh_button, s2aVar.IAuthTabCallback(context, i));
            remoteViews.setOnClickPendingIntent(R.id.setting_button, s2aVar.onExtraCallback(context, i));
        }
        RemoteViewsThemeUtil.onNavigationEvent.onNavigationEvent(remoteViews, context, success.onWarmupCompleted(), r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.IAuthTabCallback(), R.id.refresh_button, R.id.setting_button);
        if (r1.IAuthTabCallback(context)) {
            remoteViews.setViewVisibility(R.id.logo_container, 8);
        } else {
            remoteViews.setViewVisibility(R.id.logo_container, 0);
        }
        String str4 = (String) CollectionsKt.getOrNull(success.asBinder(), 0);
        if (str4 != null) {
            int i11 = R.id.logo1;
            remoteViews.setImageViewBitmap(i11, rExternalSyntheticLambda1.IAuthTabCallback(str4));
            remoteViews.setViewVisibility(i11, 0);
        } else {
            remoteViews.setViewVisibility(R.id.logo1, 8);
        }
        String str5 = (String) CollectionsKt.getOrNull(success.asBinder(), 1);
        if (str5 != null) {
            int i12 = R.id.logo2;
            remoteViews.setImageViewBitmap(i12, rExternalSyntheticLambda1.IAuthTabCallback(str5));
            remoteViews.setViewVisibility(i12, 0);
        } else {
            remoteViews.setViewVisibility(R.id.logo2, 8);
        }
        Integer numIAuthTabCallbackDefault = overviewIAuthTabCallback_Parcel.IAuthTabCallbackDefault();
        int iIntValue = numIAuthTabCallbackDefault != null ? numIAuthTabCallbackDefault.intValue() : 0;
        if (iIntValue > 2) {
            int i13 = R.id.more_count;
            remoteViews.setViewVisibility(i13, 0);
            int i14 = onExtraCallback.onExtraCallback[success.onWarmupCompleted().ordinal()];
            if (i14 != 1) {
                int i15 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                if (i14 == 2) {
                    i6 = R.drawable.background_stock_count_dark;
                } else {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = R.drawable.background_stock_count;
                }
            } else {
                i6 = R.drawable.background_stock_count_light;
            }
            remoteViews.setInt(i13, "setBackgroundResource", i6);
            int i17 = iIntValue - 2;
            remoteViews.setTextViewText(i13, i17 > 99 ? "99+" : "+" + i17);
            remoteViews.setTextViewTextSize(i13, 1, r1.onExtraCallback(context, R.dimen.overview_small_more_count_text_size));
            charset charsetVar = charset.onExtraCallbackWithResult;
            str = "+";
            remoteViews.setTextColor(i13, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar.newSessionWithExtras().IAuthTabCallback(), charsetVar.prefetch().onExtraCallbackWithResult()), context, success.onWarmupCompleted(), null, 4, null)));
        } else {
            str = "+";
            remoteViews.setViewVisibility(R.id.more_count, 8);
        }
        if (success.access100() == HostnamesKt.PARENTS) {
            string = success.writeTypedObject() + "의 투자";
        } else {
            string = context.getString(R.string.toss_securities_widget_overview_title);
            Intrinsics.checkNotNull(string);
        }
        String str6 = string;
        int i18 = R.id.title_text;
        remoteViews.setTextViewText(i18, str6);
        remoteViews.setTextViewTextSize(i18, 1, r1.onExtraCallback(11.0f, f, 0.0f, 2, null));
        charset charsetVar2 = charset.onExtraCallbackWithResult;
        remoteViews.setTextColor(i18, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar2.postMessage().IAuthTabCallback(), charsetVar2.newSession().onExtraCallbackWithResult()), context, success.onWarmupCompleted(), null, 4, null)));
        String str7 = "";
        float f2 = 17.0f;
        if (!success.getInterfaceDescriptor()) {
            strIAuthTabCallback = context.getString(R.string.toss_securities_hide_amount);
            Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback, "");
        } else if (overviewIAuthTabCallback_Parcel.IAuthTabCallback() == null) {
            strIAuthTabCallback = overviewIAuthTabCallback_Parcel.onExtraCallback();
            if (strIAuthTabCallback == null) {
                strIAuthTabCallback = "";
            }
            i3 = 0;
            for (i2 = 0; i2 < strIAuthTabCallback.length(); i2++) {
                if (Character.isDigit(strIAuthTabCallback.charAt(i2))) {
                    int i19 = onExtraCallbackWithResult + 53;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    i3++;
                }
            }
            if (i3 >= 10) {
                f2 = 15.0f;
            }
        } else {
            OverviewPrice overviewPrice = (OverviewPrice) WidgetOverview.Overview.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -922206577, new Object[]{overviewIAuthTabCallback_Parcel, Boolean.valueOf(success.IAuthTabCallbackStubProxy())}, 922206579, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
            int i21 = onExtraCallback.onNavigationEvent[success.IAuthTabCallbackStub().ordinal()];
            if (i21 != 1) {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i22 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                if (overviewPrice != null && (dIAuthTabCallback = overviewPrice.IAuthTabCallback()) != null) {
                    int i24 = IAuthTabCallback + 63;
                    onExtraCallbackWithResult = i24 % 128;
                    if (i24 % 2 == 0) {
                        Currency currency = Currency.KRW;
                        Resources resources = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "");
                        strIAuthTabCallback = isHealthy.IAuthTabCallback(dIAuthTabCallback, currency, resources, false, true, (DecimalFormat) null, (DecimalFormat) null, 29, (Object) null);
                        if (strIAuthTabCallback == null) {
                        }
                        i3 = 0;
                        while (i2 < strIAuthTabCallback.length()) {
                        }
                        if (i3 >= 10) {
                        }
                    } else {
                        Currency currency2 = Currency.KRW;
                        Resources resources2 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "");
                        strIAuthTabCallback = isHealthy.IAuthTabCallback(dIAuthTabCallback, currency2, resources2, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
                        if (strIAuthTabCallback == null) {
                        }
                        i3 = 0;
                        while (i2 < strIAuthTabCallback.length()) {
                        }
                        if (i3 >= 10) {
                        }
                    }
                }
            } else if (overviewPrice != null) {
                int i25 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i25 % 128;
                int i26 = i25 % 2;
                Double dOnNavigationEvent4 = overviewPrice.onNavigationEvent();
                if (dOnNavigationEvent4 != null) {
                    Currency currency3 = Currency.USD;
                    Resources resources3 = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources3, "");
                    strIAuthTabCallback = isHealthy.IAuthTabCallback(dOnNavigationEvent4, currency3, resources3, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
                    if (strIAuthTabCallback == null) {
                    }
                    i3 = 0;
                    while (i2 < strIAuthTabCallback.length()) {
                    }
                    if (i3 >= 10) {
                    }
                }
            }
        }
        String str8 = strIAuthTabCallback;
        int i27 = R.id.amount_text;
        remoteViews.setTextViewText(i27, str8);
        remoteViews.setTextViewTextSize(i27, 1, r1.onExtraCallback(f2, f, 0.0f, 2, null));
        if (success.getInterfaceDescriptor()) {
            i4 = i27;
            str2 = str8;
            iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.onTransact(), context, success.onWarmupCompleted(), null, 4, null));
        } else {
            charset charsetVar3 = charset.onExtraCallbackWithResult;
            i4 = i27;
            str2 = str8;
            iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar3.ICustomTabsServiceDefault().IAuthTabCallback(), charsetVar3.validateRelationship().onExtraCallbackWithResult()), context, success.onWarmupCompleted(), null, 4, null));
        }
        remoteViews.setTextColor(i4, iOnNavigationEvent);
        if (overviewIAuthTabCallback_Parcel.IAuthTabCallbackStub() == null) {
            int i28 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i28 % 128;
            int i29 = i28 % 2;
            if (overviewIAuthTabCallback_Parcel.onTransact() == null) {
                int i30 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i30 % 128;
                int i31 = i30 % 2;
                String strAsInterface = overviewIAuthTabCallback_Parcel.asInterface();
                if (strAsInterface == null) {
                    strAsInterface = "";
                }
                int iLastIndexOf$default = StringsKt.lastIndexOf$default(strAsInterface, '(', 0, false, 6, (Object) null);
                if (iLastIndexOf$default > 0) {
                    String strSubstring = strAsInterface.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    String string2 = StringsKt.trimEnd(strSubstring).toString();
                    String strSubstring2 = strAsInterface.substring(iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    str7 = strSubstring2;
                    strAsInterface = string2;
                }
                checkDuration checkduration = (checkDuration) WidgetOverview.Overview.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 993684964, new Object[]{overviewIAuthTabCallback_Parcel}, -993684964, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                int i32 = checkduration == null ? -1 : onExtraCallback.IAuthTabCallback[checkduration.ordinal()];
                str3 = strAsInterface;
                cipherSuiteCompanionOnWarmupCompleted = i32 != 1 ? i32 != 2 ? r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.onWarmupCompleted() : r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.onExtraCallback() : r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.onExtraCallbackWithResult();
            } else {
                OverviewPrice overviewPriceOnWarmupCompleted = overviewIAuthTabCallback_Parcel.onWarmupCompleted(success.IAuthTabCallbackStubProxy());
                OverviewPrice overviewPriceOnExtraCallbackWithResult = overviewIAuthTabCallback_Parcel.onExtraCallbackWithResult(success.IAuthTabCallbackStubProxy());
                Currency currencyIAuthTabCallbackStub = success.IAuthTabCallbackStub();
                int[] iArr = onExtraCallback.onNavigationEvent;
                int i33 = iArr[currencyIAuthTabCallbackStub.ordinal()];
                if (i33 == 1) {
                    if (overviewPriceOnWarmupCompleted != null && (dOnNavigationEvent = overviewPriceOnWarmupCompleted.onNavigationEvent()) != null) {
                        dDoubleValue = dOnNavigationEvent.doubleValue();
                    }
                    i5 = iArr[success.IAuthTabCallbackStub().ordinal()];
                    if (i5 != 1) {
                    }
                    String str9 = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
                    String str10 = (String) pairIAuthTabCallback.IAuthTabCallback();
                    if (dDoubleValue <= 0.0d) {
                    }
                    CipherSuiteCompanion cipherSuiteCompanionOnExtraCallback = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.onExtraCallback(dDoubleValue);
                    str7 = "(" + str10 + ")";
                    str3 = str9;
                    cipherSuiteCompanionOnWarmupCompleted = cipherSuiteCompanionOnExtraCallback;
                } else {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dDoubleValue = (overviewPriceOnWarmupCompleted == null || (dIAuthTabCallback3 = overviewPriceOnWarmupCompleted.IAuthTabCallback()) == null) ? 0.0d : dIAuthTabCallback3.doubleValue();
                    i5 = iArr[success.IAuthTabCallbackStub().ordinal()];
                    if (i5 != 1) {
                        discard discardVar = discard.onExtraCallback;
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(discardVar.onExtraCallbackWithResult().format((overviewPriceOnWarmupCompleted == null || (dOnNavigationEvent3 = overviewPriceOnWarmupCompleted.onNavigationEvent()) == null) ? 0.0d : dOnNavigationEvent3.doubleValue()), discardVar.onExtraCallback().format((overviewPriceOnExtraCallbackWithResult == null || (dOnNavigationEvent2 = overviewPriceOnExtraCallbackWithResult.onNavigationEvent()) == null) ? 0.0d : Math.abs(dOnNavigationEvent2.doubleValue())));
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        discard discardVar2 = discard.onExtraCallback;
                        DecimalFormat decimalFormatOnWarmupCompleted = discardVar2.onWarmupCompleted();
                        if (overviewPriceOnWarmupCompleted != null) {
                            int i34 = IAuthTabCallback + 121;
                            onExtraCallbackWithResult = i34 % 128;
                            int i35 = i34 % 2;
                            Double dIAuthTabCallback4 = overviewPriceOnWarmupCompleted.IAuthTabCallback();
                            if (dIAuthTabCallback4 != null) {
                                int i36 = onExtraCallbackWithResult + 91;
                                IAuthTabCallback = i36 % 128;
                                if (i36 % 2 != 0) {
                                    dDoubleValue2 = dIAuthTabCallback4.doubleValue();
                                    int i37 = 65 / 0;
                                } else {
                                    dDoubleValue2 = dIAuthTabCallback4.doubleValue();
                                }
                            } else {
                                dDoubleValue2 = 0.0d;
                            }
                            pairIAuthTabCallback = getWrite.IAuthTabCallback(decimalFormatOnWarmupCompleted.format(dDoubleValue2), discardVar2.onExtraCallback().format((overviewPriceOnExtraCallbackWithResult == null || (dIAuthTabCallback2 = overviewPriceOnExtraCallbackWithResult.IAuthTabCallback()) == null) ? 0.0d : Math.abs(dIAuthTabCallback2.doubleValue())));
                        }
                    }
                    String str92 = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
                    String str102 = (String) pairIAuthTabCallback.IAuthTabCallback();
                    if (dDoubleValue <= 0.0d) {
                        str92 = str + str92;
                    } else {
                        Intrinsics.checkNotNull(str92);
                    }
                    CipherSuiteCompanion cipherSuiteCompanionOnExtraCallback2 = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.onExtraCallback(dDoubleValue);
                    str7 = "(" + str102 + ")";
                    str3 = str92;
                    cipherSuiteCompanionOnWarmupCompleted = cipherSuiteCompanionOnExtraCallback2;
                }
            }
        }
        int iOnNavigationEvent2 = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(cipherSuiteCompanionOnWarmupCompleted, context, success.onWarmupCompleted(), null, 4, null));
        float fOnExtraCallback = r1.onExtraCallback(11.0f, f, 0.0f, 2, null);
        int i38 = R.id.profit_amount;
        remoteViews.setTextViewText(i38, str3);
        remoteViews.setTextViewTextSize(i38, 1, fOnExtraCallback);
        remoteViews.setTextColor(i38, iOnNavigationEvent2);
        int i39 = R.id.profit_percent;
        remoteViews.setTextViewText(i39, str7);
        remoteViews.setTextViewTextSize(i39, 1, fOnExtraCallback);
        remoteViews.setTextColor(i39, iOnNavigationEvent2);
        int i40 = im.toss.securities.widget.common.R.id.timestamp;
        remoteViews.setTextViewText(i40, (String) OverviewSmallWidgetState.Success.onExtraCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 2004939639, PushInfo.Companion.onExtraCallback(), -2004939639, PushInfo.Companion.onExtraCallback(), new Object[]{success}));
        remoteViews.setTextViewTextSize(i40, 1, r1.onExtraCallback(10.0f, f, 0.0f, 2, null));
        charset charsetVar4 = charset.onExtraCallbackWithResult;
        remoteViews.setTextColor(i40, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar4.prefetch().IAuthTabCallback(), charsetVar4.postMessage().onExtraCallbackWithResult()), context, success.onWarmupCompleted(), null, 4, null)));
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{q8a.onNavigationEvent, Integer.valueOf(i), str6 + str2 + str3 + str7 + ((String) OverviewSmallWidgetState.Success.onExtraCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 2004939639, PushInfo.Companion.onExtraCallback(), -2004939639, PushInfo.Companion.onExtraCallback(), new Object[]{success}))}, -1919848074, getKekid.onExtraCallback(), 1919848088);
        return remoteViews;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        String string;
        r8lambdavx37qOxdHlJJsTutexd9f4l1qvw r8lambdavx37qoxdhljjstutexd9f4l1qvw = (r8lambdavx37qOxdHlJJsTutexd9f4l1qvw) objArr[0];
        Context context = (Context) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        OverviewSmallWidgetState.AllHidden allHidden = (OverviewSmallWidgetState.AllHidden) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_overview_small_all_hidden);
        r8lambdavx37qoxdhljjstutexd9f4l1qvw.onNavigationEvent(remoteViews, context, allHidden.onWarmupCompleted(), allHidden.onNavigationEvent());
        if (!zBooleanValue) {
            int i2 = R.id.widget_root;
            s2a s2aVar = s2a.onWarmupCompleted;
            remoteViews.setOnClickPendingIntent(i2, s2aVar.onExtraCallbackWithResult(context, iIntValue, allHidden.IAuthTabCallbackDefault()));
            remoteViews.setOnClickPendingIntent(R.id.refresh_button, s2aVar.IAuthTabCallback(context, iIntValue));
            remoteViews.setOnClickPendingIntent(R.id.setting_button, s2aVar.onExtraCallback(context, iIntValue));
            int i3 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 2;
            }
        }
        int i5 = R.id.refresh_button;
        remoteViews.setImageViewResource(i5, im.toss.securities.widget.common.R.drawable.icon_system_refresh_outlined);
        int i6 = R.id.setting_button;
        remoteViews.setImageViewResource(i6, im.toss.securities.widget.common.R.drawable.icon_system_setting_outlined);
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        DisplaySetting displaySettingOnWarmupCompleted = allHidden.onWarmupCompleted();
        r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
        remoteViewsThemeUtil.onNavigationEvent(remoteViews, context, displaySettingOnWarmupCompleted, r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), i5, i6);
        if (allHidden.onTransact() == HostnamesKt.PARENTS) {
            string = ((String) OverviewSmallWidgetState.AllHidden.onWarmupCompleted(-252433225, new Object[]{allHidden}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 252433226, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())) + "의 투자";
        } else {
            string = context.getString(R.string.toss_securities_widget_overview_title);
            Intrinsics.checkNotNull(string);
            int i7 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = R.id.title_text;
        remoteViews.setTextViewText(i9, string);
        charset charsetVar = charset.onExtraCallbackWithResult;
        remoteViews.setTextColor(i9, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar.postMessage().IAuthTabCallback(), charsetVar.newSession().onExtraCallbackWithResult()), context, allHidden.onWarmupCompleted(), null, 4, null)));
        String string2 = context.getString(R.string.toss_securities_hidden_stock_small);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        int i10 = R.id.content_text;
        remoteViews.setTextViewText(i10, string2);
        remoteViews.setTextColor(i10, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdamkedlq34espa96f3czorktst52c.asBinder(), context, allHidden.onWarmupCompleted(), null, 4, null)));
        int i11 = im.toss.securities.widget.common.R.id.timestamp;
        remoteViews.setTextViewText(i11, (String) OverviewSmallWidgetState.AllHidden.onWarmupCompleted(-1551721137, new Object[]{allHidden}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1551721137, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult()));
        remoteViews.setTextColor(i11, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar.prefetch().IAuthTabCallback(), charsetVar.postMessage().onExtraCallbackWithResult()), context, allHidden.onWarmupCompleted(), null, 4, null)));
        Object[] objArr2 = {q8a.onNavigationEvent, Integer.valueOf(iIntValue), string + string2 + ((String) OverviewSmallWidgetState.AllHidden.onWarmupCompleted(-1551721137, new Object[]{allHidden}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1551721137, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult()))};
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr2, -1919848074, getKekid.onExtraCallback(), 1919848088);
        return remoteViews;
    }

    private final RemoteViews onExtraCallback(Context context, int i, OverviewSmallWidgetState overviewSmallWidgetState, boolean z) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_overview_small_loading);
        onNavigationEvent(remoteViews, context, overviewSmallWidgetState.onWarmupCompleted(), overviewSmallWidgetState.onNavigationEvent());
        onExtraCallbackWithResult(remoteViews, overviewSmallWidgetState.onWarmupCompleted(), overviewSmallWidgetState.onNavigationEvent());
        if (!z) {
            int i3 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                remoteViews.setOnClickPendingIntent(R.id.widget_root, s2a.onWarmupCompleted.onNavigationEvent(context, i));
                int i4 = 57 / 0;
            } else {
                remoteViews.setOnClickPendingIntent(R.id.widget_root, s2a.onWarmupCompleted.onNavigationEvent(context, i));
            }
        }
        return remoteViews;
    }

    static /* synthetic */ RemoteViews onNavigationEvent(r8lambdavx37qOxdHlJJsTutexd9f4l1qvw r8lambdavx37qoxdhljjstutexd9f4l1qvw, Context context, int i, OverviewSmallWidgetState overviewSmallWidgetState, boolean z, IAuthTabCallback iAuthTabCallback, String str, int i2, Object obj) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        if ((i2 & 8) != 0) {
            int i4 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            str = null;
        }
        RemoteViews remoteViewsOnNavigationEvent = r8lambdavx37qoxdhljjstutexd9f4l1qvw.onNavigationEvent(context, i, overviewSmallWidgetState, z2, iAuthTabCallback, str);
        int i6 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return remoteViewsOnNavigationEvent;
    }

    private final RemoteViews onNavigationEvent(Context context, int i, OverviewSmallWidgetState overviewSmallWidgetState, boolean z, IAuthTabCallback iAuthTabCallback, String str) throws NoWhenBranchMatchedException {
        String string;
        int i2 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_overview_small_error);
        onNavigationEvent(remoteViews, context, overviewSmallWidgetState.onWarmupCompleted(), overviewSmallWidgetState.onNavigationEvent());
        String strOnWarmupCompleted = onWarmupCompleted(context, iAuthTabCallback);
        int i3 = R.id.error_content_1;
        remoteViews.setTextViewText(i3, strOnWarmupCompleted);
        r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
        remoteViews.setTextColor(i3, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdamkedlq34espa96f3czorktst52c.asBinder(), context, overviewSmallWidgetState.onWarmupCompleted(), null, 4, null)));
        if (iAuthTabCallback instanceof IAuthTabCallback.onNavigationEvent) {
            string = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_error_content_small_2);
        } else if (iAuthTabCallback instanceof IAuthTabCallback.onWarmupCompleted) {
            int i4 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                context.getString(R.string.toss_securities_widget_overview_small_need_login_2);
                throw null;
            }
            string = context.getString(R.string.toss_securities_widget_overview_small_need_login_2);
        } else {
            string = null;
        }
        if (string != null) {
            int i5 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = R.id.error_content_2;
            remoteViews.setViewVisibility(i7, 0);
            remoteViews.setTextViewText(i7, string);
            remoteViews.setTextColor(i7, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdamkedlq34espa96f3czorktst52c.asBinder(), context, overviewSmallWidgetState.onWarmupCompleted(), null, 4, null)));
        } else {
            remoteViews.setViewVisibility(R.id.error_content_2, 8);
        }
        if (iAuthTabCallback.onExtraCallbackWithResult()) {
            int i8 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = R.id.refresh_button;
            remoteViews.setViewVisibility(i10, 0);
            remoteViews.setImageViewResource(i10, im.toss.securities.widget.common.R.drawable.icon_system_refresh_outlined);
            RemoteViewsThemeUtil.onNavigationEvent.onNavigationEvent(remoteViews, context, overviewSmallWidgetState.onWarmupCompleted(), r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallback(), i10);
        } else {
            remoteViews.setViewVisibility(R.id.refresh_button, 8);
        }
        Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(i), strOnWarmupCompleted};
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, -1919848074, getKekid.onExtraCallback(), 1919848088);
        if (!z) {
            int i11 = R.id.widget_root;
            s2a s2aVar = s2a.onWarmupCompleted;
            remoteViews.setOnClickPendingIntent(i11, s2aVar.onExtraCallbackWithResult(context, i, str));
            if (iAuthTabCallback.onExtraCallbackWithResult()) {
                int i12 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    remoteViews.setOnClickPendingIntent(R.id.refresh_button, s2aVar.IAuthTabCallback(context, i));
                    int i13 = 78 / 0;
                } else {
                    remoteViews.setOnClickPendingIntent(R.id.refresh_button, s2aVar.IAuthTabCallback(context, i));
                }
            }
        }
        return remoteViews;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String onWarmupCompleted(Context context, IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (iAuthTabCallback instanceof IAuthTabCallback.onNavigationEvent) {
            String string = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_error_content_small_1);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (iAuthTabCallback instanceof IAuthTabCallback.C0062IAuthTabCallback) {
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                String string2 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_network_error_content_small_title);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return string2;
            }
            String string3 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_network_error_content_small_title);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            int i3 = 40 / 0;
            return string3;
        }
        if (iAuthTabCallback instanceof IAuthTabCallback.onExtraCallback) {
            int i4 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(context.getString(R.string.toss_securities_widget_overview_small_no_asset_content), "");
                throw null;
            }
            String string4 = context.getString(R.string.toss_securities_widget_overview_small_no_asset_content);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            return string4;
        }
        if (iAuthTabCallback instanceof IAuthTabCallback.onWarmupCompleted) {
            int i5 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            String string5 = context.getString(R.string.toss_securities_widget_overview_small_need_login_1);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            return string5;
        }
        if (!(iAuthTabCallback instanceof IAuthTabCallback.onExtraCallbackWithResult)) {
            throw new NoWhenBranchMatchedException();
        }
        String string6 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_maintenance_small);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        return string6;
    }

    private final void onNavigationEvent(RemoteViews remoteViews, Context context, DisplaySetting displaySetting, float f) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            RemoteViewsThemeUtil.onExtraCallbackWithResult(RemoteViewsThemeUtil.onNavigationEvent, remoteViews, context, R.id.widget_root, displaySetting, f, 1, 1, 0, 26630, null);
        } else {
            RemoteViewsThemeUtil.onExtraCallbackWithResult(RemoteViewsThemeUtil.onNavigationEvent, remoteViews, context, R.id.widget_root, displaySetting, f, 0, 0, 0, 224, null);
        }
        int i3 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onExtraCallbackWithResult(RemoteViews remoteViews, DisplaySetting displaySetting, float f) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_3, displaySetting), CollectionsKt.listOf(getWrite.IAuthTabCallback(Float.valueOf(0.8f), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_title)))));
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_5, displaySetting), CollectionsKt.listOf(getWrite.IAuthTabCallback(Float.valueOf(1.0f), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_amount)))));
        int iIAuthTabCallback = remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_6, displaySetting);
        r0c r0cVar = r0c.onWarmupCompleted;
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, iIAuthTabCallback, CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(0)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_item1))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(1)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_item2))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(2)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_item3)))}));
        int i4 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ RemoteViews onExtraCallbackWithResult(r8lambdavx37qOxdHlJJsTutexd9f4l1qvw r8lambdavx37qoxdhljjstutexd9f4l1qvw, Context context, int i, OverviewSmallWidgetState overviewSmallWidgetState, boolean z, int i2, Object obj) {
        return (RemoteViews) IAuthTabCallback(new Object[]{r8lambdavx37qoxdhljjstutexd9f4l1qvw, context, Integer.valueOf(i), overviewSmallWidgetState, Boolean.valueOf(z), Integer.valueOf(i2), obj}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -852670813, 852670813, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    private final RemoteViews onExtraCallbackWithResult(Context context, int i, OverviewSmallWidgetState.AllHidden allHidden, boolean z) {
        return (RemoteViews) IAuthTabCallback(new Object[]{this, context, Integer.valueOf(i), allHidden, Boolean.valueOf(z)}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -666413526, 666413527, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }
}
