package o;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.rewarded.RewardedAd;
import im.toss.ads_sdk.remote.model.EventType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setTrimPathEnd$onNavigationEvent extends FullScreenContentCallback {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    final /* synthetic */ setTrimPathEnd IAuthTabCallback;
    final /* synthetic */ setTrimPathOffset onExtraCallback;
    final /* synthetic */ RewardedAd onNavigationEvent;
    final /* synthetic */ boolean onWarmupCompleted;

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(access13800 access13800Var, setTrimPathOffset settrimpathoffset) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return iAuthTabCallbackCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access13800Var, this.$adCallBack$inlined);
            int i2 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            try {
                this.$adCallBack$inlined.onNavigationEvent();
                int i4 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ RewardedAd $ad$inlined;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        final /* synthetic */ AdError $adError$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(access13800 access13800Var, setTrimPathOffset settrimpathoffset, RewardedAd rewardedAd, AdError adError) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
            this.$ad$inlined = rewardedAd;
            this.$adError$inlined = adError;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var, this.$adCallBack$inlined, this.$ad$inlined, this.$adError$inlined);
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[PHI: r1
          0x0041: PHI (r1v12 java.lang.Object) = (r1v4 java.lang.Object), (r1v13 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 72 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onExtraCallback + 59;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i6 != 0) {
                        int i7 = 54 / 0;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            try {
                this.$adCallBack$inlined.onWarmupCompleted(this.$ad$inlined, this.$adError$inlined);
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
            int i8 = IAuthTabCallback + 97;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, setTrimPathOffset settrimpathoffset) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.$adCallBack$inlined);
            int i2 = onExtraCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 49;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
          0x0032: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v6 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 49;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 84 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 107;
                        int i6 = i5 % 128;
                        onExtraCallback = i6;
                        if (i5 % 2 == 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        int i7 = i6 + 39;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            try {
                this.$adCallBack$inlined.onExtraCallback();
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ RewardedAd $ad$inlined;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(access13800 access13800Var, setTrimPathOffset settrimpathoffset, RewardedAd rewardedAd) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
            this.$ad$inlined = rewardedAd;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var, this.$adCallBack$inlined, this.$ad$inlined);
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 5;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i4 + 103;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            try {
                this.$adCallBack$inlined.onWarmupCompleted(this.$ad$inlined);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ RewardedAd $ad$inlined;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(access13800 access13800Var, setTrimPathOffset settrimpathoffset, RewardedAd rewardedAd) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
            this.$ad$inlined = rewardedAd;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var, this.$adCallBack$inlined, this.$ad$inlined);
            int i2 = onExtraCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 51;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 113;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            try {
                this.$adCallBack$inlined.IAuthTabCallback(this.$ad$inlined);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    setTrimPathEnd$onNavigationEvent(setTrimPathEnd settrimpathend, RewardedAd rewardedAd, boolean z, setTrimPathOffset settrimpathoffset) {
        this.IAuthTabCallback = settrimpathend;
        this.onNavigationEvent = rewardedAd;
        this.onWarmupCompleted = z;
        this.onExtraCallback = settrimpathoffset;
    }

    public void onAdDismissedFullScreenContent() {
        int i = 2 % 2;
        setTrimPathEnd.onWarmupCompleted(this.IAuthTabCallback, EventType.DISMISS, this.onNavigationEvent);
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.IAuthTabCallback), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onWarmupCompleted(null, this.onExtraCallback, this.onNavigationEvent), 2, (Object) null);
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
    }

    public void onAdFailedToShowFullScreenContent(AdError adError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(adError, "");
        setTrimPathEnd.onWarmupCompleted(this.IAuthTabCallback, EventType.FAILED_TO_SHOW, this.onNavigationEvent);
        setTrimPathEnd.asBinder(this.IAuthTabCallback).IAuthTabCallback(setTrimPathEnd.onExtraCallback(this.IAuthTabCallback), adError);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.IAuthTabCallback), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onExtraCallback(null, this.onExtraCallback, this.onNavigationEvent, adError), 2, (Object) null);
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onAdImpression() {
        int i = 2 % 2;
        setTrimPathEnd.onWarmupCompleted(this.IAuthTabCallback, EventType.IMP, this.onNavigationEvent);
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.IAuthTabCallback), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onNavigationEvent(null, this.onExtraCallback, this.onNavigationEvent), 2, (Object) null);
        int i2 = IAuthTabCallbackDefault + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onAdClicked() {
        int i = 2 % 2;
        setTrimPathEnd.onWarmupCompleted(this.IAuthTabCallback, EventType.CLICK, this.onNavigationEvent);
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.IAuthTabCallback), putChannelInfo.onExtraCallback(), (setRandomHost) null, new IAuthTabCallback(null, this.onExtraCallback), 2, (Object) null);
        int i2 = IAuthTabCallbackDefault + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
    }

    public void onAdShowedFullScreenContent() {
        int i = 2 % 2;
        setTrimPathEnd.onWarmupCompleted(this.IAuthTabCallback, EventType.SHOW, this.onNavigationEvent);
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.IAuthTabCallback), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onExtraCallbackWithResult(null, this.onExtraCallback), 2, (Object) null);
        int i2 = onExtraCallbackWithResult + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
    }
}
