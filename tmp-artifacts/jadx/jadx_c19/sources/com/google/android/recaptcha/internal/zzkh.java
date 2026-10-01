package com.google.android.recaptcha.internal;

import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
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
final class zzkh<T> implements zzkr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzlv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzke zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzjs zzm;
    private final zzll zzn;
    private final zzif zzo;
    private final zzkk zzp;
    private final zzjz zzq;

    private zzkh(int[] iArr, Object[] objArr, int i2, int i3, zzke zzkeVar, int i4, boolean z, int[] iArr2, int i5, int i6, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = zzkeVar instanceof zzit;
        boolean z2 = false;
        if (zzifVar != null && zzifVar.zzj(zzkeVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i5;
        this.zzl = i6;
        this.zzp = zzkkVar;
        this.zzm = zzjsVar;
        this.zzn = zzllVar;
        this.zzo = zzifVar;
        this.zzg = zzkeVar;
        this.zzq = zzjzVar;
    }

    private final Object zzA(Object obj, int i2) {
        zzkr zzkrVarZzx = zzx(i2);
        int iZzu = zzu(i2);
        if (!zzN(obj, i2)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, 1048575 & iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i2, int i3) {
        zzkr zzkrVarZzx = zzx(i3);
        if (!zzR(obj, i2, i3)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i3) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i2) {
        if (zzN(obj2, i2)) {
            int iZzu = zzu(i2);
            Unsafe unsafe = zzb;
            long j = iZzu & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzkr zzkrVarZzx = zzx(i2);
            if (!zzN(obj, i2)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzR(obj2, i3, i2)) {
            int iZzu = zzu(i2);
            Unsafe unsafe = zzb;
            long j = iZzu & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzkr zzkrVarZzx = zzx(i2);
            if (!zzR(obj, i3, i2)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i2, zzkq zzkqVar) throws IOException {
        long j = i2 & 1048575;
        if (zzM(i2)) {
            zzlv.zzs(obj, j, zzkqVar.zzs());
        } else if (this.zzi) {
            zzlv.zzs(obj, j, zzkqVar.zzr());
        } else {
            zzlv.zzs(obj, j, zzkqVar.zzp());
        }
    }

    private final void zzH(Object obj, int i2) {
        int iZzr = zzr(i2);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzlv.zzq(obj, j, (1 << (iZzr >>> 20)) | zzlv.zzc(obj, j));
    }

    private final void zzI(Object obj, int i2, int i3) {
        zzlv.zzq(obj, zzr(i3) & 1048575, i2);
    }

    private final void zzJ(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzH(obj, i2);
    }

    private final void zzK(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, zzu(i3) & 1048575, obj2);
        zzI(obj, i2, i3);
    }

    private final boolean zzL(Object obj, Object obj2, int i2) {
        return zzN(obj, i2) == zzN(obj2, i2);
    }

    private static boolean zzM(int i2) {
        return (i2 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i2) {
        int iZzr = zzr(i2);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzlv.zzc(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i2);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzlv.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzlv.zzb(obj, j2)) != 0;
            case 2:
                return zzlv.zzd(obj, j2) != 0;
            case 3:
                return zzlv.zzd(obj, j2) != 0;
            case 4:
                return zzlv.zzc(obj, j2) != 0;
            case 5:
                return zzlv.zzd(obj, j2) != 0;
            case 6:
                return zzlv.zzc(obj, j2) != 0;
            case 7:
                return zzlv.zzw(obj, j2);
            case 8:
                Object objZzf = zzlv.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzgw) {
                    return !zzgw.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzlv.zzf(obj, j2) != null;
            case 10:
                return !zzgw.zzb.equals(zzlv.zzf(obj, j2));
            case 11:
                return zzlv.zzc(obj, j2) != 0;
            case 12:
                return zzlv.zzc(obj, j2) != 0;
            case 13:
                return zzlv.zzc(obj, j2) != 0;
            case 14:
                return zzlv.zzd(obj, j2) != 0;
            case 15:
                return zzlv.zzc(obj, j2) != 0;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                return zzlv.zzd(obj, j2) != 0;
            case 17:
                return zzlv.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzN(obj, i2) : (i4 & i5) != 0;
    }

    private static boolean zzP(Object obj, int i2, zzkr zzkrVar) {
        return zzkrVar.zzl(zzlv.zzf(obj, i2 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i2, int i3) {
        return zzlv.zzc(obj, (long) (zzr(i3) & 1048575)) == i2;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzlv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i2, Object obj, zzmd zzmdVar) throws IOException {
        if (obj instanceof String) {
            zzmdVar.zzG(i2, (String) obj);
        } else {
            zzmdVar.zzd(i2, (zzgw) obj);
        }
    }

    static zzlm zzd(Object obj) {
        zzit zzitVar = (zzit) obj;
        zzlm zzlmVar = zzitVar.zzc;
        if (zzlmVar != zzlm.zzc()) {
            return zzlmVar;
        }
        zzlm zzlmVarZzf = zzlm.zzf();
        zzitVar.zzc = zzlmVarZzf;
        return zzlmVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzkh zzm(Class cls, zzkb zzkbVar, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int i3;
        int[] iArr;
        int i4;
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
        zzkp zzkpVar;
        String str;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int i21;
        int iObjectFieldOffset2;
        Field fieldZzC;
        char cCharAt9;
        int i22;
        int i23;
        Object obj;
        Field fieldZzC2;
        Object obj2;
        Field fieldZzC3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        if (!(zzkbVar instanceof zzkp)) {
            throw null;
        }
        zzkp zzkpVar2 = (zzkp) zzkbVar;
        String strZzd = zzkpVar2.zzd();
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
            i4 = 0;
            i7 = 0;
            i3 = 0;
            i5 = 0;
            iArr = zza;
            i6 = 0;
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
            i3 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i4 = iCharAt6;
            i5 = iCharAt9;
            i6 = iCharAt4;
            i7 = iCharAt7;
            i29 = i53;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzkpVar2.zze();
        Class<?> cls2 = zzkpVar2.zza().getClass();
        int i56 = i5 + iCharAt2;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt + iCharAt];
        int i57 = 0;
        int i58 = 0;
        int i59 = i5;
        int i60 = i56;
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
            if ((iCharAt11 & 1024) != 0) {
                iArr[i58] = i57;
                i58++;
            }
            int i69 = iCharAt11 & OggPageHeader.MAX_SEGMENT_COUNT;
            int i70 = iCharAt11 & 2048;
            int i71 = length;
            int i72 = i7;
            if (i69 >= 51) {
                int i73 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i74 = iCharAt12 & 8191;
                    int i75 = 13;
                    while (true) {
                        i24 = i73 + 1;
                        cCharAt10 = strZzd.charAt(i73);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i74 |= (cCharAt10 & 8191) << i75;
                        i75 += 13;
                        i73 = i24;
                        c2 = 55296;
                    }
                    iCharAt12 = i74 | (cCharAt10 << i75);
                    i73 = i24;
                }
                int i76 = i69 - 51;
                int i77 = i73;
                if (i76 == 9 || i76 == 17) {
                    i23 = i3 + 1;
                    int i78 = i57 / 3;
                    objArr[i78 + i78 + 1] = objArrZze[i3];
                } else {
                    if (i76 == 12) {
                        if (zzkpVar2.zzc() == 1 || i70 != 0) {
                            i23 = i3 + 1;
                            int i79 = i57 / 3;
                            objArr[i79 + i79 + 1] = objArrZze[i3];
                        } else {
                            i70 = 0;
                        }
                    }
                    int i80 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i80];
                    if (obj instanceof Field) {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i80] = fieldZzC2;
                    } else {
                        fieldZzC2 = (Field) obj;
                    }
                    i18 = i4;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    int i81 = i80 + 1;
                    obj2 = objArrZze[i81];
                    if (obj2 instanceof Field) {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i81] = fieldZzC3;
                    } else {
                        fieldZzC3 = (Field) obj2;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                    zzkpVar = zzkpVar2;
                    str = strZzd;
                    i21 = i3;
                    i19 = i77;
                    i20 = 0;
                }
                i3 = i23;
                int i802 = iCharAt12 + iCharAt12;
                obj = objArrZze[i802];
                if (obj instanceof Field) {
                }
                i18 = i4;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                int i812 = i802 + 1;
                obj2 = objArrZze[i812];
                if (obj2 instanceof Field) {
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                zzkpVar = zzkpVar2;
                str = strZzd;
                i21 = i3;
                i19 = i77;
                i20 = 0;
            } else {
                i18 = i4;
                int i82 = i3 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i3]);
                if (i69 == 9 || i69 == 17) {
                    zzkpVar = zzkpVar2;
                    int i83 = i57 / 3;
                    objArr[i83 + i83 + 1] = fieldZzC4.getType();
                } else {
                    if (i69 == 27 || i69 == 49) {
                        zzkpVar = zzkpVar2;
                        i22 = i3 + 2;
                        int i84 = i57 / 3;
                        objArr[i84 + i84 + 1] = objArrZze[i82];
                    } else if (i69 == 12 || i69 == 30 || i69 == 44) {
                        zzkpVar = zzkpVar2;
                        if (zzkpVar2.zzc() == 1 || i70 != 0) {
                            i22 = i3 + 2;
                            int i85 = i57 / 3;
                            objArr[i85 + i85 + 1] = objArrZze[i82];
                        } else {
                            i70 = 0;
                        }
                    } else {
                        if (i69 == 50) {
                            int i86 = i3 + 2;
                            int i87 = i59 + 1;
                            iArr[i59] = i57;
                            int i88 = i57 / 3;
                            int i89 = i88 + i88;
                            objArr[i89] = objArrZze[i82];
                            if (i70 != 0) {
                                objArr[i89 + 1] = objArrZze[i86];
                                i82 = i3 + 3;
                                i59 = i87;
                            } else {
                                i82 = i86;
                                i59 = i87;
                                i70 = 0;
                            }
                        }
                        zzkpVar = zzkpVar2;
                    }
                    i82 = i22;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC4);
                if ((iCharAt11 & 4096) == 0 || i69 > 17) {
                    str = strZzd;
                    i19 = i17;
                    iObjectFieldOffset = 1048575;
                    i20 = 0;
                } else {
                    int i90 = i17 + 1;
                    int iCharAt13 = strZzd.charAt(i17);
                    if (iCharAt13 >= 55296) {
                        int i91 = iCharAt13 & 8191;
                        int i92 = 13;
                        while (true) {
                            i19 = i90 + 1;
                            cCharAt9 = strZzd.charAt(i90);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i91 |= (cCharAt9 & 8191) << i92;
                            i92 += 13;
                            i90 = i19;
                        }
                        iCharAt13 = i91 | (cCharAt9 << i92);
                    } else {
                        i19 = i90;
                    }
                    int i93 = i6 + i6 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i93];
                    str = strZzd;
                    if (obj3 instanceof Field) {
                        fieldZzC = (Field) obj3;
                    } else {
                        fieldZzC = zzC(cls2, (String) obj3);
                        objArrZze[i93] = fieldZzC;
                    }
                    int i94 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC);
                    i20 = i94;
                }
                if (i69 >= 18 && i69 <= 49) {
                    iArr[i60] = iObjectFieldOffset3;
                    i60++;
                }
                i21 = i82;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            iArr2[i57] = iCharAt10;
            iArr2[i57 + 1] = iObjectFieldOffset2 | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i70 != 0 ? Integer.MIN_VALUE : 0) | (i69 << 20);
            iArr2[i57 + 2] = (i20 << 20) | iObjectFieldOffset;
            i3 = i21;
            i57 += 3;
            i29 = i19;
            length = i71;
            zzkpVar2 = zzkpVar;
            strZzd = str;
            i7 = i72;
            i4 = i18;
            c = 55296;
        }
        zzkp zzkpVar3 = zzkpVar2;
        return new zzkh(iArr2, objArr, i4, i7, zzkpVar3.zza(), zzkpVar3.zzc(), false, iArr, i5, i56, zzkkVar, zzjsVar, zzllVar, zzifVar, zzjzVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzlv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzlv.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzlv.zzf(obj, j)).intValue();
    }

    private final int zzq(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzs(i2, 0);
    }

    private final int zzr(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzs(int i2, int i3) {
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

    private static int zzt(int i2) {
        return (i2 >>> 20) & OggPageHeader.MAX_SEGMENT_COUNT;
    }

    private final int zzu(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzlv.zzf(obj, j)).longValue();
    }

    private final zzix zzw(int i2) {
        int i3 = i2 / 3;
        return (zzix) this.zzd[i3 + i3 + 1];
    }

    private final zzkr zzx(int i2) {
        Object[] objArr = this.zzd;
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzkr zzkrVar = (zzkr) objArr[i4];
        if (zzkrVar != null) {
            return zzkrVar;
        }
        zzkr zzkrVarZzb = zzkn.zza().zzb((Class) objArr[i4 + 1]);
        this.zzd[i4] = zzkrVarZzb;
        return zzkrVarZzb;
    }

    private final Object zzy(Object obj, int i2, Object obj2, zzll zzllVar, Object obj3) {
        int i3 = this.zzc[i2];
        Object objZzf = zzlv.zzf(obj, zzu(i2) & 1048575);
        if (objZzf == null || zzw(i2) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0542  */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v122, types: [com.google.android.recaptcha.internal.zzjm] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v269, types: [int] */
    /* JADX WARN: Type inference failed for: r0v277, types: [int] */
    /* JADX WARN: Type inference failed for: r0v283 */
    /* JADX WARN: Type inference failed for: r0v284 */
    /* JADX WARN: Type inference failed for: r0v285 */
    /* JADX WARN: Type inference failed for: r0v286 */
    /* JADX WARN: Type inference failed for: r0v287 */
    /* JADX WARN: Type inference failed for: r0v288 */
    /* JADX WARN: Type inference failed for: r0v289 */
    /* JADX WARN: Type inference failed for: r0v290 */
    /* JADX WARN: Type inference failed for: r0v291 */
    /* JADX WARN: Type inference failed for: r0v292 */
    /* JADX WARN: Type inference failed for: r0v293 */
    /* JADX WARN: Type inference failed for: r0v294 */
    /* JADX WARN: Type inference failed for: r0v295 */
    /* JADX WARN: Type inference failed for: r0v296 */
    /* JADX WARN: Type inference failed for: r0v297 */
    /* JADX WARN: Type inference failed for: r0v298 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62, types: [int] */
    /* JADX WARN: Type inference failed for: r2v112 */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v114 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v92, types: [int] */
    /* JADX WARN: Type inference failed for: r2v95, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(Object obj) {
        boolean z;
        int i2;
        ?? r5;
        int iZzy;
        int iZzy2;
        int iZzz;
        int iZzy3;
        int iZzy4;
        int iZzy5;
        int iZzy6;
        ?? Zzg;
        int size;
        int iZzl;
        int iZzy7;
        int iZzx;
        int iZzx2;
        ?? Zzy;
        int iZzw;
        ?? Zzy2;
        int iZzx3;
        int iZze;
        int iZzy8;
        int iZzy9;
        ?? Zzh;
        Unsafe unsafe = zzb;
        boolean z2 = false;
        int i3 = 1048575;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzc.length) {
            int iZzu = zzu(i4);
            int iZzt = zzt(iZzu);
            int[] iArr = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & i3;
            boolean z4 = z3;
            if (iZzt <= 17) {
                if (i9 != i6) {
                    i6 = i9;
                    z4 = i9 == i3 ? z2 : unsafe.getInt(obj, i9);
                }
                z = z4;
                i2 = i6;
                r5 = 1 << (i8 >>> 20);
            } else {
                z = z3;
                i2 = i6;
                r5 = z2;
            }
            if (iZzt >= zzik.zzJ.zza()) {
                zzik.zzW.zza();
            }
            long j = iZzu & i3;
            switch (iZzt) {
                case 0:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzy = zzhh.zzy(i7 << 3);
                        Zzh = iZzy + 8;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 1:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzy2 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy2 + 4;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 2:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzz = zzhh.zzz(unsafe.getLong(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 3:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzz = zzhh.zzz(unsafe.getLong(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 4:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzz = zzhh.zzu(unsafe.getInt(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 5:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzy = zzhh.zzy(i7 << 3);
                        Zzh = iZzy + 8;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 6:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzy2 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy2 + 4;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 7:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzy4 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy4 + 1;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 8:
                    if (zzO(obj, i4, i2, z, r5)) {
                        int i10 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgw) {
                            int iZzd = ((zzgw) object).zzd();
                            iZzy5 = iZzd + zzhh.zzy(iZzd);
                            iZzy6 = zzhh.zzy(i10);
                            Zzh = iZzy6 + iZzy5;
                            i5 += Zzh;
                            i4 += 3;
                            z3 = z;
                            i6 = i2;
                            z2 = false;
                            i3 = 1048575;
                        } else {
                            int iZzx4 = zzhh.zzx((String) object);
                            iZzy3 = zzhh.zzy(i10);
                            iZzz = iZzx4;
                            Zzh = iZzz + iZzy3;
                            i5 += Zzh;
                            i4 += 3;
                            z3 = z;
                            i6 = i2;
                            z2 = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 9:
                    if (zzO(obj, i4, i2, z, r5)) {
                        Zzh = zzkt.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 10:
                    if (zzO(obj, i4, i2, z, r5)) {
                        int iZzd2 = ((zzgw) unsafe.getObject(obj, j)).zzd();
                        iZzy5 = zzhh.zzy(iZzd2) + iZzd2;
                        iZzy6 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy6 + iZzy5;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 11:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzz = zzhh.zzy(unsafe.getInt(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 12:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzz = zzhh.zzu(unsafe.getInt(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 13:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzy2 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy2 + 4;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 14:
                    if (zzO(obj, i4, i2, z, r5)) {
                        iZzy = zzhh.zzy(i7 << 3);
                        Zzh = iZzy + 8;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 15:
                    if (zzO(obj, i4, i2, z, r5)) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzy3 = zzhh.zzy(i7 << 3);
                        iZzz = zzhh.zzy((i11 + i11) ^ (i11 >> 31));
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    if (zzO(obj, i4, i2, z, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzy3 = zzhh.zzy(i7 << 3);
                        iZzz = zzhh.zzz((j2 + j2) ^ (j2 >> 63));
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 17:
                    if (zzO(obj, i4, i2, z, r5)) {
                        Zzh = zzhh.zzt(i7, (zzke) unsafe.getObject(obj, j), zzx(i4));
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 18:
                    Zzh = zzkt.zzd(i7, (List) unsafe.getObject(obj, j), z2);
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 19:
                    Zzh = zzkt.zzb(i7, (List) unsafe.getObject(obj, j), z2);
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    Zzg = list.size() != 0 ? zzkt.zzg(list) + (list.size() * zzhh.zzy(i7 << 3)) : z2;
                    i5 += Zzg;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zzkt.zzl(list2);
                        iZzy7 = zzhh.zzy(i7 << 3);
                        iZzx3 = size * iZzy7;
                        iZzy3 = iZzl;
                        iZzz = iZzx3;
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zzkt.zzf(list3);
                        iZzy7 = zzhh.zzy(i7 << 3);
                        iZzx3 = size * iZzy7;
                        iZzy3 = iZzl;
                        iZzz = iZzx3;
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 23:
                    Zzh = zzkt.zzd(i7, (List) unsafe.getObject(obj, j), z2);
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 24:
                    Zzh = zzkt.zzb(i7, (List) unsafe.getObject(obj, j), z2);
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 25:
                    int size2 = ((List) unsafe.getObject(obj, j)).size();
                    Zzh = size2 != 0 ? size2 * (zzhh.zzy(i7 << 3) + 1) : z2;
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 26:
                    ?? r0 = (List) unsafe.getObject(obj, j);
                    int size3 = r0.size();
                    if (size3 != 0) {
                        boolean z5 = r0 instanceof zzjm;
                        int iZzy10 = zzhh.zzy(i7 << 3) * size3;
                        if (z5) {
                            ?? r02 = (zzjm) r0;
                            ?? r2 = z2;
                            Zzg = iZzy10;
                            while (r2 < size3) {
                                Object objZzf = r02.zzf(r2);
                                if (objZzf instanceof zzgw) {
                                    int iZzd3 = ((zzgw) objZzf).zzd();
                                    iZzx2 = Zzg + zzhh.zzy(iZzd3) + iZzd3;
                                } else {
                                    iZzx2 = Zzg + zzhh.zzx((String) objZzf);
                                }
                                r2++;
                                Zzg = iZzx2;
                            }
                        } else {
                            ?? r22 = z2;
                            Zzg = iZzy10;
                            while (r22 < size3) {
                                Object obj2 = r0.get(r22);
                                if (obj2 instanceof zzgw) {
                                    int iZzd4 = ((zzgw) obj2).zzd();
                                    iZzx = Zzg + zzhh.zzy(iZzd4) + iZzd4;
                                } else {
                                    iZzx = Zzg + zzhh.zzx((String) obj2);
                                }
                                r22++;
                                Zzg = iZzx;
                            }
                        }
                    }
                    i5 += Zzg;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                    break;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzkr zzkrVarZzx = zzx(i4);
                    int size4 = r03.size();
                    if (size4 == 0) {
                        Zzy = z2;
                    } else {
                        Zzy = zzhh.zzy(i7 << 3) * size4;
                        for (?? r4 = z2; r4 < size4; r4++) {
                            Object obj3 = r03.get(r4);
                            if (obj3 instanceof zzjk) {
                                int iZza = ((zzjk) obj3).zza();
                                iZzw = (Zzy == true ? 1 : 0) + zzhh.zzy(iZza) + iZza;
                            } else {
                                iZzw = (Zzy == true ? 1 : 0) + zzhh.zzw((zzke) obj3, zzkrVarZzx);
                            }
                            Zzy = iZzw;
                        }
                    }
                    i5 += Zzy;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int size5 = r04.size();
                    if (size5 == 0) {
                        Zzy2 = z2;
                    } else {
                        Zzy2 = size5 * zzhh.zzy(i7 << 3);
                        ?? r1 = z2;
                        while (r1 < r04.size()) {
                            int iZzd5 = ((zzgw) r04.get(r1)).zzd();
                            r1++;
                            Zzy2 += zzhh.zzy(iZzd5) + iZzd5;
                        }
                    }
                    i5 += Zzy2;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 29:
                    List list4 = (List) unsafe.getObject(obj, j);
                    size = list4.size();
                    if (size != 0) {
                        iZzl = zzkt.zzk(list4);
                        iZzy7 = zzhh.zzy(i7 << 3);
                        iZzx3 = size * iZzy7;
                        iZzy3 = iZzl;
                        iZzz = iZzx3;
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 30:
                    List list5 = (List) unsafe.getObject(obj, j);
                    size = list5.size();
                    if (size != 0) {
                        iZzl = zzkt.zza(list5);
                        iZzy7 = zzhh.zzy(i7 << 3);
                        iZzx3 = size * iZzy7;
                        iZzy3 = iZzl;
                        iZzz = iZzx3;
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 31:
                    Zzh = zzkt.zzb(i7, (List) unsafe.getObject(obj, j), z2);
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    Zzh = zzkt.zzd(i7, (List) unsafe.getObject(obj, j), z2);
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    List list6 = (List) unsafe.getObject(obj, j);
                    size = list6.size();
                    if (size != 0) {
                        iZzl = zzkt.zzi(list6);
                        iZzy7 = zzhh.zzy(i7 << 3);
                        iZzx3 = size * iZzy7;
                        iZzy3 = iZzl;
                        iZzz = iZzx3;
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 34:
                    List list7 = (List) unsafe.getObject(obj, j);
                    size = list7.size();
                    if (size != 0) {
                        iZzl = zzkt.zzj(list7);
                        iZzy7 = zzhh.zzy(i7 << 3);
                        iZzx3 = size * iZzy7;
                        iZzy3 = iZzl;
                        iZzz = iZzx3;
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                    i5 += Zzh;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 35:
                    iZze = zzkt.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 36:
                    iZze = zzkt.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 37:
                    iZze = zzkt.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 38:
                    iZze = zzkt.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 39:
                    iZze = zzkt.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 40:
                    iZze = zzkt.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 41:
                    iZze = zzkt.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 42:
                    iZze = ((List) unsafe.getObject(obj, j)).size();
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 43:
                    iZze = zzkt.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 44:
                    iZze = zzkt.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 45:
                    iZze = zzkt.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 46:
                    iZze = zzkt.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 47:
                    iZze = zzkt.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 48:
                    iZze = zzkt.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzy8 = zzhh.zzy(iZze);
                        iZzy9 = zzhh.zzy(i7 << 3);
                        Zzy2 = iZzy9 + iZzy8 + iZze;
                        i5 += Zzy2;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 49:
                    List list8 = (List) unsafe.getObject(obj, j);
                    zzkr zzkrVarZzx2 = zzx(i4);
                    int size6 = list8.size();
                    Zzy = z2;
                    if (size6 != 0) {
                        int i12 = Zzy;
                        Zzy = Zzy;
                        while (i12 < size6) {
                            int iZzt2 = Zzy + zzhh.zzt(i7, (zzke) list8.get(i12), zzkrVarZzx2);
                            i12++;
                            Zzy = iZzt2;
                        }
                    }
                    i5 += Zzy;
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 50:
                    zzjy zzjyVar = (zzjy) unsafe.getObject(obj, j);
                    if (zzjyVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzjyVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
                case 51:
                    if (zzR(obj, i7, i4)) {
                        iZzy = zzhh.zzy(i7 << 3);
                        Zzh = iZzy + 8;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 52:
                    if (zzR(obj, i7, i4)) {
                        iZzy2 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy2 + 4;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 53:
                    if (zzR(obj, i7, i4)) {
                        iZzz = zzhh.zzz(zzv(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (zzR(obj, i7, i4)) {
                        iZzz = zzhh.zzz(zzv(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 55:
                    if (zzR(obj, i7, i4)) {
                        iZzz = zzhh.zzu(zzp(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 56:
                    if (zzR(obj, i7, i4)) {
                        iZzy = zzhh.zzy(i7 << 3);
                        Zzh = iZzy + 8;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 57:
                    if (zzR(obj, i7, i4)) {
                        iZzy2 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy2 + 4;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 58:
                    if (zzR(obj, i7, i4)) {
                        iZzy4 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy4 + 1;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 59:
                    if (zzR(obj, i7, i4)) {
                        int i13 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgw) {
                            int iZzd6 = ((zzgw) object2).zzd();
                            iZzy5 = iZzd6 + zzhh.zzy(iZzd6);
                            iZzy6 = zzhh.zzy(i13);
                            Zzh = iZzy6 + iZzy5;
                            i5 += Zzh;
                            i4 += 3;
                            z3 = z;
                            i6 = i2;
                            z2 = false;
                            i3 = 1048575;
                        } else {
                            iZzx3 = zzhh.zzx((String) object2);
                            iZzy3 = zzhh.zzy(i13);
                            iZzz = iZzx3;
                            Zzh = iZzz + iZzy3;
                            i5 += Zzh;
                            i4 += 3;
                            z3 = z;
                            i6 = i2;
                            z2 = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 60:
                    if (zzR(obj, i7, i4)) {
                        Zzh = zzkt.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 61:
                    if (zzR(obj, i7, i4)) {
                        int iZzd7 = ((zzgw) unsafe.getObject(obj, j)).zzd();
                        iZzy5 = zzhh.zzy(iZzd7) + iZzd7;
                        iZzy6 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy6 + iZzy5;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 62:
                    if (zzR(obj, i7, i4)) {
                        iZzz = zzhh.zzy(zzp(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 63:
                    if (zzR(obj, i7, i4)) {
                        iZzz = zzhh.zzu(zzp(obj, j));
                        iZzy3 = zzhh.zzy(i7 << 3);
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 64:
                    if (zzR(obj, i7, i4)) {
                        iZzy2 = zzhh.zzy(i7 << 3);
                        Zzh = iZzy2 + 4;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 65:
                    if (zzR(obj, i7, i4)) {
                        iZzy = zzhh.zzy(i7 << 3);
                        Zzh = iZzy + 8;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 66:
                    if (zzR(obj, i7, i4)) {
                        int iZzp = zzp(obj, j);
                        iZzy3 = zzhh.zzy(i7 << 3);
                        iZzz = zzhh.zzy((iZzp + iZzp) ^ (iZzp >> 31));
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 67:
                    if (zzR(obj, i7, i4)) {
                        long jZzv = zzv(obj, j);
                        iZzy3 = zzhh.zzy(i7 << 3);
                        iZzz = zzhh.zzz((jZzv + jZzv) ^ (jZzv >> 63));
                        Zzh = iZzz + iZzy3;
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                case 68:
                    if (zzR(obj, i7, i4)) {
                        Zzh = zzhh.zzt(i7, (zzke) unsafe.getObject(obj, j), zzx(i4));
                        i5 += Zzh;
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        z3 = z;
                        i6 = i2;
                        z2 = false;
                        i3 = 1048575;
                    }
                default:
                    i4 += 3;
                    z3 = z;
                    i6 = i2;
                    z2 = false;
                    i3 = 1048575;
            }
        }
        zzll zzllVar = this.zzn;
        int iZza2 = i5 + zzllVar.zza(zzllVar.zzd(obj));
        if (!this.zzh) {
            return iZza2;
        }
        zzij zzijVarZzb = this.zzo.zzb(obj);
        int iZza3 = 0;
        for (int i14 = 0; i14 < zzijVarZzb.zza.zzb(); i14++) {
            Map.Entry entryZzg = zzijVarZzb.zza.zzg(i14);
            iZza3 += zzij.zza((zzii) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzijVarZzb.zza.zzc()) {
            iZza3 += zzij.zza((zzii) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZza3;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zzb(Object obj) {
        int i2;
        long jDoubleToLongBits;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzu = zzu(i4);
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i5 = iArr[i4];
            long j = iZzu & 1048575;
            int iFloatToIntBits = 37;
            switch (iZzt) {
                case 0:
                    i2 = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzlv.zza(obj, j));
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzlv.zzb(obj, j));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 2:
                    i2 = i3 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 3:
                    i2 = i3 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 5:
                    i2 = i3 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzjc.zza(zzlv.zzw(obj, j));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iFloatToIntBits = ((String) zzlv.zzf(obj, j)).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzf = zzlv.zzf(obj, j);
                    if (objZzf != null) {
                        iFloatToIntBits = objZzf.hashCode();
                    }
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 14:
                    i2 = i3 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    i2 = i3 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzf2 = zzlv.zzf(obj, j);
                    if (objZzf2 != null) {
                        iFloatToIntBits = objZzf2.hashCode();
                    }
                    i3 = i2 + iFloatToIntBits;
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
                    iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzjc.zza(zzS(obj, j));
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = ((String) zzlv.zzf(obj, j)).hashCode();
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode = (i3 * 53) + this.zzn.zzd(obj).hashCode();
        return this.zzh ? (iHashCode * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0d6c, code lost:
    
        if (r4 == 1048575) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0d6e, code lost:
    
        r30.putInt(r7, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0d74, code lost:
    
        r8 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0d79, code lost:
    
        if (r8 >= r9.zzl) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d7b, code lost:
    
        zzy(r34, r9.zzj[r8], null, r9.zzn, r34);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0d8e, code lost:
    
        if (r11 != 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0d90, code lost:
    
        if (r6 != r13) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0d97, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0d98, code lost:
    
        if (r6 > r13) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0d9a, code lost:
    
        if (r10 != r11) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0d9c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0da1, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i2, int i3, int i4, zzgj zzgjVar) throws IOException {
        zzkh<T> zzkhVar;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzq;
        int i10;
        int iZzl;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        int i15;
        zzgj zzgjVar2;
        int i16;
        int i17;
        zzie zzieVar;
        Object obj2;
        int i18;
        zzkh<T> zzkhVar2;
        Unsafe unsafe2;
        int i19;
        int i20;
        boolean z2;
        zzkh<T> zzkhVar3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int iZzn;
        int iZzl2;
        int i26;
        int i27;
        int i28;
        int iZza;
        long j;
        zzjb zzjbVar;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z3;
        zzkh<T> zzkhVar4;
        int iZzk;
        int iZzi;
        int i33;
        int i34;
        zzgj zzgjVar3;
        boolean z4;
        zzkh<T> zzkhVar5;
        int i35;
        int iZzf;
        int iZzi2;
        int iZzi3;
        int i36;
        int i37;
        int i38;
        int i39;
        Object obj3;
        int i40;
        zzkh<T> zzkhVar6;
        boolean z5;
        int i41;
        int i42;
        int iZzk2;
        int iZzi4;
        int i43;
        int i44;
        int i45;
        zzgj zzgjVar4;
        int iZze;
        int i46;
        int i47;
        int i48;
        zzkh<T> zzkhVar7;
        int iZzi5;
        int i49;
        int i50;
        int i51;
        zzkh<T> zzkhVar8;
        int i52;
        zzkh<T> zzkhVar9;
        int i53;
        zzkh<T> zzkhVar10;
        int i54;
        int i55;
        int iZzg;
        int i56;
        int i57;
        Unsafe unsafe3;
        zzgj zzgjVar5;
        int i58;
        int i59;
        Unsafe unsafe4;
        boolean z6;
        boolean z7;
        int i60;
        int i61;
        zzkh<T> zzkhVar11;
        int i62;
        zzkh<T> zzkhVar12 = this;
        Object obj4 = obj;
        int i63 = i3;
        int i64 = i4;
        zzgj zzgjVar6 = zzgjVar;
        zzD(obj);
        Unsafe unsafe5 = zzb;
        int i65 = -1;
        int iZzh = i2;
        int i66 = -1;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 1048575;
        while (true) {
            if (iZzh < i63) {
                int i71 = iZzh + 1;
                int i72 = bArr[iZzh];
                if (i72 < 0) {
                    int iZzj = zzgk.zzj(i72, bArr, i71, zzgjVar6);
                    i9 = zzgjVar6.zza;
                    i71 = iZzj;
                } else {
                    i9 = i72;
                }
                int i73 = i9 >>> 3;
                if (i73 > i66) {
                    int i74 = i67 / 3;
                    if (i73 < zzkhVar12.zze || i73 > zzkhVar12.zzf) {
                        i10 = i65;
                        Object objValueOf = null;
                        if (i10 != i65) {
                            iZzl = i71;
                            i11 = i70;
                            i12 = i69;
                            zzkhVar = zzkhVar12;
                            i13 = i65;
                            unsafe = unsafe5;
                            i5 = i64;
                            i14 = 0;
                            z = true;
                            i15 = i73;
                            i8 = i9;
                            zzgjVar2 = zzgjVar6;
                        } else {
                            int i75 = i9 & 7;
                            int[] iArr = zzkhVar12.zzc;
                            int i76 = iArr[i10 + 1];
                            int iZzt = zzt(i76);
                            long j2 = i76 & 1048575;
                            int i77 = i9;
                            if (iZzt <= 17) {
                                int i78 = iArr[i10 + 2];
                                int i79 = 1 << (i78 >>> 20);
                                int i80 = i78 & 1048575;
                                if (i80 != i70) {
                                    i46 = i76;
                                    i47 = i10;
                                    if (i70 != 1048575) {
                                        unsafe5.putInt(obj4, i70, i69);
                                    }
                                    i69 = i80 == 1048575 ? 0 : unsafe5.getInt(obj4, i80);
                                    i11 = i80;
                                } else {
                                    i46 = i76;
                                    i47 = i10;
                                    i11 = i70;
                                }
                                int i81 = i69;
                                switch (iZzt) {
                                    case 0:
                                        zzkhVar8 = this;
                                        iZzl = i71;
                                        i44 = i73;
                                        i52 = i77;
                                        z6 = true;
                                        i14 = i47;
                                        if (i75 != 1) {
                                            z7 = z6;
                                            unsafe4 = unsafe5;
                                            i77 = i52;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            i51 = iZzl + 8;
                                            i60 = i81 | i79;
                                            zzlv.zzo(obj4, j2, Double.longBitsToDouble(zzgk.zzp(bArr, iZzl)));
                                            i81 = i60;
                                            i69 = i81;
                                            i63 = i3;
                                            i64 = i4;
                                            i67 = i14;
                                            i70 = i11;
                                            i65 = -1;
                                            zzkhVar12 = zzkhVar8;
                                            i66 = i44;
                                            iZzh = i51;
                                            i68 = i52;
                                            break;
                                        }
                                    case 1:
                                        zzkhVar8 = this;
                                        iZzl = i71;
                                        i44 = i73;
                                        i52 = i77;
                                        i14 = i47;
                                        if (i75 != 5) {
                                            unsafe4 = unsafe5;
                                            i77 = i52;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            i51 = iZzl + 4;
                                            i60 = i81 | i79;
                                            zzlv.zzp(obj4, j2, Float.intBitsToFloat(zzgk.zzb(bArr, iZzl)));
                                            i81 = i60;
                                            i69 = i81;
                                            i63 = i3;
                                            i64 = i4;
                                            i67 = i14;
                                            i70 = i11;
                                            i65 = -1;
                                            zzkhVar12 = zzkhVar8;
                                            i66 = i44;
                                            iZzh = i51;
                                            i68 = i52;
                                            break;
                                        }
                                    case 2:
                                    case 3:
                                        zzkhVar9 = this;
                                        iZzl = i71;
                                        i53 = i73;
                                        i52 = i77;
                                        i14 = i47;
                                        if (i75 != 0) {
                                            int i82 = i53;
                                            zzkhVar8 = zzkhVar9;
                                            unsafe4 = unsafe5;
                                            i44 = i82;
                                            i77 = i52;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            int i83 = i81 | i79;
                                            int iZzl3 = zzgk.zzl(bArr, iZzl, zzgjVar6);
                                            zzkhVar10 = zzkhVar9;
                                            i54 = i53;
                                            unsafe5.putLong(obj, j2, zzgjVar6.zzb);
                                            i55 = i83;
                                            iZzg = iZzl3;
                                            i56 = i3;
                                            iZze = iZzg;
                                            i57 = i55;
                                            zzkhVar8 = zzkhVar10;
                                            unsafe3 = unsafe5;
                                            zzgjVar5 = zzgjVar6;
                                            i44 = i54;
                                            i58 = i52;
                                            i59 = -1;
                                            i64 = i4;
                                            zzgjVar6 = zzgjVar5;
                                            i63 = i56;
                                            unsafe5 = unsafe3;
                                            i67 = i14;
                                            i65 = i59;
                                            i68 = i58;
                                            zzkhVar12 = zzkhVar8;
                                            i69 = i57;
                                            i70 = i11;
                                            i66 = i44;
                                            iZzh = iZze;
                                            break;
                                        }
                                    case 4:
                                    case 11:
                                        zzkhVar9 = this;
                                        iZzl = i71;
                                        i53 = i73;
                                        i52 = i77;
                                        i14 = i47;
                                        if (i75 != 0) {
                                            int i822 = i53;
                                            zzkhVar8 = zzkhVar9;
                                            unsafe4 = unsafe5;
                                            i44 = i822;
                                            i77 = i52;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            iZzh = zzgk.zzi(bArr, iZzl, zzgjVar6);
                                            unsafe5.putInt(obj4, j2, zzgjVar6.zza);
                                            i61 = i81 | i79;
                                            i63 = i3;
                                            i64 = i4;
                                            i67 = i14;
                                            i68 = i52;
                                            i65 = -1;
                                            zzkhVar12 = zzkhVar9;
                                            i70 = i11;
                                            int i84 = i53;
                                            i69 = i61;
                                            i66 = i84;
                                            break;
                                        }
                                    case 5:
                                    case 14:
                                        zzkhVar9 = this;
                                        i53 = i73;
                                        i52 = i77;
                                        i14 = i47;
                                        if (i75 != 1) {
                                            iZzl = i71;
                                            int i8222 = i53;
                                            zzkhVar8 = zzkhVar9;
                                            unsafe4 = unsafe5;
                                            i44 = i8222;
                                            i77 = i52;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            unsafe5.putLong(obj, j2, zzgk.zzp(bArr, i71));
                                            i61 = i81 | i79;
                                            iZzh = i71 + 8;
                                            zzkhVar9 = zzkhVar9;
                                            i53 = i53;
                                            i63 = i3;
                                            i64 = i4;
                                            i67 = i14;
                                            i68 = i52;
                                            i65 = -1;
                                            zzkhVar12 = zzkhVar9;
                                            i70 = i11;
                                            int i842 = i53;
                                            i69 = i61;
                                            i66 = i842;
                                            break;
                                        }
                                    case 6:
                                    case 13:
                                        zzkhVar9 = this;
                                        i53 = i73;
                                        i52 = i77;
                                        i14 = i47;
                                        if (i75 != 5) {
                                            iZzl = i71;
                                            int i82222 = i53;
                                            zzkhVar8 = zzkhVar9;
                                            unsafe4 = unsafe5;
                                            i44 = i82222;
                                            i77 = i52;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            unsafe5.putInt(obj4, j2, zzgk.zzb(bArr, i71));
                                            i51 = i71 + 4;
                                            zzkhVar8 = zzkhVar9;
                                            i69 = i81 | i79;
                                            i44 = i53;
                                            i63 = i3;
                                            i64 = i4;
                                            i67 = i14;
                                            i70 = i11;
                                            i65 = -1;
                                            zzkhVar12 = zzkhVar8;
                                            i66 = i44;
                                            iZzh = i51;
                                            i68 = i52;
                                            break;
                                        }
                                    case 7:
                                        zzkhVar9 = this;
                                        i53 = i73;
                                        i52 = i77;
                                        i14 = i47;
                                        if (i75 != 0) {
                                            iZzl = i71;
                                            int i822222 = i53;
                                            zzkhVar8 = zzkhVar9;
                                            unsafe4 = unsafe5;
                                            i44 = i822222;
                                            i77 = i52;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            iZzh = zzgk.zzl(bArr, i71, zzgjVar6);
                                            zzlv.zzm(obj4, j2, zzgjVar6.zzb != 0);
                                            i61 = i81 | i79;
                                            i63 = i3;
                                            i64 = i4;
                                            i67 = i14;
                                            i68 = i52;
                                            i65 = -1;
                                            zzkhVar12 = zzkhVar9;
                                            i70 = i11;
                                            int i8422 = i53;
                                            i69 = i61;
                                            i66 = i8422;
                                            break;
                                        }
                                    case 8:
                                        zzkhVar9 = this;
                                        i53 = i73;
                                        i52 = i77;
                                        i14 = i47;
                                        if (i75 != 2) {
                                            iZzl = i71;
                                            int i8222222 = i53;
                                            zzkhVar8 = zzkhVar9;
                                            unsafe4 = unsafe5;
                                            i44 = i8222222;
                                            i77 = i52;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            if (zzM(i46)) {
                                                iZzg = zzgk.zzi(bArr, i71, zzgjVar6);
                                                int i85 = zzgjVar6.zza;
                                                if (i85 < 0) {
                                                    throw zzje.zzf();
                                                }
                                                i55 = i81 | i79;
                                                if (i85 == 0) {
                                                    zzgjVar6.zzc = "";
                                                } else {
                                                    zzgjVar6.zzc = zzma.zzd(bArr, iZzg, i85);
                                                    iZzg += i85;
                                                }
                                            } else {
                                                iZzg = zzgk.zzg(bArr, i71, zzgjVar6);
                                                i55 = i81 | i79;
                                            }
                                            unsafe5.putObject(obj4, j2, zzgjVar6.zzc);
                                            zzkhVar10 = zzkhVar9;
                                            i54 = i53;
                                            i56 = i3;
                                            iZze = iZzg;
                                            i57 = i55;
                                            zzkhVar8 = zzkhVar10;
                                            unsafe3 = unsafe5;
                                            zzgjVar5 = zzgjVar6;
                                            i44 = i54;
                                            i58 = i52;
                                            i59 = -1;
                                            i64 = i4;
                                            zzgjVar6 = zzgjVar5;
                                            i63 = i56;
                                            unsafe5 = unsafe3;
                                            i67 = i14;
                                            i65 = i59;
                                            i68 = i58;
                                            zzkhVar12 = zzkhVar8;
                                            i69 = i57;
                                            i70 = i11;
                                            i66 = i44;
                                            iZzh = iZze;
                                            break;
                                        }
                                    case 9:
                                        zzkhVar9 = this;
                                        i53 = i73;
                                        i52 = i77;
                                        i14 = i47;
                                        if (i75 != 2) {
                                            iZzl = i71;
                                            int i82222222 = i53;
                                            zzkhVar8 = zzkhVar9;
                                            unsafe4 = unsafe5;
                                            i44 = i82222222;
                                            i77 = i52;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            int i86 = i81 | i79;
                                            Object objZzA = zzkhVar9.zzA(obj4, i14);
                                            zzkhVar11 = zzkhVar9;
                                            i62 = i53;
                                            iZzh = zzgk.zzn(objZzA, zzkhVar9.zzx(i14), bArr, i71, i3, zzgjVar);
                                            zzkhVar11.zzJ(obj4, i14, objZzA);
                                            i69 = i86;
                                            i63 = i3;
                                            i67 = i14;
                                            zzkhVar12 = zzkhVar11;
                                            i66 = i62;
                                            i68 = i52;
                                            i70 = i11;
                                            i65 = -1;
                                            i64 = i4;
                                            break;
                                        }
                                    case 10:
                                        zzkhVar7 = this;
                                        i48 = i73;
                                        i50 = i77;
                                        i14 = i47;
                                        if (i75 != 2) {
                                            iZzl = i71;
                                            zzkhVar8 = zzkhVar7;
                                            i44 = i48;
                                            unsafe4 = unsafe5;
                                            i77 = i50;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            i49 = i81 | i79;
                                            iZzi5 = zzgk.zza(bArr, i71, zzgjVar6);
                                            unsafe5.putObject(obj4, j2, zzgjVar6.zzc);
                                            i19 = i3;
                                            i12 = i49;
                                            iZze = iZzi5;
                                            zzkhVar2 = zzkhVar7;
                                            i44 = i48;
                                            unsafe2 = unsafe5;
                                            zzgjVar4 = zzgjVar6;
                                            i45 = i50;
                                            i13 = -1;
                                            i64 = i4;
                                            zzgjVar6 = zzgjVar4;
                                            i63 = i19;
                                            i68 = i45;
                                            unsafe5 = unsafe2;
                                            i67 = i14;
                                            i65 = i13;
                                            i69 = i12;
                                            i70 = i11;
                                            zzkhVar12 = zzkhVar2;
                                            i66 = i44;
                                            iZzh = iZze;
                                            break;
                                        }
                                    case 12:
                                        i14 = i47;
                                        i48 = i73;
                                        if (i75 != 0) {
                                            zzkhVar7 = this;
                                            i50 = i77;
                                            iZzl = i71;
                                            zzkhVar8 = zzkhVar7;
                                            i44 = i48;
                                            unsafe4 = unsafe5;
                                            i77 = i50;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            iZzi5 = zzgk.zzi(bArr, i71, zzgjVar6);
                                            int i87 = zzgjVar6.zza;
                                            zzkhVar7 = this;
                                            zzix zzixVarZzw = zzkhVar7.zzw(i14);
                                            if ((i46 & Integer.MIN_VALUE) != 0 && zzixVarZzw != null && !zzixVarZzw.zza(i87)) {
                                                zzd(obj).zzj(i77, Long.valueOf(i87));
                                                i51 = iZzi5;
                                                zzkhVar8 = zzkhVar7;
                                                i44 = i48;
                                                i52 = i77;
                                                i69 = i81;
                                                i63 = i3;
                                                i64 = i4;
                                                i67 = i14;
                                                i70 = i11;
                                                i65 = -1;
                                                zzkhVar12 = zzkhVar8;
                                                i66 = i44;
                                                iZzh = i51;
                                                i68 = i52;
                                                break;
                                            } else {
                                                unsafe5.putInt(obj4, j2, i87);
                                                i49 = i81 | i79;
                                                i50 = i77;
                                                i19 = i3;
                                                i12 = i49;
                                                iZze = iZzi5;
                                                zzkhVar2 = zzkhVar7;
                                                i44 = i48;
                                                unsafe2 = unsafe5;
                                                zzgjVar4 = zzgjVar6;
                                                i45 = i50;
                                                i13 = -1;
                                                i64 = i4;
                                                zzgjVar6 = zzgjVar4;
                                                i63 = i19;
                                                i68 = i45;
                                                unsafe5 = unsafe2;
                                                i67 = i14;
                                                i65 = i13;
                                                i69 = i12;
                                                i70 = i11;
                                                zzkhVar12 = zzkhVar2;
                                                i66 = i44;
                                                iZzh = iZze;
                                                break;
                                            }
                                        }
                                        break;
                                    case 15:
                                        i14 = i47;
                                        i48 = i73;
                                        if (i75 != 0) {
                                            zzkhVar8 = this;
                                            iZzl = i71;
                                            i44 = i48;
                                            unsafe4 = unsafe5;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            i49 = i81 | i79;
                                            iZzi5 = zzgk.zzi(bArr, i71, zzgjVar6);
                                            unsafe5.putInt(obj4, j2, zzhc.zzF(zzgjVar6.zza));
                                            zzkhVar7 = this;
                                            i50 = i77;
                                            i19 = i3;
                                            i12 = i49;
                                            iZze = iZzi5;
                                            zzkhVar2 = zzkhVar7;
                                            i44 = i48;
                                            unsafe2 = unsafe5;
                                            zzgjVar4 = zzgjVar6;
                                            i45 = i50;
                                            i13 = -1;
                                            i64 = i4;
                                            zzgjVar6 = zzgjVar4;
                                            i63 = i19;
                                            i68 = i45;
                                            unsafe5 = unsafe2;
                                            i67 = i14;
                                            i65 = i13;
                                            i69 = i12;
                                            i70 = i11;
                                            zzkhVar12 = zzkhVar2;
                                            i66 = i44;
                                            iZzh = iZze;
                                            break;
                                        }
                                    case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                                        if (i75 != 0) {
                                            i14 = i47;
                                            zzkhVar7 = this;
                                            i48 = i73;
                                            i50 = i77;
                                            iZzl = i71;
                                            zzkhVar8 = zzkhVar7;
                                            i44 = i48;
                                            unsafe4 = unsafe5;
                                            i77 = i50;
                                            z7 = true;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            int i88 = i81 | i79;
                                            int iZzl4 = zzgk.zzl(bArr, i71, zzgjVar6);
                                            i14 = i47;
                                            unsafe5.putLong(obj, j2, zzhc.zzG(zzgjVar6.zzb));
                                            i69 = i88;
                                            iZzh = iZzl4;
                                            i62 = i73;
                                            i52 = i77;
                                            zzkhVar11 = this;
                                            i63 = i3;
                                            i67 = i14;
                                            zzkhVar12 = zzkhVar11;
                                            i66 = i62;
                                            i68 = i52;
                                            i70 = i11;
                                            i65 = -1;
                                            i64 = i4;
                                            break;
                                        }
                                    default:
                                        zzkhVar8 = this;
                                        iZzl = i71;
                                        i44 = i73;
                                        i52 = i77;
                                        z6 = true;
                                        i14 = i47;
                                        if (i75 != 3) {
                                            z7 = z6;
                                            unsafe4 = unsafe5;
                                            i77 = i52;
                                            i13 = -1;
                                            i5 = i4;
                                            zzkhVar = zzkhVar8;
                                            z = z7;
                                            unsafe = unsafe4;
                                            i12 = i81;
                                            zzgjVar2 = zzgjVar6;
                                            i8 = i77;
                                            i15 = i44;
                                            break;
                                        } else {
                                            int i89 = i81 | i79;
                                            Object objZzA2 = zzkhVar8.zzA(obj4, i14);
                                            i59 = -1;
                                            i58 = i52;
                                            unsafe3 = unsafe5;
                                            zzgjVar5 = zzgjVar6;
                                            i56 = i3;
                                            iZze = zzgk.zzm(objZzA2, zzkhVar8.zzx(i14), bArr, iZzl, i3, (i44 << 3) | 4, zzgjVar);
                                            zzkhVar8.zzJ(obj4, i14, objZzA2);
                                            i57 = i89;
                                            i64 = i4;
                                            zzgjVar6 = zzgjVar5;
                                            i63 = i56;
                                            unsafe5 = unsafe3;
                                            i67 = i14;
                                            i65 = i59;
                                            i68 = i58;
                                            zzkhVar12 = zzkhVar8;
                                            i69 = i57;
                                            i70 = i11;
                                            i66 = i44;
                                            iZzh = iZze;
                                            break;
                                        }
                                }
                            } else {
                                i12 = i69;
                                zzkhVar2 = zzkhVar12;
                                unsafe2 = unsafe5;
                                i13 = -1;
                                i14 = i10;
                                int i90 = i71;
                                i19 = i3;
                                int i91 = i70;
                                if (iZzt != 27) {
                                    if (iZzt > 49) {
                                        unsafe = unsafe2;
                                        i20 = i73;
                                        zzgjVar2 = zzgjVar6;
                                        i11 = i91;
                                        z2 = true;
                                        zzkhVar3 = this;
                                        i21 = i90;
                                        i22 = i77;
                                        if (iZzt != 50) {
                                            obj4 = obj;
                                            Unsafe unsafe6 = zzb;
                                            long j3 = iArr[i14 + 2] & 1048575;
                                            switch (iZzt) {
                                                case 51:
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i24 = i21;
                                                    i15 = i20;
                                                    z = true;
                                                    i25 = i14;
                                                    if (i75 == 1) {
                                                        unsafe6.putObject(obj4, j2, Double.valueOf(Double.longBitsToDouble(zzgk.zzp(bArr, i24))));
                                                        unsafe6.putInt(obj4, j3, i15);
                                                        iZzn = i24 + 8;
                                                    } else {
                                                        iZzn = i24;
                                                    }
                                                    if (iZzn == i24) {
                                                        i5 = i4;
                                                        iZzl = iZzn;
                                                        i8 = i23;
                                                        i14 = i25;
                                                        break;
                                                    } else {
                                                        iZzh = iZzn;
                                                        i69 = i12;
                                                        i68 = i23;
                                                        i67 = i25;
                                                        i63 = i3;
                                                        i64 = i4;
                                                        i66 = i15;
                                                        zzgjVar6 = zzgjVar2;
                                                        zzkhVar12 = zzkhVar;
                                                        i65 = -1;
                                                        i70 = i11;
                                                        unsafe5 = unsafe;
                                                        break;
                                                    }
                                                case 52:
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i24 = i21;
                                                    i15 = i20;
                                                    i25 = i14;
                                                    if (i75 == 5) {
                                                        iZzl2 = i24 + 4;
                                                        unsafe6.putObject(obj4, j2, Float.valueOf(Float.intBitsToFloat(zzgk.zzb(bArr, i24))));
                                                        unsafe6.putInt(obj4, j3, i15);
                                                        iZzn = iZzl2;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 53:
                                                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i24 = i21;
                                                    i15 = i20;
                                                    i25 = i14;
                                                    if (i75 == 0) {
                                                        iZzl2 = zzgk.zzl(bArr, i24, zzgjVar2);
                                                        unsafe6.putObject(obj4, j2, Long.valueOf(zzgjVar2.zzb));
                                                        unsafe6.putInt(obj4, j3, i15);
                                                        iZzn = iZzl2;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 55:
                                                case 62:
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i24 = i21;
                                                    i15 = i20;
                                                    i25 = i14;
                                                    if (i75 == 0) {
                                                        iZzl2 = zzgk.zzi(bArr, i24, zzgjVar2);
                                                        unsafe6.putObject(obj4, j2, Integer.valueOf(zzgjVar2.zza));
                                                        unsafe6.putInt(obj4, j3, i15);
                                                        iZzn = iZzl2;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i24 = i21;
                                                    i15 = i20;
                                                    z = true;
                                                    i25 = i14;
                                                    if (i75 == 1) {
                                                        iZzl2 = i24 + 8;
                                                        unsafe6.putObject(obj4, j2, Long.valueOf(zzgk.zzp(bArr, i24)));
                                                        unsafe6.putInt(obj4, j3, i15);
                                                        iZzn = iZzl2;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i24 = i21;
                                                    i15 = i20;
                                                    i25 = i14;
                                                    if (i75 == 5) {
                                                        iZzl2 = i24 + 4;
                                                        unsafe6.putObject(obj4, j2, Integer.valueOf(zzgk.zzb(bArr, i24)));
                                                        unsafe6.putInt(obj4, j3, i15);
                                                        iZzn = iZzl2;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 58:
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i24 = i21;
                                                    i15 = i20;
                                                    i25 = i14;
                                                    if (i75 == 0) {
                                                        iZzl2 = zzgk.zzl(bArr, i24, zzgjVar2);
                                                        unsafe6.putObject(obj4, j2, Boolean.valueOf(zzgjVar2.zzb != 0));
                                                        unsafe6.putInt(obj4, j3, i15);
                                                        iZzn = iZzl2;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 59:
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i24 = i21;
                                                    i15 = i20;
                                                    i25 = i14;
                                                    if (i75 == 2) {
                                                        int iZzi6 = zzgk.zzi(bArr, i24, zzgjVar2);
                                                        int i92 = zzgjVar2.zza;
                                                        if (i92 == 0) {
                                                            unsafe6.putObject(obj4, j2, "");
                                                            i26 = iZzi6;
                                                        } else {
                                                            i26 = iZzi6 + i92;
                                                            if ((i76 & 536870912) != 0 && !zzma.zzf(bArr, iZzi6, i26)) {
                                                                throw zzje.zzd();
                                                            }
                                                            unsafe6.putObject(obj4, j2, new String(bArr, iZzi6, i92, zzjc.zzb));
                                                        }
                                                        unsafe6.putInt(obj4, j3, i15);
                                                        iZzn = i26;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 60:
                                                    if (i75 == 2) {
                                                        Object objZzB = zzkhVar3.zzB(obj4, i20, i14);
                                                        i23 = i22;
                                                        iZzn = zzgk.zzn(objZzB, zzkhVar3.zzx(i14), bArr, i21, i3, zzgjVar);
                                                        zzkhVar3.zzK(obj4, i20, i14, objZzB);
                                                        i25 = i14;
                                                        i24 = i21;
                                                        i15 = i20;
                                                        zzkhVar = zzkhVar3;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    } else {
                                                        i23 = i22;
                                                        i15 = i20;
                                                        zzkhVar = zzkhVar3;
                                                        i25 = i14;
                                                        i24 = i21;
                                                        z = true;
                                                        iZzn = i24;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    break;
                                                case 61:
                                                    i27 = i21;
                                                    i28 = i20;
                                                    if (i75 == 2) {
                                                        iZza = zzgk.zza(bArr, i27, zzgjVar2);
                                                        unsafe6.putObject(obj4, j2, zzgjVar2.zzc);
                                                        unsafe6.putInt(obj4, j3, i28);
                                                        iZzn = iZza;
                                                        i23 = i22;
                                                        zzkhVar = zzkhVar3;
                                                        i25 = i14;
                                                        i24 = i27;
                                                        i15 = i28;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i25 = i14;
                                                    i24 = i27;
                                                    i15 = i28;
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 63:
                                                    i27 = i21;
                                                    i28 = i20;
                                                    if (i75 == 0) {
                                                        iZza = zzgk.zzi(bArr, i27, zzgjVar2);
                                                        int i93 = zzgjVar2.zza;
                                                        zzix zzixVarZzw2 = zzkhVar3.zzw(i14);
                                                        if (zzixVarZzw2 == null || zzixVarZzw2.zza(i93)) {
                                                            unsafe6.putObject(obj4, j2, Integer.valueOf(i93));
                                                            unsafe6.putInt(obj4, j3, i28);
                                                        } else {
                                                            zzd(obj).zzj(i22, Long.valueOf(i93));
                                                        }
                                                        iZzn = iZza;
                                                        i23 = i22;
                                                        zzkhVar = zzkhVar3;
                                                        i25 = i14;
                                                        i24 = i27;
                                                        i15 = i28;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i25 = i14;
                                                    i24 = i27;
                                                    i15 = i28;
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 66:
                                                    i27 = i21;
                                                    i28 = i20;
                                                    if (i75 == 0) {
                                                        iZza = zzgk.zzi(bArr, i27, zzgjVar2);
                                                        unsafe6.putObject(obj4, j2, Integer.valueOf(zzhc.zzF(zzgjVar2.zza)));
                                                        unsafe6.putInt(obj4, j3, i28);
                                                        iZzn = iZza;
                                                        i23 = i22;
                                                        zzkhVar = zzkhVar3;
                                                        i25 = i14;
                                                        i24 = i27;
                                                        i15 = i28;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i25 = i14;
                                                    i24 = i27;
                                                    i15 = i28;
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 67:
                                                    i28 = i20;
                                                    i27 = i21;
                                                    if (i75 == 0) {
                                                        iZza = zzgk.zzl(bArr, i27, zzgjVar2);
                                                        unsafe6.putObject(obj4, j2, Long.valueOf(zzhc.zzG(zzgjVar2.zzb)));
                                                        unsafe6.putInt(obj4, j3, i28);
                                                        iZzn = iZza;
                                                        i23 = i22;
                                                        zzkhVar = zzkhVar3;
                                                        i25 = i14;
                                                        i24 = i27;
                                                        i15 = i28;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i25 = i14;
                                                    i24 = i27;
                                                    i15 = i28;
                                                    z = true;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                                case 68:
                                                    if (i75 == 3) {
                                                        i28 = i20;
                                                        Object objZzB2 = zzkhVar3.zzB(obj4, i28, i14);
                                                        i27 = i21;
                                                        int iZzm = zzgk.zzm(objZzB2, zzkhVar3.zzx(i14), bArr, i27, i3, (i22 & (-8)) | 4, zzgjVar);
                                                        zzkhVar3.zzK(obj4, i28, i14, objZzB2);
                                                        iZzn = iZzm;
                                                        zzgjVar2 = zzgjVar2;
                                                        i23 = i22;
                                                        zzkhVar = zzkhVar3;
                                                        i25 = i14;
                                                        i24 = i27;
                                                        i15 = i28;
                                                        z = true;
                                                        if (iZzn == i24) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    i23 = i22;
                                                    zzkhVar = zzkhVar3;
                                                    i24 = i21;
                                                    i15 = i20;
                                                    z = true;
                                                    i25 = i14;
                                                    iZzn = i24;
                                                    if (iZzn == i24) {
                                                    }
                                                    break;
                                            }
                                        } else {
                                            if (i75 == 2) {
                                                Unsafe unsafe7 = zzb;
                                                Object objZzz = zzkhVar3.zzz(i14);
                                                Object object = unsafe7.getObject(obj, j2);
                                                if (zzjz.zza(object)) {
                                                    zzjy zzjyVarZzb = zzjy.zza().zzb();
                                                    zzjz.zzb(zzjyVarZzb, object);
                                                    unsafe7.putObject(obj, j2, zzjyVarZzb);
                                                }
                                                throw null;
                                            }
                                            obj4 = obj;
                                        }
                                    } else {
                                        long j4 = i76;
                                        Unsafe unsafe8 = zzb;
                                        zzjb zzjbVar2 = (zzjb) unsafe8.getObject(obj4, j2);
                                        if (zzjbVar2.zzc()) {
                                            j = j4;
                                            zzjbVar = zzjbVar2;
                                        } else {
                                            int size = zzjbVar2.size();
                                            j = j4;
                                            zzjb zzjbVarZzd = zzjbVar2.zzd(size != 0 ? size + size : 10);
                                            unsafe8.putObject(obj4, j2, zzjbVarZzd);
                                            zzjbVar = zzjbVarZzd;
                                        }
                                        switch (iZzt) {
                                            case 18:
                                            case 35:
                                                i29 = i90;
                                                i30 = i73;
                                                i31 = i77;
                                                zzgjVar2 = zzgjVar6;
                                                i32 = i91;
                                                z3 = true;
                                                unsafe = unsafe2;
                                                zzkhVar4 = this;
                                                if (i75 == 2) {
                                                    zzhy zzhyVar = (zzhy) zzjbVar;
                                                    iZzi = zzgk.zzi(bArr, i29, zzgjVar2);
                                                    int i94 = zzgjVar2.zza + iZzi;
                                                    while (iZzi < i94) {
                                                        zzhyVar.zze(Double.longBitsToDouble(zzgk.zzp(bArr, iZzi)));
                                                        iZzi += 8;
                                                    }
                                                    if (iZzi != i94) {
                                                        throw zzje.zzj();
                                                    }
                                                    iZzk = iZzi;
                                                    i67 = i14;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                        i14 = i67;
                                                        iZzl = iZzk;
                                                        i11 = i38;
                                                        i8 = i31;
                                                        zzkhVar = zzkhVar4;
                                                        z = z3;
                                                        i15 = i30;
                                                        i5 = i4;
                                                        break;
                                                    } else {
                                                        iZzh = iZzk;
                                                        i11 = i38;
                                                        i68 = i31;
                                                        zzkhVar = zzkhVar4;
                                                        i15 = i30;
                                                        i69 = i12;
                                                        i63 = i3;
                                                        i64 = i4;
                                                        i66 = i15;
                                                        zzgjVar6 = zzgjVar2;
                                                        zzkhVar12 = zzkhVar;
                                                        i65 = -1;
                                                        i70 = i11;
                                                        unsafe5 = unsafe;
                                                        break;
                                                    }
                                                } else {
                                                    if (i75 == 1) {
                                                        iZzk = i29 + 8;
                                                        zzhy zzhyVar2 = (zzhy) zzjbVar;
                                                        zzhyVar2.zze(Double.longBitsToDouble(zzgk.zzp(bArr, i29)));
                                                        while (iZzk < i19) {
                                                            int iZzi7 = zzgk.zzi(bArr, iZzk, zzgjVar2);
                                                            if (i31 == zzgjVar2.zza) {
                                                                zzhyVar2.zze(Double.longBitsToDouble(zzgk.zzp(bArr, iZzi7)));
                                                                iZzk = iZzi7 + 8;
                                                            } else {
                                                                i67 = i14;
                                                                i38 = i32;
                                                                obj4 = obj;
                                                                if (iZzk != i29) {
                                                                }
                                                            }
                                                        }
                                                        i67 = i14;
                                                        i38 = i32;
                                                        obj4 = obj;
                                                        if (iZzk != i29) {
                                                        }
                                                    }
                                                    i40 = i29;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                            case 19:
                                            case 36:
                                                i29 = i90;
                                                i30 = i73;
                                                i31 = i77;
                                                zzgjVar2 = zzgjVar6;
                                                i32 = i91;
                                                z3 = true;
                                                unsafe = unsafe2;
                                                zzkhVar4 = this;
                                                if (i75 == 2) {
                                                    zzil zzilVar = (zzil) zzjbVar;
                                                    iZzi = zzgk.zzi(bArr, i29, zzgjVar2);
                                                    int i95 = zzgjVar2.zza + iZzi;
                                                    while (iZzi < i95) {
                                                        zzilVar.zze(Float.intBitsToFloat(zzgk.zzb(bArr, iZzi)));
                                                        iZzi += 4;
                                                    }
                                                    if (iZzi != i95) {
                                                        throw zzje.zzj();
                                                    }
                                                    iZzk = iZzi;
                                                    i67 = i14;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                } else {
                                                    if (i75 == 5) {
                                                        iZzk = i29 + 4;
                                                        zzil zzilVar2 = (zzil) zzjbVar;
                                                        zzilVar2.zze(Float.intBitsToFloat(zzgk.zzb(bArr, i29)));
                                                        while (iZzk < i19) {
                                                            int iZzi8 = zzgk.zzi(bArr, iZzk, zzgjVar2);
                                                            if (i31 == zzgjVar2.zza) {
                                                                zzilVar2.zze(Float.intBitsToFloat(zzgk.zzb(bArr, iZzi8)));
                                                                iZzk = iZzi8 + 4;
                                                            } else {
                                                                i67 = i14;
                                                                i38 = i32;
                                                                obj4 = obj;
                                                                if (iZzk != i29) {
                                                                }
                                                            }
                                                        }
                                                        i67 = i14;
                                                        i38 = i32;
                                                        obj4 = obj;
                                                        if (iZzk != i29) {
                                                        }
                                                    }
                                                    i40 = i29;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                i29 = i90;
                                                i30 = i73;
                                                i31 = i77;
                                                zzgjVar2 = zzgjVar6;
                                                i32 = i91;
                                                z3 = true;
                                                unsafe = unsafe2;
                                                zzkhVar4 = this;
                                                if (i75 == 2) {
                                                    zzjt zzjtVar = (zzjt) zzjbVar;
                                                    iZzi = zzgk.zzi(bArr, i29, zzgjVar2);
                                                    int i96 = zzgjVar2.zza + iZzi;
                                                    while (iZzi < i96) {
                                                        iZzi = zzgk.zzl(bArr, iZzi, zzgjVar2);
                                                        zzjtVar.zzg(zzgjVar2.zzb);
                                                    }
                                                    if (iZzi != i96) {
                                                        throw zzje.zzj();
                                                    }
                                                } else {
                                                    if (i75 == 0) {
                                                        zzjt zzjtVar2 = (zzjt) zzjbVar;
                                                        iZzi = zzgk.zzl(bArr, i29, zzgjVar2);
                                                        zzjtVar2.zzg(zzgjVar2.zzb);
                                                        while (iZzi < i19) {
                                                            int iZzi9 = zzgk.zzi(bArr, iZzi, zzgjVar2);
                                                            if (i31 == zzgjVar2.zza) {
                                                                iZzi = zzgk.zzl(bArr, iZzi9, zzgjVar2);
                                                                zzjtVar2.zzg(zzgjVar2.zzb);
                                                            }
                                                        }
                                                    }
                                                    i40 = i29;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                iZzk = iZzi;
                                                i67 = i14;
                                                i38 = i32;
                                                obj4 = obj;
                                                if (iZzk != i29) {
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                i29 = i90;
                                                i33 = i73;
                                                i34 = i77;
                                                zzgjVar3 = zzgjVar6;
                                                i32 = i91;
                                                z4 = true;
                                                unsafe = unsafe2;
                                                zzkhVar5 = this;
                                                if (i75 == 2) {
                                                    iZzf = zzgk.zzf(bArr, i29, zzjbVar, zzgjVar3);
                                                    z3 = z4;
                                                    i31 = i34;
                                                    zzkhVar4 = zzkhVar5;
                                                    i30 = i33;
                                                    i35 = i29;
                                                    iZzk = iZzf;
                                                    zzgjVar2 = zzgjVar3;
                                                    i67 = i14;
                                                    i29 = i35;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                } else {
                                                    if (i75 == 0) {
                                                        z3 = true;
                                                        zzgjVar2 = zzgjVar3;
                                                        i31 = i34;
                                                        zzkhVar4 = zzkhVar5;
                                                        i30 = i33;
                                                        i35 = i29;
                                                        iZzk = zzgk.zzk(i34, bArr, i29, i3, zzjbVar, zzgjVar);
                                                        i67 = i14;
                                                        i29 = i35;
                                                        i38 = i32;
                                                        obj4 = obj;
                                                        if (iZzk != i29) {
                                                        }
                                                    }
                                                    z3 = z4;
                                                    zzgjVar2 = zzgjVar3;
                                                    i31 = i34;
                                                    zzkhVar4 = zzkhVar5;
                                                    i30 = i33;
                                                    i36 = i29;
                                                    i40 = i36;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                                            case 40:
                                            case 46:
                                                i29 = i90;
                                                i33 = i73;
                                                i34 = i77;
                                                zzgjVar3 = zzgjVar6;
                                                i32 = i91;
                                                unsafe = unsafe2;
                                                zzkhVar5 = this;
                                                if (i75 == 2) {
                                                    zzjt zzjtVar3 = (zzjt) zzjbVar;
                                                    iZzi3 = zzgk.zzi(bArr, i29, zzgjVar3);
                                                    int i97 = zzgjVar3.zza + iZzi3;
                                                    while (iZzi3 < i97) {
                                                        zzjtVar3.zzg(zzgk.zzp(bArr, iZzi3));
                                                        iZzi3 += 8;
                                                    }
                                                    if (iZzi3 != i97) {
                                                        throw zzje.zzj();
                                                    }
                                                    iZzf = iZzi3;
                                                    z4 = true;
                                                    z3 = z4;
                                                    i31 = i34;
                                                    zzkhVar4 = zzkhVar5;
                                                    i30 = i33;
                                                    i35 = i29;
                                                    iZzk = iZzf;
                                                    zzgjVar2 = zzgjVar3;
                                                    i67 = i14;
                                                    i29 = i35;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                } else {
                                                    z4 = true;
                                                    if (i75 == 1) {
                                                        iZzi2 = i29 + 8;
                                                        zzjt zzjtVar4 = (zzjt) zzjbVar;
                                                        zzjtVar4.zzg(zzgk.zzp(bArr, i29));
                                                        while (iZzi2 < i19) {
                                                            int iZzi10 = zzgk.zzi(bArr, iZzi2, zzgjVar3);
                                                            if (i34 == zzgjVar3.zza) {
                                                                zzjtVar4.zzg(zzgk.zzp(bArr, iZzi10));
                                                                iZzi2 = iZzi10 + 8;
                                                            } else {
                                                                i37 = i34;
                                                                i67 = i14;
                                                                z3 = z4;
                                                                zzkhVar4 = zzkhVar5;
                                                                i30 = i33;
                                                                i31 = i37;
                                                                iZzk = iZzi2;
                                                                i38 = i32;
                                                                zzgjVar2 = zzgjVar3;
                                                                obj4 = obj;
                                                                if (iZzk != i29) {
                                                                }
                                                            }
                                                        }
                                                        i37 = i34;
                                                        i67 = i14;
                                                        z3 = z4;
                                                        zzkhVar4 = zzkhVar5;
                                                        i30 = i33;
                                                        i31 = i37;
                                                        iZzk = iZzi2;
                                                        i38 = i32;
                                                        zzgjVar2 = zzgjVar3;
                                                        obj4 = obj;
                                                        if (iZzk != i29) {
                                                        }
                                                    }
                                                    z3 = z4;
                                                    zzgjVar2 = zzgjVar3;
                                                    i31 = i34;
                                                    zzkhVar4 = zzkhVar5;
                                                    i30 = i33;
                                                    i36 = i29;
                                                    i40 = i36;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                i29 = i90;
                                                i33 = i73;
                                                i34 = i77;
                                                zzgjVar3 = zzgjVar6;
                                                i32 = i91;
                                                unsafe = unsafe2;
                                                zzkhVar5 = this;
                                                if (i75 == 2) {
                                                    zziu zziuVar = (zziu) zzjbVar;
                                                    iZzi3 = zzgk.zzi(bArr, i29, zzgjVar3);
                                                    int i98 = zzgjVar3.zza + iZzi3;
                                                    while (iZzi3 < i98) {
                                                        zziuVar.zzg(zzgk.zzb(bArr, iZzi3));
                                                        iZzi3 += 4;
                                                    }
                                                    if (iZzi3 != i98) {
                                                        throw zzje.zzj();
                                                    }
                                                    iZzf = iZzi3;
                                                    z4 = true;
                                                    z3 = z4;
                                                    i31 = i34;
                                                    zzkhVar4 = zzkhVar5;
                                                    i30 = i33;
                                                    i35 = i29;
                                                    iZzk = iZzf;
                                                    zzgjVar2 = zzgjVar3;
                                                    i67 = i14;
                                                    i29 = i35;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                } else {
                                                    if (i75 == 5) {
                                                        zziu zziuVar2 = (zziu) zzjbVar;
                                                        zziuVar2.zzg(zzgk.zzb(bArr, i29));
                                                        iZzi2 = i29 + 4;
                                                        while (iZzi2 < i19) {
                                                            int iZzi11 = zzgk.zzi(bArr, iZzi2, zzgjVar3);
                                                            if (i34 == zzgjVar3.zza) {
                                                                zziuVar2.zzg(zzgk.zzb(bArr, iZzi11));
                                                                iZzi2 = iZzi11 + 4;
                                                            } else {
                                                                z4 = true;
                                                                i37 = i34;
                                                                i67 = i14;
                                                                z3 = z4;
                                                                zzkhVar4 = zzkhVar5;
                                                                i30 = i33;
                                                                i31 = i37;
                                                                iZzk = iZzi2;
                                                                i38 = i32;
                                                                zzgjVar2 = zzgjVar3;
                                                                obj4 = obj;
                                                                if (iZzk != i29) {
                                                                }
                                                            }
                                                        }
                                                        z4 = true;
                                                        i37 = i34;
                                                        i67 = i14;
                                                        z3 = z4;
                                                        zzkhVar4 = zzkhVar5;
                                                        i30 = i33;
                                                        i31 = i37;
                                                        iZzk = iZzi2;
                                                        i38 = i32;
                                                        zzgjVar2 = zzgjVar3;
                                                        obj4 = obj;
                                                        if (iZzk != i29) {
                                                        }
                                                    }
                                                    zzgjVar2 = zzgjVar3;
                                                    i31 = i34;
                                                    zzkhVar4 = zzkhVar5;
                                                    i30 = i33;
                                                    i36 = i29;
                                                    z3 = true;
                                                    i40 = i36;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                i29 = i90;
                                                i33 = i73;
                                                i34 = i77;
                                                zzgjVar3 = zzgjVar6;
                                                i32 = i91;
                                                unsafe = unsafe2;
                                                zzkhVar5 = this;
                                                if (i75 == 2) {
                                                    zzgl zzglVar = (zzgl) zzjbVar;
                                                    iZzi3 = zzgk.zzi(bArr, i29, zzgjVar3);
                                                    int i99 = zzgjVar3.zza + iZzi3;
                                                    while (iZzi3 < i99) {
                                                        iZzi3 = zzgk.zzl(bArr, iZzi3, zzgjVar3);
                                                        zzglVar.zze(zzgjVar3.zzb != 0);
                                                    }
                                                    if (iZzi3 != i99) {
                                                        throw zzje.zzj();
                                                    }
                                                } else {
                                                    if (i75 == 0) {
                                                        zzgl zzglVar2 = (zzgl) zzjbVar;
                                                        iZzi3 = zzgk.zzl(bArr, i29, zzgjVar3);
                                                        zzglVar2.zze(zzgjVar3.zzb != 0);
                                                        while (iZzi3 < i19) {
                                                            int iZzi12 = zzgk.zzi(bArr, iZzi3, zzgjVar3);
                                                            if (i34 == zzgjVar3.zza) {
                                                                iZzi3 = zzgk.zzl(bArr, iZzi12, zzgjVar3);
                                                                zzglVar2.zze(zzgjVar3.zzb != 0);
                                                            }
                                                        }
                                                    }
                                                    zzgjVar2 = zzgjVar3;
                                                    i31 = i34;
                                                    zzkhVar4 = zzkhVar5;
                                                    i30 = i33;
                                                    i36 = i29;
                                                    z3 = true;
                                                    i40 = i36;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                iZzf = iZzi3;
                                                z4 = true;
                                                z3 = z4;
                                                i31 = i34;
                                                zzkhVar4 = zzkhVar5;
                                                i30 = i33;
                                                i35 = i29;
                                                iZzk = iZzf;
                                                zzgjVar2 = zzgjVar3;
                                                i67 = i14;
                                                i29 = i35;
                                                i38 = i32;
                                                obj4 = obj;
                                                if (iZzk != i29) {
                                                }
                                                break;
                                            case 26:
                                                i29 = i90;
                                                i33 = i73;
                                                i34 = i77;
                                                zzgjVar3 = zzgjVar6;
                                                i32 = i91;
                                                z4 = true;
                                                unsafe = unsafe2;
                                                zzkhVar5 = this;
                                                if (i75 == 2) {
                                                    if ((j & 536870912) == 0) {
                                                        iZzi2 = zzgk.zzi(bArr, i29, zzgjVar3);
                                                        int i100 = zzgjVar3.zza;
                                                        if (i100 < 0) {
                                                            throw zzje.zzf();
                                                        }
                                                        if (i100 == 0) {
                                                            obj3 = "";
                                                            zzjbVar.add(obj3);
                                                        } else {
                                                            obj3 = "";
                                                            zzjbVar.add(new String(bArr, iZzi2, i100, zzjc.zzb));
                                                            iZzi2 += i100;
                                                        }
                                                        while (iZzi2 < i19) {
                                                            int iZzi13 = zzgk.zzi(bArr, iZzi2, zzgjVar3);
                                                            if (i34 == zzgjVar3.zza) {
                                                                iZzi2 = zzgk.zzi(bArr, iZzi13, zzgjVar3);
                                                                int i101 = zzgjVar3.zza;
                                                                if (i101 < 0) {
                                                                    throw zzje.zzf();
                                                                }
                                                                if (i101 == 0) {
                                                                    zzjbVar.add(obj3);
                                                                } else {
                                                                    zzjbVar.add(new String(bArr, iZzi2, i101, zzjc.zzb));
                                                                    iZzi2 += i101;
                                                                }
                                                            } else {
                                                                i37 = i34;
                                                                i67 = i14;
                                                                z3 = z4;
                                                                zzkhVar4 = zzkhVar5;
                                                                i30 = i33;
                                                                i31 = i37;
                                                                iZzk = iZzi2;
                                                                i38 = i32;
                                                                zzgjVar2 = zzgjVar3;
                                                                obj4 = obj;
                                                                if (iZzk != i29) {
                                                                }
                                                            }
                                                        }
                                                        i37 = i34;
                                                        i67 = i14;
                                                        z3 = z4;
                                                        zzkhVar4 = zzkhVar5;
                                                        i30 = i33;
                                                        i31 = i37;
                                                        iZzk = iZzi2;
                                                        i38 = i32;
                                                        zzgjVar2 = zzgjVar3;
                                                        obj4 = obj;
                                                        if (iZzk != i29) {
                                                        }
                                                    } else {
                                                        iZzi2 = zzgk.zzi(bArr, i29, zzgjVar3);
                                                        int i102 = zzgjVar3.zza;
                                                        if (i102 < 0) {
                                                            throw zzje.zzf();
                                                        }
                                                        if (i102 == 0) {
                                                            zzjbVar.add("");
                                                            i39 = i34;
                                                            i67 = i14;
                                                            i37 = i39;
                                                        } else {
                                                            int i103 = iZzi2 + i102;
                                                            if (!zzma.zzf(bArr, iZzi2, i103)) {
                                                                throw zzje.zzd();
                                                            }
                                                            zzjbVar.add(new String(bArr, iZzi2, i102, zzjc.zzb));
                                                            i67 = i14;
                                                            i37 = i34;
                                                            i39 = i34;
                                                            iZzi2 = i103;
                                                        }
                                                        while (iZzi2 < i19) {
                                                            int iZzi14 = zzgk.zzi(bArr, iZzi2, zzgjVar3);
                                                            if (i39 == zzgjVar3.zza) {
                                                                iZzi2 = zzgk.zzi(bArr, iZzi14, zzgjVar3);
                                                                int i104 = zzgjVar3.zza;
                                                                if (i104 < 0) {
                                                                    throw zzje.zzf();
                                                                }
                                                                if (i104 == 0) {
                                                                    zzjbVar.add("");
                                                                } else {
                                                                    int i105 = iZzi2 + i104;
                                                                    if (!zzma.zzf(bArr, iZzi2, i105)) {
                                                                        throw zzje.zzd();
                                                                    }
                                                                    zzjbVar.add(new String(bArr, iZzi2, i104, zzjc.zzb));
                                                                    i39 = i39;
                                                                    iZzi2 = i105;
                                                                }
                                                            } else {
                                                                z4 = true;
                                                                z3 = z4;
                                                                zzkhVar4 = zzkhVar5;
                                                                i30 = i33;
                                                                i31 = i37;
                                                                iZzk = iZzi2;
                                                                i38 = i32;
                                                                zzgjVar2 = zzgjVar3;
                                                                obj4 = obj;
                                                                if (iZzk != i29) {
                                                                }
                                                            }
                                                        }
                                                        z4 = true;
                                                        z3 = z4;
                                                        zzkhVar4 = zzkhVar5;
                                                        i30 = i33;
                                                        i31 = i37;
                                                        iZzk = iZzi2;
                                                        i38 = i32;
                                                        zzgjVar2 = zzgjVar3;
                                                        obj4 = obj;
                                                        if (iZzk != i29) {
                                                        }
                                                    }
                                                }
                                                z3 = z4;
                                                zzgjVar2 = zzgjVar3;
                                                i31 = i34;
                                                zzkhVar4 = zzkhVar5;
                                                i30 = i33;
                                                i36 = i29;
                                                i40 = i36;
                                                i67 = i14;
                                                iZzk = i40;
                                                i29 = iZzk;
                                                i38 = i32;
                                                obj4 = obj;
                                                if (iZzk != i29) {
                                                }
                                                break;
                                            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                                                i29 = i90;
                                                i32 = i91;
                                                unsafe = unsafe2;
                                                if (i75 == 2) {
                                                    i33 = i73;
                                                    zzkhVar5 = this;
                                                    i34 = i77;
                                                    zzgjVar3 = zzgjVar6;
                                                    z4 = true;
                                                    iZzf = zzgk.zze(zzx(i14), i77, bArr, i29, i3, zzjbVar, zzgjVar);
                                                    z3 = z4;
                                                    i31 = i34;
                                                    zzkhVar4 = zzkhVar5;
                                                    i30 = i33;
                                                    i35 = i29;
                                                    iZzk = iZzf;
                                                    zzgjVar2 = zzgjVar3;
                                                    i67 = i14;
                                                    i29 = i35;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                } else {
                                                    i36 = i29;
                                                    i30 = i73;
                                                    zzgjVar2 = zzgjVar6;
                                                    z3 = true;
                                                    zzkhVar4 = this;
                                                    i31 = i77;
                                                    i40 = i36;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                break;
                                            case 28:
                                                zzkhVar6 = this;
                                                i29 = i90;
                                                i32 = i91;
                                                z5 = true;
                                                unsafe = unsafe2;
                                                if (i75 == 2) {
                                                    int iZzi15 = zzgk.zzi(bArr, i29, zzgjVar6);
                                                    int i106 = zzgjVar6.zza;
                                                    if (i106 < 0) {
                                                        throw zzje.zzf();
                                                    }
                                                    if (i106 > bArr.length - iZzi15) {
                                                        throw zzje.zzj();
                                                    }
                                                    if (i106 == 0) {
                                                        zzjbVar.add(zzgw.zzb);
                                                        iZzk = iZzi15;
                                                        i67 = i14;
                                                        i38 = i32;
                                                    } else {
                                                        zzjbVar.add(zzgw.zzm(bArr, iZzi15, i106));
                                                        i67 = i14;
                                                        i38 = i32;
                                                        i12 = i12;
                                                        i29 = i29;
                                                        iZzk = iZzi15 + i106;
                                                    }
                                                    while (iZzk < i19) {
                                                        int iZzi16 = zzgk.zzi(bArr, iZzk, zzgjVar6);
                                                        if (i77 == zzgjVar6.zza) {
                                                            iZzk = zzgk.zzi(bArr, iZzi16, zzgjVar6);
                                                            int i107 = zzgjVar6.zza;
                                                            if (i107 < 0) {
                                                                throw zzje.zzf();
                                                            }
                                                            if (i107 > bArr.length - iZzk) {
                                                                throw zzje.zzj();
                                                            }
                                                            if (i107 == 0) {
                                                                zzjbVar.add(zzgw.zzb);
                                                            } else {
                                                                zzjbVar.add(zzgw.zzm(bArr, iZzk, i107));
                                                                i12 = i12;
                                                                i29 = i29;
                                                                iZzk += i107;
                                                            }
                                                        } else {
                                                            boolean z8 = z5;
                                                            i30 = i73;
                                                            zzgjVar2 = zzgjVar6;
                                                            z3 = z8;
                                                            zzkhVar4 = zzkhVar6;
                                                            i31 = i77;
                                                            obj4 = obj;
                                                            if (iZzk != i29) {
                                                            }
                                                        }
                                                    }
                                                    boolean z82 = z5;
                                                    i30 = i73;
                                                    zzgjVar2 = zzgjVar6;
                                                    z3 = z82;
                                                    zzkhVar4 = zzkhVar6;
                                                    i31 = i77;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                i40 = i29;
                                                boolean z9 = z5;
                                                i30 = i73;
                                                zzgjVar2 = zzgjVar6;
                                                z3 = z9;
                                                zzkhVar4 = zzkhVar6;
                                                i31 = i77;
                                                i67 = i14;
                                                iZzk = i40;
                                                i29 = iZzk;
                                                i38 = i32;
                                                obj4 = obj;
                                                if (iZzk != i29) {
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                if (i75 == 2) {
                                                    iZzk2 = zzgk.zzf(bArr, i90, zzjbVar, zzgjVar6);
                                                    zzkhVar6 = this;
                                                    i41 = i90;
                                                    i42 = i91;
                                                    z5 = true;
                                                    unsafe = unsafe2;
                                                } else if (i75 == 0) {
                                                    zzkhVar6 = this;
                                                    z5 = true;
                                                    i41 = i90;
                                                    i42 = i91;
                                                    unsafe = unsafe2;
                                                    iZzk2 = zzgk.zzk(i77, bArr, i90, i3, zzjbVar, zzgjVar);
                                                } else {
                                                    zzkhVar6 = this;
                                                    i32 = i91;
                                                    z5 = true;
                                                    unsafe = unsafe2;
                                                    i29 = i90;
                                                    i40 = i29;
                                                    boolean z92 = z5;
                                                    i30 = i73;
                                                    zzgjVar2 = zzgjVar6;
                                                    z3 = z92;
                                                    zzkhVar4 = zzkhVar6;
                                                    i31 = i77;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                int i108 = iZzk2;
                                                zzkt.zzo(obj, i73, zzjbVar, zzkhVar6.zzw(i14), null, zzkhVar6.zzn);
                                                i67 = i14;
                                                i29 = i41;
                                                iZzk = i108;
                                                i38 = i42;
                                                boolean z822 = z5;
                                                i30 = i73;
                                                zzgjVar2 = zzgjVar6;
                                                z3 = z822;
                                                zzkhVar4 = zzkhVar6;
                                                i31 = i77;
                                                obj4 = obj;
                                                if (iZzk != i29) {
                                                }
                                                break;
                                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                            case 47:
                                                if (i75 == 2) {
                                                    zziu zziuVar3 = (zziu) zzjbVar;
                                                    iZzi4 = zzgk.zzi(bArr, i90, zzgjVar6);
                                                    int i109 = zzgjVar6.zza + iZzi4;
                                                    while (iZzi4 < i109) {
                                                        iZzi4 = zzgk.zzi(bArr, iZzi4, zzgjVar6);
                                                        zziuVar3.zzg(zzhc.zzF(zzgjVar6.zza));
                                                    }
                                                    if (iZzi4 != i109) {
                                                        throw zzje.zzj();
                                                    }
                                                } else {
                                                    if (i75 == 0) {
                                                        zziu zziuVar4 = (zziu) zzjbVar;
                                                        iZzi4 = zzgk.zzi(bArr, i90, zzgjVar6);
                                                        zziuVar4.zzg(zzhc.zzF(zzgjVar6.zza));
                                                        while (iZzi4 < i19) {
                                                            int iZzi17 = zzgk.zzi(bArr, iZzi4, zzgjVar6);
                                                            if (i77 == zzgjVar6.zza) {
                                                                iZzi4 = zzgk.zzi(bArr, iZzi17, zzgjVar6);
                                                                zziuVar4.zzg(zzhc.zzF(zzgjVar6.zza));
                                                            }
                                                        }
                                                    }
                                                    zzkhVar6 = this;
                                                    i29 = i90;
                                                    i32 = i91;
                                                    z5 = true;
                                                    unsafe = unsafe2;
                                                    i40 = i29;
                                                    boolean z922 = z5;
                                                    i30 = i73;
                                                    zzgjVar2 = zzgjVar6;
                                                    z3 = z922;
                                                    zzkhVar4 = zzkhVar6;
                                                    i31 = i77;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                i30 = i73;
                                                i31 = i77;
                                                zzgjVar2 = zzgjVar6;
                                                i32 = i91;
                                                z3 = true;
                                                unsafe = unsafe2;
                                                zzkhVar4 = this;
                                                iZzk = iZzi4;
                                                i43 = i90;
                                                i67 = i14;
                                                i29 = i43;
                                                i38 = i32;
                                                obj4 = obj;
                                                if (iZzk != i29) {
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                if (i75 == 2) {
                                                    zzjt zzjtVar5 = (zzjt) zzjbVar;
                                                    iZzi4 = zzgk.zzi(bArr, i90, zzgjVar6);
                                                    int i110 = zzgjVar6.zza + iZzi4;
                                                    while (iZzi4 < i110) {
                                                        iZzi4 = zzgk.zzl(bArr, iZzi4, zzgjVar6);
                                                        zzjtVar5.zzg(zzhc.zzG(zzgjVar6.zzb));
                                                    }
                                                    if (iZzi4 != i110) {
                                                        throw zzje.zzj();
                                                    }
                                                } else {
                                                    if (i75 == 0) {
                                                        zzjt zzjtVar6 = (zzjt) zzjbVar;
                                                        iZzi4 = zzgk.zzl(bArr, i90, zzgjVar6);
                                                        zzjtVar6.zzg(zzhc.zzG(zzgjVar6.zzb));
                                                        while (iZzi4 < i19) {
                                                            int iZzi18 = zzgk.zzi(bArr, iZzi4, zzgjVar6);
                                                            if (i77 == zzgjVar6.zza) {
                                                                iZzi4 = zzgk.zzl(bArr, iZzi18, zzgjVar6);
                                                                zzjtVar6.zzg(zzhc.zzG(zzgjVar6.zzb));
                                                            }
                                                        }
                                                    }
                                                    zzkhVar6 = this;
                                                    i29 = i90;
                                                    i32 = i91;
                                                    z5 = true;
                                                    unsafe = unsafe2;
                                                    i40 = i29;
                                                    boolean z9222 = z5;
                                                    i30 = i73;
                                                    zzgjVar2 = zzgjVar6;
                                                    z3 = z9222;
                                                    zzkhVar4 = zzkhVar6;
                                                    i31 = i77;
                                                    i67 = i14;
                                                    iZzk = i40;
                                                    i29 = iZzk;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                i30 = i73;
                                                i31 = i77;
                                                zzgjVar2 = zzgjVar6;
                                                i32 = i91;
                                                z3 = true;
                                                unsafe = unsafe2;
                                                zzkhVar4 = this;
                                                iZzk = iZzi4;
                                                i43 = i90;
                                                i67 = i14;
                                                i29 = i43;
                                                i38 = i32;
                                                obj4 = obj;
                                                if (iZzk != i29) {
                                                }
                                                break;
                                            default:
                                                i29 = i90;
                                                i30 = i73;
                                                i31 = i77;
                                                zzgjVar2 = zzgjVar6;
                                                i32 = i91;
                                                z3 = true;
                                                unsafe = unsafe2;
                                                zzkhVar4 = this;
                                                if (i75 == 3) {
                                                    int i111 = (i31 & (-8)) | 4;
                                                    zzkr zzkrVarZzx = zzkhVar4.zzx(i14);
                                                    i43 = i29;
                                                    int iZzc = zzgk.zzc(zzkrVarZzx, bArr, i29, i3, i111, zzgjVar);
                                                    zzjbVar.add(zzgjVar2.zzc);
                                                    while (iZzc < i19) {
                                                        int iZzi19 = zzgk.zzi(bArr, iZzc, zzgjVar2);
                                                        if (i31 == zzgjVar2.zza) {
                                                            iZzc = zzgk.zzc(zzkrVarZzx, bArr, iZzi19, i3, i111, zzgjVar);
                                                            zzjbVar.add(zzgjVar2.zzc);
                                                        } else {
                                                            iZzk = iZzc;
                                                            i67 = i14;
                                                            i29 = i43;
                                                            i38 = i32;
                                                            obj4 = obj;
                                                            if (iZzk != i29) {
                                                            }
                                                        }
                                                    }
                                                    iZzk = iZzc;
                                                    i67 = i14;
                                                    i29 = i43;
                                                    i38 = i32;
                                                    obj4 = obj;
                                                    if (iZzk != i29) {
                                                    }
                                                }
                                                i40 = i29;
                                                i67 = i14;
                                                iZzk = i40;
                                                i29 = iZzk;
                                                i38 = i32;
                                                obj4 = obj;
                                                if (iZzk != i29) {
                                                }
                                                break;
                                        }
                                    }
                                } else if (i75 == 2) {
                                    zzjb zzjbVarZzd2 = (zzjb) unsafe2.getObject(obj4, j2);
                                    if (!zzjbVarZzd2.zzc()) {
                                        int size2 = zzjbVarZzd2.size();
                                        zzjbVarZzd2 = zzjbVarZzd2.zzd(size2 != 0 ? size2 + size2 : 10);
                                        unsafe2.putObject(obj4, j2, zzjbVarZzd2);
                                    }
                                    zzjb zzjbVar3 = zzjbVarZzd2;
                                    i44 = i73;
                                    i45 = i77;
                                    zzgjVar4 = zzgjVar6;
                                    iZze = zzgk.zze(zzkhVar2.zzx(i14), i77, bArr, i90, i3, zzjbVar3, zzgjVar);
                                    i11 = i91;
                                    i64 = i4;
                                    zzgjVar6 = zzgjVar4;
                                    i63 = i19;
                                    i68 = i45;
                                    unsafe5 = unsafe2;
                                    i67 = i14;
                                    i65 = i13;
                                    i69 = i12;
                                    i70 = i11;
                                    zzkhVar12 = zzkhVar2;
                                    i66 = i44;
                                    iZzh = iZze;
                                } else {
                                    unsafe = unsafe2;
                                    i22 = i77;
                                    zzgjVar2 = zzgjVar6;
                                    i11 = i91;
                                    z2 = true;
                                    zzkhVar3 = zzkhVar2;
                                    i21 = i90;
                                    i20 = i73;
                                }
                                i5 = i4;
                                i8 = i22;
                                zzkhVar = zzkhVar3;
                                z = z2;
                                iZzl = i21;
                                i15 = i20;
                            }
                        }
                        if (i8 == i5 || i5 == 0) {
                            if (zzkhVar.zzh || (zzieVar = zzgjVar2.zzd) == zzie.zza) {
                                i16 = i3;
                                i17 = i15;
                                iZzh = zzgk.zzh(i8, bArr, iZzl, i3, zzd(obj), zzgjVar);
                            } else {
                                zzir zzirVarZza = zzieVar.zza(zzkhVar.zzg, i15);
                                if (zzirVarZza == null) {
                                    i17 = i15;
                                    i16 = i3;
                                    iZzh = zzgk.zzh(i8, bArr, iZzl, i3, zzd(obj), zzgjVar);
                                } else {
                                    i16 = i3;
                                    i17 = i15;
                                    zzip zzipVar = (zzip) obj4;
                                    zzipVar.zzi();
                                    zzij zzijVar = zzipVar.zzb;
                                    zzmb zzmbVar = zzirVarZza.zzb.zzb;
                                    if (zzmbVar == zzmb.zzn) {
                                        zzgk.zzi(bArr, iZzl, zzgjVar2);
                                        throw null;
                                    }
                                    switch (zzmbVar.ordinal()) {
                                        case 0:
                                            i18 = iZzl + 8;
                                            objValueOf = Double.valueOf(Double.longBitsToDouble(zzgk.zzp(bArr, iZzl)));
                                            iZzl = i18;
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 1:
                                            i18 = iZzl + 4;
                                            objValueOf = Float.valueOf(Float.intBitsToFloat(zzgk.zzb(bArr, iZzl)));
                                            iZzl = i18;
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 2:
                                        case 3:
                                            iZzl = zzgk.zzl(bArr, iZzl, zzgjVar2);
                                            objValueOf = Long.valueOf(zzgjVar2.zzb);
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 4:
                                        case 12:
                                            iZzl = zzgk.zzi(bArr, iZzl, zzgjVar2);
                                            objValueOf = Integer.valueOf(zzgjVar2.zza);
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 5:
                                        case 15:
                                            i18 = iZzl + 8;
                                            objValueOf = Long.valueOf(zzgk.zzp(bArr, iZzl));
                                            iZzl = i18;
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 6:
                                        case 14:
                                            i18 = iZzl + 4;
                                            objValueOf = Integer.valueOf(zzgk.zzb(bArr, iZzl));
                                            iZzl = i18;
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 7:
                                            iZzl = zzgk.zzl(bArr, iZzl, zzgjVar2);
                                            if (zzgjVar2.zzb == 0) {
                                                z = false;
                                            }
                                            objValueOf = Boolean.valueOf(z);
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 8:
                                            iZzl = zzgk.zzg(bArr, iZzl, zzgjVar2);
                                            obj2 = zzgjVar2.zzc;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 9:
                                            throw null;
                                        case 10:
                                            throw null;
                                        case 11:
                                            iZzl = zzgk.zza(bArr, iZzl, zzgjVar2);
                                            obj2 = zzgjVar2.zzc;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 13:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                                            iZzl = zzgk.zzi(bArr, iZzl, zzgjVar2);
                                            objValueOf = Integer.valueOf(zzhc.zzF(zzgjVar2.zza));
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        case 17:
                                            iZzl = zzgk.zzl(bArr, iZzl, zzgjVar2);
                                            objValueOf = Long.valueOf(zzhc.zzG(zzgjVar2.zzb));
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                        default:
                                            obj2 = objValueOf;
                                            zzijVar.zzi(zzirVarZza.zzb, obj2);
                                            iZzh = iZzl;
                                            break;
                                    }
                                }
                            }
                            i67 = i14;
                            zzkhVar12 = zzkhVar;
                            i68 = i8;
                            i66 = i17;
                            i63 = i16;
                            i65 = i13;
                            i69 = i12;
                            i70 = i11;
                            zzgjVar6 = zzgjVar2;
                            i64 = i5;
                            unsafe5 = unsafe;
                        } else {
                            i6 = i3;
                            i7 = iZzl;
                            i69 = i12;
                            i70 = i11;
                        }
                    } else {
                        iZzq = zzkhVar12.zzs(i73, i74);
                    }
                } else {
                    iZzq = zzkhVar12.zzq(i73);
                }
                i10 = iZzq;
                Object objValueOf2 = null;
                if (i10 != i65) {
                }
                if (i8 == i5) {
                }
                if (zzkhVar.zzh) {
                    i16 = i3;
                    i17 = i15;
                    iZzh = zzgk.zzh(i8, bArr, iZzl, i3, zzd(obj), zzgjVar);
                    i67 = i14;
                    zzkhVar12 = zzkhVar;
                    i68 = i8;
                    i66 = i17;
                    i63 = i16;
                    i65 = i13;
                    i69 = i12;
                    i70 = i11;
                    zzgjVar6 = zzgjVar2;
                    i64 = i5;
                    unsafe5 = unsafe;
                }
            } else {
                zzkhVar = zzkhVar12;
                unsafe = unsafe5;
                i5 = i64;
                i6 = i63;
                i7 = iZzh;
                i8 = i68;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzit) {
                zzit zzitVar = (zzit) obj;
                zzitVar.zzE(Integer.MAX_VALUE);
                zzitVar.zza = 0;
                zzitVar.zzC();
            }
            int[] iArr = this.zzc;
            for (int i2 = 0; i2 < iArr.length; i2 += 3) {
                int iZzu = zzu(i2);
                int iZzt = zzt(iZzu);
                long j = iZzu & 1048575;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
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
                                this.zzm.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzjy) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i2], i2)) {
                        zzx(i2).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i2)) {
                    zzx(i2).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzu = zzu(i2);
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i2];
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i2)) {
                        zzlv.zzo(obj, j, zzlv.zza(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i2)) {
                        zzlv.zzp(obj, j, zzlv.zzb(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i2)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i2)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i2)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i2)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i2)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i2)) {
                        zzlv.zzm(obj, j, zzlv.zzw(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i2)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i2);
                    break;
                case 10:
                    if (zzN(obj2, i2)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i2)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i2)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i2)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i2)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i2)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    if (zzN(obj2, i2)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i2);
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    zzlv.zzs(obj, j, zzjz.zzb(zzlv.zzf(obj, j), zzlv.zzf(obj2, j)));
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
                    if (zzR(obj2, i3, i2)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzI(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i2)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzI(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i2);
                    break;
            }
        }
        zzkt.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzkt.zzq(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzi(Object obj, byte[] bArr, int i2, int i3, zzgj zzgjVar) throws IOException {
        zzc(obj, bArr, i2, i3, 0, zzgjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzmd zzmdVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i2;
        Map.Entry entry2;
        int i3;
        Iterator it2;
        int[] iArr;
        boolean z;
        boolean z2;
        Map.Entry entry3;
        if (this.zzh) {
            zzij zzijVarZzb = this.zzo.zzb(obj);
            if (zzijVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzijVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        }
        int[] iArr2 = this.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < iArr2.length) {
            int iZzu = zzu(i6);
            int[] iArr3 = this.zzc;
            int iZzt = zzt(iZzu);
            int i7 = iArr3[i6];
            if (iZzt <= 17) {
                int i8 = iArr3[i6 + 2];
                int i9 = i8 & 1048575;
                if (i9 != i4) {
                    if (i9 == 1048575) {
                        entry3 = entry;
                        i5 = 0;
                    } else {
                        entry3 = entry;
                        i5 = unsafe.getInt(obj, i9);
                    }
                    i4 = i9;
                } else {
                    entry3 = entry;
                }
                i3 = 1 << (i8 >>> 20);
                i2 = i5;
                entry2 = entry3;
            } else {
                i2 = i5;
                entry2 = entry;
                i3 = 0;
            }
            int i10 = i4;
            while (entry2 != null && this.zzo.zza(entry2) <= i7) {
                this.zzo.zzi(zzmdVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzf(i7, zzlv.zza(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 1:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzo(i7, zzlv.zzb(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 2:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzt(i7, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 3:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzK(i7, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 4:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzr(i7, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 5:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzm(i7, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 6:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzk(i7, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 7:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzb(i7, zzlv.zzw(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 8:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzT(i7, unsafe.getObject(obj, j), zzmdVar);
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 9:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzv(i7, unsafe.getObject(obj, j), zzx(i6));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 10:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzd(i7, (zzgw) unsafe.getObject(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 11:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzI(i7, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 12:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzi(i7, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 13:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzx(i7, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 14:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzz(i7, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 15:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzB(i7, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzD(i7, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 17:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i6, i10, i2, i3)) {
                        zzmdVar.zzq(i7, unsafe.getObject(obj, j), zzx(i6));
                    }
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 18:
                    z = false;
                    zzkt.zzu(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 19:
                    z = false;
                    zzkt.zzy(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 20:
                    z = false;
                    zzkt.zzA(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 21:
                    z = false;
                    zzkt.zzG(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 22:
                    z = false;
                    zzkt.zzz(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 23:
                    z = false;
                    zzkt.zzx(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 24:
                    z = false;
                    zzkt.zzw(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 25:
                    z = false;
                    zzkt.zzt(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 26:
                    int i11 = this.zzc[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    if (list != null && !list.isEmpty()) {
                        zzmdVar.zzH(i11, list);
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                    break;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    int i12 = this.zzc[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzkr zzkrVarZzx = zzx(i6);
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ((zzhi) zzmdVar).zzv(i12, list2.get(i13), zzkrVarZzx);
                        }
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                    break;
                case 28:
                    int i14 = this.zzc[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    if (list3 != null && !list3.isEmpty()) {
                        zzmdVar.zze(i14, list3);
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                    break;
                case 29:
                    z2 = false;
                    zzkt.zzF(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 30:
                    z2 = false;
                    zzkt.zzv(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 31:
                    z2 = false;
                    zzkt.zzB(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    z2 = false;
                    zzkt.zzC(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    z2 = false;
                    zzkt.zzD(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 34:
                    z2 = false;
                    zzkt.zzE(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 35:
                    zzkt.zzu(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 36:
                    zzkt.zzy(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 37:
                    zzkt.zzA(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 38:
                    zzkt.zzG(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 39:
                    zzkt.zzz(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 40:
                    zzkt.zzx(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 41:
                    zzkt.zzw(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 42:
                    zzkt.zzt(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 43:
                    zzkt.zzF(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 44:
                    zzkt.zzv(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 45:
                    zzkt.zzB(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 46:
                    zzkt.zzC(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 47:
                    zzkt.zzD(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 48:
                    zzkt.zzE(this.zzc[i6], (List) unsafe.getObject(obj, j), zzmdVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 49:
                    int i15 = this.zzc[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzkr zzkrVarZzx2 = zzx(i6);
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i16 = 0; i16 < list4.size(); i16++) {
                            ((zzhi) zzmdVar).zzq(i15, list4.get(i16), zzkrVarZzx2);
                        }
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 51:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzf(i7, zzn(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 52:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzo(i7, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 53:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzt(i7, zzv(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzK(i7, zzv(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 55:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzr(i7, zzp(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 56:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzm(i7, zzv(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 57:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzk(i7, zzp(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 58:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzb(i7, zzS(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 59:
                    if (zzR(obj, i7, i6)) {
                        zzT(i7, unsafe.getObject(obj, j), zzmdVar);
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 60:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzv(i7, unsafe.getObject(obj, j), zzx(i6));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 61:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzd(i7, (zzgw) unsafe.getObject(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 62:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzI(i7, zzp(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 63:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzi(i7, zzp(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 64:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzx(i7, zzp(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 65:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzz(i7, zzv(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 66:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzB(i7, zzp(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 67:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzD(i7, zzv(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                case 68:
                    if (zzR(obj, i7, i6)) {
                        zzmdVar.zzq(i7, unsafe.getObject(obj, j), zzx(i6));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
                default:
                    it2 = it;
                    iArr = iArr2;
                    i6 += 3;
                    i4 = i10;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i5 = i2;
            }
        }
        Iterator it3 = it;
        while (entry != null) {
            this.zzo.zzi(zzmdVar, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        zzll zzllVar = this.zzn;
        zzllVar.zzq(zzllVar.zzd(obj), zzmdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzH;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzu = zzu(i2);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i2) || Double.doubleToLongBits(zzlv.zza(obj, j)) != Double.doubleToLongBits(zzlv.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i2) || Float.floatToIntBits(zzlv.zzb(obj, j)) != Float.floatToIntBits(zzlv.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i2) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i2) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i2) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i2) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i2) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i2) || zzlv.zzw(obj, j) != zzlv.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i2) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i2) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i2) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i2) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i2) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i2) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i2) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i2) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    if (!zzL(obj, obj2, i2) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i2) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
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
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j));
                    break;
                case 50:
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j));
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
                    long jZzr = zzr(i2) & 1048575;
                    if (zzlv.zzc(obj, jZzr) != zzlv.zzc(obj2, jZzr) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzH) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(Object obj) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int iZzu = zzu(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i3 = i4;
                i2 = i10;
            } else {
                i2 = i6;
                i3 = i4;
            }
            if ((268435456 & iZzu) != 0 && !zzO(obj, i7, i2, i3, i11)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj, i7, i2, i3, i11) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 27) {
                List list = (List) zzlv.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzkr zzkrVarZzx = zzx(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzkrVarZzx.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i8, i7) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt != 49) {
                if (iZzt == 50 && !((zzjy) zzlv.zzf(obj, iZzu & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i5++;
            i6 = i2;
            i4 = i3;
        }
        return !this.zzh || this.zzo.zzb(obj).zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzkq zzkqVar, zzie zzieVar) throws Throwable {
        zzll zzllVar;
        Object obj2;
        int iZzc;
        int iZzq;
        Object obj3;
        zzif zzifVar;
        zzie zzieVar2;
        Object objZzo;
        zzll zzllVar2;
        Object obj4;
        Object obj5 = obj;
        zzie zzieVar3 = zzieVar;
        zzD(obj);
        zzll zzllVar3 = this.zzn;
        zzif zzifVar2 = this.zzo;
        zzij zzijVarZzc = null;
        Object objZzc = null;
        while (true) {
            try {
                iZzc = zzkqVar.zzc();
                iZzq = zzq(iZzc);
            } catch (Throwable th) {
                th = th;
                zzllVar = zzllVar3;
                obj2 = obj5;
            }
            if (iZzq >= 0) {
                obj3 = objZzc;
                zzllVar = zzllVar3;
                obj2 = obj5;
                try {
                    int iZzu = zzu(iZzq);
                    try {
                    } catch (zzjd unused) {
                        objZzc = obj3;
                        zzifVar = zzifVar2;
                        zzieVar2 = zzieVar3;
                    }
                    switch (zzt(iZzu)) {
                        case 0:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzo(obj2, iZzu & 1048575, zzkqVar.zza());
                            zzH(obj2, iZzq);
                            break;
                        case 1:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzp(obj2, iZzu & 1048575, zzkqVar.zzb());
                            zzH(obj2, iZzq);
                            break;
                        case 2:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzl());
                            zzH(obj2, iZzq);
                            break;
                        case 3:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzo());
                            zzH(obj2, iZzq);
                            break;
                        case 4:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzg());
                            zzH(obj2, iZzq);
                            break;
                        case 5:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzk());
                            zzH(obj2, iZzq);
                            break;
                        case 6:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzf());
                            zzH(obj2, iZzq);
                            break;
                        case 7:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzm(obj2, iZzu & 1048575, zzkqVar.zzN());
                            zzH(obj2, iZzq);
                            break;
                        case 8:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzG(obj2, iZzu, zzkqVar);
                            zzH(obj2, iZzq);
                            break;
                        case 9:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzke zzkeVar = (zzke) zzA(obj2, iZzq);
                            zzkqVar.zzu(zzkeVar, zzx(iZzq), zzieVar2);
                            zzJ(obj2, iZzq, zzkeVar);
                            break;
                        case 10:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzs(obj2, iZzu & 1048575, zzkqVar.zzp());
                            zzH(obj2, iZzq);
                            break;
                        case 11:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzj());
                            zzH(obj2, iZzq);
                            break;
                        case 12:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            int iZze = zzkqVar.zze();
                            zzix zzixVarZzw = zzw(iZzq);
                            if (zzixVarZzw != null && !zzixVarZzw.zza(iZze)) {
                                objZzc = zzkt.zzp(obj2, iZzc, iZze, objZzc, zzllVar);
                                break;
                            } else {
                                zzlv.zzq(obj2, iZzu & 1048575, iZze);
                                zzH(obj2, iZzq);
                                break;
                            }
                            break;
                        case 13:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzh());
                            zzH(obj2, iZzq);
                            break;
                        case 14:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzm());
                            zzH(obj2, iZzq);
                            break;
                        case 15:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzi());
                            zzH(obj2, iZzq);
                            break;
                        case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzn());
                            zzH(obj2, iZzq);
                            break;
                        case 17:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzke zzkeVar2 = (zzke) zzA(obj2, iZzq);
                            zzkqVar.zzt(zzkeVar2, zzx(iZzq), zzieVar2);
                            zzJ(obj2, iZzq, zzkeVar2);
                            break;
                        case 18:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzx(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 19:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzB(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 20:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzE(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 21:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzM(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 22:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzD(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 23:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzA(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 24:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzz(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 25:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzv(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 26:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            if (zzM(iZzu)) {
                                ((zzhd) zzkqVar).zzK(this.zzm.zza(obj2, iZzu & 1048575), true);
                                break;
                            } else {
                                ((zzhd) zzkqVar).zzK(this.zzm.zza(obj2, iZzu & 1048575), false);
                                break;
                            }
                        case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzF(this.zzm.zza(obj2, iZzu & 1048575), zzx(iZzq), zzieVar2);
                            break;
                        case 28:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzw(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 29:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzL(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 30:
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            List listZza = this.zzm.zza(obj2, iZzu & 1048575);
                            zzkqVar.zzy(listZza);
                            objZzo = zzkt.zzo(obj, iZzc, listZza, zzw(iZzq), obj3, zzllVar);
                            objZzc = objZzo;
                            break;
                        case 31:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzG(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzH(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzI(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 34:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzJ(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 35:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzx(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 36:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzB(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 37:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzE(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 38:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzM(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 39:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzD(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 40:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzA(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 41:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzz(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 42:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzv(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 43:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzL(this.zzm.zza(obj2, iZzu & 1048575));
                            break;
                        case 44:
                            List listZza2 = this.zzm.zza(obj2, iZzu & 1048575);
                            zzkqVar.zzy(listZza2);
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            objZzo = zzkt.zzo(obj, iZzc, listZza2, zzw(iZzq), obj3, zzllVar);
                            objZzc = objZzo;
                            break;
                        case 45:
                            zzkqVar.zzG(this.zzm.zza(obj2, iZzu & 1048575));
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 46:
                            zzkqVar.zzH(this.zzm.zza(obj2, iZzu & 1048575));
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 47:
                            zzkqVar.zzI(this.zzm.zza(obj2, iZzu & 1048575));
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 48:
                            zzkqVar.zzJ(this.zzm.zza(obj2, iZzu & 1048575));
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 49:
                            zzkqVar.zzC(this.zzm.zza(obj2, iZzu & 1048575), zzx(iZzq), zzieVar3);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 50:
                            Object objZzz = zzz(iZzq);
                            long jZzu = zzu(iZzq) & 1048575;
                            Object objZzf = zzlv.zzf(obj2, jZzu);
                            if (objZzf == null) {
                                objZzf = zzjy.zza().zzb();
                                zzlv.zzs(obj2, jZzu, objZzf);
                            } else if (zzjz.zza(objZzf)) {
                                Object objZzb = zzjy.zza().zzb();
                                zzjz.zzb(objZzb, objZzf);
                                zzlv.zzs(obj2, jZzu, objZzb);
                                objZzf = objZzb;
                            }
                            throw null;
                            break;
                        case 51:
                            zzlv.zzs(obj2, iZzu & 1048575, Double.valueOf(zzkqVar.zza()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 52:
                            zzlv.zzs(obj2, iZzu & 1048575, Float.valueOf(zzkqVar.zzb()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 53:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzl()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzo()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 55:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzg()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 56:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzk()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 57:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzf()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 58:
                            zzlv.zzs(obj2, iZzu & 1048575, Boolean.valueOf(zzkqVar.zzN()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 59:
                            zzG(obj2, iZzu, zzkqVar);
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 60:
                            zzke zzkeVar3 = (zzke) zzB(obj2, iZzc, iZzq);
                            zzkqVar.zzu(zzkeVar3, zzx(iZzq), zzieVar3);
                            zzK(obj2, iZzc, iZzq, zzkeVar3);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 61:
                            zzlv.zzs(obj2, iZzu & 1048575, zzkqVar.zzp());
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 62:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzj()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 63:
                            int iZze2 = zzkqVar.zze();
                            zzix zzixVarZzw2 = zzw(iZzq);
                            if (zzixVarZzw2 != null && !zzixVarZzw2.zza(iZze2)) {
                                objZzc = zzkt.zzp(obj2, iZzc, iZze2, obj3, zzllVar);
                                obj5 = obj2;
                                zzllVar3 = zzllVar;
                            }
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(iZze2));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 64:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzh()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 65:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzm()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 66:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzi()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 67:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzn()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        case 68:
                            zzke zzkeVar4 = (zzke) zzB(obj2, iZzc, iZzq);
                            zzkqVar.zzt(zzkeVar4, zzx(iZzq), zzieVar3);
                            zzK(obj2, iZzc, iZzq, zzkeVar4);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            break;
                        default:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            if (objZzc == null) {
                                try {
                                    try {
                                        objZzc = zzllVar.zzc(obj2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        break;
                                    }
                                } catch (zzjd unused2) {
                                    zzllVar.zzs(zzkqVar);
                                    if (objZzc == null) {
                                        objZzc = zzllVar.zzc(obj2);
                                    }
                                    if (!zzllVar.zzr(objZzc, zzkqVar)) {
                                        for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                            zzy(obj, this.zzj[i2], objZzc, zzllVar, obj);
                                        }
                                        if (objZzc == null) {
                                        }
                                    }
                                    obj5 = obj2;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar3 = zzllVar;
                                }
                            }
                            if (!zzllVar.zzr(objZzc, zzkqVar)) {
                                for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                    zzy(obj, this.zzj[i3], objZzc, zzllVar, obj);
                                }
                            }
                            break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                if (iZzc != Integer.MAX_VALUE) {
                    try {
                        Object objZzd = !this.zzh ? null : zzifVar2.zzd(zzieVar3, this.zzg, iZzc);
                        if (objZzd != null) {
                            if (zzijVarZzc == null) {
                                zzijVarZzc = zzifVar2.zzc(obj5);
                            }
                            zzij zzijVar = zzijVarZzc;
                            obj3 = objZzc;
                            zzllVar2 = zzllVar3;
                            obj4 = obj5;
                            try {
                                zzifVar2.zze(obj, zzkqVar, objZzd, zzieVar, zzijVar, obj3, zzllVar2);
                                zzijVarZzc = zzijVar;
                                obj2 = obj4;
                                zzllVar = zzllVar2;
                                objZzc = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            obj3 = objZzc;
                            zzllVar2 = zzllVar3;
                            obj4 = obj5;
                            try {
                                zzllVar2.zzs(zzkqVar);
                                objZzc = obj3 == null ? zzllVar2.zzc(obj4) : obj3;
                                try {
                                    if (zzllVar2.zzr(objZzc, zzkqVar)) {
                                        obj2 = obj4;
                                        zzllVar = zzllVar2;
                                        zzifVar = zzifVar2;
                                        zzieVar2 = zzieVar3;
                                    } else {
                                        int i4 = this.zzk;
                                        while (i4 < this.zzl) {
                                            zzll zzllVar4 = zzllVar2;
                                            zzy(obj, this.zzj[i4], objZzc, zzllVar4, obj);
                                            i4++;
                                            obj4 = obj4;
                                            zzllVar2 = zzllVar4;
                                        }
                                        obj2 = obj4;
                                        zzllVar = zzllVar2;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj4;
                                    zzllVar = zzllVar2;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                        obj2 = obj4;
                        zzllVar = zzllVar2;
                    } catch (Throwable th7) {
                        th = th7;
                        obj3 = objZzc;
                        zzllVar = zzllVar3;
                        obj2 = obj5;
                    }
                    objZzc = obj3;
                    for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                        zzy(obj, this.zzj[i5], objZzc, zzllVar, obj);
                    }
                    if (objZzc != null) {
                        zzllVar.zzn(obj2, objZzc);
                    }
                    throw th;
                }
                for (int i6 = this.zzk; i6 < this.zzl; i6++) {
                    zzy(obj, this.zzj[i6], objZzc, zzllVar3, obj);
                }
                zzllVar = zzllVar3;
                obj2 = obj5;
            }
            obj5 = obj2;
            zzifVar2 = zzifVar;
            zzieVar3 = zzieVar2;
            zzllVar3 = zzllVar;
        }
        if (objZzc == null) {
            zzllVar.zzn(obj2, objZzc);
        }
    }
}
