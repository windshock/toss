package im.toss.global.features.leave.test;

import android.view.View;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;

/* loaded from: classes.dex */
final class GlobalLeaveTestActivity$onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted;
    int label;
    final /* synthetic */ GlobalLeaveTestActivity this$0;
    private static char[] onExtraCallback = {32476, 32478, 32459, 32415, 32451, 32456, 32400, 32461, 32466, 32460, 32450, 32458, 32477, 32465, 32470, 32457, 32449, 32468, 32448, 32471};
    private static int onExtraCallbackWithResult = -1184333953;
    private static boolean onNavigationEvent = true;
    private static boolean IAuthTabCallback = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalLeaveTestActivity$onExtraCallbackWithResult(GlobalLeaveTestActivity globalLeaveTestActivity, access13800<? super GlobalLeaveTestActivity$onExtraCallbackWithResult> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalLeaveTestActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        GlobalLeaveTestActivity$onExtraCallbackWithResult globalLeaveTestActivity$onExtraCallbackWithResult = new GlobalLeaveTestActivity$onExtraCallbackWithResult(this.this$0, access13800Var);
        int i2 = IAuthTabCallbackStub + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
        return globalLeaveTestActivity$onExtraCallbackWithResult;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
        int i3 = onWarmupCompleted + 13;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        GlobalLeaveTestActivity$onExtraCallbackWithResult globalLeaveTestActivity$onExtraCallbackWithResultCreate = create(findresandmsg, access13800Var);
        if (i3 != 0) {
            return globalLeaveTestActivity$onExtraCallbackWithResultCreate.invokeSuspend(Unit.INSTANCE);
        }
        globalLeaveTestActivity$onExtraCallbackWithResultCreate.invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = $10 + 31;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 101;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr3[i5] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i5]);
                } else {
                    cArr3[i5] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i5]);
                    i5++;
                }
            }
            cArr2 = cArr3;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onExtraCallbackWithResult);
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i7 = $10 + 123;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] * iY);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
            }
            Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
        }
        objArr[0] = new String(cArr6);
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            access14300.onWarmupCompleted();
            obj2.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            GlobalLeaveTestActivity globalLeaveTestActivity = this.this$0;
            this.label = 1;
            if (GlobalLeaveTestActivity.IAuthTabCallback(globalLeaveTestActivity, this) == objOnWarmupCompleted) {
                int i4 = IAuthTabCallbackStub + 59;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 77 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, View.combineMeasuredStates(0, 0) + 127, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i6 = onWarmupCompleted + 35;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }
}
