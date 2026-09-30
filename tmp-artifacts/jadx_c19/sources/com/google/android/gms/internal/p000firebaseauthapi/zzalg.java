package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzalg extends zzalh<Object, Object> {
    zzalg(int i2) {
        super(i2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalh
    public final void zza() {
        if (!zze()) {
            for (int i2 = 0; i2 < zzb(); i2++) {
                Map.Entry<Object, Object> entryZzb = zzb(i2);
                if (((zzaiu) entryZzb.getKey()).zze()) {
                    entryZzb.setValue(Collections.unmodifiableList((List) entryZzb.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : zzc()) {
                if (((zzaiu) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
