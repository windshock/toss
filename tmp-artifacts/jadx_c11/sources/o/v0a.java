package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v0a {
    private static int ICustomTabsCallback = 0;
    private static int writeTypedObject = 1;
    private final onItemClicked<setByteOrder> IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final long IAuthTabCallback_Parcel;
    private final long access000;
    private final long access100;
    private final long asBinder;
    private final long asInterface;
    private final long extraCallback;
    private final long extraCallbackWithResult;
    private final long getInterfaceDescriptor;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ v0a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~(i4 | i3 | i6);
        int i8 = ~i4;
        int i9 = ~i3;
        int i10 = ~(i8 | i9);
        int i11 = ~i6;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i4 + i3 + i5 + (105149790 * i2) + ((-719480883) * i);
        int i15 = i14 * i14;
        int i16 = (i4 * (-424837635)) + 281018368 + ((-424837635) * i3) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i5) + ((-654311424) * i2) + (1702887424 * i) + ((-155189248) * i15);
        int i17 = (i4 * 910058005) + 1460508013 + (i3 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i5 * 910058489) + (i2 * (-759332242)) + (i * (-1121784475)) + (i15 * 1086324736);
        return i16 + ((i17 * i17) * (-1925185536)) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private v0a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.IAuthTabCallbackStub = j;
        this.access100 = j2;
        this.onTransact = j3;
        this.access000 = j4;
        this.asInterface = j5;
        this.extraCallbackWithResult = j6;
        this.IAuthTabCallbackDefault = j7;
        this.IAuthTabCallbackStubProxy = j8;
        this.IAuthTabCallback_Parcel = j9;
        this.extraCallback = j10;
        this.asBinder = j11;
        this.getInterfaceDescriptor = j12;
        this.onExtraCallback = j13;
        this.onNavigationEvent = j14;
        this.onExtraCallbackWithResult = j15;
        this.onWarmupCompleted = j16;
        this.IAuthTabCallback = onQueryRefine.onExtraCallbackWithResult(50, 0, getCallToActionButton.onExtraCallback.onTransact(), 2, (Object) null);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 119;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.onWarmupCompleted;
        int i4 = i2 + 85;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final v0a IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        int i = 2 % 2;
        long j25 = j == 16 ? this.IAuthTabCallbackStub : j;
        long j26 = j2 == 16 ? this.access100 : j2;
        if (j3 == 16) {
            int i2 = ICustomTabsCallback + 37;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            j17 = this.onTransact;
        } else {
            j17 = j3;
        }
        if (j4 == 16) {
            int i4 = ICustomTabsCallback + 37;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                j24 = this.access000;
                int i5 = 70 / 0;
            } else {
                j24 = this.access000;
            }
            j18 = j24;
        } else {
            j18 = j4;
        }
        long j27 = j5 == 16 ? this.asInterface : j5;
        long j28 = j6 == 16 ? this.extraCallbackWithResult : j6;
        if (j7 == 16) {
            int i6 = writeTypedObject + 53;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            j19 = this.IAuthTabCallbackDefault;
        } else {
            j19 = j7;
        }
        if (j8 == 16) {
            int i8 = ICustomTabsCallback + 95;
            writeTypedObject = i8 % 128;
            int i9 = i8 % 2;
            j20 = this.IAuthTabCallbackStubProxy;
        } else {
            j20 = j8;
        }
        long j29 = j9 == 16 ? this.IAuthTabCallback_Parcel : j9;
        long j30 = j10 == 16 ? this.extraCallback : j10;
        if (j11 == 16) {
            int i10 = writeTypedObject + 91;
            ICustomTabsCallback = i10 % 128;
            if (i10 % 2 != 0) {
                j23 = this.asBinder;
                int i11 = 74 / 0;
            } else {
                j23 = this.asBinder;
            }
            j21 = j23;
        } else {
            j21 = j11;
        }
        long j31 = j12 == 16 ? this.getInterfaceDescriptor : j12;
        long j32 = j13 == 16 ? this.onExtraCallback : j13;
        if (j14 == 16) {
            int i12 = ICustomTabsCallback + 87;
            writeTypedObject = i12 % 128;
            int i13 = i12 % 2;
            j22 = this.onNavigationEvent;
        } else {
            j22 = j14;
        }
        return new v0a(j25, j26, j17, j18, j27, j28, j19, j20, j29, j30, j21, j31, j32, j22, j15 == 16 ? this.onExtraCallbackWithResult : j15, j16 == 16 ? this.onWarmupCompleted : j16, null);
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onNavigationEvent(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long j;
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = writeTypedObject + 79;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1217627422, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1ItemColors.backgroundColor (TdsChipV1ItemColors.kt:74)");
        }
        if (z) {
            int i5 = ICustomTabsCallback + 27;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            j = this.IAuthTabCallbackStub;
        } else {
            j = this.access100;
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(j, this.IAuthTabCallback, (String) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = ICustomTabsCallback + 53;
        writeTypedObject = i7 % 128;
        if (i7 % 2 != 0) {
            return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onWarmupCompleted(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long j;
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-730257756, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1ItemColors.borderColor (TdsChipV1ItemColors.kt:82)");
        }
        if (z) {
            int i3 = ICustomTabsCallback;
            int i4 = i3 + 67;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            j = this.onTransact;
            int i5 = i3 + 19;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 3;
            }
        } else {
            j = this.access000;
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(j, this.IAuthTabCallback, (String) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = writeTypedObject + 115;
            ICustomTabsCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i9 = ICustomTabsCallback + 37;
        writeTypedObject = i9 % 128;
        int i10 = i9 % 2;
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> IAuthTabCallbackStub(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long j;
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1485153981, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1ItemColors.textColor (TdsChipV1ItemColors.kt:90)");
        }
        if (z) {
            int i3 = writeTypedObject + 51;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            j = this.asInterface;
        } else {
            j = this.extraCallbackWithResult;
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(j, this.IAuthTabCallback, (String) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = ICustomTabsCallback + 9;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                int i7 = 31 / 0;
            }
        }
        int i8 = ICustomTabsCallback + 27;
        writeTypedObject = i8 % 128;
        int i9 = i8 % 2;
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        long j;
        v0a v0aVar = (v0a) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1659328985, iIntValue, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1ItemColors.numberColor (TdsChipV1ItemColors.kt:98)");
        }
        if (zBooleanValue) {
            int i2 = writeTypedObject + 99;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            j = v0aVar.IAuthTabCallbackDefault;
        } else {
            j = v0aVar.IAuthTabCallbackStubProxy;
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(j, v0aVar.IAuthTabCallback, (String) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i4 = ICustomTabsCallback + 115;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        v0a v0aVar = (v0a) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(394721077, iIntValue, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1ItemColors.tintColor (TdsChipV1ItemColors.kt:106)");
                int i3 = ICustomTabsCallback + 39;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(zBooleanValue ? v0aVar.IAuthTabCallback_Parcel : v0aVar.extraCallback, v0aVar.IAuthTabCallback, (String) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = writeTypedObject + 91;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i6 != 0) {
                    throw null;
                }
            }
            return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
        }
        CameraConfigExternalSyntheticLambda0.asBinder();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        return r4.asBinder;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r2 = r4.getInterfaceDescriptor;
        r1 = r1 + 7;
        o.v0a.ICustomTabsCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if ((!r5) != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 5;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 88 / 0;
        }
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallback(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 99;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = writeTypedObject + 89;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(51157311, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1ItemColors.gradientColorBegin (TdsChipV1ItemColors.kt:118)");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(51157311, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1ItemColors.gradientColorBegin (TdsChipV1ItemColors.kt:118)");
        }
        long jOnExtraCallbackWithResult = this.onExtraCallback;
        if (!z) {
            jOnExtraCallbackWithResult = getMaxAdCount.onExtraCallbackWithResult(jOnExtraCallbackWithResult, 0.0f);
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(jOnExtraCallbackWithResult, this.IAuthTabCallback, (String) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallbackWithResult(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = writeTypedObject + 123;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1378035919, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1ItemColors.gradientColorEnd (TdsChipV1ItemColors.kt:126)");
        }
        long jOnExtraCallbackWithResult = this.onNavigationEvent;
        if (!z) {
            jOnExtraCallbackWithResult = getMaxAdCount.onExtraCallbackWithResult(jOnExtraCallbackWithResult, 0.0f);
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(jOnExtraCallbackWithResult, this.IAuthTabCallback, (String) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = writeTypedObject + 9;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                int i7 = 73 / 0;
            }
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> asInterface(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getStarRatingContentViewGroup getstarratingcontentviewgroupAsBinder;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 117;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1415747240, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1ItemColors.redDotColor (TdsChipV1ItemColors.kt:134)");
        }
        long jOnExtraCallbackWithResult = this.onExtraCallbackWithResult;
        if (!z) {
            jOnExtraCallbackWithResult = getMaxAdCount.onExtraCallbackWithResult(jOnExtraCallbackWithResult, 0.0f);
        }
        long j = jOnExtraCallbackWithResult;
        if (z) {
            int i5 = writeTypedObject + 87;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
                throw null;
            }
            getstarratingcontentviewgroupAsBinder = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
        } else {
            getstarratingcontentviewgroupAsBinder = getIconContentView.onWarmupCompleted.asBinder();
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(j, getSplitTrack.onExtraCallback(getstarratingcontentviewgroupAsBinder, 0, 2, (Object) null), (String) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = writeTypedObject + 53;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 != 0) {
                int i8 = 45 / 0;
            }
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = writeTypedObject + 53;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!Intrinsics.areEqual(v0a.class, obj != null ? obj.getClass() : null)) {
            int i4 = writeTypedObject + 77;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        v0a v0aVar = (v0a) obj;
        if (!setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallbackStub, v0aVar.IAuthTabCallbackStub)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.access100, v0aVar.access100)) {
            int i6 = ICustomTabsCallback + 107;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onTransact, v0aVar.onTransact) || !setByteOrder.onExtraCallbackWithResult(this.access000, v0aVar.access000)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.asInterface, v0aVar.asInterface)) {
            int i8 = writeTypedObject + 13;
            ICustomTabsCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.extraCallbackWithResult, v0aVar.extraCallbackWithResult)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, v0aVar.IAuthTabCallbackDefault)) {
            int i10 = ICustomTabsCallback + 49;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy, v0aVar.IAuthTabCallbackStubProxy)) {
            int i12 = ICustomTabsCallback + 99;
            writeTypedObject = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel, v0aVar.IAuthTabCallback_Parcel) || !setByteOrder.onExtraCallbackWithResult(this.extraCallback, v0aVar.extraCallback)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.asBinder, v0aVar.asBinder)) {
            int i14 = ICustomTabsCallback + 35;
            writeTypedObject = i14 % 128;
            return i14 % 2 == 0;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.getInterfaceDescriptor, v0aVar.getInterfaceDescriptor) || !setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, v0aVar.onExtraCallback)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onNavigationEvent, v0aVar.onNavigationEvent)) {
            int i15 = writeTypedObject + 33;
            ICustomTabsCallback = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (setByteOrder.onExtraCallbackWithResult(this.onExtraCallbackWithResult, v0aVar.onExtraCallbackWithResult)) {
            return setByteOrder.onExtraCallbackWithResult(this.onWarmupCompleted, v0aVar.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, v0aVar.IAuthTabCallback);
        }
        int i17 = writeTypedObject + 9;
        ICustomTabsCallback = i17 % 128;
        return i17 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnTransact = setByteOrder.onTransact(this.IAuthTabCallbackStub);
        int iOnTransact2 = setByteOrder.onTransact(this.access100);
        int iOnTransact3 = setByteOrder.onTransact(this.onTransact);
        int iOnTransact4 = setByteOrder.onTransact(this.access000);
        int iOnTransact5 = setByteOrder.onTransact(this.asInterface);
        int iOnTransact6 = setByteOrder.onTransact(this.extraCallbackWithResult);
        int iOnTransact7 = setByteOrder.onTransact(this.IAuthTabCallbackDefault);
        int iOnTransact8 = setByteOrder.onTransact(this.IAuthTabCallbackStubProxy);
        int iOnTransact9 = setByteOrder.onTransact(this.IAuthTabCallback_Parcel);
        int iOnTransact10 = setByteOrder.onTransact(this.extraCallback);
        int iOnTransact11 = setByteOrder.onTransact(this.asBinder);
        int iOnTransact12 = setByteOrder.onTransact(this.getInterfaceDescriptor);
        int iOnTransact13 = setByteOrder.onTransact(this.onExtraCallback);
        int iOnTransact14 = setByteOrder.onTransact(this.onNavigationEvent);
        int iOnTransact15 = (((((((((((((((((((((((((((((((iOnTransact * 31) + iOnTransact2) * 31) + iOnTransact3) * 31) + iOnTransact4) * 31) + iOnTransact5) * 31) + iOnTransact6) * 31) + iOnTransact7) * 31) + iOnTransact8) * 31) + iOnTransact9) * 31) + iOnTransact10) * 31) + iOnTransact11) * 31) + iOnTransact12) * 31) + iOnTransact13) * 31) + iOnTransact14) * 31) + setByteOrder.onTransact(this.onExtraCallbackWithResult)) * 31) + setByteOrder.onTransact(this.onWarmupCompleted)) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = writeTypedObject + 9;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnTransact15;
        }
        throw null;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> IAuthTabCallback(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (CameraPresenceProviderExternalSyntheticLambda6) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1955358163, objArr, 1955358164, iIAuthTabCallback2, iIAuthTabCallback);
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> asBinder(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (CameraPresenceProviderExternalSyntheticLambda6) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 688507408, objArr, -688507408, iIAuthTabCallback2, iIAuthTabCallback);
    }
}
