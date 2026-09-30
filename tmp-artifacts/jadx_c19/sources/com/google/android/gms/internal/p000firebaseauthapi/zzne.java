package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Objects;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzne extends zzci {
    private static short[] IAuthTabCallback;
    private final zzos zza;
    private static final byte[] $$a = {50, 44, -54, 25};
    private static final int $$b = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 1438732772;
    private static int onExtraCallback = -1538795427;
    private static int onWarmupCompleted = -2101789562;
    private static byte[] onNavigationEvent = {9, 26, 3, 5, 15, 11, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, byte b, short s) {
        int i3;
        byte[] bArr = $$a;
        int i4 = (i2 * 4) + 4;
        int i5 = b * 4;
        int i6 = 115 - (s * 3);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i4++;
            i6 = (-i6) + i7;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i9 = i3 + 1;
            i7 = i6;
            i6 = bArr[i4];
            i8 = i9;
            i4++;
            i6 = (-i6) + i7;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int iHash = Objects.hash(this.zza.zza(), this.zza.zzb());
        int i5 = asInterface + 29;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return iHash;
    }

    public final zzos zzb() {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 75;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        zzos zzosVar = this.zza;
        int i5 = i3 + 95;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return zzosVar;
    }

    public final String toString() throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        String strZzf = this.zza.zza().zzf();
        int i3 = zznh.zza[this.zza.zza().zzd().ordinal()];
        if (i3 != 1) {
            int i4 = asInterface + 19;
            int i5 = i4 % 128;
            asBinder = i5;
            int i6 = i4 % 2;
            if (i3 != 2) {
                int i7 = i5 + 65;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                if (i3 == 3) {
                    strIntern = "RAW";
                } else if (i3 != 4) {
                    Object[] objArr = new Object[1];
                    a((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 11), (byte) ((Process.getThreadPriority(0) + 20) >> 6), 242841108 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-654238776) + MotionEvent.axisFromString(""), TextUtils.indexOf("", "") - 78, objArr);
                    strIntern = ((String) objArr[0]).intern();
                } else {
                    strIntern = "CRUNCHY";
                }
            } else {
                strIntern = "LEGACY";
            }
        } else {
            int i9 = asInterface + 91;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            strIntern = "TINK";
        }
        String str = String.format("(typeUrl=%s, outputPrefixType=%s)", strZzf, strIntern);
        int i11 = asBinder + 65;
        asInterface = i11 % 128;
        int i12 = i11 % 2;
        return str;
    }

    public zzne(zzos zzosVar) {
        this.zza = zzosVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r5.zza.zza().zze().equals(r6.zza().zze()) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.zza.zza().zze().equals(r6.zza().zze()) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (!(obj instanceof zzne)) {
            int i3 = asInterface + 49;
            asBinder = i3 % 128;
            return i3 % 2 == 0;
        }
        zzos zzosVar = ((zzne) obj).zza;
        if (this.zza.zza().zzd().equals(zzosVar.zza().zzd()) && !(!this.zza.zza().zzf().equals(zzosVar.zza().zzf()))) {
            int i4 = asInterface + 35;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
            }
        }
        int i6 = asBinder + 69;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzci
    public final boolean zza() {
        int i2 = 2 % 2;
        if (this.zza.zza().zzd() == zzvt.RAW) {
            return false;
        }
        int i3 = asBinder + 7;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 53;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba A[Catch: all -> 0x02ab, TryCatch #0 {all -> 0x02ab, blocks: (B:18:0x007f, B:20:0x0090, B:21:0x00c3, B:26:0x00e2, B:28:0x00f9, B:29:0x012d, B:42:0x019d, B:44:0x01ba, B:45:0x01f7), top: B:74:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        int i6;
        Object objOnExtraCallback;
        byte[] bArr;
        boolean z;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.combineMeasuredStates(0, 0)), 41 - ImageFormat.getBitsPerPixel(0), 22439 - (KeyEvent.getMaxKeyCode() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i8 = $11 + 101;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr2 = onNavigationEvent;
                if (bArr2 != null) {
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getOffsetAfter("", 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 55, MotionEvent.axisFromString("") + 2168, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr3)).byteValue();
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
                    byte[] bArr4 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.MeasureSpec.getSize(0) + 42, 22438 - ImageFormat.getBitsPerPixel(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    i5 = 2;
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i2 + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    int i11 = $10 + 47;
                    $11 = i11 % 128;
                    i5 = 2;
                    int i12 = i11 % 2;
                }
            } else {
                i5 = 2;
            }
            if (iIntValue > 0) {
                int i13 = ((i2 + iIntValue) - i5) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                if (!z2) {
                    i6 = 0;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i6;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted), sb};
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 87, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    bArr = onNavigationEvent;
                    if (bArr != null) {
                        int i14 = $10 + 47;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        int length2 = bArr.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i16 = 0; i16 < length2; i16++) {
                            bArr5[i16] = (byte) (bArr[i16] ^ (-4629411779493505016L));
                        }
                        bArr = bArr5;
                    }
                    if (bArr == null) {
                        int i17 = $11 + 17;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            int i19 = $10 + 77;
                            $11 = i19 % 128;
                            int i20 = i19 % 2;
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i21 = $10 + 83;
                            $11 = i21 % 128;
                            int i22 = i21 % 2;
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } else {
                    int i23 = $10 + 25;
                    $11 = i23 % 128;
                    if (i23 % 2 != 0) {
                        i6 = 1;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i6;
                    Object[] objArr52 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted), sb};
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback == null) {
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback).invoke(null, objArr52)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    bArr = onNavigationEvent;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    }
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
