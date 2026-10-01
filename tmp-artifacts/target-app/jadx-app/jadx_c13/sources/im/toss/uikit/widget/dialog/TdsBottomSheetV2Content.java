package im.toss.uikit.widget.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.M_;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsBottomSheetV2Content extends ConstraintLayout {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private int IAuthTabCallback;
    private float onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private View onNavigationEvent;
    private float onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsBottomSheetV2Content(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsBottomSheetV2Content(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsBottomSheetV2Content(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = -1.0f;
        int iIAuthTabCallback = M_.onExtraCallback.IAuthTabCallback(context);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        this.IAuthTabCallback = iIAuthTabCallback - varyMatches.onNavigationEvent(36, displayMetrics);
        this.onWarmupCompleted = 0.9f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsBottomSheetV2Content(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asInterface + 13;
            IAuthTabCallbackStub = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = asInterface + 45;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setAttachedView(@Nullable View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 71;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = view;
        int i5 = i2 + 3;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setExpanded(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = z;
        int i5 = i3 + 111;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setExpandedMaxHeight(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = i;
        if (i4 == 0) {
            int i5 = 63 / 0;
        }
    }

    public final void setMaxHeightRatio(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 57;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = f;
        int i5 = i2 + 107;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 95;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMaxHeight(), Integer.MIN_VALUE));
        int i6 = IAuthTabCallbackStub + 111;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        View view;
        int i = 2 % 2;
        if (motionEvent == null) {
            return super/*android.view.ViewGroup*/.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.onExtraCallback = motionEvent.getY();
        } else if (action == 1) {
            this.onExtraCallback = -1.0f;
        } else if (action != 2) {
            int i2 = asInterface + 99;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0 ? action == 3 : action == 3) {
            }
        } else {
            float y = this.onExtraCallback - motionEvent.getY();
            Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
            if (y > varyMatches.onNavigationEvent(3, r3)) {
                int i3 = asInterface;
                int i4 = i3 + 29;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                View view2 = this.onNavigationEvent;
                if (view2 != null) {
                    int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    if (!view2.canScrollVertically(1)) {
                        return true;
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
            if (y < (-varyMatches.onNavigationEvent(3, r3)) && (view = this.onNavigationEvent) != null) {
                int i7 = IAuthTabCallbackStub + 5;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                if (!view.canScrollVertically(-1)) {
                    int i9 = asInterface + 107;
                    IAuthTabCallbackStub = i9 % 128;
                    int i10 = i9 % 2;
                    return true;
                }
            }
        }
        return super/*android.view.ViewGroup*/.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r0 = o.M_.onExtraCallback;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getContext(), "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return (int) (r0.IAuthTabCallback(r1) * r4.onWarmupCompleted);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((!r4.onExtraCallbackWithResult) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4.onExtraCallbackWithResult != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = r1 + 21;
        r2 = r1 % 128;
        im.toss.uikit.widget.dialog.TdsBottomSheetV2Content.IAuthTabCallbackStub = r2;
        r1 = r1 % 2;
        r1 = r4.IAuthTabCallback;
        r2 = r2 + 47;
        im.toss.uikit.widget.dialog.TdsBottomSheetV2Content.asInterface = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMaxHeight() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 45;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
    }
}
