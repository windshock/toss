package com.bytedance.adsdk.zb.lud;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.JsonReader;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.RVParams;
import com.bytedance.adsdk.zb.sya.zb.fby;
import java.lang.reflect.Method;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class dv {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = -4741000829822705605L;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.fby ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws Throwable {
        char c;
        int i2 = 2 % 2;
        jsonReader.beginObject();
        Object obj = null;
        fby.ycx ycxVar = null;
        com.bytedance.adsdk.zb.sya.ycx.fby fbyVarLud = null;
        com.bytedance.adsdk.zb.sya.ycx.dj djVarZb = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int i3 = onWarmupCompleted + 125;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                jsonReader.nextName().hashCode();
                obj.hashCode();
                throw null;
            }
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            char c2 = 65535;
            if (iHashCode != 111) {
                if (iHashCode != 3588) {
                    if (iHashCode != 104433) {
                        if (iHashCode != 3357091) {
                            c = 65535;
                        } else {
                            c = 4;
                            Object[] objArr = new Object[1];
                            a(new char[]{25953, 44816, 61838, 14896}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 51827, objArr);
                            if (strNextName.equals(((String) objArr[0]).intern())) {
                                int i4 = onNavigationEvent + 93;
                                onWarmupCompleted = i4 % 128;
                                if (i4 % 2 != 0) {
                                    c = 3;
                                }
                            }
                        }
                    } else if (strNextName.equals("inv")) {
                        int i5 = onWarmupCompleted + 21;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        c = 2;
                    }
                } else if (strNextName.equals("pt")) {
                    int i7 = onNavigationEvent + 79;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    c = 1;
                }
            } else if (strNextName.equals("o")) {
                c = 0;
            }
            if (c == 0) {
                djVarZb = dj.zb(jsonReader, ulVar);
            } else if (c == 1) {
                fbyVarLud = dj.lud(jsonReader, ulVar);
            } else if (c == 2) {
                zNextBoolean = jsonReader.nextBoolean();
                int i9 = onNavigationEvent + 23;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                String strNextString = jsonReader.nextString();
                int iHashCode2 = strNextString.hashCode();
                if (iHashCode2 != 97) {
                    if (iHashCode2 != 105) {
                        if (iHashCode2 != 110) {
                            if (iHashCode2 == 115 && strNextString.equals("s")) {
                                c2 = 3;
                            }
                        } else if (strNextString.equals("n")) {
                            c2 = 2;
                        }
                    } else if (strNextString.equals("i")) {
                        int i11 = onWarmupCompleted + 101;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        c2 = 1;
                    }
                } else if (strNextString.equals("a")) {
                    int i13 = onNavigationEvent + 17;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    c2 = 0;
                }
                if (c2 == 0) {
                    ycxVar = fby.ycx.MASK_MODE_ADD;
                } else if (c2 != 1) {
                    ycxVar = c2 != 2 ? c2 != 3 ? fby.ycx.MASK_MODE_ADD : fby.ycx.MASK_MODE_SUBTRACT : fby.ycx.MASK_MODE_NONE;
                } else {
                    ulVar.ycx("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                    ycxVar = fby.ycx.MASK_MODE_INTERSECT;
                }
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.zb.sya.zb.fby(ycxVar, fbyVarLud, djVarZb, zNextBoolean);
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 23 - Process.getGidForName(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19627, 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 59 - KeyEvent.normalizeMetaState(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        int i5 = $10 + 11;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i7 = $11 + 43;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 59 - (ViewConfiguration.getJumpTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }
}
