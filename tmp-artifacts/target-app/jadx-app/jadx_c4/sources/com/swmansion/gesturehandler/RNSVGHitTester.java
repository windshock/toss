package com.swmansion.gesturehandler;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
import com.swmansion.gesturehandler.RNSVGHitTester;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.clearRevision;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNSVGHitTester {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
        
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, "");
            r3 = (com.horcrux.svg.SvgView) r3;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final SvgView onWarmupCompleted(View view) {
            SvgView svgView;
            SvgView parent;
            if (view instanceof VirtualView) {
                svgView = ((VirtualView) view).getSvgView();
                Intrinsics.checkNotNull(svgView);
                while (true) {
                    ViewParent parent2 = svgView.getParent();
                    Intrinsics.checkNotNullExpressionValue(parent2, "");
                    if (!onExtraCallbackWithResult(parent2)) {
                        return svgView;
                    }
                    if (svgView.getParent() instanceof VirtualView) {
                        ViewParent parent3 = svgView.getParent();
                        Intrinsics.checkNotNull(parent3, "");
                        svgView = ((VirtualView) parent3).getSvgView();
                        Intrinsics.checkNotNull(svgView);
                    } else {
                        parent = svgView.getParent();
                    }
                }
            }
            Intrinsics.checkNotNull(parent, "");
            svgView = parent;
        }

        public final boolean onExtraCallbackWithResult(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (obj instanceof VirtualView) || (obj instanceof SvgView);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onExtraCallbackWithResult(@NotNull View view, float f, float f2) {
            boolean z;
            Intrinsics.checkNotNullParameter(view, "");
            SvgView svgViewOnWarmupCompleted = onWarmupCompleted(view);
            view.getLocationOnScreen(new int[]{0, 0});
            svgViewOnWarmupCompleted.getLocationOnScreen(new int[]{0, 0});
            int iReactTagForTouch = svgViewOnWarmupCompleted.reactTagForTouch((r2[0] + f) - r3[0], (r2[1] + f2) - r3[1]);
            boolean z2 = view.getId() == iReactTagForTouch;
            double width = view.getWidth();
            double d = f;
            if (0.0d > d || d > width) {
                z = false;
            } else {
                double height = view.getHeight();
                double d2 = f2;
                if (0.0d <= d2 && d2 <= height) {
                    z = true;
                }
            }
            if (view instanceof SvgView) {
                return (z2 || clearRevision.onWarmupCompleted(clearRevision.asBinder(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) view), new Function1() { // from class: com.swmansion.gesturehandler.RNSVGHitTester$Companion$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(RNSVGHitTester.Companion.IAuthTabCallback((View) obj));
                    }
                }), Integer.valueOf(iReactTagForTouch))) && z;
            }
            return z2 && z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int IAuthTabCallback(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return view.getId();
        }
    }
}
