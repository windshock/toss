package o;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import o.SaversKtExternalSyntheticLambda15;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda19 implements SaversKtExternalSyntheticLambda15 {
    private static final String IAuthTabCallback = "StandardGifDecoder";
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final int[] IAuthTabCallbackStubProxy;
    private short[] IAuthTabCallback_Parcel;
    private ByteBuffer ICustomTabsCallback;
    private byte[] access000;
    private int[] access100;
    private int asBinder;
    private SaversKtExternalSyntheticLambda20 asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    private byte[] getInterfaceDescriptor;
    private byte[] onActivityLayout;
    private Bitmap.Config onExtraCallback;
    private byte[] onExtraCallbackWithResult;
    private final SaversKtExternalSyntheticLambda15.onNavigationEvent onNavigationEvent;
    private Boolean onTransact;
    private int[] onWarmupCompleted;
    private Bitmap readTypedObject;
    private boolean writeTypedObject;

    public SaversKtExternalSyntheticLambda19(@NonNull SaversKtExternalSyntheticLambda15.onNavigationEvent onnavigationevent, SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20, ByteBuffer byteBuffer, int i2) {
        this(onnavigationevent);
        onExtraCallbackWithResult(saversKtExternalSyntheticLambda20, byteBuffer, i2);
    }

    public SaversKtExternalSyntheticLambda19(@NonNull SaversKtExternalSyntheticLambda15.onNavigationEvent onnavigationevent) {
        this.IAuthTabCallbackStubProxy = new int[256];
        this.onExtraCallback = Bitmap.Config.ARGB_8888;
        this.onNavigationEvent = onnavigationevent;
        this.asInterface = new SaversKtExternalSyntheticLambda20();
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public ByteBuffer onNavigationEvent() {
        return this.ICustomTabsCallback;
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public void onExtraCallback() {
        this.IAuthTabCallbackStub = (this.IAuthTabCallbackStub + 1) % this.asInterface.onExtraCallback;
    }

    public int onExtraCallbackWithResult(int i2) {
        if (i2 < 0) {
            return -1;
        }
        SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20 = this.asInterface;
        if (i2 < saversKtExternalSyntheticLambda20.onExtraCallback) {
            return saversKtExternalSyntheticLambda20.onWarmupCompleted.get(i2).IAuthTabCallback;
        }
        return -1;
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public int asInterface() {
        int i2;
        if (this.asInterface.onExtraCallback <= 0 || (i2 = this.IAuthTabCallbackStub) < 0) {
            return 0;
        }
        return onExtraCallbackWithResult(i2);
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public int IAuthTabCallbackDefault() {
        return this.asInterface.onExtraCallback;
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public int onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public void onTransact() {
        this.IAuthTabCallbackStub = -1;
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public int onWarmupCompleted() {
        return this.ICustomTabsCallback.limit() + this.access000.length + (this.access100.length << 2);
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public Bitmap asBinder() {
        synchronized (this) {
            if (this.asInterface.onExtraCallback <= 0 || this.IAuthTabCallbackStub < 0) {
                if (Log.isLoggable(IAuthTabCallback, 3)) {
                    int i2 = this.asInterface.onExtraCallback;
                }
                this.extraCallback = 1;
            }
            int i3 = this.extraCallback;
            if (i3 == 1 || i3 == 2) {
                Log.isLoggable(IAuthTabCallback, 3);
                return null;
            }
            this.extraCallback = 0;
            if (this.onExtraCallbackWithResult == null) {
                this.onExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(OggPageHeader.MAX_SEGMENT_COUNT);
            }
            SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda14 = this.asInterface.onWarmupCompleted.get(this.IAuthTabCallbackStub);
            int i4 = this.IAuthTabCallbackStub - 1;
            SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda142 = i4 >= 0 ? this.asInterface.onWarmupCompleted.get(i4) : null;
            int[] iArr = saversKtExternalSyntheticLambda14.asInterface;
            if (iArr == null) {
                iArr = this.asInterface.onTransact;
            }
            this.onWarmupCompleted = iArr;
            if (iArr == null) {
                Log.isLoggable(IAuthTabCallback, 3);
                this.extraCallback = 1;
                return null;
            }
            if (saversKtExternalSyntheticLambda14.access100) {
                System.arraycopy(iArr, 0, this.IAuthTabCallbackStubProxy, 0, iArr.length);
                int[] iArr2 = this.IAuthTabCallbackStubProxy;
                this.onWarmupCompleted = iArr2;
                iArr2[saversKtExternalSyntheticLambda14.IAuthTabCallbackStub] = 0;
                if (saversKtExternalSyntheticLambda14.onExtraCallback == 2 && this.IAuthTabCallbackStub == 0) {
                    this.onTransact = Boolean.TRUE;
                }
            }
            return onNavigationEvent(saversKtExternalSyntheticLambda14, saversKtExternalSyntheticLambda142);
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public void IAuthTabCallback() {
        this.asInterface = null;
        byte[] bArr = this.access000;
        if (bArr != null) {
            this.onNavigationEvent.onWarmupCompleted(bArr);
        }
        int[] iArr = this.access100;
        if (iArr != null) {
            this.onNavigationEvent.onExtraCallbackWithResult(iArr);
        }
        Bitmap bitmap = this.readTypedObject;
        if (bitmap != null) {
            this.onNavigationEvent.onWarmupCompleted(bitmap);
        }
        this.readTypedObject = null;
        this.ICustomTabsCallback = null;
        this.onTransact = null;
        byte[] bArr2 = this.onExtraCallbackWithResult;
        if (bArr2 != null) {
            this.onNavigationEvent.onWarmupCompleted(bArr2);
        }
    }

    public void onExtraCallbackWithResult(@NonNull SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20, @NonNull ByteBuffer byteBuffer, int i2) {
        synchronized (this) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
            }
            int iHighestOneBit = Integer.highestOneBit(i2);
            this.extraCallback = 0;
            this.asInterface = saversKtExternalSyntheticLambda20;
            this.IAuthTabCallbackStub = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.ICustomTabsCallback = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.ICustomTabsCallback.order(ByteOrder.LITTLE_ENDIAN);
            this.writeTypedObject = false;
            Iterator<SaversKtExternalSyntheticLambda14> it = saversKtExternalSyntheticLambda20.onWarmupCompleted.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().onExtraCallback == 3) {
                    this.writeTypedObject = true;
                    break;
                }
            }
            this.extraCallbackWithResult = iHighestOneBit;
            int i3 = saversKtExternalSyntheticLambda20.access100;
            this.asBinder = i3 / iHighestOneBit;
            int i4 = saversKtExternalSyntheticLambda20.IAuthTabCallbackDefault;
            this.IAuthTabCallbackDefault = i4 / iHighestOneBit;
            this.access000 = this.onNavigationEvent.onExtraCallbackWithResult(i3 * i4);
            this.access100 = this.onNavigationEvent.onNavigationEvent(this.asBinder * this.IAuthTabCallbackDefault);
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda15
    public void onExtraCallbackWithResult(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.onExtraCallback = config;
    }

    private Bitmap onNavigationEvent(SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda14, SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda142) {
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr = this.access100;
        int i4 = 0;
        if (saversKtExternalSyntheticLambda142 == null) {
            Bitmap bitmap2 = this.readTypedObject;
            if (bitmap2 != null) {
                this.onNavigationEvent.onWarmupCompleted(bitmap2);
            }
            this.readTypedObject = null;
            Arrays.fill(iArr, 0);
        }
        if (saversKtExternalSyntheticLambda142 != null && saversKtExternalSyntheticLambda142.onExtraCallback == 3 && this.readTypedObject == null) {
            Arrays.fill(iArr, 0);
        }
        if (saversKtExternalSyntheticLambda142 != null && (i3 = saversKtExternalSyntheticLambda142.onExtraCallback) > 0) {
            if (i3 == 2) {
                if (!saversKtExternalSyntheticLambda14.access100) {
                    SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20 = this.asInterface;
                    int i5 = saversKtExternalSyntheticLambda20.onNavigationEvent;
                    if (saversKtExternalSyntheticLambda14.asInterface == null || saversKtExternalSyntheticLambda20.onExtraCallbackWithResult != saversKtExternalSyntheticLambda14.IAuthTabCallbackStub) {
                        i4 = i5;
                    }
                }
                int i6 = saversKtExternalSyntheticLambda142.onNavigationEvent;
                int i7 = this.extraCallbackWithResult;
                int i8 = i6 / i7;
                int i9 = saversKtExternalSyntheticLambda142.asBinder / i7;
                int i10 = saversKtExternalSyntheticLambda142.onTransact / i7;
                int i11 = saversKtExternalSyntheticLambda142.IAuthTabCallbackDefault / i7;
                int i12 = this.asBinder;
                int i13 = (i9 * i12) + i11;
                int i14 = i13;
                while (i14 < (i8 * i12) + i13) {
                    for (int i15 = i14; i15 < i14 + i10; i15++) {
                        iArr[i15] = i4;
                    }
                    i14 += this.asBinder;
                }
            } else if (i3 == 3 && (bitmap = this.readTypedObject) != null) {
                int i16 = this.asBinder;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.IAuthTabCallbackDefault);
            }
        }
        onExtraCallbackWithResult(saversKtExternalSyntheticLambda14);
        if (saversKtExternalSyntheticLambda14.onWarmupCompleted || this.extraCallbackWithResult != 1) {
            IAuthTabCallback(saversKtExternalSyntheticLambda14);
        } else {
            onExtraCallback(saversKtExternalSyntheticLambda14);
        }
        if (this.writeTypedObject && ((i2 = saversKtExternalSyntheticLambda14.onExtraCallback) == 0 || i2 == 1)) {
            if (this.readTypedObject == null) {
                this.readTypedObject = IAuthTabCallbackStub();
            }
            Bitmap bitmap3 = this.readTypedObject;
            int i17 = this.asBinder;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.IAuthTabCallbackDefault);
        }
        Bitmap bitmapIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i18 = this.asBinder;
        bitmapIAuthTabCallbackStub.setPixels(iArr, 0, i18, 0, 0, i18, this.IAuthTabCallbackDefault);
        return bitmapIAuthTabCallbackStub;
    }

    private void onExtraCallback(SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda14) {
        SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda142 = saversKtExternalSyntheticLambda14;
        int[] iArr = this.access100;
        int i2 = saversKtExternalSyntheticLambda142.onNavigationEvent;
        int i3 = saversKtExternalSyntheticLambda142.asBinder;
        int i4 = saversKtExternalSyntheticLambda142.onTransact;
        int i5 = saversKtExternalSyntheticLambda142.IAuthTabCallbackDefault;
        boolean z = this.IAuthTabCallbackStub == 0;
        int i6 = this.asBinder;
        byte[] bArr = this.access000;
        int[] iArr2 = this.onWarmupCompleted;
        int i7 = 0;
        byte b = -1;
        while (i7 < i2) {
            int i8 = (i7 + i3) * i6;
            int i9 = i8 + i5;
            int i10 = i9 + i4;
            int i11 = i8 + i6;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = saversKtExternalSyntheticLambda142.onTransact * i7;
            int i13 = i9;
            while (i13 < i10) {
                byte b2 = bArr[i12];
                int i14 = i2;
                int i15 = b2 & 255;
                if (i15 != b) {
                    int i16 = iArr2[i15];
                    if (i16 != 0) {
                        iArr[i13] = i16;
                    } else {
                        b = b2;
                    }
                }
                i12++;
                i13++;
                i2 = i14;
            }
            i7++;
            saversKtExternalSyntheticLambda142 = saversKtExternalSyntheticLambda14;
        }
        Boolean bool = this.onTransact;
        this.onTransact = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.onTransact == null && z && b != -1));
    }

    private void IAuthTabCallback(SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda14) {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.access100;
        int i6 = saversKtExternalSyntheticLambda14.onNavigationEvent;
        int i7 = this.extraCallbackWithResult;
        int i8 = i6 / i7;
        int i9 = saversKtExternalSyntheticLambda14.asBinder / i7;
        int i10 = saversKtExternalSyntheticLambda14.onTransact / i7;
        int i11 = saversKtExternalSyntheticLambda14.IAuthTabCallbackDefault / i7;
        boolean z = this.IAuthTabCallbackStub == 0;
        int i12 = this.asBinder;
        int i13 = this.IAuthTabCallbackDefault;
        byte[] bArr = this.access000;
        int[] iArr2 = this.onWarmupCompleted;
        Boolean bool = this.onTransact;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i15 < i8) {
            Boolean bool2 = bool;
            if (saversKtExternalSyntheticLambda14.onWarmupCompleted) {
                if (i16 >= i8) {
                    int i18 = i17 + 1;
                    i2 = i8;
                    if (i18 == 2) {
                        i16 = 4;
                        i17 = i18;
                    } else if (i18 != 3) {
                        i17 = i18;
                        if (i18 == 4) {
                            i16 = 1;
                            i14 = 2;
                        }
                    } else {
                        i14 = 4;
                        i17 = i18;
                        i16 = 2;
                    }
                } else {
                    i2 = i8;
                }
                i3 = i16 + i14;
            } else {
                i2 = i8;
                i3 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            boolean z2 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i4 = i3;
                int i24 = i15 * i7 * saversKtExternalSyntheticLambda14.onTransact;
                if (z2) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = i24;
                    int i29 = i21;
                    while (i29 < i22) {
                        int i30 = i10;
                        int i31 = i11;
                        int iOnNavigationEvent = onNavigationEvent(i28, ((i22 - i21) * i7) + i24, saversKtExternalSyntheticLambda14.onTransact);
                        if (iOnNavigationEvent != 0) {
                            iArr[i29] = iOnNavigationEvent;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i28 += i7;
                        i29++;
                        i11 = i31;
                        i10 = i30;
                    }
                    bool = bool2;
                    i15++;
                    i9 = i5;
                    i8 = i2;
                    i16 = i4;
                    i11 = i11;
                    i10 = i10;
                }
            } else {
                i4 = i3;
            }
            i5 = i9;
            bool = bool2;
            i15++;
            i9 = i5;
            i8 = i2;
            i16 = i4;
            i11 = i11;
            i10 = i10;
        }
        Boolean bool3 = bool;
        if (this.onTransact == null) {
            this.onTransact = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private int onNavigationEvent(int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i2; i10 < this.extraCallbackWithResult + i2; i10++) {
            byte[] bArr = this.access000;
            if (i10 >= bArr.length || i10 >= i3) {
                break;
            }
            int i11 = this.onWarmupCompleted[bArr[i10] & 255];
            if (i11 != 0) {
                i5 += i11 >>> 24;
                i6 += (i11 >> 16) & OggPageHeader.MAX_SEGMENT_COUNT;
                i7 += (i11 >> 8) & OggPageHeader.MAX_SEGMENT_COUNT;
                i8 += i11 & OggPageHeader.MAX_SEGMENT_COUNT;
                i9++;
            }
        }
        int i12 = i2 + i4;
        for (int i13 = i12; i13 < this.extraCallbackWithResult + i12; i13++) {
            byte[] bArr2 = this.access000;
            if (i13 >= bArr2.length || i13 >= i3) {
                break;
            }
            int i14 = this.onWarmupCompleted[bArr2[i13] & 255];
            if (i14 != 0) {
                i5 += i14 >>> 24;
                i6 += (i14 >> 16) & OggPageHeader.MAX_SEGMENT_COUNT;
                i7 += (i14 >> 8) & OggPageHeader.MAX_SEGMENT_COUNT;
                i8 += i14 & OggPageHeader.MAX_SEGMENT_COUNT;
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15, types: [short] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda14) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        short s;
        SaversKtExternalSyntheticLambda19 saversKtExternalSyntheticLambda19 = this;
        if (saversKtExternalSyntheticLambda14 != null) {
            saversKtExternalSyntheticLambda19.ICustomTabsCallback.position(saversKtExternalSyntheticLambda14.onExtraCallbackWithResult);
        }
        if (saversKtExternalSyntheticLambda14 == null) {
            SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20 = saversKtExternalSyntheticLambda19.asInterface;
            i2 = saversKtExternalSyntheticLambda20.access100;
            i3 = saversKtExternalSyntheticLambda20.IAuthTabCallbackDefault;
        } else {
            i2 = saversKtExternalSyntheticLambda14.onTransact;
            i3 = saversKtExternalSyntheticLambda14.onNavigationEvent;
        }
        int i7 = i2 * i3;
        byte[] bArr = saversKtExternalSyntheticLambda19.access000;
        if (bArr == null || bArr.length < i7) {
            saversKtExternalSyntheticLambda19.access000 = saversKtExternalSyntheticLambda19.onNavigationEvent.onExtraCallbackWithResult(i7);
        }
        byte[] bArr2 = saversKtExternalSyntheticLambda19.access000;
        if (saversKtExternalSyntheticLambda19.IAuthTabCallback_Parcel == null) {
            saversKtExternalSyntheticLambda19.IAuthTabCallback_Parcel = new short[4096];
        }
        short[] sArr = saversKtExternalSyntheticLambda19.IAuthTabCallback_Parcel;
        if (saversKtExternalSyntheticLambda19.onActivityLayout == null) {
            saversKtExternalSyntheticLambda19.onActivityLayout = new byte[4096];
        }
        byte[] bArr3 = saversKtExternalSyntheticLambda19.onActivityLayout;
        if (saversKtExternalSyntheticLambda19.getInterfaceDescriptor == null) {
            saversKtExternalSyntheticLambda19.getInterfaceDescriptor = new byte[4097];
        }
        byte[] bArr4 = saversKtExternalSyntheticLambda19.getInterfaceDescriptor;
        int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i8 = 1 << iIAuthTabCallbackStubProxy;
        int i9 = i8 + 2;
        int i10 = iIAuthTabCallbackStubProxy + 1;
        int i11 = (1 << i10) - 1;
        byte b = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            sArr[i12] = 0;
            bArr3[i12] = (byte) i12;
        }
        byte[] bArr5 = saversKtExternalSyntheticLambda19.onExtraCallbackWithResult;
        int i13 = i10;
        int i14 = i9;
        int i15 = i11;
        int i16 = 0;
        int iIAuthTabCallback_Parcel = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        while (true) {
            if (i16 >= i7) {
                break;
            }
            if (iIAuthTabCallback_Parcel == 0) {
                iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
                if (iIAuthTabCallback_Parcel <= 0) {
                    saversKtExternalSyntheticLambda19.extraCallback = 3;
                    break;
                }
                i21 = b;
            }
            i19 += (bArr5[i21] & 255) << i18;
            i21++;
            iIAuthTabCallback_Parcel--;
            int i24 = i18 + 8;
            int i25 = i20;
            int i26 = i23;
            int i27 = i13;
            int i28 = i14;
            while (true) {
                if (i24 < i27) {
                    i4 = i10;
                    i5 = i9;
                    z = true;
                    i6 = i25;
                    i18 = i24;
                    break;
                }
                i4 = i10;
                int i29 = i19 & i15;
                i19 >>= i27;
                i24 -= i27;
                if (i29 == i8) {
                    i28 = i9;
                    i15 = i11;
                    i10 = i4;
                    i27 = i10;
                    i26 = -1;
                } else {
                    i5 = i9;
                    if (i29 == i8 + 1) {
                        i6 = i25;
                        i18 = i24;
                        z = true;
                        break;
                    }
                    if (i26 == -1) {
                        bArr2[i22] = bArr3[i29];
                        i22++;
                        i16++;
                        i25 = i29;
                        i26 = i25;
                        i10 = i4;
                        i9 = i5;
                    } else {
                        if (i29 >= i28) {
                            bArr4[i17] = (byte) i25;
                            i17++;
                            s = i26;
                        } else {
                            s = i29;
                        }
                        while (s >= i8) {
                            bArr4[i17] = bArr3[s];
                            i17++;
                            s = sArr[s];
                        }
                        int i30 = bArr3[s] & 255;
                        byte b2 = (byte) i30;
                        bArr2[i22] = b2;
                        while (true) {
                            i22++;
                            i16++;
                            if (i17 <= 0) {
                                break;
                            }
                            i17--;
                            bArr2[i22] = bArr4[i17];
                        }
                        if (i28 < 4096) {
                            sArr[i28] = (short) i26;
                            bArr3[i28] = b2;
                            i28++;
                            if ((i28 & i15) == 0 && i28 < 4096) {
                                i27++;
                                i15 += i28;
                            }
                        }
                        i26 = i29;
                        i10 = i4;
                        i9 = i5;
                        i25 = i30;
                    }
                }
            }
            i23 = i26;
            i9 = i5;
            b = 0;
            i14 = i28;
            i20 = i6;
            i10 = i4;
            saversKtExternalSyntheticLambda19 = this;
            i13 = i27;
        }
        Arrays.fill(bArr2, i22, i7, b);
    }

    private int IAuthTabCallbackStubProxy() {
        return this.ICustomTabsCallback.get() & 255;
    }

    private int IAuthTabCallback_Parcel() {
        int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        if (iIAuthTabCallbackStubProxy <= 0) {
            return iIAuthTabCallbackStubProxy;
        }
        ByteBuffer byteBuffer = this.ICustomTabsCallback;
        byteBuffer.get(this.onExtraCallbackWithResult, 0, Math.min(iIAuthTabCallbackStubProxy, byteBuffer.remaining()));
        return iIAuthTabCallbackStubProxy;
    }

    private Bitmap IAuthTabCallbackStub() {
        Boolean bool = this.onTransact;
        Bitmap bitmapOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this.asBinder, this.IAuthTabCallbackDefault, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.onExtraCallback);
        bitmapOnExtraCallbackWithResult.setHasAlpha(true);
        return bitmapOnExtraCallbackWithResult;
    }
}
