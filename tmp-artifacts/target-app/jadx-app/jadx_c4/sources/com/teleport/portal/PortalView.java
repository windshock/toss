package com.teleport.portal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.views.view.ReactViewGroup;
import com.teleport.host.PortalHostView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1;
import o.getItemDelegate;
import o.wasReturnedFromScrap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PortalView extends ReactViewGroup {
    private static final onExtraCallback Companion = new onExtraCallback(null);
    private String IAuthTabCallback;
    private final List<View> onExtraCallback;
    private final wasReturnedFromScrap onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PortalView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = new wasReturnedFromScrap(this);
        this.onExtraCallback = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PortalHostView IAuthTabCallbackStub() {
        return getItemDelegate.onExtraCallbackWithResult.onExtraCallback(this.IAuthTabCallback, (View) this);
    }

    private final boolean onTransact() {
        return (this.IAuthTabCallback == null || IAuthTabCallbackStub() == null) ? false : true;
    }

    public final void setStateWrapper(@Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        this.onExtraCallbackWithResult.onNavigationEvent(credentialProviderControllermaybeReportErrorFromResultReceiver1);
        this.onExtraCallbackWithResult.IAuthTabCallback(this.IAuthTabCallback, IAuthTabCallbackStub());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHostName(@Nullable String str) {
        if (Intrinsics.areEqual(str, this.IAuthTabCallback)) {
            return;
        }
        List<View> listIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        String str2 = this.IAuthTabCallback;
        if (str2 != null) {
            getItemDelegate.onExtraCallbackWithResult.onWarmupCompleted(str2, this);
        }
        this.IAuthTabCallback = str;
        ReactViewGroup reactViewGroupOnExtraCallback = str != null ? getItemDelegate.onExtraCallbackWithResult.onExtraCallback(str, (View) this) : null;
        if (str != null && reactViewGroupOnExtraCallback == null) {
            new Object[]{str};
        }
        if (reactViewGroupOnExtraCallback == null) {
            reactViewGroupOnExtraCallback = this;
        }
        int i = 0;
        if (reactViewGroupOnExtraCallback instanceof PortalHostView) {
            List<View> list = listIAuthTabCallbackDefault;
            int size = list.size();
            while (i < size) {
                reactViewGroupOnExtraCallback.addView(listIAuthTabCallbackDefault.get(i), ((PortalHostView) reactViewGroupOnExtraCallback).IAuthTabCallback(i));
                i++;
            }
            this.onExtraCallback.addAll(list);
        } else {
            int size2 = listIAuthTabCallbackDefault.size();
            while (i < size2) {
                reactViewGroupOnExtraCallback.addView(listIAuthTabCallbackDefault.get(i), i);
                i++;
            }
        }
        if (str != null) {
            getItemDelegate.onExtraCallbackWithResult.onExtraCallback(str, this);
        }
        this.onExtraCallbackWithResult.IAuthTabCallback(this.IAuthTabCallback, IAuthTabCallbackStub());
    }

    public final void onExtraCallback() {
        String str = this.IAuthTabCallback;
        if (str != null) {
            getItemDelegate.onExtraCallbackWithResult.onWarmupCompleted(str, this);
        }
        onNavigationEvent();
        this.IAuthTabCallback = null;
        this.onExtraCallbackWithResult.onNavigationEvent();
        this.onExtraCallbackWithResult.onNavigationEvent(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.teleport.host.PortalHostView] */
    public final void onWarmupCompleted() {
        ?? IAuthTabCallbackStub = IAuthTabCallbackStub();
        int i = 0;
        if (IAuthTabCallbackStub != 0) {
            List<View> listAsInterface = this.onExtraCallback.isEmpty() ? asInterface() : onNavigationEvent();
            List<View> list = listAsInterface;
            int size = list.size();
            while (i < size) {
                IAuthTabCallbackStub.addView(listAsInterface.get(i), IAuthTabCallbackStub.IAuthTabCallback(i));
                i++;
            }
            this.onExtraCallback.addAll(list);
            return;
        }
        if (this.onExtraCallback.isEmpty()) {
            this.onExtraCallbackWithResult.onNavigationEvent();
            return;
        }
        List<View> listOnNavigationEvent = onNavigationEvent();
        new Object[]{this.IAuthTabCallback, Integer.valueOf(listOnNavigationEvent.size())};
        int size2 = listOnNavigationEvent.size();
        while (i < size2) {
            super/*android.view.ViewGroup*/.addView(listOnNavigationEvent.get(i), i);
            i++;
        }
        this.onExtraCallbackWithResult.onNavigationEvent();
    }

    public final void IAuthTabCallback() {
        this.onExtraCallbackWithResult.IAuthTabCallback(this.IAuthTabCallback, IAuthTabCallbackStub());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<View> asInterface() {
        int childCount = super/*android.view.ViewGroup*/.getChildCount();
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = super/*android.view.ViewGroup*/.getChildAt(i);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            IAuthTabCallback((View) next);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            if (viewGroup == this) {
                super/*android.view.ViewGroup*/.removeView(view);
            } else {
                viewGroup.removeView(view);
            }
            if (view.getParent() == viewGroup) {
                viewGroup.endViewTransition(view);
            }
        }
    }

    private final List<View> onNavigationEvent() {
        ArrayList arrayList = new ArrayList(this.onExtraCallback.size());
        for (View view : this.onExtraCallback) {
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
        this.onExtraCallback.clear();
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            IAuthTabCallback((View) next);
        }
        return arrayList;
    }

    private final List<View> IAuthTabCallbackDefault() {
        return onTransact() ? onNavigationEvent() : asInterface();
    }

    private final int onWarmupCompleted(ViewGroup viewGroup, int i) {
        int size = this.onExtraCallback.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            int iIndexOfChild = viewGroup.indexOfChild(this.onExtraCallback.get(i2));
            if (iIndexOfChild >= 0) {
                return iIndexOfChild;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getChildCount() {
        if (onTransact()) {
            return this.onExtraCallback.size();
        }
        return super/*android.view.ViewGroup*/.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getChildAt(int i) {
        if (onTransact()) {
            return (View) CollectionsKt.getOrNull(this.onExtraCallback, i);
        }
        return super/*android.view.ViewGroup*/.getChildAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        if (onTransact()) {
            ReactViewGroup reactViewGroupIAuthTabCallbackStub = IAuthTabCallbackStub();
            this.onExtraCallback.add(i, view);
            if (reactViewGroupIAuthTabCallbackStub != null) {
                int iOnWarmupCompleted = onWarmupCompleted(reactViewGroupIAuthTabCallbackStub, i);
                if (iOnWarmupCompleted >= 0) {
                    reactViewGroupIAuthTabCallbackStub.addView(view, iOnWarmupCompleted);
                    return;
                } else {
                    reactViewGroupIAuthTabCallbackStub.addView(view);
                    return;
                }
            }
            return;
        }
        super/*android.view.ViewGroup*/.addView(view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(@NotNull View view, int i, @NotNull ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(layoutParams, "");
        if (onTransact()) {
            ReactViewGroup reactViewGroupIAuthTabCallbackStub = IAuthTabCallbackStub();
            this.onExtraCallback.add(i, view);
            if (reactViewGroupIAuthTabCallbackStub != null) {
                int iOnWarmupCompleted = onWarmupCompleted(reactViewGroupIAuthTabCallbackStub, i);
                if (iOnWarmupCompleted >= 0) {
                    reactViewGroupIAuthTabCallbackStub.addView(view, iOnWarmupCompleted);
                    return;
                } else {
                    reactViewGroupIAuthTabCallbackStub.addView(view, layoutParams);
                    return;
                }
            }
            return;
        }
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeView(@Nullable View view) {
        if (view == null) {
            return;
        }
        if (onTransact()) {
            ReactViewGroup reactViewGroupIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (reactViewGroupIAuthTabCallbackStub != null) {
                reactViewGroupIAuthTabCallbackStub.removeView(view);
            }
            this.onExtraCallback.remove(view);
            return;
        }
        super/*android.view.ViewGroup*/.removeView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeViewAt(int i) {
        if (onTransact()) {
            ReactViewGroup reactViewGroupIAuthTabCallbackStub = IAuthTabCallbackStub();
            View view = (View) CollectionsKt.getOrNull(this.onExtraCallback, i);
            if (view != null) {
                if (reactViewGroupIAuthTabCallbackStub != null) {
                    reactViewGroupIAuthTabCallbackStub.removeView(view);
                }
                this.onExtraCallback.remove(i);
                return;
            }
            return;
        }
        super/*android.view.ViewGroup*/.removeViewAt(i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.onExtraCallbackWithResult.IAuthTabCallback(this.IAuthTabCallback, IAuthTabCallbackStub());
    }

    public void addChildrenForAccessibility(@NotNull ArrayList<View> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (onTransact()) {
            return;
        }
        super.addChildrenForAccessibility(arrayList);
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
