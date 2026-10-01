package im.toss.ads_sdk.ui.view;

import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.IAnimation;
import o.access13800;
import o.access14000;
import o.access14300;
import o.findResAndMsg;
import o.getBacktraceNote;
import o.getCornerRadius;
import o.getWrite;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NativeAdsThumbnailAdMobView$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    int label;
    final /* synthetic */ NativeAdsThumbnailAdMobView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdsThumbnailAdMobView$onWarmupCompleted(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, access13800<? super NativeAdsThumbnailAdMobView$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.this$0 = nativeAdsThumbnailAdMobView;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        NativeAdsThumbnailAdMobView$onWarmupCompleted nativeAdsThumbnailAdMobView$onWarmupCompleted = new NativeAdsThumbnailAdMobView$onWarmupCompleted(this.this$0, access13800Var);
        int i3 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
        return nativeAdsThumbnailAdMobView$onWarmupCompleted;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 != 0) {
            return onExtraCallback(findresandmsg, access13800Var);
        }
        onExtraCallback(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i5 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    /* renamed from: im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView$onWarmupCompleted$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements getBacktraceNote<Double, NativeAd, access13800<? super Pair<? extends Boolean, ? extends NativeAd>>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        /* synthetic */ double D$0;
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(access13800<? super AnonymousClass4> access13800Var) {
            super(3, access13800Var);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 89;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallback = onExtraCallback(((Number) obj).doubleValue(), (NativeAd) obj2, (access13800) obj3);
            int i5 = IAuthTabCallback + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(double d, NativeAd nativeAd, access13800<? super Pair<Boolean, ? extends NativeAd>> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(access13800Var);
            anonymousClass4.D$0 = d;
            anonymousClass4.L$0 = nativeAd;
            Object objInvokeSuspend = anonymousClass4.invokeSuspend(Unit.INSTANCE);
            int i3 = onExtraCallback + 105;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 6 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            int i2 = 2 % 2;
            double d = this.D$0;
            NativeAd nativeAd = (NativeAd) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = IAuthTabCallback + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            ResultKt.onNavigationEvent(obj);
            if (d > 0.0d) {
                int i5 = IAuthTabCallback + 13;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            return getWrite.IAuthTabCallback(access14000.onNavigationEvent(z), nativeAd);
        }
    }

    /* renamed from: im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView$onWarmupCompleted$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends NativeAd>, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NativeAdsThumbnailAdMobView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
            this.this$0 = nativeAdsThumbnailAdMobView;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, access13800Var);
            anonymousClass2.L$0 = obj;
            int i3 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 65 / 0;
            }
            return anonymousClass2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallback;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i3 % 128;
            Pair<Boolean, ? extends NativeAd> pair = (Pair) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 % 2 != 0) {
                objOnExtraCallback = onExtraCallback(pair, access13800Var);
                int i4 = 71 / 0;
            } else {
                objOnExtraCallback = onExtraCallback(pair, access13800Var);
            }
            int i5 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(Pair<Boolean, ? extends NativeAd> pair, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            AnonymousClass2 anonymousClass2Create = create(pair, access13800Var);
            if (i4 != 0) {
                objInvokeSuspend = anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                int i5 = 76 / 0;
            } else {
                objInvokeSuspend = anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
            }
            int i6 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Pair pair = (Pair) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            boolean zBooleanValue = ((Boolean) pair.onExtraCallbackWithResult()).booleanValue();
            NativeAd nativeAd = (NativeAd) pair.IAuthTabCallback();
            if (zBooleanValue) {
                int i5 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (nativeAd != null && !NativeAdsThumbnailAdMobView.onWarmupCompleted(this.this$0)) {
                    int i7 = onWarmupCompleted + 105;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        NativeAdsThumbnailAdMobView.IAuthTabCallback(this.this$0, nativeAd);
                        int i8 = 77 / 0;
                    } else {
                        NativeAdsThumbnailAdMobView.IAuthTabCallback(this.this$0, nativeAd);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            access14300.onWarmupCompleted();
            obj2.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 != 0) {
            int i5 = onNavigationEvent;
            int i6 = i5 + 5;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = i5 + 69;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            getCornerRadius getcornerradiusOnTransact = NativeAdsThumbnailAdMobView.onTransact(this.this$0);
            Object[] objArr = {this.this$0};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(ycxycx.onWarmupCompleted(getcornerradiusOnTransact, (getCornerRadius) NativeAdsThumbnailAdMobView.onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1108856079, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1108856079, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted()), new AnonymousClass4(null)));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (ycxycx.onWarmupCompleted(iAnimationOnNavigationEvent, anonymousClass2, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
