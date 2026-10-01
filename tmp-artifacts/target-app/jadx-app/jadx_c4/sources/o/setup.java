package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setup {
    private static final Regex IAuthTabCallback;
    private static char[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static final Regex onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {50, 44, -54, 25};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3 = (i * 3) + 97;
        int i4 = b * 3;
        int i5 = 4 - (s * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            int i9 = 0;
            int i10 = i5 + i7;
            i2 = i9;
            i5 = i8 + 1;
            i3 = i10;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            int i11 = i5;
            i5 = i3;
            i8 = i11;
            int i102 = i5 + i7;
            i2 = i9;
            i5 = i8 + 1;
            i3 = i102;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static final /* synthetic */ Key onWarmupCompleted(CharSequence charSequence) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(charSequence);
            throw null;
        }
        Key keyIAuthTabCallback = IAuthTabCallback(charSequence);
        int i3 = onTransact + 79;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return keyIAuthTabCallback;
    }

    public static /* synthetic */ String IAuthTabCallback(setupStyleable setupstyleable, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = onTransact + 57;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            i = 2;
        }
        String strOnExtraCallback = onExtraCallback(setupstyleable, str, i);
        int i6 = onTransact + 89;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return strOnExtraCallback;
    }

    public static final String onExtraCallback(@NotNull setupStyleable setupstyleable, @NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 101;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setupstyleable, "");
        Intrinsics.checkNotNullParameter(str, "");
        String strOnNavigationEvent = Page.onNavigationEvent(setupstyleable.a_(PageKey.onWarmupCompleted(str, null, 1, null)), i);
        int i5 = onTransact + 21;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return strOnNavigationEvent;
    }

    public static /* synthetic */ String onNavigationEvent(BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListener, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onTransact + 39;
        int i5 = i4 % 128;
        asBinder = i5;
        int i6 = i4 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 37;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            i = 2;
        }
        String strOnWarmupCompleted = onWarmupCompleted(baseRoundCornerProgressBarOnProgressChangedListener, str, i);
        int i9 = asBinder + 103;
        onTransact = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 24 / 0;
        }
        return strOnWarmupCompleted;
    }

    public static final String onWarmupCompleted(@NotNull BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListener, @NotNull String str, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(baseRoundCornerProgressBarOnProgressChangedListener, "");
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = new String(baseRoundCornerProgressBarOnProgressChangedListener.onExtraCallbackWithResult(Page.onNavigationEvent(str, i)), Charsets.UTF_8);
        int i3 = asBinder + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 59;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i >>> i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 59697), KeyEvent.keyCodeFromString("") + 17, 10973 - KeyEvent.getDeadChar(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 46134), 30 - TextUtils.lastIndexOf("", '0'), 20220 - View.MeasureSpec.makeMeasureSpec(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.red(0)), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1494 - Color.red(0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onExtraCallback[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 59697), 16 - TextUtils.lastIndexOf("", '0'), 10973 - (ViewConfiguration.getWindowTouchSlop() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 46134), 31 - ExpandableListView.getPackedPositionGroup(0L), 20221 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Gravity.getAbsoluteGravity(0, 0)), MotionEvent.axisFromString("") + 45, TextUtils.indexOf((CharSequence) "", '0') + 1495, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Process.getGidForName("") + 45, 1494 - View.combineMeasuredStates(0, 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i7 = $11 + 79;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static {
        onWarmupCompleted = 0;
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getLongPressTimeout() >> 16, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25, (char) (41878 - Color.red(0)), objArr);
        onNavigationEvent = new Regex(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(24 - MotionEvent.axisFromString(""), 17 - TextUtils.getTrimmedLength(""), (char) (27792 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr2);
        IAuthTabCallback = new Regex(((String) objArr2[0]).intern());
        int i = IAuthTabCallbackStub + 47;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final String onExtraCallbackWithResult(CharSequence charSequence) throws Throwable {
        String strReplace;
        String strIntern;
        String str;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 29;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            strReplace = onNavigationEvent.replace(charSequence, "");
            Object[] objArr = new Object[1];
            a(5 << TextUtils.getOffsetAfter("", 1), 2 >> (Process.myTid() + 56), (char) (ViewConfiguration.getScrollDefaultDelay() % 98), objArr);
            strIntern = ((String) objArr[0]).intern();
            str = "";
            z = false;
            i = 5;
        } else {
            strReplace = onNavigationEvent.replace(charSequence, "");
            Object[] objArr2 = new Object[1];
            a(45 - TextUtils.getOffsetAfter("", 0), (Process.myTid() >> 22) + 3, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            str = "";
            z = false;
            i = 4;
        }
        String strReplace$default = StringsKt.replace$default(strReplace, strIntern, str, z, i, (Object) null);
        int i4 = onTransact + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return strReplace$default;
    }

    private static final Key IAuthTabCallback(CharSequence charSequence) throws Throwable {
        Key keyGeneratePublic;
        int i = 2 % 2;
        int i2 = onTransact + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallback.onExtraCallback(charSequence)) {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, (char) (46577 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
            keyGeneratePublic = KeyFactory.getInstance(((String) objArr[0]).intern()).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(onExtraCallbackWithResult(charSequence), 2)));
        } else {
            Object[] objArr2 = new Object[1];
            a(43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 3 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46579), objArr2);
            keyGeneratePublic = KeyFactory.getInstance(((String) objArr2[0]).intern()).generatePublic(new X509EncodedKeySpec(Base64.decode(onExtraCallbackWithResult(charSequence), 0)));
        }
        Intrinsics.checkNotNullExpressionValue(keyGeneratePublic, "");
        int i4 = asBinder + 19;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return keyGeneratePublic;
        }
        throw null;
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{20079, 7378, 60327, 46846, 1475, 53502, 49151, 2567, 55640, 42052, 29483, 56850, 44296, 31697, 50909, 38345, 24758, 53232, 39658, 26904, 13345, 33576, 28171, 15722, 34871, 33049, 54261, 9418, 31187, 51897, 8164, 28919, 50460, 5674, 27431, 48165, 4368, 25110, 46306, 2496, 23242, 44974, 22644, 2718, 64945, 60808, 48972, 18473};
        onExtraCallbackWithResult = 1971910316307431231L;
    }
}
