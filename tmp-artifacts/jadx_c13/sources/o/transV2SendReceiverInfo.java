package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.transV2GenerateCertNum;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transV2SendReceiverInfo {
    private static final onNavigationEvent Companion = new onNavigationEvent(null);
    private final Map<String, onWarmupCompleted> onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private final Function1<transV2GenerateCertNum, Unit> onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr[onExtraCallbackWithResult.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallbackWithResult.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallbackWithResult.STALE_TOKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallback = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public transV2SendReceiverInfo(@NotNull Function1<? super transV2GenerateCertNum, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = function1;
        this.onExtraCallbackWithResult = new Object();
        this.onExtraCallback = new LinkedHashMap();
    }

    public final transV2ImportCert onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("sessionId must not be blank");
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        synchronized (this.onExtraCallbackWithResult) {
            if (this.onExtraCallback.get(str) != null) {
                throw new IllegalStateException(("Session '" + str + "' is already registered").toString());
            }
            this.onExtraCallback.put(str, new onWarmupCompleted(string, false, false, false, 14, null));
            this.onExtraCallback.size();
        }
        return new transV2ImportCert(this, str, string);
    }

    public final boolean onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (StringsKt__StringsKt.isBlank(str3)) {
            throw new IllegalArgumentException("appName must not be blank");
        }
        if (StringsKt__StringsKt.isBlank(str4)) {
            throw new IllegalArgumentException("scheme must not be blank");
        }
        synchronized (this.onExtraCallbackWithResult) {
            onWarmupCompleted onwarmupcompleted = this.onExtraCallback.get(str);
            if (onwarmupcompleted == null) {
                return false;
            }
            if (Intrinsics.areEqual(onwarmupcompleted.onExtraCallbackWithResult(), str2) && !onwarmupcompleted.IAuthTabCallback() && !onwarmupcompleted.onWarmupCompleted()) {
                onwarmupcompleted.IAuthTabCallback(true);
                this.onWarmupCompleted.invoke(new transV2GenerateCertNum.onExtraCallbackWithResult(str, str3, str4));
                return true;
            }
            return false;
        }
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        synchronized (this.onExtraCallbackWithResult) {
            onWarmupCompleted onwarmupcompleted = this.onExtraCallback.get(str);
            if (onwarmupcompleted == null) {
                return false;
            }
            if (Intrinsics.areEqual(onwarmupcompleted.onExtraCallbackWithResult(), str2) && onwarmupcompleted.IAuthTabCallback() && !onwarmupcompleted.onWarmupCompleted() && onwarmupcompleted.onExtraCallback() != z) {
                onwarmupcompleted.onExtraCallback(z);
                this.onWarmupCompleted.invoke(new transV2GenerateCertNum.onExtraCallback(str, z));
                return true;
            }
            return false;
        }
    }

    public final boolean onNavigationEvent(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        synchronized (this.onExtraCallbackWithResult) {
            onWarmupCompleted onwarmupcompleted = this.onExtraCallback.get(str);
            if (onwarmupcompleted == null) {
                return false;
            }
            if (Intrinsics.areEqual(onwarmupcompleted.onExtraCallbackWithResult(), str2) && onwarmupcompleted.IAuthTabCallback() && !onwarmupcompleted.onWarmupCompleted()) {
                onwarmupcompleted.onWarmupCompleted(true);
                this.onWarmupCompleted.invoke(new transV2GenerateCertNum.onNavigationEvent(str));
                return true;
            }
            return false;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        onExtraCallbackWithResult onextracallbackwithresult;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        synchronized (this.onExtraCallbackWithResult) {
            onWarmupCompleted onwarmupcompleted = this.onExtraCallback.get(str);
            if (onwarmupcompleted == null) {
                onextracallbackwithresult = onExtraCallbackWithResult.UNKNOWN;
            } else if (Intrinsics.areEqual(onwarmupcompleted.onExtraCallbackWithResult(), str2)) {
                this.onExtraCallback.remove(str);
                onextracallbackwithresult = onExtraCallbackWithResult.REMOVED;
            } else {
                onextracallbackwithresult = onExtraCallbackWithResult.STALE_TOKEN;
            }
        }
        int i = onExtraCallback.onExtraCallback[onextracallbackwithresult.ordinal()];
        if (i != 1) {
            if (i == 2) {
                new Object[]{str};
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                new Object[]{str};
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback;
        public static final onExtraCallbackWithResult REMOVED;
        public static final onExtraCallbackWithResult STALE_TOKEN;
        public static final onExtraCallbackWithResult UNKNOWN;
        private static int onExtraCallback;
        private static final byte[] $$a = {86, 117, -27, 75};
        private static final int $$b = 186;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallbackWithResult = 1;

        private static String $$c(int i, short s, short s2) {
            int i2 = i + 4;
            int i3 = 105 - (s2 * 3);
            byte[] bArr = $$a;
            int i4 = s * 4;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 = i4 + i3;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i2++;
                i3 += bArr[i2];
            }
        }

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {REMOVED, UNKNOWN, STALE_TOKEN};
            int i5 = i2 + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i2 + 19;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 0;
            }
            return onextracallbackwithresultArr;
        }

        static {
            onExtraCallback = 0;
            onExtraCallbackWithResult();
            REMOVED = new onExtraCallbackWithResult("REMOVED", 0);
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 7 - KeyEvent.getDeadChar(0, 0), new char[]{5, 65534, 65531, 65534, 65535, 7, 65534}, false, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 92, objArr);
            UNKNOWN = new onExtraCallbackWithResult(((String) objArr[0]).intern(), 1);
            STALE_TOKEN = new onExtraCallbackWithResult("STALE_TOKEN", 2);
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onWarmupCompleted + 1;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0174  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            char c;
            int i4;
            long j;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                c = '0';
                i4 = 2083011369;
                j = 0;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 23 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 12843), View.MeasureSpec.getMode(0) + 55, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i7 = $11 + 7;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 12843);
                        int i9 = 56 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                        int iIndexOf = TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c) + 2168;
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, i9, iIndexOf, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i10 = $11 + 105;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    c = '0';
                    i4 = 2083011369;
                    j = 0;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        static void onExtraCallbackWithResult() {
            IAuthTabCallback = 478308901;
        }
    }

    static final class onWarmupCompleted {
        private boolean IAuthTabCallback;
        private final String onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private boolean onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback) && this.onNavigationEvent == onwarmupcompleted.onNavigationEvent && this.IAuthTabCallback == onwarmupcompleted.IAuthTabCallback && this.onExtraCallbackWithResult == onwarmupcompleted.onExtraCallbackWithResult;
        }

        public int hashCode() {
            return (((((this.onExtraCallback.hashCode() * 31) + Boolean.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
        }

        public String toString() {
            return "SessionEntry(token=" + this.onExtraCallback + ", opened=" + this.onNavigationEvent + ", isVisible=" + this.IAuthTabCallback + ", closed=" + this.onExtraCallbackWithResult + ")";
        }

        public onWarmupCompleted(@NotNull String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            this.onNavigationEvent = z;
            this.IAuthTabCallback = z2;
            this.onExtraCallbackWithResult = z3;
        }

        public /* synthetic */ onWarmupCompleted(String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public final void IAuthTabCallback(boolean z) {
            this.onNavigationEvent = z;
        }

        public final boolean IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public final void onExtraCallback(boolean z) {
            this.IAuthTabCallback = z;
        }

        public final boolean onExtraCallback() {
            return this.IAuthTabCallback;
        }

        public final void onWarmupCompleted(boolean z) {
            this.onExtraCallbackWithResult = z;
        }

        public final boolean onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }
    }

    static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
