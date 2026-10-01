package o;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.appevents.codeless.RCTCodelessLoggingEventListener;
import com.facebook.internal.extraCallback;
import com.facebook.internal.mayLaunchUrl;
import com.facebook.internal.onMessageChannelReady;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o.getDescendantRect;
import o.offsetChildToAnchor;

/* JADX INFO: Access modifiers changed from: protected */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getSuggestedMinimumWidth$IAuthTabCallback implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
    private List<isPointInChildBounds> IAuthTabCallback;
    private WeakReference<View> onExtraCallback;
    private HashSet<String> onExtraCallbackWithResult;
    private final Handler onNavigationEvent;
    private final String onWarmupCompleted;

    public getSuggestedMinimumWidth$IAuthTabCallback(View view, Handler handler, HashSet<String> hashSet, String str) {
        this.onExtraCallback = new WeakReference<>(view);
        this.onNavigationEvent = handler;
        this.onExtraCallbackWithResult = hashSet;
        this.onWarmupCompleted = str;
        handler.postDelayed(this, 200L);
    }

    @Override // java.lang.Runnable
    public void run() {
        View view;
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            extraCallback extracallbackOnExtraCallbackWithResult = onMessageChannelReady.onExtraCallbackWithResult(performIntercept.onTransact());
            if (extracallbackOnExtraCallbackWithResult == null || !extracallbackOnExtraCallbackWithResult.onNavigationEvent()) {
                return;
            }
            List<isPointInChildBounds> listOnNavigationEvent = isPointInChildBounds.onNavigationEvent(extracallbackOnExtraCallbackWithResult.onExtraCallback());
            this.IAuthTabCallback = listOnNavigationEvent;
            if (listOnNavigationEvent == null || (view = this.onExtraCallback.get()) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            }
            IAuthTabCallback();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IAuthTabCallback();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        if (this.IAuthTabCallback == null || this.onExtraCallback.get() == null) {
            return;
        }
        for (int i2 = 0; i2 < this.IAuthTabCallback.size(); i2++) {
            onExtraCallbackWithResult(this.IAuthTabCallback.get(i2), this.onExtraCallback.get());
        }
    }

    public void onExtraCallbackWithResult(isPointInChildBounds ispointinchildbounds, View view) {
        if (ispointinchildbounds == null || view == null) {
            return;
        }
        if (TextUtils.isEmpty(ispointinchildbounds.IAuthTabCallback()) || ispointinchildbounds.IAuthTabCallback().equals(this.onWarmupCompleted)) {
            List<offsetChildToAnchor> listOnExtraCallbackWithResult = ispointinchildbounds.onExtraCallbackWithResult();
            if (listOnExtraCallbackWithResult.size() <= 25) {
                Iterator<getSuggestedMinimumWidth$onExtraCallback> it = onExtraCallback(ispointinchildbounds, view, listOnExtraCallbackWithResult, 0, -1, this.onWarmupCompleted).iterator();
                while (it.hasNext()) {
                    onNavigationEvent(it.next(), view, ispointinchildbounds);
                }
            }
        }
    }

    public static List<getSuggestedMinimumWidth$onExtraCallback> onExtraCallback(isPointInChildBounds ispointinchildbounds, View view, List<offsetChildToAnchor> list, int i2, int i3, String str) {
        String str2 = str + "." + String.valueOf(i3);
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            if (i2 >= list.size()) {
                arrayList.add(new getSuggestedMinimumWidth$onExtraCallback(view, str2));
            } else {
                offsetChildToAnchor offsetchildtoanchor = list.get(i2);
                if (offsetchildtoanchor.IAuthTabCallback.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List<View> listOnExtraCallbackWithResult = onExtraCallbackWithResult((ViewGroup) parent);
                        int size = listOnExtraCallbackWithResult.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.addAll(onExtraCallback(ispointinchildbounds, listOnExtraCallbackWithResult.get(i4), list, i2 + 1, i4, str2));
                        }
                    }
                } else {
                    if (offsetchildtoanchor.IAuthTabCallback.equals(".")) {
                        arrayList.add(new getSuggestedMinimumWidth$onExtraCallback(view, str2));
                        return arrayList;
                    }
                    if (onExtraCallback(view, offsetchildtoanchor, i3)) {
                        if (i2 == list.size() - 1) {
                            arrayList.add(new getSuggestedMinimumWidth$onExtraCallback(view, str2));
                        }
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List<View> listOnExtraCallbackWithResult2 = onExtraCallbackWithResult((ViewGroup) view);
                int size2 = listOnExtraCallbackWithResult2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList.addAll(onExtraCallback(ispointinchildbounds, listOnExtraCallbackWithResult2.get(i5), list, i2 + 1, i5, str2));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean onExtraCallback(View view, offsetChildToAnchor offsetchildtoanchor, int i2) throws Throwable {
        int i3 = offsetchildtoanchor.onNavigationEvent;
        if (i3 != -1 && i2 != i3) {
            return false;
        }
        if (!view.getClass().getCanonicalName().equals(offsetchildtoanchor.IAuthTabCallback)) {
            if (offsetchildtoanchor.IAuthTabCallback.matches(".*android\\..*")) {
                String[] strArrSplit = offsetchildtoanchor.IAuthTabCallback.split("\\.");
                if (strArrSplit.length > 0) {
                }
            }
            return false;
        }
        if ((offsetchildtoanchor.asBinder & offsetChildToAnchor.onExtraCallbackWithResult.ID.getValue()) > 0 && offsetchildtoanchor.onExtraCallbackWithResult != view.getId()) {
            return false;
        }
        if ((offsetchildtoanchor.asBinder & offsetChildToAnchor.onExtraCallbackWithResult.TEXT.getValue()) > 0) {
            String str = offsetchildtoanchor.asInterface;
            String strAsInterface = onLayoutChild.asInterface(view);
            String strOnWarmupCompleted = mayLaunchUrl.onWarmupCompleted(mayLaunchUrl.asBinder(strAsInterface), "");
            if (!str.equals(strAsInterface) && !str.equals(strOnWarmupCompleted)) {
                return false;
            }
        }
        if ((offsetchildtoanchor.asBinder & offsetChildToAnchor.onExtraCallbackWithResult.DESCRIPTION.getValue()) > 0) {
            String str2 = offsetchildtoanchor.onExtraCallback;
            String strValueOf = view.getContentDescription() == null ? "" : String.valueOf(view.getContentDescription());
            String strOnWarmupCompleted2 = mayLaunchUrl.onWarmupCompleted(mayLaunchUrl.asBinder(strValueOf), "");
            if (!str2.equals(strValueOf) && !str2.equals(strOnWarmupCompleted2)) {
                return false;
            }
        }
        if ((offsetchildtoanchor.asBinder & offsetChildToAnchor.onExtraCallbackWithResult.HINT.getValue()) > 0) {
            String str3 = offsetchildtoanchor.onWarmupCompleted;
            String strIAuthTabCallbackStub = onLayoutChild.IAuthTabCallbackStub(view);
            String strOnWarmupCompleted3 = mayLaunchUrl.onWarmupCompleted(mayLaunchUrl.asBinder(strIAuthTabCallbackStub), "");
            if (!str3.equals(strIAuthTabCallbackStub) && !str3.equals(strOnWarmupCompleted3)) {
                return false;
            }
        }
        if ((offsetchildtoanchor.asBinder & offsetChildToAnchor.onExtraCallbackWithResult.TAG.getValue()) > 0) {
            String str4 = offsetchildtoanchor.IAuthTabCallbackDefault;
            String strValueOf2 = view.getTag() == null ? "" : String.valueOf(view.getTag());
            String strOnWarmupCompleted4 = mayLaunchUrl.onWarmupCompleted(mayLaunchUrl.asBinder(strValueOf2), "");
            if (!str4.equals(strValueOf2) && !str4.equals(strOnWarmupCompleted4)) {
                return false;
            }
        }
        return true;
    }

    private static List<View> onExtraCallbackWithResult(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private void onNavigationEvent(getSuggestedMinimumWidth$onExtraCallback getsuggestedminimumwidth_onextracallback, View view, isPointInChildBounds ispointinchildbounds) {
        if (ispointinchildbounds != null) {
            try {
                View viewOnNavigationEvent = getsuggestedminimumwidth_onextracallback.onNavigationEvent();
                if (viewOnNavigationEvent != null) {
                    View viewIAuthTabCallback = onLayoutChild.IAuthTabCallback(viewOnNavigationEvent);
                    if (viewIAuthTabCallback != null && onLayoutChild.IAuthTabCallback(viewOnNavigationEvent, viewIAuthTabCallback)) {
                        IAuthTabCallback(getsuggestedminimumwidth_onextracallback, view, ispointinchildbounds);
                        return;
                    }
                    if (viewOnNavigationEvent.getClass().getName().startsWith("com.facebook.react")) {
                        return;
                    }
                    if (!(viewOnNavigationEvent instanceof AdapterView)) {
                        onExtraCallbackWithResult(getsuggestedminimumwidth_onextracallback, view, ispointinchildbounds);
                    } else if (viewOnNavigationEvent instanceof ListView) {
                        onWarmupCompleted(getsuggestedminimumwidth_onextracallback, view, ispointinchildbounds);
                    }
                }
            } catch (Exception e) {
                mayLaunchUrl.onNavigationEvent(getSuggestedMinimumWidth.IAuthTabCallback(), e);
            }
        }
    }

    private void onExtraCallbackWithResult(getSuggestedMinimumWidth$onExtraCallback getsuggestedminimumwidth_onextracallback, View view, isPointInChildBounds ispointinchildbounds) {
        View viewOnNavigationEvent = getsuggestedminimumwidth_onextracallback.onNavigationEvent();
        if (viewOnNavigationEvent != null) {
            String strOnExtraCallbackWithResult = getsuggestedminimumwidth_onextracallback.onExtraCallbackWithResult();
            View.OnClickListener onClickListenerOnWarmupCompleted = onLayoutChild.onWarmupCompleted(viewOnNavigationEvent);
            boolean z = (onClickListenerOnWarmupCompleted instanceof getDescendantRect.onExtraCallback) && ((getDescendantRect.onExtraCallback) onClickListenerOnWarmupCompleted).onWarmupCompleted();
            if (this.onExtraCallbackWithResult.contains(strOnExtraCallbackWithResult) || z) {
                return;
            }
            viewOnNavigationEvent.setOnClickListener(getDescendantRect.onWarmupCompleted(ispointinchildbounds, view, viewOnNavigationEvent));
            this.onExtraCallbackWithResult.add(strOnExtraCallbackWithResult);
        }
    }

    private void onWarmupCompleted(getSuggestedMinimumWidth$onExtraCallback getsuggestedminimumwidth_onextracallback, View view, isPointInChildBounds ispointinchildbounds) {
        AdapterView adapterView = (AdapterView) getsuggestedminimumwidth_onextracallback.onNavigationEvent();
        if (adapterView != null) {
            String strOnExtraCallbackWithResult = getsuggestedminimumwidth_onextracallback.onExtraCallbackWithResult();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean z = (onItemClickListener instanceof getDescendantRect.onWarmupCompleted) && ((getDescendantRect.onWarmupCompleted) onItemClickListener).IAuthTabCallback();
            if (this.onExtraCallbackWithResult.contains(strOnExtraCallbackWithResult) || z) {
                return;
            }
            adapterView.setOnItemClickListener(getDescendantRect.onExtraCallbackWithResult(ispointinchildbounds, view, adapterView));
            this.onExtraCallbackWithResult.add(strOnExtraCallbackWithResult);
        }
    }

    private void IAuthTabCallback(getSuggestedMinimumWidth$onExtraCallback getsuggestedminimumwidth_onextracallback, View view, isPointInChildBounds ispointinchildbounds) {
        View viewOnNavigationEvent = getsuggestedminimumwidth_onextracallback.onNavigationEvent();
        if (viewOnNavigationEvent != null) {
            String strOnExtraCallbackWithResult = getsuggestedminimumwidth_onextracallback.onExtraCallbackWithResult();
            View.OnTouchListener onTouchListenerAsBinder = onLayoutChild.asBinder(viewOnNavigationEvent);
            boolean z = (onTouchListenerAsBinder instanceof RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) && ((RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) onTouchListenerAsBinder).onExtraCallbackWithResult();
            if (this.onExtraCallbackWithResult.contains(strOnExtraCallbackWithResult) || z) {
                return;
            }
            viewOnNavigationEvent.setOnTouchListener(RCTCodelessLoggingEventListener.onExtraCallbackWithResult(ispointinchildbounds, view, viewOnNavigationEvent));
            this.onExtraCallbackWithResult.add(strOnExtraCallbackWithResult);
        }
    }
}
