package o;

import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerCmpNetworksListActivity {
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
    private static int ICustomTabsServiceStub = 0;
    private static final long access000;
    private static final long access100;
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
    public static final MaxDebuggerCmpNetworksListActivity onExtraCallbackWithResult = new MaxDebuggerCmpNetworksListActivity();
    private static final long onMessageChannelReady;
    private static final long onMinimized;
    private static final long onNavigationEvent;
    private static final long onPostMessage;
    private static final long onRelationshipValidationResult;
    private static final long onTransact;
    private static final long onUnminimized;
    private static final long onWarmupCompleted;
    private static final long postMessage;
    private static final long prefetch;
    private static final long prefetchWithMultipleUrls;
    private static final long readTypedObject;
    private static final long receiveFile;
    private static final long requestPostMessageChannel;
    private static final long requestPostMessageChannelWithExtras;
    private static final long setEngagementSignalsCallback;
    private static int updateVisuals = 0;
    private static int validateRelationship = 1;
    private static int warmup = 1;
    private static final long writeTypedObject;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i4 | i6);
        int i9 = (~((~i6) | i4)) | (~(i4 | i3));
        int i10 = i4 + i3 + i2 + (32217706 * i) + (238734613 * i5);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i4) - 528416768) + (677943110 * i3) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i2) + ((-154927104) * i) + ((-131989504) * i5) + ((-1876361216) * i11);
        int i13 = ((i4 * 1127137324) - 440746823) + (i3 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i2 * 1127136485) + (i * 976419026) + (i5 * 1106960329) + (i11 * 279773184);
        switch (i12 + (i13 * i13 * (-1943076864))) {
            case 1:
                int i14 = 2 % 2;
                int i15 = ICustomTabsServiceStub + 103;
                int i16 = i15 % 128;
                warmup = i16;
                int i17 = i15 % 2;
                long j = newAuthTabSession;
                int i18 = i16 + 25;
                ICustomTabsServiceStub = i18 % 128;
                int i19 = i18 % 2;
                return Long.valueOf(j);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return asBinder(objArr);
            default:
                int i20 = 2 % 2;
                int i21 = warmup + 35;
                int i22 = i21 % 128;
                ICustomTabsServiceStub = i22;
                int i23 = i21 % 2;
                long j2 = IAuthTabCallbackStubProxy;
                int i24 = i22 + 75;
                warmup = i24 % 128;
                int i25 = i24 % 2;
                return Long.valueOf(j2);
        }
    }

    private MaxDebuggerCmpNetworksListActivity() {
    }

    static {
        shouldCustomTabsTrackEvents shouldcustomtabstrackevents = shouldCustomTabsTrackEvents.onExtraCallback;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onWarmupCompleted());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onExtraCallbackWithResult());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.IAuthTabCallback());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onNavigationEvent());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onExtraCallback());
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(((Integer) shouldCustomTabsTrackEvents.onWarmupCompleted(-1680285504, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1680285511, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{shouldcustomtabstrackevents})).intValue());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.asInterface());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onTransact());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.IAuthTabCallbackDefault());
        access100 = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.IAuthTabCallbackStub());
        IAuthTabCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.getInterfaceDescriptor());
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        getInterfaceDescriptor = ByteOrderedDataOutputStream.onExtraCallback(((Integer) shouldCustomTabsTrackEvents.onWarmupCompleted(1443361546, iOnWarmupCompleted3, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1443361545, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted4, new Object[]{shouldcustomtabstrackevents})).intValue());
        access000 = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.IAuthTabCallbackStubProxy());
        IAuthTabCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.access000());
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        readTypedObject = ByteOrderedDataOutputStream.onExtraCallback(((Integer) shouldCustomTabsTrackEvents.onWarmupCompleted(-1187185855, iOnWarmupCompleted5, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1187185857, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted6, new Object[]{shouldcustomtabstrackevents})).intValue());
        writeTypedObject = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.ICustomTabsCallback());
        ICustomTabsCallback = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.extraCallbackWithResult());
        extraCallback = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.extraCallback());
        int iOnWarmupCompleted7 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted8 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        extraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(((Integer) shouldCustomTabsTrackEvents.onWarmupCompleted(1987787108, iOnWarmupCompleted7, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1987787103, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted8, new Object[]{shouldcustomtabstrackevents})).intValue());
        int iOnWarmupCompleted9 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted10 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onActivityLayout = ByteOrderedDataOutputStream.onExtraCallback(((Integer) shouldCustomTabsTrackEvents.onWarmupCompleted(-1502818637, iOnWarmupCompleted9, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1502818641, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted10, new Object[]{shouldcustomtabstrackevents})).intValue());
        onMessageChannelReady = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onMessageChannelReady());
        onMinimized = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onActivityResized());
        onPostMessage = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onMinimized());
        onActivityResized = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onActivityLayout());
        int iOnWarmupCompleted11 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted12 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onRelationshipValidationResult = ByteOrderedDataOutputStream.onExtraCallback(((Integer) shouldCustomTabsTrackEvents.onWarmupCompleted(-352649164, iOnWarmupCompleted11, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 352649164, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted12, new Object[]{shouldcustomtabstrackevents})).intValue());
        ICustomTabsCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.ICustomTabsCallbackStub());
        ICustomTabsCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onRelationshipValidationResult());
        ICustomTabsCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.ICustomTabsCallbackDefault());
        onUnminimized = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.onUnminimized());
        mayLaunchUrl = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.ICustomTabsCallbackStubProxy());
        isEngagementSignalsApiAvailable = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.extraCommand());
        ICustomTabsCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.isEngagementSignalsApiAvailable());
        extraCommand = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.ICustomTabsService());
        ICustomTabsService = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.ICustomTabsCallback_Parcel());
        newSessionWithExtras = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.mayLaunchUrl());
        newSession = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.postMessage());
        int iOnWarmupCompleted13 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted14 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        newAuthTabSession = ByteOrderedDataOutputStream.onExtraCallback(((Integer) shouldCustomTabsTrackEvents.onWarmupCompleted(-1090270807, iOnWarmupCompleted13, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1090270813, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted14, new Object[]{shouldcustomtabstrackevents})).intValue());
        prefetch = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.prefetch());
        postMessage = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.newAuthTabSession());
        prefetchWithMultipleUrls = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.newSession());
        requestPostMessageChannel = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.setEngagementSignalsCallback());
        requestPostMessageChannelWithExtras = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.requestPostMessageChannelWithExtras());
        receiveFile = ByteOrderedDataOutputStream.onExtraCallback(shouldcustomtabstrackevents.requestPostMessageChannel());
        int iOnWarmupCompleted15 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted16 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        setEngagementSignalsCallback = ByteOrderedDataOutputStream.onExtraCallback(((Integer) shouldCustomTabsTrackEvents.onWarmupCompleted(-1067300340, iOnWarmupCompleted15, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1067300343, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted16, new Object[]{shouldcustomtabstrackevents})).intValue());
        int i = validateRelationship + 107;
        updateVisuals = i % 128;
        int i2 = i % 2;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 25;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        int i3 = 68 / 0;
        return onWarmupCompleted;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 77;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback;
        int i5 = i2 + 25;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = warmup + 41;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        long j = onNavigationEvent;
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        int i6 = i3 + 63;
        warmup = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 55;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = onExtraCallback;
        int i5 = i3 + 73;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 101;
        int i3 = i2 % 128;
        warmup = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = IAuthTabCallbackStub;
        int i4 = i3 + 125;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 45;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 67;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = asBinder;
        int i5 = i3 + 89;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 29;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        long j = asInterface;
        int i5 = i2 + 69;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 75;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = onTransact;
        int i5 = i2 + 73;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = warmup + 21;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(access100);
        }
        throw null;
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = warmup + 9;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = getInterfaceDescriptor;
        int i4 = i3 + 115;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long j;
        int i = 2 % 2;
        int i2 = warmup + 39;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            j = access000;
            int i3 = 60 / 0;
        } else {
            j = access000;
        }
        return Long.valueOf(j);
    }

    public final long IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 11;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback_Parcel;
        int i5 = i2 + 101;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 103;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = readTypedObject;
        int i5 = i3 + 55;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 115;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(writeTypedObject);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 41;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 33;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = extraCallback;
        int i5 = i3 + 57;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return j;
    }

    public final long extraCallback() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 39;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = extraCallbackWithResult;
        int i5 = i2 + 5;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long readTypedObject() {
        int i = 2 % 2;
        int i2 = warmup + 73;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityLayout;
        }
        int i3 = 47 / 0;
        return onActivityLayout;
    }

    public final long onActivityResized() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 91;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = onMessageChannelReady;
        int i5 = i3 + 59;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onMinimized() {
        int i = 2 % 2;
        int i2 = warmup + 69;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onMinimized;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 73;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = onPostMessage;
        int i5 = i2 + 9;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final long onActivityLayout() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 55;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        long j = onActivityResized;
        int i5 = i2 + 23;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onPostMessage() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 37;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onRelationshipValidationResult;
        int i4 = i2 + 7;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return j;
    }

    public final long ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 65;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = ICustomTabsCallbackDefault;
        int i5 = i2 + 89;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 35;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallbackStubProxy;
        }
        int i3 = 26 / 0;
        return ICustomTabsCallbackStubProxy;
    }

    public final long onUnminimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 43;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        long j = ICustomTabsCallbackStub;
        int i5 = i2 + 21;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 3;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = onUnminimized;
        int i5 = i3 + 15;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 75;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = mayLaunchUrl;
        int i5 = i3 + 15;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 19;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = isEngagementSignalsApiAvailable;
        int i5 = i2 + 75;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ICustomTabsService() {
        int i = 2 % 2;
        int i2 = warmup + 37;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsCallback_Parcel;
        int i5 = i3 + 67;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 7;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = extraCommand;
        int i5 = i2 + 41;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 23;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsService;
        if (i4 == 0) {
            int i5 = 98 / 0;
        }
        int i6 = i3 + 109;
        ICustomTabsServiceStub = i6 % 128;
        int i7 = i6 % 2;
        return Long.valueOf(j);
    }

    public final long ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 55;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        long j = newSessionWithExtras;
        int i5 = i2 + 23;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long prefetch() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 67;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = newSession;
        int i5 = i3 + 103;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long newSession() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 55;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        long j = prefetch;
        int i5 = i2 + 107;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long postMessage() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 77;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = postMessage;
        int i4 = i2 + 77;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = warmup + 91;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        long j = prefetchWithMultipleUrls;
        int i5 = i3 + 3;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return j;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 7;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = requestPostMessageChannel;
        int i4 = i2 + 115;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j);
    }

    public final long prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 93;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return requestPostMessageChannelWithExtras;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 107;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = receiveFile;
        int i5 = i2 + 59;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return j;
    }

    public final long receiveFile() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 13;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = setEngagementSignalsCallback;
        int i5 = i3 + 59;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long asInterface() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, 10907481, -10907477, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent)).longValue();
    }

    public final long access000() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, 1413464190, -1413464190, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent)).longValue();
    }

    public final long IAuthTabCallback_Parcel() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, -1194270525, 1194270530, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent)).longValue();
    }

    public final long writeTypedObject() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, -1015548179, 1015548186, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent)).longValue();
    }

    public final long onMessageChannelReady() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, 596312831, -596312828, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent)).longValue();
    }

    public final long extraCommand() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, 1689749694, -1689749688, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent)).longValue();
    }

    public final long newAuthTabSession() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, -2065657467, 2065657468, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent)).longValue();
    }

    public final long setEngagementSignalsCallback() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, 1126199060, -1126199058, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent)).longValue();
    }
}
