package o;

import android.opengl.GLES20;
import androidx.compose.ui.geometry.Rect;
import im.toss.tds.graphics.gl.blur.RenderCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class persistent {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Credentials onExtraCallback;
    private final setUseCaseAttached[] onExtraCallbackWithResult;

    public persistent(@NotNull Credentials credentials) {
        Intrinsics.checkNotNullParameter(credentials, "");
        this.onExtraCallback = credentials;
        setUseCaseAttached[] setusecaseattachedArr = new setUseCaseAttached[4];
        int i = 0;
        while (i < 4) {
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setusecaseattachedArr[i] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback());
            i++;
            int i4 = onNavigationEvent + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.onExtraCallbackWithResult = setusecaseattachedArr;
        int i7 = onNavigationEvent + 3;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 86 / 0;
        }
    }

    public final void onExtraCallback(@NotNull parseokhttp parseokhttpVar, @NotNull Rect rect, @NotNull parseokhttp parseokhttpVar2, @NotNull Rect rect2, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parseokhttpVar, "");
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(parseokhttpVar2, "");
        Intrinsics.checkNotNullParameter(rect2, "");
        long jAccess100 = rect.access100();
        RenderCommand renderCommand = RenderCommand.IAuthTabCallback;
        renderCommand.IAuthTabCallback(parseDomain.DRAW);
        RenderCommand.onExtraCallbackWithResult(renderCommand, 0, 0, (int) Float.intBitsToFloat((int) (jAccess100 >> 32)), (int) Float.intBitsToFloat((int) jAccess100), 3, null);
        GLES20.glDisable(3042);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        RenderCommand.onWarmupCompleted(renderCommand, null, 1, null);
        long jOnExtraCallback = parseokhttpVar2.onNavigationEvent().onExtraCallback();
        setUseCaseAttached[] setusecaseattachedArr = this.onExtraCallbackWithResult;
        float f2 = (int) (jOnExtraCallback >> 32);
        float fIAuthTabCallbackStubProxy = rect2.IAuthTabCallbackStubProxy() / f2;
        float f3 = (int) jOnExtraCallback;
        float fIAuthTabCallbackDefault = rect2.IAuthTabCallbackDefault() / f3;
        setusecaseattachedArr[0] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f - fIAuthTabCallbackDefault) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallbackStubProxy) << 32)));
        setUseCaseAttached[] setusecaseattachedArr2 = this.onExtraCallbackWithResult;
        float fIAuthTabCallback_Parcel = rect2.IAuthTabCallback_Parcel() / f2;
        float fIAuthTabCallbackDefault2 = rect2.IAuthTabCallbackDefault() / f3;
        setusecaseattachedArr2[1] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIAuthTabCallback_Parcel) << 32) | (Float.floatToRawIntBits(1.0f - fIAuthTabCallbackDefault2) & 4294967295L)));
        setUseCaseAttached[] setusecaseattachedArr3 = this.onExtraCallbackWithResult;
        float fIAuthTabCallback_Parcel2 = rect2.IAuthTabCallback_Parcel() / f2;
        setusecaseattachedArr3[2] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f - (rect2.extraCallback() / f3)) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback_Parcel2) << 32)));
        setUseCaseAttached[] setusecaseattachedArr4 = this.onExtraCallbackWithResult;
        float fIAuthTabCallbackStubProxy2 = rect2.IAuthTabCallbackStubProxy() / f2;
        float fExtraCallback = rect2.extraCallback() / f3;
        setusecaseattachedArr4[3] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f - fExtraCallback) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallbackStubProxy2) << 32)));
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        Credentials.onNavigationEvent(this.onExtraCallback, null, parseokhttpVar2.onExtraCallback(), this.onExtraCallbackWithResult, f, 1, null);
        GLES20.glDisable(3042);
        int i4 = onNavigationEvent + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }
}
