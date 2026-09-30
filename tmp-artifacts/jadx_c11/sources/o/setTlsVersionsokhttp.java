package o;

import android.opengl.GLES20;
import android.opengl.GLES30;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.applyokhttp;
import o.setCipherSuitesokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setTlsVersionsokhttp extends getTlsVersionsokhttp {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onNavigationEvent;
    private int IAuthTabCallback;
    private final setCipherSuitesokhttp.onExtraCallbackWithResult onExtraCallbackWithResult;
    private final setCipherSuitesokhttp.onExtraCallback onWarmupCompleted;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onExtraCallback = 8;

    static {
        int i = onNavigationEvent + 71;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    @Override // o.setCipherSuitesokhttp
    public setCipherSuitesokhttp.onExtraCallback IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 53;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        setCipherSuitesokhttp.onExtraCallback onextracallback = this.onWarmupCompleted;
        int i4 = i2 + 41;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return onextracallback;
        }
        throw null;
    }

    @Override // o.setCipherSuitesokhttp
    public setCipherSuitesokhttp.onExtraCallbackWithResult onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        setCipherSuitesokhttp.onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return onextracallbackwithresult;
    }

    @Override // o.setCipherSuitesokhttp
    public int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        int iIAuthTabCallback = (int) (i2 % 2 == 0 ? onNavigationEvent().IAuthTabCallback() >>> 109 : onNavigationEvent().IAuthTabCallback() >> 32);
        int i3 = asInterface + 75;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return iIAuthTabCallback;
    }

    @Override // o.setCipherSuitesokhttp
    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = (int) onNavigationEvent().IAuthTabCallback();
        int i4 = asBinder + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallback;
    }

    @Override // o.setCipherSuitesokhttp
    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.IAuthTabCallback;
        int i5 = i3 + 17;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // o.setCipherSuitesokhttp
    public boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onNavigationEvent().onExtraCallbackWithResult();
        int i4 = asBinder + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public setTlsVersionsokhttp(@NotNull setCipherSuitesokhttp.onExtraCallback onextracallback, @NotNull setCipherSuitesokhttp.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onWarmupCompleted = onextracallback;
        this.onExtraCallbackWithResult = onextracallbackwithresult;
        int iOnNavigationEvent = ConnectionSpecCompanion.onNavigationEvent(onextracallback);
        onNavigationEvent(iOnNavigationEvent);
        setCipherSuitesokhttp.onExtraCallback onextracallback2 = setCipherSuitesokhttp.onExtraCallback.TEXTURE_EXTERNAL_OES;
        if (onextracallback != onextracallback2) {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(IAuthTabCallbackStub(), onWarmupCompleted());
            int iCoerceAtMost = 1;
            if (onextracallbackwithresult.onWarmupCompleted()) {
                int i = asInterface + 33;
                asBinder = i % 128;
                iCoerceAtMost = i % 2 == 0 ? RangesKt.coerceAtMost(((int) (Math.log(iCoerceAtLeast) + Math.log(2.0d))) >>> 1, 34) : RangesKt.coerceAtMost(((int) (Math.log(iCoerceAtLeast) / Math.log(2.0d))) + 1, 6);
                int i2 = 2 % 2;
            }
            applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
            GLES30.glTexStorage2D(3553, iCoerceAtMost, ConnectionSpecCompanion.onWarmupCompleted(onextracallbackwithresult.onExtraCallback()), IAuthTabCallbackStub(), onWarmupCompleted());
            onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
            int i3 = 2 % 2;
        }
        applyokhttp.onWarmupCompleted onwarmupcompleted2 = applyokhttp.Companion;
        GLES20.glTexParameteri(iOnNavigationEvent, 10242, 33071);
        Unit unit = Unit.INSTANCE;
        onwarmupcompleted2.IAuthTabCallback(unit);
        GLES20.glTexParameteri(iOnNavigationEvent, 10243, 33071);
        onwarmupcompleted2.IAuthTabCallback(unit);
        if (onextracallback != onextracallback2) {
            int i4 = asBinder + 11;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (onextracallbackwithresult.onNavigationEvent()) {
                GLES20.glTexParameteri(iOnNavigationEvent, 10241, 9987);
                onwarmupcompleted2.IAuthTabCallback(unit);
            } else {
                GLES20.glTexParameteri(iOnNavigationEvent, 10241, 9729);
                onwarmupcompleted2.IAuthTabCallback(unit);
                int i6 = 2 % 2;
            }
        }
        GLES20.glTexParameteri(iOnNavigationEvent, 10240, 9729);
        onwarmupcompleted2.IAuthTabCallback(unit);
    }

    private final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int[] iArr = new int[1];
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glGenTextures(1, iArr, 0);
        Unit unit = Unit.INSTANCE;
        onwarmupcompleted.IAuthTabCallback(unit);
        this.IAuthTabCallback = iArr[0];
        GLES20.glBindTexture(i, IAuthTabCallback());
        onwarmupcompleted.IAuthTabCallback(unit);
        int i5 = asBinder + 43;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setCipherSuitesokhttp
    public void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glActiveTexture(i + 33984);
        Unit unit = Unit.INSTANCE;
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES20.glBindTexture(ConnectionSpecCompanion.onNavigationEvent(IAuthTabCallbackDefault()), IAuthTabCallback());
        onwarmupcompleted.IAuthTabCallback(unit);
        int i5 = asBinder + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.setCipherSuitesokhttp
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{IAuthTabCallback()}, 0);
        } else {
            GLES20.glDeleteTextures(1, new int[]{IAuthTabCallback()}, 0);
        }
        int i3 = asBinder + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.getTlsVersionsokhttp
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            cls.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 83;
            asInterface = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(setTlsVersionsokhttp.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (super.equals(obj)) {
            Intrinsics.checkNotNull(obj, "");
            setTlsVersionsokhttp settlsversionsokhttp = (setTlsVersionsokhttp) obj;
            return IAuthTabCallbackDefault() == settlsversionsokhttp.IAuthTabCallbackDefault() && Intrinsics.areEqual(onNavigationEvent(), settlsversionsokhttp.onNavigationEvent()) && IAuthTabCallback() == settlsversionsokhttp.IAuthTabCallback();
        }
        int i5 = asInterface + 27;
        asBinder = i5 % 128;
        return i5 % 2 == 0;
    }

    @Override // o.getTlsVersionsokhttp
    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = super.hashCode();
        int iHashCode2 = (((((iHashCode * 31) + IAuthTabCallbackDefault().hashCode()) * 31) + onNavigationEvent().hashCode()) * 31) + IAuthTabCallback();
        int i4 = asBinder + 13;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OpenGLTexture2D(target=" + IAuthTabCallbackDefault() + ", specification=" + onNavigationEvent() + ", width=" + IAuthTabCallbackStub() + ", height=" + onWarmupCompleted() + ", id=" + IAuthTabCallback() + ")";
        int i2 = asInterface + 75;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
