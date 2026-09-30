package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import com.tmoney.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getDurationInForeground {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final /* synthetic */ float IAuthTabCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        float fAsInterface = asInterface(i, i2);
        int i6 = onExtraCallbackWithResult + 55;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return fAsInterface;
    }

    public static final /* synthetic */ int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iIntValue = ((Integer) onNavigationEvent(a.3.onWarmupCompleted(), new Object[0], -1313972103, iOnWarmupCompleted2, iOnWarmupCompleted, 1313972104, a.3.onWarmupCompleted())).intValue();
        int i4 = onExtraCallbackWithResult + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i4)) | i2;
        int i9 = ~i2;
        int i10 = ~(i7 | i9);
        int i11 = ~i4;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i4 | i9)) | (~(i7 | i11));
        int i14 = i5 + i2 + i3 + (417615942 * i) + (566850886 * i6);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i5) + 147849216 + ((-2147356519) * i2) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i3) + ((-354418688) * i) + ((-85983232) * i6) + ((-608960512) * i15);
        int i17 = (i5 * (-1357469509)) + 140661806 + (i2 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i3 * (-1357469401)) + (i * 1137340586) + (i6 * 304092074) + (i15 * 1282146304);
        int i18 = i16 + (i17 * i17 * 1158414336);
        return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[0];
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnWarmupCompleted3, objArr, 1338896984, iOnWarmupCompleted2, iOnWarmupCompleted, -1338896984, iOnWarmupCompleted4);
        int i4 = onExtraCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onNavigationEvent(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        boolean z2;
        boolean z3;
        int i7 = 2 % 2;
        if (i > 0) {
            int i8 = onExtraCallbackWithResult + 101;
            onExtraCallback = i8 % 128;
            z2 = i8 % 2 != 0 ? i3 - i5 >= i : i3 / i5 >= i;
        }
        if (z || i2 <= 0 || i6 - i4 < i2) {
            z3 = false;
        } else {
            int i9 = onExtraCallback + 83;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z3 = true;
        }
        if (z2 || z3) {
            return true;
        }
        int i11 = onExtraCallbackWithResult + 95;
        onExtraCallback = i11 % 128;
        return i11 % 2 == 0;
    }

    public static final boolean onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 7;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (i < 21) {
            return false;
        }
        int i6 = i4 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i6 % 128;
        return i6 % 2 == 0;
    }

    public static final class onNavigationEvent implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 IAuthTabCallback;
        final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onNavigationEvent(Function1 function1, Function0 function0) {
            this.onExtraCallbackWithResult = function1;
            this.IAuthTabCallback = function0;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onExtraCallback + 27;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            this.onExtraCallbackWithResult.invoke(view);
            this.IAuthTabCallback.invoke();
            int i12 = onNavigationEvent + 69;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Object obj;
        Object obj2 = (ViewGroup) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(view, "");
        do {
            Object parent = view.getParent();
            if (parent == obj2) {
                return view;
            }
            obj = null;
            if (!(parent instanceof View)) {
                view = null;
            } else {
                int i4 = onExtraCallback + 109;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                view = (View) parent;
            }
        } while (view != null);
        int i6 = onExtraCallback + 111;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final int onExtraCallback(int i, int i2) {
        int i3 = 2 % 2;
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, 0);
        if (iCoerceAtLeast != 0) {
            return iCoerceAtLeast + RangesKt___RangesKt.coerceAtLeast(i2, 0);
        }
        int i4 = onExtraCallbackWithResult + 119;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 107;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    public static final setLaunching onWarmupCompleted(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i2, 0);
        int iCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(i, 0);
        int iCoerceAtLeast3 = RangesKt___RangesKt.coerceAtLeast(i3, 0);
        int iOnNavigationEvent = iCoerceAtLeast2 + getCurrentBacktraceOrBuilderList.onNavigationEvent(iCoerceAtLeast3 * asInterface(iCoerceAtLeast2, iCoerceAtLeast));
        setLaunching setlaunching = new setLaunching(iOnNavigationEvent, (iCoerceAtLeast + iCoerceAtLeast3) - iOnNavigationEvent);
        int i5 = onExtraCallbackWithResult + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return setlaunching;
    }

    public static final int onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2 != 0 ? 1 : 0;
        int iMax = Math.max(RangesKt___RangesKt.coerceAtLeast(i, i5), RangesKt___RangesKt.coerceAtLeast(i2, i5));
        int i6 = onExtraCallback + 97;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return iMax;
        }
        throw null;
    }

    public static final int onNavigationEvent(int i, int i2) {
        int i3;
        int iCoerceAtLeast;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            i3 = 1;
            iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, 1);
        } else {
            i3 = 0;
            iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, 0);
        }
        return Math.min(iCoerceAtLeast, RangesKt___RangesKt.coerceAtLeast(i2, i3));
    }

    public static final int onWarmupCompleted(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, 1);
            return RangesKt___RangesKt.coerceIn(iCoerceAtLeast << RangesKt___RangesKt.coerceAtLeast(i2, 0), 1, iCoerceAtLeast);
        }
        int iCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(i, 0);
        return RangesKt___RangesKt.coerceIn(iCoerceAtLeast2 - RangesKt___RangesKt.coerceAtLeast(i2, 0), 0, iCoerceAtLeast2);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            WindowInsetsCompat.onTransact.asBinder();
            WindowInsetsCompat.onTransact.onExtraCallbackWithResult();
            WindowInsetsCompat.onTransact.asInterface();
            obj.hashCode();
            throw null;
        }
        int iAsBinder = (WindowInsetsCompat.onTransact.asBinder() | WindowInsetsCompat.onTransact.onExtraCallbackWithResult()) & (~WindowInsetsCompat.onTransact.asInterface());
        int i3 = onExtraCallbackWithResult + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return Integer.valueOf(iAsBinder);
        }
        obj.hashCode();
        throw null;
    }

    private static final float asInterface(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 97;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i2 > 0) {
            return RangesKt___RangesKt.coerceIn(i / i2, 0.0f, 1.0f);
        }
        int i6 = i5 + 95;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return 0.0f;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 80 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onNavigationEvent(@NotNull View view, @NotNull Function1<? super View, Unit> function1, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        view.addOnLayoutChangeListener(new onNavigationEvent(function1, function0));
        function1.invoke(view);
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallback(@NotNull View view, @NotNull Function2<? super View, ? super WindowInsetsCompat, ? extends WindowInsetsCompat> function2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function2, "");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "");
        function2.invoke(view, windowInsetsCompat);
        int i4 = onExtraCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final View onExtraCallback(@NotNull ViewGroup viewGroup, @NotNull View view) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return (View) onNavigationEvent(a.3.onWarmupCompleted(), new Object[]{viewGroup, view}, -1527201072, iOnWarmupCompleted2, iOnWarmupCompleted, 1527201074, a.3.onWarmupCompleted());
    }

    private static final int onExtraCallback() {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return ((Integer) onNavigationEvent(a.3.onWarmupCompleted(), new Object[0], -1313972103, iOnWarmupCompleted2, iOnWarmupCompleted, 1313972104, a.3.onWarmupCompleted())).intValue();
    }

    private static final Unit onExtraCallbackWithResult() {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return (Unit) onNavigationEvent(a.3.onWarmupCompleted(), new Object[0], 1338896984, iOnWarmupCompleted2, iOnWarmupCompleted, -1338896984, a.3.onWarmupCompleted());
    }
}
