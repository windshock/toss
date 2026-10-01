package o;

import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class supportedSpec {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    public static final supportedSpec onNavigationEvent = new supportedSpec();
    public static final int onWarmupCompleted = 8;

    static {
        int i = asInterface + 5;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = (~(i7 | i4)) | i3;
        int i9 = ~i4;
        int i10 = i7 | i3;
        int i11 = (~(i6 | i9 | i3)) | (~(i10 | i4));
        int i12 = (~i10) | (~(i9 | (~i3)));
        int i13 = i3 + i4 + i2 + (1353909401 * i) + ((-1351514252) * i5);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i3) + 799145984 + ((-1483212659) * i4) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i2) + (337379328 * i) + ((-1540358144) * i5) + (669122560 * i14);
        int i16 = ((i3 * 521834465) - 1171472169) + (i4 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i2 * 521834041) + (i * 1123214353) + (i5 * (-684621612)) + (i14 * 1028784128);
        return i15 + ((i16 * i16) * 1635647488) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    private supportedSpec() {
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 27;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 1;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 17;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onExtraCallback;
        int i6 = i2 + 61;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 72 / 0;
        }
        return i5;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = IAuthTabCallbackStub;
        int i6 = i3 + 91;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 59;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        IAuthTabCallbackStub = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 37;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel;
        int i4 = i3 + 23;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            i = IAuthTabCallback;
            int i5 = 97 / 0;
        } else {
            i = IAuthTabCallback;
        }
        int i6 = i3 + 61;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 65;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback = i;
        int i6 = i3 + 21;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 65;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        onExtraCallbackWithResult = i;
        int i6 = i4 + 23;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 0 / 0;
        }
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onExtraCallbackWithResult;
        if (i3 != 0) {
            int i5 = 97 / 0;
        }
        return i4;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault = iIntValue;
        if (i3 != 0) {
            return null;
        }
        int i4 = 23 / 0;
        return null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = IAuthTabCallbackDefault;
        int i6 = i2 + 23;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback = 0;
            IAuthTabCallbackDefault = 1;
            return null;
        }
        IAuthTabCallback = 0;
        IAuthTabCallbackDefault = 0;
        return null;
    }

    public final void IAuthTabCallbackStub() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1099007014, 1099007015, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, new Object[]{this});
    }

    public final void onNavigationEvent(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1214765033, 1214765033, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, objArr);
    }
}
