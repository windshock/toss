package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000firebaseauthapi.zzafq;
import com.google.android.gms.internal.p000firebaseauthapi.zzagq;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbk {
    public static MultiFactorInfo zza(zzafq zzafqVar) {
        if (zzafqVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafqVar.zze())) {
            return new PhoneMultiFactorInfo(zzafqVar.zzd(), zzafqVar.zzc(), zzafqVar.zza(), Preconditions.checkNotEmpty(zzafqVar.zze()));
        }
        if (zzafqVar.zzb() != null) {
            return new TotpMultiFactorInfo(zzafqVar.zzd(), zzafqVar.zzc(), zzafqVar.zza(), (zzagq) Preconditions.checkNotNull(zzafqVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List<MultiFactorInfo> zza(List<zzafq> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzafq> it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfoZza = zza(it.next());
            if (multiFactorInfoZza != null) {
                arrayList.add(multiFactorInfoZza);
            }
        }
        return arrayList;
    }
}
