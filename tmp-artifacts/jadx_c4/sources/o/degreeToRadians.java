package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.core.webkit.bridge.ShowPointToastHandler$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.TdsPointToastV1View;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class degreeToRadians implements ALCFaceQuality {
    private static final byte[] $$a = {1, Byte.MIN_VALUE, 109, Byte.MIN_VALUE};
    private static final int $$b = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private static int[] onWarmupCompleted = {-1526458474, 1411712204, 768928796, 645052306, -284292052, 1475785676, -1999787520, 829861947, -1693938108, 1463509755, -623978226, 179176815, -2103518768, -867120920, -1222544302, -167005657, -227304264, 1770313452};
    private static long IAuthTabCallback = -7054890528910776728L;
    private static int onNavigationEvent = -1776194565;
    private static char onExtraCallbackWithResult = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        int i3 = b2 + 4;
        int i4 = b * 3;
        int i5 = i + 109;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i5 = (-i5) + i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i3++;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i5;
            i5 = bArr[i3];
            i5 = (-i5) + i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i3++;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3++;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(str, str2);
        }
        onNavigationEvent(str, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 57;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onTransact + 13;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onExtraCallbackWithResult();
        }
        super.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onNavigationEvent();
        }
        super.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i4 = onExtraCallback + 81;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onExtraCallback + 21;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 71 / 0;
        }
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new ShowPointToastHandler$.ExternalSyntheticLambda0());
        int i2 = onTransact + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final boolean onNavigationEvent(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(uri);
        int i4 = onTransact + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new int[]{230301501, 492517845, -1199044996, -48771785, -238461284, 334029536}, 9 - Process.getGidForName(""), objArr);
        Object[] objArr2 = {settext, ((String) objArr[0]).intern(), 0L};
        long jLongValue = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr2)).longValue();
        Object[] objArr3 = new Object[1];
        a(new int[]{563284154, 808275892, 1252138664, -2040778090, 1332990156, -1515847143}, 9 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
        Object[] objArr4 = {settext, ((String) objArr3[0]).intern(), 0L};
        long jLongValue2 = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr4)).longValue();
        Object[] objArr5 = new Object[1];
        a(new int[]{230301501, 492517845, 1012634997, -855357708, 1789907681, -603643633}, Process.getGidForName("") + 13, objArr5);
        Object[] objArr6 = {settext, ((String) objArr5[0]).intern(), 0L};
        long jLongValue3 = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr6)).longValue();
        Object[] objArr7 = new Object[1];
        a(new int[]{-489048129, 1013595428, -1614245969, 800008911, 1377068503, -349489427}, 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
        Object[] objArr8 = {settext, ((String) objArr7[0]).intern(), true};
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr8)).booleanValue();
        Object[] objArr9 = new Object[1];
        b(1962076012 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{56251, 48758, 42836, 2950, 33334, 58720, 44304, 35550, 967, 43544, 23809}, new char[]{27820, 62183, 36468, 22248}, new char[]{3475, 43296, 62023, 61997}, objArr9);
        int iOnNavigationEvent = settext.onNavigationEvent(((String) objArr9[0]).intern(), 0);
        TdsPointToastV1View.onNavigationEvent.onWarmupCompleted onwarmupcompleted = TdsPointToastV1View.onNavigationEvent.Companion;
        Object[] objArr10 = new Object[1];
        a(new int[]{229351345, 1170979995, 1421000699, -434654826, -1102094042, 180161471}, 9 - View.getDefaultSize(0, 0), objArr10);
        TdsPointToastV1View.onNavigationEvent onnavigationeventOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted(settext.onNavigationEvent(((String) objArr10[0]).intern(), ""));
        if (onnavigationeventOnWarmupCompleted == null) {
            int i4 = onTransact + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            onnavigationeventOnWarmupCompleted = TdsPointToastV1View.onNavigationEvent.IMMEDIATE;
        }
        Object[] objArr11 = new Object[1];
        b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1168396173, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), new char[]{58167, 56892, 47324, 10824, 13747, 64795, 46795, 63704, 35179, 27216, 33317, 14320, 57455, 65320, 65063, 56191, 42812, 56542, 28789, 58551, 63288}, new char[]{36176, 42063, 22597, 12917}, new char[]{3475, 43296, 62023, 61997}, objArr11);
        Object[] objArr12 = {settext, ((String) objArr11[0]).intern(), 1500L};
        long jLongValue4 = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr12)).longValue();
        Object[] objArr13 = new Object[1];
        b(506395332 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (31989 - ExpandableListView.getPackedPositionType(0L)), new char[]{24775, 3360, 63477, 63332, 23828, 53426, 33231, 56914, 9136, 34479, 3173, 24477, 29696, 17607, 20741}, new char[]{50092, 12026, 62750, 11388}, new char[]{3475, 43296, 62023, 61997}, objArr13);
        Object[] objArr14 = {settext, ((String) objArr13[0]).intern(), 1500L};
        new TdsPointToastV1View.IAuthTabCallback(context).onExtraCallback(jLongValue).onNavigationEvent(jLongValue2).onWarmupCompleted(jLongValue3).IAuthTabCallback(zBooleanValue).onNavigationEvent(iOnNavigationEvent).onExtraCallbackWithResult(onnavigationeventOnWarmupCompleted).IAuthTabCallback(jLongValue4).onExtraCallbackWithResult(((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr14)).longValue()).IAuthTabCallback();
        int i6 = onExtraCallback + 115;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 27 / 0;
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
            int i4 = $11 + 37;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int keyRepeatDelay = 43 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int mode = 1451 - View.MeasureSpec.getMode(0);
                    byte b = $$a[0];
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, keyRepeatDelay, mode, 228868077, false, $$c((byte) (b - 1), (byte) (-b), b), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49123);
                        int iArgb = 44 - Color.argb(0, 0, 0, 0);
                        int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1494;
                        byte b2 = $$a[0];
                        byte b3 = (byte) (b2 - 1);
                        byte b4 = (byte) (-b2);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(minimumFlingVelocity, iArgb, i6, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - Color.blue(0)), Color.alpha(0) + 50, KeyEvent.keyCodeFromString("") + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - ExpandableListView.getPackedPositionChild(0L)), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 12577 - (Process.myPid() >> 22), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
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
        String str = new String(cArr6);
        int i7 = $11 + 95;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onWarmupCompleted;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $10 + 121;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = 0;
            while (i9 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getOffsetAfter("", 0) + 72, MotionEvent.axisFromString("") + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i9++;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onWarmupCompleted;
        if (iArr6 != null) {
            int i10 = $11 + 23;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr6[i3]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 72 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i3++;
                int i11 = $11 + 53;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i6 = 0;
            }
            i2 = i6;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i13 = $11 + 17;
            $10 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            int i16 = 0;
            while (i16 < 16) {
                int i17 = $10 + 51;
                $11 = i17 % 128;
                if (i17 % i14 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i16];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 22252), 39 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10301 - View.resolveSize(0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i16 += 85;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i16];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22300 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getJumpTapTimeout() >> 16) + 39, 10300 - ((byte) KeyEvent.getModifierMetaStateMask()), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i16++;
                }
                i14 = 2;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - TextUtils.indexOf((CharSequence) "", '0')), (Process.myPid() >> 22) + 78, Color.green(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i21 = $11 + 17;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
