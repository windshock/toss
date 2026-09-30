package o;

import android.graphics.Color;
import im.toss.features.tosscert.ui.R;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import im.toss.tds.component.token.RedDotDarkColorTokens;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getCustomTabsWarmupUrls {
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
    private static int ICustomTabsServiceDefault = 0;
    private static int ICustomTabsServiceStub = 1;
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
    public static final getCustomTabsWarmupUrls onExtraCallback = new getCustomTabsWarmupUrls();
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
    private static int updateVisuals = 1;
    private static int validateRelationship;
    private static final int writeTypedObject;

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i2));
        int i12 = (~(i2 | i7)) | (~(i8 | i10));
        int i13 = ~(i5 | i);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i5 + i + i6 + ((-1585779005) * i4) + (640148872 * i3);
        int i17 = i16 * i16;
        int i18 = (i5 * 308833806) + 153878528 + (308833806 * i) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i6) + (1159200768 * i4) + ((-734003200) * i3) + (2089549824 * i17);
        int i19 = (i5 * (-1291220770)) + 263398195 + (i * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i6 * (-1291221671)) + (i4 * (-1079815989)) + (i3 * 669414472) + (i17 * 145489920);
        switch (i18 + (i19 * i19 * (-1699479552))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private getCustomTabsWarmupUrls() {
    }

    static {
        charset charsetVar = charset.onExtraCallbackWithResult;
        onNavigationEvent = charsetVar.MediaBrowserCompatMediaItem().onExtraCallbackWithResult();
        onWarmupCompleted = charsetVar.RatingCompat().onExtraCallbackWithResult();
        IAuthTabCallback = charsetVar.AudioAttributesImplApi21Parcelizer().onExtraCallbackWithResult();
        onExtraCallbackWithResult = charsetVar.validateRelationship().onExtraCallbackWithResult();
        IAuthTabCallbackDefault = charsetVar.setEngagementSignalsCallback().onExtraCallbackWithResult();
        onTransact = charsetVar.IAuthTabCallbackStubProxy().onExtraCallbackWithResult();
        IAuthTabCallbackStub = charsetVar.MediaMetadataCompat().onExtraCallbackWithResult();
        asBinder = Color.argb(43, 20, 29, 48);
        asInterface = charsetVar.access200().onExtraCallbackWithResult();
        IAuthTabCallbackStubProxy = charsetVar.getInterfaceDescriptor().onExtraCallbackWithResult();
        access100 = Color.argb(0, 255, 255, 255);
        IAuthTabCallback_Parcel = charsetVar.MediaMetadataCompat().onExtraCallbackWithResult();
        access000 = Color.argb(0, 25, 33, 61);
        getInterfaceDescriptor = Color.argb(22, 25, 33, 61);
        extraCallback = Color.argb(0, 231, 237, 247);
        ICustomTabsCallback = charsetVar.warmup().onExtraCallbackWithResult();
        writeTypedObject = Color.argb(0, 67, 122, 223);
        extraCallbackWithResult = charsetVar.access000().onExtraCallbackWithResult();
        readTypedObject = Color.rgb(117, 119, 121);
        onPostMessage = charsetVar.MediaMetadataCompat().onExtraCallbackWithResult();
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onMinimized = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1173038633, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1173038638, iOnWarmupCompleted, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).onExtraCallbackWithResult();
        onActivityLayout = charsetVar.MediaMetadataCompat().onExtraCallbackWithResult();
        onMessageChannelReady = charsetVar.MediaMetadataCompat().onExtraCallbackWithResult();
        onActivityResized = charsetVar.newSessionWithExtras().onExtraCallbackWithResult();
        ICustomTabsCallbackStubProxy = charsetVar.IAuthTabCallbackDefault().onExtraCallbackWithResult();
        onRelationshipValidationResult = Color.rgb(117, 119, 121);
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onUnminimized = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1173038633, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1173038638, iOnWarmupCompleted2, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).onExtraCallbackWithResult();
        ICustomTabsCallbackStub = charsetVar.MediaMetadataCompat().onExtraCallbackWithResult();
        ICustomTabsCallbackDefault = charsetVar.newSessionWithExtras().onExtraCallbackWithResult();
        ICustomTabsService = charsetVar.IAuthTabCallbackDefault().onExtraCallbackWithResult();
        ICustomTabsCallback_Parcel = matchesCertificate.onExtraCallback.IAuthTabCallback();
        extraCommand = charsetVar.AudioAttributesImplApi21Parcelizer().onExtraCallbackWithResult();
        mayLaunchUrl = RedDotDarkColorTokens.onWarmupCompleted.onNavigationEvent();
        isEngagementSignalsApiAvailable = Color.rgb(248, 99, 102);
        prefetch = Color.argb(17, 0, 0, 0);
        newSession = Color.argb(51, 0, 0, 0);
        postMessage = Color.argb(38, 0, 0, 0);
        newAuthTabSession = Color.argb(51, 0, 0, 0);
        newSessionWithExtras = Color.argb(89, 0, 0, 0);
        setEngagementSignalsCallback = Color.argb(89, 0, 0, 0);
        prefetchWithMultipleUrls = Color.rgb(54, 56, 58);
        int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        requestPostMessageChannel = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1173038633, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1173038638, iOnWarmupCompleted3, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).onExtraCallbackWithResult();
        requestPostMessageChannelWithExtras = Color.rgb(23, 23, 25);
        receiveFile = charsetVar.onTransact().onExtraCallbackWithResult();
        int i = updateVisuals + 55;
        ICustomTabsServiceDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = validateRelationship + 15;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent;
        int i5 = i3 + 7;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = validateRelationship + 9;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 75;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback;
        int i5 = i2 + 85;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 63;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = onExtraCallbackWithResult;
        int i6 = i3 + 3;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
        return i5;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 61;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = IAuthTabCallbackDefault;
        int i6 = i2 + 111;
        ICustomTabsServiceStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = validateRelationship + 19;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 29;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        int i5 = IAuthTabCallbackStub;
        int i6 = i2 + 31;
        validateRelationship = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 0 / 0;
        }
        return i5;
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 67;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = asBinder;
        int i6 = i3 + 7;
        ICustomTabsServiceStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 109;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        int i5 = asInterface;
        int i6 = i2 + 59;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = validateRelationship + 77;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            int i5 = 62 / 0;
        }
        return i4;
    }

    public final int access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 123;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = access100;
        int i6 = i3 + 47;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback_Parcel() {
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceStub;
        int i4 = i3 + 55;
        validateRelationship = i4 % 128;
        if (i4 % 2 != 0) {
            i = IAuthTabCallback_Parcel;
            int i5 = 66 / 0;
        } else {
            i = IAuthTabCallback_Parcel;
        }
        int i6 = i3 + 75;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 11;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = access000;
        int i6 = i2 + 119;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = validateRelationship + 81;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return getInterfaceDescriptor;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 59;
        validateRelationship = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(extraCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int writeTypedObject() {
        int i = 2 % 2;
        int i2 = validateRelationship + 121;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        int i5 = ICustomTabsCallback;
        int i6 = i3 + 87;
        validateRelationship = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
        return i5;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = validateRelationship + 29;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        int i5 = writeTypedObject;
        int i6 = i3 + 45;
        validateRelationship = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        int i7 = 37 / 0;
        return Integer.valueOf(i5);
    }

    public final int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 31;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        int i5 = extraCallbackWithResult;
        int i6 = i2 + 61;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int extraCallback() {
        int i = 2 % 2;
        int i2 = validateRelationship + 3;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        int i5 = readTypedObject;
        int i6 = i3 + 107;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 95;
        validateRelationship = i2 % 128;
        if (i2 % 2 == 0) {
            return onPostMessage;
        }
        throw null;
    }

    public final int onActivityLayout() {
        int i = 2 % 2;
        int i2 = validateRelationship + 45;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        int i5 = onMinimized;
        int i6 = i3 + 29;
        validateRelationship = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onMinimized() {
        int i = 2 % 2;
        int i2 = validateRelationship + 35;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onActivityLayout;
        }
        throw null;
    }

    public final int onActivityResized() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 111;
        validateRelationship = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onMessageChannelReady;
        if (i3 != 0) {
            int i5 = 31 / 0;
        }
        return i4;
    }

    public final int onPostMessage() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 99;
        ICustomTabsServiceStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onActivityResized;
        int i5 = i2 + 113;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final int onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 31;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = ICustomTabsCallbackStubProxy;
        int i6 = i3 + 83;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = validateRelationship + 87;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        int i5 = onRelationshipValidationResult;
        int i6 = i3 + 117;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 79;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = onUnminimized;
        int i6 = i3 + 97;
        ICustomTabsServiceStub = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    public final int ICustomTabsCallbackDefault() {
        int i;
        int i2 = 2 % 2;
        int i3 = validateRelationship + 5;
        int i4 = i3 % 128;
        ICustomTabsServiceStub = i4;
        if (i3 % 2 == 0) {
            i = ICustomTabsCallbackStub;
            int i5 = 82 / 0;
        } else {
            i = ICustomTabsCallbackStub;
        }
        int i6 = i4 + 5;
        validateRelationship = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onUnminimized() {
        int i = 2 % 2;
        int i2 = validateRelationship;
        int i3 = i2 + 41;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ICustomTabsCallbackDefault;
        int i6 = i2 + 15;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 77;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = ICustomTabsService;
        int i6 = i3 + 19;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 29;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = ICustomTabsCallback_Parcel;
        int i6 = i3 + 31;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        int i7 = 7 / 0;
        return Integer.valueOf(i5);
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 17;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = extraCommand;
        int i6 = i3 + 123;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = validateRelationship + 59;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return mayLaunchUrl;
        }
        throw null;
    }

    public final int mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 69;
        validateRelationship = i2 % 128;
        if (i2 % 2 == 0) {
            return isEngagementSignalsApiAvailable;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 21;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        int i5 = prefetch;
        int i6 = i2 + 9;
        validateRelationship = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        int i7 = 18 / 0;
        return Integer.valueOf(i5);
    }

    public final int newSession() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 121;
        validateRelationship = i2 % 128;
        int i3 = i2 % 2;
        int i4 = newSession;
        if (i3 != 0) {
            int i5 = 20 / 0;
        }
        return i4;
    }

    public final int prefetch() {
        int i = 2 % 2;
        int i2 = validateRelationship + 55;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = postMessage;
        if (i3 == 0) {
            int i5 = 92 / 0;
        }
        return i4;
    }

    public final int newAuthTabSession() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 71;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        int i5 = newAuthTabSession;
        int i6 = i2 + 21;
        validateRelationship = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 105;
        validateRelationship = i2 % 128;
        if (i2 % 2 == 0) {
            return newSessionWithExtras;
        }
        throw null;
    }

    public final int postMessage() {
        int i = 2 % 2;
        int i2 = validateRelationship + 69;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return setEngagementSignalsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 107;
        validateRelationship = i2 % 128;
        int i3 = i2 % 2;
        int i4 = prefetchWithMultipleUrls;
        if (i3 != 0) {
            int i5 = 1 / 0;
        }
        return i4;
    }

    public final int receiveFile() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 3;
        validateRelationship = i3 % 128;
        int i4 = i3 % 2;
        int i5 = requestPostMessageChannel;
        int i6 = i2 + 81;
        validateRelationship = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 61;
        int i3 = i2 % 128;
        validateRelationship = i3;
        int i4 = i2 % 2;
        int i5 = requestPostMessageChannelWithExtras;
        int i6 = i3 + 63;
        ICustomTabsServiceStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 103;
        validateRelationship = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = receiveFile;
        int i5 = i2 + 39;
        validateRelationship = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getInterfaceDescriptor() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Integer) onExtraCallback(new Object[]{this}, 223000790, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -223000785, iIAuthTabCallback2)).intValue();
    }

    public final int access100() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Integer) onExtraCallback(new Object[]{this}, -1889184764, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1889184771, iIAuthTabCallback2)).intValue();
    }

    public final int extraCallbackWithResult() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Integer) onExtraCallback(new Object[]{this}, 789384862, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -789384860, iIAuthTabCallback2)).intValue();
    }

    public final int ICustomTabsCallbackStub() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Integer) onExtraCallback(new Object[]{this}, -130347350, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 130347350, iIAuthTabCallback2)).intValue();
    }

    public final int onRelationshipValidationResult() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Integer) onExtraCallback(new Object[]{this}, -576655835, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 576655839, iIAuthTabCallback2)).intValue();
    }

    public final int extraCommand() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Integer) onExtraCallback(new Object[]{this}, -694996719, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 694996722, iIAuthTabCallback2)).intValue();
    }

    public final int ICustomTabsService() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Integer) onExtraCallback(new Object[]{this}, -577035582, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 577035588, iIAuthTabCallback2)).intValue();
    }

    public final int isEngagementSignalsApiAvailable() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Integer) onExtraCallback(new Object[]{this}, -148124900, iIAuthTabCallback, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 148124901, iIAuthTabCallback2)).intValue();
    }
}
