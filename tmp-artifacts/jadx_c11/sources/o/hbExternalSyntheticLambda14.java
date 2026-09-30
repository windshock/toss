package o;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda14 {
    private static int asBinder = 1;
    private static int asInterface;
    private final LinkedHashSet<PopupWindow> IAuthTabCallback;
    private final Function0<WindowManager> onExtraCallback;
    private final LinkedHashMap<View, WindowManager> onExtraCallbackWithResult;
    private final AtomicBoolean onNavigationEvent;
    private final LinkedHashSet<Dialog> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public hbExternalSyntheticLambda14(@NotNull Function0<? extends WindowManager> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback = function0;
        this.onNavigationEvent = new AtomicBoolean(false);
        this.onWarmupCompleted = new LinkedHashSet<>();
        this.IAuthTabCallback = new LinkedHashSet<>();
        this.onExtraCallbackWithResult = new LinkedHashMap<>();
    }

    public final void onNavigationEvent() {
        AtomicBoolean atomicBoolean;
        int i = 2 % 2;
        boolean z = true;
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            atomicBoolean = this.onNavigationEvent;
        } else {
            atomicBoolean = this.onNavigationEvent;
            z = false;
        }
        atomicBoolean.set(z);
        int i3 = asBinder + 65;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public final hbExternalSyntheticLambda11 onNavigationEvent(@NotNull hbExternalSyntheticLambda13 hbexternalsyntheticlambda13, @NotNull onRewardedAdDisplayFailed onrewardedaddisplayfailed) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda13, "");
        Intrinsics.checkNotNullParameter(onrewardedaddisplayfailed, "");
        if (!hbexternalsyntheticlambda13.onExtraCallbackWithResult()) {
            hbExternalSyntheticLambda11 hbexternalsyntheticlambda11IAuthTabCallback = IAuthTabCallback();
            int i4 = asBinder + 51;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return hbexternalsyntheticlambda11IAuthTabCallback;
        }
        if (this.onNavigationEvent.compareAndSet(false, true)) {
            try {
                return new hbExternalSyntheticLambda11(onExtraCallbackWithResult(), onWarmupCompleted(), onExtraCallback(onrewardedaddisplayfailed));
            } finally {
                this.onNavigationEvent.set(false);
            }
        }
        int i6 = asInterface + 69;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        hbExternalSyntheticLambda11 hbexternalsyntheticlambda11IAuthTabCallback2 = IAuthTabCallback();
        int i8 = asBinder + 13;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return hbexternalsyntheticlambda11IAuthTabCallback2;
    }

    private final hbExternalSyntheticLambda11 IAuthTabCallback() {
        int i = 2 % 2;
        hbExternalSyntheticLambda11 hbexternalsyntheticlambda11 = new hbExternalSyntheticLambda11(onExtraCallbackWithResult(this.onWarmupCompleted.size()), onExtraCallbackWithResult(this.IAuthTabCallback.size()), IAuthTabCallback(this.onExtraCallbackWithResult.size()));
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return hbexternalsyntheticlambda11;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return new o.hbExternalSyntheticLambda12(r9, 0, 0, r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r9 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r9 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 117;
        o.hbExternalSyntheticLambda14.asBinder = r1 % 128;
        r1 = r1 % 2;
        r9 = o.hbExternalSyntheticLambda12.Companion.onExtraCallbackWithResult();
        r1 = o.hbExternalSyntheticLambda14.asBinder + 63;
        o.hbExternalSyntheticLambda14.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final hbExternalSyntheticLambda12 onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 113;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r0 = 84 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return new o.hbExternalSyntheticLambda10(r8, 0, 0, r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r8 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r8 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r8 = o.hbExternalSyntheticLambda10.Companion.onExtraCallback();
        r1 = o.hbExternalSyntheticLambda14.asInterface + 121;
        o.hbExternalSyntheticLambda14.asBinder = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final hbExternalSyntheticLambda10 IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 19;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
    }

    private final hbExternalSyntheticLambda12 onExtraCallbackWithResult() {
        Dialog dialog;
        Object obj;
        Object obj2;
        int i = 2 % 2;
        List list = CollectionsKt.toList(this.onWarmupCompleted);
        if (list.isEmpty()) {
            return hbExternalSyntheticLambda12.Companion.onExtraCallbackWithResult();
        }
        List list2 = list;
        Iterator it = list2.iterator();
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (!(!it.hasNext())) {
            int i8 = asInterface + 81;
            asBinder = i8 % 128;
            if (i8 % 2 == 0) {
                dialog = (Dialog) it.next();
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(Boolean.valueOf(dialog.isShowing()));
                    int i9 = 7 / 0;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
            } else {
                dialog = (Dialog) it.next();
                Result.Companion companion3 = Result.Companion;
                obj = Result.constructor-impl(Boolean.valueOf(dialog.isShowing()));
            }
            if (!Result.onExtraCallback(obj)) {
                int i10 = asInterface + 117;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                Boolean bool = Boolean.FALSE;
                if (Result.onExtraCallback(obj)) {
                    obj = bool;
                }
                if (((Boolean) obj).booleanValue()) {
                    i4++;
                    try {
                        Result.Companion companion4 = Result.Companion;
                        dialog.dismiss();
                        obj2 = Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion5 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                    }
                    if (Result.onNavigationEvent(obj2)) {
                        i5++;
                    }
                    if (Result.exceptionOrNull-impl(obj2) != null) {
                        int i12 = asBinder + 11;
                        asInterface = i12 % 128;
                        int i13 = i12 % 2;
                    }
                } else {
                    int i14 = asInterface + 5;
                    asBinder = i14 % 128;
                    int i15 = i14 % 2;
                    i6++;
                }
            }
            i7++;
        }
        this.onWarmupCompleted.removeAll(CollectionsKt.toSet(list2));
        return new hbExternalSyntheticLambda12(list.size(), i4, i5, i6, i7);
    }

    private final hbExternalSyntheticLambda12 onWarmupCompleted() {
        Object obj;
        Object obj2;
        int i = 2 % 2;
        List list = CollectionsKt.toList(this.IAuthTabCallback);
        if (list.isEmpty()) {
            int i2 = asBinder + 113;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return hbExternalSyntheticLambda12.Companion.onExtraCallbackWithResult();
            }
            int i3 = 41 / 0;
            return hbExternalSyntheticLambda12.Companion.onExtraCallbackWithResult();
        }
        List<PopupWindow> list2 = list;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (PopupWindow popupWindow : list2) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Boolean.valueOf(popupWindow.isShowing()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (!Result.onExtraCallback(obj)) {
                Boolean bool = Boolean.FALSE;
                if (Result.onExtraCallback(obj)) {
                    obj = bool;
                }
                if (((Boolean) obj).booleanValue()) {
                    i4++;
                    try {
                        Result.Companion companion3 = Result.Companion;
                        popupWindow.dismiss();
                        obj2 = Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                    }
                    if (!(!Result.onNavigationEvent(obj2))) {
                        int i8 = asBinder + 7;
                        asInterface = i8 % 128;
                        int i9 = i8 % 2;
                        i5++;
                    }
                    if (Result.exceptionOrNull-impl(obj2) != null) {
                        int i10 = asInterface + 19;
                        asBinder = i10 % 128;
                        int i11 = i10 % 2;
                    }
                } else {
                    i6++;
                }
            }
            i7++;
        }
        this.IAuthTabCallback.removeAll(CollectionsKt.toSet(list2));
        return new hbExternalSyntheticLambda12(list.size(), i4, i5, i6, i7);
    }

    private final hbExternalSyntheticLambda10 onExtraCallback(onRewardedAdDisplayFailed onrewardedaddisplayfailed) {
        Object obj;
        Object obj2;
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            access8100.IAuthTabCallback(this.onExtraCallbackWithResult).isEmpty();
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(this.onExtraCallbackWithResult);
        if (mapIAuthTabCallback.isEmpty()) {
            hbExternalSyntheticLambda10 hbexternalsyntheticlambda10OnExtraCallback = hbExternalSyntheticLambda10.Companion.onExtraCallback();
            int i3 = asBinder + 87;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 43 / 0;
            }
            return hbexternalsyntheticlambda10OnExtraCallback;
        }
        if (!onrewardedaddisplayfailed.onExtraCallbackWithResult()) {
            this.onExtraCallbackWithResult.keySet().removeAll(mapIAuthTabCallback.keySet());
            return IAuthTabCallback(mapIAuthTabCallback.size());
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (Map.Entry entry : mapIAuthTabCallback.entrySet()) {
            int i9 = asInterface + 61;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            View view = (View) entry.getKey();
            WindowManager windowManager = (WindowManager) entry.getValue();
            try {
                Result.Companion companion = Result.Companion;
                if (view.isAttachedToWindow()) {
                    z = true;
                    obj = Result.constructor-impl(Boolean.valueOf(z));
                } else {
                    int i11 = asBinder + 73;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    if (view.getParent() != null) {
                        z = true;
                        obj = Result.constructor-impl(Boolean.valueOf(z));
                    } else {
                        z = false;
                        obj = Result.constructor-impl(Boolean.valueOf(z));
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (true ^ Result.onExtraCallback(obj)) {
                Boolean bool = Boolean.FALSE;
                if (Result.onExtraCallback(obj)) {
                    obj = bool;
                }
                if (((Boolean) obj).booleanValue()) {
                    i5++;
                    try {
                        Result.Companion companion3 = Result.Companion;
                        IAuthTabCallback(view, windowManager);
                        obj2 = Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                    }
                    if (Result.onNavigationEvent(obj2)) {
                        int i13 = asBinder + 13;
                        asInterface = i13 % 128;
                        int i14 = i13 % 2;
                        i6++;
                    }
                    if (Result.exceptionOrNull-impl(obj2) != null) {
                        int i15 = asBinder + 123;
                        asInterface = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 15 / 0;
                        }
                    }
                } else {
                    i7++;
                }
            }
            i8++;
        }
        this.onExtraCallbackWithResult.keySet().removeAll(mapIAuthTabCallback.keySet());
        return new hbExternalSyntheticLambda10(mapIAuthTabCallback.size(), i5, i6, i7, i8);
    }

    private final void IAuthTabCallback(View view, WindowManager windowManager) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        ViewGroup viewGroup = null;
        if (i2 % 2 == 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
                int i3 = asInterface + 21;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            }
            if (windowManager != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    windowManager.removeViewImmediate(view);
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.onNavigationEvent(obj)) {
                    return;
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null && viewGroup == null) {
                    int i5 = asBinder + 115;
                    asInterface = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw th2;
                    }
                    int i6 = 3 / 0;
                    throw th2;
                }
            }
            if (viewGroup != null) {
                viewGroup.removeView(view);
                return;
            }
            WindowManager windowManager2 = (WindowManager) this.onExtraCallback.invoke();
            if (windowManager2 != null) {
                int i7 = asInterface + 11;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    windowManager2.removeViewImmediate(view);
                    return;
                } else {
                    windowManager2.removeViewImmediate(view);
                    int i8 = 38 / 0;
                    return;
                }
            }
            throw new IllegalStateException("WindowManager is not available for shopping tab RN overlay");
        }
        boolean z = view.getParent() instanceof ViewGroup;
        viewGroup.hashCode();
        throw null;
    }
}
