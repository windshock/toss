package o;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ConsoleMessage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import im.toss.core.webkit.WebViewContentOwner;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AFi1aSDK4;
import o.accessgetStatep;
import o.setCircleColor;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1aSDK4 extends setCircleColor {
    private static short[] IAuthTabCallbackDefault;
    private final WebViewContentOwner onExtraCallbackWithResult;
    private final Lazy onWarmupCompleted;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 189;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = 118659562;
    private static int onExtraCallback = -1538795439;
    private static int onNavigationEvent = 2113605311;
    private static byte[] onTransact = {-71, 89, -85, -94, 92, -96, -86, 69, -87, -91};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3;
        int i4 = 115 - (b * 2);
        int i5 = (i * 4) + 1;
        int i6 = (s * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i4 = i5;
            i3 = 0;
            i4 += -i6;
            i6 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = i6;
            i6 = bArr[i6];
            i4 += -i6;
            i6 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ accessgetStatep onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        accessgetStatep accessgetstatepOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallbackStub + 99;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return accessgetstatepOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFi1aSDK4(@NotNull WebViewContentOwner webViewContentOwner, @NotNull IEngagementSignalsCallbackStubProxy iEngagementSignalsCallbackStubProxy, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws Throwable {
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackStubProxy, "");
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Context context = webViewContentOwner.getContext();
        if (context != null) {
            Object[] objArr = new Object[1];
            b((byte) (95 - View.resolveSizeAndState(0, 0, 0)), (short) (ViewConfiguration.getPressedStateDuration() >> 16), 1554693662 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-91) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 641935805 + TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), objArr);
            super(new setCircleColor.onExtraCallback(context, ((String) objArr[0]).intern()).onExtraCallbackWithResult(iEngagementSignalsCallbackStubProxy, textFieldScrollKtExternalSyntheticLambda0, newChunkedSink.onExtraCallbackWithResult().onUnminimized()).onExtraCallbackWithResult(webViewContentOwner).onExtraCallbackWithResult().IAuthTabCallback());
            this.onExtraCallbackWithResult = webViewContentOwner;
            this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.webview.TossSecuritiesChromeClient$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 113;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    accessgetStatep accessgetstatepOnExtraCallbackWithResult = AFi1aSDK4.onExtraCallbackWithResult();
                    int i4 = onWarmupCompleted + 61;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return accessgetstatepOnExtraCallbackWithResult;
                }
            });
            return;
        }
        throw new IllegalStateException("WebViewContentOwner.context is null");
    }

    private final accessgetStatep onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        accessgetStatep accessgetstatep = (accessgetStatep) this.onWarmupCompleted.getValue();
        int i4 = asInterface + 63;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return accessgetstatep;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final accessgetStatep onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return newChunkedSink.onExtraCallbackWithResult();
        }
        newChunkedSink.onExtraCallbackWithResult();
        throw null;
    }

    public void onCloseWindow(@Nullable WebView webView) {
        int i = 2 % 2;
        if (!this.onExtraCallbackWithResult.closeWebView((String) null, false)) {
            int i2 = IAuthTabCallbackStub + 71;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            super.onCloseWindow(webView);
            if (i3 == 0) {
                int i4 = 42 / 0;
            }
        }
        int i5 = asInterface + 101;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public boolean onConsoleMessage(@NotNull ConsoleMessage consoleMessage) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(consoleMessage, "");
            onNavigationEvent().onActivityLayout();
            throw null;
        }
        Intrinsics.checkNotNullParameter(consoleMessage, "");
        if (onNavigationEvent().onActivityLayout()) {
            consoleMessage.message();
            consoleMessage.lineNumber();
            consoleMessage.sourceId();
        }
        boolean zOnConsoleMessage = super.onConsoleMessage(consoleMessage);
        int i3 = IAuthTabCallbackStub + 79;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnConsoleMessage;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        boolean z2;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0')), 41 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), View.MeasureSpec.makeMeasureSpec(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 9;
                $11 = i6 % 128;
                z = i6 % 2 != 0;
            }
            if (z) {
                byte[] bArr = onTransact;
                long j2 = 0;
                if (bArr != null) {
                    int i7 = $11 + 45;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char maximumDrawingCacheSize = (char) (12843 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int i10 = 56 - (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1));
                                int i11 = 2167 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumDrawingCacheSize, i10, i11, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i9++;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $11 + 123;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        byte[] bArr3 = onTransact;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 43424), ExpandableListView.getPackedPositionChild(0L) + 43, TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] * (-4629411779493505016L))) >> ((int) (onExtraCallback * (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onTransact;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 42 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 22439 - Color.blue(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i4;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallbackDefault[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                if (z) {
                    int i14 = $10 + 107;
                    $11 = i14 % 128;
                    int i15 = i14 % 2 == 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i15;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 1), 86 - KeyEvent.getDeadChar(0, 0), 9567 - View.MeasureSpec.getSize(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onTransact;
                    if (bArr5 != null) {
                        int i16 = $10 + 113;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i18 = 0; i18 < length2; i18++) {
                            bArr6[i18] = (byte) (bArr5[i18] ^ (-4629411779493505016L));
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        int i19 = $10 + 87;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr7 = onTransact;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallbackDefault;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
