package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class zzalh<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private List<zzalo> zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzalt zze;
    private Map<K, V> zzf;
    private volatile zzall zzg;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(K k) {
        int size = this.zzb.size();
        int i2 = size - 1;
        if (i2 < 0) {
            size = 0;
            while (size <= i2) {
                int i3 = (size + i2) / 2;
                int iCompareTo = k.compareTo((Comparable) this.zzb.get(i3).getKey());
                if (iCompareTo < 0) {
                    i2 = i3 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i3;
                    }
                    size = i3 + 1;
                }
            }
        } else {
            int iCompareTo2 = k.compareTo((Comparable) this.zzb.get(i2).getKey());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i2;
                }
                size = 0;
                while (size <= i2) {
                }
            }
        }
        return -(size + 1);
    }

    public final int zzb() {
        return this.zzb.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZzb = zzb();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iZzb; i2++) {
            iHashCode += this.zzb.get(i2).hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    static <FieldDescriptorType extends zzaiu<FieldDescriptorType>> zzalh<FieldDescriptorType, Object> zza(int i2) {
        return new zzalg(i2);
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        if (this.zzc.isEmpty()) {
            return zzaln.zza();
        }
        return this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza((zzalh<K, V>) comparable);
        if (iZza >= 0) {
            return (V) this.zzb.get(iZza).getValue();
        }
        return this.zzc.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k, V v) {
        zzg();
        int iZza = zza((zzalh<K, V>) k);
        if (iZza >= 0) {
            return (V) this.zzb.get(iZza).setValue(v);
        }
        zzg();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i2 = -(iZza + 1);
        if (i2 >= this.zza) {
            return zzf().put(k, v);
        }
        int size = this.zzb.size();
        int i3 = this.zza;
        if (size == i3) {
            zzalo zzaloVarRemove = this.zzb.remove(i3 - 1);
            zzf().put((Comparable) zzaloVarRemove.getKey(), zzaloVarRemove.getValue());
        }
        this.zzb.add(i2, new zzalo(this, k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzalh<K, V>) obj, (Comparable) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int iZza = zza((zzalh<K, V>) comparable);
        if (iZza >= 0) {
            return zzc(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzc(int i2) {
        zzg();
        V v = (V) this.zzb.remove(i2).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zzb.add(new zzalo(this, it.next()));
            it.remove();
        }
        return v;
    }

    public final Map.Entry<K, V> zzb(int i2) {
        return this.zzb.get(i2);
    }

    final Set<Map.Entry<K, V>> zzd() {
        if (this.zzg == null) {
            this.zzg = new zzall(this);
        }
        return this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzalt(this);
        }
        return this.zze;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    private zzalh(int i2) {
        this.zza = i2;
        this.zzb = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    public void zza() {
        Map<K, V> mapUnmodifiableMap;
        Map<K, V> mapUnmodifiableMap2;
        if (this.zzd) {
            return;
        }
        if (this.zzc.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(this.zzc);
        }
        this.zzc = mapUnmodifiableMap;
        if (this.zzf.isEmpty()) {
            mapUnmodifiableMap2 = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
        }
        this.zzf = mapUnmodifiableMap2;
        this.zzd = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzalh<K, V>) comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzalh)) {
            return super.equals(obj);
        }
        zzalh zzalhVar = (zzalh) obj;
        int size = size();
        if (size != zzalhVar.size()) {
            return false;
        }
        int iZzb = zzb();
        if (iZzb != zzalhVar.zzb()) {
            return entrySet().equals(zzalhVar.entrySet());
        }
        for (int i2 = 0; i2 < iZzb; i2++) {
            if (!zzb(i2).equals(zzalhVar.zzb(i2))) {
                return false;
            }
        }
        if (iZzb != size) {
            return this.zzc.equals(zzalhVar.zzc);
        }
        return true;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
