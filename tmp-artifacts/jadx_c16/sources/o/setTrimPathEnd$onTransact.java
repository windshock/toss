package o;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.remote.model.EventType;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getPackageType;
import o.setTrimPathEnd;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setTrimPathEnd$onTransact extends InterstitialAdLoadCallback {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    final /* synthetic */ setTrimPathEnd IAuthTabCallback;
    final /* synthetic */ NativeAdsDto.AdmobInfo onWarmupCompleted;

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ InterstitialAd $ad$inlined;
        final /* synthetic */ setTrimPathEnd $this_runCatching$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, setTrimPathEnd settrimpathend, InterstitialAd interstitialAd) {
            super(2, access13800Var);
            this.$this_runCatching$inlined = settrimpathend;
            this.$ad$inlined = interstitialAd;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.$this_runCatching$inlined, this.$ad$inlined);
            int i2 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
            int i5 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            try {
                setTrimPathEnd.onExtraCallbackWithResult onextracallbackwithresultAsInterface = setTrimPathEnd.asInterface(this.$this_runCatching$inlined);
                if (onextracallbackwithresultAsInterface != null) {
                    onextracallbackwithresultAsInterface.onWarmupCompleted(this.$ad$inlined);
                }
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    setTrimPathEnd$onTransact(setTrimPathEnd settrimpathend, NativeAdsDto.AdmobInfo admobInfo) {
        this.IAuthTabCallback = settrimpathend;
        this.onWarmupCompleted = admobInfo;
    }

    public /* synthetic */ void onAdLoaded(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((InterstitialAd) obj);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = onExtraCallbackWithResult + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loadAdError, "");
        if (!setTrimPathEnd.IAuthTabCallback_Parcel(this.IAuthTabCallback)) {
            setTrimPathEnd.onExtraCallbackWithResult(this.IAuthTabCallback, loadAdError);
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 67 / 0;
                return;
            }
            return;
        }
        int i6 = onExtraCallbackWithResult + 113;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
            if (setTrimPathEnd.IAuthTabCallbackDefault(this.IAuthTabCallback)) {
                return;
            }
        } else if (setTrimPathEnd.IAuthTabCallbackDefault(this.IAuthTabCallback)) {
            return;
        }
        getPackageType getpackagetype = (getPackageType) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -243368703, forceDomainCheck.IAuthTabCallback(), 243368709, new Object[]{this.IAuthTabCallback});
        if (getpackagetype != null) {
            int i8 = onExtraCallbackWithResult + 107;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        setTrimPathEnd settrimpathend = this.IAuthTabCallback;
        setTrimPathEnd.onExtraCallback(settrimpathend, maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent((AppCompatActivity) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -354126174, forceDomainCheck.IAuthTabCallback(), 354126178, new Object[]{settrimpathend})), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this.IAuthTabCallback, this.onWarmupCompleted, (access13800) null), 3, (Object) null));
    }

    public void onNavigationEvent(InterstitialAd interstitialAd) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            int i3 = 24 / 0;
            if (setTrimPathEnd.onNavigationEvent(this.IAuthTabCallback)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            if (setTrimPathEnd.onNavigationEvent(this.IAuthTabCallback)) {
                return;
            }
        }
        setTrimPathEnd.IAuthTabCallback(this.IAuthTabCallback, interstitialAd);
        setTrimPathEnd.IAuthTabCallback(this.IAuthTabCallback, EventType.LOAD, interstitialAd);
        setTrimPathEnd settrimpathend = this.IAuthTabCallback;
        maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onExtraCallbackWithResult(null, settrimpathend, interstitialAd), 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
