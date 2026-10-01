package im.toss.uikit.chart;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.content.ContextCompat;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.tds.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.chart.AbsChart;
import im.toss.uikit.chart.SingleStackedBarChart$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFj1sSDK;
import o.AppLovinSdkSettings;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.deprecated_noStore;
import o.getExtraParameters;
import o.isFireOS;
import o.isMuted;
import o.pxToDp;
import o.runOnUiThreadDelayed;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SingleStackedBarChart extends AbsChart {
    private static int asBinder = 0;
    private static int asInterface = 1;
    private final Paint IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private runOnUiThreadDelayed IAuthTabCallbackStub;
    private ArrayList<onNavigationEvent> onExtraCallback;
    private AbsChart.IAuthTabCallback onExtraCallbackWithResult;
    private onNavigationEvent onNavigationEvent;
    private boolean onTransact;
    private float onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleStackedBarChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleStackedBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit onExtraCallback(SingleStackedBarChart singleStackedBarChart) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(singleStackedBarChart);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = asBinder + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onNavigationEvent onnavigationevent, SingleStackedBarChart singleStackedBarChart, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(onnavigationevent, singleStackedBarChart, f);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(onnavigationevent, singleStackedBarChart, f);
        int i3 = asBinder + 69;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SingleStackedBarChart singleStackedBarChart, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(singleStackedBarChart, f);
        int i4 = asBinder + 47;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleStackedBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new ArrayList<>();
        Paint paint = new Paint(7);
        this.IAuthTabCallback = paint;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        this.IAuthTabCallbackDefault = varyMatches.onNavigationEvent(Double.valueOf(1.5d), displayMetrics);
        this.onExtraCallbackWithResult = new AbsChart.IAuthTabCallback(1.0f, 1.0f, 1.0f);
        paint.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SingleStackedBarChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asBinder;
            int i4 = i3 + 29;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 27;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = asBinder + 23;
            int i10 = i9 % 128;
            asInterface = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 101;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setSpace(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 3;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            this.IAuthTabCallbackDefault = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
            requestLayout();
            return;
        }
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        this.IAuthTabCallbackDefault = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics2);
        requestLayout();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSkipAnimation(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.onTransact = z;
        if (i4 != 0) {
            int i5 = 38 / 0;
        }
        int i6 = i2 + 105;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0109 A[PHI: r4 r5
      0x0109: PHI (r4v11 java.lang.Object) = (r4v10 java.lang.Object), (r4v14 java.lang.Object) binds: [B:33:0x0107, B:30:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r5v13 int) = (r5v12 int), (r5v15 int) binds: [B:33:0x0107, B:30:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        List listListOf;
        float fIAuthTabCallback;
        float f;
        Object next;
        int i3;
        float f2;
        float fIAuthTabCallback2;
        float fOnExtraCallback;
        int i4 = 2;
        int i5 = 2 % 2;
        super.onMeasure(i, i2);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
        this.onWarmupCompleted = Math.min(varyMatches.onNavigationEvent(8, r0), ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f);
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackStub;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        this.onExtraCallback.clear();
        List<AFj1sSDK> listOnWarmupCompleted = onWarmupCompleted();
        float f3 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnWarmupCompleted, 9);
        Object obj = null;
        if (iCollectionSizeOrDefault == 0) {
            int i6 = asInterface + 33;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                CollectionsKt__CollectionsJVMKt.listOf(fValueOf);
                obj.hashCode();
                throw null;
            }
            listListOf = CollectionsKt__CollectionsJVMKt.listOf(fValueOf);
        } else {
            ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
            arrayList.add(fValueOf);
            for (AFj1sSDK aFj1sSDK : listOnWarmupCompleted) {
                float fFloatValue = fValueOf.floatValue();
                if (onExtraCallback() > 0.0f) {
                    int i7 = asBinder + 95;
                    asInterface = i7 % 128;
                    fIAuthTabCallback = i7 % 2 == 0 ? aFj1sSDK.IAuthTabCallback() % onExtraCallback() : aFj1sSDK.IAuthTabCallback() / onExtraCallback();
                } else {
                    fIAuthTabCallback = 0.0f;
                }
                fValueOf = Float.valueOf(fFloatValue + fIAuthTabCallback);
                arrayList.add(fValueOf);
            }
            listListOf = arrayList;
        }
        Iterator<T> it = onWarmupCompleted().iterator();
        int i8 = 0;
        while (true) {
            f = 1.0f;
            if (!it.hasNext()) {
                break;
            }
            int i9 = asInterface + 113;
            asBinder = i9 % 128;
            if (i9 % 2 != 0) {
                next = it.next();
                i3 = i8;
                if (i8 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
            } else {
                next = it.next();
                i3 = i8 + 1;
                if (i8 < 0) {
                }
            }
            AFj1sSDK aFj1sSDK2 = (AFj1sSDK) next;
            if (onExtraCallback() > 0.0f) {
                int i10 = asBinder + 123;
                asInterface = i10 % 128;
                if (i10 % i4 == 0) {
                    fIAuthTabCallback2 = aFj1sSDK2.IAuthTabCallback();
                    fOnExtraCallback = onExtraCallback();
                } else {
                    fIAuthTabCallback2 = aFj1sSDK2.IAuthTabCallback();
                    fOnExtraCallback = onExtraCallback();
                }
                f2 = fIAuthTabCallback2 / fOnExtraCallback;
            } else {
                f2 = 0.0f;
            }
            float fCoerceIn = RangesKt___RangesKt.coerceIn(1.0f - ((Number) listListOf.get(i3)).floatValue(), 0.0f, 1.0f);
            float f4 = i8 == 0 ? 0.0f : this.IAuthTabCallbackDefault;
            if (this.onTransact) {
                ArrayList<onNavigationEvent> arrayList2 = this.onExtraCallback;
                AbsChart.IAuthTabCallback iAuthTabCallback = new AbsChart.IAuthTabCallback(1.0f, 1.0f, 1.0f);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                float fIAuthTabCallback3 = aFj1sSDK2.IAuthTabCallback(context);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                float fIAuthTabCallback4 = aFj1sSDK2.IAuthTabCallback(context2);
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                arrayList2.add(i8, new onNavigationEvent(aFj1sSDK2, f2, fCoerceIn, iAuthTabCallback, new AbsChart.IAuthTabCallback(fIAuthTabCallback3, fIAuthTabCallback4, aFj1sSDK2.IAuthTabCallback(r15)), new AbsChart.IAuthTabCallback(1.0f, 1.0f, 1.0f), new AbsChart.IAuthTabCallback(f4, f4, f4)));
            } else {
                ArrayList<onNavigationEvent> arrayList3 = this.onExtraCallback;
                AbsChart.IAuthTabCallback iAuthTabCallback2 = new AbsChart.IAuthTabCallback(0.0f, 0.0f, 1.0f);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                float fIAuthTabCallback5 = aFj1sSDK2.IAuthTabCallback(context3);
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                float fIAuthTabCallback6 = aFj1sSDK2.IAuthTabCallback(context4);
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                arrayList3.add(i8, new onNavigationEvent(aFj1sSDK2, f2, fCoerceIn, iAuthTabCallback2, new AbsChart.IAuthTabCallback(fIAuthTabCallback5, fIAuthTabCallback6, aFj1sSDK2.IAuthTabCallback(r12)), new AbsChart.IAuthTabCallback(0.0f, 0.0f, 1.0f), new AbsChart.IAuthTabCallback(0.0f, 0.0f, f4)));
            }
            i8 = i3;
            i4 = 2;
        }
        if (this.onTransact) {
            this.IAuthTabCallbackStub = null;
            if (onExtraCallback() == 0.0f) {
                int i11 = asInterface + 13;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                f3 = 1.0f;
            }
            this.onExtraCallbackWithResult = new AbsChart.IAuthTabCallback(1.0f, 1.0f, f3);
            return;
        }
        this.onExtraCallbackWithResult = new AbsChart.IAuthTabCallback(this.onExtraCallbackWithResult.onWarmupCompleted(), this.onExtraCallbackWithResult.onWarmupCompleted(), onExtraCallback() == 0.0f ? 1.0f : 0.0f);
        pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(80);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        deprecated_dns deprecated_dnsVarIAuthTabCallback = deprecated_certificatepinner.IAuthTabCallback();
        pxToDp.onNavigationEvent onnavigationevent2 = new pxToDp.onNavigationEvent(80);
        deprecated_dns deprecated_dnsVarIAuthTabCallback2 = deprecated_certificatepinner.IAuthTabCallback();
        ArrayList<onNavigationEvent> arrayList4 = this.onExtraCallback;
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator<T> it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList6 = arrayList5;
            arrayList6.add(RallysKt.onWarmupCompleted(this, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{new AppLovinSdkSettings(), Float.valueOf(f3), Float.valueOf(f), new SingleStackedBarChart$.ExternalSyntheticLambda0((onNavigationEvent) it2.next(), this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult())}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
            arrayList5 = arrayList6;
            f = f;
            onnavigationevent2 = onnavigationevent2;
            f3 = f3;
        }
        Boolean bool = Boolean.FALSE;
        this.IAuthTabCallbackStub = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, onnavigationevent, CollectionsKt__CollectionsKt.listOf((Object[]) new isFireOS[]{RallysKt.onWarmupCompleted((View) null, onnavigationevent2, arrayList5, 0, (getExtraParameters) null, 0, deprecated_dnsVarIAuthTabCallback2, (Integer) null, bool, 0, 0L, false, 3769, (Object) null), RallysKt.onWarmupCompleted(this, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{new AppLovinSdkSettings(), Float.valueOf(f3), Float.valueOf(f), new SingleStackedBarChart$.ExternalSyntheticLambda1(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult())}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarIAuthTabCallback, (Integer) null, bool, 0, 0L, false, 3769, (Object) null), (Object) null, new SingleStackedBarChart$.ExternalSyntheticLambda2(this), 1, (Object) null), false, 1, (Object) null);
    }

    private static final Unit onExtraCallback(onNavigationEvent onnavigationevent, SingleStackedBarChart singleStackedBarChart, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onnavigationevent, Float.valueOf(f)};
        ((Boolean) onNavigationEvent.onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr, -1265823361, 1265823361, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).booleanValue();
        singleStackedBarChart.postInvalidate();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(SingleStackedBarChart singleStackedBarChart, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AbsChart.IAuthTabCallback.onExtraCallbackWithResult(singleStackedBarChart.onExtraCallbackWithResult, RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f), false, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 23;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(SingleStackedBarChart singleStackedBarChart) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            singleStackedBarChart.postInvalidate();
            return Unit.INSTANCE;
        }
        singleStackedBarChart.postInvalidate();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        List listListOf;
        float fFloatValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.draw(canvas);
        float measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        ArrayList<onNavigationEvent> arrayList = this.onExtraCallback;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                Object next = it.next();
                if (((onNavigationEvent) next).asInterface() > 0.0f) {
                    int i2 = asBinder + 95;
                    asInterface = i2 % 128;
                    if (i2 % 2 == 0) {
                        arrayList2.add(next);
                        obj.hashCode();
                        throw null;
                    }
                    arrayList2.add(next);
                }
            } else {
                Float fValueOf = Float.valueOf(0.0f);
                int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 9);
                if (iCollectionSizeOrDefault == 0) {
                    int i3 = asInterface + 101;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    listListOf = CollectionsKt__CollectionsJVMKt.listOf(fValueOf);
                } else {
                    ArrayList arrayList3 = new ArrayList(iCollectionSizeOrDefault + 1);
                    arrayList3.add(fValueOf);
                    Iterator it2 = arrayList2.iterator();
                    while (!(!it2.hasNext())) {
                        fValueOf = Float.valueOf(fValueOf.floatValue() + ((onNavigationEvent) it2.next()).asBinder().onWarmupCompleted());
                        arrayList3.add(fValueOf);
                    }
                    listListOf = arrayList3;
                }
                float fFloatValue2 = ((Number) CollectionsKt___CollectionsKt.last(listListOf)).floatValue();
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                int i5 = 0;
                int i6 = 0;
                for (Object obj2 : arrayList2) {
                    int i7 = asBinder + 73;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    if (i6 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    onNavigationEvent onnavigationevent = (onNavigationEvent) obj2;
                    float fOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
                    float fAsInterface = onnavigationevent.asInterface();
                    arrayList4.add(Float.valueOf(((((fOnExtraCallbackWithResult + fAsInterface) * (measuredWidth - fFloatValue2)) * onnavigationevent.onTransact().onWarmupCompleted()) + ((Number) CollectionsKt___CollectionsKt.last(listListOf)).floatValue()) - ((Number) listListOf.get(i6)).floatValue()));
                    i6++;
                    int i9 = asInterface + 29;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                }
                Float f = (Float) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList4);
                if (f != null) {
                    int i11 = asBinder + 39;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                float f2 = measuredWidth - fFloatValue;
                canvas.translate(getPaddingLeft(), getPaddingTop());
                deprecated_noStore deprecated_nostore = deprecated_noStore.onExtraCallback;
                canvas.clipPath(deprecated_noStore.onExtraCallbackWithResult(deprecated_nostore, measuredWidth, measuredHeight, this.onWarmupCompleted, 0, false, 24, (Object) null));
                this.IAuthTabCallback.setShader(null);
                this.IAuthTabCallback.setColor(ContextCompat.getColor(getContext(), R.color.grey_200));
                this.IAuthTabCallback.setAlpha((int) (this.onExtraCallbackWithResult.onWarmupCompleted() * 255.0f));
                canvas.drawRect(0.0f, 0.0f, measuredWidth, measuredHeight, this.IAuthTabCallback);
                float f3 = measuredWidth - f2;
                Shader shader = null;
                Path pathOnExtraCallbackWithResult = deprecated_noStore.onExtraCallbackWithResult(deprecated_nostore, f3, measuredHeight, this.onWarmupCompleted, 0, false, 24, (Object) null);
                pathOnExtraCallbackWithResult.offset(f2, 0.0f);
                canvas.clipPath(pathOnExtraCallbackWithResult);
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    int i13 = i5;
                    if (!it3.hasNext()) {
                        return;
                    }
                    Object next2 = it3.next();
                    i5 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    onNavigationEvent onnavigationevent2 = (onNavigationEvent) next2;
                    float fFloatValue3 = measuredWidth - ((Number) arrayList4.get(i13)).floatValue();
                    this.IAuthTabCallback.setAlpha(255);
                    this.IAuthTabCallback.setShader(shader);
                    this.IAuthTabCallback.setColor(ContextCompat.getColor(getContext(), R.color.background_default));
                    Shader shader2 = shader;
                    canvas.drawRect(fFloatValue3 - onnavigationevent2.asBinder().onWarmupCompleted(), 0.0f, fFloatValue3, measuredHeight, this.IAuthTabCallback);
                    this.IAuthTabCallback.setAlpha((int) (onnavigationevent2.onExtraCallback().onWarmupCompleted() * 255.0f));
                    Bitmap bitmapIAuthTabCallback = IAuthTabCallback(onnavigationevent2.IAuthTabCallback());
                    if (bitmapIAuthTabCallback != null) {
                        int iOnWarmupCompleted = (int) onnavigationevent2.onWarmupCompleted().onWarmupCompleted();
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        this.IAuthTabCallback.setShader(new ComposeShader(new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, iOnWarmupCompleted, iOnWarmupCompleted, tileMode), new BitmapShader(bitmapIAuthTabCallback, tileMode, tileMode), PorterDuff.Mode.SRC_OVER));
                    } else {
                        this.IAuthTabCallback.setShader(shader2);
                        this.IAuthTabCallback.setColor((int) onnavigationevent2.onWarmupCompleted().onWarmupCompleted());
                        int i14 = asBinder + 111;
                        asInterface = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 4 % 4;
                        }
                    }
                    canvas.drawRect(fFloatValue3, 0.0f, measuredWidth, measuredHeight, this.IAuthTabCallback);
                    int i16 = asInterface + 89;
                    asBinder = i16 % 128;
                    int i17 = i16 % 2;
                    shader = shader2;
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (IAuthTabCallback() == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.onNavigationEvent = onWarmupCompleted(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            if (this.onNavigationEvent != null) {
                int i2 = asInterface + 5;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                if (!(!Intrinsics.areEqual(r1, onWarmupCompleted(motionEvent.getX(), motionEvent.getY())))) {
                    onNavigationEvent onnavigationevent = this.onNavigationEvent;
                    Intrinsics.checkNotNull(onnavigationevent);
                    onExtraCallback(onnavigationevent);
                }
            }
            this.onNavigationEvent = null;
        } else if (action == 3) {
            int i4 = asBinder + 61;
            int i5 = i4 % 128;
            asInterface = i5;
            if (i4 % 2 == 0) {
                this.onNavigationEvent = null;
                throw null;
            }
            this.onNavigationEvent = null;
            int i6 = i5 + 105;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        return true;
    }

    private final onNavigationEvent onWarmupCompleted(float f, float f2) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        Object obj = null;
        if (measuredWidth <= 0.0f) {
            return null;
        }
        int i4 = asInterface + 65;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            getPaddingTop();
            throw null;
        }
        if (getPaddingTop() >= f2 || f2 >= getMeasuredHeight() - getPaddingBottom()) {
            return null;
        }
        Iterator<T> it = this.onExtraCallback.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((onNavigationEvent) next).onExtraCallbackWithResult((f - getPaddingLeft()) / measuredWidth)) {
                obj = next;
                break;
            }
        }
        return (onNavigationEvent) obj;
    }

    private final void onExtraCallback(onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        playSoundEffect(0);
        AbsChart.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = IAuthTabCallback();
        if (onextracallbackwithresultIAuthTabCallback != null) {
            int i4 = asBinder + 43;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            AFj1sSDK aFj1sSDKIAuthTabCallback = onnavigationevent.IAuthTabCallback();
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            onextracallbackwithresultIAuthTabCallback.onNavigationEvent(aFj1sSDKIAuthTabCallback, ((Float) onNavigationEvent.onWarmupCompleted(iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onnavigationevent}, 1951627666, -1951627665, iOnWarmupCompleted2)).floatValue());
            int i6 = asBinder + 97;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    static final class onNavigationEvent {
        private static int asInterface = 1;
        private static int onTransact;
        private final AbsChart.IAuthTabCallback IAuthTabCallback;
        private final AbsChart.IAuthTabCallback IAuthTabCallbackDefault;
        private final float IAuthTabCallbackStub;
        private final AbsChart.IAuthTabCallback onExtraCallback;
        private final AbsChart.IAuthTabCallback onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private final AFj1sSDK onWarmupCompleted;

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i5;
            int i8 = ~i4;
            int i9 = (~(i7 | i8)) | (~(i8 | i));
            int i10 = ~i;
            int i11 = i9 | (~(i10 | i5 | i4));
            int i12 = i8 | i5;
            int i13 = (~(i | i5)) | (~i12);
            int i14 = i12 | i10;
            int i15 = i5 + i4 + i6 + ((-1468046718) * i2) + (327422179 * i3);
            int i16 = i15 * i15;
            int i17 = (677926197 * i5) + 1810235392 + (1154460365 * i4) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i6) + (1933049856 * i2) + (743702528 * i3) + (286654464 * i16);
            int i18 = (i5 * (-645773371)) + 280972133 + (i4 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i6 * (-645772719)) + (i2 * 1523302178) + (i3 * 1475409363) + (i16 * (-1007288320));
            return i17 + ((i18 * i18) * (-492175360)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 85;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted) || Float.compare(this.IAuthTabCallbackStub, onnavigationevent.IAuthTabCallbackStub) != 0 || Float.compare(this.onNavigationEvent, onnavigationevent.onNavigationEvent) != 0) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onnavigationevent.IAuthTabCallbackDefault)) {
                int i4 = onTransact + 43;
                asInterface = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback)) {
                return Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback);
            }
            int i5 = asInterface + 1;
            onTransact = i5 % 128;
            return i5 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 83;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((this.onWarmupCompleted.hashCode() * 31) + Float.hashCode(this.IAuthTabCallbackStub)) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode();
            int i4 = asInterface + 125;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SingleStackedBarChartData(chartData=" + this.onWarmupCompleted + ", ratio=" + this.IAuthTabCallbackStub + ", accumulatedRatio=" + this.onNavigationEvent + ", progress=" + this.IAuthTabCallbackDefault + ", color=" + this.onExtraCallbackWithResult + ", alpha=" + this.IAuthTabCallback + ", leftSpace=" + this.onExtraCallback + ")";
            int i2 = asInterface + 115;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull AFj1sSDK aFj1sSDK, float f, float f2, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback2, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback3, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback4) {
            Intrinsics.checkNotNullParameter(aFj1sSDK, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback3, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback4, "");
            this.onWarmupCompleted = aFj1sSDK;
            this.IAuthTabCallbackStub = f;
            this.onNavigationEvent = f2;
            this.IAuthTabCallbackDefault = iAuthTabCallback;
            this.onExtraCallbackWithResult = iAuthTabCallback2;
            this.IAuthTabCallback = iAuthTabCallback3;
            this.onExtraCallback = iAuthTabCallback4;
        }

        public final AFj1sSDK IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 103;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            AFj1sSDK aFj1sSDK = this.onWarmupCompleted;
            int i5 = i3 + 5;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return aFj1sSDK;
        }

        public final float asInterface() {
            int i = 2 % 2;
            int i2 = onTransact + 89;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallbackStub;
            int i5 = i3 + 115;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 91;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onNavigationEvent;
            int i5 = i2 + 115;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final AbsChart.IAuthTabCallback onTransact() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 13;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackDefault;
            int i5 = i2 + 81;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 89;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AbsChart.IAuthTabCallback iAuthTabCallback = this.onExtraCallbackWithResult;
            int i4 = i3 + 65;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 65;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback;
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback asBinder() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 37;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            AbsChart.IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
            int i4 = i2 + 115;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0067 A[PHI: r2 r4 r8
          0x0067: PHI (r2v5 boolean) = (r2v2 boolean), (r2v7 boolean) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0067: PHI (r4v9 boolean) = (r4v6 boolean), (r4v12 boolean) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0067: PHI (r8v4 im.toss.uikit.chart.AbsChart$IAuthTabCallback) = (r8v1 im.toss.uikit.chart.AbsChart$IAuthTabCallback), (r8v6 im.toss.uikit.chart.AbsChart$IAuthTabCallback) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0059 A[PHI: r2 r4 r8
          0x0059: PHI (r2v3 boolean) = (r2v2 boolean), (r2v7 boolean) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0059: PHI (r4v7 boolean) = (r4v6 boolean), (r4v12 boolean) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0059: PHI (r8v2 im.toss.uikit.chart.AbsChart$IAuthTabCallback) = (r8v1 im.toss.uikit.chart.AbsChart$IAuthTabCallback), (r8v6 im.toss.uikit.chart.AbsChart$IAuthTabCallback) binds: [B:8:0x0057, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            AbsChart.IAuthTabCallback iAuthTabCallback;
            boolean zIAuthTabCallback;
            boolean zOnExtraCallbackWithResult;
            float fCoerceIn;
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            float fFloatValue = ((Number) objArr[1]).floatValue();
            int i = 2 % 2;
            int i2 = onTransact + 93;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                zOnExtraCallbackWithResult = AbsChart.IAuthTabCallback.onExtraCallbackWithResult(onnavigationevent.IAuthTabCallbackDefault, fFloatValue, false, 5, null);
                zIAuthTabCallback = onnavigationevent.onExtraCallbackWithResult.IAuthTabCallback(RangesKt___RangesKt.coerceIn(fFloatValue, 1.0f, 1.0f), false);
                iAuthTabCallback = onnavigationevent.IAuthTabCallback;
                if (iAuthTabCallback.onExtraCallback() == 1.0f) {
                    int i3 = onTransact + 95;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    fCoerceIn = RangesKt___RangesKt.coerceIn(fFloatValue, 0.0f, 1.0f);
                } else {
                    fCoerceIn = RangesKt___RangesKt.coerceIn(2.0f * fFloatValue, 0.0f, 1.0f);
                }
            } else {
                boolean zOnExtraCallbackWithResult2 = AbsChart.IAuthTabCallback.onExtraCallbackWithResult(onnavigationevent.IAuthTabCallbackDefault, fFloatValue, false, 2, null);
                boolean zIAuthTabCallback2 = onnavigationevent.onExtraCallbackWithResult.IAuthTabCallback(RangesKt___RangesKt.coerceIn(fFloatValue, 0.0f, 1.0f), true);
                iAuthTabCallback = onnavigationevent.IAuthTabCallback;
                zIAuthTabCallback = zIAuthTabCallback2;
                zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
                if (iAuthTabCallback.onExtraCallback() == 0.0f) {
                }
            }
            return Boolean.valueOf(AbsChart.IAuthTabCallback.onExtraCallbackWithResult(onnavigationevent.onExtraCallback, fFloatValue, false, 2, null) | zOnExtraCallbackWithResult | zIAuthTabCallback | AbsChart.IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback, fCoerceIn, false, 2, null));
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = asInterface + 39;
            int i3 = i2 % 128;
            onTransact = i3;
            float f = i2 % 2 != 0 ? 0.0f % (onnavigationevent.onNavigationEvent % (onnavigationevent.IAuthTabCallbackStub / 0.0f)) : 1.0f - (onnavigationevent.onNavigationEvent + (onnavigationevent.IAuthTabCallbackStub / 2.0f));
            int i4 = i3 + 111;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return Float.valueOf(f);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1 r6
          0x0027: PHI (r1v5 float) = (r1v4 float), (r1v9 float) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0027: PHI (r6v1 float) = (r6v0 float), (r6v2 float) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onExtraCallbackWithResult(float f) {
            float f2;
            float f3;
            int i = 2 % 2;
            int i2 = asInterface + 19;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                f2 = this.onNavigationEvent;
                f3 = this.IAuthTabCallbackStub;
                if (f <= 0.0f % f2) {
                    int i4 = i3 + 15;
                    asInterface = i4 % 128;
                    if (i4 % 2 != 0 ? (1.0f - f2) - f3 <= f : (f2 * 0.0f) + f3 <= f) {
                        int i5 = i3 + 71;
                        asInterface = i5 % 128;
                        return i5 % 2 != 0;
                    }
                }
            } else {
                f2 = this.onNavigationEvent;
                f3 = this.IAuthTabCallbackStub;
                if (f <= 1.0f - f2) {
                }
            }
            int i6 = asInterface + 83;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public final float onNavigationEvent() {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            return ((Float) onWarmupCompleted(iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, 1951627666, -1951627665, iOnWarmupCompleted2)).floatValue();
        }

        public final boolean IAuthTabCallback(float f) {
            Object[] objArr = {this, Float.valueOf(f)};
            return ((Boolean) onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr, -1265823361, 1265823361, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).booleanValue();
        }
    }
}
