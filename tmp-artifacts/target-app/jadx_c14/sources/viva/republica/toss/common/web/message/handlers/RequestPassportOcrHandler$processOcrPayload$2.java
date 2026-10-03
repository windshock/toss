package viva.republica.toss.common.web.message.handlers;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseRoundCornerProgressBarSavedState1;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access13800;
import o.castToByte;
import o.castToDate;
import o.findResAndMsg;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RequestPassportOcrHandler$processOcrPayload$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super JsonObject>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int[] onExtraCallback = {-38924552, -711471457, 2122089922, -573477556, 581142806, -737342121, 64094263, 2019430859, 2048791749, 1268325616, -1434097729, 7044446, 174294826, 1244744825, -643783483, 545645347, -928057121, 1584891082};
    private static int onNavigationEvent;
    final /* synthetic */ BaseRoundCornerProgressBarSavedState1.IAuthTabCallback $algorithm;
    final /* synthetic */ boolean $includeFullFrameImage;
    final /* synthetic */ boolean $includeImageFrames;
    final /* synthetic */ Boolean $isFakeIdCard;
    final /* synthetic */ int $maxImageFrames;
    final /* synthetic */ String $rsaKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestPassportOcrHandler$processOcrPayload$2(String str, boolean z, int i, Boolean bool, boolean z2, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, access13800<? super RequestPassportOcrHandler$processOcrPayload$2> access13800Var) {
        super(2, access13800Var);
        this.$rsaKey = str;
        this.$includeImageFrames = z;
        this.$maxImageFrames = i;
        this.$isFakeIdCard = bool;
        this.$includeFullFrameImage = z2;
        this.$algorithm = iAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Ref.ObjectRef objectRef, String str, boolean z, int i, Boolean bool, boolean z2, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, castToByte casttobyte) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(objectRef, str, z, i, bool, z2, iAuthTabCallback, casttobyte);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(objectRef, str, z, i, bool, z2, iAuthTabCallback, casttobyte);
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RequestPassportOcrHandler$processOcrPayload$2 requestPassportOcrHandler$processOcrPayload$2 = new RequestPassportOcrHandler$processOcrPayload$2(this.$rsaKey, this.$includeImageFrames, this.$maxImageFrames, this.$isFakeIdCard, this.$includeFullFrameImage, this.$algorithm, access13800Var);
        int i2 = onNavigationEvent + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return requestPassportOcrHandler$processOcrPayload$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super JsonObject> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return onExtraCallback(findresandmsg, access13800Var);
        }
        onExtraCallback(findresandmsg, access13800Var);
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super JsonObject> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onNavigationEvent + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return objInvokeSuspend;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i4 = -1469660336;
        char c = '0';
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 13;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 71 - TextUtils.indexOf("", c, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                    c = '0';
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
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int i9 = $10 + 99;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i11]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(i5, i5, i5)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 72, (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i11++;
                i5 = 0;
            }
            i2 = i5;
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
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 22252), 39 - TextUtils.indexOf("", "", 0, 0), 10300 - TextUtils.indexOf((CharSequence) "", '0'), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i12++;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - Color.blue(0)), 77 - TextUtils.lastIndexOf("", '0', 0, 0), KeyEvent.getDeadChar(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.label != 0) {
            Object[] objArr = new Object[1];
            a(new int[]{-649764423, -294563276, 1470780302, 476032214, 1187307881, 567219601, 419266568, -2031343986, 1138712879, 1696524432, -1814095574, 19952623, 362455330, 643273881, -1236772075, -1159574492, -1965832967, 74858248, 367962034, -2053492167, -86468624, -192180768, 1450820050, -493066283}, TextUtils.indexOf((CharSequence) "", '0') + 48, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        ResultKt.onNavigationEvent(obj);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new JsonObject();
        castToDate casttodate = castToDate.onWarmupCompleted;
        final String str = this.$rsaKey;
        final boolean z = this.$includeImageFrames;
        final int i3 = this.$maxImageFrames;
        final Boolean bool = this.$isFakeIdCard;
        final boolean z2 = this.$includeFullFrameImage;
        final BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback = this.$algorithm;
        casttodate.onExtraCallback(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$processOcrPayload$2$$ExternalSyntheticLambda0
            public final Object invoke(Object obj3) {
                return RequestPassportOcrHandler$processOcrPayload$2.onWarmupCompleted(objectRef, str, z, i3, bool, z2, iAuthTabCallback, (castToByte) obj3);
            }
        });
        Object obj3 = objectRef.element;
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(kotlin.jvm.internal.Ref.ObjectRef r27, java.lang.String r28, boolean r29, int r30, java.lang.Boolean r31, boolean r32, o.BaseRoundCornerProgressBarSavedState1.IAuthTabCallback r33, o.castToByte r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$processOcrPayload$2.onExtraCallbackWithResult(kotlin.jvm.internal.Ref$ObjectRef, java.lang.String, boolean, int, java.lang.Boolean, boolean, o.BaseRoundCornerProgressBarSavedState1$IAuthTabCallback, o.castToByte):kotlin.Unit");
    }
}
