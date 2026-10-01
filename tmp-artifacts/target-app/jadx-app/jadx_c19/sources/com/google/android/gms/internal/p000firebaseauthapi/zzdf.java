package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.p000firebaseauthapi.zzdm;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdf extends zzda {
    private final zzdm zza;
    private final zzxt zzb;
    private final zzxt zzc;
    private final zzxr zzd;

    @Nullable
    private final Integer zze;

    public static zza zzb() {
        return new zza();
    }

    public static final class zza {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static long onExtraCallbackWithResult = 4958199215388922695L;
        private static int onNavigationEvent = 1;

        @Nullable
        private zzdm zza;

        @Nullable
        private zzxt zzb;

        @Nullable
        private zzxt zzc;

        @Nullable
        private Integer zzd;

        public final zza zza(zzxt zzxtVar) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.zzb = zzxtVar;
            int i6 = i3 + 85;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final zza zzb(zzxt zzxtVar) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 39;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.zzc = zzxtVar;
            if (i4 != 0) {
                int i5 = 79 / 0;
            }
            return this;
        }

        public final zza zza(@Nullable Integer num) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.zzd = num;
            if (i4 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final zza zza(zzdm zzdmVar) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 61;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.zza = zzdmVar;
            if (i4 != 0) {
                int i5 = 20 / 0;
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final zzdf zza() throws Throwable {
            zzxr zzxrVarZza;
            int i2 = 2 % 2;
            zzdm zzdmVar = this.zza;
            if (zzdmVar != null) {
                int i3 = onNavigationEvent + 69;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 72 / 0;
                    if (this.zzb != null) {
                        if (this.zzc != null) {
                            if (zzdmVar.zzb() != this.zzb.zza()) {
                                Object[] objArr = new Object[1];
                                a(new char[]{41370, 18478, 41435, 25871, 40992, 46538, 10060, 40845, 221, 49468, 5300, 32097, 58289, 25316, 30619, 56336, 16958, 33676, 53628, 47962, 9543, 9396, 12349, 6846, 33838}, -MotionEvent.axisFromString(""), objArr);
                                throw new GeneralSecurityException(((String) objArr[0]).intern());
                            }
                            if (this.zza.zzc() == this.zzc.zza()) {
                                int i5 = onExtraCallback + 51;
                                onNavigationEvent = i5 % 128;
                                if (i5 % 2 == 0) {
                                    int i6 = 41 / 0;
                                    if (this.zza.zza()) {
                                        if (this.zzd == null) {
                                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                                        }
                                    }
                                } else if (this.zza.zza()) {
                                }
                                if (!this.zza.zza() && this.zzd != null) {
                                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                                }
                                if (this.zza.zzh() == zzdm.zzc.zzc) {
                                    zzxrVarZza = zzxr.zza(new byte[0]);
                                } else if (this.zza.zzh() == zzdm.zzc.zzb) {
                                    int i7 = onNavigationEvent + 63;
                                    onExtraCallback = i7 % 128;
                                    zzxrVarZza = i7 % 2 != 0 ? zzxr.zza(ByteBuffer.allocate(4).put((byte) 0).putInt(this.zzd.intValue()).array()) : zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
                                } else if (this.zza.zzh() == zzdm.zzc.zza) {
                                    zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
                                } else {
                                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + String.valueOf(this.zza.zzh()));
                                }
                                return new zzdf(this.zza, this.zzb, this.zzc, zzxrVarZza, this.zzd);
                            }
                            throw new GeneralSecurityException("HMAC key size mismatch");
                        }
                    }
                } else if (this.zzb != null) {
                }
                throw new GeneralSecurityException("Cannot build without key material");
            }
            throw new GeneralSecurityException("Cannot build without parameters");
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i2);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i4 = $11 + 41;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i6 = $11 + 79;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 45812), 84 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.indexOf("", "", 0, 0) + 19, 8809 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }
    }

    public final zzdm zzc() {
        return this.zza;
    }

    public final zzxr zzd() {
        return this.zzd;
    }

    public final zzxt zze() {
        return this.zzb;
    }

    public final zzxt zzf() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zze;
    }

    private zzdf(zzdm zzdmVar, zzxt zzxtVar, zzxt zzxtVar2, zzxr zzxrVar, @Nullable Integer num) {
        this.zza = zzdmVar;
        this.zzb = zzxtVar;
        this.zzc = zzxtVar2;
        this.zzd = zzxrVar;
        this.zze = num;
    }
}
