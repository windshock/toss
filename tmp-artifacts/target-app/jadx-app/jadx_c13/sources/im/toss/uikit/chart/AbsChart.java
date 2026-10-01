package im.toss.uikit.chart;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1sSDK;
import o.ForwardingLiveDataExternalSyntheticLambda0;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.access;
import o.setProtocolsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class AbsChart extends View {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private long IAuthTabCallback;
    private float asBinder;
    private onExtraCallbackWithResult onExtraCallback;
    private final List<AFj1sSDK> onExtraCallbackWithResult;
    private final HashMap<String, Bitmap> onNavigationEvent;
    private onExtraCallback onWarmupCompleted;

    public interface onExtraCallback {
        void IAuthTabCallback(@Nullable AFj1sSDK aFj1sSDK);
    }

    public interface onExtraCallbackWithResult {
        void onNavigationEvent(@NotNull AFj1sSDK aFj1sSDK, float f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbsChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbsChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i6 | i);
        int i11 = i9 | i10 | (~(i6 | i3));
        int i12 = i8 | i6;
        int i13 = (~((~i3) | i6)) | i10;
        int i14 = i6 + i + i4 + (111814883 * i5) + (1975835455 * i2);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i6) - 1583611904) + (47848387 * i) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i4) + ((-648806400) * i5) + (1432616960 * i2) + (442957824 * i15);
        int i17 = ((i6 * 961080817) - 60187382) + (i * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i4 * 961079685) + (i5 * 1618335983) + (i2 * 193609403) + (i15 * 1988296704);
        return i16 + ((i17 * i17) * 176226304) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ CharSequence onExtraCallback(AFj1sSDK aFj1sSDK) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(aFj1sSDK);
            throw null;
        }
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(aFj1sSDK);
        int i3 = IAuthTabCallbackDefault + 53;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return charSequenceOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = new HashMap<>();
        this.onExtraCallbackWithResult = new ArrayList();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbsChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asInterface + 45;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallbackDefault + 77;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final List<AFj1sSDK> onWarmupCompleted() {
        List<AFj1sSDK> list;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            list = this.onExtraCallbackWithResult;
            int i4 = 19 / 0;
        } else {
            list = this.onExtraCallbackWithResult;
        }
        int i5 = i3 + 29;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    protected final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 57;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i2 + 77;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    protected final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        float f = this.asBinder;
        int i5 = i3 + 109;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AbsChart absChart = (AbsChart) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = absChart.onExtraCallback;
        if (i4 != 0) {
            int i5 = 96 / 0;
        }
        int i6 = i2 + 95;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return onextracallbackwithresult;
    }

    public final onExtraCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.onWarmupCompleted;
        int i5 = i3 + 53;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    private static final CharSequence onExtraCallbackWithResult(AFj1sSDK aFj1sSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        String str = aFj1sSDK.onExtraCallbackWithResult() + " " + aFj1sSDK.onExtraCallback();
        int i2 = IAuthTabCallbackDefault + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public boolean onNavigationEvent(@NotNull List<? extends AFj1sSDK> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            asInterface();
            IAuthTabCallback(this.onExtraCallbackWithResult, list);
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        asInterface();
        if (IAuthTabCallback(this.onExtraCallbackWithResult, list)) {
            int i3 = IAuthTabCallbackDefault + 27;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        List<? extends AFj1sSDK> list2 = list;
        Iterator<T> it = list2.iterator();
        int i5 = IAuthTabCallbackDefault + 71;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        double dIAuthTabCallback = 0.0d;
        while (it.hasNext()) {
            dIAuthTabCallback += ((AFj1sSDK) it.next()).IAuthTabCallback();
        }
        this.asBinder = (float) dIAuthTabCallback;
        this.onExtraCallbackWithResult.clear();
        this.onExtraCallbackWithResult.addAll(list);
        this.IAuthTabCallback = System.currentTimeMillis();
        setProtocolsokhttp.IAuthTabCallback(this);
        setContentDescription(CollectionsKt___CollectionsKt.joinToString$default(list2, ", ", null, null, 0, null, new Function1() { // from class: im.toss.uikit.chart.AbsChart$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CharSequence charSequenceOnExtraCallback = AbsChart.onExtraCallback((AFj1sSDK) obj);
                int i10 = onExtraCallbackWithResult + 83;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                return charSequenceOnExtraCallback;
            }
        }, 30, null));
        requestLayout();
        return true;
    }

    private final boolean IAuthTabCallback(List<? extends AFj1sSDK> list, List<? extends AFj1sSDK> list2) {
        Iterator it;
        int i;
        int i2 = 2 % 2;
        if (list.size() != list2.size()) {
            return false;
        }
        int i3 = asInterface + 47;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            it = list.iterator();
            i = 1;
        } else {
            it = list.iterator();
            i = 0;
        }
        int i4 = asInterface + 61;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            Object next = it.next();
            if (i < 0) {
                int i6 = IAuthTabCallbackDefault + 7;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                if (i7 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (!((AFj1sSDK) next).onWarmupCompleted(context, list2.get(i))) {
                int i8 = asInterface + 29;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            i++;
        }
        return true;
    }

    public static final class onNavigationEvent implements onExtraCallbackWithResult {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ AbsChart onExtraCallback;
        final /* synthetic */ Function2<AFj1sSDK, Float, Unit> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(Function2<? super AFj1sSDK, ? super Float, Unit> function2, AbsChart absChart) {
            this.onExtraCallbackWithResult = function2;
            this.onExtraCallback = absChart;
        }

        @Override // im.toss.uikit.chart.AbsChart.onExtraCallbackWithResult
        public void onNavigationEvent(AFj1sSDK aFj1sSDK, float f) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(aFj1sSDK, "");
            this.onExtraCallbackWithResult.invoke(aFj1sSDK, Float.valueOf(f));
            this.onExtraCallback.announceForAccessibility(aFj1sSDK.onExtraCallbackWithResult() + " " + aFj1sSDK.onExtraCallback() + " 선택됨");
            int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public final void onWarmupCompleted(@Nullable Function2<? super AFj1sSDK, ? super Float, Unit> function2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (function2 == null) {
            this.onExtraCallback = null;
            return;
        }
        this.onExtraCallback = new onNavigationEvent(function2, this);
        int i4 = asInterface + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements onExtraCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ AbsChart IAuthTabCallback;
        final /* synthetic */ Function1<AFj1sSDK, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(Function1<? super AFj1sSDK, Unit> function1, AbsChart absChart) {
            this.onWarmupCompleted = function1;
            this.IAuthTabCallback = absChart;
        }

        @Override // im.toss.uikit.chart.AbsChart.onExtraCallback
        public void IAuthTabCallback(AFj1sSDK aFj1sSDK) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(aFj1sSDK);
            if (aFj1sSDK != null) {
                this.IAuthTabCallback.announceForAccessibility(aFj1sSDK.onExtraCallbackWithResult() + " " + aFj1sSDK.onExtraCallback() + " 선택됨");
                int i4 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AbsChart absChart = (AbsChart) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (function1 == null) {
            absChart.onWarmupCompleted = null;
            return null;
        }
        absChart.onWarmupCompleted = new onWarmupCompleted(function1, absChart);
        int i3 = asInterface + 97;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    protected final Bitmap IAuthTabCallback(@NotNull AFj1sSDK aFj1sSDK) {
        Bitmap bitmapOnExtraCallback;
        Bitmap bitmap;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        String str = aFj1sSDK.onExtraCallbackWithResult() + "_" + aFj1sSDK.IAuthTabCallback();
        Object obj = null;
        try {
            if (this.onNavigationEvent.get(str) != null && ((bitmap = this.onNavigationEvent.get(str)) == null || !bitmap.isRecycled())) {
                Bitmap bitmap2 = this.onNavigationEvent.get(str);
                int i2 = asInterface + 5;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return bitmap2;
                }
                obj.hashCode();
                throw null;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Drawable drawableOnExtraCallbackWithResult = aFj1sSDK.onExtraCallbackWithResult(context);
            if (drawableOnExtraCallbackWithResult != null) {
                int i3 = IAuthTabCallbackDefault + 87;
                asInterface = i3 % 128;
                bitmapOnExtraCallback = i3 % 2 != 0 ? ForwardingLiveDataExternalSyntheticLambda0.onExtraCallback(drawableOnExtraCallbackWithResult, 1, 1, (Bitmap.Config) null, 72, (Object) null) : ForwardingLiveDataExternalSyntheticLambda0.onExtraCallback(drawableOnExtraCallbackWithResult, 0, 0, (Bitmap.Config) null, 7, (Object) null);
            } else {
                bitmapOnExtraCallback = null;
            }
            this.onNavigationEvent.put(str, bitmapOnExtraCallback);
            return bitmapOnExtraCallback;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        asInterface();
        int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.clear();
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
    }

    protected static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private float onExtraCallback;
        private float onExtraCallbackWithResult;
        private float onNavigationEvent;

        public IAuthTabCallback(float f, float f2, float f3) {
            this.onExtraCallback = f;
            this.onNavigationEvent = f2;
            this.onExtraCallbackWithResult = f3;
        }

        public final void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            this.onExtraCallback = f;
            int i5 = i3 + 79;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 93 / 0;
            }
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.onExtraCallbackWithResult = f;
            int i5 = i2 + 37;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 37 / 0;
            }
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i3 + 119;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 36 / 0;
            }
            return f;
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, float f, boolean z, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 23;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
                z = false;
            }
            boolean zIAuthTabCallback = iAuthTabCallback.IAuthTabCallback(f, z);
            int i4 = IAuthTabCallback + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return zIAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallback(float f, boolean z) {
            float f2;
            boolean z2;
            float f3;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float fOnExtraCallbackWithResult = 0.0f;
            if (Float.isNaN(this.onNavigationEvent)) {
                int i4 = IAuthTabCallback + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                f2 = 0.0f;
            } else {
                f2 = this.onNavigationEvent;
            }
            if (Math.abs(f2 - this.onExtraCallbackWithResult) > 1.0E-4d) {
                int i6 = onWarmupCompleted + 3;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                fOnExtraCallbackWithResult = this.onExtraCallbackWithResult;
            } else if (!z) {
                if (Float.isNaN(this.onExtraCallback)) {
                    int i8 = IAuthTabCallback + 9;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    f3 = 0.0f;
                } else {
                    f3 = this.onExtraCallback;
                }
                float f4 = f3 + ((this.onExtraCallbackWithResult - f3) * f);
                if (!Float.isNaN(f4)) {
                    fOnExtraCallbackWithResult = f4;
                }
            } else {
                int i10 = onWarmupCompleted + 105;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    VideoEncoderInfoImplExternalSyntheticLambda0.onExtraCallbackWithResult((int) this.onExtraCallback, (int) this.onExtraCallbackWithResult, f);
                    throw null;
                }
                fOnExtraCallbackWithResult = VideoEncoderInfoImplExternalSyntheticLambda0.onExtraCallbackWithResult((int) this.onExtraCallback, (int) this.onExtraCallbackWithResult, f);
            }
            this.onNavigationEvent = fOnExtraCallbackWithResult;
            return z2;
        }
    }

    public final onExtraCallbackWithResult IAuthTabCallback() {
        return (onExtraCallbackWithResult) IAuthTabCallback(-975145602, new Object[]{this}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 975145603);
    }

    public final void onNavigationEvent(@Nullable Function1<? super AFj1sSDK, Unit> function1) {
        IAuthTabCallback(-707216620, new Object[]{this, function1}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 707216620);
    }
}
