package o;

import im.toss.features.edoc.register.AptPasswordActivity$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y5c {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ y5b IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i, Object obj) {
        long jOnExtraCallback;
        long jIAuthTabCallback;
        long jOnNavigationEvent;
        long jLongValue;
        long j14;
        long j15;
        long jLongValue2;
        long j16;
        long jIAuthTabCallback_Parcel;
        long j17;
        long jAccess100;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onNavigationEvent + 51;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            jOnExtraCallback = isAdViewAd.onNavigationEvent.onExtraCallback();
        } else {
            jOnExtraCallback = j;
        }
        if ((i & 2) != 0) {
            jIAuthTabCallback = isAdViewAd.onNavigationEvent.IAuthTabCallback();
            int i5 = onWarmupCompleted + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            jIAuthTabCallback = j2;
        }
        long jOnWarmupCompleted = (i & 4) != 0 ? isAdViewAd.onNavigationEvent.onWarmupCompleted() : j3;
        if ((i & 8) != 0) {
            int i7 = onWarmupCompleted + 63;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                isAdViewAd.onNavigationEvent.onNavigationEvent();
                throw null;
            }
            jOnNavigationEvent = isAdViewAd.onNavigationEvent.onNavigationEvent();
        } else {
            jOnNavigationEvent = j4;
        }
        long jOnExtraCallbackWithResult = (i & 16) != 0 ? isAdViewAd.onNavigationEvent.onExtraCallbackWithResult() : j5;
        if ((i & 32) != 0) {
            jLongValue = ((Long) isAdViewAd.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), -730533361, 730533362, setCurrentIndex.onNavigationEvent(), new Object[]{isAdViewAd.onNavigationEvent}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).longValue();
            int i8 = onNavigationEvent + 29;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        } else {
            jLongValue = j6;
        }
        if ((i & 64) != 0) {
            int i10 = onWarmupCompleted + 29;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            long jAsBinder = isAdViewAd.onNavigationEvent.asBinder();
            int i12 = onNavigationEvent + 73;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            j14 = jAsBinder;
        } else {
            j14 = j7;
        }
        long jOnTransact = (i & 128) != 0 ? isAdViewAd.onNavigationEvent.onTransact() : j8;
        if ((i & 256) != 0) {
            int i14 = onWarmupCompleted + 71;
            j15 = j14;
            onNavigationEvent = i14 % 128;
            if (i14 % 2 != 0) {
                jLongValue2 = ((Long) isAdViewAd.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 312913617, -312913617, setCurrentIndex.onNavigationEvent(), new Object[]{isAdViewAd.onNavigationEvent}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).longValue();
                int i15 = 42 / 0;
            } else {
                jLongValue2 = ((Long) isAdViewAd.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 312913617, -312913617, setCurrentIndex.onNavigationEvent(), new Object[]{isAdViewAd.onNavigationEvent}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).longValue();
            }
        } else {
            j15 = j14;
            jLongValue2 = j9;
        }
        long jIAuthTabCallbackStub = (i & 512) != 0 ? isAdViewAd.onNavigationEvent.IAuthTabCallbackStub() : j10;
        if ((i & 1024) != 0) {
            int i16 = onNavigationEvent + 111;
            j16 = jLongValue2;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
            jIAuthTabCallback_Parcel = isAdViewAd.onNavigationEvent.IAuthTabCallback_Parcel();
        } else {
            j16 = jLongValue2;
            jIAuthTabCallback_Parcel = j11;
        }
        if ((i & 2048) != 0) {
            int i18 = onWarmupCompleted + 71;
            j17 = jIAuthTabCallback_Parcel;
            onNavigationEvent = i18 % 128;
            if (i18 % 2 != 0) {
                jAccess100 = isAdViewAd.onNavigationEvent.access100();
                int i19 = 49 / 0;
            } else {
                jAccess100 = isAdViewAd.onNavigationEvent.access100();
            }
        } else {
            j17 = jIAuthTabCallback_Parcel;
            jAccess100 = j12;
        }
        return onNavigationEvent(jOnExtraCallback, jIAuthTabCallback, jOnWarmupCompleted, jOnNavigationEvent, jOnExtraCallbackWithResult, jLongValue, j15, jOnTransact, j16, jIAuthTabCallbackStub, j17, jAccess100, (i & 4096) != 0 ? isAdViewAd.onNavigationEvent.IAuthTabCallbackStubProxy() : j13);
    }

    public static final y5b onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        int i = 2 % 2;
        y5b y5bVar = new y5b(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, null);
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return y5bVar;
    }

    public static /* synthetic */ y5b onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i, Object obj) {
        long jLongValue;
        long jOnWarmupCompleted;
        long jOnExtraCallback;
        long j14;
        long jIAuthTabCallbackDefault;
        long j15;
        long jOnTransact;
        long j16;
        long jLongValue2;
        int i2 = 2 % 2;
        long jOnNavigationEvent = (i & 1) != 0 ? MaxAdFormat.onExtraCallbackWithResult.onNavigationEvent() : j;
        if ((i & 2) != 0) {
            jLongValue = ((Long) MaxAdFormat.IAuthTabCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1172882447, -1172882446, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), new Object[]{MaxAdFormat.onExtraCallbackWithResult}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).longValue();
        } else {
            jLongValue = j2;
        }
        long jOnExtraCallbackWithResult = (i & 4) != 0 ? MaxAdFormat.onExtraCallbackWithResult.onExtraCallbackWithResult() : j3;
        if ((i & 8) != 0) {
            int i3 = onWarmupCompleted + 29;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            jOnWarmupCompleted = MaxAdFormat.onExtraCallbackWithResult.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j4;
        }
        if ((i & 16) != 0) {
            int i5 = onNavigationEvent + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            jOnExtraCallback = MaxAdFormat.onExtraCallbackWithResult.onExtraCallback();
        } else {
            jOnExtraCallback = j5;
        }
        long jIAuthTabCallbackStub = (i & 32) != 0 ? MaxAdFormat.onExtraCallbackWithResult.IAuthTabCallbackStub() : j6;
        long jAsInterface = (i & 64) != 0 ? MaxAdFormat.onExtraCallbackWithResult.asInterface() : j7;
        long jAsBinder = (i & 128) != 0 ? MaxAdFormat.onExtraCallbackWithResult.asBinder() : j8;
        Object obj2 = null;
        if ((i & 256) != 0) {
            int i7 = onNavigationEvent + 105;
            j14 = jAsInterface;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                MaxAdFormat.onExtraCallbackWithResult.IAuthTabCallbackDefault();
                obj2.hashCode();
                throw null;
            }
            jIAuthTabCallbackDefault = MaxAdFormat.onExtraCallbackWithResult.IAuthTabCallbackDefault();
        } else {
            j14 = jAsInterface;
            jIAuthTabCallbackDefault = j9;
        }
        if ((i & 512) != 0) {
            int i8 = onWarmupCompleted + 125;
            j15 = jIAuthTabCallbackDefault;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                MaxAdFormat.onExtraCallbackWithResult.onTransact();
                throw null;
            }
            jOnTransact = MaxAdFormat.onExtraCallbackWithResult.onTransact();
        } else {
            j15 = jIAuthTabCallbackDefault;
            jOnTransact = j10;
        }
        long interfaceDescriptor = (i & 1024) != 0 ? MaxAdFormat.onExtraCallbackWithResult.getInterfaceDescriptor() : j11;
        if ((i & 2048) != 0) {
            int i9 = onNavigationEvent + 91;
            j16 = jOnTransact;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            jLongValue2 = ((Long) MaxAdFormat.IAuthTabCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 731757703, -731757703, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), new Object[]{MaxAdFormat.onExtraCallbackWithResult}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).longValue();
        } else {
            j16 = jOnTransact;
            jLongValue2 = j12;
        }
        return IAuthTabCallback(jOnNavigationEvent, jLongValue, jOnExtraCallbackWithResult, jOnWarmupCompleted, jOnExtraCallback, jIAuthTabCallbackStub, j14, jAsBinder, j15, j16, interfaceDescriptor, jLongValue2, (i & 4096) != 0 ? MaxAdFormat.onExtraCallbackWithResult.access000() : j13);
    }

    public static final y5b IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        int i = 2 % 2;
        y5b y5bVar = new y5b(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, null);
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return y5bVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
