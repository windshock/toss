package com.google.android.recaptcha.internal;

import com.google.android.exoplayer2.source.rtsp.RtpPacket;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzid {
    private final Object zza;
    private final int zzb;

    zzid(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzid)) {
            return false;
        }
        zzid zzidVar = (zzid) obj;
        return this.zza == zzidVar.zza && this.zzb == zzidVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * RtpPacket.MAX_SEQUENCE_NUMBER) + this.zzb;
    }
}
