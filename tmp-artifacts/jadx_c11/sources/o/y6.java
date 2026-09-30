package o;

import im.toss.TossApplication;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y6 {
    private static int ICustomTabsCallbackStub = 1;
    private static int ICustomTabsCallbackStubProxy;
    private final getHumanReadableName IAuthTabCallback;
    private final getHumanReadableName IAuthTabCallbackDefault;
    private final getHumanReadableName IAuthTabCallbackStub;
    private final getHumanReadableName IAuthTabCallbackStubProxy;
    private final getHumanReadableName IAuthTabCallback_Parcel;
    private final getHumanReadableName ICustomTabsCallback;
    private final getHumanReadableName ICustomTabsCallbackDefault;
    private final getHumanReadableName access000;
    private final getHumanReadableName access100;
    private final getHumanReadableName asBinder;
    private final getHumanReadableName asInterface;
    private final getHumanReadableName extraCallback;
    private final getHumanReadableName extraCallbackWithResult;
    private final getHumanReadableName getInterfaceDescriptor;
    private final getHumanReadableName onActivityLayout;
    private final getHumanReadableName onActivityResized;
    private final getHumanReadableName onExtraCallback;
    private final getHumanReadableName onExtraCallbackWithResult;
    private final getHumanReadableName onMessageChannelReady;
    private final getHumanReadableName onMinimized;
    private final getHumanReadableName onNavigationEvent;
    private final getHumanReadableName onPostMessage;
    private final getHumanReadableName onRelationshipValidationResult;
    private final getHumanReadableName onTransact;
    private final getHumanReadableName onUnminimized;
    private final getHumanReadableName onWarmupCompleted;
    private final getHumanReadableName readTypedObject;
    private final getHumanReadableName writeTypedObject;

    public y6() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    public y6(@NotNull getHumanReadableName gethumanreadablename, @NotNull getHumanReadableName gethumanreadablename2, @NotNull getHumanReadableName gethumanreadablename3, @NotNull getHumanReadableName gethumanreadablename4, @NotNull getHumanReadableName gethumanreadablename5, @NotNull getHumanReadableName gethumanreadablename6, @NotNull getHumanReadableName gethumanreadablename7, @NotNull getHumanReadableName gethumanreadablename8, @NotNull getHumanReadableName gethumanreadablename9, @NotNull getHumanReadableName gethumanreadablename10, @NotNull getHumanReadableName gethumanreadablename11, @NotNull getHumanReadableName gethumanreadablename12, @NotNull getHumanReadableName gethumanreadablename13, @NotNull getHumanReadableName gethumanreadablename14, @NotNull getHumanReadableName gethumanreadablename15, @NotNull getHumanReadableName gethumanreadablename16, @NotNull getHumanReadableName gethumanreadablename17, @NotNull getHumanReadableName gethumanreadablename18, @NotNull getHumanReadableName gethumanreadablename19, @NotNull getHumanReadableName gethumanreadablename20, @NotNull getHumanReadableName gethumanreadablename21, @NotNull getHumanReadableName gethumanreadablename22, @NotNull getHumanReadableName gethumanreadablename23, @NotNull getHumanReadableName gethumanreadablename24, @NotNull getHumanReadableName gethumanreadablename25, @NotNull getHumanReadableName gethumanreadablename26, @NotNull getHumanReadableName gethumanreadablename27, @NotNull getHumanReadableName gethumanreadablename28) {
        Intrinsics.checkNotNullParameter(gethumanreadablename, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename2, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename3, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename4, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename5, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename6, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename7, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename8, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename9, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename10, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename11, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename12, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename13, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename14, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename15, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename16, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename17, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename18, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename19, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename20, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename21, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename22, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename23, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename24, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename25, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename26, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename27, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename28, "");
        this.IAuthTabCallbackStub = gethumanreadablename;
        this.asInterface = gethumanreadablename2;
        this.onWarmupCompleted = gethumanreadablename3;
        this.ICustomTabsCallbackDefault = gethumanreadablename4;
        this.onUnminimized = gethumanreadablename5;
        this.onRelationshipValidationResult = gethumanreadablename6;
        this.onPostMessage = gethumanreadablename7;
        this.onMinimized = gethumanreadablename8;
        this.onActivityResized = gethumanreadablename9;
        this.onMessageChannelReady = gethumanreadablename10;
        this.onActivityLayout = gethumanreadablename11;
        this.onNavigationEvent = gethumanreadablename12;
        this.IAuthTabCallback = gethumanreadablename13;
        this.onExtraCallback = gethumanreadablename14;
        this.onExtraCallbackWithResult = gethumanreadablename15;
        this.readTypedObject = gethumanreadablename16;
        this.ICustomTabsCallback = gethumanreadablename17;
        this.extraCallback = gethumanreadablename18;
        this.writeTypedObject = gethumanreadablename19;
        this.extraCallbackWithResult = gethumanreadablename20;
        this.IAuthTabCallbackStubProxy = gethumanreadablename21;
        this.access100 = gethumanreadablename22;
        this.getInterfaceDescriptor = gethumanreadablename23;
        this.IAuthTabCallback_Parcel = gethumanreadablename24;
        this.access000 = gethumanreadablename25;
        this.IAuthTabCallbackDefault = gethumanreadablename26;
        this.onTransact = gethumanreadablename27;
        this.asBinder = gethumanreadablename28;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y6(getHumanReadableName gethumanreadablename, getHumanReadableName gethumanreadablename2, getHumanReadableName gethumanreadablename3, getHumanReadableName gethumanreadablename4, getHumanReadableName gethumanreadablename5, getHumanReadableName gethumanreadablename6, getHumanReadableName gethumanreadablename7, getHumanReadableName gethumanreadablename8, getHumanReadableName gethumanreadablename9, getHumanReadableName gethumanreadablename10, getHumanReadableName gethumanreadablename11, getHumanReadableName gethumanreadablename12, getHumanReadableName gethumanreadablename13, getHumanReadableName gethumanreadablename14, getHumanReadableName gethumanreadablename15, getHumanReadableName gethumanreadablename16, getHumanReadableName gethumanreadablename17, getHumanReadableName gethumanreadablename18, getHumanReadableName gethumanreadablename19, getHumanReadableName gethumanreadablename20, getHumanReadableName gethumanreadablename21, getHumanReadableName gethumanreadablename22, getHumanReadableName gethumanreadablename23, getHumanReadableName gethumanreadablename24, getHumanReadableName gethumanreadablename25, getHumanReadableName gethumanreadablename26, getHumanReadableName gethumanreadablename27, getHumanReadableName gethumanreadablename28, int i, DefaultConstructorMarker defaultConstructorMarker) {
        getHumanReadableName gethumanreadablenameOnTransact;
        getHumanReadableName gethumanreadablename29;
        getHumanReadableName gethumanreadablenameOnActivityResized;
        getHumanReadableName gethumanreadablename30;
        getHumanReadableName gethumanreadablenameOnPostMessage;
        getHumanReadableName gethumanreadablename31;
        getHumanReadableName gethumanreadablenameOnNavigationEvent;
        getHumanReadableName gethumanreadablename32;
        getHumanReadableName gethumanreadablename33;
        getHumanReadableName gethumanreadablename34;
        getHumanReadableName typedObject;
        getHumanReadableName gethumanreadablenameICustomTabsCallback;
        getHumanReadableName gethumanreadablename35;
        getHumanReadableName gethumanreadablename36;
        getHumanReadableName gethumanreadablenameAccess100;
        getHumanReadableName gethumanreadablename37;
        getHumanReadableName gethumanreadablename38;
        getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel;
        getHumanReadableName gethumanreadablename39;
        getHumanReadableName gethumanreadablenameAccess000;
        getHumanReadableName gethumanreadablename40;
        getHumanReadableName gethumanreadablenameIAuthTabCallbackDefault;
        getHumanReadableName gethumanreadablenameAsInterface = (i & 1) != 0 ? AppLovinCmpService.onWarmupCompleted.asInterface() : gethumanreadablename;
        if ((i & 2) != 0) {
            int i2 = ICustomTabsCallbackStub + 25;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            gethumanreadablenameOnTransact = AppLovinCmpService.onWarmupCompleted.onTransact();
        } else {
            gethumanreadablenameOnTransact = gethumanreadablename2;
        }
        getHumanReadableName gethumanreadablenameIAuthTabCallback = (i & 4) != 0 ? AppLovinCmpService.onWarmupCompleted.IAuthTabCallback() : gethumanreadablename3;
        getHumanReadableName gethumanreadablenameOnUnminimized = (i & 8) != 0 ? AppLovinCmpService.onWarmupCompleted.onUnminimized() : gethumanreadablename4;
        if ((i & 16) != 0) {
            int i4 = ICustomTabsCallbackStub + 121;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            gethumanreadablename29 = (getHumanReadableName) AppLovinCmpService.onExtraCallbackWithResult(1921560747, TossApplication.onSessionEnded.onExtraCallback(), -1921560744, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), new Object[]{AppLovinCmpService.onWarmupCompleted}, TossApplication.onSessionEnded.onExtraCallback());
            int i6 = 2 % 2;
        } else {
            gethumanreadablename29 = gethumanreadablename5;
        }
        getHumanReadableName gethumanreadablenameOnRelationshipValidationResult = (i & 32) != 0 ? AppLovinCmpService.onWarmupCompleted.onRelationshipValidationResult() : gethumanreadablename6;
        getHumanReadableName gethumanreadablenameOnMinimized = (i & 64) != 0 ? AppLovinCmpService.onWarmupCompleted.onMinimized() : gethumanreadablename7;
        if ((i & 128) != 0) {
            int i7 = ICustomTabsCallbackStubProxy + 91;
            ICustomTabsCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                AppLovinCmpService.onWarmupCompleted.onActivityResized();
                throw null;
            }
            gethumanreadablenameOnActivityResized = AppLovinCmpService.onWarmupCompleted.onActivityResized();
        } else {
            gethumanreadablenameOnActivityResized = gethumanreadablename8;
        }
        if ((i & 256) != 0) {
            gethumanreadablename30 = (getHumanReadableName) AppLovinCmpService.onExtraCallbackWithResult(1469594932, TossApplication.onSessionEnded.onExtraCallback(), -1469594930, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), new Object[]{AppLovinCmpService.onWarmupCompleted}, TossApplication.onSessionEnded.onExtraCallback());
        } else {
            gethumanreadablename30 = gethumanreadablename9;
        }
        getHumanReadableName gethumanreadablenameOnActivityLayout = (i & 512) != 0 ? AppLovinCmpService.onWarmupCompleted.onActivityLayout() : gethumanreadablename10;
        if ((i & 1024) != 0) {
            int i8 = ICustomTabsCallbackStubProxy + 123;
            ICustomTabsCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            gethumanreadablenameOnPostMessage = AppLovinCmpService.onWarmupCompleted.onPostMessage();
            int i10 = 2 % 2;
        } else {
            gethumanreadablenameOnPostMessage = gethumanreadablename11;
        }
        if ((i & 2048) != 0) {
            gethumanreadablename31 = (getHumanReadableName) AppLovinCmpService.onExtraCallbackWithResult(-281695782, TossApplication.onSessionEnded.onExtraCallback(), 281695783, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), new Object[]{AppLovinCmpService.onWarmupCompleted}, TossApplication.onSessionEnded.onExtraCallback());
        } else {
            gethumanreadablename31 = gethumanreadablename12;
        }
        if ((i & 4096) != 0) {
            int i11 = ICustomTabsCallbackStub + 9;
            ICustomTabsCallbackStubProxy = i11 % 128;
            if (i11 % 2 != 0) {
                gethumanreadablenameOnNavigationEvent = AppLovinCmpService.onWarmupCompleted.onNavigationEvent();
                int i12 = 25 / 0;
            } else {
                gethumanreadablenameOnNavigationEvent = AppLovinCmpService.onWarmupCompleted.onNavigationEvent();
            }
        } else {
            gethumanreadablenameOnNavigationEvent = gethumanreadablename13;
        }
        if ((i & 8192) != 0) {
            int i13 = ICustomTabsCallbackStubProxy + 39;
            gethumanreadablename32 = gethumanreadablenameOnNavigationEvent;
            ICustomTabsCallbackStub = i13 % 128;
            if (i13 % 2 == 0) {
                gethumanreadablename33 = (getHumanReadableName) AppLovinCmpService.onExtraCallbackWithResult(-1666178875, TossApplication.onSessionEnded.onExtraCallback(), 1666178879, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), new Object[]{AppLovinCmpService.onWarmupCompleted}, TossApplication.onSessionEnded.onExtraCallback());
                int i14 = 44 / 0;
            } else {
                gethumanreadablename33 = (getHumanReadableName) AppLovinCmpService.onExtraCallbackWithResult(-1666178875, TossApplication.onSessionEnded.onExtraCallback(), 1666178879, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), new Object[]{AppLovinCmpService.onWarmupCompleted}, TossApplication.onSessionEnded.onExtraCallback());
            }
            int i15 = 2 % 2;
        } else {
            gethumanreadablename32 = gethumanreadablenameOnNavigationEvent;
            gethumanreadablename33 = gethumanreadablename14;
        }
        getHumanReadableName gethumanreadablenameOnExtraCallback = (i & 16384) != 0 ? AppLovinCmpService.onWarmupCompleted.onExtraCallback() : gethumanreadablename15;
        if ((i & 32768) != 0) {
            int i16 = ICustomTabsCallbackStubProxy + 13;
            gethumanreadablename34 = gethumanreadablenameOnExtraCallback;
            ICustomTabsCallbackStub = i16 % 128;
            if (i16 % 2 == 0) {
                AppLovinCmpService.onWarmupCompleted.readTypedObject();
                throw null;
            }
            typedObject = AppLovinCmpService.onWarmupCompleted.readTypedObject();
        } else {
            gethumanreadablename34 = gethumanreadablenameOnExtraCallback;
            typedObject = gethumanreadablename16;
        }
        if ((65536 & i) != 0) {
            gethumanreadablenameICustomTabsCallback = AppLovinCmpService.onWarmupCompleted.ICustomTabsCallback();
            int i17 = 2 % 2;
        } else {
            gethumanreadablenameICustomTabsCallback = gethumanreadablename17;
        }
        getHumanReadableName gethumanreadablenameExtraCallback = (i & 131072) != 0 ? AppLovinCmpService.onWarmupCompleted.extraCallback() : gethumanreadablename18;
        getHumanReadableName gethumanreadablenameWriteTypedObject = (i & 262144) != 0 ? AppLovinCmpService.onWarmupCompleted.writeTypedObject() : gethumanreadablename19;
        getHumanReadableName gethumanreadablenameExtraCallbackWithResult = (i & 524288) != 0 ? AppLovinCmpService.onWarmupCompleted.extraCallbackWithResult() : gethumanreadablename20;
        if ((i & 1048576) != 0) {
            gethumanreadablename36 = gethumanreadablenameICustomTabsCallback;
            int i18 = ICustomTabsCallbackStubProxy + 115;
            gethumanreadablename35 = typedObject;
            ICustomTabsCallbackStub = i18 % 128;
            int i19 = i18 % 2;
            gethumanreadablenameAccess100 = AppLovinCmpService.onWarmupCompleted.access100();
        } else {
            gethumanreadablename35 = typedObject;
            gethumanreadablename36 = gethumanreadablenameICustomTabsCallback;
            gethumanreadablenameAccess100 = gethumanreadablename21;
        }
        getHumanReadableName gethumanreadablenameIAuthTabCallbackStubProxy = (2097152 & i) != 0 ? AppLovinCmpService.onWarmupCompleted.IAuthTabCallbackStubProxy() : gethumanreadablename22;
        if ((i & 4194304) != 0) {
            gethumanreadablename38 = gethumanreadablenameIAuthTabCallbackStubProxy;
            int i20 = ICustomTabsCallbackStubProxy + 17;
            gethumanreadablename37 = gethumanreadablenameAccess100;
            ICustomTabsCallbackStub = i20 % 128;
            if (i20 % 2 == 0) {
                AppLovinCmpService.onWarmupCompleted.IAuthTabCallback_Parcel();
                throw null;
            }
            gethumanreadablenameIAuthTabCallback_Parcel = AppLovinCmpService.onWarmupCompleted.IAuthTabCallback_Parcel();
        } else {
            gethumanreadablename37 = gethumanreadablenameAccess100;
            gethumanreadablename38 = gethumanreadablenameIAuthTabCallbackStubProxy;
            gethumanreadablenameIAuthTabCallback_Parcel = gethumanreadablename23;
        }
        if ((8388608 & i) != 0) {
            gethumanreadablename39 = (getHumanReadableName) AppLovinCmpService.onExtraCallbackWithResult(368115132, TossApplication.onSessionEnded.onExtraCallback(), -368115132, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), new Object[]{AppLovinCmpService.onWarmupCompleted}, TossApplication.onSessionEnded.onExtraCallback());
        } else {
            gethumanreadablename39 = gethumanreadablename24;
        }
        if ((i & 16777216) != 0) {
            gethumanreadablenameAccess000 = AppLovinCmpService.onWarmupCompleted.access000();
            int i21 = 2 % 2;
        } else {
            gethumanreadablenameAccess000 = gethumanreadablename25;
        }
        getHumanReadableName gethumanreadablenameAsBinder = (i & 33554432) != 0 ? AppLovinCmpService.onWarmupCompleted.asBinder() : gethumanreadablename26;
        getHumanReadableName gethumanreadablenameIAuthTabCallbackStub = (i & 67108864) != 0 ? AppLovinCmpService.onWarmupCompleted.IAuthTabCallbackStub() : gethumanreadablename27;
        if ((i & 134217728) != 0) {
            int i22 = ICustomTabsCallbackStub + 89;
            gethumanreadablename40 = gethumanreadablename39;
            ICustomTabsCallbackStubProxy = i22 % 128;
            if (i22 % 2 != 0) {
                AppLovinCmpService.onWarmupCompleted.IAuthTabCallbackDefault();
                throw null;
            }
            gethumanreadablenameIAuthTabCallbackDefault = AppLovinCmpService.onWarmupCompleted.IAuthTabCallbackDefault();
        } else {
            gethumanreadablename40 = gethumanreadablename39;
            gethumanreadablenameIAuthTabCallbackDefault = gethumanreadablename28;
        }
        this(gethumanreadablenameAsInterface, gethumanreadablenameOnTransact, gethumanreadablenameIAuthTabCallback, gethumanreadablenameOnUnminimized, gethumanreadablename29, gethumanreadablenameOnRelationshipValidationResult, gethumanreadablenameOnMinimized, gethumanreadablenameOnActivityResized, gethumanreadablename30, gethumanreadablenameOnActivityLayout, gethumanreadablenameOnPostMessage, gethumanreadablename31, gethumanreadablename32, gethumanreadablename33, gethumanreadablename34, gethumanreadablename35, gethumanreadablename36, gethumanreadablenameExtraCallback, gethumanreadablenameWriteTypedObject, gethumanreadablenameExtraCallbackWithResult, gethumanreadablename37, gethumanreadablename38, gethumanreadablenameIAuthTabCallback_Parcel, gethumanreadablename40, gethumanreadablenameAccess000, gethumanreadablenameAsBinder, gethumanreadablenameIAuthTabCallbackStub, gethumanreadablenameIAuthTabCallbackDefault);
    }

    public final getHumanReadableName onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 7;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getHumanReadableName gethumanreadablename = this.IAuthTabCallback;
        int i5 = i3 + 119;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return gethumanreadablename;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, y6Var.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, y6Var.asInterface)) {
            int i2 = ICustomTabsCallbackStub + 121;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, y6Var.onWarmupCompleted) || !Intrinsics.areEqual(this.ICustomTabsCallbackDefault, y6Var.ICustomTabsCallbackDefault) || !Intrinsics.areEqual(this.onUnminimized, y6Var.onUnminimized) || !Intrinsics.areEqual(this.onRelationshipValidationResult, y6Var.onRelationshipValidationResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onPostMessage, y6Var.onPostMessage)) {
            int i4 = ICustomTabsCallbackStub;
            int i5 = i4 + 67;
            ICustomTabsCallbackStubProxy = i5 % 128;
            boolean z = i5 % 2 != 0;
            int i6 = i4 + 51;
            ICustomTabsCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                return z;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.onMinimized, y6Var.onMinimized) || (!Intrinsics.areEqual(this.onActivityResized, y6Var.onActivityResized)) || !Intrinsics.areEqual(this.onMessageChannelReady, y6Var.onMessageChannelReady) || !Intrinsics.areEqual(this.onActivityLayout, y6Var.onActivityLayout)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, y6Var.onNavigationEvent)) {
            int i7 = ICustomTabsCallbackStubProxy + 73;
            ICustomTabsCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, y6Var.IAuthTabCallback)) {
            int i9 = ICustomTabsCallbackStub + 125;
            ICustomTabsCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, y6Var.onExtraCallback) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, y6Var.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.readTypedObject, y6Var.readTypedObject)) {
            int i11 = ICustomTabsCallbackStub + 119;
            ICustomTabsCallbackStubProxy = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ICustomTabsCallback, y6Var.ICustomTabsCallback) || (!Intrinsics.areEqual(this.extraCallback, y6Var.extraCallback))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.writeTypedObject, y6Var.writeTypedObject)) {
            int i13 = ICustomTabsCallbackStub + 85;
            ICustomTabsCallbackStubProxy = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.extraCallbackWithResult, y6Var.extraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, y6Var.IAuthTabCallbackStubProxy)) {
            int i15 = ICustomTabsCallbackStubProxy + 3;
            ICustomTabsCallbackStub = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.access100, y6Var.access100)) || !Intrinsics.areEqual(this.getInterfaceDescriptor, y6Var.getInterfaceDescriptor) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, y6Var.IAuthTabCallback_Parcel) || !Intrinsics.areEqual(this.access000, y6Var.access000)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, y6Var.IAuthTabCallbackDefault)) {
            int i17 = ICustomTabsCallbackStub + 77;
            ICustomTabsCallbackStubProxy = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onTransact, y6Var.onTransact)) {
            return Intrinsics.areEqual(this.asBinder, y6Var.asBinder);
        }
        int i19 = ICustomTabsCallbackStub + 45;
        ICustomTabsCallbackStubProxy = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 31;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallbackStub.hashCode();
        int iHashCode2 = this.asInterface.hashCode();
        int iHashCode3 = this.onWarmupCompleted.hashCode();
        int iHashCode4 = this.ICustomTabsCallbackDefault.hashCode();
        int iHashCode5 = this.onUnminimized.hashCode();
        int iHashCode6 = this.onRelationshipValidationResult.hashCode();
        int iHashCode7 = this.onPostMessage.hashCode();
        int iHashCode8 = this.onMinimized.hashCode();
        int iHashCode9 = this.onActivityResized.hashCode();
        int iHashCode10 = this.onMessageChannelReady.hashCode();
        int iHashCode11 = this.onActivityLayout.hashCode();
        int iHashCode12 = this.onNavigationEvent.hashCode();
        int iHashCode13 = this.IAuthTabCallback.hashCode();
        int iHashCode14 = this.onExtraCallback.hashCode();
        int iHashCode15 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode16 = this.readTypedObject.hashCode();
        int iHashCode17 = this.ICustomTabsCallback.hashCode();
        int iHashCode18 = this.extraCallback.hashCode();
        int iHashCode19 = this.writeTypedObject.hashCode();
        int iHashCode20 = this.extraCallbackWithResult.hashCode();
        int iHashCode21 = this.IAuthTabCallbackStubProxy.hashCode();
        int iHashCode22 = this.access100.hashCode();
        int iHashCode23 = this.getInterfaceDescriptor.hashCode();
        int iHashCode24 = this.IAuthTabCallback_Parcel.hashCode();
        int iHashCode25 = this.access000.hashCode();
        int iHashCode26 = (((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.asBinder.hashCode();
        int i4 = ICustomTabsCallbackStubProxy + 41;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode26;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Typography(displaySmall=" + this.IAuthTabCallbackStub + ", displayMedium=" + this.asInterface + ", displayLarge=" + this.onWarmupCompleted + ", titleXSmallXWeak=" + this.ICustomTabsCallbackDefault + ", titleXSmallWeak=" + this.onUnminimized + ", titleXSmall=" + this.onRelationshipValidationResult + ", titleSmallXWeak=" + this.onPostMessage + ", titleSmallWeak=" + this.onMinimized + ", titleSmall=" + this.onActivityResized + ", titleMedium=" + this.onMessageChannelReady + ", titleLarge=" + this.onActivityLayout + ", bodyXSmall=" + this.onNavigationEvent + ", bodyMedium=" + this.IAuthTabCallback + ", bodyMediumStrong=" + this.onExtraCallback + ", bodyLarge=" + this.onExtraCallbackWithResult + ", subtextSmall=" + this.readTypedObject + ", subtextMedium=" + this.ICustomTabsCallback + ", subtextMediumStrong=" + this.extraCallback + ", subtextLarge=" + this.writeTypedObject + ", labelXSmallWeak=" + this.extraCallbackWithResult + ", labelXSmall=" + this.IAuthTabCallbackStubProxy + ", labelSmallWeak=" + this.access100 + ", labelSmall=" + this.getInterfaceDescriptor + ", labelSmallStrong=" + this.IAuthTabCallback_Parcel + ", labelMediumWeak=" + this.access000 + ", labelMedium=" + this.IAuthTabCallbackDefault + ", labelMediumStrong=" + this.onTransact + ", labelLarge=" + this.asBinder + ")";
        int i2 = ICustomTabsCallbackStub + 5;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
