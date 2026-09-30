package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFaceBitmap implements ALCFaceQuality {
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onTransact = 1;
    private static int onExtraCallback = 478309001;
    private static long onNavigationEvent = 7798559133331975163L;
    private static int IAuthTabCallback = -1776194565;
    private static char onExtraCallbackWithResult = 56457;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = s + 105;
        int i4 = i * 3;
        byte[] bArr = $$a;
        int i5 = (s2 * 2) + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            i3 = i6;
            int i8 = 0;
            i5++;
            i3 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i5++;
            i3 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onTransact + 77;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i4 = onTransact + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i4 = onTransact + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i4 = onWarmupCompleted + 81;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onTransact + 7;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory.onNavigationEvent onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
        int i4 = onTransact + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af A[PHI: r3
      0x00af: PHI (r3v17 java.lang.String) = (r3v9 java.lang.String), (r3v23 java.lang.String) binds: [B:10:0x00aa, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6 A[PHI: r3
      0x00e6: PHI (r3v14 java.lang.String) = (r3v9 java.lang.String), (r3v23 java.lang.String) binds: [B:10:0x00aa, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012a A[PHI: r3
      0x012a: PHI (r3v13 java.lang.String) = (r3v9 java.lang.String), (r3v23 java.lang.String) binds: [B:10:0x00aa, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016b A[PHI: r3
      0x016b: PHI (r3v12 java.lang.String) = (r3v9 java.lang.String), (r3v23 java.lang.String) binds: [B:10:0x00aa, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01af A[PHI: r3
      0x01af: PHI (r3v11 java.lang.String) = (r3v9 java.lang.String), (r3v23 java.lang.String) binds: [B:10:0x00aa, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f2 A[PHI: r3
      0x01f2: PHI (r3v10 java.lang.String) = (r3v9 java.lang.String), (r3v23 java.lang.String) binds: [B:10:0x00aa, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.ALCFaceQuality
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String strOnNavigationEvent;
        noStore nostoreIAuthTabCallbackStub;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity != null) {
            int i2 = onWarmupCompleted + 113;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(Process.getGidForName("") + 5, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{4, 65525, 0, '\t'}, true, TextUtils.indexOf("", "") + 272, objArr);
                strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
                switch (strOnNavigationEvent.hashCode()) {
                    case -1867169789:
                        break;
                    case -1086574198:
                        break;
                    case -787957717:
                        break;
                    case 96784904:
                        break;
                    case 570398262:
                        break;
                    case 1124446108:
                        break;
                }
                return;
            }
            Object[] objArr2 = new Object[1];
            a(4 >>> Process.getGidForName(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{4, 65525, 0, '\t'}, true, 29681 / TextUtils.indexOf("", ""), objArr2);
            strOnNavigationEvent = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
            switch (strOnNavigationEvent.hashCode()) {
                case -1867169789:
                    Object[] objArr3 = new Object[1];
                    b(TextUtils.lastIndexOf("", '0', 0, 0) - 1151472178, (char) (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{38538, 25449, 45567, 34156, 60499, 3769, 37337}, new char[]{52690, 24045, 56763, 64520}, new char[]{0, 0, 0, 0}, objArr3);
                    if (strOnNavigationEvent.equals(((String) objArr3[0]).intern())) {
                        nostoreIAuthTabCallbackStub = noStore.Companion.IAuthTabCallbackStub();
                        break;
                    }
                    break;
                case -1086574198:
                    Object[] objArr4 = new Object[1];
                    b(1383382780 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) TextUtils.indexOf("", "", 0), new char[]{24852, 26012, 3804, 28160, 40371, 18872, 55999}, new char[]{64754, 29886, 50002, 51988}, new char[]{0, 0, 0, 0}, objArr4);
                    if (!strOnNavigationEvent.equals(((String) objArr4[0]).intern())) {
                    }
                    nostoreIAuthTabCallbackStub = noStore.Companion.onWarmupCompleted();
                    break;
                case -787957717:
                    b((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (24922 - Process.getGidForName("")), new char[]{13061, 27592, 35958, 16281, 19844, 61729}, new char[]{42282, 7511, 23369, 4705}, new char[]{0, 0, 0, 0}, new Object[1]);
                    if (!strOnNavigationEvent.equals(((String) r7[0]).intern())) {
                    }
                    nostoreIAuthTabCallbackStub = noStore.Companion.access100();
                    break;
                case 96784904:
                    Object[] objArr5 = new Object[1];
                    b(1985819635 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (9038 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), new char[]{50285, 29959, 55949, 27972, 38188}, new char[]{62310, 23859, 19830, 36643}, new char[]{0, 0, 0, 0}, objArr5);
                    if (!strOnNavigationEvent.equals(((String) objArr5[0]).intern())) {
                    }
                    nostoreIAuthTabCallbackStub = noStore.Companion.onWarmupCompleted();
                    break;
                case 570398262:
                    Object[] objArr6 = new Object[1];
                    a(8 - ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionGroup(0L) + 6, new char[]{'\t', 65530, 7, 65526, 65528, '\t', 65534, 3}, false, View.MeasureSpec.makeMeasureSpec(0, 0) + 267, objArr6);
                    if (strOnNavigationEvent.equals(((String) objArr6[0]).intern())) {
                        nostoreIAuthTabCallbackStub = noStore.Companion.asBinder();
                        int i3 = onWarmupCompleted + 63;
                        onTransact = i3 % 128;
                        int i4 = i3 % 2;
                        break;
                    }
                    break;
                case 1124446108:
                    Object[] objArr7 = new Object[1];
                    a(8 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7, new char[]{65525, 6, 2, 65533, 2, 65531, 11}, false, TextUtils.indexOf((CharSequence) "", '0') + 269, objArr7);
                    if (!strOnNavigationEvent.equals(((String) objArr7[0]).intern())) {
                    }
                    nostoreIAuthTabCallbackStub = noStore.Companion.access100();
                    break;
            }
            return;
            minFresh.onNavigationEvent(activity, nostoreIAuthTabCallbackStub);
        }
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 39;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iAxisFromString = 42 - MotionEvent.axisFromString("");
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1451;
                    byte b = (byte) ($$b & 15);
                    byte b2 = (byte) (b - 5);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, iAxisFromString, iResolveOpacity, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cAlpha = (char) (Color.alpha(0) + 49123);
                    int modifierMetaStateMask = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1494;
                    byte length4 = (byte) $$a.length;
                    byte b3 = (byte) (length4 - 4);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAlpha, modifierMetaStateMask, packedPositionGroup, 1533236389, false, $$c(length4, b3, b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23972), 50 - ((Process.getThreadPriority(0) + 20) >> 6), View.resolveSize(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - ExpandableListView.getPackedPositionGroup(0L)), 'M' - AndroidCharacter.getMirror('0'), TextUtils.indexOf("", "") + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 23;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 35125), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23, 10278 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.argb(0, 0, 0, 0)), 54 - TextUtils.lastIndexOf("", '0', 0, 0), 2167 - Gravity.getAbsoluteGravity(0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i7 = $11 + 35;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12842), Color.blue(0) + 55, 2167 - TextUtils.getTrimmedLength(""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            int i9 = $11 + 1;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 4;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
