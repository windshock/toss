package o;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class getLastChildRect {
    getLastChildRect() {
    }

    static List<String> IAuthTabCallback(View view) {
        if (convertResponseToCredentialManager.onExtraCallback(getLastChildRect.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(onLayoutChild.IAuthTabCallbackStub(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String[] strArrSplit = view.getResources().getResourceName(view.getId()).split("/");
                    if (strArrSplit.length == 2) {
                        arrayList.add(strArrSplit[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (!str.isEmpty() && str.length() <= 100) {
                    arrayList2.add(str.toLowerCase());
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastChildRect.class);
            return null;
        }
    }

    static List<String> onExtraCallbackWithResult(View view) {
        if (convertResponseToCredentialManager.onExtraCallback(getLastChildRect.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupIAuthTabCallbackDefault = onLayoutChild.IAuthTabCallbackDefault(view);
            if (viewGroupIAuthTabCallbackDefault != null) {
                for (View view2 : onLayoutChild.onExtraCallbackWithResult(viewGroupIAuthTabCallbackDefault)) {
                    if (view != view2) {
                        arrayList.addAll(onWarmupCompleted(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastChildRect.class);
            return null;
        }
    }

    static boolean IAuthTabCallback(List<String> list, List<String> list2) {
        if (convertResponseToCredentialManager.onExtraCallback(getLastChildRect.class)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (onExtraCallbackWithResult(it.next(), list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastChildRect.class);
            return false;
        }
    }

    static boolean onExtraCallbackWithResult(String str, List<String> list) {
        if (convertResponseToCredentialManager.onExtraCallback(getLastChildRect.class)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastChildRect.class);
            return false;
        }
    }

    static boolean onExtraCallbackWithResult(String str, String str2) {
        if (convertResponseToCredentialManager.onExtraCallback(getLastChildRect.class)) {
            return false;
        }
        try {
            return str.matches(str2);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastChildRect.class);
            return false;
        }
    }

    static List<String> onWarmupCompleted(View view) {
        if (convertResponseToCredentialManager.onExtraCallback(getLastChildRect.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (!string.isEmpty() && string.length() < 100) {
                    arrayList.add(string.toLowerCase());
                    return arrayList;
                }
            } else {
                Iterator<View> it = onLayoutChild.onExtraCallbackWithResult(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(onWarmupCompleted(it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastChildRect.class);
            return null;
        }
    }
}
