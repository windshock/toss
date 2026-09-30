package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class zzacl {
    public static String zza(zzaci zzaciVar, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                if (zzk.zza(str2.charAt(i2))) {
                    char[] charArray = str2.toCharArray();
                    while (i2 < length) {
                        char c = charArray[i2];
                        if (zzk.zza(c)) {
                            charArray[i2] = (char) (c ^ ' ');
                        }
                        i2++;
                    }
                    return String.valueOf(charArray);
                }
                i2++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            zzaci.zza.e("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    public static void zzb(zzaci zzaciVar, String str) {
        zzaciVar.zza(str, null);
    }
}
