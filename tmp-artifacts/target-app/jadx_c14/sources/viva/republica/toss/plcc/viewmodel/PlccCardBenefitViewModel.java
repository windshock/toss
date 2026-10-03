package viva.republica.toss.plcc.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o.InterstitialAdInterstitialAdShowConfigBuilder;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.access13800;
import o.getPackageType;
import o.isTestMode;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccCardBenefitViewModel extends isTestMode {
    private final MutableLiveData<Throwable> IAuthTabCallback;
    private getPackageType asBinder;
    private final LiveData<Pair<PlccBenefitInfoResp, Boolean>> asInterface;
    private final MutableLiveData<String> onExtraCallback;
    private final InterstitialAdInterstitialAdShowConfigBuilder onExtraCallbackWithResult;
    private final MutableLiveData<Pair<PlccBenefitInfoResp, Boolean>> onNavigationEvent;
    private final LiveData<String> onTransact;
    private final LiveData<Throwable> onWarmupCompleted;

    @Inject
    public PlccCardBenefitViewModel(@NotNull InterstitialAdInterstitialAdShowConfigBuilder interstitialAdInterstitialAdShowConfigBuilder) {
        Intrinsics.checkNotNullParameter(interstitialAdInterstitialAdShowConfigBuilder, "");
        this.onExtraCallbackWithResult = interstitialAdInterstitialAdShowConfigBuilder;
        MutableLiveData<Pair<PlccBenefitInfoResp, Boolean>> mutableLiveData = new MutableLiveData<>();
        this.onNavigationEvent = mutableLiveData;
        this.asInterface = onNavigationEvent(mutableLiveData);
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.onExtraCallback = mutableLiveData2;
        this.onTransact = onNavigationEvent(mutableLiveData2);
        MutableLiveData<Throwable> mutableLiveData3 = new MutableLiveData<>();
        this.IAuthTabCallback = mutableLiveData3;
        this.onWarmupCompleted = onNavigationEvent(mutableLiveData3);
    }

    public final LiveData<Pair<PlccBenefitInfoResp, Boolean>> onExtraCallbackWithResult() {
        return this.asInterface;
    }

    public final LiveData<String> onNavigationEvent() {
        return this.onTransact;
    }

    public final LiveData<Throwable> IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PlccCardBenefitViewModel plccCardBenefitViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        plccCardBenefitViewModel.IAuthTabCallback(str, z);
    }

    public final void IAuthTabCallback(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        getPackageType getpackagetype = this.asBinder;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.asBinder = maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, str, z, (access13800) null), 3, (Object) null);
    }
}
