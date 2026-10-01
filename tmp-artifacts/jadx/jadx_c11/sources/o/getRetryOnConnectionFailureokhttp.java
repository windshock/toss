package o;

import android.graphics.RenderNode;
import android.os.Build;
import com.google.android.gms.internal.ads.zziea;
import im.toss.tds.foundation.anim.rally.Rotate3D;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.anim.top.AnimateTop;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinWebViewActivitya;
import o.getRetryOnConnectionFailureokhttp;
import o.r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk;
import o.setImageUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getRetryOnConnectionFailureokhttp extends runOnUiThread<AnimateText> {
    private static int asBinder = 1;
    private static int onNavigationEvent;
    private final getReadTimeoutokhttp IAuthTabCallback;
    private boolean onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final AnimateTop onWarmupCompleted;

    public static /* synthetic */ RenderNode rp_() {
        RenderNode renderNodeRq_;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            renderNodeRq_ = rq_();
            int i3 = 40 / 0;
        } else {
            renderNodeRq_ = rq_();
        }
        int i4 = asBinder + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return renderNodeRq_;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRetryOnConnectionFailureokhttp(@NotNull AnimateText animateText, @NotNull AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState, @Nullable getReadTimeoutokhttp getreadtimeoutokhttp, @Nullable AnimateTop animateTop, boolean z) {
        super(appLovinSdkConfigurationConsentDialogState, animateText);
        Intrinsics.checkNotNullParameter(animateText, "");
        Intrinsics.checkNotNullParameter(appLovinSdkConfigurationConsentDialogState, "");
        this.IAuthTabCallback = getreadtimeoutokhttp;
        this.onWarmupCompleted = animateTop;
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.anim.text.AnimateTextTarget$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                RenderNode renderNodeRp_ = getRetryOnConnectionFailureokhttp.rp_();
                if (i3 != 0) {
                    int i4 = 61 / 0;
                }
                return renderNodeRp_;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getRetryOnConnectionFailureokhttp(AnimateText animateText, AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState, getReadTimeoutokhttp getreadtimeoutokhttp, AnimateTop animateTop, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            int i2 = asBinder + 87;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 5;
            } else {
                int i7 = 2 % 2;
            }
            z = false;
        }
        this(animateText, appLovinSdkConfigurationConsentDialogState, getreadtimeoutokhttp, animateTop, z);
    }

    public final getReadTimeoutokhttp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        getReadTimeoutokhttp getreadtimeoutokhttp = this.IAuthTabCallback;
        int i5 = i3 + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getreadtimeoutokhttp;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 37;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.onExtraCallback = z;
        int i5 = i3 + 121;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public final RenderNode rr_() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        RenderNode renderNodeRs_ = getSslSocketFactoryOrNullokhttp.rs_(this.onExtraCallbackWithResult.getValue());
        int i4 = onNavigationEvent + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return renderNodeRs_;
    }

    private static final RenderNode rq_() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT < 31 : Build.VERSION.SDK_INT < 79) {
            return null;
        }
        RenderNode renderNodeEt_ = setSubtitleTextColor.et_("BlurNode");
        int i3 = asBinder + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return renderNodeEt_;
        }
        throw null;
    }

    @Override // o.setCreativeDebuggerEnabled
    public void onExtraCallbackWithResult(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        Object obj = null;
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onNavigationEvent) {
            ICustomTabsCallback().IAuthTabCallbackStubProxy(f);
        } else if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onExtraCallbackWithResult) {
            ICustomTabsCallback().access100(f);
        } else if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.onWarmupCompleted) {
            int i4 = asBinder + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                ICustomTabsCallback().getInterfaceDescriptor(f);
                obj.hashCode();
                throw null;
            }
            ICustomTabsCallback().getInterfaceDescriptor(f);
        } else if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback) {
            ICustomTabsCallback().IAuthTabCallback_Parcel(f);
        } else if (iscreativedebuggerenabled instanceof Rotate3D.X) {
            int i5 = asBinder + 59;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ICustomTabsCallback().onNavigationEvent(f);
        } else if (iscreativedebuggerenabled instanceof Rotate3D.Y) {
            ICustomTabsCallback().onTransact(f);
        } else if (iscreativedebuggerenabled instanceof Rotate3D.Z) {
            ICustomTabsCallback().onExtraCallbackWithResult(f);
        } else if (iscreativedebuggerenabled instanceof setVerboseLogging) {
            ICustomTabsCallback().IAuthTabCallback(f);
        } else if (iscreativedebuggerenabled instanceof isTv) {
            ICustomTabsCallback().asBinder(f);
            ICustomTabsCallback().IAuthTabCallbackDefault(f);
        } else if (iscreativedebuggerenabled instanceof isFireTv) {
            ICustomTabsCallback().asBinder(f);
        } else if (iscreativedebuggerenabled instanceof isSdkVersionGreaterThanOrEqualTo) {
            ICustomTabsCallback().IAuthTabCallbackDefault(f);
        } else if (iscreativedebuggerenabled instanceof setImageUrl.onWarmupCompleted) {
            AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ICustomTabsCallback(), Float.valueOf(f)}, zziea.IAuthTabCallback(), 1546639579, -1546639575);
        } else if (iscreativedebuggerenabled instanceof setImageUrl.onExtraCallbackWithResult) {
            int i7 = asBinder + 45;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                ICustomTabsCallback().IAuthTabCallbackStub(f);
                obj.hashCode();
                throw null;
            }
            ICustomTabsCallback().IAuthTabCallbackStub(f);
        } else if (iscreativedebuggerenabled instanceof AppLovinSdkUtilsSize) {
            AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogStateICustomTabsCallback = ICustomTabsCallback();
            AppLovinSdkUtilsSize appLovinSdkUtilsSize = (AppLovinSdkUtilsSize) iscreativedebuggerenabled;
            Integer numOnExtraCallback = appLovinSdkUtilsSize.onExtraCallback();
            int iIntValue = numOnExtraCallback != null ? numOnExtraCallback.intValue() : 0;
            Integer numOnExtraCallbackWithResult = appLovinSdkUtilsSize.onExtraCallbackWithResult();
            appLovinSdkConfigurationConsentDialogStateICustomTabsCallback.onExtraCallbackWithResult(new setHasUserConsent(iIntValue, numOnExtraCallbackWithResult != null ? numOnExtraCallbackWithResult.intValue() : 0).IAuthTabCallback(f));
            int i8 = onNavigationEvent + 91;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
        } else if ((iscreativedebuggerenabled instanceof onSdkInitialized) || (iscreativedebuggerenabled instanceof showMediationDebugger)) {
            ICustomTabsCallback().onExtraCallback(f);
        } else {
            int i10 = onNavigationEvent + 117;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            if (iscreativedebuggerenabled instanceof setUserIdentifier) {
                AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ICustomTabsCallback(), Float.valueOf(f)}, zziea.IAuthTabCallback(), 357041807, -357041806);
            }
        }
        onExtraCallback().postInvalidateOnAnimation();
        AnimateTop animateTop = this.onWarmupCompleted;
        if (animateTop != null) {
            int i12 = onNavigationEvent + 111;
            asBinder = i12 % 128;
            if (i12 % 2 != 0) {
                animateTop.invalidate();
            } else {
                animateTop.invalidate();
                throw null;
            }
        }
    }

    @Override // o.setCreativeDebuggerEnabled
    public Float onWarmupCompleted(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onNavigationEvent) {
            return Float.valueOf(ICustomTabsCallback().writeTypedObject());
        }
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onExtraCallbackWithResult) {
            return Float.valueOf(ICustomTabsCallback().ICustomTabsCallback());
        }
        if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.onWarmupCompleted) {
            return Float.valueOf(ICustomTabsCallback().access000());
        }
        if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback) {
            Float fValueOf = Float.valueOf(ICustomTabsCallback().getInterfaceDescriptor());
            int i4 = asBinder + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return fValueOf;
        }
        Object obj = null;
        if (iscreativedebuggerenabled instanceof Rotate3D.X) {
            int i6 = asBinder + 121;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return Float.valueOf(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ICustomTabsCallback()}, zziea.IAuthTabCallback(), 28336792, -28336789)).floatValue());
            }
            Float.valueOf(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ICustomTabsCallback()}, zziea.IAuthTabCallback(), 28336792, -28336789)).floatValue());
            obj.hashCode();
            throw null;
        }
        if (iscreativedebuggerenabled instanceof Rotate3D.Y) {
            return Float.valueOf(ICustomTabsCallback().onTransact());
        }
        if (iscreativedebuggerenabled instanceof Rotate3D.Z) {
            return Float.valueOf(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ICustomTabsCallback()}, zziea.IAuthTabCallback(), 928198490, -928198490)).floatValue());
        }
        if (iscreativedebuggerenabled instanceof setVerboseLogging) {
            return Float.valueOf(ICustomTabsCallback().onExtraCallbackWithResult());
        }
        if (iscreativedebuggerenabled instanceof isTv) {
            return Float.valueOf(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ICustomTabsCallback()}, zziea.IAuthTabCallback(), -488248815, 488248817)).floatValue());
        }
        if (iscreativedebuggerenabled instanceof isFireTv) {
            return Float.valueOf(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ICustomTabsCallback()}, zziea.IAuthTabCallback(), -488248815, 488248817)).floatValue());
        }
        if (iscreativedebuggerenabled instanceof isSdkVersionGreaterThanOrEqualTo) {
            int i7 = asBinder + 87;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                Float.valueOf(ICustomTabsCallback().IAuthTabCallbackDefault());
                obj.hashCode();
                throw null;
            }
            Float fValueOf2 = Float.valueOf(ICustomTabsCallback().IAuthTabCallbackDefault());
            int i8 = asBinder + 19;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 47 / 0;
            }
            return fValueOf2;
        }
        if (iscreativedebuggerenabled instanceof setImageUrl.onWarmupCompleted) {
            return Float.valueOf(ICustomTabsCallback().IAuthTabCallbackStubProxy());
        }
        if (iscreativedebuggerenabled instanceof setImageUrl.onExtraCallbackWithResult) {
            return Float.valueOf(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ICustomTabsCallback()}, zziea.IAuthTabCallback(), 1720941521, -1720941515)).floatValue());
        }
        if (iscreativedebuggerenabled instanceof AppLovinSdkUtilsSize) {
            return Float.valueOf(onExtraCallback().onActivityLayout());
        }
        if (!(iscreativedebuggerenabled instanceof onSdkInitialized)) {
            int i10 = onNavigationEvent + 113;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            if (!(iscreativedebuggerenabled instanceof showMediationDebugger)) {
                if (iscreativedebuggerenabled instanceof setUserIdentifier) {
                    return ICustomTabsCallback().onExtraCallback();
                }
                return null;
            }
        }
        return Float.valueOf(((Float) AppLovinSdkConfigurationConsentDialogState.IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ICustomTabsCallback()}, zziea.IAuthTabCallback(), -485618801, 485618806)).floatValue());
    }
}
