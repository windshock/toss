package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class enableCppPropsIteratorSetter$onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
    final /* synthetic */ GraniteBrownfieldModule_closeView $password;
    final /* synthetic */ asArray $passwordFormat;
    int label;
    private static final byte[] $$a = {77, ISO7816.INS_GET_RESPONSE, 102, ISOFileInfo.DATA_BYTES1};
    private static final int $$b = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onNavigationEvent = 1;
    private static int onExtraCallback = 478309014;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[asArray.values().length];
            try {
                iArr[asArray.PW_4_DIGIT_1_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[asArray.PW_6_DIGIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 1 - (s * 3);
        int i4 = 3 - (b * 2);
        int i5 = (b2 * 4) + 105;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            i2 = 0;
            int i8 = (-i4) + i7;
            i = i2;
            int i9 = i6;
            i5 = i8;
            i4 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            int i10 = i4 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i11 = i5;
            i6 = i10;
            i4 = bArr[i10];
            i7 = i11;
            int i82 = (-i4) + i7;
            i = i2;
            int i92 = i6;
            i5 = i82;
            i4 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            int i102 = i4 + 1;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            int i1022 = i4 + 1;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enableCppPropsIteratorSetter$onTransact(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, access13800<? super enableCppPropsIteratorSetter$onTransact> access13800Var) {
        super(2, access13800Var);
        this.$password = graniteBrownfieldModule_closeView;
        this.$passwordFormat = asarray;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        enableCppPropsIteratorSetter$onTransact enablecpppropsiteratorsetter_ontransact = new enableCppPropsIteratorSetter$onTransact(this.$password, this.$passwordFormat, access13800Var);
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return enablecpppropsiteratorsetter_ontransact;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onWarmupCompleted + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2 A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:6:0x001d, B:14:0x005d, B:16:0x0073, B:17:0x0097, B:22:0x00f5, B:45:0x01be, B:24:0x00fc, B:26:0x0102, B:27:0x0103, B:28:0x0104, B:30:0x011a, B:31:0x0142, B:36:0x01a4, B:38:0x01aa, B:40:0x01b0, B:41:0x01b1, B:42:0x01b2, B:43:0x01b7, B:44:0x01b8, B:9:0x0030, B:32:0x0148, B:34:0x0162, B:35:0x019c, B:18:0x009d, B:20:0x00b7, B:21:0x00ed), top: B:58:0x001b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte[] bArrOnWarmupCompleted;
        int i;
        String strOnWarmupCompleted;
        int i2 = 2 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = onWarmupCompleted + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ResultKt.onNavigationEvent(obj);
        try {
            if (i4 == 0) {
                bArrOnWarmupCompleted = this.$password.onWarmupCompleted();
                i = IAuthTabCallback.onExtraCallback[this.$passwordFormat.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = onWarmupCompleted + 63;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        byte[] bArrOnNavigationEvent = EstimateFaceQualityFromBGRImage.onNavigationEvent(EstimateFaceQualityFromBGRImage.IAuthTabCallback, bArrOnWarmupCompleted, true, 2, (Object) null);
                        byte[] bArrIAuthTabCallback = getPageContainer.IAuthTabCallback(setTestMode.onExtraCallback.writeTypedObject());
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
                        }
                        Object obj2 = ((Field) objOnExtraCallback).get(null);
                        try {
                            Object[] objArr = {bArrOnNavigationEvent, bArrIAuthTabCallback, 84, 310000};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1280300143);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29, 24888 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2098146047, false, "onNavigationEvent", new Class[]{byte[].class, byte[].class, Integer.TYPE, Integer.TYPE});
                            }
                            strOnWarmupCompleted = Page.onExtraCallbackWithResult((byte[]) ((Method) objOnExtraCallback2).invoke(obj2, objArr), 1, 0, (Object) null);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        byte[] bArrOnNavigationEvent2 = EstimateFaceQualityFromBGRImage.onNavigationEvent(EstimateFaceQualityFromBGRImage.IAuthTabCallback, bArrOnWarmupCompleted, false, 2, (Object) null);
                        byte[] bArrIAuthTabCallback2 = getPageContainer.IAuthTabCallback(setTestMode.onExtraCallback.writeTypedObject());
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29, Gravity.getAbsoluteGravity(0, 0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
                        }
                        Object obj3 = ((Field) objOnExtraCallback3).get(null);
                        try {
                            Object[] objArr2 = {bArrOnNavigationEvent2, bArrIAuthTabCallback2, 32, 310000};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1280300143);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), 30 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24886, 2098146047, false, "onNavigationEvent", new Class[]{byte[].class, byte[].class, Integer.TYPE, Integer.TYPE});
                            }
                            strOnWarmupCompleted = Page.onExtraCallbackWithResult((byte[]) ((Method) objOnExtraCallback4).invoke(obj3, objArr2), 0, 1, (Object) null);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                }
                strOnWarmupCompleted = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onWarmupCompleted(bArrOnWarmupCompleted, false);
            } else {
                bArrOnWarmupCompleted = this.$password.onWarmupCompleted();
                i = IAuthTabCallback.onExtraCallback[this.$passwordFormat.ordinal()];
                if (i == 1) {
                    strOnWarmupCompleted = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onWarmupCompleted(bArrOnWarmupCompleted, false);
                } else if (i == 2) {
                }
            }
            onPageHide.IAuthTabCallback(bArrOnWarmupCompleted);
            return strOnWarmupCompleted;
        } catch (Throwable th3) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr3 = new Object[1];
            a(12 - KeyEvent.normalizeMetaState(0), 3 - ExpandableListView.getPackedPositionType(0L), new char[]{11, 0, 3, 65514, 65532, 65530, '\f', '\t', 0, 11, 16, 65516}, false, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 296, objArr3);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, ((String) objArr3[0]).intern(), "getLoginPasswordHash failed", th3, (Map) null, 8, (Object) null);
            if (!(!(th3 instanceof UnsatisfiedLinkError))) {
                int i6 = onWarmupCompleted + 59;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    zzat.onNavigationEvent().onExtraCallback();
                    throw null;
                }
                zzat.onNavigationEvent().onExtraCallback();
            }
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 23 - (ViewConfiguration.getTapTimeout() >> 16), 10278 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 56, 2167 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 115;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i9 = $11 + 35;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $10 + 33;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback + i];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 12843), 55 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 2167 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        j = 0;
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12842), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55, 2167 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    } else {
                        j = 0;
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
