package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EditText;
import im.toss.core.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Enable {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final CharSequence onNavigationEvent(@NotNull EditText editText) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(editText, "");
        TextWatcher textWatcherOnExtraCallback$166805f2 = onExtraCallback$166805f2(editText);
        if (textWatcherOnExtraCallback$166805f2 != null) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1158249960);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 36696), 29 - (ViewConfiguration.getTouchSlop() >> 8), 6904 - ((byte) KeyEvent.getModifierMetaStateMask()), 1950974840, false, "onExtraCallback", new Class[0]);
                }
                CharSequence charSequence = (CharSequence) ((Method) objOnExtraCallback).invoke(textWatcherOnExtraCallback$166805f2, null);
                if (charSequence != null) {
                    int i2 = onExtraCallback + 51;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return charSequence;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Editable text = editText.getText();
        int i4 = onExtraCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return text;
    }

    public static final void onNavigationEvent(@NotNull EditText editText, @NotNull CharSequence charSequence) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        TextWatcher textWatcherOnExtraCallback$166805f2 = onExtraCallback$166805f2(editText);
        if (textWatcherOnExtraCallback$166805f2 == null) {
            editText.setText(charSequence);
            int i2 = onExtraCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = onExtraCallbackWithResult + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        try {
            Object[] objArr = {charSequence};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(679606980);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 36697), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 6905, 432079956, false, "onExtraCallback", new Class[]{CharSequence.class});
            }
            ((Method) objOnExtraCallback).invoke(textWatcherOnExtraCallback$166805f2, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final TextWatcher onWarmupCompleted$166805f2(@NotNull EditText editText) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(editText, "");
        TextWatcher textWatcherOnExtraCallback$166805f2 = onExtraCallback$166805f2(editText);
        if (textWatcherOnExtraCallback$166805f2 == null) {
            try {
                Object[] objArr = {editText};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-861067119);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (36695 - ((byte) KeyEvent.getModifierMetaStateMask())), 29 - Color.argb(0, 0, 0, 0), 6906 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -34744831, false, (String) null, new Class[]{EditText.class});
                }
                textWatcherOnExtraCallback$166805f2 = (TextWatcher) ((Constructor) objOnExtraCallback).newInstance(objArr);
                editText.addTextChangedListener(textWatcherOnExtraCallback$166805f2);
                editText.setTag(R.id.secure_buffer_text_watcher, textWatcherOnExtraCallback$166805f2);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return textWatcherOnExtraCallback$166805f2;
        }
        throw null;
    }

    private static final TextWatcher onExtraCallback$166805f2(EditText editText) {
        int i = 2 % 2;
        Object tag = editText.getTag(R.id.secure_buffer_text_watcher);
        if (!((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36696), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, 6905 - (ViewConfiguration.getTapTimeout() >> 16))).isInstance(tag)) {
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        TextWatcher textWatcher = (TextWatcher) tag;
        int i7 = i4 + 71;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return textWatcher;
    }
}
