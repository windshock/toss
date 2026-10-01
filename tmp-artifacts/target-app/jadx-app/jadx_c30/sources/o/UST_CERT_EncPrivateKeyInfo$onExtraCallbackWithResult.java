package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class UST_CERT_EncPrivateKeyInfo$onExtraCallbackWithResult {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static char onExtraCallback;
    private static long onWarmupCompleted;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private static final byte[] $$a = {119, -58, 7, 71};
    private static final int $$b = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int asBinder = 1;

    private static String $$c(byte b, int i, int i2) {
        int i3 = i * 2;
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = i2 + 109;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i5 = (-i4) + i5;
            i4 = i4;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i5;
            if (i7 == i3) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i5 = (-bArr[i8]) + i5;
            i4 = i8;
        }
    }

    static {
        IAuthTabCallbackStub = 0;
        IAuthTabCallback();
        Companion = new onExtraCallbackWithResult(null);
        int i = asBinder + 95;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ UST_CERT_EncPrivateKeyInfo$onExtraCallbackWithResult(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 91;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionChild(0L) + 44, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 49123), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 23972), View.resolveSizeAndState(0, 0, 0) + 50, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 29 - Color.red(0), Color.green(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 59;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 111;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private UST_CERT_EncPrivateKeyInfo$onExtraCallbackWithResult(String str, String str2) {
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = str2;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 69;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25612), View.getDefaultSize(0, 0), new char[]{1297, 63691, 58141, 26598}, new char[]{0, 0, 0, 0}, new char[]{4281, 4974, 3564, 43364}, objArr);
        boolean zAreEqual = Intrinsics.areEqual(str, ((String) objArr[0]).intern());
        int i4 = asInterface + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final UST_CERT_EncPrivateKeyInfo$onExtraCallbackWithResult IAuthTabCallback(@NotNull byte[] bArr) {
            Object obj;
            String str;
            Object obj2;
            String str2 = BuildConfig.FLAVOR;
            Intrinsics.checkNotNullParameter(bArr, BuildConfig.FLAVOR);
            IsEnabled isEnabledIAuthTabCallback = IsEnabled.onExtraCallback().IAuthTabCallback();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (bArr.length >= 2) {
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(isEnabledIAuthTabCallback.onNavigationEvent(bArr, 0, bArr.length - 2));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.onExtraCallback(obj)) {
                    obj = null;
                }
                str = (String) obj;
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
            }
            try {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(isEnabledIAuthTabCallback.onNavigationEvent(bArr, bArr.length - 2, bArr.length));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
            }
            if (Result.onExtraCallback(obj2)) {
                obj2 = null;
            }
            String str3 = (String) obj2;
            if (str3 != null) {
                str2 = str3;
            }
            return new UST_CERT_EncPrivateKeyInfo$onExtraCallbackWithResult(str, str2, defaultConstructorMarker);
        }
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 7798559133331975163L;
        IAuthTabCallback = -1776194565;
        onExtraCallback = (char) 456;
    }
}
