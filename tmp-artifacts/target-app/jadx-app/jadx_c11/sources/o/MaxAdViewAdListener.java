package o;

import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdViewAdListener {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static final long IAuthTabCallbackStub;
    private static final long IAuthTabCallbackStubProxy;
    private static final long IAuthTabCallback_Parcel;
    private static final long ICustomTabsCallback;
    private static int ICustomTabsCallbackDefault = 0;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static final long access000;
    private static final long access100;
    private static final long asBinder;
    private static final long asInterface;
    private static final long extraCallback;
    private static final long extraCallbackWithResult;
    private static final long getInterfaceDescriptor;
    private static final long onActivityLayout;
    private static final long onActivityResized;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onMessageChannelReady;
    private static final long onMinimized;
    public static final MaxAdViewAdListener onNavigationEvent = new MaxAdViewAdListener();
    private static final long onPostMessage;
    private static int onRelationshipValidationResult = 1;
    private static final long onTransact;
    private static int onUnminimized;
    private static final long onWarmupCompleted;
    private static final long readTypedObject;
    private static final long writeTypedObject;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i6 | i2 | i);
        int i8 = ~i2;
        int i9 = (~(i8 | i)) | (~((~i) | i6));
        int i10 = (~(i | (~i6))) | i8;
        int i11 = i6 + i2 + i4 + ((-2044576983) * i3) + (1743660113 * i5);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i6) - 713031680) + (164951516 * i2) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i4) + (689963008 * i3) + ((-299892736) * i5) + ((-1081737216) * i12);
        int i14 = ((i6 * 2048727874) - 782056376) + (i2 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i4 * 2048728315) + (i3 * 2142076211) + (i5 * (-1448904853)) + (i12 * 1885470720);
        int i15 = i13 + (i14 * i14 * (-1618345984));
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i15 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i15 != 3) {
            int i16 = 2 % 2;
            int i17 = ICustomTabsCallbackDefault;
            int i18 = i17 + 125;
            ICustomTabsCallbackStubProxy = i18 % 128;
            int i19 = i18 % 2;
            long j = readTypedObject;
            int i20 = i17 + 117;
            ICustomTabsCallbackStubProxy = i20 % 128;
            int i21 = i20 % 2;
            return Long.valueOf(j);
        }
        int i22 = 2 % 2;
        int i23 = ICustomTabsCallbackDefault + 101;
        int i24 = i23 % 128;
        ICustomTabsCallbackStubProxy = i24;
        int i25 = i23 % 2;
        long j2 = IAuthTabCallbackDefault;
        int i26 = i24 + 5;
        ICustomTabsCallbackDefault = i26 % 128;
        int i27 = i26 % 2;
        return Long.valueOf(j2);
    }

    private MaxAdViewAdListener() {
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 15;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    static {
        getCustomTabsNavigationFailedPostbacks getcustomtabsnavigationfailedpostbacks = getCustomTabsNavigationFailedPostbacks.onNavigationEvent;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsNavigationFailedPostbacks.onExtraCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 869608450, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -869608449, new Object[]{getcustomtabsnavigationfailedpostbacks}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback())).intValue());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.onExtraCallbackWithResult());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsNavigationFailedPostbacks.onExtraCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -721042003, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 721042006, new Object[]{getcustomtabsnavigationfailedpostbacks}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback())).intValue());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.onNavigationEvent());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.onWarmupCompleted());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.asBinder());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.IAuthTabCallbackDefault());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.asInterface());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.onTransact());
        IAuthTabCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsNavigationFailedPostbacks.onExtraCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -846513746, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 846513748, new Object[]{getcustomtabsnavigationfailedpostbacks}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback())).intValue());
        access100 = ByteOrderedDataOutputStream.onExtraCallback(((Integer) getCustomTabsNavigationFailedPostbacks.onExtraCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1178504136, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1178504136, new Object[]{getcustomtabsnavigationfailedpostbacks}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback())).intValue());
        getInterfaceDescriptor = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.IAuthTabCallback_Parcel());
        IAuthTabCallback_Parcel = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.access000());
        access000 = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.getInterfaceDescriptor());
        extraCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.access100());
        ICustomTabsCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.writeTypedObject());
        readTypedObject = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.ICustomTabsCallback());
        extraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.extraCallbackWithResult());
        writeTypedObject = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.readTypedObject());
        onMinimized = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.extraCallback());
        onActivityResized = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.onMinimized());
        onActivityLayout = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.onActivityLayout());
        onPostMessage = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.onPostMessage());
        onMessageChannelReady = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfailedpostbacks.onMessageChannelReady());
        int i = onUnminimized + 3;
        onRelationshipValidationResult = i % 128;
        int i2 = i % 2;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 5;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 11;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 43;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback;
        int i5 = i3 + 81;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 33;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onExtraCallback;
        int i4 = i3 + 51;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 55;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = IAuthTabCallbackStub;
        int i4 = i3 + 103;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 47;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        long j = onTransact;
        int i5 = i3 + 51;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 49;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = asBinder;
        int i4 = i3 + 21;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return Long.valueOf(j);
        }
        int i5 = 27 / 0;
        return Long.valueOf(j);
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 41;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface;
        }
        int i3 = 85 / 0;
        return asInterface;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 119;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallbackStubProxy;
        int i5 = i2 + 53;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallbackStubProxy() {
        long j;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 51;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            j = access100;
            int i4 = 90 / 0;
        } else {
            j = access100;
        }
        int i5 = i2 + 27;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return j;
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 91;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        long j = getInterfaceDescriptor;
        int i5 = i3 + 43;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 67;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback_Parcel;
        int i5 = i2 + 21;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 87;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = access000;
        int i4 = i2 + 33;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 89;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        long j = extraCallback;
        int i5 = i3 + 79;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 39;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        long j = ICustomTabsCallback;
        int i5 = i3 + 19;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return j;
    }

    public final long extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 85;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 87;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = writeTypedObject;
        int i5 = i2 + 13;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 81;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onMinimized;
        }
        throw null;
    }

    public final long onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 53;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = onActivityResized;
        int i5 = i2 + 99;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onActivityLayout() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 67;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityLayout;
        }
        throw null;
    }

    public final long onActivityResized() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 113;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onMinimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 91;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onMessageChannelReady;
        }
        throw null;
    }

    public final long asBinder() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Long) IAuthTabCallback(iOnExtraCallback, -1264008384, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, 1264008385)).longValue();
    }

    public final long IAuthTabCallbackStub() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Long) IAuthTabCallback(iOnExtraCallback, -163787911, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, 163787914)).longValue();
    }

    public final long access000() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Long) IAuthTabCallback(iOnExtraCallback, -1805298373, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, 1805298375)).longValue();
    }

    public final long extraCallbackWithResult() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Long) IAuthTabCallback(iOnExtraCallback, 1867881842, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, -1867881842)).longValue();
    }
}
