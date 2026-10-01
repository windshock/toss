package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.GeckoHubImp;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isGutterDrag {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = isGutterDrag.this.onExtraCallback(this);
            int i4 = onWarmupCompleted + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = isGutterDrag.this.onNavigationEvent(this);
            int i4 = onExtraCallback + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    static {
        int i = onExtraCallback + 1;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public isGutterDrag() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull access13800<? super Integer> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i5 = i3 + 47;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = ((IAuthTabCallback) access13800Var).label;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i7 = iAuthTabCallback.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i7 - 2147483648;
                int i8 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i10 = iAuthTabCallback.label;
        if (i10 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            Integer numOnNavigationEvent = access14000.onNavigationEvent(20);
            iAuthTabCallback.label = 1;
            objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "ads.log.retryCount", numOnNavigationEvent, iAuthTabCallback}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i11 = IAuthTabCallback;
                int i12 = i11 + 39;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i11 + 75;
                onExtraCallbackWithResult = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 60 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        return access14000.onNavigationEvent(RangesKt.coerceAtLeast(((Number) objOnExtraCallback).intValue(), 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull access13800<? super Integer> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!(access13800Var instanceof onExtraCallbackWithResult)) {
            onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
        } else {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    onextracallbackwithresult.label = i4 % Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i4 - 2147483648;
                }
            }
        }
        Object objOnExtraCallback = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onextracallbackwithresult.label;
        if (i6 != 0) {
            int i7 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0 ? i6 != 1 : i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            Integer numOnNavigationEvent = access14000.onNavigationEvent(4);
            onextracallbackwithresult.label = 1;
            objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "ads.log.maxConcurrentSendCount", numOnNavigationEvent, onextracallbackwithresult}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i8 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 11 / 0;
                }
                return objOnWarmupCompleted;
            }
        }
        return access14000.onNavigationEvent(RangesKt.coerceIn(((Number) objOnExtraCallback).intValue(), 1, 8));
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
