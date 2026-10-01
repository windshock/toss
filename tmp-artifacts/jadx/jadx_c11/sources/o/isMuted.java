package o;

import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.tds.foundation.anim.rally.Rotate3D;
import im.toss.tds.view.R;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinWebViewActivitya;
import o.attachAppLovinSdk;
import o.isCreativeDebuggerEnabled;
import o.isMuted;
import o.r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk;
import o.setImageUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isMuted {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAreNotificationsEnabled = areNotificationsEnabled(attachapplovinsdk);
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAreNotificationsEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Unit unit;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {attachapplovinsdk};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
        if (i3 != 0) {
            unit = (Unit) onWarmupCompleted(iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, -1448166807, objArr2, 1448166808, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2);
            int i4 = 91 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, -1448166807, objArr2, 1448166808, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2);
        }
        int i5 = onExtraCallback + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWrite = write(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = onWarmupCompleted + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return unitWrite;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallbackStub = ITrustedWebActivityCallbackStub(attachapplovinsdk);
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitITrustedWebActivityCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageServiceStubProxy = IPostMessageServiceStubProxy(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return unitIPostMessageServiceStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedList = writeTypedList(attachapplovinsdk);
        int i4 = onWarmupCompleted + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return unitWriteTypedList;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackStubProxy = IEngagementSignalsCallbackStubProxy(attachapplovinsdk);
        int i4 = onWarmupCompleted + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIEngagementSignalsCallbackStubProxy;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1317041487, new Object[]{appLovinSdkSettings}, 1317041492, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
        int i3 = 33 / 0;
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1317041487, new Object[]{appLovinSdkSettings}, 1317041492, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4);
    }

    public static /* synthetic */ Unit ICustomTabsCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNotifyNotificationWithChannel = notifyNotificationWithChannel(attachapplovinsdk);
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitNotifyNotificationWithChannel;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IPostMessageServiceStub(attachapplovinsdk);
            throw null;
        }
        Unit unitIPostMessageServiceStub = IPostMessageServiceStub(attachapplovinsdk);
        int i3 = onWarmupCompleted + 35;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
        }
        return unitIPostMessageServiceStub;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit activeNotifications = getActiveNotifications(attachapplovinsdk);
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return activeNotifications;
    }

    public static /* synthetic */ Unit ICustomTabsCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsServiceStubProxy(attachapplovinsdk);
            throw null;
        }
        Unit unitICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy(attachapplovinsdk);
        int i3 = onExtraCallback + 85;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitICustomTabsServiceStubProxy;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsService(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageService = IPostMessageService(attachapplovinsdk);
        int i4 = onWarmupCompleted + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIPostMessageService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsServiceDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            getSmallIconBitmap(attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit smallIconBitmap = getSmallIconBitmap(attachapplovinsdk);
        int i3 = onExtraCallback + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return smallIconBitmap;
    }

    public static /* synthetic */ Unit ICustomTabsServiceStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1862531253, new Object[]{attachapplovinsdk}, -1862531230, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onWarmupCompleted + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit access000(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback(attachapplovinsdk);
        int i4 = onWarmupCompleted + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIEngagementSignalsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallback = ITrustedWebActivityCallback(attachapplovinsdk);
        int i4 = onWarmupCompleted + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitITrustedWebActivityCallback;
    }

    public static /* synthetic */ Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRatingCompatApi19Impl = RatingCompatApi19Impl(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return unitRatingCompatApi19Impl;
    }

    public static /* synthetic */ Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 877465359, new Object[]{attachapplovinsdk}, -877465340, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnSessionEnded = onSessionEnded(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return unitOnSessionEnded;
    }

    public static /* synthetic */ Unit extraCommand(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityServiceStub = ITrustedWebActivityServiceStub(attachapplovinsdk);
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitITrustedWebActivityServiceStub;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -825911390, new Object[]{attachapplovinsdk}, 825911407, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onWarmupCompleted + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit mayLaunchUrl(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub(attachapplovinsdk);
        int i4 = onWarmupCompleted + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIEngagementSignalsCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit newAuthTabSession(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault(attachapplovinsdk);
        int i4 = onWarmupCompleted + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return unitIEngagementSignalsCallbackDefault;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnVerticalScrollEvent = onVerticalScrollEvent(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = onExtraCallback + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnVerticalScrollEvent;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitMediaMetadataCompat = MediaMetadataCompat(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        int i5 = onWarmupCompleted + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitMediaMetadataCompat;
    }

    public static /* synthetic */ Unit onActivityResized(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageServiceDefault = IPostMessageServiceDefault(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return unitIPostMessageServiceDefault;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            MediaBrowserCompatMediaItem(attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(attachapplovinsdk);
        int i3 = onExtraCallback + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitMediaBrowserCompatMediaItem;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -81687537, new Object[]{attachapplovinsdk}, 81687566, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityServiceDefault = ITrustedWebActivityServiceDefault(attachapplovinsdk);
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitITrustedWebActivityServiceDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCancelNotification = cancelNotification(attachapplovinsdk);
        int i4 = onExtraCallback + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitCancelNotification;
    }

    public static /* synthetic */ Unit onMessageChannelReady(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return unitIEngagementSignalsCallback_Parcel;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AudioAttributesImplApi26Parcelizer(attachapplovinsdk);
            obj.hashCode();
            throw null;
        }
        Unit unitAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(attachapplovinsdk);
        int i3 = onExtraCallback + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAudioAttributesImplApi26Parcelizer;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(appLovinSdkSettings);
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(attachapplovinsdk);
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return unitAudioAttributesImplBaseParcelizer;
    }

    public static /* synthetic */ Unit onPostMessage(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IconCompatParcelizer(attachapplovinsdk);
            throw null;
        }
        Unit unitIconCompatParcelizer = IconCompatParcelizer(attachapplovinsdk);
        int i3 = onExtraCallback + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIconCompatParcelizer;
    }

    public static /* synthetic */ Unit onRelationshipValidationResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(attachapplovinsdk);
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unitRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return ITrustedWebActivityServiceStubProxy(attachapplovinsdk);
        }
        ITrustedWebActivityServiceStubProxy(attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i4);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i3 | i2));
        int i11 = ~(i7 | i9);
        int i12 = (~i2) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i3);
        int i15 = i3 + i4 + i6 + ((-1261570137) * i) + (2040842291 * i5);
        int i16 = i15 * i15;
        int i17 = ((i3 * (-750812765)) - 1471086592) + ((-750812765) * i4) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i6) + ((-1928462336) * i) + (1629880320 * i5) + (2096168960 * i16);
        int i18 = ((i3 * 1408203179) - 1033136887) + (i4 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i6 * 1408202841) + (i * (-1046847217)) + (i5 * (-121732677)) + (i16 * 1741225984);
        switch (i17 + (i18 * i18 * 838795264)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i19 = 2 % 2;
                int i20 = onExtraCallback + 37;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                Unit unit = Unit.INSTANCE;
                int i22 = onExtraCallback + 1;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return access000(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return extraCallbackWithResult(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return ICustomTabsCallback(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return writeTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return onMinimized(objArr);
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return onPostMessage(objArr);
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                attachAppLovinSdk attachapplovinsdk2 = (attachAppLovinSdk) objArr[0];
                int i24 = 2 % 2;
                int i25 = onExtraCallback + 105;
                onWarmupCompleted = i25 % 128;
                int i26 = i25 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk2, "");
                Unit unit2 = Unit.INSTANCE;
                int i27 = onExtraCallback + 87;
                onWarmupCompleted = i27 % 128;
                int i28 = i27 % 2;
                return unit2;
            case R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return onMessageChannelReady(objArr);
            case R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                return onActivityLayout(objArr);
            case R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
                Float f = (Float) objArr[1];
                Float f2 = (Float) objArr[2];
                Function1 function1 = (Function1) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                Object obj = objArr[5];
                int i29 = 2 % 2;
                if ((iIntValue & 1) != 0) {
                    int i30 = onExtraCallback;
                    int i31 = i30 + 35;
                    onWarmupCompleted = i31 % 128;
                    int i32 = i31 % 2;
                    int i33 = i30 + 27;
                    onWarmupCompleted = i33 % 128;
                    int i34 = i33 % 2;
                    f = null;
                }
                if ((iIntValue & 2) != 0) {
                    int i35 = onExtraCallback + 51;
                    onWarmupCompleted = i35 % 128;
                    int i36 = i35 % 2;
                    f2 = null;
                }
                if ((iIntValue & 4) != 0) {
                    function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda23
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i37 = 2 % 2;
                            int i38 = IAuthTabCallback + 9;
                            onNavigationEvent = i38 % 128;
                            int i39 = i38 % 2;
                            Unit unitIAuthTabCallbackStub = isMuted.IAuthTabCallbackStub((attachAppLovinSdk) obj2);
                            if (i39 == 0) {
                                int i40 = 10 / 0;
                            }
                            int i41 = onNavigationEvent + 21;
                            IAuthTabCallback = i41 % 128;
                            int i42 = i41 % 2;
                            return unitIAuthTabCallbackStub;
                        }
                    };
                }
                return onExtraCallbackWithResult(appLovinSdkSettings, f, f2, (Function1<? super attachAppLovinSdk, Unit>) function1);
            case R.styleable.TdsListRowV1View_leftLottieHeight /* 27 */:
                return onActivityResized(objArr);
            case R.styleable.TdsListRowV1View_leftLottieRepeatCount /* 28 */:
                return ICustomTabsCallbackDefault(objArr);
            case R.styleable.TdsListRowV1View_leftLottieUrl /* 29 */:
                return ICustomTabsCallbackStubProxy(objArr);
            case R.styleable.TdsListRowV1View_leftLottieWidth /* 30 */:
                return onUnminimized(objArr);
            case R.styleable.TdsListRowV1View_leftRank /* 31 */:
                return onRelationshipValidationResult(objArr);
            case R.styleable.TdsListRowV1View_leftType /* 32 */:
                return ICustomTabsCallbackStub(objArr);
            case R.styleable.TdsListRowV1View_rightArrow /* 33 */:
                return isEngagementSignalsApiAvailable(objArr);
            case R.styleable.TdsListRowV1View_rightBadgeText /* 34 */:
                return mayLaunchUrl(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            access200(attachapplovinsdk);
            throw null;
        }
        Unit unitAccess200 = access200(attachapplovinsdk);
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitAccess200;
    }

    public static /* synthetic */ Unit postMessage(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit smallIconId = getSmallIconId(attachapplovinsdk);
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return smallIconId;
    }

    public static /* synthetic */ Unit prefetch(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return RatingCompat1(attachapplovinsdk);
        }
        RatingCompat1(attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit prefetchWithMultipleUrls(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1112238509, new Object[]{attachapplovinsdk}, -1112238478, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit readTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRatingCompatStyle = RatingCompatStyle(attachapplovinsdk);
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitRatingCompatStyle;
    }

    public static /* synthetic */ Unit receiveFile(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased(attachapplovinsdk);
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnGreatestScrollPercentageIncreased;
    }

    public static /* synthetic */ Unit requestPostMessageChannel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            ITrustedWebActivityCallbackDefault(attachapplovinsdk);
            throw null;
        }
        Unit unitITrustedWebActivityCallbackDefault = ITrustedWebActivityCallbackDefault(attachapplovinsdk);
        int i3 = onWarmupCompleted + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 1 / 0;
        }
        return unitITrustedWebActivityCallbackDefault;
    }

    public static /* synthetic */ Unit requestPostMessageChannelWithExtras(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -41505695, new Object[]{attachapplovinsdk}, 41505709, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit setEngagementSignalsCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return unitAudioAttributesImplApi21Parcelizer;
    }

    public static /* synthetic */ Unit updateVisuals(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            read(attachapplovinsdk);
            throw null;
        }
        Unit unit = read(attachapplovinsdk);
        int i3 = onWarmupCompleted + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit validateRelationship(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallback_Parcel = ITrustedWebActivityCallback_Parcel(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return unitITrustedWebActivityCallback_Parcel;
    }

    public static /* synthetic */ Unit warmup(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1153702979, new Object[]{attachapplovinsdk}, -1153702973, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsService_Parcel = ICustomTabsService_Parcel(attachapplovinsdk);
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return unitICustomTabsService_Parcel;
    }

    public static /* synthetic */ Unit writeTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2105518540, new Object[]{attachapplovinsdk}, 2105518548, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return unit;
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @NotNull Function1<? super AppLovinSdkSettings, Unit> function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            Intrinsics.checkNotNullParameter(function1, "");
            appLovinSdkSettings.onExtraCallback(isVerboseLoggingEnabled.SERIAL);
            function1.invoke(appLovinSdkSettings);
            appLovinSdkSettings.onExtraCallback(isVerboseLoggingEnabled.OVERRIDE);
            throw null;
        }
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        appLovinSdkSettings.onExtraCallback(isVerboseLoggingEnabled.SERIAL);
        function1.invoke(appLovinSdkSettings);
        appLovinSdkSettings.onExtraCallback(isVerboseLoggingEnabled.OVERRIDE);
        int i3 = onExtraCallback + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return appLovinSdkSettings;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final AppLovinSdkSettings onExtraCallbackWithResult(@NotNull AppLovinSdkSettings appLovinSdkSettings, @NotNull Function1<? super AppLovinSdkSettings, Unit> function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            Intrinsics.checkNotNullParameter(function1, "");
            appLovinSdkSettings.onExtraCallback(isVerboseLoggingEnabled.PARALLEL);
            function1.invoke(appLovinSdkSettings);
            appLovinSdkSettings.onExtraCallback(isVerboseLoggingEnabled.OVERRIDE);
            int i3 = 56 / 0;
        } else {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            Intrinsics.checkNotNullParameter(function1, "");
            appLovinSdkSettings.onExtraCallback(isVerboseLoggingEnabled.PARALLEL);
            function1.invoke(appLovinSdkSettings);
            appLovinSdkSettings.onExtraCallback(isVerboseLoggingEnabled.OVERRIDE);
        }
        return appLovinSdkSettings;
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 43;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda42
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 19;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitExtraCallbackWithResult = isMuted.extraCallbackWithResult((attachAppLovinSdk) obj2);
                    int i11 = IAuthTabCallback + 103;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    return unitExtraCallbackWithResult;
                }
            };
        }
        return onExtraCallback(appLovinSdkSettings, f, f2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    private static final Unit onSessionEnded(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
            int i3 = 46 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return unit;
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new setVerboseLogging(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit ITrustedWebActivityCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings asBinder(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda47
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 101;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitValidateRelationship = isMuted.validateRelationship((attachAppLovinSdk) obj2);
                    if (i9 != 0) {
                        int i10 = 3 / 0;
                    }
                    return unitValidateRelationship;
                }
            };
        }
        return onTransact(appLovinSdkSettings, f, f2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    public static final AppLovinSdkSettings onTransact(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new isTv(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit areNotificationsEnabled(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) throws NumberFormatException {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            int i2 = onExtraCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        if ((iIntValue & 2) != 0) {
            str2 = null;
        }
        if ((iIntValue & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda16
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 125;
                    onWarmupCompleted = i5 % 128;
                    Object[] objArr2 = {(attachAppLovinSdk) obj2};
                    if (i5 % 2 == 0) {
                        return (Unit) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1114191303, objArr2, 1114191307, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                    }
                    throw null;
                }
            };
        }
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = onNavigationEvent(appLovinSdkSettings, str, str2, (Function1<? super attachAppLovinSdk, Unit>) function1);
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    public static final AppLovinSdkSettings onNavigationEvent(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable String str, @Nullable String str2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) throws NumberFormatException {
        Float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback = IAuthTabCallback(str);
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback2 = IAuthTabCallback(str2);
        isCreativeDebuggerEnabled.onExtraCallback onextracallback = null;
        if (pairIAuthTabCallback != null) {
            int i2 = onWarmupCompleted + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            f = (Float) pairIAuthTabCallback.getFirst();
        } else {
            f = null;
        }
        isCreativeDebuggerEnabled.onExtraCallback onextracallback2 = pairIAuthTabCallback != null ? (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback.getSecond() : null;
        Float f2 = pairIAuthTabCallback2 != null ? (Float) pairIAuthTabCallback2.getFirst() : null;
        if (pairIAuthTabCallback2 != null) {
            int i4 = onExtraCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            onextracallback = (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback2.getSecond();
        }
        return onExtraCallback(appLovinSdkSettings, f, onextracallback2, f2, onextracallback, function1);
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallbackStub(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda43
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 111;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitICustomTabsServiceDefault = isMuted.ICustomTabsServiceDefault((attachAppLovinSdk) obj2);
                    if (i6 != 0) {
                        int i7 = 82 / 0;
                    }
                    return unitICustomTabsServiceDefault;
                }
            };
        }
        AppLovinSdkSettings appLovinSdkSettingsAsInterface = asInterface(appLovinSdkSettings, f, f2, function1);
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return appLovinSdkSettingsAsInterface;
    }

    private static final Unit getSmallIconBitmap(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final AppLovinSdkSettings asInterface(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new isFireTv(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit notifyNotificationWithChannel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallbackDefault(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 11;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda34
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 57;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitICustomTabsCallbackStubProxy = isMuted.ICustomTabsCallbackStubProxy((attachAppLovinSdk) obj2);
                    int i11 = onWarmupCompleted + 71;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        return unitICustomTabsCallbackStubProxy;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackDefault = IAuthTabCallbackDefault(appLovinSdkSettings, f, f2, function1);
        int i8 = onWarmupCompleted + 113;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return appLovinSdkSettingsIAuthTabCallbackDefault;
    }

    private static final Unit getActiveNotifications(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int i3 = 50 / 0;
        return Unit.INSTANCE;
    }

    public static final AppLovinSdkSettings IAuthTabCallbackDefault(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new isSdkVersionGreaterThanOrEqualTo(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit ITrustedWebActivityServiceDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit cancelNotification(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return unit2;
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new isTv(f, onextracallback, f2, onextracallback2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback_Parcel(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = onWarmupCompleted + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            f = null;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 55;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda33
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 97;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                    Unit unit = (Unit) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -949084023, new Object[]{(attachAppLovinSdk) obj3}, 949084025, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                    int i9 = onExtraCallbackWithResult + 11;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }
            };
        }
        return IAuthTabCallback_Parcel(appLovinSdkSettings, f, f2, function1);
    }

    private static final Unit MediaBrowserCompatMediaItem(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
            int i3 = 97 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final AppLovinSdkSettings IAuthTabCallback_Parcel(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new AppLovinWebViewActivitya.onNavigationEvent(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, Integer num, Integer num2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 39;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i8 = onWarmupCompleted + 87;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            num2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda48
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onWarmupCompleted + 39;
                    IAuthTabCallback = i11 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i11 % 2 != 0) {
                        return isMuted.getInterfaceDescriptor(attachapplovinsdk);
                    }
                    isMuted.getInterfaceDescriptor(attachapplovinsdk);
                    throw null;
                }
            };
            int i10 = onExtraCallback + 83;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        return onWarmupCompleted(appLovinSdkSettings, num, num2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    public static final AppLovinSdkSettings onWarmupCompleted(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Integer num, @Nullable Integer num2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        Float fValueOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (num != null) {
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            fValueOf = Float.valueOf(num.intValue());
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            fValueOf = null;
        }
        return IAuthTabCallback_Parcel(appLovinSdkSettings, fValueOf, num2 != null ? Float.valueOf(num2.intValue()) : null, function1);
    }

    private static final Unit RatingCompatStyle(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ AppLovinSdkSettings getInterfaceDescriptor(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted;
            int i4 = i3 + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 33;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda18
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 1;
                    onWarmupCompleted = i9 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i9 % 2 != 0) {
                        return isMuted.readTypedObject(attachapplovinsdk);
                    }
                    isMuted.readTypedObject(attachapplovinsdk);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
        AppLovinSdkSettings interfaceDescriptor = getInterfaceDescriptor(appLovinSdkSettings, f, f2, function1);
        int i8 = onExtraCallback + 53;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return interfaceDescriptor;
    }

    public static final AppLovinSdkSettings getInterfaceDescriptor(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new AppLovinWebViewActivitya.onExtraCallbackWithResult(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return appLovinSdkSettingsOnNavigationEvent;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallback(AppLovinSdkSettings appLovinSdkSettings, Integer num, Integer num2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 65;
            int i6 = i5 % 128;
            onExtraCallback = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 99;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda21
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 109;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                    Unit unit = (Unit) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 395371640, new Object[]{(attachAppLovinSdk) obj2}, -395371633, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                    int i13 = onWarmupCompleted + 19;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 7 / 0;
                    }
                    return unit;
                }
            };
        }
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 565625982, new Object[]{appLovinSdkSettings, num, num2, function1}, -565625971, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int i3 = 25 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Float fValueOf;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        Integer num = (Integer) objArr[1];
        Integer num2 = (Integer) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Float fValueOf2 = null;
        if (num != null) {
            fValueOf = Float.valueOf(num.intValue());
        } else {
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            fValueOf = null;
        }
        if (num2 != null) {
            int i4 = onWarmupCompleted + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            fValueOf2 = Float.valueOf(num2.intValue());
        }
        return getInterfaceDescriptor(appLovinSdkSettings, fValueOf, fValueOf2, function1);
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings, String str, String str2, Function1 function1, int i, Object obj) throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 87;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i8 = i3 + 37;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda30
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 109;
                    onWarmupCompleted = i11 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i11 % 2 != 0) {
                        return isMuted.prefetchWithMultipleUrls(attachapplovinsdk);
                    }
                    isMuted.prefetchWithMultipleUrls(attachapplovinsdk);
                    throw null;
                }
            };
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult(appLovinSdkSettings, str, str2, (Function1<? super attachAppLovinSdk, Unit>) function1);
        int i10 = onExtraCallback + 99;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 37 / 0;
        }
        return appLovinSdkSettingsOnExtraCallbackWithResult;
    }

    public static final AppLovinSdkSettings onExtraCallbackWithResult(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable String str, @Nullable String str2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) throws NumberFormatException {
        Float f;
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback = IAuthTabCallback(str);
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback2 = IAuthTabCallback(str2);
        if (pairIAuthTabCallback != null) {
            int i4 = onWarmupCompleted + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            f = (Float) pairIAuthTabCallback.getFirst();
        } else {
            int i6 = onExtraCallback + 113;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            f = null;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = onWarmupCompleted(appLovinSdkSettings, f, pairIAuthTabCallback != null ? (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback.getSecond() : null, pairIAuthTabCallback2 != null ? (Float) pairIAuthTabCallback2.getFirst() : null, pairIAuthTabCallback2 != null ? (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback2.getSecond() : null, function1);
        int i8 = onExtraCallback + 81;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return appLovinSdkSettingsOnWarmupCompleted;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallbackStubProxy(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 91;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 9;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda39
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallbackWithResult + 87;
                    onWarmupCompleted = i12 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i12 % 2 != 0) {
                        isMuted.onExtraCallback(attachapplovinsdk);
                        throw null;
                    }
                    Unit unitOnExtraCallback = isMuted.onExtraCallback(attachapplovinsdk);
                    int i13 = onExtraCallbackWithResult + 49;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnExtraCallback;
                }
            };
        }
        return IAuthTabCallbackStubProxy(appLovinSdkSettings, f, f2, function1);
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final AppLovinSdkSettings IAuthTabCallbackStubProxy(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.onWarmupCompleted(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit AudioAttributesImplApi26Parcelizer(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        Float f = (Float) objArr[1];
        Float f2 = (Float) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj2 = null;
        if (i2 % 2 != 0 ? (iIntValue & 1) != 0 : (iIntValue & 1) != 0) {
            f = null;
        }
        if ((iIntValue & 2) != 0) {
            int i4 = i3 + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            f2 = null;
        }
        if ((iIntValue & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda51
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 67;
                    IAuthTabCallback = i6 % 128;
                    Object[] objArr2 = {(attachAppLovinSdk) obj3};
                    if (i6 % 2 != 0) {
                        return (Unit) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -2102683685, objArr2, 2102683694, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                    }
                    throw null;
                }
            };
        }
        return access100(appLovinSdkSettings, f, f2, function1);
    }

    private static final Unit write(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final AppLovinSdkSettings access100(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinSdkSettingsOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit IconCompatParcelizer(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
            int i3 = 60 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onWarmupCompleted + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, String str, String str2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 103;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda32
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 39;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnPostMessage = isMuted.onPostMessage((attachAppLovinSdk) obj2);
                    if (i10 == 0) {
                        int i11 = 31 / 0;
                    }
                    int i12 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnPostMessage;
                }
            };
        }
        return onWarmupCompleted(appLovinSdkSettings, str, str2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    public static final AppLovinSdkSettings onWarmupCompleted(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable String str, @Nullable String str2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) throws NumberFormatException {
        Float f;
        isCreativeDebuggerEnabled.onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback = IAuthTabCallback(str);
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback2 = IAuthTabCallback(str2);
        Object obj = null;
        Float f2 = pairIAuthTabCallback != null ? (Float) pairIAuthTabCallback.getFirst() : null;
        isCreativeDebuggerEnabled.onExtraCallback onextracallback2 = pairIAuthTabCallback != null ? (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback.getSecond() : null;
        if (pairIAuthTabCallback2 != null) {
            int i4 = onExtraCallback + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            f = (Float) pairIAuthTabCallback2.getFirst();
        } else {
            f = null;
        }
        if (pairIAuthTabCallback2 != null) {
            int i6 = onWarmupCompleted + 75;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            onextracallback = (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback2.getSecond();
            if (i7 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            onextracallback = null;
        }
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 34329437, new Object[]{appLovinSdkSettings, f2, onextracallback2, f, onextracallback, function1}, -34329403, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final Unit MediaMetadataCompat(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit AudioAttributesImplBaseParcelizer(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static final AppLovinSdkSettings onWarmupCompleted(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new AppLovinWebViewActivitya.onExtraCallbackWithResult(f, onextracallback, f2, onextracallback2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit AudioAttributesImplApi21Parcelizer(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int i3 = 57 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        Float f = (Float) objArr[1];
        isCreativeDebuggerEnabled.onExtraCallback onextracallback = (isCreativeDebuggerEnabled.onExtraCallback) objArr[2];
        Float f2 = (Float) objArr[3];
        isCreativeDebuggerEnabled.onExtraCallback onextracallback2 = (isCreativeDebuggerEnabled.onExtraCallback) objArr[4];
        Function1 function1 = (Function1) objArr[5];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback(f, onextracallback, f2, onextracallback2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinSdkSettingsOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda24
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 1;
                    onNavigationEvent = i8 % 128;
                    Object[] objArr = {(attachAppLovinSdk) obj2};
                    if (i8 % 2 != 0) {
                        return (Unit) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -33728134, objArr, 33728147, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
        return onNavigationEvent(appLovinSdkSettings, f, f2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    private static final Unit ITrustedWebActivityCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return unit;
    }

    public static final AppLovinSdkSettings onNavigationEvent(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new Rotate3D.X(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit ITrustedWebActivityCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return unit;
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, String str, String str2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onWarmupCompleted + 27;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onWarmupCompleted + 65;
                    onExtraCallbackWithResult = i7 % 128;
                    Object obj3 = null;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i7 % 2 == 0) {
                        isMuted.requestPostMessageChannel(attachapplovinsdk);
                        throw null;
                    }
                    Unit unitRequestPostMessageChannel = isMuted.requestPostMessageChannel(attachapplovinsdk);
                    int i8 = onExtraCallbackWithResult + 51;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitRequestPostMessageChannel;
                    }
                    obj3.hashCode();
                    throw null;
                }
            };
        }
        return IAuthTabCallback(appLovinSdkSettings, str, str2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    public static final AppLovinSdkSettings IAuthTabCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable String str, @Nullable String str2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) throws NumberFormatException {
        isCreativeDebuggerEnabled.onExtraCallback onextracallback;
        Float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback = IAuthTabCallback(str);
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback2 = IAuthTabCallback(str2);
        isCreativeDebuggerEnabled.onExtraCallback onextracallback2 = null;
        Float f2 = pairIAuthTabCallback != null ? (Float) pairIAuthTabCallback.getFirst() : null;
        if (pairIAuthTabCallback != null) {
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallback2.hashCode();
                throw null;
            }
            onextracallback = (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback.getSecond();
        } else {
            onextracallback = null;
        }
        if (pairIAuthTabCallback2 != null) {
            int i3 = onExtraCallback + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            f = (Float) pairIAuthTabCallback2.getFirst();
        } else {
            f = null;
        }
        if (pairIAuthTabCallback2 != null) {
            int i5 = onWarmupCompleted + 123;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            onextracallback2 = (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback2.getSecond();
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult(appLovinSdkSettings, f2, onextracallback, f, onextracallback2, function1);
        int i7 = onExtraCallback + 63;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return appLovinSdkSettingsOnExtraCallbackWithResult;
    }

    private static final Unit ITrustedWebActivityCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    public static final AppLovinSdkSettings onExtraCallbackWithResult(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new Rotate3D.Y(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit IPostMessageServiceStubProxy(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
            int i3 = 90 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onWarmupCompleted + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallback(AppLovinSdkSettings appLovinSdkSettings, String str, String str2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 73;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 21;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 5;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i7 = onExtraCallback + 49;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda37
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 111;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitIAuthTabCallbackStubProxy = isMuted.IAuthTabCallbackStubProxy((attachAppLovinSdk) obj2);
                    int i12 = onExtraCallbackWithResult + 125;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 != 0) {
                        return unitIAuthTabCallbackStubProxy;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
        return onExtraCallback(appLovinSdkSettings, str, str2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable String str, @Nullable String str2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) throws NumberFormatException {
        Float f;
        isCreativeDebuggerEnabled.onExtraCallback onextracallback;
        Float f2;
        Float f3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback = IAuthTabCallback(str);
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairIAuthTabCallback2 = IAuthTabCallback(str2);
        if (pairIAuthTabCallback != null) {
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Float f4 = (Float) pairIAuthTabCallback.getFirst();
            int i4 = onWarmupCompleted + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            f = f4;
        } else {
            f = null;
        }
        if (pairIAuthTabCallback != null) {
            int i6 = onExtraCallback + 97;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            onextracallback = (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback.getSecond();
        } else {
            int i7 = onExtraCallback + 59;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            onextracallback = null;
        }
        if (pairIAuthTabCallback2 != null) {
            int i9 = onExtraCallback + 1;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                f3 = (Float) pairIAuthTabCallback2.getFirst();
                int i10 = 9 / 0;
            } else {
                f3 = (Float) pairIAuthTabCallback2.getFirst();
            }
            f2 = f3;
        } else {
            int i11 = onWarmupCompleted + 29;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            f2 = null;
        }
        return onNavigationEvent(appLovinSdkSettings, f, onextracallback, f2, pairIAuthTabCallback2 != null ? (isCreativeDebuggerEnabled.onExtraCallback) pairIAuthTabCallback2.getSecond() : null, function1);
    }

    private static final Unit IPostMessageServiceStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 49;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        return unit2;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 53;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 53;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallback + 13;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitICustomTabsCallbackStub = isMuted.ICustomTabsCallbackStub((attachAppLovinSdk) obj2);
                    int i14 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 92 / 0;
                    }
                    return unitICustomTabsCallbackStub;
                }
            };
        }
        return onWarmupCompleted(appLovinSdkSettings, f, f2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    public static final AppLovinSdkSettings onWarmupCompleted(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new Rotate3D.Z(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit IEngagementSignalsCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 5;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IPostMessageService(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final AppLovinSdkSettings onExtraCallbackWithResult(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new Rotate3D.X(f, onextracallback, f2, onextracallback2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinSdkSettingsOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final AppLovinSdkSettings onNavigationEvent(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new Rotate3D.Y(f, onextracallback, f2, onextracallback2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit IEngagementSignalsCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
            int i3 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ITrustedWebActivityServiceStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings asInterface(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 121;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnTransact = isMuted.onTransact((attachAppLovinSdk) obj3);
                    if (i7 != 0) {
                        int i8 = 44 / 0;
                    }
                    return unitOnTransact;
                }
            };
        }
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStub = IAuthTabCallbackStub(appLovinSdkSettings, f, f2, function1);
        int i5 = onWarmupCompleted + 27;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return appLovinSdkSettingsIAuthTabCallbackStub;
        }
        obj2.hashCode();
        throw null;
    }

    public static final AppLovinSdkSettings IAuthTabCallbackStub(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new setImageUrl.onWarmupCompleted(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit RemoteActionCompatParcelizer(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings access000(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda50
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 39;
                    onNavigationEvent = i6 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i6 % 2 != 0) {
                        isMuted.onRelationshipValidationResult(attachapplovinsdk);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnRelationshipValidationResult = isMuted.onRelationshipValidationResult(attachapplovinsdk);
                    int i7 = onWarmupCompleted + 25;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return unitOnRelationshipValidationResult;
                }
            };
        }
        AppLovinSdkSettings appLovinSdkSettingsAccess000 = access000(appLovinSdkSettings, f, f2, function1);
        int i5 = onWarmupCompleted + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return appLovinSdkSettingsAccess000;
    }

    public static final AppLovinSdkSettings access000(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new setImageUrl.onExtraCallbackWithResult(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit access200(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        return unit2;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings, Integer num, Integer num2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i6 = i3 + 83;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i8 = onWarmupCompleted + 27;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            num2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda28
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 61;
                    onNavigationEvent = i10 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj3;
                    if (i10 % 2 == 0) {
                        isMuted.onWarmupCompleted(attachapplovinsdk);
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = isMuted.onWarmupCompleted(attachapplovinsdk);
                    int i11 = onNavigationEvent + 19;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnWarmupCompleted;
                }
            };
        }
        return onNavigationEvent(appLovinSdkSettings, num, num2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    public static final AppLovinSdkSettings onNavigationEvent(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Integer num, @Nullable Integer num2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new reinitialize(num, num2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return appLovinSdkSettingsOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit RatingCompatApi19Impl(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        Float f = (Float) objArr[1];
        Float f2 = (Float) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            int i5 = i3 + 69;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 90 / 0;
            }
            f = null;
        }
        if ((iIntValue & 2) != 0) {
            int i7 = i3 + 39;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            f2 = null;
        }
        if ((iIntValue & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda15
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 35;
                    onExtraCallbackWithResult = i10 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj2;
                    if (i10 % 2 != 0) {
                        return isMuted.asBinder(attachapplovinsdk);
                    }
                    isMuted.asBinder(attachapplovinsdk);
                    throw null;
                }
            };
        }
        return writeTypedObject(appLovinSdkSettings, f, f2, function1);
    }

    public static final AppLovinSdkSettings writeTypedObject(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new deprecated_connectionSpecs(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinSdkSettingsOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit RatingCompat1(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        Integer num = (Integer) objArr[1];
        Integer num2 = (Integer) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0 ? (iIntValue & 1) != 0 : (iIntValue & 1) != 0) {
            num = null;
        }
        if ((iIntValue & 2) != 0) {
            num2 = null;
        }
        if ((iIntValue & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda46
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj3) {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 7;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitPrefetch = isMuted.prefetch((attachAppLovinSdk) obj3);
                    int i6 = IAuthTabCallback + 51;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        return unitPrefetch;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            };
            int i3 = onWarmupCompleted + 119;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1456237980, new Object[]{appLovinSdkSettings, num, num2, function1}, 1456237992, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        int i5 = onExtraCallback + 67;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return appLovinSdkSettings2;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Float fValueOf;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        Integer num = (Integer) objArr[1];
        Integer num2 = (Integer) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Float fValueOf2 = null;
        if (num != null) {
            int i4 = onWarmupCompleted + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                fValueOf = Float.valueOf(num.intValue());
                int i5 = 65 / 0;
            } else {
                fValueOf = Float.valueOf(num.intValue());
            }
        } else {
            fValueOf = null;
        }
        if (num2 != null) {
            int i6 = onWarmupCompleted + 75;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            fValueOf2 = Float.valueOf(num2.intValue());
        }
        return writeTypedObject(appLovinSdkSettings, fValueOf, fValueOf2, function1);
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 33;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda13
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj3) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 21;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                    Unit unit = (Unit) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1348245587, new Object[]{(attachAppLovinSdk) obj3}, -1348245562, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                    int i7 = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            };
        }
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback(appLovinSdkSettings, f, f2, (Function1<? super attachAppLovinSdk, Unit>) function1);
        int i4 = onExtraCallback + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return appLovinSdkSettingsIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onVerticalScrollEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final AppLovinSdkSettings IAuthTabCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new AppLovinSdkInitializationConfigurationBuilder(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit IEngagementSignalsCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        Integer num = (Integer) objArr[1];
        Integer num2 = (Integer) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            int i5 = i3 + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            num = null;
        }
        if ((iIntValue & 2) != 0) {
            int i7 = onWarmupCompleted + 3;
            int i8 = i7 % 128;
            onExtraCallback = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 21;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            num2 = null;
        }
        if ((iIntValue & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda19
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallbackWithResult + 121;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitNewAuthTabSession = isMuted.newAuthTabSession((attachAppLovinSdk) obj2);
                    int i15 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i15 % 128;
                    if (i15 % 2 != 0) {
                        return unitNewAuthTabSession;
                    }
                    throw null;
                }
            };
        }
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -677733323, new Object[]{appLovinSdkSettings, num, num2, function1}, 677733347, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        Float fValueOf;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        Integer num = (Integer) objArr[1];
        Integer num2 = (Integer) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (num != null) {
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Float.valueOf(num.intValue());
                throw null;
            }
            fValueOf = Float.valueOf(num.intValue());
        } else {
            int i3 = onExtraCallback + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            fValueOf = null;
        }
        return IAuthTabCallback(appLovinSdkSettings, fValueOf, num2 != null ? Float.valueOf(num2.intValue()) : null, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    private static final Unit ITrustedWebActivityServiceStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ AppLovinSdkSettings onTransact(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i6 = i4 + 53;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            f = null;
        }
        if ((i & 2) != 0) {
            int i7 = i4 + 49;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            f2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda8
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 97;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitExtraCommand = isMuted.extraCommand((attachAppLovinSdk) obj3);
                    if (i11 != 0) {
                        int i12 = 10 / 0;
                    }
                    return unitExtraCommand;
                }
            };
        }
        return asBinder(appLovinSdkSettings, f, f2, function1);
    }

    public static final AppLovinSdkSettings asBinder(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new AppLovinTermsAndPrivacyPolicyFlowSettings(f, f2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return appLovinSdkSettingsOnNavigationEvent;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings, Integer num, Integer num2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 29;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            num2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 85;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitUpdateVisuals = isMuted.updateVisuals((attachAppLovinSdk) obj2);
                    if (i10 != 0) {
                        int i11 = 50 / 0;
                    }
                    return unitUpdateVisuals;
                }
            };
            int i8 = onExtraCallback + 89;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        return onExtraCallbackWithResult(appLovinSdkSettings, num, num2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    private static final Unit read(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
            int i3 = 79 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onWarmupCompleted + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final AppLovinSdkSettings onExtraCallbackWithResult(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Integer num, @Nullable Integer num2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new AppLovinSdkUtilsSize(num, num2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return appLovinSdkSettingsOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit IEngagementSignalsCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        Function1 function1 = (Function1) objArr[3];
        Function1 function12 = (Function1) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        if ((iIntValue & 8) != 0) {
            function12 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda12
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 115;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitAccess000 = isMuted.access000((attachAppLovinSdk) obj2);
                    int i5 = onNavigationEvent + 19;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return unitAccess000;
                }
            };
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = onNavigationEvent(appLovinSdkSettings, fFloatValue, fFloatValue2, function1, function12);
        int i4 = onWarmupCompleted + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return appLovinSdkSettingsOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final AppLovinSdkSettings onNavigationEvent(@NotNull AppLovinSdkSettings appLovinSdkSettings, float f, float f2, @NotNull Function1<? super Float, Unit> function1, @NotNull Function1<? super attachAppLovinSdk, Unit> function12) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new onReceivedEvent(f, f2, function1));
        function12.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings, getVersionCode getversioncode, getVersionCode getversioncode2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda40
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 35;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnActivityResized = isMuted.onActivityResized((attachAppLovinSdk) obj2);
                    int i8 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitOnActivityResized;
                    }
                    throw null;
                }
            };
            int i5 = onWarmupCompleted + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return onWarmupCompleted(appLovinSdkSettings, getversioncode, getversioncode2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    private static final Unit IPostMessageServiceDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final AppLovinSdkSettings onWarmupCompleted(@NotNull AppLovinSdkSettings appLovinSdkSettings, @NotNull getVersionCode getversioncode, @NotNull getVersionCode getversioncode2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(getversioncode, "");
        Intrinsics.checkNotNullParameter(getversioncode2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new setUserIdentifier(getversioncode, getversioncode2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Integer num;
        Float f;
        Float f2;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        Float f3 = (Float) objArr[1];
        Float f4 = (Float) objArr[2];
        Float f5 = (Float) objArr[3];
        Float f6 = (Float) objArr[4];
        Float f7 = (Float) objArr[5];
        Float f8 = (Float) objArr[6];
        Float f9 = (Float) objArr[7];
        Float f10 = (Float) objArr[8];
        Float f11 = (Float) objArr[9];
        Float f12 = (Float) objArr[10];
        Float f13 = (Float) objArr[11];
        Integer num2 = (Integer) objArr[12];
        Float f14 = (Float) objArr[13];
        Float f15 = (Float) objArr[14];
        Float f16 = (Float) objArr[15];
        Integer num3 = (Integer) objArr[16];
        getVersionCode getversioncode = (getVersionCode) objArr[17];
        Function1 function1 = (Function1) objArr[18];
        int iIntValue = ((Number) objArr[19]).intValue();
        Object obj = objArr[20];
        int i = 2 % 2;
        Object obj2 = null;
        if ((iIntValue & 1) != 0) {
            f3 = null;
        }
        if ((iIntValue & 2) != 0) {
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            f4 = null;
        }
        if ((iIntValue & 4) != 0) {
            f5 = null;
        }
        if ((iIntValue & 8) != 0) {
            int i3 = onWarmupCompleted + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            f6 = null;
        }
        if ((iIntValue & 16) != 0) {
            f7 = null;
        }
        if ((iIntValue & 32) != 0) {
            int i5 = onWarmupCompleted + 43;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            f8 = null;
        }
        if ((iIntValue & 64) != 0) {
            int i7 = onExtraCallback + 49;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            f9 = null;
        }
        if ((iIntValue & 128) != 0) {
            int i9 = onWarmupCompleted + 99;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 18 / 0;
            }
            f10 = null;
        }
        if ((iIntValue & 256) != 0) {
            int i11 = onWarmupCompleted + 35;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            f11 = null;
        }
        if ((iIntValue & 512) != 0) {
            int i13 = onWarmupCompleted + 31;
            onExtraCallback = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 42 / 0;
            }
            f12 = null;
        }
        if ((iIntValue & 1024) != 0) {
            int i15 = onExtraCallback + 39;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            f13 = null;
        }
        if ((iIntValue & 2048) != 0) {
            num2 = null;
        }
        if ((iIntValue & 4096) != 0) {
            int i16 = onExtraCallback + 45;
            num = num2;
            onWarmupCompleted = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
            f = null;
        } else {
            num = num2;
            f = f14;
        }
        Float f17 = (iIntValue & 8192) != 0 ? null : f15;
        if ((iIntValue & 16384) != 0) {
            int i17 = onWarmupCompleted + 97;
            f2 = f;
            onExtraCallback = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 2 / 4;
            }
            f16 = null;
        } else {
            f2 = f;
        }
        if ((32768 & iIntValue) != 0) {
            num3 = null;
        }
        if ((65536 & iIntValue) != 0) {
            getversioncode = null;
        }
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1763762693, new Object[]{appLovinSdkSettings, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, num, f2, f17, f16, num3, getversioncode, (131072 & iIntValue) != 0 ? new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda49
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj3) {
                int i19 = 2 % 2;
                int i20 = onExtraCallback + 117;
                onWarmupCompleted = i20 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj3;
                if (i20 % 2 != 0) {
                    return isMuted.postMessage(attachapplovinsdk);
                }
                isMuted.postMessage(attachapplovinsdk);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        } : function1}, -1763762678, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final Unit getSmallIconId(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int i3 = 38 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function1 function1;
        getVersionCode getversioncode;
        Float f;
        Float fValueOf;
        int i;
        Float f2;
        Float fValueOf2;
        int i2;
        Float f3;
        Float fValueOf3;
        int i3;
        Object obj;
        AppLovinSdkSettings appLovinSdkSettings;
        Function1 function12;
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) objArr[0];
        Float f4 = (Float) objArr[1];
        Float f5 = (Float) objArr[2];
        Float f6 = (Float) objArr[3];
        Float f7 = (Float) objArr[4];
        Float f8 = (Float) objArr[5];
        Float f9 = (Float) objArr[6];
        Float f10 = (Float) objArr[7];
        Float f11 = (Float) objArr[8];
        Float f12 = (Float) objArr[9];
        Float f13 = (Float) objArr[10];
        Float f14 = (Float) objArr[11];
        Integer num = (Integer) objArr[12];
        Float f15 = (Float) objArr[13];
        Float f16 = (Float) objArr[14];
        Float f17 = (Float) objArr[15];
        Integer num2 = (Integer) objArr[16];
        getVersionCode getversioncode2 = (getVersionCode) objArr[17];
        Function1 function13 = (Function1) objArr[18];
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings2, "");
        Intrinsics.checkNotNullParameter(function13, "");
        if (f4 != null) {
            int i5 = onWarmupCompleted + 115;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                f3 = null;
                fValueOf3 = Float.valueOf(f4.floatValue());
                appLovinSdkSettings = appLovinSdkSettings2;
                function12 = function13;
                function1 = function13;
                i3 = 1;
                getversioncode = getversioncode2;
                obj = null;
            } else {
                function1 = function13;
                getversioncode = getversioncode2;
                f3 = null;
                fValueOf3 = Float.valueOf(f4.floatValue());
                i3 = 1;
                obj = null;
                appLovinSdkSettings = appLovinSdkSettings2;
                function12 = function1;
            }
            onNavigationEvent(appLovinSdkSettings, f3, fValueOf3, function12, i3, obj);
        } else {
            function1 = function13;
            getversioncode = getversioncode2;
        }
        if (f5 != null) {
            int i6 = onWarmupCompleted + 65;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            asBinder(appLovinSdkSettings2, null, Float.valueOf(f5.floatValue()), function1, 1, null);
        }
        if (f6 != null) {
            IAuthTabCallbackStub(appLovinSdkSettings2, null, Float.valueOf(f6.floatValue()), function1, 1, null);
        }
        if (f7 != null) {
            IAuthTabCallbackDefault(appLovinSdkSettings2, null, Float.valueOf(f7.floatValue()), function1, 1, null);
        }
        if (f8 != null) {
            IAuthTabCallback_Parcel(appLovinSdkSettings2, null, Float.valueOf(f8.floatValue()), function1, 1, null);
        }
        if (f9 != null) {
            getInterfaceDescriptor(appLovinSdkSettings2, null, Float.valueOf(f9.floatValue()), function1, 1, null);
        }
        if (f10 != null) {
            IAuthTabCallback(appLovinSdkSettings2, (Float) null, Float.valueOf(f10.floatValue()), function1, 1, (Object) null);
        }
        if (f11 != null) {
        }
        if (f12 != null) {
            int i8 = onExtraCallback + 21;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                f2 = null;
                fValueOf2 = Float.valueOf(f12.floatValue());
                i2 = 0;
            } else {
                f2 = null;
                fValueOf2 = Float.valueOf(f12.floatValue());
                i2 = 1;
            }
            onWarmupCompleted(appLovinSdkSettings2, f2, fValueOf2, function1, i2, (Object) null);
        }
        if (f13 != null) {
            asInterface(appLovinSdkSettings2, (Float) null, Float.valueOf(f13.floatValue()), function1, 1, (Object) null);
        }
        if (f14 != null) {
            access000(appLovinSdkSettings2, null, Float.valueOf(f14.floatValue()), function1, 1, null);
        }
        if (num != null) {
            onWarmupCompleted(appLovinSdkSettings2, (Integer) null, Integer.valueOf(num.intValue()), function1, 1, (Object) null);
        }
        if (f15 != null) {
        }
        if (f16 != null) {
            onExtraCallbackWithResult(appLovinSdkSettings2, (Float) null, Float.valueOf(f16.floatValue()), function1, 1, (Object) null);
        }
        if (f17 != null) {
            int i9 = onWarmupCompleted + 121;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                f = null;
                fValueOf = Float.valueOf(f17.floatValue());
                i = 0;
            } else {
                f = null;
                fValueOf = Float.valueOf(f17.floatValue());
                i = 1;
            }
            onTransact(appLovinSdkSettings2, f, fValueOf, function1, i, null);
        }
        if (num2 != null) {
            IAuthTabCallback(appLovinSdkSettings2, (Integer) null, Integer.valueOf(num2.intValue()), function1, 1, (Object) null);
        }
        if (getversioncode != null) {
            int i10 = onExtraCallback + 27;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                onWarmupCompleted(appLovinSdkSettings2, getversioncode, getversioncode, (Function1<? super attachAppLovinSdk, Unit>) function1);
                int i11 = 32 / 0;
            } else {
                onWarmupCompleted(appLovinSdkSettings2, getversioncode, getversioncode, (Function1<? super attachAppLovinSdk, Unit>) function1);
            }
        }
        int i12 = onExtraCallback + 99;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return appLovinSdkSettings2;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, deprecated_directory deprecated_directoryVar, deprecated_directory deprecated_directoryVar2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            deprecated_directoryVar = null;
        }
        if ((i & 2) != 0) {
            deprecated_directoryVar2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda22
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 15;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitIAuthTabCallback_Parcel = isMuted.IAuthTabCallback_Parcel((attachAppLovinSdk) obj2);
                    int i10 = onWarmupCompleted + 75;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return unitIAuthTabCallback_Parcel;
                }
            };
        }
        return onExtraCallbackWithResult(appLovinSdkSettings, deprecated_directoryVar, deprecated_directoryVar2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    private static final Unit writeTypedList(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final AppLovinSdkSettings onExtraCallbackWithResult(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable deprecated_directory deprecated_directoryVar, @Nullable deprecated_directory deprecated_directoryVar2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        Float fValueOf;
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Float fValueOf2 = null;
        if (deprecated_directoryVar != null) {
            int radius = deprecated_directoryVar.getRadius();
            Intrinsics.checkNotNullExpressionValue(contentType.onExtraCallback.IAuthTabCallback_Parcel().getDisplayMetrics(), "");
            fValueOf = Float.valueOf(varyMatches.onNavigationEvent(Integer.valueOf(radius), r3));
        } else {
            fValueOf = null;
        }
        if (deprecated_directoryVar2 != null) {
            int radius2 = deprecated_directoryVar2.getRadius();
            Intrinsics.checkNotNullExpressionValue(contentType.onExtraCallback.IAuthTabCallback_Parcel().getDisplayMetrics(), "");
            fValueOf2 = Float.valueOf(varyMatches.onNavigationEvent(Integer.valueOf(radius2), r2));
        }
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new showMediationDebugger(fValueOf, fValueOf2));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i4 = onExtraCallback + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit IEngagementSignalsCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings, deprecated_directory deprecated_directoryVar, deprecated_directory deprecated_directoryVar2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = onWarmupCompleted + 59;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            deprecated_directoryVar = null;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            deprecated_directoryVar2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda29
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 61;
                    IAuthTabCallback = i6 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj3;
                    if (i6 % 2 != 0) {
                        return isMuted.ICustomTabsCallback_Parcel(attachapplovinsdk);
                    }
                    isMuted.ICustomTabsCallback_Parcel(attachapplovinsdk);
                    throw null;
                }
            };
        }
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -2050354086, new Object[]{appLovinSdkSettings, deprecated_directoryVar, deprecated_directoryVar2, function1}, 2050354118, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final Unit ICustomTabsServiceStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        Float fValueOf;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        deprecated_directory deprecated_directoryVar = (deprecated_directory) objArr[1];
        deprecated_directory deprecated_directoryVar2 = (deprecated_directory) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Float fValueOf2 = null;
        if (deprecated_directoryVar != null) {
            fValueOf = Float.valueOf(deprecated_directoryVar.getRadius());
        } else {
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            fValueOf = null;
        }
        if (deprecated_directoryVar2 != null) {
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
                fValueOf2 = Float.valueOf(deprecated_directoryVar2.getRadius());
            } else {
                fValueOf2 = Float.valueOf(deprecated_directoryVar2.getRadius());
            }
            int i6 = onWarmupCompleted + 57;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new onSdkInitialized(fValueOf, fValueOf2));
        function1.invoke(attachapplovinsdk);
        return appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings, float f, float f2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionsKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 27;
                    onNavigationEvent = i6 % 128;
                    Object[] objArr = {(attachAppLovinSdk) obj2};
                    if (i6 % 2 == 0) {
                        return (Unit) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 563454786, objArr, -563454766, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                    }
                    throw null;
                }
            };
            int i5 = onWarmupCompleted + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return onExtraCallback(appLovinSdkSettings, f, f2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    private static final Unit ICustomTabsService_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Deprecated
    public static final AppLovinSdkSettings onExtraCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, float f, float f2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new showMediationDebugger(Float.valueOf(f), Float.valueOf(f2)));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    private static final Unit onGreatestScrollPercentageIncreased(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
            int i3 = 14 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> IAuthTabCallback(@Nullable String str) throws NumberFormatException {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            int i5 = i4 + 27;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 78 / 0;
            }
            return null;
        }
        int i7 = i2 + 25;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        Pair<Float, isCreativeDebuggerEnabled.onExtraCallback> pairOnExtraCallback = isCreativeDebuggerEnabled.onExtraCallback.Companion.onExtraCallback(str);
        int i9 = onExtraCallback + 25;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return pairOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -224235613, new Object[]{appLovinSdkSettings}, 224235641, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1348245587, new Object[]{attachapplovinsdk}, -1348245562, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 2092086482, new Object[]{attachapplovinsdk}, -2092086482, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit access100(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 395371640, new Object[]{attachapplovinsdk}, -395371633, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit extraCallback(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -264823418, new Object[]{attachapplovinsdk}, 264823445, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onMinimized(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 563454786, new Object[]{attachapplovinsdk}, -563454766, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onActivityLayout(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -949084023, new Object[]{attachapplovinsdk}, 949084025, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onUnminimized(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -33728134, new Object[]{attachapplovinsdk}, 33728147, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit isEngagementSignalsApiAvailable(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2102683685, new Object[]{attachapplovinsdk}, 2102683694, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit newSession(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1114191303, new Object[]{attachapplovinsdk}, 1114191307, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit newSessionWithExtras(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1302414881, new Object[]{attachapplovinsdk}, 1302414902, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings, float f, float f2, Function1 function1, Function1 function12, int i, Object obj) {
        Object[] objArr = {appLovinSdkSettings, Float.valueOf(f), Float.valueOf(f2), function1, function12, Integer.valueOf(i), obj};
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    public static final AppLovinSdkSettings IAuthTabCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable deprecated_directory deprecated_directoryVar, @Nullable deprecated_directory deprecated_directoryVar2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2050354086, new Object[]{appLovinSdkSettings, deprecated_directoryVar, deprecated_directoryVar2, function1}, 2050354118, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static final AppLovinSdkSettings IAuthTabCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Integer num, @Nullable Integer num2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -677733323, new Object[]{appLovinSdkSettings, num, num2, function1}, 677733347, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, Integer num, Integer num2, Function1 function1, int i, Object obj) {
        Object[] objArr = {appLovinSdkSettings, num, num2, function1, Integer.valueOf(i), obj};
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1685808947, objArr, 1685808950, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1317041487, new Object[]{appLovinSdkSettings}, 1317041492, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit IPostMessageService_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1862531253, new Object[]{attachapplovinsdk}, -1862531230, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallback(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        Object[] objArr = {appLovinSdkSettings, f, f2, function1, Integer.valueOf(i), obj};
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, objArr, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings, String str, String str2, Function1 function1, int i, Object obj) {
        Object[] objArr = {appLovinSdkSettings, str, str2, function1, Integer.valueOf(i), obj};
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 2081571069, objArr, -2081571051, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final Unit ITrustedWebActivityService(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 877465359, new Object[]{attachapplovinsdk}, -877465340, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit ITrustedWebActivityCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1153702979, new Object[]{attachapplovinsdk}, -1153702973, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, @Nullable Float f6, @Nullable Float f7, @Nullable Float f8, @Nullable Float f9, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num, @Nullable Float f12, @Nullable Float f13, @Nullable Float f14, @Nullable Integer num2, @Nullable getVersionCode getversioncode, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1763762693, new Object[]{appLovinSdkSettings, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, num, f12, f13, f14, num2, getversioncode, function1}, -1763762678, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Integer num, Float f12, Float f13, Float f14, Integer num2, getVersionCode getversioncode, Function1 function1, int i, Object obj) {
        Object[] objArr = {appLovinSdkSettings, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, num, f12, f13, f14, num2, getversioncode, function1, Integer.valueOf(i), obj};
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -952311307, objArr, 952311317, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final Unit ITrustedWebActivityService_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -81687537, new Object[]{attachapplovinsdk}, 81687566, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ AppLovinSdkSettings access100(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        Object[] objArr = {appLovinSdkSettings, f, f2, function1, Integer.valueOf(i), obj};
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final Unit AudioAttributesCompatParcelizer(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -41505695, new Object[]{attachapplovinsdk}, 41505709, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static final AppLovinSdkSettings IAuthTabCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 34329437, new Object[]{appLovinSdkSettings, f, onextracallback, f2, onextracallback2, function1}, -34329403, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit RatingCompat(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -825911390, new Object[]{attachapplovinsdk}, 825911407, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit MediaDescriptionCompat(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2105518540, new Object[]{attachapplovinsdk}, 2105518548, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Integer num, @Nullable Integer num2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 565625982, new Object[]{appLovinSdkSettings, num, num2, function1}, -565625971, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit MediaSessionCompatQueueItem(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1448166807, new Object[]{attachapplovinsdk}, 1448166808, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit RatingCompatStarStyle(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1112238509, new Object[]{attachapplovinsdk}, -1112238478, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static final AppLovinSdkSettings onTransact(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable Integer num, @Nullable Integer num2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1456237980, new Object[]{appLovinSdkSettings, num, num2, function1}, 1456237992, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ AppLovinSdkSettings writeTypedObject(AppLovinSdkSettings appLovinSdkSettings, Float f, Float f2, Function1 function1, int i, Object obj) {
        Object[] objArr = {appLovinSdkSettings, f, f2, function1, Integer.valueOf(i), obj};
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1901736661, objArr, -1901736628, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    public static /* synthetic */ AppLovinSdkSettings asInterface(AppLovinSdkSettings appLovinSdkSettings, Integer num, Integer num2, Function1 function1, int i, Object obj) {
        Object[] objArr = {appLovinSdkSettings, num, num2, function1, Integer.valueOf(i), obj};
        return (AppLovinSdkSettings) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1115090779, objArr, -1115090763, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }
}
