package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzkt {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzll zzc;
    private static final zzll zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzll zzllVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzllVar = (zzll) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzllVar;
        zzd = new zzln();
    }

    public static void zzA(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzu(i2, list, z);
    }

    public static void zzB(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzy(i2, list, z);
    }

    public static void zzC(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzA(i2, list, z);
    }

    public static void zzD(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzC(i2, list, z);
    }

    public static void zzE(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzE(i2, list, z);
    }

    public static void zzF(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzJ(i2, list, z);
    }

    public static void zzG(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzL(i2, list, z);
    }

    static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zziu)) {
            int iZzu = 0;
            while (i2 < size) {
                iZzu += zzhh.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iZzu;
        }
        zziu zziuVar = (zziu) list;
        int iZzu2 = 0;
        while (i2 < size) {
            iZzu2 += zzhh.zzu(zziuVar.zze(i2));
            i2++;
        }
        return iZzu2;
    }

    static int zzb(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzhh.zzy(i2 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() << 2;
    }

    static int zzd(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzhh.zzy(i2 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() << 3;
    }

    static int zzf(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zziu)) {
            int iZzu = 0;
            while (i2 < size) {
                iZzu += zzhh.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iZzu;
        }
        zziu zziuVar = (zziu) list;
        int iZzu2 = 0;
        while (i2 < size) {
            iZzu2 += zzhh.zzu(zziuVar.zze(i2));
            i2++;
        }
        return iZzu2;
    }

    static int zzg(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjt)) {
            int iZzz = 0;
            while (i2 < size) {
                iZzz += zzhh.zzz(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iZzz;
        }
        zzjt zzjtVar = (zzjt) list;
        int iZzz2 = 0;
        while (i2 < size) {
            iZzz2 += zzhh.zzz(zzjtVar.zze(i2));
            i2++;
        }
        return iZzz2;
    }

    static int zzh(int i2, Object obj, zzkr zzkrVar) {
        int i3 = i2 << 3;
        if (!(obj instanceof zzjk)) {
            return zzhh.zzy(i3) + zzhh.zzw((zzke) obj, zzkrVar);
        }
        int iZza = ((zzjk) obj).zza();
        return zzhh.zzy(i3) + zzhh.zzy(iZza) + iZza;
    }

    static int zzi(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zziu)) {
            int iZzy = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iZzy += zzhh.zzy((iIntValue + iIntValue) ^ (iIntValue >> 31));
                i2++;
            }
            return iZzy;
        }
        zziu zziuVar = (zziu) list;
        int iZzy2 = 0;
        while (i2 < size) {
            int iZze = zziuVar.zze(i2);
            iZzy2 += zzhh.zzy((iZze + iZze) ^ (iZze >> 31));
            i2++;
        }
        return iZzy2;
    }

    static int zzj(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjt)) {
            int iZzz = 0;
            while (i2 < size) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iZzz += zzhh.zzz((jLongValue + jLongValue) ^ (jLongValue >> 63));
                i2++;
            }
            return iZzz;
        }
        zzjt zzjtVar = (zzjt) list;
        int iZzz2 = 0;
        while (i2 < size) {
            long jZze = zzjtVar.zze(i2);
            iZzz2 += zzhh.zzz((jZze + jZze) ^ (jZze >> 63));
            i2++;
        }
        return iZzz2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zziu)) {
            int iZzy = 0;
            while (i2 < size) {
                iZzy += zzhh.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iZzy;
        }
        zziu zziuVar = (zziu) list;
        int iZzy2 = 0;
        while (i2 < size) {
            iZzy2 += zzhh.zzy(zziuVar.zze(i2));
            i2++;
        }
        return iZzy2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjt)) {
            int iZzz = 0;
            while (i2 < size) {
                iZzz += zzhh.zzz(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iZzz;
        }
        zzjt zzjtVar = (zzjt) list;
        int iZzz2 = 0;
        while (i2 < size) {
            iZzz2 += zzhh.zzz(zzjtVar.zze(i2));
            i2++;
        }
        return iZzz2;
    }

    public static zzll zzm() {
        return zzc;
    }

    public static zzll zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i2, List list, zzix zzixVar, Object obj2, zzll zzllVar) {
        if (zzixVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzixVar.zza(iIntValue)) {
                    obj2 = zzp(obj, i2, iIntValue, obj2, zzllVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) list.get(i4);
            int iIntValue2 = num.intValue();
            if (zzixVar.zza(iIntValue2)) {
                if (i4 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = zzp(obj, i2, iIntValue2, obj2, zzllVar);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    static Object zzp(Object obj, int i2, int i3, Object obj2, zzll zzllVar) {
        if (obj2 == null) {
            obj2 = zzllVar.zzc(obj);
        }
        zzllVar.zzl(obj2, i2, i3);
        return obj2;
    }

    static void zzq(zzif zzifVar, Object obj, Object obj2) {
        zzij zzijVarZzb = zzifVar.zzb(obj2);
        if (zzijVarZzb.zza.isEmpty()) {
            return;
        }
        zzifVar.zzc(obj).zzh(zzijVarZzb);
    }

    static void zzr(zzll zzllVar, Object obj, Object obj2) {
        zzllVar.zzo(obj, zzllVar.zze(zzllVar.zzd(obj), zzllVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzit.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzc(i2, list, z);
    }

    public static void zzu(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzg(i2, list, z);
    }

    public static void zzv(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzj(i2, list, z);
    }

    public static void zzw(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzl(i2, list, z);
    }

    public static void zzx(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzn(i2, list, z);
    }

    public static void zzy(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzp(i2, list, z);
    }

    public static void zzz(int i2, List list, zzmd zzmdVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzs(i2, list, z);
    }
}
