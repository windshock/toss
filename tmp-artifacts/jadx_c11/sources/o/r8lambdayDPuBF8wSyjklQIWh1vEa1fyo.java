package o;

import android.view.View;
import android.view.ViewGroup;
import com.swmansion.rnscreens.ScreenContentWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdayDPuBF8wSyjklQIWh1vEa1fyo {
    public static final r8lambdayDPuBF8wSyjklQIWh1vEa1fyo IAuthTabCallback = new r8lambdayDPuBF8wSyjklQIWh1vEa1fyo();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 63;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 51 / 0;
        }
    }

    private r8lambdayDPuBF8wSyjklQIWh1vEa1fyo() {
    }

    public final boolean IAuthTabCallback(@Nullable ViewGroup viewGroup) {
        int i = 2 % 2;
        if (viewGroup == null || !viewGroup.isLaidOut() || viewGroup.getHeight() <= 0) {
            return false;
        }
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(viewGroup);
            throw null;
        }
        if ((!onNavigationEvent(viewGroup)) && !onExtraCallback(viewGroup)) {
            return false;
        }
        int i3 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        boolean zOnNavigationEvent = onNavigationEvent(view);
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public final boolean onWarmupCompleted(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return onExtraCallback(viewGroup);
        }
        Intrinsics.checkNotNullParameter(viewGroup, "");
        int i3 = 17 / 0;
        return onExtraCallback(viewGroup);
    }

    public final boolean onExtraCallbackWithResult(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            IAuthTabCallback(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        boolean zIAuthTabCallback = IAuthTabCallback(view);
        int i3 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }

    private final boolean onNavigationEvent(View view) {
        int i = 2 % 2;
        if (view.getVisibility() == 0) {
            if (!(view instanceof ScreenContentWrapper)) {
                if (!(view instanceof ViewGroup)) {
                    return false;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt = viewGroup.getChildAt(i2);
                    Intrinsics.checkNotNullExpressionValue(childAt, "");
                    if (onNavigationEvent(childAt)) {
                        int i3 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i3 % 128;
                        return i3 % 2 != 0;
                    }
                    i2++;
                    int i4 = onExtraCallbackWithResult + 117;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                }
                return false;
            }
            int i6 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return IAuthTabCallback(view);
            }
            int i7 = 5 / 0;
            return IAuthTabCallback(view);
        }
        int i8 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean IAuthTabCallback(View view) {
        int i = 2 % 2;
        if (view.getVisibility() == 0 && view.getWidth() > 0) {
            int i2 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
                if (view.getHeight() > 0) {
                    if (!(view instanceof ViewGroup)) {
                        int i4 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return true;
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        int i7 = onNavigationEvent + 77;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        View childAt = viewGroup.getChildAt(i6);
                        Intrinsics.checkNotNullExpressionValue(childAt, "");
                        if (IAuthTabCallback(childAt)) {
                            return true;
                        }
                    }
                }
            } else if (view.getHeight() > 0) {
            }
        }
        return false;
    }

    private final boolean onExtraCallback(ViewGroup viewGroup) {
        int height;
        int height2;
        int childCount;
        int i;
        ViewGroup viewGroup2;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            height = (viewGroup.getHeight() << 68) % 85;
            height2 = (viewGroup.getHeight() * 48) >>> 20;
            childCount = viewGroup.getChildCount();
            i = 1;
        } else {
            height = (viewGroup.getHeight() * 20) / 100;
            height2 = (viewGroup.getHeight() * 80) / 100;
            childCount = viewGroup.getChildCount();
            i = 0;
        }
        while (i < childCount) {
            int i5 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z = viewGroup.getChildAt(i) instanceof ViewGroup;
                throw null;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) childAt;
                int i6 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % i2;
            } else {
                int i8 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % i2;
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                int childCount2 = viewGroup2.getChildCount();
                int i10 = 0;
                while (i10 < childCount2) {
                    int i11 = onExtraCallbackWithResult + 103;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % i2;
                    View childAt2 = viewGroup2.getChildAt(i10);
                    ViewGroup viewGroup3 = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
                    if (viewGroup3 != null) {
                        int top = viewGroup2.getTop();
                        int top2 = viewGroup3.getTop();
                        int childCount3 = viewGroup3.getChildCount();
                        int i13 = onNavigationEvent + 59;
                        onExtraCallbackWithResult = i13 % 128;
                        int i14 = i13 % i2;
                        for (int i15 = 0; i15 < childCount3; i15++) {
                            View childAt3 = viewGroup3.getChildAt(i15);
                            Intrinsics.checkNotNullExpressionValue(childAt3, "");
                            if (onWarmupCompleted(childAt3, height, height2, top + top2)) {
                                return true;
                            }
                        }
                    }
                    i10++;
                    i2 = 2;
                }
            }
            i++;
            i2 = 2;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onWarmupCompleted(View view, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            view.getVisibility();
            obj.hashCode();
            throw null;
        }
        if (view.getVisibility() == 0 && view.getWidth() > 0) {
            int i6 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 48 / 0;
                if (view.getHeight() > 0) {
                    int top = i3 + view.getTop();
                    if (!(view instanceof ViewGroup)) {
                        int i8 = onNavigationEvent + 113;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            return top < i2 && top + view.getHeight() > i;
                        }
                        throw null;
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt = viewGroup.getChildAt(i9);
                        Intrinsics.checkNotNullExpressionValue(childAt, "");
                        if (onWarmupCompleted(childAt, i, i2, top)) {
                            int i10 = onExtraCallbackWithResult + 87;
                            onNavigationEvent = i10 % 128;
                            return i10 % 2 == 0;
                        }
                    }
                }
            } else if (view.getHeight() > 0) {
            }
        }
        return false;
    }
}
