package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import im.toss.core.tracker.entry.TrackState;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.uikit.R;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE extends BottomSheetDialogFragment implements L_ {
    private static int IAuthTabCallback = 1;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private final boolean onExtraCallbackWithResult;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onWarmupCompleted = 8;

    static {
        int i = onExtraCallback + 97;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 15 / 0;
        }
    }

    @Override // o.AFj1oSDKAFa1ySDK
    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    @Override // o.L_
    public /* bridge */ AFj1nSDK4 getLogVersion() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.getLogVersion();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AFj1nSDK4 logVersion = super.getLogVersion();
        int i3 = onNavigationEvent + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return logVersion;
    }

    @Override // o.L_
    public /* bridge */ String getReferrerParam() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String referrerParam = super.getReferrerParam();
        int i4 = asBinder + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return referrerParam;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ String getScreenHash() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String screenHash = super.getScreenHash();
        int i4 = onNavigationEvent + 109;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return screenHash;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = asBinder + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackBottomSheetView() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.onTrackBottomSheetView();
            throw null;
        }
        boolean zOnTrackBottomSheetView = super.onTrackBottomSheetView();
        int i3 = asBinder + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return zOnTrackBottomSheetView;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackView() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackView = super.onTrackView();
        int i4 = asBinder + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return zOnTrackView;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackView(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackView = super.onTrackView(z);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = asBinder + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return zOnTrackView;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackViewInternal(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackViewInternal = super.onTrackViewInternal(z, z2);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        int i5 = onNavigationEvent + 37;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnTrackViewInternal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Dialog, o.BrickModuleImplExternalSyntheticLambda0, o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI] */
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ?? r8lambdaaf6h4gyit_zmu5_zl59oqo83yi = new r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI(contextRequireContext, getTheme(), false, false, 12, null);
        r8lambdaaf6h4gyit_zmu5_zl59oqo83yi.onExtraCallbackWithResult(true);
        int i2 = onNavigationEvent + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return r8lambdaaf6h4gyit_zmu5_zl59oqo83yi;
    }

    public boolean at_() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i2 + 21;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public String getScreenName() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        throw null;
    }

    @Override // o.L_
    public void onPrepareTrackViewParams(@NotNull Map<String, Object> map) {
        String screenName;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        super.onPrepareTrackViewParams(map);
        L_ activity = getActivity();
        String interfaceDescriptor = null;
        L_ l_ = activity instanceof L_ ? activity : null;
        if (l_ != null && (screenName = l_.getScreenName()) != null) {
            if (screenName.length() == 0) {
                int i2 = onNavigationEvent + 13;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                TrackState trackStateOnExtraCallbackWithResult = TrackState.Companion.onExtraCallbackWithResult();
                if (trackStateOnExtraCallbackWithResult != null) {
                    interfaceDescriptor = trackStateOnExtraCallbackWithResult.getInterfaceDescriptor();
                    int i4 = onNavigationEvent + 85;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                interfaceDescriptor = screenName;
            }
        }
        map.put("parent_screen", interfaceDescriptor);
    }

    public void onStart() {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.DialogFragment*/.onStart();
            z = false;
        } else {
            super/*androidx.fragment.app.DialogFragment*/.onStart();
            z = true;
        }
        onTrackView(z);
    }

    public int getTheme() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.style.BottomSheetDialog;
            throw null;
        }
        int i4 = R.style.BottomSheetDialog;
        int i5 = onNavigationEvent + 13;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        }
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        View viewOnCreateView = super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        int i3 = 28 / 0;
        return viewOnCreateView;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        Object obj = null;
        if (at_()) {
            int i2 = asBinder + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(this, 0.0f, 1, null);
        }
        int i4 = onNavigationEvent + 97;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void show(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        asBinder = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
                super/*androidx.fragment.app.DialogFragment*/.show(flowMeasureLazyPolicyExternalSyntheticLambda3, str);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
            super/*androidx.fragment.app.DialogFragment*/.show(flowMeasureLazyPolicyExternalSyntheticLambda3, str);
            int i3 = onNavigationEvent + 31;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        } catch (IllegalStateException e) {
            auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, new CommonModule_getNetworkStatus(e), null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        }
    }

    public int show(@NotNull FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(flowRowOverflowCompanionExternalSyntheticLambda4, "");
        try {
            int iShow = super/*androidx.fragment.app.DialogFragment*/.show(flowRowOverflowCompanionExternalSyntheticLambda4, str);
            int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return iShow;
        } catch (IllegalStateException e) {
            auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, new CommonModule_getNetworkStatus(e), null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r4 = r2 + 7;
        o.r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE.onNavigationEvent = r4 % 128;
        r4 = r4 % 2;
        r2 = r2 + 57;
        o.r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE.onNavigationEvent = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r4 = 5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r4 = 0.7f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r3.onExtraCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMaxHeight");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if ((r5 & 1) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void IAuthTabCallback(r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE r8lambdap2aua7lenrxhmllpyd8tywkakee, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v10 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(float f) {
        Object dialog;
        BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0;
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            dialog = getDialog();
            int i3 = 82 / 0;
            brickModuleImplExternalSyntheticLambda0 = !(dialog instanceof BrickModuleImplExternalSyntheticLambda0) ? null : (BrickModuleImplExternalSyntheticLambda0) dialog;
        } else {
            dialog = getDialog();
            if (dialog instanceof BrickModuleImplExternalSyntheticLambda0) {
            }
        }
        if (brickModuleImplExternalSyntheticLambda0 != null) {
            brickModuleImplExternalSyntheticLambda0.onWarmupCompleted(f);
        }
        int i4 = onNavigationEvent + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
