package com.skt.usp.tools.dao.protocol.usp.device;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IAvailable {

    public static class Request extends AbstractUspRequest {
        private static short[] onExtraCallback;
        protected BodyOfIAvailable body = null;
        private static final byte[] $$a = {84, -122, 19, 43};
        private static final int $$b = 38;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int onTransact = 1;
        private static int IAuthTabCallback = 2117968580;
        private static int onExtraCallbackWithResult = -1538795454;
        private static int onWarmupCompleted = -740934332;
        private static byte[] onNavigationEvent = {-36, -10, 4, 61, -55, -10, 4, -10, -15, 15, -7, 1, -16, 77, -74, -11, -10, 79, -63, -5, 11, 4, 60, 8, -3, -49, 11, -12, 8, 4, -47, -10, 4, 61, -55, -10, 4, -10, -15, 15, -7, 1, -16, 77, -74, -11, -10, 79, -78, 9, 6, -7, 79, -64, -5, 11, 4, 60, 8, -3, -49, 11, -12, 8, 4};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, short s2) {
            int i;
            int i2;
            int i3 = (s * 2) + 4;
            int i4 = (b * 4) + 115;
            int i5 = (s2 * 2) + 1;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i6 = i5;
                i2 = 0;
                i3++;
                i4 += -i6;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i3];
                i3++;
                i4 += -i6;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                }
            }
        }

        public void setBody(BodyOfIAvailable bodyOfIAvailable) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 41;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.body = bodyOfIAvailable;
            int i5 = i2 + 59;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }

        public BodyOfIAvailable getBody() {
            int i = 2 % 2;
            int i2 = onTransact + 121;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return this.body;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String generateUrl() throws Throwable {
            String strIntern;
            int i = 2 % 2;
            int i2 = asInterface + 11;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 97 / 0;
                if (UCPLibraryFeatures.isREAL_SERVER()) {
                    Object[] objArr = new Object[1];
                    a((short) TextUtils.getOffsetAfter("", 0), (byte) View.getDefaultSize(0, 0), 629507379 - TextUtils.lastIndexOf("", '0', 0, 0), (-2006050020) - TextUtils.getCapsMode("", 0, 0), (-75) - ExpandableListView.getPackedPositionType(0L), objArr);
                    strIntern = ((String) objArr[0]).intern();
                    int i4 = onTransact + 119;
                    asInterface = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 5;
                    }
                } else {
                    Object[] objArr2 = new Object[1];
                    a((short) (KeyEvent.getMaxKeyCode() >> 16), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) + 629507410, View.getDefaultSize(0, 0) - 2006050020, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 75, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                }
            } else if (UCPLibraryFeatures.isREAL_SERVER()) {
            }
            return String.format("%s/api/mobile/checkNfcAvailable", strIntern);
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            long j;
            int i4;
            char c;
            int length;
            byte[] bArr;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43424), 41 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $11 + 121;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    byte[] bArr2 = onNavigationEvent;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        int i9 = 0;
                        while (i9 < length2) {
                            int i10 = $10 + 41;
                            $11 = i10 % 128;
                            if (i10 % 2 == 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getOffsetAfter("", 0)), 55 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 2168, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr3[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i9 <<= 1;
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr2[i9])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12843), TextUtils.indexOf((CharSequence) "", '0', 0) + 56, (ViewConfiguration.getTouchSlop() >> 8) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr3[i9] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i9++;
                            }
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, (Process.myTid() >> 22) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    int i11 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                    if (!z) {
                        i4 = 0;
                    } else {
                        int i12 = $11 + 91;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        i4 = 1;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 86 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onNavigationEvent;
                    if (bArr5 != null) {
                        int i14 = $11 + 89;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 0;
                        }
                        while (i5 < length) {
                            bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                            i5++;
                        }
                        bArr5 = bArr;
                    }
                    boolean z2 = !(bArr5 == null);
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            int i15 = $10 + 81;
                            $11 = i15 % 128;
                            if (i15 % 2 == 0) {
                                byte[] bArr6 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent + 1;
                                c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback << (((byte) (((byte) (bArr6[r8] * (-4629411779493505016L))) >>> s)) ^ b));
                            } else {
                                byte[] bArr7 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                        } else {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = asInterface + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            if (i3 == 0) {
                int i4 = 1 / 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 35;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 83 / 0;
                if (this != this.body) {
                    int i5 = i2 + 73;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                    BodyOfIAvailable bodyOfIAvailable = this.body;
                    DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIAvailable.class, bodyOfIAvailable).write(jsonWriter, bodyOfIAvailable);
                }
            } else if (this != this.body) {
            }
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            int i7 = asInterface + 115;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            int i2 = onTransact + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            jsonReader.beginObject();
            int i4 = asInterface + 23;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            while (jsonReader.hasNext()) {
                int i6 = asInterface + 85;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
                    throw null;
                }
                onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
            int i2 = 2 % 2;
            int i3 = onTransact + 77;
            asInterface = i3 % 128;
            boolean z = false;
            if (i3 % 2 != 0) {
                int i4 = 11 / 0;
                if (jsonReader.peek() != JsonToken.NULL) {
                    z = true;
                } else {
                    int i5 = asInterface + 71;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else if (jsonReader.peek() != JsonToken.NULL) {
            }
            if (i != 464) {
                onNavigationEvent(gson, jsonReader, i);
                return;
            }
            if (!z) {
                this.body = null;
                jsonReader.nextNull();
            } else {
                int i7 = onTransact + 57;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                this.body = (BodyOfIAvailable) gson.getAdapter(BodyOfIAvailable.class).read(jsonReader);
            }
        }
    }

    public static class Response extends AbstractUspResponse {
        protected BodyOfIAvailable body = null;

        public void setBody(BodyOfIAvailable bodyOfIAvailable) {
            this.body = bodyOfIAvailable;
        }

        public BodyOfIAvailable getBody() {
            return this.body;
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                BodyOfIAvailable bodyOfIAvailable = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, BodyOfIAvailable.class, bodyOfIAvailable).write(jsonWriter, bodyOfIAvailable);
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
                this.body = (BodyOfIAvailable) gson.getAdapter(BodyOfIAvailable.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class BodyOfIAvailable extends AbstractDao {
        protected String mdn = null;
        protected String tid = null;
        protected String result_yn = null;
        protected String result_msg = null;

        public String getMdn() {
            return this.mdn;
        }

        public void setMdn(String str) {
            this.mdn = str;
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

        public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
            if (i != 572) {
                IAuthTabCallback(gson, jsonReader, i);
                return;
            }
            if (!z) {
                this.mdn = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.mdn = jsonReader.nextString();
            } else {
                this.mdn = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }
}
