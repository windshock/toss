package com.tnkfactory.ad.e;

import com.tnkfactory.ad.rwd.PacketTypes$Traits;
import java.io.DataInputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.zip.InflaterInputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class f extends DataInputStream implements ObjectInput {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public byte[] d;

    public f(InflaterInputStream inflaterInputStream) {
        super(inflaterInputStream);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final String a() throws IOException {
        int iB = b();
        String str = (iB & 1) == 0 ? (String) this.a.get(iB >> 1) : null;
        if (str != null) {
            return str;
        }
        int i2 = iB >> 1;
        if (i2 == 0) {
            return "";
        }
        byte[] bArr = this.d;
        if (bArr == null || bArr.length < i2) {
            this.d = new byte[i2 << 1];
        }
        byte[] bArr2 = this.d;
        readFully(bArr2, 0, i2);
        String str2 = new String(bArr2, 0, i2, "utf-8");
        this.a.add(str2);
        return str2;
    }

    public final int b() throws IOException {
        byte b = readByte();
        int i2 = b & 255;
        if (i2 <= 127) {
            return i2;
        }
        byte b2 = readByte();
        int i3 = b2 & 255;
        if (i3 <= 127) {
            return ((b & Byte.MAX_VALUE) << 7) | i3;
        }
        byte b3 = readByte();
        int i4 = b3 & 255;
        return i4 <= 127 ? ((b & Byte.MAX_VALUE) << 14) | ((b2 & Byte.MAX_VALUE) << 7) | i4 : ((b & Byte.MAX_VALUE) << 22) | ((b2 & Byte.MAX_VALUE) << 15) | ((b3 & Byte.MAX_VALUE) << 8) | (readByte() & 255);
    }

    @Override // java.io.ObjectInput
    public final Object readObject() throws IllegalAccessException, InstantiationException, IOException, ClassNotFoundException {
        PacketTypes$Traits packetTypes$Traits;
        byte b = readByte();
        int i2 = 0;
        switch (b) {
            case 0:
            case 1:
                return null;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Boolean.TRUE;
            case 4:
                return Integer.valueOf((b() << 3) >> 3);
            case 5:
                return Double.valueOf(readDouble());
            case 6:
                return a();
            case 7:
                return Long.valueOf(readLong());
            case 8:
                Date date = (Date) a(b());
                if (date != null) {
                    return date;
                }
                Date date2 = new Date((long) readDouble());
                this.b.add(date2);
                return date2;
            case 9:
                int iB = b();
                Object objA = a(iB);
                if (objA != null) {
                    return objA;
                }
                int i3 = iB >> 1;
                Object[] objArr = new Object[i3];
                this.b.add(objArr);
                while (i2 < i3) {
                    objArr[i2] = readObject();
                    i2++;
                }
                return objArr;
            case 10:
                int iB2 = b();
                Object objA2 = a(iB2);
                if (objA2 != null) {
                    return objA2;
                }
                if ((iB2 & 3) == 1) {
                    packetTypes$Traits = (PacketTypes$Traits) this.c.get(iB2 >> 2);
                } else {
                    PacketTypes$Traits packetTypes$Traits2 = new PacketTypes$Traits(a(), (iB2 & 7) == 7);
                    this.c.add(packetTypes$Traits2);
                    for (int i4 = 0; i4 < (iB2 >> 3); i4++) {
                        packetTypes$Traits2.propNames.add(a());
                    }
                    packetTypes$Traits = packetTypes$Traits2;
                }
                String str = packetTypes$Traits.className;
                if (str == null || str.length() == 0) {
                    HashMap map = new HashMap();
                    this.b.add(map);
                    int size = packetTypes$Traits.propNames.size();
                    while (i2 < size) {
                        map.put(packetTypes$Traits.propNames.get(i2), readObject());
                        i2++;
                    }
                    return map;
                }
                if (!packetTypes$Traits.isExternal) {
                    throw new IOException("not supported class. ".concat(str));
                }
                try {
                    Object objNewInstance = f.class.getClassLoader().loadClass(str).newInstance();
                    this.b.add(objNewInstance);
                    if (!(objNewInstance instanceof Externalizable)) {
                        throw new IOException("Not externalizable class:".concat(objNewInstance.getClass().getName()));
                    }
                    ((Externalizable) objNewInstance).readExternal(this);
                    return objNewInstance;
                } catch (ClassNotFoundException e) {
                    throw e;
                } catch (Exception unused) {
                    throw new IOException("Cannot instantiate class: ".concat(str));
                }
            case 11:
            default:
                throw new IOException("Unknown message type :" + ((int) b));
            case 12:
                int iB3 = b();
                byte[] bArr = (byte[]) a(iB3);
                if (bArr != null) {
                    return bArr;
                }
                int i5 = iB3 >> 1;
                byte[] bArr2 = new byte[i5];
                this.b.add(bArr2);
                readFully(bArr2, 0, i5);
                return bArr2;
            case 13:
                int iB4 = b();
                Object objA3 = a(iB4);
                if (objA3 != null) {
                    return (int[]) objA3;
                }
                int i6 = iB4 >> 1;
                int[] iArr = new int[i6];
                this.b.add(iArr);
                while (i2 < i6) {
                    iArr[i2] = b();
                    i2++;
                }
                return iArr;
            case 14:
                int iB5 = b();
                Object objA4 = a(iB5);
                if (objA4 != null) {
                    return (long[]) objA4;
                }
                int i7 = iB5 >> 1;
                long[] jArr = new long[i7];
                this.b.add(jArr);
                while (i2 < i7) {
                    jArr[i2] = readLong();
                    i2++;
                }
                return jArr;
            case 15:
                int iB6 = b();
                Object objA5 = a(iB6);
                if (objA5 != null) {
                    return (double[]) objA5;
                }
                int i8 = iB6 >> 1;
                double[] dArr = new double[i8];
                this.b.add(dArr);
                while (i2 < i8) {
                    dArr[i2] = readDouble();
                    i2++;
                }
                return dArr;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    public final Object a(int i2) {
        if ((i2 & 1) == 0) {
            return this.b.get(i2 >> 1);
        }
        return null;
    }
}
