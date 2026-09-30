package o;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class realm {
    private static final accessgetORDER_BY_NAMEcp IAuthTabCallback;
    private static final accessgetORDER_BY_NAMEcp IAuthTabCallbackDefault;
    private static final accessgetORDER_BY_NAMEcp IAuthTabCallbackStub;
    private static final accessgetORDER_BY_NAMEcp IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int access100;
    private static final accessgetORDER_BY_NAMEcp asBinder;
    private static final accessgetORDER_BY_NAMEcp asInterface;
    private static int getInterfaceDescriptor;
    public static final realm onExtraCallback = new realm();
    private static final accessgetORDER_BY_NAMEcp onExtraCallbackWithResult;
    private static final accessgetORDER_BY_NAMEcp onNavigationEvent;
    private static final accessgetORDER_BY_NAMEcp onTransact;
    private static final accessgetORDER_BY_NAMEcp onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i6 | i5)) | (~(i7 | i9));
        int i12 = ~(i9 | i4 | i5);
        int i13 = i4 + i5 + i3 + ((-194346734) * i) + (9035316 * i2);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i4) - 443744256) + ((-1492047866) * i5) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i3) + (1190920192 * i) + (1456996352 * i2) + ((-1774911488) * i14);
        int i16 = (i4 * 1174986172) + 1294669563 + (i5 * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (i3 * 1174986385) + (i * (-1060063438)) + (i2 * 107475828) + (i14 * 168099840);
        return i15 + ((i16 * i16) * 40566784) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private realm() {
    }

    public final accessgetORDER_BY_NAMEcp onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 109;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = onWarmupCompleted;
        int i5 = i3 + 43;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return accessgetorder_by_namecp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        deprecated_scheme deprecated_schemeVar = deprecated_scheme.onExtraCallbackWithResult;
        int iICustomTabsServiceDefault = deprecated_schemeVar.ICustomTabsServiceDefault();
        matchesCertificate matchescertificate = matchesCertificate.onExtraCallback;
        onWarmupCompleted = new accessgetORDER_BY_NAMEcp(0.0f, 18.0f, 80.0f, 4.0f, new scheme(iICustomTabsServiceDefault, matchescertificate.ICustomTabsServiceDefault()));
        onExtraCallbackWithResult = new accessgetORDER_BY_NAMEcp(0.0f, 12.0f, 40.0f, 4.0f, new scheme(deprecated_schemeVar.ICustomTabsServiceDefault(), matchescertificate.ICustomTabsServiceDefault()));
        IAuthTabCallback = new accessgetORDER_BY_NAMEcp(0.0f, 16.0f, 60.0f, 0.0f, new scheme(deprecated_schemeVar.ICustomTabsServiceStub(), matchescertificate.ICustomTabsServiceStub()));
        onNavigationEvent = new accessgetORDER_BY_NAMEcp(0.0f, -16.0f, 60.0f, 0.0f, new scheme(deprecated_schemeVar.ICustomTabsServiceStub(), matchescertificate.ICustomTabsServiceStub()));
        IAuthTabCallbackDefault = new accessgetORDER_BY_NAMEcp(0.0f, 2.0f, 4.0f, 0.0f, new scheme(deprecated_schemeVar.ICustomTabsServiceDefault(), matchescertificate.ICustomTabsServiceDefault()));
        IAuthTabCallbackStub = new accessgetORDER_BY_NAMEcp(0.0f, 1.0f, 3.0f, 0.0f, new scheme(deprecated_schemeVar.warmup(), matchescertificate.validateRelationship()));
        onTransact = new accessgetORDER_BY_NAMEcp(0.0f, -1.0f, 3.0f, 0.0f, new scheme(deprecated_schemeVar.warmup(), matchescertificate.validateRelationship()));
        asInterface = new accessgetORDER_BY_NAMEcp(0.0f, 2.0f, 30.0f, 0.0f, new scheme(deprecated_schemeVar.updateVisuals(), matchescertificate.warmup()));
        asBinder = new accessgetORDER_BY_NAMEcp(0.0f, -2.0f, 30.0f, 0.0f, new scheme(deprecated_schemeVar.updateVisuals(), matchescertificate.warmup()));
        IAuthTabCallbackStubProxy = new accessgetORDER_BY_NAMEcp(0.0f, 1.0f, 3.0f, 0.0f, new scheme(deprecated_schemeVar.ICustomTabsServiceDefault(), matchescertificate.ICustomTabsServiceDefault()));
        int i = getInterfaceDescriptor + 91;
        access000 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 73;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = onExtraCallbackWithResult;
        int i5 = i2 + 111;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return accessgetorder_by_namecp;
        }
        throw null;
    }

    public final accessgetORDER_BY_NAMEcp onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = IAuthTabCallback;
        int i4 = i3 + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return accessgetorder_by_namecp;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = onNavigationEvent;
        int i5 = i3 + 35;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return accessgetorder_by_namecp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final accessgetORDER_BY_NAMEcp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return accessgetorder_by_namecp;
    }

    public final accessgetORDER_BY_NAMEcp onTransact() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 121;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = IAuthTabCallbackStub;
        int i5 = i2 + 69;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return accessgetorder_by_namecp;
    }

    public final accessgetORDER_BY_NAMEcp IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = onTransact;
        int i5 = i3 + 49;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return accessgetorder_by_namecp;
    }

    public final accessgetORDER_BY_NAMEcp asInterface() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 23;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = asInterface;
        int i5 = i2 + 43;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return accessgetorder_by_namecp;
    }

    public final accessgetORDER_BY_NAMEcp IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100 + 59;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = asBinder;
        int i5 = i3 + 39;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return accessgetorder_by_namecp;
    }

    public final accessgetORDER_BY_NAMEcp asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = IAuthTabCallbackStubProxy;
        int i5 = i3 + 49;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return accessgetorder_by_namecp;
    }

    public final accessgetORDER_BY_NAMEcp onExtraCallback() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (accessgetORDER_BY_NAMEcp) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, 151101192, -151101192, iIAuthTabCallback);
    }

    public final accessgetORDER_BY_NAMEcp IAuthTabCallback() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (accessgetORDER_BY_NAMEcp) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, 1720841096, -1720841095, iIAuthTabCallback);
    }
}
