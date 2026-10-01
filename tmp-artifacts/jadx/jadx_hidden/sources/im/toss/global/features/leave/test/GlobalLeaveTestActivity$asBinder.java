package im.toss.global.features.leave.test;

import android.util.TypedValue;
import android.view.Gravity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TimelineExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.tryTriggerOnStart;

/* loaded from: classes.dex */
public final class GlobalLeaveTestActivity$asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super GlobalLeaveTestPointBalanceResponse>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = -6532577960791146825L;
    private static int onWarmupCompleted = 1;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ GlobalLeaveTestActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalLeaveTestActivity$asBinder(access13800 access13800Var, GlobalLeaveTestActivity globalLeaveTestActivity) {
        super(2, access13800Var);
        this.this$0 = globalLeaveTestActivity;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super GlobalLeaveTestPointBalanceResponse> access13800Var) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GlobalLeaveTestActivity$asBinder globalLeaveTestActivity$asBinderCreate = create(findresandmsg, access13800Var);
        if (i3 != 0) {
            globalLeaveTestActivity$asBinderCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = globalLeaveTestActivity$asBinderCreate.invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        GlobalLeaveTestActivity$asBinder globalLeaveTestActivity$asBinder = new GlobalLeaveTestActivity$asBinder(access13800Var, this.this$0);
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return globalLeaveTestActivity$asBinder;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super GlobalLeaveTestPointBalanceResponse> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(findresandmsg, access13800Var);
        }
        Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
        int i3 = 50 / 0;
        return objIAuthTabCallback;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 73;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 13;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onExtraCallbackWithResult);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            this.L$0 = access15400.onNavigationEvent(this);
            this.I$0 = 0;
            this.label = 1;
            if (objOnWarmupCompleted == null) {
                int i3 = onWarmupCompleted + 5;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 96 / 0;
                }
                return objOnWarmupCompleted;
            }
            obj = null;
        } else {
            if (i2 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{60976, 7308, 61011, 43558, 39579, 6486, 41276, 35782, 63740, '_', 34859, 45734, 50127, 12141, 37645, 42465, 43649, 22174, 64121, 53065, 46496, 32133, 52581, 63004, 40131, 25769, 54353, 6518, 26527, 37798, 16054, 'T', 20011, 47816, 425, 11033, 22896, 41440, 26777, 21118, 8212, 51371, 29575, 17801, 2938, 62992, 23293, 27782, 4733, 7485, 44505}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i5 = onExtraCallback + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
        }
        BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult != null) {
                throw apiErrorExtraCallbackWithResult;
            }
            int i7 = onExtraCallback + 93;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            if (i8 == 0) {
                int i9 = 64 / 0;
            }
            throw apiErrorOnExtraCallbackWithResult;
        }
        int i10 = onExtraCallback + 111;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object objOnTransact = baseApiResponse.onTransact();
            if (objOnTransact != null) {
                return (GlobalLeaveTestPointBalanceResponse) objOnTransact;
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{3597, 59957, 3683, 12840, 61535, 61435, 14642, 57602, 6337, 63217, 4139, 55340, 9147, 55753, 2834, 53110, 19115, 41007, 25138, 42441, 21980, 35629, 21882, 40094, 31973, 37389, 19482, 29692, 34794, 25880, 42747, 27272, 44556, 19574, 39342, 16858, 47385, 22359, 61582, 14507, 49249, 15963, 60295, 12044, 60225, 169, 49909, 1605, 61959, 60301, 13790, 64869, 7551, 62111, 11458, 54320, 10135, 50663, 1851, 51974, 20112, 44260, 32275, 41525, 23031, 47062, 20743, 39227, 24763, 40491, 18480, 36826, 35780, 24865, 41854, 26284, 37586, 18442, 39497, 24052, 48616, 21350, 35998, 13455, 50204, 14952, 59307, 11178, 61236, 3409, 56974, 642, 63018, 5215, 12792, 63826, 379, 65211, 10478, 53339, 10307, 49549, 987, 51036, 13156, 43137, 31450, 48653, 23963, 46069, 27939}, 1 - Gravity.getAbsoluteGravity(0, 0), objArr2);
            throw new NullPointerException(((String) objArr2[0]).intern());
        } catch (NullPointerException e) {
            if (!Intrinsics.areEqual(GlobalLeaveTestPointBalanceResponse.class, Object.class)) {
                int i12 = onExtraCallback + 97;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                if (!Intrinsics.areEqual(GlobalLeaveTestPointBalanceResponse.class, Unit.class)) {
                    int i14 = onWarmupCompleted + 47;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult2 = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult2.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult2;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
