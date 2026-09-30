package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.access8100;
import o.getWrite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzp extends Exception {
    public static final zzo zza = new zzo(null);
    private static final Map zzb;
    private final zzn zzc;
    private final zzl zzd;
    private final String zze;
    private final Map zzf;

    static {
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(zzpb.JS_NETWORK_ERROR, new zzp(zzn.zze, zzl.zzm, null));
        zzpb zzpbVar = zzpb.JS_INTERNAL_ERROR;
        zzn zznVar = zzn.zzc;
        zzb = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(zzpbVar, new zzp(zznVar, zzl.zzk, null)), getWrite.IAuthTabCallback(zzpb.JS_INVALID_SITE_KEY, new zzp(zzn.zzf, zzl.zzn, null)), getWrite.IAuthTabCallback(zzpb.JS_INVALID_SITE_KEY_TYPE, new zzp(zzn.zzg, zzl.zzo, null)), getWrite.IAuthTabCallback(zzpb.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzp(zzn.zzh, zzl.zzp, null)), getWrite.IAuthTabCallback(zzpb.JS_INVALID_ACTION, new zzp(zzn.zzi, zzl.zzq, null)), getWrite.IAuthTabCallback(zzpb.JS_PROGRAM_ERROR, new zzp(zznVar, zzl.zzu, null))});
    }

    public zzp(@NotNull zzn zznVar, @NotNull zzl zzlVar, @Nullable String str) {
        this.zzc = zznVar;
        this.zzd = zzlVar;
        this.zze = str;
        zzn zznVar2 = zzn.zze;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(zznVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), getWrite.IAuthTabCallback(zzn.zzk, new RecaptchaException(recaptchaErrorCode, null, 2, null)), getWrite.IAuthTabCallback(zzn.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), getWrite.IAuthTabCallback(zzn.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), getWrite.IAuthTabCallback(zzn.zzh, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), getWrite.IAuthTabCallback(zzn.zzi, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), getWrite.IAuthTabCallback(zzn.zzc, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null))});
    }

    public final zzl zza() {
        return this.zzd;
    }

    public final zzn zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        if (Intrinsics.areEqual(this.zzd, zzl.zzT)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}
