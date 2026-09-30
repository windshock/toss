package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BringIntoViewResponderNodeExternalSyntheticLambda0 {
    private final BasicTextKtExternalSyntheticLambda11 IAuthTabCallback;
    private final BasicTextKtExternalSyntheticLambda11 IAuthTabCallbackDefault;
    private final BasicTextKtExternalSyntheticLambda11 IAuthTabCallbackStub;
    private final BasicTextKtExternalSyntheticLambda11 IAuthTabCallbackStubProxy;
    private final BasicTextKtExternalSyntheticLambda11 IAuthTabCallback_Parcel;
    private final BasicTextKtExternalSyntheticLambda11 ICustomTabsCallback;
    private final BasicTextKtExternalSyntheticLambda11 ICustomTabsCallbackDefault;
    private final BasicTextKtExternalSyntheticLambda11 ICustomTabsCallbackStubProxy;
    private final BasicTextKtExternalSyntheticLambda11 access000;
    private final BasicTextKtExternalSyntheticLambda11 access100;
    private final BasicTextKtExternalSyntheticLambda11 asBinder;
    private final BasicTextKtExternalSyntheticLambda11 asInterface;
    private final BasicTextKtExternalSyntheticLambda11 extraCallback;
    private final BasicTextKtExternalSyntheticLambda11 extraCallbackWithResult;
    private final BasicTextKtExternalSyntheticLambda11 getInterfaceDescriptor;
    private final BasicTextKtExternalSyntheticLambda11 onActivityLayout;
    private final BasicTextKtExternalSyntheticLambda11 onActivityResized;
    private final BasicTextKtExternalSyntheticLambda11 onExtraCallback;
    private final BasicTextKtExternalSyntheticLambda11 onExtraCallbackWithResult;
    private final BasicTextKtExternalSyntheticLambda11 onMessageChannelReady;
    private final BasicTextKtExternalSyntheticLambda11 onMinimized;
    private final BasicTextKtExternalSyntheticLambda11 onNavigationEvent;
    private final BasicTextKtExternalSyntheticLambda11 onPostMessage;
    private final BasicTextKtExternalSyntheticLambda11 onTransact;
    private final BasicTextKtExternalSyntheticLambda11 onWarmupCompleted;
    private final BasicTextKtExternalSyntheticLambda11 readTypedObject;
    private final BasicTextKtExternalSyntheticLambda11 writeTypedObject;

    public /* synthetic */ BringIntoViewResponderNodeExternalSyntheticLambda0(BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda112, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda113, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda114, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda115, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda116, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda117, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda118, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda119, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1110, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1111, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1112, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1113, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1114, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1115, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1116, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1117, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1118, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1119, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1120, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1121, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1122, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1123, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1124, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1125, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1126, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1127, DefaultConstructorMarker defaultConstructorMarker) {
        this(basicTextKtExternalSyntheticLambda11, basicTextKtExternalSyntheticLambda112, basicTextKtExternalSyntheticLambda113, basicTextKtExternalSyntheticLambda114, basicTextKtExternalSyntheticLambda115, basicTextKtExternalSyntheticLambda116, basicTextKtExternalSyntheticLambda117, basicTextKtExternalSyntheticLambda118, basicTextKtExternalSyntheticLambda119, basicTextKtExternalSyntheticLambda1110, basicTextKtExternalSyntheticLambda1111, basicTextKtExternalSyntheticLambda1112, basicTextKtExternalSyntheticLambda1113, basicTextKtExternalSyntheticLambda1114, basicTextKtExternalSyntheticLambda1115, basicTextKtExternalSyntheticLambda1116, basicTextKtExternalSyntheticLambda1117, basicTextKtExternalSyntheticLambda1118, basicTextKtExternalSyntheticLambda1119, basicTextKtExternalSyntheticLambda1120, basicTextKtExternalSyntheticLambda1121, basicTextKtExternalSyntheticLambda1122, basicTextKtExternalSyntheticLambda1123, basicTextKtExternalSyntheticLambda1124, basicTextKtExternalSyntheticLambda1125, basicTextKtExternalSyntheticLambda1126, basicTextKtExternalSyntheticLambda1127);
    }

    public final BasicTextKtExternalSyntheticLambda11 onNavigationEvent() {
        return this.extraCallback;
    }

    public final BasicTextKtExternalSyntheticLambda11 onExtraCallbackWithResult() {
        return this.getInterfaceDescriptor;
    }

    private BringIntoViewResponderNodeExternalSyntheticLambda0(BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda112, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda113, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda114, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda115, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda116, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda117, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda118, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda119, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1110, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1111, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1112, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1113, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1114, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1115, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1116, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1117, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1118, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1119, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1120, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1121, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1122, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1123, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1124, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1125, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1126, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda1127) {
        this.extraCallback = basicTextKtExternalSyntheticLambda11;
        this.onTransact = basicTextKtExternalSyntheticLambda112;
        this.writeTypedObject = basicTextKtExternalSyntheticLambda113;
        this.access000 = basicTextKtExternalSyntheticLambda114;
        this.onActivityLayout = basicTextKtExternalSyntheticLambda115;
        this.IAuthTabCallback_Parcel = basicTextKtExternalSyntheticLambda116;
        this.onPostMessage = basicTextKtExternalSyntheticLambda117;
        this.access100 = basicTextKtExternalSyntheticLambda118;
        this.onMinimized = basicTextKtExternalSyntheticLambda119;
        this.ICustomTabsCallback = basicTextKtExternalSyntheticLambda1110;
        this.ICustomTabsCallbackDefault = basicTextKtExternalSyntheticLambda1111;
        this.readTypedObject = basicTextKtExternalSyntheticLambda1112;
        this.onExtraCallbackWithResult = basicTextKtExternalSyntheticLambda1113;
        this.onExtraCallback = basicTextKtExternalSyntheticLambda1114;
        this.IAuthTabCallbackDefault = basicTextKtExternalSyntheticLambda1115;
        this.asBinder = basicTextKtExternalSyntheticLambda1116;
        this.IAuthTabCallback = basicTextKtExternalSyntheticLambda1117;
        this.IAuthTabCallbackStub = basicTextKtExternalSyntheticLambda1118;
        this.onMessageChannelReady = basicTextKtExternalSyntheticLambda1119;
        this.IAuthTabCallbackStubProxy = basicTextKtExternalSyntheticLambda1120;
        this.onActivityResized = basicTextKtExternalSyntheticLambda1121;
        this.getInterfaceDescriptor = basicTextKtExternalSyntheticLambda1122;
        this.extraCallbackWithResult = basicTextKtExternalSyntheticLambda1123;
        this.onWarmupCompleted = basicTextKtExternalSyntheticLambda1124;
        this.asInterface = basicTextKtExternalSyntheticLambda1125;
        this.onNavigationEvent = basicTextKtExternalSyntheticLambda1126;
        this.ICustomTabsCallbackStubProxy = basicTextKtExternalSyntheticLambda1127;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        BringIntoViewResponderNodeExternalSyntheticLambda0 bringIntoViewResponderNodeExternalSyntheticLambda0 = (BringIntoViewResponderNodeExternalSyntheticLambda0) obj;
        return Intrinsics.areEqual(this.extraCallback, bringIntoViewResponderNodeExternalSyntheticLambda0.extraCallback) && Intrinsics.areEqual(this.onTransact, bringIntoViewResponderNodeExternalSyntheticLambda0.onTransact) && Intrinsics.areEqual(this.writeTypedObject, bringIntoViewResponderNodeExternalSyntheticLambda0.writeTypedObject) && Intrinsics.areEqual(this.access000, bringIntoViewResponderNodeExternalSyntheticLambda0.access000) && Intrinsics.areEqual(this.onActivityLayout, bringIntoViewResponderNodeExternalSyntheticLambda0.onActivityLayout) && Intrinsics.areEqual(this.IAuthTabCallback_Parcel, bringIntoViewResponderNodeExternalSyntheticLambda0.IAuthTabCallback_Parcel) && Intrinsics.areEqual(this.onPostMessage, bringIntoViewResponderNodeExternalSyntheticLambda0.onPostMessage) && Intrinsics.areEqual(this.access100, bringIntoViewResponderNodeExternalSyntheticLambda0.access100) && Intrinsics.areEqual(this.onMinimized, bringIntoViewResponderNodeExternalSyntheticLambda0.onMinimized) && Intrinsics.areEqual(this.ICustomTabsCallback, bringIntoViewResponderNodeExternalSyntheticLambda0.ICustomTabsCallback) && Intrinsics.areEqual(this.ICustomTabsCallbackDefault, bringIntoViewResponderNodeExternalSyntheticLambda0.ICustomTabsCallbackDefault) && Intrinsics.areEqual(this.readTypedObject, bringIntoViewResponderNodeExternalSyntheticLambda0.readTypedObject) && Intrinsics.areEqual(this.onExtraCallbackWithResult, bringIntoViewResponderNodeExternalSyntheticLambda0.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, bringIntoViewResponderNodeExternalSyntheticLambda0.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, bringIntoViewResponderNodeExternalSyntheticLambda0.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.asBinder, bringIntoViewResponderNodeExternalSyntheticLambda0.asBinder) && Intrinsics.areEqual(this.IAuthTabCallback, bringIntoViewResponderNodeExternalSyntheticLambda0.IAuthTabCallback) && Intrinsics.areEqual(this.IAuthTabCallbackStub, bringIntoViewResponderNodeExternalSyntheticLambda0.IAuthTabCallbackStub) && Intrinsics.areEqual(this.onMessageChannelReady, bringIntoViewResponderNodeExternalSyntheticLambda0.onMessageChannelReady) && Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, bringIntoViewResponderNodeExternalSyntheticLambda0.IAuthTabCallbackStubProxy) && Intrinsics.areEqual(this.onActivityResized, bringIntoViewResponderNodeExternalSyntheticLambda0.onActivityResized) && Intrinsics.areEqual(this.getInterfaceDescriptor, bringIntoViewResponderNodeExternalSyntheticLambda0.getInterfaceDescriptor) && Intrinsics.areEqual(this.extraCallbackWithResult, bringIntoViewResponderNodeExternalSyntheticLambda0.extraCallbackWithResult) && Intrinsics.areEqual(this.onWarmupCompleted, bringIntoViewResponderNodeExternalSyntheticLambda0.onWarmupCompleted) && Intrinsics.areEqual(this.asInterface, bringIntoViewResponderNodeExternalSyntheticLambda0.asInterface) && Intrinsics.areEqual(this.onNavigationEvent, bringIntoViewResponderNodeExternalSyntheticLambda0.onNavigationEvent) && Intrinsics.areEqual(this.ICustomTabsCallbackStubProxy, bringIntoViewResponderNodeExternalSyntheticLambda0.ICustomTabsCallbackStubProxy);
    }

    public int hashCode() {
        int iHashCode = this.extraCallback.hashCode();
        int iHashCode2 = this.onTransact.hashCode();
        int iHashCode3 = this.writeTypedObject.hashCode();
        int iHashCode4 = this.access000.hashCode();
        int iHashCode5 = this.onActivityLayout.hashCode();
        int iHashCode6 = this.IAuthTabCallback_Parcel.hashCode();
        int iHashCode7 = this.onPostMessage.hashCode();
        int iHashCode8 = this.access100.hashCode();
        int iHashCode9 = this.onMinimized.hashCode();
        int iHashCode10 = this.ICustomTabsCallback.hashCode();
        int iHashCode11 = this.ICustomTabsCallbackDefault.hashCode();
        int iHashCode12 = this.readTypedObject.hashCode();
        int iHashCode13 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode14 = this.onExtraCallback.hashCode();
        int iHashCode15 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode16 = this.asBinder.hashCode();
        int iHashCode17 = this.IAuthTabCallback.hashCode();
        int iHashCode18 = this.IAuthTabCallbackStub.hashCode();
        int iHashCode19 = this.onMessageChannelReady.hashCode();
        int iHashCode20 = this.IAuthTabCallbackStubProxy.hashCode();
        int iHashCode21 = this.onActivityResized.hashCode();
        int iHashCode22 = this.getInterfaceDescriptor.hashCode();
        int iHashCode23 = this.extraCallbackWithResult.hashCode();
        int iHashCode24 = this.onWarmupCompleted.hashCode();
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + this.asInterface.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.ICustomTabsCallbackStubProxy.hashCode();
    }

    public String toString() {
        return "ColorProviders(primary=" + this.extraCallback + ", onPrimary=" + this.onTransact + ", primaryContainer=" + this.writeTypedObject + ", onPrimaryContainer=" + this.access000 + ", secondary=" + this.onActivityLayout + ", onSecondary=" + this.IAuthTabCallback_Parcel + ", secondaryContainer=" + this.onPostMessage + ", onSecondaryContainer=" + this.access100 + ", tertiary=" + this.onMinimized + ", onTertiary=" + this.ICustomTabsCallback + ", tertiaryContainer=" + this.ICustomTabsCallbackDefault + ", onTertiaryContainer=" + this.readTypedObject + ", error=" + this.onExtraCallbackWithResult + ", errorContainer=" + this.onExtraCallback + ", onError=" + this.IAuthTabCallbackDefault + ", onErrorContainer=" + this.asBinder + ", background=" + this.IAuthTabCallback + ", onBackground=" + this.IAuthTabCallbackStub + ", surface=" + this.onMessageChannelReady + ", onSurface=" + this.IAuthTabCallbackStubProxy + ", surfaceVariant=" + this.onActivityResized + ", onSurfaceVariant=" + this.getInterfaceDescriptor + ", outline=" + this.extraCallbackWithResult + ", inverseOnSurface=" + this.onWarmupCompleted + ", inverseSurface=" + this.asInterface + ", inversePrimary=" + this.onNavigationEvent + ")widgetBackground=" + this.ICustomTabsCallbackStubProxy;
    }
}
