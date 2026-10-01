package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzpp extends zzqs {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static char[] onNavigationEvent = {27246, 27149, 27138, 27150, 27254, 27142, 27145, 27148, 27263, 27254, 27158, 27175, 27175, 27177, 27175, 27170, 27170, 27173, 27196, 27143, 27242, 27137, 27173, 27175, 27171, 27179, 27177, 27199, 27161, 27235};
    private static int onWarmupCompleted = 1;
    private final int zza;
    private final int zzb;
    private final zzb zzc;

    public final int zzb() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 37;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.zzb;
        int i6 = i4 + 43;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final class zza {

        @Nullable
        private Integer zza;

        @Nullable
        private Integer zzb;
        private zzb zzc;

        public final zza zza(int i2) throws GeneralSecurityException {
            if (i2 != 16 && i2 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 << 3)));
            }
            this.zza = Integer.valueOf(i2);
            return this;
        }

        public final zza zzb(int i2) throws GeneralSecurityException {
            if (i2 < 10 || 16 < i2) {
                throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i2);
            }
            this.zzb = Integer.valueOf(i2);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zzpp zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("variant not set");
            }
            return new zzpp(num.intValue(), this.zzb.intValue(), this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zzb.zzd;
        }
    }

    public final int zzc() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.zza;
        int i7 = i3 + 61;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("LEGACY");
        public static final zzb zzd = new zzb("NO_PREFIX");
        private final String zze;

        public final String toString() {
            return this.zze;
        }

        private zzb(String str) {
            this.zze = str;
        }
    }

    private final int zzf() {
        int i2;
        int i3 = 2 % 2;
        zzb zzbVar = this.zzc;
        if (zzbVar == zzb.zzd) {
            int i4 = onWarmupCompleted + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return this.zzb;
        }
        if (zzbVar == zzb.zza) {
            int i6 = onWarmupCompleted + 23;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i2 = this.zzb;
        } else {
            if (zzbVar != zzb.zzb && zzbVar != zzb.zzc) {
                throw new IllegalStateException("Unknown variant");
            }
            i2 = this.zzb;
        }
        return i2 + 5;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.zza;
        int i6 = this.zzb;
        int iHash = Objects.hash(zzpp.class, Integer.valueOf(i5), Integer.valueOf(i6), this.zzc);
        int i7 = onWarmupCompleted + 101;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return iHash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static zza zzd() {
        int i2 = 2 % 2;
        zza zzaVar = new zza();
        int i3 = onWarmupCompleted + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zzaVar;
    }

    public final zzb zze() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        zzb zzbVar = this.zzc;
        int i6 = i3 + 117;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 72 / 0;
        }
        return zzbVar;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        String strValueOf = String.valueOf(this.zzc);
        int i3 = this.zzb;
        int i4 = this.zza;
        Object[] objArr = new Object[1];
        a(new int[]{0, 30, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0}, objArr);
        String str = ((String) objArr[0]).intern() + strValueOf + ", " + i3 + "-byte tags, and " + i4 + "-byte key)";
        int i5 = onExtraCallback + 13;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private zzpp(int i2, int i3, zzb zzbVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = zzbVar;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof zzpp)) {
            return false;
        }
        zzpp zzppVar = (zzpp) obj;
        if (zzppVar.zza == this.zza && zzppVar.zzf() == zzf() && zzppVar.zzc == this.zzc) {
            return true;
        }
        int i5 = onExtraCallback + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzci
    public final boolean zza() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            zzb zzbVar = zzb.zzd;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.zzc == zzb.zzd) {
            return false;
        }
        int i4 = onExtraCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int i9 = $10 + 107;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i10 = $11 + 83;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 35 - (ViewConfiguration.getTapTimeout() >> 16), 14239 - TextUtils.getOffsetBefore("", 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 64 - TextUtils.indexOf((CharSequence) "", '0', 0), 16718 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 29 - KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.alpha(0)), 70 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i14 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i14, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i15 = $10 + 87;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i6 % trackGroupExternalSyntheticLambda0.onNavigationEvent];
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i16 = $10 + 1;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
