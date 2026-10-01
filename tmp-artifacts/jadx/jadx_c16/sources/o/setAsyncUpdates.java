package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setCacheComposition;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class setAsyncUpdates implements setCacheComposition.onTransact {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel;
    private final GraphicDeviceInfo IAuthTabCallback;
    private final getHumanReadableName IAuthTabCallbackDefault;
    private final getHumanReadableName IAuthTabCallbackStub;
    private final GraphicDeviceInfo asBinder;
    private final GraphicDeviceInfo asInterface;
    private final getHumanReadableName onExtraCallback;
    private final GraphicDeviceInfo onExtraCallbackWithResult;
    private final getHumanReadableName onNavigationEvent;
    private final getHumanReadableName onTransact;
    private final GraphicDeviceInfo onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAsyncUpdates)) {
            return false;
        }
        setAsyncUpdates setasyncupdates = (setAsyncUpdates) obj;
        if (!Intrinsics.areEqual(this.asInterface, setasyncupdates.asInterface)) {
            int i2 = IAuthTabCallbackStubProxy + 87;
            IAuthTabCallback_Parcel = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, setasyncupdates.IAuthTabCallbackDefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, setasyncupdates.onExtraCallbackWithResult)) {
            int i3 = IAuthTabCallback_Parcel + 27;
            IAuthTabCallbackStubProxy = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, setasyncupdates.onExtraCallback)) {
            int i4 = IAuthTabCallbackStubProxy + 111;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, setasyncupdates.IAuthTabCallback)) {
            int i6 = IAuthTabCallbackStubProxy + 53;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, setasyncupdates.onTransact) || !Intrinsics.areEqual(this.asBinder, setasyncupdates.asBinder) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, setasyncupdates.IAuthTabCallbackStub) || (!Intrinsics.areEqual(this.onWarmupCompleted, setasyncupdates.onWarmupCompleted))) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, setasyncupdates.onNavigationEvent)) {
            return true;
        }
        int i8 = IAuthTabCallback_Parcel + 109;
        IAuthTabCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = this.asInterface;
        int iHashCode7 = 0;
        if (graphicDeviceInfo == null) {
            int i2 = IAuthTabCallback_Parcel + 57;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = graphicDeviceInfo.hashCode();
        }
        getHumanReadableName gethumanreadablename = this.IAuthTabCallbackDefault;
        int iHashCode8 = gethumanreadablename == null ? 0 : gethumanreadablename.hashCode();
        GraphicDeviceInfo graphicDeviceInfo2 = this.onExtraCallbackWithResult;
        if (graphicDeviceInfo2 == null) {
            int i4 = IAuthTabCallback_Parcel + 55;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = graphicDeviceInfo2.hashCode();
        }
        getHumanReadableName gethumanreadablename2 = this.onExtraCallback;
        int iHashCode9 = gethumanreadablename2 == null ? 0 : gethumanreadablename2.hashCode();
        GraphicDeviceInfo graphicDeviceInfo3 = this.IAuthTabCallback;
        if (graphicDeviceInfo3 == null) {
            int i6 = IAuthTabCallbackStubProxy + 51;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = graphicDeviceInfo3.hashCode();
        }
        getHumanReadableName gethumanreadablename3 = this.onTransact;
        if (gethumanreadablename3 == null) {
            int i8 = IAuthTabCallback_Parcel + 121;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = gethumanreadablename3.hashCode();
        }
        GraphicDeviceInfo graphicDeviceInfo4 = this.asBinder;
        int iHashCode10 = graphicDeviceInfo4 == null ? 0 : graphicDeviceInfo4.hashCode();
        getHumanReadableName gethumanreadablename4 = this.IAuthTabCallbackStub;
        if (gethumanreadablename4 == null) {
            int i10 = IAuthTabCallback_Parcel + 117;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = gethumanreadablename4.hashCode();
            int i12 = IAuthTabCallbackStubProxy + 117;
            IAuthTabCallback_Parcel = i12 % 128;
            int i13 = i12 % 2;
        }
        GraphicDeviceInfo graphicDeviceInfo5 = this.onWarmupCompleted;
        if (graphicDeviceInfo5 == null) {
            int i14 = IAuthTabCallback_Parcel + 77;
            IAuthTabCallbackStubProxy = i14 % 128;
            int i15 = i14 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = graphicDeviceInfo5.hashCode();
        }
        getHumanReadableName gethumanreadablename5 = this.onNavigationEvent;
        if (gethumanreadablename5 != null) {
            int i16 = IAuthTabCallback_Parcel + 83;
            IAuthTabCallbackStubProxy = i16 % 128;
            if (i16 % 2 == 0) {
                gethumanreadablename5.hashCode();
                throw null;
            }
            iHashCode7 = gethumanreadablename5.hashCode();
        }
        return (((((((((((((((((iHashCode * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode10) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DefaultTextStyles(textFontWeight=" + this.asInterface + ", textStyle=" + this.IAuthTabCallbackDefault + ", labelFontWeight=" + this.onExtraCallbackWithResult + ", labelStyle=" + this.onExtraCallback + ", prefixFontWeight=" + this.IAuthTabCallback + ", prefixStyle=" + this.onTransact + ", suffixFontWeight=" + this.asBinder + ", suffixStyle=" + this.IAuthTabCallbackStub + ", messageFontWeight=" + this.onWarmupCompleted + ", messageStyle=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public setAsyncUpdates(@Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable getHumanReadableName gethumanreadablename, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable getHumanReadableName gethumanreadablename2, @Nullable GraphicDeviceInfo graphicDeviceInfo3, @Nullable getHumanReadableName gethumanreadablename3, @Nullable GraphicDeviceInfo graphicDeviceInfo4, @Nullable getHumanReadableName gethumanreadablename4, @Nullable GraphicDeviceInfo graphicDeviceInfo5, @Nullable getHumanReadableName gethumanreadablename5) {
        this.asInterface = graphicDeviceInfo;
        this.IAuthTabCallbackDefault = gethumanreadablename;
        this.onExtraCallbackWithResult = graphicDeviceInfo2;
        this.onExtraCallback = gethumanreadablename2;
        this.IAuthTabCallback = graphicDeviceInfo3;
        this.onTransact = gethumanreadablename3;
        this.asBinder = graphicDeviceInfo4;
        this.IAuthTabCallbackStub = gethumanreadablename4;
        this.onWarmupCompleted = graphicDeviceInfo5;
        this.onNavigationEvent = gethumanreadablename5;
    }

    public GraphicDeviceInfo onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 93;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        GraphicDeviceInfo graphicDeviceInfo = this.asInterface;
        int i4 = i2 + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return graphicDeviceInfo;
    }

    public GraphicDeviceInfo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 81;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        GraphicDeviceInfo graphicDeviceInfo = this.onExtraCallbackWithResult;
        int i4 = i2 + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return graphicDeviceInfo;
    }

    public GraphicDeviceInfo IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        GraphicDeviceInfo graphicDeviceInfo = this.IAuthTabCallback;
        int i4 = i3 + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return graphicDeviceInfo;
    }

    public GraphicDeviceInfo onExtraCallbackWithResult() {
        GraphicDeviceInfo graphicDeviceInfo;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            graphicDeviceInfo = this.asBinder;
            int i4 = 14 / 0;
        } else {
            graphicDeviceInfo = this.asBinder;
        }
        int i5 = i3 + 7;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return graphicDeviceInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GraphicDeviceInfo onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = this.onWarmupCompleted;
        int i5 = i3 + 19;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return graphicDeviceInfo;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(130329412);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = IAuthTabCallbackStubProxy + 5;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(130329412, i, -1, "im.toss.compose.v3.textfield.DefaultTextStyles.textStyle (TextFields.kt:1804)");
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = onWarmupCompleted(onExtraCallback(), this.IAuthTabCallbackDefault, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(638537212);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback_Parcel + 87;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(638537212, i, -1, "im.toss.compose.v3.textfield.DefaultTextStyles.labelTextStyle (TextFields.kt:1814)");
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = onWarmupCompleted(onNavigationEvent(), this.onExtraCallback, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i7 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            return cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted;
        }
        throw null;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1074835338);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = IAuthTabCallbackStubProxy + 5;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1074835338, i, -1, "im.toss.compose.v3.textfield.DefaultTextStyles.prefixTextStyle (TextFields.kt:1824)");
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1074835338, i, -1, "im.toss.compose.v3.textfield.DefaultTextStyles.prefixTextStyle (TextFields.kt:1824)");
                throw null;
            }
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = onWarmupCompleted(IAuthTabCallback(), this.onTransact, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i4 = IAuthTabCallbackStubProxy + 19;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2061199179);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2061199179, i, -1, "im.toss.compose.v3.textfield.DefaultTextStyles.suffixTextStyle (TextFields.kt:1834)");
            int i3 = IAuthTabCallbackStubProxy + 5;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = onWarmupCompleted(onExtraCallbackWithResult(), this.IAuthTabCallbackStub, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStubProxy + 103;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = IAuthTabCallback_Parcel + 103;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(787884047);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback_Parcel + 83;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(787884047, i, -1, "im.toss.compose.v3.textfield.DefaultTextStyles.messageTextStyle (TextFields.kt:1844)");
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(787884047, i, -1, "im.toss.compose.v3.textfield.DefaultTextStyles.messageTextStyle (TextFields.kt:1844)");
                int i6 = 75 / 0;
            }
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = onWarmupCompleted(onWarmupCompleted(), this.onNavigationEvent, null, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 4);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = IAuthTabCallbackStubProxy + 107;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted;
    }

    private final CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onWarmupCompleted(GraphicDeviceInfo graphicDeviceInfo, getHumanReadableName gethumanreadablename, getHumanReadableName gethumanreadablename2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        getHumanReadableName gethumanreadablename3;
        getHumanReadableName gethumanreadablename4;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 19;
        int i5 = i4 % 128;
        IAuthTabCallbackStubProxy = i5;
        if (i4 % 2 != 0 ? (i2 & 4) == 0 : (i2 & 5) == 0) {
            gethumanreadablename3 = gethumanreadablename2;
        } else {
            int i6 = i5 + 15;
            IAuthTabCallback_Parcel = i6 % 128;
            gethumanreadablename3 = null;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallback_Parcel + 7;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-569405912, i, -1, "im.toss.compose.v3.textfield.DefaultTextStyles.rememberTextStyle (TextFields.kt:1854)");
        }
        if (gethumanreadablename == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1738228625);
            gethumanreadablename4 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1738229493);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            gethumanreadablename4 = gethumanreadablename;
        }
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(gethumanreadablename4.onWarmupCompleted(new getHumanReadableName(0L, 0L, graphicDeviceInfo, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777211, (DefaultConstructorMarker) null)).onWarmupCompleted(gethumanreadablename3), cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = IAuthTabCallback_Parcel + 125;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
    }
}
