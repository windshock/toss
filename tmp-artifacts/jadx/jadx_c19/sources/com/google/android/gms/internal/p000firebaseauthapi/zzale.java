package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzale {
    private static final Class<?> zza = zzd();
    private static final zzamb<?, ?> zzb = zzc();
    private static final zzamb<?, ?> zzc = new zzamd();

    static int zza(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaii.zza(i2, true);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zza(int i2, List<zzahm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzg = size * zzaii.zzg(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzg += zzaii.zza(list.get(i3));
        }
        return iZzg;
    }

    static int zzb(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzaii.zzg(i2));
    }

    static int zzb(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajd)) {
            int iZza = 0;
            while (i2 < size) {
                iZza += zzaii.zza(list.get(i2).intValue());
                i2++;
            }
            return iZza;
        }
        zzajd zzajdVar = (zzajd) list;
        int iZza2 = 0;
        while (i2 < size) {
            iZza2 += zzaii.zza(zzajdVar.zzb(i2));
            i2++;
        }
        return iZza2;
    }

    static int zzc(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaii.zzb(i2, 0);
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaii.zza(i2, 0L);
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i2, List<zzakk> list, zzalc zzalcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iZza += zzaii.zza(i2, list.get(i3), zzalcVar);
        }
        return iZza;
    }

    static int zze(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzaii.zzg(i2));
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajd)) {
            int iZzc = 0;
            while (i2 < size) {
                iZzc += zzaii.zzc(list.get(i2).intValue());
                i2++;
            }
            return iZzc;
        }
        zzajd zzajdVar = (zzajd) list;
        int iZzc2 = 0;
        while (i2 < size) {
            iZzc2 += zzaii.zzc(zzajdVar.zzb(i2));
            i2++;
        }
        return iZzc2;
    }

    static int zzf(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzaii.zzg(i2));
    }

    static int zzf(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajz)) {
            int iZzb = 0;
            while (i2 < size) {
                iZzb += zzaii.zzb(list.get(i2).longValue());
                i2++;
            }
            return iZzb;
        }
        zzajz zzajzVar = (zzajz) list;
        int iZzb2 = 0;
        while (i2 < size) {
            iZzb2 += zzaii.zzb(zzajzVar.zzb(i2));
            i2++;
        }
        return iZzb2;
    }

    static int zza(int i2, Object obj, zzalc zzalcVar) {
        if (obj instanceof zzajo) {
            return zzaii.zzb(i2, (zzajo) obj);
        }
        return zzaii.zzb(i2, (zzakk) obj, zzalcVar);
    }

    static int zzb(int i2, List<?> list, zzalc zzalcVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzg = zzaii.zzg(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzajo) {
                iZza = zzaii.zza((zzajo) obj);
            } else {
                iZza = zzaii.zza((zzakk) obj, zzalcVar);
            }
            iZzg += iZza;
        }
        return iZzg;
    }

    static int zzg(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzaii.zzg(i2));
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajd)) {
            int iZzf = 0;
            while (i2 < size) {
                iZzf += zzaii.zzf(list.get(i2).intValue());
                i2++;
            }
            return iZzf;
        }
        zzajd zzajdVar = (zzajd) list;
        int iZzf2 = 0;
        while (i2 < size) {
            iZzf2 += zzaii.zzf(zzajdVar.zzb(i2));
            i2++;
        }
        return iZzf2;
    }

    static int zzh(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzaii.zzg(i2));
    }

    static int zzh(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajz)) {
            int iZzd = 0;
            while (i2 < size) {
                iZzd += zzaii.zzd(list.get(i2).longValue());
                i2++;
            }
            return iZzd;
        }
        zzajz zzajzVar = (zzajz) list;
        int iZzd2 = 0;
        while (i2 < size) {
            iZzd2 += zzaii.zzd(zzajzVar.zzb(i2));
            i2++;
        }
        return iZzd2;
    }

    static int zzb(int i2, List<?> list) {
        int iZza;
        int iZza2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzg = zzaii.zzg(i2) * size;
        if (!(list instanceof zzajq)) {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof zzahm) {
                    iZza = zzaii.zza((zzahm) obj);
                } else {
                    iZza = zzaii.zza((String) obj);
                }
                iZzg += iZza;
                i3++;
            }
            return iZzg;
        }
        zzajq zzajqVar = (zzajq) list;
        while (i3 < size) {
            Object objZzb = zzajqVar.zzb(i3);
            if (objZzb instanceof zzahm) {
                iZza2 = zzaii.zza((zzahm) objZzb);
            } else {
                iZza2 = zzaii.zza((String) objZzb);
            }
            iZzg += iZza2;
            i3++;
        }
        return iZzg;
    }

    static int zzi(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzaii.zzg(i2));
    }

    static int zzi(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajd)) {
            int iZzh = 0;
            while (i2 < size) {
                iZzh += zzaii.zzh(list.get(i2).intValue());
                i2++;
            }
            return iZzh;
        }
        zzajd zzajdVar = (zzajd) list;
        int iZzh2 = 0;
        while (i2 < size) {
            iZzh2 += zzaii.zzh(zzajdVar.zzb(i2));
            i2++;
        }
        return iZzh2;
    }

    static int zzj(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzaii.zzg(i2));
    }

    static int zzj(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajz)) {
            int iZze = 0;
            while (i2 < size) {
                iZze += zzaii.zze(list.get(i2).longValue());
                i2++;
            }
            return iZze;
        }
        zzajz zzajzVar = (zzajz) list;
        int iZze2 = 0;
        while (i2 < size) {
            iZze2 += zzaii.zze(zzajzVar.zzb(i2));
            i2++;
        }
        return iZze2;
    }

    private static zzamb<?, ?> zzc() {
        try {
            Class<?> clsZze = zze();
            if (clsZze == null) {
                return null;
            }
            return (zzamb) clsZze.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static zzamb<?, ?> zza() {
        return zzb;
    }

    public static zzamb<?, ?> zzb() {
        return zzc;
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB zza(Object obj, int i2, List<Integer> list, zzajh zzajhVar, UB ub, zzamb<UT, UB> zzambVar) {
        if (zzajhVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Integer num = list.get(i4);
                int iIntValue = num.intValue();
                if (zzajhVar.zza(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, num);
                    }
                    i3++;
                } else {
                    ub = (UB) zza(obj, i2, iIntValue, ub, zzambVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!zzajhVar.zza(iIntValue2)) {
                ub = (UB) zza(obj, i2, iIntValue2, ub, zzambVar);
                it.remove();
            }
        }
        return ub;
    }

    static <UT, UB> UB zza(Object obj, int i2, int i3, UB ub, zzamb<UT, UB> zzambVar) {
        if (ub == null) {
            ub = zzambVar.zzc(obj);
        }
        zzambVar.zzb(ub, i2, i3);
        return ub;
    }

    static <T, FT extends zzaiu<FT>> void zza(zzair<FT> zzairVar, T t, T t2) {
        zzais<T> zzaisVarZza = zzairVar.zza(t2);
        if (zzaisVarZza.zza.isEmpty()) {
            return;
        }
        zzairVar.zzb(t).zza((zzais) zzaisVarZza);
    }

    static <T> void zza(zzakh zzakhVar, T t, T t2, long j) {
        zzamh.zza(t, j, zzakhVar.zza(zzamh.zze(t, j), zzamh.zze(t2, j)));
    }

    static <T, UT, UB> void zza(zzamb<UT, UB> zzambVar, T t, T t2) {
        zzambVar.zzc(t, zzambVar.zza(zzambVar.zzd(t), zzambVar.zzd(t2)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzaja.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i2, List<Boolean> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i2, list, z);
    }

    public static void zza(int i2, List<zzahm> list, zzanb zzanbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i2, list);
    }

    public static void zzb(int i2, List<Double> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i2, list, z);
    }

    public static void zzc(int i2, List<Integer> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzc(i2, list, z);
    }

    public static void zzd(int i2, List<Integer> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzd(i2, list, z);
    }

    public static void zze(int i2, List<Long> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zze(i2, list, z);
    }

    public static void zzf(int i2, List<Float> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzf(i2, list, z);
    }

    public static void zza(int i2, List<?> list, zzanb zzanbVar, zzalc zzalcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i2, list, zzalcVar);
    }

    public static void zzg(int i2, List<Integer> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzg(i2, list, z);
    }

    public static void zzh(int i2, List<Long> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzh(i2, list, z);
    }

    public static void zzb(int i2, List<?> list, zzanb zzanbVar, zzalc zzalcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i2, list, zzalcVar);
    }

    public static void zzi(int i2, List<Integer> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzi(i2, list, z);
    }

    public static void zzj(int i2, List<Long> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzj(i2, list, z);
    }

    public static void zzk(int i2, List<Integer> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzk(i2, list, z);
    }

    public static void zzl(int i2, List<Long> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzl(i2, list, z);
    }

    public static void zzb(int i2, List<String> list, zzanb zzanbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i2, list);
    }

    public static void zzm(int i2, List<Integer> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzm(i2, list, z);
    }

    public static void zzn(int i2, List<Long> list, zzanb zzanbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzn(i2, list, z);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
