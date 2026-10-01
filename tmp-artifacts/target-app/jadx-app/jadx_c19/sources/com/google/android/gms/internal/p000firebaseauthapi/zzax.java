package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzax<K, V> extends zzau<K, V> {
    private static final zzau<Object, Object> zza = new zzax(null, new Object[0], 0);

    @CheckForNull
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzau
    final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzau
    final zzal<V> zza() {
        return new zzbb(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzau
    final zzav<Map.Entry<K, V>> zzb() {
        return new zzba(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzau
    final zzav<K> zzc() {
        return new zzbc(this, new zzbb(this.zzc, 0, this.zzd));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <K, V> zzax<K, V> zza(int i2, Object[] objArr, zzat<K, V> zzatVar) {
        int iHighestOneBit;
        byte[] bArr;
        short[] sArr;
        boolean z;
        int i3 = i2;
        Object[] objArrCopyOf = objArr;
        if (i3 == 0) {
            return (zzax) zza;
        }
        Object obj = null;
        if (i3 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zzaj.zza(obj2, obj3);
            return new zzax<>(null, objArrCopyOf, 1);
        }
        zzz.zzb(i3, objArrCopyOf.length >> 1);
        int iMax = Math.max(i3, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i3 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zzaj.zza(obj4, obj5);
        } else {
            int i4 = iHighestOneBit - 1;
            char c = 65535;
            if (iHighestOneBit <= 128) {
                bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i6 * 2;
                    int i8 = i5 * 2;
                    Object obj6 = objArrCopyOf[i7];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i7 ^ 1];
                    Objects.requireNonNull(obj7);
                    zzaj.zza(obj6, obj7);
                    int iZza = zzam.zza(obj6.hashCode());
                    while (true) {
                        int i9 = iZza & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i8;
                            if (i5 < i6) {
                                objArrCopyOf[i8] = obj6;
                                objArrCopyOf[i8 ^ 1] = obj7;
                            }
                            i5++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj8 = objArrCopyOf[i11];
                                Objects.requireNonNull(obj8);
                                zzaw zzawVar = new zzaw(obj6, obj7, obj8);
                                objArrCopyOf[i11] = obj7;
                                obj = zzawVar;
                                break;
                            }
                            iZza = i9 + 1;
                        }
                    }
                }
                if (i5 != i3) {
                    sArr = new Object[]{bArr, Integer.valueOf(i5), obj};
                }
                z = bArr instanceof Object[];
                Object obj9 = bArr;
                if (z) {
                    Object[] objArr2 = (Object[]) bArr;
                    zzaw zzawVar2 = (zzaw) objArr2[2];
                    if (zzatVar == null) {
                        throw zzawVar2.zza();
                    }
                    zzatVar.zza = zzawVar2;
                    Object obj10 = objArr2[0];
                    int iIntValue = ((Integer) objArr2[1]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
                    obj9 = obj10;
                    i3 = iIntValue;
                }
                return new zzax<>(obj9, objArrCopyOf, i3);
            }
            if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    int i14 = i13 * 2;
                    int i15 = i12 * 2;
                    Object obj11 = objArrCopyOf[i14];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArrCopyOf[i14 ^ 1];
                    Objects.requireNonNull(obj12);
                    zzaj.zza(obj11, obj12);
                    int iZza2 = zzam.zza(obj11.hashCode());
                    while (true) {
                        int i16 = iZza2 & i4;
                        int i17 = sArr[i16] & 65535;
                        if (i17 == 65535) {
                            sArr[i16] = (short) i15;
                            if (i12 < i13) {
                                objArrCopyOf[i15] = obj11;
                                objArrCopyOf[i15 ^ 1] = obj12;
                            }
                            i12++;
                        } else {
                            if (obj11.equals(objArrCopyOf[i17])) {
                                int i18 = i17 ^ 1;
                                Object obj13 = objArrCopyOf[i18];
                                Objects.requireNonNull(obj13);
                                zzaw zzawVar3 = new zzaw(obj11, obj12, obj13);
                                objArrCopyOf[i18] = obj12;
                                obj = zzawVar3;
                                break;
                            }
                            iZza2 = i16 + 1;
                        }
                    }
                }
                obj = i12 == i3 ? sArr : new Object[]{sArr, Integer.valueOf(i12), obj};
            } else {
                bArr = new int[iHighestOneBit];
                Arrays.fill((int[]) bArr, -1);
                int i19 = 0;
                int i20 = 0;
                while (i19 < i3) {
                    int i21 = i19 * 2;
                    int i22 = i20 * 2;
                    Object obj14 = objArrCopyOf[i21];
                    Objects.requireNonNull(obj14);
                    Object obj15 = objArrCopyOf[i21 ^ 1];
                    Objects.requireNonNull(obj15);
                    zzaj.zza(obj14, obj15);
                    int iZza3 = zzam.zza(obj14.hashCode());
                    while (true) {
                        int i23 = iZza3 & i4;
                        ?? r15 = bArr[i23];
                        if (r15 == c) {
                            bArr[i23] = i22;
                            if (i20 < i19) {
                                objArrCopyOf[i22] = obj14;
                                objArrCopyOf[i22 ^ 1] = obj15;
                            }
                            i20++;
                        } else {
                            if (obj14.equals(objArrCopyOf[r15])) {
                                int i24 = r15 ^ 1;
                                Object obj16 = objArrCopyOf[i24];
                                Objects.requireNonNull(obj16);
                                zzaw zzawVar4 = new zzaw(obj14, obj15, obj16);
                                objArrCopyOf[i24] = obj15;
                                obj = zzawVar4;
                                break;
                            }
                            iZza3 = i23 + 1;
                            c = 65535;
                        }
                    }
                    i19++;
                    c = 65535;
                }
                if (i20 != i3) {
                    bArr = new Object[]{bArr, Integer.valueOf(i20), obj};
                }
                z = bArr instanceof Object[];
                Object obj92 = bArr;
                if (z) {
                }
                return new zzax<>(obj92, objArrCopyOf, i3);
            }
        }
        bArr = obj;
        z = bArr instanceof Object[];
        Object obj922 = bArr;
        if (z) {
        }
        return new zzax<>(obj922, objArrCopyOf, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[EDGE_INSN: B:43:0x008f->B:35:0x008f BREAK  A[LOOP:0: B:15:0x0035->B:21:0x004d], EDGE_INSN: B:45:0x008f->B:35:0x008f BREAK  A[LOOP:1: B:25:0x0060->B:31:0x0079], EDGE_INSN: B:47:0x008f->B:35:0x008f BREAK  A[LOOP:2: B:33:0x0087->B:42:0x00a1]] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzau, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(@CheckForNull Object obj) {
        V v;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i2 = this.zzd;
        if (obj != null) {
            if (i2 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    v = (V) objArr[1];
                    Objects.requireNonNull(v);
                } else {
                    v = null;
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length;
                    int iZza = zzam.zza(obj.hashCode());
                    while (true) {
                        int i3 = iZza & (length - 1);
                        int i4 = bArr[i3] & 255;
                        if (i4 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            v = (V) objArr[i4 ^ 1];
                            break;
                        }
                        iZza = i3 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length;
                    int iZza2 = zzam.zza(obj.hashCode());
                    while (true) {
                        int i5 = iZza2 & (length2 - 1);
                        int i6 = sArr[i5] & 65535;
                        if (i6 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            v = (V) objArr[i6 ^ 1];
                            break;
                        }
                        iZza2 = i5 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length;
                    int iZza3 = zzam.zza(obj.hashCode());
                    while (true) {
                        int i7 = iZza3 & (length3 - 1);
                        int i8 = iArr[i7];
                        if (i8 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i8])) {
                            v = (V) objArr[i8 ^ 1];
                            break;
                        }
                        iZza3 = i7 + 1;
                    }
                }
            }
        }
        if (v == null) {
            return null;
        }
        return v;
    }

    private zzax(@CheckForNull Object obj, Object[] objArr, int i2) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i2;
    }
}
