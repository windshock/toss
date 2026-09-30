package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.rn.toss.core.portal.MonoHermesServiceGate;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdarKY_76dijV4LvyApAwXzgCxxoY {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static boolean onExtraCallback = false;
    public static final r8lambdarKY_76dijV4LvyApAwXzgCxxoY onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    static {
        IAuthTabCallback();
        onExtraCallbackWithResult = new r8lambdarKY_76dijV4LvyApAwXzgCxxoY();
        int i = IAuthTabCallbackDefault + 107;
        onTransact = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambdarKY_76dijV4LvyApAwXzgCxxoY() {
    }

    public static /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(r8lambdarKY_76dijV4LvyApAwXzgCxxoY r8lambdarky_76dijv4lvyapawxzgcxxoy, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, MonoHermesServiceGate monoHermesServiceGate, int i, Object obj) {
        boolean z4;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 103;
        asInterface = i3 % 128;
        if (i3 % 2 != 0 ? (i & 64) == 0 : (i & 36) == 0) {
            z4 = z3;
        } else {
            boolean zBooleanValue = ((Boolean) r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ.onExtraCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1721166331, new Object[]{r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ.onExtraCallbackWithResult}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1721166330, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue();
            int i4 = IAuthTabCallbackStub + 67;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            z4 = zBooleanValue;
        }
        return r8lambdarky_76dijv4lvyapawxzgcxxoy.onExtraCallbackWithResult(str, str2, str3, str4, z, z2, z4, (i & 128) != 0 ? r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ.onExtraCallbackWithResult.onExtraCallbackWithResult() : monoHermesServiceGate);
    }

    public final onExtraCallbackWithResult onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, boolean z, boolean z2, boolean z3, @NotNull MonoHermesServiceGate monoHermesServiceGate) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 91;
        asInterface = i3 % 128;
        String str5 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(monoHermesServiceGate, "");
            str5.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(monoHermesServiceGate, "");
        if (!z3) {
            return new onExtraCallbackWithResult.onWarmupCompleted(onExtraCallback.FEATURE_DISABLED, str5, i, str5);
        }
        if (monoHermesServiceGate.onExtraCallback()) {
            if (!z2) {
                return new onExtraCallbackWithResult.onWarmupCompleted(onExtraCallback.NOT_REACT_TARGET, str5, i, str5);
            }
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, Color.blue(0) + 127, objArr);
            return !Intrinsics.areEqual(str2, ((String) objArr[0]).intern()) ? new onExtraCallbackWithResult.onWarmupCompleted(onExtraCallback.COMPANY_MISMATCH, str5, i, str5) : StringsKt.isBlank(str) ? new onExtraCallbackWithResult.onWarmupCompleted(onExtraCallback.SERVICE_UNRESOLVED, str5, i, str5) : !monoHermesServiceGate.onExtraCallbackWithResult(str) ? new onExtraCallbackWithResult.onWarmupCompleted(onExtraCallback.SERVICE_NOT_ENROLLED, str) : (str3 == null || !z || Intrinsics.areEqual(str3, str4)) ? onExtraCallbackWithResult.onNavigationEvent.onExtraCallbackWithResult : new onExtraCallbackWithResult.onWarmupCompleted(onExtraCallback.DISTRIBUTION_GROUP_PINNED, str5, i, str5);
        }
        onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted = new onExtraCallbackWithResult.onWarmupCompleted(onExtraCallback.DISTRIBUTION_OFF, str5, i, str5);
        int i4 = asInterface + 41;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompleted;
    }

    public static abstract class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onNavigationEvent extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 9;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 75;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onNavigationEvent)) {
                    return false;
                }
                int i5 = i2 + 119;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 99;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return 1655238413;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 93;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return "MonoHermes";
            }

            private onNavigationEvent() {
                super(null);
            }
        }

        private onExtraCallbackWithResult() {
        }

        public static final class onWarmupCompleted extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private final String onExtraCallback;
            private final onExtraCallback onExtraCallbackWithResult;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 83;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    return false;
                }
                if (this.onExtraCallbackWithResult != ((onWarmupCompleted) obj).onExtraCallbackWithResult) {
                    int i4 = i2 + 5;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.onExtraCallback, r7.onExtraCallback)) {
                    return false;
                }
                int i6 = onNavigationEvent + 35;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }

            public int hashCode() {
                int i;
                int i2 = 2 % 2;
                int iHashCode = this.onExtraCallbackWithResult.hashCode();
                String str = this.onExtraCallback;
                if (str == null) {
                    int i3 = IAuthTabCallback + 53;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    i = 0;
                } else {
                    int iHashCode2 = str.hashCode();
                    int i5 = IAuthTabCallback + 119;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    i = iHashCode2;
                }
                return (iHashCode * 31) + i;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Legacy(reason=" + this.onExtraCallbackWithResult + ", serviceKey=" + this.onExtraCallback + ")";
                int i2 = IAuthTabCallback + 67;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(@NotNull onExtraCallback onextracallback, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(onextracallback, "");
                this.onExtraCallbackWithResult = onextracallback;
                this.onExtraCallback = str;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onWarmupCompleted(onExtraCallback onextracallback, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 2) != 0) {
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 69;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 55;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 % 2;
                    }
                    str = null;
                }
                this(onextracallback, str);
            }

            public final onExtraCallback onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 55;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallback onextracallback = this.onExtraCallbackWithResult;
                int i5 = i2 + 35;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return onextracallback;
                }
                throw null;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                if (this.onExtraCallbackWithResult == onExtraCallback.SERVICE_NOT_ENROLLED) {
                    int i2 = onNavigationEvent + 59;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    String str = this.onExtraCallback;
                    if (str != null && !StringsKt.isBlank(str)) {
                        return this.onExtraCallbackWithResult.getValue() + "(" + this.onExtraCallback + ")";
                    }
                }
                String value = this.onExtraCallbackWithResult.getValue();
                int i4 = IAuthTabCallback + 23;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback COMPANY_MISMATCH;
        public static final onExtraCallback DISTRIBUTION_GROUP_PINNED;
        public static final onExtraCallback DISTRIBUTION_OFF;
        public static final onExtraCallback FEATURE_DISABLED;
        private static boolean IAuthTabCallback = false;
        private static int IAuthTabCallbackDefault = 1;
        public static final onExtraCallback NOT_REACT_TARGET;
        public static final onExtraCallback SERVICE_NOT_ENROLLED;
        public static final onExtraCallback SERVICE_UNRESOLVED;
        private static int asBinder = 1;
        private static int asInterface;
        private static boolean onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static char[] onWarmupCompleted;
        private final String value;

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback[] onextracallbackArr = {FEATURE_DISABLED, DISTRIBUTION_OFF, NOT_REACT_TARGET, COMPANY_MISMATCH, SERVICE_UNRESOLVED, SERVICE_NOT_ENROLLED, DISTRIBUTION_GROUP_PINNED};
            int i5 = i2 + 57;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 78 / 0;
            }
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 69;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 81;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallbackDefault + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = IAuthTabCallbackDefault + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            String str = this.value;
            if (i3 == 0) {
                int i4 = 31 / 0;
            }
            return str;
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-120, -126, -116, -117, -125, -118, -119, -120, -121, -126, -122, -123, -124, -125, -126, -127}, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
            FEATURE_DISABLED = new onExtraCallback(((String) objArr[0]).intern(), 0, "feature_disabled");
            DISTRIBUTION_OFF = new onExtraCallback("DISTRIBUTION_OFF", 1, "distributionOff");
            NOT_REACT_TARGET = new onExtraCallback("NOT_REACT_TARGET", 2, "not_react_target");
            COMPANY_MISMATCH = new onExtraCallback("COMPANY_MISMATCH", 3, "company_mismatch");
            SERVICE_UNRESOLVED = new onExtraCallback("SERVICE_UNRESOLVED", 4, "serviceUnresolved");
            SERVICE_NOT_ENROLLED = new onExtraCallback("SERVICE_NOT_ENROLLED", 5, "serviceNotEnrolled");
            DISTRIBUTION_GROUP_PINNED = new onExtraCallback("DISTRIBUTION_GROUP_PINNED", 6, "distribution_group_pinned");
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = asBinder + 117;
            asInterface = i % 128;
            int i2 = i % 2;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onWarmupCompleted;
            long j = 0;
            Object obj = null;
            if (cArr2 != null) {
                int i3 = $10 + 73;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 76 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 20951 - MotionEvent.axisFromString(""), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5++;
                        int i6 = $10 + 113;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 75, TextUtils.getOffsetAfter("", 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 64 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 12214 - (ViewConfiguration.getWindowTouchSlop() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                String str = new String(cArr5);
                int i8 = $11 + 11;
                $10 = i8 % 128;
                if (i8 % 2 == 0) {
                    objArr[0] = str;
                    return;
                } else {
                    obj.hashCode();
                    throw null;
                }
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 27;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), Color.rgb(0, 0, 0) + 16777279, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }

        static void IAuthTabCallback() {
            onWarmupCompleted = new char[]{32571, 32516, 32512, 32565, 32564, 32567, 32546, 32517, 32568, 32566, 32519, 32573};
            onNavigationEvent = -1184333887;
            IAuthTabCallback = true;
            onExtraCallback = true;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 76, ImageFormat.getBitsPerPixel(0) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 75 - ((Process.getThreadPriority(0) + 20) >> 6), 16793253 + Color.rgb(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i4 = $11 + 47;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] / iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 63 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), Color.alpha(0) + 63, 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr5);
            int i5 = $10 + 99;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            objArr[0] = str;
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i7 = $10 + 23;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), ExpandableListView.getPackedPositionType(0L) + 63, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{32600, 32596, 32585, 32606};
        onNavigationEvent = -1184333829;
        onWarmupCompleted = true;
        onExtraCallback = true;
    }
}
