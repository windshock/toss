package im.toss.features.fx;

import android.os.Bundle;
import android.view.View;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.ClientRemoteCallPoint;
import o.PageContext;
import o.addAllCommandLine;
import o.preFillDefault;
import o.setBodyokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FxApplyLoadingFragment extends Hilt_FxApplyLoadingFragment {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback = {new PropertyReference1Impl<>(FxApplyLoadingFragment.class, "binding", "getBinding()Lim/toss/features/fx/databinding/FragmentFxLoadingBinding;", 0)};
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final PageContext onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 113;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return 1242663L;
    }

    public FxApplyLoadingFragment() {
        super(R.layout.fragment_fx_loading);
        this.onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, onWarmupCompleted.onExtraCallback);
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, ClientRemoteCallPoint> {
        private static int IAuthTabCallback = 0;
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        onWarmupCompleted() {
            super(1, ClientRemoteCallPoint.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/fx/databinding/FragmentFxLoadingBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onNavigationEvent = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 != 0) {
                return onNavigationEvent(view);
            }
            onNavigationEvent(view);
            throw null;
        }

        public final ClientRemoteCallPoint onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return ClientRemoteCallPoint.onNavigationEvent(view);
            }
            Intrinsics.checkNotNullParameter(view, "");
            int i3 = 62 / 0;
            return ClientRemoteCallPoint.onNavigationEvent(view);
        }
    }

    private final ClientRemoteCallPoint onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ClientRemoteCallPoint clientRemoteCallPointOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult(this, onExtraCallback[0]);
        int i4 = IAuthTabCallback + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return clientRemoteCallPointOnExtraCallbackWithResult;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        TdsTopV2View tdsTopV2View = onExtraCallback().IAuthTabCallback;
        tdsTopV2View.setUpperGap(24);
        tdsTopV2View.setLowerGap(24);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_28);
        tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        String string = getString(R.string.fx_progress_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        tdsTopV2View.setTitleTextColor(setBodyokhttp.onExtraCallback(this).onRelationshipValidationResult());
        String string2 = getString(R.string.fx_progress_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsTopV2View.setSubtitle2Text(string2);
        tdsTopV2View.setSubtitle2TextColor(setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy());
        int i4 = asBinder + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
