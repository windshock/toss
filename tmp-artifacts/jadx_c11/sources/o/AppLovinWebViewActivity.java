package o;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import im.toss.tds.foundation.anim.rally.Rotate3D;
import im.toss.tds.foundation.graphics.drawable.RoundDrawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinWebViewActivitya;
import o.r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk;
import o.setImageUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinWebViewActivity extends setCreativeDebuggerEnabled<View> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLovinWebViewActivity(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setCreativeDebuggerEnabled
    public void onExtraCallbackWithResult(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled, float f) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        renderEffectCreateBlurEffect = null;
        renderEffectCreateBlurEffect = null;
        RenderEffect renderEffectCreateBlurEffect = null;
        RenderEffect renderEffectCreateBlurEffect2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
            boolean z = iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onNavigationEvent;
            throw null;
        }
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onNavigationEvent) {
            ICustomTabsCallback().setTranslationX(f);
            return;
        }
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onExtraCallbackWithResult) {
            int i3 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ICustomTabsCallback().setTranslationY(f);
            return;
        }
        if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.onWarmupCompleted) {
            ICustomTabsCallback().setTranslationX(ICustomTabsCallback().getMeasuredWidth() * f);
            return;
        }
        if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback) {
            ICustomTabsCallback().setTranslationY(ICustomTabsCallback().getMeasuredHeight() * f);
            return;
        }
        if (iscreativedebuggerenabled instanceof Rotate3D.X) {
            ICustomTabsCallback().setRotationX(f);
            return;
        }
        if (iscreativedebuggerenabled instanceof Rotate3D.Y) {
            int i5 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                ICustomTabsCallback().setRotationY(f);
                return;
            } else {
                ICustomTabsCallback().setRotationY(f);
                int i6 = 79 / 0;
                return;
            }
        }
        if (iscreativedebuggerenabled instanceof Rotate3D.Z) {
            ICustomTabsCallback().setRotation(f);
            return;
        }
        if (iscreativedebuggerenabled instanceof setVerboseLogging) {
            ICustomTabsCallback().setAlpha(f);
            return;
        }
        if (iscreativedebuggerenabled instanceof isTv) {
            ICustomTabsCallback().setScaleX(f);
            ICustomTabsCallback().setScaleY(f);
            return;
        }
        if (!(!(iscreativedebuggerenabled instanceof isFireTv))) {
            ICustomTabsCallback().setScaleX(f);
            return;
        }
        if (iscreativedebuggerenabled instanceof isSdkVersionGreaterThanOrEqualTo) {
            ICustomTabsCallback().setScaleY(f);
            return;
        }
        if (iscreativedebuggerenabled instanceof setImageUrl.onWarmupCompleted) {
            int i7 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                ICustomTabsCallback().setPivotX(ICustomTabsCallback().getMeasuredWidth() / f);
                return;
            } else {
                ICustomTabsCallback().setPivotX(ICustomTabsCallback().getMeasuredWidth() * f);
                return;
            }
        }
        if (iscreativedebuggerenabled instanceof setImageUrl.onExtraCallbackWithResult) {
            ICustomTabsCallback().setPivotY(ICustomTabsCallback().getMeasuredHeight() * f);
            return;
        }
        if (iscreativedebuggerenabled instanceof reinitialize) {
            View viewICustomTabsCallback = ICustomTabsCallback();
            reinitialize reinitializeVar = (reinitialize) iscreativedebuggerenabled;
            Integer numOnExtraCallbackWithResult = reinitializeVar.onExtraCallbackWithResult();
            int iIntValue = numOnExtraCallbackWithResult != null ? numOnExtraCallbackWithResult.intValue() : 0;
            Integer numOnExtraCallback = reinitializeVar.onExtraCallback();
            viewICustomTabsCallback.setBackgroundColor(new setHasUserConsent(iIntValue, numOnExtraCallback != null ? numOnExtraCallback.intValue() : 0).IAuthTabCallback(f).intValue());
            return;
        }
        if (iscreativedebuggerenabled instanceof deprecated_connectionSpecs) {
            int i8 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                ICustomTabsCallback().getLayoutParams();
                throw null;
            }
            View viewICustomTabsCallback2 = ICustomTabsCallback();
            ViewGroup.LayoutParams layoutParams = viewICustomTabsCallback2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = (int) f;
            viewICustomTabsCallback2.setLayoutParams(layoutParams);
            return;
        }
        if (iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfigurationBuilder) {
            int i9 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                ICustomTabsCallback().getLayoutParams();
                textView.hashCode();
                throw null;
            }
            View viewICustomTabsCallback3 = ICustomTabsCallback();
            ViewGroup.LayoutParams layoutParams2 = viewICustomTabsCallback3.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = (int) f;
            viewICustomTabsCallback3.setLayoutParams(layoutParams2);
            return;
        }
        if (iscreativedebuggerenabled instanceof AppLovinTermsAndPrivacyPolicyFlowSettings) {
            int i10 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            View viewICustomTabsCallback4 = ICustomTabsCallback();
            textView = viewICustomTabsCallback4 instanceof TextView ? (TextView) viewICustomTabsCallback4 : null;
            if (textView != null) {
                textView.setTextSize(0, f);
                return;
            }
            return;
        }
        if (iscreativedebuggerenabled instanceof AppLovinSdkUtilsSize) {
            View viewICustomTabsCallback5 = ICustomTabsCallback();
            TextView textView = viewICustomTabsCallback5 instanceof TextView ? (TextView) viewICustomTabsCallback5 : null;
            if (textView != null) {
                AppLovinSdkUtilsSize appLovinSdkUtilsSize = (AppLovinSdkUtilsSize) iscreativedebuggerenabled;
                Integer numOnExtraCallback2 = appLovinSdkUtilsSize.onExtraCallback();
                int iIntValue2 = numOnExtraCallback2 != null ? numOnExtraCallback2.intValue() : 0;
                Integer numOnExtraCallbackWithResult2 = appLovinSdkUtilsSize.onExtraCallbackWithResult();
                textView.setTextColor(new setHasUserConsent(iIntValue2, numOnExtraCallbackWithResult2 != null ? numOnExtraCallbackWithResult2.intValue() : 0).IAuthTabCallback(f).intValue());
                return;
            }
            return;
        }
        if (iscreativedebuggerenabled instanceof onReceivedEvent) {
            int i12 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            ((onReceivedEvent) iscreativedebuggerenabled).onExtraCallbackWithResult().invoke(Float.valueOf(f));
            return;
        }
        if (iscreativedebuggerenabled instanceof setUserIdentifier) {
            processDeepLink.onNavigationEvent(ICustomTabsCallback(), f);
            return;
        }
        if (iscreativedebuggerenabled instanceof showMediationDebugger) {
            int i14 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 != 0) {
                boolean z2 = ICustomTabsCallback() instanceof isInclusiveVersion;
                throw null;
            }
            if (ICustomTabsCallback() instanceof isInclusiveVersion) {
                ((isInclusiveVersion) ICustomTabsCallback()).setBlurRadius(f);
                return;
            } else {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (f != 0.0f) {
                        try {
                            renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP);
                        } catch (Exception unused) {
                        }
                    }
                    ICustomTabsCallback().setRenderEffect(renderEffectCreateBlurEffect);
                    return;
                }
                return;
            }
        }
        if (!(iscreativedebuggerenabled instanceof onSdkInitialized)) {
            if (!(iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfiguration)) {
                throw new NoWhenBranchMatchedException();
            }
            if (ICustomTabsCallback() instanceof isInclusiveVersion) {
                ((isInclusiveVersion) ICustomTabsCallback()).setBlurRadius(f);
                return;
            }
            return;
        }
        int i15 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i15 % 128;
        if (i15 % 2 == 0) {
            boolean z3 = ICustomTabsCallback() instanceof isInclusiveVersion;
            textView.hashCode();
            throw null;
        }
        if (ICustomTabsCallback() instanceof isInclusiveVersion) {
            ((isInclusiveVersion) ICustomTabsCallback()).setBlurRadius(f);
        } else if (Build.VERSION.SDK_INT >= 31) {
            if (f != 0.0f) {
                try {
                    renderEffectCreateBlurEffect2 = RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP);
                } catch (Exception unused2) {
                }
            }
            ICustomTabsCallback().setRenderEffect(renderEffectCreateBlurEffect2);
        }
    }

    @Override // o.setCreativeDebuggerEnabled
    public Float onWarmupCompleted(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        float rotationY;
        TextPaint paint;
        int color;
        float pivotY;
        int measuredHeight;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onNavigationEvent) {
            rotationY = ICustomTabsCallback().getTranslationX();
        } else if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onExtraCallbackWithResult) {
            rotationY = ICustomTabsCallback().getTranslationY();
        } else {
            if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.onWarmupCompleted) {
                pivotY = ICustomTabsCallback().getTranslationX();
                measuredHeight = ICustomTabsCallback().getMeasuredWidth();
            } else if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback) {
                pivotY = ICustomTabsCallback().getTranslationY();
                measuredHeight = ICustomTabsCallback().getMeasuredHeight();
            } else {
                if (iscreativedebuggerenabled instanceof Rotate3D.X) {
                    int i2 = onNavigationEvent + 33;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        ICustomTabsCallback().getRotationX();
                        throw null;
                    }
                    rotationY = ICustomTabsCallback().getRotationX();
                } else if (iscreativedebuggerenabled instanceof Rotate3D.Y) {
                    int i3 = onExtraCallbackWithResult + 39;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    rotationY = ICustomTabsCallback().getRotationY();
                } else if (iscreativedebuggerenabled instanceof Rotate3D.Z) {
                    int i5 = onNavigationEvent + 69;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    rotationY = ICustomTabsCallback().getRotation();
                } else if (iscreativedebuggerenabled instanceof setVerboseLogging) {
                    rotationY = ICustomTabsCallback().getAlpha();
                } else if (iscreativedebuggerenabled instanceof isTv) {
                    int i7 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    rotationY = ICustomTabsCallback().getScaleX();
                } else if (iscreativedebuggerenabled instanceof isFireTv) {
                    rotationY = ICustomTabsCallback().getScaleX();
                } else if (!(!(iscreativedebuggerenabled instanceof isSdkVersionGreaterThanOrEqualTo))) {
                    rotationY = ICustomTabsCallback().getScaleY();
                } else if (iscreativedebuggerenabled instanceof setImageUrl.onWarmupCompleted) {
                    pivotY = ICustomTabsCallback().getPivotX();
                    measuredHeight = ICustomTabsCallback().getMeasuredWidth();
                } else if (iscreativedebuggerenabled instanceof setImageUrl.onExtraCallbackWithResult) {
                    pivotY = ICustomTabsCallback().getPivotY();
                    measuredHeight = ICustomTabsCallback().getMeasuredHeight();
                } else {
                    if (iscreativedebuggerenabled instanceof reinitialize) {
                        color = onExtraCallback(ICustomTabsCallback());
                    } else if (iscreativedebuggerenabled instanceof deprecated_connectionSpecs) {
                        int i9 = onNavigationEvent + 37;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 != 0) {
                            ICustomTabsCallback().getMeasuredWidth();
                            throw null;
                        }
                        color = ICustomTabsCallback().getMeasuredWidth();
                    } else if (iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfigurationBuilder) {
                        int i10 = onNavigationEvent + 73;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        color = ICustomTabsCallback().getMeasuredHeight();
                    } else if (iscreativedebuggerenabled instanceof AppLovinTermsAndPrivacyPolicyFlowSettings) {
                        View viewICustomTabsCallback = ICustomTabsCallback();
                        if (viewICustomTabsCallback instanceof TextView) {
                            textView = (TextView) viewICustomTabsCallback;
                            int i12 = onNavigationEvent + 57;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                        }
                        rotationY = textView != null ? textView.getTextSize() : 0.0f;
                    } else {
                        if (iscreativedebuggerenabled instanceof AppLovinSdkUtilsSize) {
                            int i14 = onNavigationEvent + 5;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            View viewICustomTabsCallback2 = ICustomTabsCallback();
                            textView = viewICustomTabsCallback2 instanceof TextView ? (TextView) viewICustomTabsCallback2 : null;
                            if (textView != null && (paint = textView.getPaint()) != null) {
                                color = paint.getColor();
                            }
                        } else if (!(iscreativedebuggerenabled instanceof onReceivedEvent) && (iscreativedebuggerenabled instanceof setUserIdentifier)) {
                            rotationY = getVersionCode.MEDIUM.getValue();
                        }
                    }
                    rotationY = color;
                }
            }
            rotationY = pivotY / measuredHeight;
        }
        return Float.valueOf(rotationY);
    }

    private final int onExtraCallback(View view) {
        int i = 2 % 2;
        Drawable background = view.getBackground();
        if (background instanceof ColorDrawable) {
            int i2 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return ((ColorDrawable) background).getColor();
        }
        if (!(background instanceof ShapeDrawable)) {
            if (background instanceof RoundDrawable) {
                return ((RoundDrawable) background).onExtraCallbackWithResult();
            }
            return 0;
        }
        int i4 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int color = ((ShapeDrawable) background).getPaint().getColor();
        int i6 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return color;
        }
        throw null;
    }
}
