package o;

import com.alibaba.ariver.kernel.common.log.ApiLog;
import com.facebook.internal.mayLaunchUrl;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CredentialProviderBeginSignInController;
import o.resolveGravity;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class invokePlayServices implements Thread.UncaughtExceptionHandler {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final String onExtraCallback = invokePlayServices.class.getCanonicalName();
    private static invokePlayServices onWarmupCompleted;
    private final Thread.UncaughtExceptionHandler onExtraCallbackWithResult;

    public /* synthetic */ invokePlayServices(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    private invokePlayServices(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.onExtraCallbackWithResult = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(thread, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (accessmaybeReportErrorFromResultReceiver.onNavigationEvent(th)) {
            constructBeginSignInRequestcredentials_play_services_auth_release.onExtraCallback(th);
            CredentialProviderBeginSignInController.onExtraCallback.onExtraCallbackWithResult(th, CredentialProviderBeginSignInController.onNavigationEvent.CrashReport).IAuthTabCallback();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.onExtraCallbackWithResult;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public static final class onNavigationEvent {
        private onNavigationEvent() {
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void onExtraCallbackWithResult() {
            synchronized (this) {
                if (performIntercept.asBinder()) {
                    onWarmupCompleted();
                }
                if (invokePlayServices.onWarmupCompleted != null) {
                    String unused = invokePlayServices.onExtraCallback;
                } else {
                    invokePlayServices.onWarmupCompleted = new invokePlayServices(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(invokePlayServices.onWarmupCompleted);
                }
            }
        }

        private final void onWarmupCompleted() {
            if (mayLaunchUrl.asInterface()) {
                return;
            }
            File[] fileArrOnWarmupCompleted = accessmaybeReportErrorFromResultReceiver.onWarmupCompleted();
            ArrayList arrayList = new ArrayList(fileArrOnWarmupCompleted.length);
            for (File file : fileArrOnWarmupCompleted) {
                arrayList.add(CredentialProviderBeginSignInController.onExtraCallback.onExtraCallback(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((CredentialProviderBeginSignInController) obj).onWarmupCompleted()) {
                    arrayList2.add(obj);
                }
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList2, onWarmupCompleted.onNavigationEvent);
            JSONArray jSONArray = new JSONArray();
            IntIterator it = RangesKt.until(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(it.nextInt()));
            }
            accessmaybeReportErrorFromResultReceiver.onExtraCallbackWithResult("crash_reports", jSONArray, new C0044onNavigationEvent(listSortedWith));
        }

        static final class onWarmupCompleted<T> implements Comparator {
            public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

            onWarmupCompleted() {
            }

            @Override // java.util.Comparator
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final int compare(CredentialProviderBeginSignInController credentialProviderBeginSignInController, CredentialProviderBeginSignInController credentialProviderBeginSignInController2) {
                Intrinsics.checkNotNullExpressionValue(credentialProviderBeginSignInController2, "");
                return credentialProviderBeginSignInController.onNavigationEvent(credentialProviderBeginSignInController2);
            }
        }

        /* renamed from: o.invokePlayServices$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        static final class C0044onNavigationEvent implements resolveGravity.onWarmupCompleted {
            final /* synthetic */ List onWarmupCompleted;

            C0044onNavigationEvent(List list) {
                this.onWarmupCompleted = list;
            }

            public final void onExtraCallback(@NotNull setInsetOffsetX setinsetoffsetx) {
                JSONObject jSONObjectOnExtraCallback;
                Intrinsics.checkNotNullParameter(setinsetoffsetx, "");
                try {
                    if (setinsetoffsetx.onNavigationEvent() == null && (jSONObjectOnExtraCallback = setinsetoffsetx.onExtraCallback()) != null && jSONObjectOnExtraCallback.getBoolean(ApiLog.API_LOG_STATE_SUCCESS)) {
                        Iterator it = this.onWarmupCompleted.iterator();
                        while (it.hasNext()) {
                            ((CredentialProviderBeginSignInController) it.next()).onNavigationEvent();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}
