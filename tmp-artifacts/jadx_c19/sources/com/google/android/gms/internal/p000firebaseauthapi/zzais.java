package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaiu;
import com.google.android.material.button.MaterialButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzais<T extends zzaiu<T>> {
    private static final zzais zzb = new zzais(true);
    final zzalh<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    static int zza(zzamo zzamoVar, int i2, Object obj) {
        int iZzg = zzaii.zzg(i2);
        if (zzamoVar == zzamo.zzj) {
            zzajc.zza((zzakk) obj);
            iZzg <<= 1;
        }
        return iZzg + zza(zzamoVar, obj);
    }

    private static int zza(zzamo zzamoVar, Object obj) {
        switch (zzaiv.zzb[zzamoVar.ordinal()]) {
            case 1:
                return zzaii.zza(((Double) obj).doubleValue());
            case 2:
                return zzaii.zza(((Float) obj).floatValue());
            case 3:
                return zzaii.zzb(((Long) obj).longValue());
            case 4:
                return zzaii.zze(((Long) obj).longValue());
            case 5:
                return zzaii.zzc(((Integer) obj).intValue());
            case 6:
                return zzaii.zza(((Long) obj).longValue());
            case 7:
                return zzaii.zzb(((Integer) obj).intValue());
            case 8:
                return zzaii.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzaii.zza((zzakk) obj);
            case 10:
                if (obj instanceof zzajk) {
                    return zzaii.zza((zzajk) obj);
                }
                return zzaii.zzb((zzakk) obj);
            case 11:
                if (obj instanceof zzahm) {
                    return zzaii.zza((zzahm) obj);
                }
                return zzaii.zza((String) obj);
            case 12:
                if (obj instanceof zzahm) {
                    return zzaii.zza((zzahm) obj);
                }
                return zzaii.zza((byte[]) obj);
            case 13:
                return zzaii.zzh(((Integer) obj).intValue());
            case 14:
                return zzaii.zze(((Integer) obj).intValue());
            case 15:
                return zzaii.zzc(((Long) obj).longValue());
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                return zzaii.zzf(((Integer) obj).intValue());
            case 17:
                return zzaii.zzd(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzajf) {
                    return zzaii.zza(((zzajf) obj).zza());
                }
                return zzaii.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(zzaiu<?> zzaiuVar, Object obj) {
        zzamo zzamoVarZzb = zzaiuVar.zzb();
        int iZza = zzaiuVar.zza();
        if (zzaiuVar.zze()) {
            List list = (List) obj;
            int iZza2 = 0;
            if (zzaiuVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iZza2 += zza(zzamoVarZzb, it.next());
                }
                return zzaii.zzg(iZza) + iZza2 + zzaii.zzh(iZza2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                iZza2 += zza(zzamoVarZzb, iZza, it2.next());
            }
            return iZza2;
        }
        return zza(zzamoVarZzb, iZza, obj);
    }

    public final int zza() {
        int iZza = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            iZza += zza((Map.Entry) this.zza.zzb(i2));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZza += zza((Map.Entry) it.next());
        }
        return iZza;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzamy.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzajk) {
                return zzaii.zza(entry.getKey().zza(), (zzajk) value);
            }
            return zzaii.zza(entry.getKey().zza(), (zzakk) value);
        }
        return zza((zzaiu<?>) key, value);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public static <T extends zzaiu<T>> zzais<T> zzb() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzais zzaisVar = new zzais();
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i2);
            zzaisVar.zzb((zzaiu) entryZzb.getKey(), entryZzb.getValue());
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzaisVar.zzb((zzaiu) entry.getKey(), entry.getValue());
        }
        zzaisVar.zzd = this.zzd;
        return zzaisVar;
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzakt) {
            return ((zzakt) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        return obj instanceof zzajk ? zzajk.zza() : obj;
    }

    final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zzd) {
            return new zzajp(this.zza.zzd().iterator());
        }
        return this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzd) {
            return new zzajp(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    private zzais() {
        this.zza = zzalh.zza(16);
    }

    private zzais(zzalh<T, Object> zzalhVar) {
        this.zza = zzalhVar;
        zze();
    }

    private zzais(boolean z) {
        this(zzalh.zza(0));
        zze();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i2);
            if (entryZzb.getValue() instanceof zzaja) {
                ((zzaja) entryZzb.getValue()).zzs();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zza(zzais<T> zzaisVar) {
        for (int i2 = 0; i2 < zzaisVar.zza.zzb(); i2++) {
            zzb((Map.Entry) zzaisVar.zza.zzb(i2));
        }
        Iterator it = zzaisVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzakk zzakkVarZzf;
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzajk;
        if (key.zze()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzais<T>) key);
            if (objZza == null) {
                objZza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZza).add(zza(it.next()));
            }
            this.zza.zza((zzalh<T, Object>) key, (T) objZza);
            return;
        }
        if (key.zzc() != zzamy.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzalh<T, Object>) key, (T) zza(value));
            return;
        }
        Object objZza2 = zza((zzais<T>) key);
        if (objZza2 == null) {
            this.zza.zza((zzalh<T, Object>) key, (T) zza(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            value = zzajk.zza();
        }
        if (objZza2 instanceof zzakt) {
            zzakkVarZzf = key.zza((zzakt) objZza2, (zzakt) value);
        } else {
            zzakkVarZzf = key.zza(((zzakk) objZza2).zzq(), (zzakk) value).zzf();
        }
        this.zza.zza((zzalh<T, Object>) key, (T) zzakkVarZzf);
    }

    private final void zzb(T t, Object obj) {
        if (t.zze()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                zzc(t, obj2);
            }
            obj = arrayList;
        } else {
            zzc(t, obj);
        }
        if (obj instanceof zzajk) {
            this.zzd = true;
        }
        this.zza.zza((zzalh<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(T t, Object obj) {
        boolean z;
        zzamo zzamoVarZzb = t.zzb();
        zzajc.zza(obj);
        switch (zzaiv.zza[zzamoVarZzb.zzb().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                int iZza = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza), t.zzb().zzb(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Long;
                if (z) {
                }
                int iZza2 = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza2), t.zzb().zzb(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Float;
                if (z) {
                }
                int iZza22 = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza22), t.zzb().zzb(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Double;
                if (z) {
                }
                int iZza222 = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza222), t.zzb().zzb(), obj.getClass().getName()));
            case 5:
                z = obj instanceof Boolean;
                if (z) {
                }
                int iZza2222 = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza2222), t.zzb().zzb(), obj.getClass().getName()));
            case 6:
                z = obj instanceof String;
                if (z) {
                }
                int iZza22222 = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza22222), t.zzb().zzb(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof zzahm) || (obj instanceof byte[])) {
                    return;
                }
                int iZza222222 = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza222222), t.zzb().zzb(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof Integer) || (obj instanceof zzajf)) {
                    return;
                }
                int iZza2222222 = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza2222222), t.zzb().zzb(), obj.getClass().getName()));
            case 9:
                if ((obj instanceof zzakk) || (obj instanceof zzajk)) {
                    return;
                }
                int iZza22222222 = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza22222222), t.zzb().zzb(), obj.getClass().getName()));
            default:
                int iZza222222222 = t.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iZza222222222), t.zzb().zzb(), obj.getClass().getName()));
        }
    }

    static void zza(zzaii zzaiiVar, zzamo zzamoVar, int i2, Object obj) throws IOException {
        if (zzamoVar == zzamo.zzj) {
            zzakk zzakkVar = (zzakk) obj;
            zzajc.zza(zzakkVar);
            zzaiiVar.zzj(i2, 3);
            zzakkVar.zza(zzaiiVar);
            zzaiiVar.zzj(i2, 4);
        }
        zzaiiVar.zzj(i2, zzamoVar.zza());
        switch (zzaiv.zzb[zzamoVar.ordinal()]) {
            case 1:
                zzaiiVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzaiiVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzaiiVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzaiiVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzaiiVar.zzj(((Integer) obj).intValue());
                break;
            case 6:
                zzaiiVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzaiiVar.zzi(((Integer) obj).intValue());
                break;
            case 8:
                zzaiiVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzakk) obj).zza(zzaiiVar);
                break;
            case 10:
                zzaiiVar.zzc((zzakk) obj);
                break;
            case 11:
                if (obj instanceof zzahm) {
                    zzaiiVar.zzb((zzahm) obj);
                    break;
                } else {
                    zzaiiVar.zzb((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzahm) {
                    zzaiiVar.zzb((zzahm) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzaiiVar.zzb(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzaiiVar.zzl(((Integer) obj).intValue());
                break;
            case 14:
                zzaiiVar.zzi(((Integer) obj).intValue());
                break;
            case 15:
                zzaiiVar.zzf(((Long) obj).longValue());
                break;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                zzaiiVar.zzk(((Integer) obj).intValue());
                break;
            case 17:
                zzaiiVar.zzg(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzajf) {
                    zzaiiVar.zzj(((zzajf) obj).zza());
                    break;
                } else {
                    zzaiiVar.zzj(((Integer) obj).intValue());
                    break;
                }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzais) {
            return this.zza.equals(((zzais) obj).zza);
        }
        return false;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            if (!zzc(this.zza.zzb(i2))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzaiu<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzamy.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!zzb(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzakm) {
            return ((zzakm) obj).zzu();
        }
        if (obj instanceof zzajk) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
}
