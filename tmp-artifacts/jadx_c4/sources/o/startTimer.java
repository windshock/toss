package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class startTimer implements ALCFaceQuality {
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {78, -86, Byte.MIN_VALUE, Byte.MIN_VALUE};
    private static final int $$b = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent = 739110655;
    private static int onExtraCallback = -1538795395;
    private static int IAuthTabCallback = 1098509467;
    private static byte[] onExtraCallbackWithResult = {-88, -118, -45, -125, -35, -57, -119, 118, -40, -32, -88, -118, -20, -33, 120, -45, -118, -71, -102, -38, -117, -93, 125, 87, 122, -117, 102, 125, AbstractSmartcard.BYTE_RESPONSE_LENGTH, -124, 81, 121, 124, -119, 68, -72, 125, 102, 118, 120, 98, 124, 113, 107, 115, 58, -94, 113, 114, 123, 110, 118, 107, -102, 56, 38, 81, 106, 72, AbstractSmartcard.BYTE_RESPONSE_LENGTH, -86, -1, 32, 73, 57, 51, 61, 47, 44, 62, 38, -125, -17, 32, 34, 53, 52, 32, 51, 44, 53, 54, 42};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        int i3;
        int i4 = b + 4;
        int i5 = 115 - (b2 * 2);
        byte[] bArr = $$a;
        int i6 = i * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            i3 = i4;
            int i8 = i7;
            i2 = 0;
            i4 += i8;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            i2++;
            i8 = bArr[i3];
            i4 += i8;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i5;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i7) {
            }
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super.onExtraCallback();
        int i4 = asInterface + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return onoutofmemoryOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = asInterface + 123;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
            int i3 = 14 / 0;
        } else {
            zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallbackDefault + 103;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i4 = asInterface + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackDefault + 21;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = asInterface + 79;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Object[] objArr = new Object[1];
        a((short) ((-44) - Gravity.getAbsoluteGravity(0, 0)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 86), 2008402185 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 448908243, (-118) - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            auth authVar = auth.onNavigationEvent;
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a((short) (78 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (65465 - AndroidCharacter.getMirror('0')), MotionEvent.axisFromString("") + 2008402246, MotionEvent.axisFromString("") + 448908259, View.MeasureSpec.makeMeasureSpec(0, 0) - 118, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str);
            auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{authVar, new setMask(sb.toString()), null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            return;
        }
        int i4 = IAuthTabCallbackDefault + 87;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            Object[] objArr3 = new Object[1];
            a((short) ((Process.myPid() >> 22) + 13), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 124), TextUtils.lastIndexOf("", '0', 0, 0) + 2008402207, 448908238 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) - 118, objArr3);
            boolean z = EncoderImplExternalSyntheticLambda9.onExtraCallbackWithResult(context, ((String) objArr3[0]).intern()) == 0;
            JsonObject jsonObject2 = new JsonObject();
            Object[] objArr4 = new Object[1];
            a((short) (56 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (byte) (ImageFormat.getBitsPerPixel(0) - 104), ((byte) KeyEvent.getModifierMetaStateMask()) + 2008402239, 448908244 - (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 119, objArr4);
            jsonObject2.addProperty(((String) objArr4[0]).intern(), Boolean.valueOf(z));
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, (JsonElement) jsonObject2);
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.MeasureSpec.getSize(0)), 42 - KeyEvent.keyCodeFromString(""), 22439 - Color.blue(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = -1;
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $10 + 9;
                int i9 = i8 % 128;
                $11 = i9;
                int i10 = i8 % 2;
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int i11 = i9 + 1;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $11 + 113;
                        $10 = i14 % 128;
                        if (i14 % i4 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i13])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) i6;
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12891 - AndroidCharacter.getMirror('0')), 55 - TextUtils.getTrimmedLength(""), 2167 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i13] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr[i13])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    byte b4 = (byte) (-1);
                                    byte b5 = (byte) (b4 + 1);
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myPid() >> 22)), 55 - View.MeasureSpec.getSize(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i13] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        i13++;
                        i4 = 2;
                        i6 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    try {
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.MeasureSpec.makeMeasureSpec(0, 0)), 42 - (ViewConfiguration.getEdgeSlop() >> 16), 22439 - (ViewConfiguration.getTouchSlop() >> 8), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j)) + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 86 - TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionChild(0L) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                    }
                    int i16 = $11 + 105;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }
}
