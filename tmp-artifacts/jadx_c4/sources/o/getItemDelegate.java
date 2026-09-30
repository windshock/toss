package o;

import android.os.IBinder;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.ReactViewGroup;
import com.teleport.global.PortalRegistry$;
import com.teleport.host.PortalHostView;
import com.teleport.portal.PortalView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getItemDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getItemDelegate {
    public static final getItemDelegate onExtraCallbackWithResult = new getItemDelegate();
    private static final Map<String, List<WeakReference<PortalHostView>>> IAuthTabCallback = new HashMap();
    private static final Map<String, List<WeakReference<PortalView>>> onExtraCallback = new HashMap();

    private getItemDelegate() {
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull final PortalHostView portalHostView) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(portalHostView, "");
        UiThreadUtil.assertOnUiThread();
        Map<String, List<WeakReference<PortalHostView>>> map = IAuthTabCallback;
        List<WeakReference<PortalHostView>> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        List<WeakReference<PortalHostView>> list = arrayList;
        CollectionsKt.removeAll(list, new Function1() { // from class: com.teleport.global.PortalRegistry$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getItemDelegate.onNavigationEvent(portalHostView, (WeakReference) obj));
            }
        });
        list.add(new WeakReference<>(portalHostView));
        onExtraCallbackWithResult(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(PortalHostView portalHostView, WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null || weakReference.get() == portalHostView;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull final PortalHostView portalHostView) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(portalHostView, "");
        UiThreadUtil.assertOnUiThread();
        Map<String, List<WeakReference<PortalHostView>>> map = IAuthTabCallback;
        List<WeakReference<PortalHostView>> list = map.get(str);
        if (list != null) {
            CollectionsKt.removeAll(list, new Function1() { // from class: com.teleport.global.PortalRegistry$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(getItemDelegate.onWarmupCompleted(portalHostView, (WeakReference) obj));
                }
            });
            if (list.isEmpty()) {
                map.remove(str);
            }
        }
        onExtraCallbackWithResult(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onWarmupCompleted(PortalHostView portalHostView, WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null || weakReference.get() == portalHostView;
    }

    private final void onExtraCallbackWithResult(String str) {
        List<WeakReference<PortalView>> list = onExtraCallback.get(str);
        if (list != null) {
            Iterator<WeakReference<PortalView>> it = list.iterator();
            while (it.hasNext()) {
                PortalView portalView = it.next().get();
                if (portalView != null) {
                    portalView.onWarmupCompleted();
                } else {
                    it.remove();
                }
            }
        }
    }

    public final void onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        UiThreadUtil.assertOnUiThread();
        List<WeakReference<PortalView>> list = onExtraCallback.get(str);
        if (list != null) {
            Iterator<WeakReference<PortalView>> it = list.iterator();
            while (it.hasNext()) {
                PortalView portalView = it.next().get();
                if (portalView != null) {
                    portalView.IAuthTabCallback();
                } else {
                    it.remove();
                }
            }
        }
    }

    public final PortalHostView onExtraCallback(@Nullable String str, @NotNull View view) {
        Map<String, List<WeakReference<PortalHostView>>> map;
        List<WeakReference<PortalHostView>> list;
        Object objPrevious;
        Intrinsics.checkNotNullParameter(view, "");
        UiThreadUtil.assertOnUiThread();
        Object obj = null;
        if (str == null || (list = (map = IAuthTabCallback).get(str)) == null) {
            return null;
        }
        CollectionsKt.removeAll(list, new Function1() { // from class: com.teleport.global.PortalRegistry$$ExternalSyntheticLambda2
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(getItemDelegate.onNavigationEvent((WeakReference) obj2));
            }
        });
        if (list.isEmpty()) {
            map.remove(str);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            PortalHostView portalHostView = (PortalHostView) ((WeakReference) it.next()).get();
            if (portalHostView != null) {
                arrayList.add(portalHostView);
            }
        }
        IBinder windowToken = view.getWindowToken();
        if (view.isAttachedToWindow() && windowToken != null) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                ReactViewGroup reactViewGroup = (PortalHostView) objPrevious;
                if (reactViewGroup.isAttachedToWindow() && Intrinsics.areEqual(reactViewGroup.getWindowToken(), windowToken)) {
                    break;
                }
            }
            PortalHostView portalHostView2 = (PortalHostView) objPrevious;
            if (portalHostView2 != null) {
                return portalHostView2;
            }
        }
        ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            }
            Object objPrevious2 = listIterator2.previous();
            if (((PortalHostView) objPrevious2).isAttachedToWindow()) {
                obj = objPrevious2;
                break;
            }
        }
        return (PortalHostView) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null;
    }

    public final void onExtraCallback(@NotNull String str, @NotNull PortalView portalView) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(portalView, "");
        UiThreadUtil.assertOnUiThread();
        Map<String, List<WeakReference<PortalView>>> map = onExtraCallback;
        List<WeakReference<PortalView>> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        List<WeakReference<PortalView>> list = arrayList;
        CollectionsKt.removeAll(list, new PortalRegistry$.ExternalSyntheticLambda4(portalView));
        list.add(new WeakReference<>(portalView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback(PortalView portalView, WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null || Intrinsics.areEqual(weakReference.get(), portalView);
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull PortalView portalView) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(portalView, "");
        UiThreadUtil.assertOnUiThread();
        Map<String, List<WeakReference<PortalView>>> map = onExtraCallback;
        List<WeakReference<PortalView>> list = map.get(str);
        if (list != null) {
            CollectionsKt.removeAll(list, new PortalRegistry$.ExternalSyntheticLambda0(portalView));
            if (list.isEmpty()) {
                map.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallback(PortalView portalView, WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null || Intrinsics.areEqual(weakReference.get(), portalView);
    }
}
