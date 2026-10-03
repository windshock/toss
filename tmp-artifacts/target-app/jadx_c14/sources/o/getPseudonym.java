package o;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPseudonym extends LinkedHashSet<RuntimeScheduler> {
    private final getCornerRadius<importValues> automationOverlay = setShine.onNavigationEvent((Object) null);
    private boolean inFlightBackPress;

    public boolean IAuthTabCallback(RuntimeScheduler runtimeScheduler) {
        return super.remove(runtimeScheduler);
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof RuntimeScheduler) {
            return onNavigationEvent((RuntimeScheduler) obj);
        }
        return false;
    }

    public boolean onNavigationEvent(RuntimeScheduler runtimeScheduler) {
        return super.contains(runtimeScheduler);
    }

    public int onWarmupCompleted() {
        return super.size();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof RuntimeScheduler) {
            return IAuthTabCallback((RuntimeScheduler) obj);
        }
        return false;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return onWarmupCompleted();
    }

    public final boolean onExtraCallbackWithResult() {
        return this.inFlightBackPress;
    }

    public final void onWarmupCompleted(boolean z) {
        this.inFlightBackPress = z;
    }

    public final getCornerRadius<importValues> IAuthTabCallback() {
        return this.automationOverlay;
    }

    public final List<RuntimeScheduler> onExtraCallback() {
        List listAsReversed = CollectionsKt.asReversed(CollectionsKt.toList(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAsReversed) {
            WebView webViewIAuthTabCallbackDefault = ((RuntimeScheduler) obj).IAuthTabCallbackDefault();
            if (webViewIAuthTabCallbackDefault != null && webViewIAuthTabCallbackDefault.getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
