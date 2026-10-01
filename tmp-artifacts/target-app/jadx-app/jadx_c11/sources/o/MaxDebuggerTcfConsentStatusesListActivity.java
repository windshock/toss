package o;

import im.toss.features.tosscert.ui.R;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerTcfConsentStatusesListActivity {
    public static final MaxDebuggerTcfConsentStatusesListActivity IAuthTabCallback = new MaxDebuggerTcfConsentStatusesListActivity();
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
    private static int ICustomTabsServiceDefault = 1;
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
    private static final long onExtraCallbackWithResult;
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
    private static int validateRelationship = 0;
    private static int warmup = 1;
    private static final long writeTypedObject;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = (~i5) | i8;
        int i10 = i7 | (~i9);
        int i11 = i5 | i8;
        int i12 = ~(i9 | i6);
        int i13 = i2 + i6 + i + (1075552530 * i3) + ((-1519595880) * i4);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i2) - 1639710720) + ((-2116975300) * i6) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i) + ((-189792256) * i3) + (1111490560 * i4) + (1415839744 * i14);
        int i16 = (i2 * 251836610) + 257048825 + (i6 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i * 251837547) + (i3 * 1710852742) + (i4 * (-1855850104)) + (i14 * (-1244921856));
        switch (i15 + (i16 * i16 * (-1300496384))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                int i17 = 2 % 2;
                int i18 = ICustomTabsServiceDefault + 71;
                int i19 = i18 % 128;
                validateRelationship = i19;
                int i20 = i18 % 2;
                long j = extraCallbackWithResult;
                int i21 = i19 + 123;
                ICustomTabsServiceDefault = i21 % 128;
                int i22 = i21 % 2;
                return Long.valueOf(j);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private MaxDebuggerTcfConsentStatusesListActivity() {
    }

    static {
        getCustomTabsWarmupUrls getcustomtabswarmupurls = getCustomTabsWarmupUrls.onExtraCallback;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onExtraCallbackWithResult());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onWarmupCompleted());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.IAuthTabCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onExtraCallback());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onNavigationEvent());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.asInterface());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.IAuthTabCallbackDefault());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.asBinder());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onTransact());
        getInterfaceDescriptor = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.IAuthTabCallbackStub());
        IAuthTabCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.access000());
        access000 = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.IAuthTabCallback_Parcel());
        access100 = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsWarmupUrls.onExtraCallback(new Object[]{getcustomtabswarmupurls}, 223000790, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -223000785, R.drawable.IAuthTabCallback())).intValue());
        IAuthTabCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.IAuthTabCallbackStubProxy());
        readTypedObject = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsWarmupUrls.onExtraCallback(new Object[]{getcustomtabswarmupurls}, -1889184764, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1889184771, R.drawable.IAuthTabCallback())).intValue());
        extraCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.writeTypedObject());
        ICustomTabsCallback = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsWarmupUrls.onExtraCallback(new Object[]{getcustomtabswarmupurls}, 789384862, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -789384860, R.drawable.IAuthTabCallback())).intValue());
        extraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.ICustomTabsCallback());
        writeTypedObject = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.extraCallback());
        onMessageChannelReady = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.readTypedObject());
        onActivityResized = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onActivityLayout());
        onActivityLayout = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onMinimized());
        onPostMessage = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onActivityResized());
        onMinimized = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onPostMessage());
        ICustomTabsCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onMessageChannelReady());
        onUnminimized = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.ICustomTabsCallbackStubProxy());
        ICustomTabsCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsWarmupUrls.onExtraCallback(new Object[]{getcustomtabswarmupurls}, -130347350, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 130347350, R.drawable.IAuthTabCallback())).intValue());
        onRelationshipValidationResult = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.ICustomTabsCallbackDefault());
        ICustomTabsCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.onUnminimized());
        ICustomTabsService = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsWarmupUrls.onExtraCallback(new Object[]{getcustomtabswarmupurls}, -576655835, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 576655839, R.drawable.IAuthTabCallback())).intValue());
        ICustomTabsCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsWarmupUrls.onExtraCallback(new Object[]{getcustomtabswarmupurls}, -694996719, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 694996722, R.drawable.IAuthTabCallback())).intValue());
        isEngagementSignalsApiAvailable = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsWarmupUrls.onExtraCallback(new Object[]{getcustomtabswarmupurls}, -577035582, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 577035588, R.drawable.IAuthTabCallback())).intValue());
        mayLaunchUrl = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.ICustomTabsCallback_Parcel());
        extraCommand = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.mayLaunchUrl());
        newAuthTabSession = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsWarmupUrls.onExtraCallback(new Object[]{getcustomtabswarmupurls}, -148124900, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 148124901, R.drawable.IAuthTabCallback())).intValue());
        newSession = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.newSession());
        newSessionWithExtras = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.prefetch());
        postMessage = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.newAuthTabSession());
        prefetch = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.newSessionWithExtras());
        receiveFile = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.postMessage());
        requestPostMessageChannelWithExtras = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.requestPostMessageChannelWithExtras());
        requestPostMessageChannel = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.receiveFile());
        prefetchWithMultipleUrls = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.prefetchWithMultipleUrls());
        setEngagementSignalsCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabswarmupurls.requestPostMessageChannel());
        int i = updateVisuals + 125;
        warmup = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = validateRelationship + 5;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        long j = onWarmupCompleted;
        int i5 = i3 + 97;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = validateRelationship + 83;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 5;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 37;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallback;
        int i5 = i2 + 63;
        validateRelationship = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = validateRelationship + 73;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 99;
        ICustomTabsServiceDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = onTransact;
        int i4 = i2 + 33;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 55;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = asBinder;
        int i5 = i2 + 83;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 29;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        long j = asInterface;
        int i5 = i3 + 5;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = validateRelationship + 43;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallbackDefault;
        int i5 = i3 + 39;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        long j;
        int i = 2 % 2;
        int i2 = validateRelationship + 85;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            j = IAuthTabCallbackStub;
            int i3 = 68 / 0;
        } else {
            j = IAuthTabCallbackStub;
        }
        return Long.valueOf(j);
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = validateRelationship + 93;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return getInterfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long access000() {
        int i = 2 % 2;
        int i2 = validateRelationship + 87;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback_Parcel;
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        int i6 = i3 + 51;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 33;
        int i3 = i2 % 128;
        validateRelationship = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = access000;
        int i4 = i3 + 105;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = validateRelationship + 77;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        long j = access100;
        int i5 = i3 + 107;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 57;
        validateRelationship = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = validateRelationship + 3;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return readTypedObject;
        }
        int i3 = 48 / 0;
        return readTypedObject;
    }

    public final long writeTypedObject() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 91;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = extraCallback;
        int i5 = i2 + 117;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return j;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = validateRelationship + 57;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsCallback;
        int i5 = i3 + 111;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final long extraCallback() {
        int i = 2 % 2;
        int i2 = validateRelationship + 103;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject;
        }
        int i3 = 70 / 0;
        return writeTypedObject;
    }

    public final long extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 69;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        long j = onMessageChannelReady;
        int i5 = i3 + 9;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return j;
    }

    public final long onActivityResized() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 75;
        validateRelationship = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityResized;
        }
        throw null;
    }

    public final long onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 111;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = onActivityLayout;
        int i5 = i2 + 35;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onPostMessage() {
        int i = 2 % 2;
        int i2 = validateRelationship + 89;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        long j = onPostMessage;
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
        int i6 = i3 + 29;
        validateRelationship = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onMinimized() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 43;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = onMinimized;
        int i5 = i2 + 13;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onActivityLayout() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 123;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsCallbackStubProxy;
        int i5 = i3 + 75;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long j;
        int i = 2 % 2;
        int i2 = validateRelationship + 75;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            j = onUnminimized;
            int i3 = 0 / 0;
        } else {
            j = onUnminimized;
        }
        return Long.valueOf(j);
    }

    public final long onUnminimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 69;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsCallbackStub;
        int i5 = i3 + 89;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 63;
        validateRelationship = i2 % 128;
        if (i2 % 2 == 0) {
            return onRelationshipValidationResult;
        }
        int i3 = 88 / 0;
        return onRelationshipValidationResult;
    }

    public final long ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = validateRelationship + 125;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsCallbackDefault;
        int i5 = i3 + 25;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 73;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsService;
        int i5 = i3 + 85;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long ICustomTabsService() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 61;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        long j = ICustomTabsCallback_Parcel;
        int i5 = i2 + 123;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 115;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = isEngagementSignalsApiAvailable;
        int i5 = i2 + 33;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 31;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        long j = mayLaunchUrl;
        int i5 = i2 + 95;
        validateRelationship = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = validateRelationship + 79;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCommand;
        }
        throw null;
    }

    public final long extraCommand() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 71;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        long j = newAuthTabSession;
        int i5 = i3 + 109;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long newAuthTabSession() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 23;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        long j = newSession;
        int i5 = i3 + 65;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long newSession() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 83;
        validateRelationship = i2 % 128;
        if (i2 % 2 == 0) {
            return newSessionWithExtras;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long postMessage() {
        int i = 2 % 2;
        int i2 = validateRelationship + 75;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return postMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 19;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = prefetch;
        int i5 = i2 + 13;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 63;
        validateRelationship = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = receiveFile;
        int i4 = i2 + 111;
        validateRelationship = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(j);
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = validateRelationship + 73;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        long j = requestPostMessageChannelWithExtras;
        int i5 = i3 + 17;
        validateRelationship = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 99;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        long j = requestPostMessageChannel;
        int i5 = i2 + 93;
        validateRelationship = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return j;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 41;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        long j = prefetchWithMultipleUrls;
        int i5 = i2 + 109;
        validateRelationship = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        long j;
        int i = 2 % 2;
        int i2 = validateRelationship + 29;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            j = setEngagementSignalsCallback;
            int i3 = 97 / 0;
        } else {
            j = setEngagementSignalsCallback;
        }
        return Long.valueOf(j);
    }

    public final long onTransact() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -381769680, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, 381769687, new Object[]{this})).longValue();
    }

    public final long ICustomTabsCallback() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1679205468, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, 1679205472, new Object[]{this})).longValue();
    }

    public final long readTypedObject() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1376473445, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, 1376473448, new Object[]{this})).longValue();
    }

    public final long ICustomTabsCallbackStubProxy() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -831881526, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, 831881528, new Object[]{this})).longValue();
    }

    public final long prefetch() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1965522511, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, 1965522516, new Object[]{this})).longValue();
    }

    public final long requestPostMessageChannel() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 521767243, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, -521767237, new Object[]{this})).longValue();
    }

    public final long prefetchWithMultipleUrls() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1974516739, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, 1974516740, new Object[]{this})).longValue();
    }

    public final long receiveFile() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -757956359, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, 757956359, new Object[]{this})).longValue();
    }
}
