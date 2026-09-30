package im.toss.global.features.leave.test;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode61;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.HttpDataSourceInvalidContentTypeException;
import o.HttpDataSourceInvalidResponseCodeException;
import o.PKCS58;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.makePFX_WINS;
import o.s3;

/* loaded from: classes.dex */
public final class GlobalLeaveTestActivity$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static final byte[] $$a;
    private static final int $$b = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback;
    private static char[] onExtraCallback;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    final /* synthetic */ long $amountMicros;
    final /* synthetic */ String $successMessage;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GlobalLeaveTestActivity this$0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback.$$a
            int r6 = r6 * 2
            int r1 = r6 + 11
            int r7 = r7 * 3
            int r7 = 102 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 10
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2c
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2c:
            int r8 = r8 + r4
            int r8 = r8 + 2
            int r7 = r7 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback.$$c(short, short, byte):java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalLeaveTestActivity$IAuthTabCallback(GlobalLeaveTestActivity globalLeaveTestActivity, String str, long j, access13800<? super GlobalLeaveTestActivity$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalLeaveTestActivity;
        this.$successMessage = str;
        this.$amountMicros = j;
    }

    public static native int y(int i);

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        GlobalLeaveTestActivity$IAuthTabCallback globalLeaveTestActivity$IAuthTabCallback = new GlobalLeaveTestActivity$IAuthTabCallback(this.this$0, this.$successMessage, this.$amountMicros, access13800Var);
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return globalLeaveTestActivity$IAuthTabCallback;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        int i4 = IAuthTabCallback + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        GlobalLeaveTestActivity$IAuthTabCallback globalLeaveTestActivity$IAuthTabCallbackCreate = create(findresandmsg, access13800Var);
        if (i3 != 0) {
            return globalLeaveTestActivity$IAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
        }
        globalLeaveTestActivity$IAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = -1776194565;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char onNavigationEvent = 8838;
        private static long onWarmupCompleted = 7798559133331975163L;
        final /* synthetic */ long $amountMicros$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ GlobalLeaveTestActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(access13800 access13800Var, GlobalLeaveTestActivity globalLeaveTestActivity, long j) {
            super(2, access13800Var);
            this.this$0 = globalLeaveTestActivity;
            this.$amountMicros$inlined = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var, this.this$0, this.$amountMicros$inlined);
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
            int i2 = 2 % 2;
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
                int i3 = $10 + 85;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
                int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
                makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
                cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
                cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 55;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            }
            String str = new String(cArr6);
            int i7 = $11 + 19;
            $10 = i7 % 128;
            if (i7 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i8 = 28 / 0;
                objArr[0] = str;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj3 = null;
            if (i2 != 0) {
                int i3 = onExtraCallback + 39;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 159954425 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{30544, 5332, 22477, 28942, 48742, 28290, 40405, 34834, 49089, 40902, 31690, 29212, 4467, 61033, 46636, 13535, 29226, 39539, 51028, 14017, 5133, 53485, 63957, 35876, 14297, 14243, 54484, 10460, 11017, 29702, 40197, 40739, 11113, 58431, 27897, 9677, 9255, 4849, 1888, 48316, 13686, 16394, 58727, 56507, 61845, 12191, 23450}, new char[]{0, 0, 0, 0}, new char[]{64168, 34997, 13065, 39424}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                obj2 = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                if (objOnWarmupCompleted == null) {
                    return objOnWarmupCompleted;
                }
                obj2 = null;
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj2;
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            int i5 = onExtraCallback + 93;
            onExtraCallbackWithResult = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    baseApiResponse.onTransact();
                    obj3.hashCode();
                    throw null;
                }
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact != null) {
                    return (Boolean) objOnTransact;
                }
                Object[] objArr2 = new Object[1];
                a((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 321309801 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{41876, 45800, 61539, 29447, 2010, 53369, 2927, 58488, 47716, 34040, 3402, 50215, 52402, 36754, 17094, 32792, 43991, 52559, 52551, 57859, 6328, 38169, 22116, 48976, 'Q', 54830, 1767, 11264, 31119, 29616, 3374, 3317, 5440, 11514, 60470, 33018, 9032, 61983, 24707, 1616, 62329, 57968, 52360, 16595, 19097, 20076, 13917, 50952, 55495, 43758, 16607}, new char[]{0, 0, 0, 0}, new char[]{26985, 9932, 1299, 63764}, objArr2);
                throw new NullPointerException(((String) objArr2[0]).intern());
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(Boolean.class, Object.class) || Intrinsics.areEqual(Boolean.class, Unit.class)) {
                    return Unit.INSTANCE;
                }
                int i6 = onExtraCallbackWithResult + 31;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                throw apiErrorOnExtraCallbackWithResult;
            }
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) {
        char[] cArr2;
        int i2;
        int i3;
        int i4;
        char[] cArr3;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr4 = onExtraCallback;
        int i8 = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = $10 + 77;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr5[i9] = PKCS58.onNavigationEvent.z(cArr4[i9]);
            }
            cArr2 = cArr5;
        } else {
            cArr2 = cArr4;
        }
        char cZ = PKCS58.onNavigationEvent.z(onWarmupCompleted);
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i12 = i - 1;
            cArr6[i12] = (char) (cArr[i12] - b);
            i2 = i12;
        } else {
            i2 = i;
        }
        int i13 = 1;
        if (i2 > 1) {
            int i14 = $11 + 81;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i13];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i13] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = i13;
                    i4 = i2;
                    cArr3 = cArr6;
                    i5 = i8;
                } else {
                    i3 = i13;
                    i4 = i2;
                    cArr3 = cArr6;
                    i5 = i8;
                    if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                        int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                    } else {
                        int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                cArr6 = cArr3;
                i6 = 2;
                i13 = i3;
                i2 = i4;
                i8 = i5;
            }
        }
        int i21 = i6;
        char[] cArr7 = cArr6;
        int i22 = i8;
        int i23 = $11 + 13;
        $10 = i23 % 128;
        int i24 = i23 % i21;
        for (int i25 = i22; i25 < i; i25++) {
            cArr7[i25] = (char) (cArr7[i25] ^ 13722);
        }
        objArr[i22] = new String(cArr7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (r11 != r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ee, code lost:
    
        if (im.toss.global.features.leave.test.GlobalLeaveTestActivity.IAuthTabCallback(r4, r10) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        r11 = im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback.onNavigationEvent + 37;
        im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback.IAuthTabCallback = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f9, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    static {
        byte[] bArr = {34, -66, 77, 18, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
        $$a = bArr;
        ClassLoader parent = GlobalLeaveTestActivity$IAuthTabCallback.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] - 1);
            byte b2 = b;
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
            onNavigationEvent = 0;
            IAuthTabCallback = 1;
            onExtraCallback = new char[]{64986, 64991, 17615, 64961, 15143, 13763, 64960, 14343, 64980, 64978, 64915, 11871, 64925, 64979, 64990, 64987, 64916, 18184, 64967, 64964, 64984, 15051, 10299, 64983, 64989, 64976, 13734, 13427, 12043, 64965, 64966, 64988, 64982, 64977, 64981, 10475};
            onWarmupCompleted = (char) 51247;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
