package o;

import android.content.Context;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda3;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.VideoEncoderCrashQuirk;
import o.trackNativeAdCustomTabsNavigationStarted;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackNativeAdCustomTabsNavigationStarted implements getTrackedAxonEvents {
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private final Lazy IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private final getBillingPeriod IAuthTabCallbackStubProxy;
    private final Lazy access000;
    private final Lazy access100;
    private final Lazy asBinder;
    private final Lazy asInterface;
    private final Lazy getInterfaceDescriptor;
    private final Context onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final Lazy onTransact;
    private final Lazy onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted = (trackNativeAdCustomTabsNavigationStarted) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            writeTypedObject(tracknativeadcustomtabsnavigationstarted);
            obj.hashCode();
            throw null;
        }
        VideoEncoderCrashQuirk videoEncoderCrashQuirkWriteTypedObject = writeTypedObject(tracknativeadcustomtabsnavigationstarted);
        int i3 = ICustomTabsCallback + 109;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return videoEncoderCrashQuirkWriteTypedObject;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted = (trackNativeAdCustomTabsNavigationStarted) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onMessageChannelReady(tracknativeadcustomtabsnavigationstarted);
        }
        onMessageChannelReady(tracknativeadcustomtabsnavigationstarted);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ VideoEncoderCrashQuirk IAuthTabCallbackDefault(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnMinimized = onMinimized(tracknativeadcustomtabsnavigationstarted);
        int i4 = ICustomTabsCallback + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return videoEncoderCrashQuirkOnMinimized;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted = (trackNativeAdCustomTabsNavigationStarted) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkAccess100 = access100(tracknativeadcustomtabsnavigationstarted);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return videoEncoderCrashQuirkAccess100;
    }

    public static /* synthetic */ VideoEncoderCrashQuirk IAuthTabCallbackStub(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return (VideoEncoderCrashQuirk) onWarmupCompleted(-1042444778, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), 1042444778, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ VideoEncoderCrashQuirk asBinder(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk typedObject = readTypedObject(tracknativeadcustomtabsnavigationstarted);
        int i4 = ICustomTabsCallback + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        throw null;
    }

    public static /* synthetic */ VideoEncoderCrashQuirk asInterface(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) onWarmupCompleted(1108144399, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -1108144398, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = IAuthTabCallback_Parcel + 107;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return videoEncoderCrashQuirk;
    }

    public static /* synthetic */ VideoEncoderCrashQuirk getInterfaceDescriptor(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsCallback(tracknativeadcustomtabsnavigationstarted);
            throw null;
        }
        VideoEncoderCrashQuirk videoEncoderCrashQuirkICustomTabsCallback = ICustomTabsCallback(tracknativeadcustomtabsnavigationstarted);
        int i3 = IAuthTabCallback_Parcel + 105;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return videoEncoderCrashQuirkICustomTabsCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ VideoEncoderCrashQuirk onExtraCallback(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkExtraCallbackWithResult = extraCallbackWithResult(tracknativeadcustomtabsnavigationstarted);
        int i4 = ICustomTabsCallback + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return videoEncoderCrashQuirkExtraCallbackWithResult;
    }

    public static /* synthetic */ VideoEncoderCrashQuirk onExtraCallbackWithResult(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) onWarmupCompleted(900549203, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -900549201, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = ICustomTabsCallback + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return videoEncoderCrashQuirk;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted = (trackNativeAdCustomTabsNavigationStarted) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            extraCallback(tracknativeadcustomtabsnavigationstarted);
            throw null;
        }
        VideoEncoderCrashQuirk videoEncoderCrashQuirkExtraCallback = extraCallback(tracknativeadcustomtabsnavigationstarted);
        int i3 = ICustomTabsCallback + 75;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return videoEncoderCrashQuirkExtraCallback;
    }

    public static /* synthetic */ VideoEncoderCrashQuirk onNavigationEvent(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityResized(tracknativeadcustomtabsnavigationstarted);
        }
        onActivityResized(tracknativeadcustomtabsnavigationstarted);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = i8 | i;
        int i10 = (~(i7 | i8)) | (~(i7 | i)) | (~i9);
        int i11 = ~i;
        int i12 = (~(i3 | i11 | i4)) | (~(i7 | i11 | i8)) | (~(i9 | i4));
        int i13 = ~(i8 | i11 | i4);
        int i14 = i + i4 + i6 + ((-973178360) * i2) + (1542423572 * i5);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i) - 1073741824) + ((-187520530) * i4) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i6) + (1207959552 * i2) + ((-1275068416) * i5) + (196542464 * i15);
        int i17 = (i * (-490823948)) + 944362368 + (i4 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i6 * (-490822951)) + (i2 * 2145288392) + (i5 * 779328756) + (i15 * (-1138819072));
        switch (i16 + (i17 * i17 * 1440284672)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    @Inject
    public trackNativeAdCustomTabsNavigationStarted(@NotNull Context context, @NotNull getBillingPeriod getbillingperiod) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        this.onExtraCallback = context;
        this.IAuthTabCallbackStubProxy = getbillingperiod;
        this.access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirkOnNavigationEvent = trackNativeAdCustomTabsNavigationStarted.onNavigationEvent(this.f$0);
                int i4 = onNavigationEvent + 103;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return videoEncoderCrashQuirkOnNavigationEvent;
            }
        });
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 9;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirkIAuthTabCallbackStub = trackNativeAdCustomTabsNavigationStarted.IAuthTabCallbackStub(this.f$0);
                int i4 = IAuthTabCallback + 79;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return videoEncoderCrashQuirkIAuthTabCallbackStub;
            }
        });
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) trackNativeAdCustomTabsNavigationStarted.onWarmupCompleted(1002660694, new Object[]{this.f$0}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -1002660690, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
                int i4 = onExtraCallback + 101;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return videoEncoderCrashQuirk;
            }
        });
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirkAsBinder = trackNativeAdCustomTabsNavigationStarted.asBinder(this.f$0);
                int i4 = onExtraCallback + 95;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 86 / 0;
                }
                return videoEncoderCrashQuirkAsBinder;
            }
        });
        this.onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) trackNativeAdCustomTabsNavigationStarted.onWarmupCompleted(-1746237855, new Object[]{this.f$0}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), 1746237860, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
                int i4 = onExtraCallback + 83;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return videoEncoderCrashQuirk;
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 81;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirkAsInterface = trackNativeAdCustomTabsNavigationStarted.asInterface(this.f$0);
                int i4 = onWarmupCompleted + 81;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return videoEncoderCrashQuirkAsInterface;
            }
        });
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 41;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) trackNativeAdCustomTabsNavigationStarted.onWarmupCompleted(28591590, new Object[]{this.f$0}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -28591584, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
                int i4 = onWarmupCompleted + 73;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return videoEncoderCrashQuirk;
            }
        });
        this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk interfaceDescriptor = trackNativeAdCustomTabsNavigationStarted.getInterfaceDescriptor(this.f$0);
                int i4 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return interfaceDescriptor;
                }
                throw null;
            }
        });
        this.getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    trackNativeAdCustomTabsNavigationStarted.onExtraCallbackWithResult(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                VideoEncoderCrashQuirk videoEncoderCrashQuirkOnExtraCallbackWithResult = trackNativeAdCustomTabsNavigationStarted.onExtraCallbackWithResult(this.f$0);
                int i3 = onExtraCallback + 101;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return videoEncoderCrashQuirkOnExtraCallbackWithResult;
            }
        });
        this.IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirkOnExtraCallback = trackNativeAdCustomTabsNavigationStarted.onExtraCallback(this.f$0);
                int i4 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return videoEncoderCrashQuirkOnExtraCallback;
            }
        });
        this.access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirkIAuthTabCallbackDefault = trackNativeAdCustomTabsNavigationStarted.IAuthTabCallbackDefault(this.f$0);
                int i4 = onExtraCallbackWithResult + 5;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return videoEncoderCrashQuirkIAuthTabCallbackDefault;
                }
                throw null;
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationChannelProviderImpl$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) trackNativeAdCustomTabsNavigationStarted.onWarmupCompleted(-1891868341, new Object[]{this.f$0}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), 1891868344, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
                int i4 = onExtraCallback + 13;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return videoEncoderCrashQuirk;
                }
                throw null;
            }
        });
    }

    private final VideoEncoderCrashQuirk access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.access000.getValue();
        if (i3 == 0) {
            return (VideoEncoderCrashQuirk) value;
        }
        int i4 = 48 / 0;
        return (VideoEncoderCrashQuirk) value;
    }

    private static final VideoEncoderCrashQuirk onActivityResized(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.SILENT;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 2).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).onExtraCallbackWithResult(false).onExtraCallback(false).onWarmupCompleted();
        int i2 = IAuthTabCallback_Parcel + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return videoEncoderCrashQuirkOnWarmupCompleted;
    }

    private final VideoEncoderCrashQuirk onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onExtraCallbackWithResult.getValue();
        if (i3 == 0) {
            return (VideoEncoderCrashQuirk) value;
        }
        int i4 = 93 / 0;
        return (VideoEncoderCrashQuirk) value;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted = (trackNativeAdCustomTabsNavigationStarted) objArr[0];
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.CLIPBOARD;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 4).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).onWarmupCompleted();
        int i2 = ICustomTabsCallback + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return videoEncoderCrashQuirkOnWarmupCompleted;
    }

    private final VideoEncoderCrashQuirk onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.onNavigationEvent.getValue();
        int i4 = ICustomTabsCallback + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return videoEncoderCrashQuirk;
    }

    private static final VideoEncoderCrashQuirk extraCallback(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.GENERAL;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 3).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).onWarmupCompleted();
        int i2 = IAuthTabCallback_Parcel + 7;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return videoEncoderCrashQuirkOnWarmupCompleted;
        }
        throw null;
    }

    private final VideoEncoderCrashQuirk asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.asInterface.getValue();
        int i4 = ICustomTabsCallback + 11;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return videoEncoderCrashQuirk;
    }

    private static final VideoEncoderCrashQuirk readTypedObject(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.IMPORTANT;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 4).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).onWarmupCompleted();
        int i2 = IAuthTabCallback_Parcel + 3;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return videoEncoderCrashQuirkOnWarmupCompleted;
    }

    private final VideoEncoderCrashQuirk IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.onTransact.getValue();
        int i4 = ICustomTabsCallback + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return videoEncoderCrashQuirk;
    }

    private static final VideoEncoderCrashQuirk onMessageChannelReady(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.PEDOMETER;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 2).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).IAuthTabCallback(false).onExtraCallbackWithResult(false).onExtraCallback(false).onWarmupCompleted();
        int i2 = IAuthTabCallback_Parcel + 99;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return videoEncoderCrashQuirkOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final VideoEncoderCrashQuirk IAuthTabCallback() {
        VideoEncoderCrashQuirk videoEncoderCrashQuirk;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.IAuthTabCallback.getValue();
            int i3 = 40 / 0;
        } else {
            videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.IAuthTabCallback.getValue();
        }
        int i4 = IAuthTabCallback_Parcel + 79;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return videoEncoderCrashQuirk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted = (trackNativeAdCustomTabsNavigationStarted) objArr[0];
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.BLE_AIRDROP;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 2).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).IAuthTabCallback(false).onExtraCallbackWithResult(false).onExtraCallback(false).onWarmupCompleted();
        int i2 = IAuthTabCallback_Parcel + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return videoEncoderCrashQuirkOnWarmupCompleted;
    }

    private final VideoEncoderCrashQuirk onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.onWarmupCompleted.getValue();
        int i4 = ICustomTabsCallback + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return videoEncoderCrashQuirk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final VideoEncoderCrashQuirk access100(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.CURRENCY;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 4).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).onWarmupCompleted();
        int i2 = IAuthTabCallback_Parcel + 53;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return videoEncoderCrashQuirkOnWarmupCompleted;
        }
        throw null;
    }

    private final VideoEncoderCrashQuirk onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.asBinder.getValue();
        int i4 = IAuthTabCallback_Parcel + 35;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return videoEncoderCrashQuirk;
    }

    private static final VideoEncoderCrashQuirk ICustomTabsCallback(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.MOBILITY;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 4).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).IAuthTabCallback(false).onExtraCallbackWithResult(false).onExtraCallback(false).onWarmupCompleted();
        int i2 = ICustomTabsCallback + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return videoEncoderCrashQuirkOnWarmupCompleted;
    }

    private final VideoEncoderCrashQuirk access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.getInterfaceDescriptor.getValue();
        int i3 = ICustomTabsCallback + 27;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return videoEncoderCrashQuirk;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted = (trackNativeAdCustomTabsNavigationStarted) objArr[0];
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.MOBILE_TMONEY;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 2).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).IAuthTabCallback(false).onExtraCallbackWithResult(false).onExtraCallback(false).onWarmupCompleted();
        int i2 = IAuthTabCallback_Parcel + 41;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return videoEncoderCrashQuirkOnWarmupCompleted;
    }

    private final VideoEncoderCrashQuirk asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.IAuthTabCallbackStub.getValue();
        int i4 = ICustomTabsCallback + 125;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return videoEncoderCrashQuirk;
    }

    private static final VideoEncoderCrashQuirk extraCallbackWithResult(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.OFFLINE_OVERSEAS_TOSS_PAY;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 4).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).IAuthTabCallback(false).onExtraCallbackWithResult(false).onExtraCallback(false).onWarmupCompleted();
        int i2 = IAuthTabCallback_Parcel + 87;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return videoEncoderCrashQuirkOnWarmupCompleted;
    }

    private final VideoEncoderCrashQuirk IAuthTabCallback_Parcel() {
        VideoEncoderCrashQuirk videoEncoderCrashQuirk;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.access100.getValue();
            int i3 = 50 / 0;
        } else {
            videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.access100.getValue();
        }
        int i4 = IAuthTabCallback_Parcel + 113;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return videoEncoderCrashQuirk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final VideoEncoderCrashQuirk onMinimized(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.POINT_BACK;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 2).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).IAuthTabCallback(false).onExtraCallbackWithResult(false).onExtraCallback(false).onWarmupCompleted();
        int i2 = IAuthTabCallback_Parcel + 97;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return videoEncoderCrashQuirkOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final VideoEncoderCrashQuirk IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.IAuthTabCallbackDefault.getValue();
        int i4 = IAuthTabCallback_Parcel + 103;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return videoEncoderCrashQuirk;
    }

    private static final VideoEncoderCrashQuirk writeTypedObject(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        int i = 2 % 2;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = EventServiceImplExternalSyntheticLambda0.MEDIA_PLAYBACK;
        VideoEncoderCrashQuirk videoEncoderCrashQuirkOnWarmupCompleted = new VideoEncoderCrashQuirk.IAuthTabCallback(eventServiceImplExternalSyntheticLambda0.getId(), 2).onExtraCallbackWithResult(tracknativeadcustomtabsnavigationstarted.onExtraCallback.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId())).IAuthTabCallback(false).onExtraCallbackWithResult(false).onExtraCallback(false).onWarmupCompleted();
        int i2 = ICustomTabsCallback + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return videoEncoderCrashQuirkOnWarmupCompleted;
    }

    @Override // o.getTrackedAxonEvents
    public List<VideoEncoderCrashQuirk> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(IAuthTabCallback());
        listCreateListBuilder.add(IAuthTabCallbackDefault());
        listCreateListBuilder.add(onWarmupCompleted());
        listCreateListBuilder.add(access100());
        listCreateListBuilder.add(onExtraCallbackWithResult());
        listCreateListBuilder.add(asBinder());
        listCreateListBuilder.add(IAuthTabCallbackStub());
        if (this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult() == getPricingPhaseList.KR) {
            listCreateListBuilder.add(onNavigationEvent());
            listCreateListBuilder.add(onTransact());
            listCreateListBuilder.add(access000());
            listCreateListBuilder.add(asInterface());
            listCreateListBuilder.add(IAuthTabCallback_Parcel());
        }
        List<VideoEncoderCrashQuirk> listBuild = CollectionsKt.build(listCreateListBuilder);
        int i4 = IAuthTabCallback_Parcel + 63;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return listBuild;
    }

    public static /* synthetic */ VideoEncoderCrashQuirk IAuthTabCallback(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        return (VideoEncoderCrashQuirk) onWarmupCompleted(-1746237855, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), 1746237860, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static /* synthetic */ VideoEncoderCrashQuirk onWarmupCompleted(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        return (VideoEncoderCrashQuirk) onWarmupCompleted(1002660694, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -1002660690, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static /* synthetic */ VideoEncoderCrashQuirk onTransact(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        return (VideoEncoderCrashQuirk) onWarmupCompleted(28591590, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -28591584, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static /* synthetic */ VideoEncoderCrashQuirk IAuthTabCallback_Parcel(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        return (VideoEncoderCrashQuirk) onWarmupCompleted(-1891868341, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), 1891868344, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final VideoEncoderCrashQuirk access000(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        return (VideoEncoderCrashQuirk) onWarmupCompleted(1108144399, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -1108144398, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final VideoEncoderCrashQuirk IAuthTabCallbackStubProxy(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        return (VideoEncoderCrashQuirk) onWarmupCompleted(-1042444778, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), 1042444778, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final VideoEncoderCrashQuirk onPostMessage(trackNativeAdCustomTabsNavigationStarted tracknativeadcustomtabsnavigationstarted) {
        return (VideoEncoderCrashQuirk) onWarmupCompleted(900549203, new Object[]{tracknativeadcustomtabsnavigationstarted}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -900549201, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback());
    }
}
