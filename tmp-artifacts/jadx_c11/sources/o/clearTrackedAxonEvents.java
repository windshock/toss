package o;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class clearTrackedAxonEvents {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ clearTrackedAxonEvents[] $VALUES;
    private static int IAuthTabCallback = 0;
    public static final clearTrackedAxonEvents NOT_READY;
    public static final clearTrackedAxonEvents READY;
    public static final clearTrackedAxonEvents UNKNOWN;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted;

    private static final /* synthetic */ clearTrackedAxonEvents[] $values() {
        clearTrackedAxonEvents[] cleartrackedaxoneventsArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            clearTrackedAxonEvents cleartrackedaxonevents = READY;
            clearTrackedAxonEvents cleartrackedaxonevents2 = NOT_READY;
            clearTrackedAxonEvents cleartrackedaxonevents3 = UNKNOWN;
            cleartrackedaxoneventsArr = new clearTrackedAxonEvents[4];
            cleartrackedaxoneventsArr[0] = cleartrackedaxonevents;
            cleartrackedaxoneventsArr[0] = cleartrackedaxonevents2;
            cleartrackedaxoneventsArr[4] = cleartrackedaxonevents3;
        } else {
            cleartrackedaxoneventsArr = new clearTrackedAxonEvents[]{READY, NOT_READY, UNKNOWN};
        }
        int i4 = i3 + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cleartrackedaxoneventsArr;
    }

    public static EnumEntries<clearTrackedAxonEvents> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<clearTrackedAxonEvents> enumEntries = $ENTRIES;
        int i5 = i3 + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static clearTrackedAxonEvents valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        clearTrackedAxonEvents cleartrackedaxonevents = (clearTrackedAxonEvents) Enum.valueOf(clearTrackedAxonEvents.class, str);
        int i4 = IAuthTabCallback + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return cleartrackedaxonevents;
    }

    public static clearTrackedAxonEvents[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        clearTrackedAxonEvents[] cleartrackedaxoneventsArr = $VALUES;
        if (i3 != 0) {
            return (clearTrackedAxonEvents[]) cleartrackedaxoneventsArr.clone();
        }
        throw null;
    }

    private clearTrackedAxonEvents(String str, int i) {
    }

    static {
        IAuthTabCallback();
        READY = new clearTrackedAxonEvents("READY", 0);
        NOT_READY = new clearTrackedAxonEvents("NOT_READY", 1);
        Object[] objArr = new Object[1];
        a(new char[]{49998, 27816, 40106, 52386, 31904, 44221, 56507}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45053, objArr);
        UNKNOWN = new clearTrackedAxonEvents(((String) objArr[0]).intern(), 2);
        clearTrackedAxonEvents[] cleartrackedaxoneventsArr$values = $values();
        $VALUES = cleartrackedaxoneventsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(cleartrackedaxoneventsArr$values);
        int i = onExtraCallback + 9;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            i2 = -2014642380;
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i4 = $10 + 17;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), Process.getGidForName("") + 60, 6383 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i7 = $10 + 43;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i2);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 59 - KeyEvent.keyCodeFromString(""), 6383 - TextUtils.getOffsetAfter("", 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i2);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58, 6384 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = -2014642380;
        }
        objArr[0] = new String(cArr2);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 5864302914171913772L;
    }
}
