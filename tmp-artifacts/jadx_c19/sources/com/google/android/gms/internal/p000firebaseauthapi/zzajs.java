package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzajs extends zzajt {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzamh.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajt
    final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    private static <L> List<L> zza(Object obj, long j, int i2) {
        List<L> arrayList;
        List<L> listZzc = zzc(obj, j);
        if (listZzc.isEmpty()) {
            if (listZzc instanceof zzajq) {
                arrayList = new zzajr(i2);
            } else if ((listZzc instanceof zzakw) && (listZzc instanceof zzajg)) {
                arrayList = ((zzajg) listZzc).zza(i2);
            } else {
                arrayList = new ArrayList<>(i2);
            }
            zzamh.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(listZzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(listZzc.size() + i2);
            arrayList2.addAll(listZzc);
            zzamh.zza(obj, j, arrayList2);
            return arrayList2;
        }
        if (listZzc instanceof zzamg) {
            zzajr zzajrVar = new zzajr(listZzc.size() + i2);
            zzajrVar.addAll((zzamg) listZzc);
            zzamh.zza(obj, j, zzajrVar);
            return zzajrVar;
        }
        if ((listZzc instanceof zzakw) && (listZzc instanceof zzajg)) {
            zzajg zzajgVar = (zzajg) listZzc;
            if (!zzajgVar.zzc()) {
                zzajg zzajgVarZza = zzajgVar.zza(listZzc.size() + i2);
                zzamh.zza(obj, j, zzajgVarZza);
                return zzajgVarZza;
            }
        }
        return listZzc;
    }

    private zzajs() {
        super();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajt
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzamh.zze(obj, j);
        if (list instanceof zzajq) {
            objUnmodifiableList = ((zzajq) list).a_();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzakw) && (list instanceof zzajg)) {
                zzajg zzajgVar = (zzajg) list;
                if (zzajgVar.zzc()) {
                    zzajgVar.b_();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzamh.zza(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajt
    final <E> void zza(Object obj, Object obj2, long j) {
        List listZzc = zzc(obj2, j);
        List listZza = zza(obj, j, listZzc.size());
        int size = listZza.size();
        int size2 = listZzc.size();
        if (size > 0 && size2 > 0) {
            listZza.addAll(listZzc);
        }
        if (size > 0) {
            listZzc = listZza;
        }
        zzamh.zza(obj, j, listZzc);
    }
}
