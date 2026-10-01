package o;

import android.graphics.Color;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_scheme {
    private static final int IAuthTabCallbackDefault;
    private static final int IAuthTabCallbackStub;
    private static final int IAuthTabCallbackStubProxy;
    private static final int IAuthTabCallback_Parcel;
    private static final int ICustomTabsCallback;
    private static final int ICustomTabsCallbackDefault;
    private static final int ICustomTabsCallbackStub;
    private static final int ICustomTabsCallbackStubProxy;
    private static final int ICustomTabsCallback_Parcel;
    private static final int ICustomTabsService;
    private static final int ICustomTabsServiceDefault;
    private static final int ICustomTabsServiceStub;
    private static final int ICustomTabsServiceStubProxy;
    private static final int ICustomTabsService_Parcel;
    private static final int IEngagementSignalsCallback;
    private static final int IEngagementSignalsCallbackDefault;
    private static final int IEngagementSignalsCallbackStub;
    private static final int IEngagementSignalsCallbackStubProxy;
    private static final int IEngagementSignalsCallback_Parcel;
    private static int IPostMessageService = 1;
    private static final int IPostMessageServiceDefault;
    private static int IPostMessageServiceStub = 0;
    private static int IPostMessageServiceStubProxy = 0;
    private static int ITrustedWebActivityCallbackDefault = 1;
    private static final int access000;
    private static final int access100;
    private static final int access200;
    private static final int asBinder;
    private static final int asInterface;
    private static final int extraCallback;
    private static final int extraCallbackWithResult;
    private static final int extraCommand;
    private static final int getInterfaceDescriptor;
    private static final int isEngagementSignalsApiAvailable;
    private static final int mayLaunchUrl;
    private static final int newAuthTabSession;
    private static final int newSession;
    private static final int newSessionWithExtras;
    private static final int onActivityLayout;
    private static final int onActivityResized;
    private static final int onGreatestScrollPercentageIncreased;
    private static final int onMessageChannelReady;
    private static final int onMinimized;
    private static final int onPostMessage;
    private static final int onRelationshipValidationResult;
    private static final int onSessionEnded;
    private static final int onTransact;
    private static final int onUnminimized;
    private static final int onVerticalScrollEvent;
    private static final int postMessage;
    private static final int prefetch;
    private static final int prefetchWithMultipleUrls;
    private static final int readTypedObject;
    private static final int receiveFile;
    private static final int requestPostMessageChannel;
    private static final int requestPostMessageChannelWithExtras;
    private static final int setEngagementSignalsCallback;
    private static final int updateVisuals;
    private static final int validateRelationship;
    private static final int warmup;
    private static final int writeTypedList;
    private static final int writeTypedObject;
    public static final deprecated_scheme onExtraCallbackWithResult = new deprecated_scheme();
    private static final int IAuthTabCallback = Color.rgb(255, 255, 255);
    private static final int onWarmupCompleted = Color.argb(51, 0, 0, 0);
    private static final int onExtraCallback = Color.rgb(255, 255, 255);
    private static final int onNavigationEvent = Color.rgb(255, 255, 255);

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~(i | i5 | i6);
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = ~i6;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i + i5 + i4 + (105149790 * i3) + ((-719480883) * i2);
        int i15 = i14 * i14;
        int i16 = (i * (-424837635)) + 281018368 + ((-424837635) * i5) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i4) + ((-654311424) * i3) + (1702887424 * i2) + ((-155189248) * i15);
        int i17 = (i * 910058005) + 1460508013 + (i5 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i4 * 910058489) + (i3 * (-759332242)) + (i2 * (-1121784475)) + (i15 * 1086324736);
        switch (i16 + (i17 * i17 * (-1925185536))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                int i18 = 2 % 2;
                int i19 = ITrustedWebActivityCallbackDefault;
                int i20 = i19 + 11;
                IPostMessageServiceStubProxy = i20 % 128;
                int i21 = i20 % 2;
                int i22 = ICustomTabsCallbackStub;
                int i23 = i19 + 113;
                IPostMessageServiceStubProxy = i23 % 128;
                int i24 = i23 % 2;
                return Integer.valueOf(i22);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return access000(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private deprecated_scheme() {
    }

    static {
        charset charsetVar = charset.onExtraCallbackWithResult;
        asInterface = charsetVar.ICustomTabsService().IAuthTabCallback();
        onTransact = charsetVar.setEngagementSignalsCallback().IAuthTabCallback();
        IAuthTabCallbackStub = charsetVar.prefetchWithMultipleUrls().IAuthTabCallback();
        asBinder = charsetVar.asBinder().IAuthTabCallback();
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        IAuthTabCallbackDefault = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -111968868, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 111968881, iOnWarmupCompleted, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        IAuthTabCallback_Parcel = charsetVar.asBinder().IAuthTabCallback();
        access000 = charsetVar.getInterfaceDescriptor().IAuthTabCallback();
        access100 = charsetVar.IAuthTabCallbackDefault().IAuthTabCallback();
        IAuthTabCallbackStubProxy = charsetVar.getInterfaceDescriptor().IAuthTabCallback();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        getInterfaceDescriptor = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -111968868, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 111968881, iOnWarmupCompleted2, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        extraCallbackWithResult = charsetVar.areNotificationsEnabled().IAuthTabCallback();
        writeTypedObject = charsetVar.notifyNotificationWithChannel().IAuthTabCallback();
        readTypedObject = charsetVar.getSmallIconBitmap().IAuthTabCallback();
        extraCallback = charsetVar.notifyNotificationWithChannel().IAuthTabCallback();
        int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        ICustomTabsCallback = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 211560524, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -211560517, iOnWarmupCompleted3, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        onPostMessage = charsetVar.requestPostMessageChannelWithExtras().IAuthTabCallback();
        onActivityResized = charsetVar.AudioAttributesImplApi21Parcelizer().IAuthTabCallback();
        int iOnWarmupCompleted4 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onActivityLayout = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -322673163, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 322673179, iOnWarmupCompleted4, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        onMessageChannelReady = charsetVar.newSession().IAuthTabCallback();
        onMinimized = charsetVar.requestPostMessageChannelWithExtras().IAuthTabCallback();
        ICustomTabsCallbackDefault = charsetVar.prefetchWithMultipleUrls().IAuthTabCallback();
        onUnminimized = charsetVar.requestPostMessageChannelWithExtras().IAuthTabCallback();
        ICustomTabsCallbackStub = charsetVar.onPostMessage().IAuthTabCallback();
        ICustomTabsCallbackStubProxy = charsetVar.onMessageChannelReady().IAuthTabCallback();
        onRelationshipValidationResult = charsetVar.ICustomTabsCallbackDefault().IAuthTabCallback();
        extraCommand = charsetVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM().IAuthTabCallback();
        ICustomTabsCallback_Parcel = charsetVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().IAuthTabCallback();
        ICustomTabsService = charsetVar.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0().IAuthTabCallback();
        mayLaunchUrl = charsetVar.IAuthTabCallbackDefault().IAuthTabCallback();
        isEngagementSignalsApiAvailable = charsetVar.getSmallIconBitmap().IAuthTabCallback();
        newSession = charsetVar.AudioAttributesImplApi21Parcelizer().IAuthTabCallback();
        prefetch = charsetVar.AudioAttributesImplApi21Parcelizer().IAuthTabCallback();
        newAuthTabSession = charsetVar.writeTypedList().IAuthTabCallback();
        postMessage = charsetVar.warmup().IAuthTabCallback();
        newSessionWithExtras = charsetVar.ICustomTabsServiceDefault().IAuthTabCallback();
        requestPostMessageChannel = charsetVar.updateVisuals().IAuthTabCallback();
        prefetchWithMultipleUrls = charsetVar.onMessageChannelReady().IAuthTabCallback();
        requestPostMessageChannelWithExtras = charsetVar.validateRelationship().IAuthTabCallback();
        int iOnWarmupCompleted5 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        receiveFile = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1621030900, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1621030898, iOnWarmupCompleted5, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        setEngagementSignalsCallback = charsetVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4().IAuthTabCallback();
        ICustomTabsServiceStub = charsetVar.requestPostMessageChannelWithExtras().IAuthTabCallback();
        updateVisuals = charsetVar.prefetchWithMultipleUrls().IAuthTabCallback();
        warmup = charsetVar.setEngagementSignalsCallback().IAuthTabCallback();
        int iOnWarmupCompleted6 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        ICustomTabsServiceDefault = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1621030900, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1621030898, iOnWarmupCompleted6, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        validateRelationship = charsetVar.prefetchWithMultipleUrls().IAuthTabCallback();
        ICustomTabsServiceStubProxy = charsetVar.prefetchWithMultipleUrls().IAuthTabCallback();
        ICustomTabsService_Parcel = charsetVar.IAuthTabCallbackDefault().IAuthTabCallback();
        writeTypedList = charsetVar.getSmallIconBitmap().IAuthTabCallback();
        IEngagementSignalsCallback = charsetVar.AudioAttributesImplApi21Parcelizer().IAuthTabCallback();
        access200 = charsetVar.AudioAttributesImplApi21Parcelizer().IAuthTabCallback();
        int iOnWarmupCompleted7 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        IEngagementSignalsCallbackStub = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, iOnWarmupCompleted7, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        IEngagementSignalsCallbackDefault = charsetVar.access200().IAuthTabCallback();
        onSessionEnded = charsetVar.validateRelationship().IAuthTabCallback();
        onVerticalScrollEvent = charsetVar.warmup().IAuthTabCallback();
        onGreatestScrollPercentageIncreased = charsetVar.receiveFile().IAuthTabCallback();
        IEngagementSignalsCallback_Parcel = charsetVar.onMessageChannelReady().IAuthTabCallback();
        IEngagementSignalsCallbackStubProxy = charsetVar.updateVisuals().IAuthTabCallback();
        IPostMessageServiceDefault = charsetVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4().IAuthTabCallback();
        int i = IPostMessageServiceStub + 109;
        IPostMessageService = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 123;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackDefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback;
        int i5 = i3 + 43;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 113;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 43;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = onExtraCallback;
        int i5 = i3 + 87;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(i4);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 27;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent;
        if (i3 != 0) {
            int i5 = 58 / 0;
        }
        return Integer.valueOf(i4);
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 73;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = asInterface;
        int i6 = i3 + 63;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault;
        int i3 = i2 + 113;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onTransact;
        int i6 = i2 + 49;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 20 / 0;
        }
        return i5;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 35;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub;
        }
        throw null;
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 61;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = asBinder;
        int i6 = i3 + 73;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 21;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i5 = 54 / 0;
        }
        return i4;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 49;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = IAuthTabCallback_Parcel;
        if (i3 == 0) {
            int i5 = 77 / 0;
        }
        return i4;
    }

    public final int IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault;
        int i3 = i2 + 33;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = access000;
        int i6 = i2 + 65;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int access000() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 99;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = access100;
        int i5 = i3 + 49;
        ITrustedWebActivityCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getInterfaceDescriptor() {
        int i;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackDefault;
        int i4 = i3 + 47;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            i = IAuthTabCallbackStubProxy;
            int i5 = 98 / 0;
        } else {
            i = IAuthTabCallbackStubProxy;
        }
        int i6 = i3 + 21;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final int access100() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 33;
        ITrustedWebActivityCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = getInterfaceDescriptor;
        int i6 = i2 + 25;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 103;
        ITrustedWebActivityCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = extraCallbackWithResult;
        int i6 = i2 + 3;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int writeTypedObject() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 79;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int extraCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 5;
        ITrustedWebActivityCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = readTypedObject;
        int i5 = i2 + 29;
        ITrustedWebActivityCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return i4;
    }

    public final int extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 11;
        ITrustedWebActivityCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = extraCallback;
        int i6 = i2 + 121;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 90 / 0;
        }
        return i5;
    }

    public final int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 117;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback;
        int i5 = i3 + 97;
        ITrustedWebActivityCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int readTypedObject() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 55;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onActivityResized() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 123;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = onActivityResized;
        int i6 = i3 + 49;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 74 / 0;
        }
        return i5;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy;
        int i4 = i3 + 47;
        ITrustedWebActivityCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            i = onActivityLayout;
            int i5 = 10 / 0;
        } else {
            i = onActivityLayout;
        }
        int i6 = i3 + 117;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 75;
        ITrustedWebActivityCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onMessageChannelReady;
        int i6 = i2 + 121;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    public final int onActivityLayout() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 55;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onMinimized;
        }
        throw null;
    }

    public final int onPostMessage() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 87;
        ITrustedWebActivityCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ICustomTabsCallbackDefault;
        int i6 = i2 + 69;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onUnminimized() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 27;
        ITrustedWebActivityCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onUnminimized;
        int i6 = i2 + 49;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault;
        int i3 = i2 + 51;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ICustomTabsCallbackStubProxy;
        int i6 = i2 + 101;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault;
        int i3 = i2 + 87;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onRelationshipValidationResult;
        int i6 = i2 + 63;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 125;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCommand;
        }
        int i3 = 2 / 0;
        return extraCommand;
    }

    public final int extraCommand() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 35;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallback_Parcel;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 77;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ICustomTabsService;
        if (i3 == 0) {
            int i5 = 99 / 0;
        }
        return Integer.valueOf(i4);
    }

    public final int isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 31;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return mayLaunchUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int ICustomTabsService() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 115;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return isEngagementSignalsApiAvailable;
        }
        throw null;
    }

    public final int ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 99;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return newSession;
        }
        throw null;
    }

    public final int postMessage() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 13;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return prefetch;
        }
        throw null;
    }

    public final int newSession() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 47;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = newAuthTabSession;
        if (i3 != 0) {
            int i5 = 60 / 0;
        }
        return i4;
    }

    public final int newAuthTabSession() {
        int i;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackDefault + 19;
        int i4 = i3 % 128;
        IPostMessageServiceStubProxy = i4;
        if (i3 % 2 != 0) {
            i = postMessage;
            int i5 = 22 / 0;
        } else {
            i = postMessage;
        }
        int i6 = i4 + 9;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 31 / 0;
        }
        return i;
    }

    public final int newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault;
        int i3 = i2 + 113;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = newSessionWithExtras;
        int i6 = i2 + 79;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy + 95;
        int i4 = i3 % 128;
        ITrustedWebActivityCallbackDefault = i4;
        if (i3 % 2 == 0) {
            i = requestPostMessageChannel;
            int i5 = 71 / 0;
        } else {
            i = requestPostMessageChannel;
        }
        int i6 = i4 + 19;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i);
    }

    public final int setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 113;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = prefetchWithMultipleUrls;
        int i6 = i3 + 37;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 27 / 0;
        }
        return i5;
    }

    public final int requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 41;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = requestPostMessageChannelWithExtras;
        if (i3 == 0) {
            int i5 = 7 / 0;
        }
        return i4;
    }

    public final int requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 87;
        ITrustedWebActivityCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = receiveFile;
        int i6 = i2 + 125;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int receiveFile() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 19;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackDefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = setEngagementSignalsCallback;
        int i5 = i3 + 91;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return i4;
    }

    public final int prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 53;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsServiceStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 69;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = updateVisuals;
        int i5 = i3 + 83;
        ITrustedWebActivityCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int validateRelationship() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 49;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return warmup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 99;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = ICustomTabsServiceDefault;
        int i6 = i3 + 5;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int warmup() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault;
        int i3 = i2 + 71;
        IPostMessageServiceStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = validateRelationship;
        int i5 = i2 + 91;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int updateVisuals() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 95;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = ICustomTabsServiceStubProxy;
        int i6 = i3 + 37;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int access200() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 121;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = ICustomTabsService_Parcel;
        int i5 = i3 + 29;
        ITrustedWebActivityCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final int ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault;
        int i3 = i2 + 29;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = writeTypedList;
        int i6 = i2 + 89;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 55;
        ITrustedWebActivityCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return Integer.valueOf(IEngagementSignalsCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 27;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = access200;
        int i5 = i3 + 63;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 19;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IEngagementSignalsCallbackStub;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy + 1;
        int i4 = i3 % 128;
        ITrustedWebActivityCallbackDefault = i4;
        if (i3 % 2 == 0) {
            i = IEngagementSignalsCallbackDefault;
            int i5 = 78 / 0;
        } else {
            i = IEngagementSignalsCallbackDefault;
        }
        int i6 = i4 + 31;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(i);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 99;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = onSessionEnded;
        int i6 = i3 + 83;
        ITrustedWebActivityCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 113;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onVerticalScrollEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 25;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onGreatestScrollPercentageIncreased;
        int i5 = i3 + 89;
        ITrustedWebActivityCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(i4);
        }
        throw null;
    }

    public final int IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 1;
        ITrustedWebActivityCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IEngagementSignalsCallback_Parcel;
        int i5 = i2 + 19;
        ITrustedWebActivityCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault;
        int i3 = i2 + 7;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = IEngagementSignalsCallbackStubProxy;
        int i6 = i2 + 25;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 54 / 0;
        }
        return i5;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackDefault + 7;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = IPostMessageServiceDefault;
        int i5 = i3 + 115;
        ITrustedWebActivityCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(i4);
    }

    public final int onExtraCallback() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(-1694536943, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 1694536945, iOnNavigationEvent)).intValue();
    }

    public final int onWarmupCompleted() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(-1764790623, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 1764790631, iOnNavigationEvent)).intValue();
    }

    public final int IAuthTabCallback() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(-883248806, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 883248817, iOnNavigationEvent)).intValue();
    }

    public final int onMinimized() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(-1400360101, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 1400360106, iOnNavigationEvent)).intValue();
    }

    public final int onMessageChannelReady() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(-214575842, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 214575848, iOnNavigationEvent)).intValue();
    }

    public final int onRelationshipValidationResult() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(-1232532670, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 1232532677, iOnNavigationEvent)).intValue();
    }

    public final int mayLaunchUrl() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(375619882, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, -375619873, iOnNavigationEvent)).intValue();
    }

    public final int prefetch() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(155443711, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, -155443708, iOnNavigationEvent)).intValue();
    }

    public final int writeTypedList() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(-1141198708, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 1141198712, iOnNavigationEvent)).intValue();
    }

    public final int onSessionEnded() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(-1038990432, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 1038990433, iOnNavigationEvent)).intValue();
    }

    public final int IEngagementSignalsCallbackStub() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(1264779151, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, -1264779141, iOnNavigationEvent)).intValue();
    }

    public final int IPostMessageService() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Integer) onNavigationEvent(576170486, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, -576170486, iOnNavigationEvent)).intValue();
    }
}
