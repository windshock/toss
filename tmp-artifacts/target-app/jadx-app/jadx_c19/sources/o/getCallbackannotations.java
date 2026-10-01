package o;

import com.alibaba.ariver.kernel.common.log.ApiLog;
import com.facebook.internal.mayLaunchUrl;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CredentialProviderBeginSignInController;
import o.resolveGravity;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getCallbackannotations {
    public static final getCallbackannotations IAuthTabCallback = new getCallbackannotations();
    private static final AtomicBoolean onExtraCallbackWithResult = new AtomicBoolean(false);

    private getCallbackannotations() {
    }

    @JvmStatic
    public static final void onExtraCallback() {
        synchronized (getCallbackannotations.class) {
            if (convertResponseToCredentialManager.onExtraCallback(getCallbackannotations.class)) {
                return;
            }
            try {
                if (onExtraCallbackWithResult.getAndSet(true)) {
                    return;
                }
                if (performIntercept.asBinder()) {
                    onWarmupCompleted();
                }
                getExecutorannotations.onExtraCallbackWithResult();
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, getCallbackannotations.class);
            }
        }
    }

    @JvmStatic
    public static final void onWarmupCompleted() {
        if (convertResponseToCredentialManager.onExtraCallback(getCallbackannotations.class)) {
            return;
        }
        try {
            if (mayLaunchUrl.asInterface()) {
                return;
            }
            File[] fileArrIAuthTabCallback = accessmaybeReportErrorFromResultReceiver.IAuthTabCallback();
            ArrayList arrayList = new ArrayList(fileArrIAuthTabCallback.length);
            for (File file : fileArrIAuthTabCallback) {
                arrayList.add(CredentialProviderBeginSignInController.onExtraCallback.onExtraCallback(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((CredentialProviderBeginSignInController) obj).onWarmupCompleted()) {
                    arrayList2.add(obj);
                }
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList2, onExtraCallbackWithResult.onWarmupCompleted);
            JSONArray jSONArray = new JSONArray();
            IntIterator it = RangesKt.until(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(it.nextInt()));
            }
            accessmaybeReportErrorFromResultReceiver.onExtraCallbackWithResult("anr_reports", jSONArray, new IAuthTabCallback(listSortedWith));
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getCallbackannotations.class);
        }
    }

    static final class onExtraCallbackWithResult<T> implements Comparator {
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
        }

        @Override // java.util.Comparator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final int compare(CredentialProviderBeginSignInController credentialProviderBeginSignInController, CredentialProviderBeginSignInController credentialProviderBeginSignInController2) {
            Intrinsics.checkNotNullExpressionValue(credentialProviderBeginSignInController2, "");
            return credentialProviderBeginSignInController.onNavigationEvent(credentialProviderBeginSignInController2);
        }
    }

    static final class IAuthTabCallback implements resolveGravity.onWarmupCompleted {
        final /* synthetic */ List onExtraCallbackWithResult;

        IAuthTabCallback(List list) {
            this.onExtraCallbackWithResult = list;
        }

        public final void onExtraCallback(@NotNull setInsetOffsetX setinsetoffsetx) {
            JSONObject jSONObjectOnExtraCallback;
            Intrinsics.checkNotNullParameter(setinsetoffsetx, "");
            try {
                if (setinsetoffsetx.onNavigationEvent() == null && (jSONObjectOnExtraCallback = setinsetoffsetx.onExtraCallback()) != null && jSONObjectOnExtraCallback.getBoolean(ApiLog.API_LOG_STATE_SUCCESS)) {
                    Iterator it = this.onExtraCallbackWithResult.iterator();
                    while (it.hasNext()) {
                        ((CredentialProviderBeginSignInController) it.next()).onNavigationEvent();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }
}
