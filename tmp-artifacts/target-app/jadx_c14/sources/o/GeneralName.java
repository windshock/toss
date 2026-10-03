package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GeneralName implements ALCFaceQuality {
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;
    private static long IAuthTabCallback = 7798559133331975163L;
    private static int onWarmupCompleted = -1776194565;
    private static char onExtraCallbackWithResult = 5407;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, short r8, int r9) {
        /*
            int r9 = r9 + 109
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = o.GeneralName.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GeneralName.$$c(byte, short, int):java.lang.String");
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onNavigationEvent + 9;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            int i6 = 15 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r19, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r20) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r20
            r1 = 2
            int r2 = r1 % r1
            java.lang.String r2 = ""
            r3 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            r4 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            r4 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            android.content.Context r3 = r17.getContext()
            o.PangleEncryptManager r4 = new o.PangleEncryptManager
            r4.<init>()
            r5 = 0
            if (r3 == 0) goto L2a
            boolean r6 = o.getMaximum.onExtraCallbackWithResult(r3)
            goto L2b
        L2a:
            r6 = r5
        L2b:
            int r7 = android.text.TextUtils.getOffsetBefore(r2, r5)
            char r8 = (char) r7
            long r9 = android.view.ViewConfiguration.getZoomControlsTimeout()
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            int r9 = r7 + (-1)
            r7 = 20
            char[] r10 = new char[r7]
            r10 = {x00e4: FILL_ARRAY_DATA , data: [30332, 4874, -12145, 27750, -9155, 11563, -3128, -24750, 9779, 56, 390, -8000, 4464, 26723, 23799, -7419, 8514, -3513, 28137, 29726} // fill-array
            r7 = 4
            char[] r11 = new char[r7]
            r11 = {x00fc: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            char[] r12 = new char[r7]
            r12 = {x0104: FILL_ARRAY_DATA , data: [-5343, -25774, -22140, -4983} // fill-array
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r13 = r15
            a(r8, r9, r10, r11, r12, r13)
            r8 = r15[r5]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            o.dynamicTrack.onExtraCallbackWithResult(r4, r8, r6)
            if (r3 == 0) goto L90
            boolean r6 = o.getMaximum.onExtraCallbackWithResult(r3)
            if (r6 == 0) goto L90
            int r6 = o.GeneralName.onNavigationEvent
            int r6 = r6 + 89
            int r8 = r6 % 128
            o.GeneralName.onExtraCallback = r8
            int r6 = r6 % r1
            if (r6 != 0) goto L7c
            boolean r3 = o.getMaximum.onNavigationEvent(r3)
            if (r3 == 0) goto L90
            goto L82
        L7c:
            boolean r3 = o.getMaximum.onNavigationEvent(r3)
            if (r3 == 0) goto L90
        L82:
            int r3 = o.GeneralName.onExtraCallback
            int r3 = r3 + 109
            int r6 = r3 % 128
            o.GeneralName.onNavigationEvent = r6
            int r3 = r3 % r1
            if (r3 == 0) goto L8e
            goto L90
        L8e:
            r1 = r14
            goto L91
        L90:
            r1 = r5
        L91:
            int r2 = android.text.TextUtils.indexOf(r2, r2, r5, r5)
            char r8 = (char) r2
            int r2 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r9 = r2 >> 16
            r2 = 22
            char[] r10 = new char[r2]
            r10 = {x010c: FILL_ARRAY_DATA , data: [31587, -29560, 26083, -29599, 29996, 17239, 492, -19483, 31768, -26728, 5855, 17242, -21853, -22049, 32672, 18994, 912, 20868, 17979, 12633, 32465, 14777} // fill-array
            char[] r11 = new char[r7]
            r11 = {x0126: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            char[] r12 = new char[r7]
            r12 = {x012e: FILL_ARRAY_DATA , data: [7251, 12546, -17942, -10132} // fill-array
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r13 = r2
            a(r8, r9, r10, r11, r12, r13)
            r2 = r2[r5]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            o.dynamicTrack.onExtraCallbackWithResult(r4, r2, r1)
            kotlinx.serialization.json.JsonObject r1 = r4.onExtraCallbackWithResult()
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r1}
            int r3 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
            int r7 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
            int r5 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
            int r4 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
            r8 = -291820715(0xffffffffee9b2b55, float:-2.401128E28)
            r2 = 291820722(0x1164d4b2, float:1.805157E-28)
            o.ALCFaceBox.onWarmupCompleted(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GeneralName.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 93;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int i6 = 43 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iGreen = 1451 - Color.green(0);
                    byte b = $$a[i2];
                    byte b2 = (byte) (b + 1);
                    byte b3 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarSize, i6, iGreen, 228868077, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char packedPositionChild = (char) (49122 - ExpandableListView.getPackedPositionChild(0L));
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44;
                        int defaultSize = 1494 - View.getDefaultSize(0, 0);
                        byte b4 = $$a[2];
                        byte b5 = (byte) (b4 + 1);
                        byte b6 = b4;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionChild, scrollBarFadeDuration, defaultSize, 1533236389, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 23973), 49 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.lastIndexOf("", '0', 0, 0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 45847), 29 - (ViewConfiguration.getFadingEdgeLength() >> 16), 12577 - Drawable.resolveOpacity(0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i7 = $11 + 121;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
