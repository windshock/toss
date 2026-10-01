package im.toss.uikit.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.tds.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AFj1sSDK;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.getCurrentBacktraceOrBuilderList;
import o.response;
import o.setDone;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class LineChart extends AbsChart {
    private static int access000 = 0;
    private static int access100 = 1;
    private final float IAuthTabCallback;
    private final Paint IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private final ArrayList<onNavigationEvent> asBinder;
    private final float asInterface;
    private final long onExtraCallback;
    private final Paint onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private float onTransact;
    private final LinearInterpolator onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~((~i3) | i6);
        int i8 = ~((~i6) | i2);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i2) | i6));
        int i11 = i6 + i2 + i4 + (762724209 * i) + (1201824936 * i5);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i6) + 43253760 + (1339426419 * i2) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i4) + (1302855680 * i) + (1514143744 * i5) + (1905524736 * i12);
        int i14 = ((i6 * 162561953) - 555857873) + (i2 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i4 * 162560975) + (i * 701011807) + (i5 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        return i15 != 1 ? i15 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asBinder = new ArrayList<>();
        Paint paint = new Paint(7);
        this.IAuthTabCallbackDefault = paint;
        int iOnTransact = varyMatches.onTransact(this, 13);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fMin = Math.min(iOnTransact, varyMatches.onNavigationEvent(16, displayMetrics));
        this.asInterface = fMin;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onTransact = varyMatches.onNavigationEvent(13, r3);
        this.onExtraCallbackWithResult = new Paint(7);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onNavigationEvent = varyMatches.onNavigationEvent(15, r8);
        this.IAuthTabCallback = 3.75f;
        this.onWarmupCompleted = new LinearInterpolator();
        this.onExtraCallback = 4000L;
        paint.setTextSize(fMin);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTypeface(response.toTypeface$default(response.Regular, context, (setDone) null, 2, (Object) null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LineChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = access100;
            int i5 = i4 + 125;
            access000 = i5 % 128;
            int i6 = i5 % 2 != 0 ? 1 : 0;
            int i7 = i4 + 31;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            i = i6;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LineChart lineChart = (LineChart) objArr[0];
        ArrayList arrayList = (ArrayList) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                boolean zOnNavigationEvent = super.onNavigationEvent(arrayList2);
                if (zOnNavigationEvent) {
                    int i2 = access000 + 67;
                    access100 = i2 % 128;
                    if (i2 % 2 == 0) {
                        lineChart.asBinder.clear();
                        arrayList.iterator();
                        obj.hashCode();
                        throw null;
                    }
                    lineChart.asBinder.clear();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        lineChart.asBinder.add((onNavigationEvent) it2.next());
                    }
                }
                return Boolean.valueOf(zOnNavigationEvent);
            }
            int i3 = access100 + 53;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                arrayList2.addAll(((onNavigationEvent) it.next()).IAuthTabCallback());
                obj.hashCode();
                throw null;
            }
            arrayList2.addAll(((onNavigationEvent) it.next()).IAuthTabCallback());
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LineChart lineChart = (LineChart) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = lineChart.onWarmupCompleted().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = access100 + Imgproc.COLOR_YUV2RGB_YVYU;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            ((AFj1sSDK) it.next()).IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fIAuthTabCallback = ((AFj1sSDK) it.next()).IAuthTabCallback();
        while (!(!it.hasNext())) {
            fIAuthTabCallback = Math.max(fIAuthTabCallback, ((AFj1sSDK) it.next()).IAuthTabCallback());
        }
        int i5 = access000 + 113;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(fIAuthTabCallback);
    }

    private final float access100() {
        int i = 2 % 2;
        int i2 = access000 + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int measuredWidth = getMeasuredWidth();
        return i3 == 0 ? (measuredWidth >> getPaddingLeft()) * getPaddingRight() : (measuredWidth - getPaddingLeft()) - getPaddingRight();
    }

    private final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 7;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float measuredHeight = ((((getMeasuredHeight() - getPaddingBottom()) - this.IAuthTabCallbackStub) - this.onTransact) - this.onNavigationEvent) - getPaddingTop();
        int i4 = access000 + 37;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return measuredHeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float paddingTop = getPaddingTop() + this.onNavigationEvent;
        int i4 = access000 + 25;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return paddingTop;
    }

    private final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float fAsInterface = asInterface() + IAuthTabCallbackStub();
        int i4 = access000 + 75;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return fAsInterface;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LineChart lineChart = (LineChart) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float paddingLeft = lineChart.getPaddingLeft();
        int i4 = access000 + 15;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(paddingLeft);
        }
        int i5 = 51 / 0;
        return Float.valueOf(paddingLeft);
    }

    private final float onTransact() {
        int i = 2 % 2;
        int i2 = access000 + 3;
        access100 = i2 % 128;
        float measuredWidth = i2 % 2 == 0 ? getMeasuredWidth() + getPaddingRight() : getMeasuredWidth() - getPaddingRight();
        int i3 = access000 + 97;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        return measuredWidth;
    }

    private final float getInterfaceDescriptor() {
        float f;
        int i = 2 % 2;
        int i2 = access100 + 83;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f = (jCurrentTimeMillis * r3) - this.onExtraCallback;
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f = (jCurrentTimeMillis2 % r3) / this.onExtraCallback;
        }
        int i3 = access000 + 45;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int IAuthTabCallback(float f) {
        float f2;
        int i = 2 % 2;
        int i2 = access000 + 17;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        LinearInterpolator linearInterpolator = this.onWarmupCompleted;
        if (f > 0.5f) {
            int i5 = i3 + 47;
            access000 = i5 % 128;
            f2 = i5 % 2 != 0 ? (0.0f / f) % 0.0f : (1.0f - f) * 2.0f;
        } else {
            f2 = f * 2.0f;
        }
        return getCurrentBacktraceOrBuilderList.onNavigationEvent((0.5f - (linearInterpolator.getInterpolation(f2) * 0.4f)) * 255.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1 r5 r6
      0x0029: PHI (r1v6 float) = (r1v5 float), (r1v10 float) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r5v1 float) = (r5v0 float), (r5v6 float) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r6v1 android.view.animation.LinearInterpolator) = (r6v0 android.view.animation.LinearInterpolator), (r6v3 android.view.animation.LinearInterpolator) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float onExtraCallbackWithResult(float f) {
        float f2;
        float f3;
        LinearInterpolator linearInterpolator;
        int i = 2 % 2;
        int i2 = access000 + 73;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            float f4 = this.onNavigationEvent;
            f2 = this.IAuthTabCallback;
            f3 = f4 * f2;
            linearInterpolator = this.onWarmupCompleted;
            if (f > 0.5f) {
                int i4 = i3 + 107;
                access000 = i4 % 128;
                f = i4 % 2 != 0 ? 0.0f % f : 1.0f - f;
            }
        } else {
            float f5 = this.onNavigationEvent;
            f2 = this.IAuthTabCallback;
            f3 = f5 / f2;
            linearInterpolator = this.onWarmupCompleted;
            if (f > 0.5f) {
            }
        }
        return f3 * (((f2 - 1.0f) * linearInterpolator.getInterpolation(f * 2.0f)) + 1.0f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float fAccess100;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = access000 + 99;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        super.onMeasure(i, i2);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        ArrayList<onNavigationEvent> arrayList = this.asBinder;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((onNavigationEvent) it.next()).getInterfaceDescriptor()) {
                    f = this.IAuthTabCallbackDefault.getFontMetrics().descent - this.IAuthTabCallbackDefault.getFontMetrics().top;
                    break;
                }
            }
            f = 0.0f;
        } else {
            f = 0.0f;
        }
        this.IAuthTabCallbackStub = f;
        for (onNavigationEvent onnavigationevent : this.asBinder) {
            Path pathIAuthTabCallbackStubProxy = onnavigationevent.IAuthTabCallbackStubProxy();
            Path pathOnNavigationEvent = onnavigationevent.onNavigationEvent();
            pathIAuthTabCallbackStubProxy.reset();
            pathOnNavigationEvent.reset();
            int iOnTransact = onnavigationevent.onTransact();
            int i7 = 0;
            if (iOnTransact < i3) {
                int i8 = access000 + 79;
                access100 = i8 % 128;
                if (i8 % i3 == 0) {
                    fAccess100 = access100();
                    int i9 = 17 / 0;
                } else {
                    fAccess100 = access100();
                }
            } else {
                fAccess100 = access100() / (iOnTransact - 1.0f);
            }
            pathOnNavigationEvent.moveTo(((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue(), IAuthTabCallbackDefault());
            float fFloatValue = ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue();
            float fFloatValue2 = ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1347580042, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1347580042)).floatValue();
            for (Object obj : onnavigationevent.IAuthTabCallback()) {
                int i10 = access100 + 63;
                access000 = i10 % 128;
                int i11 = i10 % i3;
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                AFj1sSDK aFj1sSDK = (AFj1sSDK) obj;
                float fFloatValue3 = ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue() + (i7 * fAccess100);
                float fIAuthTabCallbackDefault = IAuthTabCallbackDefault() - (fFloatValue2 == 0.0f ? 0.0f : (IAuthTabCallbackStub() * aFj1sSDK.IAuthTabCallback()) / fFloatValue2);
                if (i7 == 0) {
                    pathIAuthTabCallbackStubProxy.moveTo(fFloatValue3, fIAuthTabCallbackDefault);
                } else {
                    pathIAuthTabCallbackStubProxy.lineTo(fFloatValue3, fIAuthTabCallbackDefault);
                }
                pathOnNavigationEvent.lineTo(fFloatValue3, fIAuthTabCallbackDefault);
                onnavigationevent.onWarmupCompleted().setShader(new LinearGradient(((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue(), asInterface(), ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue(), IAuthTabCallbackDefault(), VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(onnavigationevent.access000(), 127), 16777215, Shader.TileMode.REPEAT));
                i7++;
                fFloatValue = fFloatValue3;
                i3 = 2;
            }
            pathOnNavigationEvent.lineTo(fFloatValue, IAuthTabCallbackDefault());
            pathOnNavigationEvent.lineTo(((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue(), IAuthTabCallbackDefault());
            onnavigationevent.onExtraCallbackWithResult(this.IAuthTabCallbackDefault.measureText(onnavigationevent.IAuthTabCallbackDefault()));
            onnavigationevent.IAuthTabCallback(this.IAuthTabCallbackDefault.measureText((String) onNavigationEvent.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{onnavigationevent}, 1188731824, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1188731824, TTVideoLandingPageActivity.onExtraCallbackWithResult())));
            i3 = 2;
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = access000 + 79;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.draw(canvas);
        onExtraCallbackWithResult(canvas);
        IAuthTabCallback(canvas);
        onExtraCallback(canvas);
        invalidate();
        int i4 = access000 + 27;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(Canvas canvas) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = this.asBinder.iterator();
        while (it.hasNext()) {
            int i4 = access100 + 51;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                onNavigationEvent onnavigationevent = (onNavigationEvent) it.next();
                Path pathIAuthTabCallbackStubProxy = onnavigationevent.IAuthTabCallbackStubProxy();
                int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                canvas.drawPath(pathIAuthTabCallbackStubProxy, (Paint) onNavigationEvent.onNavigationEvent(iOnExtraCallbackWithResult, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{onnavigationevent}, -1806922595, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1806922596, iOnExtraCallbackWithResult2));
                onnavigationevent.IAuthTabCallback_Parcel();
                throw null;
            }
            onNavigationEvent onnavigationevent2 = (onNavigationEvent) it.next();
            Path pathIAuthTabCallbackStubProxy2 = onnavigationevent2.IAuthTabCallbackStubProxy();
            int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            canvas.drawPath(pathIAuthTabCallbackStubProxy2, (Paint) onNavigationEvent.onNavigationEvent(iOnExtraCallbackWithResult3, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{onnavigationevent2}, -1806922595, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1806922596, iOnExtraCallbackWithResult4));
            if (onnavigationevent2.IAuthTabCallback_Parcel()) {
                canvas.drawPath(onnavigationevent2.onNavigationEvent(), onnavigationevent2.onWarmupCompleted());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(Canvas canvas) {
        int i;
        Object next;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = access000 + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Iterator<T> it = this.asBinder.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i6 = access000 + 1;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                next = it.next();
                if (((onNavigationEvent) next).getInterfaceDescriptor()) {
                    break;
                }
            } else {
                next = it.next();
                int i7 = 33 / 0;
                if (((onNavigationEvent) next).getInterfaceDescriptor()) {
                    break;
                }
            }
        }
        onNavigationEvent onnavigationevent = (onNavigationEvent) next;
        if (onnavigationevent != null) {
            int i8 = access100 + 65;
            access000 = i8 % 128;
            if (i8 % 2 != 0) {
                onnavigationevent.access100();
                throw null;
            }
            Paint paint = this.IAuthTabCallbackDefault;
            Integer numAccess100 = onnavigationevent.access100();
            paint.setColor(numAccess100 != null ? numAccess100.intValue() : ContextCompat.getColor(getContext(), R.color.grey_500));
            this.IAuthTabCallbackDefault.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(onnavigationevent.IAuthTabCallbackDefault(), ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue(), getMeasuredHeight() - getPaddingBottom(), this.IAuthTabCallbackDefault);
            this.IAuthTabCallbackDefault.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText((String) onNavigationEvent.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{onnavigationevent}, 1188731824, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1188731824, TTVideoLandingPageActivity.onExtraCallbackWithResult()), onTransact(), getMeasuredHeight() - getPaddingBottom(), this.IAuthTabCallbackDefault);
        }
        for (onNavigationEvent onnavigationevent2 : this.asBinder) {
            int iOnTransact = onnavigationevent2.onTransact();
            float fAccess100 = iOnTransact < i2 ? access100() : access100() / (iOnTransact - 1.0f);
            int i9 = access100 + 85;
            access000 = i9 % 128;
            int i10 = i9 % i2;
            int i11 = i;
            for (Object obj : onnavigationevent2.IAuthTabCallback()) {
                int i12 = access100 + 37;
                access000 = i12 % 128;
                int i13 = i12 % i2;
                int i14 = i11 + 1;
                if (i11 < 0) {
                    int i15 = access100 + 17;
                    access000 = i15 % 128;
                    if (i15 % i2 != 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                AFj1sSDK aFj1sSDK = (AFj1sSDK) obj;
                if (aFj1sSDK.onExtraCallbackWithResult().length() > 0) {
                    Integer num = (Integer) onNavigationEvent.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{onnavigationevent2}, -1637742600, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1637742602, TTVideoLandingPageActivity.onExtraCallbackWithResult());
                    if (num != null) {
                        int i16 = access000 + 85;
                        access100 = i16 % 128;
                        int i17 = i16 % i2;
                        if (num.intValue() != i14) {
                            Paint paint2 = this.IAuthTabCallbackDefault;
                            Context context = getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            paint2.setColor(aFj1sSDK.onExtraCallback(context));
                            this.IAuthTabCallbackDefault.setTextAlign(Paint.Align.CENTER);
                            float fMeasureText = this.IAuthTabCallbackDefault.measureText(aFj1sSDK.onExtraCallbackWithResult()) / 2.0f;
                            float fAsInterface = onnavigationevent2.asInterface();
                            Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
                            float fMax = Math.max(i11 * fAccess100, fAsInterface + varyMatches.onNavigationEvent(2, r2) + fMeasureText);
                            float fAccess1002 = access100();
                            float fAsBinder = onnavigationevent2.asBinder();
                            Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
                            canvas.drawText(aFj1sSDK.onExtraCallbackWithResult(), Math.min(fMax, ((fAccess1002 - fAsBinder) - varyMatches.onNavigationEvent(2, r6)) - fMeasureText) + ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue(), getMeasuredHeight() - getPaddingBottom(), this.IAuthTabCallbackDefault);
                        }
                    }
                }
                i11 = i14;
                i2 = 2;
                i = 0;
            }
        }
    }

    private final void onExtraCallback(Canvas canvas) {
        float fAccess100;
        int i = 2 % 2;
        int i2 = access000 + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationevent = (onNavigationEvent) CollectionsKt___CollectionsKt.lastOrNull((List) this.asBinder);
        if (onnavigationevent != null) {
            int iOnTransact = onnavigationevent.onTransact();
            if (iOnTransact < 2) {
                int i4 = access000 + 95;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                fAccess100 = access100();
            } else {
                fAccess100 = access100() / (iOnTransact - 1.0f);
            }
            float fFloatValue = ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1347580042, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1347580042)).floatValue();
            AFj1sSDK aFj1sSDK = (AFj1sSDK) CollectionsKt___CollectionsKt.lastOrNull((List) onnavigationevent.IAuthTabCallback());
            if (aFj1sSDK != null) {
                float fFloatValue2 = ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue() + (CollectionsKt__CollectionsKt.getLastIndex(onnavigationevent.IAuthTabCallback()) * fAccess100);
                float fIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                float fIAuthTabCallbackStub = 0.0f;
                if (fFloatValue != 0.0f) {
                    fIAuthTabCallbackStub = (IAuthTabCallbackStub() * aFj1sSDK.IAuthTabCallback()) / fFloatValue;
                    int i6 = access000 + 67;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                }
                float f = fIAuthTabCallbackDefault - fIAuthTabCallbackStub;
                float interfaceDescriptor = getInterfaceDescriptor();
                Paint paint = this.onExtraCallbackWithResult;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                paint.setColor(aFj1sSDK.onNavigationEvent(context));
                this.onExtraCallbackWithResult.setAlpha(IAuthTabCallback(interfaceDescriptor));
                canvas.drawCircle(fFloatValue2, f, onExtraCallbackWithResult(interfaceDescriptor), this.onExtraCallbackWithResult);
                this.onExtraCallbackWithResult.setAlpha(255);
                canvas.drawCircle(fFloatValue2, f, this.onNavigationEvent / this.IAuthTabCallback, this.onExtraCallbackWithResult);
            }
        }
    }

    public final int onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 83;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        int paddingBottom = (int) (i + getPaddingBottom() + this.IAuthTabCallbackStub + this.onTransact + this.onNavigationEvent + getPaddingTop());
        int i5 = access000 + 61;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return paddingBottom;
    }

    public static final class onNavigationEvent {
        private static int ICustomTabsCallback = 0;
        private static int extraCallbackWithResult = 1;
        private static int readTypedObject = 1;
        private static int writeTypedObject;
        private final Paint IAuthTabCallback;
        private final float IAuthTabCallbackDefault;
        private float IAuthTabCallbackStub;
        private final Integer IAuthTabCallbackStubProxy;
        private final boolean IAuthTabCallback_Parcel;
        private float access000;
        private final boolean access100;
        private final Integer asBinder;
        private final String asInterface;
        private final int extraCallback;
        private final Path getInterfaceDescriptor;
        private final Path onExtraCallback;
        private final Paint onExtraCallbackWithResult;
        private final String onTransact;
        private final List<AFj1sSDK> onWarmupCompleted;
        public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
        public static final int onNavigationEvent = 8;

        static {
            int i = ICustomTabsCallback + 1;
            readTypedObject = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            int i7 = ~i5;
            int i8 = ~(i7 | i3);
            int i9 = ~i3;
            int i10 = ~((~i) | i9);
            int i11 = ~(i9 | i5);
            int i12 = i10 | i11;
            int i13 = (~(i | i7)) | i11 | i8;
            int i14 = i3 + i5 + i6 + ((-168536539) * i2) + (1787681333 * i4);
            int i15 = i14 * i14;
            int i16 = ((-1349843359) * i3) + 1460535296 + ((-923239215) * i5) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i6) + (1604583424 * i2) + (216268800 * i4) + (1778253824 * i15);
            int i17 = (i3 * (-925914073)) + 175428941 + (i5 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i6 * (-925913209)) + (i2 * 1252505731) + (i4 * 30625011) + (i15 * (-2030960640));
            int i18 = i16 + (i17 * i17 * 899809280);
            return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(@NotNull List<? extends AFj1sSDK> list, float f, int i, @Nullable Integer num, @NotNull String str, @NotNull String str2, boolean z, boolean z2, @Nullable Integer num2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onWarmupCompleted = list;
            this.IAuthTabCallbackDefault = f;
            this.extraCallback = i;
            this.IAuthTabCallbackStubProxy = num;
            this.onTransact = str;
            this.asInterface = str2;
            this.access100 = z;
            this.IAuthTabCallback_Parcel = z2;
            this.asBinder = num2;
            this.getInterfaceDescriptor = new Path();
            this.onExtraCallback = new Path();
            Paint paint = new Paint();
            this.onExtraCallbackWithResult = paint;
            Paint paint2 = new Paint();
            this.IAuthTabCallback = paint2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(f);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint2.setColor(i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(List list, float f, int i, Integer num, String str, String str2, boolean z, boolean z2, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            Integer num3;
            String str3;
            String str4;
            boolean z3;
            boolean z4;
            Integer num4;
            if ((i2 & 8) != 0) {
                int i3 = writeTypedObject + 35;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                num3 = null;
            } else {
                num3 = num;
            }
            if ((i2 & 16) != 0) {
                int i5 = extraCallbackWithResult + 51;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str3 = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                str3 = str;
            }
            if ((i2 & 32) != 0) {
                int i8 = extraCallbackWithResult + 85;
                writeTypedObject = i8 % 128;
                int i9 = i8 % 2;
                str4 = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                str4 = str2;
            }
            if ((i2 & 64) != 0) {
                int i10 = writeTypedObject + 35;
                extraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
                z3 = false;
            } else {
                z3 = z;
            }
            if ((i2 & 128) != 0) {
                int i13 = extraCallbackWithResult + 23;
                writeTypedObject = i13 % 128;
                int i14 = i13 % 2;
                z4 = false;
            } else {
                z4 = z2;
            }
            if ((i2 & 256) != 0) {
                int i15 = 2 % 2;
                num4 = null;
            } else {
                num4 = num2;
            }
            this(list, f, i, num3, str3, str4, z3, z4, num4);
        }

        public final List<AFj1sSDK> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = writeTypedObject + Imgproc.COLOR_YUV2RGB_YVYU;
            int i3 = i2 % 128;
            extraCallbackWithResult = i3;
            int i4 = i2 % 2;
            List<AFj1sSDK> list = this.onWarmupCompleted;
            int i5 = i3 + 15;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final int access000() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 55;
            int i3 = i2 % 128;
            extraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = this.extraCallback;
            int i6 = i3 + 55;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Integer access100() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult;
            int i3 = i2 + 75;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            Integer num = this.IAuthTabCallbackStubProxy;
            int i5 = i2 + 73;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult;
            int i3 = i2 + 125;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onTransact;
            int i5 = i2 + 113;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 103;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            String str = onnavigationevent.asInterface;
            if (i3 != 0) {
                int i4 = 76 / 0;
            }
            return str;
        }

        public final boolean getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult;
            int i3 = i2 + 31;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.access100;
            int i5 = i2 + 1;
            writeTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 78 / 0;
            }
            return z;
        }

        public final boolean IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 103;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback_Parcel;
            }
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = extraCallbackWithResult;
            int i3 = i2 + 65;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            Integer num = onnavigationevent.asBinder;
            if (i4 != 0) {
                int i5 = 2 / 0;
            }
            int i6 = i2 + 61;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                return num;
            }
            throw null;
        }

        public final Path IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 91;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            Path path = this.getInterfaceDescriptor;
            int i5 = i3 + 7;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
            }
            return path;
        }

        public final Path onNavigationEvent() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 47;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Path path = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return path;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 43;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Paint paint = onnavigationevent.onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 53 / 0;
            }
            return paint;
        }

        public final Paint onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult;
            int i3 = i2 + 7;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Paint paint = this.IAuthTabCallback;
            int i4 = i2 + 67;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return paint;
        }

        public final float asInterface() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult;
            int i3 = i2 + 3;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f = this.access000;
            int i4 = i2 + 29;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 85;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.access000 = f;
            if (i4 == 0) {
                int i5 = 29 / 0;
            }
            int i6 = i2 + 113;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }

        public final void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = writeTypedObject + 55;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackStub = f;
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float asBinder() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 53;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallbackStub;
            int i5 = i3 + 59;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        public final int onTransact() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 111;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            try {
                Integer num = this.asBinder;
                if (num != null) {
                    return num.intValue();
                }
                if (!StringsKt__StringsKt.isBlank(this.onTransact)) {
                    int i4 = extraCallbackWithResult + 47;
                    writeTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    if (!StringsKt__StringsKt.isBlank(this.asInterface)) {
                        int i6 = extraCallbackWithResult + 67;
                        writeTypedObject = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = (Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) this.asInterface, new String[]{"."}, false, 0, 6, (Object) null).get(1)) - Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) this.onTransact, new String[]{"."}, false, 0, 6, (Object) null).get(1))) + 1;
                        int i9 = writeTypedObject + 3;
                        extraCallbackWithResult = i9 % 128;
                        if (i9 % 2 != 0) {
                            return i8;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
                return this.onWarmupCompleted.size();
            } catch (Throwable unused) {
                return this.onWarmupCompleted.size();
            }
        }

        public final Paint onExtraCallback() {
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            return (Paint) onNavigationEvent(iOnExtraCallbackWithResult, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{this}, -1806922595, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1806922596, iOnExtraCallbackWithResult2);
        }

        public final String onExtraCallbackWithResult() {
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            return (String) onNavigationEvent(iOnExtraCallbackWithResult, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{this}, 1188731824, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1188731824, iOnExtraCallbackWithResult2);
        }

        public static final class IAuthTabCallback {
            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }
        }

        public final Integer IAuthTabCallbackStub() {
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            return (Integer) onNavigationEvent(iOnExtraCallbackWithResult, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{this}, -1637742600, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1637742602, iOnExtraCallbackWithResult2);
        }
    }

    private final float asBinder() {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1232610555, iOnNavigationEvent, new Object[]{this}, iOnNavigationEvent2, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1232610556)).floatValue();
    }

    private final float IAuthTabCallback_Parcel() {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return ((Float) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1347580042, iOnNavigationEvent, new Object[]{this}, iOnNavigationEvent2, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1347580042)).floatValue();
    }

    public final boolean IAuthTabCallback(@NotNull ArrayList<onNavigationEvent> arrayList) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return ((Boolean) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1704331583, iOnNavigationEvent, new Object[]{this, arrayList}, iOnNavigationEvent2, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1704331581)).booleanValue();
    }
}
