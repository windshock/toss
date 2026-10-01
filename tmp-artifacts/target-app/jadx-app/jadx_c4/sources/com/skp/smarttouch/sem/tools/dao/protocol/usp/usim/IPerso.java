package com.skp.smarttouch.sem.tools.dao.protocol.usp.usim;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import com.skp.smarttouch.sem.tools.dao.AbstractDao;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspRequest;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspResponse;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IPerso {

    public static class Request extends AbstractUspRequest {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onNavigationEvent;
        protected BodyOfIPerso body = null;
        private static char[] IAuthTabCallback = {32531, 32527, 32523, 32520, 32705, 32724, 32536, 32532, 32521, 32542, 32725, 32526, 32528, 32535, 32534, 32726};
        private static int onExtraCallbackWithResult = -1184333893;
        private static boolean onExtraCallback = true;
        private static boolean onWarmupCompleted = true;

        public void setBody(BodyOfIPerso bodyOfIPerso) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.body = bodyOfIPerso;
            int i5 = i2 + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 0;
            }
        }

        public BodyOfIPerso getBody() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            BodyOfIPerso bodyOfIPerso = this.body;
            int i4 = i3 + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
            }
            return bodyOfIPerso;
        }

        public String generateUrl() throws Throwable {
            String strIntern;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            IAuthTabCallbackStub = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                LibraryFeatures.isREAL_SERVER();
                obj.hashCode();
                throw null;
            }
            if (LibraryFeatures.isREAL_SERVER()) {
                int i3 = onNavigationEvent + 99;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-113, -120, -121, -117, -113, -120, -121, -118, -114, -118, -126, -115, -124, -117, -125, -124, -116, -117, -118, -119, -120, -121, -122, -122, -123, -124, -125, -126, -126, -127}, Process.getGidForName("") + 24431, objArr);
                    strIntern = ((String) objArr[0]).intern();
                } else {
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-113, -120, -121, -117, -113, -120, -121, -118, -114, -118, -126, -115, -124, -117, -125, -124, -116, -117, -118, -119, -120, -121, -122, -122, -123, -124, -125, -126, -126, -127}, Process.getGidForName("") + 128, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                }
                int i4 = onNavigationEvent + 39;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else {
                Object[] objArr3 = new Object[1];
                a(null, null, new byte[]{-113, -120, -121, -117, -113, -120, -121, -118, -114, -118, -126, -115, -124, -117, -125, -124, -116, -117, -126, -124, -118, -126, -112, -118, -119, -120, -121, -122, -122, -123, -124, -125, -126, -126, -127}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, objArr3);
                strIntern = ((String) objArr3[0]).intern();
            }
            return String.format("%s/api/mobile/addSecondIssueResult", strIntern);
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallback;
            char c = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf("", c, 0)), AndroidCharacter.getMirror(c) + 29, (ViewConfiguration.getTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                        c = '0';
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
            try {
                Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Drawable.resolveOpacity(0, 0) + 75, 16037 - View.resolveSizeAndState(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i4 = 1052772399;
                if (onWarmupCompleted) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i5 = $10 + 79;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 62 - MotionEvent.axisFromString(""), TextUtils.lastIndexOf("", '0', 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i4 = 1052772399;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onExtraCallback) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 109;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 64, TextUtils.indexOf("", "", 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i9 = $10 + 71;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                }
                String str = new String(cArr6);
                int i11 = $10 + 23;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            int i4 = onNavigationEvent + 65;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIPerso bodyOfIPerso = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIPerso.class, bodyOfIPerso).write(jsonWriter, bodyOfIPerso);
            }
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            int i4 = IAuthTabCallbackStub + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            jsonReader.beginObject();
            int i4 = IAuthTabCallbackStub + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            while (!(!jsonReader.hasNext())) {
                onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
            boolean z;
            int i2 = 2 % 2;
            if (jsonReader.peek() != JsonToken.NULL) {
                int i3 = onNavigationEvent + 69;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
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
            int i5 = IAuthTabCallbackStub + 19;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                this.body = (BodyOfIPerso) gson.getAdapter(BodyOfIPerso.class).read(jsonReader);
                throw null;
            }
            this.body = (BodyOfIPerso) gson.getAdapter(BodyOfIPerso.class).read(jsonReader);
            int i6 = IAuthTabCallbackStub + 59;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static class Response extends AbstractUspResponse {
        protected BodyOfIPerso body = null;

        public void setBody(BodyOfIPerso bodyOfIPerso) {
            this.body = bodyOfIPerso;
        }

        public BodyOfIPerso getBody() {
            return this.body;
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIPerso bodyOfIPerso = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIPerso.class, bodyOfIPerso).write(jsonWriter, bodyOfIPerso);
            }
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
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
            if (i != 464) {
                IAuthTabCallback(gson, jsonReader, i);
            } else if (z) {
                this.body = (BodyOfIPerso) gson.getAdapter(BodyOfIPerso.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class BodyOfIPerso extends AbstractDao {
        protected String tid = null;
        protected String aid = null;
        protected String iccid = null;

        public String getTid() {
            return this.tid;
        }

        public void setTid(String str) {
            this.tid = str;
        }

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

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
            if (this != this.tid) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 616);
                jsonWriter.value(this.tid);
            }
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
