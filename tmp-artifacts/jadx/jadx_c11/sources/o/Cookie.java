package o;

import android.opengl.GLES20;
import android.opengl.GLES30;
import im.toss.tds.graphics.gl.blur.RendererApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Cookie implements RendererApi {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int IAuthTabCallback = 16384;
    private final int onExtraCallbackWithResult = 9729;

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i2 + 23;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public int onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.onExtraCallbackWithResult;
            int i5 = 9 / 0;
        } else {
            i = this.onExtraCallbackWithResult;
        }
        int i6 = i3 + 97;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glBlendFunc(770, 771);
        Unit unit = Unit.INSTANCE;
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES20.glDisable(2929);
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES20.glDisable(2960);
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES20.glDisable(3089);
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES20.glDisable(2884);
        onwarmupcompleted.IAuthTabCallback(unit);
        onWarmupCompleted(setByteOrder.Companion.IAuthTabCallbackDefault());
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public void onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glClearColor(setByteOrder.asInterface(j), setByteOrder.asBinder(j), setByteOrder.onExtraCallback(j), setByteOrder.onWarmupCompleted(j));
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public void onNavigationEvent() {
        applyokhttp.onWarmupCompleted onwarmupcompleted;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            onwarmupcompleted = applyokhttp.Companion;
            i = 17247;
        } else {
            onwarmupcompleted = applyokhttp.Companion;
            i = 17664;
        }
        GLES20.glClear(i);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        int i4 = onNavigationEvent + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public void onWarmupCompleted(@NotNull setSupportsTlsExtensionsokhttp setsupportstlsextensionsokhttp, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setsupportstlsextensionsokhttp, "");
        setsupportstlsextensionsokhttp.onNavigationEvent();
        if (i == 0) {
            allEnabledCipherSuites allenabledciphersuitesOnExtraCallbackWithResult = setsupportstlsextensionsokhttp.onExtraCallbackWithResult();
            if (allenabledciphersuitesOnExtraCallbackWithResult == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i5 = onWarmupCompleted + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = allenabledciphersuitesOnExtraCallbackWithResult.onNavigationEvent();
        }
        GLES20.glDrawElements(4, i, 5125, 0);
        int i7 = onNavigationEvent + 71;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public void IAuthTabCallback(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 125;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glViewport(i, i2, i3, i4);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        int i8 = onNavigationEvent + 117;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public void IAuthTabCallback(@NotNull parseDomain parsedomain) {
        applyokhttp.onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(parsedomain, "");
            onwarmupcompleted = applyokhttp.Companion;
            GLES20.glBindFramebuffer(accessgetTIME_PATTERNcp.IAuthTabCallback(parsedomain), 0);
        } else {
            Intrinsics.checkNotNullParameter(parsedomain, "");
            onwarmupcompleted = applyokhttp.Companion;
            GLES20.glBindFramebuffer(accessgetTIME_PATTERNcp.IAuthTabCallback(parsedomain), 0);
        }
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        int i3 = onNavigationEvent + 61;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glUseProgram(0);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        int i4 = onNavigationEvent + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.tds.graphics.gl.blur.RendererApi
    public void IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = 2 % 2;
        int i12 = onWarmupCompleted + 75;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES30.glBlitFramebuffer(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        int i14 = onWarmupCompleted + 105;
        onNavigationEvent = i14 % 128;
        int i15 = i14 % 2;
    }
}
