package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzck {
    private final Map zza;
    private final Set zzb;
    private final Map zzc;

    public zzck() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zza = linkedHashMap;
        this.zzb = new LinkedHashSet();
        this.zzc = linkedHashMap;
    }

    private final List zzi(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzpq) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    public final Object zza(@NotNull zzpq zzpqVar) throws zzae {
        int iZzO = zzpqVar.zzO();
        if (iZzO == 0) {
            throw null;
        }
        switch (iZzO - 1) {
            case 0:
                return this.zza.get(Integer.valueOf(zzpqVar.zzi()));
            case 1:
                return Boolean.valueOf(zzpqVar.zzM());
            case 2:
                byte[] bArrZzo = zzpqVar.zzI().zzo();
                if (bArrZzo.length == 1) {
                    return Byte.valueOf(bArrZzo[0]);
                }
                throw new zzae(4, 6, (Throwable) null);
            case 3:
                String strZzK = zzpqVar.zzK();
                if (strZzK.length() == 1) {
                    return Character.valueOf(strZzK.charAt(0));
                }
                throw new zzae(4, 6, (Throwable) null);
            case 4:
                int iZzj = zzpqVar.zzj();
                if (iZzj < -32768 || iZzj > 32767) {
                    throw new zzae(4, 6, (Throwable) null);
                }
                return Short.valueOf((short) iZzj);
            case 5:
                return Integer.valueOf(zzpqVar.zzk());
            case 6:
            case 8:
                throw new zzae(4, 6, (Throwable) null);
            case 7:
                return Long.valueOf(zzpqVar.zzH());
            case 9:
                return Float.valueOf(zzpqVar.zzg());
            case 10:
                return Double.valueOf(zzpqVar.zzf());
            case 11:
                return zzpqVar.zzL();
            case 12:
                return null;
            default:
                throw new zzae(4, 5, (Throwable) null);
        }
    }

    public final Object zzb(int i2) {
        return this.zza.remove(Integer.valueOf(i2));
    }

    public final Map zzc() {
        return this.zzc;
    }

    public final void zzd() {
        this.zza.clear();
    }

    public final void zze(int i2, @Nullable Object obj) {
        zzf(173, obj);
        this.zzb.add(173);
    }

    public final void zzf(int i2, @Nullable Object obj) {
        this.zza.put(Integer.valueOf(i2), obj);
    }

    public final Class[] zzg(@NotNull List list) {
        List listZzi = zzi(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZzi, 10));
        Iterator it = listZzi.iterator();
        while (it.hasNext()) {
            arrayList.add(zzci.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzh(@NotNull List list) {
        return zzi(list).toArray(new Object[0]);
    }
}
