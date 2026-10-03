package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactNativeApplicationEntryPoint {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReactNativeApplicationEntryPoint[] $VALUES;
    public static final ReactNativeApplicationEntryPoint FAILED;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final ReactNativeApplicationEntryPoint REFUNDED;
    public static final ReactNativeApplicationEntryPoint REFUND_FAILED;
    public static final ReactNativeApplicationEntryPoint SUCCESS;
    private static int asBinder = 1;
    private static int asInterface;
    private static boolean onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;

    private static final /* synthetic */ ReactNativeApplicationEntryPoint[] $values() {
        ReactNativeApplicationEntryPoint[] reactNativeApplicationEntryPointArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            ReactNativeApplicationEntryPoint reactNativeApplicationEntryPoint = SUCCESS;
            ReactNativeApplicationEntryPoint reactNativeApplicationEntryPoint2 = FAILED;
            ReactNativeApplicationEntryPoint reactNativeApplicationEntryPoint3 = REFUNDED;
            ReactNativeApplicationEntryPoint reactNativeApplicationEntryPoint4 = REFUND_FAILED;
            reactNativeApplicationEntryPointArr = new ReactNativeApplicationEntryPoint[5];
            reactNativeApplicationEntryPointArr[0] = reactNativeApplicationEntryPoint;
            reactNativeApplicationEntryPointArr[1] = reactNativeApplicationEntryPoint2;
            reactNativeApplicationEntryPointArr[2] = reactNativeApplicationEntryPoint3;
            reactNativeApplicationEntryPointArr[4] = reactNativeApplicationEntryPoint4;
        } else {
            reactNativeApplicationEntryPointArr = new ReactNativeApplicationEntryPoint[]{SUCCESS, FAILED, REFUNDED, REFUND_FAILED};
        }
        int i4 = i2 + 91;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return reactNativeApplicationEntryPointArr;
    }

    public static EnumEntries<ReactNativeApplicationEntryPoint> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<ReactNativeApplicationEntryPoint> enumEntries = $ENTRIES;
        int i5 = i3 + 103;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static ReactNativeApplicationEntryPoint valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ReactNativeApplicationEntryPoint reactNativeApplicationEntryPoint = (ReactNativeApplicationEntryPoint) Enum.valueOf(ReactNativeApplicationEntryPoint.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return reactNativeApplicationEntryPoint;
    }

    public static ReactNativeApplicationEntryPoint[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactNativeApplicationEntryPoint[] reactNativeApplicationEntryPointArr = $VALUES;
        if (i3 == 0) {
            return (ReactNativeApplicationEntryPoint[]) reactNativeApplicationEntryPointArr.clone();
        }
        throw null;
    }

    private ReactNativeApplicationEntryPoint(String str, int i) {
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -127, -124, -125, -125, -126, -127}, 126 - TextUtils.lastIndexOf("", '0', 0), objArr);
        SUCCESS = new ReactNativeApplicationEntryPoint(((String) objArr[0]).intern(), 0);
        FAILED = new ReactNativeApplicationEntryPoint("FAILED", 1);
        REFUNDED = new ReactNativeApplicationEntryPoint("REFUNDED", 2);
        REFUND_FAILED = new ReactNativeApplicationEntryPoint("REFUND_FAILED", 3);
        ReactNativeApplicationEntryPoint[] reactNativeApplicationEntryPointArr$values = $values();
        $VALUES = reactNativeApplicationEntryPointArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(reactNativeApplicationEntryPointArr$values);
        int i = asInterface + 21;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public final boolean needsDelete() {
        int i = 2 % 2;
        if (this == SUCCESS || this == REFUNDED) {
            return true;
        }
        int i2 = IAuthTabCallbackStub + 69;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean needsCorrectBalance() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this != FAILED) {
            return false;
        }
        int i4 = i3 + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5 == o.ReactNativeApplicationEntryPoint.REFUND_FAILED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5 == o.ReactNativeApplicationEntryPoint.REFUND_FAILED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 69;
        o.ReactNativeApplicationEntryPoint.IAuthTabCallbackStub = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean needsForceRefund() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ReactNativeApplicationEntryPoint.IAuthTabCallback
            int r2 = r1 + 55
            int r3 = r2 % 128
            o.ReactNativeApplicationEntryPoint.IAuthTabCallbackStub = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            o.ReactNativeApplicationEntryPoint r2 = o.ReactNativeApplicationEntryPoint.REFUND_FAILED
            r4 = 66
            int r4 = r4 / r3
            if (r5 != r2) goto L2b
            goto L1b
        L17:
            o.ReactNativeApplicationEntryPoint r2 = o.ReactNativeApplicationEntryPoint.REFUND_FAILED
            if (r5 != r2) goto L2b
        L1b:
            int r1 = r1 + 69
            int r2 = r1 % 128
            o.ReactNativeApplicationEntryPoint.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = 0
            r0.hashCode()
            throw r0
        L2b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ReactNativeApplicationEntryPoint.needsForceRefund():boolean");
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
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
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(j)), 77 - KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionGroup(j) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
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
            int i4 = $11 + 3;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 75 - (ViewConfiguration.getTapTimeout() >> 16), 16037 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (!onExtraCallbackWithResult) {
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 75;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 63 - TextUtils.indexOf("", ""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 103;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i11 = $10 + 109;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i13 = $10 + 81;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] % iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), Process.getGidForName("") + 64, 12214 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), ExpandableListView.getPackedPositionGroup(0L) + 63, 12214 - ExpandableListView.getPackedPositionGroup(0L), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            i6 = 1052772399;
        }
        String str = new String(cArr6);
        int i14 = $10 + 37;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{32476, 32466, 32428, 32418};
        onNavigationEvent = -1184333969;
        onExtraCallback = true;
        onExtraCallbackWithResult = true;
    }
}
