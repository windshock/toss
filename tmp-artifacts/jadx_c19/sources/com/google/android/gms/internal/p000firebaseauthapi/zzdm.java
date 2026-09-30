package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdm extends zzdc {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzc zze;
    private final zzb zzf;

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public static final class zza {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int[] onExtraCallback = {1093986377, 1679898538, 89918128, -1311474335, 2057545481, 1921489283, -113215611, 8767875, -151598605, 1911656540, 829705899, -785603505, 558899444, -1021018287, -23445195, 548137163, 2036595526, 94903758};
        private static int onWarmupCompleted;

        @Nullable
        private Integer zza;

        @Nullable
        private Integer zzb;

        @Nullable
        private Integer zzc;

        @Nullable
        private Integer zzd;
        private zzb zze;
        private zzc zzf;

        public final zza zza(int i2) throws GeneralSecurityException {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback;
            int i5 = i4 + 61;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0 ? i2 != 16 : i2 != 84) {
                int i6 = i4 + 43;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (i2 != 24) {
                    int i8 = i4 + 93;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0 ? i2 != 32 : i2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
                    }
                }
            }
            this.zza = Integer.valueOf(i2);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            this.zze = zzbVar;
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i3 + 55;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final zza zzb(int i2) throws GeneralSecurityException {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 87;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0 ? i2 < 16 : i2 < 58) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i2)));
            }
            this.zzb = Integer.valueOf(i2);
            int i5 = onWarmupCompleted + 85;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final zza zzc(int i2) throws GeneralSecurityException {
            int i3 = 2 % 2;
            if (i2 >= 12) {
                int i4 = onWarmupCompleted + 77;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0 ? i2 <= 16 : i2 <= 53) {
                    this.zzc = Integer.valueOf(i2);
                    int i5 = IAuthTabCallback + 73;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return this;
                }
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i2)));
        }

        public final zza zzd(int i2) throws GeneralSecurityException {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 13;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            if (i2 >= 10) {
                int i7 = i5 + 103;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    this.zzd = Integer.valueOf(i2);
                    return this;
                }
                this.zzd = Integer.valueOf(i2);
                throw null;
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i2)));
        }

        public final zza zza(zzc zzcVar) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            this.zzf = zzcVar;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i3 + 19;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final zzdm zza() throws Throwable {
            int i2 = 2 % 2;
            if (this.zza == null) {
                Object[] objArr = new Object[1];
                a(new int[]{-228283797, -1855108630, -1935762617, -865528414, 189924399, -1295826620, -1878123986, 822291511, -884788281, 1152229616, -4122264, -1394809136}, 23 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
                throw new GeneralSecurityException(((String) objArr[0]).intern());
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.zzd;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            int i3 = onWarmupCompleted;
            int i4 = i3 + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (this.zze == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.zzf == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            int i6 = i3 + 35;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                num.intValue();
                zzb zzbVar = zzb.zza;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iIntValue = num.intValue();
            zzb zzbVar2 = this.zze;
            if (zzbVar2 == zzb.zza) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                }
            } else if (zzbVar2 == zzb.zzb) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                }
            } else if (zzbVar2 == zzb.zzc) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                }
                int i7 = onWarmupCompleted + 101;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            } else if (zzbVar2 == zzb.zzd) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                }
            } else {
                if (zzbVar2 != zzb.zze) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                }
            }
            return new zzdm(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = zzc.zzc;
        }

        private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallback;
            int i5 = -1469660336;
            long j = 0;
            int i6 = 0;
            if (iArr2 != null) {
                int i7 = $11 + 91;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 72, 8848 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i9++;
                        i5 = -1469660336;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int i10 = $10 + 119;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = $10 + 121;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", i6), 72 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 8848 - Color.blue(i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i12++;
                    i6 = 0;
                }
                int i15 = $10 + 51;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                iArr5 = iArr6;
                i3 = 0;
            } else {
                i3 = 0;
            }
            System.arraycopy(iArr5, i3, iArr4, i3, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i3;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i3] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i17 = 0;
                for (int i18 = 16; i17 < i18; i18 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 22252), TextUtils.indexOf((CharSequence) "", '0') + 40, 10302 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i17++;
                }
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - ExpandableListView.getPackedPositionChild(0L)), 77 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }
    }

    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("CRUNCHY");
        public static final zzc zzc = new zzc("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zzc(String str) {
            this.zzd = str;
        }
    }

    public final int zze() {
        return this.zzd;
    }

    public final int hashCode() {
        int i2 = this.zza;
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = this.zzd;
        return Objects.hash(zzdm.class, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), this.zze, this.zzf);
    }

    public static final class zzb {
        public static final zzb zza = new zzb("SHA1");
        public static final zzb zzb = new zzb("SHA224");
        public static final zzb zzc = new zzb("SHA256");
        public static final zzb zzd = new zzb("SHA384");
        public static final zzb zze = new zzb("SHA512");
        private final String zzf;

        public final String toString() {
            return this.zzf;
        }

        private zzb(String str) {
            this.zzf = str;
        }
    }

    public static zza zzf() {
        return new zza();
    }

    public final zzb zzg() {
        return this.zzf;
    }

    public final zzc zzh() {
        return this.zze;
    }

    public final String toString() {
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.zze) + ", hashType: " + String.valueOf(this.zzf) + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    private zzdm(int i2, int i3, int i4, int i5, zzc zzcVar, zzb zzbVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = zzcVar;
        this.zzf = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdmVar = (zzdm) obj;
        return zzdmVar.zza == this.zza && zzdmVar.zzb == this.zzb && zzdmVar.zzc == this.zzc && zzdmVar.zzd == this.zzd && zzdmVar.zze == this.zze && zzdmVar.zzf == this.zzf;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzci
    public final boolean zza() {
        return this.zze != zzc.zzc;
    }
}
