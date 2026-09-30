package o;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.Arrays;
import o.PagerMeasureKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerKtExternalSyntheticLambda7 {
    private static final PagerKtExternalSyntheticLambda7 onNavigationEvent = new PagerKtExternalSyntheticLambda7(0, new int[0], new Object[0], false);
    private int IAuthTabCallback;
    private int[] asBinder;
    private Object[] onExtraCallback;
    private int onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    public static PagerKtExternalSyntheticLambda7 onNavigationEvent() {
        return onNavigationEvent;
    }

    static PagerKtExternalSyntheticLambda7 onWarmupCompleted() {
        return new PagerKtExternalSyntheticLambda7();
    }

    static PagerKtExternalSyntheticLambda7 IAuthTabCallback(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7, PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda72) {
        int i2 = pagerKtExternalSyntheticLambda7.IAuthTabCallback + pagerKtExternalSyntheticLambda72.IAuthTabCallback;
        int[] iArrCopyOf = Arrays.copyOf(pagerKtExternalSyntheticLambda7.asBinder, i2);
        System.arraycopy(pagerKtExternalSyntheticLambda72.asBinder, 0, iArrCopyOf, pagerKtExternalSyntheticLambda7.IAuthTabCallback, pagerKtExternalSyntheticLambda72.IAuthTabCallback);
        Object[] objArrCopyOf = Arrays.copyOf(pagerKtExternalSyntheticLambda7.onExtraCallback, i2);
        System.arraycopy(pagerKtExternalSyntheticLambda72.onExtraCallback, 0, objArrCopyOf, pagerKtExternalSyntheticLambda7.IAuthTabCallback, pagerKtExternalSyntheticLambda72.IAuthTabCallback);
        return new PagerKtExternalSyntheticLambda7(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private PagerKtExternalSyntheticLambda7() {
        this(0, new int[8], new Object[8], true);
    }

    private PagerKtExternalSyntheticLambda7(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.onExtraCallbackWithResult = -1;
        this.IAuthTabCallback = i2;
        this.asBinder = iArr;
        this.onExtraCallback = objArr;
        this.onWarmupCompleted = z;
    }

    public void asInterface() {
        if (this.onWarmupCompleted) {
            this.onWarmupCompleted = false;
        }
    }

    void IAuthTabCallback() {
        if (!this.onWarmupCompleted) {
            throw new UnsupportedOperationException();
        }
    }

    void onNavigationEvent(PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        if (pagerMeasureKtExternalSyntheticLambda3.onExtraCallback() == PagerMeasureKtExternalSyntheticLambda3.onNavigationEvent.DESCENDING) {
            for (int i2 = this.IAuthTabCallback - 1; i2 >= 0; i2--) {
                pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(PagerKtExternalSyntheticLambda6.onNavigationEvent(this.asBinder[i2]), this.onExtraCallback[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.IAuthTabCallback; i3++) {
            pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(PagerKtExternalSyntheticLambda6.onNavigationEvent(this.asBinder[i3]), this.onExtraCallback[i3]);
        }
    }

    public void onWarmupCompleted(PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        if (this.IAuthTabCallback != 0) {
            if (pagerMeasureKtExternalSyntheticLambda3.onExtraCallback() == PagerMeasureKtExternalSyntheticLambda3.onNavigationEvent.ASCENDING) {
                for (int i2 = 0; i2 < this.IAuthTabCallback; i2++) {
                    onNavigationEvent(this.asBinder[i2], this.onExtraCallback[i2], pagerMeasureKtExternalSyntheticLambda3);
                }
                return;
            }
            for (int i3 = this.IAuthTabCallback - 1; i3 >= 0; i3--) {
                onNavigationEvent(this.asBinder[i3], this.onExtraCallback[i3], pagerMeasureKtExternalSyntheticLambda3);
            }
        }
    }

    private static void onNavigationEvent(int i2, Object obj, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        int iOnNavigationEvent = PagerKtExternalSyntheticLambda6.onNavigationEvent(i2);
        int iOnExtraCallbackWithResult = PagerKtExternalSyntheticLambda6.onExtraCallbackWithResult(i2);
        if (iOnExtraCallbackWithResult == 0) {
            pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iOnNavigationEvent, ((Long) obj).longValue());
            return;
        }
        if (iOnExtraCallbackWithResult == 1) {
            pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iOnNavigationEvent, ((Long) obj).longValue());
            return;
        }
        if (iOnExtraCallbackWithResult == 2) {
            pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iOnNavigationEvent, (LazyLayoutKtExternalSyntheticLambda3) obj);
            return;
        }
        if (iOnExtraCallbackWithResult != 3) {
            if (iOnExtraCallbackWithResult == 5) {
                pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iOnNavigationEvent, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.IAuthTabCallback());
        }
        if (pagerMeasureKtExternalSyntheticLambda3.onExtraCallback() == PagerMeasureKtExternalSyntheticLambda3.onNavigationEvent.ASCENDING) {
            pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iOnNavigationEvent);
            ((PagerKtExternalSyntheticLambda7) obj).onWarmupCompleted(pagerMeasureKtExternalSyntheticLambda3);
            pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iOnNavigationEvent);
        } else {
            pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iOnNavigationEvent);
            ((PagerKtExternalSyntheticLambda7) obj).onWarmupCompleted(pagerMeasureKtExternalSyntheticLambda3);
            pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iOnNavigationEvent);
        }
    }

    public int onExtraCallbackWithResult() {
        int i2 = this.onExtraCallbackWithResult;
        if (i2 != -1) {
            return i2;
        }
        int iOnExtraCallbackWithResult = 0;
        for (int i3 = 0; i3 < this.IAuthTabCallback; i3++) {
            iOnExtraCallbackWithResult += CodedOutputStream.onExtraCallbackWithResult(PagerKtExternalSyntheticLambda6.onNavigationEvent(this.asBinder[i3]), (LazyLayoutKtExternalSyntheticLambda3) this.onExtraCallback[i3]);
        }
        this.onExtraCallbackWithResult = iOnExtraCallbackWithResult;
        return iOnExtraCallbackWithResult;
    }

    public int onExtraCallback() {
        int iOnNavigationEvent;
        int i2 = this.onExtraCallbackWithResult;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.IAuthTabCallback; i4++) {
            int i5 = this.asBinder[i4];
            int iOnNavigationEvent2 = PagerKtExternalSyntheticLambda6.onNavigationEvent(i5);
            int iOnExtraCallbackWithResult = PagerKtExternalSyntheticLambda6.onExtraCallbackWithResult(i5);
            if (iOnExtraCallbackWithResult == 0) {
                iOnNavigationEvent = CodedOutputStream.onNavigationEvent(iOnNavigationEvent2, ((Long) this.onExtraCallback[i4]).longValue());
            } else if (iOnExtraCallbackWithResult == 1) {
                iOnNavigationEvent = CodedOutputStream.onExtraCallback(iOnNavigationEvent2, ((Long) this.onExtraCallback[i4]).longValue());
            } else if (iOnExtraCallbackWithResult == 2) {
                iOnNavigationEvent = CodedOutputStream.onNavigationEvent(iOnNavigationEvent2, (LazyLayoutKtExternalSyntheticLambda3) this.onExtraCallback[i4]);
            } else if (iOnExtraCallbackWithResult == 3) {
                iOnNavigationEvent = (CodedOutputStream.asInterface(iOnNavigationEvent2) << 1) + ((PagerKtExternalSyntheticLambda7) this.onExtraCallback[i4]).onExtraCallback();
            } else if (iOnExtraCallbackWithResult == 5) {
                iOnNavigationEvent = CodedOutputStream.onExtraCallback(iOnNavigationEvent2, ((Integer) this.onExtraCallback[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.IAuthTabCallback());
            }
            i3 += iOnNavigationEvent;
        }
        this.onExtraCallbackWithResult = i3;
        return i3;
    }

    private static boolean onWarmupCompleted(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    private static boolean onWarmupCompleted(Object[] objArr, Object[] objArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (!objArr[i3].equals(objArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PagerKtExternalSyntheticLambda7)) {
            return false;
        }
        PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7 = (PagerKtExternalSyntheticLambda7) obj;
        int i2 = this.IAuthTabCallback;
        return i2 == pagerKtExternalSyntheticLambda7.IAuthTabCallback && onWarmupCompleted(this.asBinder, pagerKtExternalSyntheticLambda7.asBinder, i2) && onWarmupCompleted(this.onExtraCallback, pagerKtExternalSyntheticLambda7.onExtraCallback, this.IAuthTabCallback);
    }

    private static int onNavigationEvent(int[] iArr, int i2) {
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        return i3;
    }

    private static int onExtraCallback(Object[] objArr, int i2) {
        int iHashCode = 17;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode = (iHashCode * 31) + objArr[i3].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i2 = this.IAuthTabCallback;
        return ((((i2 + 527) * 31) + onNavigationEvent(this.asBinder, i2)) * 31) + onExtraCallback(this.onExtraCallback, this.IAuthTabCallback);
    }

    final void IAuthTabCallback(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.IAuthTabCallback; i3++) {
            LazyStaggeredGridMeasureKtExternalSyntheticLambda2.onExtraCallbackWithResult(sb, i2, String.valueOf(PagerKtExternalSyntheticLambda6.onNavigationEvent(this.asBinder[i3])), this.onExtraCallback[i3]);
        }
    }

    void onWarmupCompleted(int i2, Object obj) {
        IAuthTabCallback();
        onExtraCallback(this.IAuthTabCallback + 1);
        int[] iArr = this.asBinder;
        int i3 = this.IAuthTabCallback;
        iArr[i3] = i2;
        this.onExtraCallback[i3] = obj;
        this.IAuthTabCallback = i3 + 1;
    }

    private void onExtraCallback(int i2) {
        int[] iArr = this.asBinder;
        if (i2 > iArr.length) {
            int i3 = this.IAuthTabCallback;
            int i4 = i3 + (i3 / 2);
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.asBinder = Arrays.copyOf(iArr, i2);
            this.onExtraCallback = Arrays.copyOf(this.onExtraCallback, i2);
        }
    }

    PagerKtExternalSyntheticLambda7 IAuthTabCallback(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7) {
        if (pagerKtExternalSyntheticLambda7.equals(onNavigationEvent())) {
            return this;
        }
        IAuthTabCallback();
        int i2 = this.IAuthTabCallback + pagerKtExternalSyntheticLambda7.IAuthTabCallback;
        onExtraCallback(i2);
        System.arraycopy(pagerKtExternalSyntheticLambda7.asBinder, 0, this.asBinder, this.IAuthTabCallback, pagerKtExternalSyntheticLambda7.IAuthTabCallback);
        System.arraycopy(pagerKtExternalSyntheticLambda7.onExtraCallback, 0, this.onExtraCallback, this.IAuthTabCallback, pagerKtExternalSyntheticLambda7.IAuthTabCallback);
        this.IAuthTabCallback = i2;
        return this;
    }
}
