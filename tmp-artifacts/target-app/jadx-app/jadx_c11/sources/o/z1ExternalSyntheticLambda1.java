package o;

import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z1ExternalSyntheticLambda1 {
    private static int ICustomTabsCallbackStub = 1;
    private static int onActivityLayout;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final long IAuthTabCallback_Parcel;
    private final long ICustomTabsCallback;
    private final long access000;
    private final long access100;
    private final long asBinder;
    private final long asInterface;
    private final long extraCallback;
    private final long extraCallbackWithResult;
    private final long getInterfaceDescriptor;
    private final long onActivityResized;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onMessageChannelReady;
    private final long onMinimized;
    private final long onNavigationEvent;
    private final long onPostMessage;
    private final long onTransact;
    private final long onWarmupCompleted;
    private final long readTypedObject;
    private final long writeTypedObject;

    public /* synthetic */ z1ExternalSyntheticLambda1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i | i6);
        int i8 = ~i;
        int i9 = (~(i8 | i6)) | (~((~i6) | i5));
        int i10 = (~(i6 | (~i5))) | i8;
        int i11 = i5 + i + i2 + ((-2044576983) * i4) + (1743660113 * i3);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i5) - 713031680) + (164951516 * i) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i2) + (689963008 * i4) + ((-299892736) * i3) + ((-1081737216) * i12);
        int i14 = ((i5 * 2048727874) - 782056376) + (i * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i2 * 2048728315) + (i4 * 2142076211) + (i3 * (-1448904853)) + (i12 * 1885470720);
        int i15 = i13 + (i14 * i14 * (-1618345984));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private z1ExternalSyntheticLambda1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24) {
        this.onExtraCallback = j;
        this.onExtraCallbackWithResult = j2;
        this.IAuthTabCallback = j3;
        this.onNavigationEvent = j4;
        this.onWarmupCompleted = j5;
        this.onTransact = j6;
        this.IAuthTabCallbackStub = j7;
        this.IAuthTabCallbackDefault = j8;
        this.asInterface = j9;
        this.asBinder = j10;
        this.getInterfaceDescriptor = j11;
        this.access100 = j12;
        this.IAuthTabCallback_Parcel = j13;
        this.access000 = j14;
        this.IAuthTabCallbackStubProxy = j15;
        this.ICustomTabsCallback = j16;
        this.extraCallback = j17;
        this.readTypedObject = j18;
        this.extraCallbackWithResult = j19;
        this.writeTypedObject = j20;
        this.onActivityResized = j21;
        this.onPostMessage = j22;
        this.onMessageChannelReady = j23;
        this.onMinimized = j24;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        z1ExternalSyntheticLambda1 z1externalsyntheticlambda1 = (z1ExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 31;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        long j = z1externalsyntheticlambda1.onExtraCallback;
        int i5 = i3 + 111;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        z1ExternalSyntheticLambda1 z1externalsyntheticlambda1 = (z1ExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 15;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        long j = z1externalsyntheticlambda1.onExtraCallbackWithResult;
        int i5 = i2 + 59;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 55;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i2 + 51;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 71;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.onNavigationEvent;
        int i4 = i3 + 25;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 71;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 121;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 35;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onTransact;
        }
        int i3 = 38 / 0;
        return this.onTransact;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 55;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallbackStub;
        int i5 = i3 + 99;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 83;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.IAuthTabCallbackDefault;
        int i4 = i2 + 43;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return j;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 117;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        long j = this.asInterface;
        int i5 = i3 + 91;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 73;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asBinder;
        }
        throw null;
    }

    public final long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 73;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.getInterfaceDescriptor;
        int i5 = i3 + 83;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 79;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        long j = this.access100;
        int i5 = i3 + 117;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 71;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 59;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 15;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.access000;
        int i5 = i3 + 91;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 15;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStubProxy;
        }
        int i3 = 2 / 0;
        return this.IAuthTabCallbackStubProxy;
    }

    public final long extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 11;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        long j = this.ICustomTabsCallback;
        int i5 = i3 + 41;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 45;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.extraCallback;
        int i4 = i3 + 33;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        long j;
        z1ExternalSyntheticLambda1 z1externalsyntheticlambda1 = (z1ExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            j = z1externalsyntheticlambda1.readTypedObject;
            int i3 = 50 / 0;
        } else {
            j = z1externalsyntheticlambda1.readTypedObject;
        }
        return Long.valueOf(j);
    }

    public final long writeTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 125;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.extraCallbackWithResult;
        int i5 = i3 + 101;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 95;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        long j = this.writeTypedObject;
        int i5 = i2 + 33;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return j;
    }

    public final long onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 35;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onActivityResized;
        }
        throw null;
    }

    public final long onActivityResized() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 3;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        z1ExternalSyntheticLambda1 z1externalsyntheticlambda1 = (z1ExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        long j = z1externalsyntheticlambda1.onMessageChannelReady;
        if (i4 == 0) {
            int i5 = 37 / 0;
        }
        int i6 = i3 + 35;
        onActivityLayout = i6 % 128;
        int i7 = i6 % 2;
        return Long.valueOf(j);
    }

    public final long onMinimized() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 83;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.onMinimized;
        int i4 = i2 + 57;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Long) onWarmupCompleted(2057822330, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2057822328, iIAuthTabCallback)).longValue();
    }

    public final long onExtraCallback() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Long) onWarmupCompleted(853738281, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -853738281, iIAuthTabCallback)).longValue();
    }

    public final long extraCallback() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Long) onWarmupCompleted(303341694, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -303341693, iIAuthTabCallback)).longValue();
    }

    public final long onPostMessage() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Long) onWarmupCompleted(808675825, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -808675822, iIAuthTabCallback)).longValue();
    }
}
