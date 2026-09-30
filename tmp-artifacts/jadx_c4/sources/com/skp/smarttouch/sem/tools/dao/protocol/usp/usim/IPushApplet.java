package com.skp.smarttouch.sem.tools.dao.protocol.usp.usim;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import com.skp.smarttouch.sem.tools.dao.AbstractDao;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspRequest;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspResponse;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IPushApplet {

    public static class Request extends AbstractUspRequest {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 36203;
        private static int asBinder = 1;
        private static char onExtraCallback = 27833;
        private static int onExtraCallbackWithResult = 0;
        private static char onNavigationEvent = 55151;
        private static char onWarmupCompleted = 34853;
        protected BodyOfIPushApplet body = null;

        public void setBody(BodyOfIPushApplet bodyOfIPushApplet) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 77;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            this.body = bodyOfIPushApplet;
            int i5 = i2 + 41;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }

        public BodyOfIPushApplet getBody() {
            BodyOfIPushApplet bodyOfIPushApplet;
            int i = 2 % 2;
            int i2 = asBinder + 19;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                bodyOfIPushApplet = this.body;
                int i4 = 37 / 0;
            } else {
                bodyOfIPushApplet = this.body;
            }
            int i5 = i3 + 7;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return bodyOfIPushApplet;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String generateUrl() throws Throwable {
            String strIntern;
            int i = 2 % 2;
            if (LibraryFeatures.isREAL_SERVER()) {
                int i2 = asBinder + 17;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[1];
                a(new char[]{63807, 6901, 44922, 8591, 23617, 2767, 2584, 34597, 43071, 18970, 62018, 19653, 10820, 30161, 56555, 42845, 26701, 47570, 30195, 64508, 30774, 27529, 27420, 63594, 36777, 11833, 36204, 11974, 36777, 11833}, (ViewConfiguration.getPressedStateDuration() >> 16) + 30, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{63807, 6901, 44922, 8591, 23617, 2767, 2584, 34597, 43071, 18970, 62018, 19653, 40619, 26540, 25783, 30315, 29412, 43643, 62650, 46306, 42734, 60923, 35970, 27034, 427, 44822, 64392, 57013, 43071, 18970, 36936, 17403, 43071, 18970, 15852, 57567}, (ViewConfiguration.getLongPressTimeout() >> 16) + 35, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            String str = String.format("%s/api/mobile/setAccessRuleAram", strIntern);
            int i4 = asBinder + 121;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 59 / 0;
            }
            return str;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 107;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $11 + 65;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onWarmupCompleted);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                            int maxKeyCode = 12434 - (KeyEvent.getMaxKeyCode() >> 16);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, i12, maxKeyCode, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), KeyEvent.getDeadChar(0, 0) + 10, TextUtils.getOffsetAfter("", 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - ((Process.getThreadPriority(0) + 20) >> 6)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i13 = $11 + 121;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            objArr[0] = str;
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            int i4 = asBinder + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 7 / 0;
                if (this != this.body) {
                    int i5 = i2 + 21;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                    BodyOfIPushApplet bodyOfIPushApplet = this.body;
                    DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIPushApplet.class, bodyOfIPushApplet).write(jsonWriter, bodyOfIPushApplet);
                }
            } else if (this != this.body) {
            }
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            int i7 = asBinder + 27;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            jsonReader.beginObject();
            int i2 = asBinder + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            while (jsonReader.hasNext()) {
                int i4 = asBinder + 101;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
            int i6 = onExtraCallbackWithResult + 25;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 20 / 0;
            }
        }

        protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = asBinder + 81;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                jsonReader.peek();
                JsonToken jsonToken = JsonToken.NULL;
                obj.hashCode();
                throw null;
            }
            if (jsonReader.peek() != JsonToken.NULL) {
                int i4 = onExtraCallbackWithResult + 125;
                int i5 = i4 % 128;
                asBinder = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 75;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (i != 464) {
                onExtraCallback(gson, jsonReader, i);
                return;
            }
            if (z) {
                int i9 = asBinder + 23;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                this.body = (BodyOfIPushApplet) gson.getAdapter(BodyOfIPushApplet.class).read(jsonReader);
                return;
            }
            this.body = null;
            jsonReader.nextNull();
            int i11 = asBinder + 91;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public static class Response extends AbstractUspResponse {
        protected BodyOfIPushApplet body = null;

        public void setBody(BodyOfIPushApplet bodyOfIPushApplet) {
            this.body = bodyOfIPushApplet;
        }

        public BodyOfIPushApplet getBody() {
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
                BodyOfIPushApplet bodyOfIPushApplet = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIPushApplet.class, bodyOfIPushApplet).write(jsonWriter, bodyOfIPushApplet);
            }
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i != 464) {
                IAuthTabCallback(gson, jsonReader, i);
            } else if (z) {
                this.body = (BodyOfIPushApplet) gson.getAdapter(BodyOfIPushApplet.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class BodyOfIPushApplet extends AbstractDao {
        protected String iccid = null;
        protected String boot_time = null;
        protected String need_reboot = null;
        protected String tid = null;
        protected String result_yn = null;
        protected String result_msg = null;

        public String getIccid() {
            return this.iccid;
        }

        public void setIccid(String str) {
            this.iccid = str;
        }

        public String getBoot_time() {
            return this.boot_time;
        }

        public void setBoot_time(String str) {
            this.boot_time = str;
        }

        public String getNeed_reboot() {
            return this.need_reboot;
        }

        public void setNeed_reboot(String str) {
            this.need_reboot = str;
        }

        public String getTid() {
            return this.tid;
        }

        public void setTid(String str) {
            this.tid = str;
        }

        public String getResultYn() {
            return this.result_yn;
        }

        public void setResultYn(String str) {
            this.result_yn = str;
        }

        public String getResultMsg() {
            return this.result_msg;
        }

        public void setResultMsg(String str) {
            this.result_msg = str;
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
                onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
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
                onExtraCallbackWithResult(gson, jsonReader, i);
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
