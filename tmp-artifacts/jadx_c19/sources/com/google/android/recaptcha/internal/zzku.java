package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzku extends zzle {
    zzku(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final void zza() {
        if (!zzj()) {
            for (int i2 = 0; i2 < zzb(); i2++) {
                ((zzii) zzg(i2).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzii) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
