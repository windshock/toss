package com.skt.usp.tools.dao.protocol.usp.device;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IUsimAvailable {

    public static class Request extends AbstractUspRequest {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        protected BodyOfIUsimAvailable body = null;
        private static char[] onExtraCallback = {64966, 64967, 64905, 64961, 64990, 64963, 64925, 64984, 64988, 64991, 64987, 64926, 64960, 64924, 64982, 64976};
        private static char onWarmupCompleted = 51245;

        public void setBody(BodyOfIUsimAvailable bodyOfIUsimAvailable) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.body = bodyOfIUsimAvailable;
            int i5 = i2 + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public BodyOfIUsimAvailable getBody() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.body;
            }
            throw null;
        }

        public String generateUrl() throws Throwable {
            String strIntern;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (UCPLibraryFeatures.isREAL_SERVER()) {
                Object[] objArr = new Object[1];
                a(new char[]{'\t', 2, 5, '\t', 14, 0, 13759, 13759, '\f', 11, 2, 15, 4, 2, '\r', 4, 4, 14, 5, 3, '\r', '\n', 15, '\f', '\f', '\b', 7, 14, '\f', '\b'}, (byte) (10 - Color.red(0)), 31 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
                int i4 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{'\t', 2, 5, '\t', 14, 0, 13871, 13871, '\f', 11, 2, 15, '\t', 3, 15, '\r', 2, 5, 4, 0, 6, 7, 15, 4, 2, '\r', '\n', '\r', '\f', 11, 5, 7, '\f', 11, 13937}, (byte) (123 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 34, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            return String.format("%s/api/mobile/checkCarrierApi", strIntern);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallback;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = $10 + 15;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 17;
                    $11 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 25 - TextUtils.lastIndexOf("", '0'), 23139 - KeyEvent.keyCodeFromString(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        i3 = 2;
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
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, 23139 - ((Process.getThreadPriority(0) + 20) >> 6), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i10 = $10 + 49;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent << 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24823), View.resolveSize(0, 0) + 74, 8088 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 30 - Drawable.resolveOpacity(0, 0), Color.green(0) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                } else {
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                                }
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            int i4 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            if (this != this.body) {
                int i2 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIUsimAvailable bodyOfIUsimAvailable = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIUsimAvailable.class, bodyOfIUsimAvailable).write(jsonWriter, bodyOfIUsimAvailable);
                int i4 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            jsonReader.beginObject();
            if (i3 != 0) {
                throw null;
            }
            while (!(!jsonReader.hasNext())) {
                int i4 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
                    obj.hashCode();
                    throw null;
                }
                onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
            int i5 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
            boolean z;
            int i2 = 2 % 2;
            if (jsonReader.peek() != JsonToken.NULL) {
                int i3 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (i != 464) {
                onNavigationEvent(gson, jsonReader, i);
                return;
            }
            Object obj = null;
            if (!z) {
                this.body = null;
                jsonReader.nextNull();
                return;
            }
            int i5 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                this.body = (BodyOfIUsimAvailable) gson.getAdapter(BodyOfIUsimAvailable.class).read(jsonReader);
                obj.hashCode();
                throw null;
            }
            this.body = (BodyOfIUsimAvailable) gson.getAdapter(BodyOfIUsimAvailable.class).read(jsonReader);
            int i6 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    public static class Response extends AbstractUspResponse {
        protected BodyOfIUsimAvailable body = null;

        public void setBody(BodyOfIUsimAvailable bodyOfIUsimAvailable) {
            this.body = bodyOfIUsimAvailable;
        }

        public BodyOfIUsimAvailable getBody() {
            return this.body;
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIUsimAvailable bodyOfIUsimAvailable = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIUsimAvailable.class, bodyOfIUsimAvailable).write(jsonWriter, bodyOfIUsimAvailable);
            }
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i != 464) {
                onExtraCallbackWithResult(gson, jsonReader, i);
            } else if (z) {
                this.body = (BodyOfIUsimAvailable) gson.getAdapter(BodyOfIUsimAvailable.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class BodyOfIUsimAvailable extends AbstractDao {
        protected String mdn = null;
        protected String iccid = null;
        protected String tid = null;
        protected String result_yn = null;
        protected String result_msg = null;
        protected String result_code = null;

        public String getMdn() {
            return this.mdn;
        }

        public void setMdn(String str) {
            this.mdn = str;
        }

        public String getIccid() {
            return this.iccid;
        }

        public void setIccid(String str) {
            this.iccid = str;
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

        public String getResult_code() {
            return this.result_code;
        }

        public void setResult_code(String str) {
            this.result_code = str;
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.iccid) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 341);
                jsonWriter.value(this.iccid);
            }
            if (this != this.mdn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 16);
                jsonWriter.value(this.mdn);
            }
            if (this != this.result_code) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 492);
                jsonWriter.value(this.result_code);
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
                onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
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
            if (i != 611) {
                IAuthTabCallback(gson, jsonReader, i);
                return;
            }
            if (!z) {
                this.result_code = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.result_code = jsonReader.nextString();
            } else {
                this.result_code = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }
}
