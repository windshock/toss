package com.kt.ollehusimmanager.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.kt.ollehusimmanager.wallet.data.e;
import com.kt.ollehusimmanager.wallet.data.g;
import com.otaliastudios.cameraview.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class b extends Binder implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        a aVarQueryLocalInterface = iBinder.queryLocalInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
        return (aVarQueryLocalInterface == null || !(aVarQueryLocalInterface instanceof a)) ? new c(iBinder) : aVarQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("com.kt.ollehusimmanager.aidl.IUsimManager");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                int i3 = parcel.readInt();
                byte[] bArr = i3 < 0 ? null : new byte[i3];
                int i4 = parcel.readInt();
                int[] iArr = i4 >= 0 ? new int[i4] : null;
                long jA = a(bArr, iArr);
                parcel2.writeNoException();
                parcel2.writeLong(jA);
                parcel2.writeByteArray(bArr);
                parcel2.writeIntArray(iArr);
                return true;
            case 2:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i5 = parcel.readInt();
                byte[] bArr2 = i5 < 0 ? null : new byte[i5];
                int i6 = parcel.readInt();
                int[] iArr2 = i6 >= 0 ? new int[i6] : null;
                long jA2 = a(bArrCreateByteArray, bArr2, iArr2);
                parcel2.writeNoException();
                parcel2.writeLong(jA2);
                parcel2.writeByteArray(bArr2);
                parcel2.writeIntArray(iArr2);
                return true;
            case 3:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                byte[] bArr3 = i8 < 0 ? null : new byte[i8];
                int i9 = parcel.readInt();
                int[] iArr3 = i9 >= 0 ? new int[i9] : null;
                long jA3 = a(bArrCreateByteArray2, bArrCreateByteArray3, i7, bArr3, iArr3);
                parcel2.writeNoException();
                parcel2.writeLong(jA3);
                parcel2.writeByteArray(bArr3);
                parcel2.writeIntArray(iArr3);
                return true;
            case 4:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jA4 = a(parcel.createByteArray(), parcel.readByte());
                parcel2.writeNoException();
                parcel2.writeLong(jA4);
                return true;
            case 5:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray4 = parcel.createByteArray();
                int i10 = parcel.readInt();
                byte[] bArr4 = i10 < 0 ? null : new byte[i10];
                int i11 = parcel.readInt();
                int[] iArr4 = i11 >= 0 ? new int[i11] : null;
                long jB = b(bArrCreateByteArray4, bArr4, iArr4);
                parcel2.writeNoException();
                parcel2.writeLong(jB);
                parcel2.writeByteArray(bArr4);
                parcel2.writeIntArray(iArr4);
                return true;
            case 6:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray5 = parcel.createByteArray();
                int i12 = parcel.readInt();
                byte[] bArr5 = i12 < 0 ? null : new byte[i12];
                int i13 = parcel.readInt();
                int[] iArr5 = i13 >= 0 ? new int[i13] : null;
                long jC = c(bArrCreateByteArray5, bArr5, iArr5);
                parcel2.writeNoException();
                parcel2.writeLong(jC);
                parcel2.writeByteArray(bArr5);
                parcel2.writeIntArray(iArr5);
                return true;
            case 7:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray6 = parcel.createByteArray();
                int i14 = parcel.readInt();
                byte[] bArr6 = i14 < 0 ? null : new byte[i14];
                int i15 = parcel.readInt();
                int[] iArr6 = i15 >= 0 ? new int[i15] : null;
                long jD = d(bArrCreateByteArray6, bArr6, iArr6);
                parcel2.writeNoException();
                parcel2.writeLong(jD);
                parcel2.writeByteArray(bArr6);
                parcel2.writeIntArray(iArr6);
                return true;
            case 8:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray7 = parcel.createByteArray();
                int i16 = parcel.readInt();
                byte[] bArr7 = i16 < 0 ? null : new byte[i16];
                int i17 = parcel.readInt();
                int[] iArr7 = i17 >= 0 ? new int[i17] : null;
                long jE = e(bArrCreateByteArray7, bArr7, iArr7);
                parcel2.writeNoException();
                parcel2.writeLong(jE);
                parcel2.writeByteArray(bArr7);
                parcel2.writeIntArray(iArr7);
                return true;
            case 9:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray8 = parcel.createByteArray();
                int i18 = parcel.readInt();
                byte[] bArr8 = i18 < 0 ? null : new byte[i18];
                int i19 = parcel.readInt();
                int[] iArr8 = i19 >= 0 ? new int[i19] : null;
                long jF = f(bArrCreateByteArray8, bArr8, iArr8);
                parcel2.writeNoException();
                parcel2.writeLong(jF);
                parcel2.writeByteArray(bArr8);
                parcel2.writeIntArray(iArr8);
                return true;
            case 10:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray9 = parcel.createByteArray();
                byte[] bArrCreateByteArray10 = parcel.createByteArray();
                String string = parcel.readString();
                int i20 = parcel.readInt();
                byte[] bArr9 = i20 < 0 ? null : new byte[i20];
                int i21 = parcel.readInt();
                int[] iArr9 = i21 >= 0 ? new int[i21] : null;
                long jA5 = a(bArrCreateByteArray9, bArrCreateByteArray10, string, bArr9, iArr9, parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeLong(jA5);
                parcel2.writeByteArray(bArr9);
                parcel2.writeIntArray(iArr9);
                return true;
            case 11:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jA6 = a(parcel.createByteArray(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeLong(jA6);
                return true;
            case 12:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jB2 = b(parcel.createByteArray(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeLong(jB2);
                return true;
            case 13:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jC2 = c(parcel.createByteArray(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeLong(jC2);
                return true;
            case 14:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray11 = parcel.createByteArray();
                ArrayList arrayList = new ArrayList();
                long jA7 = a(bArrCreateByteArray11, arrayList);
                parcel2.writeNoException();
                parcel2.writeLong(jA7);
                parcel2.writeStringList(arrayList);
                return true;
            case 15:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jA8 = a(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeLong(jA8);
                return true;
            case 16:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jB3 = b(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeLong(jB3);
                return true;
            case 17:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                List listA = a();
                parcel2.writeNoException();
                parcel2.writeTypedList(listA);
                return true;
            case 18:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jA9 = a(parcel.readByte());
                parcel2.writeNoException();
                parcel2.writeLong(jA9);
                return true;
            case 19:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jA10 = a(parcel.readArrayList(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeLong(jA10);
                return true;
            case 20:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                List listB = b();
                parcel2.writeNoException();
                parcel2.writeList(listB);
                return true;
            case 21:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                ArrayList arrayList2 = new ArrayList();
                long jB4 = b(arrayList2);
                parcel2.writeNoException();
                parcel2.writeLong(jB4);
                parcel2.writeList(arrayList2);
                return true;
            case 22:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                List listC = c();
                parcel2.writeNoException();
                parcel2.writeTypedList(listC);
                return true;
            case 23:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jB5 = b(parcel.readByte());
                parcel2.writeNoException();
                parcel2.writeLong(jB5);
                return true;
            case 24:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jA11 = a(parcel.readByte(), parcel.readByte(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeLong(jA11);
                return true;
            case 25:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                e eVarD = d();
                parcel2.writeNoException();
                if (eVarD != null) {
                    parcel2.writeInt(1);
                    eVarD.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                boolean zA = a(parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 27:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray12 = parcel.createByteArray();
                int i22 = parcel.readInt();
                int[] iArr10 = i22 >= 0 ? new int[i22] : null;
                long jB6 = b(bArrCreateByteArray12, iArr10);
                parcel2.writeNoException();
                parcel2.writeLong(jB6);
                parcel2.writeIntArray(iArr10);
                return true;
            case 28:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray13 = parcel.createByteArray();
                int i23 = parcel.readInt();
                byte[] bArr10 = i23 >= 0 ? new byte[i23] : null;
                long jD2 = d(bArrCreateByteArray13, bArr10);
                parcel2.writeNoException();
                parcel2.writeLong(jD2);
                parcel2.writeByteArray(bArr10);
                return true;
            case 29:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray14 = parcel.createByteArray();
                int i24 = parcel.readInt();
                byte[] bArr11 = i24 >= 0 ? new byte[i24] : null;
                long jE2 = e(bArrCreateByteArray14, bArr11);
                parcel2.writeNoException();
                parcel2.writeLong(jE2);
                parcel2.writeByteArray(bArr11);
                return true;
            case 30:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray15 = parcel.createByteArray();
                ArrayList arrayList3 = new ArrayList();
                long jB7 = b(bArrCreateByteArray15, arrayList3);
                parcel2.writeNoException();
                parcel2.writeLong(jB7);
                parcel2.writeList(arrayList3);
                return true;
            case 31:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray16 = parcel.createByteArray();
                int i25 = parcel.readInt();
                int[] iArr11 = i25 >= 0 ? new int[i25] : null;
                long jC3 = c(bArrCreateByteArray16, iArr11);
                parcel2.writeNoException();
                parcel2.writeLong(jC3);
                parcel2.writeIntArray(iArr11);
                return true;
            case 32:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray17 = parcel.createByteArray();
                int i26 = parcel.readInt();
                byte[] bArr12 = i26 >= 0 ? new byte[i26] : null;
                long jF2 = f(bArrCreateByteArray17, bArr12);
                parcel2.writeNoException();
                parcel2.writeLong(jF2);
                parcel2.writeByteArray(bArr12);
                return true;
            case 33:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray18 = parcel.createByteArray();
                int i27 = parcel.readInt();
                byte[] bArr13 = i27 >= 0 ? new byte[i27] : null;
                long jG = g(bArrCreateByteArray18, bArr13);
                parcel2.writeNoException();
                parcel2.writeLong(jG);
                parcel2.writeByteArray(bArr13);
                return true;
            case 34:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray19 = parcel.createByteArray();
                ArrayList arrayList4 = new ArrayList();
                long jC4 = c(bArrCreateByteArray19, arrayList4);
                parcel2.writeNoException();
                parcel2.writeLong(jC4);
                parcel2.writeList(arrayList4);
                return true;
            case 35:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jE3 = e();
                parcel2.writeNoException();
                parcel2.writeLong(jE3);
                return true;
            case R$styleable.CameraView_cameraPictureSnapshotMetering /* 36 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                boolean zF = f();
                parcel2.writeNoException();
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case R$styleable.CameraView_cameraPlaySounds /* 37 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                boolean zG = g();
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 38:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray20 = parcel.createByteArray();
                int i28 = parcel.readInt();
                int[] iArr12 = i28 >= 0 ? new int[i28] : null;
                long jD3 = d(bArrCreateByteArray20, iArr12);
                parcel2.writeNoException();
                parcel2.writeLong(jD3);
                parcel2.writeIntArray(iArr12);
                return true;
            case R$styleable.CameraView_cameraPreviewFrameRate /* 39 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray21 = parcel.createByteArray();
                int i29 = parcel.readInt();
                byte[] bArr14 = i29 >= 0 ? new byte[i29] : null;
                long jH = h(bArrCreateByteArray21, bArr14);
                parcel2.writeNoException();
                parcel2.writeLong(jH);
                parcel2.writeByteArray(bArr14);
                return true;
            case R$styleable.CameraView_cameraPreviewFrameRateExact /* 40 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jI = i(parcel.createByteArray(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeLong(jI);
                return true;
            case R$styleable.CameraView_cameraRequestPermissions /* 41 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long j = j(parcel.createByteArray(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeLong(j);
                return true;
            case R$styleable.CameraView_cameraSnapshotMaxHeight /* 42 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray22 = parcel.createByteArray();
                byte[] bArrCreateByteArray23 = parcel.createByteArray();
                int i30 = parcel.readInt();
                byte[] bArr15 = i30 < 0 ? null : new byte[i30];
                int i31 = parcel.readInt();
                int[] iArr13 = i31 >= 0 ? new int[i31] : null;
                long jA12 = a(bArrCreateByteArray22, bArrCreateByteArray23, bArr15, iArr13);
                parcel2.writeNoException();
                parcel2.writeLong(jA12);
                parcel2.writeByteArray(bArr15);
                parcel2.writeIntArray(iArr13);
                return true;
            case R$styleable.CameraView_cameraSnapshotMaxWidth /* 43 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray24 = parcel.createByteArray();
                int i32 = parcel.readInt();
                byte[] bArr16 = i32 < 0 ? null : new byte[i32];
                int i33 = parcel.readInt();
                int[] iArr14 = i33 >= 0 ? new int[i33] : null;
                long jG2 = g(bArrCreateByteArray24, bArr16, iArr14);
                parcel2.writeNoException();
                parcel2.writeLong(jG2);
                parcel2.writeByteArray(bArr16);
                parcel2.writeIntArray(iArr14);
                return true;
            case R$styleable.CameraView_cameraUseDeviceOrientation /* 44 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                long jB8 = b(parcel.createByteArray(), parcel.readByte());
                parcel2.writeNoException();
                parcel2.writeLong(jB8);
                return true;
            case R$styleable.CameraView_cameraVideoBitRate /* 45 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray25 = parcel.createByteArray();
                byte[] bArrCreateByteArray26 = parcel.createByteArray();
                int i34 = parcel.readInt();
                int[] iArr15 = i34 >= 0 ? new int[i34] : null;
                long jH2 = h(bArrCreateByteArray25, bArrCreateByteArray26, iArr15);
                parcel2.writeNoException();
                parcel2.writeLong(jH2);
                parcel2.writeIntArray(iArr15);
                return true;
            case 46:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray27 = parcel.createByteArray();
                int i35 = parcel.readInt();
                String[] strArr = i35 >= 0 ? new String[i35] : null;
                long jA13 = a(bArrCreateByteArray27, strArr);
                parcel2.writeNoException();
                parcel2.writeLong(jA13);
                parcel2.writeStringArray(strArr);
                return true;
            case R$styleable.CameraView_cameraVideoMaxDuration /* 47 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray28 = parcel.createByteArray();
                int i36 = parcel.readInt();
                String[] strArr2 = i36 >= 0 ? new String[i36] : null;
                long jB9 = b(bArrCreateByteArray28, strArr2);
                parcel2.writeNoException();
                parcel2.writeLong(jB9);
                parcel2.writeStringArray(strArr2);
                return true;
            case R$styleable.CameraView_cameraVideoMaxSize /* 48 */:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray29 = parcel.createByteArray();
                int i37 = parcel.readInt();
                int[] iArr16 = i37 >= 0 ? new int[i37] : null;
                long jE4 = e(bArrCreateByteArray29, iArr16);
                parcel2.writeNoException();
                parcel2.writeLong(jE4);
                parcel2.writeIntArray(iArr16);
                return true;
            case 49:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray30 = parcel.createByteArray();
                String string2 = parcel.readString();
                int i38 = parcel.readInt();
                int[] iArr17 = i38 >= 0 ? new int[i38] : null;
                long jA14 = a(bArrCreateByteArray30, string2, iArr17);
                parcel2.writeNoException();
                parcel2.writeLong(jA14);
                parcel2.writeIntArray(iArr17);
                return true;
            case 50:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray31 = parcel.createByteArray();
                long jK = k(bArrCreateByteArray31, parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeLong(jK);
                parcel2.writeByteArray(bArrCreateByteArray31);
                return true;
            case 51:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray32 = parcel.createByteArray();
                byte b = parcel.readByte();
                byte b2 = parcel.readByte();
                int i39 = parcel.readInt();
                byte[] bArr17 = i39 >= 0 ? new byte[i39] : null;
                long jA15 = a(bArrCreateByteArray32, b, b2, bArr17);
                parcel2.writeNoException();
                parcel2.writeLong(jA15);
                parcel2.writeByteArray(bArrCreateByteArray32);
                parcel2.writeByteArray(bArr17);
                return true;
            case 52:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray33 = parcel.createByteArray();
                long jA16 = a(bArrCreateByteArray33, parcel.readByte(), parcel.readByte());
                parcel2.writeNoException();
                parcel2.writeLong(jA16);
                parcel2.writeByteArray(bArrCreateByteArray33);
                return true;
            case 53:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray34 = parcel.createByteArray();
                byte[] bArrCreateByteArray35 = parcel.createByteArray();
                int i40 = parcel.readInt();
                int[] iArr18 = i40 >= 0 ? new int[i40] : null;
                long jI2 = i(bArrCreateByteArray34, bArrCreateByteArray35, iArr18);
                parcel2.writeNoException();
                parcel2.writeLong(jI2);
                parcel2.writeIntArray(iArr18);
                return true;
            case 54:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                g gVar = new g();
                int i41 = parcel.readInt();
                int[] iArr19 = i41 >= 0 ? new int[i41] : null;
                long jA17 = a(gVar, iArr19);
                parcel2.writeNoException();
                parcel2.writeLong(jA17);
                parcel2.writeInt(1);
                gVar.writeToParcel(parcel2, 1);
                parcel2.writeIntArray(iArr19);
                return true;
            case 55:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                boolean zC = c(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case 56:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray36 = parcel.createByteArray();
                int i42 = parcel.readInt();
                String[] strArr3 = i42 >= 0 ? new String[i42] : null;
                long jC5 = c(bArrCreateByteArray36, strArr3);
                parcel2.writeNoException();
                parcel2.writeLong(jC5);
                parcel2.writeStringArray(strArr3);
                return true;
            case 57:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray37 = parcel.createByteArray();
                int i43 = parcel.readInt();
                String[] strArr4 = i43 >= 0 ? new String[i43] : null;
                long jD4 = d(bArrCreateByteArray37, strArr4);
                parcel2.writeNoException();
                parcel2.writeLong(jD4);
                parcel2.writeStringArray(strArr4);
                return true;
            case 58:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray38 = parcel.createByteArray();
                int i44 = parcel.readInt();
                String[] strArr5 = i44 >= 0 ? new String[i44] : null;
                long jE5 = e(bArrCreateByteArray38, strArr5);
                parcel2.writeNoException();
                parcel2.writeLong(jE5);
                parcel2.writeStringArray(strArr5);
                return true;
            case 59:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray39 = parcel.createByteArray();
                int i45 = parcel.readInt();
                String[] strArr6 = i45 >= 0 ? new String[i45] : null;
                long jF3 = f(bArrCreateByteArray39, strArr6);
                parcel2.writeNoException();
                parcel2.writeLong(jF3);
                parcel2.writeStringArray(strArr6);
                return true;
            case 60:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray40 = parcel.createByteArray();
                int i46 = parcel.readInt();
                String[] strArr7 = i46 >= 0 ? new String[i46] : null;
                long jG3 = g(bArrCreateByteArray40, strArr7);
                parcel2.writeNoException();
                parcel2.writeLong(jG3);
                parcel2.writeStringArray(strArr7);
                return true;
            case 61:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray41 = parcel.createByteArray();
                int i47 = parcel.readInt();
                String[] strArr8 = i47 >= 0 ? new String[i47] : null;
                long jH3 = h(bArrCreateByteArray41, strArr8);
                parcel2.writeNoException();
                parcel2.writeLong(jH3);
                parcel2.writeStringArray(strArr8);
                return true;
            case 62:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray42 = parcel.createByteArray();
                int i48 = parcel.readInt();
                byte[] bArr18 = i48 < 0 ? null : new byte[i48];
                int i49 = parcel.readInt();
                int[] iArr20 = i49 >= 0 ? new int[i49] : null;
                long j2 = j(bArrCreateByteArray42, bArr18, iArr20);
                parcel2.writeNoException();
                parcel2.writeLong(j2);
                parcel2.writeByteArray(bArr18);
                parcel2.writeIntArray(iArr20);
                return true;
            case 63:
                parcel.enforceInterface("com.kt.ollehusimmanager.aidl.IUsimManager");
                byte[] bArrCreateByteArray43 = parcel.createByteArray();
                int i50 = parcel.readInt();
                byte[] bArr19 = i50 < 0 ? null : new byte[i50];
                int i51 = parcel.readInt();
                int[] iArr21 = i51 >= 0 ? new int[i51] : null;
                long jK2 = k(bArrCreateByteArray43, bArr19, iArr21);
                parcel2.writeNoException();
                parcel2.writeLong(jK2);
                parcel2.writeByteArray(bArr19);
                parcel2.writeIntArray(iArr21);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
