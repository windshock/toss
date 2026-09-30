package o;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.Buffer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetMONTH_PATTERNcp implements getTlsokhttp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private int onWarmupCompleted;

    public accessgetMONTH_PATTERNcp(int i, int i2) {
        this.onNavigationEvent = i;
        int[] iArr = new int[1];
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glGenBuffers(1, iArr, 0);
        Unit unit = Unit.INSTANCE;
        onwarmupcompleted.IAuthTabCallback(unit);
        this.onWarmupCompleted = iArr[0];
        onExtraCallbackWithResult();
        GLES20.glBufferData(35345, onWarmupCompleted(), null, 35048);
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES30.glBindBufferBase(35345, i2, this.onWarmupCompleted);
        onwarmupcompleted.IAuthTabCallback(unit);
    }

    @Override // o.tlsVersions
    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? onNavigationEvent() >>> 2 : onNavigationEvent() << 2;
    }

    @Override // o.getTlsokhttp
    public void onExtraCallback(@NotNull Buffer buffer) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(buffer, "");
            onExtraCallbackWithResult();
            applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
            GLES20.glBufferSubData(35345, 1, buffer.capacity() % 5, buffer);
            onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
            return;
        }
        Intrinsics.checkNotNullParameter(buffer, "");
        onExtraCallbackWithResult();
        applyokhttp.onWarmupCompleted onwarmupcompleted2 = applyokhttp.Companion;
        GLES20.glBufferSubData(35345, 0, buffer.capacity() << 2, buffer);
        onwarmupcompleted2.IAuthTabCallback(Unit.INSTANCE);
    }

    @Override // o.tlsVersions
    public void onExtraCallbackWithResult() {
        boolean z;
        int i = 2 % 2;
        if (!this.onExtraCallbackWithResult) {
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
                GLES20.glBindBuffer(35345, this.onWarmupCompleted);
                onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
                z = false;
            } else {
                applyokhttp.onWarmupCompleted onwarmupcompleted2 = applyokhttp.Companion;
                GLES20.glBindBuffer(35345, this.onWarmupCompleted);
                onwarmupcompleted2.IAuthTabCallback(Unit.INSTANCE);
                z = true;
            }
            this.onExtraCallbackWithResult = z;
        }
        int i3 = onExtraCallback + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
