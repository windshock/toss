package com.tmoney.kscc.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class SessionCookieMgr {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String COOKEY_KEY = "Cookie";
    private static int IAuthTabCallback = 0;
    private static final String SESSION_COOKIE = "JSESSIONID";
    private static final String SET_COOKEY_KEY = "Set-Cookie";
    private static final String TAG = "SessionCookieMgr";
    private static SessionCookieMgr m_instance = null;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private Context m_context;
    private SharedPreferences m_pref;

    static {
        IAuthTabCallback();
        int i = IAuthTabCallback + 63;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private SessionCookieMgr(Context context) {
        this.m_context = context;
        setReference();
    }

    public static SessionCookieMgr getInstance() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SessionCookieMgr sessionCookieMgr = m_instance;
        int i5 = i3 + 35;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionCookieMgr;
        }
        throw null;
    }

    public static void initialize(Context context) {
        if (m_instance == null) {
            synchronized (SessionCookieMgr.class) {
                if (m_instance == null) {
                    m_instance = new SessionCookieMgr(context);
                }
            }
        }
    }

    private void setReference() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            this.m_pref = PreferenceManager.getDefaultSharedPreferences(this.m_context);
            int i3 = 2 / 0;
        } else {
            this.m_pref = PreferenceManager.getDefaultSharedPreferences(this.m_context);
        }
        int i4 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void addSessionCookie(Map<String, String> map) throws Throwable {
        Object obj;
        int i = 2 % 2;
        String string = this.m_pref.getString(SESSION_COOKIE, "");
        LogHelper.d(TAG, "addSessionCookie -> " + string);
        if (string.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(SESSION_COOKIE);
            sb.append("=");
            sb.append(string);
            Object[] objArr = new Object[1];
            a(new char[]{14552, 353, 19422, 37967, 56998, 10007}, 14741 - TextUtils.indexOf("", ""), objArr);
            if (map.containsKey(((String) objArr[0]).intern())) {
                int i2 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                sb.append("; ");
                if (i3 != 0) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{14552, 353, 19422, 37967, 56998, 10007}, (TypedValue.complexToFraction(1, 2.0f, 2.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(1, 2.0f, 2.0f) == 0.0f ? 0 : -1)) + 10416, objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{14552, 353, 19422, 37967, 56998, 10007}, 14741 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                    obj = objArr3[0];
                }
                sb.append(map.get(((String) obj).intern()));
            }
            LogHelper.d(TAG, "addSessionCookie put cookie -> " + sb.toString());
            Object[] objArr4 = new Object[1];
            a(new char[]{14552, 353, 19422, 37967, 56998, 10007}, 14740 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
            map.put(((String) objArr4[0]).intern(), sb.toString());
        }
        int i4 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    public final void checkSessionCookie(Map<String, String> map) {
        int i = 2 % 2;
        LogHelper.d(TAG, "checkSessionCookie!!");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String string = it.next().toString();
            LogHelper.d(TAG, string + ":" + map.get(string));
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        if (map.containsKey(SET_COOKEY_KEY) && map.get(SET_COOKEY_KEY).startsWith(SESSION_COOKIE)) {
            String str = map.get(SET_COOKEY_KEY);
            LogHelper.d(TAG, "cookie -> " + str);
            if (str.length() > 0) {
                int i4 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                String[] strArrSplit = str.split(";");
                String str2 = i5 == 0 ? strArrSplit[0].split("=")[1] : strArrSplit[0].split("=")[1];
                SharedPreferences.Editor editorEdit = this.m_pref.edit();
                editorEdit.putString(SESSION_COOKIE, str2);
                editorEdit.commit();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), TextUtils.getOffsetBefore("", 0) + 24, TextUtils.lastIndexOf("", '0', 0, 0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $10 + 27;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 53;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 59, 6383 - Color.red(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 59 - Gravity.getAbsoluteGravity(0, 0), Color.green(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 4766172031028477356L;
    }
}
