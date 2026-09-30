package im.toss.uikit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.nSetPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RoundFrameLayout extends FrameLayout {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private float onExtraCallbackWithResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundFrameLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 59;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onNavigationEvent + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setCornerRadius(float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = f;
        invalidate();
        int i4 = onNavigationEvent + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        if (motionEvent != null) {
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (motionEvent.getActionMasked() == 0 && IAuthTabCallback(motionEvent)) {
                    int i3 = onNavigationEvent + 111;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            } else {
                motionEvent.getActionMasked();
                throw null;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final boolean IAuthTabCallback(MotionEvent motionEvent) {
        int i;
        int i2 = 2 % 2;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(!(childAt instanceof TabBar))) {
                TabBar tabBar = (TabBar) childAt;
                if (tabBar.getVisibility() == 0) {
                    int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                    if (((Boolean) TabBar.onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, new Object[]{tabBar}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).booleanValue() && tabBar.onExtraCallback() > 0.0f) {
                        int i3 = onNavigationEvent + 75;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float left = tabBar.getLeft();
                        float fMin = Math.min(tabBar.getTranslationX(), 0.0f);
                        float top = tabBar.getTop();
                        float fMin2 = Math.min(tabBar.getTranslationY(), 0.0f);
                        float right = tabBar.getRight();
                        float fMax = Math.max(tabBar.getTranslationX(), 0.0f);
                        ViewGroup.LayoutParams layoutParams = tabBar.getLayoutParams();
                        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            i = layoutParams2.bottomMargin;
                        } else {
                            int i5 = onNavigationEvent + 81;
                            onExtraCallback = i5 % 128;
                            int i6 = i5 % 2;
                            i = 0;
                        }
                        float bottom = tabBar.getBottom();
                        float fMax2 = Math.max(tabBar.getTranslationY(), 0.0f);
                        float f = i;
                        if (x >= left + fMin && x <= right + fMax && y >= top + fMin2) {
                            int i7 = onExtraCallback + 49;
                            onNavigationEvent = i7 % 128;
                            if (i7 % 2 == 0 ? y <= bottom + fMax2 + f : y <= (bottom % fMax2) - f) {
                                float top2 = y - (tabBar.getTop() + tabBar.getTranslationY());
                                float fIAuthTabCallback = tabBar.IAuthTabCallback();
                                float fOnExtraCallback = tabBar.onExtraCallback();
                                if (top2 < fIAuthTabCallback) {
                                    return true;
                                }
                                int i8 = onNavigationEvent;
                                int i9 = i8 + 89;
                                onExtraCallback = i9 % 128;
                                if (i9 % 2 == 0) {
                                    if (top2 > fOnExtraCallback % fIAuthTabCallback) {
                                        return true;
                                    }
                                } else if (top2 > fOnExtraCallback + fIAuthTabCallback) {
                                    return true;
                                }
                                int i10 = i8 + 61;
                                onExtraCallback = i10 % 128;
                                int i11 = i10 % 2;
                                return false;
                            }
                        }
                        return false;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        Path path = new Path();
        float width = getWidth();
        float height = getHeight();
        float f = this.onExtraCallbackWithResult;
        path.addRoundRect(0.0f, 0.0f, width, height, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }
}
