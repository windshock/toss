package im.toss.ads_sdk.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.ConvertFloatArrayToByteArray;
import o.FragmentStateAdapterFragmentMaxLifecycleEnforcer3;
import o.PaddingKtExternalSyntheticLambda0;
import o.RestrictionAllowlist;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.calculatePageOffsets;
import o.deprecated_method;
import o.findResAndMsg;
import o.getPackageType;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class NativeAdsContainerView extends TdsRoundLayout implements RestrictionAllowlist {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final CoroutineExceptionHandler IAuthTabCallback;
    private NativeAdsManager onExtraCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsContainerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public abstract String IAuthTabCallback();

    public void asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdsContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = new onNavigationEvent(CoroutineExceptionHandler.extraCallbackWithResult, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onNavigationEvent + 13;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public NativeAdsManager IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        NativeAdsManager nativeAdsManager = this.onExtraCallback;
        int i5 = i3 + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return nativeAdsManager;
    }

    public void onNavigationEvent(@Nullable NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = nativeAdsManager;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final calculatePageOffsets onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (nativeAdsManagerIAuthTabCallbackStub != null) {
            return nativeAdsManagerIAuthTabCallbackStub.onExtraCallbackWithResult();
        }
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        asInterface();
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ NativeAdsContainerView onNavigationEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, NativeAdsContainerView nativeAdsContainerView) {
            super(onwarmupcompleted);
            this.onNavigationEvent = nativeAdsContainerView;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, this.onNavigationEvent.IAuthTabCallback(), "handled error", th, (Map) null, 60, (Object) null);
            } else {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, this.onNavigationEvent.IAuthTabCallback(), "handled error", th, (Map) null, 8, (Object) null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void asInterface() {
        Fragment fragmentOnExtraCallbackWithResult;
        FragmentStateAdapterFragmentMaxLifecycleEnforcer3 fragmentStateAdapterFragmentMaxLifecycleEnforcer3;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            obj.hashCode();
            throw null;
        }
        if (IAuthTabCallbackStub() == null) {
            int i3 = onNavigationEvent + 87;
            onWarmupCompleted = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    fragmentOnExtraCallbackWithResult = PaddingKtExternalSyntheticLambda0.onExtraCallbackWithResult(this);
                    int i4 = 18 / 0;
                } else {
                    fragmentOnExtraCallbackWithResult = PaddingKtExternalSyntheticLambda0.onExtraCallbackWithResult(this);
                }
            } catch (Exception unused) {
                fragmentOnExtraCallbackWithResult = null;
            }
            if (fragmentOnExtraCallbackWithResult instanceof FragmentStateAdapterFragmentMaxLifecycleEnforcer3) {
                fragmentStateAdapterFragmentMaxLifecycleEnforcer3 = (FragmentStateAdapterFragmentMaxLifecycleEnforcer3) fragmentOnExtraCallbackWithResult;
            } else if (getContext() instanceof FragmentStateAdapterFragmentMaxLifecycleEnforcer3) {
                int i5 = onWarmupCompleted + 109;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                Object context = getContext();
                Intrinsics.checkNotNull(context, "");
                fragmentStateAdapterFragmentMaxLifecycleEnforcer3 = (FragmentStateAdapterFragmentMaxLifecycleEnforcer3) context;
            } else {
                fragmentStateAdapterFragmentMaxLifecycleEnforcer3 = null;
            }
            if (fragmentStateAdapterFragmentMaxLifecycleEnforcer3 != null) {
                int i7 = onWarmupCompleted + 103;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    onNavigationEvent(fragmentStateAdapterFragmentMaxLifecycleEnforcer3.onNavigationEvent());
                    throw null;
                }
                onNavigationEvent(fragmentStateAdapterFragmentMaxLifecycleEnforcer3.onNavigationEvent());
                int i8 = onNavigationEvent + 81;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onExtraCallbackWithResult(@NotNull View view) {
        int width;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            isAttachedToWindow();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        if (!isAttachedToWindow() || (width = view.getWidth() * view.getHeight()) <= 0 || deprecated_method.onNavigationEvent(view) < width * 0.5d) {
            return false;
        }
        int i3 = onWarmupCompleted + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final boolean onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            isAttachedToWindow();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        if (!isAttachedToWindow()) {
            int i3 = onNavigationEvent + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int width = view.getWidth() * view.getHeight();
        if (width <= 0 || deprecated_method.onNavigationEvent(view) < width * 0.98d) {
            return false;
        }
        int i5 = onNavigationEvent + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final boolean onWarmupCompleted(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (isAttachedToWindow()) {
            return deprecated_method.onNavigationEvent(view) > 0;
        }
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v5 o.TextFieldScrollKtExternalSyntheticLambda0) = (r1v4 o.TextFieldScrollKtExternalSyntheticLambda0), (r1v10 o.TextFieldScrollKtExternalSyntheticLambda0) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getPackageType onNavigationEvent(@NotNull Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            int i3 = 95 / 0;
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                    int i4 = onNavigationEvent + 109;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, this.IAuthTabCallback, (setRandomHost) null, function2, 2, (Object) null);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(function2, "");
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            }
        }
        int i6 = onWarmupCompleted + 121;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
