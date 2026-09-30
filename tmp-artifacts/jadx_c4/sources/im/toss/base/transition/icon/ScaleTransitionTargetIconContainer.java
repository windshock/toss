package im.toss.base.transition.icon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CoroutineWorkerExternalSyntheticLambda0;
import o.deprecated_mustRevalidate;
import o.deprecated_noStore;
import o.nSetPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScaleTransitionTargetIconContainer extends TdsRoundLayout {
    private static int IAuthTabCallbackDefault = 0;
    private static int access100 = 1;
    private boolean IAuthTabCallback;
    private float IAuthTabCallbackStub;
    private Paint asBinder;
    private final Path asInterface;
    private float onExtraCallback;
    private int onExtraCallbackWithResult;
    private float onNavigationEvent;
    private final RectF onTransact;
    private CoroutineWorkerExternalSyntheticLambda0 onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScaleTransitionTargetIconContainer(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScaleTransitionTargetIconContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = i | i3 | (~i2);
        int i8 = (~((~i) | i3)) | (~(i | i2));
        int i9 = (~(i2 | (~i3))) | i;
        int i10 = i + i3 + i6 + ((-1069702238) * i4) + (1645725337 * i5);
        int i11 = i10 * i10;
        int i12 = ((i * 2084108943) - 1824784384) + (2084108943 * i3) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i6) + ((-1977090048) * i4) + (448004096 * i5) + (1807155200 * i11);
        int i13 = (i * (-999696423)) + 1136243370 + (i3 * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i6 * (-999695593)) + (i4 * 636963214) + (i5 * (-1077364033)) + (i11 * 980484096);
        return i12 + ((i13 * i13) * 1287192576) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleTransitionTargetIconContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = new Path();
        this.onTransact = new RectF();
        this.onWarmupCompleted = CoroutineWorkerExternalSyntheticLambda0.BezierRadius;
        this.onExtraCallback = deprecated_mustRevalidate.onNavigationEvent();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ScaleTransitionTargetIconContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackDefault + 67;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 11 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallbackDefault;
            int i7 = i6 + 87;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 33;
            access100 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public void setBackgroundColor(int i) {
        int i2 = 2 % 2;
        this.onExtraCallbackWithResult = i;
        Paint paint = this.asBinder;
        if (paint != null) {
            int i3 = IAuthTabCallbackDefault + 81;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            paint.setColor(i);
        }
        super.setBackgroundColor(i);
        int i5 = access100 + 81;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, im.toss.base.transition.icon.ScaleTransitionTargetIconContainer] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r5 = (ScaleTransitionTargetIconContainer) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        CoroutineWorkerExternalSyntheticLambda0 coroutineWorkerExternalSyntheticLambda0 = ((ScaleTransitionTargetIconContainer) r5).onWarmupCompleted;
        CoroutineWorkerExternalSyntheticLambda0 coroutineWorkerExternalSyntheticLambda02 = CoroutineWorkerExternalSyntheticLambda0.BezierRadius;
        if (coroutineWorkerExternalSyntheticLambda0 != coroutineWorkerExternalSyntheticLambda02) {
            ((ScaleTransitionTargetIconContainer) r5).onWarmupCompleted = coroutineWorkerExternalSyntheticLambda02;
            ((ScaleTransitionTargetIconContainer) r5).asInterface.reset();
            r5.invalidate();
            return null;
        }
        int i4 = access100 + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IAuthTabCallback(float f, float f2) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            CoroutineWorkerExternalSyntheticLambda0 coroutineWorkerExternalSyntheticLambda0 = this.onWarmupCompleted;
            CoroutineWorkerExternalSyntheticLambda0 coroutineWorkerExternalSyntheticLambda02 = CoroutineWorkerExternalSyntheticLambda0.Squircle;
            if (coroutineWorkerExternalSyntheticLambda0 == coroutineWorkerExternalSyntheticLambda02 && this.onExtraCallback == f) {
                int i3 = access100 + 11;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (this.onNavigationEvent == f2) {
                    return;
                }
            }
            this.onWarmupCompleted = coroutineWorkerExternalSyntheticLambda02;
            this.onExtraCallback = f;
            this.onNavigationEvent = f2;
            this.asInterface.reset();
            invalidate();
            return;
        }
        CoroutineWorkerExternalSyntheticLambda0 coroutineWorkerExternalSyntheticLambda03 = CoroutineWorkerExternalSyntheticLambda0.Squircle;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTransitionVisibleHeight(float f) {
        int i = 2 % 2;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(f, 1.0f);
        if (!(!this.IAuthTabCallback)) {
            int i2 = access100;
            int i3 = i2 + 9;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (this.IAuthTabCallbackStub == fCoerceAtLeast) {
                int i5 = i2 + 65;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
        }
        this.IAuthTabCallback = true;
        this.IAuthTabCallbackStub = fCoerceAtLeast;
        invalidate();
    }

    public final float IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (this.IAuthTabCallback) {
            int i5 = i3 + 91;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            float f2 = this.IAuthTabCallbackStub;
            if (i6 == 0 ? f2 > 0.0f : f2 > 2.0f) {
                return f2;
            }
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent() {
        int i = 2 % 2;
        if (!this.IAuthTabCallback) {
            int i2 = access100 + 1;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 == 0 ? this.IAuthTabCallbackStub == 0.0f : this.IAuthTabCallbackStub == 2.0f) {
                int i4 = i3 + 59;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        this.IAuthTabCallback = false;
        this.IAuthTabCallbackStub = 0.0f;
        this.asInterface.reset();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackDefault = i2 % 128;
        Float f = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            f.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(canvas, "");
        if (!this.IAuthTabCallback) {
            super.draw(canvas);
            int i3 = access100 + 117;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Float fValueOf = Float.valueOf(this.IAuthTabCallbackStub);
        if (fValueOf.floatValue() <= 0.0f) {
            int i5 = IAuthTabCallbackDefault + 71;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            f = fValueOf;
        }
        float fMin = Math.min(f != null ? f.floatValue() : getHeight(), getHeight());
        if (getWidth() > 0) {
            int i7 = access100 + 25;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            if (fMin > 0.0f) {
                this.onTransact.set(0.0f, 0.0f, getWidth(), fMin);
                onWarmupCompleted(fMin);
                int iSave = canvas.save();
                canvas.clipPath(this.asInterface);
                onNavigationEvent(canvas);
                super.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (!this.IAuthTabCallback) {
            super.dispatchDraw(canvas);
            return;
        }
        long drawingTime = getDrawingTime();
        int childCount = getChildCount();
        int i2 = IAuthTabCallbackDefault + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int i5 = access100 + 57;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                drawChild(canvas, childAt, drawingTime);
                int i7 = access100 + 19;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
            }
            i4++;
            int i9 = access100 + 73;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        this.asInterface.reset();
        if (this.onWarmupCompleted == CoroutineWorkerExternalSyntheticLambda0.Squircle) {
            onExtraCallbackWithResult(f);
            return;
        }
        if (readTypedObject() <= 0.0f && onMessageChannelReady() <= 0.0f && onActivityResized() <= 0.0f) {
            int i2 = access100 + 125;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                if (((Float) TdsRoundLayout.onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -149447741, 149447744, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2)).floatValue() <= 1.0f) {
                    if (writeTypedObject() <= 0.0f) {
                        int i3 = IAuthTabCallbackDefault + 115;
                        access100 = i3 % 128;
                        if (i3 % 2 != 0) {
                            this.asInterface.addRect(this.onTransact, Path.Direction.CW);
                            return;
                        } else {
                            this.asInterface.addRect(this.onTransact, Path.Direction.CW);
                            int i4 = 5 / 0;
                            return;
                        }
                    }
                }
            } else {
                int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                if (((Float) TdsRoundLayout.onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -149447741, 149447744, iOnExtraCallbackWithResult3, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult4)).floatValue() <= 0.0f) {
                }
            }
        }
        if (onActivityLayout() && !onPostMessage()) {
            int i5 = IAuthTabCallbackDefault + 33;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                onRelationshipValidationResult();
                throw null;
            }
            if (!onRelationshipValidationResult()) {
                onExtraCallback(f);
                int i6 = IAuthTabCallbackDefault + 7;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        Path path = this.asInterface;
        Object[] objArr = {this, Float.valueOf(f)};
        path.set((Path) IAuthTabCallback(-770822959, nSetPosition.onExtraCallbackWithResult(), 770822959, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(float f) {
        float f2;
        int i = 2 % 2;
        float width = getWidth();
        float fMin = Math.min(width, f);
        if (fMin <= 0.0f) {
            int i2 = access100 + 89;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                this.asInterface.addRect(this.onTransact, Path.Direction.CW);
                return;
            } else {
                this.asInterface.addRect(this.onTransact, Path.Direction.CW);
                int i3 = 27 / 0;
                return;
            }
        }
        float fCoerceIn = RangesKt.coerceIn(readTypedObject() / fMin, 0.0f, RangesKt.coerceIn(this.onNavigationEvent, 0.0f, 0.5f));
        float f3 = this.onNavigationEvent;
        if (f3 > 0.0f) {
            int i4 = IAuthTabCallbackDefault + 17;
            access100 = i4 % 128;
            f2 = i4 % 2 == 0 ? fCoerceIn - f3 : fCoerceIn / f3;
        } else {
            f2 = 1.0f;
        }
        this.asInterface.set(deprecated_noStore.onExtraCallback.IAuthTabCallback(width, f, RangesKt.coerceAtLeast(this.onExtraCallback * f2, 0.0f), fCoerceIn));
    }

    private final void onNavigationEvent(Canvas canvas) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            CoroutineWorkerExternalSyntheticLambda0 coroutineWorkerExternalSyntheticLambda0 = CoroutineWorkerExternalSyntheticLambda0.Squircle;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onWarmupCompleted == CoroutineWorkerExternalSyntheticLambda0.Squircle) {
            int i3 = access100 + 35;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (this.onExtraCallbackWithResult == 0) {
                return;
            }
            canvas.drawPath(this.asInterface, IAuthTabCallback());
            int i5 = access100 + 103;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
            }
        }
    }

    private final Paint IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Paint paint = this.asBinder;
        if (paint == null) {
            paint = new Paint(1);
            paint.setColor(this.onExtraCallbackWithResult);
            this.asBinder = paint;
            int i4 = IAuthTabCallbackDefault + 35;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 5;
            }
        }
        return paint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(float f) {
        float fMin;
        Path path;
        float f2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float width = getWidth();
        float fMin2 = Math.min(width, f) / 2.0f;
        float fMin3 = onExtraCallback(1) ? Math.min(onMessageChannelReady(), fMin2) : 0.0f;
        float fMin4 = onExtraCallback(2) ? Math.min(onActivityResized(), fMin2) : 0.0f;
        if (onExtraCallback(8)) {
            fMin = Math.min(((Float) TdsRoundLayout.onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -149447741, 149447744, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).floatValue(), fMin2);
        } else {
            fMin = 0.0f;
        }
        float fMin5 = onExtraCallback(4) ? Math.min(writeTypedObject(), fMin2) : 0.0f;
        if (onExtraCallback(2)) {
            this.asInterface.moveTo(width - fMin4, 0.0f);
            this.asInterface.quadTo(width, 0.0f, width, fMin4);
        } else {
            this.asInterface.moveTo(width, 0.0f);
        }
        if (!onExtraCallback(8)) {
            this.asInterface.lineTo(width, f);
        } else {
            int i4 = IAuthTabCallbackDefault + 55;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                this.asInterface.lineTo(width, f * fMin);
                path = this.asInterface;
                f2 = width / fMin;
            } else {
                this.asInterface.lineTo(width, f - fMin);
                path = this.asInterface;
                f2 = width - fMin;
            }
            path.quadTo(width, f, f2, f);
        }
        if (onExtraCallback(4)) {
            int i5 = access100 + 103;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                this.asInterface.lineTo(fMin5, f);
                this.asInterface.quadTo(2.0f, f, 0.0f, f / fMin5);
            } else {
                this.asInterface.lineTo(fMin5, f);
                this.asInterface.quadTo(0.0f, f, 0.0f, f - fMin5);
            }
        } else {
            this.asInterface.lineTo(0.0f, f);
        }
        if (onExtraCallback(1)) {
            this.asInterface.lineTo(0.0f, fMin3);
            this.asInterface.quadTo(0.0f, 0.0f, fMin3, 0.0f);
        } else {
            this.asInterface.lineTo(0.0f, 0.0f);
        }
        this.asInterface.close();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsRoundLayout tdsRoundLayout = (ScaleTransitionTargetIconContainer) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (tdsRoundLayout.onPostMessage()) {
            return deprecated_noStore.onExtraCallback.onExtraCallback(tdsRoundLayout.getWidth(), fFloatValue, tdsRoundLayout.onMessageChannelReady(), tdsRoundLayout.onActivityResized(), ((Float) TdsRoundLayout.onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -149447741, 149447744, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{tdsRoundLayout}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).floatValue(), tdsRoundLayout.writeTypedObject());
        }
        if (!tdsRoundLayout.onRelationshipValidationResult()) {
            return deprecated_noStore.onExtraCallback.onExtraCallback(tdsRoundLayout.getWidth(), fFloatValue, tdsRoundLayout.onMessageChannelReady(), tdsRoundLayout.onActivityResized(), ((Float) TdsRoundLayout.onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -149447741, 149447744, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{tdsRoundLayout}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).floatValue(), tdsRoundLayout.writeTypedObject(), tdsRoundLayout.extraCallbackWithResult());
        }
        Object[] objArr2 = {deprecated_noStore.onExtraCallback, Float.valueOf(tdsRoundLayout.getWidth()), Float.valueOf(fFloatValue), Float.valueOf(tdsRoundLayout.onMessageChannelReady()), Float.valueOf(tdsRoundLayout.onActivityResized()), Float.valueOf(((Float) TdsRoundLayout.onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -149447741, 149447744, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{tdsRoundLayout}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).floatValue()), Float.valueOf(tdsRoundLayout.writeTypedObject()), Integer.valueOf(tdsRoundLayout.extraCallbackWithResult()), false, 128, null};
        Path path = (Path) deprecated_noStore.onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 122333280, objArr2, -122333278, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = access100 + 19;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return path;
        }
        throw null;
    }

    private final boolean onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 115;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            extraCallbackWithResult();
            extraCallbackWithResult();
            throw null;
        }
        if ((i | extraCallbackWithResult()) == extraCallbackWithResult()) {
            return true;
        }
        int i4 = access100 + 107;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private final Path onNavigationEvent(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        return (Path) IAuthTabCallback(-770822959, nSetPosition.onExtraCallbackWithResult(), 770822959, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult());
    }

    public final void onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(1481091810, iOnExtraCallbackWithResult, -1481091809, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2);
    }
}
