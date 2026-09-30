package o;

import android.view.View;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import im.toss.tds.foundation.anim.rally.RallyCanvas;
import im.toss.tds.foundation.anim.rally.Rotate3D;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinWebViewActivitya;
import o.r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk;
import o.setImageUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinSdkConfigurationConsentFlowUserGeography extends setCreativeDebuggerEnabled<RallyCanvas> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLovinSdkConfigurationConsentFlowUserGeography(@NotNull RallyCanvas rallyCanvas) {
        super(rallyCanvas);
        Intrinsics.checkNotNullParameter(rallyCanvas, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8 A[PHI: r0 r1 r10
      0x01a8: PHI (r0v10 im.toss.tds.foundation.anim.rally.RallyCanvas) = (r0v9 im.toss.tds.foundation.anim.rally.RallyCanvas), (r0v14 im.toss.tds.foundation.anim.rally.RallyCanvas) binds: [B:56:0x01a6, B:53:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r1v31 java.lang.Integer) = (r1v30 java.lang.Integer), (r1v35 java.lang.Integer) binds: [B:56:0x01a6, B:53:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r10v34 o.reinitialize) = (r10v33 o.reinitialize), (r10v40 o.reinitialize) binds: [B:56:0x01a6, B:53:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad A[PHI: r0 r10
      0x01ad: PHI (r0v12 im.toss.tds.foundation.anim.rally.RallyCanvas) = (r0v9 im.toss.tds.foundation.anim.rally.RallyCanvas), (r0v14 im.toss.tds.foundation.anim.rally.RallyCanvas) binds: [B:56:0x01a6, B:53:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r10v39 o.reinitialize) = (r10v33 o.reinitialize), (r10v40 o.reinitialize) binds: [B:56:0x01a6, B:53:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.setCreativeDebuggerEnabled
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled, float f) {
        int iIntValue;
        RallyCanvas rallyCanvasICustomTabsCallback;
        reinitialize reinitializeVar;
        Integer numOnExtraCallbackWithResult;
        int iIntValue2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onNavigationEvent) {
            RallyCanvas.onWarmupCompleted(new Object[]{ICustomTabsCallback(), Float.valueOf(f)}, 1558751007, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1558751007, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
        } else if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onExtraCallbackWithResult) {
            ICustomTabsCallback().access000(f);
        } else {
            if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.onWarmupCompleted) {
                RallyCanvas rallyCanvasICustomTabsCallback2 = ICustomTabsCallback();
                Float fOnMessageChannelReady = ICustomTabsCallback().onMessageChannelReady();
                RallyCanvas.onWarmupCompleted(new Object[]{rallyCanvasICustomTabsCallback2, Float.valueOf((fOnMessageChannelReady != null ? fOnMessageChannelReady.floatValue() : 0.0f) * f)}, 1558751007, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1558751007, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
            } else if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback) {
                RallyCanvas rallyCanvasICustomTabsCallback3 = ICustomTabsCallback();
                Float fAsBinder = ICustomTabsCallback().asBinder();
                rallyCanvasICustomTabsCallback3.access000((fAsBinder != null ? fAsBinder.floatValue() : 0.0f) * f);
            } else if (iscreativedebuggerenabled instanceof Rotate3D.X) {
                int i3 = onExtraCallback + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                RallyCanvas.onWarmupCompleted(new Object[]{ICustomTabsCallback(), Float.valueOf(f)}, -1554595333, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1554595339, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
            } else if (iscreativedebuggerenabled instanceof Rotate3D.Y) {
                ICustomTabsCallback().IAuthTabCallbackStub(f);
            } else if (iscreativedebuggerenabled instanceof Rotate3D.Z) {
                ICustomTabsCallback().onTransact(f);
            } else if (iscreativedebuggerenabled instanceof setVerboseLogging) {
                int i5 = onExtraCallback + 97;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ICustomTabsCallback().onNavigationEvent(f);
            } else {
                if (iscreativedebuggerenabled instanceof isTv) {
                    int i7 = onExtraCallback + 59;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    ICustomTabsCallback().asBinder(f);
                    ICustomTabsCallback().asInterface(f);
                    i = onExtraCallback + 107;
                } else if (iscreativedebuggerenabled instanceof isFireTv) {
                    ICustomTabsCallback().asBinder(f);
                } else if (iscreativedebuggerenabled instanceof isSdkVersionGreaterThanOrEqualTo) {
                    ICustomTabsCallback().asInterface(f);
                } else if (iscreativedebuggerenabled instanceof setImageUrl.onWarmupCompleted) {
                    ICustomTabsCallback().onWarmupCompleted(f);
                    i = onExtraCallback + 63;
                } else if (iscreativedebuggerenabled instanceof setImageUrl.onExtraCallbackWithResult) {
                    ICustomTabsCallback().IAuthTabCallback(f);
                } else {
                    if (iscreativedebuggerenabled instanceof reinitialize) {
                        int i9 = onExtraCallback + 91;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            rallyCanvasICustomTabsCallback = ICustomTabsCallback();
                            reinitializeVar = (reinitialize) iscreativedebuggerenabled;
                            numOnExtraCallbackWithResult = reinitializeVar.onExtraCallbackWithResult();
                            int i10 = 10 / 0;
                            iIntValue2 = numOnExtraCallbackWithResult != null ? numOnExtraCallbackWithResult.intValue() : 0;
                        } else {
                            rallyCanvasICustomTabsCallback = ICustomTabsCallback();
                            reinitializeVar = (reinitialize) iscreativedebuggerenabled;
                            numOnExtraCallbackWithResult = reinitializeVar.onExtraCallbackWithResult();
                            if (numOnExtraCallbackWithResult != null) {
                            }
                        }
                        Integer numOnExtraCallback = reinitializeVar.onExtraCallback();
                        rallyCanvasICustomTabsCallback.IAuthTabCallback(new setHasUserConsent(iIntValue2, numOnExtraCallback != null ? numOnExtraCallback.intValue() : 0).IAuthTabCallback(f));
                    } else if (iscreativedebuggerenabled instanceof deprecated_connectionSpecs) {
                        ICustomTabsCallback().onWarmupCompleted(Float.valueOf(f));
                    } else if (iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfigurationBuilder) {
                        int i11 = onExtraCallback + 47;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 == 0) {
                            ICustomTabsCallback().onExtraCallback(Float.valueOf(f));
                            int i12 = 33 / 0;
                        } else {
                            ICustomTabsCallback().onExtraCallback(Float.valueOf(f));
                        }
                    } else if (iscreativedebuggerenabled instanceof AppLovinTermsAndPrivacyPolicyFlowSettings) {
                        ICustomTabsCallback().IAuthTabCallback(Float.valueOf(f));
                    } else if (iscreativedebuggerenabled instanceof AppLovinSdkUtilsSize) {
                        RallyCanvas rallyCanvasICustomTabsCallback4 = ICustomTabsCallback();
                        AppLovinSdkUtilsSize appLovinSdkUtilsSize = (AppLovinSdkUtilsSize) iscreativedebuggerenabled;
                        Integer numOnExtraCallback2 = appLovinSdkUtilsSize.onExtraCallback();
                        if (numOnExtraCallback2 != null) {
                            int i13 = onExtraCallback + 17;
                            onExtraCallbackWithResult = i13 % 128;
                            int i14 = i13 % 2;
                            iIntValue = numOnExtraCallback2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        Integer numOnExtraCallbackWithResult2 = appLovinSdkUtilsSize.onExtraCallbackWithResult();
                        if (numOnExtraCallbackWithResult2 != null) {
                            int i15 = onExtraCallbackWithResult + 29;
                            onExtraCallback = i15 % 128;
                            if (i15 % 2 != 0) {
                                numOnExtraCallbackWithResult2.intValue();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            iIntValue = numOnExtraCallbackWithResult2.intValue();
                        }
                        RallyCanvas.onWarmupCompleted(new Object[]{rallyCanvasICustomTabsCallback4, new setHasUserConsent(iIntValue, iIntValue).IAuthTabCallback(f)}, -1323884131, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1323884135, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
                    } else if (!(!(iscreativedebuggerenabled instanceof onReceivedEvent))) {
                        ((onReceivedEvent) iscreativedebuggerenabled).onExtraCallbackWithResult().invoke(Float.valueOf(f));
                    } else if (iscreativedebuggerenabled instanceof showMediationDebugger) {
                        ICustomTabsCallback().onExtraCallbackWithResult(f);
                    } else if (iscreativedebuggerenabled instanceof setUserIdentifier) {
                        int i16 = onExtraCallback + 67;
                        onExtraCallbackWithResult = i16 % 128;
                        if (i16 % 2 == 0) {
                            ICustomTabsCallback().onExtraCallbackWithResult(Float.valueOf(f));
                            int i17 = 80 / 0;
                        } else {
                            ICustomTabsCallback().onExtraCallbackWithResult(Float.valueOf(f));
                        }
                    }
                }
                onExtraCallbackWithResult = i % 128;
                int i18 = i % 2;
            }
        }
        RallyCanvas.onWarmupCompleted(new Object[]{ICustomTabsCallback(), Float.valueOf(f)}, 809116625, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -809116622, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
        ((View) RallyCanvas.onWarmupCompleted(new Object[]{ICustomTabsCallback()}, 776567273, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -776567268, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult())).postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0260  */
    @Override // o.setCreativeDebuggerEnabled
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Float onWarmupCompleted(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        float fWriteTypedObject;
        int iIntValue;
        int i = 2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onNavigationEvent) {
            fWriteTypedObject = ICustomTabsCallback().extraCallbackWithResult();
        } else {
            Object obj = null;
            if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onExtraCallbackWithResult) {
                int i3 = onExtraCallback + 51;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    ICustomTabsCallback().writeTypedObject();
                    obj.hashCode();
                    throw null;
                }
                fWriteTypedObject = ICustomTabsCallback().writeTypedObject();
            } else if (!(!(iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.onWarmupCompleted))) {
                fWriteTypedObject = ICustomTabsCallback().extraCallbackWithResult();
            } else if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback) {
                int i4 = onExtraCallback + 111;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    fWriteTypedObject = ICustomTabsCallback().writeTypedObject();
                    i = 76;
                    int i5 = i / 0;
                } else {
                    fWriteTypedObject = ICustomTabsCallback().writeTypedObject();
                }
            } else if (iscreativedebuggerenabled instanceof Rotate3D.X) {
                fWriteTypedObject = ICustomTabsCallback().IAuthTabCallbackStub();
            } else if (iscreativedebuggerenabled instanceof Rotate3D.Y) {
                fWriteTypedObject = ((Float) RallyCanvas.onWarmupCompleted(new Object[]{ICustomTabsCallback()}, 1996037039, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1996037038, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue();
            } else if (iscreativedebuggerenabled instanceof Rotate3D.Z) {
                int i6 = onExtraCallbackWithResult + 57;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    fWriteTypedObject = ICustomTabsCallback().IAuthTabCallback_Parcel();
                    int i52 = i / 0;
                } else {
                    fWriteTypedObject = ICustomTabsCallback().IAuthTabCallback_Parcel();
                }
            } else if (iscreativedebuggerenabled instanceof setVerboseLogging) {
                int i7 = onExtraCallbackWithResult + 45;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    fWriteTypedObject = ICustomTabsCallback().asInterface();
                    i = 89;
                    int i522 = i / 0;
                } else {
                    fWriteTypedObject = ICustomTabsCallback().asInterface();
                }
            } else if (iscreativedebuggerenabled instanceof isTv) {
                fWriteTypedObject = ((Float) RallyCanvas.onWarmupCompleted(new Object[]{ICustomTabsCallback()}, -133090235, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 133090237, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue();
            } else if (iscreativedebuggerenabled instanceof isFireTv) {
                fWriteTypedObject = ((Float) RallyCanvas.onWarmupCompleted(new Object[]{ICustomTabsCallback()}, -133090235, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 133090237, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue();
            } else if (iscreativedebuggerenabled instanceof isSdkVersionGreaterThanOrEqualTo) {
                int i8 = onExtraCallback + 117;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    ICustomTabsCallback().access000();
                    throw null;
                }
                fWriteTypedObject = ICustomTabsCallback().access000();
            } else if (iscreativedebuggerenabled instanceof setImageUrl.onWarmupCompleted) {
                int i9 = onExtraCallback + 69;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                fWriteTypedObject = ICustomTabsCallback().IAuthTabCallbackDefault();
            } else if (iscreativedebuggerenabled instanceof setImageUrl.onExtraCallbackWithResult) {
                fWriteTypedObject = ICustomTabsCallback().onTransact();
            } else {
                if (iscreativedebuggerenabled instanceof reinitialize) {
                    Integer numOnNavigationEvent = ICustomTabsCallback().onNavigationEvent();
                    iIntValue = numOnNavigationEvent != null ? numOnNavigationEvent.intValue() : ICustomTabsCallback().onExtraCallback();
                } else if (iscreativedebuggerenabled instanceof deprecated_connectionSpecs) {
                    Float fOnMessageChannelReady = ICustomTabsCallback().onMessageChannelReady();
                    if (fOnMessageChannelReady != null) {
                        int i11 = onExtraCallbackWithResult + 99;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            fWriteTypedObject = fOnMessageChannelReady.floatValue();
                            i = 26;
                            int i5222 = i / 0;
                        } else {
                            fWriteTypedObject = fOnMessageChannelReady.floatValue();
                        }
                    } else {
                        fWriteTypedObject = 0.0f;
                    }
                } else if (iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfigurationBuilder) {
                    Float fAsBinder = ICustomTabsCallback().asBinder();
                    if (fAsBinder != null) {
                        fWriteTypedObject = fAsBinder.floatValue();
                    }
                } else if (iscreativedebuggerenabled instanceof AppLovinTermsAndPrivacyPolicyFlowSettings) {
                    Float fICustomTabsCallback = ICustomTabsCallback().ICustomTabsCallback();
                    fWriteTypedObject = fICustomTabsCallback != null ? fICustomTabsCallback.floatValue() : ICustomTabsCallback().onExtraCallbackWithResult();
                } else if (iscreativedebuggerenabled instanceof AppLovinSdkUtilsSize) {
                    Integer numAccess100 = ICustomTabsCallback().access100();
                    iIntValue = numAccess100 != null ? numAccess100.intValue() : ICustomTabsCallback().IAuthTabCallback();
                } else if (!(iscreativedebuggerenabled instanceof onReceivedEvent) && (iscreativedebuggerenabled instanceof showMediationDebugger)) {
                    int i12 = onExtraCallbackWithResult + 75;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        ICustomTabsCallback().onWarmupCompleted();
                        throw null;
                    }
                    fWriteTypedObject = ICustomTabsCallback().onWarmupCompleted();
                }
                fWriteTypedObject = iIntValue;
                int i13 = onExtraCallbackWithResult + 123;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        return Float.valueOf(fWriteTypedObject);
    }
}
