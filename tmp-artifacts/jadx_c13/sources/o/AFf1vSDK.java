package o;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1vSDK {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final setContentInsetsRelative IAuthTabCallback;
    private final findResAndMsg onExtraCallback;
    private Integer onNavigationEvent;

    public AFf1vSDK(@NotNull setContentInsetsRelative setcontentinsetsrelative, @NotNull findResAndMsg findresandmsg) {
        Intrinsics.checkNotNullParameter(setcontentinsetsrelative, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.IAuthTabCallback = setcontentinsetsrelative;
        this.onExtraCallback = findresandmsg;
    }

    public static final /* synthetic */ setContentInsetsRelative onWarmupCompleted(AFf1vSDK aFf1vSDK) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        setContentInsetsRelative setcontentinsetsrelative = aFf1vSDK.IAuthTabCallback;
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return setcontentinsetsrelative;
    }

    public final void onWarmupCompleted(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, int i, @NotNull List<AFf1wSDKAFa1tSDK> list, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Integer num = this.onNavigationEvent;
        if (num != null) {
            int i4 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                num.intValue();
                throw null;
            }
            if (num.intValue() == i2) {
                return;
            }
        }
        this.onNavigationEvent = Integer.valueOf(i2);
        AFf1wSDKAFa1tSDK aFf1wSDKAFa1tSDK = (AFf1wSDKAFa1tSDK) CollectionsKt___CollectionsKt.getOrNull(list, i2);
        if (aFf1wSDKAFa1tSDK != null) {
            int i5 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                onExtraCallbackWithResult(aFf1wSDKAFa1tSDK, r8lambdanm9dm2eewl4vrptnjmesfjqky4, i, list);
                this.IAuthTabCallback.IAuthTabCallbackStub();
                throw null;
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(aFf1wSDKAFa1tSDK, r8lambdanm9dm2eewl4vrptnjmesfjqky4, i, list);
            if (this.IAuthTabCallback.IAuthTabCallbackStub() != iOnExtraCallbackWithResult) {
                onLoadStarted.onExtraCallback(this.onExtraCallback, null, null, new onNavigationEvent(iOnExtraCallbackWithResult, null), 3, null);
                int i6 = onWarmupCompleted + 27;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ int $calculatedOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(int i, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$calculatedOffset = i;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 44 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = AFf1vSDK.this.new onNavigationEvent(this.$calculatedOffset, access13800Var);
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i4 = onExtraCallback + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
            }
            return objIAuthTabCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                setContentInsetsRelative setcontentinsetsrelativeOnWarmupCompleted = AFf1vSDK.onWarmupCompleted(AFf1vSDK.this);
                int i3 = this.$calculatedOffset;
                this.label = 1;
                if (setContentInsetsRelative.onExtraCallback(setcontentinsetsrelativeOnWarmupCompleted, i3, (onItemClicked) null, this, 2, (Object) null) == objOnExtraCallback) {
                    int i4 = onExtraCallback + 17;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onWarmupCompleted + 57;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i6 = 90 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final int onExtraCallbackWithResult(AFf1wSDKAFa1tSDK aFf1wSDKAFa1tSDK, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, int i, List<AFf1wSDKAFa1tSDK> list) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(((AFf1wSDKAFa1tSDK) CollectionsKt___CollectionsKt.last((List) list)).onNavigationEvent()) + i;
        int iIAuthTabCallback = iOnExtraCallbackWithResult - this.IAuthTabCallback.IAuthTabCallback();
        int iCoerceIn = RangesKt___RangesKt.coerceIn(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(aFf1wSDKAFa1tSDK.IAuthTabCallback()) - ((iIAuthTabCallback / 2) - (r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(aFf1wSDKAFa1tSDK.onExtraCallback()) / 2)), 0, RangesKt___RangesKt.coerceAtLeast(iOnExtraCallbackWithResult - iIAuthTabCallback, 0));
        int i5 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return iCoerceIn;
    }
}
