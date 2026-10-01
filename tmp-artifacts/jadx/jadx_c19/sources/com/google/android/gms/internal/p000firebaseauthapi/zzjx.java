package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Objects;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzjx extends zzkp {
    private final zzd zza;
    private final zze zzb;
    private final zza zzc;
    private final zzf zzd;

    public static final class zza extends zzb {
        private static int IAuthTabCallback;
        private static int onNavigationEvent;
        public static final zza zza;
        public static final zza zzb;
        public static final zza zzc;
        private static final byte[] $$a = {66, 42, 112, 97};
        private static final int $$b = 48;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, short s3) {
            int i2;
            int i3;
            byte[] bArr = $$a;
            int i4 = 1 - (s2 * 2);
            int i5 = 4 - (s * 4);
            int i6 = 105 - (s3 * 4);
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i7 = i5;
                int i8 = i4;
                i3 = 0;
                i5++;
                i6 = i7 + i8;
                i2 = i3;
                int i9 = i6;
                int i10 = i5;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i9;
                if (i3 == i4) {
                    return new String(bArr2, 0);
                }
                i8 = bArr[i10];
                i7 = i9;
                i5 = i10;
                i5++;
                i6 = i7 + i8;
                i2 = i3;
                int i92 = i6;
                int i102 = i5;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i92;
                if (i3 == i4) {
                }
            } else {
                i2 = 0;
                int i922 = i6;
                int i1022 = i5;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i922;
                if (i3 == i4) {
                }
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzjx.zzb
        public final /* bridge */ /* synthetic */ String toString() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 81;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                super.toString();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String string = super.toString();
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return string;
        }

        static {
            IAuthTabCallback = 1;
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a(11 - Color.argb(0, 0, 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, new char[]{65515, 25, '\r', 65535, 65531, 7, 65533, 1, 25, 65522, 65516}, true, 211 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
            zza = new zza(((String) objArr[0]).intern(), 1);
            Object[] objArr2 = new Object[1];
            a(11 - Color.blue(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, new char[]{65516, 25, '\r', 65535, 65531, 7, 65533, 1, 25, 65520, 65519}, true, (Process.myPid() >> 22) + 211, objArr2);
            zzb = new zza(((String) objArr2[0]).intern(), 2);
            zzc = new zza("CHACHA20_POLY1305", 3);
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        private zza(String str, int i2) {
            super(str, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0164  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
            int i5;
            Throwable cause;
            int i6 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i5 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                    break;
                }
                int i7 = $11 + 43;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 23 - View.resolveSizeAndState(0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55, 2166 - TextUtils.lastIndexOf("", '0', 0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            if (i3 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                int i10 = $10 + 37;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 12843), 55 - Color.red(0), (ViewConfiguration.getScrollBarSize() >> 8) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i5 = 2083011369;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        static void onNavigationEvent() {
            onNavigationEvent = 478309028;
        }
    }

    static class zzb {
        private final String zza;
        private final int zzb;

        public String toString() {
            return String.format("%s(0x%04x)", this.zza, Integer.valueOf(this.zzb));
        }

        private zzb(String str, int i2) {
            this.zza = str;
            this.zzb = i2;
        }
    }

    public final int hashCode() {
        return Objects.hash(zzjx.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public static final class zzc {
        private zzd zza;
        private zze zzb;
        private zza zzc;
        private zzf zzd;

        public final zzc zza(zza zzaVar) {
            this.zzc = zzaVar;
            return this;
        }

        public final zzc zza(zze zzeVar) {
            this.zzb = zzeVar;
            return this;
        }

        public final zzc zza(zzd zzdVar) {
            this.zza = zzdVar;
            return this;
        }

        public final zzc zza(zzf zzfVar) {
            this.zzd = zzfVar;
            return this;
        }

        public final zzjx zza() throws GeneralSecurityException {
            zzd zzdVar = this.zza;
            if (zzdVar == null) {
                throw new GeneralSecurityException("HPKE KEM parameter is not set");
            }
            zze zzeVar = this.zzb;
            if (zzeVar == null) {
                throw new GeneralSecurityException("HPKE KDF parameter is not set");
            }
            zza zzaVar = this.zzc;
            if (zzaVar == null) {
                throw new GeneralSecurityException("HPKE AEAD parameter is not set");
            }
            zzf zzfVar = this.zzd;
            if (zzfVar == null) {
                throw new GeneralSecurityException("HPKE variant is not set");
            }
            return new zzjx(zzdVar, zzeVar, zzaVar, zzfVar);
        }

        private zzc() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzf.zzc;
        }
    }

    public final zza zzb() {
        return this.zzc;
    }

    public static zzc zzc() {
        return new zzc();
    }

    public static final class zze extends zzb {
        public static final zze zza = new zze("HKDF_SHA256", 1);
        public static final zze zzb = new zze("HKDF_SHA384", 2);
        public static final zze zzc = new zze("HKDF_SHA512", 3);

        @Override // com.google.android.gms.internal.firebase-auth-api.zzjx.zzb
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        private zze(String str, int i2) {
            super(str, i2);
        }
    }

    public static final class zzf {
        public static final zzf zza = new zzf("TINK");
        public static final zzf zzb = new zzf("CRUNCHY");
        public static final zzf zzc = new zzf("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zzf(String str) {
            this.zzd = str;
        }
    }

    public final zze zzd() {
        return this.zzb;
    }

    public static final class zzd extends zzb {
        public static final zzd zza = new zzd("DHKEM_P256_HKDF_SHA256", 16);
        public static final zzd zzb = new zzd("DHKEM_P384_HKDF_SHA384", 17);
        public static final zzd zzc = new zzd("DHKEM_P521_HKDF_SHA512", 18);
        public static final zzd zzd = new zzd("DHKEM_X25519_HKDF_SHA256", 32);

        @Override // com.google.android.gms.internal.firebase-auth-api.zzjx.zzb
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        private zzd(String str, int i2) {
            super(str, i2);
        }
    }

    public final zzd zze() {
        return this.zza;
    }

    public final zzf zzf() {
        return this.zzd;
    }

    private zzjx(zzd zzdVar, zze zzeVar, zza zzaVar, zzf zzfVar) {
        this.zza = zzdVar;
        this.zzb = zzeVar;
        this.zzc = zzaVar;
        this.zzd = zzfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjx)) {
            return false;
        }
        zzjx zzjxVar = (zzjx) obj;
        return this.zza == zzjxVar.zza && this.zzb == zzjxVar.zzb && this.zzc == zzjxVar.zzc && this.zzd == zzjxVar.zzd;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzd != zzf.zzc;
    }
}
