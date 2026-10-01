package im.toss.di;

import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.ksp.TossHostKspDeepLinkRegistrar;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.splittarget.spec.fsm.CriticalMalwareState;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AppLovinAdServiceImplExternalSyntheticLambda0;
import o.AppLovinAdServiceImplExternalSyntheticLambda3;
import o.AppLovinAdServiceImplExternalSyntheticLambda4;
import o.AppLovinAdServiceImplExternalSyntheticLambda5;
import o.AppLovinAdServiceImplb;
import o.AppLovinError;
import o.AppLovinSdkInitializationConfigurationImpl;
import o.AppLovinSdkInitializationConfigurationImplBuilderImpl;
import o.SdkConfigurationImpl;
import o.SessionTrackerb;
import o.SessionTrackere;
import o.UnzipUtil;
import o.addSdk;
import o.calculateMaxTextSize;
import o.getAdUnitIds;
import o.getAppEnteredBackgroundTimeMillis;
import o.getCurrentApplicationState;
import o.getLastTrimMemoryLevel;
import o.getMediationProvider;
import o.getPluginVersion;
import o.getSdkKey;
import o.getSegmentCollection;
import o.isExceptionHandlerEnabled;
import o.loadNextIncentivizedAd;
import o.maybeFireAppKilledWhilePlayingAdPostback;
import o.maybeSubmitPersistentPostbacks;
import o.pauseForClick;
import o.setAdUnitIds;
import o.setCustomPostBody;
import o.setSegmentCollection;
import o.trackAndLaunchClick;
import o.trackAndLaunchVideoClick;
import o.trackCustomTabsNavigationAborted;
import o.trackCustomTabsNavigationFailed;
import o.trackCustomTabsNavigationFinished;
import o.trackCustomTabsNavigationStarted;
import o.trackCustomTabsTabShown;
import o.trackFullScreenAdClosed;
import o.trackImpression;
import o.trackNativeAdCustomTabsNavigationAborted;
import o.trackNativeAdCustomTabsTabShown;
import o.trackVideoEnd;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class SplitTargetModule {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Singleton
    public abstract CriticalMalwareState IAuthTabCallback(@NotNull trackCustomTabsNavigationAborted trackcustomtabsnavigationaborted);

    @Singleton
    public abstract AppLovinError IAuthTabCallback(@NotNull loadNextIncentivizedAd loadnextincentivizedad);

    @Singleton
    public abstract isExceptionHandlerEnabled IAuthTabCallback(@NotNull trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished);

    @Singleton
    public abstract addSdk onExtraCallback(@NotNull maybeSubmitPersistentPostbacks maybesubmitpersistentpostbacks);

    @Singleton
    public abstract getLastTrimMemoryLevel onExtraCallback(@NotNull trackVideoEnd trackvideoend);

    public abstract getSdkKey onExtraCallback(@NotNull trackCustomTabsNavigationStarted trackcustomtabsnavigationstarted);

    @Singleton
    public abstract setAdUnitIds onExtraCallback(@NotNull trackFullScreenAdClosed trackfullscreenadclosed);

    @Singleton
    public abstract AppLovinSdkInitializationConfigurationImpl onExtraCallbackWithResult(@NotNull trackAndLaunchClick trackandlaunchclick);

    @Singleton
    public abstract AppLovinSdkInitializationConfigurationImplBuilderImpl onExtraCallbackWithResult(@NotNull trackNativeAdCustomTabsNavigationAborted tracknativeadcustomtabsnavigationaborted);

    @Singleton
    public abstract SdkConfigurationImpl onExtraCallbackWithResult(@NotNull trackNativeAdCustomTabsTabShown tracknativeadcustomtabstabshown);

    @Singleton
    public abstract getAppEnteredBackgroundTimeMillis onExtraCallbackWithResult(@NotNull AppLovinAdServiceImplExternalSyntheticLambda3 appLovinAdServiceImplExternalSyntheticLambda3);

    @Singleton
    public abstract getMediationProvider onExtraCallbackWithResult(@NotNull maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback);

    public abstract getPluginVersion onExtraCallbackWithResult(@NotNull trackAndLaunchVideoClick trackandlaunchvideoclick);

    public abstract getSegmentCollection onExtraCallbackWithResult(@NotNull trackImpression trackimpression);

    @Singleton
    public abstract AppState onNavigationEvent(@NotNull setCustomPostBody setcustompostbody);

    public abstract getAdUnitIds onNavigationEvent(@NotNull trackCustomTabsNavigationFailed trackcustomtabsnavigationfailed);

    @Singleton
    public abstract getCurrentApplicationState onNavigationEvent(@NotNull AppLovinAdServiceImplExternalSyntheticLambda0 appLovinAdServiceImplExternalSyntheticLambda0);

    @Singleton
    public abstract pauseForClick onNavigationEvent(@NotNull AppLovinAdServiceImplExternalSyntheticLambda4 appLovinAdServiceImplExternalSyntheticLambda4);

    @Singleton
    public abstract setSegmentCollection onNavigationEvent(@NotNull trackCustomTabsTabShown trackcustomtabstabshown);

    @Singleton
    public abstract SessionTrackerb onWarmupCompleted(@NotNull AppLovinAdServiceImplExternalSyntheticLambda5 appLovinAdServiceImplExternalSyntheticLambda5);

    @Singleton
    public abstract SessionTrackere onWarmupCompleted(@NotNull AppLovinAdServiceImplb appLovinAdServiceImplb);

    public static final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        @Singleton
        public final DeepLinkBaseRegistry IAuthTabCallback() {
            int i = 2 % 2;
            TossHostKspDeepLinkRegistrar tossHostKspDeepLinkRegistrar = new TossHostKspDeepLinkRegistrar();
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return tossHostKspDeepLinkRegistrar;
        }

        @Singleton
        public final calculateMaxTextSize onExtraCallbackWithResult() {
            int i = 2 % 2;
            UnzipUtil unzipUtil = new UnzipUtil();
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
            }
            return unzipUtil;
        }
    }
}
