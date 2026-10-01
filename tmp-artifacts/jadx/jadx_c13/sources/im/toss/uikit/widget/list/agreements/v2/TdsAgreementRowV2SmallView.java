package im.toss.uikit.widget.list.agreements.v2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.uikit.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AnrDetailsCollectorCompanion;
import o.AnrPlugin;
import o.M_;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM;
import o.readIntokhttp;
import o.setVisitUrl;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsAgreementRowV2SmallView extends SubTypography11 implements r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2SmallView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2SmallView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function0, view);
        int i4 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c A[PHI: r6
      0x009c: PHI (r6v5 int) = (r6v4 int), (r6v8 int) binds: [B:15:0x009a, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1 A[PHI: r6
      0x00b1: PHI (r6v7 int) = (r6v4 int), (r6v8 int) binds: [B:15:0x009a, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TdsAgreementRowV2SmallView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int index;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onNavigationEvent(configuration))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
        boolean z = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsAgreementRowV2Small, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i5 = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (i5 < indexCount) {
                int i6 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    index = typedArrayObtainStyledAttributes.getIndex(i5);
                    int i7 = 63 / 0;
                    if (index == R.styleable.TdsAgreementRowV2Small_android_textColor) {
                        int i8 = onExtraCallbackWithResult + 45;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 == 0) {
                            typedArrayObtainStyledAttributes.getColor(index, iIntValue);
                            throw null;
                        }
                        iIntValue = typedArrayObtainStyledAttributes.getColor(index, iIntValue);
                    } else if (index == R.styleable.TdsAgreementRowV2Small_indent) {
                        z2 = typedArrayObtainStyledAttributes.getBoolean(index, z2);
                    } else if (index == R.styleable.TdsAgreementRowV2Small_underline) {
                        z3 = typedArrayObtainStyledAttributes.getBoolean(index, z3);
                    }
                } else {
                    index = typedArrayObtainStyledAttributes.getIndex(i5);
                    if (index == R.styleable.TdsAgreementRowV2Small_android_textColor) {
                    }
                }
                i5++;
                int i9 = 2 % 2;
            }
            z = z2;
        }
        setBackgroundResource(M_.onExtraCallback.onWarmupCompleted(context));
        setTextColor(iIntValue);
        setIndent(z);
        setHref(new Function0() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2SmallView$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i10 = 2 % 2;
                int i11 = onNavigationEvent + 101;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    TdsAgreementRowV2SmallView.IAuthTabCallback();
                    throw null;
                }
                Unit unitIAuthTabCallback = TdsAgreementRowV2SmallView.IAuthTabCallback();
                int i12 = onExtraCallback + 81;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                return unitIAuthTabCallback;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgreementRowV2SmallView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 119;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 51;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 3;
            } else {
                int i9 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static final Unit onNavigationEvent() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 26 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIndent(boolean z) {
        int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(24.0f);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Float.valueOf(4.0f), displayMetrics);
        if (z) {
            DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(54.0f), displayMetrics2);
        } else {
            DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf, displayMetrics3);
        }
        DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        setPadding(iOnNavigationEvent, iOnNavigationEvent2, varyMatches.onNavigationEvent(fValueOf, displayMetrics4), iOnNavigationEvent2);
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setHref$default(TdsAgreementRowV2SmallView tdsAgreementRowV2SmallView, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 21;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            function0 = null;
        }
        tdsAgreementRowV2SmallView.setHref(function0);
    }

    private static final void onWarmupCompleted(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function0.invoke();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHref(@Nullable final Function0<Unit> function0) {
        int i = 2 % 2;
        if (function0 != null) {
            int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 29 : Build.VERSION.SDK_INT >= 94) {
                AnrDetailsCollectorCompanion.onExtraCallback(getPaint(), getCurrentTextColor());
                TextPaint paint = getPaint();
                Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
                AnrPlugin.onNavigationEvent(paint, varyMatches.onNavigationEvent(Float.valueOf(1.0f), r3));
            }
            setPaintFlags(getPaintFlags() | 8);
            setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2SmallView$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = 2 % 2;
                    int i4 = onWarmupCompleted + 73;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    TdsAgreementRowV2SmallView.onExtraCallbackWithResult(function0, view);
                    int i6 = onExtraCallback + 55;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                }
            });
            M_ m_ = M_.onExtraCallback;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            setBackgroundResource(m_.onWarmupCompleted(context));
            int i3 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        setPaintFlags(getPaintFlags() & (-9));
        setOnClickListener(null);
        setBackgroundResource(0);
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                int i2 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i3 == 0) {
                    int i4 = 16 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i5 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
