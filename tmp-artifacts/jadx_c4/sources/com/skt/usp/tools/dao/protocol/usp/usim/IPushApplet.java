package com.skt.usp.tools.dao.protocol.usp.usim;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IPushApplet {

    public static class Request extends AbstractUspRequest {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 1;
        private static int onWarmupCompleted;
        protected BodyOfIPushApplet body = null;
        private static char[] IAuthTabCallback = {32385, 32445, 32441, 32446, 32631, 32634, 32398, 32442, 32447, 32396, 32635, 32444, 32390, 32389, 32388, 32580};
        private static int onNavigationEvent = -1184334039;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onExtraCallback = true;

        public void setBody(BodyOfIPushApplet bodyOfIPushApplet) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 81;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.body = bodyOfIPushApplet;
            if (i4 == 0) {
                int i5 = 76 / 0;
            }
            int i6 = i2 + 73;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 79 / 0;
            }
        }

        public BodyOfIPushApplet getBody() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            BodyOfIPushApplet bodyOfIPushApplet = this.body;
            if (i3 == 0) {
                int i4 = 5 / 0;
            }
            return bodyOfIPushApplet;
        }

        public String generateUrl() throws Throwable {
            String strIntern;
            int i = 2 % 2;
            if (UCPLibraryFeatures.isREAL_SERVER()) {
                int i2 = onWarmupCompleted + 81;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-113, -120, -121, -117, -113, -120, -121, -118, -114, -118, -126, -115, -124, -117, -125, -124, -116, -117, -118, -119, -120, -121, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
                strIntern = ((String) objArr[0]).intern();
                int i4 = asInterface + 5;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-113, -120, -121, -117, -113, -120, -121, -118, -114, -118, -126, -115, -124, -117, -125, -124, -116, -117, -126, -124, -118, -126, -112, -118, -119, -120, -121, -122, -122, -123, -124, -125, -126, -126, -127}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            return String.format("%s/api/mobile/setAccessRuleAram", strIntern);
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallback;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 107;
                    $10 = i5 % 128;
                    int i6 = i5 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 76, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        i2 = 2;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 75, ExpandableListView.getPackedPositionChild(0L) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            char c = '0';
            if (onExtraCallback) {
                int i7 = $11 + 25;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 62 - TextUtils.lastIndexOf("", '0'), 12213 - ImageFormat.getBitsPerPixel(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $11 + 5;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i11 = $10 + 15;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c, 0) + 1), 63 - ExpandableListView.getPackedPositionGroup(0L), 12214 - (ViewConfiguration.getTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                c = '0';
            }
            objArr[0] = new String(cArr6);
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            int i4 = onWarmupCompleted + 29;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 50 / 0;
            }
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIPushApplet bodyOfIPushApplet = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIPushApplet.class, bodyOfIPushApplet).write(jsonWriter, bodyOfIPushApplet);
                int i2 = asInterface + 19;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            }
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            int i4 = onWarmupCompleted + 27;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            int i2 = asInterface + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            jsonReader.beginObject();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            while (jsonReader.hasNext()) {
                onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
                int i4 = onWarmupCompleted + 87;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 87;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                jsonReader.peek();
                JsonToken jsonToken = JsonToken.NULL;
                throw null;
            }
            if (jsonReader.peek() != JsonToken.NULL) {
                int i4 = asInterface + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
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
            this.body = (BodyOfIPushApplet) gson.getAdapter(BodyOfIPushApplet.class).read(jsonReader);
            int i6 = asInterface + 113;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 43 / 0;
            }
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
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIPushApplet bodyOfIPushApplet = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIPushApplet.class, bodyOfIPushApplet).write(jsonWriter, bodyOfIPushApplet);
            }
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
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

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
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
