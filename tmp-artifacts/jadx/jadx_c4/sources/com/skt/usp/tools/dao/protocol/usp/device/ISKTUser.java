package com.skt.usp.tools.dao.protocol.usp.device;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ISKTUser {

    public static class Request extends AbstractUspRequest {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 4377;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = 0;
        private static char onExtraCallbackWithResult = 57777;
        private static char onNavigationEvent = 16982;
        private static char onWarmupCompleted = 17096;
        protected BodyOfISKTUser body = null;

        public void setBody(BodyOfISKTUser bodyOfISKTUser) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 73;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            this.body = bodyOfISKTUser;
            int i5 = i3 + 69;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }

        public BodyOfISKTUser getBody() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 85;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            BodyOfISKTUser bodyOfISKTUser = this.body;
            int i5 = i2 + 99;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return bodyOfISKTUser;
        }

        public String generateUrl() throws Throwable {
            String strIntern;
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                if (UCPLibraryFeatures.isREAL_SERVER()) {
                    Object[] objArr = new Object[1];
                    a(new char[]{45151, 5877, 13521, 7044, 62011, 41844, 10383, 57387, 38648, 2034, 45451, 30647, 61531, 16235, 28400, 31588, 19487, 64955, 10935, 43259, 60329, 48292, 20681, 31493, 39928, 22961, 17711, 4337, 39928, 22961}, 30 - Color.argb(0, 0, 0, 0), objArr);
                    strIntern = ((String) objArr[0]).intern();
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{45151, 5877, 13521, 7044, 62011, 41844, 10383, 57387, 38648, 2034, 45451, 30647, 56759, 35443, 30266, 33906, 16084, 50717, 61353, 18579, 10348, 57972, 4609, 57527, 30067, 10863, 17790, 10628, 38648, 2034, 64716, 13449, 38648, 2034, 62799, 19746}, 35 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                }
                String str = String.format("%s/api/mobile/checkUser", strIntern);
                int i3 = onExtraCallback + 55;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return str;
            }
            UCPLibraryFeatures.isREAL_SERVER();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $11 + 21;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                char c = 1;
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $10 + 115;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    char[] cArr4 = cArr3;
                    int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                    int i11 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[c] = Integer.valueOf(i10);
                        objArr2[0] = Integer.valueOf(c2);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                            int longPressTimeout = 12434 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, iKeyCodeFromString, longPressTimeout, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr4[c] = cCharValue;
                        int i12 = i7;
                        Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7 = i12 + 1;
                        cArr3 = cArr4;
                        i3 = 0;
                        c = 1;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16015), 14 - (ViewConfiguration.getFadingEdgeLength() >> 16), MotionEvent.axisFromString("") + 19902, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i13 = $11 + 83;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 84 / 0;
                if (this != this.body) {
                    defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                    BodyOfISKTUser bodyOfISKTUser = this.body;
                    DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfISKTUser.class, bodyOfISKTUser).write(jsonWriter, bodyOfISKTUser);
                }
            } else if (this != this.body) {
            }
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            int i4 = IAuthTabCallbackStub + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            jsonReader.beginObject();
            if (i3 == 0) {
                throw null;
            }
            while (!(!jsonReader.hasNext())) {
                int i4 = onExtraCallback + 101;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
            int i2 = 2 % 2;
            boolean z = false;
            if (jsonReader.peek() != JsonToken.NULL) {
                int i3 = IAuthTabCallbackStub + 69;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    z = true;
                }
            } else {
                int i4 = onExtraCallback + 29;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
            if (i != 464) {
                onNavigationEvent(gson, jsonReader, i);
            } else if (z) {
                this.body = (BodyOfISKTUser) gson.getAdapter(BodyOfISKTUser.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class Response extends AbstractUspResponse {
        protected BodyOfISKTUser body = null;

        public void setBody(BodyOfISKTUser bodyOfISKTUser) {
            this.body = bodyOfISKTUser;
        }

        public BodyOfISKTUser getBody() {
            return this.body;
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfISKTUser bodyOfISKTUser = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfISKTUser.class, bodyOfISKTUser).write(jsonWriter, bodyOfISKTUser);
            }
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
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
                onExtraCallbackWithResult(gson, jsonReader, i);
            } else if (z) {
                this.body = (BodyOfISKTUser) gson.getAdapter(BodyOfISKTUser.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class BodyOfISKTUser extends AbstractDao {
        protected String mdn = null;
        protected String jumin = null;
        protected String tid = null;
        protected String result_yn = null;
        protected String result_msg = null;

        public String getMdn() {
            return this.mdn;
        }

        public void setMdn(String str) {
            this.mdn = str;
        }

        public String getJumin() {
            return this.jumin;
        }

        public void setJumin(String str) {
            this.jumin = str;
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

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.jumin) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 263);
                jsonWriter.value(this.jumin);
            }
            if (this != this.mdn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 16);
                jsonWriter.value(this.mdn);
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

        public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
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
            if (i == 572) {
                if (!z) {
                    this.mdn = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.mdn = jsonReader.nextString();
                    return;
                } else {
                    this.mdn = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i != 876) {
                IAuthTabCallback(gson, jsonReader, i);
                return;
            }
            if (!z) {
                this.jumin = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.jumin = jsonReader.nextString();
            } else {
                this.jumin = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }
}
