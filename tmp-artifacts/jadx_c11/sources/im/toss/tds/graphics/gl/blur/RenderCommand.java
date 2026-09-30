package im.toss.tds.graphics.gl.blur;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.jvm.internal.Intrinsics;
import o.Cookie;
import o.parseDomain;
import o.setByteOrder;
import o.setSupportsTlsExtensionsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RenderCommand {
    public static final RenderCommand IAuthTabCallback = new RenderCommand();
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static final RendererApi onExtraCallback;
    private static final int onExtraCallbackWithResult;
    private static final int onNavigationEvent;
    private static int onTransact;
    public static final int onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = (~(i7 | i8 | (~i6))) | (~(i4 | i2 | i6));
        int i10 = (~(i8 | i6)) | (~(i8 | i4));
        int i11 = (~(i6 | i2)) | i4;
        int i12 = i4 + i2 + i + (1661237432 * i5) + (961048624 * i3);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i4) - 281083904) + ((-1329838950) * i2) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i) + ((-1559232512) * i5) + (1553989632 * i3) + (2020540416 * i13);
        int i15 = (i4 * (-2040814728)) + 92927091 + (i2 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i * (-2040814133)) + (i5 * (-1614655000)) + (i3 * 500164112) + (i13 * 184877056);
        return i14 + ((i15 * i15) * 1800994816) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private RenderCommand() {
    }

    static {
        Cookie cookie = new Cookie();
        onExtraCallback = cookie;
        onExtraCallbackWithResult = cookie.onExtraCallbackWithResult();
        onNavigationEvent = cookie.onWarmupCompleted();
        onWarmupCompleted = 8;
        int i = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 41;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onExtraCallbackWithResult;
        int i6 = i2 + 89;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onNavigationEvent;
        int i6 = i2 + 83;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback.onExtraCallback();
            int i3 = 31 / 0;
        } else {
            onExtraCallback.onExtraCallback();
        }
        int i4 = onTransact + 125;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback.onWarmupCompleted(j);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(RenderCommand renderCommand, setByteOrder setbyteorder, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 9;
        onTransact = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 21;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            setbyteorder = null;
        }
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback2, -1914265135, PushInfo.Companion.onExtraCallback(), 1914265135, iOnExtraCallback3, iOnExtraCallback, new Object[]{renderCommand, setbyteorder});
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setByteOrder setbyteorder = (setByteOrder) objArr[1];
        int i = 2 % 2;
        if (setbyteorder != null) {
            int i2 = onTransact + 119;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback.onExtraCallbackWithResult(setbyteorder.access100());
        }
        onExtraCallback.onNavigationEvent();
        int i4 = asBinder + 41;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onNavigationEvent(@NotNull setSupportsTlsExtensionsokhttp setsupportstlsextensionsokhttp, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 7;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setsupportstlsextensionsokhttp, "");
            onExtraCallback.onWarmupCompleted(setsupportstlsextensionsokhttp, i);
        } else {
            Intrinsics.checkNotNullParameter(setsupportstlsextensionsokhttp, "");
            onExtraCallback.onWarmupCompleted(setsupportstlsextensionsokhttp, i);
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(RenderCommand renderCommand, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = 2 % 2;
        if ((i5 & 1) != 0) {
            int i7 = onTransact + 77;
            asBinder = i7 % 128;
            i = i7 % 2 == 0 ? 1 : 0;
        }
        if ((i5 & 2) != 0) {
            int i8 = onTransact + 81;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            i2 = 0;
        }
        renderCommand.onExtraCallback(i, i2, i3, i4);
    }

    public final void onExtraCallback(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onTransact + 33;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback.IAuthTabCallback(i, i2, i3, i4);
        if (i7 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(RenderCommand renderCommand, parseDomain parsedomain, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 39;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 81;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            parsedomain = parseDomain.BOTH;
        }
        renderCommand.IAuthTabCallback(parsedomain);
    }

    public final void IAuthTabCallback(@NotNull parseDomain parsedomain) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(parsedomain, "");
            onExtraCallback.IAuthTabCallback(parsedomain);
            int i3 = 0 / 0;
        } else {
            Intrinsics.checkNotNullParameter(parsedomain, "");
            onExtraCallback.IAuthTabCallback(parsedomain);
        }
        int i4 = asBinder + 45;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback.IAuthTabCallback();
        int i4 = onTransact + 11;
        asBinder = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(RenderCommand renderCommand, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj) {
        int i12;
        int i13 = 2 % 2;
        int i14 = onTransact;
        int i15 = i14 + 87;
        asBinder = i15 % 128;
        int i16 = (i15 % 2 != 0 ? (i11 & 256) == 0 : (i11 & 935) == 0) ? i9 : onExtraCallbackWithResult;
        if ((i11 & 512) != 0) {
            int i17 = i14 + 11;
            asBinder = i17 % 128;
            int i18 = i17 % 2;
            i12 = onNavigationEvent;
        } else {
            i12 = i10;
        }
        renderCommand.onExtraCallback(i, i2, i3, i4, i5, i6, i7, i8, i16, i12);
    }

    public final void onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = 2 % 2;
        int i12 = asBinder + 69;
        onTransact = i12 % 128;
        if (i12 % 2 != 0) {
            onExtraCallback.IAuthTabCallback(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onExtraCallback.IAuthTabCallback(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        int i13 = onTransact + 69;
        asBinder = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 30 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@Nullable setByteOrder setbyteorder) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback2, -1914265135, PushInfo.Companion.onExtraCallback(), 1914265135, iOnExtraCallback3, iOnExtraCallback, new Object[]{this, setbyteorder});
    }

    public final void onWarmupCompleted() {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback2, 1139195405, PushInfo.Companion.onExtraCallback(), -1139195404, iOnExtraCallback3, iOnExtraCallback, new Object[]{this});
    }
}
