package im.toss.uikit.widget.mobileId;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AnrPluginExternalSyntheticLambda0;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class MobileIdBaseView extends ConstraintLayout {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Lazy onExtraCallback;
    private Function2<? super List<? extends View>, ? super View, Unit> onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MobileIdBaseView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MobileIdBaseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ float onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted(context);
        int i4 = IAuthTabCallback + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return unitOnNavigationEvent;
    }

    public abstract MobileIdCardHologramMaskView onExtraCallback();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileIdBaseView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.mobileId.MobileIdBaseView$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 103;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Float fValueOf = Float.valueOf(MobileIdBaseView.onExtraCallbackWithResult(context));
                int i5 = IAuthTabCallback + 43;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 35 / 0;
                }
                return fValueOf;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MobileIdBaseView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 81;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onNavigationEvent + 85;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((Number) this.onExtraCallback.getValue()).floatValue();
            obj.hashCode();
            throw null;
        }
        float fFloatValue = ((Number) this.onExtraCallback.getValue()).floatValue();
        int i3 = IAuthTabCallback + 21;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return fFloatValue;
        }
        obj.hashCode();
        throw null;
    }

    private static final float onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = 1.0f / AnrPluginExternalSyntheticLambda0.onNavigationEvent.onExtraCallbackWithResult(context);
        int i4 = IAuthTabCallback + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return fOnExtraCallbackWithResult;
    }

    public final void onWarmupCompleted(float f, float f2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback().onNavigationEvent(f, f2);
        int i4 = onNavigationEvent + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback().setAlpha(f);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull findResAndMsg findresandmsg, @NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(function0, "");
        onExtraCallback().IAuthTabCallback(str, str2, findresandmsg, new Function0() { // from class: im.toss.uikit.widget.mobileId.MobileIdBaseView$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 83;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = MobileIdBaseView.onExtraCallbackWithResult(function0);
                int i5 = onNavigationEvent + 125;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onWarmupCompleted(@Nullable Function2<? super List<? extends View>, ? super View, Unit> function2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = function2;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 81;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
    }
}
