package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldKeyEventHandlerExternalSyntheticLambda1 {
    public static final byte[] onNavigationEvent = {0, 0, 0, 1};
    public static final float[] onExtraCallbackWithResult = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object IAuthTabCallback = new Object();
    private static int[] onWarmupCompleted = new int[10];

    private static int IAuthTabCallback(int i2, int i3, int i4, int i5) {
        int i6 = 2;
        if (i3 != 1 && i3 != 2) {
            i6 = 1;
        }
        return i2 - (i6 * (i4 + i5));
    }

    private static int onNavigationEvent(int i2, int i3, int i4, int i5) {
        return i2 - ((i3 == 1 ? 2 : 1) * (i4 + i5));
    }

    public static boolean onWarmupCompleted(byte b) {
        if (((b & 96) >> 5) != 0) {
            return true;
        }
        int i2 = b & 31;
        return (i2 == 1 || i2 == 9 || i2 == 14) ? false : true;
    }

    public static final class access100 {
        public final int IAuthTabCallback;
        public final int IAuthTabCallbackDefault;
        public final boolean IAuthTabCallbackStub;
        public final int IAuthTabCallbackStubProxy;
        public final int IAuthTabCallback_Parcel;
        public final int ICustomTabsCallback;
        public final int access000;
        public final int access100;
        public final int asBinder;
        public final boolean asInterface;
        public final int extraCallback;
        public final boolean extraCallbackWithResult;
        public final int getInterfaceDescriptor;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onTransact;
        public final int onWarmupCompleted;
        public final int readTypedObject;
        public final float writeTypedObject;

        public access100(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, int i10, boolean z, boolean z2, int i11, int i12, int i13, boolean z3, int i14, int i15, int i16, int i17) {
            this.ICustomTabsCallback = i2;
            this.asBinder = i3;
            this.access000 = i4;
            this.readTypedObject = i5;
            this.access100 = i6;
            this.extraCallback = i7;
            this.IAuthTabCallbackDefault = i8;
            this.writeTypedObject = f;
            this.onExtraCallbackWithResult = i9;
            this.IAuthTabCallback = i10;
            this.extraCallbackWithResult = z;
            this.IAuthTabCallbackStub = z2;
            this.onTransact = i11;
            this.IAuthTabCallback_Parcel = i12;
            this.IAuthTabCallbackStubProxy = i13;
            this.asInterface = z3;
            this.onWarmupCompleted = i14;
            this.onExtraCallback = i15;
            this.onNavigationEvent = i16;
            this.getInterfaceDescriptor = i17;
        }
    }

    public static final class onNavigationEvent {
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;

        public onNavigationEvent(int i2, int i3, int i4) {
            this.onNavigationEvent = i2;
            this.onExtraCallback = i3;
            this.onExtraCallbackWithResult = i4;
        }
    }

    public static final class IAuthTabCallback {
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;

        public IAuthTabCallback(int i2, int i3) {
            this.onExtraCallback = i2;
            this.onExtraCallbackWithResult = i3;
        }
    }

    public static final class onWarmupCompleted {
        public final int IAuthTabCallback;
        public final boolean IAuthTabCallbackDefault;
        public final int[] onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onWarmupCompleted;

        public onWarmupCompleted(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
            this.IAuthTabCallback = i2;
            this.IAuthTabCallbackDefault = z;
            this.onWarmupCompleted = i3;
            this.onNavigationEvent = i4;
            this.onExtraCallback = iArr;
            this.onExtraCallbackWithResult = i5;
        }
    }

    public static final class onExtraCallback {
        public final int[] onExtraCallback;
        public final ImmutableList<onWarmupCompleted> onExtraCallbackWithResult;

        public onExtraCallback(List<onWarmupCompleted> list, int[] iArr) {
            this.onExtraCallbackWithResult = ImmutableList.copyOf(list);
            this.onExtraCallback = iArr;
        }
    }

    public static final class onExtraCallbackWithResult {
        public final int IAuthTabCallback;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onWarmupCompleted;

        public onExtraCallbackWithResult(int i2, int i3, int i4, int i5, int i6) {
            this.onNavigationEvent = i2;
            this.IAuthTabCallback = i3;
            this.onWarmupCompleted = i4;
            this.onExtraCallbackWithResult = i5;
            this.onExtraCallback = i6;
        }
    }

    public static final class asBinder {
        public final ImmutableList<onExtraCallbackWithResult> IAuthTabCallback;
        public final int[] onNavigationEvent;

        public asBinder(List<onExtraCallbackWithResult> list, int[] iArr) {
            this.IAuthTabCallback = ImmutableList.copyOf(list);
            this.onNavigationEvent = iArr;
        }
    }

    public static final class onTransact {
        public final int IAuthTabCallback;
        public final int onExtraCallbackWithResult;
        public final int onWarmupCompleted;

        public onTransact(int i2, int i3, int i4) {
            this.onWarmupCompleted = i2;
            this.onExtraCallbackWithResult = i3;
            this.IAuthTabCallback = i4;
        }
    }

    public static final class IAuthTabCallbackStub {
        public final int[] onNavigationEvent;
        public final ImmutableList<onTransact> onWarmupCompleted;

        public IAuthTabCallbackStub(List<onTransact> list, int[] iArr) {
            this.onWarmupCompleted = ImmutableList.copyOf(list);
            this.onNavigationEvent = iArr;
        }
    }

    public static final class access000 {
        public final IAuthTabCallbackStub IAuthTabCallback;
        public final onExtraCallback onExtraCallback;
        public final asBinder onExtraCallbackWithResult;
        public final ImmutableList<IAuthTabCallback> onNavigationEvent;
        public final onNavigationEvent onWarmupCompleted;

        public access000(onNavigationEvent onnavigationevent, @Nullable List<IAuthTabCallback> list, onExtraCallback onextracallback, @Nullable asBinder asbinder, @Nullable IAuthTabCallbackStub iAuthTabCallbackStub) {
            this.onWarmupCompleted = onnavigationevent;
            this.onNavigationEvent = list != null ? ImmutableList.copyOf(list) : ImmutableList.of();
            this.onExtraCallback = onextracallback;
            this.onExtraCallbackWithResult = asbinder;
            this.IAuthTabCallback = iAuthTabCallbackStub;
        }
    }

    public static final class asInterface {
        public final int IAuthTabCallback;
        public final int IAuthTabCallbackDefault;
        public final int IAuthTabCallbackStub;
        public final int IAuthTabCallbackStubProxy;
        public final onWarmupCompleted IAuthTabCallback_Parcel;
        public final onNavigationEvent access000;
        public final int access100;
        public final int asBinder;
        public final int asInterface;
        public final float getInterfaceDescriptor;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onTransact;
        public final int onWarmupCompleted;
        public final int readTypedObject;

        public asInterface(onNavigationEvent onnavigationevent, int i2, @Nullable onWarmupCompleted onwarmupcompleted, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13, int i14) {
            this.access000 = onnavigationevent;
            this.IAuthTabCallbackStubProxy = i2;
            this.IAuthTabCallback_Parcel = onwarmupcompleted;
            this.onExtraCallback = i3;
            this.onExtraCallbackWithResult = i4;
            this.onWarmupCompleted = i5;
            this.access100 = i6;
            this.readTypedObject = i7;
            this.asBinder = i8;
            this.getInterfaceDescriptor = f;
            this.onTransact = i11;
            this.onNavigationEvent = i12;
            this.IAuthTabCallback = i13;
            this.asInterface = i14;
            this.IAuthTabCallbackDefault = i9;
            this.IAuthTabCallbackStub = i10;
        }
    }

    public static final class getInterfaceDescriptor {
        public final int onExtraCallback;
        public final boolean onNavigationEvent;
        public final int onWarmupCompleted;

        public getInterfaceDescriptor(int i2, int i3, boolean z) {
            this.onExtraCallback = i2;
            this.onWarmupCompleted = i3;
            this.onNavigationEvent = z;
        }
    }

    public static final class IAuthTabCallbackDefault {
        public final int IAuthTabCallback;
        public final int IAuthTabCallbackStub;
        public final int asBinder;
        public final int asInterface;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onTransact;
        public final int onWarmupCompleted;

        public IAuthTabCallbackDefault(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.onTransact = i2;
            this.IAuthTabCallbackStub = i3;
            this.asInterface = i4;
            this.onExtraCallback = i5;
            this.asBinder = i6;
            this.onExtraCallbackWithResult = i7;
            this.IAuthTabCallback = i8;
            this.onWarmupCompleted = i9;
            this.onNavigationEvent = i10;
        }
    }

    public static int onWarmupCompleted(byte[] bArr, int i2) {
        int i3;
        synchronized (IAuthTabCallback) {
            int iIAuthTabCallbackStub = 0;
            int i4 = 0;
            while (iIAuthTabCallbackStub < i2) {
                try {
                    iIAuthTabCallbackStub = IAuthTabCallbackStub(bArr, iIAuthTabCallbackStub, i2);
                    if (iIAuthTabCallbackStub < i2) {
                        int[] iArr = onWarmupCompleted;
                        if (iArr.length <= i4) {
                            onWarmupCompleted = Arrays.copyOf(iArr, iArr.length << 1);
                        }
                        onWarmupCompleted[i4] = iIAuthTabCallbackStub;
                        iIAuthTabCallbackStub += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i4;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < i4) {
                int i8 = onWarmupCompleted[i5] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i8);
                int i9 = i7 + i8;
                bArr[i9] = 0;
                bArr[i9 + 1] = 0;
                i6 += i8 + 3;
                i5++;
                i7 = i9 + 2;
            }
            System.arraycopy(bArr, i6, bArr, i7, i3 - i7);
        }
        return i3;
    }

    public static boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, byte b) {
        return ((Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/avc") || AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, "video/avc")) && (b & 31) == 6) || ((Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/hevc") || AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, "video/hevc")) && ((b & 126) >> 1) == 39);
    }

    public static int onExtraCallback(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static int onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        if (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/avc")) {
            return 1;
        }
        return (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/hevc") || AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, "video/hevc")) ? 2 : 0;
    }

    public static boolean IAuthTabCallback(byte[] bArr, int i2, int i3, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        if (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/avc")) {
            return onWarmupCompleted(bArr[i2]);
        }
        if (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/hevc")) {
            return onNavigationEvent(bArr, i2, i3, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        }
        return true;
    }

    private static boolean onNavigationEvent(byte[] bArr, int i2, int i3, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(new TransformedTextFieldStateExternalSyntheticLambda0(bArr, i2, i3 + i2));
        int i4 = onnavigationeventIAuthTabCallback.onNavigationEvent;
        if (i4 == 35) {
            return false;
        }
        return (i4 <= 14 && i4 % 2 == 0 && onnavigationeventIAuthTabCallback.onExtraCallbackWithResult == basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackStubProxy - 1) ? false : true;
    }

    public static int IAuthTabCallback(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    public static access100 onWarmupCompleted(byte[] bArr, int i2, int i3) {
        return onTransact(bArr, i2 + 1, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static access100 onTransact(byte[] bArr, int i2, int i3) {
        int iOnExtraCallbackWithResult;
        boolean zOnExtraCallback;
        int iOnExtraCallbackWithResult2;
        int i4;
        int i5;
        int i6;
        boolean zOnExtraCallback2;
        boolean z;
        int iOnExtraCallbackWithResult3;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        int i11;
        int iOnNavigationEvent;
        boolean zOnExtraCallback3;
        boolean zOnExtraCallback4;
        int i12;
        TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0 = new TransformedTextFieldStateExternalSyntheticLambda0(bArr, i2, i3);
        int iOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
        int iOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
        int iOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
        int iOnExtraCallbackWithResult4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        if (iOnExtraCallback == 100 || iOnExtraCallback == 110 || iOnExtraCallback == 122 || iOnExtraCallback == 244 || iOnExtraCallback == 44 || iOnExtraCallback == 83 || iOnExtraCallback == 86 || iOnExtraCallback == 118 || iOnExtraCallback == 128 || iOnExtraCallback == 138) {
            iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            zOnExtraCallback = iOnExtraCallbackWithResult == 3 ? transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() : false;
            iOnExtraCallbackWithResult2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            transformedTextFieldStateExternalSyntheticLambda0.asInterface();
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                int i13 = iOnExtraCallbackWithResult != 3 ? 8 : 12;
                int i14 = 0;
                while (i14 < i13) {
                    if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                        onExtraCallback(transformedTextFieldStateExternalSyntheticLambda0, i14 < 6 ? 16 : 64);
                    }
                    i14++;
                }
            }
            i4 = iOnExtraCallbackWithResult5;
        } else {
            iOnExtraCallbackWithResult = 1;
            i4 = 0;
            zOnExtraCallback = false;
            iOnExtraCallbackWithResult2 = 0;
        }
        int iOnExtraCallbackWithResult6 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult7 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        if (iOnExtraCallbackWithResult7 == 0) {
            iOnExtraCallbackWithResult3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult() + 4;
            i5 = iOnExtraCallback;
            i6 = iOnExtraCallbackWithResult7;
            z = false;
        } else {
            if (iOnExtraCallbackWithResult7 == 1) {
                zOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                transformedTextFieldStateExternalSyntheticLambda0.onNavigationEvent();
                transformedTextFieldStateExternalSyntheticLambda0.onNavigationEvent();
                i5 = iOnExtraCallback;
                long jOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                i6 = iOnExtraCallbackWithResult7;
                for (int i15 = 0; i15 < jOnExtraCallbackWithResult; i15++) {
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                }
            } else {
                i5 = iOnExtraCallback;
                i6 = iOnExtraCallbackWithResult7;
                zOnExtraCallback2 = false;
            }
            z = zOnExtraCallback2;
            iOnExtraCallbackWithResult3 = 0;
        }
        int iOnExtraCallbackWithResult8 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        int iOnExtraCallbackWithResult9 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult10 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        boolean zOnExtraCallback5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
        if (!zOnExtraCallback5) {
            transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        }
        transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        int i16 = (iOnExtraCallbackWithResult9 + 1) << 4;
        int i17 = 2 - (zOnExtraCallback5 ? 1 : 0);
        int i18 = ((iOnExtraCallbackWithResult10 + 1) * i17) << 4;
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            int iOnExtraCallbackWithResult11 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult12 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult13 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult14 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            if (iOnExtraCallbackWithResult == 0) {
                i12 = 1;
            } else {
                i12 = iOnExtraCallbackWithResult == 3 ? 1 : 2;
                i17 *= iOnExtraCallbackWithResult == 1 ? 2 : 1;
            }
            i16 -= (iOnExtraCallbackWithResult11 + iOnExtraCallbackWithResult12) * i12;
            i18 -= (iOnExtraCallbackWithResult13 + iOnExtraCallbackWithResult14) * i17;
        }
        int i19 = i16;
        int i20 = i18;
        int i21 = i5;
        int iOnExtraCallbackWithResult15 = ((i21 == 44 || i21 == 86 || i21 == 100 || i21 == 110 || i21 == 122 || i21 == 244) && (iOnExtraCallback2 & 16) != 0) ? 0 : 16;
        int iIAuthTabCallback = -1;
        if (!transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            i7 = iOnExtraCallbackWithResult15;
            i8 = -1;
            i9 = -1;
            i10 = -1;
            f = 1.0f;
        } else if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            int iOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
            if (iOnExtraCallback4 == 255) {
                int iOnExtraCallback5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(16);
                int iOnExtraCallback6 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(16);
                if (iOnExtraCallback5 != 0 && iOnExtraCallback6 != 0) {
                    f = iOnExtraCallback5 / iOnExtraCallback6;
                }
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
                iOnNavigationEvent = -1;
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
                zOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                if (zOnExtraCallback3) {
                }
                zOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                if (zOnExtraCallback4) {
                }
                if (zOnExtraCallback3) {
                }
            } else {
                float[] fArr = onExtraCallbackWithResult;
                if (iOnExtraCallback4 < fArr.length) {
                    f = fArr[iOnExtraCallback4];
                    if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    }
                    if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    }
                    iOnNavigationEvent = -1;
                    if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    }
                    if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    }
                    zOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                    if (zOnExtraCallback3) {
                    }
                    zOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                    if (zOnExtraCallback4) {
                    }
                    if (zOnExtraCallback3) {
                    }
                } else {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iOnExtraCallback4);
                    f = 1.0f;
                    if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    }
                    if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    }
                    iOnNavigationEvent = -1;
                    if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    }
                    if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    }
                    zOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                    if (zOnExtraCallback3) {
                    }
                    zOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                    if (zOnExtraCallback4) {
                    }
                    if (zOnExtraCallback3) {
                    }
                }
            }
        } else {
            f = 1.0f;
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
            }
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                i11 = -1;
            } else {
                transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(3);
                i11 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() ? 1 : 2;
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    int iOnExtraCallback7 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
                    int iOnExtraCallback8 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
                    transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(8);
                    iOnNavigationEvent = TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent(iOnExtraCallback7);
                    iIAuthTabCallback = TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback(iOnExtraCallback8);
                }
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                }
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(65);
                }
                zOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                if (zOnExtraCallback3) {
                    IAuthTabCallbackStub(transformedTextFieldStateExternalSyntheticLambda0);
                }
                zOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                if (zOnExtraCallback4) {
                    IAuthTabCallbackStub(transformedTextFieldStateExternalSyntheticLambda0);
                }
                if (zOnExtraCallback3 || zOnExtraCallback4) {
                    transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                }
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    iOnExtraCallbackWithResult15 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                }
                i8 = iOnNavigationEvent;
                i7 = iOnExtraCallbackWithResult15;
                i9 = i11;
                i10 = iIAuthTabCallback;
            }
            iOnNavigationEvent = -1;
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            }
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            }
            zOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
            if (zOnExtraCallback3) {
            }
            zOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
            if (zOnExtraCallback4) {
            }
            if (zOnExtraCallback3) {
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
                i8 = iOnNavigationEvent;
                i7 = iOnExtraCallbackWithResult15;
                i9 = i11;
                i10 = iIAuthTabCallback;
            }
        }
        return new access100(i21, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult8, i19, i20, f, iOnExtraCallbackWithResult2, i4, zOnExtraCallback, zOnExtraCallback5, iOnExtraCallbackWithResult6 + 4, i6, iOnExtraCallbackWithResult3, z, i8, i9, i10, i7);
    }

    public static access000 onExtraCallbackWithResult(byte[] bArr, int i2, int i3) {
        TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0 = new TransformedTextFieldStateExternalSyntheticLambda0(bArr, i2, i3);
        return onWarmupCompleted(transformedTextFieldStateExternalSyntheticLambda0, IAuthTabCallback(transformedTextFieldStateExternalSyntheticLambda0));
    }

    private static onNavigationEvent IAuthTabCallback(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0) {
        transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        return new onNavigationEvent(transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(6), transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(6), transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(3) - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:271:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0530 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static access000 onWarmupCompleted(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0, onNavigationEvent onnavigationevent) {
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        IAuthTabCallbackStub iAuthTabCallbackStubOnNavigationEvent;
        int i5;
        boolean[][] zArr;
        int i6;
        int i7;
        boolean[][] zArr2;
        int i8;
        int[] iArr3;
        boolean z;
        boolean z2;
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(4);
        boolean zOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
        boolean zOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(6);
        int i9 = iOnExtraCallback + 1;
        int iOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(3);
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(17);
        onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback(transformedTextFieldStateExternalSyntheticLambda0, true, iOnExtraCallback2, (onWarmupCompleted) null);
        boolean z3 = false;
        for (int i10 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() ? 0 : iOnExtraCallback2; i10 <= iOnExtraCallback2; i10++) {
            transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        }
        int iOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(6);
        int iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult() + 1;
        onExtraCallback onextracallback = new onExtraCallback(ImmutableList.of(onwarmupcompletedIAuthTabCallback), new int[1]);
        Object[] objArr = i9 >= 2 && iOnExtraCallbackWithResult >= 2;
        Object[] objArr2 = zOnExtraCallback && zOnExtraCallback2;
        int i11 = iOnExtraCallback3 + 1;
        Object[] objArr3 = i11 >= i9;
        if (objArr == false || objArr2 == false || objArr3 == false) {
            return new access000(onnavigationevent, null, onextracallback, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iOnExtraCallbackWithResult, i11);
        int[] iArr5 = new int[iOnExtraCallbackWithResult];
        int[] iArr6 = new int[iOnExtraCallbackWithResult];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i12 = 1; i12 < iOnExtraCallbackWithResult; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 <= iOnExtraCallback3; i14++) {
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    iArr4[i12][i13] = i14;
                    iArr6[i12] = i14;
                    i13++;
                }
                iArr5[i12] = i13;
            }
        }
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(64);
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            }
            int iOnExtraCallbackWithResult2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            int i15 = 0;
            while (i15 < iOnExtraCallbackWithResult2) {
                transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                if (i15 == 0 || transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    z3 = true;
                }
                onNavigationEvent(transformedTextFieldStateExternalSyntheticLambda0, z3, iOnExtraCallback2);
                i15++;
                z3 = false;
            }
        }
        if (!transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            return new access000(onnavigationevent, null, onextracallback, null, null);
        }
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted();
        onWarmupCompleted onwarmupcompletedIAuthTabCallback2 = IAuthTabCallback(transformedTextFieldStateExternalSyntheticLambda0, false, iOnExtraCallback2, onwarmupcompletedIAuthTabCallback);
        boolean zOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
        boolean[] zArr3 = new boolean[16];
        int i16 = 0;
        for (int i17 = 0; i17 < 16; i17++) {
            boolean zOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
            zArr3[i17] = zOnExtraCallback4;
            if (zOnExtraCallback4) {
                i16++;
            }
        }
        if (i16 == 0 || !zArr3[1]) {
            return new access000(onnavigationevent, null, onextracallback, null, null);
        }
        int[] iArr7 = new int[i16];
        for (int i18 = 0; i18 < i16 - (zOnExtraCallback3 ? 1 : 0); i18++) {
            iArr7[i18] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(3);
        }
        int[] iArr8 = new int[i16 + 1];
        if (zOnExtraCallback3) {
            int i19 = 1;
            while (i19 < i16) {
                int[] iArr9 = iArr5;
                for (int i20 = 0; i20 < i19; i20++) {
                    iArr8[i19] = iArr8[i19] + iArr7[i20] + 1;
                }
                i19++;
                iArr5 = iArr9;
            }
            iArr = iArr5;
            iArr8[i16] = 6;
        } else {
            iArr = iArr5;
        }
        int[][] iArr10 = (int[][]) Array.newInstance((Class<?>) cls, i9, i16);
        int[] iArr11 = new int[i9];
        iArr11[0] = 0;
        boolean zOnExtraCallback5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
        int i21 = 1;
        while (i21 < i9) {
            if (zOnExtraCallback5) {
                z = zOnExtraCallback5;
                iArr11[i21] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(6);
            } else {
                z = zOnExtraCallback5;
                iArr11[i21] = i21;
            }
            if (zOnExtraCallback3) {
                z2 = zOnExtraCallback3 ? 1 : 0;
                for (int i22 = 0; i22 < i16; i22++) {
                    iArr10[i21][i22] = (iArr11[i21] & ((1 << iArr8[r32]) - 1)) >> iArr8[i22];
                }
            } else {
                int i23 = 0;
                while (i23 < i16) {
                    iArr10[i21][i23] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(iArr7[i23] + 1);
                    i23++;
                    zOnExtraCallback3 = zOnExtraCallback3;
                }
                z2 = zOnExtraCallback3;
            }
            i21++;
            zOnExtraCallback5 = z;
            zOnExtraCallback3 = z2;
        }
        int[] iArr12 = new int[i11];
        int i24 = 1;
        for (int i25 = 0; i25 < i9; i25++) {
            iArr12[iArr11[i25]] = -1;
            int i26 = 0;
            for (int i27 = 0; i27 < 16; i27++) {
                if (zArr3[i27]) {
                    if (i27 == 1) {
                        iArr12[iArr11[i25]] = iArr10[i25][i26];
                    }
                    i26++;
                }
            }
            if (i25 > 0) {
                int i28 = 0;
                while (true) {
                    if (i28 >= i25) {
                        i24++;
                        break;
                    }
                    if (iArr12[iArr11[i25]] == iArr12[iArr11[i28]]) {
                        break;
                    }
                    i28++;
                }
            }
        }
        int iOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(4);
        if (i24 < 2 || iOnExtraCallback4 == 0) {
            return new access000(onnavigationevent, null, onextracallback, null, null);
        }
        int[] iArr13 = new int[i24];
        for (int i29 = 0; i29 < i24; i29++) {
            iArr13[i29] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(iOnExtraCallback4);
        }
        int[] iArr14 = new int[i11];
        for (int i30 = 0; i30 < i9; i30++) {
            iArr14[Math.min(iArr11[i30], iOnExtraCallback3)] = i30;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int i31 = 0;
        while (i31 <= iOnExtraCallback3) {
            int iMin = Math.min(iArr12[i31], i24 - 1);
            builder.add(new IAuthTabCallback(iArr14[i31], iMin >= 0 ? iArr13[iMin] : -1));
            i31++;
            iArr12 = iArr12;
        }
        ImmutableList immutableListBuild = builder.build();
        if (((IAuthTabCallback) immutableListBuild.get(0)).onExtraCallbackWithResult == -1) {
            return new access000(onnavigationevent, null, onextracallback, null, null);
        }
        int i32 = 1;
        while (true) {
            if (i32 > iOnExtraCallback3) {
                i2 = -1;
                i3 = -1;
                break;
            }
            i2 = -1;
            if (((IAuthTabCallback) immutableListBuild.get(i32)).onExtraCallbackWithResult != -1) {
                i3 = i32;
                break;
            }
            i32++;
        }
        if (i3 == i2) {
            return new access000(onnavigationevent, null, onextracallback, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i9, i9);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i9, i9);
        for (int i33 = 1; i33 < i9; i33++) {
            for (int i34 = 0; i34 < i33; i34++) {
                boolean[] zArr6 = zArr4[i33];
                boolean[] zArr7 = zArr5[i33];
                boolean zOnExtraCallback6 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                zArr7[i34] = zOnExtraCallback6;
                zArr6[i34] = zOnExtraCallback6;
            }
        }
        for (int i35 = 1; i35 < i9; i35++) {
            for (int i36 = 0; i36 < iOnExtraCallback; i36++) {
                int i37 = 0;
                while (true) {
                    if (i37 < i35) {
                        boolean[] zArr8 = zArr5[i35];
                        if (zArr8[i37] && zArr5[i37][i36]) {
                            zArr8[i36] = true;
                            break;
                        }
                        i37++;
                    }
                }
            }
        }
        int[] iArr15 = new int[i11];
        for (int i38 = 0; i38 < i9; i38++) {
            int i39 = 0;
            for (int i40 = 0; i40 < i38; i40++) {
                i39 += zArr4[i38][i40] ? 1 : 0;
            }
            iArr15[iArr11[i38]] = i39;
        }
        int i41 = 0;
        for (int i42 = 0; i42 < i9; i42++) {
            if (iArr15[iArr11[i42]] == 0) {
                i41++;
            }
        }
        if (i41 > 1) {
            return new access000(onnavigationevent, null, onextracallback, null, null);
        }
        int[] iArr16 = new int[i9];
        int[] iArr17 = new int[iOnExtraCallbackWithResult];
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            int i43 = 0;
            while (true) {
                iArr2 = iArr11;
                if (i43 >= i9) {
                    break;
                }
                iArr16[i43] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(3);
                i43++;
                iArr11 = iArr2;
            }
            i4 = iOnExtraCallback2;
        } else {
            iArr2 = iArr11;
            i4 = iOnExtraCallback2;
            Arrays.fill(iArr16, 0, i9, i4);
        }
        int i44 = 0;
        while (i44 < iOnExtraCallbackWithResult) {
            int i45 = i3;
            boolean[][] zArr9 = zArr5;
            int[] iArr18 = iArr15;
            int iMax = 0;
            for (int i46 = 0; i46 < iArr[i44]; i46++) {
                iMax = Math.max(iMax, iArr16[((IAuthTabCallback) immutableListBuild.get(iArr4[i44][i46])).onExtraCallback]);
            }
            iArr17[i44] = iMax + 1;
            i44++;
            iArr15 = iArr18;
            zArr5 = zArr9;
            i3 = i45;
        }
        int i47 = i3;
        boolean[][] zArr10 = zArr5;
        int[] iArr19 = iArr15;
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            int i48 = 0;
            while (i48 < iOnExtraCallback) {
                int i49 = i48 + 1;
                for (int i50 = i49; i50 < i9; i50++) {
                    if (zArr4[i50][i48]) {
                        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(3);
                    }
                }
                i48 = i49;
            }
        }
        transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        int iOnExtraCallbackWithResult3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult() + 1;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.add(onwarmupcompletedIAuthTabCallback);
        if (iOnExtraCallbackWithResult3 > 1) {
            builder2.add(onwarmupcompletedIAuthTabCallback2);
            onWarmupCompleted onwarmupcompletedIAuthTabCallback3 = onwarmupcompletedIAuthTabCallback2;
            for (int i51 = 2; i51 < iOnExtraCallbackWithResult3; i51++) {
                onwarmupcompletedIAuthTabCallback3 = IAuthTabCallback(transformedTextFieldStateExternalSyntheticLambda0, transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(), i4, onwarmupcompletedIAuthTabCallback3);
                builder2.add(onwarmupcompletedIAuthTabCallback3);
            }
        }
        ImmutableList immutableListBuild2 = builder2.build();
        int iOnExtraCallbackWithResult4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult() + iOnExtraCallbackWithResult;
        if (iOnExtraCallbackWithResult4 > iOnExtraCallbackWithResult) {
            return new access000(onnavigationevent, null, onextracallback, null, null);
        }
        int iOnExtraCallback5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iOnExtraCallbackWithResult4, i11);
        int[] iArr20 = new int[iOnExtraCallbackWithResult4];
        int[] iArr21 = new int[iOnExtraCallbackWithResult4];
        int i52 = 0;
        while (i52 < iOnExtraCallbackWithResult) {
            int i53 = iOnExtraCallbackWithResult;
            iArr20[i52] = 0;
            iArr21[i52] = iArr6[i52];
            if (iOnExtraCallback5 == 0) {
                zArr2 = zArr4;
                iArr3 = iArr17;
                i8 = i9;
                Arrays.fill(zArr11[i52], 0, iArr[i52], true);
                iArr20[i52] = iArr[i52];
            } else {
                zArr2 = zArr4;
                i8 = i9;
                iArr3 = iArr17;
                if (iOnExtraCallback5 == 1) {
                    int i54 = iArr6[i52];
                    for (int i55 = 0; i55 < iArr[i52]; i55++) {
                        zArr11[i52][i55] = iArr4[i52][i55] == i54;
                    }
                    iArr20[i52] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr20[0] = 1;
                }
            }
            i52++;
            iOnExtraCallbackWithResult = i53;
            zArr4 = zArr2;
            iArr17 = iArr3;
            i9 = i8;
        }
        boolean[][] zArr12 = zArr4;
        int i56 = i9;
        int[] iArr22 = iArr17;
        int i57 = iOnExtraCallbackWithResult;
        int[] iArr23 = new int[i11];
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iOnExtraCallbackWithResult4, i11);
        int i58 = 1;
        int i59 = 0;
        while (i58 < iOnExtraCallbackWithResult4) {
            if (iOnExtraCallback5 == 2) {
                for (int i60 = 0; i60 < iArr[i58]; i60++) {
                    zArr11[i58][i60] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                    int i61 = iArr20[i58];
                    boolean z4 = zArr11[i58][i60];
                    iArr20[i58] = i61 + (z4 ? 1 : 0);
                    if (z4) {
                        iArr21[i58] = iArr4[i58][i60];
                    }
                }
            }
            if (i59 == 0 && iArr4[i58][0] == 0 && zArr11[i58][0]) {
                int i62 = 1;
                while (i62 < iArr[i58]) {
                    int i63 = i47;
                    if (iArr4[i58][i62] == i63 && zArr11[i58][i63]) {
                        i59 = i58;
                    }
                    i62++;
                    i47 = i63;
                }
            }
            int i64 = i47;
            int i65 = 0;
            while (i65 < iArr[i58]) {
                if (iOnExtraCallbackWithResult3 > 1) {
                    zArr13[i58][i65] = zArr11[i58][i65];
                    i6 = iOnExtraCallback5;
                    i7 = i64;
                    i5 = iOnExtraCallbackWithResult3;
                    int iLog2 = DoubleMath.log2(iOnExtraCallbackWithResult3, RoundingMode.CEILING);
                    if (!zArr13[i58][i65]) {
                        int i66 = ((IAuthTabCallback) immutableListBuild.get(iArr4[i58][i65])).onExtraCallback;
                        int i67 = 0;
                        while (i67 < i65) {
                            zArr = zArr11;
                            if (zArr10[i66][((IAuthTabCallback) immutableListBuild.get(iArr4[i58][i67])).onExtraCallback]) {
                                zArr13[i58][i65] = true;
                                break;
                            }
                            i67++;
                            zArr11 = zArr;
                        }
                        zArr = zArr11;
                        if (zArr13[i58][i65]) {
                            if (i59 > 0 && i58 == i59) {
                                iArr23[i65] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(iLog2);
                            } else {
                                transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(iLog2);
                            }
                        }
                    } else {
                        zArr = zArr11;
                        if (zArr13[i58][i65]) {
                        }
                    }
                } else {
                    i5 = iOnExtraCallbackWithResult3;
                    zArr = zArr11;
                    i6 = iOnExtraCallback5;
                    i7 = i64;
                }
                i65++;
                iOnExtraCallback5 = i6;
                iOnExtraCallbackWithResult3 = i5;
                i64 = i7;
                zArr11 = zArr;
            }
            int i68 = iOnExtraCallbackWithResult3;
            boolean[][] zArr14 = zArr11;
            int i69 = iOnExtraCallback5;
            i47 = i64;
            if (iArr20[i58] == 1 && iArr19[iArr21[i58]] > 0) {
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
            }
            i58++;
            iOnExtraCallback5 = i69;
            iOnExtraCallbackWithResult3 = i68;
            zArr11 = zArr14;
        }
        if (i59 == 0) {
            return new access000(onnavigationevent, null, onextracallback, null, null);
        }
        asBinder asbinderIAuthTabCallback = IAuthTabCallback(transformedTextFieldStateExternalSyntheticLambda0, i56);
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(2);
        for (int i70 = 1; i70 < i56; i70++) {
            if (iArr19[iArr2[i70]] == 0) {
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
            }
        }
        onExtraCallback(transformedTextFieldStateExternalSyntheticLambda0, iOnExtraCallbackWithResult4, iArr22, iArr, zArr13);
        onNavigationEvent(transformedTextFieldStateExternalSyntheticLambda0, i56, zArr12);
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted();
            iAuthTabCallbackStubOnNavigationEvent = onNavigationEvent(transformedTextFieldStateExternalSyntheticLambda0, i56, i57, iArr22);
        } else {
            iAuthTabCallbackStubOnNavigationEvent = null;
        }
        return new access000(onnavigationevent, immutableListBuild, new onExtraCallback(immutableListBuild2, iArr23), asbinderIAuthTabCallback, iAuthTabCallbackStubOnNavigationEvent);
    }

    public static asInterface IAuthTabCallback(byte[] bArr, int i2, int i3, @Nullable access000 access000Var) {
        return onExtraCallback(bArr, i2 + 2, i3, IAuthTabCallback(new TransformedTextFieldStateExternalSyntheticLambda0(bArr, i2, i3)), access000Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static asInterface onExtraCallback(byte[] bArr, int i2, int i3, onNavigationEvent onnavigationevent, @Nullable access000 access000Var) {
        int iIAuthTabCallback;
        int iOnNavigationEvent;
        int iOnExtraCallbackWithResult;
        int i4;
        int i5;
        int iOnExtraCallbackWithResult2;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        IAuthTabCallbackStub iAuthTabCallbackStub;
        int i15;
        int iIAuthTabCallback2;
        int iOnNavigationEvent2;
        asBinder asbinder;
        TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0 = new TransformedTextFieldStateExternalSyntheticLambda0(bArr, i2, i3);
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(4);
        int iOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(3);
        boolean z = onnavigationevent.onExtraCallback != 0 && iOnExtraCallback == 7;
        int i16 = (access000Var == null || access000Var.onNavigationEvent.isEmpty()) ? 0 : ((IAuthTabCallback) access000Var.onNavigationEvent.get(Math.min(onnavigationevent.onExtraCallback, access000Var.onNavigationEvent.size() - 1))).onExtraCallback;
        onWarmupCompleted onwarmupcompletedIAuthTabCallback = null;
        if (!z) {
            transformedTextFieldStateExternalSyntheticLambda0.asInterface();
            onwarmupcompletedIAuthTabCallback = IAuthTabCallback(transformedTextFieldStateExternalSyntheticLambda0, true, iOnExtraCallback, (onWarmupCompleted) null);
        } else if (access000Var != null) {
            onExtraCallback onextracallback = access000Var.onExtraCallback;
            int i17 = onextracallback.onExtraCallback[i16];
            if (onextracallback.onExtraCallbackWithResult.size() > i17) {
                onwarmupcompletedIAuthTabCallback = (onWarmupCompleted) access000Var.onExtraCallback.onExtraCallbackWithResult.get(i17);
            }
        }
        int iOnExtraCallbackWithResult3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        if (z) {
            int iOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() ? transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8) : -1;
            if (access000Var == null || (asbinder = access000Var.onExtraCallbackWithResult) == null) {
                i8 = 0;
                iOnExtraCallbackWithResult = 0;
                iOnExtraCallbackWithResult2 = 0;
                i7 = 0;
                i6 = 0;
                i4 = 0;
                i5 = 0;
            } else {
                if (iOnExtraCallback2 == -1) {
                    iOnExtraCallback2 = asbinder.onNavigationEvent[i16];
                }
                if (iOnExtraCallback2 != -1 && asbinder.IAuthTabCallback.size() > iOnExtraCallback2) {
                    onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) access000Var.onExtraCallbackWithResult.IAuthTabCallback.get(iOnExtraCallback2);
                    i7 = onextracallbackwithresult.onNavigationEvent;
                    i6 = onextracallbackwithresult.onExtraCallbackWithResult;
                    i8 = onextracallbackwithresult.onExtraCallback;
                    int i18 = onextracallbackwithresult.IAuthTabCallback;
                    iOnExtraCallbackWithResult2 = onextracallbackwithresult.onWarmupCompleted;
                    i5 = i8;
                    iOnExtraCallbackWithResult = i18;
                    i4 = i6;
                }
            }
        } else {
            int iOnExtraCallbackWithResult4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            if (iOnExtraCallbackWithResult4 == 3) {
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
            }
            int iOnExtraCallbackWithResult5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                int iOnExtraCallbackWithResult7 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult8 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult9 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult10 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                iIAuthTabCallback = IAuthTabCallback(iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult7, iOnExtraCallbackWithResult8);
                iOnNavigationEvent = onNavigationEvent(iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult9, iOnExtraCallbackWithResult10);
            } else {
                iIAuthTabCallback = iOnExtraCallbackWithResult5;
                iOnNavigationEvent = iOnExtraCallbackWithResult6;
            }
            iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            i4 = iOnExtraCallbackWithResult5;
            i5 = iOnExtraCallbackWithResult6;
            iOnExtraCallbackWithResult2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            i6 = iIAuthTabCallback;
            i7 = iOnExtraCallbackWithResult4;
            i8 = iOnNavigationEvent;
        }
        int iOnExtraCallbackWithResult11 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        if (z) {
            i9 = -1;
        } else {
            int iMax = -1;
            for (int i19 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() ? 0 : iOnExtraCallback; i19 <= iOnExtraCallback; i19++) {
                transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                iMax = Math.max(transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult(), iMax);
                transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            }
            i9 = iMax;
        }
        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            if (z && transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(6);
            } else if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                onExtraCallbackWithResult(transformedTextFieldStateExternalSyntheticLambda0);
            }
        }
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(2);
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(8);
            transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        }
        asBinder(transformedTextFieldStateExternalSyntheticLambda0);
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            int iOnExtraCallbackWithResult12 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            for (int i20 = 0; i20 < iOnExtraCallbackWithResult12; i20++) {
                transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(iOnExtraCallbackWithResult11 + 5);
            }
        }
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(2);
        float f2 = 1.0f;
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                int iOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
                if (iOnExtraCallback3 == 255) {
                    int iOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(16);
                    int iOnExtraCallback5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(16);
                    if (iOnExtraCallback4 != 0 && iOnExtraCallback5 != 0) {
                        f2 = iOnExtraCallback4 / iOnExtraCallback5;
                    }
                } else {
                    float[] fArr = onExtraCallbackWithResult;
                    if (iOnExtraCallback3 < fArr.length) {
                        f2 = fArr[iOnExtraCallback3];
                    } else {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iOnExtraCallback3);
                    }
                }
            }
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
            }
            if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(3);
                i14 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() ? 1 : 2;
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    int iOnExtraCallback6 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
                    int iOnExtraCallback7 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
                    transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(8);
                    iOnNavigationEvent2 = TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent(iOnExtraCallback6);
                    iIAuthTabCallback2 = TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback(iOnExtraCallback7);
                } else {
                    iOnNavigationEvent2 = -1;
                    iIAuthTabCallback2 = -1;
                }
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                }
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    i8 <<= 1;
                }
                i11 = iOnNavigationEvent2;
                i12 = i14;
                i13 = iIAuthTabCallback2;
                f = f2;
                i10 = i8;
            } else if (access000Var != null && (iAuthTabCallbackStub = access000Var.IAuthTabCallback) != null && iAuthTabCallbackStub.onWarmupCompleted.size() > (i15 = iAuthTabCallbackStub.onNavigationEvent[i16])) {
                onTransact ontransact = (onTransact) access000Var.IAuthTabCallback.onWarmupCompleted.get(i15);
                int i21 = ontransact.onWarmupCompleted;
                int i22 = ontransact.onExtraCallbackWithResult;
                iIAuthTabCallback2 = ontransact.IAuthTabCallback;
                iOnNavigationEvent2 = i21;
                i14 = i22;
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
                i11 = iOnNavigationEvent2;
                i12 = i14;
                i13 = iIAuthTabCallback2;
                f = f2;
                i10 = i8;
            } else {
                i14 = -1;
                iOnNavigationEvent2 = -1;
                iIAuthTabCallback2 = -1;
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
                i11 = iOnNavigationEvent2;
                i12 = i14;
                i13 = iIAuthTabCallback2;
                f = f2;
                i10 = i8;
            }
        } else {
            f = 1.0f;
            i10 = i8;
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new asInterface(onnavigationevent, iOnExtraCallback, onwarmupcompletedIAuthTabCallback, i7, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, i6, i10, i4, i5, f, i9, i11, i12, i13);
    }

    public static getInterfaceDescriptor onExtraCallback(byte[] bArr, int i2, int i3) {
        return onNavigationEvent(bArr, i2 + 1, i3);
    }

    public static getInterfaceDescriptor onNavigationEvent(byte[] bArr, int i2, int i3) {
        TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0 = new TransformedTextFieldStateExternalSyntheticLambda0(bArr, i2, i3);
        int iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        return new getInterfaceDescriptor(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback());
    }

    public static IAuthTabCallbackDefault IAuthTabCallback(byte[] bArr, int i2, int i3) {
        byte b;
        int iMax;
        int iMax2;
        int i4 = i2 + 2;
        int i5 = i3 - 1;
        while (true) {
            b = bArr[i5];
            if (b != 0 || i5 <= i4) {
                break;
            }
            i5--;
        }
        if (b != 0 && i5 > i4) {
            TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0 = new TransformedTextFieldStateExternalSyntheticLambda0(bArr, i4, i5 + 1);
            while (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult(16)) {
                int iOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
                int i6 = 0;
                while (iOnExtraCallback == 255) {
                    i6 += OggPageHeader.MAX_SEGMENT_COUNT;
                    iOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
                }
                int iOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
                int i7 = 0;
                while (iOnExtraCallback2 == 255) {
                    i7 += OggPageHeader.MAX_SEGMENT_COUNT;
                    iOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
                }
                int i8 = i7 + iOnExtraCallback2;
                if (i8 == 0 || !transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult(i8)) {
                    break;
                }
                if (i6 + iOnExtraCallback == 176) {
                    int iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    boolean zOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallbackWithResult2 = zOnExtraCallback ? transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult() : 0;
                    int iOnExtraCallbackWithResult3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = -1;
                    int iOnExtraCallbackWithResult5 = -1;
                    int iOnExtraCallback3 = -1;
                    int iOnExtraCallback4 = -1;
                    int i9 = -1;
                    int iOnExtraCallback5 = -1;
                    for (int i10 = 0; i10 <= iOnExtraCallbackWithResult3; i10++) {
                        iOnExtraCallbackWithResult4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                        iOnExtraCallbackWithResult5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                        iOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(6);
                        if (iOnExtraCallback3 == 63) {
                            return null;
                        }
                        if (iOnExtraCallback3 == 0) {
                            iMax = Math.max(0, iOnExtraCallbackWithResult - 30);
                        } else {
                            iMax = Math.max(0, (iOnExtraCallback3 + iOnExtraCallbackWithResult) - 31);
                        }
                        iOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(iMax);
                        if (zOnExtraCallback) {
                            int iOnExtraCallback6 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(6);
                            if (iOnExtraCallback6 == 63) {
                                return null;
                            }
                            if (iOnExtraCallback6 == 0) {
                                iMax2 = Math.max(0, iOnExtraCallbackWithResult2 - 30);
                            } else {
                                iMax2 = Math.max(0, (iOnExtraCallback6 + iOnExtraCallbackWithResult2) - 31);
                            }
                            iOnExtraCallback5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(iMax2);
                            i9 = iOnExtraCallback6;
                        }
                        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                            transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(10);
                        }
                    }
                    return new IAuthTabCallbackDefault(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3 + 1, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, iOnExtraCallback3, iOnExtraCallback4, i9, iOnExtraCallback5);
                }
                transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(i8 << 3);
            }
        }
        return null;
    }

    public static int onWarmupCompleted(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            IAuthTabCallback(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            IAuthTabCallback(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            IAuthTabCallback(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b = bArr[i6];
            if ((b & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b == 1) {
                    IAuthTabCallback(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static void IAuthTabCallback(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String onNavigationEvent(List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                ImmutableList<Integer> immutableListOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr);
                for (int i3 = 0; i3 < immutableListOnExtraCallbackWithResult.size(); i3++) {
                    if (((Integer) immutableListOnExtraCallbackWithResult.get(i3)).intValue() + 3 < length) {
                        TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0 = new TransformedTextFieldStateExternalSyntheticLambda0(bArr, ((Integer) immutableListOnExtraCallbackWithResult.get(i3)).intValue() + 3, length);
                        onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(transformedTextFieldStateExternalSyntheticLambda0);
                        if (onnavigationeventIAuthTabCallback.onNavigationEvent == 33 && onnavigationeventIAuthTabCallback.onExtraCallback == 0) {
                            return onExtraCallback(transformedTextFieldStateExternalSyntheticLambda0);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static ImmutableList<Integer> onExtraCallbackWithResult(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        ImmutableList.Builder builder = ImmutableList.builder();
        int i2 = 0;
        while (i2 < bArr.length) {
            int iOnWarmupCompleted = onWarmupCompleted(bArr, i2, bArr.length, zArr);
            if (iOnWarmupCompleted != bArr.length) {
                builder.add(Integer.valueOf(iOnWarmupCompleted));
            }
            i2 = iOnWarmupCompleted + 3;
        }
        return builder.build();
    }

    private static String onExtraCallback(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0) {
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(4);
        int iOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(3);
        transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback(transformedTextFieldStateExternalSyntheticLambda0, true, iOnExtraCallback, (onWarmupCompleted) null);
        return TextFieldCoreModifierNodeExternalSyntheticLambda1.onExtraCallbackWithResult(onwarmupcompletedIAuthTabCallback.IAuthTabCallback, onwarmupcompletedIAuthTabCallback.IAuthTabCallbackDefault, onwarmupcompletedIAuthTabCallback.onWarmupCompleted, onwarmupcompletedIAuthTabCallback.onNavigationEvent, onwarmupcompletedIAuthTabCallback.onExtraCallback, onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult);
    }

    private static int IAuthTabCallbackStub(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onNavigationEvent(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0, boolean z, int i2) {
        ?? r8;
        ?? r1;
        boolean zOnExtraCallback;
        int iOnExtraCallbackWithResult;
        int i3;
        if (z) {
            boolean zOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
            boolean zOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
            if (zOnExtraCallback2 || zOnExtraCallback3) {
                zOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                if (zOnExtraCallback) {
                    transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(19);
                }
                transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(8);
                if (zOnExtraCallback) {
                    transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(4);
                }
                transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(15);
                r1 = zOnExtraCallback3;
                r8 = zOnExtraCallback2;
            } else {
                zOnExtraCallback = false;
                r1 = zOnExtraCallback3;
                r8 = zOnExtraCallback2;
            }
        } else {
            r8 = 0;
            r1 = 0;
            zOnExtraCallback = false;
        }
        for (int i4 = 0; i4 <= i2; i4++) {
            boolean zOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
            if (!zOnExtraCallback4) {
                zOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
            }
            if (zOnExtraCallback4) {
                transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            } else {
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    iOnExtraCallbackWithResult = 0;
                }
                for (i3 = 0; i3 < r8 + r1; i3++) {
                    for (int i5 = 0; i5 <= iOnExtraCallbackWithResult; i5++) {
                        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                        if (zOnExtraCallback) {
                            transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                            transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                        }
                        transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                    }
                }
            }
            iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            while (i3 < r8 + r1) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static onWarmupCompleted IAuthTabCallback(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0, boolean z, int i2, @Nullable onWarmupCompleted onwarmupcompleted) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean zOnExtraCallback;
        int iOnExtraCallback;
        int i6;
        int iOnExtraCallback2;
        int[] iArr2 = new int[6];
        if (z) {
            iOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(2);
            zOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
            iOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
            }
        } else if (onwarmupcompleted != null) {
            int i9 = onwarmupcompleted.IAuthTabCallback;
            zOnExtraCallback = onwarmupcompleted.IAuthTabCallbackDefault;
            iOnExtraCallback = onwarmupcompleted.onWarmupCompleted;
            i6 = onwarmupcompleted.onNavigationEvent;
            iArr2 = onwarmupcompleted.onExtraCallback;
            iOnExtraCallback2 = i9;
        } else {
            iArr = iArr2;
            i3 = 0;
            z2 = false;
            i4 = 0;
            i5 = 0;
            int iOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
            int i10 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    i10 += 88;
                }
                if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    i10 += 8;
                }
            }
            transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(i10);
            if (i2 > 0) {
                transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted((8 - i2) << 1);
            }
            return new onWarmupCompleted(i3, z2, i4, i5, iArr, iOnExtraCallback3);
        }
        i3 = iOnExtraCallback2;
        iArr = iArr2;
        z2 = zOnExtraCallback;
        i4 = iOnExtraCallback;
        i5 = i6;
        int iOnExtraCallback32 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8);
        int i102 = 0;
        while (i11 < i2) {
        }
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(i102);
        if (i2 > 0) {
        }
        return new onWarmupCompleted(i3, z2, i4, i5, iArr, iOnExtraCallback32);
    }

    private static asBinder IAuthTabCallback(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0, int i2) {
        int iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        int i3 = iOnExtraCallbackWithResult + 1;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(i3);
        int[] iArr = new int[i2];
        for (int i4 = 0; i4 < i3; i4++) {
            builderBuilderWithExpectedSize.add(onNavigationEvent(transformedTextFieldStateExternalSyntheticLambda0));
        }
        int i5 = 1;
        if (i3 <= 1 || !transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            while (i5 < i2) {
                iArr[i5] = Math.min(i5, iOnExtraCallbackWithResult);
                i5++;
            }
        } else {
            int iLog2 = DoubleMath.log2(i3, RoundingMode.CEILING);
            while (i5 < i2) {
                iArr[i5] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(iLog2);
                i5++;
            }
        }
        return new asBinder(builderBuilderWithExpectedSize.build(), iArr);
    }

    private static onExtraCallbackWithResult onNavigationEvent(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0) {
        int i2;
        int i3;
        int iOnExtraCallback;
        int iOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(16);
        int iOnExtraCallback3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(16);
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            int iOnExtraCallback4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(2);
            if (iOnExtraCallback4 == 3) {
                transformedTextFieldStateExternalSyntheticLambda0.asInterface();
            }
            int iOnExtraCallback5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(4);
            iOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(4);
            i3 = iOnExtraCallback5;
            i2 = iOnExtraCallback4;
        } else {
            i2 = 0;
            i3 = 0;
            iOnExtraCallback = 0;
        }
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            int iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            iOnExtraCallback2 = IAuthTabCallback(iOnExtraCallback2, i2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
            iOnExtraCallback3 = onNavigationEvent(iOnExtraCallback3, i2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4);
        }
        return new onExtraCallbackWithResult(i2, i3, iOnExtraCallback, iOnExtraCallback2, iOnExtraCallback3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onExtraCallback(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0, int i2, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i3 = 1; i3 < i2; i3++) {
            boolean zOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
            for (int i4 = 0; i4 < iArr[i3]; i4++) {
                if (i4 <= 0 || !zOnExtraCallback) {
                    if (i4 == 0) {
                        for (int i5 = 0; i5 < iArr2[i3]; i5++) {
                            if (zArr[i3][i5]) {
                                transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                            }
                        }
                        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                        transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                    }
                } else if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                }
            }
        }
    }

    private static void onNavigationEvent(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0, int i2, boolean[][] zArr) {
        int iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult() + 2;
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(iOnExtraCallbackWithResult);
        } else {
            for (int i3 = 1; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (zArr[i3][i4]) {
                        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(iOnExtraCallbackWithResult);
                    }
                }
            }
        }
        int iOnExtraCallbackWithResult2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        for (int i5 = 1; i5 <= iOnExtraCallbackWithResult2; i5++) {
            transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(8);
        }
    }

    private static IAuthTabCallbackStub onNavigationEvent(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0, int i2, int i3, int[] iArr) {
        if (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() || transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
            transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        }
        boolean zOnExtraCallback = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
        boolean zOnExtraCallback2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
        if (zOnExtraCallback || zOnExtraCallback2) {
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 < iArr[i4]; i5++) {
                    boolean zOnExtraCallback3 = zOnExtraCallback ? transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() : false;
                    boolean zOnExtraCallback4 = zOnExtraCallback2 ? transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() : false;
                    if (zOnExtraCallback3) {
                        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(32);
                    }
                    if (zOnExtraCallback4) {
                        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(18);
                    }
                }
            }
        }
        boolean zOnExtraCallback5 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback = zOnExtraCallback5 ? transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(4) + 1 : i2;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(iOnExtraCallback);
        int[] iArr2 = new int[i2];
        for (int i6 = 0; i6 < iOnExtraCallback; i6++) {
            builderBuilderWithExpectedSize.add(onWarmupCompleted(transformedTextFieldStateExternalSyntheticLambda0));
        }
        if (zOnExtraCallback5 && iOnExtraCallback > 1) {
            for (int i7 = 0; i7 < i2; i7++) {
                iArr2[i7] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(4);
            }
        }
        return new IAuthTabCallbackStub(builderBuilderWithExpectedSize.build(), iArr2);
    }

    private static onTransact onWarmupCompleted(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0) {
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(3);
        int i2 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() ? 1 : 2;
        int iOnNavigationEvent = TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent(transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8));
        int iIAuthTabCallback = TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback(transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback(8));
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(8);
        return new onTransact(iOnNavigationEvent, i2, iIAuthTabCallback);
    }

    private static void onExtraCallback(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0, int i2) {
        int iOnNavigationEvent = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i2; i4++) {
            if (iOnNavigationEvent != 0) {
                iOnNavigationEvent = ((transformedTextFieldStateExternalSyntheticLambda0.onNavigationEvent() + i3) + 256) % 256;
            }
            if (iOnNavigationEvent != 0) {
                i3 = iOnNavigationEvent;
            }
        }
    }

    private static void IAuthTabCallbackStub(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0) {
        int iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(8);
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult + 1; i2++) {
            transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
            transformedTextFieldStateExternalSyntheticLambda0.asInterface();
        }
        transformedTextFieldStateExternalSyntheticLambda0.onWarmupCompleted(20);
    }

    private static void onExtraCallbackWithResult(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (!transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                    transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                } else {
                    int iMin = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        transformedTextFieldStateExternalSyntheticLambda0.onNavigationEvent();
                    }
                    for (int i5 = 0; i5 < iMin; i5++) {
                        transformedTextFieldStateExternalSyntheticLambda0.onNavigationEvent();
                    }
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    private static void asBinder(TransformedTextFieldStateExternalSyntheticLambda0 transformedTextFieldStateExternalSyntheticLambda0) {
        int iOnExtraCallbackWithResult = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < iOnExtraCallbackWithResult; i4++) {
            if (i4 != 0 && transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                int i5 = i2 + i3;
                int iOnExtraCallbackWithResult2 = (1 - ((transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback() ? 1 : 0) << 1)) * (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult() + 1);
                int i6 = i5 + 1;
                boolean[] zArr = new boolean[i6];
                for (int i7 = 0; i7 <= i5; i7++) {
                    if (!transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback()) {
                        zArr[i7] = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallback();
                    } else {
                        zArr[i7] = true;
                    }
                }
                int[] iArr2 = new int[i6];
                int[] iArr3 = new int[i6];
                int i8 = 0;
                for (int i9 = i3 - 1; i9 >= 0; i9--) {
                    int i10 = iArrCopyOf[i9] + iOnExtraCallbackWithResult2;
                    if (i10 < 0 && zArr[i2 + i9]) {
                        iArr2[i8] = i10;
                        i8++;
                    }
                }
                if (iOnExtraCallbackWithResult2 < 0 && zArr[i5]) {
                    iArr2[i8] = iOnExtraCallbackWithResult2;
                    i8++;
                }
                for (int i11 = 0; i11 < i2; i11++) {
                    int i12 = iArr[i11] + iOnExtraCallbackWithResult2;
                    if (i12 < 0 && zArr[i11]) {
                        iArr2[i8] = i12;
                        i8++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, i8);
                int i13 = 0;
                for (int i14 = i2 - 1; i14 >= 0; i14--) {
                    int i15 = iArr[i14] + iOnExtraCallbackWithResult2;
                    if (i15 > 0 && zArr[i14]) {
                        iArr3[i13] = i15;
                        i13++;
                    }
                }
                if (iOnExtraCallbackWithResult2 > 0 && zArr[i5]) {
                    iArr3[i13] = iOnExtraCallbackWithResult2;
                    i13++;
                }
                for (int i16 = 0; i16 < i3; i16++) {
                    int i17 = iArrCopyOf[i16] + iOnExtraCallbackWithResult2;
                    if (i17 > 0 && zArr[i2 + i16]) {
                        iArr3[i13] = i17;
                        i13++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i13);
                iArr = iArrCopyOf2;
                i2 = i8;
                i3 = i13;
            } else {
                int iOnExtraCallbackWithResult3 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult();
                int[] iArr4 = new int[iOnExtraCallbackWithResult3];
                int i18 = 0;
                while (i18 < iOnExtraCallbackWithResult3) {
                    iArr4[i18] = (i18 > 0 ? iArr4[i18 - 1] : 0) - (transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult() + 1);
                    transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                    i18++;
                }
                int[] iArr5 = new int[iOnExtraCallbackWithResult4];
                int i19 = 0;
                while (i19 < iOnExtraCallbackWithResult4) {
                    iArr5[i19] = (i19 > 0 ? iArr5[i19 - 1] : 0) + transformedTextFieldStateExternalSyntheticLambda0.onExtraCallbackWithResult() + 1;
                    transformedTextFieldStateExternalSyntheticLambda0.asInterface();
                    i19++;
                }
                i2 = iOnExtraCallbackWithResult3;
                iArr = iArr4;
                i3 = iOnExtraCallbackWithResult4;
                iArrCopyOf = iArr5;
            }
        }
    }
}
