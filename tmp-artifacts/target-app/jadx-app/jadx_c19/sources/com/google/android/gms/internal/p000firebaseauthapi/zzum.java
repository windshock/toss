package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum zzum implements zzajf {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    private static final zzaje<zzum> zzg = new zzaje<zzum>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzup
    };
    private final int zzi;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajf
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzum zza(int i2) {
        if (i2 == 0) {
            return KEM_UNKNOWN;
        }
        if (i2 == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i2 == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i2 == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i2 != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzum.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    zzum(int i2) {
        this.zzi = i2;
    }
}
