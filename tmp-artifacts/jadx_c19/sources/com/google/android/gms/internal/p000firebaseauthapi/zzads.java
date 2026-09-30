package com.google.android.gms.internal.p000firebaseauthapi;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;
import o.onMeasure;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzads {
    private static final Map<String, zzadu> zza = new onMeasure();

    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable zzacw zzacwVar) {
        zza(str, zzacwVar);
        return new zzadr(onVerificationStateChangedCallbacks, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, @Nullable zzacw zzacwVar) {
        zza.put(str, new zzadu(zzacwVar, DefaultClock.getInstance().currentTimeMillis()));
    }

    public static boolean zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, Executor executor) {
        Map<String, zzadu> map = zza;
        if (map.containsKey(str)) {
            zzadu zzaduVar = map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzaduVar.zzb < 120000) {
                zzacw zzacwVar = zzaduVar.zza;
                if (zzacwVar == null) {
                    return true;
                }
                zzacwVar.zza(onVerificationStateChangedCallbacks, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
