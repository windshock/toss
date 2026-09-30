package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum zzvb implements zzajf {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    private static final zzaje<zzvb> zzf = new zzaje<zzvb>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzva
    };
    private final int zzh;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajf
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzvb zza(int i2) {
        if (i2 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 == 2) {
            return DISABLED;
        }
        if (i2 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzvb.class.getName());
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

    zzvb(int i2) {
        this.zzh = i2;
    }
}
