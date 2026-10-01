package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class onDependentViewChanged {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static final List<Class<? extends View>> onNavigationEvent;
    private static int onWarmupCompleted = 1;

    onDependentViewChanged() {
    }

    static {
        onWarmupCompleted();
        onNavigationEvent = new ArrayList(Arrays.asList(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class));
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 45813), 84 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 21233 - (ViewConfiguration.getPressedStateDuration() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - Color.red(0)), 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 8809 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i7 = $10 + 19;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static JSONObject onExtraCallback(View view, View view2) {
        int i2 = 2 % 2;
        int i3 = asInterface + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDependentViewChanged.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            onWarmupCompleted(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<View> it = onLayoutChild.onExtraCallbackWithResult(view).iterator();
            int i5 = asInterface + 67;
            while (true) {
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (!it.hasNext()) {
                    break;
                }
                jSONArray.put(onExtraCallback(it.next(), view2));
                i5 = asInterface + 83;
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDependentViewChanged.class);
            return null;
        }
    }

    static void onWarmupCompleted(View view, JSONObject jSONObject) {
        int i2 = 2 % 2;
        if (!convertResponseToCredentialManager.onExtraCallback(onDependentViewChanged.class)) {
            try {
                String strAsInterface = onLayoutChild.asInterface(view);
                String strIAuthTabCallbackStub = onLayoutChild.IAuthTabCallbackStub(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", onLayoutChild.onExtraCallback(view));
                if (!strAsInterface.isEmpty()) {
                    Object[] objArr = new Object[1];
                    a(new char[]{59112, 27918, 59036, 46134, 58219, 41199, 12102, 35731}, 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                    jSONObject.put(((String) objArr[0]).intern(), strAsInterface);
                }
                if (!strIAuthTabCallbackStub.isEmpty()) {
                    jSONObject.put("hint", strIAuthTabCallbackStub);
                }
                if (view instanceof EditText) {
                    int i3 = asInterface + 63;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                    return;
                }
            } catch (JSONException unused) {
                return;
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDependentViewChanged.class);
            }
        }
        int i5 = onExtraCallback + 55;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = o.onDependentViewChanged.onExtraCallback + 69;
        o.onDependentViewChanged.asInterface = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r2.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r7 = o.onLayoutChild.onExtraCallbackWithResult(r7).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if ((!r7.hasNext()) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r2.addAll(onNavigationEvent(r7.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r7.isClickable() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static List<View> onNavigationEvent(View view) {
        int i2 = 2 % 2;
        int i3 = asInterface + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (convertResponseToCredentialManager.onExtraCallback(onDependentViewChanged.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = onNavigationEvent.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().isInstance(view)) {
                    break;
                }
            }
            int i5 = asInterface + 61;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return arrayList;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDependentViewChanged.class);
            return null;
        }
    }

    static String IAuthTabCallback(View view) {
        int i2 = 2 % 2;
        Object obj = null;
        if (convertResponseToCredentialManager.onExtraCallback(onDependentViewChanged.class)) {
            int i3 = asInterface + 11;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        try {
            String strAsInterface = onLayoutChild.asInterface(view);
            if (!(!strAsInterface.isEmpty())) {
                return TextUtils.join(" ", onExtraCallbackWithResult(view));
            }
            int i5 = asInterface;
            int i6 = i5 + 5;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = i5 + 39;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return strAsInterface;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDependentViewChanged.class);
            return null;
        }
    }

    private static List<String> onExtraCallbackWithResult(View view) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            convertResponseToCredentialManager.onExtraCallback(onDependentViewChanged.class);
            obj.hashCode();
            throw null;
        }
        if (convertResponseToCredentialManager.onExtraCallback(onDependentViewChanged.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : onLayoutChild.onExtraCallbackWithResult(view)) {
                String strAsInterface = onLayoutChild.asInterface(view2);
                if (!strAsInterface.isEmpty()) {
                    arrayList.add(strAsInterface);
                    int i4 = onExtraCallback + 47;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                }
                arrayList.addAll(onExtraCallbackWithResult(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDependentViewChanged.class);
            return null;
        }
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -3874214399335418232L;
    }
}
