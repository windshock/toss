package o;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_expiresAt implements setTlsokhttp {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private int IAuthTabCallback;
    private isCompatible onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private boolean onWarmupCompleted;

    @Override // o.tlsVersions
    public int onNavigationEvent() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 57;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.onNavigationEvent;
            int i5 = 37 / 0;
        } else {
            i = this.onNavigationEvent;
        }
        int i6 = i3 + 23;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 111;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        this.onNavigationEvent = i;
        int i6 = i4 + 115;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 45;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        this.IAuthTabCallback = i;
        int i6 = i4 + 63;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i3 + 59;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // o.setTlsokhttp
    public isCompatible IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        isCompatible iscompatible = this.onExtraCallback;
        int i5 = i3 + 29;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return iscompatible;
    }

    @Override // o.setTlsokhttp
    public void IAuthTabCallback(@Nullable isCompatible iscompatible) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.onExtraCallback = iscompatible;
        if (i4 == 0) {
            int i5 = 63 / 0;
        }
        int i6 = i3 + 51;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public deprecated_expiresAt(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        onWarmupCompleted(fArr.length);
        onExtraCallback(onNavigationEvent() << 2);
        onNavigationEvent(fArr, 35044);
    }

    private final void onNavigationEvent(float[] fArr, int i) {
        FloatBuffer floatBufferIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onTransact + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int[] iArr = new int[1];
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glGenBuffers(1, iArr, 0);
        Unit unit = Unit.INSTANCE;
        onwarmupcompleted.IAuthTabCallback(unit);
        int i5 = iArr[0];
        this.onExtraCallbackWithResult = i5;
        GLES20.glBindBuffer(34962, i5);
        onwarmupcompleted.IAuthTabCallback(unit);
        int iOnWarmupCompleted = onWarmupCompleted();
        if (fArr != null) {
            floatBufferIAuthTabCallback = supportsTlsExtensions.IAuthTabCallback(fArr);
            int i6 = onTransact + 95;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            floatBufferIAuthTabCallback = null;
        }
        GLES20.glBufferData(34962, iOnWarmupCompleted, floatBufferIAuthTabCallback, i);
        onwarmupcompleted.IAuthTabCallback(unit);
    }

    @Override // o.tlsVersions
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (this.onWarmupCompleted) {
            throw new IllegalStateException("Can't bind destroyed buffer.");
        }
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glBindBuffer(34962, this.onExtraCallbackWithResult);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        int i4 = IAuthTabCallbackDefault + 49;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
