package o;

import android.os.Bundle;
import android.view.View;
import com.facebook.appevents.IAuthTabCallbackStubProxy;
import com.facebook.internal.mayLaunchUrl;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import o.onApplyWindowInsets;
import o.resolveGravity;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0 implements View.OnClickListener {
    private static final Set<Integer> onWarmupCompleted = new HashSet();
    private String IAuthTabCallback;
    private WeakReference<View> onExtraCallback;
    private View.OnClickListener onExtraCallbackWithResult;
    private WeakReference<View> onNavigationEvent;

    static /* synthetic */ String onExtraCallbackWithResult(ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0 activityCompatSharedElementCallback21ImplExternalSyntheticLambda0) {
        if (convertResponseToCredentialManager.onExtraCallback(ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class)) {
            return null;
        }
        try {
            return activityCompatSharedElementCallback21ImplExternalSyntheticLambda0.IAuthTabCallback;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class);
            return null;
        }
    }

    static /* synthetic */ void onWarmupCompleted(String str, String str2, float[] fArr) {
        if (convertResponseToCredentialManager.onExtraCallback(ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class)) {
            return;
        }
        try {
            IAuthTabCallback(str, str2, fArr);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class);
        }
    }

    static void onExtraCallback(View view, View view2, String str) {
        if (convertResponseToCredentialManager.onExtraCallback(ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class)) {
            return;
        }
        try {
            int iHashCode = view.hashCode();
            Set<Integer> set = onWarmupCompleted;
            if (set.contains(Integer.valueOf(iHashCode))) {
                return;
            }
            Object[] objArr = {view, new ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0(view, view2, str)};
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            onLayoutChild.onExtraCallback(objArr, iIAuthTabCallback, zziea.IAuthTabCallback(), -44141260, zziea.IAuthTabCallback(), iIAuthTabCallback2, 44141261);
            set.add(Integer.valueOf(iHashCode));
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class);
        }
    }

    private ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0(View view, View view2, String str) {
        this.onExtraCallbackWithResult = onLayoutChild.onWarmupCompleted(view);
        this.onNavigationEvent = new WeakReference<>(view);
        this.onExtraCallback = new WeakReference<>(view2);
        this.IAuthTabCallback = str.toLowerCase().replace("activity", "");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.onExtraCallbackWithResult;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            IAuthTabCallback();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private void IAuthTabCallback() {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            View view = this.onExtraCallback.get();
            View view2 = this.onNavigationEvent.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strIAuthTabCallback = onDependentViewChanged.IAuthTabCallback(view2);
                String strIAuthTabCallback2 = onDependentViewRemoved.IAuthTabCallback(view2, strIAuthTabCallback);
                if (strIAuthTabCallback2 == null || onExtraCallback(strIAuthTabCallback2, strIAuthTabCallback)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("view", onDependentViewChanged.onExtraCallback(view, view2));
                jSONObject.put("screenname", this.IAuthTabCallback);
                onExtraCallbackWithResult(strIAuthTabCallback2, strIAuthTabCallback, jSONObject);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private static boolean onExtraCallback(String str, final String str2) {
        if (convertResponseToCredentialManager.onExtraCallback(ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class)) {
            return false;
        }
        try {
            final String strIAuthTabCallback = onDependentViewRemoved.IAuthTabCallback(str);
            if (strIAuthTabCallback == null) {
                return false;
            }
            if (strIAuthTabCallback.equals("other")) {
                return true;
            }
            Object[] objArr = {new Runnable() { // from class: o.ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.2
                @Override // java.lang.Runnable
                public void run() {
                    if (convertResponseToCredentialManager.onExtraCallback(this)) {
                        return;
                    }
                    try {
                        ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.onWarmupCompleted(strIAuthTabCallback, str2, new float[0]);
                    } catch (Throwable th) {
                        convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                    }
                }
            }};
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            mayLaunchUrl.onExtraCallbackWithResult(-1500563413, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1500563414);
            return true;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class);
            return false;
        }
    }

    private void onExtraCallbackWithResult(final String str, final String str2, final JSONObject jSONObject) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            Object[] objArr = {new Runnable() { // from class: o.ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.4
                @Override // java.lang.Runnable
                public void run() {
                    String[] strArrOnWarmupCompleted;
                    if (convertResponseToCredentialManager.onExtraCallback(this)) {
                        return;
                    }
                    try {
                        String lowerCase = mayLaunchUrl.onNavigationEvent(performIntercept.onExtraCallbackWithResult()).toLowerCase();
                        float[] fArrOnExtraCallbackWithResult = onDetachedFromLayoutParams.onExtraCallbackWithResult(jSONObject, lowerCase);
                        String strIAuthTabCallback = onDetachedFromLayoutParams.IAuthTabCallback(str2, ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.onExtraCallbackWithResult(ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.this), lowerCase);
                        if (fArrOnExtraCallbackWithResult == null || (strArrOnWarmupCompleted = onApplyWindowInsets.onWarmupCompleted(onApplyWindowInsets.onExtraCallback.MTML_APP_EVENT_PREDICTION, new float[][]{fArrOnExtraCallbackWithResult}, new String[]{strIAuthTabCallback})) == null) {
                            return;
                        }
                        String str3 = strArrOnWarmupCompleted[0];
                        onDependentViewRemoved.onWarmupCompleted(str, str3);
                        if (str3.equals("other")) {
                            return;
                        }
                        ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.onWarmupCompleted(str3, str2, fArrOnExtraCallbackWithResult);
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                    }
                }
            }};
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            mayLaunchUrl.onExtraCallbackWithResult(-1500563413, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1500563414);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private static void IAuthTabCallback(String str, String str2, float[] fArr) {
        if (convertResponseToCredentialManager.onExtraCallback(ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class)) {
            return;
        }
        try {
            if (getLifecycleRegistryannotations.onExtraCallback(str)) {
                new IAuthTabCallbackStubProxy(performIntercept.onExtraCallbackWithResult()).onWarmupCompleted(str, str2);
            } else if (getLifecycleRegistryannotations.IAuthTabCallback(str)) {
                onExtraCallback(str, str2, fArr);
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class);
        }
    }

    private static void onExtraCallback(String str, String str2, float[] fArr) {
        if (convertResponseToCredentialManager.onExtraCallback(ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : fArr) {
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString(TtmlNode.TAG_METADATA, jSONObject.toString());
                resolveGravity resolvegravityOnExtraCallback = resolveGravity.onExtraCallback((acquireTempRect) null, String.format(Locale.US, "%s/suggested_events", performIntercept.onTransact()), (JSONObject) null, (resolveGravity.onWarmupCompleted) null);
                resolveGravity.onWarmupCompleted(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{resolvegravityOnExtraCallback, bundle}, 993242141, -993242140, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback());
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.class);
        }
    }
}
