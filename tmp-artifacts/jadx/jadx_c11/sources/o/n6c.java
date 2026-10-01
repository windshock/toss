package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n6c {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int[] asInterface = null;
    private static int onTransact = 1;
    private final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow IAuthTabCallback;
    private final o2 onExtraCallback;
    private final o3ExternalSyntheticLambda0 onExtraCallbackWithResult;
    private final ebExternalSyntheticLambda0 onNavigationEvent;
    private final getBillingPeriod onWarmupCompleted;

    static {
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        int i = onTransact + 75;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public n6c(@NotNull r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow, @NotNull getBillingPeriod getbillingperiod, @NotNull o3ExternalSyntheticLambda0 o3externalsyntheticlambda0, @NotNull o2 o2Var, @NotNull ebExternalSyntheticLambda0 ebexternalsyntheticlambda0) {
        Intrinsics.checkNotNullParameter(r8lambdahdae14rp_yfkbgnstt68qt10iow, "");
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        Intrinsics.checkNotNullParameter(o3externalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(o2Var, "");
        Intrinsics.checkNotNullParameter(ebexternalsyntheticlambda0, "");
        this.IAuthTabCallback = r8lambdahdae14rp_yfkbgnstt68qt10iow;
        this.onWarmupCompleted = getbillingperiod;
        this.onExtraCallbackWithResult = o3externalsyntheticlambda0;
        this.onExtraCallback = o2Var;
        this.onNavigationEvent = ebexternalsyntheticlambda0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public n6c(@NotNull r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow, @NotNull getBillingPeriod getbillingperiod, @NotNull ebExternalSyntheticLambda0 ebexternalsyntheticlambda0) {
        this(r8lambdahdae14rp_yfkbgnstt68qt10iow, getbillingperiod, n8.onExtraCallbackWithResult, n5ExternalSyntheticLambda0.onNavigationEvent, ebexternalsyntheticlambda0);
        Intrinsics.checkNotNullParameter(r8lambdahdae14rp_yfkbgnstt68qt10iow, "");
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        Intrinsics.checkNotNullParameter(ebexternalsyntheticlambda0, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r2 = new o.o3(onExtraCallback(r6.getInterfaceDescriptor()), onWarmupCompleted(r6.access000(), null, null, false));
        r6 = o.n6c.asBinder + 95;
        o.n6c.IAuthTabCallbackStub = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r6.onExtraCallbackWithResult() != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r6.onExtraCallbackWithResult() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o3 onExtraCallback(@NotNull n3 n3Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(n3Var, "");
            int i3 = 15 / 0;
        } else {
            Intrinsics.checkNotNullParameter(n3Var, "");
        }
    }

    public final n7 onExtraCallback(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        n7 n7VarOnWarmupCompleted = onWarmupCompleted(str, this.onExtraCallback.onWarmupCompleted(), null, false);
        int i4 = asBinder + 87;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return n7VarOnWarmupCompleted;
        }
        throw null;
    }

    public final n7 onWarmupCompleted(@NotNull String str, @Nullable Long l, @Nullable Date date, boolean z) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4 r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4OnNavigationEvent = onNavigationEvent();
        n7 n7Var = new n7(str, this.onExtraCallbackWithResult.onNavigationEvent(str, r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4OnNavigationEvent.IAuthTabCallback(), r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4OnNavigationEvent.onExtraCallbackWithResult(), r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4OnNavigationEvent.onWarmupCompleted()), r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4OnNavigationEvent.IAuthTabCallback(), r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4OnNavigationEvent.onExtraCallbackWithResult(), r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4OnNavigationEvent.onWarmupCompleted(), l, date, this.onNavigationEvent.asInterface(), this.onNavigationEvent.IAuthTabCallbackStub(), z);
        int i2 = IAuthTabCallbackStub + 61;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return n7Var;
    }

    private final r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4 onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        String code = this.onWarmupCompleted.onExtraCallbackWithResult().getCode();
        String strOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new int[]{-1243474010, -517426681}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, objArr);
        r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4 r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4 = new r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4(code, ((String) objArr[0]).intern(), strOnWarmupCompleted);
        int i2 = IAuthTabCallbackStub + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4;
    }

    static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = asInterface;
        int i5 = -1469660336;
        int i6 = 16;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 67;
                $11 = i9 % 128;
                if (i9 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> i6), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 71, 8848 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 72 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                i6 = 16;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = asInterface;
        char c = '0';
        if (iArr5 != null) {
            int i10 = $10 + 87;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                try {
                    Object[] objArr4 = new Object[1];
                    objArr4[i7] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror(c)), TextUtils.indexOf("", "", i7) + 72, 8848 - (TypedValue.complexToFloat(i7) > 0.0f ? 1 : (TypedValue.complexToFloat(i7) == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i12++;
                    i5 = -1469660336;
                    c = '0';
                    i7 = 0;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
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
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $10 + 63;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 22252), 39 - View.resolveSizeAndState(0, 0, 0), 10301 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i13 += 123;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 22252), (ViewConfiguration.getTouchSlop() >> 8) + 39, 10301 - (Process.myTid() >> 22), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i13++;
                }
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 4034), TextUtils.indexOf((CharSequence) "", '0', 0) + 79, KeyEvent.normalizeMetaState(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        asInterface = new int[]{1880237286, -1166823076, -717199261, -2030755026, -1722597003, -1674444850, -169772321, -1934109183, 1041106975, -1832721711, 2112692363, -981134481, -1899346919, 2068078712, 666004716, -1211114897, 1682290134, -823908836};
    }
}
