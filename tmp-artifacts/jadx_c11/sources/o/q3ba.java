package o;

import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class q3ba {
    private static int asBinder = 1;
    private static int onWarmupCompleted;
    private final q3bb onExtraCallback = new q3bb();
    private final q3bb onExtraCallbackWithResult = new q3bb();
    private final AtomicInteger onNavigationEvent = new AtomicInteger(0);
    private final AtomicInteger IAuthTabCallback = new AtomicInteger(0);

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i6);
        int i10 = (~i6) | (~((~i3) | i));
        int i11 = (~(i6 | i3)) | (~(i7 | i6)) | (~i8);
        int i12 = i + i3 + i2 + ((-953487067) * i5) + ((-1992133889) * i4);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i2) + ((-1703411712) * i5) + (1961361408 * i4) + (907935744 * i13);
        int i15 = ((i * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i2 * 272662391) + (i5 * 2077717299) + (i4 * 1957688713) + (i13 * 166854656);
        return i14 + ((i15 * i15) * (-213778432)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.IAuthTabCallback();
        if (z) {
            int i4 = onWarmupCompleted + 39;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallbackWithResult.IAuthTabCallback();
        }
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        this.onExtraCallback.onExtraCallback();
        if (z) {
            int i2 = asBinder + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.onExtraCallback();
            int i4 = asBinder + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 4;
            }
        }
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.onNavigationEvent();
            int i3 = 4 / 0;
            if (!z) {
                return;
            }
        } else {
            this.onExtraCallback.onNavigationEvent();
            if (!z) {
                return;
            }
        }
        int i4 = onWarmupCompleted + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.onExtraCallbackWithResult.onNavigationEvent();
        int i6 = asBinder + 71;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.incrementAndGet();
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        q3ba q3baVar = (q3ba) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            q3baVar.onExtraCallback.IAuthTabCallback(iIntValue);
            q3baVar.onExtraCallbackWithResult.IAuthTabCallback(iIntValue2);
            return null;
        }
        q3baVar.onExtraCallback.IAuthTabCallback(iIntValue);
        q3baVar.onExtraCallbackWithResult.IAuthTabCallback(iIntValue2);
        throw null;
    }

    public final void onWarmupCompleted(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.onExtraCallback.onExtraCallback(i);
        this.onExtraCallbackWithResult.onExtraCallback(i2);
        int i6 = asBinder + 117;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 46 / 0;
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallback.incrementAndGet();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.IAuthTabCallback.incrementAndGet();
        int i3 = asBinder + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        q3ba q3baVar = (q3ba) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        q3baVar.onNavigationEvent();
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull q3bf q3bfVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(q3bfVar, "");
        this.onExtraCallback.onExtraCallbackWithResult(q3bfVar.onExtraCallback());
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(q3bfVar.onExtraCallbackWithResult());
        this.onNavigationEvent.addAndGet(q3bfVar.onNavigationEvent());
        this.IAuthTabCallback.addAndGet(q3bfVar.IAuthTabCallback());
        int i4 = asBinder + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final q3bf onNavigationEvent() {
        int i = 2 % 2;
        q3bf q3bfVar = new q3bf(this.onExtraCallback.onExtraCallbackWithResult(), this.onExtraCallbackWithResult.onExtraCallbackWithResult(), this.onNavigationEvent.getAndSet(0), this.IAuthTabCallback.getAndSet(0));
        int i2 = asBinder + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
        return q3bfVar;
    }

    public final void onExtraCallback(int i, int i2) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallbackWithResult(objArr, -151641000, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 151641000, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
    }

    public final void onExtraCallback() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallbackWithResult(new Object[]{this}, -62203302, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 62203303, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
    }
}
