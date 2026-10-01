package o;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
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
public final class setTrimPathEnd$IAuthTabCallbackDefault extends RewardedAdLoadCallback {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    final /* synthetic */ setTrimPathEnd IAuthTabCallback;
    final /* synthetic */ NativeAdsDto.AdmobInfo onExtraCallback;

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ RewardedAd $ad$inlined;
        final /* synthetic */ setTrimPathEnd $this_runCatching$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(access13800 access13800Var, setTrimPathEnd settrimpathend, RewardedAd rewardedAd) {
            super(2, access13800Var);
            this.$this_runCatching$inlined = settrimpathend;
            this.$ad$inlined = rewardedAd;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access13800Var, this.$this_runCatching$inlined, this.$ad$inlined);
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 125;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallback + 113;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
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
                    int i7 = onExtraCallback + 17;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    onextracallbackwithresultAsInterface.onExtraCallback(this.$ad$inlined);
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    setTrimPathEnd$IAuthTabCallbackDefault(setTrimPathEnd settrimpathend, NativeAdsDto.AdmobInfo admobInfo) {
        this.IAuthTabCallback = settrimpathend;
        this.onExtraCallback = admobInfo;
    }

    public /* synthetic */ void onAdLoaded(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((RewardedAd) obj);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(loadAdError, "");
        if (!setTrimPathEnd.IAuthTabCallback_Parcel(this.IAuthTabCallback)) {
            setTrimPathEnd.onExtraCallbackWithResult(this.IAuthTabCallback, loadAdError);
            return;
        }
        if (setTrimPathEnd.IAuthTabCallbackDefault(this.IAuthTabCallback)) {
            return;
        }
        getPackageType getpackagetype = (getPackageType) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -243368703, forceDomainCheck.IAuthTabCallback(), 243368709, new Object[]{this.IAuthTabCallback});
        Object obj = null;
        if (getpackagetype != null) {
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        setTrimPathEnd settrimpathend = this.IAuthTabCallback;
        setTrimPathEnd.onExtraCallback(settrimpathend, maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent((AppCompatActivity) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -354126174, forceDomainCheck.IAuthTabCallback(), 354126178, new Object[]{settrimpathend})), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this.IAuthTabCallback, this.onExtraCallback, (access13800) null), 3, (Object) null));
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(RewardedAd rewardedAd) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rewardedAd, "");
        if (setTrimPathEnd.onNavigationEvent(this.IAuthTabCallback)) {
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            setTrimPathEnd.onNavigationEvent(this.IAuthTabCallback, rewardedAd);
            setTrimPathEnd.onWarmupCompleted(this.IAuthTabCallback, EventType.LOAD, rewardedAd);
            setTrimPathEnd settrimpathend = this.IAuthTabCallback;
            maybeUpdateAnimatable.onNavigationEvent(setTrimPathEnd.onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new IAuthTabCallback(null, settrimpathend, rewardedAd), 2, (Object) null);
        }
    }
}
