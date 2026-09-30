package o;

import android.opengl.GLES20;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.UInt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class setPreserveFocusAfterLayout implements scrollStep {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private boolean IAuthTabCallback;
    private final int onExtraCallback;
    private final setRecyclerListener[] onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    @Deprecated
    @JvmStatic
    public static final int IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        return Companion.onWarmupCompleted(str, str2);
    }

    public void IAuthTabCallback(@NotNull setChildImportantForAccessibilityInternal setchildimportantforaccessibilityinternal, @NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(setchildimportantforaccessibilityinternal, "");
        Intrinsics.checkNotNullParameter(fArr, "");
    }

    public void onExtraCallback(@NotNull setChildImportantForAccessibilityInternal setchildimportantforaccessibilityinternal) {
        Intrinsics.checkNotNullParameter(setchildimportantforaccessibilityinternal, "");
    }

    protected setPreserveFocusAfterLayout(int i2, boolean z, @NotNull setRecyclerListener... setrecyclerlistenerArr) {
        Intrinsics.checkNotNullParameter(setrecyclerlistenerArr, "");
        this.onExtraCallback = i2;
        this.onNavigationEvent = z;
        this.onExtraCallbackWithResult = setrecyclerlistenerArr;
    }

    public setPreserveFocusAfterLayout(int i2) {
        this(i2, false, new setRecyclerListener[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setPreserveFocusAfterLayout(@NotNull String str, @NotNull String str2) {
        this(new setRecyclerListener(setScrollingTouchSlop.ICustomTabsCallback(), str), new setRecyclerListener(setScrollingTouchSlop.onExtraCallback(), str2));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setPreserveFocusAfterLayout(@NotNull setRecyclerListener... setrecyclerlistenerArr) {
        this(Companion.IAuthTabCallback((setRecyclerListener[]) Arrays.copyOf(setrecyclerlistenerArr, setrecyclerlistenerArr.length)), true, (setRecyclerListener[]) Arrays.copyOf(setrecyclerlistenerArr, setrecyclerlistenerArr.length));
        Intrinsics.checkNotNullParameter(setrecyclerlistenerArr, "");
    }

    public void onNavigationEvent() {
        if (this.IAuthTabCallback) {
            return;
        }
        if (this.onNavigationEvent) {
            GLES20.glDeleteProgram(UInt.constructor-impl(this.onExtraCallback));
        }
        for (setRecyclerListener setrecyclerlistener : this.onExtraCallbackWithResult) {
            setrecyclerlistener.IAuthTabCallback();
        }
        this.IAuthTabCallback = true;
    }

    @Override // o.scrollStep
    public void onExtraCallback() {
        GLES20.glUseProgram(UInt.constructor-impl(this.onExtraCallback));
        scrollByInternal.IAuthTabCallback("glUseProgram");
    }

    public void onWarmupCompleted(@NotNull setChildImportantForAccessibilityInternal setchildimportantforaccessibilityinternal) {
        Intrinsics.checkNotNullParameter(setchildimportantforaccessibilityinternal, "");
        setchildimportantforaccessibilityinternal.onExtraCallbackWithResult();
    }

    protected final setRecycledViewPool IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return setRecycledViewPool.Companion.IAuthTabCallback(this.onExtraCallback, str);
    }

    protected final setRecycledViewPool onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return setRecycledViewPool.Companion.onExtraCallback(this.onExtraCallback, str);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        @Deprecated
        @JvmStatic
        public final int onWarmupCompleted(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return IAuthTabCallback(new setRecyclerListener(setScrollingTouchSlop.ICustomTabsCallback(), str), new setRecyclerListener(setScrollingTouchSlop.onExtraCallback(), str2));
        }

        @JvmStatic
        public final int IAuthTabCallback(@NotNull setRecyclerListener... setrecyclerlistenerArr) {
            Intrinsics.checkNotNullParameter(setrecyclerlistenerArr, "");
            int i2 = UInt.constructor-impl(GLES20.glCreateProgram());
            scrollByInternal.IAuthTabCallback("glCreateProgram");
            if (i2 == 0) {
                throw new RuntimeException("Could not create program");
            }
            for (setRecyclerListener setrecyclerlistener : setrecyclerlistenerArr) {
                GLES20.glAttachShader(i2, UInt.constructor-impl(setrecyclerlistener.onNavigationEvent()));
                scrollByInternal.IAuthTabCallback("glAttachShader");
            }
            GLES20.glLinkProgram(i2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i2, setScrollingTouchSlop.asBinder(), iArr, 0);
            if (iArr[0] == setScrollingTouchSlop.extraCallbackWithResult()) {
                return i2;
            }
            String strStringPlus = Intrinsics.stringPlus("Could not link program: ", GLES20.glGetProgramInfoLog(i2));
            GLES20.glDeleteProgram(i2);
            throw new RuntimeException(strStringPlus);
        }
    }

    @Override // o.scrollStep
    public void onWarmupCompleted() {
        GLES20.glUseProgram(0);
    }
}
