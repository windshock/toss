package o;

import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setViewCacheExtension extends setPreserveFocusAfterLayout {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private final RectF IAuthTabCallback;
    private final setRecycledViewPool IAuthTabCallbackDefault;
    private final setRecycledViewPool IAuthTabCallbackStub;
    private float[] asBinder;
    private final setRecycledViewPool asInterface;
    private stopNestedScroll onExtraCallback;
    private FloatBuffer onExtraCallbackWithResult;
    private setEdgeEffectFactory onNavigationEvent;
    private final setRecycledViewPool onTransact;
    private int onWarmupCompleted;

    public setViewCacheExtension() {
        this(null, null, null, null, null, null, 63, null);
    }

    public setViewCacheExtension(int i2) {
        this(i2, null, null, null, null, 30, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(int i2, @NotNull String str) {
        this(i2, str, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(int i2, @NotNull String str, @NotNull String str2) {
        this(i2, str, str2, null, null, 24, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(int i2, @NotNull String str, @NotNull String str2, @Nullable String str3) {
        this(i2, str, str2, str3, null, 16, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(@NotNull String str) {
        this(str, null, null, null, null, null, 62, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(@NotNull String str, @NotNull String str2) {
        this(str, str2, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this(str, str2, str3, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this(str, str2, str3, str4, null, null, 48, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5) {
        this(str, str2, str3, str4, str5, null, 32, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
    }

    protected float IAuthTabCallback(int i2, @NotNull setEdgeEffectFactory setedgeeffectfactory, float f, float f2, float f3, boolean z) {
        Intrinsics.checkNotNullParameter(setedgeeffectfactory, "");
        return ((f - f2) / (f3 - f2)) + 0.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected setViewCacheExtension(int i2, boolean z, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        super(i2, z, new setRecyclerListener[0]);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.asBinder = setScrollState.onExtraCallbackWithResult(scrollByInternal.onExtraCallbackWithResult);
        this.IAuthTabCallbackDefault = str4 == null ? null : onWarmupCompleted(str4);
        this.onExtraCallbackWithResult = swapAdapter.onNavigationEvent(8);
        this.onTransact = str3 != null ? IAuthTabCallback(str3) : null;
        this.IAuthTabCallbackStub = IAuthTabCallback(str);
        this.asInterface = onWarmupCompleted(str2);
        this.IAuthTabCallback = new RectF();
        this.onWarmupCompleted = -1;
    }

    public /* synthetic */ setViewCacheExtension(String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n" : str, (i2 & 2) != 0 ? "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n" : str2, (i2 & 4) != 0 ? "aPosition" : str3, (i2 & 8) != 0 ? "uMVPMatrix" : str4, (i2 & 16) != 0 ? "aTextureCoord" : str5, (i2 & 32) != 0 ? "uTexMatrix" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6) {
        this(setPreserveFocusAfterLayout.Companion.onWarmupCompleted(str, str2), true, str3, str4, str5, str6);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
    }

    public /* synthetic */ setViewCacheExtension(int i2, String str, String str2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? "aPosition" : str, (i3 & 4) != 0 ? "uMVPMatrix" : str2, (i3 & 8) != 0 ? "aTextureCoord" : str3, (i3 & 16) != 0 ? "uTexMatrix" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setViewCacheExtension(int i2, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        this(i2, false, str, str2, str3, str4);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    public final void onExtraCallbackWithResult(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        this.asBinder = fArr;
    }

    public final float[] onExtraCallbackWithResult() {
        return this.asBinder;
    }

    @Override // o.setPreserveFocusAfterLayout
    public void IAuthTabCallback(@NotNull setChildImportantForAccessibilityInternal setchildimportantforaccessibilityinternal, @NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(setchildimportantforaccessibilityinternal, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        super.IAuthTabCallback(setchildimportantforaccessibilityinternal, fArr);
        if (!(setchildimportantforaccessibilityinternal instanceof setEdgeEffectFactory)) {
            throw new RuntimeException("GlTextureProgram only supports 2D drawables.");
        }
        stopNestedScroll stopnestedscroll = this.onExtraCallback;
        if (stopnestedscroll != null) {
            stopnestedscroll.onExtraCallback();
        }
        boolean z = true;
        GLES20.glUniformMatrix4fv(this.asInterface.onWarmupCompleted(), 1, false, fArr, 0);
        scrollByInternal.IAuthTabCallback("glUniformMatrix4fv");
        setRecycledViewPool setrecycledviewpool = this.IAuthTabCallbackDefault;
        if (setrecycledviewpool != null) {
            GLES20.glUniformMatrix4fv(setrecycledviewpool.onWarmupCompleted(), 1, false, onExtraCallbackWithResult(), 0);
            scrollByInternal.IAuthTabCallback("glUniformMatrix4fv");
        }
        setRecycledViewPool setrecycledviewpool2 = this.IAuthTabCallbackStub;
        GLES20.glEnableVertexAttribArray(setrecycledviewpool2.onExtraCallbackWithResult());
        scrollByInternal.IAuthTabCallback("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(setrecycledviewpool2.onExtraCallbackWithResult(), 2, setScrollingTouchSlop.onWarmupCompleted(), false, setchildimportantforaccessibilityinternal.asInterface(), (Buffer) setchildimportantforaccessibilityinternal.onWarmupCompleted());
        scrollByInternal.IAuthTabCallback("glVertexAttribPointer");
        setRecycledViewPool setrecycledviewpool3 = this.onTransact;
        if (setrecycledviewpool3 == null) {
            return;
        }
        if (!Intrinsics.areEqual(setchildimportantforaccessibilityinternal, this.onNavigationEvent) || setchildimportantforaccessibilityinternal.onExtraCallback() != this.onWarmupCompleted) {
            setEdgeEffectFactory setedgeeffectfactory = (setEdgeEffectFactory) setchildimportantforaccessibilityinternal;
            this.onNavigationEvent = setedgeeffectfactory;
            this.onWarmupCompleted = setchildimportantforaccessibilityinternal.onExtraCallback();
            setedgeeffectfactory.IAuthTabCallback(this.IAuthTabCallback);
            int iOnTransact = setchildimportantforaccessibilityinternal.onTransact() << 1;
            if (this.onExtraCallbackWithResult.capacity() < iOnTransact) {
                stopScroll.onWarmupCompleted(this.onExtraCallbackWithResult);
                this.onExtraCallbackWithResult = swapAdapter.onNavigationEvent(iOnTransact);
            }
            this.onExtraCallbackWithResult.clear();
            this.onExtraCallbackWithResult.limit(iOnTransact);
            if (iOnTransact > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    boolean z2 = i2 % 2 == 0 ? z : false;
                    float f = setchildimportantforaccessibilityinternal.onWarmupCompleted().get(i2);
                    RectF rectF = this.IAuthTabCallback;
                    float f2 = z2 ? rectF.left : rectF.bottom;
                    RectF rectF2 = this.IAuthTabCallback;
                    this.onExtraCallbackWithResult.put(IAuthTabCallback(i2 / 2, setedgeeffectfactory, f, f2, z2 ? rectF2.right : rectF2.top, z2));
                    if (i3 >= iOnTransact) {
                        break;
                    }
                    i2 = i3;
                    z = true;
                }
            }
        }
        this.onExtraCallbackWithResult.rewind();
        GLES20.glEnableVertexAttribArray(setrecycledviewpool3.onExtraCallbackWithResult());
        scrollByInternal.IAuthTabCallback("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(setrecycledviewpool3.onExtraCallbackWithResult(), 2, setScrollingTouchSlop.onWarmupCompleted(), false, setchildimportantforaccessibilityinternal.asInterface(), (Buffer) this.onExtraCallbackWithResult);
        scrollByInternal.IAuthTabCallback("glVertexAttribPointer");
    }

    @Override // o.setPreserveFocusAfterLayout
    public void onExtraCallback(@NotNull setChildImportantForAccessibilityInternal setchildimportantforaccessibilityinternal) {
        Intrinsics.checkNotNullParameter(setchildimportantforaccessibilityinternal, "");
        super.onExtraCallback(setchildimportantforaccessibilityinternal);
        GLES20.glDisableVertexAttribArray(this.IAuthTabCallbackStub.onExtraCallbackWithResult());
        setRecycledViewPool setrecycledviewpool = this.onTransact;
        if (setrecycledviewpool != null) {
            GLES20.glDisableVertexAttribArray(setrecycledviewpool.onExtraCallbackWithResult());
        }
        stopNestedScroll stopnestedscroll = this.onExtraCallback;
        if (stopnestedscroll != null) {
            stopnestedscroll.onWarmupCompleted();
        }
        scrollByInternal.IAuthTabCallback("onPostDraw end");
    }

    @Override // o.setPreserveFocusAfterLayout
    public void onNavigationEvent() {
        super.onNavigationEvent();
        stopScroll.onWarmupCompleted(this.onExtraCallbackWithResult);
        stopNestedScroll stopnestedscroll = this.onExtraCallback;
        if (stopnestedscroll != null) {
            stopnestedscroll.IAuthTabCallbackStub();
        }
        this.onExtraCallback = null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
