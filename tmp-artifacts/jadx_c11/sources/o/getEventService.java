package o;

import android.view.animation.Interpolator;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class getEventService {
    private static int asBinder = 1;
    private static int asInterface;
    private Boolean IAuthTabCallback;
    private Interpolator IAuthTabCallbackDefault;
    private Integer IAuthTabCallbackStub;
    private int onExtraCallback = Integer.MIN_VALUE;
    private isFireOS<?> onExtraCallbackWithResult;
    private Integer onNavigationEvent;
    private boolean onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~((~i6) | i7);
        int i9 = (~i3) | (~(i7 | i6));
        int i10 = i6 | i3 | i7;
        int i11 = i3 + i4 + i + (1635157569 * i2) + ((-1141649966) * i5);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i3) - 711983104) + (488484398 * i4) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i) + (1462763520 * i2) + (1566572544 * i5) + (1631846400 * i12);
        int i14 = (i3 * 1521345644) + 2088555610 + (i4 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i * 1521345871) + (i2 * (-1382509809)) + (i5 * 37969358) + (i12 * (-671350784));
        return i13 + ((i14 * i14) * (-1069809664)) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public abstract int onWarmupCompleted();

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getEventService geteventservice = (getEventService) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 7;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        isFireOS<?> isfireos = geteventservice.onExtraCallbackWithResult;
        int i5 = i3 + 93;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return isfireos;
        }
        throw null;
    }

    public final Integer asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.IAuthTabCallbackStub;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return num;
    }

    public final void onExtraCallbackWithResult(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = num;
        if (i4 != 0) {
            int i5 = 28 / 0;
        }
        int i6 = i3 + 17;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getEventService geteventservice = (getEventService) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = geteventservice.IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return interpolator;
    }

    public final Integer onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final Boolean asInterface() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 1;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.IAuthTabCallback;
        int i5 = i2 + 119;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return bool;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i3 + 29;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 69;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = z;
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = i2 + 13;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 103;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.onExtraCallback = i;
        int i6 = i4 + 43;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i2 + 43;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@Nullable isFireOS<?> isfireos, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult = isfireos;
            this.IAuthTabCallbackDefault = interpolator;
            int i4 = 1 / 0;
            if (interpolator instanceof deprecated_dns) {
                if (num == null) {
                    this.onNavigationEvent = Integer.valueOf(((deprecated_dns) interpolator).IAuthTabCallback());
                    return;
                }
            } else if ((interpolator instanceof AppLovinWebViewActivityaExternalSyntheticLambda0) && num == null) {
                int i5 = i3 + 65;
                asBinder = i5 % 128;
                this.onNavigationEvent = Integer.valueOf(i5 % 2 == 0 ? 17491 : 1000);
                return;
            }
        } else {
            this.onExtraCallbackWithResult = isfireos;
            this.IAuthTabCallbackDefault = interpolator;
            if (interpolator instanceof deprecated_dns) {
            }
        }
        this.onNavigationEvent = num;
        this.IAuthTabCallback = bool;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.IAuthTabCallbackStub;
        if (num != null) {
            return num.intValue();
        }
        int iOnWarmupCompleted = onWarmupCompleted();
        if (this.onWarmupCompleted) {
            this.IAuthTabCallbackStub = Integer.valueOf(iOnWarmupCompleted);
        }
        int i3 = asBinder + 29;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 69 / 0;
        }
        return iOnWarmupCompleted;
    }

    public final isFireOS<?> onExtraCallbackWithResult() {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (isFireOS) onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), new Object[]{this}, TransactionFilterLocal.Companion.onNavigationEvent(), -2087232796, 2087232797, TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent);
    }

    public final Interpolator IAuthTabCallbackDefault() {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Interpolator) onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), new Object[]{this}, TransactionFilterLocal.Companion.onNavigationEvent(), 431304752, -431304752, TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent);
    }
}
