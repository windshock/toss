package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbj implements zzce {
    private final OutputStream zza;

    public static zzce zza(OutputStream outputStream) {
        return new zzbj(outputStream);
    }

    private zzbj(OutputStream outputStream) {
        this.zza = outputStream;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzce
    public final void zza(zzty zztyVar) throws IOException {
        try {
            ((zzty) ((zzaja) zztyVar.zzm().zza().zzf())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzce
    public final void zza(zzvh zzvhVar) throws IOException {
        try {
            zzvhVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
