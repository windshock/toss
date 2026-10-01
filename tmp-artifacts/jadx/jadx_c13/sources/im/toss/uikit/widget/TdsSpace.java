package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.uikit.R;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.M_;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsSpace extends View {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    private float IAuthTabCallback;
    private float onExtraCallback;
    private int onNavigationEvent;
    private int onWarmupCompleted;

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public TdsSpace(@Nullable Context context) {
        this(context, null);
    }

    public TdsSpace(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TdsSpace(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.onNavigationEvent = IntCompanionObject.MAX_VALUE;
        this.onWarmupCompleted = IntCompanionObject.MAX_VALUE;
        if (getVisibility() == 0) {
            setVisibility(4);
        }
        if (attributeSet != null && context != null) {
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Resources.Theme theme = context.getTheme();
            if (theme != null && (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.TdsSpace, 0, 0)) != null) {
                this.onExtraCallback = typedArrayObtainStyledAttributes.getFloat(R.styleable.TdsSpace_widthRatio, 0.0f);
                this.IAuthTabCallback = typedArrayObtainStyledAttributes.getFloat(R.styleable.TdsSpace_heightRatio, 0.0f);
                this.onNavigationEvent = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TdsSpace_android_maxWidth, this.onNavigationEvent);
                this.onWarmupCompleted = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TdsSpace_android_maxHeight, this.onWarmupCompleted);
                typedArrayObtainStyledAttributes.recycle();
                int i4 = 2 % 2;
            }
        }
        int i5 = onExtraCallbackWithResult + 35;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMaxWidth(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = i;
        requestLayout();
        int i5 = IAuthTabCallbackDefault + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setMaxHeight(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 97;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.onWarmupCompleted = i;
            requestLayout();
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.onWarmupCompleted = i;
        requestLayout();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        setVisibility(0);
        setAlpha(0.0f);
        r4 = im.toss.uikit.widget.TdsSpace.onExtraCallbackWithResult + 17;
        im.toss.uikit.widget.TdsSpace.IAuthTabCallbackDefault = r4 % 128;
        r4 = r4 % 2;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super.setOnClickListener(onClickListener);
            int i3 = 87 / 0;
        } else {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        float fIAuthTabCallback;
        float fIntValue;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 99;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        int i6 = i4 % 2;
        if (this.onExtraCallback > 0.0f) {
            int i7 = i5 + 1;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                M_ m_ = M_.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                fIntValue = ((Integer) M_.onNavigationEvent(-2118175014, new Object[]{m_, r1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2)).intValue() - this.onExtraCallback;
            } else {
                M_ m_2 = M_.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                fIntValue = ((Integer) M_.onNavigationEvent(-2118175014, new Object[]{m_2, r1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent3, 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent4)).intValue() * this.onExtraCallback;
            }
            i = View.MeasureSpec.makeMeasureSpec(RangesKt___RangesKt.coerceAtMost((int) fIntValue, this.onNavigationEvent), 1073741824);
        }
        if (this.IAuthTabCallback > 0.0f) {
            int i8 = IAuthTabCallbackDefault + 125;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                M_ m_3 = M_.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                fIAuthTabCallback = m_3.IAuthTabCallback(r0) % this.IAuthTabCallback;
            } else {
                M_ m_4 = M_.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                fIAuthTabCallback = m_4.IAuthTabCallback(r0) * this.IAuthTabCallback;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(RangesKt___RangesKt.coerceAtMost((int) fIAuthTabCallback, this.onWarmupCompleted), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
