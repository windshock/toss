package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class ALCTimerLabel$onNavigationEvent {
    private static short[] asInterface;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final int onWarmupCompleted;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int access000 = 1;
    private static int IAuthTabCallbackStub = 1534337909;
    private static int IAuthTabCallbackDefault = -1538795488;
    private static int onTransact = -133509014;
    private static byte[] asBinder = {-7, 63, 124, 111, 124, -110, 49, -115, 106, -69, 33, 114, 85, 119, 119, 67, 116, 100, 124, 106, -102, 91, 121, 104, -103, -5, -89, -41, -18, -35, -20, -17, -33, -25, -40, -26, 9, -91, -6, -44, -37, -7, -37, 10, -57, -57, -27, -48, -28, -42, 43, -36, -25, -34, -12, 12, -28, -10, 4, 30, -42, -15, 15, 9, -2, -11, 34, -24, -27, 3, -2, 2, -12, 73, -6, -18, 53, -127, 123, -126, 110, 120, 116, 113, Byte.MAX_VALUE, 103, 114, -53, 99, -30, 28, 95, 91, 80, 90, 73, 107, 102, 36, 65, 93, 90, 88, 64, 91, -108, 76, -47};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b2 * 2;
        int i4 = (b * 4) + 115;
        int i5 = (i * 4) + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 = i5;
            i5++;
            i4 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i5++;
            i4 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = access000 + 83;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ALCTimerLabel$onNavigationEvent)) {
            return false;
        }
        ALCTimerLabel$onNavigationEvent aLCTimerLabel$onNavigationEvent = (ALCTimerLabel$onNavigationEvent) obj;
        if (this.onWarmupCompleted != aLCTimerLabel$onNavigationEvent.onWarmupCompleted || !Intrinsics.areEqual(this.IAuthTabCallback, aLCTimerLabel$onNavigationEvent.IAuthTabCallback) || !Intrinsics.areEqual(this.onExtraCallback, aLCTimerLabel$onNavigationEvent.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, aLCTimerLabel$onNavigationEvent.onNavigationEvent)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, aLCTimerLabel$onNavigationEvent.onExtraCallbackWithResult);
        }
        int i4 = access000 + 3;
        getInterfaceDescriptor = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Integer.hashCode(this.onWarmupCompleted) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = getInterfaceDescriptor + 73;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.onWarmupCompleted;
        String str = this.IAuthTabCallback;
        String str2 = this.onExtraCallback;
        String str3 = this.onNavigationEvent;
        String str4 = this.onExtraCallbackWithResult;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) ((-109) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Color.red(0) + 13370499, (-1548552215) - ImageFormat.getBitsPerPixel(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 42, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a((short) (32 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (byte) TextUtils.getCapsMode("", 0, 0), 13370524 - (KeyEvent.getMaxKeyCode() >> 16), (-1548552245) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-42) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        a((short) (ImageFormat.getBitsPerPixel(0) + 3), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), 13370551 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1548552247) - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getLongPressTimeout() >> 16) - 41, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str2);
        Object[] objArr4 = new Object[1];
        a((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 120), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 13370574 - ExpandableListView.getPackedPositionType(0L), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1548552247, TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 40, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str3);
        Object[] objArr5 = new Object[1];
        a((short) ((-81) - TextUtils.indexOf((CharSequence) "", '0')), (byte) ((-1) - TextUtils.lastIndexOf("", '0')), 13370588 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') - 2150, (-41) - Color.argb(0, 0, 0, 0), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(str4);
        Object[] objArr6 = new Object[1];
        a((short) ((-54) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (Process.myPid() >> 22), 13370606 - TextUtils.getOffsetAfter("", 0), TextUtils.getOffsetBefore("", 0) - 1548552249, (ViewConfiguration.getScrollBarSize() >> 8) - 41, objArr6);
        sb.append(((String) objArr6[0]).intern());
        String string = sb.toString();
        int i3 = getInterfaceDescriptor + 91;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public ALCTimerLabel$onNavigationEvent(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onWarmupCompleted = i;
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
        this.onNavigationEvent = str3;
        this.onExtraCallbackWithResult = str4;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 + 87;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 115;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallback;
        int i5 = i3 + 117;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int length;
        byte[] bArr;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackDefault)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.normalizeMetaState(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, 22438 - TextUtils.indexOf((CharSequence) "", '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr2 = asBinder;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        int i7 = $10 + 53;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16790059), 55 - ((Process.getThreadPriority(0) + 20) >> 6), 2167 - (Process.myPid() >> 22), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    int i9 = $10 + 21;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 3 % 5;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = asBinder;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackStub)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43423), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (asInterface[i + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallbackStub ^ j)) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onTransact), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 86 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionType(0L) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = asBinder;
                if (bArr5 != null) {
                    int i11 = $11 + 31;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i12 = 0; i12 < length; i12++) {
                        bArr[i12] = (byte) (bArr5[i12] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i13 = $10 + 115;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i15 = $11;
                    int i16 = i15 + 35;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    if (z) {
                        int i18 = i15 + 29;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        byte[] bArr6 = asBinder;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = asInterface;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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
