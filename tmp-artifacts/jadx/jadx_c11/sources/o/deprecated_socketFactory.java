package o;

import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.foundation.anim.rally.effect.RepeatType;
import im.toss.tds.view.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Rmenu;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_socketFactory {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final deprecated_socketFactory onWarmupCompleted = new deprecated_socketFactory();

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[deprecated_proxySelector.values().length];
            try {
                iArr[deprecated_proxySelector.SMALL.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[deprecated_proxySelector.BIG.ordinal()] = 2;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[RepeatType.values().length];
            try {
                iArr2[RepeatType.NORMAL.ordinal()] = 1;
                int i3 = onExtraCallback + 11;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RepeatType.INFINITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr2;
            int[] iArr3 = new int[EnumC0079certificatePinner.values().length];
            try {
                iArr3[EnumC0079certificatePinner.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[EnumC0079certificatePinner.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr3;
            int i6 = onExtraCallback + 85;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 88 / 0;
            }
        }
    }

    static {
        int i = onNavigationEvent + 99;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(attachapplovinsdk);
        }
        onTransact(attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IEngagementSignalsCallback_Parcel(interpolator, attachapplovinsdk);
        }
        IEngagementSignalsCallback_Parcel(interpolator, attachapplovinsdk);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return validateRelationship(interpolator, attachapplovinsdk);
        }
        validateRelationship(interpolator, attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit activeNotifications = getActiveNotifications(interpolator, attachapplovinsdk);
        int i4 = IAuthTabCallback + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return activeNotifications;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsServiceStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 131582533, -131582530, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        int i4 = IAuthTabCallback + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnSessionEnded = onSessionEnded(interpolator, attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return unitOnSessionEnded;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAreNotificationsEnabled = areNotificationsEnabled(interpolator, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = onExtraCallback + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitAreNotificationsEnabled;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit smallIconId = getSmallIconId(interpolator, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return smallIconId;
    }

    public static /* synthetic */ Unit ICustomTabsCallback_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1107472577, 1107472589, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        int i4 = onExtraCallback + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit ICustomTabsService(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitReceiveFile = receiveFile(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitReceiveFile;
    }

    public static /* synthetic */ Unit access000(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1381554298, 1381554299, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        }
        Unit unit = (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1381554298, 1381554299, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        int i3 = 67 / 0;
        return unit;
    }

    public static /* synthetic */ Unit access100(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1303517276, 1303517276, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {interpolator, attachapplovinsdk};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallback, objArr2, iOnExtraCallback2, iOnExtraCallback3, 2061720507, -2061720492, iOnExtraCallback4);
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageService_Parcel = IPostMessageService_Parcel(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIPostMessageService_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1532661424, -1532661419, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit asInterface(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNotifyNotificationWithChannel = notifyNotificationWithChannel(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitNotifyNotificationWithChannel;
        }
        throw null;
    }

    public static /* synthetic */ Unit extraCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsServiceStub(interpolator, attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub(interpolator, attachapplovinsdk);
        int i3 = onExtraCallback + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitICustomTabsServiceStub;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(interpolator, attachapplovinsdk);
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitRequestPostMessageChannelWithExtras;
    }

    public static /* synthetic */ Unit extraCommand(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IEngagementSignalsCallback(interpolator, attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback(interpolator, attachapplovinsdk);
        int i3 = onExtraCallback + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIEngagementSignalsCallback;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceDefault = ICustomTabsServiceDefault(interpolator, attachapplovinsdk);
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitICustomTabsServiceDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit isEngagementSignalsApiAvailable(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 918236893, -918236882, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        }
        throw null;
    }

    public static /* synthetic */ Unit newAuthTabSession(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageServiceStubProxy = IPostMessageServiceStubProxy(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIPostMessageServiceStubProxy;
    }

    public static /* synthetic */ Unit newSession(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallbackStub = ITrustedWebActivityCallbackStub(interpolator, attachapplovinsdk);
        int i4 = IAuthTabCallback + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitITrustedWebActivityCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit newSessionWithExtras(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsService_Parcel(interpolator, attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsService_Parcel = ICustomTabsService_Parcel(interpolator, attachapplovinsdk);
        int i3 = IAuthTabCallback + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return unitICustomTabsService_Parcel;
    }

    public static /* synthetic */ Unit onActivityLayout(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return engagementSignalsCallback;
    }

    public static /* synthetic */ Unit onActivityResized(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            requestPostMessageChannel(interpolator, attachapplovinsdk);
            throw null;
        }
        Unit unitRequestPostMessageChannel = requestPostMessageChannel(interpolator, attachapplovinsdk);
        int i3 = IAuthTabCallback + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitRequestPostMessageChannel;
    }

    public static /* synthetic */ Unit onExtraCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault(interpolator, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return unitIEngagementSignalsCallbackDefault;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls(interpolator, attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return unitPrefetchWithMultipleUrls;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {interpolator, attachapplovinsdk};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallback, objArr, iOnExtraCallback2, iOnExtraCallback3, 799454708, -799454691, iOnExtraCallback4);
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -515670443, 515670450, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        }
        int i3 = 8 / 0;
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -515670443, 515670450, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onMinimized(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallbackStubProxy = ITrustedWebActivityCallbackStubProxy(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitITrustedWebActivityCallbackStubProxy;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | i)) | i8;
        int i10 = ~i5;
        int i11 = ~i;
        int i12 = i9 | (~(i10 | i11 | i4));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i4;
        int i15 = (~(i | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i4 + i5 + i2 + ((-327997910) * i3) + ((-604038433) * i6);
        int i18 = i17 * i17;
        int i19 = ((i4 * 234895570) - 128974848) + (234895570 * i5) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i2) + (36700160 * i3) + ((-297271296) * i6) + (1302134784 * i18);
        int i20 = (i4 * (-238133666)) + 182491156 + (i5 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i2 * (-238134313)) + (i3 * (-1022231738)) + (i6 * 4118089) + (i18 * (-35979264));
        switch (i19 + (i20 * i20 * 1404239872)) {
            case 1:
                Interpolator interpolator = (Interpolator) objArr[0];
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
                int i21 = 2 % 2;
                int i22 = IAuthTabCallback + 117;
                onExtraCallback = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(interpolator);
                Unit unit = Unit.INSTANCE;
                int i24 = onExtraCallback + 67;
                IAuthTabCallback = i24 % 128;
                int i25 = i24 % 2;
                return unit;
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onExtraCallbackWithResult(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                Interpolator interpolator2 = (Interpolator) objArr[0];
                attachAppLovinSdk attachapplovinsdk2 = (attachAppLovinSdk) objArr[1];
                int i26 = 2 % 2;
                int i27 = IAuthTabCallback + 111;
                onExtraCallback = i27 % 128;
                int i28 = i27 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk2, "");
                attachapplovinsdk2.IAuthTabCallback(interpolator2);
                Unit unit2 = Unit.INSTANCE;
                int i29 = IAuthTabCallback + 121;
                onExtraCallback = i29 % 128;
                int i30 = i29 % 2;
                return unit2;
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return access100(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return access000(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                Interpolator interpolator3 = (Interpolator) objArr[0];
                attachAppLovinSdk attachapplovinsdk3 = (attachAppLovinSdk) objArr[1];
                int i31 = 2 % 2;
                int i32 = onExtraCallback + 97;
                IAuthTabCallback = i32 % 128;
                int i33 = i32 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk3, "");
                attachapplovinsdk3.IAuthTabCallback(interpolator3);
                Unit unit3 = Unit.INSTANCE;
                int i34 = onExtraCallback + 67;
                IAuthTabCallback = i34 % 128;
                int i35 = i34 % 2;
                return unit3;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit smallIconBitmap = getSmallIconBitmap(interpolator, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return smallIconBitmap;
    }

    public static /* synthetic */ Unit onNavigationEvent(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitUpdateVisuals = updateVisuals(interpolator, attachapplovinsdk);
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitUpdateVisuals;
    }

    public static /* synthetic */ Unit onPostMessage(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageService = IPostMessageService(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return unitIPostMessageService;
    }

    public static /* synthetic */ Unit onRelationshipValidationResult(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1528910341, -1528910325, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        int i3 = IAuthTabCallback + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onTransact(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallback = ITrustedWebActivityCallback(interpolator, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return unitITrustedWebActivityCallback;
    }

    public static /* synthetic */ Unit onUnminimized(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1560568536, 1560568550, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        int i4 = IAuthTabCallback + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackStubProxy = IEngagementSignalsCallbackStubProxy(interpolator, attachapplovinsdk);
        int i4 = IAuthTabCallback + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIEngagementSignalsCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(attachapplovinsdk);
        int i4 = IAuthTabCallback + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit postMessage(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IEngagementSignalsCallbackStub(interpolator, attachapplovinsdk);
        }
        IEngagementSignalsCallbackStub(interpolator, attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit prefetch(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return access200(interpolator, attachapplovinsdk);
        }
        access200(interpolator, attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit readTypedObject(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageServiceDefault = IPostMessageServiceDefault(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIPostMessageServiceDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit writeTypedObject(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return ITrustedWebActivityCallbackDefault(interpolator, attachapplovinsdk);
        }
        ITrustedWebActivityCallbackDefault(interpolator, attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private deprecated_socketFactory() {
    }

    private static final Unit prefetchWithMultipleUrls(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
            int i3 = 51 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit requestPostMessageChannel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit ICustomTabsService_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 1;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return unit2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit ITrustedWebActivityCallbackStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit getActiveNotifications(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit getSmallIconBitmap(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit notifyNotificationWithChannel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit getSmallIconId(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        int i3 = 5 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit setEngagementSignalsCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit receiveFile(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit requestPostMessageChannelWithExtras(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit validateRelationship(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
            int i3 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsServiceStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        int i3 = 3 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsServiceDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit updateVisuals(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit access200(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
            int i3 = 87 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IEngagementSignalsCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit ICustomTabsServiceStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onSessionEnded(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit IEngagementSignalsCallbackStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
            int i3 = 9 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IEngagementSignalsCallbackDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit IEngagementSignalsCallback_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 35;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IPostMessageServiceDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IEngagementSignalsCallbackStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IPostMessageService(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IPostMessageServiceStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IPostMessageService_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit ITrustedWebActivityCallbackStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ITrustedWebActivityCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ITrustedWebActivityCallbackDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit areNotificationsEnabled(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
            int i3 = 44 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final getUserIdentifier onNavigationEvent(@NotNull deprecated_proxySelector deprecated_proxyselector, @NotNull EnumC0079certificatePinner enumC0079certificatePinner) throws NoWhenBranchMatchedException {
        int iOnNavigationEvent;
        List listListOf;
        int iOnNavigationEvent2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_proxyselector, "");
        Intrinsics.checkNotNullParameter(enumC0079certificatePinner, "");
        int i2 = IAuthTabCallback.onExtraCallbackWithResult[enumC0079certificatePinner.ordinal()];
        if (i2 == 1) {
            AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = RallysKt.IAuthTabCallback(new Rmenu.onNavigationEvent(1.0d, 0.2d));
            int i3 = IAuthTabCallback.onWarmupCompleted[deprecated_proxyselector.ordinal()];
            if (i3 == 1) {
                iOnNavigationEvent = onNavigationEvent((Number) 2);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i4 = onExtraCallback + 51;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    iOnNavigationEvent = onNavigationEvent((Number) 4);
                    int i5 = 97 / 0;
                } else {
                    iOnNavigationEvent = onNavigationEvent((Number) 4);
                }
            }
            listListOf = CollectionsKt.listOf(isMuted.onExtraCallbackWithResult(appLovinSdkSettingsIAuthTabCallback, Integer.valueOf(iOnNavigationEvent), (Integer) 0, (Function1) null, 4, (Object) null));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback2 = RallysKt.IAuthTabCallback(new Rmenu.onNavigationEvent(1.0d, 0.2d));
            int i6 = IAuthTabCallback.onWarmupCompleted[deprecated_proxyselector.ordinal()];
            if (i6 == 1) {
                iOnNavigationEvent2 = onNavigationEvent((Number) 2);
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = onExtraCallback + 7;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                iOnNavigationEvent2 = onNavigationEvent((Number) 4);
            }
            listListOf = CollectionsKt.listOf(isMuted.onExtraCallback(appLovinSdkSettingsIAuthTabCallback2, Integer.valueOf(iOnNavigationEvent2), (Integer) 0, (Function1) null, 4, (Object) null));
        }
        getUserIdentifier getuseridentifier = new getUserIdentifier(listListOf);
        int i9 = IAuthTabCallback + 87;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return getuseridentifier;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(100);
        attachapplovinsdk.onExtraCallback(50);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(100);
        attachapplovinsdk.onExtraCallback(50);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(17504);
            i = 123;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(150);
            i = 50;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(26);
            i = 35;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(100);
            i = 50;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final int onNavigationEvent(Number number) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = contentType.onExtraCallback.IAuthTabCallbackStubProxy().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(number, displayMetrics);
        int i4 = onExtraCallback + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 554359247, -554359234, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 994299737, -994299728, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onMessageChannelReady(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1515628175, 1515628177, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit ICustomTabsCallbackDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2110361163, 2110361171, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1022978582, -1022978576, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit mayLaunchUrl(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1151207568, 1151207578, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -549943499, 549943503, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 131582533, -131582530, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -515670443, 515670450, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit warmup(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1303517276, 1303517276, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit writeTypedList(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1560568536, 1560568550, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onGreatestScrollPercentageIncreased(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1107472577, 1107472589, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onVerticalScrollEvent(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1528910341, -1528910325, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit IPostMessageServiceStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 918236893, -918236882, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit ITrustedWebActivityService(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1381554298, 1381554299, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit ITrustedWebActivityCallback_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1532661424, -1532661419, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit cancelNotification(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 2061720507, -2061720492, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit ITrustedWebActivityServiceDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{interpolator, attachapplovinsdk}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 799454708, -799454691, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }
}
