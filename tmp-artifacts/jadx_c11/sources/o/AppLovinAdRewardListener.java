package o;

import com.google.android.gms.internal.ads.zziea;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdRewardListener {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static final long IAuthTabCallbackStub;
    private static final long IAuthTabCallbackStubProxy;
    private static final long IAuthTabCallback_Parcel;
    private static final long ICustomTabsCallback;
    private static final long ICustomTabsCallbackDefault;
    private static final long ICustomTabsCallbackStub;
    private static final long ICustomTabsCallbackStubProxy;
    private static final long ICustomTabsCallback_Parcel;
    private static final long ICustomTabsService;
    private static final long ICustomTabsServiceDefault;
    private static final long ICustomTabsServiceStub;
    private static final long ICustomTabsServiceStubProxy;
    private static final long ICustomTabsService_Parcel;
    private static final long IEngagementSignalsCallback;
    private static final long IEngagementSignalsCallbackDefault;
    private static final long IEngagementSignalsCallbackStub;
    private static int IEngagementSignalsCallbackStubProxy = 0;
    private static final long IEngagementSignalsCallback_Parcel;
    private static final long IPostMessageService;
    private static final long IPostMessageServiceDefault;
    private static int IPostMessageServiceStub = 1;
    private static int ITrustedWebActivityCallback = 1;
    private static int ITrustedWebActivityCallbackStub;
    private static final long access000;
    private static final long access100;
    private static final long access200;
    private static final long asBinder;
    private static final long asInterface;
    private static final long extraCallback;
    private static final long extraCallbackWithResult;
    private static final long extraCommand;
    private static final long getInterfaceDescriptor;
    private static final long isEngagementSignalsApiAvailable;
    private static final long mayLaunchUrl;
    private static final long newAuthTabSession;
    private static final long newSession;
    private static final long newSessionWithExtras;
    private static final long onActivityLayout;
    private static final long onActivityResized;
    private static final long onExtraCallback;
    public static final AppLovinAdRewardListener onExtraCallbackWithResult = new AppLovinAdRewardListener();
    private static final long onGreatestScrollPercentageIncreased;
    private static final long onMessageChannelReady;
    private static final long onMinimized;
    private static final long onNavigationEvent;
    private static final long onPostMessage;
    private static final long onRelationshipValidationResult;
    private static final long onSessionEnded;
    private static final long onTransact;
    private static final long onUnminimized;
    private static final long onVerticalScrollEvent;
    private static final long onWarmupCompleted;
    private static final long postMessage;
    private static final long prefetch;
    private static final long prefetchWithMultipleUrls;
    private static final long readTypedObject;
    private static final long receiveFile;
    private static final long requestPostMessageChannel;
    private static final long requestPostMessageChannelWithExtras;
    private static final long setEngagementSignalsCallback;
    private static final long updateVisuals;
    private static final long validateRelationship;
    private static final long warmup;
    private static final long writeTypedList;
    private static final long writeTypedObject;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i7 | i6)) | (~(i8 | i6));
        int i10 = ~(i3 | i7);
        int i11 = i6 | i10 | (~(i8 | i5));
        int i12 = i6 + i5 + i + ((-393945980) * i2) + (1728320405 * i4);
        int i13 = i12 * i12;
        int i14 = ((-1552544754) * i6) + 1566572544 + ((-1100352524) * i5) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i) + (2076180480 * i2) + ((-877658112) * i4) + (214302720 * i13);
        int i15 = ((i6 * (-252835662)) - 192251156) + (i5 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * 493) + (i * (-252835169)) + (i2 * 1574575612) + (i4 * 147979147) + (i13 * (-1426456576));
        switch (i14 + (i15 * i15 * 2075787264)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                int i16 = 2 % 2;
                int i17 = ITrustedWebActivityCallbackStub;
                int i18 = i17 + 99;
                ITrustedWebActivityCallback = i18 % 128;
                int i19 = i18 % 2;
                long j = onGreatestScrollPercentageIncreased;
                int i20 = i17 + 7;
                ITrustedWebActivityCallback = i20 % 128;
                int i21 = i20 % 2;
                return Long.valueOf(j);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                int i22 = 2 % 2;
                int i23 = ITrustedWebActivityCallback;
                int i24 = i23 + 117;
                ITrustedWebActivityCallbackStub = i24 % 128;
                int i25 = i24 % 2;
                long j2 = access100;
                int i26 = i23 + 65;
                ITrustedWebActivityCallbackStub = i26 % 128;
                int i27 = i26 % 2;
                return Long.valueOf(j2);
            case 9:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private AppLovinAdRewardListener() {
    }

    static {
        matchesCertificate matchescertificate = matchesCertificate.onExtraCallback;
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.IAuthTabCallback());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onWarmupCompleted());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onExtraCallbackWithResult());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(852185404, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -852185404, zziea.IAuthTabCallback())).intValue());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(4480084, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -4480081, zziea.IAuthTabCallback())).intValue());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(-1154541144, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), 1154541154, zziea.IAuthTabCallback())).intValue());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onTransact());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.IAuthTabCallbackStub());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.IAuthTabCallbackDefault());
        access100 = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.asInterface());
        access000 = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.IAuthTabCallback_Parcel());
        getInterfaceDescriptor = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.getInterfaceDescriptor());
        IAuthTabCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.access000());
        IAuthTabCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.IAuthTabCallbackStubProxy());
        writeTypedObject = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.access100());
        extraCallback = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.extraCallbackWithResult());
        readTypedObject = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.ICustomTabsCallback());
        ICustomTabsCallback = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.readTypedObject());
        extraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.writeTypedObject());
        onMinimized = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.extraCallback());
        onMessageChannelReady = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(1289421147, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -1289421142, zziea.IAuthTabCallback())).intValue());
        onActivityLayout = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onMessageChannelReady());
        onPostMessage = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onPostMessage());
        onActivityResized = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onActivityLayout());
        ICustomTabsCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onActivityResized());
        onUnminimized = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onRelationshipValidationResult());
        onRelationshipValidationResult = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(502782979, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -502782975, zziea.IAuthTabCallback())).intValue());
        ICustomTabsCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.ICustomTabsCallbackStubProxy());
        ICustomTabsCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(291130025, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -291130016, zziea.IAuthTabCallback())).intValue());
        mayLaunchUrl = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.ICustomTabsCallbackDefault());
        isEngagementSignalsApiAvailable = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.extraCommand());
        ICustomTabsCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(248636741, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -248636735, zziea.IAuthTabCallback())).intValue());
        ICustomTabsService = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.ICustomTabsCallback_Parcel());
        extraCommand = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.ICustomTabsService());
        prefetch = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.mayLaunchUrl());
        newSessionWithExtras = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.postMessage());
        newSession = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.newSessionWithExtras());
        newAuthTabSession = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.newSession());
        postMessage = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.prefetch());
        prefetchWithMultipleUrls = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.newAuthTabSession());
        receiveFile = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.requestPostMessageChannel());
        requestPostMessageChannelWithExtras = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(1153941994, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -1153941986, zziea.IAuthTabCallback())).intValue());
        setEngagementSignalsCallback = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.receiveFile());
        requestPostMessageChannel = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.requestPostMessageChannelWithExtras());
        warmup = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.setEngagementSignalsCallback());
        updateVisuals = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.ICustomTabsServiceDefault());
        ICustomTabsServiceStub = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.updateVisuals());
        validateRelationship = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.ICustomTabsServiceStub());
        ICustomTabsServiceDefault = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.validateRelationship());
        ICustomTabsServiceStubProxy = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.warmup());
        IEngagementSignalsCallback = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.IEngagementSignalsCallback());
        ICustomTabsService_Parcel = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.ICustomTabsServiceStubProxy());
        writeTypedList = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.writeTypedList());
        access200 = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(459031995, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -459031984, zziea.IAuthTabCallback())).intValue());
        onGreatestScrollPercentageIncreased = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(-732099465, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), 732099466, zziea.IAuthTabCallback())).intValue());
        onVerticalScrollEvent = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onSessionEnded());
        onSessionEnded = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.onVerticalScrollEvent());
        IEngagementSignalsCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.IEngagementSignalsCallbackStub());
        IEngagementSignalsCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(118379487, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -118379480, zziea.IAuthTabCallback())).intValue());
        IPostMessageService = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.IEngagementSignalsCallbackDefault());
        IPostMessageServiceDefault = ByteOrderedDataOutputStream.onExtraCallback(matchescertificate.IEngagementSignalsCallback_Parcel());
        IEngagementSignalsCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(((Integer) matchesCertificate.onNavigationEvent(363530439, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{matchescertificate}, zziea.IAuthTabCallback(), -363530437, zziea.IAuthTabCallback())).intValue());
        int i = IPostMessageServiceStub + 69;
        IEngagementSignalsCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 123;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        long j = onNavigationEvent;
        int i5 = i3 + 73;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 9;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback;
        int i5 = i2 + 81;
        ITrustedWebActivityCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 21;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = onWarmupCompleted;
        int i4 = i3 + 103;
        ITrustedWebActivityCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 17;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onExtraCallback;
        int i4 = i3 + 63;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 11;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        long j = asBinder;
        int i5 = i3 + 21;
        ITrustedWebActivityCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback;
        int i3 = i2 + 47;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = asInterface;
        int i5 = i2 + 15;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 45;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub;
        }
        throw null;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback;
        int i3 = i2 + 13;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallbackDefault;
        int i5 = i2 + 43;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 77;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = onTransact;
        int i5 = i2 + 35;
        ITrustedWebActivityCallback = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final long IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 19;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        int i4 = i2 % 2;
        long j = access000;
        int i5 = i3 + 9;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 75;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return getInterfaceDescriptor;
        }
        int i3 = 18 / 0;
        return getInterfaceDescriptor;
    }

    public final long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 85;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback_Parcel;
        int i5 = i3 + 39;
        ITrustedWebActivityCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long access000() {
        long j;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback;
        int i3 = i2 + 3;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            j = IAuthTabCallbackStubProxy;
            int i4 = 15 / 0;
        } else {
            j = IAuthTabCallbackStubProxy;
        }
        int i5 = i2 + 119;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 75;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject;
        }
        throw null;
    }

    public final long extraCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 53;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = extraCallback;
        int i5 = i2 + 71;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long writeTypedObject() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 125;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = readTypedObject;
        int i5 = i2 + 79;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 79;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 111;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        int i4 = i2 % 2;
        long j = extraCallbackWithResult;
        int i5 = i3 + 77;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long readTypedObject() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 7;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onMinimized;
        }
        int i3 = 35 / 0;
        return onMinimized;
    }

    public final long onMinimized() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 117;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        long j = onMessageChannelReady;
        if (i4 != 0) {
            int i5 = 77 / 0;
        }
        int i6 = i3 + 73;
        ITrustedWebActivityCallback = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final long onPostMessage() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback;
        int i3 = i2 + 125;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = onActivityLayout;
        int i5 = i2 + 63;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 87;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(onPostMessage);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 31;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        int i4 = i2 % 2;
        long j = onActivityResized;
        int i5 = i3 + 115;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onActivityLayout() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 57;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = ICustomTabsCallbackStub;
        int i4 = i3 + 7;
        ITrustedWebActivityCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 69;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        long j = onUnminimized;
        if (i4 != 0) {
            int i5 = 5 / 0;
        }
        int i6 = i3 + 125;
        ITrustedWebActivityCallback = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final long ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 123;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        int i4 = i2 % 2;
        long j = onRelationshipValidationResult;
        int i5 = i3 + 115;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onUnminimized() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 3;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallbackDefault;
        }
        throw null;
    }

    public final long ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 121;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = ICustomTabsCallbackStubProxy;
        int i5 = i2 + 67;
        ITrustedWebActivityCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 117;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = mayLaunchUrl;
        int i5 = i2 + 81;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback;
        int i3 = i2 + 105;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = isEngagementSignalsApiAvailable;
        int i5 = i2 + 125;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 45;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(ICustomTabsCallback_Parcel);
        }
        throw null;
    }

    public final long ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 49;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsService;
        int i5 = i3 + 29;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 71;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(extraCommand);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long extraCommand() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 71;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = prefetch;
        int i5 = i2 + 105;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long newAuthTabSession() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 23;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        long j = newSessionWithExtras;
        int i5 = i3 + 61;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 85;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(newSession);
        }
        throw null;
    }

    public final long postMessage() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback;
        int i3 = i2 + 11;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = newAuthTabSession;
        int i5 = i2 + 37;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 85;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        int i4 = i2 % 2;
        long j = postMessage;
        int i5 = i3 + 31;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 61;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(prefetchWithMultipleUrls);
        }
        throw null;
    }

    public final long requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 11;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return receiveFile;
        }
        int i3 = 20 / 0;
        return receiveFile;
    }

    public final long prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 79;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = requestPostMessageChannelWithExtras;
        int i5 = i2 + 17;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return j;
    }

    public final long receiveFile() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 109;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = setEngagementSignalsCallback;
        int i5 = i2 + 61;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return j;
    }

    public final long setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 3;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = requestPostMessageChannel;
        int i5 = i2 + 67;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 3;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = warmup;
        int i4 = i3 + 99;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 65;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        int i4 = i2 % 2;
        long j = updateVisuals;
        int i5 = i3 + 83;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final long ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 89;
        ITrustedWebActivityCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = ICustomTabsServiceStub;
        int i4 = i2 + 99;
        ITrustedWebActivityCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 121;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        int i4 = i2 % 2;
        long j = validateRelationship;
        int i5 = i3 + 31;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final long ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback;
        int i3 = i2 + 77;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = ICustomTabsServiceDefault;
        int i5 = i2 + 23;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long validateRelationship() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 69;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsServiceStubProxy;
        if (i4 == 0) {
            int i5 = 93 / 0;
        }
        int i6 = i3 + 73;
        ITrustedWebActivityCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final long access200() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback;
        int i3 = i2 + 77;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = IEngagementSignalsCallback;
        int i5 = i2 + 33;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 109;
        ITrustedWebActivityCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsService_Parcel;
        }
        int i3 = 92 / 0;
        return ICustomTabsService_Parcel;
    }

    public final long ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback;
        int i3 = i2 + 57;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = writeTypedList;
        int i4 = i2 + 123;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return j;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 123;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        long j = access200;
        int i5 = i3 + 75;
        ITrustedWebActivityCallback = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final long onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 27;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        long j = onVerticalScrollEvent;
        int i5 = i3 + 123;
        ITrustedWebActivityCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IEngagementSignalsCallbackStub() {
        long j;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 87;
        ITrustedWebActivityCallback = i3 % 128;
        if (i3 % 2 == 0) {
            j = onSessionEnded;
            int i4 = 99 / 0;
        } else {
            j = onSessionEnded;
        }
        int i5 = i2 + 5;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return j;
    }

    public final long onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 3;
        ITrustedWebActivityCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = IEngagementSignalsCallbackStub;
        int i5 = i2 + 119;
        ITrustedWebActivityCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 69;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        long j = IEngagementSignalsCallbackDefault;
        int i5 = i3 + 31;
        ITrustedWebActivityCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onSessionEnded() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 55;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return IPostMessageService;
        }
        throw null;
    }

    public final long IPostMessageService() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 41;
        ITrustedWebActivityCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = IPostMessageServiceDefault;
        int i4 = i2 + 31;
        ITrustedWebActivityCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback + 103;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return IEngagementSignalsCallback_Parcel;
        }
        int i3 = 22 / 0;
        return IEngagementSignalsCallback_Parcel;
    }

    public final long asInterface() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -295862787, 295862794, new Object[]{this})).longValue();
    }

    public final long IAuthTabCallbackStub() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1464128911, -1464128903, new Object[]{this})).longValue();
    }

    public final long onActivityResized() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 877756528, -877756518, new Object[]{this})).longValue();
    }

    public final long ICustomTabsCallbackStubProxy() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1138741354, -1138741351, new Object[]{this})).longValue();
    }

    public final long ICustomTabsService() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1620974811, 1620974816, new Object[]{this})).longValue();
    }

    public final long isEngagementSignalsApiAvailable() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -619771457, 619771461, new Object[]{this})).longValue();
    }

    public final long prefetch() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 746582986, -746582986, new Object[]{this})).longValue();
    }

    public final long newSession() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1539836845, 1539836846, new Object[]{this})).longValue();
    }

    public final long warmup() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 811209426, -811209415, new Object[]{this})).longValue();
    }

    public final long updateVisuals() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -150235219, 150235228, new Object[]{this})).longValue();
    }

    public final long IEngagementSignalsCallback() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1749204687, -1749204681, new Object[]{this})).longValue();
    }

    public final long writeTypedList() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Long) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -59582777, 59582779, new Object[]{this})).longValue();
    }
}
