package com.skp.smarttouch.sem.tools.dao.protocol.usp.usim;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import com.skp.smarttouch.sem.tools.dao.AbstractDao;
import com.skp.smarttouch.sem.tools.dao.STAppletStatus;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspRequest;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspResponse;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IStatus {

    public static class Request extends AbstractUspRequest {
        protected BodyOfIStatus body = null;
        private static final byte[] $$a = {64, -61, 76, -90};
        private static final int $$b = 219;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private static char[] onExtraCallback = {60860, 35294, 9564, 49374, 31839, 7064, 46863, 21129, 52807, 26069, 330, 48347, 22546, 63431, 37699, 3782, 43546, 16889, 64867, 39162, 13417, 54254, 20325, 60133, 34411, 15863, 55606, 29949, 4211, 36863, 9529, 16731, 60889, 2139, 46298, 54045, 32650, 39436, 1730, 44368, 51663, 29790, 37012, 16195, 23504, 50752, 25285, 35105, 13816, 20600, 64761, 6953, 34806, 8808, 20213, 62842, 4593, 48254, 55546, 18296, 58360, 3645, 43762, 53504, 32128};
        private static long IAuthTabCallback = -5703397908778546774L;

        private static String $$c(byte b, byte b2, short s) {
            int i = 97 - (b2 * 2);
            int i2 = b * 2;
            int i3 = (s * 2) + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            if (bArr == null) {
                i = (-i) + i2;
                i3++;
                i4 = -1;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i;
                if (i5 == i2) {
                    return new String(bArr2, 0);
                }
                i = (-bArr[i3]) + i;
                i3++;
                i4 = i5;
            }
        }

        public void setBody(BodyOfIStatus bodyOfIStatus) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.body = bodyOfIStatus;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public BodyOfIStatus getBody() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            BodyOfIStatus bodyOfIStatus = this.body;
            int i5 = i2 + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return bodyOfIStatus;
        }

        public String generateUrl() throws Throwable {
            String strIntern;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (LibraryFeatures.isREAL_SERVER()) {
                Object[] objArr = new Object[1];
                a(Color.argb(0, 0, 0, 0), 30 - View.combineMeasuredStates(0, 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a(30 - Color.argb(0, 0, 0, 0), Gravity.getAbsoluteGravity(0, 0) + 35, (char) (51333 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr2);
                String strIntern2 = ((String) objArr2[0]).intern();
                int i4 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                strIntern = strIntern2;
            }
            return String.format("%s/api/mobile/getInstalledApplet", strIntern);
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 23;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.green(0)), View.MeasureSpec.getMode(0) + 17, View.MeasureSpec.makeMeasureSpec(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 46134), 30 - ImageFormat.getBitsPerPixel(0), TextUtils.lastIndexOf("", '0', 0, 0) + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49123), TextUtils.indexOf("", "", 0) + 44, View.MeasureSpec.getSize(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = $11 + 93;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i9 = $11 + 119;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i11 = $11 + 111;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49124), View.resolveSizeAndState(0, 0, 0) + 44, 1494 - Color.blue(0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    throw null;
                }
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122), 44 - (Process.myPid() >> 22), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr);
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            if (i3 == 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 15;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this != this.body) {
                int i5 = i2 + 33;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                if (i6 == 0) {
                    BodyOfIStatus bodyOfIStatus = this.body;
                    DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIStatus.class, bodyOfIStatus).write(jsonWriter, bodyOfIStatus);
                    int i7 = 21 / 0;
                } else {
                    BodyOfIStatus bodyOfIStatus2 = this.body;
                    DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIStatus.class, bodyOfIStatus2).write(jsonWriter, bodyOfIStatus2);
                }
            }
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            jsonReader.beginObject();
            while (!(!jsonReader.hasNext())) {
                int i4 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
            int i6 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
            int i2 = 2 % 2;
            boolean z = false;
            if (jsonReader.peek() != JsonToken.NULL) {
                int i3 = onExtraCallbackWithResult + 81;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    z = true;
                }
            }
            Object obj = null;
            if (i == 464) {
                if (z) {
                    this.body = (BodyOfIStatus) gson.getAdapter(BodyOfIStatus.class).read(jsonReader);
                    return;
                } else {
                    this.body = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            onExtraCallback(gson, jsonReader, i);
            int i4 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static class Response extends AbstractUspResponse {
        protected STAppletStatus body = null;

        public void setBody(STAppletStatus sTAppletStatus) {
            this.body = sTAppletStatus;
        }

        public STAppletStatus getBody() {
            return this.body;
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                STAppletStatus sTAppletStatus = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, STAppletStatus.class, sTAppletStatus).write(jsonWriter, sTAppletStatus);
            }
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i != 464) {
                IAuthTabCallback(gson, jsonReader, i);
            } else if (z) {
                this.body = (STAppletStatus) gson.getAdapter(STAppletStatus.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class BodyOfIStatus extends AbstractDao {
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

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
                onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
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
