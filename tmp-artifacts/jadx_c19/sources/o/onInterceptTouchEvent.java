package o;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onInterceptTouchEvent {
    public static boolean onExtraCallbackWithResult(View view) {
        if (!convertResponseToCredentialManager.onExtraCallback(onInterceptTouchEvent.class) && (view instanceof TextView)) {
            try {
                TextView textView = (TextView) view;
                if (onNavigationEvent(textView) || IAuthTabCallback(textView) || onWarmupCompleted(textView) || asBinder(textView) || onExtraCallbackWithResult(textView)) {
                    return true;
                }
                return onExtraCallback(textView);
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, onInterceptTouchEvent.class);
            }
        }
        return false;
    }

    private static boolean onNavigationEvent(TextView textView) {
        if (convertResponseToCredentialManager.onExtraCallback(onInterceptTouchEvent.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onInterceptTouchEvent.class);
            return false;
        }
    }

    private static boolean onExtraCallback(TextView textView) {
        if (convertResponseToCredentialManager.onExtraCallback(onInterceptTouchEvent.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String strAsInterface = onLayoutChild.asInterface(textView);
            if (strAsInterface != null && strAsInterface.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(strAsInterface).matches();
            }
            return false;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onInterceptTouchEvent.class);
            return false;
        }
    }

    private static boolean onWarmupCompleted(TextView textView) {
        if (convertResponseToCredentialManager.onExtraCallback(onInterceptTouchEvent.class)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onInterceptTouchEvent.class);
            return false;
        }
    }

    private static boolean asBinder(TextView textView) {
        if (convertResponseToCredentialManager.onExtraCallback(onInterceptTouchEvent.class)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onInterceptTouchEvent.class);
            return false;
        }
    }

    private static boolean onExtraCallbackWithResult(TextView textView) {
        if (convertResponseToCredentialManager.onExtraCallback(onInterceptTouchEvent.class)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onInterceptTouchEvent.class);
            return false;
        }
    }

    private static boolean IAuthTabCallback(TextView textView) {
        if (convertResponseToCredentialManager.onExtraCallback(onInterceptTouchEvent.class)) {
            return false;
        }
        try {
            String strReplaceAll = onLayoutChild.asInterface(textView).replaceAll("\\s", "");
            int length = strReplaceAll.length();
            if (length >= 12 && length <= 19) {
                int i2 = 0;
                boolean z = false;
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    char cCharAt = strReplaceAll.charAt(i3);
                    if (cCharAt < '0' || cCharAt > '9') {
                        return false;
                    }
                    int i4 = cCharAt - '0';
                    if (z && (i4 = i4 << 1) > 9) {
                        i4 = (i4 % 10) + 1;
                    }
                    i2 += i4;
                    z = !z;
                }
                if (i2 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onInterceptTouchEvent.class);
            return false;
        }
    }
}
