package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Type;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zzaco {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaco";

    public static Object zza(String str, Type type) throws zzaah {
        if (type == String.class) {
            try {
                zzaek zzaekVar = (zzaek) new zzaek().zza(str);
                if (zzaekVar.zzb()) {
                    return zzaekVar.zza();
                }
                throw new zzaah("No error message: " + str);
            } catch (Exception e) {
                throw new zzaah("Json conversion failed! " + e.getMessage(), e);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzacq) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
            } catch (Exception e2) {
                throw new zzaah("Json conversion failed! " + e2.getMessage(), e2);
            }
        } catch (Exception e3) {
            throw new zzaah("Instantiation of JsonResponse failed! " + String.valueOf(type), e3);
        }
    }

    private zzaco() {
    }
}
