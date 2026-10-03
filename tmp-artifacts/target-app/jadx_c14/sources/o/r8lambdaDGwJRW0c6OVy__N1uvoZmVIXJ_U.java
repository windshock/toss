package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class r8lambdaDGwJRW0c6OVy__N1uvoZmVIXJ_U implements TypeUtils7 {
    private static short[] IAuthTabCallback_Parcel;
    private String IAuthTabCallback;
    private String asInterface;
    private String onExtraCallback;
    private String onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;
    private static final byte[] $$a = {51, -113, 92, 4};
    private static final int $$b = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallbackDefault = 936631055;
    private static int asBinder = -1538795396;
    private static int IAuthTabCallbackStub = -1989168187;
    private static byte[] onTransact = {42, 43, -40, 38, 117, -116, Byte.MAX_VALUE, -114, -115, 125, -123, 122, -124, -117, 65, 80, -96, -72, 64, 73, -66, -73, 72, 78, -68, -82, 64, 86, -92, 85, 68, 70, -87, 55, -58, 59, 52, -64, -47, -64, -62, 45, 8, -11, 9, -12, -12, 12, 1, 14, -24, 22, -12, 5, -10, 25, -24, -7, -5, 20, -126, Byte.MAX_VALUE, -125, 126, 126, Byte.MIN_VALUE, Byte.MIN_VALUE, 124, -125, -120, 111, -102, 120, -121, 118, -120, -114, 106, -109, 98, 115, 113, -98, 8, 8, 8, 8, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = 115 - r6
            byte[] r0 = o.r8lambdaDGwJRW0c6OVy__N1uvoZmVIXJ_U.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2c:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaDGwJRW0c6OVy__N1uvoZmVIXJ_U.$$c(int, byte, byte):java.lang.String");
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43424), 42 - Color.argb(0, 0, 0, 0), 22439 - (ViewConfiguration.getTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 105;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr2 = onTransact;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12843), 55 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onTransact;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43424), (ViewConfiguration.getScrollBarSize() >> 8) + 42, View.combineMeasuredStates(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback_Parcel[i + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L)));
                if (z) {
                    int i11 = $11 + 13;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i10 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackStub), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 86, (ViewConfiguration.getEdgeSlop() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onTransact;
                if (bArr5 != null) {
                    int i13 = $11 + 53;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                        i5++;
                    }
                    int i14 = $10 + 7;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onTransact;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback_Parcel;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 109;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 23;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.onExtraCallbackWithResult = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 41;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = str;
        int i5 = i3 + 63;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return str;
    }

    public void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = z;
        int i5 = i3 + 75;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i3 + 51;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return z;
    }

    public void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = z;
        if (i3 == 0) {
            throw null;
        }
    }

    public void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 25;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback = str;
        int i5 = i2 + 87;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i2 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Bundle onExtraCallback() throws Throwable {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        Object[] objArr = new Object[1];
        a((short) Color.blue(0), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 37), 1819016441 - KeyEvent.keyCodeFromString(""), (-757623641) + (ViewConfiguration.getKeyRepeatDelay() >> 16), (-112) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        bundle.putString(((String) objArr[0]).intern(), asInterface());
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getOffsetBefore("", 0), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 126), 1819016444 - TextUtils.indexOf((CharSequence) "", '0'), (-757623656) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 105, objArr2);
        bundle.putString(((String) objArr2[0]).intern(), IAuthTabCallbackDefault());
        Object[] objArr3 = new Object[1];
        a((short) ((-1) - Process.getGidForName("")), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) - 78), (ViewConfiguration.getScrollBarSize() >> 8) + 1819016455, Process.getGidForName("") - 757623687, (ViewConfiguration.getLongPressTimeout() >> 16) - 96, objArr3);
        bundle.putString(((String) objArr3[0]).intern(), onExtraCallbackWithResult());
        String strOnNavigationEvent = onNavigationEvent();
        if (strOnNavigationEvent != null) {
            if (StringsKt.isBlank(strOnNavigationEvent)) {
                int i2 = getInterfaceDescriptor + 27;
                IAuthTabCallbackStubProxy = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 66 / 0;
                }
                strOnNavigationEvent = null;
            }
            if (strOnNavigationEvent != null) {
                Object[] objArr4 = new Object[1];
                a((short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (54 - View.MeasureSpec.getSize(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1819016473, TextUtils.getOffsetBefore("", 0) - 757623656, (-105) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
                bundle.putString(((String) objArr4[0]).intern(), strOnNavigationEvent);
            }
        }
        Object[] objArr5 = new Object[1];
        a((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (15 - KeyEvent.keyCodeFromString("")), 1819016483 - (Process.myPid() >> 22), (-757623687) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-97) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
        bundle.putBoolean(((String) objArr5[0]).intern(), onWarmupCompleted());
        Object[] objArr6 = new Object[1];
        a((short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (TextUtils.lastIndexOf("", '0') - 122), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1819016500, (-757623688) - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) - 91, objArr6);
        bundle.putBoolean(((String) objArr6[0]).intern(), IAuthTabCallback());
        int i4 = getInterfaceDescriptor + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return bundle;
    }
}
