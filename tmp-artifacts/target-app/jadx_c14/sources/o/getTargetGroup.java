package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getTargetGroup implements ALCFaceQuality {
    private static short[] onNavigationEvent;
    private static final byte[] $$a = {121, -58, 81, 67};
    private static final int $$b = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallback = -449465163;
    private static int onWarmupCompleted = -1538795442;
    private static int onExtraCallback = 565999356;
    private static byte[] onExtraCallbackWithResult = {-13, 25, -3, 3, -22, 3, 7, -6, 45, -56, -9, 14, -3, 25, 10, 59, -78, 14, 1, -7, 14, 13, 51, -62, -13, -14, -11, 6, -2, 5, -16, 4, -5, -10, 14, -26, 8, 6, -16, 23, -55, -13, 25, -3, 3, 59, -59, -25, -10, -12, 27, 63, -78, 14, 1, -7, 14, 13, 51, -62, -13, -14, -11, 6, -2, 5, -11, 14, 15, 18, -55, -13, 25, -3, 3, 59, -59, -25, -10, -12, 27, 63, -78, 14, 1, -7, 14, 13, 51, -62, -13, -14, -11, 6, -2, 5, 8, 8, 8, 8};
    private static char[] asBinder = {51245, 64971, 51247, 64988, 64961, 64990, 64967, 51232, 65010, 51246, 51244, 65018, 51233, 64925, 64999, 65021, 51235, 65014, 64998, 64989, 64987, 51240, 64986, 64966, 64983, 64970, 65015, 51242, 65022, 64992, 64991, 65002, 64982, 51243, 64978, 64960};
    private static char asInterface = 51247;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 115
            byte[] r0 = o.getTargetGroup.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTargetGroup.$$c(int, short, short):java.lang.String");
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallback();
        }
        super/*o.drawTextBox*/.onExtraCallback();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onTransact + 117;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i3 = IAuthTabCallbackStub + 83;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onNavigationEvent();
        }
        super/*o.drawTextBox*/.onNavigationEvent();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = onTransact + 111;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 53;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            int i6 = 20 / 0;
        }
        int i7 = IAuthTabCallbackStub + 19;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r28, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTargetGroup.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 43424), 41 - ImageFormat.getBitsPerPixel(0), Color.green(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            long j2 = 0;
            char c = '0';
            if (!z2) {
                j = -4629411779493505016L;
            } else {
                int i6 = $11;
                int i7 = i6 + 61;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int i9 = i6 + 75;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char scrollDefaultDelay = (char) (12843 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                            int i12 = (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)) + 55;
                            int iLastIndexOf = TextUtils.lastIndexOf("", c) + 2168;
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollDefaultDelay, i12, iLastIndexOf, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i11++;
                        j2 = 0;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.MeasureSpec.getMode(0)), TextUtils.getOffsetAfter("", 0) + 42, 22438 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                if (z2) {
                    int i14 = $11 + 115;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i4;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 85 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 9567 - Color.blue(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i16 = 0; i16 < length2; i16++) {
                            bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i17 = $10 + 57;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i19 = $10 + 51;
                            $11 = i19 % 128;
                            if (i19 % 2 == 0) {
                                int i20 = 5 % 2;
                            }
                        } else {
                            short[] sArr = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r31, int r32, char[] r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTargetGroup.b(byte, int, char[], java.lang.Object[]):void");
    }
}
