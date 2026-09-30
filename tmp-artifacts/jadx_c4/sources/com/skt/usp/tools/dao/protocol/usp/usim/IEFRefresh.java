package com.skt.usp.tools.dao.protocol.usp.usim;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skt.usp.tools.UCPLibraryFeatures;
import com.skt.usp.tools.dao.AbstractDao;
import com.skt.usp.tools.dao.protocol.usp.AbstractUspRequest;
import com.skt.usp.tools.dao.protocol.usp.AbstractUspResponse;
import java.lang.reflect.Method;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IEFRefresh {

    public static class Request extends AbstractUspRequest {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = 4833747898167333030L;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        protected BodyOfIEfrefresh body = null;

        public void setBody(BodyOfIEfrefresh bodyOfIEfrefresh) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            this.body = bodyOfIEfrefresh;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 121;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public BodyOfIEfrefresh getBody() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            BodyOfIEfrefresh bodyOfIEfrefresh = this.body;
            int i5 = i2 + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return bodyOfIEfrefresh;
        }

        public String generateUrl() throws Throwable {
            String strIntern;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!(!UCPLibraryFeatures.isREAL_SERVER())) {
                int i4 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                a(new char[]{38393, 5760, 37679, 8142, 39030, 1362, 33248, 637, 36570, 2931, 46097, 12451, 48387, 14789, 47716, 9994, 41967, 11351, 43232, 21914, 54800, 21172, 57178, 23521, 50310, 16673, 52733, 20053, 51954, 30605}, Gravity.getAbsoluteGravity(0, 0) + 33637, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{38393, 45710, 56115, 58272, 2126, 20668, 31036, 34387, 44714, 63293, 8141, 9325, 19640, 38282, 45614, 55975, 58197, 2980, 20578, 30995, 33213, 44664, 63184, 8039, 10221, 19591, 38179, 48573, 55878, 58081, 2934, 20554, 30866, 33077, 43466}, TextUtils.indexOf("", "") + 10091, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            return String.format("%s/api/mobile/reqColdBootByEFRefresh", strIntern);
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $10 + 47;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, 19627 - ExpandableListView.getPackedPositionType(0L), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58, (KeyEvent.getMaxKeyCode() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                int i6 = $10 + 77;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 59 - View.resolveSizeAndState(0, 0, 0), 6382 - TextUtils.lastIndexOf("", '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = $11 + 69;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 % 2;
                }
            }
            objArr[0] = new String(cArr2);
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            if (this != this.body) {
                int i2 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIEfrefresh bodyOfIEfrefresh = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIEfrefresh.class, bodyOfIEfrefresh).write(jsonWriter, bodyOfIEfrefresh);
            }
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            int i4 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                int i4 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
            boolean z;
            int i2 = 2 % 2;
            if (jsonReader.peek() != JsonToken.NULL) {
                int i3 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (i != 464) {
                onNavigationEvent(gson, jsonReader, i);
                return;
            }
            if (!z) {
                this.body = null;
                jsonReader.nextNull();
                return;
            }
            int i5 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                this.body = (BodyOfIEfrefresh) gson.getAdapter(BodyOfIEfrefresh.class).read(jsonReader);
            } else {
                this.body = (BodyOfIEfrefresh) gson.getAdapter(BodyOfIEfrefresh.class).read(jsonReader);
                int i6 = 38 / 0;
            }
        }
    }

    public static class Response extends AbstractUspResponse {
        protected BodyOfIEfrefresh body = null;

        public void setBody(BodyOfIEfrefresh bodyOfIEfrefresh) {
            this.body = bodyOfIEfrefresh;
        }

        public BodyOfIEfrefresh getBody() {
            return this.body;
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIEfrefresh bodyOfIEfrefresh = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIEfrefresh.class, bodyOfIEfrefresh).write(jsonWriter, bodyOfIEfrefresh);
            }
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i != 464) {
                onExtraCallbackWithResult(gson, jsonReader, i);
            } else if (z) {
                this.body = (BodyOfIEfrefresh) gson.getAdapter(BodyOfIEfrefresh.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class BodyOfIEfrefresh extends AbstractDao {
        protected String iccid = null;
        protected String boot_time = null;
        protected String need_reboot = null;
        protected String tid = null;
        protected String result_yn = null;
        protected String result_msg = null;

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.boot_time) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 527);
                jsonWriter.value(this.boot_time);
            }
            if (this != this.iccid) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 341);
                jsonWriter.value(this.iccid);
            }
            if (this != this.need_reboot) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 698);
                jsonWriter.value(this.need_reboot);
            }
            if (this != this.result_msg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 139);
                jsonWriter.value(this.result_msg);
            }
            if (this != this.result_yn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 861);
                jsonWriter.value(this.result_yn);
            }
            if (this != this.tid) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 616);
                jsonWriter.value(this.tid);
            }
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 87) {
                if (!z) {
                    this.boot_time = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.boot_time = jsonReader.nextString();
                    return;
                } else {
                    this.boot_time = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 110) {
                if (!z) {
                    this.result_msg = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.result_msg = jsonReader.nextString();
                    return;
                } else {
                    this.result_msg = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 176) {
                if (!z) {
                    this.iccid = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.iccid = jsonReader.nextString();
                    return;
                } else {
                    this.iccid = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 343) {
                if (!z) {
                    this.tid = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.tid = jsonReader.nextString();
                    return;
                } else {
                    this.tid = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 486) {
                if (!z) {
                    this.result_yn = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.result_yn = jsonReader.nextString();
                    return;
                } else {
                    this.result_yn = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i != 643) {
                IAuthTabCallback(gson, jsonReader, i);
                return;
            }
            if (!z) {
                this.need_reboot = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.need_reboot = jsonReader.nextString();
            } else {
                this.need_reboot = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }
}
