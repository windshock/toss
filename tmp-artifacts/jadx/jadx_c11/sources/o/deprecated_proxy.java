package o;

import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.foundation.anim.rally.effect.RepeatType;
import im.toss.tds.view.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Rmenu;
import o.attachAppLovinSdk;
import o.deprecated_proxy;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_proxy {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    public static final deprecated_proxy onNavigationEvent = new deprecated_proxy();
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[deprecated_proxySelector.values().length];
            try {
                iArr[deprecated_proxySelector.SMALL.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 5;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[deprecated_proxySelector.BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[RepeatType.values().length];
            try {
                iArr2[RepeatType.NORMAL.ordinal()] = 1;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RepeatType.INFINITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            onWarmupCompleted = iArr2;
            int[] iArr3 = new int[EnumC0079certificatePinner.values().length];
            try {
                iArr3[EnumC0079certificatePinner.X.ordinal()] = 1;
                int i5 = onExtraCallbackWithResult + 125;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[EnumC0079certificatePinner.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            IAuthTabCallback = iArr3;
        }
    }

    static {
        int i = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 11 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnGreatestScrollPercentageIncreased;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(attachapplovinsdk);
        int i4 = onWarmupCompleted + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -233170165, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 233170178, iOnExtraCallbackWithResult2);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallbackDefault = ITrustedWebActivityCallbackDefault(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return unitITrustedWebActivityCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 2088306995, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -2088306981, iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageServiceStubProxy = IPostMessageServiceStubProxy(interpolator, attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return unitIPostMessageServiceStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IEngagementSignalsCallbackStub(interpolator, attachapplovinsdk);
            throw null;
        }
        Unit unitIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub(interpolator, attachapplovinsdk);
        int i3 = onExtraCallback + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
        return unitIEngagementSignalsCallbackStub;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsServiceDefault(interpolator, attachapplovinsdk);
        }
        ICustomTabsServiceDefault(interpolator, attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIEngagementSignalsCallback;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIEngagementSignalsCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1734051467, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -1734051455, iOnExtraCallbackWithResult2);
            int i3 = 45 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1734051467, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult3, -1734051455, iOnExtraCallbackWithResult4);
        }
        int i4 = onExtraCallback + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsService(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityServiceDefault = ITrustedWebActivityServiceDefault(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return unitITrustedWebActivityServiceDefault;
    }

    public static /* synthetic */ Unit access000(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallback = ITrustedWebActivityCallback(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitITrustedWebActivityCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit access100(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedList(interpolator, attachapplovinsdk);
        }
        writeTypedList(interpolator, attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWarmup = warmup(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitWarmup;
    }

    public static /* synthetic */ Unit asBinder(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1954013624, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -1954013608, iOnExtraCallbackWithResult2);
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            receiveFile(interpolator, attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitReceiveFile = receiveFile(interpolator, attachapplovinsdk);
        int i3 = onWarmupCompleted + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitReceiveFile;
    }

    public static /* synthetic */ Unit asInterface(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1134827934, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 1134827938, iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit extraCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit smallIconId = getSmallIconId(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return smallIconId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsService_Parcel(interpolator, attachapplovinsdk);
        }
        ICustomTabsService_Parcel(interpolator, attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit extraCommand(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitValidateRelationship = validateRelationship(interpolator, attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return unitValidateRelationship;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(attachapplovinsdk);
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2092737721, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult3, 2092737727, iOnExtraCallbackWithResult4);
        int i3 = onExtraCallback + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit isEngagementSignalsApiAvailable(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAreNotificationsEnabled = areNotificationsEnabled(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAreNotificationsEnabled;
    }

    public static /* synthetic */ Unit mayLaunchUrl(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageServiceStub = IPostMessageServiceStub(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIPostMessageServiceStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit newAuthTabSession(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageService_Parcel = IPostMessageService_Parcel(interpolator, attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = onExtraCallback + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIPostMessageService_Parcel;
    }

    public static /* synthetic */ Unit newSession(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnSessionEnded = onSessionEnded(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnSessionEnded;
    }

    public static /* synthetic */ Unit newSessionWithExtras(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallbackStubProxy = ITrustedWebActivityCallbackStubProxy(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitITrustedWebActivityCallbackStubProxy;
    }

    public static /* synthetic */ Unit onActivityLayout(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCancelNotification = cancelNotification(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitCancelNotification;
    }

    public static /* synthetic */ Unit onActivityResized(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IPostMessageServiceDefault(interpolator, attachapplovinsdk);
            throw null;
        }
        Unit unitIPostMessageServiceDefault = IPostMessageServiceDefault(interpolator, attachapplovinsdk);
        int i3 = onExtraCallback + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIPostMessageServiceDefault;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIEngagementSignalsCallback_Parcel;
    }

    public static /* synthetic */ Unit onExtraCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return unitPrefetchWithMultipleUrls;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = ~(i9 | i5);
        int i11 = ~((~i4) | i3);
        int i12 = i10 | i11;
        int i13 = i11 | (~(i7 | i9));
        int i14 = i3 + i5 + i6 + ((-1232316077) * i) + ((-263306238) * i2);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i3) - 1785593856) + (933837065 * i5) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i6) + (1319895040 * i) + (1514668032 * i2) + (1334968320 * i15);
        int i17 = ((i3 * (-2046307327)) - 1888090795) + (i5 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i6 * (-2046307883)) + (i * 1526207759) + (i2 * (-1095616598)) + (i15 * 1719271424);
        switch (i16 + (i17 * i17 * 2111700992)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallback_Parcel(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return IAuthTabCallbackStubProxy(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return extraCallbackWithResult(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return writeTypedObject(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityService = ITrustedWebActivityService(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitITrustedWebActivityService;
    }

    public static /* synthetic */ Unit onMessageChannelReady(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit smallIconBitmap = getSmallIconBitmap(interpolator, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = onWarmupCompleted + 81;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return smallIconBitmap;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(attachapplovinsdk);
        int i4 = onWarmupCompleted + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onPostMessage(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -783448558, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 783448576, iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -783448558, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult3, 783448576, iOnExtraCallbackWithResult4);
        int i3 = 86 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onRelationshipValidationResult(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 811866339, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -811866336, iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -110165634, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult3, 110165651, iOnExtraCallbackWithResult4);
        int i3 = onExtraCallback + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onUnminimized(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1418127068, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -1418127059, iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unitRequestPostMessageChannelWithExtras;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(attachapplovinsdk);
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit postMessage(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallbackStub = ITrustedWebActivityCallbackStub(interpolator, attachapplovinsdk);
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitITrustedWebActivityCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit prefetch(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNotifyNotificationWithChannel = notifyNotificationWithChannel(interpolator, attachapplovinsdk);
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitNotifyNotificationWithChannel;
    }

    public static /* synthetic */ Unit readTypedObject(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsServiceStub(interpolator, attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub(interpolator, attachapplovinsdk);
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitICustomTabsServiceStub;
    }

    private deprecated_proxy() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final getUserIdentifier onNavigationEvent(@NotNull deprecated_proxySelector deprecated_proxyselector, @NotNull RepeatType repeatType) throws NoWhenBranchMatchedException {
        float f;
        float f2;
        List<AppLovinSdkSettings> listOnNavigationEvent;
        float f3;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.55f);
        Float fValueOf3 = Float.valueOf(0.5f);
        Float fValueOf4 = Float.valueOf(0.45f);
        Intrinsics.checkNotNullParameter(deprecated_proxyselector, "");
        Intrinsics.checkNotNullParameter(repeatType, "");
        int i4 = onNavigationEvent.onWarmupCompleted[repeatType.ordinal()];
        if (i4 == 1) {
            Address address = Address.onNavigationEvent;
            AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(address.asInterface(), 75);
            int[] iArr = onNavigationEvent.onNavigationEvent;
            int i5 = iArr[deprecated_proxyselector.ordinal()];
            float f4 = -1.0f;
            Object obj = null;
            if (i5 == 1) {
                f = -1.0f;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = onExtraCallback + 27;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                f = -2.0f;
            }
            AppLovinSdkSettings appLovinSdkSettingsAccess000 = isMuted.access000(isMuted.asInterface(isMuted.onWarmupCompleted(appLovinSdkSettingsOnExtraCallback, (Float) null, Float.valueOf(f), (Function1) null, 5, (Object) null), fValueOf3, fValueOf4, (Function1) null, 4, (Object) null), fValueOf3, fValueOf4, null, 4, null);
            AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback2 = RallysKt.onExtraCallback(address.asInterface(), 75);
            int i7 = iArr[deprecated_proxyselector.ordinal()];
            if (i7 == 1) {
                f2 = 1.0f;
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i8 = onWarmupCompleted + 37;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                f2 = 2.0f;
            }
            AppLovinSdkSettings appLovinSdkSettingsAccess0002 = isMuted.access000(isMuted.asInterface(isMuted.onWarmupCompleted(appLovinSdkSettingsOnExtraCallback2, (Float) null, Float.valueOf(f2), (Function1) null, 5, (Object) null), fValueOf4, fValueOf2, (Function1) null, 4, (Object) null), fValueOf4, fValueOf2, null, 4, null);
            AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback3 = RallysKt.onExtraCallback(address.asInterface(), 75);
            int i10 = iArr[deprecated_proxyselector.ordinal()];
            if (i10 == 1) {
                f4 = -0.5f;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i11 = onExtraCallback + 15;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }
            AppLovinSdkSettings appLovinSdkSettingsAccess0003 = isMuted.access000(isMuted.asInterface(isMuted.onWarmupCompleted(appLovinSdkSettingsOnExtraCallback3, (Float) null, Float.valueOf(f4), (Function1) null, 5, (Object) null), fValueOf2, fValueOf4, (Function1) null, 4, (Object) null), fValueOf2, fValueOf4, null, 4, null);
            AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback4 = RallysKt.onExtraCallback(address.asInterface(), 75);
            int i12 = iArr[deprecated_proxyselector.ordinal()];
            if (i12 != 1 && i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listOnNavigationEvent = RallysKt.onNavigationEvent(appLovinSdkSettingsAccess000, appLovinSdkSettingsAccess0002, appLovinSdkSettingsAccess0003, isMuted.access000(isMuted.asInterface(isMuted.onWarmupCompleted(appLovinSdkSettingsOnExtraCallback4, (Float) null, fValueOf, (Function1) null, 5, (Object) null), fValueOf4, fValueOf3, (Function1) null, 4, (Object) null), fValueOf4, fValueOf3, null, 4, null));
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i13 = onExtraCallback + 123;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            Address address2 = Address.onNavigationEvent;
            AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback5 = RallysKt.onExtraCallback(address2.asInterface(), 120);
            int[] iArr2 = onNavigationEvent.onNavigationEvent;
            int i15 = iArr2[deprecated_proxyselector.ordinal()];
            float f5 = -1.2f;
            if (i15 == 1) {
                f3 = -0.6f;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f3 = -1.2f;
            }
            int i16 = iArr2[deprecated_proxyselector.ordinal()];
            if (i16 != 1 && i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AppLovinSdkSettings appLovinSdkSettingsAccess0004 = isMuted.access000(isMuted.asInterface(isMuted.onWarmupCompleted(appLovinSdkSettingsOnExtraCallback5, Float.valueOf(f3), fValueOf, (Function1) null, 4, (Object) null), fValueOf4, fValueOf3, (Function1) null, 4, (Object) null), fValueOf4, fValueOf3, null, 4, null);
            AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback6 = RallysKt.onExtraCallback(address2.asInterface(), 120);
            int i17 = iArr2[deprecated_proxyselector.ordinal()];
            if (i17 != 1 && i17 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i18 = iArr2[deprecated_proxyselector.ordinal()];
            if (i18 != 1) {
                if (i18 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i19 = onExtraCallback + 83;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                f5 = -2.4f;
            }
            listOnNavigationEvent = RallysKt.onNavigationEvent(appLovinSdkSettingsAccess0004, isMuted.access000(isMuted.asInterface(isMuted.onWarmupCompleted(appLovinSdkSettingsOnExtraCallback6, fValueOf, Float.valueOf(f5), (Function1) null, 4, (Object) null), fValueOf3, fValueOf4, (Function1) null, 4, (Object) null), fValueOf3, fValueOf4, null, 4, null));
        }
        return new getUserIdentifier(listOnNavigationEvent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object readTypedObject(Object[] objArr) throws NoWhenBranchMatchedException {
        List<AppLovinSdkSettings> listOnNavigationEvent;
        deprecated_proxySelector deprecated_proxyselector = (deprecated_proxySelector) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_proxyselector, "");
        int i2 = onNavigationEvent.onNavigationEvent[deprecated_proxyselector.ordinal()];
        if (i2 != 1) {
            int i3 = onExtraCallback + 65;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 2 : i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Address address = Address.onNavigationEvent;
            listOnNavigationEvent = RallysKt.onNavigationEvent(isMuted.onExtraCallbackWithResult(RallysKt.onExtraCallback(address.asBinder(), 1000), (String) null, "-=0.35", (Function1) null, 5, (Object) null), isMuted.onExtraCallbackWithResult(RallysKt.onExtraCallback(address.asBinder(), 900), (String) null, "+=0.35", (Function1) null, 5, (Object) null));
        } else {
            Address address2 = Address.onNavigationEvent;
            listOnNavigationEvent = RallysKt.onNavigationEvent(isMuted.onExtraCallbackWithResult(RallysKt.onExtraCallback(address2.asBinder(), 800), (String) null, "-=0.2", (Function1) null, 5, (Object) null), isMuted.onExtraCallbackWithResult(RallysKt.onExtraCallback(address2.asBinder(), 700), (String) null, "+=0.2", (Function1) null, 5, (Object) null));
        }
        getUserIdentifier getuseridentifier = new getUserIdentifier(listOnNavigationEvent);
        int i4 = onExtraCallback + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return getuseridentifier;
    }

    public static /* synthetic */ getUserIdentifier onWarmupCompleted(deprecated_proxy deprecated_proxyVar, deprecated_proxySelector deprecated_proxyselector, RepeatType repeatType, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            deprecated_proxyselector = deprecated_proxySelector.BIG;
            int i5 = onExtraCallback + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            repeatType = RepeatType.NORMAL;
        }
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (getUserIdentifier) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1118449127, new Object[]{deprecated_proxyVar, deprecated_proxyselector, repeatType}, iOnExtraCallbackWithResult, 1118449129, iOnExtraCallbackWithResult2);
    }

    private static final Unit requestPostMessageChannelWithExtras(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Unit unit;
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
            int i3 = 6 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
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
        int i3 = onWarmupCompleted + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit ITrustedWebActivityCallbackStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
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

    private static final Unit notifyNotificationWithChannel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
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

    private static final Unit ITrustedWebActivityServiceDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 97;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit getSmallIconBitmap(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
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

    private static final Unit getSmallIconId(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return unit;
    }

    private static final Unit prefetchWithMultipleUrls(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit receiveFile(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return unit;
    }

    private static final Unit ICustomTabsServiceStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
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

    private static /* synthetic */ Object access100(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
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
        int i3 = onWarmupCompleted + 35;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit warmup(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        int i3 = 88 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsServiceDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit validateRelationship(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit writeTypedList(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsService_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
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

    private static final Unit IEngagementSignalsCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onSessionEnded(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
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

    private static final Unit onGreatestScrollPercentageIncreased(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit IEngagementSignalsCallbackDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 71;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return unit2;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IEngagementSignalsCallbackStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        int i3 = 92 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IEngagementSignalsCallback_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IPostMessageServiceStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
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
        int i3 = onExtraCallback + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
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

    private static final Unit IPostMessageServiceDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
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

    private static final Unit ITrustedWebActivityCallbackDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IPostMessageServiceStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
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

    private static final Unit IPostMessageService_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ITrustedWebActivityCallbackStub(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ITrustedWebActivityCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        int i3 = 34 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit ITrustedWebActivityService(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit cancelNotification(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Interpolator interpolator = (Interpolator) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit areNotificationsEnabled(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(interpolator);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(interpolator);
        int i3 = 27 / 0;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        List<AppLovinSdkSettings> listOnNavigationEvent;
        deprecated_proxySelector deprecated_proxyselector = (deprecated_proxySelector) objArr[1];
        RepeatType repeatType = (RepeatType) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(-8.0f);
        Float fValueOf2 = Float.valueOf(8.0f);
        Float fValueOf3 = Float.valueOf(-20.0f);
        Float fValueOf4 = Float.valueOf(20.0f);
        Float fValueOf5 = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(deprecated_proxyselector, "");
        Intrinsics.checkNotNullParameter(repeatType, "");
        Address address = Address.onNavigationEvent;
        final Interpolator interpolator = (Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{address, Float.valueOf(0.5f), Float.valueOf(0.2f), Float.valueOf(0.8f), Float.valueOf(0.5f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        final Interpolator interpolator2 = (Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{address, Float.valueOf(0.2f), Float.valueOf(0.5f), Float.valueOf(0.5f), Float.valueOf(0.8f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = onNavigationEvent.onWarmupCompleted[repeatType.ordinal()];
        if (i4 == 1) {
            int i5 = onNavigationEvent.onNavigationEvent[deprecated_proxyselector.ordinal()];
            if (i5 == 1) {
                listOnNavigationEvent = RallysKt.onNavigationEvent(isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(1500), (String) null, "+=4", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 105;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnWarmupCompleted = deprecated_proxy.onWarmupCompleted(interpolator2, (attachAppLovinSdk) obj);
                        if (i8 == 0) {
                            int i9 = 7 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, 1, (Object) null), (String) null, "+=4", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda15
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        Unit unitAsInterface;
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 33;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            unitAsInterface = deprecated_proxy.asInterface(interpolator, (attachAppLovinSdk) obj);
                            int i8 = 21 / 0;
                        } else {
                            unitAsInterface = deprecated_proxy.asInterface(interpolator, (attachAppLovinSdk) obj);
                        }
                        int i9 = IAuthTabCallback + 121;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 2 / 0;
                        }
                        return unitAsInterface;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(1500), (String) null, "-=4", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda26
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 93;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Interpolator interpolator3 = interpolator;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i8 == 0) {
                            return deprecated_proxy.ICustomTabsCallbackStubProxy(interpolator3, attachapplovinsdk);
                        }
                        Unit unitICustomTabsCallbackStubProxy = deprecated_proxy.ICustomTabsCallbackStubProxy(interpolator3, attachapplovinsdk);
                        int i9 = 37 / 0;
                        return unitICustomTabsCallbackStubProxy;
                    }
                }, 1, (Object) null), (String) null, "+=4", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda37
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 107;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnTransact = deprecated_proxy.onTransact(interpolator2, (attachAppLovinSdk) obj);
                        int i9 = onExtraCallback + 35;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 31 / 0;
                        }
                        return unitOnTransact;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), (String) null, "-=8", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda38
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 67;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            deprecated_proxy.newSessionWithExtras(interpolator2, (attachAppLovinSdk) obj);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitNewSessionWithExtras = deprecated_proxy.newSessionWithExtras(interpolator2, (attachAppLovinSdk) obj);
                        int i8 = onExtraCallback + 51;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        return unitNewSessionWithExtras;
                    }
                }, 1, (Object) null), (String) null, "-=8", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda39
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 35;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        Unit interfaceDescriptor = deprecated_proxy.getInterfaceDescriptor(interpolator, (attachAppLovinSdk) obj);
                        int i9 = onWarmupCompleted + 17;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            return interfaceDescriptor;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), (String) null, "+=8", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda40
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        Unit unitPrefetch;
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 95;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            unitPrefetch = deprecated_proxy.prefetch(interpolator, (attachAppLovinSdk) obj);
                            int i8 = 10 / 0;
                        } else {
                            unitPrefetch = deprecated_proxy.prefetch(interpolator, (attachAppLovinSdk) obj);
                        }
                        int i9 = onExtraCallback + 29;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        return unitPrefetch;
                    }
                }, 1, (Object) null), (String) null, "-=8", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda41
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 75;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitICustomTabsService = deprecated_proxy.ICustomTabsService(interpolator2, (attachAppLovinSdk) obj);
                        int i9 = onNavigationEvent + 95;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unitICustomTabsService;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(1500), (String) null, "+=4", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda42
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 3;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        Interpolator interpolator3 = interpolator2;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i8 == 0) {
                            return deprecated_proxy.onMessageChannelReady(interpolator3, attachapplovinsdk);
                        }
                        deprecated_proxy.onMessageChannelReady(interpolator3, attachapplovinsdk);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), (String) null, "+=4", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda43
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 31;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitExtraCallback = deprecated_proxy.extraCallback(interpolator, (attachAppLovinSdk) obj);
                        int i9 = IAuthTabCallback + 43;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unitExtraCallback;
                        }
                        throw null;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), (String) null, "-=4", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 107;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        Interpolator interpolator3 = interpolator;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i8 != 0) {
                            return deprecated_proxy.onUnminimized(interpolator3, attachapplovinsdk);
                        }
                        deprecated_proxy.onUnminimized(interpolator3, attachapplovinsdk);
                        throw null;
                    }
                }, 1, (Object) null), (String) null, "+=4", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 49;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnExtraCallback = deprecated_proxy.onExtraCallback(interpolator2, (attachAppLovinSdk) obj);
                        int i9 = onExtraCallback + 113;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 78 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                }, 1, (Object) null));
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listOnNavigationEvent = RallysKt.onNavigationEvent(isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(1500), (String) null, "+=10", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 89;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unit = (Unit) deprecated_proxy.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -123128918, new Object[]{interpolator2, (attachAppLovinSdk) obj}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 123128925, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                        int i9 = IAuthTabCallback + 45;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), (String) null, "+=10", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda8
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 63;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        Unit typedObject = deprecated_proxy.readTypedObject(interpolator, (attachAppLovinSdk) obj);
                        int i9 = onNavigationEvent + 67;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 == 0) {
                            return typedObject;
                        }
                        throw null;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(1500), (String) null, "-=10", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        Unit unit;
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 9;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            unit = (Unit) deprecated_proxy.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1140777910, new Object[]{interpolator, (attachAppLovinSdk) obj}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1140777905, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                            int i8 = 28 / 0;
                        } else {
                            unit = (Unit) deprecated_proxy.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1140777910, new Object[]{interpolator, (attachAppLovinSdk) obj}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1140777905, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                        }
                        int i9 = IAuthTabCallback + 53;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        return unit;
                    }
                }, 1, (Object) null), (String) null, "+=10", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda10
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 61;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unit = (Unit) deprecated_proxy.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1883200488, new Object[]{interpolator2, (attachAppLovinSdk) obj}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1883200496, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                        int i9 = onNavigationEvent + 103;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        return unit;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), (String) null, "-=20", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda11
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 57;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Interpolator interpolator3 = interpolator2;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i8 != 0) {
                            return deprecated_proxy.ICustomTabsCallback(interpolator3, attachapplovinsdk);
                        }
                        deprecated_proxy.ICustomTabsCallback(interpolator3, attachapplovinsdk);
                        throw null;
                    }
                }, 1, (Object) null), (String) null, "-=20", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda12
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 91;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitExtraCommand = deprecated_proxy.extraCommand(interpolator, (attachAppLovinSdk) obj);
                        int i9 = onExtraCallbackWithResult + 29;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        return unitExtraCommand;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), (String) null, "+=20", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda13
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 89;
                        onExtraCallbackWithResult = i7 % 128;
                        Object obj2 = null;
                        if (i7 % 2 == 0) {
                            deprecated_proxy.access100(interpolator, (attachAppLovinSdk) obj);
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitAccess100 = deprecated_proxy.access100(interpolator, (attachAppLovinSdk) obj);
                        int i8 = onExtraCallbackWithResult + 69;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            return unitAccess100;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), (String) null, "-=20", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda14
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 119;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitIAuthTabCallbackStubProxy = deprecated_proxy.IAuthTabCallbackStubProxy(interpolator2, (attachAppLovinSdk) obj);
                        int i9 = onNavigationEvent + 75;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        return unitIAuthTabCallbackStubProxy;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(1500), (String) null, "+=10", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda16
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 19;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitExtraCallbackWithResult = deprecated_proxy.extraCallbackWithResult(interpolator2, (attachAppLovinSdk) obj);
                        int i9 = IAuthTabCallback + 73;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unitExtraCallbackWithResult;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), (String) null, "+=10", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda17
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 93;
                        onWarmupCompleted = i7 % 128;
                        Object obj2 = null;
                        if (i7 % 2 == 0) {
                            deprecated_proxy.ICustomTabsCallbackDefault(interpolator, (attachAppLovinSdk) obj);
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitICustomTabsCallbackDefault = deprecated_proxy.ICustomTabsCallbackDefault(interpolator, (attachAppLovinSdk) obj);
                        int i8 = onWarmupCompleted + 49;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            return unitICustomTabsCallbackDefault;
                        }
                        throw null;
                    }
                }, 1, (Object) null), isMuted.onExtraCallback(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), (String) null, "-=10", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda18
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 111;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        Interpolator interpolator3 = interpolator;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i8 != 0) {
                            return deprecated_proxy.newSession(interpolator3, attachapplovinsdk);
                        }
                        deprecated_proxy.newSession(interpolator3, attachapplovinsdk);
                        throw null;
                    }
                }, 1, (Object) null), (String) null, "+=10", new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda19
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 107;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitIAuthTabCallback = deprecated_proxy.IAuthTabCallback(interpolator2, (attachAppLovinSdk) obj);
                        int i9 = onExtraCallbackWithResult + 29;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        return unitIAuthTabCallback;
                    }
                }, 1, (Object) null));
            }
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = onNavigationEvent.onNavigationEvent[deprecated_proxyselector.ordinal()];
            if (i6 != 1) {
                int i7 = onWarmupCompleted + 17;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0 ? i6 != 2 : i6 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                listOnNavigationEvent = RallysKt.onNavigationEvent(isMuted.onExtraCallbackWithResult(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), fValueOf4, fValueOf5, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda29
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 15;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            throw null;
                        }
                        Unit unit = (Unit) deprecated_proxy.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1606491876, new Object[]{interpolator, (attachAppLovinSdk) obj}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1606491866, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                        int i10 = IAuthTabCallback + 43;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        return unit;
                    }
                }), fValueOf5, fValueOf4, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda30
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 7;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitNewAuthTabSession = deprecated_proxy.newAuthTabSession(interpolator2, (attachAppLovinSdk) obj);
                        int i11 = onExtraCallback + 49;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        return unitNewAuthTabSession;
                    }
                }), isMuted.onExtraCallbackWithResult(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), fValueOf5, fValueOf3, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda31
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 119;
                        onWarmupCompleted = i9 % 128;
                        Object obj2 = null;
                        if (i9 % 2 == 0) {
                            deprecated_proxy.postMessage(interpolator2, (attachAppLovinSdk) obj);
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitPostMessage = deprecated_proxy.postMessage(interpolator2, (attachAppLovinSdk) obj);
                        int i10 = onWarmupCompleted + 89;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unitPostMessage;
                        }
                        throw null;
                    }
                }), fValueOf4, fValueOf5, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda32
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 47;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            deprecated_proxy.access000(interpolator, (attachAppLovinSdk) obj);
                            throw null;
                        }
                        Unit unitAccess000 = deprecated_proxy.access000(interpolator, (attachAppLovinSdk) obj);
                        int i10 = IAuthTabCallback + 67;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        return unitAccess000;
                    }
                }), isMuted.onExtraCallbackWithResult(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), fValueOf3, fValueOf5, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda33
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 107;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Interpolator interpolator3 = interpolator;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i10 == 0) {
                            return deprecated_proxy.onExtraCallbackWithResult(interpolator3, attachapplovinsdk);
                        }
                        deprecated_proxy.onExtraCallbackWithResult(interpolator3, attachapplovinsdk);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }), fValueOf5, fValueOf3, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda34
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 61;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnActivityLayout = deprecated_proxy.onActivityLayout(interpolator2, (attachAppLovinSdk) obj);
                        if (i10 != 0) {
                            int i11 = 32 / 0;
                        }
                        return unitOnActivityLayout;
                    }
                }), isMuted.onExtraCallbackWithResult(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), fValueOf5, fValueOf4, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda35
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 35;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 != 0) {
                            deprecated_proxy.onRelationshipValidationResult(interpolator2, (attachAppLovinSdk) obj);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnRelationshipValidationResult = deprecated_proxy.onRelationshipValidationResult(interpolator2, (attachAppLovinSdk) obj);
                        int i10 = onExtraCallbackWithResult + 103;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnRelationshipValidationResult;
                    }
                }), fValueOf3, fValueOf5, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda36
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 71;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitIsEngagementSignalsApiAvailable = deprecated_proxy.isEngagementSignalsApiAvailable(interpolator, (attachAppLovinSdk) obj);
                        int i11 = onExtraCallback + 15;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        return unitIsEngagementSignalsApiAvailable;
                    }
                }));
            } else {
                listOnNavigationEvent = RallysKt.onNavigationEvent(isMuted.onExtraCallbackWithResult(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), fValueOf2, fValueOf5, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda20
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 29;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitICustomTabsCallbackStub = deprecated_proxy.ICustomTabsCallbackStub(interpolator, (attachAppLovinSdk) obj);
                        int i11 = onExtraCallback + 13;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        return unitICustomTabsCallbackStub;
                    }
                }), fValueOf5, fValueOf2, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda21
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        Unit unitAsBinder;
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 25;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                            unitAsBinder = deprecated_proxy.asBinder(interpolator2, (attachAppLovinSdk) obj);
                            int i10 = 3 / 0;
                        } else {
                            unitAsBinder = deprecated_proxy.asBinder(interpolator2, (attachAppLovinSdk) obj);
                        }
                        int i11 = onNavigationEvent + 125;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        return unitAsBinder;
                    }
                }), isMuted.onExtraCallbackWithResult(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), fValueOf5, fValueOf, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda22
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 23;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Interpolator interpolator3 = interpolator2;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i10 != 0) {
                            return deprecated_proxy.IAuthTabCallback_Parcel(interpolator3, attachapplovinsdk);
                        }
                        Unit unitIAuthTabCallback_Parcel = deprecated_proxy.IAuthTabCallback_Parcel(interpolator3, attachapplovinsdk);
                        int i11 = 85 / 0;
                        return unitIAuthTabCallback_Parcel;
                    }
                }), fValueOf2, fValueOf5, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda23
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 101;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unit = (Unit) deprecated_proxy.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1876238921, new Object[]{interpolator, (attachAppLovinSdk) obj}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1876238922, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                        int i11 = onNavigationEvent + 31;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 == 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }), isMuted.onExtraCallbackWithResult(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), fValueOf, fValueOf5, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda24
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 3;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Interpolator interpolator3 = interpolator;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i10 == 0) {
                            return deprecated_proxy.mayLaunchUrl(interpolator3, attachapplovinsdk);
                        }
                        deprecated_proxy.mayLaunchUrl(interpolator3, attachapplovinsdk);
                        throw null;
                    }
                }), fValueOf5, fValueOf, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda25
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 69;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Interpolator interpolator3 = interpolator2;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i10 != 0) {
                            return deprecated_proxy.onPostMessage(interpolator3, attachapplovinsdk);
                        }
                        deprecated_proxy.onPostMessage(interpolator3, attachapplovinsdk);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }), isMuted.onExtraCallbackWithResult(isMuted.onNavigationEvent(RallysKt.onExtraCallback(3000), fValueOf5, fValueOf2, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda27
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 103;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnActivityResized = deprecated_proxy.onActivityResized(interpolator2, (attachAppLovinSdk) obj);
                        int i11 = IAuthTabCallback + 7;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        return unitOnActivityResized;
                    }
                }), fValueOf, fValueOf5, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.effect.AnimateEffect$$ExternalSyntheticLambda28
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 37;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitIAuthTabCallbackStub = deprecated_proxy.IAuthTabCallbackStub(interpolator, (attachAppLovinSdk) obj);
                        int i11 = onWarmupCompleted + 29;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        return unitIAuthTabCallbackStub;
                    }
                }));
            }
        }
        getUserIdentifier getuseridentifier = new getUserIdentifier(listOnNavigationEvent);
        Iterator<T> it = getuseridentifier.onNavigationEvent().iterator();
        while (it.hasNext()) {
            ((AppLovinSdkSettings) it.next()).onExtraCallback(getVersionCode.STRONG);
        }
        return getuseridentifier;
    }

    public static /* synthetic */ getUserIdentifier onNavigationEvent(deprecated_proxy deprecated_proxyVar, deprecated_proxySelector deprecated_proxyselector, EnumC0079certificatePinner enumC0079certificatePinner, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            deprecated_proxyselector = deprecated_proxySelector.BIG;
            int i5 = onWarmupCompleted + 27;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 2;
            }
        }
        getUserIdentifier getuseridentifierOnExtraCallbackWithResult = deprecated_proxyVar.onExtraCallbackWithResult(deprecated_proxyselector, enumC0079certificatePinner);
        int i7 = onWarmupCompleted + 19;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return getuseridentifierOnExtraCallbackWithResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6 A[PHI: r4 r9 r12
      0x00a6: PHI (r4v7 java.lang.Integer) = (r4v5 int), (r4v8 int) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r9v3 java.lang.Integer) = (r9v1 int), (r9v4 int) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r12v3 java.lang.Integer) = (r12v0 int), (r12v4 int) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059 A[PHI: r2 r4 r9 r12
      0x0059: PHI (r2v3 int) = (r2v2 int), (r2v11 int) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r4v6 java.lang.Integer) = (r4v5 int), (r4v8 int) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r9v2 java.lang.Integer) = (r9v1 int), (r9v4 int) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r12v1 java.lang.Integer) = (r12v0 int), (r12v4 int) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getUserIdentifier onExtraCallbackWithResult(@NotNull deprecated_proxySelector deprecated_proxyselector, @NotNull EnumC0079certificatePinner enumC0079certificatePinner) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        int i3;
        int i4;
        int iOnWarmupCompleted;
        List<AppLovinSdkSettings> listOnNavigationEvent;
        int iOnWarmupCompleted2;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 109;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            i = 1;
            i2 = 2;
            i3 = 4;
            Intrinsics.checkNotNullParameter(deprecated_proxyselector, "");
            Intrinsics.checkNotNullParameter(enumC0079certificatePinner, "");
            i4 = onNavigationEvent.IAuthTabCallback[enumC0079certificatePinner.ordinal()];
            if (i4 != 0) {
                Integer num = i;
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = RallysKt.IAuthTabCallback(new Rmenu.onNavigationEvent(1.0d, 0.2d));
                int i7 = onNavigationEvent.onNavigationEvent[deprecated_proxyselector.ordinal()];
                if (i7 == 1) {
                    iOnWarmupCompleted = onWarmupCompleted(i3);
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i8 = onExtraCallback + 107;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    iOnWarmupCompleted = onWarmupCompleted(i2);
                }
                listOnNavigationEvent = RallysKt.onNavigationEvent(isMuted.onExtraCallback(appLovinSdkSettingsIAuthTabCallback, Integer.valueOf(iOnWarmupCompleted), num, (Function1) null, 4, (Object) null));
            } else {
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback2 = RallysKt.IAuthTabCallback(new Rmenu.onNavigationEvent(1.0d, 0.2d));
                int i10 = onNavigationEvent.onNavigationEvent[deprecated_proxyselector.ordinal()];
                if (i10 == 1) {
                    iOnWarmupCompleted2 = onWarmupCompleted(i3);
                    int i11 = onExtraCallback + 55;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i13 = onWarmupCompleted + 61;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        onWarmupCompleted(i2);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    iOnWarmupCompleted2 = onWarmupCompleted(i2);
                }
                listOnNavigationEvent = RallysKt.onNavigationEvent(isMuted.onExtraCallbackWithResult(appLovinSdkSettingsIAuthTabCallback2, Integer.valueOf(iOnWarmupCompleted2), i, (Function1) null, 4, (Object) null));
            }
        } else {
            i = 0;
            i2 = 4;
            i3 = 2;
            Intrinsics.checkNotNullParameter(deprecated_proxyselector, "");
            Intrinsics.checkNotNullParameter(enumC0079certificatePinner, "");
            i4 = onNavigationEvent.IAuthTabCallback[enumC0079certificatePinner.ordinal()];
            if (i4 != 1) {
            }
        }
        return new getUserIdentifier(listOnNavigationEvent);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r29) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.deprecated_proxy.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(100);
        attachapplovinsdk.onExtraCallback(50);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(100);
        attachapplovinsdk.onExtraCallback(50);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(27929);
            i = 23;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(150);
            i = 100;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return unit;
    }

    private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(150);
        attachapplovinsdk.onExtraCallback(100);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final getUserIdentifier onExtraCallback(@NotNull deprecated_proxySelector deprecated_proxyselector) throws NoWhenBranchMatchedException {
        List<AppLovinSdkSettings> listOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_proxyselector, "");
        int i2 = onNavigationEvent.onNavigationEvent[deprecated_proxyselector.ordinal()];
        if (i2 != 1) {
            int i3 = onExtraCallback + 37;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = i4 + 107;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            Address address = Address.onNavigationEvent;
            Object[] objArr = {RallysKt.onExtraCallback(address.asBinder(), 150), null, "+=0.1", null, 5, null};
            AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 2081571069, objArr, -2081571051, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
            Object[] objArr2 = {RallysKt.onExtraCallback(address.asBinder(), 150), null, "-=0.1", null, 5, null};
            listOnNavigationEvent = RallysKt.onNavigationEvent(appLovinSdkSettings, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 2081571069, objArr2, -2081571051, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()));
        } else {
            Address address2 = Address.onNavigationEvent;
            Object[] objArr3 = {RallysKt.onExtraCallback(address2.asBinder(), 150), null, "+=0.03", null, 5, null};
            AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 2081571069, objArr3, -2081571051, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
            Object[] objArr4 = {RallysKt.onExtraCallback(address2.asBinder(), 150), null, "-=0.03", null, 5, null};
            listOnNavigationEvent = RallysKt.onNavigationEvent(appLovinSdkSettings2, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 2081571069, objArr4, -2081571051, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()));
        }
        return new getUserIdentifier(listOnNavigationEvent);
    }

    private final int onWarmupCompleted(Number number) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            DisplayMetrics displayMetrics = contentType.onExtraCallback.IAuthTabCallbackStubProxy().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return varyMatches.onNavigationEvent(number, displayMetrics);
        }
        DisplayMetrics displayMetrics2 = contentType.onExtraCallback.IAuthTabCallbackStubProxy().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int i3 = 72 / 0;
        return varyMatches.onNavigationEvent(number, displayMetrics2);
    }

    public static /* synthetic */ Unit onNavigationEvent(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -123128918, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 123128925, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1140777910, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -1140777905, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit writeTypedObject(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1606491876, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -1606491866, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onMinimized(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1883200488, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 1883200496, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -705484469, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult, 705484480, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit ICustomTabsCallback_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1876238921, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 1876238922, iOnExtraCallbackWithResult2);
    }

    private static final Unit requestPostMessageChannel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1134827934, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 1134827938, iOnExtraCallbackWithResult2);
    }

    private static final Unit setEngagementSignalsCallback(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1418127068, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -1418127059, iOnExtraCallbackWithResult2);
    }

    private static final Unit updateVisuals(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -233170165, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 233170178, iOnExtraCallbackWithResult2);
    }

    private static final Unit access200(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 2088306995, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -2088306981, iOnExtraCallbackWithResult2);
    }

    private static final Unit ICustomTabsServiceStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1734051467, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -1734051455, iOnExtraCallbackWithResult2);
    }

    private static final Unit onVerticalScrollEvent(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1954013624, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -1954013608, iOnExtraCallbackWithResult2);
    }

    private static final Unit IEngagementSignalsCallbackStubProxy(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -783448558, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 783448576, iOnExtraCallbackWithResult2);
    }

    private static final Unit IPostMessageService(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -110165634, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 110165651, iOnExtraCallbackWithResult2);
    }

    private static final Unit ITrustedWebActivityCallback_Parcel(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 811866339, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, -811866336, iOnExtraCallbackWithResult2);
    }

    private static final Unit getActiveNotifications(Interpolator interpolator, attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2092737721, new Object[]{interpolator, attachapplovinsdk}, iOnExtraCallbackWithResult, 2092737727, iOnExtraCallbackWithResult2);
    }

    public final getUserIdentifier IAuthTabCallback(@NotNull deprecated_proxySelector deprecated_proxyselector) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (getUserIdentifier) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1425011483, new Object[]{this, deprecated_proxyselector}, iOnExtraCallbackWithResult, 1425011498, iOnExtraCallbackWithResult2);
    }

    public final getUserIdentifier onExtraCallbackWithResult(@NotNull deprecated_proxySelector deprecated_proxyselector, @NotNull RepeatType repeatType) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (getUserIdentifier) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1118449127, new Object[]{this, deprecated_proxyselector, repeatType}, iOnExtraCallbackWithResult, 1118449129, iOnExtraCallbackWithResult2);
    }

    public final getUserIdentifier IAuthTabCallback(@NotNull deprecated_proxySelector deprecated_proxyselector, @NotNull EnumC0079certificatePinner enumC0079certificatePinner) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (getUserIdentifier) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1261663334, new Object[]{this, deprecated_proxyselector, enumC0079certificatePinner}, iOnExtraCallbackWithResult, -1261663334, iOnExtraCallbackWithResult2);
    }
}
