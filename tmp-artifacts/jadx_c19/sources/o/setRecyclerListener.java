package o;

import android.opengl.GLES20;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setRecyclerListener {
    private static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    public setRecyclerListener(int i2, int i3) {
        this.onWarmupCompleted = i2;
        this.onNavigationEvent = i3;
    }

    public final int onNavigationEvent() {
        return this.onNavigationEvent;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setRecyclerListener(int i2, @NotNull String str) {
        this(i2, Companion.IAuthTabCallback(i2, str));
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final void IAuthTabCallback() {
        GLES20.glDeleteShader(UInt.constructor-impl(this.onNavigationEvent));
    }

    static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int IAuthTabCallback(int i2, String str) {
            int i3 = UInt.constructor-impl(GLES20.glCreateShader(UInt.constructor-impl(i2)));
            scrollByInternal.IAuthTabCallback(Intrinsics.stringPlus("glCreateShader type=", Integer.valueOf(i2)));
            GLES20.glShaderSource(i3, str);
            GLES20.glCompileShader(i3);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(i3, setScrollingTouchSlop.IAuthTabCallback(), iArr, 0);
            if (iArr[0] != 0) {
                return i3;
            }
            String str2 = "Could not compile shader " + i2 + ": '" + ((Object) GLES20.glGetShaderInfoLog(i3)) + "' source: " + str;
            GLES20.glDeleteShader(i3);
            throw new RuntimeException(str2);
        }
    }
}
