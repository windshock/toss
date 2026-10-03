package o;

import android.content.Context;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.AdSettingsIntegrationErrorMode;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdSettingsIntegrationErrorMode {
    public static final AdSettingsIntegrationErrorMode onNavigationEvent = new AdSettingsIntegrationErrorMode();
    private static final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.CommonApiService$$ExternalSyntheticLambda0
        public final Object invoke() {
            return AdSettingsIntegrationErrorMode.updateVisuals();
        }
    });
    private static final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.CommonApiService$$ExternalSyntheticLambda1
        public final Object invoke() {
            return AdSettingsIntegrationErrorMode.validateRelationship();
        }
    });

    private AdSettingsIntegrationErrorMode() {
    }

    private final Context ICustomTabsServiceDefault() {
        return (Context) onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context updateVisuals() {
        return UserChoiceBillingListener.onExtraCallback.onExtraCallback();
    }

    private final AdViewAdViewLoadConfigBuilder ICustomTabsServiceStub() {
        return (AdViewAdViewLoadConfigBuilder) onWarmupCompleted.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdViewAdViewLoadConfigBuilder validateRelationship() {
        Response response = Response.onNavigationEvent;
        return (AdViewAdViewLoadConfigBuilder) Response.onExtraCallback(onNavigationEvent.ICustomTabsServiceDefault(), AdViewAdViewLoadConfigBuilder.class);
    }

    public final List<AdView> onWarmupCompleted() {
        return ICustomTabsServiceStub().RequiresOptIn();
    }

    @Deprecated
    public final engageSeek writeTypedObject() {
        return ICustomTabsServiceStub().onSupportNavigateUp();
    }

    @Deprecated
    public final getCurrentTimeMs extraCallbackWithResult() {
        return ICustomTabsServiceStub().setSupportActionBar();
    }

    @Deprecated
    public final contentUrl asBinder() {
        return ICustomTabsServiceStub().value();
    }

    @Deprecated
    public final ExtraHintsBuilder access100() {
        return ICustomTabsServiceStub().Keep();
    }

    @Deprecated
    public final extraData IAuthTabCallbackDefault() {
        return ICustomTabsServiceStub().CheckResult();
    }

    @Deprecated
    public final InterstitialAdInterstitialAdLoadConfigBuilder readTypedObject() {
        return ICustomTabsServiceStub().setItems();
    }

    @Deprecated
    public final setNativeAd prefetchWithMultipleUrls() {
        return ICustomTabsServiceStub().onCreateDialog();
    }

    @Deprecated
    public final shouldAutoplay newSessionWithExtras() {
        return ICustomTabsServiceStub().getThemeResId();
    }

    @Deprecated
    public final shouldAutoplay setEngagementSignalsCallback() {
        return ICustomTabsServiceStub().dismiss();
    }

    @Deprecated
    public final shouldAutoplay prefetch() {
        return ICustomTabsServiceStub().superDispatchKeyEvent();
    }

    @Deprecated
    public final setVolume newSession() {
        return ICustomTabsServiceStub().AppCompatDialogFragment();
    }

    @Deprecated
    public final shouldAllowBackgroundPlayback requestPostMessageChannelWithExtras() {
        return ICustomTabsServiceStub().setupDialog();
    }

    @Deprecated
    public final onSeekDisengaged mayLaunchUrl() {
        return ICustomTabsServiceStub().AppCompatDelegateImplApi33ImplExternalSyntheticLambda2();
    }

    @Deprecated
    public final setVideoRenderer IAuthTabCallbackStub() {
        return ICustomTabsServiceStub().onSupportActionModeFinished();
    }

    @Deprecated
    public final ExtraHints onExtraCallback() {
        return ICustomTabsServiceStub().ReportDrawnKtReportDrawnAfter11();
    }

    @Deprecated
    public final DefaultMediaViewVideoRenderer asInterface() {
        return ICustomTabsServiceStub().ActivityResultCallerLauncherExternalSyntheticLambda0();
    }

    @Deprecated
    public final repair onRelationshipValidationResult() {
        return ICustomTabsServiceStub().onDestroy();
    }

    @Deprecated
    public final getMediaViewApi ICustomTabsCallbackStubProxy() {
        return ICustomTabsServiceStub().onKeyDown();
    }

    @Deprecated
    public final getMediaWidth onUnminimized() {
        return ICustomTabsServiceStub().onNightModeChanged();
    }

    @Deprecated
    public final InterstitialAdListener ICustomTabsCallbackDefault() {
        return ICustomTabsServiceStub().onMenuOpened();
    }

    @Deprecated
    public final onEnterFullscreen ICustomTabsCallback_Parcel() {
        return ICustomTabsServiceStub().onPostResume();
    }

    @Deprecated
    public final MediaViewVideoRenderer ICustomTabsService() {
        return ICustomTabsServiceStub().supportNavigateUpTo();
    }

    @Deprecated
    public final getMediationData onTransact() {
        return ICustomTabsServiceStub().flag();
    }

    @Deprecated
    public final getAdContentsView onActivityLayout() {
        return ICustomTabsServiceStub().onCreateSupportNavigateUpTaskStack();
    }

    @Deprecated
    public final InterstitialAdExtendedListener onActivityResized() {
        return ICustomTabsServiceStub().invalidateOptionsMenu();
    }

    @Deprecated
    public final ExtraHintsHintType IAuthTabCallbackStubProxy() {
        return ICustomTabsServiceStub().RequiresApi();
    }

    @Deprecated
    public final InterstitialAdInterstitialLoadAdConfig extraCallback() {
        return ICustomTabsServiceStub().setView();
    }

    @Deprecated
    public final InterstitialAd ICustomTabsCallback() {
        return ICustomTabsServiceStub().setCustomTitle();
    }

    @Deprecated
    public final isVideoContent ICustomTabsCallbackStub() {
        return ICustomTabsServiceStub().onPostCreate();
    }

    @Deprecated
    public final mediationData access000() {
        return ICustomTabsServiceStub().ReturnThis();
    }

    @Deprecated
    public final getVolume newAuthTabSession() {
        return ICustomTabsServiceStub().onBackInvoked();
    }

    @Deprecated
    public final onVolumeChanged postMessage() {
        return ICustomTabsServiceStub().AppCompatDialogExternalSyntheticLambda0();
    }

    @Deprecated
    public final unsetNativeAd receiveFile() {
        return ICustomTabsServiceStub().checkOnClickListener();
    }

    @Deprecated
    public final InterstitialAdInterstitialShowAdConfig onMessageChannelReady() {
        return ICustomTabsServiceStub().findViewById();
    }

    @Deprecated
    public final getNativeAdApi requestPostMessageChannel() {
        return ICustomTabsServiceStub().backportAccessibilityAttributes();
    }

    @Deprecated
    public final initializeSelf IAuthTabCallback() {
        return ICustomTabsServiceStub().ReportDrawnKtExternalSyntheticLambda6();
    }

    @Deprecated
    public final withRewardData onPostMessage() {
        return ICustomTabsServiceStub().attachBaseContext();
    }

    @Deprecated
    public final setH5OptionMenuTextFlag getInterfaceDescriptor() {
        return ICustomTabsServiceStub().getSavedStateRegistryControllerannotations();
    }

    @Deprecated
    public final setOfflineMode IAuthTabCallback_Parcel() {
        return ICustomTabsServiceStub().Ranim();
    }

    @Deprecated
    public final getMediaHeight onMinimized() {
        return ICustomTabsServiceStub().onContentChanged();
    }

    @Deprecated
    public final onVolumeChange isEngagementSignalsApiAvailable() {
        return ICustomTabsServiceStub().onPrepareSupportNavigateUpTaskStack();
    }

    @Deprecated
    public final onFullscreenForeground extraCommand() {
        return ICustomTabsServiceStub().onWindowStartingSupportActionMode();
    }
}
