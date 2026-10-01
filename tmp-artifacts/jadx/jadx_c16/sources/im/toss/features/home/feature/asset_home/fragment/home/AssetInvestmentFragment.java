package im.toss.features.home.feature.asset_home.fragment.home;

import android.os.Bundle;
import android.view.View;
import im.toss.features.home.core.ui.base.dst.BaseHomeDstFragment;
import im.toss.features.home.feature.asset_home.R;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AutoCallback;
import o.ExecutorType;
import o.NativePermissionRequire;
import o.RVManifestIProxyManifest;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.maybeUpdateAnimatable;
import o.noPermissionDelete;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class AssetInvestmentFragment<VM extends NativePermissionRequire> extends BaseHomeDstFragment<ExecutorType, VM, RVManifestIProxyManifest> {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private static int onExtraCallback;
    public static final int onExtraCallbackWithResult = BaseHomeDstFragment.onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 75;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
        }
    }

    public final boolean onTrackView() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 121;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return false;
    }

    /* renamed from: im.toss.features.home.feature.asset_home.fragment.home.AssetInvestmentFragment$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<View, ExecutorType> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final AnonymousClass5 onNavigationEvent = new AnonymousClass5();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 101;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        AnonymousClass5() {
            super(1, ExecutorType.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/home/feature/asset_home/databinding/HomeV2FeatureAssetHomeDstFragmentBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 == 0) {
                onExtraCallback(view);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            ExecutorType executorTypeOnExtraCallback = onExtraCallback(view);
            int i3 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return executorTypeOnExtraCallback;
        }

        public final ExecutorType onExtraCallback(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            ExecutorType executorTypeOnWarmupCompleted = ExecutorType.onWarmupCompleted(view);
            int i4 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return executorTypeOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public AssetInvestmentFragment() {
        super(R.layout.home_v2_feature_asset_home_dst_fragment, AnonymousClass5.onNavigationEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r11
      0x0032: PHI (r11v2 o.AutoCallback) = (r11v1 o.AutoCallback), (r11v7 o.AutoCallback) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        AutoCallback autoCallbackIAuthTabCallbackStubProxy;
        noPermissionDelete nopermissiondelete;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            autoCallbackIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            int i3 = 64 / 0;
            if (autoCallbackIAuthTabCallbackStubProxy instanceof noPermissionDelete) {
                int i4 = asInterface + 81;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                nopermissiondelete = (noPermissionDelete) autoCallbackIAuthTabCallbackStubProxy;
            } else {
                nopermissiondelete = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            autoCallbackIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            if (autoCallbackIAuthTabCallbackStubProxy instanceof noPermissionDelete) {
            }
        }
        if (nopermissiondelete == null) {
            return;
        }
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(nopermissiondelete, this, (access13800) null), 3, (Object) null);
    }
}
