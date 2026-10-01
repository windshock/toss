package com.google.android.gms.internal.p000firebaseauthapi;

import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.gms.internal.p000firebaseauthapi.zzaja;
import com.google.android.material.button.MaterialButton;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzako<T> implements zzalc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamh.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzakk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final zzakz zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzaks zzo;
    private final zzajt zzp;
    private final zzamb<?, ?> zzq;
    private final zzair<?> zzr;
    private final zzakh zzs;

    private static <T> double zza(T t, long j) {
        return ((Double) zzamh.zze(t, j)).doubleValue();
    }

    private static boolean zzg(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzamh.zze(t, j)).floatValue();
    }

    private static int zza(byte[] bArr, int i2, int i3, zzamo zzamoVar, Class<?> cls, zzahl zzahlVar) throws IOException {
        switch (zzakr.zza[zzamoVar.ordinal()]) {
            case 1:
                int iZzd = zzahi.zzd(bArr, i2, zzahlVar);
                zzahlVar.zzc = Boolean.valueOf(zzahlVar.zzb != 0);
                return iZzd;
            case 2:
                return zzahi.zza(bArr, i2, zzahlVar);
            case 3:
                zzahlVar.zzc = Double.valueOf(zzahi.zza(bArr, i2));
                return i2 + 8;
            case 4:
            case 5:
                zzahlVar.zzc = Integer.valueOf(zzahi.zzc(bArr, i2));
                return i2 + 4;
            case 6:
            case 7:
                zzahlVar.zzc = Long.valueOf(zzahi.zzd(bArr, i2));
                return i2 + 8;
            case 8:
                zzahlVar.zzc = Float.valueOf(zzahi.zzb(bArr, i2));
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzahi.zzc(bArr, i2, zzahlVar);
                zzahlVar.zzc = Integer.valueOf(zzahlVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzahi.zzd(bArr, i2, zzahlVar);
                zzahlVar.zzc = Long.valueOf(zzahlVar.zzb);
                return iZzd2;
            case 14:
                return zzahi.zza(zzaky.zza().zza((Class) cls), bArr, i2, i3, zzahlVar);
            case 15:
                int iZzc2 = zzahi.zzc(bArr, i2, zzahlVar);
                zzahlVar.zzc = Integer.valueOf(zzaib.zze(zzahlVar.zza));
                return iZzc2;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                int iZzd3 = zzahi.zzd(bArr, i2, zzahlVar);
                zzahlVar.zzc = Long.valueOf(zzaib.zza(zzahlVar.zzb));
                return iZzd3;
            case 17:
                return zzahi.zzb(bArr, i2, zzahlVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final int zza(T t) {
        int i2;
        int i3;
        int i4;
        boolean z;
        int iZza;
        int iZzd;
        int iZzg;
        int iZzh;
        Unsafe unsafe = zzb;
        ?? r9 = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i7 < this.zzc.length) {
            int iZzc = zzc(i7);
            int i10 = (267386880 & iZzc) >>> 20;
            int[] iArr = this.zzc;
            int i11 = iArr[i7];
            int i12 = iArr[i7 + 2];
            int i13 = i12 & i5;
            if (i10 <= 17) {
                if (i13 != i9) {
                    i6 = i13 == i5 ? r9 : unsafe.getInt(t, i13);
                    i9 = i13;
                }
                i2 = i6;
                i3 = i9;
                i4 = 1 << (i12 >>> 20);
            } else {
                i2 = i6;
                i3 = i9;
                i4 = r9;
            }
            long j = iZzc & i5;
            if (i10 >= zzaix.zza.zza()) {
                zzaix.zzb.zza();
            }
            int i14 = i4;
            switch (i10) {
                case 0:
                    z = r9;
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zza(i11, 0.0d);
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    z = r9;
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zza(i11, 0.0f);
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    z = r9;
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zzb(i11, unsafe.getLong(t, j));
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    z = r9;
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zze(i11, unsafe.getLong(t, j));
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    z = r9;
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zzc(i11, unsafe.getInt(t, j));
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    z = r9;
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zza(i11, 0L);
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        z = false;
                        iZza = zzaii.zzb(i11, 0);
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zza(i11, true);
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzahm) {
                            iZza = zzaii.zza(i11, (zzahm) object);
                        } else {
                            iZza = zzaii.zza(i11, (String) object);
                        }
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzale.zza(i11, unsafe.getObject(t, j), zze(i7));
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zza(i11, (zzahm) unsafe.getObject(t, j));
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zzf(i11, unsafe.getInt(t, j));
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zza(i11, unsafe.getInt(t, j));
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        z = false;
                        iZza = zzaii.zzd(i11, 0);
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zzc(i11, 0L);
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zze(i11, unsafe.getInt(t, j));
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zzd(i11, unsafe.getLong(t, j));
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (zza((zzako<T>) t, i7, i3, i2, i14)) {
                        iZza = zzaii.zza(i11, (zzakk) unsafe.getObject(t, j), zze(i7));
                        z = false;
                        i8 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 18:
                    iZza = zzale.zzd(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 19:
                    iZza = zzale.zzc(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 20:
                    iZza = zzale.zzf(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 21:
                    iZza = zzale.zzj(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 22:
                    iZza = zzale.zze(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 23:
                    iZza = zzale.zzd(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 24:
                    iZza = zzale.zzc(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 25:
                    iZza = zzale.zza(i11, (List<?>) unsafe.getObject(t, j), (boolean) r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 26:
                    iZza = zzale.zzb(i11, (List) unsafe.getObject(t, j));
                    z = r9;
                    i8 += iZza;
                    break;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    iZza = zzale.zzb(i11, (List<?>) unsafe.getObject(t, j), zze(i7));
                    z = r9;
                    i8 += iZza;
                    break;
                case 28:
                    iZza = zzale.zza(i11, (List<zzahm>) unsafe.getObject(t, j));
                    z = r9;
                    i8 += iZza;
                    break;
                case 29:
                    iZza = zzale.zzi(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 30:
                    iZza = zzale.zzb(i11, (List<Integer>) unsafe.getObject(t, j), (boolean) r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 31:
                    iZza = zzale.zzc(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    iZza = zzale.zzd(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    iZza = zzale.zzg(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 34:
                    iZza = zzale.zzh(i11, (List) unsafe.getObject(t, j), r9);
                    z = r9;
                    i8 += iZza;
                    break;
                case 35:
                    iZzd = zzale.zzd((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 36:
                    iZzd = zzale.zzc((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 37:
                    iZzd = zzale.zzf((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 38:
                    iZzd = zzale.zzj((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 39:
                    iZzd = zzale.zze((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 40:
                    iZzd = zzale.zzd((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 41:
                    iZzd = zzale.zzc((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 42:
                    iZzd = zzale.zza((List<?>) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 43:
                    iZzd = zzale.zzi((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 44:
                    iZzd = zzale.zzb((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 45:
                    iZzd = zzale.zzc((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 46:
                    iZzd = zzale.zzd((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 47:
                    iZzd = zzale.zzg((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 48:
                    iZzd = zzale.zzh((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzg = zzaii.zzg(i11);
                        iZzh = zzaii.zzh(iZzd);
                        i8 += iZzg + iZzh + iZzd;
                    }
                    z = r9;
                    break;
                case 49:
                    iZza = zzale.zza(i11, (List<zzakk>) unsafe.getObject(t, j), zze(i7));
                    z = r9;
                    i8 += iZza;
                    break;
                case 50:
                    iZza = this.zzs.zza(i11, unsafe.getObject(t, j), zzf(i7));
                    z = r9;
                    i8 += iZza;
                    break;
                case 51:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zza(i11, 0.0d);
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 52:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zza(i11, 0.0f);
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 53:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zzb(i11, zzd(t, j));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zze(i11, zzd(t, j));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 55:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zzc(i11, zzc(t, j));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 56:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zza(i11, 0L);
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 57:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zzb(i11, (int) r9);
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 58:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zza(i11, true);
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 59:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzahm) {
                            iZza = zzaii.zza(i11, (zzahm) object2);
                        } else {
                            iZza = zzaii.zza(i11, (String) object2);
                        }
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 60:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzale.zza(i11, unsafe.getObject(t, j), zze(i7));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 61:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zza(i11, (zzahm) unsafe.getObject(t, j));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 62:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zzf(i11, zzc(t, j));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 63:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zza(i11, zzc(t, j));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 64:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zzd(i11, (int) r9);
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 65:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zzc(i11, 0L);
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 66:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zze(i11, zzc(t, j));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 67:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zzd(i11, zzd(t, j));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                case 68:
                    if (zzc((zzako<T>) t, i11, i7)) {
                        iZza = zzaii.zza(i11, (zzakk) unsafe.getObject(t, j), zze(i7));
                        z = r9;
                        i8 += iZza;
                        break;
                    }
                    z = r9;
                    break;
                default:
                    z = r9;
                    break;
            }
            i7 += 3;
            i6 = i2;
            r9 = z;
            i9 = i3;
            i5 = 1048575;
        }
        int iZza2 = r9;
        zzamb<?, ?> zzambVar = this.zzq;
        int iZza3 = i8 + zzambVar.zza((zzamb<?, ?>) zzambVar.zzd(t));
        if (!this.zzh) {
            return iZza3;
        }
        zzais<T> zzaisVarZza = this.zzr.zza(t);
        for (int i15 = iZza2; i15 < zzaisVarZza.zza.zzb(); i15++) {
            Map.Entry entryZzb = zzaisVarZza.zza.zzb(i15);
            iZza2 += zzais.zza((zzaiu<?>) entryZzb.getKey(), entryZzb.getValue());
        }
        for (Map.Entry entry : zzaisVarZza.zza.zzc()) {
            iZza2 += zzais.zza((zzaiu<?>) entry.getKey(), entry.getValue());
        }
        return iZza3 + iZza2;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01c2  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(T t) {
        int i2;
        int iZza;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzc = zzc(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & iZzc;
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    iZza = zzajc.zza(Double.doubleToLongBits(zzamh.zza(t, j)));
                    i3 = i2 + iZza;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iZza = Float.floatToIntBits(zzamh.zzb(t, j));
                    i3 = i2 + iZza;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iZza = zzajc.zza(zzamh.zzd(t, j));
                    i3 = i2 + iZza;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iZza = zzajc.zza(zzamh.zzd(t, j));
                    i3 = i2 + iZza;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iZza = zzamh.zzc(t, j);
                    i3 = i2 + iZza;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iZza = zzajc.zza(zzamh.zzd(t, j));
                    i3 = i2 + iZza;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iZza = zzamh.zzc(t, j);
                    i3 = i2 + iZza;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iZza = zzajc.zza(zzamh.zzh(t, j));
                    i3 = i2 + iZza;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iZza = ((String) zzamh.zze(t, j)).hashCode();
                    i3 = i2 + iZza;
                    break;
                case 9:
                    Object objZze = zzamh.zze(t, j);
                    iZza = objZze != null ? objZze.hashCode() : 37;
                    i2 = i3 * 53;
                    i3 = i2 + iZza;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iZza = zzamh.zze(t, j).hashCode();
                    i3 = i2 + iZza;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iZza = zzamh.zzc(t, j);
                    i3 = i2 + iZza;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iZza = zzamh.zzc(t, j);
                    i3 = i2 + iZza;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iZza = zzamh.zzc(t, j);
                    i3 = i2 + iZza;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iZza = zzajc.zza(zzamh.zzd(t, j));
                    i3 = i2 + iZza;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iZza = zzamh.zzc(t, j);
                    i3 = i2 + iZza;
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    i2 = i3 * 53;
                    iZza = zzajc.zza(zzamh.zzd(t, j));
                    i3 = i2 + iZza;
                    break;
                case 17:
                    Object objZze2 = zzamh.zze(t, j);
                    if (objZze2 != null) {
                        iZza = objZze2.hashCode();
                    }
                    i2 = i3 * 53;
                    i3 = i2 + iZza;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                case 28:
                case 29:
                case 30:
                case 31:
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    iZza = zzamh.zze(t, j).hashCode();
                    i3 = i2 + iZza;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iZza = zzamh.zze(t, j).hashCode();
                    i3 = i2 + iZza;
                    break;
                case 51:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzajc.zza(Double.doubleToLongBits(zza(t, j)));
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = Float.floatToIntBits(zzb(t, j));
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzajc.zza(zzd(t, j));
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzajc.zza(zzd(t, j));
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzc(t, j);
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzajc.zza(zzd(t, j));
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzc(t, j);
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzajc.zza(zze(t, j));
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = ((String) zzamh.zze(t, j)).hashCode();
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzamh.zze(t, j).hashCode();
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzamh.zze(t, j).hashCode();
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzc(t, j);
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzc(t, j);
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzc(t, j);
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzajc.zza(zzd(t, j));
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzc(t, j);
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzajc.zza(zzd(t, j));
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzako<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza = zzamh.zze(t, j).hashCode();
                        i3 = i2 + iZza;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode = (i3 * 53) + this.zzq.zzd(t).hashCode();
        return this.zzh ? (iHashCode * 53) + this.zzr.zza(t).hashCode() : iHashCode;
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzamh.zze(t, j)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x05d4, code lost:
    
        r9 = r36;
        r8 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0a30, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzajj.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0d43, code lost:
    
        if (r14 == 1048575) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0d45, code lost:
    
        r28.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d4b, code lost:
    
        r10 = r31.zzm;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0d52, code lost:
    
        if (r10 >= r31.zzn) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0d54, code lost:
    
        r3 = (com.google.android.gms.internal.p000firebaseauthapi.zzame) zza((java.lang.Object) r32, r31.zzl[r10], (int) r3, (com.google.android.gms.internal.p000firebaseauthapi.zzamb<UT, int>) r31.zzq, (java.lang.Object) r32);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0d6a, code lost:
    
        if (r3 == null) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0d6c, code lost:
    
        r31.zzq.zzb((java.lang.Object) r7, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0d71, code lost:
    
        if (r9 != 0) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0d75, code lost:
    
        if (r8 != r35) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0d7c, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzajj.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0d7f, code lost:
    
        if (r8 > r35) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0d81, code lost:
    
        if (r11 != r9) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0d83, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0d88, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzajj.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0cc7  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0cd5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x004f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v133, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zza(T t, byte[] bArr, int i2, int i3, int i4, zzahl zzahlVar) throws IOException {
        Unsafe unsafe;
        int i5;
        int i6;
        int iZza;
        int i7;
        int i8;
        int i9;
        zzahl zzahlVar2;
        int i10;
        int i11;
        int iZza2;
        zzaip zzaipVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe2;
        int i18;
        zzahl zzahlVar3;
        int i19;
        Unsafe unsafe3;
        int i20;
        int i21;
        int i22;
        int iZzd;
        int i23;
        int i24;
        Unsafe unsafe4;
        int i25;
        int iZzd2;
        int i26;
        int i27;
        int iZzd3;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        zzahl zzahlVar4;
        Unsafe unsafe5;
        int i35;
        Object obj;
        int i36;
        int i37;
        int i38;
        Unsafe unsafe6;
        int iZzc;
        int i39;
        int i40;
        int i41;
        int i42;
        Unsafe unsafe7;
        Object obj2;
        int i43;
        zzajg zzajgVar;
        int iZza3;
        int i44;
        int i45;
        int i46;
        int iZzd4;
        zzahl zzahlVar5;
        int i47;
        int i48;
        int i49;
        zzahl zzahlVar6;
        int i50;
        int i51;
        int i52;
        zzahl zzahlVar7;
        int i53;
        int i54;
        int i55;
        int i56;
        Unsafe unsafe8;
        int i57;
        Object obj3;
        int i58;
        int i59;
        T t2 = t;
        int i60 = i3;
        int i61 = i4;
        zzahl zzahlVar8 = zzahlVar;
        zzf(t);
        Unsafe unsafe9 = zzb;
        int iZza4 = i2;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = -1;
        int i66 = 1048575;
        while (true) {
            if (iZza4 < i60) {
                int iZzc2 = iZza4 + 1;
                int i67 = bArr[iZza4];
                if (i67 < 0) {
                    int iZza5 = zzahi.zza(i67, bArr, iZzc2, zzahlVar8);
                    i6 = zzahlVar8.zza;
                    iZzc2 = iZza5;
                } else {
                    i6 = i67;
                }
                int i68 = i6 >>> 3;
                int i69 = i6 & 7;
                if (i68 > i65) {
                    int i70 = i62 / 3;
                    if (i68 >= this.zze && i68 <= this.zzf) {
                        iZza = zza(i68, i70);
                    } else {
                        i8 = -1;
                        i7 = -1;
                        if (i7 != i8) {
                            unsafe = unsafe9;
                            i9 = i68;
                            i62 = 0;
                            i5 = i61;
                            zzahlVar2 = zzahlVar8;
                        } else {
                            int[] iArr = this.zzc;
                            int i71 = iArr[i7 + 1];
                            int i72 = (i71 & 267386880) >>> 20;
                            long j = i71 & 1048575;
                            if (i72 <= 17) {
                                int i73 = iArr[i7 + 2];
                                int i74 = 1 << (i73 >>> 20);
                                int i75 = 1048575;
                                int i76 = i73 & 1048575;
                                if (i76 != i66) {
                                    i12 = i7;
                                    if (i66 != 1048575) {
                                        unsafe9.putInt(t2, i66, i64);
                                        i75 = 1048575;
                                    }
                                    i14 = i76;
                                    i13 = i76 == i75 ? 0 : unsafe9.getInt(t2, i76);
                                } else {
                                    i12 = i7;
                                    i13 = i64;
                                    i14 = i66;
                                }
                                switch (i72) {
                                    case 0:
                                        i15 = i4;
                                        i16 = i6;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        i25 = i12;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 1) {
                                            zzamh.zza(t2, j, zzahi.zza(bArr, iZzc2));
                                            iZzd2 = iZzc2 + 8;
                                            i26 = i13 | i74;
                                            i13 = i26;
                                            iZzd3 = iZzd2;
                                            iZza4 = iZzd3;
                                            i62 = i25;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i11 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                            break;
                                        }
                                        i62 = i25;
                                        zzahlVar2 = zzahlVar3;
                                        i10 = iZzc2;
                                        unsafe = unsafe2;
                                        i5 = i15;
                                        i63 = i16;
                                        i9 = i18;
                                        i64 = i13;
                                        i66 = i14;
                                        if (i63 != i5 && i5 != 0) {
                                            iZza4 = i10;
                                            break;
                                        } else {
                                            if (this.zzh && (zzaipVar = zzahlVar2.zzd) != zzaip.zza) {
                                                if (zzaipVar.zza(this.zzg, i9) == null) {
                                                    i11 = i9;
                                                    iZza2 = zzahi.zza(i63, bArr, i10, i3, zze(t), zzahlVar);
                                                } else {
                                                    zzaja.zzd zzdVar = (zzaja.zzd) t2;
                                                    zzdVar.zza();
                                                    zzais<zzaja.zzc> zzaisVar = zzdVar.zzc;
                                                    throw new NoSuchMethodError();
                                                }
                                            } else {
                                                i11 = i9;
                                                iZza2 = zzahi.zza(i63, bArr, i10, i3, zze(t), zzahlVar);
                                            }
                                            iZza4 = iZza2;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                        }
                                        break;
                                    case 1:
                                        i15 = i4;
                                        i16 = i6;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        i25 = i12;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 5) {
                                            zzamh.zza((Object) t2, j, zzahi.zzb(bArr, iZzc2));
                                            iZzd2 = iZzc2 + 4;
                                            i26 = i13 | i74;
                                            i13 = i26;
                                            iZzd3 = iZzd2;
                                            iZza4 = iZzd3;
                                            i62 = i25;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i11 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                            break;
                                        }
                                        i62 = i25;
                                        zzahlVar2 = zzahlVar3;
                                        i10 = iZzc2;
                                        unsafe = unsafe2;
                                        i5 = i15;
                                        i63 = i16;
                                        i9 = i18;
                                        i64 = i13;
                                        i66 = i14;
                                        if (i63 != i5) {
                                        }
                                        if (this.zzh) {
                                            i11 = i9;
                                            iZza2 = zzahi.zza(i63, bArr, i10, i3, zze(t), zzahlVar);
                                            iZza4 = iZza2;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                            break;
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                        i15 = i4;
                                        i16 = i6;
                                        i27 = i12;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 0) {
                                            iZzd2 = zzahi.zzd(bArr, iZzc2, zzahlVar3);
                                            unsafe2.putLong(t, j, zzahlVar3.zzb);
                                            i13 |= i74;
                                            i25 = i27;
                                            iZzd3 = iZzd2;
                                            iZza4 = iZzd3;
                                            i62 = i25;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i11 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                            break;
                                        }
                                        i25 = i27;
                                        i62 = i25;
                                        zzahlVar2 = zzahlVar3;
                                        i10 = iZzc2;
                                        unsafe = unsafe2;
                                        i5 = i15;
                                        i63 = i16;
                                        i9 = i18;
                                        i64 = i13;
                                        i66 = i14;
                                        if (i63 != i5) {
                                        }
                                        if (this.zzh) {
                                        }
                                        break;
                                    case 4:
                                    case 11:
                                        i15 = i4;
                                        i16 = i6;
                                        i27 = i12;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 0) {
                                            iZzd2 = zzahi.zzc(bArr, iZzc2, zzahlVar3);
                                            unsafe2.putInt(t2, j, zzahlVar3.zza);
                                            i26 = i13 | i74;
                                            i25 = i27;
                                            i13 = i26;
                                            iZzd3 = iZzd2;
                                            iZza4 = iZzd3;
                                            i62 = i25;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i11 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                            break;
                                        }
                                        i25 = i27;
                                        i62 = i25;
                                        zzahlVar2 = zzahlVar3;
                                        i10 = iZzc2;
                                        unsafe = unsafe2;
                                        i5 = i15;
                                        i63 = i16;
                                        i9 = i18;
                                        i64 = i13;
                                        i66 = i14;
                                        if (i63 != i5) {
                                        }
                                        if (this.zzh) {
                                        }
                                        break;
                                    case 5:
                                    case 14:
                                        i15 = i4;
                                        i16 = i6;
                                        i27 = i12;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 1) {
                                            unsafe2.putLong(t, j, zzahi.zzd(bArr, iZzc2));
                                            iZzd2 = iZzc2 + 8;
                                            i27 = i27;
                                            i26 = i13 | i74;
                                            i25 = i27;
                                            i13 = i26;
                                            iZzd3 = iZzd2;
                                            iZza4 = iZzd3;
                                            i62 = i25;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i11 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                            break;
                                        }
                                        i25 = i27;
                                        i62 = i25;
                                        zzahlVar2 = zzahlVar3;
                                        i10 = iZzc2;
                                        unsafe = unsafe2;
                                        i5 = i15;
                                        i63 = i16;
                                        i9 = i18;
                                        i64 = i13;
                                        i66 = i14;
                                        if (i63 != i5) {
                                        }
                                        if (this.zzh) {
                                        }
                                        break;
                                    case 6:
                                    case 13:
                                        i15 = i4;
                                        i16 = i6;
                                        i17 = i12;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 5) {
                                            unsafe2.putInt(t2, j, zzahi.zzc(bArr, iZzc2));
                                            i64 = i13 | i74;
                                            i19 = i17;
                                            zzahlVar8 = zzahlVar3;
                                            iZza4 = iZzc2 + 4;
                                            unsafe3 = unsafe2;
                                            i20 = i16;
                                            i66 = i14;
                                            i61 = i4;
                                            i62 = i19;
                                            i63 = i20;
                                            i65 = i18;
                                            i60 = i3;
                                            unsafe9 = unsafe3;
                                            break;
                                        } else {
                                            i25 = i17;
                                            i62 = i25;
                                            zzahlVar2 = zzahlVar3;
                                            i10 = iZzc2;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i9 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            if (i63 != i5) {
                                            }
                                            if (this.zzh) {
                                            }
                                        }
                                        break;
                                    case 7:
                                        i15 = i4;
                                        i16 = i6;
                                        i17 = i12;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 0) {
                                            iZzd3 = zzahi.zzd(bArr, iZzc2, zzahlVar3);
                                            zzamh.zzc(t2, j, zzahlVar3.zzb != 0);
                                            i28 = i13 | i74;
                                            i13 = i28;
                                            i25 = i17;
                                            iZza4 = iZzd3;
                                            i62 = i25;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i11 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                            break;
                                        }
                                        i25 = i17;
                                        i62 = i25;
                                        zzahlVar2 = zzahlVar3;
                                        i10 = iZzc2;
                                        unsafe = unsafe2;
                                        i5 = i15;
                                        i63 = i16;
                                        i9 = i18;
                                        i64 = i13;
                                        i66 = i14;
                                        if (i63 != i5) {
                                        }
                                        if (this.zzh) {
                                        }
                                        break;
                                    case 8:
                                        i15 = i4;
                                        i16 = i6;
                                        i17 = i12;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 2) {
                                            if (zzg(i71)) {
                                                iZzd3 = zzahi.zzb(bArr, iZzc2, zzahlVar3);
                                            } else {
                                                iZzd3 = zzahi.zzc(bArr, iZzc2, zzahlVar3);
                                                int i77 = zzahlVar3.zza;
                                                if (i77 < 0) {
                                                    throw zzajj.zzf();
                                                }
                                                if (i77 == 0) {
                                                    zzahlVar3.zzc = "";
                                                } else {
                                                    zzahlVar3.zzc = new String(bArr, iZzd3, i77, zzajc.zza);
                                                    iZzd3 += i77;
                                                }
                                            }
                                            unsafe2.putObject(t2, j, zzahlVar3.zzc);
                                            i28 = i13 | i74;
                                            i13 = i28;
                                            i25 = i17;
                                            iZza4 = iZzd3;
                                            i62 = i25;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i11 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                            break;
                                        }
                                        i25 = i17;
                                        i62 = i25;
                                        zzahlVar2 = zzahlVar3;
                                        i10 = iZzc2;
                                        unsafe = unsafe2;
                                        i5 = i15;
                                        i63 = i16;
                                        i9 = i18;
                                        i64 = i13;
                                        i66 = i14;
                                        if (i63 != i5) {
                                        }
                                        if (this.zzh) {
                                        }
                                        break;
                                    case 9:
                                        i15 = i4;
                                        i18 = i68;
                                        i22 = i6;
                                        i21 = i12;
                                        zzahlVar3 = zzahlVar;
                                        unsafe2 = unsafe9;
                                        if (i69 == 2) {
                                            Object objZza = zza((zzako<T>) t2, i21);
                                            i16 = i22;
                                            iZzd3 = zzahi.zza(objZza, zze(i21), bArr, iZzc2, i3, zzahlVar);
                                            zza((zzako<T>) t2, i21, objZza);
                                            i28 = i13 | i74;
                                            i17 = i21;
                                            i13 = i28;
                                            i25 = i17;
                                            iZza4 = iZzd3;
                                            i62 = i25;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i11 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            i60 = i3;
                                            zzahlVar8 = zzahlVar;
                                            i61 = i5;
                                            i65 = i11;
                                            unsafe9 = unsafe;
                                            break;
                                        }
                                        i16 = i22;
                                        i25 = i21;
                                        i62 = i25;
                                        zzahlVar2 = zzahlVar3;
                                        i10 = iZzc2;
                                        unsafe = unsafe2;
                                        i5 = i15;
                                        i63 = i16;
                                        i9 = i18;
                                        i64 = i13;
                                        i66 = i14;
                                        if (i63 != i5) {
                                        }
                                        if (this.zzh) {
                                        }
                                        break;
                                    case 10:
                                        i29 = i3;
                                        i15 = i4;
                                        i22 = i6;
                                        i21 = i12;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 2) {
                                            iZzd3 = zzahi.zza(bArr, iZzc2, zzahlVar3);
                                            unsafe2.putObject(t2, j, zzahlVar3.zzc);
                                            i63 = i22;
                                            i62 = i21;
                                            zzahlVar8 = zzahlVar3;
                                            unsafe9 = unsafe2;
                                            i60 = i29;
                                            i61 = i15;
                                            i65 = i18;
                                            i66 = i14;
                                            iZza4 = iZzd3;
                                            i64 = i13 | i74;
                                            break;
                                        } else {
                                            i16 = i22;
                                            i25 = i21;
                                            i62 = i25;
                                            zzahlVar2 = zzahlVar3;
                                            i10 = iZzc2;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i9 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            if (i63 != i5) {
                                            }
                                            if (this.zzh) {
                                            }
                                        }
                                        break;
                                    case 12:
                                        i29 = i3;
                                        i15 = i4;
                                        i16 = i6;
                                        i30 = i12;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 0) {
                                            iZzd3 = zzahi.zzc(bArr, iZzc2, zzahlVar3);
                                            int i78 = zzahlVar3.zza;
                                            i21 = i30;
                                            zzajh zzajhVarZzd = zzd(i21);
                                            if ((i71 & Integer.MIN_VALUE) == 0 || zzajhVarZzd == null || zzajhVarZzd.zza(i78)) {
                                                i22 = i16;
                                                unsafe2.putInt(t2, j, i78);
                                                i63 = i22;
                                                i62 = i21;
                                                zzahlVar8 = zzahlVar3;
                                                unsafe9 = unsafe2;
                                                i60 = i29;
                                                i61 = i15;
                                                i65 = i18;
                                                i66 = i14;
                                                iZza4 = iZzd3;
                                                i64 = i13 | i74;
                                                break;
                                            } else {
                                                zze(t).zza(i16, Long.valueOf(i78));
                                                i25 = i21;
                                                iZza4 = iZzd3;
                                                i62 = i25;
                                                unsafe = unsafe2;
                                                i5 = i15;
                                                i63 = i16;
                                                i11 = i18;
                                                i64 = i13;
                                                i66 = i14;
                                                i60 = i3;
                                                zzahlVar8 = zzahlVar;
                                                i61 = i5;
                                                i65 = i11;
                                                unsafe9 = unsafe;
                                                break;
                                            }
                                        } else {
                                            i22 = i16;
                                            i21 = i30;
                                            i16 = i22;
                                            i25 = i21;
                                            i62 = i25;
                                            zzahlVar2 = zzahlVar3;
                                            i10 = iZzc2;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i9 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            if (i63 != i5) {
                                            }
                                            if (this.zzh) {
                                            }
                                        }
                                        break;
                                    case 15:
                                        i29 = i3;
                                        i15 = i4;
                                        i16 = i6;
                                        i30 = i12;
                                        unsafe2 = unsafe9;
                                        i18 = i68;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 0) {
                                            iZzd3 = zzahi.zzc(bArr, iZzc2, zzahlVar3);
                                            unsafe2.putInt(t2, j, zzaib.zze(zzahlVar3.zza));
                                            i22 = i16;
                                            i21 = i30;
                                            i63 = i22;
                                            i62 = i21;
                                            zzahlVar8 = zzahlVar3;
                                            unsafe9 = unsafe2;
                                            i60 = i29;
                                            i61 = i15;
                                            i65 = i18;
                                            i66 = i14;
                                            iZza4 = iZzd3;
                                            i64 = i13 | i74;
                                            break;
                                        } else {
                                            i22 = i16;
                                            i21 = i30;
                                            i16 = i22;
                                            i25 = i21;
                                            i62 = i25;
                                            zzahlVar2 = zzahlVar3;
                                            i10 = iZzc2;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i9 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            if (i63 != i5) {
                                            }
                                            if (this.zzh) {
                                            }
                                        }
                                        break;
                                    case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                                        int i79 = i12;
                                        zzahlVar3 = zzahlVar;
                                        if (i69 == 0) {
                                            iZzd = zzahi.zzd(bArr, iZzc2, zzahlVar3);
                                            i23 = i79;
                                            i24 = i6;
                                            unsafe4 = unsafe9;
                                            i18 = i68;
                                            unsafe9.putLong(t, j, zzaib.zza(zzahlVar3.zzb));
                                            i64 = i13 | i74;
                                            zzahlVar8 = zzahlVar3;
                                            iZza4 = iZzd;
                                            unsafe3 = unsafe4;
                                            i20 = i24;
                                            i66 = i14;
                                            i19 = i23;
                                            i61 = i4;
                                            i62 = i19;
                                            i63 = i20;
                                            i65 = i18;
                                            i60 = i3;
                                            unsafe9 = unsafe3;
                                            break;
                                        } else {
                                            i18 = i68;
                                            int i80 = i6;
                                            unsafe2 = unsafe9;
                                            i15 = i4;
                                            i21 = i79;
                                            i22 = i80;
                                            i16 = i22;
                                            i25 = i21;
                                            i62 = i25;
                                            zzahlVar2 = zzahlVar3;
                                            i10 = iZzc2;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i9 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            if (i63 != i5) {
                                            }
                                            if (this.zzh) {
                                            }
                                        }
                                        break;
                                    case 17:
                                        if (i69 == 3) {
                                            int i81 = i12;
                                            Object objZza2 = zza((zzako<T>) t2, i81);
                                            int iZza6 = zzahi.zza(objZza2, zze(i81), bArr, iZzc2, i3, (i68 << 3) | 4, zzahlVar);
                                            zza((zzako<T>) t2, i81, objZza2);
                                            i24 = i6;
                                            i64 = i13 | i74;
                                            i23 = i81;
                                            unsafe4 = unsafe9;
                                            i18 = i68;
                                            iZzd = iZza6;
                                            zzahlVar3 = zzahlVar;
                                            zzahlVar8 = zzahlVar3;
                                            iZza4 = iZzd;
                                            unsafe3 = unsafe4;
                                            i20 = i24;
                                            i66 = i14;
                                            i19 = i23;
                                            i61 = i4;
                                            i62 = i19;
                                            i63 = i20;
                                            i65 = i18;
                                            i60 = i3;
                                            unsafe9 = unsafe3;
                                            break;
                                        } else {
                                            i15 = i4;
                                            i18 = i68;
                                            i16 = i6;
                                            zzahlVar3 = zzahlVar;
                                            unsafe2 = unsafe9;
                                            i25 = i12;
                                            i62 = i25;
                                            zzahlVar2 = zzahlVar3;
                                            i10 = iZzc2;
                                            unsafe = unsafe2;
                                            i5 = i15;
                                            i63 = i16;
                                            i9 = i18;
                                            i64 = i13;
                                            i66 = i14;
                                            if (i63 != i5) {
                                            }
                                            if (this.zzh) {
                                            }
                                        }
                                        break;
                                    default:
                                        i15 = i4;
                                        i18 = i68;
                                        i16 = i6;
                                        zzahlVar3 = zzahlVar;
                                        unsafe2 = unsafe9;
                                        i25 = i12;
                                        i62 = i25;
                                        zzahlVar2 = zzahlVar3;
                                        i10 = iZzc2;
                                        unsafe = unsafe2;
                                        i5 = i15;
                                        i63 = i16;
                                        i9 = i18;
                                        i64 = i13;
                                        i66 = i14;
                                        if (i63 != i5) {
                                        }
                                        if (this.zzh) {
                                        }
                                        break;
                                }
                            } else {
                                int i82 = i6;
                                Unsafe unsafe10 = unsafe9;
                                i18 = i68;
                                i19 = i7;
                                if (i72 != 27) {
                                    i31 = i66;
                                    zzahlVar4 = zzahlVar;
                                    i32 = i64;
                                    if (i72 > 49) {
                                        int i83 = iZzc2;
                                        int i84 = i82;
                                        Unsafe unsafe11 = unsafe10;
                                        if (i72 != 50) {
                                            int i85 = i84;
                                            t2 = t;
                                            Unsafe unsafe12 = zzb;
                                            long j2 = iArr[i19 + 2] & 1048575;
                                            switch (i72) {
                                                case 51:
                                                    i45 = i19;
                                                    zzahlVar2 = zzahlVar4;
                                                    i9 = i18;
                                                    unsafe = unsafe11;
                                                    i46 = i83;
                                                    if (i69 == 1) {
                                                        unsafe12.putObject(t2, j, Double.valueOf(zzahi.zza(bArr, i46)));
                                                        iZzd4 = i46 + 8;
                                                        unsafe12.putInt(t2, j2, i9);
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                            i5 = i4;
                                                            i11 = i9;
                                                            i64 = i32;
                                                            i44 = i85;
                                                            i66 = i31;
                                                            i62 = i45;
                                                            int i86 = iZzc2;
                                                            i63 = i44;
                                                            iZza2 = i86;
                                                            iZza4 = iZza2;
                                                            break;
                                                        } else {
                                                            i64 = i32;
                                                            i6 = i85;
                                                            i66 = i31;
                                                            i62 = i45;
                                                            i5 = i4;
                                                            break;
                                                        }
                                                    }
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                case 52:
                                                    i45 = i19;
                                                    zzahlVar2 = zzahlVar4;
                                                    i9 = i18;
                                                    unsafe = unsafe11;
                                                    i46 = i83;
                                                    if (i69 == 5) {
                                                        unsafe12.putObject(t2, j, Float.valueOf(zzahi.zzb(bArr, i46)));
                                                        iZzd4 = i46 + 4;
                                                        unsafe12.putInt(t2, j2, i9);
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 53:
                                                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                                                    i45 = i19;
                                                    zzahlVar2 = zzahlVar4;
                                                    i9 = i18;
                                                    unsafe = unsafe11;
                                                    i46 = i83;
                                                    if (i69 == 0) {
                                                        iZzd4 = zzahi.zzd(bArr, i46, zzahlVar2);
                                                        unsafe12.putObject(t2, j, Long.valueOf(zzahlVar2.zzb));
                                                        unsafe12.putInt(t2, j2, i9);
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 55:
                                                case 62:
                                                    i45 = i19;
                                                    zzahlVar2 = zzahlVar4;
                                                    i9 = i18;
                                                    unsafe = unsafe11;
                                                    i46 = i83;
                                                    if (i69 == 0) {
                                                        iZzd4 = zzahi.zzc(bArr, i46, zzahlVar2);
                                                        unsafe12.putObject(t2, j, Integer.valueOf(zzahlVar2.zza));
                                                        unsafe12.putInt(t2, j2, i9);
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    i45 = i19;
                                                    zzahlVar2 = zzahlVar4;
                                                    i9 = i18;
                                                    unsafe = unsafe11;
                                                    i46 = i83;
                                                    if (i69 == 1) {
                                                        unsafe12.putObject(t2, j, Long.valueOf(zzahi.zzd(bArr, i46)));
                                                        iZzd4 = i46 + 8;
                                                        unsafe12.putInt(t2, j2, i9);
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    i45 = i19;
                                                    zzahlVar2 = zzahlVar4;
                                                    i9 = i18;
                                                    unsafe = unsafe11;
                                                    i46 = i83;
                                                    if (i69 == 5) {
                                                        unsafe12.putObject(t2, j, Integer.valueOf(zzahi.zzc(bArr, i46)));
                                                        iZzd4 = i46 + 4;
                                                        unsafe12.putInt(t2, j2, i9);
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 58:
                                                    i45 = i19;
                                                    zzahlVar2 = zzahlVar4;
                                                    i9 = i18;
                                                    unsafe = unsafe11;
                                                    i46 = i83;
                                                    if (i69 == 0) {
                                                        iZzd4 = zzahi.zzd(bArr, i46, zzahlVar2);
                                                        unsafe12.putObject(t2, j, Boolean.valueOf(zzahlVar2.zzb != 0));
                                                        unsafe12.putInt(t2, j2, i9);
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 59:
                                                    i45 = i19;
                                                    zzahlVar2 = zzahlVar4;
                                                    i9 = i18;
                                                    unsafe = unsafe11;
                                                    i46 = i83;
                                                    if (i69 == 2) {
                                                        iZzd4 = zzahi.zzc(bArr, i46, zzahlVar2);
                                                        int i87 = zzahlVar2.zza;
                                                        if (i87 == 0) {
                                                            unsafe12.putObject(t2, j, "");
                                                        } else {
                                                            if ((i71 & 536870912) != 0 && !zzaml.zzc(bArr, iZzd4, iZzd4 + i87)) {
                                                                throw zzajj.zzd();
                                                            }
                                                            unsafe12.putObject(t2, j, new String(bArr, iZzd4, i87, zzajc.zza));
                                                            iZzd4 += i87;
                                                        }
                                                        unsafe12.putInt(t2, j2, i9);
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 60:
                                                    zzahlVar5 = zzahlVar4;
                                                    i47 = i85;
                                                    i48 = i83;
                                                    i49 = i18;
                                                    unsafe = unsafe11;
                                                    if (i69 == 2) {
                                                        Object objZza3 = zza((zzako<T>) t2, i49, i19);
                                                        zzahlVar6 = zzahlVar5;
                                                        i50 = i48;
                                                        i51 = i49;
                                                        i52 = i19;
                                                        iZzd4 = zzahi.zza(objZza3, zze(i19), bArr, i50, i3, zzahlVar);
                                                        zza((zzako<T>) t2, i51, i52, objZza3);
                                                        i85 = i47;
                                                        zzahlVar2 = zzahlVar6;
                                                        i46 = i50;
                                                        i9 = i51;
                                                        i45 = i52;
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    zzahlVar7 = zzahlVar5;
                                                    i53 = i48;
                                                    i54 = i49;
                                                    i55 = i19;
                                                    i85 = i47;
                                                    zzahlVar2 = zzahlVar7;
                                                    i46 = i53;
                                                    i9 = i54;
                                                    i45 = i55;
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 61:
                                                    i47 = i85;
                                                    i49 = i18;
                                                    unsafe = unsafe11;
                                                    zzahlVar5 = zzahlVar4;
                                                    i48 = i83;
                                                    if (i69 == 2) {
                                                        iZzd4 = zzahi.zza(bArr, i48, zzahlVar5);
                                                        unsafe12.putObject(t2, j, zzahlVar5.zzc);
                                                        unsafe12.putInt(t2, j2, i49);
                                                        zzahlVar6 = zzahlVar5;
                                                        i50 = i48;
                                                        i51 = i49;
                                                        i52 = i19;
                                                        i85 = i47;
                                                        zzahlVar2 = zzahlVar6;
                                                        i46 = i50;
                                                        i9 = i51;
                                                        i45 = i52;
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    zzahlVar7 = zzahlVar5;
                                                    i53 = i48;
                                                    i54 = i49;
                                                    i55 = i19;
                                                    i85 = i47;
                                                    zzahlVar2 = zzahlVar7;
                                                    i46 = i53;
                                                    i9 = i54;
                                                    i45 = i55;
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 63:
                                                    i49 = i18;
                                                    unsafe = unsafe11;
                                                    zzahlVar5 = zzahlVar4;
                                                    i48 = i83;
                                                    if (i69 == 0) {
                                                        iZzd4 = zzahi.zzc(bArr, i48, zzahlVar5);
                                                        int i88 = zzahlVar5.zza;
                                                        zzajh zzajhVarZzd2 = zzd(i19);
                                                        if (zzajhVarZzd2 == null || zzajhVarZzd2.zza(i88)) {
                                                            i47 = i85;
                                                            unsafe12.putObject(t2, j, Integer.valueOf(i88));
                                                            unsafe12.putInt(t2, j2, i49);
                                                        } else {
                                                            i47 = i85;
                                                            zze(t).zza(i47, Long.valueOf(i88));
                                                        }
                                                        zzahlVar6 = zzahlVar5;
                                                        i50 = i48;
                                                        i51 = i49;
                                                        i52 = i19;
                                                        i85 = i47;
                                                        zzahlVar2 = zzahlVar6;
                                                        i46 = i50;
                                                        i9 = i51;
                                                        i45 = i52;
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    } else {
                                                        i47 = i85;
                                                        zzahlVar7 = zzahlVar5;
                                                        i53 = i48;
                                                        i54 = i49;
                                                        i55 = i19;
                                                        i85 = i47;
                                                        zzahlVar2 = zzahlVar7;
                                                        i46 = i53;
                                                        i9 = i54;
                                                        i45 = i55;
                                                        iZzc2 = i46;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    break;
                                                case 66:
                                                    i49 = i18;
                                                    unsafe = unsafe11;
                                                    zzahlVar5 = zzahlVar4;
                                                    i48 = i83;
                                                    if (i69 == 0) {
                                                        iZzd4 = zzahi.zzc(bArr, i48, zzahlVar5);
                                                        unsafe12.putObject(t2, j, Integer.valueOf(zzaib.zze(zzahlVar5.zza)));
                                                        unsafe12.putInt(t2, j2, i49);
                                                        i47 = i85;
                                                        zzahlVar6 = zzahlVar5;
                                                        i50 = i48;
                                                        i51 = i49;
                                                        i52 = i19;
                                                        i85 = i47;
                                                        zzahlVar2 = zzahlVar6;
                                                        i46 = i50;
                                                        i9 = i51;
                                                        i45 = i52;
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    } else {
                                                        zzahlVar7 = zzahlVar5;
                                                        i53 = i48;
                                                        i54 = i49;
                                                        i55 = i19;
                                                        i47 = i85;
                                                        i85 = i47;
                                                        zzahlVar2 = zzahlVar7;
                                                        i46 = i53;
                                                        i9 = i54;
                                                        i45 = i55;
                                                        iZzc2 = i46;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    break;
                                                case 67:
                                                    i47 = i85;
                                                    i49 = i18;
                                                    unsafe = unsafe11;
                                                    zzahlVar5 = zzahlVar4;
                                                    i48 = i83;
                                                    if (i69 == 0) {
                                                        iZzd4 = zzahi.zzd(bArr, i48, zzahlVar5);
                                                        i85 = i47;
                                                        unsafe12.putObject(t2, j, Long.valueOf(zzaib.zza(zzahlVar5.zzb)));
                                                        unsafe12.putInt(t2, j2, i49);
                                                        i47 = i85;
                                                        zzahlVar6 = zzahlVar5;
                                                        i50 = i48;
                                                        i51 = i49;
                                                        i52 = i19;
                                                        i85 = i47;
                                                        zzahlVar2 = zzahlVar6;
                                                        i46 = i50;
                                                        i9 = i51;
                                                        i45 = i52;
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    zzahlVar7 = zzahlVar5;
                                                    i53 = i48;
                                                    i54 = i49;
                                                    i55 = i19;
                                                    i85 = i47;
                                                    zzahlVar2 = zzahlVar7;
                                                    i46 = i53;
                                                    i9 = i54;
                                                    i45 = i55;
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                                case 68:
                                                    if (i69 == 3) {
                                                        Object objZza4 = zza((zzako<T>) t2, i18, i19);
                                                        unsafe = unsafe11;
                                                        int iZza7 = zzahi.zza(objZza4, zze(i19), bArr, i83, i3, (i85 & (-8)) | 4, zzahlVar);
                                                        zza((zzako<T>) t2, i18, i19, objZza4);
                                                        zzahlVar6 = zzahlVar4;
                                                        i50 = i83;
                                                        i51 = i18;
                                                        i52 = i19;
                                                        iZzd4 = iZza7;
                                                        i47 = i85;
                                                        i85 = i47;
                                                        zzahlVar2 = zzahlVar6;
                                                        i46 = i50;
                                                        i9 = i51;
                                                        i45 = i52;
                                                        iZzc2 = iZzd4;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    } else {
                                                        unsafe = unsafe11;
                                                        i45 = i19;
                                                        zzahlVar2 = zzahlVar4;
                                                        i46 = i83;
                                                        i9 = i18;
                                                        iZzc2 = i46;
                                                        if (iZzc2 != i46) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    i45 = i19;
                                                    zzahlVar2 = zzahlVar4;
                                                    i46 = i83;
                                                    i9 = i18;
                                                    unsafe = unsafe11;
                                                    iZzc2 = i46;
                                                    if (iZzc2 != i46) {
                                                    }
                                                    break;
                                            }
                                        } else if (i69 == 2) {
                                            Unsafe unsafe13 = zzb;
                                            Object objZzf = zzf(i19);
                                            int i89 = i19;
                                            t2 = t;
                                            Object object = unsafe13.getObject(t2, j);
                                            if (this.zzs.zzf(object)) {
                                                Object objZzb = this.zzs.zzb(objZzf);
                                                this.zzs.zza(objZzb, object);
                                                unsafe13.putObject(t2, j, objZzb);
                                                object = objZzb;
                                            }
                                            zzakf<?, ?> zzakfVarZza = this.zzs.zza(objZzf);
                                            Map<?, ?> mapZze = this.zzs.zze(object);
                                            int iZzc3 = zzahi.zzc(bArr, i83, zzahlVar4);
                                            int i90 = zzahlVar4.zza;
                                            if (i90 >= 0 && i90 <= i3 - iZzc3) {
                                                int i91 = iZzc3 + i90;
                                                Object obj4 = zzakfVarZza.zzb;
                                                Object obj5 = zzakfVarZza.zzd;
                                                Object obj6 = obj4;
                                                while (iZzc3 < i91) {
                                                    int iZza8 = iZzc3 + 1;
                                                    byte b = bArr[iZzc3];
                                                    if (b < 0) {
                                                        iZza8 = zzahi.zza(b, bArr, iZza8, zzahlVar4);
                                                        b = zzahlVar4.zza;
                                                    }
                                                    Object obj7 = obj5;
                                                    int i92 = b >>> 3;
                                                    int i93 = i83;
                                                    int i94 = b & 7;
                                                    Object obj8 = obj6;
                                                    if (i92 == 1) {
                                                        i56 = i89;
                                                        unsafe8 = unsafe11;
                                                        i57 = i93;
                                                        obj3 = obj8;
                                                        i58 = i84;
                                                        i59 = i91;
                                                        if (i94 == zzakfVarZza.zza.zza()) {
                                                            iZzc3 = zza(bArr, iZza8, i3, zzakfVarZza.zza, (Class<?>) null, zzahlVar);
                                                            obj6 = zzahlVar4.zzc;
                                                            obj5 = obj7;
                                                            i91 = i59;
                                                            i83 = i57;
                                                            i84 = i58;
                                                            unsafe11 = unsafe8;
                                                            i89 = i56;
                                                        }
                                                    } else if (i92 == 2) {
                                                        if (i94 == zzakfVarZza.zzc.zza()) {
                                                            unsafe8 = unsafe11;
                                                            i57 = i93;
                                                            i56 = i89;
                                                            obj3 = obj8;
                                                            i58 = i84;
                                                            i59 = i91;
                                                            iZzc3 = zza(bArr, iZza8, i3, zzakfVarZza.zzc, zzakfVarZza.zzd.getClass(), zzahlVar);
                                                            obj5 = zzahlVar4.zzc;
                                                            obj6 = obj3;
                                                            i91 = i59;
                                                            i83 = i57;
                                                            i84 = i58;
                                                            unsafe11 = unsafe8;
                                                            i89 = i56;
                                                        } else {
                                                            i56 = i89;
                                                            unsafe8 = unsafe11;
                                                            i57 = i93;
                                                            obj3 = obj8;
                                                            i58 = i84;
                                                            i59 = i91;
                                                        }
                                                    } else {
                                                        obj5 = obj7;
                                                        i56 = i89;
                                                        unsafe8 = unsafe11;
                                                        i57 = i93;
                                                        obj3 = obj8;
                                                        i58 = i84;
                                                        i59 = i91;
                                                        iZzc3 = zzahi.zza(b, bArr, iZza8, i3, zzahlVar4);
                                                        obj6 = obj3;
                                                        i91 = i59;
                                                        i83 = i57;
                                                        i84 = i58;
                                                        unsafe11 = unsafe8;
                                                        i89 = i56;
                                                    }
                                                    obj5 = obj7;
                                                    iZzc3 = zzahi.zza(b, bArr, iZza8, i3, zzahlVar4);
                                                    obj6 = obj3;
                                                    i91 = i59;
                                                    i83 = i57;
                                                    i84 = i58;
                                                    unsafe11 = unsafe8;
                                                    i89 = i56;
                                                }
                                                i33 = i89;
                                                i34 = i84;
                                                unsafe5 = unsafe11;
                                                int i95 = i83;
                                                Object obj9 = obj6;
                                                int i96 = i91;
                                                if (iZzc3 != i96) {
                                                    throw zzajj.zzg();
                                                }
                                                mapZze.put(obj9, obj5);
                                                if (i96 == i95) {
                                                    i5 = i4;
                                                    i10 = i96;
                                                    zzahlVar2 = zzahlVar4;
                                                    i64 = i32;
                                                    i63 = i34;
                                                    i9 = i18;
                                                    unsafe = unsafe5;
                                                    i66 = i31;
                                                    i62 = i33;
                                                    if (i63 != i5) {
                                                    }
                                                    if (this.zzh) {
                                                    }
                                                } else {
                                                    i61 = i4;
                                                    iZza4 = i96;
                                                    i60 = i3;
                                                    zzahlVar8 = zzahlVar4;
                                                    i64 = i32;
                                                    i63 = i34;
                                                    i65 = i18;
                                                    unsafe9 = unsafe5;
                                                    i66 = i31;
                                                    i62 = i33;
                                                }
                                            }
                                        } else {
                                            i33 = i19;
                                            i34 = i84;
                                            unsafe5 = unsafe11;
                                            t2 = t;
                                            i35 = i83;
                                        }
                                    } else {
                                        long j3 = i71;
                                        Unsafe unsafe14 = zzb;
                                        zzajg zzajgVar2 = (zzajg) unsafe14.getObject(t2, j);
                                        if (zzajgVar2.zzc()) {
                                            obj = "";
                                        } else {
                                            int size = zzajgVar2.size();
                                            int i97 = size != 0 ? size << 1 : 10;
                                            obj = "";
                                            zzajg zzajgVarZza = zzajgVar2.zza(i97);
                                            unsafe14.putObject(t2, j, zzajgVarZza);
                                            zzajgVar2 = zzajgVarZza;
                                        }
                                        switch (i72) {
                                            case 18:
                                            case 35:
                                                i5 = i4;
                                                i36 = i19;
                                                i37 = iZzc2;
                                                i38 = i82;
                                                unsafe6 = unsafe10;
                                                if (i69 != 2) {
                                                    if (i69 == 1) {
                                                        zzain zzainVar = (zzain) zzajgVar2;
                                                        zzainVar.zza(zzahi.zza(bArr, i37));
                                                        iZzc = i37 + 8;
                                                        while (iZzc < i3) {
                                                            int iZzc4 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i38 == zzahlVar4.zza) {
                                                                zzainVar.zza(zzahi.zza(bArr, iZzc4));
                                                                iZzc = iZzc4 + 8;
                                                            }
                                                        }
                                                    }
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                        i11 = i18;
                                                        i66 = i31;
                                                        t2 = t;
                                                        int i862 = iZzc2;
                                                        i63 = i44;
                                                        iZza2 = i862;
                                                        iZza4 = iZza2;
                                                        break;
                                                    } else {
                                                        zzahlVar2 = zzahlVar4;
                                                        i9 = i18;
                                                        i66 = i31;
                                                        t2 = t;
                                                        i6 = i44;
                                                        i5 = i4;
                                                        break;
                                                    }
                                                } else {
                                                    zzain zzainVar2 = (zzain) zzajgVar2;
                                                    iZzc = zzahi.zzc(bArr, i37, zzahlVar4);
                                                    int i98 = zzahlVar4.zza + iZzc;
                                                    while (iZzc < i98) {
                                                        zzainVar2.zza(zzahi.zza(bArr, iZzc));
                                                        iZzc += 8;
                                                    }
                                                    if (iZzc != i98) {
                                                        throw zzajj.zzi();
                                                    }
                                                }
                                                i64 = i32;
                                                int i99 = i38;
                                                iZzc2 = iZzc;
                                                i44 = i99;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                            case 19:
                                            case 36:
                                                i5 = i4;
                                                i36 = i19;
                                                i37 = iZzc2;
                                                i38 = i82;
                                                unsafe6 = unsafe10;
                                                if (i69 == 2) {
                                                    zzaiy zzaiyVar = (zzaiy) zzajgVar2;
                                                    iZzc = zzahi.zzc(bArr, i37, zzahlVar4);
                                                    int i100 = zzahlVar4.zza + iZzc;
                                                    while (iZzc < i100) {
                                                        zzaiyVar.zza(zzahi.zzb(bArr, iZzc));
                                                        iZzc += 4;
                                                    }
                                                    if (iZzc != i100) {
                                                        throw zzajj.zzi();
                                                    }
                                                } else {
                                                    if (i69 == 5) {
                                                        zzaiy zzaiyVar2 = (zzaiy) zzajgVar2;
                                                        zzaiyVar2.zza(zzahi.zzb(bArr, i37));
                                                        iZzc = i37 + 4;
                                                        while (iZzc < i3) {
                                                            int iZzc5 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i38 == zzahlVar4.zza) {
                                                                zzaiyVar2.zza(zzahi.zzb(bArr, iZzc5));
                                                                iZzc = iZzc5 + 4;
                                                            }
                                                        }
                                                    }
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                i64 = i32;
                                                int i992 = i38;
                                                iZzc2 = iZzc;
                                                i44 = i992;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                i5 = i4;
                                                i36 = i19;
                                                i37 = iZzc2;
                                                i38 = i82;
                                                unsafe6 = unsafe10;
                                                if (i69 == 2) {
                                                    zzajz zzajzVar = (zzajz) zzajgVar2;
                                                    iZzc = zzahi.zzc(bArr, i37, zzahlVar4);
                                                    int i101 = zzahlVar4.zza + iZzc;
                                                    while (iZzc < i101) {
                                                        iZzc = zzahi.zzd(bArr, iZzc, zzahlVar4);
                                                        zzajzVar.zza(zzahlVar4.zzb);
                                                    }
                                                    if (iZzc != i101) {
                                                        throw zzajj.zzi();
                                                    }
                                                } else {
                                                    if (i69 == 0) {
                                                        zzajz zzajzVar2 = (zzajz) zzajgVar2;
                                                        iZzc = zzahi.zzd(bArr, i37, zzahlVar4);
                                                        zzajzVar2.zza(zzahlVar4.zzb);
                                                        while (iZzc < i3) {
                                                            int iZzc6 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i38 == zzahlVar4.zza) {
                                                                iZzc = zzahi.zzd(bArr, iZzc6, zzahlVar4);
                                                                zzajzVar2.zza(zzahlVar4.zzb);
                                                            }
                                                        }
                                                    }
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                i64 = i32;
                                                int i9922 = i38;
                                                iZzc2 = iZzc;
                                                i44 = i9922;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                i39 = i3;
                                                i40 = i4;
                                                i36 = i19;
                                                i41 = iZzc2;
                                                i42 = i82;
                                                unsafe7 = unsafe10;
                                                if (i69 == 2) {
                                                    iZzc = zzahi.zza(bArr, i41, (zzajg<?>) zzajgVar2, zzahlVar4);
                                                    unsafe6 = unsafe7;
                                                    i38 = i42;
                                                    i37 = i41;
                                                    i5 = i40;
                                                    i64 = i32;
                                                    int i99222 = i38;
                                                    iZzc2 = iZzc;
                                                    i44 = i99222;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                } else {
                                                    if (i69 == 0) {
                                                        unsafe6 = unsafe7;
                                                        i38 = i42;
                                                        i37 = i41;
                                                        i5 = i40;
                                                        iZzc = zzahi.zza(i42, bArr, i41, i3, (zzajg<?>) zzajgVar2, zzahlVar);
                                                        i64 = i32;
                                                        int i992222 = i38;
                                                        iZzc2 = iZzc;
                                                        i44 = i992222;
                                                        i62 = i36;
                                                        unsafe = unsafe6;
                                                        if (iZzc2 == i37) {
                                                        }
                                                    }
                                                    unsafe6 = unsafe7;
                                                    i38 = i42;
                                                    i37 = i41;
                                                    i5 = i40;
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                                            case 40:
                                            case 46:
                                                i39 = i3;
                                                i40 = i4;
                                                i36 = i19;
                                                i41 = iZzc2;
                                                i42 = i82;
                                                unsafe7 = unsafe10;
                                                if (i69 == 2) {
                                                    zzajz zzajzVar3 = (zzajz) zzajgVar2;
                                                    iZzc = zzahi.zzc(bArr, i41, zzahlVar4);
                                                    int i102 = zzahlVar4.zza + iZzc;
                                                    while (iZzc < i102) {
                                                        zzajzVar3.zza(zzahi.zzd(bArr, iZzc));
                                                        iZzc += 8;
                                                    }
                                                    if (iZzc != i102) {
                                                        throw zzajj.zzi();
                                                    }
                                                } else {
                                                    if (i69 == 1) {
                                                        zzajz zzajzVar4 = (zzajz) zzajgVar2;
                                                        zzajzVar4.zza(zzahi.zzd(bArr, i41));
                                                        iZzc = i41 + 8;
                                                        while (iZzc < i39) {
                                                            int iZzc7 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i42 == zzahlVar4.zza) {
                                                                zzajzVar4.zza(zzahi.zzd(bArr, iZzc7));
                                                                iZzc = iZzc7 + 8;
                                                            }
                                                        }
                                                    }
                                                    unsafe6 = unsafe7;
                                                    i38 = i42;
                                                    i37 = i41;
                                                    i5 = i40;
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                unsafe6 = unsafe7;
                                                i38 = i42;
                                                i37 = i41;
                                                i5 = i40;
                                                i64 = i32;
                                                int i9922222 = i38;
                                                iZzc2 = iZzc;
                                                i44 = i9922222;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                i39 = i3;
                                                i40 = i4;
                                                i36 = i19;
                                                i41 = iZzc2;
                                                i42 = i82;
                                                unsafe7 = unsafe10;
                                                if (i69 == 2) {
                                                    zzajd zzajdVar = (zzajd) zzajgVar2;
                                                    iZzc = zzahi.zzc(bArr, i41, zzahlVar4);
                                                    int i103 = zzahlVar4.zza + iZzc;
                                                    while (iZzc < i103) {
                                                        zzajdVar.zzc(zzahi.zzc(bArr, iZzc));
                                                        iZzc += 4;
                                                    }
                                                    if (iZzc != i103) {
                                                        throw zzajj.zzi();
                                                    }
                                                } else {
                                                    if (i69 == 5) {
                                                        zzajd zzajdVar2 = (zzajd) zzajgVar2;
                                                        zzajdVar2.zzc(zzahi.zzc(bArr, i41));
                                                        iZzc = i41 + 4;
                                                        while (iZzc < i39) {
                                                            int iZzc8 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i42 == zzahlVar4.zza) {
                                                                zzajdVar2.zzc(zzahi.zzc(bArr, iZzc8));
                                                                iZzc = iZzc8 + 4;
                                                            }
                                                        }
                                                    }
                                                    unsafe6 = unsafe7;
                                                    i38 = i42;
                                                    i37 = i41;
                                                    i5 = i40;
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                unsafe6 = unsafe7;
                                                i38 = i42;
                                                i37 = i41;
                                                i5 = i40;
                                                i64 = i32;
                                                int i99222222 = i38;
                                                iZzc2 = iZzc;
                                                i44 = i99222222;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                i39 = i3;
                                                i40 = i4;
                                                i36 = i19;
                                                i41 = iZzc2;
                                                i42 = i82;
                                                unsafe7 = unsafe10;
                                                if (i69 == 2) {
                                                    zzahk zzahkVar = (zzahk) zzajgVar2;
                                                    iZzc = zzahi.zzc(bArr, i41, zzahlVar4);
                                                    int i104 = zzahlVar4.zza + iZzc;
                                                    while (iZzc < i104) {
                                                        iZzc = zzahi.zzd(bArr, iZzc, zzahlVar4);
                                                        zzahkVar.zza(zzahlVar4.zzb != 0);
                                                    }
                                                    if (iZzc != i104) {
                                                        throw zzajj.zzi();
                                                    }
                                                } else {
                                                    if (i69 == 0) {
                                                        zzahk zzahkVar2 = (zzahk) zzajgVar2;
                                                        iZzc = zzahi.zzd(bArr, i41, zzahlVar4);
                                                        zzahkVar2.zza(zzahlVar4.zzb != 0);
                                                        while (iZzc < i39) {
                                                            int iZzc9 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i42 == zzahlVar4.zza) {
                                                                iZzc = zzahi.zzd(bArr, iZzc9, zzahlVar4);
                                                                zzahkVar2.zza(zzahlVar4.zzb != 0);
                                                            }
                                                        }
                                                    }
                                                    unsafe6 = unsafe7;
                                                    i38 = i42;
                                                    i37 = i41;
                                                    i5 = i40;
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                unsafe6 = unsafe7;
                                                i38 = i42;
                                                i37 = i41;
                                                i5 = i40;
                                                i64 = i32;
                                                int i992222222 = i38;
                                                iZzc2 = iZzc;
                                                i44 = i992222222;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case 26:
                                                i39 = i3;
                                                i40 = i4;
                                                i36 = i19;
                                                i41 = iZzc2;
                                                i42 = i82;
                                                unsafe7 = unsafe10;
                                                if (i69 == 2) {
                                                    if ((j3 & 536870912) == 0) {
                                                        iZzc = zzahi.zzc(bArr, i41, zzahlVar4);
                                                        int i105 = zzahlVar4.zza;
                                                        if (i105 < 0) {
                                                            throw zzajj.zzf();
                                                        }
                                                        if (i105 == 0) {
                                                            obj2 = obj;
                                                            zzajgVar2.add(obj2);
                                                        } else {
                                                            obj2 = obj;
                                                            zzajgVar2.add(new String(bArr, iZzc, i105, zzajc.zza));
                                                            iZzc += i105;
                                                        }
                                                        while (iZzc < i39) {
                                                            int iZzc10 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i42 == zzahlVar4.zza) {
                                                                iZzc = zzahi.zzc(bArr, iZzc10, zzahlVar4);
                                                                int i106 = zzahlVar4.zza;
                                                                if (i106 < 0) {
                                                                    throw zzajj.zzf();
                                                                }
                                                                if (i106 == 0) {
                                                                    zzajgVar2.add(obj2);
                                                                } else {
                                                                    zzajgVar2.add(new String(bArr, iZzc, i106, zzajc.zza));
                                                                    iZzc += i106;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        Object obj10 = obj;
                                                        iZzc = zzahi.zzc(bArr, i41, zzahlVar4);
                                                        int i107 = zzahlVar4.zza;
                                                        if (i107 < 0) {
                                                            throw zzajj.zzf();
                                                        }
                                                        if (i107 == 0) {
                                                            zzajgVar2.add(obj10);
                                                        } else {
                                                            int i108 = iZzc + i107;
                                                            if (!zzaml.zzc(bArr, iZzc, i108)) {
                                                                throw zzajj.zzd();
                                                            }
                                                            zzajgVar2.add(new String(bArr, iZzc, i107, zzajc.zza));
                                                            iZzc = i108;
                                                        }
                                                        while (iZzc < i39) {
                                                            int iZzc11 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i42 == zzahlVar4.zza) {
                                                                iZzc = zzahi.zzc(bArr, iZzc11, zzahlVar4);
                                                                int i109 = zzahlVar4.zza;
                                                                if (i109 < 0) {
                                                                    throw zzajj.zzf();
                                                                }
                                                                if (i109 == 0) {
                                                                    zzajgVar2.add(obj10);
                                                                } else {
                                                                    int i110 = iZzc + i109;
                                                                    if (!zzaml.zzc(bArr, iZzc, i110)) {
                                                                        throw zzajj.zzd();
                                                                    }
                                                                    zzajgVar2.add(new String(bArr, iZzc, i109, zzajc.zza));
                                                                    iZzc = i110;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    unsafe6 = unsafe7;
                                                    i38 = i42;
                                                    i37 = i41;
                                                    i5 = i40;
                                                    i64 = i32;
                                                    int i9922222222 = i38;
                                                    iZzc2 = iZzc;
                                                    i44 = i9922222222;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                unsafe6 = unsafe7;
                                                i38 = i42;
                                                i37 = i41;
                                                i5 = i40;
                                                i44 = i38;
                                                i64 = i32;
                                                iZzc2 = i37;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                                                i43 = i3;
                                                i36 = i19;
                                                if (i69 == 2) {
                                                    int i111 = iZzc2;
                                                    int iZza9 = zzahi.zza((zzalc<?>) zze(i36), i82, bArr, iZzc2, i3, (zzajg<?>) zzajgVar2, zzahlVar);
                                                    zzahlVar4 = zzahlVar4;
                                                    unsafe6 = unsafe10;
                                                    i38 = i82;
                                                    i5 = i4;
                                                    iZzc = iZza9;
                                                    i37 = i111;
                                                    i64 = i32;
                                                    int i99222222222 = i38;
                                                    iZzc2 = iZzc;
                                                    i44 = i99222222222;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                i40 = i4;
                                                i39 = i43;
                                                i41 = iZzc2;
                                                i42 = i82;
                                                unsafe7 = unsafe10;
                                                zzahlVar4 = zzahlVar4;
                                                unsafe6 = unsafe7;
                                                i38 = i42;
                                                i37 = i41;
                                                i5 = i40;
                                                i44 = i38;
                                                i64 = i32;
                                                iZzc2 = i37;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case 28:
                                                i43 = i3;
                                                i36 = i19;
                                                if (i69 == 2) {
                                                    int iZzc12 = zzahi.zzc(bArr, iZzc2, zzahlVar4);
                                                    int i112 = zzahlVar4.zza;
                                                    if (i112 < 0) {
                                                        throw zzajj.zzf();
                                                    }
                                                    if (i112 > bArr.length - iZzc12) {
                                                        throw zzajj.zzi();
                                                    }
                                                    if (i112 == 0) {
                                                        zzajgVar2.add(zzahm.zza);
                                                        zzajgVar = zzajgVar2;
                                                        i64 = i32;
                                                    } else {
                                                        zzajgVar2.add(zzahm.zza(bArr, iZzc12, i112));
                                                        zzajgVar = zzajgVar2;
                                                        i64 = i32;
                                                        iZzc12 += i112;
                                                    }
                                                    while (true) {
                                                        int i113 = iZzc2;
                                                        iZzc2 = iZzc12;
                                                        while (iZzc2 < i43) {
                                                            int iZzc13 = zzahi.zzc(bArr, iZzc2, zzahlVar4);
                                                            if (i82 != zzahlVar4.zza) {
                                                                break;
                                                            } else {
                                                                iZzc2 = zzahi.zzc(bArr, iZzc13, zzahlVar4);
                                                                int i114 = zzahlVar4.zza;
                                                                if (i114 < 0) {
                                                                    throw zzajj.zzf();
                                                                }
                                                                if (i114 > bArr.length - iZzc2) {
                                                                    throw zzajj.zzi();
                                                                }
                                                                if (i114 == 0) {
                                                                    zzajgVar.add(zzahm.zza);
                                                                } else {
                                                                    zzajgVar.add(zzahm.zza(bArr, iZzc2, i114));
                                                                    iZzc2 = i113;
                                                                    iZzc12 = iZzc2 + i114;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                                i40 = i4;
                                                i39 = i43;
                                                i41 = iZzc2;
                                                i42 = i82;
                                                unsafe7 = unsafe10;
                                                zzahlVar4 = zzahlVar4;
                                                unsafe6 = unsafe7;
                                                i38 = i42;
                                                i37 = i41;
                                                i5 = i40;
                                                i44 = i38;
                                                i64 = i32;
                                                iZzc2 = i37;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                i43 = i3;
                                                i36 = i19;
                                                if (i69 == 2) {
                                                    iZza3 = zzahi.zza(bArr, iZzc2, (zzajg<?>) zzajgVar2, zzahlVar4);
                                                } else {
                                                    if (i69 == 0) {
                                                        iZza3 = zzahi.zza(i82, bArr, iZzc2, i3, (zzajg<?>) zzajgVar2, zzahlVar);
                                                    }
                                                    i40 = i4;
                                                    i39 = i43;
                                                    i41 = iZzc2;
                                                    i42 = i82;
                                                    unsafe7 = unsafe10;
                                                    zzahlVar4 = zzahlVar4;
                                                    unsafe6 = unsafe7;
                                                    i38 = i42;
                                                    i37 = i41;
                                                    i5 = i40;
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                int i115 = iZza3;
                                                zzale.zza(t, i18, zzajgVar2, zzd(i36), null, this.zzq);
                                                i5 = i4;
                                                i44 = i82;
                                                i64 = i32;
                                                unsafe6 = unsafe10;
                                                int i116 = iZzc2;
                                                iZzc2 = i115;
                                                i37 = i116;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                            case 47:
                                                i43 = i3;
                                                i36 = i19;
                                                if (i69 == 2) {
                                                    zzajd zzajdVar3 = (zzajd) zzajgVar2;
                                                    iZzc = zzahi.zzc(bArr, iZzc2, zzahlVar4);
                                                    int i117 = zzahlVar4.zza + iZzc;
                                                    while (iZzc < i117) {
                                                        iZzc = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                        zzajdVar3.zzc(zzaib.zze(zzahlVar4.zza));
                                                    }
                                                    if (iZzc != i117) {
                                                        throw zzajj.zzi();
                                                    }
                                                } else {
                                                    if (i69 == 0) {
                                                        zzajd zzajdVar4 = (zzajd) zzajgVar2;
                                                        iZzc = zzahi.zzc(bArr, iZzc2, zzahlVar4);
                                                        zzajdVar4.zzc(zzaib.zze(zzahlVar4.zza));
                                                        while (iZzc < i43) {
                                                            int iZzc14 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i82 == zzahlVar4.zza) {
                                                                iZzc = zzahi.zzc(bArr, iZzc14, zzahlVar4);
                                                                zzajdVar4.zzc(zzaib.zze(zzahlVar4.zza));
                                                            }
                                                        }
                                                    }
                                                    i40 = i4;
                                                    i39 = i43;
                                                    i41 = iZzc2;
                                                    i42 = i82;
                                                    unsafe7 = unsafe10;
                                                    zzahlVar4 = zzahlVar4;
                                                    unsafe6 = unsafe7;
                                                    i38 = i42;
                                                    i37 = i41;
                                                    i5 = i40;
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                i5 = i4;
                                                i37 = iZzc2;
                                                i38 = i82;
                                                unsafe6 = unsafe10;
                                                i64 = i32;
                                                int i992222222222 = i38;
                                                iZzc2 = iZzc;
                                                i44 = i992222222222;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                i43 = i3;
                                                i36 = i19;
                                                if (i69 == 2) {
                                                    zzajz zzajzVar5 = (zzajz) zzajgVar2;
                                                    iZzc = zzahi.zzc(bArr, iZzc2, zzahlVar4);
                                                    int i118 = zzahlVar4.zza + iZzc;
                                                    while (iZzc < i118) {
                                                        iZzc = zzahi.zzd(bArr, iZzc, zzahlVar4);
                                                        zzajzVar5.zza(zzaib.zza(zzahlVar4.zzb));
                                                    }
                                                    if (iZzc != i118) {
                                                        throw zzajj.zzi();
                                                    }
                                                } else {
                                                    if (i69 == 0) {
                                                        zzajz zzajzVar6 = (zzajz) zzajgVar2;
                                                        iZzc = zzahi.zzd(bArr, iZzc2, zzahlVar4);
                                                        zzajzVar6.zza(zzaib.zza(zzahlVar4.zzb));
                                                        while (iZzc < i43) {
                                                            int iZzc15 = zzahi.zzc(bArr, iZzc, zzahlVar4);
                                                            if (i82 == zzahlVar4.zza) {
                                                                iZzc = zzahi.zzd(bArr, iZzc15, zzahlVar4);
                                                                zzajzVar6.zza(zzaib.zza(zzahlVar4.zzb));
                                                            }
                                                        }
                                                    }
                                                    i40 = i4;
                                                    i39 = i43;
                                                    i41 = iZzc2;
                                                    i42 = i82;
                                                    unsafe7 = unsafe10;
                                                    zzahlVar4 = zzahlVar4;
                                                    unsafe6 = unsafe7;
                                                    i38 = i42;
                                                    i37 = i41;
                                                    i5 = i40;
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                i5 = i4;
                                                i37 = iZzc2;
                                                i38 = i82;
                                                unsafe6 = unsafe10;
                                                i64 = i32;
                                                int i9922222222222 = i38;
                                                iZzc2 = iZzc;
                                                i44 = i9922222222222;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                            case 49:
                                                if (i69 == 3) {
                                                    zzalc zzalcVarZze = zze(i19);
                                                    int i119 = (i82 & (-8)) | 4;
                                                    i36 = i19;
                                                    int iZza10 = zzahi.zza(zzalcVarZze, bArr, iZzc2, i3, i119, zzahlVar);
                                                    zzajgVar2.add(zzahlVar4.zzc);
                                                    while (iZza10 < i3) {
                                                        int iZzc16 = zzahi.zzc(bArr, iZza10, zzahlVar4);
                                                        if (i82 == zzahlVar4.zza) {
                                                            iZza10 = zzahi.zza(zzalcVarZze, bArr, iZzc16, i3, i119, zzahlVar);
                                                            zzajgVar2.add(zzahlVar4.zzc);
                                                        } else {
                                                            i5 = i4;
                                                            i37 = iZzc2;
                                                            i64 = i32;
                                                            iZzc2 = iZza10;
                                                            i44 = i82;
                                                            unsafe6 = unsafe10;
                                                            i62 = i36;
                                                            unsafe = unsafe6;
                                                            if (iZzc2 == i37) {
                                                            }
                                                        }
                                                    }
                                                    i5 = i4;
                                                    i37 = iZzc2;
                                                    i64 = i32;
                                                    iZzc2 = iZza10;
                                                    i44 = i82;
                                                    unsafe6 = unsafe10;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                } else {
                                                    i36 = i19;
                                                    i5 = i4;
                                                    i37 = iZzc2;
                                                    i38 = i82;
                                                    unsafe6 = unsafe10;
                                                    i44 = i38;
                                                    i64 = i32;
                                                    iZzc2 = i37;
                                                    i62 = i36;
                                                    unsafe = unsafe6;
                                                    if (iZzc2 == i37) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i5 = i4;
                                                i36 = i19;
                                                i37 = iZzc2;
                                                i38 = i82;
                                                unsafe6 = unsafe10;
                                                i44 = i38;
                                                i64 = i32;
                                                iZzc2 = i37;
                                                i62 = i36;
                                                unsafe = unsafe6;
                                                if (iZzc2 == i37) {
                                                }
                                                break;
                                        }
                                    }
                                    i60 = i3;
                                    zzahlVar8 = zzahlVar;
                                    i61 = i5;
                                    i65 = i11;
                                    unsafe9 = unsafe;
                                } else if (i69 == 2) {
                                    zzajg zzajgVarZza2 = (zzajg) unsafe10.getObject(t2, j);
                                    if (!zzajgVarZza2.zzc()) {
                                        int size2 = zzajgVarZza2.size();
                                        zzajgVarZza2 = zzajgVarZza2.zza(size2 != 0 ? size2 << 1 : 10);
                                        unsafe10.putObject(t2, j, zzajgVarZza2);
                                    }
                                    zzahlVar8 = zzahlVar;
                                    unsafe3 = unsafe10;
                                    i20 = i82;
                                    i14 = i66;
                                    iZza4 = zzahi.zza((zzalc<?>) zze(i19), i82, bArr, iZzc2, i3, (zzajg<?>) zzajgVarZza2, zzahlVar);
                                    i64 = i64;
                                    i66 = i14;
                                    i61 = i4;
                                    i62 = i19;
                                    i63 = i20;
                                    i65 = i18;
                                    i60 = i3;
                                    unsafe9 = unsafe3;
                                } else {
                                    i31 = i66;
                                    i32 = i64;
                                    i33 = i19;
                                    i34 = i82;
                                    zzahlVar4 = zzahlVar;
                                    unsafe5 = unsafe10;
                                    i35 = iZzc2;
                                }
                                i5 = i4;
                                i10 = i35;
                                zzahlVar2 = zzahlVar4;
                                i64 = i32;
                                i63 = i34;
                                i9 = i18;
                                unsafe = unsafe5;
                                i66 = i31;
                                i62 = i33;
                                if (i63 != i5) {
                                }
                                if (this.zzh) {
                                }
                            }
                        }
                        i10 = iZzc2;
                        i63 = i6;
                        if (i63 != i5) {
                        }
                        if (this.zzh) {
                        }
                    }
                } else {
                    iZza = zza(i68);
                }
                i7 = iZza;
                i8 = -1;
                if (i7 != i8) {
                }
                i10 = iZzc2;
                i63 = i6;
                if (i63 != i5) {
                }
                if (this.zzh) {
                }
            } else {
                unsafe = unsafe9;
                i5 = i61;
            }
        }
    }

    private final int zza(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zza(i2, 0);
    }

    private final int zzb(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zza(int i2, int i3) {
        int length = (this.zzc.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.zzc[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final int zzc(int i2) {
        return this.zzc[i2 + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzamh.zze(t, j)).longValue();
    }

    private final zzajh zzd(int i2) {
        return (zzajh) this.zzd[((i2 / 3) << 1) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0374  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> zzako<T> zza(Class<T> cls, zzaki zzakiVar, zzaks zzaksVar, zzajt zzajtVar, zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakh zzakhVar) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        zzala zzalaVar;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int iObjectFieldOffset3;
        int i21;
        Field fieldZza;
        int i22;
        char cCharAt9;
        int i23;
        Object obj;
        Field fieldZza2;
        Object obj2;
        Field fieldZza3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        if (zzakiVar instanceof zzala) {
            zzala zzalaVar2 = (zzala) zzakiVar;
            String strZzd = zzalaVar2.zzd();
            int length = strZzd.length();
            char c = 55296;
            if (strZzd.charAt(0) >= 55296) {
                int i28 = 1;
                while (true) {
                    i2 = i28 + 1;
                    if (strZzd.charAt(i28) < 55296) {
                        break;
                    }
                    i28 = i2;
                }
            } else {
                i2 = 1;
            }
            int i29 = i2 + 1;
            int iCharAt3 = strZzd.charAt(i2);
            if (iCharAt3 >= 55296) {
                int i30 = iCharAt3 & 8191;
                int i31 = 13;
                while (true) {
                    i27 = i29 + 1;
                    cCharAt13 = strZzd.charAt(i29);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i30 |= (cCharAt13 & 8191) << i31;
                    i31 += 13;
                    i29 = i27;
                }
                iCharAt3 = i30 | (cCharAt13 << i31);
                i29 = i27;
            }
            if (iCharAt3 == 0) {
                iCharAt = 0;
                iCharAt2 = 0;
                i6 = 0;
                i7 = 0;
                i3 = 0;
                i5 = 0;
                iArr = zza;
                i4 = 0;
            } else {
                int i32 = i29 + 1;
                int iCharAt4 = strZzd.charAt(i29);
                if (iCharAt4 >= 55296) {
                    int i33 = iCharAt4 & 8191;
                    int i34 = 13;
                    while (true) {
                        i15 = i32 + 1;
                        cCharAt8 = strZzd.charAt(i32);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i33 |= (cCharAt8 & 8191) << i34;
                        i34 += 13;
                        i32 = i15;
                    }
                    iCharAt4 = i33 | (cCharAt8 << i34);
                    i32 = i15;
                }
                int i35 = i32 + 1;
                int iCharAt5 = strZzd.charAt(i32);
                if (iCharAt5 >= 55296) {
                    int i36 = iCharAt5 & 8191;
                    int i37 = 13;
                    while (true) {
                        i14 = i35 + 1;
                        cCharAt7 = strZzd.charAt(i35);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i36 |= (cCharAt7 & 8191) << i37;
                        i37 += 13;
                        i35 = i14;
                    }
                    iCharAt5 = i36 | (cCharAt7 << i37);
                    i35 = i14;
                }
                int i38 = i35 + 1;
                int iCharAt6 = strZzd.charAt(i35);
                if (iCharAt6 >= 55296) {
                    int i39 = iCharAt6 & 8191;
                    int i40 = 13;
                    while (true) {
                        i13 = i38 + 1;
                        cCharAt6 = strZzd.charAt(i38);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i39 |= (cCharAt6 & 8191) << i40;
                        i40 += 13;
                        i38 = i13;
                    }
                    iCharAt6 = i39 | (cCharAt6 << i40);
                    i38 = i13;
                }
                int i41 = i38 + 1;
                int iCharAt7 = strZzd.charAt(i38);
                if (iCharAt7 >= 55296) {
                    int i42 = iCharAt7 & 8191;
                    int i43 = 13;
                    while (true) {
                        i12 = i41 + 1;
                        cCharAt5 = strZzd.charAt(i41);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i42 |= (cCharAt5 & 8191) << i43;
                        i43 += 13;
                        i41 = i12;
                    }
                    iCharAt7 = i42 | (cCharAt5 << i43);
                    i41 = i12;
                }
                int i44 = i41 + 1;
                iCharAt = strZzd.charAt(i41);
                if (iCharAt >= 55296) {
                    int i45 = iCharAt & 8191;
                    int i46 = 13;
                    while (true) {
                        i11 = i44 + 1;
                        cCharAt4 = strZzd.charAt(i44);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i45 |= (cCharAt4 & 8191) << i46;
                        i46 += 13;
                        i44 = i11;
                    }
                    iCharAt = i45 | (cCharAt4 << i46);
                    i44 = i11;
                }
                int i47 = i44 + 1;
                iCharAt2 = strZzd.charAt(i44);
                if (iCharAt2 >= 55296) {
                    int i48 = iCharAt2 & 8191;
                    int i49 = 13;
                    while (true) {
                        i10 = i47 + 1;
                        cCharAt3 = strZzd.charAt(i47);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i48 |= (cCharAt3 & 8191) << i49;
                        i49 += 13;
                        i47 = i10;
                    }
                    iCharAt2 = i48 | (cCharAt3 << i49);
                    i47 = i10;
                }
                int i50 = i47 + 1;
                int iCharAt8 = strZzd.charAt(i47);
                if (iCharAt8 >= 55296) {
                    int i51 = iCharAt8 & 8191;
                    int i52 = 13;
                    while (true) {
                        i9 = i50 + 1;
                        cCharAt2 = strZzd.charAt(i50);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i51 |= (cCharAt2 & 8191) << i52;
                        i52 += 13;
                        i50 = i9;
                    }
                    iCharAt8 = i51 | (cCharAt2 << i52);
                    i50 = i9;
                }
                int i53 = i50 + 1;
                int iCharAt9 = strZzd.charAt(i50);
                if (iCharAt9 >= 55296) {
                    int i54 = iCharAt9 & 8191;
                    int i55 = 13;
                    while (true) {
                        i8 = i53 + 1;
                        cCharAt = strZzd.charAt(i53);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i54 |= (cCharAt & 8191) << i55;
                        i55 += 13;
                        i53 = i8;
                    }
                    iCharAt9 = i54 | (cCharAt << i55);
                    i53 = i8;
                }
                i3 = (iCharAt4 << 1) + iCharAt5;
                i4 = iCharAt4;
                iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
                i5 = iCharAt9;
                i29 = i53;
                i6 = iCharAt6;
                i7 = iCharAt7;
            }
            Unsafe unsafe = zzb;
            Object[] objArrZze = zzalaVar2.zze();
            Class<?> cls2 = zzalaVar2.zza().getClass();
            int[] iArr2 = new int[iCharAt * 3];
            Object[] objArr = new Object[iCharAt << 1];
            int i56 = i5 + iCharAt2;
            int i57 = i5;
            int i58 = i56;
            int i59 = 0;
            int i60 = 0;
            while (i29 < length) {
                int i61 = i29 + 1;
                int iCharAt10 = strZzd.charAt(i29);
                if (iCharAt10 >= c) {
                    int i62 = iCharAt10 & 8191;
                    int i63 = i61;
                    int i64 = 13;
                    while (true) {
                        i26 = i63 + 1;
                        cCharAt12 = strZzd.charAt(i63);
                        if (cCharAt12 < c) {
                            break;
                        }
                        i62 |= (cCharAt12 & 8191) << i64;
                        i64 += 13;
                        i63 = i26;
                    }
                    iCharAt10 = i62 | (cCharAt12 << i64);
                    i16 = i26;
                } else {
                    i16 = i61;
                }
                int i65 = i16 + 1;
                int iCharAt11 = strZzd.charAt(i16);
                if (iCharAt11 >= c) {
                    int i66 = iCharAt11 & 8191;
                    int i67 = i65;
                    int i68 = 13;
                    while (true) {
                        i25 = i67 + 1;
                        cCharAt11 = strZzd.charAt(i67);
                        if (cCharAt11 < c) {
                            break;
                        }
                        i66 |= (cCharAt11 & 8191) << i68;
                        i68 += 13;
                        i67 = i25;
                    }
                    iCharAt11 = i66 | (cCharAt11 << i68);
                    i17 = i25;
                } else {
                    i17 = i65;
                }
                int i69 = iCharAt11 & OggPageHeader.MAX_SEGMENT_COUNT;
                int i70 = length;
                if ((iCharAt11 & 1024) != 0) {
                    iArr[i60] = i59;
                    i60++;
                }
                int i71 = i7;
                if (i69 >= 51) {
                    int i72 = i17 + 1;
                    int iCharAt12 = strZzd.charAt(i17);
                    char c2 = 55296;
                    if (iCharAt12 >= 55296) {
                        int i73 = iCharAt12 & 8191;
                        int i74 = 13;
                        while (true) {
                            i24 = i72 + 1;
                            cCharAt10 = strZzd.charAt(i72);
                            if (cCharAt10 < c2) {
                                break;
                            }
                            i73 |= (cCharAt10 & 8191) << i74;
                            i74 += 13;
                            i72 = i24;
                            c2 = 55296;
                        }
                        iCharAt12 = i73 | (cCharAt10 << i74);
                        i72 = i24;
                    }
                    int i75 = i69 - 51;
                    int i76 = i72;
                    if (i75 == 9 || i75 == 17) {
                        i23 = i3 + 1;
                        objArr[((i59 / 3) << 1) + 1] = objArrZze[i3];
                    } else if (i75 == 12 && (zzalaVar2.zzb().equals(zzakz.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i23 = i3 + 1;
                        objArr[((i59 / 3) << 1) + 1] = objArrZze[i3];
                    } else {
                        int i77 = iCharAt12 << 1;
                        obj = objArrZze[i77];
                        if (!(obj instanceof Field)) {
                            fieldZza2 = (Field) obj;
                        } else {
                            fieldZza2 = zza(cls2, (String) obj);
                            objArrZze[i77] = fieldZza2;
                        }
                        i18 = i6;
                        iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza2);
                        int i78 = i77 + 1;
                        obj2 = objArrZze[i78];
                        if (!(obj2 instanceof Field)) {
                            fieldZza3 = (Field) obj2;
                        } else {
                            fieldZza3 = zza(cls2, (String) obj2);
                            objArrZze[i78] = fieldZza3;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                        zzalaVar = zzalaVar2;
                        i19 = i76;
                        i21 = 0;
                    }
                    i3 = i23;
                    int i772 = iCharAt12 << 1;
                    obj = objArrZze[i772];
                    if (!(obj instanceof Field)) {
                    }
                    i18 = i6;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza2);
                    int i782 = i772 + 1;
                    obj2 = objArrZze[i782];
                    if (!(obj2 instanceof Field)) {
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                    zzalaVar = zzalaVar2;
                    i19 = i76;
                    i21 = 0;
                } else {
                    i18 = i6;
                    int i79 = i3 + 1;
                    Field fieldZza4 = zza(cls2, (String) objArrZze[i3]);
                    if (i69 == 9 || i69 == 17) {
                        zzalaVar = zzalaVar2;
                        objArr[((i59 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i69 == 27 || i69 == 49) {
                            zzalaVar = zzalaVar2;
                            i3 += 2;
                            objArr[((i59 / 3) << 1) + 1] = objArrZze[i79];
                        } else if (i69 == 12 || i69 == 30 || i69 == 44) {
                            zzalaVar = zzalaVar2;
                            if (zzalaVar2.zzb() == zzakz.PROTO2 || (iCharAt11 & 2048) != 0) {
                                i3 += 2;
                                objArr[((i59 / 3) << 1) + 1] = objArrZze[i79];
                            }
                        } else {
                            if (i69 == 50) {
                                int i80 = i57 + 1;
                                iArr[i57] = i59;
                                int i81 = (i59 / 3) << 1;
                                int i82 = i3 + 2;
                                objArr[i81] = objArrZze[i79];
                                if ((iCharAt11 & 2048) != 0) {
                                    i3 += 3;
                                    objArr[i81 + 1] = objArrZze[i82];
                                    zzalaVar = zzalaVar2;
                                    i57 = i80;
                                } else {
                                    i57 = i80;
                                    i79 = i82;
                                }
                            }
                            zzalaVar = zzalaVar2;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                        if ((iCharAt11 & 4096) != 0 || i69 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i19 = i17;
                            i20 = 0;
                        } else {
                            int i83 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i84 = iCharAt13 & 8191;
                                int i85 = 13;
                                while (true) {
                                    i22 = i83 + 1;
                                    cCharAt9 = strZzd.charAt(i83);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i84 |= (cCharAt9 & 8191) << i85;
                                    i85 += 13;
                                    i83 = i22;
                                }
                                iCharAt13 = i84 | (cCharAt9 << i85);
                                i83 = i22;
                            }
                            int i86 = (i4 << 1) + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i86];
                            if (obj3 instanceof Field) {
                                fieldZza = (Field) obj3;
                            } else {
                                fieldZza = zza(cls2, (String) obj3);
                                objArrZze[i86] = fieldZza;
                            }
                            int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZza);
                            i20 = iCharAt13 % 32;
                            i19 = i83;
                            iObjectFieldOffset2 = iObjectFieldOffset4;
                        }
                        if (i69 >= 18 && i69 <= 49) {
                            iArr[i58] = iObjectFieldOffset;
                            i58++;
                        }
                        int i87 = i20;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        i21 = i87;
                    }
                    i3 = i79;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i19 = i17;
                        i20 = 0;
                        if (i69 >= 18) {
                            iArr[i58] = iObjectFieldOffset;
                            i58++;
                        }
                        int i872 = i20;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        i21 = i872;
                    }
                }
                iArr2[i59] = iCharAt10;
                iArr2[i59 + 1] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i69 << 20) | iObjectFieldOffset3;
                iArr2[i59 + 2] = (i21 << 20) | iObjectFieldOffset2;
                i59 += 3;
                i29 = i19;
                length = i70;
                zzalaVar2 = zzalaVar;
                i7 = i71;
                i6 = i18;
                c = 55296;
            }
            zzala zzalaVar3 = zzalaVar2;
            return new zzako<>(iArr2, objArr, i6, i7, zzalaVar3.zza(), zzalaVar3.zzb(), false, iArr, i5, i56, zzaksVar, zzajtVar, zzambVar, zzairVar, zzakhVar);
        }
        throw new NoSuchMethodError();
    }

    private final zzalc zze(int i2) {
        int i3 = (i2 / 3) << 1;
        zzalc zzalcVar = (zzalc) this.zzd[i3];
        if (zzalcVar != null) {
            return zzalcVar;
        }
        zzalc<T> zzalcVarZza = zzaky.zza().zza((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzalcVarZza;
        return zzalcVarZza;
    }

    private static zzame zze(Object obj) {
        zzaja zzajaVar = (zzaja) obj;
        zzame zzameVar = zzajaVar.zzb;
        if (zzameVar != zzame.zzc()) {
            return zzameVar;
        }
        zzame zzameVarZzd = zzame.zzd();
        zzajaVar.zzb = zzameVarZzd;
        return zzameVarZzd;
    }

    private final <UT, UB> UB zza(Object obj, int i2, UB ub, zzamb<UT, UB> zzambVar, Object obj2) {
        zzajh zzajhVarZzd;
        int i3 = this.zzc[i2];
        Object objZze = zzamh.zze(obj, zzc(i2) & 1048575);
        return (objZze == null || (zzajhVarZzd = zzd(i2)) == null) ? ub : (UB) zza(i2, i3, this.zzs.zze(objZze), zzajhVarZzd, (zzajh) ub, (zzamb<UT, zzajh>) zzambVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i2, int i3, Map<K, V> map, zzajh zzajhVar, UB ub, zzamb<UT, UB> zzambVar, Object obj) {
        zzakf<?, ?> zzakfVarZza = this.zzs.zza(zzf(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzajhVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzambVar.zzc(obj);
                }
                zzahv zzahvVarZzc = zzahm.zzc(zzakc.zza(zzakfVarZza, next.getKey(), next.getValue()));
                try {
                    zzakc.zza(zzahvVarZzc.zzb(), zzakfVarZza, next.getKey(), next.getValue());
                    zzambVar.zza((zzamb<UT, UB>) ub, i3, zzahvVarZzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final Object zzf(int i2) {
        return this.zzd[(i2 / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i2) {
        zzalc zzalcVarZze = zze(i2);
        long jZzc = zzc(i2) & 1048575;
        if (!zzc((zzako<T>) t, i2)) {
            return zzalcVarZze.zza();
        }
        Object object = zzb.getObject(t, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalcVarZze.zza();
        if (object != null) {
            zzalcVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i2, int i3) {
        zzalc zzalcVarZze = zze(i3);
        if (!zzc((zzako<T>) t, i2, i3)) {
            return zzalcVarZze.zza();
        }
        Object object = zzb.getObject(t, zzc(i3) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalcVarZze.zza();
        if (object != null) {
            zzalcVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private zzako(int[] iArr, Object[] objArr, int i2, int i3, zzakk zzakkVar, zzakz zzakzVar, boolean z, int[] iArr2, int i4, int i5, zzaks zzaksVar, zzajt zzajtVar, zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakh zzakhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = zzakkVar instanceof zzaja;
        this.zzj = zzakzVar;
        this.zzh = zzairVar != null && zzairVar.zza(zzakkVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i4;
        this.zzn = i5;
        this.zzo = zzaksVar;
        this.zzp = zzajtVar;
        this.zzq = zzambVar;
        this.zzr = zzairVar;
        this.zzg = zzakkVar;
        this.zzs = zzakhVar;
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(T t) {
        if (zzg(t)) {
            if (t instanceof zzaja) {
                zzaja zzajaVar = (zzaja) t;
                zzajaVar.zzb(Integer.MAX_VALUE);
                zzajaVar.zza = 0;
                zzajaVar.zzt();
            }
            int length = this.zzc.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int iZzc = zzc(i2);
                long j = 1048575 & iZzc;
                int i3 = (iZzc & 267386880) >>> 20;
                if (i3 != 9) {
                    if (i3 == 60 || i3 == 68) {
                        if (zzc((zzako<T>) t, this.zzc[i2], i2)) {
                            zze(i2).zzc(zzb.getObject(t, j));
                        }
                    } else {
                        switch (i3) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzp.zzb(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.zzs.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                } else if (zzc((zzako<T>) t, i2)) {
                    zze(i2).zzc(zzb.getObject(t, j));
                }
            }
            this.zzq.zzf(t);
            if (this.zzh) {
                this.zzr.zzc(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzc = zzc(i2);
            long j = 1048575 & iZzc;
            int i3 = this.zzc[i2];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza(t, j, zzamh.zza(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzb(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzd(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzd(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzc(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzd(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzc(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zzc(t, j, zzamh.zzh(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza(t, j, zzamh.zze(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i2);
                    break;
                case 10:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza(t, j, zzamh.zze(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzc(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzc(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzc(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzd(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzc(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    if (zzc((zzako<T>) t2, i2)) {
                        zzamh.zza((Object) t, j, zzamh.zzd(t2, j));
                        zzb((zzako<T>) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                case 28:
                case 29:
                case 30:
                case 31:
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzp.zza(t, t2, j);
                    break;
                case 50:
                    zzale.zza(this.zzs, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzako<T>) t2, i3, i2)) {
                        zzamh.zza(t, j, zzamh.zze(t2, j));
                        zzb((zzako<T>) t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzako<T>) t2, i3, i2)) {
                        zzamh.zza(t, j, zzamh.zze(t2, j));
                        zzb((zzako<T>) t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i2);
                    break;
            }
        }
        zzale.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzale.zza(this.zzr, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0629 A[Catch: all -> 0x0622, TryCatch #2 {all -> 0x0622, blocks: (B:156:0x05fe, B:166:0x0624, B:168:0x0629, B:169:0x062e, B:53:0x00d8, B:54:0x00ea, B:55:0x00fc, B:56:0x010e, B:57:0x011f, B:58:0x0130, B:60:0x013a, B:63:0x0141, B:64:0x0147, B:65:0x0154, B:66:0x0165, B:67:0x0172, B:68:0x0183, B:70:0x018e, B:71:0x019f, B:72:0x01b0, B:73:0x01c1, B:74:0x01d2, B:75:0x01e3, B:76:0x01f4, B:77:0x0205, B:78:0x0217, B:80:0x0227, B:84:0x0248, B:81:0x0231, B:83:0x0239, B:85:0x0259, B:86:0x026b, B:87:0x0279, B:88:0x0287, B:89:0x0295), top: B:197:0x05fe }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0667 A[LOOP:1: B:185:0x0663->B:187:0x0667, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0634 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0652 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzald] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzald zzaldVar, zzaip zzaipVar) throws Throwable {
        Object obj;
        zzamb zzambVar;
        T t2;
        int i2;
        zzair<?> zzairVar;
        zzaip zzaipVar2;
        Object objZza;
        Object obj2;
        zzamb zzambVar2;
        T t3;
        T t4 = t;
        zzaip zzaipVar3 = zzaipVar;
        zzaipVar.getClass();
        zzf(t);
        zzamb zzambVar3 = this.zzq;
        zzair<?> zzairVar2 = this.zzr;
        Object objZza2 = null;
        zzais zzaisVarZzb = null;
        while (true) {
            try {
                int iZzc = zzaldVar.zzc();
                int iZza = zza(iZzc);
                if (iZza < 0) {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i3 = this.zzm; i3 < this.zzn; i3++) {
                            objZza2 = zza((Object) t, this.zzl[i3], (int) objZza2, (zzamb<UT, int>) zzambVar3, (Object) t);
                        }
                        if (objZza2 != null) {
                            zzambVar3.zzb((Object) t4, (T) objZza2);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objZza3 = !this.zzh ? null : zzairVar2.zza(zzaipVar3, this.zzg, iZzc);
                        if (objZza3 != null) {
                            if (zzaisVarZzb == null) {
                                try {
                                    zzaisVarZzb = zzairVar2.zzb(t4);
                                    zzais zzaisVar = zzaisVarZzb;
                                    zzambVar2 = zzambVar3;
                                    t3 = t4;
                                    try {
                                        objZza2 = zzairVar2.zza(t, zzaldVar, objZza3, zzaipVar, zzaisVar, objZza2, zzambVar2);
                                        zzaisVarZzb = zzaisVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        t2 = t3;
                                        zzambVar = zzambVar2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    zzambVar = zzambVar3;
                                    t2 = t4;
                                }
                            } else {
                                zzais zzaisVar2 = zzaisVarZzb;
                                zzambVar2 = zzambVar3;
                                t3 = t4;
                                objZza2 = zzairVar2.zza(t, zzaldVar, objZza3, zzaipVar, zzaisVar2, objZza2, zzambVar2);
                                zzaisVarZzb = zzaisVar2;
                            }
                            zzairVar = zzairVar2;
                            zzaipVar2 = zzaipVar3;
                            t4 = t2;
                            zzairVar2 = zzairVar;
                            zzaipVar3 = zzaipVar2;
                            zzambVar3 = zzambVar;
                        } else {
                            zzambVar2 = zzambVar3;
                            t3 = t4;
                            zzambVar2.zza((zzald) zzaldVar);
                            if (objZza2 == null) {
                                objZza2 = zzambVar2.zzc(t3);
                            }
                            if (!zzambVar2.zza((zzamb) objZza2, (zzald) zzaldVar)) {
                                int i4 = this.zzm;
                                while (i4 < this.zzn) {
                                    zzamb zzambVar4 = zzambVar2;
                                    objZza2 = zza((Object) t, this.zzl[i4], (int) objZza2, (zzamb<UT, int>) zzambVar4, (Object) t);
                                    i4++;
                                    t3 = t3;
                                    zzambVar2 = zzambVar4;
                                }
                                Object obj3 = t3;
                                zzamb zzambVar5 = zzambVar2;
                                if (objZza2 != null) {
                                    zzambVar5.zzb(obj3, objZza2);
                                    return;
                                }
                                return;
                            }
                        }
                        t2 = t3;
                        zzambVar = zzambVar2;
                        zzairVar = zzairVar2;
                        zzaipVar2 = zzaipVar3;
                        t4 = t2;
                        zzairVar2 = zzairVar;
                        zzaipVar3 = zzaipVar2;
                        zzambVar3 = zzambVar;
                    } catch (Throwable th3) {
                        th = th3;
                        zzambVar = zzambVar3;
                        t2 = t4;
                        obj = objZza2;
                        objZza2 = obj;
                        while (i2 < this.zzn) {
                        }
                        if (objZza2 != null) {
                        }
                        throw th;
                    }
                } else {
                    zzambVar = zzambVar3;
                    t2 = t4;
                    try {
                        int iZzc2 = zzc(iZza);
                        switch ((267386880 & iZzc2) >>> 20) {
                            case 0:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza(t2, iZzc2 & 1048575, zzaldVar.zza());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 1:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzb());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 2:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzl());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 3:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzo());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 4:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzg());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 5:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzk());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 6:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzf());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 7:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zzc(t2, iZzc2 & 1048575, zzaldVar.zzs());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 8:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zza((Object) t2, iZzc2, (zzald) zzaldVar);
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 9:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzakk zzakkVar = (zzakk) zza((zzako<T>) t2, iZza);
                                zzaldVar.zzb(zzakkVar, zze(iZza), zzaipVar2);
                                zza((zzako<T>) t2, iZza, zzakkVar);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 10:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza(t2, iZzc2 & 1048575, zzaldVar.zzp());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 11:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzj());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 12:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                int iZze = zzaldVar.zze();
                                zzajh zzajhVarZzd = zzd(iZza);
                                if (zzajhVarZzd != null && !zzajhVarZzd.zza(iZze)) {
                                    objZza2 = zzale.zza(t2, iZzc, iZze, obj2, zzambVar);
                                    t4 = t2;
                                    zzairVar2 = zzairVar;
                                    zzaipVar3 = zzaipVar2;
                                    zzambVar3 = zzambVar;
                                }
                                zzamh.zza((Object) t2, iZzc2 & 1048575, iZze);
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                                break;
                            case 13:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzh());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 14:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzm());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 15:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzi());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzamh.zza((Object) t2, iZzc2 & 1048575, zzaldVar.zzn());
                                zzb((zzako<T>) t2, iZza);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 17:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzakk zzakkVar2 = (zzakk) zza((zzako<T>) t2, iZza);
                                zzaldVar.zza(zzakkVar2, zze(iZza), zzaipVar2);
                                zza((zzako<T>) t2, iZza, zzakkVar2);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 18:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzc(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 19:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzg(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 20:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzi(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 21:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzq(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 22:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzh(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 23:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzf(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 24:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zze(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 25:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zza(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 26:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                if (zzg(iZzc2)) {
                                    zzaldVar.zzo(this.zzp.zza(t2, iZzc2 & 1048575));
                                } else {
                                    zzaldVar.zzn(this.zzp.zza(t2, iZzc2 & 1048575));
                                }
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzb(this.zzp.zza(t2, iZzc2 & 1048575), zze(iZza), zzaipVar2);
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 28:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzb(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 29:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzp(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 30:
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                List listZza = this.zzp.zza(t2, iZzc2 & 1048575);
                                zzaldVar.zzd(listZza);
                                objZza = zzale.zza(t, iZzc, listZza, zzd(iZza), objZza2, zzambVar);
                                objZza2 = objZza;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 31:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzj(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzk(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzl(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 34:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzm(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 35:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzc(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 36:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzg(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 37:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzi(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 38:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzq(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 39:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzh(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 40:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzf(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 41:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zze(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 42:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zza(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 43:
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                zzaldVar.zzp(this.zzp.zza(t2, iZzc2 & 1048575));
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 44:
                                try {
                                    List listZza2 = this.zzp.zza(t2, iZzc2 & 1048575);
                                    zzaldVar.zzd(listZza2);
                                    zzairVar = zzairVar2;
                                    zzaipVar2 = zzaipVar3;
                                    objZza = zzale.zza(t, iZzc, listZza2, zzd(iZza), objZza2, zzambVar);
                                    objZza2 = objZza;
                                    t4 = t2;
                                    zzairVar2 = zzairVar;
                                    zzaipVar3 = zzaipVar2;
                                    zzambVar3 = zzambVar;
                                } catch (Throwable th4) {
                                    th = th4;
                                    break;
                                }
                            case 45:
                                zzaldVar.zzj(this.zzp.zza(t2, iZzc2 & 1048575));
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 46:
                                zzaldVar.zzk(this.zzp.zza(t2, iZzc2 & 1048575));
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 47:
                                zzaldVar.zzl(this.zzp.zza(t2, iZzc2 & 1048575));
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 48:
                                zzaldVar.zzm(this.zzp.zza(t2, iZzc2 & 1048575));
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 49:
                                zzaldVar.zza(this.zzp.zza(t2, iZzc2 & 1048575), zze(iZza), zzaipVar3);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 50:
                                Object objZzf = zzf(iZza);
                                long jZzc = zzc(iZza) & 1048575;
                                Object objZze = zzamh.zze(t2, jZzc);
                                if (objZze == null) {
                                    objZze = this.zzs.zzb(objZzf);
                                    zzamh.zza(t2, jZzc, objZze);
                                } else if (this.zzs.zzf(objZze)) {
                                    Object objZzb = this.zzs.zzb(objZzf);
                                    this.zzs.zza(objZzb, objZze);
                                    zzamh.zza(t2, jZzc, objZzb);
                                    objZze = objZzb;
                                }
                                zzaldVar.zza(this.zzs.zze(objZze), this.zzs.zza(objZzf), zzaipVar3);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 51:
                                zzamh.zza(t2, iZzc2 & 1048575, Double.valueOf(zzaldVar.zza()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 52:
                                zzamh.zza(t2, iZzc2 & 1048575, Float.valueOf(zzaldVar.zzb()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 53:
                                zzamh.zza(t2, iZzc2 & 1048575, Long.valueOf(zzaldVar.zzl()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                                zzamh.zza(t2, iZzc2 & 1048575, Long.valueOf(zzaldVar.zzo()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 55:
                                zzamh.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzaldVar.zzg()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 56:
                                zzamh.zza(t2, iZzc2 & 1048575, Long.valueOf(zzaldVar.zzk()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 57:
                                zzamh.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzaldVar.zzf()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 58:
                                zzamh.zza(t2, iZzc2 & 1048575, Boolean.valueOf(zzaldVar.zzs()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 59:
                                zza((Object) t2, iZzc2, (zzald) zzaldVar);
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 60:
                                zzakk zzakkVar3 = (zzakk) zza((zzako<T>) t2, iZzc, iZza);
                                zzaldVar.zzb(zzakkVar3, zze(iZza), zzaipVar3);
                                zza((zzako<T>) t2, iZzc, iZza, zzakkVar3);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 61:
                                zzamh.zza(t2, iZzc2 & 1048575, zzaldVar.zzp());
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 62:
                                zzamh.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzaldVar.zzj()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 63:
                                int iZze2 = zzaldVar.zze();
                                zzajh zzajhVarZzd2 = zzd(iZza);
                                if (zzajhVarZzd2 != null && !zzajhVarZzd2.zza(iZze2)) {
                                    objZza2 = zzale.zza(t2, iZzc, iZze2, objZza2, zzambVar);
                                    zzambVar = zzambVar;
                                    zzairVar = zzairVar2;
                                    zzaipVar2 = zzaipVar3;
                                    t4 = t2;
                                    zzairVar2 = zzairVar;
                                    zzaipVar3 = zzaipVar2;
                                    zzambVar3 = zzambVar;
                                }
                                zzamh.zza(t2, iZzc2 & 1048575, Integer.valueOf(iZze2));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                                break;
                            case 64:
                                zzamh.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzaldVar.zzh()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 65:
                                zzamh.zza(t2, iZzc2 & 1048575, Long.valueOf(zzaldVar.zzm()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 66:
                                zzamh.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzaldVar.zzi()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 67:
                                zzamh.zza(t2, iZzc2 & 1048575, Long.valueOf(zzaldVar.zzn()));
                                zzb((zzako<T>) t2, iZzc, iZza);
                                obj2 = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                objZza2 = obj2;
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            case 68:
                                try {
                                    zzakk zzakkVar4 = (zzakk) zza((zzako<T>) t2, iZzc, iZza);
                                    zzaldVar.zza(zzakkVar4, zze(iZza), zzaipVar3);
                                    zza((zzako<T>) t2, iZzc, iZza, zzakkVar4);
                                    obj2 = objZza2;
                                    zzairVar = zzairVar2;
                                    zzaipVar2 = zzaipVar3;
                                    objZza2 = obj2;
                                } catch (zzaji unused) {
                                    obj = objZza2;
                                    zzairVar = zzairVar2;
                                    zzaipVar2 = zzaipVar3;
                                    objZza2 = obj;
                                    zzambVar.zza((zzald) zzaldVar);
                                    if (objZza2 == null) {
                                        objZza2 = zzambVar.zzc(t2);
                                    }
                                    if (!zzambVar.zza((zzamb) objZza2, (zzald) zzaldVar)) {
                                        for (int i5 = this.zzm; i5 < this.zzn; i5++) {
                                            objZza2 = zza((Object) t, this.zzl[i5], (int) objZza2, (zzamb<UT, int>) zzambVar, (Object) t);
                                        }
                                        if (objZza2 != null) {
                                            zzambVar.zzb((Object) t2, (T) objZza2);
                                            return;
                                        }
                                        return;
                                    }
                                    t4 = t2;
                                    zzairVar2 = zzairVar;
                                    zzaipVar3 = zzaipVar2;
                                    zzambVar3 = zzambVar;
                                }
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                            default:
                                obj = objZza2;
                                zzairVar = zzairVar2;
                                zzaipVar2 = zzaipVar3;
                                if (obj == null) {
                                    try {
                                        objZza2 = zzambVar.zzc(t2);
                                    } catch (zzaji unused2) {
                                        objZza2 = obj;
                                        zzambVar.zza((zzald) zzaldVar);
                                        if (objZza2 == null) {
                                        }
                                        if (!zzambVar.zza((zzamb) objZza2, (zzald) zzaldVar)) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        objZza2 = obj;
                                        while (i2 < this.zzn) {
                                        }
                                        if (objZza2 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    objZza2 = obj;
                                }
                                try {
                                    try {
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (zzaji unused3) {
                                    zzambVar.zza((zzald) zzaldVar);
                                    if (objZza2 == null) {
                                    }
                                    if (!zzambVar.zza((zzamb) objZza2, (zzald) zzaldVar)) {
                                    }
                                }
                                if (!zzambVar.zza((zzamb) objZza2, (zzald) zzaldVar)) {
                                    for (int i6 = this.zzm; i6 < this.zzn; i6++) {
                                        objZza2 = zza((Object) t, this.zzl[i6], (int) objZza2, (zzamb<UT, int>) zzambVar, (Object) t);
                                    }
                                    if (objZza2 != null) {
                                        zzambVar.zzb((Object) t2, (T) objZza2);
                                        return;
                                    }
                                    return;
                                }
                                t4 = t2;
                                zzairVar2 = zzairVar;
                                zzaipVar3 = zzaipVar2;
                                zzambVar3 = zzambVar;
                                break;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        obj = objZza2;
                        objZza2 = obj;
                        while (i2 < this.zzn) {
                        }
                        if (objZza2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                obj = objZza2;
                zzambVar = zzambVar3;
                t2 = t4;
            }
            for (i2 = this.zzm; i2 < this.zzn; i2++) {
                objZza2 = zza((Object) t, this.zzl[i2], (int) objZza2, (zzamb<UT, int>) zzambVar, (Object) t);
            }
            if (objZza2 != null) {
                zzambVar.zzb((Object) t2, (T) objZza2);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final void zza(T t, byte[] bArr, int i2, int i3, zzahl zzahlVar) throws IOException {
        zza((zzako<T>) t, bArr, i2, i3, 0, zzahlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i2) {
        if (zzc((zzako<T>) t2, i2)) {
            long jZzc = zzc(i2) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + String.valueOf(t2));
            }
            zzalc zzalcVarZze = zze(i2);
            if (!zzc((zzako<T>) t, i2)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, jZzc, object);
                } else {
                    Object objZza = zzalcVarZze.zza();
                    zzalcVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                }
                zzb((zzako<T>) t, i2);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzalcVarZze.zza();
                zzalcVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzalcVarZze.zza(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i2) {
        int i3 = this.zzc[i2];
        if (zzc((zzako<T>) t2, i3, i2)) {
            long jZzc = zzc(i2) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + String.valueOf(t2));
            }
            zzalc zzalcVarZze = zze(i2);
            if (!zzc((zzako<T>) t, i3, i2)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, jZzc, object);
                } else {
                    Object objZza = zzalcVarZze.zza();
                    zzalcVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                }
                zzb((zzako<T>) t, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzalcVarZze.zza();
                zzalcVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzalcVarZze.zza(object2, object);
        }
    }

    private final void zza(Object obj, int i2, zzald zzaldVar) throws IOException {
        if (zzg(i2)) {
            zzamh.zza(obj, i2 & 1048575, zzaldVar.zzr());
        } else if (this.zzi) {
            zzamh.zza(obj, i2 & 1048575, zzaldVar.zzq());
        } else {
            zzamh.zza(obj, i2 & 1048575, zzaldVar.zzp());
        }
    }

    private final void zzb(T t, int i2) {
        int iZzb = zzb(i2);
        long j = 1048575 & iZzb;
        if (j == 1048575) {
            return;
        }
        zzamh.zza((Object) t, j, (1 << (iZzb >>> 20)) | zzamh.zzc(t, j));
    }

    private final void zzb(T t, int i2, int i3) {
        zzamh.zza((Object) t, zzb(i3) & 1048575, i2);
    }

    private final void zza(T t, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzako<T>) t, i2);
    }

    private final void zza(T t, int i2, int i3, Object obj) {
        zzb.putObject(t, zzc(i3) & 1048575, obj);
        zzb((zzako<T>) t, i2, i3);
    }

    private final <K, V> void zza(zzanb zzanbVar, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            zzanbVar.zza(i2, this.zzs.zza(zzf(i3)), this.zzs.zzd(obj));
        }
    }

    private static void zza(int i2, Object obj, zzanb zzanbVar) throws IOException {
        if (obj instanceof String) {
            zzanbVar.zza(i2, (String) obj);
        } else {
            zzanbVar.zza(i2, (zzahm) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzanb zzanbVar) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i2;
        int i3;
        Map.Entry<?, ?> entry2;
        int i4;
        int i5;
        Map.Entry<?, ?> entry3;
        int i6;
        Iterator it2;
        int i7;
        boolean z;
        boolean z2;
        int i8;
        Unsafe unsafe;
        boolean z3;
        boolean z4;
        boolean z5;
        Iterator itZzc;
        Map.Entry<?, ?> entry4;
        int i9 = 1048575;
        int i10 = 267386880;
        if (zzanbVar.zza() == zzana.zzb) {
            zza(this.zzq, t, zzanbVar);
            if (this.zzh) {
                zzais<T> zzaisVarZza = this.zzr.zza(t);
                if (zzaisVarZza.zza.isEmpty()) {
                    itZzc = null;
                    entry4 = null;
                } else {
                    itZzc = zzaisVarZza.zzc();
                    entry4 = (Map.Entry) itZzc.next();
                }
            }
            for (int length = this.zzc.length - 3; length >= 0; length -= 3) {
                int iZzc = zzc(length);
                int i11 = this.zzc[length];
                while (entry4 != null && this.zzr.zza(entry4) > i11) {
                    this.zzr.zza(zzanbVar, entry4);
                    entry4 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
                }
                switch ((iZzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zza(i11, zzamh.zza(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zza(i11, zzamh.zzb(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zzb(i11, zzamh.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zze(i11, zzamh.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zzc(i11, zzamh.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zza(i11, zzamh.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zzb(i11, zzamh.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zza(i11, zzamh.zzh(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzc((zzako<T>) t, length)) {
                            zza(i11, zzamh.zze(t, iZzc & 1048575), zzanbVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zzb(i11, zzamh.zze(t, iZzc & 1048575), zze(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zza(i11, (zzahm) zzamh.zze(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zzf(i11, zzamh.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zza(i11, zzamh.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zzd(i11, zzamh.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zzc(i11, zzamh.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zze(i11, zzamh.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zzd(i11, zzamh.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzc((zzako<T>) t, length)) {
                            zzanbVar.zza(i11, zzamh.zze(t, iZzc & 1048575), zze(length));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzale.zzb(this.zzc[length], (List<Double>) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 19:
                        zzale.zzf(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 20:
                        zzale.zzh(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 21:
                        zzale.zzn(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 22:
                        zzale.zzg(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 23:
                        zzale.zze(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 24:
                        zzale.zzd(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 25:
                        zzale.zza(this.zzc[length], (List<Boolean>) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 26:
                        zzale.zzb(this.zzc[length], (List<String>) zzamh.zze(t, iZzc & 1048575), zzanbVar);
                        break;
                    case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                        zzale.zzb(this.zzc[length], (List<?>) zzamh.zze(t, iZzc & 1048575), zzanbVar, zze(length));
                        break;
                    case 28:
                        zzale.zza(this.zzc[length], (List<zzahm>) zzamh.zze(t, iZzc & 1048575), zzanbVar);
                        break;
                    case 29:
                        zzale.zzm(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 30:
                        zzale.zzc(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 31:
                        zzale.zzi(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                        zzale.zzj(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        zzale.zzk(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 34:
                        zzale.zzl(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, false);
                        break;
                    case 35:
                        zzale.zzb(this.zzc[length], (List<Double>) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 36:
                        zzale.zzf(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 37:
                        zzale.zzh(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 38:
                        zzale.zzn(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 39:
                        zzale.zzg(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 40:
                        zzale.zze(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 41:
                        zzale.zzd(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 42:
                        zzale.zza(this.zzc[length], (List<Boolean>) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 43:
                        zzale.zzm(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 44:
                        zzale.zzc(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 45:
                        zzale.zzi(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 46:
                        zzale.zzj(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 47:
                        zzale.zzk(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 48:
                        zzale.zzl(this.zzc[length], (List) zzamh.zze(t, iZzc & 1048575), zzanbVar, true);
                        break;
                    case 49:
                        zzale.zza(this.zzc[length], (List<?>) zzamh.zze(t, iZzc & 1048575), zzanbVar, zze(length));
                        break;
                    case 50:
                        zza(zzanbVar, i11, zzamh.zze(t, iZzc & 1048575), length);
                        break;
                    case 51:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zza(i11, zza(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zza(i11, zzb(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zzb(i11, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zze(i11, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zzc(i11, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zza(i11, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zzb(i11, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zza(i11, zze(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zza(i11, zzamh.zze(t, iZzc & 1048575), zzanbVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zzb(i11, zzamh.zze(t, iZzc & 1048575), zze(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zza(i11, (zzahm) zzamh.zze(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zzf(i11, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zza(i11, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zzd(i11, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zzc(i11, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zze(i11, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zzd(i11, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzc((zzako<T>) t, i11, length)) {
                            zzanbVar.zza(i11, zzamh.zze(t, iZzc & 1048575), zze(length));
                            break;
                        } else {
                            break;
                        }
                }
            }
            while (entry4 != null) {
                this.zzr.zza(zzanbVar, entry4);
                entry4 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
            }
            return;
        }
        if (this.zzh) {
            zzais<T> zzaisVarZza2 = this.zzr.zza(t);
            if (zzaisVarZza2.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzd = zzaisVarZza2.zzd();
                entry = (Map.Entry) itZzd.next();
                it = itZzd;
            }
        }
        int length2 = this.zzc.length;
        Unsafe unsafe2 = zzb;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < length2) {
            int iZzc2 = zzc(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int i16 = (iZzc2 & i10) >>> 20;
            if (i16 <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i9;
                i2 = i16;
                if (i18 != i14) {
                    i12 = i18 == i9 ? 0 : unsafe2.getInt(t, i18);
                    i14 = i18;
                }
                entry2 = entry;
                i4 = i12;
                i5 = 1 << (i17 >>> 20);
                i3 = i14;
            } else {
                i2 = i16;
                i3 = i14;
                entry2 = entry;
                i4 = i12;
                i5 = 0;
            }
            while (entry2 != null && this.zzr.zza(entry2) <= i15) {
                this.zzr.zza(zzanbVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzc2 & 1048575;
            switch (i2) {
                case 0:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zza(i15, zzamh.zza(t, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zza(i15, zzamh.zzb(t, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zzb(i15, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zze(i15, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zzc(i15, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zza(i15, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zzb(i15, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zza(i15, zzamh.zzh(t, j));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zza(i15, unsafe.getObject(t, j), zzanbVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zzb(i15, unsafe.getObject(t, j), zze(i8));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zza(i15, (zzahm) unsafe.getObject(t, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zzf(i15, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zza(i15, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zzd(i15, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zzc(i15, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zze(i15, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i8, i3, i6, i5)) {
                        zzanbVar.zzd(i15, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    z = false;
                    z2 = true;
                    it2 = it;
                    i7 = length2;
                    entry3 = entry2;
                    i8 = i13;
                    int i19 = i4;
                    i6 = i4;
                    unsafe = unsafe2;
                    if (zza((zzako<T>) t, i13, i3, i19, i5)) {
                        zzanbVar.zza(i15, unsafe.getObject(t, j), zze(i8));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z3 = true;
                    z4 = false;
                    zzale.zzb(this.zzc[i13], (List<Double>) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 19:
                    z3 = true;
                    z4 = false;
                    zzale.zzf(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 20:
                    z3 = true;
                    z4 = false;
                    zzale.zzh(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 21:
                    z3 = true;
                    z4 = false;
                    zzale.zzn(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 22:
                    z3 = true;
                    z4 = false;
                    zzale.zzg(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 23:
                    z3 = true;
                    z4 = false;
                    zzale.zze(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 24:
                    z3 = true;
                    z4 = false;
                    zzale.zzd(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 25:
                    z3 = true;
                    z4 = false;
                    zzale.zza(this.zzc[i13], (List<Boolean>) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 26:
                    z5 = true;
                    zzale.zzb(this.zzc[i13], (List<String>) unsafe2.getObject(t, j), zzanbVar);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    z5 = true;
                    zzale.zzb(this.zzc[i13], (List<?>) unsafe2.getObject(t, j), zzanbVar, zze(i13));
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 28:
                    z5 = true;
                    zzale.zza(this.zzc[i13], (List<zzahm>) unsafe2.getObject(t, j), zzanbVar);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 29:
                    z3 = true;
                    z4 = false;
                    zzale.zzm(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 30:
                    z3 = true;
                    z4 = false;
                    zzale.zzc(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 31:
                    z3 = true;
                    z4 = false;
                    zzale.zzi(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    z3 = true;
                    z4 = false;
                    zzale.zzj(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    z3 = true;
                    z4 = false;
                    zzale.zzk(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 34:
                    z3 = true;
                    z4 = false;
                    zzale.zzl(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, false);
                    z2 = z3;
                    entry3 = entry2;
                    i6 = i4;
                    z = z4;
                    it2 = it;
                    i7 = length2;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 35:
                    z5 = true;
                    zzale.zzb(this.zzc[i13], (List<Double>) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 36:
                    z5 = true;
                    zzale.zzf(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 37:
                    z5 = true;
                    zzale.zzh(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 38:
                    z5 = true;
                    zzale.zzn(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 39:
                    z5 = true;
                    zzale.zzg(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 40:
                    z5 = true;
                    zzale.zze(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 41:
                    z5 = true;
                    zzale.zzd(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 42:
                    z5 = true;
                    zzale.zza(this.zzc[i13], (List<Boolean>) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 43:
                    z5 = true;
                    zzale.zzm(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 44:
                    z5 = true;
                    zzale.zzc(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 45:
                    z5 = true;
                    zzale.zzi(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 46:
                    z5 = true;
                    zzale.zzj(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 47:
                    z5 = true;
                    zzale.zzk(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 48:
                    z5 = true;
                    zzale.zzl(this.zzc[i13], (List) unsafe2.getObject(t, j), zzanbVar, true);
                    z2 = z5;
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 49:
                    zzale.zza(this.zzc[i13], (List<?>) unsafe2.getObject(t, j), zzanbVar, zze(i13));
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 50:
                    zza(zzanbVar, i15, unsafe2.getObject(t, j), i13);
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 51:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zza(i15, zza(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 52:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zza(i15, zzb(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 53:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zzb(i15, zzd(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zze(i15, zzd(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 55:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zzc(i15, zzc(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 56:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zza(i15, zzd(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 57:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zzb(i15, zzc(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 58:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zza(i15, zze(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 59:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zza(i15, unsafe2.getObject(t, j), zzanbVar);
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 60:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zzb(i15, unsafe2.getObject(t, j), zze(i13));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 61:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zza(i15, (zzahm) unsafe2.getObject(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 62:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zzf(i15, zzc(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 63:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zza(i15, zzc(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 64:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zzd(i15, zzc(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 65:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zzc(i15, zzd(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 66:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zze(i15, zzc(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 67:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zzd(i15, zzd(t, j));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                case 68:
                    if (zzc((zzako<T>) t, i15, i13)) {
                        zzanbVar.zza(i15, unsafe2.getObject(t, j), zze(i13));
                    }
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
                default:
                    entry3 = entry2;
                    i6 = i4;
                    it2 = it;
                    i7 = length2;
                    z = false;
                    z2 = true;
                    i8 = i13;
                    unsafe = unsafe2;
                    break;
            }
            i13 = i8 + 3;
            i14 = i3;
            unsafe2 = unsafe;
            i9 = 1048575;
            it = it2;
            length2 = i7;
            entry = entry3;
            i12 = i6;
            i10 = 267386880;
        }
        Iterator it3 = it;
        while (entry != null) {
            this.zzr.zza(zzanbVar, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        zza(this.zzq, t, zzanbVar);
    }

    private static <UT, UB> void zza(zzamb<UT, UB> zzambVar, T t, zzanb zzanbVar) throws IOException {
        zzambVar.zzb((zzamb<UT, UB>) zzambVar.zzd(t), zzanbVar);
    }

    private final boolean zzc(T t, T t2, int i2) {
        return zzc((zzako<T>) t, i2) == zzc((zzako<T>) t2, i2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final boolean zzb(T t, T t2) {
        boolean zZza;
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iZzc = zzc(i2);
            long j = iZzc & 1048575;
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (!zzc(t, t2, i2) || Double.doubleToLongBits(zzamh.zza(t, j)) != Double.doubleToLongBits(zzamh.zza(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzc(t, t2, i2) || Float.floatToIntBits(zzamh.zzb(t, j)) != Float.floatToIntBits(zzamh.zzb(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzc(t, t2, i2) || zzamh.zzd(t, j) != zzamh.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzc(t, t2, i2) || zzamh.zzd(t, j) != zzamh.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzc(t, t2, i2) || zzamh.zzc(t, j) != zzamh.zzc(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzc(t, t2, i2) || zzamh.zzd(t, j) != zzamh.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzc(t, t2, i2) || zzamh.zzc(t, j) != zzamh.zzc(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzc(t, t2, i2) || zzamh.zzh(t, j) != zzamh.zzh(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzc(t, t2, i2) || !zzale.zza(zzamh.zze(t, j), zzamh.zze(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzc(t, t2, i2) || !zzale.zza(zzamh.zze(t, j), zzamh.zze(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzc(t, t2, i2) || !zzale.zza(zzamh.zze(t, j), zzamh.zze(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzc(t, t2, i2) || zzamh.zzc(t, j) != zzamh.zzc(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzc(t, t2, i2) || zzamh.zzc(t, j) != zzamh.zzc(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzc(t, t2, i2) || zzamh.zzc(t, j) != zzamh.zzc(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzc(t, t2, i2) || zzamh.zzd(t, j) != zzamh.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzc(t, t2, i2) || zzamh.zzc(t, j) != zzamh.zzc(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    if (!zzc(t, t2, i2) || zzamh.zzd(t, j) != zzamh.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzc(t, t2, i2) || !zzale.zza(zzamh.zze(t, j), zzamh.zze(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                case 28:
                case 29:
                case 30:
                case 31:
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZza = zzale.zza(zzamh.zze(t, j), zzamh.zze(t2, j));
                    break;
                case 50:
                    zZza = zzale.zza(zzamh.zze(t, j), zzamh.zze(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzb = zzb(i2) & 1048575;
                    if (zzamh.zzc(t, jZzb) != zzamh.zzc(t2, jZzb) || !zzale.zza(zzamh.zze(t, j), zzamh.zze(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZza) {
                return false;
            }
        }
        if (!this.zzq.zzd(t).equals(this.zzq.zzd(t2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzr.zza(t).equals(this.zzr.zza(t2));
        }
        return true;
    }

    private final boolean zzc(T t, int i2) {
        int iZzb = zzb(i2);
        long j = iZzb & 1048575;
        if (j != 1048575) {
            return (zzamh.zzc(t, j) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i2);
        long j2 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzamh.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzamh.zzb(t, j2)) != 0;
            case 2:
                return zzamh.zzd(t, j2) != 0;
            case 3:
                return zzamh.zzd(t, j2) != 0;
            case 4:
                return zzamh.zzc(t, j2) != 0;
            case 5:
                return zzamh.zzd(t, j2) != 0;
            case 6:
                return zzamh.zzc(t, j2) != 0;
            case 7:
                return zzamh.zzh(t, j2);
            case 8:
                Object objZze = zzamh.zze(t, j2);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzahm) {
                    return !zzahm.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzamh.zze(t, j2) != null;
            case 10:
                return !zzahm.zza.equals(zzamh.zze(t, j2));
            case 11:
                return zzamh.zzc(t, j2) != 0;
            case 12:
                return zzamh.zzc(t, j2) != 0;
            case 13:
                return zzamh.zzc(t, j2) != 0;
            case 14:
                return zzamh.zzd(t, j2) != 0;
            case 15:
                return zzamh.zzc(t, j2) != 0;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                return zzamh.zzd(t, j2) != 0;
            case 17:
                return zzamh.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return zzc((zzako<T>) t, i2);
        }
        return (i4 & i5) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzalc] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzalc] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzm) {
            int i7 = this.zzl[i6];
            int i8 = this.zzc[i7];
            int iZzc = zzc(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(t, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if ((268435456 & iZzc) != 0 && !zza((zzako<T>) t, i7, i2, i3, i11)) {
                return false;
            }
            int i12 = (267386880 & iZzc) >>> 20;
            if (i12 == 9 || i12 == 17) {
                if (zza((zzako<T>) t, i7, i2, i3, i11) && !zza((Object) t, iZzc, zze(i7))) {
                    return false;
                }
            } else if (i12 == 27) {
                List list = (List) zzamh.zze(t, iZzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? Zze = zze(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!Zze.zzd(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (i12 == 60 || i12 == 68) {
                if (zzc((zzako<T>) t, i8, i7) && !zza((Object) t, iZzc, zze(i7))) {
                    return false;
                }
            } else if (i12 != 49) {
                if (i12 != 50) {
                    continue;
                } else {
                    Map<?, ?> mapZzd = this.zzs.zzd(zzamh.zze(t, iZzc & 1048575));
                    if (mapZzd.isEmpty()) {
                        continue;
                    } else if (this.zzs.zza(zzf(i7)).zzc.zzb() == zzamy.MESSAGE) {
                        ?? Zza = 0;
                        for (Object obj : mapZzd.values()) {
                            Zza = Zza;
                            if (Zza == 0) {
                                Zza = zzaky.zza().zza((Class) obj.getClass());
                            }
                            if (!Zza.zzd(obj)) {
                                return false;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        return !this.zzh || this.zzr.zza(t).zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i2, zzalc zzalcVar) {
        return zzalcVar.zzd(zzamh.zze(obj, i2 & 1048575));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaja) {
            return ((zzaja) obj).zzv();
        }
        return true;
    }

    private final boolean zzc(T t, int i2, int i3) {
        return zzamh.zzc(t, (long) (zzb(i3) & 1048575)) == i2;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzamh.zze(t, j)).booleanValue();
    }
}
