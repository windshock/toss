package o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import dagger.Lazy;
import im.toss.base.BaseActivity;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.state.impl.session.SessionStateManagerImpl$;
import im.toss.state.impl.session.SessionStateManagerImpl$activityLifecycleCallbacks$1$;
import im.toss.state.impl.session.SessionTimeoutWorker;
import im.toss.state.spec.SessionState;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp;
import o.M0;
import o.getPackageType;
import o.getSegmentCollection;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.core.AppStateManager;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class M0 implements Q0 {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int asInterface;
    private final Lazy<AppState> IAuthTabCallback;
    private final AppSetIdAndScope1 IAuthTabCallbackDefault;
    private final onExtraCallback IAuthTabCallbackStub;
    private final zzag asBinder;
    private final Context onExtraCallback;
    private final onNavigationEvent onExtraCallbackWithResult;
    private final Set<WeakReference<Activity>> onNavigationEvent;
    private final Lazy<SessionState> onTransact;
    private final onExtraCallbackWithResult onWarmupCompleted;

    static {
        int i = IAuthTabCallback_Parcel + 101;
        access000 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallbackStub(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(function1, obj);
            throw null;
        }
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback = IAuthTabCallback(function1, obj);
        int i3 = IAuthTabCallbackStubProxy + 79;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = ~(i8 | i10);
        int i12 = i9 | i11;
        int i13 = (~(i4 | i8 | i2)) | (~(i7 | i5)) | (~(i10 | i7));
        int i14 = i2 + i5 + i3 + ((-1336646162) * i) + (1706069763 * i6);
        int i15 = i14 * i14;
        int i16 = ((i2 * (-1709230891)) - 203685888) + ((-1709230891) * i5) + ((-1137600936) * i12) + (568800468 * i11) + ((-568800468) * i13) + (2016935936 * i3) + ((-602931200) * i) + ((-1331167232) * i6) + ((-1604583424) * i15);
        int i17 = ((i2 * 112646815) - 831444653) + (i5 * 112646815) + (i12 * 520) + (i11 * (-260)) + (i13 * 260) + (i3 * 112647075) + (i * (-2078048118)) + (i6 * (-2015059991)) + (i15 * (-829161472));
        int i18 = i16 + (i17 * i17 * (-1266417664));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        M0 m0 = (M0) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(m0);
        }
        asInterface(m0);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1101179047, new Object[]{th}, iIAuthTabCallback2, iIAuthTabCallback, -1101179043, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        int i4 = IAuthTabCallbackStubProxy + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(M0 m0, AppState.State state) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(m0, state);
        int i4 = asInterface + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(M0 m0, getSegmentCollection.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (Unit) onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -964396221, new Object[]{m0, onextracallback}, iIAuthTabCallback2, iIAuthTabCallback, 964396224, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -964396221, new Object[]{m0, onextracallback}, iIAuthTabCallback4, iIAuthTabCallback3, 964396224, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        int i3 = 92 / 0;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(AppState appState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1458612129, new Object[]{appState}, iIAuthTabCallback2, iIAuthTabCallback, 1458612129, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public M0(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull Context context, @NotNull Lazy<SessionState> lazy, @NotNull Lazy<AppState> lazy2, @NotNull zzag zzagVar) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(lazy2, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        this.onExtraCallback = context;
        this.onTransact = lazy;
        this.IAuthTabCallback = lazy2;
        this.asBinder = zzagVar;
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("SessionStateManager");
        this.IAuthTabCallbackDefault = appSetIdAndScope1OnExtraCallbackWithResult;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this);
        asBinder asbinder = new asBinder(this);
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(textRoundCornerProgressBarSavedState1, iAuthTabCallback, asbinder, zzagVar, appSetIdAndScope1OnExtraCallbackWithResult);
        this.onWarmupCompleted = onextracallbackwithresult;
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        this.IAuthTabCallbackStub = new onExtraCallback(onextracallbackwithresult, appSetIdAndScope1OnExtraCallbackWithResult);
        this.onNavigationEvent = new LinkedHashSet();
        this.onExtraCallbackWithResult = new onNavigationEvent();
    }

    public static final /* synthetic */ void IAuthTabCallback(M0 m0) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        m0.onExtraCallbackWithResult();
        int i4 = asInterface + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Set onExtraCallback(M0 m0) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Set<WeakReference<Activity>> set = m0.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return set;
    }

    public static final /* synthetic */ void onNavigationEvent(M0 m0) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        m0.IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
    }

    public static final /* synthetic */ Lazy onWarmupCompleted(M0 m0) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Lazy<SessionState> lazy = m0.onTransact;
        if (i3 != 0) {
            return lazy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        IAuthTabCallback(Object obj) {
            super(0, obj, M0.class, "revokeAuthSession", "revokeAuthSession()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            M0.IAuthTabCallback((M0) ((CallableReference) this).receiver);
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
        }
    }

    static final /* synthetic */ class asBinder extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        asBinder(Object obj) {
            super(0, obj, M0.class, "revokeAllSession", "revokeAllSession()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            if (i3 == 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 119;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            return unit2;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                M0.onNavigationEvent((M0) ((CallableReference) this).receiver);
                throw null;
            }
            M0.onNavigationEvent((M0) ((CallableReference) this).receiver);
            int i3 = onWarmupCompleted + 113;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final class onNavigationEvent implements L0 {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public static /* synthetic */ boolean onExtraCallback(Activity activity, WeakReference weakReference) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnWarmupCompleted = onWarmupCompleted(activity, weakReference);
            if (i3 == 0) {
                int i4 = 81 / 0;
            }
            return zOnWarmupCompleted;
        }

        onNavigationEvent() {
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivityPaused(Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityPaused(activity);
            int i4 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivityResumed(Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityResumed(activity);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onActivitySaveInstanceState(activity, bundle);
            if (i3 != 0) {
                int i4 = 43 / 0;
            }
            int i5 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivityStarted(Activity activity) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            super.onActivityStarted(activity);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivityStopped(Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityStopped(activity);
            int i4 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            M0.onExtraCallback(M0.this).add(new WeakReference(activity));
            if (!((SessionState) M0.onWarmupCompleted(M0.this).get()).IAuthTabCallbackStub() && !activity.isFinishing()) {
                int i2 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                ((SessionState) M0.onWarmupCompleted(M0.this).get()).onWarmupCompleted(SessionState.Event.OnActivityCreate.onWarmupCompleted);
            }
            int i4 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final boolean onWarmupCompleted(Activity activity, WeakReference weakReference) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(weakReference, "");
            boolean zAreEqual = Intrinsics.areEqual(weakReference.get(), activity);
            int i4 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return zAreEqual;
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            CollectionsKt.removeAll(M0.onExtraCallback(M0.this), new SessionStateManagerImpl$activityLifecycleCallbacks$1$.ExternalSyntheticLambda0(activity));
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 83 / 0;
            }
        }
    }

    private static final AppState asInterface(M0 m0) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        AppState appState = (AppState) m0.IAuthTabCallback.get();
        int i4 = IAuthTabCallbackStubProxy + 29;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return appState;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        asInterface = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i3 = asInterface + 99;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppState appState = (AppState) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appState, "");
        JsonReaderUnknownNumberParsing<AppState.State> jsonReaderUnknownNumberParsingIAuthTabCallback = appState.IAuthTabCallback(true);
        int i4 = asInterface + 31;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonReaderUnknownNumberParsingIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
    }

    private static final Unit onExtraCallback(M0 m0, AppState.State state) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(state);
            m0.onExtraCallbackWithResult(state);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(state);
        m0.onExtraCallbackWithResult(state);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "appStateObserve", th, (Map) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 115;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.Q0
    public void onWarmupCompleted(@NotNull Application application) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        application.registerActivityLifecycleCallbacks(this.onExtraCallbackWithResult);
        application.registerActivityLifecycleCallbacks(this.IAuthTabCallbackStub);
        JsonReaderUnknownNumberParsing.onNavigationEvent(new SessionStateManagerImpl$.ExternalSyntheticLambda0(this)).onExtraCallback(clearTid.onExtraCallback()).IAuthTabCallback(new SessionStateManagerImpl$.ExternalSyntheticLambda2(new SessionStateManagerImpl$.ExternalSyntheticLambda1())).onWarmupCompleted(new SessionStateManagerImpl$.ExternalSyntheticLambda4(new SessionStateManagerImpl$.ExternalSyntheticLambda3(this)), new SessionStateManagerImpl$.ExternalSyntheticLambda6(new SessionStateManagerImpl$.ExternalSyntheticLambda5()));
        AppStateManager.onExtraCallbackWithResult.onActivityLayout().IAuthTabCallback(false).onExtraCallback(clearTid.onExtraCallback()).IAuthTabCallback(new SessionStateManagerImpl$.ExternalSyntheticLambda8(new SessionStateManagerImpl$.ExternalSyntheticLambda7(this)));
        int i2 = IAuthTabCallbackStubProxy + 17;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        M0 m0 = (M0) objArr[0];
        int i = 2 % 2;
        if (((getSegmentCollection.onExtraCallback) objArr[1]) instanceof getSegmentCollection.onExtraCallback.onExtraCallbackWithResult) {
            int i2 = IAuthTabCallbackStubProxy + 55;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                ((SessionState) m0.onTransact.get()).onWarmupCompleted(SessionState.Event.OnUserLogOut.onNavigationEvent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((SessionState) m0.onTransact.get()).onWarmupCompleted(SessionState.Event.OnUserLogOut.onNavigationEvent);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 85;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, im.toss.splittarget.spec.fsm.AppState.State.Foreground.onExtraCallbackWithResult) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r4.onWarmupCompleted.IAuthTabCallback(r4.onExtraCallback);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (((im.toss.state.spec.SessionState) r4.onTransact.get()).IAuthTabCallbackStub() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r5 = o.M0.asInterface + 47;
        o.M0.IAuthTabCallbackStubProxy = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if ((r5 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        ((im.toss.state.spec.SessionState) r4.onTransact.get()).onWarmupCompleted(im.toss.state.spec.SessionState.Event.OnAppStart.onWarmupCompleted);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        ((im.toss.state.spec.SessionState) r4.onTransact.get()).onWarmupCompleted(im.toss.state.spec.SessionState.Event.OnAppStart.onWarmupCompleted);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        o.H5TinyPopMenuTitleBarTheme.IAuthTabCallback.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, im.toss.splittarget.spec.fsm.AppState.State.Background.onExtraCallbackWithResult) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (viva.republica.toss.core.AppStateManager.onExtraCallbackWithResult.onActivityResized() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        r5 = o.M0.asInterface + 15;
        o.M0.IAuthTabCallbackStubProxy = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if ((r5 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        r4.onWarmupCompleted.onNavigationEvent(r4.onExtraCallback);
        r5 = o.M0.asInterface + 27;
        o.M0.IAuthTabCallbackStubProxy = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        r4.onWarmupCompleted.onNavigationEvent(r4.onExtraCallback);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, im.toss.splittarget.spec.fsm.AppState.State.Terminate.onExtraCallbackWithResult) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        r4.onWarmupCompleted.IAuthTabCallback(r4.onExtraCallback);
        ((im.toss.state.spec.SessionState) r4.onTransact.get()).onWarmupCompleted(im.toss.state.spec.SessionState.Event.OnAppFinish.onExtraCallback);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5, im.toss.splittarget.spec.fsm.AppState.State.Foreground.onExtraCallbackWithResult)) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(AppState.State state) throws Throwable {
        int i = 2 % 2;
        Objects.toString(state);
        if (Intrinsics.areEqual(state, AppState.State.Initialize.onNavigationEvent)) {
            return;
        }
        int i2 = IAuthTabCallbackStubProxy + 95;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
    }

    private final void onExtraCallbackWithResult() {
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "revokeAuthSession", (Map) null, (String) null, false, (String) null, 117, (Object) null);
            obj = this.onTransact.get();
        } else {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "revokeAuthSession", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            obj = this.onTransact.get();
        }
        ((SessionState) obj).onExtraCallbackWithResult("backgroundAuthTimeout");
        int i3 = IAuthTabCallbackStubProxy + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final onExtraCallback Companion;
        private static int IAuthTabCallback_Parcel = 0;
        private static int[] access000 = null;
        private static int access100 = 1;
        private static int getInterfaceDescriptor = 0;
        private static int writeTypedObject = 1;
        private long IAuthTabCallback;
        private final Function0<Unit> IAuthTabCallbackDefault;
        private final Function0<Unit> IAuthTabCallbackStub;
        private final zzag IAuthTabCallbackStubProxy;
        private final TextRoundCornerProgressBarSavedState1 asBinder;
        private final AppSetIdAndScope1 asInterface;
        private boolean onExtraCallback;
        private long onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        private getPackageType onTransact;
        private final ConcurrentHashMap<String, setLogBuffers> onWarmupCompleted;

        static {
            onExtraCallbackWithResult();
            Companion = new onExtraCallback(null);
            int i = IAuthTabCallback_Parcel + 111;
            access100 = i % 128;
            int i2 = i % 2;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
            int i7 = ~i4;
            int i8 = ~(i7 | i5);
            int i9 = ~i2;
            int i10 = ~i5;
            int i11 = (~(i10 | i7)) | i9;
            int i12 = (~(i4 | i5)) | (~(i7 | i9 | i10));
            int i13 = i2 + i5 + i + ((-1136091917) * i6) + (376669458 * i3);
            int i14 = i13 * i13;
            int i15 = ((-905468225) * i2) + 1718550528 + ((-1748215485) * i5) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i) + ((-2044854272) * i6) + (41156608 * i3) + (1721171968 * i14);
            int i16 = ((i2 * (-924404593)) - 1636593565) + (i5 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i * (-924404175)) + (i6 * (-2083730301)) + (i3 * 182666354) + (i14 * (-51970048));
            int i17 = i15 + (i16 * i16 * (-653721600));
            if (i17 == 1) {
                return onExtraCallbackWithResult(objArr);
            }
            if (i17 == 2) {
                return onExtraCallback(objArr);
            }
            boolean z = false;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            Long l = (Long) objArr[1];
            setLogBuffers setlogbuffers = (setLogBuffers) objArr[2];
            boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
            int iIntValue = ((Number) objArr[4]).intValue();
            Object obj = objArr[5];
            int i18 = 2 % 2;
            if ((iIntValue & 4) != 0) {
                int i19 = getInterfaceDescriptor + 125;
                writeTypedObject = i19 % 128;
                int i20 = i19 % 2;
            } else {
                z = zBooleanValue;
            }
            onextracallbackwithresult.IAuthTabCallback(l, setlogbuffers, z);
            int i21 = writeTypedObject + 123;
            getInterfaceDescriptor = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = access000;
            int i5 = -1469660336;
            int i6 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = $11 + 35;
                    $10 = i8 % 128;
                    if (i8 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 71 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr3[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 71 - TextUtils.lastIndexOf("", '0'), 8848 - (ViewConfiguration.getTapTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr4[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i7++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i3 = 2;
                }
                int i9 = $11 + 35;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = access000;
            if (iArr6 != null) {
                int i11 = $11 + 77;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    try {
                        Object[] objArr4 = new Object[1];
                        objArr4[i6] = Integer.valueOf(iArr6[i2]);
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", i6) + 72, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i2++;
                        i5 = -1469660336;
                        i6 = 0;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                iArr6 = iArr2;
            }
            int i12 = i6;
            System.arraycopy(iArr6, i12, iArr5, i12, length3);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i13 = $10 + 47;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                int i15 = 0;
                for (int i16 = 16; i15 < i16; i16 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i15];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Drawable.resolveOpacity(0, 0) + 39, 10301 - (Process.myTid() >> 22), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i15++;
                }
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 78, 7398 - View.resolveSize(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public onExtraCallbackWithResult(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull zzag zzagVar, @NotNull AppSetIdAndScope1 appSetIdAndScope1) {
            Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(zzagVar, "");
            Intrinsics.checkNotNullParameter(appSetIdAndScope1, "");
            this.asBinder = textRoundCornerProgressBarSavedState1;
            this.IAuthTabCallbackStub = function0;
            this.IAuthTabCallbackDefault = function02;
            this.IAuthTabCallbackStubProxy = zzagVar;
            this.asInterface = appSetIdAndScope1;
            this.IAuthTabCallback = -1L;
            this.onExtraCallbackWithResult = Q0.Companion.IAuthTabCallback();
            this.onWarmupCompleted = new ConcurrentHashMap<>();
        }

        public static final /* synthetic */ AppSetIdAndScope1 IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 33;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            AppSetIdAndScope1 appSetIdAndScope1 = onextracallbackwithresult.asInterface;
            int i5 = i3 + 9;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return appSetIdAndScope1;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            Long l = (Long) objArr[1];
            setLogBuffers setlogbuffers = (setLogBuffers) objArr[2];
            boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 41;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            onextracallbackwithresult.IAuthTabCallback(l, setlogbuffers, zBooleanValue);
            if (i3 != 0) {
                return null;
            }
            throw null;
        }

        public static final /* synthetic */ void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, long j) {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 65;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            onextracallbackwithresult.IAuthTabCallback = j;
            int i5 = i2 + 23;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 23 / 0;
            }
        }

        public static final /* synthetic */ void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, boolean z) {
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 125;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            onextracallbackwithresult.onExtraCallback = z;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 103;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 121;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            Function0<Unit> function0 = onextracallbackwithresult.IAuthTabCallbackStub;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i2 + 105;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return function0;
        }

        public static final /* synthetic */ zzag onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = writeTypedObject + 79;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            zzag zzagVar = onextracallbackwithresult.IAuthTabCallbackStubProxy;
            if (i3 != 0) {
                int i4 = 94 / 0;
            }
            return zzagVar;
        }

        public static final /* synthetic */ Function0 onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 87;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            Function0<Unit> function0 = onextracallbackwithresult.IAuthTabCallbackDefault;
            int i5 = i2 + 73;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return function0;
        }

        public static final /* synthetic */ void onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, boolean z) {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 99;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            onextracallbackwithresult.onNavigationEvent = z;
            int i5 = i2 + 49;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 43 / 0;
            }
        }

        public final void onNavigationEvent(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            long j = this.onExtraCallbackWithResult;
            setLogBuffers.onPostMessage(j);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "startBackgroundTimer with appSessionTimeout: " + setLogBuffers.onPostMessage(j), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            SessionTimeoutWorker.Companion.onExtraCallbackWithResult(context, j);
            this.onTransact = maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, putChannelInfo.onExtraCallback().onExtraCallback(), (setRandomHost) null, new C0007onExtraCallbackWithResult(j, null), 2, (Object) null);
            int i2 = getInterfaceDescriptor + 63;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 70 / 0;
            }
        }

        /* renamed from: o.M0$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        static final class C0007onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ long $currentAppSessionTimeout;
            long J$0;
            long J$1;
            long J$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0007onExtraCallbackWithResult(long j, access13800<? super C0007onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.$currentAppSessionTimeout = j;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult = onExtraCallbackWithResult.this.new C0007onExtraCallbackWithResult(this.$currentAppSessionTimeout, access13800Var);
                int i2 = onExtraCallbackWithResult + 11;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 76 / 0;
                }
                return c0007onExtraCallbackWithResult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 41;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallback + 7;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                if (i3 != 0) {
                    int i4 = 43 / 0;
                }
                int i5 = onExtraCallback + 45;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0116, code lost:
            
                if (o.formatMsgs.IAuthTabCallback(r9, r17) == r2) goto L25;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                long jOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onExtraCallback + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    jOnExtraCallbackWithResult = onExtraCallbackWithResult.onExtraCallbackWithResult(onExtraCallbackWithResult.this).onExtraCallbackWithResult();
                    Object[] objArr = {onExtraCallbackWithResult.this, access14000.onExtraCallback(jOnExtraCallbackWithResult), setLogBuffers.onWarmupCompleted(this.$currentAppSessionTimeout), true};
                    int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    onExtraCallbackWithResult.onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1357872026, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1357872028, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                    onExtraCallbackWithResult.onExtraCallback(onExtraCallbackWithResult.this, jOnExtraCallbackWithResult);
                    onExtraCallbackWithResult.onNavigationEvent(onExtraCallbackWithResult.this, false);
                    onExtraCallbackWithResult.onExtraCallback(onExtraCallbackWithResult.this, false);
                    long jOnNavigationEvent = Q0.Companion.onNavigationEvent();
                    this.J$0 = jOnExtraCallbackWithResult;
                    this.label = 1;
                    if (formatMsgs.IAuthTabCallback(jOnNavigationEvent, this) != objOnWarmupCompleted) {
                    }
                    int i5 = onExtraCallback + 65;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
                int i7 = onExtraCallback + 51;
                int i8 = i7 % 128;
                onExtraCallbackWithResult = i8;
                int i9 = i7 % 2;
                if (i4 != 1) {
                    int i10 = i8 + 89;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 != 0 ? i4 != 2 : i4 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i11 = onExtraCallback + 77;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    onExtraCallbackWithResult.onNavigationEvent(onExtraCallbackWithResult.this).invoke();
                    onExtraCallbackWithResult.onNavigationEvent(onExtraCallbackWithResult.this, true);
                    return Unit.INSTANCE;
                }
                jOnExtraCallbackWithResult = this.J$0;
                ResultKt.onNavigationEvent(obj);
                Object[] objArr2 = {onExtraCallbackWithResult.this};
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                ((Function0) onExtraCallbackWithResult.onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1992894748, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult2, -1992894747, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).invoke();
                onExtraCallbackWithResult.onExtraCallback(onExtraCallbackWithResult.this, true);
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                long jOnExtraCallbackWithResult2 = onExtraCallbackWithResult.onExtraCallbackWithResult(onExtraCallbackWithResult.this).onExtraCallbackWithResult();
                setRevision setrevision = setRevision.MILLISECONDS;
                long jOnWarmupCompleted = setLogBuffers.onWarmupCompleted(setCommandLine.IAuthTabCallback(jOnExtraCallbackWithResult2, setrevision), setCommandLine.IAuthTabCallback(jOnExtraCallbackWithResult, setrevision));
                long jOnWarmupCompleted2 = setLogBuffers.onWarmupCompleted(this.$currentAppSessionTimeout, jOnWarmupCompleted);
                onExtraCallbackWithResult.IAuthTabCallback(onExtraCallbackWithResult.this);
                setLogBuffers.onPostMessage(jOnWarmupCompleted);
                setLogBuffers.onPostMessage(jOnWarmupCompleted2);
                if (setLogBuffers.onMinimized(jOnWarmupCompleted2)) {
                    onExtraCallbackWithResult.IAuthTabCallback(onExtraCallbackWithResult.this);
                    setLogBuffers.onPostMessage(jOnWarmupCompleted2);
                    this.J$0 = jOnExtraCallbackWithResult;
                    this.J$1 = jOnWarmupCompleted;
                    this.J$2 = jOnWarmupCompleted2;
                    this.label = 2;
                }
                onExtraCallbackWithResult.onNavigationEvent(onExtraCallbackWithResult.this).invoke();
                onExtraCallbackWithResult.onNavigationEvent(onExtraCallbackWithResult.this, true);
                return Unit.INSTANCE;
            }
        }

        public final void IAuthTabCallback(@NotNull Context context) throws Throwable {
            int i = 2 % 2;
            int i2 = writeTypedObject + 59;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            onExtraCallback();
            onWarmupCompleted();
            SessionTimeoutWorker.Companion.onWarmupCompleted(context);
            getPackageType getpackagetype = this.onTransact;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                int i4 = getInterfaceDescriptor + 75;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
            }
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onExtraCallback(iOnExtraCallbackWithResult2, 1081548250, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, null, null, false, 4, null}, iOnExtraCallbackWithResult, -1081548250, iOnExtraCallbackWithResult3);
        }

        public final void onExtraCallbackWithResult(long j, @NotNull String str) {
            long jIAuthTabCallback;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            setLogBuffers.onPostMessage(this.onExtraCallbackWithResult);
            setLogBuffers.onPostMessage(j);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "setAppSessionTimeout from " + setLogBuffers.onPostMessage(this.onExtraCallbackWithResult) + " to " + setLogBuffers.onPostMessage(j), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            this.onWarmupCompleted.put(str, setLogBuffers.onWarmupCompleted(j));
            Collection<setLogBuffers> collectionValues = this.onWarmupCompleted.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            setLogBuffers setlogbuffersMaxOrNull = CollectionsKt.maxOrNull(collectionValues);
            if (setlogbuffersMaxOrNull != null) {
                int i2 = writeTypedObject + 29;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 != 0) {
                    jIAuthTabCallback = setlogbuffersMaxOrNull.onExtraCallback();
                    int i3 = 43 / 0;
                } else {
                    jIAuthTabCallback = setlogbuffersMaxOrNull.onExtraCallback();
                }
            } else {
                jIAuthTabCallback = Q0.Companion.IAuthTabCallback();
            }
            this.onExtraCallbackWithResult = jIAuthTabCallback;
            int i4 = writeTypedObject + 109;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void onNavigationEvent(@NotNull String str) {
            long jOnExtraCallback;
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 53;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted.remove(str);
            Collection<setLogBuffers> collectionValues = this.onWarmupCompleted.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            setLogBuffers setlogbuffersMaxOrNull = CollectionsKt.maxOrNull(collectionValues);
            if (setlogbuffersMaxOrNull != null) {
                int i4 = writeTypedObject + 47;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 != 0) {
                    setlogbuffersMaxOrNull.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                jOnExtraCallback = setlogbuffersMaxOrNull.onExtraCallback();
            } else {
                long jIAuthTabCallback = Q0.Companion.IAuthTabCallback();
                int i5 = getInterfaceDescriptor + 83;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                jOnExtraCallback = jIAuthTabCallback;
            }
            this.onExtraCallbackWithResult = jOnExtraCallback;
            setLogBuffers.onPostMessage(jOnExtraCallback);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "resetAppSessionTimeout to " + setLogBuffers.onPostMessage(this.onExtraCallbackWithResult), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        }

        public final boolean IAuthTabCallback() throws Throwable {
            long jIAuthTabCallback;
            int i = 2 % 2;
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = this.asBinder;
            Object[] objArr = new Object[1];
            a(new int[]{1571272970, -171566205, -1769104177, 1146693430, 1378098224, 174218942, 1277512975, -154412025, -1765349795, 795071558, -1992870681, 921844517}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, objArr);
            Long lValueOf = Long.valueOf(textRoundCornerProgressBarSavedState1.onExtraCallback(((String) objArr[0]).intern(), -1L));
            Long l = null;
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                Long lValueOf2 = Long.valueOf(this.asBinder.onExtraCallback("latestOverriddenAppSessionTimeout", -1L));
                if (lValueOf2.longValue() > 0) {
                    int i2 = getInterfaceDescriptor + 1;
                    writeTypedObject = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    l = lValueOf2;
                }
                if (l != null) {
                    setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                    jIAuthTabCallback = setCommandLine.IAuthTabCallback(l.longValue(), setRevision.MILLISECONDS);
                } else {
                    jIAuthTabCallback = Q0.Companion.IAuthTabCallback();
                    int i3 = getInterfaceDescriptor + 1;
                    writeTypedObject = i3 % 128;
                    int i4 = i3 % 2;
                }
                long jAbs = Math.abs(this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult() - jLongValue);
                setLogBuffers.IAuthTabCallback iAuthTabCallback2 = setLogBuffers.Companion;
                if (setLogBuffers.onExtraCallbackWithResult(setCommandLine.IAuthTabCallback(jAbs, setRevision.MILLISECONDS), jIAuthTabCallback) > 0) {
                    return true;
                }
            }
            return false;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            if (!this.onNavigationEvent) {
                int i2 = getInterfaceDescriptor + 113;
                int i3 = i2 % 128;
                writeTypedObject = i3;
                int i4 = i2 % 2;
                getPackageType getpackagetype = this.onTransact;
                if (getpackagetype != null) {
                    int i5 = i3 + 21;
                    getInterfaceDescriptor = i5 % 128;
                    int i6 = i5 % 2;
                    if (getpackagetype.onExtraCallback()) {
                        if (this.IAuthTabCallback + setLogBuffers.asBinder(this.onExtraCallbackWithResult) < this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult()) {
                            this.IAuthTabCallbackDefault.invoke();
                            this.onNavigationEvent = true;
                            Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
                            if (typedObject != null) {
                                onExtraCallbackWithResult(typedObject);
                            }
                        }
                    }
                }
            }
            int i7 = getInterfaceDescriptor + 89;
            writeTypedObject = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        public final void onExtraCallback() {
            getPackageType getpackagetype;
            int i = 2 % 2;
            int i2 = writeTypedObject + 27;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            if (DERSet.onExtraCallback.access200()) {
                int i4 = writeTypedObject + 37;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    if (!this.onExtraCallback && (getpackagetype = this.onTransact) != null && getpackagetype.onExtraCallback()) {
                        if (this.IAuthTabCallback + setLogBuffers.asBinder(Q0.Companion.onNavigationEvent()) < this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult()) {
                            this.IAuthTabCallbackStub.invoke();
                            this.onExtraCallback = true;
                        }
                    }
                } else {
                    throw null;
                }
            }
            int i5 = writeTypedObject + 67;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        private final void IAuthTabCallback(Long l, setLogBuffers setlogbuffers, boolean z) throws Throwable {
            int i = 2 % 2;
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = this.asBinder;
            long jAsBinder = -1;
            long jLongValue = l != null ? l.longValue() : -1L;
            Object[] objArr = new Object[1];
            a(new int[]{1571272970, -171566205, -1769104177, 1146693430, 1378098224, 174218942, 1277512975, -154412025, -1765349795, 795071558, -1992870681, 921844517}, 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            textRoundCornerProgressBarSavedState1.onExtraCallback(((String) objArr[0]).intern(), jLongValue, z);
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState12 = this.asBinder;
            if (setlogbuffers != null) {
                int i2 = getInterfaceDescriptor + 77;
                writeTypedObject = i2 % 128;
                int i3 = i2 % 2;
                if (!setLogBuffers.IAuthTabCallback(setlogbuffers.onExtraCallback(), Q0.Companion.IAuthTabCallback())) {
                    int i4 = getInterfaceDescriptor + 49;
                    writeTypedObject = i4 % 128;
                    if (i4 % 2 == 0) {
                        jAsBinder = setLogBuffers.asBinder(setlogbuffers.onExtraCallback());
                        int i5 = 21 / 0;
                    } else {
                        jAsBinder = setLogBuffers.asBinder(setlogbuffers.onExtraCallback());
                    }
                    int i6 = writeTypedObject + 15;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            textRoundCornerProgressBarSavedState12.onExtraCallback("latestOverriddenAppSessionTimeout", jAsBinder, z);
        }

        public final void onExtraCallbackWithResult(@NotNull Activity activity) {
            String shortClassName;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Intent intent = new Intent(activity, (Class<?>) zzaj.onNavigationEvent().extraCommand());
            intent.addFlags(268468224);
            ComponentName component = intent.getComponent();
            if (component != null) {
                int i2 = writeTypedObject + 113;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                shortClassName = component.getShortClassName();
                int i4 = writeTypedObject + 1;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = getInterfaceDescriptor + 101;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
                shortClassName = null;
            }
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "BackgroundSessionTimer: restart app from " + shortClassName, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.fade_in, R.anim.stay);
        }

        public static final class onExtraCallback {
            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }
        }

        public static final /* synthetic */ Function0 onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return (Function0) onExtraCallback(iOnExtraCallbackWithResult2, 1992894748, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{onextracallbackwithresult}, iOnExtraCallbackWithResult, -1992894747, iOnExtraCallbackWithResult3);
        }

        public static final /* synthetic */ void onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, Long l, setLogBuffers setlogbuffers, boolean z) throws Throwable {
            Object[] objArr = {onextracallbackwithresult, l, setlogbuffers, Boolean.valueOf(z)};
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1357872026, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1357872028, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }

        static /* synthetic */ void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, Long l, setLogBuffers setlogbuffers, boolean z, int i, Object obj) throws Throwable {
            Object[] objArr = {onextracallbackwithresult, l, setlogbuffers, Boolean.valueOf(z), Integer.valueOf(i), obj};
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1081548250, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, -1081548250, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }

        static void onExtraCallbackWithResult() {
            access000 = new int[]{-293789777, 17544208, -696365234, -194788071, -2009276785, -162187368, -1175323739, 892597390, -231606563, -1930009078, 1087024861, -410607556, -1388321372, -655718846, 1899581115, 1619152788, -297756525, 326962093};
        }
    }

    private final void IAuthTabCallback() {
        Unit unit;
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "revokeAllSession", (Map) null, (String) null, false, (String) null, 60, (Object) null);
        AppStateManager appStateManager = AppStateManager.onExtraCallbackWithResult;
        if (appStateManager.onPostMessage()) {
            return;
        }
        Activity typedObject = appStateManager.readTypedObject();
        try {
            Result.Companion companion = Result.Companion;
            if (typedObject != null) {
                typedObject.setResult(0);
                typedObject.finishAffinity();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.Companion;
            Set<WeakReference<Activity>> set = this.onNavigationEvent;
            ArrayList<Activity> arrayList = new ArrayList();
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Activity activity = (Activity) ((WeakReference) it.next()).get();
                if (activity != null) {
                    int i2 = asInterface + 121;
                    IAuthTabCallbackStubProxy = i2 % 128;
                    if (i2 % 2 == 0) {
                        arrayList.add(activity);
                        throw null;
                    }
                    arrayList.add(activity);
                }
            }
            int i3 = IAuthTabCallbackStubProxy + 99;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            for (Activity activity2 : arrayList) {
                int i5 = IAuthTabCallbackStubProxy + 95;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                activity2.setResult(0);
                activity2.finish();
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }

    @Override // o.Q0
    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onExtraCallback();
        int i4 = asInterface + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    @Override // o.Q0
    public void onNavigationEvent(long j, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        setLogBuffers.onPostMessage(j);
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "overrideAppSessionTimeout: duration=" + setLogBuffers.onPostMessage(j) + ", key=" + str, (Map) null, (String) null, false, (String) null, 60, (Object) null);
        this.onWarmupCompleted.onExtraCallbackWithResult(j, str);
        int i2 = IAuthTabCallbackStubProxy + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.Q0
    public void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted.onNavigationEvent(str);
        int i4 = asInterface + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback implements L0 {
        private static int onNavigationEvent = 0;
        private static int onTransact = 1;
        private final onExtraCallbackWithResult IAuthTabCallback;
        private final kotlin.Lazy onExtraCallback;
        private final AppSetIdAndScope1 onExtraCallbackWithResult;
        private final kotlin.Lazy onWarmupCompleted;

        public static /* synthetic */ String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = onWarmupCompleted();
            int i4 = onNavigationEvent + 73;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
            }
            return strOnWarmupCompleted;
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(onExtraCallback onextracallback) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(onextracallback);
            }
            onWarmupCompleted(onextracallback);
            throw null;
        }

        public onExtraCallback(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull AppSetIdAndScope1 appSetIdAndScope1) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(appSetIdAndScope1, "");
            this.IAuthTabCallback = onextracallbackwithresult;
            this.onExtraCallbackWithResult = appSetIdAndScope1;
            this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.state.impl.session.SessionStateManagerImpl$ExpiredSessionKiller$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 113;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    String strOnExtraCallbackWithResult = M0.onExtraCallback.onExtraCallbackWithResult();
                    if (i3 != 0) {
                        int i4 = 30 / 0;
                    }
                    return strOnExtraCallbackWithResult;
                }
            });
            this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.state.impl.session.SessionStateManagerImpl$ExpiredSessionKiller$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 25;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Boolean boolValueOf = Boolean.valueOf(M0.onExtraCallback.onExtraCallbackWithResult(this.f$0));
                    int i4 = IAuthTabCallback + 55;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return boolValueOf;
                }
            });
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivityDestroyed(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityDestroyed(activity);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivityPaused(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityPaused(activity);
            int i4 = onNavigationEvent + 15;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivityResumed(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityResumed(activity);
            int i4 = onNavigationEvent + 115;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivityStarted(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityStarted(activity);
            int i4 = onNavigationEvent + 19;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public /* bridge */ void onActivityStopped(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onTransact + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityStopped(activity);
            if (i3 != 0) {
                int i4 = 19 / 0;
            }
        }

        private final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String str = (String) this.onWarmupCompleted.getValue();
            int i4 = onTransact + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        private static final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String string = UUID.randomUUID().toString();
            int i4 = onTransact + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return string;
            }
            throw null;
        }

        private final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) this.onExtraCallback.getValue()).booleanValue();
            int i4 = onNavigationEvent + 49;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return zBooleanValue;
        }

        private static final boolean onWarmupCompleted(onExtraCallback onextracallback) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = onextracallback.IAuthTabCallback.IAuthTabCallback();
            int i4 = onNavigationEvent + 71;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
            return zIAuthTabCallback;
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            String string;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            if (((activity instanceof BaseActivity) && ((BaseActivity) activity).onRelationshipValidationResult()) || !IAuthTabCallback() || bundle == null) {
                return;
            }
            int i2 = onTransact + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                string = bundle.getString("SessionStateManager_ExpiredSessionKiller_processLifecycleUuid");
                int i3 = 8 / 0;
                if (string == null) {
                    return;
                }
            } else {
                string = bundle.getString("SessionStateManager_ExpiredSessionKiller_processLifecycleUuid");
                if (string == null) {
                    return;
                }
            }
            int i4 = onNavigationEvent + 19;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
                if (Intrinsics.areEqual(string, onExtraCallback())) {
                    return;
                }
            } else if (Intrinsics.areEqual(string, onExtraCallback())) {
                return;
            }
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionStateManager", "ExpiredSessionKiller: finish expired activity (" + activity.getClass().getSimpleName() + ")", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("restoredProcessUuid", string), getWrite.IAuthTabCallback("currentProcessUuid", onExtraCallback())}), (String) null, false, (String) null, 56, (Object) null);
            activity.finish();
            if (activity.isTaskRoot()) {
                this.IAuthTabCallback.onExtraCallbackWithResult(activity);
            }
        }

        @Override // o.L0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            int i = 2 % 2;
            int i2 = onTransact + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putString("SessionStateManager_ExpiredSessionKiller_processLifecycleUuid", onExtraCallback());
            int i4 = onTransact + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -984215748, new Object[]{function1, obj}, iIAuthTabCallback2, iIAuthTabCallback, 984215749, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    public static /* synthetic */ AppState onExtraCallbackWithResult(M0 m0) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (AppState) onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2079614688, new Object[]{m0}, iIAuthTabCallback2, iIAuthTabCallback, -2079614686, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(AppState appState) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1458612129, new Object[]{appState}, iIAuthTabCallback2, iIAuthTabCallback, 1458612129, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1101179047, new Object[]{th}, iIAuthTabCallback2, iIAuthTabCallback, -1101179043, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(M0 m0, getSegmentCollection.onExtraCallback onextracallback) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -964396221, new Object[]{m0, onextracallback}, iIAuthTabCallback2, iIAuthTabCallback, 964396224, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }
}
