package o;

import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdVideoPlaybackListener {
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
    private static final long IEngagementSignalsCallbackStubProxy;
    private static final long IEngagementSignalsCallback_Parcel;
    private static int IPostMessageService = 0;
    private static int IPostMessageServiceDefault = 1;
    private static final long IPostMessageServiceStub;
    private static int IPostMessageServiceStubProxy = 1;
    private static int IPostMessageService_Parcel;
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
    private static final long onExtraCallbackWithResult;
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
    public static final AppLovinAdVideoPlaybackListener onWarmupCompleted = new AppLovinAdVideoPlaybackListener();
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

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = i5 | i3;
        int i8 = ~i3;
        int i9 = ~i4;
        int i10 = ~(i8 | i9);
        int i11 = ~i5;
        int i12 = i10 | (~(i11 | i4));
        int i13 = ~(i9 | i5);
        int i14 = i12 | i13;
        int i15 = (~(i4 | i11 | i3)) | i13;
        int i16 = i5 + i3 + i6 + (1881146393 * i) + ((-1035018111) * i2);
        int i17 = i16 * i16;
        int i18 = ((i5 * (-1924067824)) - 304087040) + ((-1924067824) * i3) + (i7 * (-674303503)) + ((-674303503) * i14) + (674303503 * i15) + (1696595968 * i6) + (1612709888 * i) + ((-182452224) * i2) + ((-1611137024) * i17);
        int i19 = (i5 * (-928100048)) + 945860906 + (i3 * (-928100048)) + (i7 * (-189)) + (i14 * (-189)) + (i15 * 189) + (i6 * (-928100237)) + (i * (-1331189957)) + (i2 * 1329932787) + (i17 * 1550319616);
        switch (i18 + (i19 * i19 * 1690828800)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return access000(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private AppLovinAdVideoPlaybackListener() {
    }

    static {
        deprecated_scheme deprecated_schemeVar = deprecated_scheme.onExtraCallbackWithResult;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.onNavigationEvent());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.onExtraCallbackWithResult());
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(-1694536943, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[]{deprecated_schemeVar}, 1694536945, iOnNavigationEvent)).intValue());
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(-1764790623, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent4, new Object[]{deprecated_schemeVar}, 1764790631, iOnNavigationEvent3)).intValue());
        int iOnNavigationEvent5 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent6 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(-883248806, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent6, new Object[]{deprecated_schemeVar}, 883248817, iOnNavigationEvent5)).intValue());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.onTransact());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.asInterface());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.asBinder());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.IAuthTabCallbackDefault());
        access100 = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.IAuthTabCallbackStub());
        IAuthTabCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.IAuthTabCallback_Parcel());
        access000 = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.access000());
        getInterfaceDescriptor = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.getInterfaceDescriptor());
        IAuthTabCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.access100());
        ICustomTabsCallback = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.IAuthTabCallbackStubProxy());
        extraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.writeTypedObject());
        readTypedObject = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.extraCallback());
        writeTypedObject = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.extraCallbackWithResult());
        extraCallback = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsCallback());
        onMessageChannelReady = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.readTypedObject());
        onActivityLayout = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.onActivityResized());
        int iOnNavigationEvent7 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent8 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onActivityResized = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(-1400360101, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent8, new Object[]{deprecated_schemeVar}, 1400360106, iOnNavigationEvent7)).intValue());
        int iOnNavigationEvent9 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent10 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onMinimized = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(-214575842, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent10, new Object[]{deprecated_schemeVar}, 214575848, iOnNavigationEvent9)).intValue());
        onPostMessage = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.onActivityLayout());
        ICustomTabsCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.onPostMessage());
        onRelationshipValidationResult = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.onUnminimized());
        int iOnNavigationEvent11 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent12 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onUnminimized = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(-1232532670, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent12, new Object[]{deprecated_schemeVar}, 1232532677, iOnNavigationEvent11)).intValue());
        ICustomTabsCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsCallbackStubProxy());
        ICustomTabsCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsCallbackDefault());
        extraCommand = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsCallbackStub());
        mayLaunchUrl = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.extraCommand());
        int iOnNavigationEvent13 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent14 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        ICustomTabsCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(375619882, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent14, new Object[]{deprecated_schemeVar}, -375619873, iOnNavigationEvent13)).intValue());
        isEngagementSignalsApiAvailable = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.isEngagementSignalsApiAvailable());
        ICustomTabsService = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsService());
        prefetch = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsCallback_Parcel());
        newAuthTabSession = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.postMessage());
        newSession = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.newSession());
        postMessage = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.newAuthTabSession());
        newSessionWithExtras = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.newSessionWithExtras());
        int iOnNavigationEvent15 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent16 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        requestPostMessageChannelWithExtras = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(155443711, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent16, new Object[]{deprecated_schemeVar}, -155443708, iOnNavigationEvent15)).intValue());
        requestPostMessageChannel = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.setEngagementSignalsCallback());
        setEngagementSignalsCallback = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.requestPostMessageChannel());
        prefetchWithMultipleUrls = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.requestPostMessageChannelWithExtras());
        receiveFile = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.receiveFile());
        ICustomTabsServiceStub = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.prefetchWithMultipleUrls());
        ICustomTabsServiceDefault = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsServiceDefault());
        warmup = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.validateRelationship());
        updateVisuals = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsServiceStub());
        validateRelationship = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.warmup());
        ICustomTabsService_Parcel = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.updateVisuals());
        access200 = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.access200());
        ICustomTabsServiceStubProxy = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsService_Parcel());
        int iOnNavigationEvent17 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent18 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        writeTypedList = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(-1141198708, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent18, new Object[]{deprecated_schemeVar}, 1141198712, iOnNavigationEvent17)).intValue());
        IEngagementSignalsCallback = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.IEngagementSignalsCallback());
        onVerticalScrollEvent = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.ICustomTabsServiceStubProxy());
        int iOnNavigationEvent19 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent20 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        IEngagementSignalsCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(-1038990432, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent20, new Object[]{deprecated_schemeVar}, 1038990433, iOnNavigationEvent19)).intValue());
        IEngagementSignalsCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.onVerticalScrollEvent());
        onGreatestScrollPercentageIncreased = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.onGreatestScrollPercentageIncreased());
        int iOnNavigationEvent21 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent22 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onSessionEnded = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(1264779151, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent22, new Object[]{deprecated_schemeVar}, -1264779141, iOnNavigationEvent21)).intValue());
        IEngagementSignalsCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.IEngagementSignalsCallbackDefault());
        IEngagementSignalsCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(deprecated_schemeVar.IEngagementSignalsCallback_Parcel());
        int iOnNavigationEvent23 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent24 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        IPostMessageServiceStub = ByteOrderedDataOutputStream.onExtraCallback(((Integer) deprecated_scheme.onNavigationEvent(576170486, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent24, new Object[]{deprecated_schemeVar}, -576170486, iOnNavigationEvent23)).intValue());
        int i = IPostMessageServiceDefault + 25;
        IPostMessageService = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 27;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback;
        int i5 = i3 + 111;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 31;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onExtraCallback;
        int i4 = i3 + 5;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 109;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 103;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 7;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = onNavigationEvent;
        int i5 = i3 + 45;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 5;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact;
        }
        throw null;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 93;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallbackStub;
        int i5 = i3 + 113;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return j;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 73;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = asInterface;
        int i5 = i3 + 21;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 51;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallbackDefault;
        int i5 = i3 + 33;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallbackStub() {
        long j;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 55;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            j = asBinder;
            int i4 = 81 / 0;
        } else {
            j = asBinder;
        }
        int i5 = i2 + 23;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 55;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = access100;
        int i5 = i2 + 41;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long access000() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 35;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 19;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = access000;
        int i5 = i3 + 21;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return j;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 39;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = getInterfaceDescriptor;
        int i4 = i3 + 75;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j);
    }

    public final long IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 83;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallbackStubProxy;
        int i5 = i2 + 119;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 117;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = ICustomTabsCallback;
        int i4 = i3 + 13;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return j;
    }

    public final long readTypedObject() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 61;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallbackWithResult;
        }
        throw null;
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 7;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = readTypedObject;
        int i5 = i3 + 97;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return j;
    }

    public final long extraCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 15;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = writeTypedObject;
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        int i6 = i3 + 85;
        IPostMessageService_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 91;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(extraCallback);
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 71;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = onMessageChannelReady;
        int i5 = i3 + 11;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onActivityLayout() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 33;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onMinimized() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 9;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = onActivityResized;
        int i4 = i3 + 77;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final long onPostMessage() {
        long j;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 5;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            j = onMinimized;
            int i4 = 97 / 0;
        } else {
            j = onMinimized;
        }
        int i5 = i2 + 77;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return j;
    }

    public final long onActivityResized() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 63;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = onPostMessage;
        int i5 = i3 + 89;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return j;
    }

    public final long onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 99;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = ICustomTabsCallbackStub;
        int i5 = i2 + 11;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onUnminimized() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 113;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = onRelationshipValidationResult;
        int i4 = i2 + 49;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 101;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = onUnminimized;
        int i5 = i3 + 21;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 109;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsCallbackDefault;
        int i5 = i3 + 59;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return j;
    }

    public final long ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 73;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 115;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = extraCommand;
        int i5 = i2 + 1;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final long isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 91;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = mayLaunchUrl;
        int i5 = i2 + 79;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 93;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 3;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = isEngagementSignalsApiAvailable;
        int i5 = i2 + 7;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final long ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 93;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsService;
        int i5 = i3 + 13;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ICustomTabsService() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 49;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = prefetch;
        int i5 = i3 + 23;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return j;
    }

    public final long newSession() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 55;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return newAuthTabSession;
        }
        int i3 = 45 / 0;
        return newAuthTabSession;
    }

    public final long postMessage() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 63;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = newSession;
        int i5 = i2 + 111;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long prefetch() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 67;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = postMessage;
        int i4 = i2 + 29;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long newAuthTabSession() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 51;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = newSessionWithExtras;
        int i4 = i3 + 19;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 19;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = requestPostMessageChannelWithExtras;
        int i4 = i2 + 117;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long receiveFile() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 33;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = requestPostMessageChannel;
        int i5 = i3 + 69;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 31;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return setEngagementSignalsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 47;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = prefetchWithMultipleUrls;
        int i5 = i3 + 55;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 79;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(receiveFile);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 63;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsServiceStub;
        }
        int i3 = 63 / 0;
        return ICustomTabsServiceStub;
    }

    public final long warmup() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 3;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsServiceDefault;
        int i5 = i3 + 41;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return j;
    }

    public final long validateRelationship() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 83;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = warmup;
        int i5 = i3 + 41;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 27;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return updateVisuals;
        }
        int i3 = 17 / 0;
        return updateVisuals;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long j;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 85;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            j = validateRelationship;
            int i3 = 97 / 0;
        } else {
            j = validateRelationship;
        }
        return Long.valueOf(j);
    }

    public final long ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 5;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsService_Parcel;
        }
        int i3 = 17 / 0;
        return ICustomTabsService_Parcel;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 115;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = access200;
        int i5 = i3 + 103;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(j);
        }
        int i6 = 9 / 0;
        return Long.valueOf(j);
    }

    public final long ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 85;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsServiceStubProxy;
        if (i4 != 0) {
            int i5 = 66 / 0;
        }
        int i6 = i3 + 109;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 49;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = writeTypedList;
        int i5 = i3 + 99;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long j;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 85;
        IPostMessageServiceStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            j = IEngagementSignalsCallback;
            int i4 = 61 / 0;
        } else {
            j = IEngagementSignalsCallback;
        }
        int i5 = i2 + 35;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 85;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = onVerticalScrollEvent;
        int i5 = i3 + 113;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        int i6 = 45 / 0;
        return Long.valueOf(j);
    }

    public final long IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 21;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IEngagementSignalsCallbackDefault;
        }
        throw null;
    }

    public final long onSessionEnded() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 31;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IEngagementSignalsCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 41;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        long j = onGreatestScrollPercentageIncreased;
        int i5 = i3 + 77;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 63;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        long j = onSessionEnded;
        int i5 = i3 + 123;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 41;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IEngagementSignalsCallbackStubProxy;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 29;
        IPostMessageServiceStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = IEngagementSignalsCallback_Parcel;
        int i4 = i2 + 81;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j);
    }

    public final long IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 69;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IPostMessageServiceStub;
        }
        throw null;
    }

    public final long IAuthTabCallback_Parcel() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, -803525791, iOnWarmupCompleted, 803525791, iOnWarmupCompleted2)).longValue();
    }

    public final long extraCallbackWithResult() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, -844964567, iOnWarmupCompleted, 844964570, iOnWarmupCompleted2)).longValue();
    }

    public final long writeTypedObject() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, -1932474406, iOnWarmupCompleted, 1932474414, iOnWarmupCompleted2)).longValue();
    }

    public final long onRelationshipValidationResult() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, -1461567052, iOnWarmupCompleted, 1461567059, iOnWarmupCompleted2)).longValue();
    }

    public final long extraCommand() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, -360594748, iOnWarmupCompleted, 360594753, iOnWarmupCompleted2)).longValue();
    }

    public final long requestPostMessageChannel() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, 494395829, iOnWarmupCompleted, -494395825, iOnWarmupCompleted2)).longValue();
    }

    public final long updateVisuals() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, -710244353, iOnWarmupCompleted, 710244354, iOnWarmupCompleted2)).longValue();
    }

    public final long ICustomTabsService_Parcel() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, -449878337, iOnWarmupCompleted, 449878347, iOnWarmupCompleted2)).longValue();
    }

    public final long access200() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, 243089643, iOnWarmupCompleted, -243089637, iOnWarmupCompleted2)).longValue();
    }

    public final long IEngagementSignalsCallback() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, 1954118157, iOnWarmupCompleted, -1954118155, iOnWarmupCompleted2)).longValue();
    }

    public final long writeTypedList() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, -509649674, iOnWarmupCompleted, 509649683, iOnWarmupCompleted2)).longValue();
    }

    public final long IEngagementSignalsCallback_Parcel() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, -1015260589, iOnWarmupCompleted, 1015260600, iOnWarmupCompleted2)).longValue();
    }
}
