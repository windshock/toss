package o;

import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class containsAtLeastOneSubstring implements appendQueryParameters {
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStub;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStubProxy;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback_Parcel;
    private final getSupportedHighSpeedResolutionsFor ICustomTabsCallback;
    private final getSupportedHighSpeedResolutionsFor access000;
    private final getSupportedHighSpeedResolutionsFor access100;
    private final getSupportedHighSpeedResolutionsFor asBinder;
    private final getSupportedHighSpeedResolutionsFor asInterface;
    private final getSupportedHighSpeedResolutionsFor getInterfaceDescriptor;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onTransact;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;
    private final Object readTypedObject;
    private final String writeTypedObject;

    public /* synthetic */ containsAtLeastOneSubstring(Object obj, String str, long j, boolean z, boolean z2, JsonUtils jsonUtils, boolean z3, Function2 function2, getMemoryMappingsOrBuilder getmemorymappingsorbuilder, getMemoryMappingsOrBuilder getmemorymappingsorbuilder2, Function2 function22, Function2 function23, Function2 function24, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, Function2 function25, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, j, z, z2, jsonUtils, z3, function2, getmemorymappingsorbuilder, getmemorymappingsorbuilder2, function22, function23, function24, getbacktracenote, getbacktracenote2, getbacktracenote3, function25, str2);
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i4)) | (~(i8 | i4));
        int i10 = ~(i5 | i7);
        int i11 = i4 | i10 | (~(i8 | i));
        int i12 = i4 + i + i2 + (1997535707 * i6) + (1930545336 * i3);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i4) + 1468203008 + ((-417352845) * i) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i2) + ((-1408630784) * i6) + ((-2070937600) * i3) + (392888320 * i13);
        int i15 = (i4 * (-2054695253)) + 138751921 + (i * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i2 * (-2054694363)) + (i6 * 1502648999) + (i3 * 931574424) + (i13 * (-2139684864));
        int i16 = i14 + (i15 * i15 * (-174260224));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private containsAtLeastOneSubstring(Object obj, String str, long j, boolean z, boolean z2, JsonUtils jsonUtils, boolean z3, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, ? extends ImageViewUtilsExternalSyntheticLambda1> function2, getMemoryMappingsOrBuilder<? extends getBacktraceNote<? super isNumeric, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> getmemorymappingsorbuilder, getMemoryMappingsOrBuilder<? extends getBacktraceNote<? super isNumeric, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> getmemorymappingsorbuilder2, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24, getBacktraceNote<? super createSpannedString, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, getBacktraceNote<? super toJson, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, getBacktraceNote<? super toJson, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, ? extends putJSONObjectIfValid> function25, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder2, "");
        this.readTypedObject = obj;
        this.writeTypedObject = str;
        this.ICustomTabsCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z2), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(j), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z3), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access000 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(jsonUtils, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStubProxy = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getmemorymappingsorbuilder, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getmemorymappingsorbuilder2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(function2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access100 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(function22, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(function23, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asInterface = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(function24, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getbacktracenote, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.getInterfaceDescriptor = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getbacktracenote2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getbacktracenote3, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(function25, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(str2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.appendQueryParameters
    public Object IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Object obj = this.readTypedObject;
        int i5 = i3 + 83;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    @Override // o.appendQueryParameters
    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.writeTypedObject;
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return str;
    }

    @Override // o.appendQueryParameters
    public boolean extraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        if (i3 == 0) {
            ((Boolean) onNavigationEvent(-1948937086, objArr, iOnWarmupCompleted2, iOnWarmupCompleted4, 1948937090, iOnWarmupCompleted, iOnWarmupCompleted3)).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) onNavigationEvent(-1948937086, objArr, iOnWarmupCompleted2, iOnWarmupCompleted4, 1948937090, iOnWarmupCompleted, iOnWarmupCompleted3)).booleanValue();
        int i4 = extraCallbackWithResult + 41;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return zBooleanValue;
    }

    @Override // o.appendQueryParameters
    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(445032296, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -445032296, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue();
        int i4 = extraCallback + 73;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    @Override // o.appendQueryParameters
    public long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jICustomTabsCallback = ICustomTabsCallback();
        int i4 = extraCallback + 41;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jICustomTabsCallback;
    }

    @Override // o.appendQueryParameters
    public getMemoryMappingsOrBuilder<getBacktraceNote<isNumeric, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            throw null;
        }
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        getMemoryMappingsOrBuilder<getBacktraceNote<isNumeric, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> getmemorymappingsorbuilder = (getMemoryMappingsOrBuilder) onNavigationEvent(1844312614, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1844312612, iOnWarmupCompleted2, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i3 = extraCallbackWithResult + 3;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return getmemorymappingsorbuilder;
    }

    @Override // o.appendQueryParameters
    public getMemoryMappingsOrBuilder<getBacktraceNote<isNumeric, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onPostMessage();
        }
        onPostMessage();
        throw null;
    }

    @Override // o.appendQueryParameters
    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, ImageViewUtilsExternalSyntheticLambda1> onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, ImageViewUtilsExternalSyntheticLambda1> function2ExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = extraCallbackWithResult + 39;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return function2ExtraCallbackWithResult;
    }

    @Override // o.appendQueryParameters
    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2ICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        int i4 = extraCallbackWithResult + 97;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return function2ICustomTabsCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.appendQueryParameters
    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2WriteTypedObject;
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            function2WriteTypedObject = writeTypedObject();
            int i3 = 33 / 0;
        } else {
            function2WriteTypedObject = writeTypedObject();
        }
        int i4 = extraCallback + 5;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return function2WriteTypedObject;
    }

    @Override // o.appendQueryParameters
    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnMinimized = onMinimized();
        int i4 = extraCallback + 103;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return function2OnMinimized;
    }

    @Override // o.appendQueryParameters
    public getBacktraceNote<createSpannedString, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100() {
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<createSpannedString, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return getbacktracenoteICustomTabsCallbackStubProxy;
    }

    @Override // o.appendQueryParameters
    public getBacktraceNote<toJson, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallbackStub();
            throw null;
        }
        getBacktraceNote<toJson, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteICustomTabsCallbackStub = ICustomTabsCallbackStub();
        int i3 = extraCallbackWithResult + 123;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return getbacktracenoteICustomTabsCallbackStub;
    }

    @Override // o.appendQueryParameters
    public getBacktraceNote<toJson, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<toJson, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnMessageChannelReady = onMessageChannelReady();
        int i4 = extraCallback + 77;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return getbacktracenoteOnMessageChannelReady;
    }

    @Override // o.appendQueryParameters
    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, putJSONObjectIfValid> asBinder() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, putJSONObjectIfValid> function2OnActivityLayout = onActivityLayout();
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return function2OnActivityLayout;
    }

    @Override // o.appendQueryParameters
    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 83;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnActivityResized = onActivityResized();
        int i4 = extraCallbackWithResult + 21;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnActivityResized;
    }

    public void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 27;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNavigationEvent(@Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, ? extends putJSONObjectIfValid> function2) {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        asBinder(function2);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 87;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        asInterface(z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallback + 43;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    public void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(z);
        if (i3 == 0) {
            throw null;
        }
    }

    public void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 == 0) {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            onNavigationEvent(-1468653606, new Object[]{this, boolValueOf}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1468653609, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
            return;
        }
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(-1468653606, new Object[]{this, boolValueOf}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1468653609, iOnWarmupCompleted2, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = 44 / 0;
    }

    public void onExtraCallbackWithResult(@Nullable JsonUtils jsonUtils) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(jsonUtils);
        int i4 = extraCallback + 51;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNavigationEvent(@NotNull getMemoryMappingsOrBuilder<? extends getBacktraceNote<? super isNumeric, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> getmemorymappingsorbuilder) {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
        onExtraCallback(getmemorymappingsorbuilder);
        int i4 = extraCallbackWithResult + 15;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull getMemoryMappingsOrBuilder<? extends getBacktraceNote<? super isNumeric, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> getmemorymappingsorbuilder) {
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
        onWarmupCompleted(getmemorymappingsorbuilder);
        int i4 = extraCallback + 33;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onWarmupCompleted(@Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, ? extends ImageViewUtilsExternalSyntheticLambda1> function2) {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function2);
        int i4 = extraCallback + 61;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function2);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = extraCallback + 55;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onNavigationEvent(@Nullable getBacktraceNote<? super createSpannedString, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = extraCallback + 33;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(getbacktracenote);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@Nullable getBacktraceNote<? super toJson, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(getbacktracenote);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = extraCallbackWithResult + 107;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onWarmupCompleted(@Nullable getBacktraceNote<? super toJson, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            onNavigationEvent(-191222414, new Object[]{this, getbacktracenote}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 191222415, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
            return;
        }
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(-191222414, new Object[]{this, getbacktracenote}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 191222415, iOnWarmupCompleted2, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.appendQueryParameters
    public void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(j);
        int i4 = extraCallback + 45;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        containsAtLeastOneSubstring containsatleastonesubstring = (containsAtLeastOneSubstring) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(((Boolean) containsatleastonesubstring.ICustomTabsCallback.onExtraCallbackWithResult()).booleanValue());
        }
        ((Boolean) containsatleastonesubstring.ICustomTabsCallback.onExtraCallbackWithResult()).booleanValue();
        throw null;
    }

    private final void asInterface(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 39;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.ICustomTabsCallback.IAuthTabCallback(Boolean.valueOf(z));
            return;
        }
        this.ICustomTabsCallback.IAuthTabCallback(Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        containsAtLeastOneSubstring containsatleastonesubstring = (containsAtLeastOneSubstring) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) containsatleastonesubstring.onNavigationEvent.onExtraCallbackWithResult()).booleanValue();
        int i4 = extraCallback + 9;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = extraCallbackWithResult + 89;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 79 / 0;
                return;
            }
            return;
        }
        this.onNavigationEvent.IAuthTabCallback(Boolean.valueOf(z));
        throw null;
    }

    private final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) this.onExtraCallback.onExtraCallbackWithResult()).access100();
        int i4 = extraCallback + 121;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jAccess100;
    }

    private final void onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.IAuthTabCallback(setByteOrder.onNavigationEvent(j));
        } else {
            this.onExtraCallback.IAuthTabCallback(setByteOrder.onNavigationEvent(j));
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        containsAtLeastOneSubstring containsatleastonesubstring = (containsAtLeastOneSubstring) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        containsatleastonesubstring.IAuthTabCallback.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = extraCallbackWithResult + 33;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void onExtraCallback(JsonUtils jsonUtils) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.access000.IAuthTabCallback(jsonUtils);
            int i3 = 63 / 0;
        } else {
            this.access000.IAuthTabCallback(jsonUtils);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        containsAtLeastOneSubstring containsatleastonesubstring = (containsAtLeastOneSubstring) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 43;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
            return (getMemoryMappingsOrBuilder) containsatleastonesubstring.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
        }
        return (getMemoryMappingsOrBuilder) containsatleastonesubstring.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
    }

    private final void onExtraCallback(getMemoryMappingsOrBuilder<? extends getBacktraceNote<? super isNumeric, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> getmemorymappingsorbuilder) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(getmemorymappingsorbuilder);
        int i4 = extraCallbackWithResult + 83;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final getMemoryMappingsOrBuilder<getBacktraceNote<isNumeric, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> onPostMessage() {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            getMemoryMappingsOrBuilder<getBacktraceNote<isNumeric, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> getmemorymappingsorbuilder = (getMemoryMappingsOrBuilder) this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
            int i3 = extraCallback + 89;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 27 / 0;
            }
            return getmemorymappingsorbuilder;
        }
        throw null;
    }

    private final void onWarmupCompleted(getMemoryMappingsOrBuilder<? extends getBacktraceNote<? super isNumeric, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> getmemorymappingsorbuilder) {
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackDefault.IAuthTabCallback(getmemorymappingsorbuilder);
            int i3 = extraCallback + 39;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.IAuthTabCallbackDefault.IAuthTabCallback(getmemorymappingsorbuilder);
        obj.hashCode();
        throw null;
    }

    private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, ImageViewUtilsExternalSyntheticLambda1> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 9;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, ImageViewUtilsExternalSyntheticLambda1> function2 = (Function2) this.onWarmupCompleted.onExtraCallbackWithResult();
            int i3 = extraCallback + 95;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
            }
            return function2;
        }
        throw null;
    }

    private final void IAuthTabCallback(Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, ? extends ImageViewUtilsExternalSyntheticLambda1> function2) {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.IAuthTabCallback(function2);
            int i3 = extraCallbackWithResult + 17;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onWarmupCompleted.IAuthTabCallback(function2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = (Function2) this.access100.onExtraCallbackWithResult();
        int i4 = extraCallbackWithResult + 123;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = (Function2) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        int i4 = extraCallbackWithResult + 25;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    private final void onExtraCallbackWithResult(Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        int i2 = extraCallback + 15;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(function2);
        int i4 = extraCallback + 55;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMinimized() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = (Function2) this.asInterface.onExtraCallbackWithResult();
        int i4 = extraCallbackWithResult + 51;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    private final getBacktraceNote<createSpannedString, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
            return (getBacktraceNote) this.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
        }
        return (getBacktraceNote) this.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
    }

    private final void IAuthTabCallback(getBacktraceNote<? super createSpannedString, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback_Parcel.IAuthTabCallback(getbacktracenote);
        int i4 = extraCallbackWithResult + 53;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final getBacktraceNote<toJson, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return (getBacktraceNote) this.getInterfaceDescriptor.onExtraCallbackWithResult();
        }
        throw null;
    }

    private final void IAuthTabCallbackDefault(getBacktraceNote<? super toJson, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.getInterfaceDescriptor.IAuthTabCallback(getbacktracenote);
            return;
        }
        this.getInterfaceDescriptor.IAuthTabCallback(getbacktracenote);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final getBacktraceNote<toJson, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = extraCallback + 47;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBacktraceNote<toJson, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = (getBacktraceNote) this.onTransact.onExtraCallbackWithResult();
            int i3 = extraCallback + 31;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return getbacktracenote;
            }
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        containsAtLeastOneSubstring containsatleastonesubstring = (containsAtLeastOneSubstring) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 107;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            containsatleastonesubstring.onTransact.IAuthTabCallback(getbacktracenote);
            int i3 = 23 / 0;
            return null;
        }
        containsatleastonesubstring.onTransact.IAuthTabCallback(getbacktracenote);
        return null;
    }

    private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, putJSONObjectIfValid> onActivityLayout() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, putJSONObjectIfValid> function2;
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            function2 = (Function2) this.asBinder.onExtraCallbackWithResult();
            int i3 = 47 / 0;
        } else {
            function2 = (Function2) this.asBinder.onExtraCallbackWithResult();
        }
        int i4 = extraCallbackWithResult + 43;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return function2;
    }

    private final void asBinder(Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, ? extends putJSONObjectIfValid> function2) {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.asBinder.IAuthTabCallback(function2);
            int i3 = extraCallback + 113;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.asBinder.IAuthTabCallback(function2);
        throw null;
    }

    private final String onActivityResized() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 117;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackStub.onExtraCallbackWithResult();
        int i4 = extraCallbackWithResult + 31;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub.IAuthTabCallback(str);
        int i4 = extraCallbackWithResult + 123;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean readTypedObject() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(445032296, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -445032296, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue();
    }

    private final getMemoryMappingsOrBuilder<getBacktraceNote<isNumeric, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> onRelationshipValidationResult() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (getMemoryMappingsOrBuilder) onNavigationEvent(1844312614, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1844312612, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private final boolean onUnminimized() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(-1948937086, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1948937090, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue();
    }

    private final void onNavigationEvent(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(-1468653606, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1468653609, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private final void onExtraCallback(getBacktraceNote<? super toJson, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(-191222414, new Object[]{this, getbacktracenote}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 191222415, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }
}
