package o;

import android.opengl.GLES20;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setRecycledViewPool {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            iArr[onNavigationEvent.ATTRIB.ordinal()] = 1;
            iArr[onNavigationEvent.UNIFORM.ordinal()] = 2;
            onExtraCallbackWithResult = iArr;
        }
    }

    enum onNavigationEvent {
        ATTRIB,
        UNIFORM
    }

    public /* synthetic */ setRecycledViewPool(int i2, onNavigationEvent onnavigationevent, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, onnavigationevent, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private setRecycledViewPool(int i2, onNavigationEvent onnavigationevent, String str) throws NoWhenBranchMatchedException {
        int iGlGetAttribLocation;
        this.onNavigationEvent = str;
        int i3 = onExtraCallbackWithResult.onExtraCallbackWithResult[onnavigationevent.ordinal()];
        if (i3 == 1) {
            iGlGetAttribLocation = GLES20.glGetAttribLocation(UInt.constructor-impl(i2), str);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iGlGetAttribLocation = GLES20.glGetUniformLocation(UInt.constructor-impl(i2), str);
        }
        this.onExtraCallback = iGlGetAttribLocation;
        scrollByInternal.onNavigationEvent(iGlGetAttribLocation, str);
        this.onExtraCallbackWithResult = UInt.constructor-impl(iGlGetAttribLocation);
    }

    public final int onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public final int onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final setRecycledViewPool IAuthTabCallback(int i2, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new setRecycledViewPool(i2, onNavigationEvent.ATTRIB, str, null);
        }

        public final setRecycledViewPool onExtraCallback(int i2, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new setRecycledViewPool(i2, onNavigationEvent.UNIFORM, str, null);
        }
    }
}
