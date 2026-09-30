package o;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class parseAll implements allEnabledCipherSuites {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback;
    private final int IAuthTabCallback;
    private int onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final int onWarmupCompleted;

    public parseAll(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        this.IAuthTabCallback = iArr.length;
        this.onWarmupCompleted = onNavigationEvent() << 2;
        int[] iArr2 = new int[1];
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glGenBuffers(1, iArr2, 0);
        Unit unit = Unit.INSTANCE;
        onwarmupcompleted.IAuthTabCallback(unit);
        int i = iArr2[0];
        this.onExtraCallbackWithResult = i;
        GLES20.glBindBuffer(34963, i);
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES20.glBufferData(34963, IAuthTabCallback(), supportsTlsExtensions.IAuthTabCallback(iArr), 35044);
        onwarmupcompleted.IAuthTabCallback(unit);
    }

    @Override // o.tlsVersions
    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.IAuthTabCallback;
        if (i3 == 0) {
            int i5 = 62 / 0;
        }
        return i4;
    }

    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 + 51;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // o.tlsVersions
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this.onNavigationEvent) {
            throw new IllegalStateException("Can't bind destroyed index buffer.");
        }
        int i5 = i3 + 87;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glBindBuffer(34963, this.onExtraCallbackWithResult);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        int i7 = onExtraCallback + 83;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
    }
}
