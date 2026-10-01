package com.tnkfactory.ad.e;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.tnkfactory.ad.rwd.PacketTypes$Traits;
import java.io.DataOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectOutput;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class g extends DataOutputStream implements ObjectOutput {
    public final HashMap a;
    public final IdentityHashMap b;
    public final HashMap c;
    public byte[] d;

    public g(DeflaterOutputStream deflaterOutputStream) {
        super(deflaterOutputStream);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = new HashMap();
        this.b = new IdentityHashMap();
        this.c = new HashMap();
    }

    public final void a(Object[] objArr) throws IOException {
        write(9);
        if (a((Object) objArr)) {
            return;
        }
        a((objArr.length << 1) | 1);
        for (Object obj : objArr) {
            writeObject(obj);
        }
    }

    @Override // java.io.ObjectOutput
    public final void writeObject(Object obj) throws IOException {
        if (obj == null) {
            write(1);
            return;
        }
        if (obj instanceof String) {
            a((String) obj, true);
            return;
        }
        if (obj instanceof Character) {
            a(obj.toString(), true);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof BigDecimal) {
                a(number.toString(), true);
                return;
            }
            if ((number instanceof Double) || (number instanceof Float)) {
                double dDoubleValue = number.doubleValue();
                write(5);
                writeDouble(dDoubleValue);
                return;
            }
            if (number.longValue() < -268435456 || number.longValue() > 268435455) {
                long jLongValue = number.longValue();
                write(7);
                writeLong(jLongValue);
                return;
            }
            int iIntValue = number.intValue();
            long j = iIntValue;
            if (j < -268435456 || j > 268435455) {
                write(7);
                writeLong(j);
                return;
            } else {
                write(4);
                a(iIntValue & 536870911);
                return;
            }
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                write(3);
                return;
            } else {
                write(2);
                return;
            }
        }
        if (obj instanceof Date) {
            Date date = (Date) obj;
            write(8);
            if (a(date)) {
                return;
            }
            a(1);
            writeDouble(date.getTime());
            return;
        }
        if (obj instanceof char[]) {
            a(new String((char[]) obj), true);
            return;
        }
        int i2 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            write(12);
            if (a(bArr)) {
                return;
            }
            int length = bArr.length;
            a(1 | (length << 1));
            write(bArr, 0, length);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            write(13);
            if (a(iArr)) {
                return;
            }
            a(1 | (iArr.length << 1));
            while (i2 < iArr.length) {
                a(iArr[i2] & 536870911);
                i2++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            write(13);
            if (a(sArr)) {
                return;
            }
            a(1 | (sArr.length << 1));
            while (i2 < sArr.length) {
                a(sArr[i2] & 536870911);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            write(14);
            if (a(jArr)) {
                return;
            }
            a(1 | (jArr.length << 1));
            while (i2 < jArr.length) {
                writeLong(jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            write(15);
            if (a(fArr)) {
                return;
            }
            a(1 | (fArr.length << 1));
            while (i2 < fArr.length) {
                writeDouble(fArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            write(15);
            if (a(dArr)) {
                return;
            }
            a(1 | (dArr.length << 1));
            while (i2 < dArr.length) {
                writeDouble(dArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            write(9);
            if (a(zArr)) {
                return;
            }
            a(1 | (zArr.length << 1));
            while (i2 < zArr.length) {
                if (zArr[i2]) {
                    write(3);
                } else {
                    write(2);
                }
                i2++;
            }
            return;
        }
        if (obj instanceof Object[]) {
            a((Object[]) obj);
            return;
        }
        if (obj instanceof Externalizable) {
            Externalizable externalizable = (Externalizable) obj;
            write(10);
            if (a(externalizable)) {
                return;
            }
            String name = externalizable.getClass().getName();
            PacketTypes$Traits packetTypes$Traits = new PacketTypes$Traits(name, true);
            Integer num = (Integer) this.c.get(packetTypes$Traits);
            if (num != null) {
                a(1 | (num.intValue() << 2));
            } else {
                HashMap map = this.c;
                map.put(packetTypes$Traits, Integer.valueOf(map.size()));
                a(7);
                a(name, false);
            }
            externalizable.writeExternal(this);
            return;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            a(collection.toArray(new Object[collection.size()]));
            return;
        }
        if (!(obj instanceof Map)) {
            throw new IOException("Not supported object type: ".concat(obj.getClass().getName()));
        }
        Map map2 = (Map) obj;
        write(10);
        if (a(map2)) {
            return;
        }
        PacketTypes$Traits packetTypes$Traits2 = new PacketTypes$Traits();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : map2.keySet().toArray(new Object[map2.size()])) {
            arrayList.add(String.valueOf(obj2));
        }
        int size = arrayList.size();
        packetTypes$Traits2.propNames = arrayList;
        Integer num2 = (Integer) this.c.get(packetTypes$Traits2);
        if (num2 != null) {
            a(1 | (num2.intValue() << 2));
        } else {
            HashMap map3 = this.c;
            map3.put(packetTypes$Traits2, Integer.valueOf(map3.size()));
            a((size << 3) | 3);
            a(packetTypes$Traits2.className, false);
            for (int i3 = 0; i3 < size; i3++) {
                a((String) arrayList.get(i3), false);
            }
        }
        if (size > 0) {
            while (i2 < size) {
                writeObject(map2.get((String) arrayList.get(i2)));
                i2++;
            }
        }
    }

    public final void a(String str, boolean z) throws IOException {
        int i2;
        if (z) {
            write(6);
        }
        if (str != null && str.length() != 0) {
            Integer num = (Integer) this.a.get(str);
            if (num != null) {
                a(num.intValue() << 1);
                return;
            }
            HashMap map = this.a;
            map.put(str, Integer.valueOf(map.size()));
            int length = str.length();
            byte[] bArr = this.d;
            if (bArr == null || bArr.length < length * 3) {
                this.d = new byte[length * 6];
            }
            byte[] bArr2 = this.d;
            int length2 = str.length();
            int i3 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt < 128) {
                    bArr2[i3] = (byte) cCharAt;
                    i3++;
                } else {
                    if (cCharAt < 2048) {
                        bArr2[i3] = (byte) (((cCharAt >> 6) & 31) | 192);
                        i2 = i3 + 2;
                        bArr2[i3 + 1] = (byte) ((cCharAt & '?') | 128);
                    } else if (cCharAt < 0) {
                        bArr2[i3] = (byte) (((cCharAt >> '\f') & 15) | 224);
                        bArr2[i3 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                        i2 = i3 + 3;
                        bArr2[i3 + 2] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr2[i3] = (byte) (((cCharAt >> 18) & 7) | 240);
                        bArr2[i3 + 1] = (byte) (((cCharAt >> '\f') & 63) | 128);
                        bArr2[i3 + 2] = (byte) (((cCharAt >> 6) & 63) | 128);
                        i2 = i3 + 4;
                        bArr2[i3 + 3] = (byte) ((cCharAt & '?') | 128);
                    }
                    i3 = i2;
                }
            }
            a((i3 << 1) | 1);
            write(bArr2, 0, i3);
            return;
        }
        a(1);
    }

    public final boolean a(Object obj) throws IOException {
        Integer num = (Integer) this.b.get(obj);
        if (num != null) {
            a(num.intValue() << 1);
            return true;
        }
        IdentityHashMap identityHashMap = this.b;
        identityHashMap.put(obj, Integer.valueOf(identityHashMap.size()));
        return false;
    }

    public final void a(int i2) throws IOException {
        if (i2 < 128) {
            write(i2);
            return;
        }
        if (i2 < 16384) {
            write(128 | ((i2 >> 7) & 127));
            write(i2 & 127);
            return;
        }
        if (i2 < 2097152) {
            write(((i2 >> 14) & 127) | 128);
            write(128 | ((i2 >> 7) & 127));
            write(i2 & 127);
        } else {
            if (i2 < 1073741824) {
                write(((i2 >> 22) & 127) | 128);
                write(((i2 >> 15) & 127) | 128);
                write(128 | ((i2 >> 8) & 127));
                write(i2 & OggPageHeader.MAX_SEGMENT_COUNT);
                return;
            }
            throw new IOException("U29 out of range: " + i2);
        }
    }
}
