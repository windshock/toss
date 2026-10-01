package o;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o.TabRowDefaultsExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabRowDefaultsExternalSyntheticLambda2$access000$onNavigationEvent extends TabRowDefaultsExternalSyntheticLambda2$access000$onExtraCallbackWithResult {
    final /* synthetic */ TabRowDefaultsExternalSyntheticLambda2.access000 IAuthTabCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabRowDefaultsExternalSyntheticLambda2$access000$onNavigationEvent(final TabRowDefaultsExternalSyntheticLambda2.access000 access000Var) {
        new MediaBrowser.SubscriptionCallback() { // from class: o.TabRowDefaultsExternalSyntheticLambda2$access000$onExtraCallbackWithResult
            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference weakReference = access000Var.onNavigationEvent;
                TabRowDefaultsExternalSyntheticLambda2.access100 access100Var = weakReference == null ? null : (TabRowDefaultsExternalSyntheticLambda2.access100) weakReference.get();
                if (access100Var == null) {
                    access000Var.onWarmupCompleted(str, TabRowDefaultsExternalSyntheticLambda2.asBinder.IAuthTabCallback(list));
                    return;
                }
                List<TabRowDefaultsExternalSyntheticLambda2.asBinder> list2 = (List) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabRowDefaultsExternalSyntheticLambda2.asBinder.IAuthTabCallback(list));
                List listOnNavigationEvent = access100Var.onNavigationEvent();
                List listIAuthTabCallback = access100Var.IAuthTabCallback();
                for (int i2 = 0; i2 < listOnNavigationEvent.size(); i2++) {
                    Bundle bundle = (Bundle) listIAuthTabCallback.get(i2);
                    if (bundle == null) {
                        access000Var.onWarmupCompleted(str, list2);
                    } else {
                        access000Var.onWarmupCompleted(str, onNavigationEvent(list2, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                access000Var.onExtraCallbackWithResult(str);
            }

            List<TabRowDefaultsExternalSyntheticLambda2.asBinder> onNavigationEvent(List<TabRowDefaultsExternalSyntheticLambda2.asBinder> list, Bundle bundle) {
                int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i2 == -1 && i3 == -1) {
                    return list;
                }
                int i4 = i3 * i2;
                int size = i4 + i3;
                if (i2 < 0 || i3 <= 0 || i4 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i4, size);
            }
        };
        this.IAuthTabCallback = access000Var;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
        TabRowKtExternalSyntheticLambda0.onNavigationEvent(bundle);
        this.IAuthTabCallback.onWarmupCompleted(str, TabRowDefaultsExternalSyntheticLambda2.asBinder.IAuthTabCallback(list), bundle);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onError(String str, Bundle bundle) {
        TabRowKtExternalSyntheticLambda0.onNavigationEvent(bundle);
        this.IAuthTabCallback.IAuthTabCallback(str, bundle);
    }
}
