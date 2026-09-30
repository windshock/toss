package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzahd;
import com.google.android.gms.internal.p000firebaseauthapi.zzahf;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzahd<MessageType extends zzahd<MessageType, BuilderType>, BuilderType extends zzahf<MessageType, BuilderType>> implements zzakk {
    protected int zza = 0;

    int zzh() {
        throw new UnsupportedOperationException();
    }

    int zza(zzalc zzalcVar) {
        int iZzh = zzh();
        if (iZzh != -1) {
            return iZzh;
        }
        int iZza = zzalcVar.zza(this);
        zzb(iZza);
        return iZza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakk
    public final zzahm zzi() {
        try {
            zzahv zzahvVarZzc = zzahm.zzc(zzk());
            zza(zzahvVarZzc.zzb());
            return zzahvVarZzc.zza();
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    void zzb(int i2) {
        throw new UnsupportedOperationException();
    }

    public final void zza(OutputStream outputStream) throws IOException {
        zzaii zzaiiVarZza = zzaii.zza(outputStream, zzaii.zzd(zzk()));
        zza(zzaiiVarZza);
        zzaiiVarZza.zzc();
    }

    public final byte[] zzj() {
        try {
            byte[] bArr = new byte[zzk()];
            zzaii zzaiiVarZzb = zzaii.zzb(bArr);
            zza(zzaiiVarZzb);
            zzaiiVarZzb.zzb();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
