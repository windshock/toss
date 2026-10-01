package im.toss.ads_sdk.ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.RecomposerKt;
import o.access8100;
import o.deleteProfile;
import o.getRearDisplayMetrics;
import o.getStrokeWidth;
import o.getWrite;
import o.patch;
import o.setRootAlpha;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsNormalView extends ConstraintLayout {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final setRootAlpha onExtraCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsNormalView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsNormalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsNormalView nativeAdsNormalView, RecomposerKt recomposerKt) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsNormalView, recomposerKt);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsNormalView nativeAdsNormalView, IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Normal normal, String str, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(nativeAdsNormalView, iAuthTabCallback, normal, str, motionEvent);
        }
        onNavigationEvent(nativeAdsNormalView, iAuthTabCallback, normal, str, motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsNormalView nativeAdsNormalView, Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(nativeAdsNormalView, th);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsNormalView, th);
        int i3 = onWarmupCompleted + 5;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdsNormalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setRootAlpha setrootalphaIAuthTabCallback = setRootAlpha.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(setrootalphaIAuthTabCallback, "");
        this.onExtraCallback = setrootalphaIAuthTabCallback;
        TdsRoundLayout tdsRoundLayout = setrootalphaIAuthTabCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        patch.IAuthTabCallback(tdsRoundLayout, 0.0f, 1, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsNormalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback + 105;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 91;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setItem(@NotNull NativeAdsDto.Creative.Normal normal, @NotNull deleteProfile deleteprofile, boolean z, @NotNull IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int color;
        int color2;
        float f;
        Configuration configuration;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(normal, "");
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        onExtraCallbackWithResult(normal.asBinder());
        onExtraCallback(normal, z);
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(context, deleteprofile);
        if (zOnExtraCallbackWithResult) {
            int i4 = IAuthTabCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            color = Color.parseColor("#ffffffff");
        } else {
            color = Color.parseColor("#0d022047");
        }
        int color3 = Color.parseColor(zOnExtraCallbackWithResult ? "#1cd9d9ff" : "#0d022047");
        Typography5 typography5 = this.onExtraCallback.onExtraCallback;
        if (zOnExtraCallbackWithResult) {
            int i6 = IAuthTabCallback + 13;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            color2 = -1;
        } else {
            color2 = Color.parseColor("#ff4e5968");
        }
        typography5.setTextColor(color2);
        this.onExtraCallback.asInterface.setTextColor(zOnExtraCallbackWithResult ? -1 : Color.parseColor("#ff6b7684"));
        this.onExtraCallback.onNavigationEvent.setBackgroundColor(color);
        this.onExtraCallback.onNavigationEvent.setStrokeColor(color3);
        this.onExtraCallback.onNavigationEvent.setStrokeWidth(setTagsokhttp.onExtraCallbackWithResult(this, Double.valueOf(1.5d)));
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this.onExtraCallback.onWarmupCompleted);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            f = 1.0f;
        } else {
            int i7 = IAuthTabCallback + 119;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            f = configuration.fontScale;
        }
        if (f > 1.35f) {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.onExtraCallback.onNavigationEvent.getId(), 3, 0, 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(this.onExtraCallback.onNavigationEvent.getId(), 4);
        } else {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.onExtraCallback.onNavigationEvent.getId(), 3, this.onExtraCallback.onExtraCallback.getId(), 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.onExtraCallback.onNavigationEvent.getId(), 4, this.onExtraCallback.asInterface.getId(), 4);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this.onExtraCallback.onNavigationEvent.getId(), 0.5f);
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this.onExtraCallback.onWarmupCompleted);
        requestLayout();
        StringBuilder sb = new StringBuilder();
        sb.append(normal.asInterface());
        sb.append(" ");
        if (z) {
            sb.append(normal.IAuthTabCallbackStub());
            sb.append(" ・ AD");
        } else {
            sb.append(normal.IAuthTabCallbackStub());
        }
        if (normal.IAuthTabCallbackDefault() != null && (!StringsKt.isBlank(r12))) {
            int i9 = IAuthTabCallback + 1;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            sb.append(" ");
            sb.append(normal.IAuthTabCallbackDefault());
        }
        this.onExtraCallback.onWarmupCompleted.setContentDescription(sb.toString());
        this.onExtraCallback.onWarmupCompleted.setFocusable(true);
        this.onExtraCallback.onWarmupCompleted.setClickable(true);
        this.onExtraCallback.onWarmupCompleted.setImportantForAccessibility(1);
        this.onExtraCallback.onNavigationEvent.setImportantForAccessibility(2);
        this.onExtraCallback.onExtraCallbackWithResult.setImportantForAccessibility(2);
        this.onExtraCallback.onExtraCallback.setImportantForAccessibility(2);
        this.onExtraCallback.asInterface.setImportantForAccessibility(2);
        this.onExtraCallback.IAuthTabCallback.setImportantForAccessibility(2);
        this.onExtraCallback.IAuthTabCallbackDefault.setImportantForAccessibility(2);
        Function0<Unit> function0OnWarmupCompleted = getRearDisplayMetrics.onWarmupCompleted(this, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(this.onExtraCallback.onExtraCallback, "101"), getWrite.IAuthTabCallback(this.onExtraCallback.asInterface, "102"), getWrite.IAuthTabCallback(this.onExtraCallback.onNavigationEvent, "202")}));
        if (StringsKt.isBlank(normal.onWarmupCompleted())) {
            return;
        }
        onNavigationEvent(normal, normal.onWarmupCompleted(), function0OnWarmupCompleted, iAuthTabCallback);
    }

    private final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        this.onExtraCallback.onExtraCallbackWithResult.setImage(str, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsNormalView$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 65;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    NativeAdsNormalView.IAuthTabCallback(this.f$0, (RecomposerKt) obj);
                    throw null;
                }
                Unit unitIAuthTabCallback = NativeAdsNormalView.IAuthTabCallback(this.f$0, (RecomposerKt) obj);
                int i4 = onExtraCallback + 79;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        }, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsNormalView$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                Unit unitOnExtraCallbackWithResult;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    unitOnExtraCallbackWithResult = NativeAdsNormalView.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
                    int i4 = 37 / 0;
                } else {
                    unitOnExtraCallbackWithResult = NativeAdsNormalView.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
                }
                int i5 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
    }

    private static final Unit onNavigationEvent(NativeAdsNormalView nativeAdsNormalView, RecomposerKt recomposerKt) {
        TdsSquircleLayoutV1 tdsSquircleLayoutV1;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 47;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(recomposerKt, "");
            tdsSquircleLayoutV1 = nativeAdsNormalView.onExtraCallback.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(recomposerKt, "");
            tdsSquircleLayoutV1 = nativeAdsNormalView.onExtraCallback.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
            i = 0;
        }
        tdsSquircleLayoutV1.setVisibility(i);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(NativeAdsNormalView nativeAdsNormalView, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        TdsSquircleLayoutV1 tdsSquircleLayoutV1 = nativeAdsNormalView.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
        tdsSquircleLayoutV1.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return unit;
    }

    private final void onNavigationEvent(final NativeAdsDto.Creative.Normal normal, final String str, Function0<Unit> function0, final IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = this.onExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, function0, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsNormalView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = NativeAdsNormalView.onExtraCallbackWithResult(this.f$0, iAuthTabCallback, normal, str, (MotionEvent) obj);
                int i5 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 2045, null);
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(NativeAdsNormalView nativeAdsNormalView, IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Normal normal, String str, MotionEvent motionEvent) {
        String str2;
        int i = 2 % 2;
        if (motionEvent != null) {
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
            Typography5 typography5 = nativeAdsNormalView.onExtraCallback.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            if (getstrokewidth.onExtraCallback((View) typography5, x, y)) {
                int i4 = IAuthTabCallback + 23;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                str2 = "101";
            } else {
                Intrinsics.checkNotNullExpressionValue(nativeAdsNormalView.onExtraCallback.asInterface, "");
                if (!(!getstrokewidth.onExtraCallback((View) r3, x, y))) {
                    str2 = "102";
                } else {
                    Intrinsics.checkNotNullExpressionValue(nativeAdsNormalView.onExtraCallback.onNavigationEvent, "");
                    if (!(!getstrokewidth.onExtraCallback((View) r6, x, y))) {
                        int i6 = onWarmupCompleted + 113;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 19 / 0;
                        }
                        str2 = "202";
                    } else {
                        str2 = null;
                    }
                }
            }
            iAuthTabCallback.onNavigationEvent(normal, str, str2);
        } else {
            IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, normal, str, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public interface IAuthTabCallback {
        void onNavigationEvent(@NotNull NativeAdsDto.Creative.Normal normal, @NotNull String str, @Nullable String str2);

        static /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Normal normal, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            iAuthTabCallback.onNavigationEvent(normal, str, str2);
        }
    }

    private final void onExtraCallback(NativeAdsDto.Creative.Normal normal, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.onExtraCallback.setText(normal.asInterface());
        if (z) {
            this.onExtraCallback.asInterface.setText(normal.IAuthTabCallbackStub() + " ・ AD");
        } else {
            this.onExtraCallback.asInterface.setText(normal.IAuthTabCallbackStub());
            int i4 = onWarmupCompleted + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if (normal.IAuthTabCallbackDefault() != null) {
            int i6 = onWarmupCompleted + 15;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0 ? (!StringsKt.isBlank(r6)) : !(!StringsKt.isBlank(r6))) {
                SubTypography13 subTypography13 = this.onExtraCallback.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(subTypography13, "");
                subTypography13.setVisibility(0);
                View view = this.onExtraCallback.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(0);
                this.onExtraCallback.IAuthTabCallback.setText(normal.IAuthTabCallbackDefault());
                if (normal.IAuthTabCallbackDefault().length() > 60) {
                    this.onExtraCallback.IAuthTabCallback.setTextSize(1, 6.0f);
                    return;
                } else {
                    this.onExtraCallback.IAuthTabCallback.setTextSize(1, 8.0f);
                    return;
                }
            }
        }
        View view2 = this.onExtraCallback.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(8);
        SubTypography13 subTypography132 = this.onExtraCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(subTypography132, "");
        subTypography132.setVisibility(8);
    }
}
