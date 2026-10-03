package viva.republica.toss.common.web.message.shared;

import android.content.Intent;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.ALCFaceResult;
import o.ALCFaceValidation;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0;
import o.TextRoundCornerProgressBarSavedState1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.addPolicy;
import o.filterCreatePageParams;
import o.mergeParams;
import o.nSetPosition;
import o.onOutOfMemory;
import o.r8lambdaM3DeYFFiQUGzHsjrfaArqWkL6N0;
import o.r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import o.setTopGuideBackgroundColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.shared.SetScreenAwakeModeHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SetScreenAwakeModeHandler implements ALCFaceResult, r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 {
    private static short[] IAuthTabCallback;
    private static final byte[] $$a = {102, -86, -98, 53};
    private static final int $$b = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int onWarmupCompleted = -454054596;
    private static int onNavigationEvent = -1538795425;
    private static int onExtraCallbackWithResult = 1748260825;
    private static byte[] onExtraCallback = {20, 30, 47, 22, 24, 46, -67, Byte.MAX_VALUE, -105, -98, -127, -83, -82, 113, -87, -98, -104, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = 115 - r8
            int r6 = r6 + 4
            byte[] r0 = viva.republica.toss.common.web.message.shared.SetScreenAwakeModeHandler.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.shared.SetScreenAwakeModeHandler.$$c(byte, short, short):java.lang.String");
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(str, str2);
        int i4 = asBinder + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asBinder + 3;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i6 = asBinder + 33;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asBinder + 35;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = asBinder + 53;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ void onNavigationEvent(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asBinder + 125;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            int i6 = 55 / 0;
        }
        int i7 = asInterface + 123;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    public /* bridge */ boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
            int i3 = 30 / 0;
        } else {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        }
        int i4 = asInterface + 93;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new SetScreenAwakeModeHandler$.ExternalSyntheticLambda0());
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNull(uri);
        if (!filterCreatePageParams.IAuthTabCallback(uri)) {
            int i4 = asBinder + 93;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                filterCreatePageParams.IAuthTabCallbackStub(uri);
                throw null;
            }
            if (!filterCreatePageParams.IAuthTabCallbackStub(uri) && (!filterCreatePageParams.onWarmupCompleted(uri))) {
                return false;
            }
        }
        return true;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        FragmentActivity activity = webViewContentOwner.getActivity();
        if (activity == null || activity.isFinishing()) {
            int i2 = asBinder + 9;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(jsonObject);
        try {
            onExtraCallback(webViewContentOwner.getWebView(), zOnWarmupCompleted);
            TossCoreWebView webView = webViewContentOwner.getWebView();
            Object obj = null;
            if (webView != null) {
                int i4 = asBinder + 7;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    webView.getUrl();
                    obj.hashCode();
                    throw null;
                }
                String url = webView.getUrl();
                if (url != null) {
                    int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                    Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), -846257502, iOnExtraCallbackWithResult2, 846257509, new Object[]{url});
                    if (uri != null) {
                        int i5 = asInterface + 15;
                        asBinder = i5 % 128;
                        int i6 = i5 % 2;
                        if (filterCreatePageParams.IAuthTabCallbackStub(uri)) {
                            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaDescriptionCompat = addPolicy.MediaDescriptionCompat();
                            Object[] objArr = new Object[1];
                            a((short) (TextUtils.getOffsetBefore("", 0) + 106), (byte) (Process.myTid() >> 22), (-1084781870) - ExpandableListView.getPackedPositionType(0L), 864841882 + View.getDefaultSize(0, 0), (-75) - View.resolveSize(0, 0), objArr);
                            textRoundCornerProgressBarSavedState1MediaDescriptionCompat.onNavigationEvent(((String) objArr[0]).intern(), zOnWarmupCompleted);
                        }
                    }
                }
            }
            setOnOutOfMemeryErrorCallback.onExtraCallback(settopguidebackgroundcolor, (Function1) null, 1, (Object) null);
        } catch (Throwable th) {
            ALCFaceBox.onExtraCallbackWithResult(settopguidebackgroundcolor, th, (String) null, (Map) null, 6, (Object) null);
        }
    }

    public void IAuthTabCallback(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            r8lambdaM3DeYFFiQUGzHsjrfaArqWkL6N0.Companion.onExtraCallbackWithResult().onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        r8lambdaM3DeYFFiQUGzHsjrfaArqWkL6N0.Companion.onExtraCallbackWithResult().onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback);
        int i3 = asBinder + 5;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    private final boolean onWarmupCompleted(JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a((short) ((-28) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1084781877, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 864841876, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 81, objArr);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr[0]).intern(), false})).booleanValue();
        int i2 = asInterface + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return zBooleanValue;
    }

    private final void onExtraCallback(View view, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 97;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (view != null) {
            int i5 = i2 + 7;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            view.setKeepScreenOn(z);
        }
        int i7 = asBinder + 27;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 17 / 0;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        char c;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 43424), 42 - ((Process.getThreadPriority(0) + 20) >> 6), 22438 - Process.getGidForName(""), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = -1;
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int i6 = $11;
                    int i7 = i6 + 65;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = i6 + 7;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) i5;
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 12795), (ViewConfiguration.getPressedStateDuration() >> 16) + 55, 2167 - (ViewConfiguration.getLongPressTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i11++;
                            i5 = -1;
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
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 43425), 42 - KeyEvent.getDeadChar(0, 0), 22439 - View.MeasureSpec.getSize(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j)) + (!(z2 ^ true) ? 1 : 0);
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 86 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 9566 - ((byte) KeyEvent.getModifierMetaStateMask()), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $10 + 37;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i15 = $10 + 109;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback >> (((byte) (((byte) (bArr6[r8] * (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr7 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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
