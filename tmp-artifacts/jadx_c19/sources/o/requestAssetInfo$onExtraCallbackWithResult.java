package o;

import com.bytedance.sdk.openadsdk.wwx.lt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class requestAssetInfo$onExtraCallbackWithResult implements IAnimation<getIconPaddingTop> {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ IAnimation IAuthTabCallback;
    final /* synthetic */ requestAssetInfo onExtraCallbackWithResult;

    /* renamed from: o.requestAssetInfo$onExtraCallbackWithResult$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements setRipple {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ requestAssetInfo onExtraCallback;
        final /* synthetic */ setRipple onExtraCallbackWithResult;

        /* renamed from: o.requestAssetInfo$onExtraCallbackWithResult$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(access13800 access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                Object objEmit = AnonymousClass2.this.emit(null, this);
                int i5 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return objEmit;
            }
        }

        public AnonymousClass2(setRipple setripple, requestAssetInfo requestassetinfo) {
            this.onExtraCallbackWithResult = setripple;
            this.onExtraCallback = requestassetinfo;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, access13800 access13800Var) {
            AnonymousClass1 anonymousClass1;
            int i2 = 2 % 2;
            if (access13800Var instanceof AnonymousClass1) {
                int i3 = onNavigationEvent + 61;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                anonymousClass1 = (AnonymousClass1) access13800Var;
                int i5 = anonymousClass1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    int i6 = onNavigationEvent + 107;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    anonymousClass1.label = i5 - 2147483648;
                } else {
                    anonymousClass1 = new AnonymousClass1(access13800Var);
                    int i8 = onNavigationEvent + 43;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            Object obj2 = anonymousClass1.result;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i10 = anonymousClass1.label;
            if (i10 == 0) {
                ResultKt.onNavigationEvent(obj2);
                setRipple setripple = this.onExtraCallbackWithResult;
                getIconPaddingTop geticonpaddingtop = (getIconPaddingTop) requestAssetInfo.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 684536738, -684536738, new Object[]{this.onExtraCallback}, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
                anonymousClass1.L$0 = access15400.onNavigationEvent(obj);
                anonymousClass1.L$1 = access15400.onNavigationEvent(anonymousClass1);
                anonymousClass1.L$2 = access15400.onNavigationEvent(obj);
                anonymousClass1.L$3 = access15400.onNavigationEvent(setripple);
                anonymousClass1.I$0 = 0;
                anonymousClass1.label = 1;
                if (setripple.emit(geticonpaddingtop, anonymousClass1) == objOnWarmupCompleted) {
                    int i11 = onWarmupCompleted + 111;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 54 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public requestAssetInfo$onExtraCallbackWithResult(IAnimation iAnimation, requestAssetInfo requestassetinfo) {
        this.IAuthTabCallback = iAnimation;
        this.onExtraCallbackWithResult = requestassetinfo;
    }

    public Object collect(setRipple setripple, access13800 access13800Var) {
        int i2 = 2 % 2;
        Object objCollect = this.IAuthTabCallback.collect(new AnonymousClass2(setripple, this.onExtraCallbackWithResult), access13800Var);
        if (objCollect != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i3 = onExtraCallback + 35;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return objCollect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
