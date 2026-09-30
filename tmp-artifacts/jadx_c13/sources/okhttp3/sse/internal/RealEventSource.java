package okhttp3.sse.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import okhttp3.sse.internal.ServerSentEventReader;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealEventSource implements EventSource, ServerSentEventReader.Callback, Callback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int[] onExtraCallback = {-538418373, -700635375, 1668857942, -845749172, 1815433414, -2143084669, 1146751944, 1273796027, 1476385924, 1543555301, -2062278465, -1481839245, 2081792247, 342952178, -1953410801, -1158146644, -742707482, 1817234031};
    private static int onWarmupCompleted;
    private Call call;
    private volatile boolean canceled;
    private final EventSourceListener listener;
    private final Request request;

    @Override // okhttp3.sse.internal.ServerSentEventReader.Callback
    public void onRetryChange(long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public RealEventSource(@NotNull Request request, @NotNull EventSourceListener eventSourceListener) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(eventSourceListener, "");
        this.request = request;
        this.listener = eventSourceListener;
    }

    public final void connect(@NotNull Call.Factory factory) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(factory, "");
            Call callNewCall = factory.newCall(this.request);
            callNewCall.enqueue(this);
            this.call = callNewCall;
            return;
        }
        Intrinsics.checkNotNullParameter(factory, "");
        Call callNewCall2 = factory.newCall(this.request);
        callNewCall2.enqueue(this);
        this.call = callNewCall2;
        int i3 = 98 / 0;
    }

    @Override // okhttp3.Callback
    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
        processResponse(response);
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void processResponse(@NotNull Response response) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(response, "");
        try {
            if (!response.isSuccessful()) {
                this.listener.onFailure(this, null, response);
                CloseableKt.closeFinally(response, null);
                return;
            }
            ResponseBody responseBodyBody = response.body();
            if (!isEventStream(responseBodyBody)) {
                this.listener.onFailure(this, new IllegalStateException("Invalid content-type: " + responseBodyBody.contentType()), response);
                CloseableKt.closeFinally(response, null);
                return;
            }
            Call call = this.call;
            if (call != null) {
                int i4 = IAuthTabCallback + 63;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Timeout timeout = call.timeout();
                if (timeout != null) {
                    timeout.cancel();
                }
            }
            Response responseStripBody = UnreadableResponseBodyKt.stripBody(response);
            ServerSentEventReader serverSentEventReader = new ServerSentEventReader(responseBodyBody.source(), this);
            try {
                if (!this.canceled) {
                    int i6 = IAuthTabCallback + 13;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        this.listener.onOpen(this, responseStripBody);
                        throw null;
                    }
                    this.listener.onOpen(this, responseStripBody);
                    while (!this.canceled && serverSentEventReader.processNextEvent()) {
                    }
                }
                if (this.canceled) {
                    this.listener.onFailure(this, new IOException("canceled"), responseStripBody);
                } else {
                    this.listener.onClosed(this);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(response, null);
            } catch (Exception e) {
                e = e;
                if (this.canceled) {
                    e = new IOException("canceled", e);
                }
                this.listener.onFailure(this, e, responseStripBody);
                CloseableKt.closeFinally(response, null);
            }
        } finally {
        }
    }

    private final boolean isEventStream(ResponseBody responseBody) throws Throwable {
        int i = 2 % 2;
        MediaType mediaTypeContentType = responseBody.contentType();
        if (mediaTypeContentType == null) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 5;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        String strType = mediaTypeContentType.type();
        Object[] objArr = new Object[1];
        a(new int[]{-103174108, -130455672}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr);
        if (Intrinsics.areEqual(strType, ((String) objArr[0]).intern())) {
            int i7 = onWarmupCompleted + 19;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (Intrinsics.areEqual(mediaTypeContentType.subtype(), "event-stream")) {
                int i9 = IAuthTabCallback + 29;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.Callback
    public void onFailure(@NotNull Call call, @NotNull IOException iOException) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            this.listener.onFailure(this, iOException, null);
        } else {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            this.listener.onFailure(this, iOException, null);
            throw null;
        }
    }

    @Override // okhttp3.sse.EventSource
    public Request request() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Request request = this.request;
        int i5 = i2 + 87;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return request;
    }

    @Override // okhttp3.sse.EventSource
    public void cancel() {
        Call call;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.canceled = true;
            call = this.call;
            if (call == null) {
                return;
            }
        } else {
            this.canceled = true;
            call = this.call;
            if (call == null) {
                return;
            }
        }
        call.cancel();
        int i3 = IAuthTabCallback + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // okhttp3.sse.internal.ServerSentEventReader.Callback
    public void onEvent(@Nullable String str, @Nullable String str2, @NotNull String str3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str3, "");
            this.listener.onEvent(this, str, str2, str3);
            int i3 = 55 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str3, "");
            this.listener.onEvent(this, str, str2, str3);
        }
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallback;
        int i4 = -1469660336;
        char c = '0';
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 101;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 71 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0), 8847 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i2++;
                    i4 = -1469660336;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int i7 = $10 + 109;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 71, TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i10 = i5;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i10] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $11 + 107;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.blue(0)), 39 - ExpandableListView.getPackedPositionType(0L), 10301 - View.resolveSize(0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i11 += 79;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0')), 39 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10301 - View.MeasureSpec.getSize(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i11++;
                }
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - Color.alpha(0)), 78 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i10 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
