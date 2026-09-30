package im.toss.tds.compose.foundation.anim.rally;

import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.usshome.UssHomeItemAdapter$;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.ExtensionsManager1;
import o.HighSpeedFpsModifierCompanion;
import o.MediationAdapterRouterRouterAdLoadType;
import o.QuirksExternalSyntheticBackport0;
import o.StreamSpecsCalculatorCompanion;
import o.VirtualCameraCaptureResult;
import o.component4;
import o.component7;
import o.component8;
import o.flipHorizontally;
import o.flipSizeByRotation;
import o.getAspectRatioGroupKeyOfTargetSize;
import o.getDoubleValue;
import o.getStreamSharingChildren;
import o.r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE;
import o.setAdFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RallyGraphicsLayerModifier extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements StreamSpecsCalculatorCompanion {
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult;
    private final Function1<flipHorizontally, Unit> IAuthTabCallback;
    private Function1<? super flipHorizontally, Unit> onExtraCallback;
    private long onNavigationEvent;
    private setAdFormat onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(RallyGraphicsLayerModifier rallyGraphicsLayerModifier, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(rallyGraphicsLayerModifier, fliphorizontally);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(rallyGraphicsLayerModifier, fliphorizontally);
        int i3 = asInterface + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, RallyGraphicsLayerModifier rallyGraphicsLayerModifier, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getstreamsharingchildren, rallyGraphicsLayerModifier, onextracallbackwithresult);
        int i4 = onExtraCallbackWithResult + 39;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean N_() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public RallyGraphicsLayerModifier(@NotNull setAdFormat setadformat, @Nullable Function1<? super flipHorizontally, Unit> function1) {
        Intrinsics.checkNotNullParameter(setadformat, "");
        this.onWarmupCompleted = setadformat;
        this.IAuthTabCallback = function1;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        this.onNavigationEvent = ((Long) RallyModifierKt.onNavigationEvent(-1094323199, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[0], iOnWarmupCompleted, 1094323200)).longValue();
        this.onExtraCallback = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.RallyGraphicsLayerModifier$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 91;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = RallyGraphicsLayerModifier.onExtraCallback(this.f$0, (flipHorizontally) obj);
                int i4 = onWarmupCompleted + 125;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 0;
                }
                return unitOnExtraCallback;
            }
        };
    }

    private static final Unit onWarmupCompleted(RallyGraphicsLayerModifier rallyGraphicsLayerModifier, flipHorizontally fliphorizontally) {
        float fFloatValue;
        long jOnTransact;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        Function1<flipHorizontally, Unit> function1 = rallyGraphicsLayerModifier.IAuthTabCallback;
        if (function1 != null) {
            function1.invoke(fliphorizontally);
        }
        Float fOnNavigationEvent = rallyGraphicsLayerModifier.onWarmupCompleted.ICustomTabsCallback().onNavigationEvent();
        if (fOnNavigationEvent != null) {
            fFloatValue = fOnNavigationEvent.floatValue();
            int i2 = asInterface + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        } else {
            fFloatValue = 1.0f;
        }
        float fCoerceAtLeast = RangesKt.coerceAtLeast(fFloatValue, 1.0f);
        setAdFormat setadformat = rallyGraphicsLayerModifier.onWarmupCompleted;
        float fFloatValue2 = fCoerceAtLeast == 1.0f ? 1.0f : 1.0f / fCoerceAtLeast;
        float fFloatValue3 = fCoerceAtLeast != 1.0f ? 1.0f / fCoerceAtLeast : 1.0f;
        Float fAsInterface = setadformat.ICustomTabsCallback().asInterface();
        if (fAsInterface != null) {
            fFloatValue2 *= fAsInterface.floatValue();
            fFloatValue3 *= fAsInterface.floatValue();
        }
        Float fIAuthTabCallback_Parcel = setadformat.ICustomTabsCallback().IAuthTabCallback_Parcel();
        if (fIAuthTabCallback_Parcel != null) {
            fFloatValue2 *= fIAuthTabCallback_Parcel.floatValue();
        }
        Float fAccess100 = setadformat.ICustomTabsCallback().access100();
        if (fAccess100 != null) {
            fFloatValue3 *= fAccess100.floatValue();
        }
        fliphorizontally.IAuthTabCallbackStubProxy(fFloatValue2);
        fliphorizontally.getInterfaceDescriptor(fFloatValue3);
        Float fOnExtraCallback = setadformat.ICustomTabsCallback().onExtraCallback();
        if (fOnExtraCallback != null) {
            fliphorizontally.IAuthTabCallbackStub(fOnExtraCallback.floatValue());
        }
        Float fExtraCallback = setadformat.ICustomTabsCallback().extraCallback();
        if (fExtraCallback != null) {
            fliphorizontally.IAuthTabCallback_Parcel(fExtraCallback.floatValue() / fCoerceAtLeast);
        }
        Float fICustomTabsCallback = setadformat.ICustomTabsCallback().ICustomTabsCallback();
        if (fICustomTabsCallback != null) {
            fliphorizontally.access000(fICustomTabsCallback.floatValue() / fCoerceAtLeast);
        }
        Float interfaceDescriptor = setadformat.ICustomTabsCallback().getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            fliphorizontally.IAuthTabCallback_Parcel(interfaceDescriptor.floatValue() * ((int) (rallyGraphicsLayerModifier.onNavigationEvent >> 32)));
            int i4 = onExtraCallbackWithResult + 9;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        Float typedObject = setadformat.ICustomTabsCallback().readTypedObject();
        if (typedObject != null) {
            fliphorizontally.access000(typedObject.floatValue() * ((int) rallyGraphicsLayerModifier.onNavigationEvent));
        }
        if (setadformat.ICustomTabsCallback().access000() != null && setadformat.ICustomTabsCallback().IAuthTabCallbackStubProxy() != null) {
            int i6 = asInterface + 23;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                Float fAccess000 = setadformat.ICustomTabsCallback().access000();
                Intrinsics.checkNotNull(fAccess000);
                float fFloatValue4 = fAccess000.floatValue();
                Float fIAuthTabCallbackStubProxy = setadformat.ICustomTabsCallback().IAuthTabCallbackStubProxy();
                Intrinsics.checkNotNull(fIAuthTabCallbackStubProxy);
                getDoubleValue.IAuthTabCallback(fFloatValue4, fIAuthTabCallbackStubProxy.floatValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Float fAccess0002 = setadformat.ICustomTabsCallback().access000();
            Intrinsics.checkNotNull(fAccess0002);
            float fFloatValue5 = fAccess0002.floatValue();
            Float fIAuthTabCallbackStubProxy2 = setadformat.ICustomTabsCallback().IAuthTabCallbackStubProxy();
            Intrinsics.checkNotNull(fIAuthTabCallbackStubProxy2);
            jOnTransact = getDoubleValue.IAuthTabCallback(fFloatValue5, fIAuthTabCallbackStubProxy2.floatValue());
        } else if (setadformat.ICustomTabsCallback().access000() != null) {
            Float fAccess0003 = setadformat.ICustomTabsCallback().access000();
            Intrinsics.checkNotNull(fAccess0003);
            jOnTransact = getDoubleValue.IAuthTabCallback(fAccess0003.floatValue(), 0.5f);
        } else if (setadformat.ICustomTabsCallback().IAuthTabCallbackStubProxy() != null) {
            int i7 = asInterface + 1;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            Float fIAuthTabCallbackStubProxy3 = setadformat.ICustomTabsCallback().IAuthTabCallbackStubProxy();
            Intrinsics.checkNotNull(fIAuthTabCallbackStubProxy3);
            jOnTransact = getDoubleValue.IAuthTabCallback(0.5f, fIAuthTabCallbackStubProxy3.floatValue());
        } else {
            jOnTransact = fliphorizontally.onTransact();
        }
        fliphorizontally.asInterface(jOnTransact);
        Float f = (Float) MediationAdapterRouterRouterAdLoadType.IAuthTabCallback(-1650384927, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1650384932, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{setadformat.ICustomTabsCallback()});
        if (f != null) {
            fliphorizontally.asInterface(f.floatValue());
        }
        Float fIAuthTabCallbackStub = setadformat.ICustomTabsCallback().IAuthTabCallbackStub();
        if (fIAuthTabCallbackStub != null) {
            fliphorizontally.asBinder(fIAuthTabCallbackStub.floatValue());
        }
        Float fIAuthTabCallbackDefault = setadformat.ICustomTabsCallback().IAuthTabCallbackDefault();
        if (fIAuthTabCallbackDefault != null) {
            fliphorizontally.IAuthTabCallbackDefault(fIAuthTabCallbackDefault.floatValue());
            int i9 = asInterface + 53;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        Float fIAuthTabCallback = setadformat.ICustomTabsCallback().IAuthTabCallback();
        fliphorizontally.onTransact(fIAuthTabCallback != null ? fIAuthTabCallback.floatValue() : 8.0f);
        fliphorizontally.onExtraCallbackWithResult(setadformat.ICustomTabsCallback().asBinder());
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallbackDefault() {
        flipSizeByRotation flipsizebyrotationValidateRelationship;
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            flipsizebyrotationValidateRelationship = HighSpeedFpsModifierCompanion.onWarmupCompleted(this, getAspectRatioGroupKeyOfTargetSize.onExtraCallback(2)).validateRelationship();
            if (flipsizebyrotationValidateRelationship == null) {
                return;
            }
        } else {
            flipsizebyrotationValidateRelationship = HighSpeedFpsModifierCompanion.onWarmupCompleted(this, getAspectRatioGroupKeyOfTargetSize.onExtraCallback(2)).validateRelationship();
            if (flipsizebyrotationValidateRelationship == null) {
                return;
            }
        }
        flipsizebyrotationValidateRelationship.onNavigationEvent(this.onExtraCallback, true);
        int i3 = onExtraCallbackWithResult + 115;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public component8 IAuthTabCallback(@NotNull component4 component4Var, @NotNull component7 component7Var, long j) {
        int iAsInterface;
        int i = 2 % 2;
        int i2 = asInterface + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        Float fOnNavigationEvent = this.onWarmupCompleted.ICustomTabsCallback().onNavigationEvent();
        float fCoerceAtLeast = RangesKt.coerceAtLeast(fOnNavigationEvent != null ? fOnNavigationEvent.floatValue() : 1.0f, 1.0f);
        if (fCoerceAtLeast != 1.0f) {
            int iIAuthTabCallbackDefault = Integer.MAX_VALUE;
            if (VirtualCameraCaptureResult.asInterface(j) == Integer.MAX_VALUE) {
                int i4 = asInterface + 35;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 65 / 0;
                }
                iAsInterface = Integer.MAX_VALUE;
            } else {
                iAsInterface = (int) (VirtualCameraCaptureResult.asInterface(j) * fCoerceAtLeast);
            }
            if (VirtualCameraCaptureResult.IAuthTabCallbackDefault(j) != Integer.MAX_VALUE) {
                iIAuthTabCallbackDefault = (int) (VirtualCameraCaptureResult.IAuthTabCallbackDefault(j) * fCoerceAtLeast);
                int i6 = asInterface + 79;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            j = r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.onWarmupCompleted((int) (VirtualCameraCaptureResult.onTransact(j) * fCoerceAtLeast), iAsInterface, (int) (VirtualCameraCaptureResult.asBinder(j) * fCoerceAtLeast), iIAuthTabCallbackDefault);
        }
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(j);
        this.onNavigationEvent = ExtensionsManager1.onWarmupCompleted((getstreamsharingchildrenOnExtraCallback.T_() & 4294967295L) | (getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor() << 32));
        return component4.IAuthTabCallback(component4Var, getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor(), getstreamsharingchildrenOnExtraCallback.T_(), (Map) null, new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.RallyGraphicsLayerModifier$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 43;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallbackWithResult = RallyGraphicsLayerModifier.onExtraCallbackWithResult(getstreamsharingchildrenOnExtraCallback, this, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                int i11 = onWarmupCompleted + 19;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 4, (Object) null);
    }

    private static final Unit onExtraCallback(getStreamSharingChildren getstreamsharingchildren, RallyGraphicsLayerModifier rallyGraphicsLayerModifier, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            getStreamSharingChildren.onExtraCallbackWithResult.onWarmupCompleted(onextracallbackwithresult, getstreamsharingchildren, 1, 0, 0.0f, rallyGraphicsLayerModifier.onExtraCallback, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            getStreamSharingChildren.onExtraCallbackWithResult.onWarmupCompleted(onextracallbackwithresult, getstreamsharingchildren, 0, 0, 0.0f, rallyGraphicsLayerModifier.onExtraCallback, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public void O_() {
        int i = 2 % 2;
        super.O_();
        this.onWarmupCompleted.ICustomTabsCallback().onWarmupCompleted().put(this, new RallyGraphicsLayerModifier$onAttach$1(this));
        int i2 = asInterface + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void M_() {
        int i = 2 % 2;
        super.M_();
        this.onWarmupCompleted.ICustomTabsCallback().onWarmupCompleted().put(this, new RallyGraphicsLayerModifier$onReset$1(this));
        int i2 = asInterface + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super.asInterface();
            this.onWarmupCompleted.ICustomTabsCallback().onWarmupCompleted().remove(this);
        } else {
            super.asInterface();
            this.onWarmupCompleted.ICustomTabsCallback().onWarmupCompleted().remove(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onWarmupCompleted(@NotNull setAdFormat setadformat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setadformat, "");
        setadformat.ICustomTabsCallback().onWarmupCompleted().put(this, new RallyGraphicsLayerModifier$updateTarget$1$1(this));
        this.onWarmupCompleted = setadformat;
        int i2 = asInterface + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RallyGraphicsLayerModifier(target=" + this.onWarmupCompleted + ")";
        int i2 = asInterface + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
