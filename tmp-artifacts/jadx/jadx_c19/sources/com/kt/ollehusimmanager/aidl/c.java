package com.kt.ollehusimmanager.aidl;

import android.os.IBinder;
import android.os.Parcel;
import com.kt.ollehusimmanager.wallet.data.a;
import com.kt.ollehusimmanager.wallet.data.e;
import com.kt.ollehusimmanager.wallet.data.g;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class c implements a {
    private IBinder mRemote;

    c(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public final long a(byte b) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByte(b);
            this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte b, byte b2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByte(b);
            parcelObtain.writeByte(b2);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.mRemote.transact(24, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(g gVar, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            if (iArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(iArr.length);
            }
            this.mRemote.transact(54, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            if (parcelObtain2.readInt() != 0) {
                gVar.readFromParcel(parcelObtain2);
            }
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeList(list);
            this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, byte b) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByte(b);
            this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, byte b, byte b2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByte(b);
            parcelObtain.writeByte(b2);
            this.mRemote.transact(52, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, byte b, byte b2, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByte(b);
            parcelObtain.writeByte(b2);
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            this.mRemote.transact(51, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr);
            parcelObtain2.readByteArray(bArr2);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, String str, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeString(str);
            if (iArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(iArr.length);
            }
            this.mRemote.transact(49, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readStringList(list);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            parcelObtain.writeInt(i2);
            int length = -1;
            if (bArr3 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr3.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr3);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int[] iArr, byte[] bArr4) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            parcelObtain.writeString(str);
            int length = -1;
            if (bArr3 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr3.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            parcelObtain.writeByteArray(bArr4);
            this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr3);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            int length = -1;
            if (bArr3 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr3.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(42, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr3);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            int length = -1;
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            int length = -1;
            if (bArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long a(byte[] bArr, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (strArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(strArr.length);
            }
            this.mRemote.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readStringArray(strArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final List a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(a.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean a(String str, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeString(str);
            parcelObtain.writeByteArray(bArr);
            this.mRemote.transact(26, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.mRemote;
    }

    public final long b(byte b) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByte(b);
            this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long b(List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readList(list, c.class.getClassLoader());
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long b(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long b(byte[] bArr, byte b) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByte(b);
            this.mRemote.transact(44, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long b(byte[] bArr, List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            this.mRemote.transact(30, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readList(list, c.class.getClassLoader());
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long b(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long b(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            int length = -1;
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long b(byte[] bArr, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (iArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(iArr.length);
            }
            this.mRemote.transact(27, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long b(byte[] bArr, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (strArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(strArr.length);
            }
            this.mRemote.transact(47, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readStringArray(strArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final List b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readArrayList(c.class.getClassLoader());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long c(byte[] bArr, List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            this.mRemote.transact(34, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readList(list, c.class.getClassLoader());
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long c(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long c(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            int length = -1;
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long c(byte[] bArr, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (iArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(iArr.length);
            }
            this.mRemote.transact(31, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long c(byte[] bArr, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (strArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(strArr.length);
            }
            this.mRemote.transact(56, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readStringArray(strArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final List c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(com.kt.ollehusimmanager.wallet.data.c.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean c(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            this.mRemote.transact(55, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long d(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            this.mRemote.transact(28, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long d(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            int length = -1;
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long d(byte[] bArr, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (iArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(iArr.length);
            }
            this.mRemote.transact(38, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long d(byte[] bArr, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (strArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(strArr.length);
            }
            this.mRemote.transact(57, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readStringArray(strArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final e d() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            this.mRemote.transact(25, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (e) e.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long e() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            this.mRemote.transact(35, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long e(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            this.mRemote.transact(29, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long e(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            int length = -1;
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long e(byte[] bArr, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (iArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(iArr.length);
            }
            this.mRemote.transact(48, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long e(byte[] bArr, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (strArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(strArr.length);
            }
            this.mRemote.transact(58, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readStringArray(strArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long f(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            this.mRemote.transact(32, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long f(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            int length = -1;
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long f(byte[] bArr, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (strArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(strArr.length);
            }
            this.mRemote.transact(59, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readStringArray(strArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean f() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            this.mRemote.transact(36, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long g(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            this.mRemote.transact(33, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long g(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            int length = -1;
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(43, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long g(byte[] bArr, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (strArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(strArr.length);
            }
            this.mRemote.transact(60, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readStringArray(strArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean g() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            this.mRemote.transact(37, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long h(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            this.mRemote.transact(39, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long h(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            if (iArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(iArr.length);
            }
            this.mRemote.transact(45, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long h(byte[] bArr, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            if (strArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(strArr.length);
            }
            this.mRemote.transact(61, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readStringArray(strArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long i(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            this.mRemote.transact(40, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long i(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            if (iArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(iArr.length);
            }
            this.mRemote.transact(53, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long j(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            this.mRemote.transact(41, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long j(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            int length = -1;
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(62, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long k(byte[] bArr, byte[] bArr2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeByteArray(bArr2);
            this.mRemote.transact(50, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final long k(byte[] bArr, byte[] bArr2, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IUsimManager");
            parcelObtain.writeByteArray(bArr);
            int length = -1;
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (iArr != null) {
                length = iArr.length;
            }
            parcelObtain.writeInt(length);
            this.mRemote.transact(63, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            long j = parcelObtain2.readLong();
            parcelObtain2.readByteArray(bArr2);
            parcelObtain2.readIntArray(iArr);
            return j;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
