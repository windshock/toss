package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.semantics.Role;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.R;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddings;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddingsKt;
import im.toss.tds.compose.component.compound.top.v2.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.handleNativeAdClick;
import o.oExternalSyntheticLambda0;
import o.r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1ExternalSyntheticLambda4;
import o.y1a;
import o.y1b;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA IAuthTabCallback;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback = null;
    private static getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackDefault = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStub = null;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStubProxy = null;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback_Parcel = null;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsService = null;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceDefault = null;
    private static getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceStub = null;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceStubProxy = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsService_Parcel = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallback = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallbackDefault = null;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallbackStub = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallbackStubProxy = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallback_Parcel = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageService = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageServiceDefault = null;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageServiceStub = null;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageServiceStubProxy = null;
    private static getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageService_Parcel = null;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallback = null;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallbackDefault = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallbackStub = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallbackStubProxy = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallback_Parcel = null;
    private static char ITrustedWebActivityService = 0;
    private static int ITrustedWebActivityServiceDefault = 0;
    private static int ITrustedWebActivityServiceStub = 0;
    private static int ITrustedWebActivityServiceStubProxy = 1;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000 = null;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100 = null;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access200 = null;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> areNotificationsEnabled = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder = null;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> cancelNotification = null;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallbackWithResult = null;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCommand = null;
    private static char getActiveNotifications = 0;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor = null;
    private static char getSmallIconBitmap = 0;
    private static int getSmallIconId = 1;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> isEngagementSignalsApiAvailable;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> mayLaunchUrl;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newAuthTabSession;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newSession;
    private static getBacktraceNote<CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newSessionWithExtras;
    private static char notifyNotificationWithChannel;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityLayout;
    private static getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityResized;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onGreatestScrollPercentageIncreased;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMinimized;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onPostMessage;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onRelationshipValidationResult;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onSessionEnded;
    private static getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onUnminimized;
    private static getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onVerticalScrollEvent;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> postMessage;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> prefetch;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> prefetchWithMultipleUrls;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> readTypedObject;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> receiveFile;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> requestPostMessageChannel;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> requestPostMessageChannelWithExtras;
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> setEngagementSignalsCallback;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> updateVisuals;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> validateRelationship;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> warmup;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedList;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject;

    public static /* synthetic */ Unit IAuthTabCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 87;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return ICustomTabsCallbackStub(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        ICustomTabsCallbackStub(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 39;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return getInterfaceDescriptor(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        getInterfaceDescriptor(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 45;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(y1externalsyntheticlambda3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 65;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 93;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 123;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 7;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 79;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 9;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2060270354, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2060270320, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i4 = getSmallIconId + 25;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 73;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 45;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws NoWhenBranchMatchedException {
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 43;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = ITrustedWebActivityServiceDefault + 107;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return unitICustomTabsCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 63;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnRelationshipValidationResult = onRelationshipValidationResult();
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return unitOnRelationshipValidationResult;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 109;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnUnminimized = onUnminimized(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 83;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnUnminimized;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 105;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            asBinder(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitAsBinder = asBinder(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 125;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 23;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 13;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 53;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 95;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return unitICustomTabsCallbackStub;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        y1ExternalSyntheticLambda4 y1externalsyntheticlambda4 = (y1ExternalSyntheticLambda4) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 69;
        ITrustedWebActivityServiceDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            access100(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitAccess100 = access100(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = ITrustedWebActivityServiceDefault + 89;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAccess100;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 71;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSession = newSession();
        int i4 = ITrustedWebActivityServiceDefault + 109;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unitNewSession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 11;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnPostMessage = onPostMessage(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 35;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnPostMessage;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 51;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            access000(cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAccess000 = access000(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 87;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 71;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1689113185, iOnExtraCallback3, 1689113215, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnExtraCallback4);
        int i5 = ITrustedWebActivityServiceDefault + 45;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 115;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 123;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 75;
        ITrustedWebActivityServiceDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onMinimized(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnMinimized = onMinimized(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 49;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnMinimized;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 69;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -552091158, iOnExtraCallback, 552091191, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
        int i4 = getSmallIconId + 43;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 43;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return onActivityResized(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onActivityResized(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 89;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitMayLaunchUrl = mayLaunchUrl(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 115;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unitMayLaunchUrl;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 35;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 572482930, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -572482901, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i5 = getSmallIconId + 79;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 25;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        if (i3 == 0) {
            return (Unit) onExtraCallbackWithResult(iOnExtraCallback3, -192362847, iOnExtraCallback, 192362884, iOnExtraCallback4, objArr2, iOnExtraCallback2);
        }
        int i4 = 21 / 0;
        return (Unit) onExtraCallbackWithResult(iOnExtraCallback3, -192362847, iOnExtraCallback, 192362884, iOnExtraCallback4, objArr2, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel() {
        Unit unitPrefetchWithMultipleUrls;
        int i = 2 % 2;
        int i2 = getSmallIconId + 57;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls();
            int i3 = 32 / 0;
        } else {
            unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls();
        }
        int i4 = getSmallIconId + 35;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitPrefetchWithMultipleUrls;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 81;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1289328126, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1289328164, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i5 = getSmallIconId + 75;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 17;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewSessionWithExtras = newSessionWithExtras(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 11;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitNewSessionWithExtras;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 15;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return writeTypedObject(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        writeTypedObject(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 11;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPostMessage = postMessage();
        int i4 = ITrustedWebActivityServiceDefault + 7;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unitPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 33;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewSession = newSession(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 55;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitNewSession;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        y1ExternalSyntheticLambda4 y1externalsyntheticlambda4 = (y1ExternalSyntheticLambda4) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 87;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 794713426, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -794713391, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i4 = getSmallIconId + 11;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) throws NoWhenBranchMatchedException {
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 65;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            extraCommand(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitExtraCommand = extraCommand(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = ITrustedWebActivityServiceDefault + 103;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        return unitExtraCommand;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 87;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = validateRelationship;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return function2;
    }

    public static /* synthetic */ Unit access000() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 31;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            requestPostMessageChannel();
            throw null;
        }
        Unit unitRequestPostMessageChannel = requestPostMessageChannel();
        int i3 = ITrustedWebActivityServiceDefault + 17;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return unitRequestPostMessageChannel;
        }
        throw null;
    }

    public static /* synthetic */ Unit access000(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 13;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 83;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnRelationshipValidationResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit access000(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 99;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 123;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsCallback_Parcel;
    }

    public static /* synthetic */ Unit access000(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 95;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallback = extraCallback(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 9;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitExtraCallback;
    }

    public static /* synthetic */ Unit access100() {
        Unit unit;
        int i = 2 % 2;
        int i2 = getSmallIconId + 35;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1767328068, iOnExtraCallback, -1767328053, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
            int i3 = 17 / 0;
        } else {
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1767328068, iOnExtraCallback3, -1767328053, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback4);
        }
        int i4 = getSmallIconId + 125;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit access100(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 65;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            extraCallbackWithResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 3;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit access100(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 79;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnUnminimized = onUnminimized(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 31;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return unitOnUnminimized;
    }

    public static /* synthetic */ Unit access100(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 27;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            extraCallbackWithResult(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 29;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit asBinder(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 63;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 59;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unitICustomTabsCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit asBinder(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 27;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return onRelationshipValidationResult(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onRelationshipValidationResult(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit asBinder(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 39;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            onUnminimized(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnUnminimized = onUnminimized(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 77;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnUnminimized;
    }

    public static /* synthetic */ Unit asInterface() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 69;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPrefetch = prefetch();
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return unitPrefetch;
    }

    public static /* synthetic */ Unit asInterface(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 19;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 123;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit asInterface(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 59;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666447363, iOnExtraCallback3, -1666447357, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnExtraCallback4);
        int i5 = ITrustedWebActivityServiceDefault + 103;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit asInterface(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 105;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1097466608, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1097466608, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i4 = getSmallIconId + 95;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        Unit unitNewAuthTabSession;
        int i = 2 % 2;
        int i2 = getSmallIconId + 49;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            unitNewAuthTabSession = newAuthTabSession();
            int i3 = 44 / 0;
        } else {
            unitNewAuthTabSession = newAuthTabSession();
        }
        int i4 = getSmallIconId + 3;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return unitNewAuthTabSession;
    }

    public static /* synthetic */ Unit extraCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 71;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewAuthTabSession = newAuthTabSession(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 113;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return unitNewAuthTabSession;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 31;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = ITrustedWebActivityServiceDefault + 43;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 107;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras();
        int i4 = ITrustedWebActivityServiceDefault + 49;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitRequestPostMessageChannelWithExtras;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws NoWhenBranchMatchedException {
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 17;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = getSmallIconId + 87;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 47;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSessionWithExtras = newSessionWithExtras();
        int i4 = ITrustedWebActivityServiceDefault + 13;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitNewSessionWithExtras;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 89;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        if (i4 != 0) {
            return (Unit) onExtraCallbackWithResult(iOnExtraCallback3, -1093464117, iOnExtraCallback, 1093464135, iOnExtraCallback4, objArr, iOnExtraCallback2);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 103;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -427170263, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 427170287, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            int i4 = 65 / 0;
        } else {
            unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -427170263, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 427170287, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        }
        int i5 = ITrustedWebActivityServiceDefault + 7;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) throws NoWhenBranchMatchedException {
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 81;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPostMessage = postMessage(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = ITrustedWebActivityServiceDefault + 65;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unitPostMessage;
        }
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 33;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1078861530, iOnExtraCallback, -1078861499, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
        int i4 = ITrustedWebActivityServiceDefault + 43;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 115;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsServiceStub();
        }
        ICustomTabsServiceStub();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 1;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return typedObject;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 73;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            extraCommand();
            throw null;
        }
        Unit unitExtraCommand = extraCommand();
        int i3 = ITrustedWebActivityServiceDefault + 63;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        return unitExtraCommand;
    }

    public static /* synthetic */ Unit onExtraCallback(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 69;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            asInterface(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitAsInterface = asInterface(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 3;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 1;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 499356756, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -499356746, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 61;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 75;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 9;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(gettimebase);
        int i4 = ITrustedWebActivityServiceDefault + 53;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 97;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1670578275, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1670578276, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i4 = ITrustedWebActivityServiceDefault + 53;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 103;
        getSmallIconId = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getInterfaceDescriptor(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 45;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 103;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnActivityResized = onActivityResized(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
        int i6 = getSmallIconId + 59;
        ITrustedWebActivityServiceDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnActivityResized;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 111;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallback = extraCallback(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 87 / 0;
        }
        return unitExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 19;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1204277947, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1204277940, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i5 = getSmallIconId + 59;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 9;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {y1externalsyntheticlambda3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1186311950, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1186311938, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i5 = getSmallIconId + 113;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 71;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnActivityResized = onActivityResized(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 79;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return unitOnActivityResized;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 111;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1711043992, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1711044001, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i5 = ITrustedWebActivityServiceDefault + 65;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        y1a y1aVar = (y1a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 69;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = getSmallIconId + 41;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitICustomTabsCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onMessageChannelReady(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 13;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            onActivityLayout(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnActivityLayout = onActivityLayout(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 81;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitOnActivityLayout;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        Unit unit;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 29;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 233782329, iOnExtraCallback, -233782303, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
            int i3 = 12 / 0;
        } else {
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 233782329, iOnExtraCallback3, -233782303, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback4);
        }
        int i4 = ITrustedWebActivityServiceDefault + 9;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 99;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 83;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 29;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 465352669, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -465352665, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i5 = ITrustedWebActivityServiceDefault + 11;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getTimebase gettimebase, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 41;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(gettimebase, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 101;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 31;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 21;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 1;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            onMessageChannelReady(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnMessageChannelReady = onMessageChannelReady(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 87;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnMessageChannelReady;
    }

    public static /* synthetic */ Unit onNavigationEvent(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 5;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 12 / 0;
        }
        int i6 = getSmallIconId + 49;
        ITrustedWebActivityServiceDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        y1b y1bVar = (y1b) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 81;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = getSmallIconId + 7;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 105;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitReceiveFile = receiveFile();
        int i4 = ITrustedWebActivityServiceDefault + 31;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitReceiveFile;
    }

    public static /* synthetic */ Unit onTransact(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 67;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            ICustomTabsCallback(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitICustomTabsCallback = ICustomTabsCallback(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 75;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit onTransact(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 59;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 27 / 0;
        }
        return engagementSignalsCallback;
    }

    public static /* synthetic */ Unit onTransact(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 79;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 17;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onTransact(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 107;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            ICustomTabsCallbackStubProxy(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 11;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallbackStubProxy;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 69;
        ITrustedWebActivityServiceDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsCallbackDefault(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = ITrustedWebActivityServiceDefault + 77;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            return unitICustomTabsCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 115;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        int i4 = ITrustedWebActivityServiceDefault + 69;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitIsEngagementSignalsApiAvailable;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 9;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWriteTypedObject = writeTypedObject(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 71;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 11;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 123;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1b y1bVar, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 53;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(y1bVar, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 115;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            return (Unit) onExtraCallbackWithResult(iOnExtraCallback3, 1782000266, iOnExtraCallback, -1782000253, iOnExtraCallback4, objArr2, iOnExtraCallback2);
        }
        throw null;
    }

    public static /* synthetic */ Unit readTypedObject() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 63;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1028241712, iOnExtraCallback3, -1028241707, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback4);
        int i3 = ITrustedWebActivityServiceDefault + 59;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        y1a y1aVar = (y1a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 69;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = ITrustedWebActivityServiceDefault + 123;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return typedObject;
    }

    public static /* synthetic */ Unit writeTypedObject(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 15;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsService = ICustomTabsService(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 117;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            return unitICustomTabsService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 33;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IEngagementSignalsCallbackDefault;
        int i5 = i3 + 95;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityLayout() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 31;
        getSmallIconId = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityResized() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 23;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IEngagementSignalsCallback;
        int i5 = i3 + 95;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMinimized() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault;
        int i3 = i2 + 59;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = access000;
        int i5 = i2 + 15;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onPostMessage() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 39;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            function2 = IAuthTabCallback_Parcel;
            int i4 = 19 / 0;
        } else {
            function2 = IAuthTabCallback_Parcel;
        }
        int i5 = i2 + 7;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 11;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i5 = i3 + 61;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $10 + 89;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 7;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (getActiveNotifications ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSmallIconBitmap);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cGreen = (char) Color.green(i3);
                        int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i12 = (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1)) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, pressedStateDuration, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (ITrustedWebActivityService ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(notifyNotificationWithChannel)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 10 - View.combineMeasuredStates(0, 0), 12482 - AndroidCharacter.getMirror('0'), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - KeyEvent.getDeadChar(0, 0)), 14 - Color.blue(0), (ViewConfiguration.getTapTimeout() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit IAuthTabCallback(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 101;
        getSmallIconId = i2 % 128;
        onExtraCallback(gettimebase, i2 % 2 == 0 ? onNavigationEvent(gettimebase) << 1 : onNavigationEvent(gettimebase) + 1);
        Unit unit = Unit.INSTANCE;
        int i3 = getSmallIconId + 125;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(final getTimebase gettimebase, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            int i5 = ITrustedWebActivityServiceDefault + 39;
            getSmallIconId = i5 % 128;
            if (i5 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i6 = getSmallIconId + 13;
                ITrustedWebActivityServiceDefault = i6 % 128;
                int i7 = i6 % 2;
                i3 = 4;
            } else {
                int i8 = ITrustedWebActivityServiceDefault + 81;
                getSmallIconId = i8 % 128;
                int i9 = i8 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 19) != 18) {
            int i10 = getSmallIconId + 125;
            ITrustedWebActivityServiceDefault = i10 % 128;
            if (i10 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1697812077, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-749824617.<anonymous>.<anonymous> (TdsTopV2.kt:495)");
            }
            String str = "타이틀: " + onNavigationEvent(gettimebase);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = onExtraCallbackWithResult + 119;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitOnExtraCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallback(gettimebase);
                        int i14 = onExtraCallbackWithResult + 45;
                        onWarmupCompleted = i14 % 128;
                        if (i14 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            y1aVar.onExtraCallback(str, (QuirksExternalSyntheticBackport0) null, 0L, (getHumanReadableName) null, 0L, 0L, (GraphicDeviceInfo) null, (Function0<Unit>) obj, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 12582912, 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static {
        onUnminimized();
        IAuthTabCallback = new r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA();
        ITrustedWebActivityCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(455324052, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda13
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStubProxy(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStubProxy(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
        });
        warmup = ForwardingCameraControl.onExtraCallbackWithResult(1424597714, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda24
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallback + 11;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnMessageChannelReady = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onMessageChannelReady((y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 19;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 96 / 0;
                }
                return unitOnMessageChannelReady;
            }
        });
        requestPostMessageChannelWithExtras = ForwardingCameraControl.onExtraCallbackWithResult(1274668968, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda35
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                if (i3 != 0) {
                    return (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(iOnExtraCallback3, 516683510, iOnExtraCallback, -516683507, iOnExtraCallback4, objArr, iOnExtraCallback2);
                }
                throw null;
            }
        });
        onTransact = ForwardingCameraControl.onExtraCallbackWithResult(-1187865097, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda46
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackStub = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStub((y1ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 101;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitIAuthTabCallbackStub;
                }
                throw null;
            }
        });
        newSession = ForwardingCameraControl.onExtraCallbackWithResult(-749824617, false, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda57
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i3 != 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.asInterface(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Unit unitAsInterface = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.asInterface(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onNavigationEvent + 9;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 12 / 0;
                }
                return unitAsInterface;
            }
        });
        postMessage = ForwardingCameraControl.onExtraCallbackWithResult(-802322820, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda68
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnTransact = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onTransact((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnTransact;
            }
        });
        writeTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(-1812739523, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda79
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallback((y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = IAuthTabCallback + 23;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 77 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        onGreatestScrollPercentageIncreased = ForwardingCameraControl.onExtraCallbackWithResult(1946313723, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda83
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallback + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackDefault(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallbackDefault = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackDefault(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onExtraCallback + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallbackDefault;
            }
        });
        ICustomTabsCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(-401290415, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda84
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 99;
                onExtraCallbackWithResult = i2 % 128;
                RightPreset rightPreset = (RightPreset) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = onExtraCallbackWithResult + 43;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitIAuthTabCallback;
            }
        });
        ICustomTabsCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-369546784, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda85
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(y1ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1309878231, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1309878223, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                int i4 = onWarmupCompleted + 81;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        onRelationshipValidationResult = ForwardingCameraControl.onExtraCallbackWithResult(-319440512, false, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda14
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 27;
                onExtraCallback = i2 % 128;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                Integer num = (Integer) obj2;
                if (i2 % 2 == 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        access000 = ForwardingCameraControl.onExtraCallbackWithResult(-1375940979, false, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda15
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onWarmupCompleted((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i4 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        });
        IPostMessageServiceStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(565094688, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda16
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsInterface = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.asInterface((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                if (i3 == 0) {
                    int i4 = 56 / 0;
                }
                return unitAsInterface;
            }
        });
        receiveFile = ForwardingCameraControl.onExtraCallbackWithResult(133868223, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda17
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                throw null;
            }
        });
        IPostMessageServiceDefault = ForwardingCameraControl.onExtraCallbackWithResult(263732801, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda18
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                Integer numValueOf = Integer.valueOf(((Integer) obj3).intValue());
                if (i3 == 0) {
                    int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                    throw null;
                }
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 969329295, iOnExtraCallback3, -969329284, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnExtraCallback4);
                int i4 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        requestPostMessageChannel = ForwardingCameraControl.onExtraCallbackWithResult(1313428779, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda19
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                onWarmupCompleted = i2 % 128;
                RightPreset rightPreset = (RightPreset) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onTransact(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitOnTransact = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onTransact(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = onWarmupCompleted + 33;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitOnTransact;
            }
        });
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1032675524, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                y1ExternalSyntheticLambda4 y1externalsyntheticlambda4 = (y1ExternalSyntheticLambda4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onTransact(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitOnTransact = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onTransact(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = IAuthTabCallback + 87;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 26 / 0;
                }
                return unitOnTransact;
            }
        });
        ICustomTabsServiceStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(1849220119, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda21
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                if (i3 == 0) {
                    return (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(iOnExtraCallback3, -1168517764, iOnExtraCallback, 1168517784, iOnExtraCallback4, objArr, iOnExtraCallback2);
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        onMessageChannelReady = ForwardingCameraControl.onExtraCallbackWithResult(-242552330, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda22
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                onExtraCallbackWithResult = i2 % 128;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback_Parcel(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback_Parcel(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        IPostMessageService = ForwardingCameraControl.onExtraCallbackWithResult(3255544, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback((y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        });
        access100 = ForwardingCameraControl.onExtraCallbackWithResult(-1454473865, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda25
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallback((AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        ICustomTabsService = ForwardingCameraControl.onExtraCallbackWithResult(-556224158, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda26
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackDefault = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackDefault((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 63;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitIAuthTabCallbackDefault;
                }
                throw null;
            }
        });
        onActivityResized = ForwardingCameraControl.onExtraCallbackWithResult(-304628941, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda27
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 93;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallback((y1ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 99;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        });
        IEngagementSignalsCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(1950676646, false, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda28
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackStub = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStub((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i4 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallbackStub;
            }
        });
        onUnminimized = ForwardingCameraControl.onExtraCallbackWithResult(-357011301, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda29
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                if (i3 == 0) {
                    return (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(iOnExtraCallback3, -1880956313, iOnExtraCallback, 1880956341, iOnExtraCallback4, objArr, iOnExtraCallback2);
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        asBinder = ForwardingCameraControl.onExtraCallbackWithResult(-1166307908, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda30
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallback + 13;
                onNavigationEvent = i2 % 128;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access000(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                Unit unitAccess000 = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access000(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = 70 / 0;
                return unitAccess000;
            }
        });
        onVerticalScrollEvent = ForwardingCameraControl.onExtraCallbackWithResult(205211319, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda31
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 21;
                IAuthTabCallback = i2 % 128;
                y1ExternalSyntheticLambda4 y1externalsyntheticlambda4 = (y1ExternalSyntheticLambda4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitOnNavigationEvent = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = onNavigationEvent + 107;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitOnNavigationEvent;
            }
        });
        IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-1186155753, false, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda32
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i4 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        onMinimized = ForwardingCameraControl.onExtraCallbackWithResult(-1899918768, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda33
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 21;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackStub = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStub((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                if (i3 == 0) {
                    int i4 = 47 / 0;
                }
                return unitIAuthTabCallbackStub;
            }
        });
        readTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(-1594013743, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda34
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsInterface = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.asInterface((y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitAsInterface;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        extraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1581626395, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda36
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 81;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -306301638, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 306301659, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{(RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                int i4 = onExtraCallbackWithResult + 69;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        ITrustedWebActivityCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(670917497, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda37
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAccess000 = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access000((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 73;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitAccess000;
            }
        });
        extraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1707096902, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda38
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onNavigationEvent = i2 % 128;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.extraCallback(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.extraCallback(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        cancelNotification = ForwardingCameraControl.onExtraCallbackWithResult(811795320, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda39
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -257717147, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 257717186, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                int i4 = IAuthTabCallback + 93;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        ICustomTabsServiceDefault = ForwardingCameraControl.onExtraCallbackWithResult(1607209934, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda40
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 59;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        IEngagementSignalsCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(236953816, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda41
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                y1a y1aVar = (y1a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access100(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitAccess100 = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access100(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitAccess100;
            }
        });
        IEngagementSignalsCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(377831639, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda42
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access100(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access100(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        setEngagementSignalsCallback = ForwardingCameraControl.onExtraCallbackWithResult(1173246253, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda43
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i2 % 128;
                RightPreset rightPreset = (RightPreset) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access100(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitAccess100 = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access100(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return unitAccess100;
            }
        });
        onActivityLayout = ForwardingCameraControl.onExtraCallbackWithResult(-197009865, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda44
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                y1a y1aVar = (y1a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackDefault(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallbackDefault = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackDefault(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallbackDefault;
            }
        });
        ICustomTabsService_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(1719943032, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda45
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 164132776, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -164132759, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                int i4 = onWarmupCompleted + 5;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        ITrustedWebActivityCallback = ForwardingCameraControl.onExtraCallbackWithResult(739282572, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda47
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackStubProxy = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStubProxy((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 35;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 78 / 0;
                }
                return unitIAuthTabCallbackStubProxy;
            }
        });
        extraCommand = ForwardingCameraControl.onExtraCallbackWithResult(-630973546, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda48
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 81;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                y1a y1aVar = (y1a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStubProxy(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallbackStubProxy = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStubProxy(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onWarmupCompleted + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallbackStubProxy;
            }
        });
        isEngagementSignalsApiAvailable = ForwardingCameraControl.onExtraCallbackWithResult(-490095723, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda49
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2064240418, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2064240378, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                int i4 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        IPostMessageServiceStub = ForwardingCameraControl.onExtraCallbackWithResult(305318891, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda50
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onWarmupCompleted((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 115;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1064937227, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda51
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unitIAuthTabCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 51;
                onNavigationEvent = i2 % 128;
                y1a y1aVar = (y1a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    unitIAuthTabCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    int i3 = 64 / 0;
                } else {
                    unitIAuthTabCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                int i4 = IAuthTabCallback + 107;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 0;
                }
                return unitIAuthTabCallback;
            }
        });
        ITrustedWebActivityCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(852015670, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda52
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 101;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitWriteTypedObject = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.writeTypedObject((y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = IAuthTabCallback + 39;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 57 / 0;
                }
                return unitWriteTypedObject;
            }
        });
        access200 = ForwardingCameraControl.onExtraCallbackWithResult(1702521749, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda53
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                if (i3 == 0) {
                    return (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(iOnExtraCallback3, -1646074866, iOnExtraCallback, 1646074889, iOnExtraCallback4, objArr, iOnExtraCallback2);
                }
                int i4 = 58 / 0;
                return (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(iOnExtraCallback3, -1646074866, iOnExtraCallback, 1646074889, iOnExtraCallback4, objArr, iOnExtraCallback2);
            }
        });
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-128644790, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda54
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                RightPreset rightPreset = (RightPreset) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStub(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStub(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        getInterfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(-1498900908, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda55
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallback((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        IEngagementSignalsCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(418051989, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda56
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsBinder = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.asBinder((y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 11;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitAsBinder;
                }
                throw null;
            }
        });
        writeTypedList = ForwardingCameraControl.onExtraCallbackWithResult(1751501495, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda58
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 77;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
        });
        ICustomTabsCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(-562608471, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda59
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object obj4 = null;
                RightPreset rightPreset = (RightPreset) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access000(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    obj4.hashCode();
                    throw null;
                }
                Unit unitAccess000 = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access000(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitAccess000;
                }
                throw null;
            }
        });
        validateRelationship = ForwardingCameraControl.onExtraCallbackWithResult(1640503818, false, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda60
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackDefault = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackDefault((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i4 = onExtraCallback + 1;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallbackDefault;
            }
        });
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-105579042, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda61
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 113;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        newAuthTabSession = ForwardingCameraControl.onExtraCallbackWithResult(-804672963, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda62
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit interfaceDescriptor = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.getInterfaceDescriptor((y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return interfaceDescriptor;
            }
        });
        updateVisuals = ForwardingCameraControl.onExtraCallbackWithResult(1522489407, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda63
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 77;
                onExtraCallback = i2 % 128;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStub(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallbackStub = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStub(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = onExtraCallback + 45;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitIAuthTabCallbackStub;
            }
        });
        asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-1211487319, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda64
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback_Parcel = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback_Parcel((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                if (i3 == 0) {
                    int i4 = 54 / 0;
                }
                int i5 = onNavigationEvent + 113;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback_Parcel;
            }
        });
        ICustomTabsCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-317404239, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda65
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(y1b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                if (i3 == 0) {
                    return (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(iOnExtraCallback3, 1435762912, iOnExtraCallback, -1435762876, iOnExtraCallback4, objArr, iOnExtraCallback2);
                }
                throw null;
            }
        });
        IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(-1439389958, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda66
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback((y1ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 35;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(-1367385372, false, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda67
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 392862120, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -392862104, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                int i4 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        prefetch = ForwardingCameraControl.onExtraCallbackWithResult(-662222032, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda69
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsBinder = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.asBinder((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 37 / 0;
                }
                return unitAsBinder;
            }
        });
        prefetchWithMultipleUrls = ForwardingCameraControl.onExtraCallbackWithResult(-859297103, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda70
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onTransact(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onTransact(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        ICustomTabsCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1731707665, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda71
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unitICustomTabsCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 23;
                onExtraCallbackWithResult = i2 % 128;
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    unitICustomTabsCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.ICustomTabsCallback(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    int i3 = 61 / 0;
                } else {
                    unitICustomTabsCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.ICustomTabsCallback(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                int i4 = onExtraCallback + 121;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitICustomTabsCallback;
            }
        });
        mayLaunchUrl = ForwardingCameraControl.onExtraCallbackWithResult(-585640251, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda72
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 97;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1448547635, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1448547633, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{(RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                int i4 = onExtraCallback + 119;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        });
        newSessionWithExtras = ForwardingCameraControl.onExtraCallbackWithResult(-695012296, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda73
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallback((CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        });
        ICustomTabsServiceStub = ForwardingCameraControl.onExtraCallbackWithResult(1361131453, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda74
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 17;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent((y1b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        });
        ITrustedWebActivityCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(939312532, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda75
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unit;
                int i = 2 % 2;
                int i2 = onExtraCallback + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(y1ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                if (i3 == 0) {
                    unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1330333592, iOnExtraCallback, 1330333624, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, iOnExtraCallback2);
                    int i4 = 54 / 0;
                } else {
                    unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1330333592, iOnExtraCallback, 1330333624, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, iOnExtraCallback2);
                }
                int i5 = onWarmupCompleted + 13;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        });
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1123512598, false, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda76
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 13;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i4 = IAuthTabCallback + 65;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        });
        onPostMessage = ForwardingCameraControl.onExtraCallbackWithResult(-1956092161, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda77
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        });
        IPostMessageService_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(67261324, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda78
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                y1b y1bVar = (y1b) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
                Unit unitIAuthTabCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = IAuthTabCallback + 19;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        });
        onSessionEnded = ForwardingCameraControl.onExtraCallbackWithResult(258322984, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda80
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 111;
                IAuthTabCallback = i2 % 128;
                y1a y1aVar = (y1a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback_Parcel(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback_Parcel(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                throw null;
            }
        });
        areNotificationsEnabled = ForwardingCameraControl.onExtraCallbackWithResult(838970493, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda81
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 87;
                onExtraCallback = i2 % 128;
                RightPreset rightPreset = (RightPreset) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.getInterfaceDescriptor(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.getInterfaceDescriptor(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                throw null;
            }
        });
        IEngagementSignalsCallback = ForwardingCameraControl.onExtraCallbackWithResult(1877584569, false, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda82
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 11;
                IAuthTabCallback = i2 % 128;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                Integer num = (Integer) obj2;
                if (i2 % 2 == 0) {
                    return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                }
                r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                throw null;
            }
        });
        int i = ITrustedWebActivityServiceStub + 29;
        ITrustedWebActivityServiceStubProxy = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit mayLaunchUrl(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = getSmallIconId + 47;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = ITrustedWebActivityServiceDefault + 67;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = getSmallIconId + 19;
            ITrustedWebActivityServiceDefault = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 18 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = ITrustedWebActivityServiceDefault + 61;
                    getSmallIconId = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(455324052, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$455324052.<anonymous> (TdsTopV2.kt:500)");
                    int i12 = getSmallIconId + 31;
                    ITrustedWebActivityServiceDefault = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 3 % 2;
                    }
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = ITrustedWebActivityServiceDefault + 95;
                    getSmallIconId = i14 % 128;
                    if (i14 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onActivityLayout(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            int i5 = getSmallIconId + 55;
            ITrustedWebActivityServiceDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 37 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i7 = ITrustedWebActivityServiceDefault + 67;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = getSmallIconId + 17;
            ITrustedWebActivityServiceDefault = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 74 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = ITrustedWebActivityServiceDefault + 93;
                    getSmallIconId = i11 % 128;
                    if (i11 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1424597714, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1424597714.<anonymous> (TdsTopV2.kt:503)");
                        int i12 = 74 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1424597714, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1424597714.<anonymous> (TdsTopV2.kt:503)");
                    }
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀2", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀2", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 41;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = getSmallIconId + 7;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit readTypedObject(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i2 = i | (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ^ true) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = getSmallIconId + 91;
                ITrustedWebActivityServiceDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1274668968, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1274668968.<anonymous> (TdsTopV2.kt:506)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1274668968, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1274668968.<anonymous> (TdsTopV2.kt:506)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj2 = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj3 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 35;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                            throw null;
                        }
                        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                        Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1300745566, iOnExtraCallback3, -1300745544, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback4);
                        int i7 = IAuthTabCallback + 37;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 54 / 0;
                        }
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj3);
                int i5 = ITrustedWebActivityServiceDefault + 49;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                obj2 = obj3;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj2, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (i2 << 3) & 112, 2042);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = ITrustedWebActivityServiceDefault + 59;
                getSmallIconId = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit newAuthTabSession() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 3;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = getSmallIconId + 13;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback_Parcel(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            int i4 = getSmallIconId + 71;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4) ? 4 : 2) | i;
            int i6 = getSmallIconId + 69;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i8 = ITrustedWebActivityServiceDefault + 77;
            getSmallIconId = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = getSmallIconId + 61;
                ITrustedWebActivityServiceDefault = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1187865097, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1187865097.<anonymous> (TdsTopV2.kt:512)");
                    int i11 = 9 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1187865097, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1187865097.<anonymous> (TdsTopV2.kt:512)");
                }
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda96
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i12 = 2 % 2;
                        int i13 = IAuthTabCallback + 95;
                        onWarmupCompleted = i13 % 128;
                        if (i13 % 2 == 0) {
                            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                            return (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -893080454, iOnExtraCallback, 893080473, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
                        }
                        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Object[] objArr = new Object[1];
            a(new char[]{15467, 14203}, Drawable.resolveOpacity(0, 0) + 2, objArr);
            y1externalsyntheticlambda4.onNavigationEvent(((String) objArr[0]).intern(), (Function0) objOnMinimized, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 27) & 1879048192) | 54, 508);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = ITrustedWebActivityServiceDefault + 121;
                getSmallIconId = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = ITrustedWebActivityServiceDefault + 61;
            getSmallIconId = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = getSmallIconId + 91;
                ITrustedWebActivityServiceDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-749824617, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-749824617.<anonymous> (TdsTopV2.kt:492)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-749824617, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-749824617.<anonymous> (TdsTopV2.kt:492)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i6 = ITrustedWebActivityServiceDefault + 99;
                getSmallIconId = i6 % 128;
                objOnMinimized = i6 % 2 == 0 ? notifyPublicListeners.onWarmupCompleted(1) : notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i7 = ITrustedWebActivityServiceDefault + 91;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
            }
            final getTimebase gettimebase = (getTimebase) objOnMinimized;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult((getBacktraceNote<? super y1a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1697812077, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 15;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnNavigationEvent = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent(gettimebase, (y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = onNavigationEvent + 19;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, ITrustedWebActivityCallbackStub, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, warmup, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, requestPostMessageChannelWithExtras, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, onTransact, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12782598, 6, 15190);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStubProxy(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = getSmallIconId + 67;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i7 = ITrustedWebActivityServiceDefault + 67;
                getSmallIconId = i7 % 128;
                i3 = i7 % 2 == 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-802322820, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-802322820.<anonymous> (TdsTopV2.kt:524)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "타이틀", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityServiceDefault + 11;
                getSmallIconId = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 105;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((iIntValue & 6) == 0) {
            int i4 = ITrustedWebActivityServiceDefault + 47;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = getSmallIconId + 7;
            ITrustedWebActivityServiceDefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 68 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1812739523, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1812739523.<anonymous> (TdsTopV2.kt:527)");
                }
                Object[] objArr2 = {y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 15) & 458752) | 6), 30};
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                Object[] objArr22 = {y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 15) & 458752) | 6), 30};
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr22, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStubProxy(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i5 = ITrustedWebActivityServiceDefault + 33;
            getSmallIconId = i5 % 128;
            if (i5 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                i3 = 4;
            } else {
                int i6 = getSmallIconId + 13;
                ITrustedWebActivityServiceDefault = i6 % 128;
                int i7 = i6 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = ITrustedWebActivityServiceDefault + 13;
            getSmallIconId = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1946313723, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1946313723.<anonymous> (TdsTopV2.kt:530)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀2", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getSmallIconId + 17;
                ITrustedWebActivityServiceDefault = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = 65 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 125;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return unit;
    }

    private static final Unit ICustomTabsCallbackStub(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = ITrustedWebActivityServiceDefault + 113;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 61;
                ITrustedWebActivityServiceDefault = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-401290415, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-401290415.<anonymous> (TdsTopV2.kt:533)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda94
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 55;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 != 0) {
                            r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onNavigationEvent();
                        int i11 = onNavigationEvent + 15;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 99 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (i2 << 3) & 112, 2042);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i3 = ITrustedWebActivityServiceDefault + 57;
                getSmallIconId = i3 % 128;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i3 = getSmallIconId + 111;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i9 = i3 % 2;
        return Unit.INSTANCE;
    }

    private static final Unit receiveFile() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 5;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit access100(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        Object objOnMinimized;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            int i4 = 4;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4)) {
                int i5 = ITrustedWebActivityServiceDefault + 25;
                getSmallIconId = i5 % 128;
                if (i5 % 2 == 0) {
                }
                i2 = i4 | i;
            } else {
                int i6 = ITrustedWebActivityServiceDefault + 25;
                getSmallIconId = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 % 4;
                }
            }
            i4 = 2;
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i8 = getSmallIconId + 5;
            ITrustedWebActivityServiceDefault = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i10 = ITrustedWebActivityServiceDefault + 41;
            getSmallIconId = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 19 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-369546784, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-369546784.<anonymous> (TdsTopV2.kt:539)");
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda89
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i12 = 2 % 2;
                            int i13 = IAuthTabCallback + 45;
                            onNavigationEvent = i13 % 128;
                            int i14 = i13 % 2;
                            Unit unitOnTransact = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onTransact();
                            int i15 = onNavigationEvent + 51;
                            IAuthTabCallback = i15 % 128;
                            if (i15 % 2 != 0) {
                                return unitOnTransact;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                Object[] objArr = new Object[1];
                a(new char[]{15467, 14203}, (Process.myTid() >> 22) + 2, objArr);
                y1externalsyntheticlambda4.onNavigationEvent(((String) objArr[0]).intern(), (Function0) objOnMinimized, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 27) & 1879048192) | 54, 508);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                Object[] objArr2 = new Object[1];
                a(new char[]{15467, 14203}, (Process.myTid() >> 22) + 2, objArr2);
                y1externalsyntheticlambda4.onNavigationEvent(((String) objArr2[0]).intern(), (Function0) objOnMinimized, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 27) & 1879048192) | 54, 508);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = getSmallIconId + 7;
            ITrustedWebActivityServiceDefault = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1375940979, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1375940979.<anonymous> (TdsTopV2.kt:490)");
                int i5 = ITrustedWebActivityServiceDefault + 91;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = ITrustedWebActivityServiceDefault + 55;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = getSmallIconId + 71;
                ITrustedWebActivityServiceDefault = i9 % 128;
                if (i9 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            accessisMonitoringp<RemoveCompoundPaddings> accessismonitoringpOnExtraCallbackWithResult = RemoveCompoundPaddingsKt.onExtraCallbackWithResult();
            RemoveCompoundPaddings.Companion companion = RemoveCompoundPaddings.Companion;
            accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = accessismonitoringpOnExtraCallbackWithResult.onExtraCallback(companion.IAuthTabCallback());
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = newSession;
            int i10 = accessgetCameraFactoryp.onNavigationEvent | 48;
            setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, function2, cameraCaptureResultEmptyCameraCaptureResult, i10);
            setPostviewFormatSelector.onNavigationEvent(RemoveCompoundPaddingsKt.onExtraCallbackWithResult().onExtraCallback(companion.onNavigationEvent()), onRelationshipValidationResult, cameraCaptureResultEmptyCameraCaptureResult, i10);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = ITrustedWebActivityServiceDefault + 121;
                getSmallIconId = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i13 = getSmallIconId + 111;
            ITrustedWebActivityServiceDefault = i13 % 128;
            int i14 = i13 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i15 = getSmallIconId + 99;
        ITrustedWebActivityServiceDefault = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 50 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        boolean z = false;
        y1a y1aVar = (y1a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((iIntValue & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar))) {
                int i3 = ITrustedWebActivityServiceDefault + 125;
                getSmallIconId = i3 % 128;
                int i4 = i3 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            int i5 = getSmallIconId + 1;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityServiceDefault + 59;
                getSmallIconId = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(565094688, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$565094688.<anonymous> (TdsTopV2.kt:557)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(565094688, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$565094688.<anonymous> (TdsTopV2.kt:557)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "타이틀", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onActivityResized(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                int i5 = ITrustedWebActivityServiceDefault + 37;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = ITrustedWebActivityServiceDefault + 113;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = getSmallIconId + 83;
            ITrustedWebActivityServiceDefault = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(133868223, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$133868223.<anonymous> (TdsTopV2.kt:560)");
            }
            Object[] objArr = {y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30};
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsCallbackDefault(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = getSmallIconId + 47;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i & 28) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                    int i6 = getSmallIconId + 51;
                    ITrustedWebActivityServiceDefault = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            int i8 = getSmallIconId + 19;
            ITrustedWebActivityServiceDefault = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            int i10 = getSmallIconId + 81;
            ITrustedWebActivityServiceDefault = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 % 2;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = ITrustedWebActivityServiceDefault + 91;
                getSmallIconId = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(263732801, i3, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$263732801.<anonymous> (TdsTopV2.kt:563)");
            }
            Object[] objArr = {y1externalsyntheticlambda3, "서브타이틀2", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 << 15) & 458752) | 6), 30};
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = getSmallIconId + 77;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i7 = ITrustedWebActivityServiceDefault + 1;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i9 = getSmallIconId + 107;
                ITrustedWebActivityServiceDefault = i9 % 128;
                int i10 = i9 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1313428779, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1313428779.<anonymous> (TdsTopV2.kt:566)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda95
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = onExtraCallbackWithResult + 121;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitIAuthTabCallbackStubProxy = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStubProxy();
                        int i14 = IAuthTabCallback + 29;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % 2;
                        return unitIAuthTabCallbackStubProxy;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (i2 << 3) & 112, 2042);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit prefetch() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 115;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getSmallIconId + 91;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit newSession() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 33;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = getSmallIconId + 31;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4)) {
                int i5 = getSmallIconId + 23;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                int i7 = ITrustedWebActivityServiceDefault + 121;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1032675524, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1032675524.<anonymous> (TdsTopV2.kt:572)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 111;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitAsInterface = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.asInterface();
                        int i12 = onWarmupCompleted + 19;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return unitAsInterface;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function0<Unit> function0 = (Function0) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda8
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallback + 55;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitIAuthTabCallbackStub = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackStub();
                        int i12 = onExtraCallback + 99;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        return unitIAuthTabCallbackStub;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            Function0<Unit> function02 = (Function0) obj;
            Object[] objArr = new Object[1];
            a(new char[]{15467, 14203}, 2 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            y1externalsyntheticlambda4.onNavigationEvent(((String) objArr[0]).intern(), function0, null, null, null, "취소", function02, null, null, cameraCaptureResultEmptyCameraCaptureResult, 1769526 | ((i2 << 27) & 1879048192), 412);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit readTypedObject(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = getSmallIconId + 15;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i7 = ITrustedWebActivityServiceDefault + 53;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = getSmallIconId + 95;
            ITrustedWebActivityServiceDefault = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i11 = ITrustedWebActivityServiceDefault + 25;
            getSmallIconId = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 55 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1849220119, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1849220119.<anonymous> (TdsTopV2.kt:583)");
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "타이틀", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = ITrustedWebActivityServiceDefault + 15;
                    getSmallIconId = i13 % 128;
                    int i14 = i13 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "타이틀", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit newSessionWithExtras(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i4 = getSmallIconId + 35;
            ITrustedWebActivityServiceDefault = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = getSmallIconId + 65;
                ITrustedWebActivityServiceDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-242552330, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-242552330.<anonymous> (TdsTopV2.kt:586)");
                    int i6 = 2 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-242552330, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-242552330.<anonymous> (TdsTopV2.kt:586)");
                }
            }
            Object[] objArr = {y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30};
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 1;
                ITrustedWebActivityServiceDefault = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 != 0) {
                    int i9 = 71 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStub(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                int i5 = getSmallIconId + 1;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityServiceDefault + 3;
                getSmallIconId = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(3255544, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$3255544.<anonymous> (TdsTopV2.kt:589)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(3255544, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$3255544.<anonymous> (TdsTopV2.kt:589)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀2", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        long jExtraCallback;
        int i3;
        int i4 = 2 % 2;
        int i5 = getSmallIconId + 93;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                int i7 = ITrustedWebActivityServiceDefault + 91;
                getSmallIconId = i7 % 128;
                i3 = i7 % 2 == 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i8 = getSmallIconId + 5;
            ITrustedWebActivityServiceDefault = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i10 = getSmallIconId + 29;
            ITrustedWebActivityServiceDefault = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = getSmallIconId + 93;
                ITrustedWebActivityServiceDefault = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1454473865, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1454473865.<anonymous> (TdsTopV2.kt:593)");
            }
            int i14 = R.drawable.icon_check_mono;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i15 = ITrustedWebActivityServiceDefault + 23;
                getSmallIconId = i15 % 128;
                int i16 = i15 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885007201);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885006209);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            appLovinNativeAdImplExternalSyntheticLambda1.onWarmupCompleted(i14, null, jExtraCallback, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 58);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onUnminimized(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 29;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 121) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-556224158, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-556224158.<anonymous> (TdsTopV2.kt:592)");
            }
            rightPreset.onExtraCallback(null, null, null, 0L, 0.0f, null, access100, cameraCaptureResultEmptyCameraCaptureResult, 1572864 | ((i2 << 21) & 29360128), 63);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = getSmallIconId + 121;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 119;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getSmallIconId + 3;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 121;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit getInterfaceDescriptor(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4)) {
                int i5 = getSmallIconId + 19;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-304628941, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-304628941.<anonymous> (TdsTopV2.kt:600)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda90
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 99;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitIAuthTabCallback_Parcel = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback_Parcel();
                        int i10 = onExtraCallbackWithResult + 109;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        return unitIAuthTabCallback_Parcel;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function0<Unit> function0 = (Function0) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda91
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() {
                        Unit unitExtraCallbackWithResult;
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 1;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            unitExtraCallbackWithResult = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.extraCallbackWithResult();
                            int i9 = 21 / 0;
                        } else {
                            unitExtraCallbackWithResult = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.extraCallbackWithResult();
                        }
                        int i10 = IAuthTabCallback + 95;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        return unitExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            Object[] objArr = new Object[1];
            a(new char[]{15467, 14203}, View.MeasureSpec.getMode(0) + 2, objArr);
            y1externalsyntheticlambda4.onNavigationEvent(((String) objArr[0]).intern(), function0, null, null, null, "취소", (Function0) obj, null, null, cameraCaptureResultEmptyCameraCaptureResult, 1769526 | ((i2 << 27) & 1879048192), 412);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 41;
                ITrustedWebActivityServiceDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 34 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access000(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 73;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 2) != 3, i & 1)) {
            int i4 = getSmallIconId + 21;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1950676646, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1950676646.<anonymous> (TdsTopV2.kt:554)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(IPostMessageServiceStubProxy, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, receiveFile, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, IPostMessageServiceDefault, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, requestPostMessageChannel, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, onExtraCallbackWithResult, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12782598, 6, 15190);
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ICustomTabsServiceStubProxy, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, onMessageChannelReady, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, IPostMessageService, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ICustomTabsService, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, onActivityResized, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12782598, 6, 15190);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityServiceDefault + 99;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackDefault(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            int i5 = getSmallIconId + 115;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i7 = ITrustedWebActivityServiceDefault + 71;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-357011301, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-357011301.<anonymous> (TdsTopV2.kt:619)");
                int i9 = getSmallIconId + 17;
                ITrustedWebActivityServiceDefault = i9 % 128;
                int i10 = i9 % 2;
            }
            y1aVar.onExtraCallbackWithResult("동해물과 백두산이\n마르고 닳도록", null, null, null, null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22), null, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 102236160, i2 & 14, 670);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallback_Parcel(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                int i5 = ITrustedWebActivityServiceDefault + 57;
                getSmallIconId = i5 % 128;
                i3 = i5 % 2 == 0 ? 5 : 4;
            } else {
                int i6 = getSmallIconId + 31;
                ITrustedWebActivityServiceDefault = i6 % 128;
                int i7 = i6 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = getSmallIconId + 29;
            ITrustedWebActivityServiceDefault = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = ITrustedWebActivityServiceDefault + 13;
                getSmallIconId = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1166307908, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1166307908.<anonymous> (TdsTopV2.kt:631)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "동해물과 백두산이", null, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24966), 2}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 87;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object objOnMinimized;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 99;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            int i6 = ITrustedWebActivityServiceDefault + 43;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = getSmallIconId + 41;
            ITrustedWebActivityServiceDefault = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 97 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(205211319, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$205211319.<anonymous> (TdsTopV2.kt:639)");
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda11
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i10 = 2 % 2;
                            int i11 = onNavigationEvent + 109;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 == 0) {
                                return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access100();
                            }
                            r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access100();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                y1externalsyntheticlambda4.onNavigationEvent("충전하기", (Function0) objOnMinimized, null, null, null, "보내기", null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196662 | ((i2 << 27) & 1879048192), 476);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = ITrustedWebActivityServiceDefault + 51;
                    getSmallIconId = i10 % 128;
                    int i11 = i10 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                y1externalsyntheticlambda4.onNavigationEvent("충전하기", (Function0) objOnMinimized, null, null, null, "보내기", null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196662 | ((i2 << 27) & 1879048192), 476);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 125;
        getSmallIconId = i2 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i2 % 2 != 0 ? (iIntValue & 3) != 2 : (iIntValue & 4) != 4, iIntValue & 1)) {
            int i3 = getSmallIconId + 93;
            ITrustedWebActivityServiceDefault = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1186155753, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1186155753.<anonymous> (TdsTopV2.kt:616)");
            }
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onUnminimized, (QuirksExternalSyntheticBackport0) null, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, asBinder, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, onVerticalScrollEvent, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 196998, 438, 9178);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = getSmallIconId + 39;
                ITrustedWebActivityServiceDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = 65 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws NoWhenBranchMatchedException {
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 81;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i4 = getSmallIconId + 69;
            ITrustedWebActivityServiceDefault = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1594013743, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1594013743.<anonymous> (TdsTopV2.kt:657)");
            }
            Object[] objArr2 = {y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 15) & 458752) | 6), 30};
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = getSmallIconId + 105;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = getSmallIconId + 21;
        ITrustedWebActivityServiceDefault = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onMinimized(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            int i5 = getSmallIconId + 7;
            ITrustedWebActivityServiceDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 7 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = getSmallIconId + 107;
            ITrustedWebActivityServiceDefault = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1899918768, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1899918768.<anonymous> (TdsTopV2.kt:660)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "하단 정렬", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = ITrustedWebActivityServiceDefault + 63;
                getSmallIconId = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 79;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityServiceDefault + 27;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 99;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 10) == 0) {
                int i3 = ITrustedWebActivityServiceDefault + 67;
                getSmallIconId = i3 % 128;
                int i4 = i3 % 2;
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i5 = ITrustedWebActivityServiceDefault + 123;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 55;
                ITrustedWebActivityServiceDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1581626395, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1581626395.<anonymous> (TdsTopV2.kt:663)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1581626395, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1581626395.<anonymous> (TdsTopV2.kt:663)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda6
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 51;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitAccess000 = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.access000();
                        int i11 = onWarmupCompleted + 93;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return unitAccess000;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (iIntValue << 3) & 112, 2042);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit newAuthTabSession(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i4 = ITrustedWebActivityServiceDefault + 75;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i6 = getSmallIconId + 1;
            ITrustedWebActivityServiceDefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 34 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1707096902, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1707096902.<anonymous> (TdsTopV2.kt:671)");
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = getSmallIconId + 107;
                    ITrustedWebActivityServiceDefault = i8 % 128;
                    if (i8 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i9 = 88 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = ITrustedWebActivityServiceDefault + 95;
        getSmallIconId = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit extraCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i5 = ITrustedWebActivityServiceDefault + 51;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = getSmallIconId + 59;
            ITrustedWebActivityServiceDefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 80 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(670917497, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$670917497.<anonymous> (TdsTopV2.kt:674)");
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "중앙 정렬", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = getSmallIconId + 63;
                    ITrustedWebActivityServiceDefault = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "중앙 정렬", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit extraCommand(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = ITrustedWebActivityServiceDefault + 23;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i & 98) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                    int i6 = getSmallIconId;
                    int i7 = i6 + 21;
                    ITrustedWebActivityServiceDefault = i7 % 128;
                    i2 = i7 % 2 != 0 ? 2 : 4;
                    int i8 = i6 + 23;
                    ITrustedWebActivityServiceDefault = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            int i10 = ITrustedWebActivityServiceDefault + 63;
            getSmallIconId = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(811795320, i3, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$811795320.<anonymous> (TdsTopV2.kt:677)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀2", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = ITrustedWebActivityServiceDefault + 79;
                getSmallIconId = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCommand() {
        Unit unit;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 55;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 4 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = ITrustedWebActivityServiceDefault + 23;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit extraCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 119;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 65) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = ITrustedWebActivityServiceDefault + 89;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1607209934, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1607209934.<anonymous> (TdsTopV2.kt:680)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda87
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallback + 115;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallback();
                        int i10 = IAuthTabCallback + 37;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 23 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (i2 << 3) & 112, 2042);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityServiceDefault + 23;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = getSmallIconId + 125;
            ITrustedWebActivityServiceDefault = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCallbackWithResult(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i5 = ITrustedWebActivityServiceDefault + 89;
                getSmallIconId = i5 % 128;
                i3 = i5 % 2 == 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = getSmallIconId + 111;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityServiceDefault + 19;
                getSmallIconId = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(236953816, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$236953816.<anonymous> (TdsTopV2.kt:688)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "중앙 정렬", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onUnminimized(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        boolean z = false;
        if ((i & 6) == 0) {
            int i5 = ITrustedWebActivityServiceDefault + 5;
            getSmallIconId = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 36 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2;
            } else if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3))) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i7 = getSmallIconId + 105;
            ITrustedWebActivityServiceDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = getSmallIconId + 5;
            ITrustedWebActivityServiceDefault = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(377831639, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$377831639.<anonymous> (TdsTopV2.kt:691)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀2", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = getSmallIconId + 75;
                ITrustedWebActivityServiceDefault = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = getSmallIconId + 47;
                ITrustedWebActivityServiceDefault = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 115;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityServiceDefault + 87;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit extraCallbackWithResult(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityServiceDefault + 77;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1173246253, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1173246253.<anonymous> (TdsTopV2.kt:694)");
                int i6 = ITrustedWebActivityServiceDefault + 23;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda86
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 15;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                            return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackDefault();
                        }
                        r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallbackDefault();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (i2 << 3) & 112, 2042);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onPostMessage(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                int i5 = getSmallIconId + 61;
                ITrustedWebActivityServiceDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 5;
                }
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i7 = ITrustedWebActivityServiceDefault + 91;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getSmallIconId + 69;
                ITrustedWebActivityServiceDefault = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1719943032, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1719943032.<anonymous> (TdsTopV2.kt:703)");
            }
            Object[] objArr = {y1externalsyntheticlambda3, "서브타이틀1만\n있어도\n하단 정렬", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30};
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = ITrustedWebActivityServiceDefault + 73;
                getSmallIconId = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStub(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 97;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = ITrustedWebActivityServiceDefault + 75;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-197009865, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-197009865.<anonymous> (TdsTopV2.kt:705)");
                int i7 = ITrustedWebActivityServiceDefault + 49;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = getSmallIconId + 107;
        ITrustedWebActivityServiceDefault = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 35;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityServiceDefault + 107;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return unit;
    }

    private static final Unit onActivityResized(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i5 = getSmallIconId + 17;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i7 = ITrustedWebActivityServiceDefault + 73;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = getSmallIconId + 101;
            ITrustedWebActivityServiceDefault = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            int i11 = ITrustedWebActivityServiceDefault + 37;
            getSmallIconId = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(739282572, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$739282572.<anonymous> (TdsTopV2.kt:707)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda88
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = IAuthTabCallback + 111;
                        onExtraCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.readTypedObject();
                            throw null;
                        }
                        Unit typedObject = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.readTypedObject();
                        int i15 = onExtraCallback + 79;
                        IAuthTabCallback = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 61 / 0;
                        }
                        return typedObject;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (i2 << 3) & 112, 2042);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        y1a y1aVar = (y1a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            int i2 = getSmallIconId + 33;
            ITrustedWebActivityServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = getSmallIconId + 39;
                ITrustedWebActivityServiceDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-630973546, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-630973546.<anonymous> (TdsTopV2.kt:715)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-630973546, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-630973546.<anonymous> (TdsTopV2.kt:715)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = ITrustedWebActivityServiceDefault + 57;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit postMessage(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = getSmallIconId + 9;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                i3 = 4;
            } else {
                int i7 = getSmallIconId + 93;
                ITrustedWebActivityServiceDefault = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = getSmallIconId + 91;
            ITrustedWebActivityServiceDefault = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 70 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-490095723, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-490095723.<anonymous> (TdsTopV2.kt:717)");
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀2만\n있으면\n중앙 정렬, 하단정렬 되는 게 (시각보정)의미상 맞을 것 같지만 일단 패스..\n보통 title 비는 경우 없음", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = getSmallIconId + 81;
                    ITrustedWebActivityServiceDefault = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 4 % 2;
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀2만\n있으면\n중앙 정렬, 하단정렬 되는 게 (시각보정)의미상 맞을 것 같지만 일단 패스..\n보통 title 비는 경우 없음", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 81;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit writeTypedObject(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        boolean z = false;
        if ((i & 6) == 0) {
            int i5 = ITrustedWebActivityServiceDefault + 105;
            getSmallIconId = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 7 / 0;
                i3 = !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 2 : 4;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = getSmallIconId + 35;
            ITrustedWebActivityServiceDefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 2;
            }
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = ITrustedWebActivityServiceDefault + 25;
                getSmallIconId = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(305318891, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$305318891.<anonymous> (TdsTopV2.kt:720)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda93
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = onExtraCallback + 89;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitOnWarmupCompleted = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onWarmupCompleted();
                        int i14 = onExtraCallbackWithResult + 91;
                        onExtraCallback = i14 % 128;
                        int i15 = i14 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (i2 << 3) & 112, 2042);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = ITrustedWebActivityServiceDefault + 71;
                getSmallIconId = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i13 = ITrustedWebActivityServiceDefault + 85;
            getSmallIconId = i13 % 128;
            int i14 = i13 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsService(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            int i4 = ITrustedWebActivityServiceDefault + 61;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
            int i6 = getSmallIconId + 9;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i8 = ITrustedWebActivityServiceDefault + 57;
            getSmallIconId = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(852015670, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$852015670.<anonymous> (TdsTopV2.kt:728)");
            }
            Object[] objArr = {y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30};
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = getSmallIconId + 19;
        ITrustedWebActivityServiceDefault = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        long jExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i4 = getSmallIconId + 77;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1702521749, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1702521749.<anonymous> (TdsTopV2.kt:735)");
            }
            int i6 = R.drawable.icon_check_mono;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i7 = ITrustedWebActivityServiceDefault + 63;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-259133123);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-259132131);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            appLovinNativeAdImplExternalSyntheticLambda1.onWarmupCompleted(i6, null, jExtraCallback, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 58);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getSmallIconId + 73;
                ITrustedWebActivityServiceDefault = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onPostMessage(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i5 = ITrustedWebActivityServiceDefault + 83;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = ITrustedWebActivityServiceDefault + 77;
            getSmallIconId = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 8 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-128644790, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-128644790.<anonymous> (TdsTopV2.kt:734)");
                    int i9 = getSmallIconId + 81;
                    ITrustedWebActivityServiceDefault = i9 % 128;
                    int i10 = i9 % 2;
                }
                rightPreset.onExtraCallback(null, null, null, 0L, 0.0f, null, access200, cameraCaptureResultEmptyCameraCaptureResult, 1572864 | ((i2 << 21) & 29360128), 63);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                rightPreset.onExtraCallback(null, null, null, 0L, 0.0f, null, access200, cameraCaptureResultEmptyCameraCaptureResult, 1572864 | ((i2 << 21) & 29360128), 63);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onRelationshipValidationResult(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = getSmallIconId + 33;
            int i5 = i4 % 128;
            ITrustedWebActivityServiceDefault = i5;
            z = i4 % 2 == 0;
            int i6 = i5 + 43;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = ITrustedWebActivityServiceDefault + 5;
            getSmallIconId = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 9 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(418051989, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$418051989.<anonymous> (TdsTopV2.kt:744)");
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, "서브타이틀1", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onActivityResized(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i5 = getSmallIconId + 75;
                ITrustedWebActivityServiceDefault = i5 % 128;
                i3 = i5 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
            int i6 = getSmallIconId + 115;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = ITrustedWebActivityServiceDefault + 47;
            getSmallIconId = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 62 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1498900908, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1498900908.<anonymous> (TdsTopV2.kt:747)");
                    int i10 = getSmallIconId + 1;
                    ITrustedWebActivityServiceDefault = i10 % 128;
                    int i11 = i10 % 2;
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "하단 정렬(componentId 직접 입력 시에도 적용)", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i12 = getSmallIconId + 51;
                    ITrustedWebActivityServiceDefault = i12 % 128;
                    if (i12 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "하단 정렬(componentId 직접 입력 시에도 적용)", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        long jExtraCallback;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                int i5 = ITrustedWebActivityServiceDefault + 39;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 19) != 18) {
            int i7 = getSmallIconId + 15;
            ITrustedWebActivityServiceDefault = i7 % 128;
            if (i7 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = getSmallIconId + 63;
            ITrustedWebActivityServiceDefault = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1751501495, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1751501495.<anonymous> (TdsTopV2.kt:752)");
            }
            int i9 = R.drawable.icon_check_mono;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-434237089);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-434236097);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i10 = ITrustedWebActivityServiceDefault + 55;
            getSmallIconId = i10 % 128;
            if (i10 % 2 == 0) {
                appLovinNativeAdImplExternalSyntheticLambda1.onWarmupCompleted(i9, null, jExtraCallback, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 % 74) & 3670016, 47);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                appLovinNativeAdImplExternalSyntheticLambda1.onWarmupCompleted(i9, null, jExtraCallback, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 58);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStubProxy(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = ITrustedWebActivityServiceDefault + 107;
            getSmallIconId = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = getSmallIconId + 47;
                ITrustedWebActivityServiceDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(788286060, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-562608471.<anonymous>.<anonymous> (TdsTopV2.kt:751)");
                    int i6 = 41 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(788286060, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-562608471.<anonymous>.<anonymous> (TdsTopV2.kt:751)");
                }
                int i7 = ITrustedWebActivityServiceDefault + 101;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
            }
            rightPreset.onExtraCallback(null, null, null, 0L, 0.0f, null, writeTypedList, cameraCaptureResultEmptyCameraCaptureResult, 1572864, 63);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onRelationshipValidationResult(final RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i3 = getSmallIconId + 51;
            ITrustedWebActivityServiceDefault = i3 % 128;
            int i4 = i3 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i5 = getSmallIconId + 65;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = getSmallIconId + 27;
                ITrustedWebActivityServiceDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-562608471, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-562608471.<anonymous> (TdsTopV2.kt:750)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-562608471, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-562608471.<anonymous> (TdsTopV2.kt:750)");
            }
            putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.IAuthTabCallback(), null, null, ForwardingCameraControl.onExtraCallback(788286060, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda9
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 119;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitAsBinder = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.asBinder(rightPreset, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = onExtraCallbackWithResult + 93;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 17 / 0;
                    }
                    return unitAsBinder;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityServiceDefault + 49;
                getSmallIconId = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 5;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1))) {
            int i5 = getSmallIconId + 19;
            ITrustedWebActivityServiceDefault = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1640503818, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1640503818.<anonymous> (TdsTopV2.kt:654)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onMinimized, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, readTypedObject, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, extraCallback, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12585990, 0, 16246);
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ITrustedWebActivityCallbackDefault, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, extraCallbackWithResult, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, cancelNotification, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ICustomTabsServiceDefault, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12782598, 0, 16214);
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(IEngagementSignalsCallbackStub, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, IEngagementSignalsCallbackStubProxy, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, setEngagementSignalsCallback, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12779526, 0, 16222);
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onActivityLayout, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, ICustomTabsService_Parcel, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ITrustedWebActivityCallback, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12585990, 0, 16246);
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(extraCommand, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, isEngagementSignalsApiAvailable, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, IPostMessageServiceStub, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12779526, 0, 16222);
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onExtraCallback, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, ITrustedWebActivityCallbackStubProxy, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, IAuthTabCallbackDefault, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12585990, 0, 16246);
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(getInterfaceDescriptor, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, IEngagementSignalsCallback_Parcel, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ICustomTabsCallback_Parcel, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12585990, 0, 16246);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = getSmallIconId + 115;
                ITrustedWebActivityServiceDefault = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 50 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(y1b y1bVar, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = ITrustedWebActivityServiceDefault + 61;
            getSmallIconId = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-876118428, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-317404239.<anonymous>.<anonymous> (TdsTopV2.kt:772)");
            }
            IntIterator it = new IntRange(1, 10).iterator();
            while (it.hasNext()) {
                y1bVar.onNavigationEvent("뱃지 " + it.nextInt(), null, null, (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) CollectionsKt.random(AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.getEntries(), Random.onNavigationEvent), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 22);
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = ITrustedWebActivityServiceDefault + 3;
                getSmallIconId = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 69 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = ITrustedWebActivityServiceDefault + 45;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(final y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        if ((i & 6) == 0) {
            int i3 = getSmallIconId + 23;
            ITrustedWebActivityServiceDefault = i3 % 128;
            int i4 = i3 % 2;
            i |= !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar) ? 2 : 4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = ITrustedWebActivityServiceDefault + 25;
                getSmallIconId = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-317404239, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-317404239.<anonymous> (TdsTopV2.kt:771)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-317404239, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-317404239.<anonymous> (TdsTopV2.kt:771)");
            }
            y1bVar.onExtraCallback(ForwardingCameraControl.onExtraCallback(-876118428, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i6 = 2 % 2;
                    int i7 = IAuthTabCallback + 87;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onWarmupCompleted(y1bVar, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onWarmupCompleted(y1bVar, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i8 = onNavigationEvent + 61;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[LOOP:0: B:23:0x006d->B:25:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        IntIterator it;
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 51;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 116) != 112;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = ITrustedWebActivityServiceDefault + 49;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = ITrustedWebActivityServiceDefault + 21;
            getSmallIconId = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 76 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1819851415, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-804672963.<anonymous>.<anonymous> (TdsTopV2.kt:782)");
                }
                it = new IntRange(1, 10).iterator();
                while (it.hasNext()) {
                    y1externalsyntheticlambda3.onNavigationEvent("뱃지 " + it.nextInt(), (QuirksExternalSyntheticBackport0) null, (AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent) null, (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) CollectionsKt.random(AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.getEntries(), Random.onNavigationEvent), (AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 22);
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                it = new IntRange(1, 10).iterator();
                while (it.hasNext()) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        int i;
        final y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((iIntValue & 6) == 0) {
            int i3 = ITrustedWebActivityServiceDefault + 93;
            getSmallIconId = i3 % 128;
            if (i3 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                i = 4;
            } else {
                int i4 = getSmallIconId + 89;
                ITrustedWebActivityServiceDefault = i4 % 128;
                int i5 = i4 % 2;
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-804672963, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-804672963.<anonymous> (TdsTopV2.kt:781)");
            }
            y1externalsyntheticlambda3.onExtraCallback(null, ForwardingCameraControl.onExtraCallback(1819851415, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda10
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 107;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitIAuthTabCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback(y1externalsyntheticlambda3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i9 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 == 0) {
                        return unitIAuthTabCallback;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 6) & 896) | 48, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = ITrustedWebActivityServiceDefault + 61;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        int i;
        boolean z = false;
        final y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 109;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                int i5 = getSmallIconId + 73;
                ITrustedWebActivityServiceDefault = i5 % 128;
                i = i5 % 2 != 0 ? 5 : 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i6 = ITrustedWebActivityServiceDefault + 119;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1522489407, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1522489407.<anonymous> (TdsTopV2.kt:794)");
            }
            y1externalsyntheticlambda3.onExtraCallback(null, ForwardingCameraControl.onExtraCallback(-147953511, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    y1ExternalSyntheticLambda3 y1externalsyntheticlambda32 = y1externalsyntheticlambda3;
                    RowScope rowScope = (RowScope) obj;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    if (i10 == 0) {
                        return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(y1externalsyntheticlambda32, rowScope, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    }
                    r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(y1externalsyntheticlambda32, rowScope, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 6) & 896) | 48, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityServiceDefault + 21;
                getSmallIconId = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = ITrustedWebActivityServiceDefault + 105;
        getSmallIconId = i10 % 128;
        if (i10 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit newSessionWithExtras() {
        Unit unit;
        int i = 2 % 2;
        int i2 = getSmallIconId + 57;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 93 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = ITrustedWebActivityServiceDefault + 63;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        int i;
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 9;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 10) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i4 = getSmallIconId + 119;
                    ITrustedWebActivityServiceDefault = i4 % 128;
                    i = i4 % 2 != 0 ? 5 : 4;
                } else {
                    i = 2;
                }
                iIntValue |= i;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = ITrustedWebActivityServiceDefault + 75;
                getSmallIconId = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1211487319, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1211487319.<anonymous> (TdsTopV2.kt:804)");
                    int i6 = 74 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1211487319, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1211487319.<anonymous> (TdsTopV2.kt:804)");
                }
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj2 = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj3 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda97
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 59;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            return r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.getInterfaceDescriptor();
                        }
                        r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.getInterfaceDescriptor();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj3);
                int i7 = ITrustedWebActivityServiceDefault + 29;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                obj2 = obj3;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj2, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (iIntValue << 3) & 112, 2042);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getSmallIconId + 39;
                ITrustedWebActivityServiceDefault = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = ITrustedWebActivityServiceDefault + 95;
        getSmallIconId = i10 % 128;
        if (i10 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit postMessage() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 9;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityServiceDefault + 5;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStubProxy(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityServiceDefault + 19;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
            if ((i & 12) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = ITrustedWebActivityServiceDefault + 9;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = getSmallIconId + 111;
                ITrustedWebActivityServiceDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1439389958, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1439389958.<anonymous> (TdsTopV2.kt:810)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1439389958, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1439389958.<anonymous> (TdsTopV2.kt:810)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda12
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 15;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitICustomTabsCallback = r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.ICustomTabsCallback();
                        int i11 = onExtraCallback + 27;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        return unitICustomTabsCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Object[] objArr = new Object[1];
            a(new char[]{18979, 22727, 14461, 6019}, 3 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            y1externalsyntheticlambda4.onNavigationEvent(((String) objArr[0]).intern(), (Function0) objOnMinimized, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 27) & 1879048192) | 54, 508);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = getSmallIconId + 9;
                ITrustedWebActivityServiceDefault = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        boolean z = true;
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 19;
        int i3 = i2 % 128;
        getSmallIconId = i3;
        if (i2 % 2 != 0 ? (iIntValue & 3) == 2 : (iIntValue & 2) == 3) {
            int i4 = i3 + 55;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = ITrustedWebActivityServiceDefault + 53;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1367385372, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1367385372.<anonymous> (TdsTopV2.kt:768)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = ITrustedWebActivityServiceDefault + 115;
                getSmallIconId = i8 % 128;
                if (i8 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onWarmupCompleted, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, newAuthTabSession, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, updateVisuals, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, asInterface, (QuirkSettingsLoader.onWarmupCompleted) null, ICustomTabsCallbackDefault, IAuthTabCallbackStubProxy, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 818088966, 6, 14678);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = getSmallIconId;
            int i4 = i3 + 115;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 1;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-695012296, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-695012296.<anonymous> (TdsTopV2.kt:828)");
            }
            IntIterator it = new IntRange(1, 10).iterator();
            while (it.hasNext()) {
                AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback("뱃지 " + it.nextInt(), null, null, (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) CollectionsKt.random(AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.getEntries(), Random.onNavigationEvent), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 22);
                int i8 = ITrustedWebActivityServiceDefault + 85;
                getSmallIconId = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 4 / 5;
                }
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 43;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        if ((i & 17) != 16) {
            int i5 = ITrustedWebActivityServiceDefault + 23;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = ITrustedWebActivityServiceDefault + 69;
            getSmallIconId = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 4;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = ITrustedWebActivityServiceDefault + 31;
                getSmallIconId = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1361131453, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1361131453.<anonymous> (TdsTopV2.kt:824)");
            }
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            ZslControlImplExternalSyntheticLambda2.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), (QuirkSettingsLoader.onWarmupCompleted) null, 0, 0, newSessionWithExtras, cameraCaptureResultEmptyCameraCaptureResult, 1573296, 57);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = ITrustedWebActivityServiceDefault + 45;
        getSmallIconId = i11 % 128;
        if (i11 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit setEngagementSignalsCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 53;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 17) != 16) {
            int i5 = ITrustedWebActivityServiceDefault + 51;
            getSmallIconId = i5 % 128;
            z = i5 % 2 != 0;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-859297103, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-859297103.<anonymous> (TdsTopV2.kt:837)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"커스텀 서브타이틀1", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = getSmallIconId + 43;
                ITrustedWebActivityServiceDefault = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onUnminimized(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 15;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i & 44) != 102) {
                int i4 = getSmallIconId + 101;
                ITrustedWebActivityServiceDefault = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                int i6 = getSmallIconId + 115;
                ITrustedWebActivityServiceDefault = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = ITrustedWebActivityServiceDefault + 27;
            getSmallIconId = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = ITrustedWebActivityServiceDefault + 7;
                getSmallIconId = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-662222032, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-662222032.<anonymous> (TdsTopV2.kt:840)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"커스텀 타이틀", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit newSession(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 17) != 16) {
            int i3 = ITrustedWebActivityServiceDefault;
            int i4 = i3 + 123;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 125;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = getSmallIconId + 21;
                ITrustedWebActivityServiceDefault = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1731707665, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1731707665.<anonymous> (TdsTopV2.kt:843)");
            }
            oExternalSyntheticLambda1.IAuthTabCallback("커스텀 텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) null, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 262142);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 27;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit ICustomTabsCallbackDefault(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 49;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 17) != 16) {
            int i5 = ITrustedWebActivityServiceDefault + 113;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = getSmallIconId + 59;
            ITrustedWebActivityServiceDefault = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-585640251, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-585640251.<anonymous> (TdsTopV2.kt:846)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda92
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallback + 9;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                        Unit unit = (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 436083931, iOnExtraCallback, -436083904, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
                        int i12 = onExtraCallback + 43;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"커스텀 버튼", null, null, null, null, null, (Function0) objOnMinimized, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 958}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 51;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = ITrustedWebActivityServiceDefault + 119;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit getInterfaceDescriptor(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = getSmallIconId + 67;
            ITrustedWebActivityServiceDefault = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = ITrustedWebActivityServiceDefault + 9;
                getSmallIconId = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1123512598, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1123512598.<anonymous> (TdsTopV2.kt:821)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1123512598, i, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1123512598.<anonymous> (TdsTopV2.kt:821)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = ITrustedWebActivityServiceDefault + 121;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(prefetch, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, prefetchWithMultipleUrls, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ICustomTabsCallback, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, mayLaunchUrl, (QuirkSettingsLoader.onWarmupCompleted) null, ICustomTabsServiceStub, ITrustedWebActivityCallback_Parcel, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 818088966, 6, 14678);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityServiceDefault + 53;
                getSmallIconId = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        long jExtraCallback;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar)) {
                int i6 = getSmallIconId + 89;
                ITrustedWebActivityServiceDefault = i6 % 128;
                i4 = i6 % 2 != 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = getSmallIconId + 9;
            ITrustedWebActivityServiceDefault = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(67261324, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$67261324.<anonymous> (TdsTopV2.kt:867)");
            }
            int i8 = R.drawable.icon_check_mono;
            deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Icon;
            handleNativeAdClick.onExtraCallback.asInterface asinterfaceOnExtraCallbackWithResult = handleNativeAdClick.onExtraCallback.asInterface.Companion.onExtraCallbackWithResult();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(213632468);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
                i3 = getSmallIconId + 71;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(213633460);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
                i3 = getSmallIconId + 79;
            }
            ITrustedWebActivityServiceDefault = i3 % 128;
            int i9 = i3 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            y1bVar.onExtraCallbackWithResult(Integer.valueOf(i8), deprecated_eventlistenerfactory, asinterfaceOnExtraCallbackWithResult, null, jExtraCallback, 0, 0.0f, 0L, null, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, (i2 << 6) & 896, 4072);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = getSmallIconId + 3;
            ITrustedWebActivityServiceDefault = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onMessageChannelReady(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = ITrustedWebActivityServiceDefault + 81;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i & 42) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                    int i6 = ITrustedWebActivityServiceDefault;
                    int i7 = i6 + 91;
                    getSmallIconId = i7 % 128;
                    int i8 = i7 % 2 == 0 ? 5 : 4;
                    int i9 = i6 + 31;
                    getSmallIconId = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = i8;
                } else {
                    int i11 = getSmallIconId + 99;
                    ITrustedWebActivityServiceDefault = i11 % 128;
                    int i12 = i11 % 2;
                }
                i2 = i | i3;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1956092161, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1956092161.<anonymous> (TdsTopV2.kt:875)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit writeTypedObject(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2);
            int i4 = getSmallIconId + 75;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i6 = ITrustedWebActivityServiceDefault + 97;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i8 = ITrustedWebActivityServiceDefault + 113;
            getSmallIconId = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 52 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = getSmallIconId + 73;
                    ITrustedWebActivityServiceDefault = i10 % 128;
                    if (i10 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(258322984, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$258322984.<anonymous> (TdsTopV2.kt:889)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(258322984, i2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$258322984.<anonymous> (TdsTopV2.kt:889)");
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = ITrustedWebActivityServiceDefault + 47;
                    getSmallIconId = i11 % 128;
                    int i12 = i11 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = ITrustedWebActivityServiceDefault + 83;
            getSmallIconId = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = getSmallIconId + 63;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1877584569, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1877584569.<anonymous> (TdsTopV2.kt:864)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onPostMessage, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (QuirkSettingsLoader.onWarmupCompleted) null, IPostMessageService_Parcel, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 805306374, 0, 15870);
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onSessionEnded, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, areNotificationsEnabled, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 12582918, 0, 16254);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityServiceDefault + 65;
                getSmallIconId = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = ITrustedWebActivityServiceDefault + 27;
        getSmallIconId = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final int onNavigationEvent(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 77;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return gettimebase.onWarmupCompleted();
        }
        gettimebase.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 15;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        long jExtraCallback;
        int i7 = ~i3;
        int i8 = (~(i7 | i4)) | i2;
        int i9 = ~i4;
        int i10 = i7 | i2;
        int i11 = (~(i3 | i9 | i2)) | (~(i10 | i4));
        int i12 = (~i10) | (~(i9 | (~i2)));
        int i13 = i2 + i4 + i6 + (1353909401 * i) + ((-1351514252) * i5);
        int i14 = i13 * i13;
        int i15 = ((i2 * 521834465) - 1171472169) + (i4 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (521834041 * i6) + (1123214353 * i) + ((-684621612) * i5) + (i14 * 1028784128);
        switch ((1883508457 * i2) + 799145984 + ((-1483212659) * i4) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i6) + (337379328 * i) + ((-1540358144) * i5) + (669122560 * i14) + (i15 * i15 * 1635647488)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                y1a y1aVar = (y1a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i16 = 2 % 2;
                Intrinsics.checkNotNullParameter(y1aVar, "");
                if ((iIntValue & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                        int i17 = getSmallIconId + 85;
                        ITrustedWebActivityServiceDefault = i17 % 128;
                        i = i17 % 2 != 0 ? 2 : 4;
                        iIntValue |= i;
                    }
                }
                if ((iIntValue & 19) != 18) {
                    int i18 = getSmallIconId + 5;
                    ITrustedWebActivityServiceDefault = i18 % 128;
                    int i19 = i18 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-105579042, iIntValue, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-105579042.<anonymous> (TdsTopV2.kt:791)");
                        int i20 = getSmallIconId + 55;
                        ITrustedWebActivityServiceDefault = i20 % 128;
                        int i21 = i20 % 2;
                    }
                    y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "뱃지 여러개일 때, 긴 텍스트도 포함돼있을 때", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((458752 & (iIntValue << 15)) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 10:
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i22 = 2 % 2;
                int i23 = ITrustedWebActivityServiceDefault + 31;
                int i24 = i23 % 128;
                getSmallIconId = i24;
                if (i23 % 2 != 0 ? (iIntValue2 & 3) != 2 : (iIntValue2 & 2) != 3) {
                    int i25 = i24 + 71;
                    ITrustedWebActivityServiceDefault = i25 % 128;
                    int i26 = i25 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i27 = ITrustedWebActivityServiceDefault + 113;
                        getSmallIconId = i27 % 128;
                        int i28 = i27 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-319440512, iIntValue2, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-319440512.<anonymous> (TdsTopV2.kt:522)");
                        int i29 = ITrustedWebActivityServiceDefault + 31;
                        getSmallIconId = i29 % 128;
                        int i30 = i29 % 2;
                    }
                    y1ExternalSyntheticLambda6.onExtraCallbackWithResult(postMessage, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, writeTypedObject, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, onGreatestScrollPercentageIncreased, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ICustomTabsCallbackStubProxy, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, ICustomTabsCallbackStub, 0.0f, 0.0f, (Function0<Unit>) null, cameraCaptureResultEmptyCameraCaptureResult2, 12782598, 6, 15190);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 11:
                return IAuthTabCallbackDefault(objArr);
            case 12:
                y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
                RowScope rowScope = (RowScope) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int i31 = 2 % 2;
                int i32 = getSmallIconId + 59;
                ITrustedWebActivityServiceDefault = i32 % 128;
                if (i32 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    if ((iIntValue3 & 105) != 41) {
                        z = true;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    if ((iIntValue3 & 17) != 16) {
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(z, iIntValue3 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i33 = ITrustedWebActivityServiceDefault + 111;
                        getSmallIconId = i33 % 128;
                        int i34 = i33 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-147953511, iIntValue3, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$1522489407.<anonymous>.<anonymous> (TdsTopV2.kt:795)");
                    }
                    IntIterator it = new IntRange(1, 10).iterator();
                    while (it.hasNext()) {
                        y1externalsyntheticlambda3.onNavigationEvent("뱃지 " + it.nextInt(), (QuirksExternalSyntheticBackport0) null, (AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent) null, (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) CollectionsKt.random(AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.getEntries(), Random.onNavigationEvent), (AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult3, 0, 22);
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i35 = getSmallIconId + 7;
                        ITrustedWebActivityServiceDefault = i35 % 128;
                        int i36 = i35 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return access100(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return IAuthTabCallback_Parcel(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_centerType /* 17 */:
                return getInterfaceDescriptor(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_disabledType /* 18 */:
                RightPreset rightPreset = (RightPreset) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int i37 = 2 % 2;
                Intrinsics.checkNotNullParameter(rightPreset, "");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(rightPreset) ? 4 : 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    int i38 = getSmallIconId + 29;
                    ITrustedWebActivityServiceDefault = i38 % 128;
                    int i39 = i38 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(838970493, iIntValue4, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$838970493.<anonymous> (TdsTopV2.kt:881)");
                    }
                    int i40 = R.drawable.icon_check_mono;
                    deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Icon;
                    handleNativeAdClick.onExtraCallback.asInterface asinterfaceOnExtraCallbackWithResult = handleNativeAdClick.onExtraCallback.asInterface.Companion.onExtraCallbackWithResult();
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult4, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(-1203198331);
                        jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, 6).ICustomTabsCallback();
                        int i41 = getSmallIconId + 91;
                        ITrustedWebActivityServiceDefault = i41 % 128;
                        int i42 = i41 % 2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(-1203197339);
                        jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, 6).extraCallback();
                    }
                    long j = jExtraCallback;
                    cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                    int i43 = getSmallIconId + 33;
                    ITrustedWebActivityServiceDefault = i43 % 128;
                    if (i43 % 2 != 0) {
                        rightPreset.onExtraCallback(Integer.valueOf(i40), deprecated_eventlistenerfactory, asinterfaceOnExtraCallbackWithResult, null, j, 1, 1.0f, 1L, null, 2.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult4, 27108, (iIntValue4 * 46) & 28808, 18121);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    } else {
                        rightPreset.onExtraCallback(Integer.valueOf(i40), deprecated_eventlistenerfactory, asinterfaceOnExtraCallbackWithResult, null, j, 0, 0.0f, 0L, null, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult4, 432, (iIntValue4 << 6) & 896, 4072);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return extraCallback(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return writeTypedObject(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return readTypedObject(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                int i44 = 2 % 2;
                int i45 = ITrustedWebActivityServiceDefault + 43;
                getSmallIconId = i45 % 128;
                int i46 = i45 % 2;
                Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
                int i47 = ITrustedWebActivityServiceDefault + 31;
                getSmallIconId = i47 % 128;
                int i48 = i47 % 2;
                return unitICustomTabsCallbackDefault;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                return extraCallbackWithResult(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return ICustomTabsCallback(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                return onActivityLayout(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                return onMinimized(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieHeight /* 27 */:
                return onActivityResized(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieRepeatCount /* 28 */:
                return onMessageChannelReady(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieUrl /* 29 */:
                return onPostMessage(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieWidth /* 30 */:
                return ICustomTabsCallbackDefault(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftRank /* 31 */:
                return onUnminimized(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftType /* 32 */:
                return ICustomTabsCallbackStub(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightArrow /* 33 */:
                int i49 = 2 % 2;
                int i50 = ITrustedWebActivityServiceDefault + 79;
                getSmallIconId = i50 % 128;
                int i51 = i50 % 2;
                Unit unit = Unit.INSTANCE;
                int i52 = ITrustedWebActivityServiceDefault + 53;
                getSmallIconId = i52 % 128;
                int i53 = i52 % 2;
                return unit;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightBadgeText /* 34 */:
                y1a y1aVar2 = (y1a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue5 = ((Number) objArr[2]).intValue();
                int i54 = 2 % 2;
                Intrinsics.checkNotNullParameter(y1aVar2, "");
                if ((iIntValue5 & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult5.onNavigationEvent(y1aVar2)) {
                        int i55 = getSmallIconId + 47;
                        ITrustedWebActivityServiceDefault = i55 % 128;
                        int i56 = i55 % 2;
                    } else {
                        i = 2;
                    }
                    iIntValue5 |= i;
                }
                if ((iIntValue5 & 19) != 18) {
                    int i57 = ITrustedWebActivityServiceDefault + 3;
                    getSmallIconId = i57 % 128;
                    int i58 = i57 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(z, iIntValue5 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1064937227, iIntValue5, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$-1064937227.<anonymous> (TdsTopV2.kt:731)");
                        int i59 = ITrustedWebActivityServiceDefault + 73;
                        getSmallIconId = i59 % 128;
                        int i60 = i59 % 2;
                    }
                    y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar2, "버튼, 화살표 외 중앙 정렬", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult5, Integer.valueOf((458752 & (iIntValue5 << 15)) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult5.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightBreakEnabled /* 35 */:
                y1ExternalSyntheticLambda4 y1externalsyntheticlambda4 = (y1ExternalSyntheticLambda4) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult6 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue6 = ((Number) objArr[2]).intValue();
                int i61 = 2 % 2;
                Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
                if ((iIntValue6 & 6) == 0) {
                    int i62 = getSmallIconId + 5;
                    ITrustedWebActivityServiceDefault = i62 % 128;
                    int i63 = i62 % 2;
                    iIntValue6 |= !(cameraCaptureResultEmptyCameraCaptureResult6.onNavigationEvent(y1externalsyntheticlambda4) ^ true) ? 4 : 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult6.onWarmupCompleted((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(939312532, iIntValue6, -1, "im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt.lambda$939312532.<anonymous> (TdsTopV2.kt:852)");
                        int i64 = ITrustedWebActivityServiceDefault + 75;
                        getSmallIconId = i64 % 128;
                        int i65 = i64 % 2;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult6.onMinimized();
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.top.ComposableSingletons$TdsTopV2Kt$$ExternalSyntheticLambda5
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i66 = 2 % 2;
                                int i67 = onWarmupCompleted + 113;
                                IAuthTabCallback = i67 % 128;
                                if (i67 % 2 != 0) {
                                    int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                    int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                    return (Unit) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1419853800, iOnExtraCallback, 1419853825, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
                                }
                                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult6.onWarmupCompleted(obj2);
                        int i66 = getSmallIconId + 73;
                        ITrustedWebActivityServiceDefault = i66 % 128;
                        obj = obj2;
                        if (i66 % 2 != 0) {
                            int i67 = 2 / 5;
                            obj = obj2;
                        }
                    }
                    Object[] objArr2 = new Object[1];
                    a(new char[]{18979, 22727, 14461, 6019}, ExpandableListView.getPackedPositionType(0L) + 4, objArr2);
                    y1externalsyntheticlambda4.onNavigationEvent(((String) objArr2[0]).intern(), (Function0) obj, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult6, ((iIntValue6 << 27) & 1879048192) | 54, 508);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i68 = getSmallIconId + 105;
                        ITrustedWebActivityServiceDefault = i68 % 128;
                        int i69 = i68 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult6.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonDisplay /* 36 */:
                return onRelationshipValidationResult(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonLabel /* 37 */:
                return ICustomTabsCallbackStubProxy(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonSize /* 38 */:
                return extraCommand(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonStyle /* 39 */:
                return ICustomTabsCallback_Parcel(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonType /* 40 */:
                return mayLaunchUrl(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2064240418, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2064240378, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -893080454, iOnExtraCallback, 893080473, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 164132776, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -164132759, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 436083931, iOnExtraCallback, -436083904, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
    }

    public static /* synthetic */ Unit asBinder() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1419853800, iOnExtraCallback, 1419853825, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onNavigationEvent(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1448547635, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1448547633, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1330333592, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1330333624, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -306301638, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 306301659, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit asInterface(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 516683510, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -516683507, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1309878231, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1309878223, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1880956313, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1880956341, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1646074866, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1646074889, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit readTypedObject(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 969329295, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -969329284, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit extraCallbackWithResult(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -257717147, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 257717186, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1168517764, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1168517784, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit extraCallback() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1300745566, iOnExtraCallback, -1300745544, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 392862120, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -392862104, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1435762912, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1435762876, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit ICustomTabsCallbackStubProxy() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -552091158, iOnExtraCallback, 552091191, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
    }

    private static final Unit onMinimized(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1689113185, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1689113215, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onNavigationEvent(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1186311950, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1186311938, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit access100(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1204277947, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1204277940, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit mayLaunchUrl() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1767328068, iOnExtraCallback, -1767328053, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
    }

    private static final Unit ICustomTabsCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1097466608, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1097466608, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit ICustomTabsService() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1028241712, iOnExtraCallback, -1028241707, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
    }

    private static final Unit onMessageChannelReady(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1093464117, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1093464135, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit asInterface(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 794713426, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -794713391, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit ICustomTabsCallback_Parcel() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1078861530, iOnExtraCallback, -1078861499, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
    }

    private static final Unit onPostMessage(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1711043992, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1711044001, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onActivityLayout(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2060270354, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2060270320, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit IAuthTabCallbackStubProxy(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 465352669, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -465352665, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onActivityLayout(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1289328126, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1289328164, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit IAuthTabCallback_Parcel(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -192362847, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 192362884, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onMinimized(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1782000266, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1782000253, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit isEngagementSignalsApiAvailable(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666447363, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1666447357, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit prefetch(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1670578275, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1670578276, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit writeTypedObject(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 499356756, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -499356746, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit setEngagementSignalsCallback() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 233782329, iOnExtraCallback, -233782303, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback2);
    }

    private static final Unit onRelationshipValidationResult(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 572482930, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -572482901, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit requestPostMessageChannelWithExtras(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -427170263, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 427170287, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Function2) onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1826192803, iOnExtraCallback, 1826192817, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this}, iOnExtraCallback2);
    }

    static void onUnminimized() {
        ITrustedWebActivityService = (char) 39584;
        notifyNotificationWithChannel = (char) 13898;
        getActiveNotifications = (char) 39702;
        getSmallIconBitmap = (char) 57008;
    }
}
