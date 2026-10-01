package o;

import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxNetworkResponseInfoAdLoadState {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static final long IAuthTabCallbackStub;
    private static final long IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static final long asBinder;
    private static final long asInterface;
    private static int getInterfaceDescriptor = 1;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static final long onTransact;
    public static final MaxNetworkResponseInfoAdLoadState onWarmupCompleted = new MaxNetworkResponseInfoAdLoadState();

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i3) | i5);
        int i8 = ~((~i5) | i6);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i6) | i5));
        int i11 = i5 + i6 + i2 + (762724209 * i) + (1201824936 * i4);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i5) + 43253760 + (1339426419 * i6) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i2) + (1302855680 * i) + (1514143744 * i4) + (1905524736 * i12);
        int i14 = ((i5 * 162561953) - 555857873) + (i6 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i2 * 162560975) + (i * 701011807) + (i4 * 237771736) + (i12 * (-223608832));
        return i13 + ((i14 * i14) * 703332352) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private MaxNetworkResponseInfoAdLoadState() {
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 53;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback;
        int i5 = i2 + 45;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    static {
        bExternalSyntheticLambda8 bexternalsyntheticlambda8 = bExternalSyntheticLambda8.onExtraCallback;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(((Integer) bExternalSyntheticLambda8.onNavigationEvent(new Object[]{bexternalsyntheticlambda8}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1366622936, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1366622937)).intValue());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda8.onExtraCallbackWithResult());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda8.onWarmupCompleted());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda8.onNavigationEvent());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda8.onExtraCallback());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda8.IAuthTabCallbackDefault());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda8.IAuthTabCallbackStub());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda8.asBinder());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(((Integer) bExternalSyntheticLambda8.onNavigationEvent(new Object[]{bexternalsyntheticlambda8}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1077842404, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1077842404)).intValue());
        IAuthTabCallbackStubProxy = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda8.onTransact());
        int i = getInterfaceDescriptor + 125;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 15;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 105;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 93;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i2 + 35;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(j);
        }
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 27;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 69;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallbackDefault;
        int i5 = i2 + 113;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return j;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 91;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        long j = asInterface;
        int i5 = i3 + 115;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 17;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        long j = asBinder;
        int i5 = i2 + 23;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 79;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub;
        }
        int i3 = 17 / 0;
        return IAuthTabCallbackStub;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        long j = onTransact;
        int i5 = i3 + 57;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 39;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallbackStubProxy;
        int i5 = i2 + 89;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return ((Long) onExtraCallbackWithResult(new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), -1611684298, 1611684299)).longValue();
    }

    public final long IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return ((Long) onExtraCallbackWithResult(new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), -492262740, 492262740)).longValue();
    }
}
