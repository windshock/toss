package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.exoplayer2.source.rtsp.RtpPacket;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaio {
    private final Object zza;
    private final int zzb;

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * RtpPacket.MAX_SEQUENCE_NUMBER) + this.zzb;
    }

    zzaio(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaio)) {
            return false;
        }
        zzaio zzaioVar = (zzaio) obj;
        return this.zza == zzaioVar.zza && this.zzb == zzaioVar.zzb;
    }
}
