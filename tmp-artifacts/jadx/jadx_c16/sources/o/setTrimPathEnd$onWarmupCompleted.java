package o;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import im.toss.ads_sdk.remote.model.EventType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setTrimPathEnd$onWarmupCompleted extends FullScreenContentCallback {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    final /* synthetic */ setTrimPathOffset IAuthTabCallback;
    final /* synthetic */ boolean onExtraCallback;
    final /* synthetic */ InterstitialAd onNavigationEvent;
    final /* synthetic */ setTrimPathEnd onWarmupCompleted;

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(access13800 access13800Var, setTrimPathOffset settrimpathoffset) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                iAuthTabCallbackCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access13800Var, this.$adCallBack$inlined);
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 51;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onNavigationEvent + 89;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            try {
                this.$adCallBack$inlined.onNavigationEvent();
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ InterstitialAd $ad$inlined;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(access13800 access13800Var, setTrimPathOffset settrimpathoffset, InterstitialAd interstitialAd) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
            this.$ad$inlined = interstitialAd;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var, this.$adCallBack$inlined, this.$ad$inlined);
            int i2 = IAuthTabCallback + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 39 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 35;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 71;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i7 = IAuthTabCallback + 87;
                    int i8 = i7 % 128;
                    onExtraCallback = i8;
                    int i9 = i7 % 2;
                    int i10 = i8 + 61;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return objOnWarmupCompleted;
                }
            }
            try {
                this.$adCallBack$inlined.onNavigationEvent(this.$ad$inlined);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ InterstitialAd $ad$inlined;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, setTrimPathOffset settrimpathoffset, InterstitialAd interstitialAd) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
            this.$ad$inlined = interstitialAd;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.$adCallBack$inlined, this.$ad$inlined);
            int i2 = onExtraCallback + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 33;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 105;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i6 = 77 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            try {
                this.$adCallBack$inlined.onExtraCallback(this.$ad$inlined);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ InterstitialAd $ad$inlined;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        final /* synthetic */ AdError $adError$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(access13800 access13800Var, setTrimPathOffset settrimpathoffset, InterstitialAd interstitialAd, AdError adError) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
            this.$ad$inlined = interstitialAd;
            this.$adError$inlined = adError;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var, this.$adCallBack$inlined, this.$ad$inlined, this.$adError$inlined);
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 42 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted;
                int i4 = i3 + 65;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 7;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i8 = onWarmupCompleted;
                    int i9 = i8 + 51;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    int i10 = i8 + 43;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return objOnWarmupCompleted;
                }
            }
            try {
                this.$adCallBack$inlined.onExtraCallbackWithResult(this.$ad$inlined, this.$adError$inlined);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(access13800 access13800Var, setTrimPathOffset settrimpathoffset) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var, this.$adCallBack$inlined);
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 13 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 53;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            try {
                this.$adCallBack$inlined.onExtraCallback();
                int i4 = onNavigationEvent + 31;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 3;
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    setTrimPathEnd$onWarmupCompleted(setTrimPathEnd settrimpathend, InterstitialAd interstitialAd, boolean z, setTrimPathOffset settrimpathoffset) {
        this.onWarmupCompleted = settrimpathend;
        this.onNavigationEvent = interstitialAd;
        this.onExtraCallback = z;
        this.IAuthTabCallback = settrimpathoffset;
    }

    public void onAdDismissedFullScreenContent() {
        int i = 2 % 2;
        setTrimPathEnd.IAuthTabCallback(this.onWarmupCompleted, EventType.DISMISS, this.onNavigationEvent);
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.onWarmupCompleted), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onExtraCallbackWithResult(null, this.IAuthTabCallback, this.onNavigationEvent), 2, (Object) null);
        int i2 = IAuthTabCallbackDefault + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onAdFailedToShowFullScreenContent(AdError adError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(adError, "");
        setTrimPathEnd.IAuthTabCallback(this.onWarmupCompleted, EventType.FAILED_TO_SHOW, this.onNavigationEvent);
        setTrimPathEnd.asBinder(this.onWarmupCompleted).IAuthTabCallback(setTrimPathEnd.onExtraCallback(this.onWarmupCompleted), adError);
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.onWarmupCompleted), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onNavigationEvent(null, this.IAuthTabCallback, this.onNavigationEvent, adError), 2, (Object) null);
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onAdImpression() {
        int i = 2 % 2;
        setTrimPathEnd.IAuthTabCallback(this.onWarmupCompleted, EventType.IMP, this.onNavigationEvent);
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.onWarmupCompleted), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onExtraCallback(null, this.IAuthTabCallback, this.onNavigationEvent), 2, (Object) null);
        int i2 = IAuthTabCallbackDefault + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onAdClicked() {
        int i = 2 % 2;
        setTrimPathEnd.IAuthTabCallback(this.onWarmupCompleted, EventType.CLICK, this.onNavigationEvent);
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.onWarmupCompleted), putChannelInfo.onExtraCallback(), (setRandomHost) null, new IAuthTabCallback(null, this.IAuthTabCallback), 2, (Object) null);
        int i2 = IAuthTabCallbackDefault + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
    }

    public void onAdShowedFullScreenContent() {
        int i = 2 % 2;
        setTrimPathEnd.IAuthTabCallback(this.onWarmupCompleted, EventType.SHOW, this.onNavigationEvent);
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(this.onWarmupCompleted), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onWarmupCompleted(null, this.IAuthTabCallback), 2, (Object) null);
        int i2 = IAuthTabCallbackDefault + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }
}
