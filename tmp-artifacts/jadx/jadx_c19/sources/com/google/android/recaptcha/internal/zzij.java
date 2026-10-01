package com.google.android.recaptcha.internal;

import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzij {
    private static final zzij zzb = new zzij(true);
    final zzle zza = new zzku(16);
    private boolean zzc;
    private boolean zzd;

    private zzij() {
    }

    public static int zza(zzii zziiVar, Object obj) {
        int iZzz;
        int iZzd;
        int iZzy;
        zzmb zzmbVarZzd = zziiVar.zzd();
        int iZza = zziiVar.zza();
        zziiVar.zzg();
        int iZzy2 = zzhh.zzy(iZza << 3);
        if (zzmbVarZzd == zzmb.zzj) {
            if (((zzke) obj) instanceof zzgg) {
                throw null;
            }
            iZzy2 += iZzy2;
        }
        switch (zzmbVarZzd.ordinal()) {
            case 0:
                iZzz = 8;
                return iZzy2 + iZzz;
            case 1:
                iZzz = 4;
                return iZzy2 + iZzz;
            case 2:
                iZzz = zzhh.zzz(((Long) obj).longValue());
                return iZzy2 + iZzz;
            case 3:
                iZzz = zzhh.zzz(((Long) obj).longValue());
                return iZzy2 + iZzz;
            case 4:
                iZzz = zzhh.zzu(((Integer) obj).intValue());
                return iZzy2 + iZzz;
            case 5:
                iZzz = 8;
                return iZzy2 + iZzz;
            case 6:
                iZzz = 4;
                return iZzy2 + iZzz;
            case 7:
                iZzz = 1;
                return iZzy2 + iZzz;
            case 8:
                if (!(obj instanceof zzgw)) {
                    iZzz = zzhh.zzx((String) obj);
                    return iZzy2 + iZzz;
                }
                iZzd = ((zzgw) obj).zzd();
                iZzy = zzhh.zzy(iZzd);
                iZzz = iZzd + iZzy;
                return iZzy2 + iZzz;
            case 9:
                iZzz = ((zzke) obj).zzn();
                return iZzy2 + iZzz;
            case 10:
                if (!(obj instanceof zzjj)) {
                    iZzz = zzhh.zzv((zzke) obj);
                    return iZzy2 + iZzz;
                }
                iZzd = ((zzjj) obj).zza();
                iZzy = zzhh.zzy(iZzd);
                iZzz = iZzd + iZzy;
                return iZzy2 + iZzz;
            case 11:
                if (obj instanceof zzgw) {
                    iZzd = ((zzgw) obj).zzd();
                    iZzy = zzhh.zzy(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzy = zzhh.zzy(iZzd);
                }
                iZzz = iZzd + iZzy;
                return iZzy2 + iZzz;
            case 12:
                iZzz = zzhh.zzy(((Integer) obj).intValue());
                return iZzy2 + iZzz;
            case 13:
                iZzz = obj instanceof zziv ? zzhh.zzu(((zziv) obj).zza()) : zzhh.zzu(((Integer) obj).intValue());
                return iZzy2 + iZzz;
            case 14:
                iZzz = 4;
                return iZzy2 + iZzz;
            case 15:
                iZzz = 8;
                return iZzy2 + iZzz;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                iZzz = zzhh.zzy((iIntValue + iIntValue) ^ (iIntValue >> 31));
                return iZzy2 + iZzz;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzz = zzhh.zzz((jLongValue + jLongValue) ^ (jLongValue >> 63));
                return iZzy2 + iZzz;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzij zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzkj) {
            return ((zzkj) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzke zzkeVarZzj;
        zzii zziiVar = (zzii) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzjj;
        zziiVar.zzg();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zziiVar, zzl(value));
            return;
        }
        Object objZze = zze(zziiVar);
        if (objZze == null) {
            this.zza.put(zziiVar, zzl(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objZze instanceof zzkj) {
            zzkeVarZzj = zziiVar.zzc((zzkj) objZze, (zzkj) value);
        } else {
            zzkd zzkdVarZzX = ((zzke) objZze).zzX();
            zziiVar.zzb(zzkdVarZzX, (zzke) value);
            zzkeVarZzj = zzkdVarZzX.zzj();
        }
        this.zza.put(zziiVar, zzkeVarZzj);
    }

    private static boolean zzn(Map.Entry entry) {
        zzii zziiVar = (zzii) entry.getKey();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            return true;
        }
        zziiVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzkf) {
            return ((zzkf) value).zzo();
        }
        if (value instanceof zzjj) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzii zziiVar = (zzii) entry.getKey();
        Object value = entry.getValue();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            return zza(zziiVar, value);
        }
        zziiVar.zzg();
        zziiVar.zzf();
        if (!(value instanceof zzjj)) {
            int iZzy = zzhh.zzy(((zzii) entry.getKey()).zza());
            int iZzv = zzhh.zzv((zzke) value);
            int iZzy2 = zzhh.zzy(24);
            int iZzy3 = zzhh.zzy(16);
            int iZzy4 = zzhh.zzy(8);
            return iZzy4 + iZzy4 + iZzy3 + iZzy + iZzy2 + iZzv;
        }
        int iZzy5 = zzhh.zzy(((zzii) entry.getKey()).zza());
        int iZza = ((zzjj) value).zza();
        int iZzy6 = zzhh.zzy(iZza);
        int iZzy7 = zzhh.zzy(24);
        int iZzy8 = zzhh.zzy(16);
        int iZzy9 = zzhh.zzy(8);
        return iZzy9 + iZzy9 + iZzy8 + iZzy5 + iZzy7 + iZzy6 + iZza;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzij) {
            return this.zza.equals(((zzij) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzo = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            iZzo += zzo(this.zza.zzg(i2));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzij clone() {
        zzij zzijVar = new zzij();
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            zzijVar.zzi((zzii) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzijVar.zzi((zzii) entry.getKey(), entry.getValue());
        }
        zzijVar.zzd = this.zzd;
        return zzijVar;
    }

    public final Object zze(zzii zziiVar) {
        Object obj = this.zza.get(zziiVar);
        if (obj instanceof zzjj) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzji(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            if (entryZzg.getValue() instanceof zzit) {
                ((zzit) entryZzg.getValue()).zzB();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzij zzijVar) {
        for (int i2 = 0; i2 < zzijVar.zza.zzb(); i2++) {
            zzm(zzijVar.zza.zzg(i2));
        }
        Iterator it = zzijVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if ((r3 instanceof com.google.android.recaptcha.internal.zziv) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r3 instanceof com.google.android.recaptcha.internal.zzjj) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzii zziiVar, Object obj) {
        boolean z;
        zziiVar.zzg();
        switch (zziiVar.zzd().zza()) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zzgw)) {
                    break;
                }
                if (obj instanceof zzjj) {
                    this.zzd = true;
                }
                this.zza.put(zziiVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzjj) {
                }
                this.zza.put(zziiVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzke)) {
                    break;
                }
                if (obj instanceof zzjj) {
                }
                this.zza.put(zziiVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziiVar.zza()), zziiVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            if (!zzn(this.zza.zzg(i2))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzij(boolean z) {
        zzg();
        zzg();
    }
}
