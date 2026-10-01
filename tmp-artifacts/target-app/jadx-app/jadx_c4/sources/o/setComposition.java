package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setCacheComposition;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setComposition implements setCacheComposition.onTransact {
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    private final accessgetTlsVersionsAsStringp IAuthTabCallback;
    private final accessgetTlsVersionsAsStringp IAuthTabCallbackDefault;
    private final accessgetTlsVersionsAsStringp IAuthTabCallbackStub;
    private final accessgetTlsVersionsAsStringp asBinder;
    private final GraphicDeviceInfo asInterface;
    private final GraphicDeviceInfo onExtraCallback;
    private final GraphicDeviceInfo onExtraCallbackWithResult;
    private final GraphicDeviceInfo onNavigationEvent;
    private final GraphicDeviceInfo onTransact;
    private final accessgetTlsVersionsAsStringp onWarmupCompleted;

    public setComposition() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ setComposition IAuthTabCallback(setComposition setcomposition, GraphicDeviceInfo graphicDeviceInfo, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, GraphicDeviceInfo graphicDeviceInfo2, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, GraphicDeviceInfo graphicDeviceInfo3, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3, GraphicDeviceInfo graphicDeviceInfo4, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp4, GraphicDeviceInfo graphicDeviceInfo5, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp5, int i, Object obj) {
        GraphicDeviceInfo graphicDeviceInfo6;
        GraphicDeviceInfo graphicDeviceInfo7;
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp6;
        int i2 = 2 % 2;
        GraphicDeviceInfo graphicDeviceInfo8 = (i & 1) != 0 ? setcomposition.onTransact : graphicDeviceInfo;
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp7 = (i & 2) != 0 ? setcomposition.asBinder : accessgettlsversionsasstringp;
        if ((i & 4) != 0) {
            int i3 = access100 + 1;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            graphicDeviceInfo6 = setcomposition.onNavigationEvent;
        } else {
            graphicDeviceInfo6 = graphicDeviceInfo2;
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp8 = (i & 8) != 0 ? setcomposition.IAuthTabCallback : accessgettlsversionsasstringp2;
        if ((i & 16) != 0) {
            int i5 = access100 + 117;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            graphicDeviceInfo7 = setcomposition.onExtraCallbackWithResult;
        } else {
            graphicDeviceInfo7 = graphicDeviceInfo3;
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp9 = (i & 32) != 0 ? setcomposition.IAuthTabCallbackStub : accessgettlsversionsasstringp3;
        GraphicDeviceInfo graphicDeviceInfo9 = (i & 64) != 0 ? setcomposition.asInterface : graphicDeviceInfo4;
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp10 = (i & 128) != 0 ? setcomposition.IAuthTabCallbackDefault : accessgettlsversionsasstringp4;
        GraphicDeviceInfo graphicDeviceInfo10 = (i & 256) != 0 ? setcomposition.onExtraCallback : graphicDeviceInfo5;
        if ((i & 512) != 0) {
            int i7 = getInterfaceDescriptor + 47;
            access100 = i7 % 128;
            if (i7 % 2 == 0) {
                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp11 = setcomposition.onWarmupCompleted;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            accessgettlsversionsasstringp6 = setcomposition.onWarmupCompleted;
        } else {
            accessgettlsversionsasstringp6 = accessgettlsversionsasstringp5;
        }
        return setcomposition.onExtraCallbackWithResult(graphicDeviceInfo8, accessgettlsversionsasstringp7, graphicDeviceInfo6, accessgettlsversionsasstringp8, graphicDeviceInfo7, accessgettlsversionsasstringp9, graphicDeviceInfo9, accessgettlsversionsasstringp10, graphicDeviceInfo10, accessgettlsversionsasstringp6);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setComposition)) {
            return false;
        }
        setComposition setcomposition = (setComposition) obj;
        if (!Intrinsics.areEqual(this.onTransact, setcomposition.onTransact) || this.asBinder != setcomposition.asBinder) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, setcomposition.onNavigationEvent)) {
            int i2 = access100 + 3;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.IAuthTabCallback != setcomposition.IAuthTabCallback) {
            int i4 = access100 + 65;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, setcomposition.onExtraCallbackWithResult) || this.IAuthTabCallbackStub != setcomposition.IAuthTabCallbackStub) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, setcomposition.asInterface)) {
            int i6 = getInterfaceDescriptor + 79;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.IAuthTabCallbackDefault != setcomposition.IAuthTabCallbackDefault) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, setcomposition.onExtraCallback)) {
            return this.onWarmupCompleted == setcomposition.onWarmupCompleted;
        }
        int i8 = access100 + 107;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = access100 + 77;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = this.onTransact;
        if (graphicDeviceInfo == null) {
            int i5 = i3 + 31;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = graphicDeviceInfo.hashCode();
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = this.asBinder;
        if (accessgettlsversionsasstringp == null) {
            int i7 = getInterfaceDescriptor + 55;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = accessgettlsversionsasstringp.hashCode();
        }
        GraphicDeviceInfo graphicDeviceInfo2 = this.onNavigationEvent;
        int iHashCode5 = graphicDeviceInfo2 == null ? 0 : graphicDeviceInfo2.hashCode();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = this.IAuthTabCallback;
        int iHashCode6 = accessgettlsversionsasstringp2 == null ? 0 : accessgettlsversionsasstringp2.hashCode();
        GraphicDeviceInfo graphicDeviceInfo3 = this.onExtraCallbackWithResult;
        int iHashCode7 = graphicDeviceInfo3 == null ? 0 : graphicDeviceInfo3.hashCode();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3 = this.IAuthTabCallbackStub;
        if (accessgettlsversionsasstringp3 == null) {
            int i9 = access100 + 39;
            getInterfaceDescriptor = i9 % 128;
            iHashCode3 = i9 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = accessgettlsversionsasstringp3.hashCode();
        }
        GraphicDeviceInfo graphicDeviceInfo4 = this.asInterface;
        if (graphicDeviceInfo4 == null) {
            int i10 = access100 + 17;
            getInterfaceDescriptor = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = graphicDeviceInfo4.hashCode();
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp4 = this.IAuthTabCallbackDefault;
        int iHashCode8 = accessgettlsversionsasstringp4 == null ? 0 : accessgettlsversionsasstringp4.hashCode();
        GraphicDeviceInfo graphicDeviceInfo5 = this.onExtraCallback;
        int iHashCode9 = graphicDeviceInfo5 == null ? 0 : graphicDeviceInfo5.hashCode();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp5 = this.onWarmupCompleted;
        int iHashCode10 = (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (accessgettlsversionsasstringp5 != null ? accessgettlsversionsasstringp5.hashCode() : 0);
        int i12 = access100 + 29;
        getInterfaceDescriptor = i12 % 128;
        if (i12 % 2 == 0) {
            return iHashCode10;
        }
        throw null;
    }

    public final setComposition onExtraCallbackWithResult(@Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, @Nullable GraphicDeviceInfo graphicDeviceInfo3, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3, @Nullable GraphicDeviceInfo graphicDeviceInfo4, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp4, @Nullable GraphicDeviceInfo graphicDeviceInfo5, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp5) {
        int i = 2 % 2;
        setComposition setcomposition = new setComposition(graphicDeviceInfo, accessgettlsversionsasstringp, graphicDeviceInfo2, accessgettlsversionsasstringp2, graphicDeviceInfo3, accessgettlsversionsasstringp3, graphicDeviceInfo4, accessgettlsversionsasstringp4, graphicDeviceInfo5, accessgettlsversionsasstringp5);
        int i2 = access100 + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return setcomposition;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TokenTextStyles(textFontWeight=" + this.onTransact + ", textTypography=" + this.asBinder + ", labelFontWeight=" + this.onNavigationEvent + ", labelTypography=" + this.IAuthTabCallback + ", prefixFontWeight=" + this.onExtraCallbackWithResult + ", prefixTypography=" + this.IAuthTabCallbackStub + ", suffixFontWeight=" + this.asInterface + ", suffixTypography=" + this.IAuthTabCallbackDefault + ", messageFontWeight=" + this.onExtraCallback + ", messageTypography=" + this.onWarmupCompleted + ")";
        int i2 = access100 + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public setComposition(@Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, @Nullable GraphicDeviceInfo graphicDeviceInfo3, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3, @Nullable GraphicDeviceInfo graphicDeviceInfo4, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp4, @Nullable GraphicDeviceInfo graphicDeviceInfo5, @Nullable accessgetTlsVersionsAsStringp accessgettlsversionsasstringp5) {
        this.onTransact = graphicDeviceInfo;
        this.asBinder = accessgettlsversionsasstringp;
        this.onNavigationEvent = graphicDeviceInfo2;
        this.IAuthTabCallback = accessgettlsversionsasstringp2;
        this.onExtraCallbackWithResult = graphicDeviceInfo3;
        this.IAuthTabCallbackStub = accessgettlsversionsasstringp3;
        this.asInterface = graphicDeviceInfo4;
        this.IAuthTabCallbackDefault = accessgettlsversionsasstringp4;
        this.onExtraCallback = graphicDeviceInfo5;
        this.onWarmupCompleted = accessgettlsversionsasstringp5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setComposition(GraphicDeviceInfo graphicDeviceInfo, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, GraphicDeviceInfo graphicDeviceInfo2, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, GraphicDeviceInfo graphicDeviceInfo3, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3, GraphicDeviceInfo graphicDeviceInfo4, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp4, GraphicDeviceInfo graphicDeviceInfo5, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        GraphicDeviceInfo graphicDeviceInfoOnTransact;
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp6;
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp7;
        GraphicDeviceInfo graphicDeviceInfoOnTransact2;
        GraphicDeviceInfo graphicDeviceInfoOnTransact3;
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp8;
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp9;
        if ((i & 1) != 0) {
            graphicDeviceInfoOnTransact = isRepeatingEnabled.onExtraCallback.onTransact();
            int i2 = 2 % 2;
        } else {
            graphicDeviceInfoOnTransact = graphicDeviceInfo;
        }
        if ((i & 2) != 0) {
            int i3 = getInterfaceDescriptor + 41;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            accessgettlsversionsasstringp6 = accessgetTlsVersionsAsStringp.Typography3;
        } else {
            accessgettlsversionsasstringp6 = accessgettlsversionsasstringp;
        }
        GraphicDeviceInfo graphicDeviceInfoAsBinder = (i & 4) != 0 ? isRepeatingEnabled.onExtraCallback.asBinder() : graphicDeviceInfo2;
        if ((i & 8) != 0) {
            accessgettlsversionsasstringp7 = accessgetTlsVersionsAsStringp.Typography3;
            int i5 = 2 % 2;
        } else {
            accessgettlsversionsasstringp7 = accessgettlsversionsasstringp2;
        }
        if ((i & 16) != 0) {
            graphicDeviceInfoOnTransact2 = isRepeatingEnabled.onExtraCallback.onTransact();
            int i6 = getInterfaceDescriptor + 31;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        } else {
            graphicDeviceInfoOnTransact2 = graphicDeviceInfo3;
        }
        GraphicDeviceInfo graphicDeviceInfo6 = null;
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp10 = (i & 32) != 0 ? null : accessgettlsversionsasstringp3;
        if ((i & 64) != 0) {
            graphicDeviceInfoOnTransact3 = isRepeatingEnabled.onExtraCallback.onTransact();
            int i8 = getInterfaceDescriptor + 31;
            access100 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
        } else {
            graphicDeviceInfoOnTransact3 = graphicDeviceInfo4;
        }
        if ((i & 128) != 0) {
            int i10 = getInterfaceDescriptor + 19;
            access100 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            accessgettlsversionsasstringp8 = null;
        } else {
            accessgettlsversionsasstringp8 = accessgettlsversionsasstringp4;
        }
        if ((i & 256) != 0) {
            int i11 = access100 + 87;
            getInterfaceDescriptor = i11 % 128;
            if (i11 % 2 != 0) {
                graphicDeviceInfo6.hashCode();
                throw null;
            }
        } else {
            graphicDeviceInfo6 = graphicDeviceInfo5;
        }
        if ((i & 512) != 0) {
            int i12 = access100 + 17;
            getInterfaceDescriptor = i12 % 128;
            int i13 = i12 % 2;
            accessgettlsversionsasstringp9 = accessgetTlsVersionsAsStringp.Typography7;
        } else {
            accessgettlsversionsasstringp9 = accessgettlsversionsasstringp5;
        }
        this(graphicDeviceInfoOnTransact, accessgettlsversionsasstringp6, graphicDeviceInfoAsBinder, accessgettlsversionsasstringp7, graphicDeviceInfoOnTransact2, accessgettlsversionsasstringp10, graphicDeviceInfoOnTransact3, accessgettlsversionsasstringp8, graphicDeviceInfo6, accessgettlsversionsasstringp9);
    }

    @Override // o.setCacheComposition.onTransact
    public GraphicDeviceInfo onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 91;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        GraphicDeviceInfo graphicDeviceInfo = this.onTransact;
        int i5 = i2 + 21;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return graphicDeviceInfo;
    }

    @Override // o.setCacheComposition.onTransact
    public GraphicDeviceInfo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 67;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setCacheComposition.onTransact
    public GraphicDeviceInfo IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = this.onExtraCallbackWithResult;
        int i5 = i3 + 65;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return graphicDeviceInfo;
    }

    @Override // o.setCacheComposition.onTransact
    public GraphicDeviceInfo onExtraCallbackWithResult() {
        GraphicDeviceInfo graphicDeviceInfo;
        int i = 2 % 2;
        int i2 = access100 + 87;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            graphicDeviceInfo = this.asInterface;
            int i4 = 10 / 0;
        } else {
            graphicDeviceInfo = this.asInterface;
        }
        int i5 = i3 + 43;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return graphicDeviceInfo;
    }

    @Override // o.setCacheComposition.onTransact
    public GraphicDeviceInfo onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 81;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        GraphicDeviceInfo graphicDeviceInfo = this.onExtraCallback;
        int i5 = i2 + 79;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return graphicDeviceInfo;
    }

    @Override // o.setCacheComposition.onTransact
    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 1;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1307903364);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = access100 + 1;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1307903364, i, -1, "im.toss.compose.v3.textfield.TokenTextStyles.textStyle (TextFields.kt:1725)");
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = onExtraCallback(onExtraCallback(), this.asBinder, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    @Override // o.setCacheComposition.onTransact
    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 113;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1584469196);
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1584469196);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = access100 + 103;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1584469196, i, -1, "im.toss.compose.v3.textfield.TokenTextStyles.labelTextStyle (TextFields.kt:1735)");
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = onExtraCallback(onNavigationEvent(), this.IAuthTabCallback, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = access100 + 41;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i7 = access100 + 19;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 == 0) {
            return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
        }
        throw null;
    }

    @Override // o.setCacheComposition.onTransact
    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(916538414);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = access100 + 67;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(916538414, i, -1, "im.toss.compose.v3.textfield.TokenTextStyles.prefixTextStyle (TextFields.kt:1745)");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(916538414, i, -1, "im.toss.compose.v3.textfield.TokenTextStyles.prefixTextStyle (TextFields.kt:1745)");
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = onExtraCallback(IAuthTabCallback(), this.IAuthTabCallbackStub, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = getInterfaceDescriptor + 95;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    @Override // o.setCacheComposition.onTransact
    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 91;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(549031981);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(549031981, i, -1, "im.toss.compose.v3.textfield.TokenTextStyles.suffixTextStyle (TextFields.kt:1755)");
            }
            CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = onExtraCallback(onExtraCallbackWithResult(), this.IAuthTabCallbackDefault, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i4 = access100 + 107;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
        }
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(549031981);
        CameraConfigExternalSyntheticLambda0.asBinder();
        throw null;
    }

    @Override // o.setCacheComposition.onTransact
    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1266995705);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = access100 + 83;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1266995705, i, -1, "im.toss.compose.v3.textfield.TokenTextStyles.messageTextStyle (TextFields.kt:1765)");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1266995705, i, -1, "im.toss.compose.v3.textfield.TokenTextStyles.messageTextStyle (TextFields.kt:1765)");
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = onExtraCallback(onWarmupCompleted(), this.onWarmupCompleted, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i4 = getInterfaceDescriptor + 91;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i6 = getInterfaceDescriptor + 123;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 65 / 0;
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    private final CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onExtraCallback(GraphicDeviceInfo graphicDeviceInfo, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, getHumanReadableName gethumanreadablename, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        getHumanReadableName gethumanreadablename2;
        int i3;
        long j;
        GraphicDeviceInfo graphicDeviceInfo2;
        use useVar;
        delete deleteVar;
        getSurfaceSize getsurfacesize;
        String str;
        long j2;
        getHighestSurfacePriority gethighestsurfacepriority;
        getParentMetadataCallback getparentmetadatacallback;
        addCameraErrorListener addcameraerrorlistener;
        long j3;
        int i4 = 2 % 2;
        getHumanReadableName gethumanreadablenameOnExtraCallback = null;
        if ((i2 & 4) != 0) {
            int i5 = access100 + 37;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            gethumanreadablename2 = null;
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1653314863, i, -1, "im.toss.compose.v3.textfield.TokenTextStyles.rememberTextStyle (TextFields.kt:1775)");
        }
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-302311403);
        if (accessgettlsversionsasstringp != null) {
            int i6 = access100 + 107;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                j = 0;
                graphicDeviceInfo2 = null;
                useVar = null;
                deleteVar = null;
                getsurfacesize = null;
                str = null;
                j2 = 1;
                gethighestsurfacepriority = null;
                getparentmetadatacallback = null;
                addcameraerrorlistener = null;
                j3 = 1;
            } else {
                j = 0;
                graphicDeviceInfo2 = null;
                useVar = null;
                deleteVar = null;
                getsurfacesize = null;
                str = null;
                j2 = 0;
                gethighestsurfacepriority = null;
                getparentmetadatacallback = null;
                addcameraerrorlistener = null;
                j3 = 0;
            }
            gethumanreadablenameOnExtraCallback = AppLovinMediationProvider.onExtraCallback(accessgettlsversionsasstringp, j, graphicDeviceInfo2, useVar, deleteVar, getsurfacesize, str, j2, gethighestsurfacepriority, getparentmetadatacallback, addcameraerrorlistener, j3, (bindChildren) null, (ExifSpeedConverter) null, (createCameraCaptureCallback) null, (toChildrenConfigsMap) null, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, (isUseCaseActive) null, (getPreviewFromChildren) null, 1048575, (Object) null);
        }
        if (gethumanreadablenameOnExtraCallback == null) {
            int i7 = access100 + 1;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1158101078);
            gethumanreadablenameOnExtraCallback = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1158102442);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(gethumanreadablenameOnExtraCallback.onWarmupCompleted(new getHumanReadableName(0L, 0L, graphicDeviceInfo, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777211, (DefaultConstructorMarker) null)).onWarmupCompleted(gethumanreadablename2), cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            i3 = 2;
        } else {
            int i9 = getInterfaceDescriptor + 87;
            access100 = i9 % 128;
            i3 = 2;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i11 = getInterfaceDescriptor + 39;
            access100 = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = access100 + 25;
        getInterfaceDescriptor = i13 % 128;
        int i14 = i13 % i3;
        return cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
    }
}
