package im.toss.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LiveData;
import com.jakewharton.rxbinding3.view.RxView;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.uikit.base.UIKitBaseFragment;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AFj1pSDK;
import o.AFj1rSDKExternalSyntheticLambda3;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.BrickModuleImplExternalSyntheticLambda3;
import o.DERSet;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.M_;
import o.NetConverter3;
import o.ReflectionUtils;
import o.ReflectionUtilsExternalSyntheticLambda0;
import o.RippleNode;
import o.SidecarAdapterExternalSyntheticLambda2;
import o.SidecarCompatTranslatingCallback;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.access8100;
import o.auth;
import o.clearWrite;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.generateInviteUrl;
import o.getByteBuffer;
import o.getConsentFlowUserGeography;
import o.getHostnameVerifierokhttp;
import o.getLastTrimMemoryLevel;
import o.getPreRenderJob;
import o.getWrite;
import o.isHidingNavigationBar;
import o.onAdViewAdDisplayFailed;
import o.onVisit;
import o.readIntokhttp;
import o.setEnabledAmazonAdUnitIds;
import o.setTid;
import o.startRearDisplaySession;
import o.varyFields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.LOW)
/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class BaseFragment extends UIKitBaseFragment implements getHostnameVerifierokhttp, isHidingNavigationBar {
    private static int IAuthTabCallback_Parcel = 1;
    private static int getInterfaceDescriptor;
    private final Lazy IAuthTabCallback;
    private BrickModuleImplExternalSyntheticLambda3 IAuthTabCallbackDefault;
    private setEnabledAmazonAdUnitIds IAuthTabCallbackStub;
    private final boolean access000;
    private final setTid<Boolean> asBinder;
    private final Lazy asInterface;
    private final Lazy onExtraCallback;
    private final Runnable onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private boolean onTransact;
    private AFj1rSDKExternalSyntheticLambda3 onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onNavigationEvent;

        public IAuthTabCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onWarmupCompleted + 35;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 35;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onNavigationEvent;
            int i5 = i2 + 33;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onExtraCallback + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                this.onNavigationEvent.invoke(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            this.onNavigationEvent.invoke(obj);
            int i3 = onWarmupCompleted + 83;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 13 / 0;
            }
        }
    }

    public static final /* synthetic */ class IAuthTabCallbackDefault implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public IAuthTabCallbackDefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        
            if ((r7 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        
            r1 = r1 + 17;
            im.toss.base.BaseFragment.IAuthTabCallbackDefault.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) r7).getFunctionDelegate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        
            if ((r7 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0))) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 13;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 / 0;
                }
            }
            int i5 = onExtraCallback + 1;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 57;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i2 + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            if (i3 != 0) {
                int i4 = 24 / 0;
            }
        }
    }

    public static final /* synthetic */ class IAuthTabCallbackStub implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onNavigationEvent;

        public IAuthTabCallbackStub(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onWarmupCompleted + 75;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 45;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i6 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 101;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onNavigationEvent;
            int i5 = i2 + 5;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            if (i3 != 0) {
                int i4 = 12 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.invoke(obj);
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class IAuthTabCallbackStubProxy implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onNavigationEvent;

        public IAuthTabCallbackStubProxy(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        
            if ((r5 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            r5 = kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) r5).getFunctionDelegate());
            r1 = im.toss.base.BaseFragment.IAuthTabCallbackStubProxy.onExtraCallback + 61;
            im.toss.base.BaseFragment.IAuthTabCallbackStubProxy.onWarmupCompleted = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            if ((r1 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            r0 = 47 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if ((r5 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0))) {
                int i2 = onWarmupCompleted + 7;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 94 / 0;
                }
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 51;
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
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.invoke(obj);
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
        }
    }

    public static final /* synthetic */ class IAuthTabCallback_Parcel implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 IAuthTabCallback;

        public IAuthTabCallback_Parcel(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if ((!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) || (!(obj instanceof FunctionAdapter))) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i3 = onWarmupCompleted + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 53;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i2 + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class ICustomTabsCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        public ICustomTabsCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i3 + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallback;
            int i5 = i2 + 9;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = onWarmupCompleted + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class ICustomTabsCallbackDefault implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        public ICustomTabsCallbackDefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0))) {
                int i2 = onExtraCallbackWithResult + 51;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                if (obj instanceof FunctionAdapter) {
                    int i5 = i3 + 11;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i7 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallback;
            int i5 = i2 + 15;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            if (i3 != 0) {
                int i4 = 46 / 0;
            }
        }
    }

    public static final /* synthetic */ class ICustomTabsCallbackStub implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 IAuthTabCallback;

        public ICustomTabsCallbackStub(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0))) {
                int i2 = onWarmupCompleted;
                int i3 = i2 + 7;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (obj instanceof FunctionAdapter) {
                    int i5 = i2 + 101;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    int i7 = onNavigationEvent + 121;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return zAreEqual;
                }
            }
            int i9 = onWarmupCompleted + 41;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class ICustomTabsCallbackStubProxy implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public ICustomTabsCallbackStubProxy(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i4 = IAuthTabCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return zAreEqual;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallbackWithResult.invoke(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            this.onExtraCallbackWithResult.invoke(obj);
            int i3 = onNavigationEvent + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final /* synthetic */ class ICustomTabsCallback_Parcel implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public ICustomTabsCallback_Parcel(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallbackWithResult;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallbackWithResult.invoke(obj);
        }
    }

    public static final /* synthetic */ class ICustomTabsService implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallback;

        public ICustomTabsService(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class access000 implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public access000(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
                if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                    if (obj instanceof FunctionAdapter) {
                        boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                        int i4 = onNavigationEvent + 105;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 54 / 0;
                        }
                        return zAreEqual;
                    }
                }
            } else if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i3 + 117;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onNavigationEvent + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
        }
    }

    public static final /* synthetic */ class access100 implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public access100(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i5 = i3 + 75;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i7 = i3 + 7;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = IAuthTabCallback + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class asBinder implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public asBinder(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0))) {
                int i2 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                if (obj instanceof FunctionAdapter) {
                    boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    int i4 = IAuthTabCallback + 53;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 27 / 0;
                    }
                    return zAreEqual;
                }
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i3 + 115;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            int i4 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class asInterface implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public asInterface(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if ((!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) || !(obj instanceof FunctionAdapter)) {
                int i2 = IAuthTabCallback + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IAuthTabCallback + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i3 + 9;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onNavigationEvent + 31;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class extraCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final /* synthetic */ Function1 onExtraCallback;

        public extraCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                throw null;
            }
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i3 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return zAreEqual;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 81;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Function1 function1 = this.onExtraCallback;
            int i4 = i2 + 121;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = getFunctionDelegate().hashCode();
                int i3 = 49 / 0;
            } else {
                iHashCode = getFunctionDelegate().hashCode();
            }
            int i4 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class extraCallbackWithResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final /* synthetic */ Function1 onNavigationEvent;

        public extraCallbackWithResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 49;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                int i6 = i4 + 33;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            int i8 = i2 + 19;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 41;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Function1 function1 = this.onNavigationEvent;
            int i4 = i2 + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onExtraCallback + 101;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 15 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.invoke(obj);
            int i4 = onExtraCallbackWithResult + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class extraCommand implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public extraCommand(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if ((!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i3 = IAuthTabCallback + 121;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i3 + 23;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 1;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.invoke(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            this.onWarmupCompleted.invoke(obj);
            int i3 = IAuthTabCallback + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final /* synthetic */ class getInterfaceDescriptor implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 onExtraCallback;

        public getInterfaceDescriptor(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onWarmupCompleted + 37;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 45;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i6 == 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            Function1 function1;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                function1 = this.onExtraCallback;
                int i4 = 28 / 0;
            } else {
                function1 = this.onExtraCallback;
            }
            int i5 = i3 + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            if (i3 == 0) {
                int i4 = 53 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = IAuthTabCallback + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class isEngagementSignalsApiAvailable implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 IAuthTabCallback;

        public isEngagementSignalsApiAvailable(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onWarmupCompleted;
            int i3 = i2 + 83;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i2 + 71;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                throw null;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i6 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i3 + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class mayLaunchUrl implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 IAuthTabCallback;

        public mayLaunchUrl(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.IAuthTabCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.IAuthTabCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class newAuthTabSession implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallback;

        public newAuthTabSession(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class newSession implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onWarmupCompleted;

        public newSession(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onWarmupCompleted;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onWarmupCompleted.invoke(obj);
        }
    }

    public static final /* synthetic */ class newSessionWithExtras implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onNavigationEvent;

        public newSessionWithExtras(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onNavigationEvent;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onNavigationEvent.invoke(obj);
        }
    }

    public static final /* synthetic */ class onActivityLayout implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public onActivityLayout(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 29 / 0;
                if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                    if (obj instanceof FunctionAdapter) {
                        boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                        int i4 = IAuthTabCallback + 21;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            return zAreEqual;
                        }
                        throw null;
                    }
                }
            } else if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0))) {
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i2 + 25;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 68 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = IAuthTabCallback + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            int i4 = IAuthTabCallback + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
        }
    }

    public static final /* synthetic */ class onActivityResized implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public onActivityResized(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                int i2 = onNavigationEvent + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IAuthTabCallback + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            if (i5 != 0) {
                int i6 = 66 / 0;
            }
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i3 + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            int i4 = IAuthTabCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class onExtraCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onExtraCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i5 = i3 + 45;
            int i6 = i5 % 128;
            onWarmupCompleted = i6;
            int i7 = i5 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i8 = i6 + 49;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            FunctionAdapter functionAdapter = (FunctionAdapter) obj;
            if (i9 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            }
            Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i2 + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onWarmupCompleted + 79;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class onExtraCallbackWithResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public onExtraCallbackWithResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 47;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i6 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Function1 function1 = this.onWarmupCompleted;
            int i4 = i3 + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 95;
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
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class onMessageChannelReady implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onMessageChannelReady(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 27;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i2 + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            FunctionAdapter functionAdapter = (FunctionAdapter) obj;
            if (i5 == 0) {
                return Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            }
            Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i3 + 11;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onExtraCallback + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
        }
    }

    public static final /* synthetic */ class onMinimized implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onMinimized(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i5 = i3 + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z = obj instanceof FunctionAdapter;
                throw null;
            }
            if (obj instanceof FunctionAdapter) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 75;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            Function1 function1 = this.onExtraCallbackWithResult;
            int i4 = i2 + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return function1;
            }
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = IAuthTabCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
        }
    }

    public static final /* synthetic */ class onNavigationEvent implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public onNavigationEvent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                int i4 = i3 + 63;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = i3 + 19;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            if (i7 != 0) {
                int i8 = 4 / 0;
            }
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i2 + 97;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = getFunctionDelegate().hashCode();
                int i3 = 17 / 0;
            } else {
                iHashCode = getFunctionDelegate().hashCode();
            }
            int i4 = onExtraCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.invoke(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            this.onWarmupCompleted.invoke(obj);
            int i3 = onExtraCallbackWithResult + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final /* synthetic */ class onPostMessage implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallback;

        public onPostMessage(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 115;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 == 0) {
                int i5 = 50 / 0;
                if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0))) {
                    if (obj instanceof FunctionAdapter) {
                        int i6 = i2 + 93;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        clearWrite functionDelegate = getFunctionDelegate();
                        FunctionAdapter functionAdapter = (FunctionAdapter) obj;
                        if (i7 != 0) {
                            return Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
                        }
                        boolean zAreEqual = Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
                        int i8 = 66 / 0;
                        return zAreEqual;
                    }
                }
            } else if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
            }
            int i9 = i4 + 97;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 89;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function1 function1 = this.onExtraCallback;
            int i4 = i2 + 121;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = IAuthTabCallback + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback.invoke(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            this.onExtraCallback.invoke(obj);
            int i3 = IAuthTabCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final /* synthetic */ class onRelationshipValidationResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onRelationshipValidationResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 11;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i5 = i2 + 107;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                if (!(!(obj instanceof FunctionAdapter))) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }
            boolean z = obj instanceof FunctionAdapter;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i2 + 65;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = IAuthTabCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = IAuthTabCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class onTransact implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 IAuthTabCallback;

        public onTransact(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 57;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                throw null;
            }
            if ((!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i2 + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function1 function1 = this.IAuthTabCallback;
            int i4 = i3 + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onWarmupCompleted + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class onUnminimized implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 IAuthTabCallback;

        public onUnminimized(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onWarmupCompleted + 13;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 71;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 31;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i2 + 45;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class postMessage implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onNavigationEvent;

        public postMessage(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onNavigationEvent;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onNavigationEvent.invoke(obj);
        }
    }

    public static final /* synthetic */ class prefetch implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public prefetch(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallbackWithResult;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallbackWithResult.invoke(obj);
        }
    }

    public static final /* synthetic */ class readTypedObject implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onNavigationEvent;

        public readTypedObject(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i4 = onWarmupCompleted + 11;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 27;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function1 function1 = this.onNavigationEvent;
            int i4 = i2 + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class writeTypedObject implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallback;

        public writeTypedObject(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 77;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i2 + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            if (i5 != 0) {
                int i6 = 47 / 0;
            }
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallback;
            int i5 = i2 + 101;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 47;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    /* renamed from: $r8$lambda$-wvZuYBoQ0VfUesmbpMGRrcBdAI, reason: not valid java name */
    public static /* synthetic */ ReflectionUtils m69$r8$lambda$wvZuYBoQ0VfUesmbpMGRrcBdAI(BaseFragment baseFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ReflectionUtils reflectionUtilsEntryPoint_delegate$lambda$0 = entryPoint_delegate$lambda$0(baseFragment);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return reflectionUtilsEntryPoint_delegate$lambda$0;
    }

    /* renamed from: $r8$lambda$6w9PDwlCBLsbJ0GsPd9KLmZQe-E, reason: not valid java name */
    public static /* synthetic */ Unit m70$r8$lambda$6w9PDwlCBLsbJ0GsPd9KLmZQeE(BaseFragment baseFragment, Unit unit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnViewCreated$lambda$0 = onViewCreated$lambda$0(baseFragment, unit);
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnViewCreated$lambda$0;
    }

    public static /* synthetic */ ReflectionUtilsExternalSyntheticLambda0 $r8$lambda$I_Qo2axo8GHfzsSeDKoSMGDD0Wg(BaseFragment baseFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return statusManagerDelegate_delegate$lambda$0(baseFragment);
        }
        statusManagerDelegate_delegate$lambda$0(baseFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ SidecarCompatTranslatingCallback $r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4(BaseFragment baseFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return baseCommonDelegate_delegate$lambda$0(baseFragment);
        }
        baseCommonDelegate_delegate$lambda$0(baseFragment);
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$JNYO8XBEK42CipEirKBbCVqozLo(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onViewCreated$lambda$1(function1, obj);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        int i5 = getInterfaceDescriptor + 17;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$QDj1MgqtNN_FIK5j32yCAT9ZWVs(BaseFragment baseFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        dismissProgressCallback$lambda$0(baseFragment);
        int i4 = IAuthTabCallback_Parcel + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit $r8$lambda$qavPNxKsDX05vISgTOe9apV509w(BaseFragment baseFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onCreate$lambda$1(baseFragment, bool);
        }
        onCreate$lambda$1(baseFragment, bool);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$vHoShs-Sc3jFYrxlXSEHZImaoig, reason: not valid java name */
    public static /* synthetic */ void m71$r8$lambda$vHoShsSc3jFYrxlXSEHZImaoig(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onCreate$lambda$2(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: $r8$lambda$vQwy-DQp6WlG9I5aedIAl_CK06A, reason: not valid java name */
    public static /* synthetic */ SidecarAdapterExternalSyntheticLambda2 m72$r8$lambda$vQwyDQp6WlG9I5aedIAl_CK06A(BaseFragment baseFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SidecarAdapterExternalSyntheticLambda2 sidecarAdapterExternalSyntheticLambda2AppStateManagerDelegate_delegate$lambda$0 = appStateManagerDelegate_delegate$lambda$0(baseFragment);
        int i4 = getInterfaceDescriptor + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return sidecarAdapterExternalSyntheticLambda2AppStateManagerDelegate_delegate$lambda$0;
    }

    protected View getFocusableInput() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 21;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public boolean onBackPressed() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public void onNewArgument(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
    }

    public /* bridge */ boolean getAllowTraversingChildFragment() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean allowTraversingChildFragment = super.getAllowTraversingChildFragment();
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return allowTraversingChildFragment;
    }

    public /* bridge */ boolean getDiscoversCandidatesOnDraw() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean discoversCandidatesOnDraw = super.getDiscoversCandidatesOnDraw();
        int i4 = IAuthTabCallback_Parcel + 31;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return discoversCandidatesOnDraw;
    }

    public /* bridge */ boolean isLcpTrackable() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsLcpTrackable = super.isLcpTrackable();
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return zIsLcpTrackable;
    }

    private final ReflectionUtils getEntryPoint() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ReflectionUtils reflectionUtils = (ReflectionUtils) this.IAuthTabCallback.getValue();
        int i3 = getInterfaceDescriptor + 3;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return reflectionUtils;
    }

    private static final ReflectionUtils entryPoint_delegate$lambda$0(BaseFragment baseFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            ReflectionUtils.onExtraCallbackWithResult onextracallbackwithresult = ReflectionUtils.Companion;
            Context contextRequireContext = baseFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            return onextracallbackwithresult.IAuthTabCallback(contextRequireContext);
        }
        ReflectionUtils.onExtraCallbackWithResult onextracallbackwithresult2 = ReflectionUtils.Companion;
        Context contextRequireContext2 = baseFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        onextracallbackwithresult2.IAuthTabCallback(contextRequireContext2);
        throw null;
    }

    private final SidecarCompatTranslatingCallback getBaseCommonDelegate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback = (SidecarCompatTranslatingCallback) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallback_Parcel + 41;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return sidecarCompatTranslatingCallback;
    }

    private static final SidecarCompatTranslatingCallback baseCommonDelegate_delegate$lambda$0(BaseFragment baseFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        SidecarCompatTranslatingCallback sidecarCompatTranslatingCallbackOnTransact = baseFragment.getEntryPoint().onTransact();
        int i4 = IAuthTabCallback_Parcel + 117;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return sidecarCompatTranslatingCallbackOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final SidecarAdapterExternalSyntheticLambda2 getAppStateManagerDelegate() {
        SidecarAdapterExternalSyntheticLambda2 sidecarAdapterExternalSyntheticLambda2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            sidecarAdapterExternalSyntheticLambda2 = (SidecarAdapterExternalSyntheticLambda2) this.onExtraCallback.getValue();
            int i3 = 12 / 0;
        } else {
            sidecarAdapterExternalSyntheticLambda2 = (SidecarAdapterExternalSyntheticLambda2) this.onExtraCallback.getValue();
        }
        int i4 = IAuthTabCallback_Parcel + 117;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return sidecarAdapterExternalSyntheticLambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final SidecarAdapterExternalSyntheticLambda2 appStateManagerDelegate_delegate$lambda$0(BaseFragment baseFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SidecarAdapterExternalSyntheticLambda2 sidecarAdapterExternalSyntheticLambda2AsBinder = baseFragment.getEntryPoint().asBinder();
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return sidecarAdapterExternalSyntheticLambda2AsBinder;
    }

    private final ReflectionUtilsExternalSyntheticLambda0 getStatusManagerDelegate() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ReflectionUtilsExternalSyntheticLambda0 reflectionUtilsExternalSyntheticLambda0 = (ReflectionUtilsExternalSyntheticLambda0) this.asInterface.getValue();
        if (i3 != 0) {
            return reflectionUtilsExternalSyntheticLambda0;
        }
        throw null;
    }

    private static final ReflectionUtilsExternalSyntheticLambda0 statusManagerDelegate_delegate$lambda$0(BaseFragment baseFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ReflectionUtils entryPoint = baseFragment.getEntryPoint();
        if (i3 != 0) {
            entryPoint.access100();
            obj.hashCode();
            throw null;
        }
        ReflectionUtilsExternalSyntheticLambda0 reflectionUtilsExternalSyntheticLambda0Access100 = entryPoint.access100();
        int i4 = IAuthTabCallback_Parcel + 45;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return reflectionUtilsExternalSyntheticLambda0Access100;
        }
        obj.hashCode();
        throw null;
    }

    public final setTid<Boolean> getMultiWindowMode() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        setTid<Boolean> settid = this.asBinder;
        int i5 = i3 + 91;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return settid;
        }
        throw null;
    }

    private static final void dismissProgressCallback$lambda$0(BaseFragment baseFragment) {
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = baseFragment.getActivity();
        if (activity == null || activity.isFinishing() || (brickModuleImplExternalSyntheticLambda3 = baseFragment.IAuthTabCallbackDefault) == null || !brickModuleImplExternalSyntheticLambda3.isShowing()) {
            return;
        }
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda32 = baseFragment.IAuthTabCallbackDefault;
        if (brickModuleImplExternalSyntheticLambda32 != null) {
            brickModuleImplExternalSyntheticLambda32.dismiss();
            int i4 = IAuthTabCallback_Parcel + 71;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        baseFragment.IAuthTabCallbackDefault = null;
    }

    public final BaseActivity getBaseActivity() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            getActivity();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseActivity activity = getActivity();
        int i3 = getInterfaceDescriptor + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return activity;
    }

    protected boolean getUseStackAnimation() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.access000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseFragment() {
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                BaseFragment baseFragment = this.f$0;
                if (i3 != 0) {
                    return BaseFragment.m69$r8$lambda$wvZuYBoQ0VfUesmbpMGRrcBdAI(baseFragment);
                }
                BaseFragment.m69$r8$lambda$wvZuYBoQ0VfUesmbpMGRrcBdAI(baseFragment);
                throw null;
            }
        });
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4;
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    sidecarCompatTranslatingCallback$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4 = BaseFragment.$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4(this.f$0);
                    int i3 = 18 / 0;
                } else {
                    sidecarCompatTranslatingCallback$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4 = BaseFragment.$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4(this.f$0);
                }
                int i4 = onExtraCallback + 91;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return sidecarCompatTranslatingCallback$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4;
                }
                throw null;
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    BaseFragment.m72$r8$lambda$vQwyDQp6WlG9I5aedIAl_CK06A(this.f$0);
                    throw null;
                }
                SidecarAdapterExternalSyntheticLambda2 sidecarAdapterExternalSyntheticLambda2M72$r8$lambda$vQwyDQp6WlG9I5aedIAl_CK06A = BaseFragment.m72$r8$lambda$vQwyDQp6WlG9I5aedIAl_CK06A(this.f$0);
                int i3 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return sidecarAdapterExternalSyntheticLambda2M72$r8$lambda$vQwyDQp6WlG9I5aedIAl_CK06A;
            }
        });
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    BaseFragment.$r8$lambda$I_Qo2axo8GHfzsSeDKoSMGDD0Wg(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ReflectionUtilsExternalSyntheticLambda0 reflectionUtilsExternalSyntheticLambda0$r8$lambda$I_Qo2axo8GHfzsSeDKoSMGDD0Wg = BaseFragment.$r8$lambda$I_Qo2axo8GHfzsSeDKoSMGDD0Wg(this.f$0);
                int i3 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return reflectionUtilsExternalSyntheticLambda0$r8$lambda$I_Qo2axo8GHfzsSeDKoSMGDD0Wg;
            }
        });
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        this.asBinder = settidOnNavigationEvent;
        this.onExtraCallbackWithResult = new Runnable() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 33;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    BaseFragment.$r8$lambda$QDj1MgqtNN_FIK5j32yCAT9ZWVs(this.f$0);
                    int i3 = 32 / 0;
                } else {
                    BaseFragment.$r8$lambda$QDj1MgqtNN_FIK5j32yCAT9ZWVs(this.f$0);
                }
                int i4 = IAuthTabCallback + 39;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        this.IAuthTabCallbackStub = setEnabledAmazonAdUnitIds.UNDEFINED;
    }

    public BaseFragment(int i) {
        super(i);
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onWarmupCompleted + 107;
                IAuthTabCallback = i22 % 128;
                int i3 = i22 % 2;
                BaseFragment baseFragment = this.f$0;
                if (i3 != 0) {
                    return BaseFragment.m69$r8$lambda$wvZuYBoQ0VfUesmbpMGRrcBdAI(baseFragment);
                }
                BaseFragment.m69$r8$lambda$wvZuYBoQ0VfUesmbpMGRrcBdAI(baseFragment);
                throw null;
            }
        });
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4;
                int i2 = 2 % 2;
                int i22 = onExtraCallback + 125;
                onWarmupCompleted = i22 % 128;
                if (i22 % 2 == 0) {
                    sidecarCompatTranslatingCallback$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4 = BaseFragment.$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4(this.f$0);
                    int i3 = 18 / 0;
                } else {
                    sidecarCompatTranslatingCallback$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4 = BaseFragment.$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4(this.f$0);
                }
                int i4 = onExtraCallback + 91;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return sidecarCompatTranslatingCallback$r8$lambda$JMKiElIhxQNiJxQxaiUYfoPTSX4;
                }
                throw null;
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i22 % 128;
                if (i22 % 2 == 0) {
                    BaseFragment.m72$r8$lambda$vQwyDQp6WlG9I5aedIAl_CK06A(this.f$0);
                    throw null;
                }
                SidecarAdapterExternalSyntheticLambda2 sidecarAdapterExternalSyntheticLambda2M72$r8$lambda$vQwyDQp6WlG9I5aedIAl_CK06A = BaseFragment.m72$r8$lambda$vQwyDQp6WlG9I5aedIAl_CK06A(this.f$0);
                int i3 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return sidecarAdapterExternalSyntheticLambda2M72$r8$lambda$vQwyDQp6WlG9I5aedIAl_CK06A;
            }
        });
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i22 % 128;
                if (i22 % 2 == 0) {
                    BaseFragment.$r8$lambda$I_Qo2axo8GHfzsSeDKoSMGDD0Wg(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ReflectionUtilsExternalSyntheticLambda0 reflectionUtilsExternalSyntheticLambda0$r8$lambda$I_Qo2axo8GHfzsSeDKoSMGDD0Wg = BaseFragment.$r8$lambda$I_Qo2axo8GHfzsSeDKoSMGDD0Wg(this.f$0);
                int i3 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return reflectionUtilsExternalSyntheticLambda0$r8$lambda$I_Qo2axo8GHfzsSeDKoSMGDD0Wg;
            }
        });
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        this.asBinder = settidOnNavigationEvent;
        this.onExtraCallbackWithResult = new Runnable() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i22 = onNavigationEvent + 33;
                IAuthTabCallback = i22 % 128;
                if (i22 % 2 != 0) {
                    BaseFragment.$r8$lambda$QDj1MgqtNN_FIK5j32yCAT9ZWVs(this.f$0);
                    int i3 = 32 / 0;
                } else {
                    BaseFragment.$r8$lambda$QDj1MgqtNN_FIK5j32yCAT9ZWVs(this.f$0);
                }
                int i4 = IAuthTabCallback + 39;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        this.IAuthTabCallbackStub = setEnabledAmazonAdUnitIds.UNDEFINED;
    }

    public final BaseActivity requireBaseActivity() {
        BaseActivity baseActivity;
        int i = 2 % 2;
        BaseActivity baseActivityRequireActivity = requireActivity();
        if (baseActivityRequireActivity instanceof BaseActivity) {
            baseActivity = baseActivityRequireActivity;
        } else {
            int i2 = getInterfaceDescriptor + 43;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            baseActivity = null;
        }
        if (baseActivity != null) {
            int i4 = IAuthTabCallback_Parcel + 9;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return baseActivity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an base activity.");
    }

    public final boolean isVisibleToUser() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onTransact;
        int i4 = i3 + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return z;
    }

    public final void setVisibleToUser(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.onTransact = z;
        int i5 = i3 + 87;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public setEnabledAmazonAdUnitIds getSecureScreenMode() {
        setEnabledAmazonAdUnitIds setenabledamazonadunitids;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            setenabledamazonadunitids = this.IAuthTabCallbackStub;
            int i4 = 0 / 0;
        } else {
            setenabledamazonadunitids = this.IAuthTabCallbackStub;
        }
        int i5 = i3 + 107;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return setenabledamazonadunitids;
    }

    public void setSecureScreenMode(@NotNull setEnabledAmazonAdUnitIds setenabledamazonadunitids) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setenabledamazonadunitids, "");
            this.IAuthTabCallbackStub = setenabledamazonadunitids;
        } else {
            Intrinsics.checkNotNullParameter(setenabledamazonadunitids, "");
            this.IAuthTabCallbackStub = setenabledamazonadunitids;
            throw null;
        }
    }

    public void showLoadingIndicator(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (isLoadingIndicatorShowing()) {
            return;
        }
        if (str == null) {
            int i4 = IAuthTabCallback_Parcel + 51;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                showProgressDialog$default(this, null, true, 5, null);
                return;
            } else {
                showProgressDialog$default(this, null, false, 3, null);
                return;
            }
        }
        showProgressDialog(str, false);
        int i5 = IAuthTabCallback_Parcel + 99;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public void dismissLoadingIndicator() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        dismissProgressDialog();
        int i4 = IAuthTabCallback_Parcel + 55;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean isLoadingIndicatorShowing() {
        int i = 2 % 2;
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3 = this.IAuthTabCallbackDefault;
        if (brickModuleImplExternalSyntheticLambda3 == null || !brickModuleImplExternalSyntheticLambda3.isShowing()) {
            return false;
        }
        int i2 = IAuthTabCallback_Parcel + 19;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super/*androidx.fragment.app.Fragment*/.onAttach(context);
        int i4 = IAuthTabCallback_Parcel + 37;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onCreate$lambda$2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onCreate$lambda$1(BaseFragment baseFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(bool);
            baseFragment.onTransact = bool.booleanValue();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(bool);
        baseFragment.onTransact = bool.booleanValue();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        setEnabledAmazonAdUnitIds setenabledamazonadunitids;
        int i = 2 % 2;
        Annotation[] annotations = getClass().getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "");
        ArrayList arrayList = new ArrayList();
        boolean zIsInMultiWindowMode = false;
        for (Annotation annotation : annotations) {
            if (annotation instanceof EmbeddingAdapterExternalSyntheticLambda1) {
                int i2 = getInterfaceDescriptor + 93;
                IAuthTabCallback_Parcel = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(annotation);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(annotation);
            }
        }
        EmbeddingAdapterExternalSyntheticLambda1 embeddingAdapterExternalSyntheticLambda1 = (EmbeddingAdapterExternalSyntheticLambda1) CollectionsKt.firstOrNull(arrayList);
        if (embeddingAdapterExternalSyntheticLambda1 != null) {
            if (embeddingAdapterExternalSyntheticLambda1.IAuthTabCallback()) {
                setenabledamazonadunitids = setEnabledAmazonAdUnitIds.SECURE;
            } else {
                setenabledamazonadunitids = setEnabledAmazonAdUnitIds.NON_SECURE;
                int i3 = IAuthTabCallback_Parcel + 13;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
            }
            setSecureScreenMode(setenabledamazonadunitids);
        }
        super.onCreate(bundle);
        getAppStateManagerDelegate().onExtraCallbackWithResult(this);
        this.onWarmupCompleted = new AFj1rSDKExternalSyntheticLambda3(this);
        getByteBuffer getbytebufferAsBinder = getVisibleState().asBinder();
        final Function1 function1 = new Function1() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2) {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 101;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Unit unit$r8$lambda$qavPNxKsDX05vISgTOe9apV509w = BaseFragment.$r8$lambda$qavPNxKsDX05vISgTOe9apV509w(this.f$0, (Boolean) obj2);
                int i8 = onNavigationEvent + 69;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 95 / 0;
                }
                return unit$r8$lambda$qavPNxKsDX05vISgTOe9apV509w;
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferAsBinder.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void accept(Object obj2) {
                int i5 = 2 % 2;
                int i6 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i6 % 128;
                Object obj3 = null;
                if (i6 % 2 == 0) {
                    BaseFragment.m71$r8$lambda$vHoShsSc3jFYrxlXSEHZImaoig(function1, obj2);
                    obj3.hashCode();
                    throw null;
                }
                BaseFragment.m71$r8$lambda$vHoShsSc3jFYrxlXSEHZImaoig(function1, obj2);
                int i7 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    return;
                }
                obj3.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        setTid<Boolean> settid = this.asBinder;
        if (isAdded()) {
            int i5 = IAuthTabCallback_Parcel + 69;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            zIsInMultiWindowMode = requireActivity().isInMultiWindowMode();
        }
        settid.onExtraCallback(Boolean.valueOf(zIsInMultiWindowMode));
        auth.IAuthTabCallback(auth.onNavigationEvent, onVisit.IAuthTabCallback(this) + "#onCreate()", null, null, 6, null);
    }

    private static final void onViewCreated$lambda$1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onViewCreated$lambda$0(BaseFragment baseFragment, Unit unit) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        baseFragment.onFirstGlobalLayout();
        Unit unit2 = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 73;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return unit2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getByteBuffer getbytebufferOnExtraCallbackWithResult = RxView.IAuthTabCallback(view).onExtraCallback(1L).onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda7
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                Unit unitM70$r8$lambda$6w9PDwlCBLsbJ0GsPd9KLmZQeE;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 83;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    unitM70$r8$lambda$6w9PDwlCBLsbJ0GsPd9KLmZQeE = BaseFragment.m70$r8$lambda$6w9PDwlCBLsbJ0GsPd9KLmZQeE(this.f$0, (Unit) obj);
                    int i4 = 50 / 0;
                } else {
                    unitM70$r8$lambda$6w9PDwlCBLsbJ0GsPd9KLmZQeE = BaseFragment.m70$r8$lambda$6w9PDwlCBLsbJ0GsPd9KLmZQeE(this.f$0, (Unit) obj);
                }
                int i5 = onExtraCallback + 27;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitM70$r8$lambda$6w9PDwlCBLsbJ0GsPd9KLmZQeE;
                }
                throw null;
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnExtraCallbackWithResult.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.base.BaseFragment$$ExternalSyntheticLambda8
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                BaseFragment.$r8$lambda$JNYO8XBEK42CipEirKBbCVqozLo(function1, obj);
                int i5 = onWarmupCompleted + 61;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        getStatusManagerDelegate().onWarmupCompleted(this);
        auth.IAuthTabCallback(auth.onNavigationEvent, onVisit.IAuthTabCallback(this) + "#onViewCreated()", null, null, 6, null);
        int i2 = getInterfaceDescriptor + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(menuItem, "");
            menuItem.getItemId();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() != 16908332) {
            return super/*androidx.fragment.app.Fragment*/.onOptionsItemSelected(menuItem);
        }
        int i3 = getInterfaceDescriptor + 83;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnBackPressed = onBackPressed();
        int i5 = IAuthTabCallback_Parcel + 63;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return zOnBackPressed;
    }

    public static /* synthetic */ boolean canShowSoftInput$default(BaseFragment baseFragment, View view, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canShowSoftInput");
        }
        int i3 = IAuthTabCallback_Parcel + 13;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            view = baseFragment.getFocusableInput();
        }
        boolean zCanShowSoftInput = baseFragment.canShowSoftInput(view);
        int i4 = getInterfaceDescriptor + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return zCanShowSoftInput;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean canShowSoftInput(@Nullable View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Intrinsics.checkNotNullExpressionValue(contextRequireContext.getResources().getConfiguration(), "");
            if (!readIntokhttp.IAuthTabCallback(r1)) {
            }
        } else {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            Configuration configuration = contextRequireContext2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            int i3 = 32 / 0;
            if (readIntokhttp.IAuthTabCallback(configuration)) {
                int i4 = getInterfaceDescriptor + 115;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    getBaseCommonDelegate().onNavigationEvent(this, view);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (getBaseCommonDelegate().onNavigationEvent(this, view)) {
                    Context contextRequireContext3 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                    if (!varyFields.onWarmupCompleted(contextRequireContext3)) {
                        int i5 = IAuthTabCallback_Parcel + 79;
                        getInterfaceDescriptor = i5 % 128;
                        return i5 % 2 == 0;
                    }
                }
            }
        }
        return false;
    }

    public void onDestroy() {
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3;
        int i = 2 % 2;
        View view = getView();
        if (view != null) {
            int i2 = getInterfaceDescriptor + 109;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                view.removeCallbacks(this.onExtraCallbackWithResult);
                int i3 = 6 / 0;
            } else {
                view.removeCallbacks(this.onExtraCallbackWithResult);
            }
        }
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda32 = this.IAuthTabCallbackDefault;
        if (brickModuleImplExternalSyntheticLambda32 != null && brickModuleImplExternalSyntheticLambda32.isShowing() && (brickModuleImplExternalSyntheticLambda3 = this.IAuthTabCallbackDefault) != null) {
            int i4 = getInterfaceDescriptor + 61;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            brickModuleImplExternalSyntheticLambda3.dismiss();
        }
        if (getSecureScreenMode() == setEnabledAmazonAdUnitIds.SECURE) {
            int i6 = IAuthTabCallback_Parcel;
            int i7 = i6 + 9;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            AFj1rSDKExternalSyntheticLambda3 aFj1rSDKExternalSyntheticLambda3 = this.onWarmupCompleted;
            if (aFj1rSDKExternalSyntheticLambda3 != null) {
                int i9 = i6 + 79;
                getInterfaceDescriptor = i9 % 128;
                if (i9 % 2 != 0) {
                    aFj1rSDKExternalSyntheticLambda3.onExtraCallback();
                    throw null;
                }
                aFj1rSDKExternalSyntheticLambda3.onExtraCallback();
            }
        }
        auth.IAuthTabCallback(auth.onNavigationEvent, onVisit.IAuthTabCallback(this) + "#onDestroy()", null, null, 6, null);
        super.onDestroy();
        int i10 = getInterfaceDescriptor + 95;
        IAuthTabCallback_Parcel = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 45 / 0;
        }
    }

    public void onDestroyView() {
        int i = 2 % 2;
        auth.IAuthTabCallback(auth.onNavigationEvent, onVisit.IAuthTabCallback(this) + "#onDestroyView()", null, null, 6, null);
        super.onDestroyView();
        int i2 = IAuthTabCallback_Parcel + 53;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        updateSecureScreenStatus();
        auth.IAuthTabCallback(auth.onNavigationEvent, onVisit.IAuthTabCallback(this) + "#onStart()", null, null, 6, null);
        int i2 = IAuthTabCallback_Parcel + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void onStop() {
        int i = 2 % 2;
        super.onStop();
        auth.IAuthTabCallback(auth.onNavigationEvent, onVisit.IAuthTabCallback(this) + "#onStop()", null, null, 6, null);
        int i2 = getInterfaceDescriptor + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUserVisibleHint(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            super.setUserVisibleHint(z);
            if (z && (getActivity() instanceof BaseActivity)) {
                int i3 = getInterfaceDescriptor + 55;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseActivity activity = getActivity();
                    Intrinsics.checkNotNull(activity, "");
                    activity.br_();
                    setEnabledAmazonAdUnitIds setenabledamazonadunitids = setEnabledAmazonAdUnitIds.UNDEFINED;
                    throw null;
                }
                BaseActivity activity2 = getActivity();
                Intrinsics.checkNotNull(activity2, "");
                if (activity2.br_() == setEnabledAmazonAdUnitIds.UNDEFINED) {
                    updateSecureScreenStatus();
                    int i4 = getInterfaceDescriptor + 31;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                return;
            }
            return;
        }
        super.setUserVisibleHint(z);
        throw null;
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 77;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            super/*androidx.fragment.app.Fragment*/.onRequestPermissionsResult(i, strArr, iArr);
            getLastTrimMemoryLevel.Companion.onNavigationEvent().IAuthTabCallback(i, strArr, iArr);
            return;
        }
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super/*androidx.fragment.app.Fragment*/.onRequestPermissionsResult(i, strArr, iArr);
        getLastTrimMemoryLevel.Companion.onNavigationEvent().IAuthTabCallback(i, strArr, iArr);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onFirstGlobalLayout() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onFirstGlobalLayout();
        setAnimateStack();
        autoFocusInput();
        int i4 = IAuthTabCallback_Parcel + 25;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    protected final void autoFocusInput() {
        View focusableInput;
        int i = 2 % 2;
        if (!canShowSoftInput$default(this, null, 1, null) || (focusableInput = getFocusableInput()) == null) {
            return;
        }
        if (focusableInput instanceof TextView) {
            int i2 = getInterfaceDescriptor + 7;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            if (!((TextView) focusableInput).getShowSoftInputOnFocus()) {
                int i4 = IAuthTabCallback_Parcel + 81;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                focusableInput.requestFocus();
                return;
            }
        }
        M_.onNavigationEvent(1312897292, new Object[]{M_.onExtraCallback, focusableInput}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    private final void setAnimateStack() {
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (getUseStackAnimation()) {
                int i3 = getInterfaceDescriptor + 117;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                View view = getView();
                if (!(!(view instanceof ViewGroup))) {
                    int i5 = IAuthTabCallback_Parcel + 101;
                    getInterfaceDescriptor = i5 % 128;
                    viewGroup = (ViewGroup) view;
                    if (i5 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    int i6 = getInterfaceDescriptor + 3;
                    IAuthTabCallback_Parcel = i6 % 128;
                    if (i6 % 2 != 0) {
                        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                        generateInviteUrl.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -178321738, new Object[]{viewGroup}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 178321741);
                        return;
                    }
                    int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                    int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                    generateInviteUrl.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -178321738, new Object[]{viewGroup}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback4, 178321741);
                    throw null;
                }
                return;
            }
            return;
        }
        getUseStackAnimation();
        obj.hashCode();
        throw null;
    }

    public final void invalidateOptionsMenu() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i4 = IAuthTabCallback_Parcel + 107;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                if (hasOptionsMenu()) {
                    activity.invalidateOptionsMenu();
                }
            } else {
                hasOptionsMenu();
                throw null;
            }
        }
        int i5 = getInterfaceDescriptor + 97;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void hideSoftKeyboard() {
        View currentFocus;
        FragmentActivity activity;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (getActivity() == null || (activity = getActivity()) == null) {
            int i4 = getInterfaceDescriptor + 77;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 4;
            }
            currentFocus = null;
        } else {
            currentFocus = activity.getCurrentFocus();
            int i6 = getInterfaceDescriptor + 17;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        if (currentFocus != null) {
            FragmentActivity activity2 = getActivity();
            InputMethodManager inputMethodManager = (InputMethodManager) (activity2 != null ? activity2.getSystemService("input_method") : null);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    public final void hideSoftKeyboard(@Nullable View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 11;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (view != null) {
            int i5 = i2 + 51;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            FragmentActivity activity = getActivity();
            InputMethodManager inputMethodManager = (InputMethodManager) (activity != null ? activity.getSystemService("input_method") : null);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    private final void updateSecureScreenStatus() {
        int i = 2 % 2;
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            int i2 = IAuthTabCallback_Parcel + 35;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                BaseActivity baseActivity = (BaseActivity) activity;
                if (baseActivity.br_() != setEnabledAmazonAdUnitIds.SECURE) {
                    BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1566333150, new Object[]{baseActivity, getSecureScreenMode()}, -1566333132, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                    baseActivity.newSession();
                    return;
                }
                return;
            }
            ((BaseActivity) activity).br_();
            setEnabledAmazonAdUnitIds setenabledamazonadunitids = setEnabledAmazonAdUnitIds.SECURE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (activity != null) {
            int i3 = IAuthTabCallback_Parcel + 111;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            if (getSecureScreenMode() == setEnabledAmazonAdUnitIds.SECURE) {
                int i5 = IAuthTabCallback_Parcel + 123;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                activity.getWindow().addFlags(8192);
                getConsentFlowUserGeography.onWarmupCompleted(activity, true);
                return;
            }
            if (getSecureScreenMode() == setEnabledAmazonAdUnitIds.NON_SECURE) {
                activity.getWindow().clearFlags(8192);
                getConsentFlowUserGeography.onWarmupCompleted(activity, false);
            }
        }
    }

    public static /* synthetic */ void showProgressDialog$default(BaseFragment baseFragment, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgressDialog");
        }
        int i3 = getInterfaceDescriptor;
        int i4 = i3 + 121;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 27;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            str = baseFragment.getString(R.string.base_please_wait);
            Intrinsics.checkNotNullExpressionValue(str, "");
            int i7 = getInterfaceDescriptor + 25;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        baseFragment.showProgressDialog(str, z);
        int i9 = IAuthTabCallback_Parcel + 111;
        getInterfaceDescriptor = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void showProgressDialog(@NotNull String str, boolean z) {
        FragmentActivity activity;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        View view = getView();
        if (view != null) {
            view.removeCallbacks(this.onExtraCallbackWithResult);
        }
        if (!isAdded() || (activity = getActivity()) == null || activity.isFinishing()) {
            return;
        }
        if (this.IAuthTabCallbackDefault == null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            this.IAuthTabCallbackDefault = new BrickModuleImplExternalSyntheticLambda3(contextRequireContext);
            int i4 = getInterfaceDescriptor + 85;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3 = this.IAuthTabCallbackDefault;
        if (brickModuleImplExternalSyntheticLambda3 != null) {
            if (str.length() == 0) {
                int i6 = getInterfaceDescriptor + 21;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                str = getString(R.string.base_please_wait);
            }
            brickModuleImplExternalSyntheticLambda3.onExtraCallbackWithResult(str);
            brickModuleImplExternalSyntheticLambda3.setCancelable(z);
            int i8 = getInterfaceDescriptor + 83;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 5;
            }
        }
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda32 = this.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(brickModuleImplExternalSyntheticLambda32);
        if (brickModuleImplExternalSyntheticLambda32.isShowing()) {
            return;
        }
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda33 = this.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(brickModuleImplExternalSyntheticLambda33);
        brickModuleImplExternalSyntheticLambda33.IAuthTabCallback(DERSet.onExtraCallback.AudioAttributesCompatParcelizer());
    }

    public final void dismissProgressDialog() {
        int i = 2 % 2;
        View view = getView();
        if (view != null) {
            int i2 = IAuthTabCallback_Parcel + 121;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                view.post(this.onExtraCallbackWithResult);
                throw null;
            }
            view.post(this.onExtraCallbackWithResult);
        }
        int i3 = IAuthTabCallback_Parcel + 5;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 79 / 0;
        }
    }

    public static /* synthetic */ void showSnackBar$default(BaseFragment baseFragment, View view, String str, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel;
        int i4 = i3 + 125;
        getInterfaceDescriptor = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackBar");
        }
        if ((i & 4) != 0) {
            int i5 = i3 + 37;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            num = null;
        }
        baseFragment.showSnackBar(view, str, num);
        int i7 = getInterfaceDescriptor + 15;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void showSnackBar(@NotNull View view, @NotNull String str, @Nullable Integer num) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt.isBlank(str)) {
            return;
        }
        TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(view, str);
        if (num != null) {
            int i2 = IAuthTabCallback_Parcel + 23;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = num.intValue();
        } else {
            int i4 = IAuthTabCallback_Parcel + 87;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = 0;
        }
        onnavigationevent.IAuthTabCallback(iIntValue).onNavigationEvent();
    }

    public void onMultiWindowModeChanged(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.onMultiWindowModeChanged(z);
            this.asBinder.onExtraCallback(Boolean.valueOf(z));
        } else {
            super/*androidx.fragment.app.Fragment*/.onMultiWindowModeChanged(z);
            this.asBinder.onExtraCallback(Boolean.valueOf(z));
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onWarmupCompleted<T> implements Function1<T, Unit> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function1<T, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onWarmupCompleted(Function1<? super T, Unit> function1) {
            this.onWarmupCompleted = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(T t) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(t);
            int i4 = onNavigationEvent + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    protected final <T> void observe(@NotNull LiveData<T> liveData, @NotNull Function1<? super T, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        liveData.observe(getViewLifecycleOwner(), new onExtraCallbackWithResult(new onWarmupCompleted(function1)));
        int i2 = getInterfaceDescriptor + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    protected final void navigateOnForeground(final int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 41;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (isResumed()) {
            int i5 = IAuthTabCallback_Parcel + 47;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            RippleNode.onNavigationEvent(this).onNavigationEvent(i);
            int i7 = IAuthTabCallback_Parcel + 95;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getViewLifecycleOwner().getLifecycle().IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.base.BaseFragment$navigateOnForeground$observer$1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 89;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                int i11 = onNavigationEvent + 77;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 65;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                if (i10 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i11 = onNavigationEvent + 59;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 44 / 0;
                }
            }

            public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 111;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                int i11 = onNavigationEvent + 69;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 15;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                if (i10 != 0) {
                    throw null;
                }
            }

            public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 63;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                int i11 = onNavigationEvent + 121;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 80 / 0;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 1;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                    RippleNode.onNavigationEvent(this.onExtraCallback).onNavigationEvent(i);
                    this.onExtraCallback.getViewLifecycleOwner().getLifecycle().onExtraCallbackWithResult(this);
                    return;
                }
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                RippleNode.onNavigationEvent(this.onExtraCallback).onNavigationEvent(i);
                this.onExtraCallback.getViewLifecycleOwner().getLifecycle().onExtraCallbackWithResult(this);
                int i10 = 29 / 0;
            }
        });
    }

    public Map<String, Object> getScreenMetaData() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("screenName", AFj1pSDK.onExtraCallbackWithResult(this)));
        int i4 = IAuthTabCallback_Parcel + 5;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnNavigationEvent;
        }
        throw null;
    }
}
