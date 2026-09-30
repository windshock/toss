package com.skp.smarttouch.sem.tools.dao.protocol.usp.usim;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import com.skp.smarttouch.sem.tools.dao.AbstractDao;
import com.skp.smarttouch.sem.tools.dao.STAppletVersion;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspRequest;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspResponse;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IVersion {

    public static class Request extends AbstractUspRequest {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static char[] onWarmupCompleted = {27154, 27383, 27386, 27357, 27350, 27383, 27386, 27361, 27389, 27389, 27385, 27380, 27380, 27349, 27348, 27378, 27377, 27346, 27354, 27384, 27381, 27386, 27354, 27188, 27185, 27375, 27378, 27379, 27377, 27383, 27329, 27502, 27477, 27316, 27313, 27502, 27477, 27480, 27476, 27476, 27472, 27503, 27503, 27468, 27471, 27501, 27496, 27469, 27469, 27499, 27472, 27472, 27468, 27317, 27475, 27500, 27477, 27317, 27311, 27304, 27462, 27501, 27498, 27496, 27502};
        protected BodyOfIVersion body = null;

        public void setBody(BodyOfIVersion bodyOfIVersion) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Object obj = null;
            this.body = bodyOfIVersion;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 123;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public BodyOfIVersion getBody() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            BodyOfIVersion bodyOfIVersion = this.body;
            int i5 = i3 + 29;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return bodyOfIVersion;
        }

        public String generateUrl(String str) throws Throwable {
            String strIntern;
            int i = 2 % 2;
            if (LibraryFeatures.isREAL_SERVER()) {
                int i2 = onNavigationEvent + 87;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[1];
                a(new int[]{0, 30, 75, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0}, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a(new int[]{30, 35, 178, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0}, objArr2);
                strIntern = ((String) objArr2[0]).intern();
                int i4 = IAuthTabCallback + 53;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            String str2 = String.format("%s/api/mobile/getAvailableAppletVersion?staging=%s", strIntern, str);
            int i6 = IAuthTabCallback + 41;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return str2;
            }
            throw null;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onWarmupCompleted;
            if (cArr != null) {
                int i6 = $10 + 29;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i8 = 0; i8 < length; i8++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35283), 35 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 14239 - View.combineMeasuredStates(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i9 = $10 + 47;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (Process.myTid() >> 22)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 66, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 29 - Color.blue(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - KeyEvent.normalizeMetaState(0)), MotionEvent.axisFromString("") + 71, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                int i13 = $10 + 51;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i15 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i15, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i15);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i16 = $10 + 59;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            String str = new String(cArr3);
            int i18 = $11 + 15;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            objArr[0] = str;
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            int i4 = IAuthTabCallback + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this != this.body) {
                int i5 = i3 + 53;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIVersion bodyOfIVersion = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIVersion.class, bodyOfIVersion).write(jsonWriter, bodyOfIVersion);
            }
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            int i7 = onNavigationEvent + 115;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            jsonReader.beginObject();
            if (i3 == 0) {
                throw null;
            }
            while (jsonReader.hasNext()) {
                int i4 = onNavigationEvent + 3;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
                    throw null;
                }
                onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (jsonReader.peek() != JsonToken.NULL) {
                int i5 = onNavigationEvent + 61;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            if (i != 464) {
                onExtraCallback(gson, jsonReader, i);
                return;
            }
            if (!z) {
                this.body = null;
                jsonReader.nextNull();
                return;
            }
            int i7 = onNavigationEvent + 27;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                this.body = (BodyOfIVersion) gson.getAdapter(BodyOfIVersion.class).read(jsonReader);
                throw null;
            }
            this.body = (BodyOfIVersion) gson.getAdapter(BodyOfIVersion.class).read(jsonReader);
            int i8 = onNavigationEvent + 121;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public static class Response extends AbstractUspResponse {
        protected STAppletVersion body = null;

        public void setBody(STAppletVersion sTAppletVersion) {
            this.body = sTAppletVersion;
        }

        public STAppletVersion getBody() {
            return this.body;
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                STAppletVersion sTAppletVersion = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, STAppletVersion.class, sTAppletVersion).write(jsonWriter, sTAppletVersion);
            }
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i != 464) {
                IAuthTabCallback(gson, jsonReader, i);
            } else if (z) {
                this.body = (STAppletVersion) gson.getAdapter(STAppletVersion.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class BodyOfIVersion extends AbstractDao {
        protected String aid = null;
        protected String iccid = null;

        public String getAid() {
            return this.aid;
        }

        public void setAid(String str) {
            this.aid = str;
        }

        public String getIccid() {
            return this.iccid;
        }

        public void setIccid(String str) {
            this.iccid = str;
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.aid) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 511);
                jsonWriter.value(this.aid);
            }
            if (this != this.iccid) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 341);
                jsonWriter.value(this.iccid);
            }
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
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
            if (i != 838) {
                onExtraCallbackWithResult(gson, jsonReader, i);
                return;
            }
            if (!z) {
                this.aid = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.aid = jsonReader.nextString();
            } else {
                this.aid = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }
}
