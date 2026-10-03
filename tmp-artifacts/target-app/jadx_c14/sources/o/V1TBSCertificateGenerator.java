package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.send.periodic.PeriodicTransferPostActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class V1TBSCertificateGenerator implements ALCFaceQuality {
    public static final IAuthTabCallback Companion;
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {59, -24, -77, -23};
    private static final int $$b = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = o.V1TBSCertificateGenerator.$$a
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r6 = r6 * 2
            int r6 = 115 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2f:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.V1TBSCertificateGenerator.$$c(byte, int, byte):java.lang.String");
    }

    static {
        IAuthTabCallbackDefault = 0;
        onWarmupCompleted();
        Companion = new IAuthTabCallback(null);
        int i = asBinder + 31;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 75;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return true;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallback();
        }
        super/*o.drawTextBox*/.onExtraCallback();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            int i6 = 77 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
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
        a((short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 74), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-580913570) - MotionEvent.axisFromString(""), ExpandableListView.getPackedPositionGroup(0L) - 1001926321, ImageFormat.getBitsPerPixel(0) - 106, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (strOnNavigationEvent.length() <= 0) {
            int i2 = onTransact + 123;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            strOnNavigationEvent = null;
        }
        if (strOnNavigationEvent != null) {
            PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, PeriodicTransferPostActivity.onWarmupCompleted.onExtraCallback(PeriodicTransferPostActivity.Companion, context, strOnNavigationEvent, false, true, (String) null, 4, (Object) null), 5002, (Bundle) null, 4, (Object) null);
            return;
        }
        int i3 = IAuthTabCallbackStub + 47;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String string = context.getString(R.string.app_common_web_message_handlers___0e155a50f6);
        Object[] objArr2 = new Object[1];
        a((short) (TextUtils.indexOf("", "", 0, 0) + 121), (byte) ((Process.getThreadPriority(0) + 20) >> 6), (-580913562) - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1001926366, (-107) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, string, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i != 5002) {
            return;
        }
        NativeArrayCompanion nativeArrayCompanion = null;
        if (i2 == -1) {
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
            return;
        }
        if (bundle != null) {
            int i4 = onTransact + 43;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a((short) ((-78) - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (-580913600) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0') - 1001926325, (-108) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            nativeArrayCompanion = (NativeArrayCompanion) bundle.getParcelable(((String) objArr[0]).intern());
        }
        if (nativeArrayCompanion != null) {
            int i6 = IAuthTabCallbackStub + 51;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, nativeArrayCompanion.IAuthTabCallback(), nativeArrayCompanion.onWarmupCompleted(), (Map) null, 5, (Object) null);
                return;
            } else {
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, nativeArrayCompanion.IAuthTabCallback(), nativeArrayCompanion.onWarmupCompleted(), (Map) null, 4, (Object) null);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 21), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTouchSlop() >> 8) - 580913577, (-1001926371) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (Process.myPid() >> 22) - 107, objArr2);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "", ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        char c;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43424), 42 - Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 101;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            long j = 0;
            if (i4 != 0) {
                int i9 = $11 + 77;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = onExtraCallback;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 12843);
                                int scrollDefaultDelay = 55 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int packedPositionType = 2167 - ExpandableListView.getPackedPositionType(j);
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, scrollDefaultDelay, packedPositionType, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i10++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43424), 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    i5 = 2;
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    int i11 = $10 + 23;
                    $11 = i11 % 128;
                    i5 = 2;
                    int i12 = i11 % 2;
                }
            } else {
                i5 = 2;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - i5) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 85 - ExpandableListView.getPackedPositionChild(0L), 9567 - KeyEvent.keyCodeFromString(""), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int i13 = $11 + 13;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i14 = 0; i14 < length; i14++) {
                        bArr[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                boolean z = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i15 = $11 + 63;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent % 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback >> (((byte) (((byte) (bArr6[r8] - 4629411779493505016L)) % s)) ^ b));
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

    static void onWarmupCompleted() {
        onWarmupCompleted = -2031627832;
        onNavigationEvent = -1538795422;
        onExtraCallbackWithResult = -1610614994;
        onExtraCallback = new byte[]{-91, 89, 67, 70, 83, 92, 51, 83, 69, 73, 91, 83, 53, 68, 107, 66, 64, 91, 75, 92, 77, 83, 75, -106, -30, -20, -6, -27, -24, -16, -31, -106, -38, -109, -81, -77, -73, -70, -72, -86, 117, -120, -123, -104, 102, -102, -124, Byte.MIN_VALUE, 126, -86, -118};
    }
}
