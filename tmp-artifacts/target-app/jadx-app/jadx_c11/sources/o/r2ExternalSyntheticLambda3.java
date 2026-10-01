package o;

import android.graphics.Color;
import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r2ExternalSyntheticLambda3 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r2ExternalSyntheticLambda3[] $VALUES;
    public static final r2ExternalSyntheticLambda3 DIVIDEND;
    public static final r2ExternalSyntheticLambda3 EARNING;
    public static final r2ExternalSyntheticLambda3 ECONOMIC;
    private static int IAuthTabCallback = 0;
    public static final r2ExternalSyntheticLambda3 UNKNOWN;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;

    private static final /* synthetic */ r2ExternalSyntheticLambda3[] $values() {
        r2ExternalSyntheticLambda3[] r2externalsyntheticlambda3Arr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            r2ExternalSyntheticLambda3 r2externalsyntheticlambda3 = ECONOMIC;
            r2ExternalSyntheticLambda3 r2externalsyntheticlambda32 = EARNING;
            r2ExternalSyntheticLambda3 r2externalsyntheticlambda33 = DIVIDEND;
            r2ExternalSyntheticLambda3 r2externalsyntheticlambda34 = UNKNOWN;
            r2externalsyntheticlambda3Arr = new r2ExternalSyntheticLambda3[4];
            r2externalsyntheticlambda3Arr[0] = r2externalsyntheticlambda3;
            r2externalsyntheticlambda3Arr[1] = r2externalsyntheticlambda32;
            r2externalsyntheticlambda3Arr[2] = r2externalsyntheticlambda33;
            r2externalsyntheticlambda3Arr[4] = r2externalsyntheticlambda34;
        } else {
            r2externalsyntheticlambda3Arr = new r2ExternalSyntheticLambda3[]{ECONOMIC, EARNING, DIVIDEND, UNKNOWN};
        }
        int i4 = i3 + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return r2externalsyntheticlambda3Arr;
    }

    public static EnumEntries<r2ExternalSyntheticLambda3> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<r2ExternalSyntheticLambda3> enumEntries = $ENTRIES;
        int i5 = i3 + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static r2ExternalSyntheticLambda3 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r2ExternalSyntheticLambda3 r2externalsyntheticlambda3 = (r2ExternalSyntheticLambda3) Enum.valueOf(r2ExternalSyntheticLambda3.class, str);
        int i4 = onExtraCallback + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return r2externalsyntheticlambda3;
    }

    public static r2ExternalSyntheticLambda3[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r2ExternalSyntheticLambda3[] r2externalsyntheticlambda3Arr = (r2ExternalSyntheticLambda3[]) $VALUES.clone();
        int i3 = onExtraCallback + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
        return r2externalsyntheticlambda3Arr;
    }

    private r2ExternalSyntheticLambda3(String str, int i) {
    }

    static {
        IAuthTabCallback();
        ECONOMIC = new r2ExternalSyntheticLambda3("ECONOMIC", 0);
        EARNING = new r2ExternalSyntheticLambda3("EARNING", 1);
        DIVIDEND = new r2ExternalSyntheticLambda3("DIVIDEND", 2);
        Object[] objArr = new Object[1];
        a(new char[]{64876, 9536, 19740, 30162, 40362, 50301, 60477}, 55351 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        UNKNOWN = new r2ExternalSyntheticLambda3(((String) objArr[0]).intern(), 3);
        r2ExternalSyntheticLambda3[] r2externalsyntheticlambda3Arr$values = $values();
        $VALUES = r2externalsyntheticlambda3Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r2externalsyntheticlambda3Arr$values);
        int i = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 25, Color.red(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 59, 6383 - (KeyEvent.getMaxKeyCode() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59, (Process.myTid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i4 = $10 + 53;
            $11 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str = new String(cArr2);
        int i6 = $10 + 61;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = -4444693030065768434L;
    }
}
