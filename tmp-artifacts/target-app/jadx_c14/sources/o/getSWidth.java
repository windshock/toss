package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.getSWidth;
import o.getStartTimeMillis;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.guest.certify.CertifyGuestActivity;
import viva.republica.toss.guest.underFourteen.PendingEnrollmentActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSWidth {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static final Lazy IAuthTabCallbackDefault;
    private static boolean IAuthTabCallbackStub = false;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    private static long asBinder;
    private static String asInterface;
    private static int[] getInterfaceDescriptor;
    public static final getSWidth onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static onExtraCallback onTransact;
    public static final int onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~(i4 | i5);
        int i8 = i | i7;
        int i9 = (~(i5 | (~i))) | i4;
        int i10 = i4 + i + i2 + ((-1932811043) * i3) + (1521317780 * i6);
        int i11 = i10 * i10;
        int i12 = ((i4 * (-919556932)) - 154402816) + ((-919556932) * i) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i2) + ((-2098724864) * i3) + ((-1398800384) * i6) + ((-1444151296) * i11);
        int i13 = (i4 * 1794637580) + 2133191799 + (i * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i2 * 1794637741) + (i3 * (-1844343719)) + (i6 * (-1188939004)) + (i11 * (-394526720));
        int i14 = i12 + (i13 * i13 * 821297152);
        if (i14 != 1) {
            return i14 != 2 ? i14 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
        }
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i15 = 2 % 2;
        int i16 = IAuthTabCallback_Parcel + 17;
        int i17 = i16 % 128;
        access000 = i17;
        int i18 = i16 % 2;
        onNavigationEvent = zBooleanValue;
        int i19 = i17 + 41;
        IAuthTabCallback_Parcel = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(Context context, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(context, setDetectableSize);
        int i4 = access000 + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(j, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 39;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ getStartTimeMillis onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault();
        }
        IAuthTabCallbackDefault();
        throw null;
    }

    private getSWidth() {
    }

    static {
        IAuthTabCallbackStub();
        onExtraCallback = new getSWidth();
        IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.GuestCertifyWrapper$$ExternalSyntheticLambda1
            public final Object invoke() {
                return getSWidth.onNavigationEvent();
            }
        });
        asInterface = "";
        onExtraCallbackWithResult = true;
        asBinder = -1L;
        onWarmupCompleted = 8;
        int i = access100 + 27;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getStartTimeMillis IAuthTabCallbackDefault() {
        getStartTimeMillis getstarttimemillisAddOnMultiWindowModeChangedListener;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            getstarttimemillisAddOnMultiWindowModeChangedListener = ((getStartTimeMillis.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), getStartTimeMillis.onExtraCallback.class)).addOnMultiWindowModeChangedListener();
            int i3 = 47 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            getstarttimemillisAddOnMultiWindowModeChangedListener = ((getStartTimeMillis.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), getStartTimeMillis.onExtraCallback.class)).addOnMultiWindowModeChangedListener();
        }
        int i4 = access000 + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return getstarttimemillisAddOnMultiWindowModeChangedListener;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 == 0) {
            str = asInterface;
            int i4 = 41 / 0;
        } else {
            str = asInterface;
        }
        int i5 = i3 + 77;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onExtraCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        boolean z = IAuthTabCallbackStub;
        int i5 = i3 + 87;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return z;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        boolean z = IAuthTabCallback;
        int i5 = i3 + 93;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str;
        Intent intent;
        String str2;
        getSWidth getswidth = (getSWidth) objArr[0];
        Activity activity = (Activity) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        Boolean bool = (Boolean) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        String str3 = (String) objArr[5];
        String str4 = (String) objArr[6];
        boolean zBooleanValue2 = ((Boolean) objArr[7]).booleanValue();
        Intent intent2 = (Intent) objArr[8];
        String str5 = (String) objArr[9];
        APMaxLenMode aPMaxLenMode = (APMaxLenMode) objArr[10];
        boolean zBooleanValue3 = ((Boolean) objArr[11]).booleanValue();
        String str6 = (String) objArr[12];
        int iIntValue = ((Number) objArr[13]).intValue();
        Object obj = objArr[14];
        int i = 2 % 2;
        if ((iIntValue & 4) != 0) {
            bool = null;
        }
        if ((iIntValue & 8) != 0) {
            int i2 = IAuthTabCallback_Parcel + 77;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            zBooleanValue = false;
        }
        if ((iIntValue & 16) != 0) {
            int i4 = IAuthTabCallback_Parcel + 53;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            str3 = null;
        }
        if ((iIntValue & 32) != 0) {
            int i6 = access000 + 55;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        } else {
            str = str4;
        }
        if ((iIntValue & 64) != 0) {
            zBooleanValue2 = false;
        }
        if ((iIntValue & 128) != 0) {
            int i8 = access000 + 45;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            intent = null;
        } else {
            intent = intent2;
        }
        if ((iIntValue & 256) != 0) {
            int i9 = access000 + 5;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            str2 = "";
        } else {
            str2 = str5;
        }
        onExtraCallback(494421609, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -494421609, new Object[]{getswidth, activity, Long.valueOf(jLongValue), bool, Boolean.valueOf(zBooleanValue), str3, str, Boolean.valueOf(zBooleanValue2), intent, str2, (iIntValue & 512) != 0 ? null : aPMaxLenMode, Boolean.valueOf((iIntValue & 1024) != 0 ? false : zBooleanValue3), str6}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSWidth.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getSWidth getswidth, Activity activity, long j, boolean z, String str, notifyVerticalEdgeReached notifyverticaledgereached, SecurityGuardLiteSecretInfoa securityGuardLiteSecretInfoa, String str2, int i, Object obj) throws Throwable {
        boolean z2;
        String str3;
        int i2 = 2 % 2;
        int i3 = access000 + 89;
        int i4 = i3 % 128;
        IAuthTabCallback_Parcel = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 1;
            access000 = i6 % 128;
            z2 = i6 % 2 == 0;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            int i7 = access000 + 97;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            str3 = "";
        } else {
            str3 = str;
        }
        getswidth.IAuthTabCallback(activity, j, z2, str3, notifyverticaledgereached, securityGuardLiteSecretInfoa, str2);
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getInterfaceDescriptor;
        int i5 = -1469660336;
        int i6 = 16;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $11 + 45;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> i6), 72 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i10++;
                    i5 = -1469660336;
                    i6 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getInterfaceDescriptor;
        if (iArr5 != null) {
            int i11 = $11 + 7;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 51;
                $10 = i14 % 128;
                if (i14 % i3 != 0) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i7] = Integer.valueOf(iArr5[i13]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 72 - View.resolveSize(i7, i7), 8848 - (ViewConfiguration.getScrollBarSize() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i13 %= 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.rgb(0, 0, 0) + 16777288, 8848 - (ViewConfiguration.getTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i13++;
                }
                i3 = 2;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 39 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf((CharSequence) "", '0') + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - TextUtils.getTrimmedLength("")), 78 - (ViewConfiguration.getPressedStateDuration() >> 16), 7398 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i20 = $10 + 15;
        $11 = i20 % 128;
        int i21 = i20 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IAuthTabCallback(@org.jetbrains.annotations.NotNull android.app.Activity r15, long r16, boolean r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull o.notifyVerticalEdgeReached r20, @org.jetbrains.annotations.NotNull o.SecurityGuardLiteSecretInfoa r21, @org.jetbrains.annotations.NotNull java.lang.String r22) throws java.lang.Throwable {
        /*
            r14 = this;
            r12 = r15
            r8 = r19
            r0 = r20
            r5 = r21
            r9 = r22
            r6 = 2
            int r1 = r6 % r6
            int r1 = o.getSWidth.IAuthTabCallback_Parcel
            int r1 = r1 + 49
            int r2 = r1 % 128
            o.getSWidth.access000 = r2
            int r1 = r1 % r6
            r2 = 0
            r7 = 1
            java.lang.String r3 = ""
            if (r1 != 0) goto L3a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            o.RedBoxContentViewOpenStackFrameTask$onExtraCallbackWithResult r1 = o.RedBoxContentViewOpenStackFrameTask.Companion
            r1.onNavigationEvent(r15)
            boolean r1 = kotlin.text.StringsKt.isBlank(r19)
            r3 = 28
            int r3 = r3 / r2
            r1 = r1 ^ r7
            if (r1 == r7) goto L54
            goto L56
        L3a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            o.RedBoxContentViewOpenStackFrameTask$onExtraCallbackWithResult r1 = o.RedBoxContentViewOpenStackFrameTask.Companion
            r1.onNavigationEvent(r15)
            boolean r1 = kotlin.text.StringsKt.isBlank(r19)
            if (r1 != 0) goto L56
        L54:
            o.getSWidth.asInterface = r8
        L56:
            o.getSWidth.onExtraCallbackWithResult = r2
            o.getSWidth.asBinder = r16
            java.lang.String r4 = ""
            r0 = r20
            r1 = r15
            r2 = r16
            r5 = r21
            android.content.Intent r0 = r0.onNavigationEvent(r1, r2, r4, r5)
            r1 = r18 ^ 1
            if (r1 == r7) goto L6d
        L6b:
            r13 = r0
            goto L7b
        L6d:
            int r1 = o.getSWidth.IAuthTabCallback_Parcel
            int r1 = r1 + 23
            int r2 = r1 % 128
            o.getSWidth.access000 = r2
            int r1 = r1 % r6
            android.content.Intent r0 = o.zzbq.onExtraCallbackWithResult(r0)
            goto L6b
        L7b:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 60
            r11 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r8 = r19
            r9 = r22
            onExtraCallbackWithResult(r0, r1, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.startActivity(r13)
            r15.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSWidth.IAuthTabCallback(android.app.Activity, long, boolean, java.lang.String, o.notifyVerticalEdgeReached, o.SecurityGuardLiteSecretInfoa, java.lang.String):void");
    }

    public static /* synthetic */ void onNavigationEvent(getSWidth getswidth, Activity activity, long j, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access000 + 79;
        int i4 = i3 % 128;
        IAuthTabCallback_Parcel = i4;
        if (i3 % 2 == 0 ? (i & 4) != 0 : (i & 4) != 0) {
            int i5 = i4 + 123;
            access000 = i5 % 128;
            bool = null;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
        }
        getswidth.onExtraCallback(activity, j, bool);
        int i7 = IAuthTabCallback_Parcel + 15;
        access000 = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void onExtraCallback(@NotNull Activity activity, long j, @Nullable Boolean bool) {
        Intent intentIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        if (getMaxScale.IAuthTabCallback.asInterface()) {
            int i4 = access000 + 117;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            intentIAuthTabCallback = PendingEnrollmentActivity.Companion.onExtraCallbackWithResult(activity, j);
        } else {
            intentIAuthTabCallback = CertifyGuestActivity.onExtraCallbackWithResult.IAuthTabCallback(CertifyGuestActivity.Companion, activity, j, 24L, null, bool, null, false, false, false, null, 1000, null);
        }
        activity.startActivity(zzbq.onExtraCallbackWithResult(intentIAuthTabCallback));
        activity.finish();
    }

    static /* synthetic */ void onExtraCallbackWithResult(getSWidth getswidth, Context context, long j, String str, Long l, boolean z, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        String str5;
        String str6;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback_Parcel + 45;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            str5 = null;
        } else {
            str5 = str;
        }
        Long l2 = (i & 8) != 0 ? null : l;
        boolean z2 = (i & 16) != 0 ? false : z;
        if ((i & 32) != 0) {
            int i4 = access000 + 71;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        getswidth.onExtraCallbackWithResult(context, j, str5, l2, z2, str6, (i & 64) != 0 ? null : str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(final android.content.Context r17, long r18, java.lang.String r20, java.lang.Long r21, boolean r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSWidth.onExtraCallbackWithResult(android.content.Context, long, java.lang.String, java.lang.Long, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static final Unit onWarmupCompleted(Context context, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            SubsamplingScaleImageViewOnAnimationEventListener.onNavigationEvent(setDetectableSize, context);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        SubsamplingScaleImageViewOnAnimationEventListener.onNavigationEvent(setDetectableSize, context);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 119;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 o.getSWidth$onExtraCallback) = (r1v4 o.getSWidth$onExtraCallback), (r1v10 o.getSWidth$onExtraCallback) binds: [B:8:0x001d, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r3) {
        /*
            r0 = 0
            r3 = r3[r0]
            o.getSWidth r3 = (o.getSWidth) r3
            r3 = 2
            int r1 = r3 % r3
            int r1 = o.getSWidth.IAuthTabCallback_Parcel
            int r1 = r1 + 61
            int r2 = r1 % 128
            o.getSWidth.access000 = r2
            int r1 = r1 % r3
            if (r1 != 0) goto L1b
            o.getSWidth$onExtraCallback r1 = o.getSWidth.onTransact
            r2 = 59
            int r2 = r2 / r0
            if (r1 == 0) goto L46
            goto L1f
        L1b:
            o.getSWidth$onExtraCallback r1 = o.getSWidth.onTransact
            if (r1 == 0) goto L46
        L1f:
            kotlin.jvm.functions.Function0 r1 = r1.onExtraCallback()
            if (r1 == 0) goto L46
            int r0 = o.getSWidth.IAuthTabCallback_Parcel
            int r0 = r0 + 47
            int r2 = r0 % 128
            o.getSWidth.access000 = r2
            int r0 = r0 % r3
            java.lang.Object r0 = r1.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            int r1 = o.getSWidth.access000
            int r1 = r1 + 39
            int r2 = r1 % 128
            o.getSWidth.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L46:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSWidth.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 63;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            asInterface = "";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = asInterface;
        asInterface = "";
        int i4 = i2 + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static abstract class onExtraCallback {
        private final String IAuthTabCallback;
        private final Function0<Boolean> onExtraCallback;

        public /* synthetic */ onExtraCallback(String str, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, function0);
        }

        private onExtraCallback(String str, Function0<Boolean> function0) {
            this.IAuthTabCallback = str;
            this.onExtraCallback = function0;
        }

        public final String onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        public final Function0<Boolean> onExtraCallback() {
            return this.onExtraCallback;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(getSWidth getswidth, long j, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = access000;
            int i4 = i3 + 105;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            long j2 = asBinder;
            int i5 = i3 + 71;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            j = j2;
        }
        getswidth.onNavigationEvent(j);
    }

    private static final Unit onExtraCallbackWithResult(long j, SetDetectableSize setDetectableSize) throws Throwable {
        Map mapOnExtraCallback;
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr = new Object[1];
            a(new int[]{353186329, 511586158, -967286277, 806454966, -365218626, -1146549771, -1130543083, -1999307487}, (Process.myPid() >> 68) + 120, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new int[]{353186329, 511586158, -967286277, 806454966, -365218626, -1146549771, -1130543083, -1999307487}, (Process.myPid() >> 22) + 16, objArr2);
            obj = objArr2[0];
        }
        mapOnExtraCallback.put(((String) obj).intern(), Long.valueOf(j));
        return Unit.INSTANCE;
    }

    public final void onNavigationEvent(final long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
            int i4 = access000 + 71;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (onExtraCallbackWithResult) {
                return;
            }
            ConvertByteArrayToFloatArray.onExtraCallback(1529297L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.GuestCertifyWrapper$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return getSWidth.onNavigationEvent(j, (SetDetectableSize) obj2);
                }
            }, 14, (Object) null);
            onExtraCallbackWithResult = true;
        }
    }

    public final boolean onExtraCallback() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(-1091048204, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1091048206, new Object[]{this}, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue();
    }

    public final void onExtraCallback(boolean z) {
        onExtraCallback(303192254, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -303192253, new Object[]{this, Boolean.valueOf(z)}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final void onNavigationEvent(@NotNull Activity activity, long j, @Nullable Boolean bool, boolean z, @Nullable String str, @Nullable String str2, boolean z2, @Nullable Intent intent, @NotNull String str3, @Nullable APMaxLenMode aPMaxLenMode, boolean z3, @NotNull String str4) {
        onExtraCallback(494421609, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -494421609, new Object[]{this, activity, Long.valueOf(j), bool, Boolean.valueOf(z), str, str2, Boolean.valueOf(z2), intent, str3, aPMaxLenMode, Boolean.valueOf(z3), str4}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    static void IAuthTabCallbackStub() {
        getInterfaceDescriptor = new int[]{1629379787, -1237871009, 896304473, -1441633728, -1729656638, -1979666324, -321378502, 292312786, 1920518543, 1805254088, -579735921, -182088332, 711286225, 812335337, -2106804890, 1932032021, 1093618606, 545238431};
    }
}
