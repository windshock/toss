package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p000firebaseauthapi.zzach;
import com.google.android.gms.internal.p000firebaseauthapi.zzags;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzd;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbl {
    private static long zza = 3600000;
    private static final com.google.android.gms.internal.p000firebaseauthapi.zzaq<String> zzb = com.google.android.gms.internal.p000firebaseauthapi.zzaq.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
    private static final zzbl zzc = new zzbl();
    private Task<AuthResult> zzd;
    private Task<String> zze;
    private long zzf = 0;

    public final Task<AuthResult> zza() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zzf < zza) {
            return this.zzd;
        }
        return null;
    }

    public final Task<String> zzb() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zzf < zza) {
            return this.zze;
        }
        return null;
    }

    public static zzbl zzc() {
        return zzc;
    }

    private zzbl() {
    }

    private static void zza(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        com.google.android.gms.internal.p000firebaseauthapi.zzaq<String> zzaqVar = zzb;
        int size = zzaqVar.size();
        int i2 = 0;
        while (i2 < size) {
            String str = zzaqVar.get(i2);
            i2++;
            editorEdit.remove(str);
        }
        editorEdit.commit();
    }

    public final void zza(Context context) {
        Preconditions.checkNotNull(context);
        zza(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.zzd = null;
        this.zzf = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(firebaseAuth);
        char c = 0;
        SharedPreferences sharedPreferences = firebaseAuth.getApp().getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.getApp().getName().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (sharedPreferences.contains("verifyAssertionRequest")) {
                zzags zzagsVarDeserializeFromString = SafeParcelableSerializer.deserializeFromString(sharedPreferences.getString("verifyAssertionRequest", ""), zzags.CREATOR);
                String string = sharedPreferences.getString("operation", "");
                String string2 = sharedPreferences.getString("tenantId", null);
                String string3 = sharedPreferences.getString("firebaseUserUid", "");
                this.zzf = sharedPreferences.getLong("timestamp", 0L);
                if (string2 != null) {
                    firebaseAuth.setTenantId(string2);
                    zzagsVarDeserializeFromString.zzb(string2);
                }
                int iHashCode = string.hashCode();
                if (iHashCode != -98509410) {
                    if (iHashCode != 175006864) {
                        c = (iHashCode == 1450464913 && string.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) ? (char) 2 : (char) 65535;
                    } else if (string.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                        c = 1;
                    }
                } else if (!string.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")) {
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c == 2) {
                            this.zzd = firebaseAuth.signInWithCredential(zzd.zza(zzagsVarDeserializeFromString));
                        } else {
                            this.zzd = null;
                        }
                    } else if (firebaseAuth.getCurrentUser().getUid().equals(string3)) {
                        this.zzd = firebaseAuth.zza(firebaseAuth.getCurrentUser(), zzd.zza(zzagsVarDeserializeFromString));
                    } else {
                        this.zzd = null;
                    }
                } else if (firebaseAuth.getCurrentUser().getUid().equals(string3)) {
                    this.zzd = firebaseAuth.zzc(firebaseAuth.getCurrentUser(), zzd.zza(zzagsVarDeserializeFromString));
                } else {
                    this.zzd = null;
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("recaptchaToken")) {
                String string4 = sharedPreferences.getString("recaptchaToken", "");
                String string5 = sharedPreferences.getString("operation", "");
                this.zzf = sharedPreferences.getLong("timestamp", 0L);
                if (string5.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    this.zze = Tasks.forResult(string4);
                } else {
                    this.zze = null;
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("statusCode")) {
                Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                this.zzf = sharedPreferences.getLong("timestamp", 0L);
                zza(sharedPreferences);
                this.zzd = Tasks.forException(zzach.zza(status));
            }
        }
    }

    public static void zza(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.getStatusCode());
        editorEdit.putString("statusMessage", status.getStatusMessage());
        editorEdit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        editorEdit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        Preconditions.checkNotNull(firebaseUser);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        editorEdit.putString("firebaseUserUid", firebaseUser.getUid());
        editorEdit.commit();
    }

    public static void zza(Context context, zzags zzagsVar, String str, @Nullable String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzagsVar));
        editorEdit.putString("operation", str);
        editorEdit.putString("tenantId", str2);
        editorEdit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }

    public static void zza(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("recaptchaToken", str);
        editorEdit.putString("operation", str2);
        editorEdit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }
}
