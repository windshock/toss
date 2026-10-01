package o;

import android.graphics.Color;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import im.toss.tds.component.token.RedDotLightColorTokens;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shouldCustomTabsTrackEvents {
    private static final int IAuthTabCallback;
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
    private static int ICustomTabsServiceDefault = 1;
    private static int ICustomTabsServiceStub = 0;
    private static final int access000;
    private static final int access100;
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
    public static final shouldCustomTabsTrackEvents onExtraCallback = new shouldCustomTabsTrackEvents();
    private static final int onExtraCallbackWithResult;
    private static final int onMessageChannelReady;
    private static final int onMinimized;
    private static final int onNavigationEvent;
    private static final int onPostMessage;
    private static final int onRelationshipValidationResult;
    private static final int onTransact;
    private static final int onUnminimized;
    private static final int onWarmupCompleted;
    private static final int postMessage;
    private static final int prefetch;
    private static final int prefetchWithMultipleUrls;
    private static final int readTypedObject;
    private static final int receiveFile;
    private static final int requestPostMessageChannel;
    private static final int requestPostMessageChannelWithExtras;
    private static final int setEngagementSignalsCallback;
    private static int updateVisuals = 0;
    private static int validateRelationship = 1;
    private static final int writeTypedObject;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = (~(i7 | i8 | (~i2))) | (~(i | i4 | i2));
        int i10 = (~(i8 | i2)) | (~(i8 | i));
        int i11 = (~(i2 | i4)) | i;
        int i12 = i + i4 + i6 + (1661237432 * i5) + (961048624 * i3);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i) - 281083904) + ((-1329838950) * i4) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i6) + ((-1559232512) * i5) + (1553989632 * i3) + (2020540416 * i13);
        int i15 = (i * (-2040814728)) + 92927091 + (i4 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i6 * (-2040814133)) + (i5 * (-1614655000)) + (i3 * 500164112) + (i13 * 184877056);
        switch (i14 + (i15 * i15 * 1800994816)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                int i16 = 2 % 2;
                int i17 = updateVisuals + 15;
                int i18 = i17 % 128;
                validateRelationship = i18;
                int i19 = i17 % 2;
                int i20 = ICustomTabsCallback;
                int i21 = i18 + 105;
                updateVisuals = i21 % 128;
                int i22 = i21 % 2;
                return Integer.valueOf(i20);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private shouldCustomTabsTrackEvents() {
    }

    static {
        charset charsetVar = charset.onExtraCallbackWithResult;
        onWarmupCompleted = charsetVar.MediaBrowserCompatMediaItem().IAuthTabCallback();
        IAuthTabCallback = charsetVar.RatingCompat().IAuthTabCallback();
        onExtraCallbackWithResult = charsetVar.AudioAttributesImplApi21Parcelizer().IAuthTabCallback();
        onNavigationEvent = charsetVar.validateRelationship().IAuthTabCallback();
        IAuthTabCallbackDefault = charsetVar.setEngagementSignalsCallback().IAuthTabCallback();
        IAuthTabCallbackStub = charsetVar.IAuthTabCallbackStubProxy().IAuthTabCallback();
        asInterface = charsetVar.MediaMetadataCompat().IAuthTabCallback();
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onTransact = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1621030900, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1621030898, iOnWarmupCompleted, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        asBinder = charsetVar.access200().IAuthTabCallback();
        getInterfaceDescriptor = charsetVar.getInterfaceDescriptor().IAuthTabCallback();
        access100 = Color.argb(0, 255, 255, 255);
        IAuthTabCallback_Parcel = charsetVar.MediaMetadataCompat().IAuthTabCallback();
        access000 = Color.argb(0, 25, 33, 61);
        IAuthTabCallbackStubProxy = charsetVar.prefetchWithMultipleUrls().IAuthTabCallback();
        ICustomTabsCallback = Color.argb(0, 28, 31, 39);
        readTypedObject = charsetVar.warmup().IAuthTabCallback();
        extraCallback = Color.argb(0, 26, 122, 249);
        extraCallbackWithResult = charsetVar.access000().IAuthTabCallback();
        writeTypedObject = charsetVar.postMessage().IAuthTabCallback();
        onActivityLayout = charsetVar.MediaMetadataCompat().IAuthTabCallback();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onMinimized = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1173038633, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1173038638, iOnWarmupCompleted2, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        onPostMessage = charsetVar.MediaMetadataCompat().IAuthTabCallback();
        onMessageChannelReady = charsetVar.MediaMetadataCompat().IAuthTabCallback();
        onActivityResized = charsetVar.newSessionWithExtras().IAuthTabCallback();
        onRelationshipValidationResult = charsetVar.IAuthTabCallbackDefault().IAuthTabCallback();
        ICustomTabsCallbackStub = charsetVar.postMessage().IAuthTabCallback();
        int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onUnminimized = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1173038633, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1173038638, iOnWarmupCompleted3, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        ICustomTabsCallbackDefault = charsetVar.MediaMetadataCompat().IAuthTabCallback();
        ICustomTabsCallbackStubProxy = charsetVar.newSessionWithExtras().IAuthTabCallback();
        ICustomTabsService = charsetVar.IAuthTabCallbackDefault().IAuthTabCallback();
        mayLaunchUrl = deprecated_scheme.onExtraCallbackWithResult.onNavigationEvent();
        extraCommand = charsetVar.AudioAttributesImplApi21Parcelizer().IAuthTabCallback();
        isEngagementSignalsApiAvailable = RedDotLightColorTokens.onNavigationEvent.onExtraCallback();
        ICustomTabsCallback_Parcel = charsetVar.ITrustedWebActivityCallbackStubProxy().IAuthTabCallback();
        newAuthTabSession = Color.argb(51, 0, 0, 0);
        prefetch = Color.argb(17, 0, 0, 0);
        newSessionWithExtras = Color.argb(38, 0, 0, 0);
        postMessage = Color.argb(51, 0, 0, 0);
        newSession = Color.argb(12, 0, 0, 0);
        prefetchWithMultipleUrls = charsetVar.getInterfaceDescriptor().IAuthTabCallback();
        int iOnWarmupCompleted4 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        receiveFile = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, iOnWarmupCompleted4, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        int iOnWarmupCompleted5 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        setEngagementSignalsCallback = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1173038633, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1173038638, iOnWarmupCompleted5, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).IAuthTabCallback();
        requestPostMessageChannelWithExtras = charsetVar.AudioAttributesImplApi21Parcelizer().IAuthTabCallback();
        requestPostMessageChannel = charsetVar.onTransact().IAuthTabCallback();
        int i = ICustomTabsServiceDefault + 37;
        ICustomTabsServiceStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 95 / 0;
        }
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = updateVisuals + 53;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = onWarmupCompleted;
        int i6 = i3 + 77;
        updateVisuals = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = updateVisuals + 93;
        int i3 = i2 % 128;
        validateRelationship = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback;
        int i5 = i3 + 39;
        updateVisuals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return i4;
    }

    public final int IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = validateRelationship;
        int i4 = i3 + 75;
        updateVisuals = i4 % 128;
        if (i4 % 2 != 0) {
            i = onExtraCallbackWithResult;
            int i5 = 58 / 0;
        } else {
            i = onExtraCallbackWithResult;
        }
        int i6 = i3 + 55;
        updateVisuals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 75 / 0;
        }
        return i;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = updateVisuals + 91;
        int i3 = i2 % 128;
        validateRelationship = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent;
        int i5 = i3 + 97;
        updateVisuals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = validateRelationship + 83;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        int i5 = IAuthTabCallbackDefault;
        int i6 = i3 + 113;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i;
        int i2 = 2 % 2;
        int i3 = updateVisuals;
        int i4 = i3 + 79;
        validateRelationship = i4 % 128;
        if (i4 % 2 == 0) {
            i = IAuthTabCallbackStub;
            int i5 = 98 / 0;
        } else {
            i = IAuthTabCallbackStub;
        }
        int i6 = i3 + 11;
        validateRelationship = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i);
        }
        int i7 = 14 / 0;
        return Integer.valueOf(i);
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = updateVisuals + 75;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = asInterface;
        int i6 = i3 + 87;
        updateVisuals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 20 / 0;
        }
        return i5;
    }

    public final int onTransact() {
        int i;
        int i2 = 2 % 2;
        int i3 = validateRelationship;
        int i4 = i3 + 113;
        updateVisuals = i4 % 128;
        if (i4 % 2 != 0) {
            i = onTransact;
            int i5 = 8 / 0;
        } else {
            i = onTransact;
        }
        int i6 = i3 + 111;
        updateVisuals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
        return i;
    }

    public final int IAuthTabCallbackDefault() {
        int i;
        int i2 = 2 % 2;
        int i3 = validateRelationship;
        int i4 = i3 + 51;
        updateVisuals = i4 % 128;
        if (i4 % 2 != 0) {
            i = asBinder;
            int i5 = 73 / 0;
        } else {
            i = asBinder;
        }
        int i6 = i3 + 13;
        updateVisuals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
        return i;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 95;
        updateVisuals = i3 % 128;
        int i4 = i3 % 2;
        int i5 = getInterfaceDescriptor;
        int i6 = i2 + 95;
        updateVisuals = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = validateRelationship + 121;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = access100;
        if (i3 != 0) {
            int i5 = 42 / 0;
        }
        return i4;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 9;
        validateRelationship = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel;
        int i5 = i2 + 117;
        validateRelationship = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(i4);
        }
        int i6 = 47 / 0;
        return Integer.valueOf(i4);
    }

    public final int IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = validateRelationship + 71;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = access000;
        if (i3 != 0) {
            int i5 = 58 / 0;
        }
        return i4;
    }

    public final int access000() {
        int i = 2 % 2;
        int i2 = updateVisuals + 73;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = IAuthTabCallbackStubProxy;
        int i6 = i3 + 99;
        updateVisuals = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = updateVisuals + 119;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = readTypedObject;
        int i6 = i3 + 103;
        updateVisuals = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 95;
        updateVisuals = i3 % 128;
        int i4 = i3 % 2;
        int i5 = extraCallback;
        int i6 = i2 + 81;
        updateVisuals = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int extraCallback() {
        int i = 2 % 2;
        int i2 = validateRelationship + 75;
        updateVisuals = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = validateRelationship + 121;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        int i5 = writeTypedObject;
        int i6 = i3 + 87;
        validateRelationship = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 57;
        updateVisuals = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onActivityLayout;
        int i5 = i2 + 115;
        updateVisuals = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(i4);
    }

    public final int onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = validateRelationship + 13;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        int i5 = onMinimized;
        int i6 = i3 + 69;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onActivityResized() {
        int i = 2 % 2;
        int i2 = updateVisuals + 19;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = onPostMessage;
        int i6 = i3 + 63;
        updateVisuals = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onMinimized() {
        int i = 2 % 2;
        int i2 = validateRelationship + 121;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        int i5 = onMessageChannelReady;
        int i6 = i3 + 39;
        validateRelationship = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 54 / 0;
        }
        return i5;
    }

    public final int onActivityLayout() {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 83;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onActivityResized;
        int i6 = i2 + 37;
        validateRelationship = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = validateRelationship + 65;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        int i5 = onRelationshipValidationResult;
        int i6 = i3 + 5;
        validateRelationship = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        int i7 = 1 / 0;
        return Integer.valueOf(i5);
    }

    public final int ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = validateRelationship + 95;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        int i5 = ICustomTabsCallbackStub;
        int i6 = i3 + 113;
        validateRelationship = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 89;
        validateRelationship = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onUnminimized;
        int i5 = i2 + 59;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = updateVisuals + 39;
        validateRelationship = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ICustomTabsCallbackDefault;
        if (i3 == 0) {
            int i5 = 15 / 0;
        }
        return i4;
    }

    public final int onUnminimized() {
        int i = 2 % 2;
        int i2 = validateRelationship + 33;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        int i5 = ICustomTabsCallbackStubProxy;
        int i6 = i3 + 3;
        validateRelationship = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = updateVisuals + 103;
        validateRelationship = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsService;
        }
        throw null;
    }

    public final int extraCommand() {
        int i = 2 % 2;
        int i2 = validateRelationship + 59;
        int i3 = i2 % 128;
        updateVisuals = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = mayLaunchUrl;
        int i5 = i3 + 51;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = updateVisuals + 25;
        validateRelationship = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCommand;
        }
        throw null;
    }

    public final int ICustomTabsService() {
        int i = 2 % 2;
        int i2 = validateRelationship + 23;
        updateVisuals = i2 % 128;
        if (i2 % 2 == 0) {
            return isEngagementSignalsApiAvailable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = validateRelationship + 11;
        updateVisuals = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 93;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        int i5 = newAuthTabSession;
        int i6 = i2 + 103;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int postMessage() {
        int i;
        int i2 = 2 % 2;
        int i3 = updateVisuals;
        int i4 = i3 + 47;
        validateRelationship = i4 % 128;
        if (i4 % 2 == 0) {
            i = prefetch;
            int i5 = 1 / 0;
        } else {
            i = prefetch;
        }
        int i6 = i3 + 9;
        validateRelationship = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 17 / 0;
        }
        return i;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 13;
        validateRelationship = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = newSessionWithExtras;
        int i5 = i2 + 43;
        validateRelationship = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(i4);
        }
        obj.hashCode();
        throw null;
    }

    public final int prefetch() {
        int i = 2 % 2;
        int i2 = updateVisuals + 83;
        validateRelationship = i2 % 128;
        if (i2 % 2 != 0) {
            return postMessage;
        }
        throw null;
    }

    public final int newAuthTabSession() {
        int i = 2 % 2;
        int i2 = updateVisuals + 1;
        int i3 = i2 % 128;
        validateRelationship = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = newSession;
        int i5 = i3 + 29;
        updateVisuals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int newSession() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 23;
        updateVisuals = i3 % 128;
        int i4 = i3 % 2;
        int i5 = prefetchWithMultipleUrls;
        int i6 = i2 + 49;
        updateVisuals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 54 / 0;
        }
        return i5;
    }

    public final int setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 43;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        int i5 = receiveFile;
        int i6 = i2 + 99;
        validateRelationship = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 91;
        updateVisuals = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = setEngagementSignalsCallback;
        int i5 = i2 + 119;
        updateVisuals = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = updateVisuals + 85;
        validateRelationship = i2 % 128;
        int i3 = i2 % 2;
        int i4 = requestPostMessageChannelWithExtras;
        if (i3 == 0) {
            int i5 = 50 / 0;
        }
        return i4;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = updateVisuals + 83;
        validateRelationship = i2 % 128;
        if (i2 % 2 != 0) {
            return Integer.valueOf(requestPostMessageChannel);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int asBinder() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(-1680285504, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1680285511, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this})).intValue();
    }

    public final int IAuthTabCallback_Parcel() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(1443361546, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1443361545, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this})).intValue();
    }

    public final int access100() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(-1187185855, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1187185857, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this})).intValue();
    }

    public final int writeTypedObject() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(1987787108, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1987787103, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this})).intValue();
    }

    public final int readTypedObject() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(-1502818637, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1502818641, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this})).intValue();
    }

    public final int onPostMessage() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(-352649164, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 352649164, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this})).intValue();
    }

    public final int newSessionWithExtras() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(-1090270807, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1090270813, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this})).intValue();
    }

    public final int prefetchWithMultipleUrls() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(-1067300340, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1067300343, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this})).intValue();
    }
}
