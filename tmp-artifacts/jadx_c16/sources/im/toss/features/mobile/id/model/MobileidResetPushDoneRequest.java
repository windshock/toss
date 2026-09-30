package im.toss.features.mobile.id.model;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.mobile.id.model.MobileidResetPushDoneRequest$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MobileidResetPushDoneRequest {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int asBinder;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private final String walletId;
    private static final byte[] $$a = {99, 53, 44, 107};
    private static final int $$b = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4 = 3 - (i * 4);
        int i5 = 115 - (b * 3);
        byte[] bArr = $$a;
        int i6 = i2 * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i5;
            i5 = i7;
            int i9 = 0;
            i5 += i8;
            i3 = i9;
            i4++;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i4];
            i5 += i8;
            i3 = i9;
            i4++;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    static {
        asBinder = 0;
        IAuthTabCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = IAuthTabCallbackStub + 89;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileidResetPushDoneRequest)) {
            int i4 = i3 + 99;
            IAuthTabCallbackDefault = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.walletId, ((MobileidResetPushDoneRequest) obj).walletId)) {
            return false;
        }
        int i5 = onTransact + 91;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.walletId.hashCode();
        int i4 = onTransact + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.walletId;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (byte) (View.MeasureSpec.getMode(0) - 85), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 946377443, 1441476694 - TextUtils.getOffsetBefore("", 0), (-14) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((-4) - (Process.myPid() >> 22)), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 946377407, 1441476658 - KeyEvent.keyCodeFromString(""), (-52) - (Process.myPid() >> 22), objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackDefault + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public /* synthetic */ MobileidResetPushDoneRequest(int i, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onTransact + 63;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = MobileidResetPushDoneRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = MobileidResetPushDoneRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.walletId = str;
    }

    public MobileidResetPushDoneRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(MobileidResetPushDoneRequest mobileidResetPushDoneRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 99;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            i = 1;
            str = mobileidResetPushDoneRequest.walletId;
        } else {
            str = mobileidResetPushDoneRequest.walletId;
            i = 0;
        }
        vylVar.onExtraCallback(serialDescriptor, i, str);
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        char c;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43424), 41 - MotionEvent.axisFromString(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $10 + 25;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12843), Drawable.resolveOpacity(0, 0) + 55, 2167 - (ViewConfiguration.getJumpTapTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (Process.myPid() >> 22)), 42 - View.getDefaultSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i6;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 86 - Gravity.getAbsoluteGravity(0, 0), 9567 - View.MeasureSpec.getSize(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onWarmupCompleted;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i10 = 0; i10 < length2; i10++) {
                            bArr5[i10] = (byte) (bArr4[i10] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!z) {
                            short[] sArr = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            int i11 = $11 + 103;
                            $10 = i11 % 128;
                            if (i11 % 2 != 0) {
                                byte[] bArr6 = onWarmupCompleted;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent + 1;
                                byte b4 = (byte) (bArr6[r8] - (-4629411779493505016L));
                                c = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback;
                                i4 = b4 / s;
                            } else {
                                byte[] bArr7 = onWarmupCompleted;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                byte b5 = (byte) (bArr7[r8] ^ (-4629411779493505016L));
                                c = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback;
                                i4 = b5 + s;
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (c + (((byte) i4) ^ b));
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

    static void IAuthTabCallback() {
        onExtraCallback = -1674622228;
        onNavigationEvent = -1538795459;
        IAuthTabCallback = 240326655;
        onWarmupCompleted = new byte[]{122, -72, 118, -84, 90, -93, -88, 73, -20, 23, -94, -83, 83, -89, -81, -80, 78, 84, 92, -120, Byte.MAX_VALUE, 86, 93, -122, Byte.MAX_VALUE, -84, 81, -83, -80, 77, 88, -89, 90, -96, -92, 80, -127, 8, 8};
    }
}
