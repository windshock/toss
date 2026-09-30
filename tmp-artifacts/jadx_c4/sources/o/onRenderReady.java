package o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import im.toss.base.BaseFragment;
import im.toss.extensions.FragmentsKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getPreRenderJob;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onRenderReady {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    static final /* synthetic */ class onWarmupCompleted implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 IAuthTabCallback;

        onWarmupCompleted(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) r5).getFunctionDelegate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        
            if (r0 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            if (r0 != false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i5 = i3 + 105;
                onExtraCallbackWithResult = i5 % 128;
                boolean z = obj instanceof FunctionAdapter;
                if (i5 % 2 == 0) {
                    int i6 = 88 / 0;
                }
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.IAuthTabCallback;
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallbackWithResult + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onExtraCallbackWithResult + 111;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = (TextLinkScopeExternalSyntheticLambda7) objArr[2];
        String str = (String) objArr[3];
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, zBooleanValue, textLinkScopeExternalSyntheticLambda7, str, obj);
        int i4 = onExtraCallback + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i3 | i2 | i4));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i4 | i2)) | (~(i13 | i8)) | (~(i3 | i4));
        int i16 = i3 + i2 + i6 + ((-298151579) * i) + ((-427515960) * i5);
        int i17 = i16 * i16;
        int i18 = (i3 * (-431502880)) + 875560960 + ((-431502880) * i2) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i6) + ((-16252928) * i) + (423624704 * i5) + (1109590016 * i17);
        int i19 = ((i3 * (-2003555040)) - 1632655964) + (i2 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i6 * (-2003554617)) + (i * 1812671363) + (i5 * (-1519508360)) + (i17 * (-1288372224));
        return i18 + ((i19 * i19) * (-1796407296)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public static final TextFieldPressGestureFilterKtExternalSyntheticLambda0 onExtraCallback(@NotNull Fragment fragment) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
    }

    public static final TextFieldPressGestureFilterKtExternalSyntheticLambda0 onWarmupCompleted(@NotNull Fragment fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            fragment.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
            throw null;
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        if (fragment.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED)) {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = fragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            return TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        }
        int i3 = onExtraCallback + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public static final void onExtraCallbackWithResult(@NotNull Fragment fragment, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        if (str != null) {
            int i4 = onExtraCallback + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 89 / 0;
                if (StringsKt.isBlank(str)) {
                    return;
                }
            } else if (StringsKt.isBlank(str)) {
                return;
            }
            Toast.makeText(fragment.getContext(), str, 0).show();
        }
    }

    public static final void onWarmupCompleted(@NotNull Fragment fragment, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        if (i != 0) {
            int i3 = onExtraCallback + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Context context = fragment.getContext();
            (i4 != 0 ? Toast.makeText(context, i, 1) : Toast.makeText(context, i, 0)).show();
        }
        int i5 = onExtraCallback + 1;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3 = (FlowMeasureLazyPolicyExternalSyntheticLambda3) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        String str = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            int i2 = onExtraCallback + 35;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                int i4 = 61 / 0;
            }
            int i5 = i3 + 85;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            bundle = null;
        }
        return IAuthTabCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, bundle, str);
    }

    public static final BaseFragment IAuthTabCallback(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @Nullable Bundle bundle, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(str, "");
        BaseFragment baseFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), str);
        Intrinsics.checkNotNull(baseFragmentInstantiate, "");
        BaseFragment baseFragment = baseFragmentInstantiate;
        if (bundle != null) {
            baseFragment.setArguments(bundle);
            int i4 = IAuthTabCallback + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallback + 87;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
        return baseFragment;
    }

    public static final void onExtraCallbackWithResult(@NotNull Fragment fragment, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function0, "");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                activity.getOnBackPressedDispatcher();
                throw null;
            }
            ICustomTabsCallback_Parcel onBackPressedDispatcher = activity.getOnBackPressedDispatcher();
            if (onBackPressedDispatcher != null) {
                TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = fragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                onBackPressedDispatcher.onExtraCallbackWithResult(viewLifecycleOwner, new onExtraCallbackWithResult(function0));
                int i3 = onExtraCallback + 81;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 % 3;
                }
            }
        }
    }

    public static final class onExtraCallbackWithResult extends OnBackPressedCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0<Unit> onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Function0<Unit> function0) {
            super(true);
            this.onExtraCallback = function0;
        }

        public void handleOnBackPressed() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.onExtraCallback.invoke();
            int i3 = IAuthTabCallback + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Fragment fragment, String str, boolean z, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 97;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i4 + 5;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        onExtraCallback(fragment, str, z, function1);
        int i7 = IAuthTabCallback + 9;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final <T> void onExtraCallback(@NotNull Fragment fragment, @NotNull String str, boolean z, @NotNull Function1<? super T, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0OnWarmupCompleted = RippleNode.onNavigationEvent(fragment).onWarmupCompleted();
        if (twoLineExternalSyntheticLambda0OnWarmupCompleted != null) {
            int i2 = onExtraCallback + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0OnWarmupCompleted.onTransact();
            if (textLinkScopeExternalSyntheticLambda7OnTransact != null) {
                textLinkScopeExternalSyntheticLambda7OnTransact.onNavigationEvent(str).observe(fragment.getViewLifecycleOwner(), new onWarmupCompleted(new FragmentsKt$.ExternalSyntheticLambda0(function1, z, textLinkScopeExternalSyntheticLambda7OnTransact, str)));
                int i4 = IAuthTabCallback + 37;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private static final Unit IAuthTabCallback(Function1 function1, boolean z, TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, String str, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(obj);
        function1.invoke(obj);
        if (z) {
            int i4 = onExtraCallback + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            textLinkScopeExternalSyntheticLambda7.IAuthTabCallback(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onNavigationEvent(Fragment fragment, String str, Object obj, boolean z, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onExtraCallback + 25;
            IAuthTabCallback = i3 % 128;
            z = !(i3 % 2 != 0);
        }
        onNavigationEvent(fragment, str, obj, z);
        int i4 = onExtraCallback + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    public static final <T> void onNavigationEvent(@NotNull Fragment fragment, @NotNull String str, @NotNull T t, boolean z) {
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7OnTransact;
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy = RippleNode.onNavigationEvent(fragment).IAuthTabCallbackStubProxy();
        if (twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy != null && (textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact()) != null) {
            int i4 = IAuthTabCallback + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            textLinkScopeExternalSyntheticLambda7OnTransact.onWarmupCompleted(str, t);
        }
        if (z) {
            RippleNode.onNavigationEvent(fragment).getInterfaceDescriptor();
            int i6 = onExtraCallback + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean IAuthTabCallback(@NotNull Fragment fragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        if (!fragment.isRemoving() && fragment.getActivity() != null) {
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                fragment.isDetached();
                throw null;
            }
            if ((!fragment.isDetached()) && fragment.isAdded()) {
                int i3 = onExtraCallback + 21;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                View view = fragment.getView();
                if (i4 != 0) {
                    int i5 = 6 / 0;
                    if (view != null) {
                        return true;
                    }
                } else if (view != null) {
                }
            }
        }
        return false;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, boolean z, TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, String str, Object obj) {
        Object[] objArr = {function1, Boolean.valueOf(z), textLinkScopeExternalSyntheticLambda7, str, obj};
        return (Unit) onWarmupCompleted(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1885204005, 1885204006, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ BaseFragment onExtraCallbackWithResult(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, Bundle bundle, String str, int i, Object obj) {
        Object[] objArr = {flowMeasureLazyPolicyExternalSyntheticLambda3, bundle, str, Integer.valueOf(i), obj};
        return (BaseFragment) onWarmupCompleted(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -679646364, 679646364, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }
}
