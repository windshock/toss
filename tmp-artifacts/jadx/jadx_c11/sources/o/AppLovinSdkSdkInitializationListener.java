package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSdkInitializationListener;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinSdkSdkInitializationListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final ConcurrentHashMap<View, List<onNavigationEvent>> onWarmupCompleted = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<View, View.OnAttachStateChangeListener> IAuthTabCallback = new ConcurrentHashMap<>();

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~((~i2) | i5 | i3);
        int i8 = ~((~i5) | i2);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i2));
        int i11 = ~(i9 | i5);
        int i12 = i2 + i5 + i4 + ((-1568348280) * i6) + (1617068012 * i);
        int i13 = i12 * i12;
        int i14 = (((-430874860) * i2) - 739508224) + (1544986862 * i5) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i4) + ((-1885339648) * i6) + (1743781888 * i) + (858456064 * i13);
        int i15 = (i2 * (-973781596)) + 539565670 + (i5 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i4 * (-973780651)) + (i6 * 424585256) + (i * 537576796) + (i13 * 1078394880);
        return i14 + ((i15 * i15) * 192741376) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ boolean onWarmupCompleted(isFireOS isfireos, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(isfireos, onnavigationevent);
        int i4 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener = (AppLovinSdkSdkInitializationListener) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap<View, View.OnAttachStateChangeListener> concurrentHashMap = appLovinSdkSdkInitializationListener.IAuthTabCallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 125;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }

    public static final /* synthetic */ void IAuthTabCallback(AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener, View view, isFireOS isfireos) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        appLovinSdkSdkInitializationListener.IAuthTabCallback(view, isfireos);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ ConcurrentHashMap onExtraCallback(AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ConcurrentHashMap<View, List<onNavigationEvent>> concurrentHashMap = appLovinSdkSdkInitializationListener.onWarmupCompleted;
        if (i3 != 0) {
            return concurrentHashMap;
        }
        throw null;
    }

    static final class onExtraCallbackWithResult implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ isFireOS<?> onExtraCallback;
        final /* synthetic */ View onWarmupCompleted;

        onExtraCallbackWithResult(View view, isFireOS<?> isfireos) {
            this.onWarmupCompleted = view;
            this.onExtraCallback = isfireos;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AppLovinSdkSdkInitializationListener.IAuthTabCallback(AppLovinSdkSdkInitializationListener.this, this.onWarmupCompleted, this.onExtraCallback);
            int i4 = onNavigationEvent + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
        }
    }

    static final class onExtraCallback implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ isFireOS<?> onExtraCallback;
        final /* synthetic */ View onWarmupCompleted;

        onExtraCallback(View view, isFireOS<?> isfireos) {
            this.onWarmupCompleted = view;
            this.onExtraCallback = isfireos;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener = AppLovinSdkSdkInitializationListener.this;
            if (i3 == 0) {
                AppLovinSdkSdkInitializationListener.IAuthTabCallback(appLovinSdkSdkInitializationListener, this.onWarmupCompleted, this.onExtraCallback);
            } else {
                AppLovinSdkSdkInitializationListener.IAuthTabCallback(appLovinSdkSdkInitializationListener, this.onWarmupCompleted, this.onExtraCallback);
                throw null;
            }
        }
    }

    public static final class IAuthTabCallbackStub implements View.OnAttachStateChangeListener {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ AppLovinSdkSdkInitializationListener onExtraCallback;
        final /* synthetic */ View onNavigationEvent;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            int i4 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        IAuthTabCallbackStub(View view, AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener, View view2) {
            this.onNavigationEvent = view;
            this.onExtraCallback = appLovinSdkSdkInitializationListener;
            this.IAuthTabCallback = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                this.onNavigationEvent.removeOnAttachStateChangeListener(this);
                Object[] objArr = {this.onExtraCallback};
                ((ConcurrentHashMap) AppLovinSdkSdkInitializationListener.onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).remove(this.onNavigationEvent);
                this.onExtraCallback.onNavigationEvent(this.IAuthTabCallback);
                return;
            }
            Intrinsics.checkNotNullParameter(view, "");
            this.onNavigationEvent.removeOnAttachStateChangeListener(this);
            Object[] objArr2 = {this.onExtraCallback};
            ((ConcurrentHashMap) AppLovinSdkSdkInitializationListener.onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), objArr2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).remove(this.onNavigationEvent);
            this.onExtraCallback.onNavigationEvent(this.IAuthTabCallback);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r6
      0x0030: PHI (r6v3 java.util.List<o.AppLovinSdkSdkInitializationListener$onNavigationEvent>) = 
      (r6v2 java.util.List<o.AppLovinSdkSdkInitializationListener$onNavigationEvent>)
      (r6v17 java.util.List<o.AppLovinSdkSdkInitializationListener$onNavigationEvent>)
     binds: [B:8:0x002e, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final isFireOS<?> onNavigationEvent(@NotNull View view, long j) {
        List<onNavigationEvent> list;
        Object next;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            list = this.onWarmupCompleted.get(view);
            int i3 = 15 / 0;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        int i4 = onExtraCallbackWithResult + 113;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        next = null;
                        break;
                    }
                    int i6 = onExtraCallbackWithResult + 109;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    next = it.next();
                    if (((onNavigationEvent) next).IAuthTabCallback() == j) {
                        break;
                    }
                }
                onNavigationEvent onnavigationevent = (onNavigationEvent) next;
                if (onnavigationevent != null) {
                    int i8 = onExtraCallbackWithResult + 29;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return onnavigationevent.onExtraCallback();
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            list = this.onWarmupCompleted.get(view);
            if (list != null) {
            }
        }
        int i10 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }

    public final List<isFireOS<?>> onWarmupCompleted(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        List<onNavigationEvent> list = this.onWarmupCompleted.get(view);
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < size) {
            int i7 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                arrayList.add(list.get(i6).onExtraCallback());
                i6 += 109;
            } else {
                arrayList.add(list.get(i6).onExtraCallback());
                i6++;
            }
        }
        return arrayList;
    }

    public final void IAuthTabCallback(@NotNull View view) {
        List<isFireOS<?>> listOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            listOnWarmupCompleted = onWarmupCompleted(view);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            listOnWarmupCompleted = onWarmupCompleted(view);
        }
        int size = listOnWarmupCompleted.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object[] objArr = {this, listOnWarmupCompleted.get(i3)};
            onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1920663561, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1920663562, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        }
        int i4 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        isFireOS isfireos = (isFireOS) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            isfireos.IAuthTabCallbackStubProxy();
            isfireos.requestPostMessageChannelWithExtras();
            int i3 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        isfireos.IAuthTabCallbackStubProxy();
        isfireos.requestPostMessageChannelWithExtras();
        throw null;
    }

    public static final class onWarmupCompleted implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface;
        final /* synthetic */ long IAuthTabCallback;
        final /* synthetic */ View IAuthTabCallbackDefault;
        final /* synthetic */ isFireOS onExtraCallback;
        final /* synthetic */ View onExtraCallbackWithResult;
        final /* synthetic */ View onNavigationEvent;
        final /* synthetic */ AppLovinSdkSdkInitializationListener onTransact;
        final /* synthetic */ boolean onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 73;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }

        public onWarmupCompleted(View view, AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener, View view2, boolean z, isFireOS isfireos, long j, View view3) {
            this.onNavigationEvent = view;
            this.onTransact = appLovinSdkSdkInitializationListener;
            this.IAuthTabCallbackDefault = view2;
            this.onWarmupCompleted = z;
            this.onExtraCallback = isfireos;
            this.IAuthTabCallback = j;
            this.onExtraCallbackWithResult = view3;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            List list;
            onNavigationEvent onnavigationevent;
            Object next;
            int i = 2 % 2;
            int i2 = asInterface + 115;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.removeOnAttachStateChangeListener(this);
            List list2 = (List) AppLovinSdkSdkInitializationListener.onExtraCallback(this.onTransact).get(this.IAuthTabCallbackDefault);
            if (list2 == null) {
                AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener = this.onTransact;
                ArrayList arrayList = new ArrayList();
                AppLovinSdkSdkInitializationListener.onExtraCallback(appLovinSdkSdkInitializationListener).put(this.IAuthTabCallbackDefault, arrayList);
                list2 = arrayList;
            }
            if (this.IAuthTabCallback >= 0) {
                int i4 = IAuthTabCallbackStub + 125;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                list = list2;
            } else {
                list = null;
            }
            if (list != null) {
                int i6 = IAuthTabCallbackStub + 61;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                Iterator it = list.iterator();
                int i8 = asInterface + 63;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((onNavigationEvent) next).IAuthTabCallback() == this.IAuthTabCallback) {
                            break;
                        }
                    }
                }
                onnavigationevent = (onNavigationEvent) next;
            } else {
                onnavigationevent = null;
            }
            if (onnavigationevent != null) {
                int i10 = asInterface + 17;
                IAuthTabCallbackStub = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                if (this.onWarmupCompleted) {
                }
                onnavigationevent.onExtraCallback().IAuthTabCallbackStubProxy();
                onnavigationevent.onExtraCallbackWithResult(this.onExtraCallback);
            } else {
                list2.add(new onNavigationEvent(this.IAuthTabCallback, this.onExtraCallback));
            }
            if (this.IAuthTabCallback < 0) {
                Map<Object, Function0<Unit>> mapOnRelationshipValidationResult = this.onExtraCallback.onRelationshipValidationResult();
                IAuthTabCallback iAuthTabCallback = IAuthTabCallback.IAuthTabCallback;
                mapOnRelationshipValidationResult.put(iAuthTabCallback, this.onTransact.new onExtraCallbackWithResult(this.IAuthTabCallbackDefault, this.onExtraCallback));
                ((Map) isFireOS.onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this.onExtraCallback}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 2140325197, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -2140325197)).put(iAuthTabCallback, this.onTransact.new onExtraCallback(this.IAuthTabCallbackDefault, this.onExtraCallback));
            }
            if (((ConcurrentHashMap) AppLovinSdkSdkInitializationListener.onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{this.onTransact}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).get(this.onExtraCallbackWithResult) == null) {
                View view2 = this.onExtraCallbackWithResult;
                IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(view2, this.onTransact, this.IAuthTabCallbackDefault);
                ((ConcurrentHashMap) AppLovinSdkSdkInitializationListener.onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{this.onTransact}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).put(this.onExtraCallbackWithResult, iAuthTabCallbackStub);
                view2.addOnAttachStateChangeListener(iAuthTabCallbackStub);
            }
        }
    }

    private final void IAuthTabCallback(View view, final isFireOS<?> isfireos) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.get(view);
            throw null;
        }
        List<onNavigationEvent> list = this.onWarmupCompleted.get(view);
        if (list != null) {
            CollectionsKt.removeAll(list, new Function1() { // from class: im.toss.tds.foundation.anim.rally.AnimationStore$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i3 = 2 % 2;
                    int i4 = onNavigationEvent + 17;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Boolean boolValueOf = Boolean.valueOf(AppLovinSdkSdkInitializationListener.onWarmupCompleted(isfireos, (AppLovinSdkSdkInitializationListener.onNavigationEvent) obj));
                    int i6 = onExtraCallback + 103;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return boolValueOf;
                }
            });
            int i3 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static final boolean onExtraCallback(isFireOS isfireos, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (onnavigationevent.onExtraCallback() == isfireos) {
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(view);
        view.removeOnAttachStateChangeListener(this.IAuthTabCallback.get(view));
        this.IAuthTabCallback.remove(view);
        List<onNavigationEvent> list = this.onWarmupCompleted.get(view);
        if (list != null) {
            list.clear();
            int i4 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void onNavigationEvent(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            onExtraCallbackWithResult(view);
            this.onWarmupCompleted.remove(view);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            onExtraCallbackWithResult(view);
            this.onWarmupCompleted.remove(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.entrySet().iterator();
            throw null;
        }
        Iterator<Map.Entry<View, List<onNavigationEvent>>> it = this.onWarmupCompleted.entrySet().iterator();
        int i3 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            onExtraCallbackWithResult(it.next().getKey());
        }
        this.onWarmupCompleted.clear();
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private isFireOS<?> IAuthTabCallback;
        private final long onWarmupCompleted;

        public onNavigationEvent(long j, @NotNull isFireOS<?> isfireos) {
            Intrinsics.checkNotNullParameter(isfireos, "");
            this.onWarmupCompleted = j;
            this.IAuthTabCallback = isfireos;
        }

        public final long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 103;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            long j = this.onWarmupCompleted;
            int i5 = i2 + 123;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public final isFireOS<?> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            isFireOS<?> isfireos = this.IAuthTabCallback;
            int i5 = i3 + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return isfireos;
        }

        public final void onExtraCallbackWithResult(@NotNull isFireOS<?> isfireos) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(isfireos, "");
            this.IAuthTabCallback = isfireos;
            int i4 = onExtraCallbackWithResult + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class IAuthTabCallback {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        static {
            int i = onExtraCallback + 45;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private IAuthTabCallback() {
        }
    }

    public final void onExtraCallbackWithResult(@NotNull View view, @NotNull isFireOS<?> isfireos, long j, boolean z) {
        Object obj;
        Object next;
        List list;
        onNavigationEvent onnavigationevent;
        Iterator it;
        Object next2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(isfireos, "");
        Iterator it2 = showCreativeDebugger.onWarmupCompleted(view).iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((ViewGroup) next) instanceof RecyclerView) {
                    break;
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) next;
        View view2 = viewGroup == null ? view : viewGroup;
        if (!view2.isAttachedToWindow()) {
            view2.addOnAttachStateChangeListener(new onWarmupCompleted(view2, this, view, z, isfireos, j, view2));
            return;
        }
        List arrayList = (List) onExtraCallback(this).get(view);
        if (arrayList == null) {
            arrayList = new ArrayList();
            onExtraCallback(this).put(view, arrayList);
        }
        if (j >= 0) {
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            list = arrayList;
        } else {
            list = null;
        }
        if (list != null) {
            int i4 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                it = list.iterator();
                int i5 = 83 / 0;
            } else {
                it = list.iterator();
            }
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (((onNavigationEvent) next2).IAuthTabCallback() == j) {
                        break;
                    }
                }
            }
            onnavigationevent = (onNavigationEvent) next2;
        } else {
            onnavigationevent = null;
        }
        if (onnavigationevent != null) {
            if (!(!z)) {
                int i6 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            onnavigationevent.onExtraCallback().IAuthTabCallbackStubProxy();
            onnavigationevent.onExtraCallbackWithResult(isfireos);
        } else {
            arrayList.add(new onNavigationEvent(j, isfireos));
        }
        if (j < 0) {
            Map<Object, Function0<Unit>> mapOnRelationshipValidationResult = isfireos.onRelationshipValidationResult();
            IAuthTabCallback iAuthTabCallback = IAuthTabCallback.IAuthTabCallback;
            mapOnRelationshipValidationResult.put(iAuthTabCallback, new onExtraCallbackWithResult(view, isfireos));
            ((Map) isFireOS.onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{isfireos}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 2140325197, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -2140325197)).put(iAuthTabCallback, new onExtraCallback(view, isfireos));
        }
        if (((ConcurrentHashMap) onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).get(view2) == null) {
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(view2, this, view);
            ((ConcurrentHashMap) onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -205774268, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).put(view2, iAuthTabCallbackStub);
            view2.addOnAttachStateChangeListener(iAuthTabCallbackStub);
        }
        int i8 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ConcurrentHashMap onWarmupCompleted(AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (ConcurrentHashMap) onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 205774268, iOnWarmupCompleted, new Object[]{appLovinSdkSdkInitializationListener}, iOnWarmupCompleted2, -205774268, iOnWarmupCompleted3);
    }

    private final void onNavigationEvent(isFireOS<?> isfireos) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1920663561, iOnWarmupCompleted, new Object[]{this, isfireos}, iOnWarmupCompleted2, 1920663562, iOnWarmupCompleted3);
    }
}
