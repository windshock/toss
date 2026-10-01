package com.tmoney.kscc.sslio.dto.response;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda9;
import o.AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda0;
import o.AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TRDR0001ResponseDTO extends ResponseDTO {
    private Response response;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public Response getResponse() {
        return this.response;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.response) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 280);
            Response response = this.response;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Response.class, response).write(jsonWriter, response);
        }
        asInterface(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 231) {
            IAuthTabCallbackStub(gson, jsonReader, i);
        } else if (z) {
            this.response = (Response) gson.getAdapter(Response.class).read(jsonReader);
        } else {
            this.response = null;
            jsonReader.nextNull();
        }
    }

    public class Response {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallbackWithResult = 4018190130223607605L;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private String aprvAmt;
        public ArrayList<ResultTRDR0001RowDTO> aprvDtaV;
        private String billAmt;
        private String billDay;
        private String cancAmt;
        public ArrayList<ResultTRDR0001RowDTO> cancDtaV;
        private String nAprvAmt;
        private String nAprvYn;
        private String pntAmt;
        public ArrayList<ResultTRDR0001RowDTO> pntDtaV;
        private String rspCd;
        private String rspMsg;
        private String useAmt;

        public Response() {
        }

        public ArrayList<ResultTRDR0001RowDTO> getApprDtaV() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 105;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ArrayList<ResultTRDR0001RowDTO> arrayList = this.aprvDtaV;
            int i5 = i2 + 19;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return arrayList;
        }

        public String getAprvAmt() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.aprvAmt;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
        
            return ((java.lang.String) r0[0]).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        
            r1 = r5.billAmt;
            r3 = com.tmoney.kscc.sslio.dto.response.TRDR0001ResponseDTO.Response.onNavigationEvent + 99;
            com.tmoney.kscc.sslio.dto.response.TRDR0001ResponseDTO.Response.onWarmupCompleted = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
        
            if ((r3 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        
            r0 = 2 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (android.text.TextUtils.isEmpty(r5.billAmt) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (android.text.TextUtils.isEmpty(r5.billAmt) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r0 = new java.lang.Object[1];
            a(new char[]{59954}, 57991 - (android.os.Process.myPid() >> 22), r0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String getBillAmt() throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
        }

        public String getBillDay() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.billDay;
            int i5 = i2 + 27;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String getCancAmt() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.cancAmt;
            int i5 = i2 + 115;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public ArrayList<ResultTRDR0001RowDTO> getCancDtaV() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            ArrayList<ResultTRDR0001RowDTO> arrayList = this.cancDtaV;
            int i5 = i2 + 15;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 77 / 0;
            }
            return arrayList;
        }

        public String getNAprvAmt() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 105;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.nAprvAmt;
            int i5 = i2 + 81;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public String getNAprvYn() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.nAprvYn;
            int i5 = i3 + 81;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getPntAmt() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 105;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.pntAmt;
            int i5 = i2 + 25;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public ArrayList<ResultTRDR0001RowDTO> getPntDtaV() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 91;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ArrayList<ResultTRDR0001RowDTO> arrayList = this.pntDtaV;
            int i4 = i2 + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
            }
            return arrayList;
        }

        public String getRspCd() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.rspCd;
            int i5 = i2 + 51;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String getRspMsg() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 17;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.rspMsg;
            int i4 = i2 + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return str;
        }

        public String getUseAmt() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.useAmt;
            int i5 = i2 + 105;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 85;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 24, 19627 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 59 - KeyEvent.normalizeMetaState(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $10 + 121;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 2;
            }
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $10 + 49;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 59 - ExpandableListView.getPackedPositionType(0L), 6383 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this != this.aprvAmt) {
                int i4 = i3 + 67;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 275);
                if (i5 == 0) {
                    jsonWriter.value(this.aprvAmt);
                    obj.hashCode();
                    throw null;
                }
                jsonWriter.value(this.aprvAmt);
            }
            if (this != this.aprvDtaV) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 145);
                AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda9 autoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda9 = new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda9();
                ArrayList<ResultTRDR0001RowDTO> arrayList = this.aprvDtaV;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, autoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda9, arrayList).write(jsonWriter, arrayList);
            }
            if (this != this.billAmt) {
                int i6 = onNavigationEvent + 31;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 532);
                jsonWriter.value(this.billAmt);
                int i8 = onNavigationEvent + 51;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            if (this != this.billDay) {
                int i10 = onNavigationEvent + 33;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 634);
                jsonWriter.value(this.billDay);
                if (i11 == 0) {
                    int i12 = 14 / 0;
                }
            }
            if (this != this.cancAmt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 558);
                jsonWriter.value(this.cancAmt);
            }
            if (this != this.cancDtaV) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 729);
                AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda1 autoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda1 = new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda1();
                ArrayList<ResultTRDR0001RowDTO> arrayList2 = this.cancDtaV;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, autoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda1, arrayList2).write(jsonWriter, arrayList2);
            }
            if (this != this.nAprvAmt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 148);
                jsonWriter.value(this.nAprvAmt);
            }
            if (this != this.nAprvYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 876);
                jsonWriter.value(this.nAprvYn);
            }
            if (this != this.pntAmt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 138);
                jsonWriter.value(this.pntAmt);
            }
            if (this != this.pntDtaV) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 167);
                AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda0 autoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda0 = new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda0();
                ArrayList<ResultTRDR0001RowDTO> arrayList3 = this.pntDtaV;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, autoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda0, arrayList3).write(jsonWriter, arrayList3);
            }
            if (this != this.rspCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 482);
                jsonWriter.value(this.rspCd);
            }
            if (this != this.rspMsg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 785);
                jsonWriter.value(this.rspMsg);
            }
            if (this != this.useAmt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 7);
                jsonWriter.value(this.useAmt);
            }
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            jsonReader.beginObject();
            while (!(!jsonReader.hasNext())) {
                int i4 = onWarmupCompleted + 47;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
                    int i5 = 73 / 0;
                } else {
                    onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
                }
            }
            jsonReader.endObject();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r8.peek() != com.google.gson.stream.JsonToken.BOOLEAN) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        
            if (r8.peek() != com.google.gson.stream.JsonToken.BOOLEAN) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        
            r6.cancAmt = r8.nextString();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        
            r6.cancAmt = java.lang.Boolean.toString(r8.nextBoolean());
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 23;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                jsonReader.peek();
                JsonToken jsonToken = JsonToken.NULL;
                throw null;
            }
            if (jsonReader.peek() != JsonToken.NULL) {
                int i4 = onWarmupCompleted + 75;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            switch (i) {
                case 32:
                    if (!z) {
                        this.billDay = null;
                        jsonReader.nextNull();
                        return;
                    } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                        this.billDay = jsonReader.nextString();
                        return;
                    } else {
                        this.billDay = Boolean.toString(jsonReader.nextBoolean());
                        return;
                    }
                case 227:
                    if (z) {
                        if (jsonReader.peek() != JsonToken.BOOLEAN) {
                            this.rspCd = jsonReader.nextString();
                            return;
                        } else {
                            this.rspCd = Boolean.toString(jsonReader.nextBoolean());
                            return;
                        }
                    }
                    this.rspCd = null;
                    jsonReader.nextNull();
                    int i6 = onNavigationEvent + 15;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                case 358:
                    if (!z) {
                        this.nAprvYn = null;
                        jsonReader.nextNull();
                        return;
                    } else {
                        if (jsonReader.peek() == JsonToken.BOOLEAN) {
                            this.nAprvYn = Boolean.toString(jsonReader.nextBoolean());
                            return;
                        }
                        int i8 = onWarmupCompleted + 59;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        this.nAprvYn = jsonReader.nextString();
                        return;
                    }
                case 363:
                    if (!z) {
                        this.billAmt = null;
                        jsonReader.nextNull();
                        return;
                    }
                    int i10 = onNavigationEvent + 13;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        jsonReader.peek();
                        JsonToken jsonToken2 = JsonToken.BOOLEAN;
                        obj.hashCode();
                        throw null;
                    }
                    if (jsonReader.peek() != JsonToken.BOOLEAN) {
                        this.billAmt = jsonReader.nextString();
                        return;
                    } else {
                        this.billAmt = Boolean.toString(jsonReader.nextBoolean());
                        return;
                    }
                case 385:
                    if (!z) {
                        this.rspMsg = null;
                        jsonReader.nextNull();
                        return;
                    } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                        this.rspMsg = jsonReader.nextString();
                        return;
                    } else {
                        this.rspMsg = Boolean.toString(jsonReader.nextBoolean());
                        return;
                    }
                case 391:
                    if (!z) {
                        this.useAmt = null;
                        jsonReader.nextNull();
                        return;
                    }
                    int i11 = onNavigationEvent + 63;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    if (jsonReader.peek() != JsonToken.BOOLEAN) {
                        this.useAmt = jsonReader.nextString();
                        return;
                    } else {
                        this.useAmt = Boolean.toString(jsonReader.nextBoolean());
                        return;
                    }
                case 396:
                    if (z) {
                        this.aprvDtaV = (ArrayList) gson.getAdapter(new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda9()).read(jsonReader);
                        return;
                    } else {
                        this.aprvDtaV = null;
                        jsonReader.nextNull();
                        return;
                    }
                case 435:
                    if (z) {
                        this.pntDtaV = (ArrayList) gson.getAdapter(new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda0()).read(jsonReader);
                        return;
                    } else {
                        this.pntDtaV = null;
                        jsonReader.nextNull();
                        return;
                    }
                case 436:
                    if (!z) {
                        this.aprvAmt = null;
                        jsonReader.nextNull();
                        return;
                    }
                    int i13 = onWarmupCompleted + 89;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    if (jsonReader.peek() != JsonToken.BOOLEAN) {
                        this.aprvAmt = jsonReader.nextString();
                        return;
                    } else {
                        this.aprvAmt = Boolean.toString(jsonReader.nextBoolean());
                        return;
                    }
                case 493:
                    if (!z) {
                        this.nAprvAmt = null;
                        jsonReader.nextNull();
                        return;
                    } else {
                        if (jsonReader.peek() == JsonToken.BOOLEAN) {
                            this.nAprvAmt = Boolean.toString(jsonReader.nextBoolean());
                            return;
                        }
                        int i15 = onWarmupCompleted + 61;
                        onNavigationEvent = i15 % 128;
                        if (i15 % 2 == 0) {
                            this.nAprvAmt = jsonReader.nextString();
                            return;
                        } else {
                            this.nAprvAmt = jsonReader.nextString();
                            throw null;
                        }
                    }
                case 551:
                    if (!z) {
                        this.pntAmt = null;
                        jsonReader.nextNull();
                        return;
                    } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                        this.pntAmt = jsonReader.nextString();
                        return;
                    } else {
                        this.pntAmt = Boolean.toString(jsonReader.nextBoolean());
                        return;
                    }
                case 589:
                    if (z) {
                        this.cancDtaV = (ArrayList) gson.getAdapter(new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda1()).read(jsonReader);
                        return;
                    } else {
                        this.cancDtaV = null;
                        jsonReader.nextNull();
                        return;
                    }
                case 678:
                    if (!z) {
                        this.cancAmt = null;
                        jsonReader.nextNull();
                        return;
                    }
                    int i16 = onNavigationEvent + 113;
                    onWarmupCompleted = i16 % 128;
                    if (i16 % 2 != 0) {
                        break;
                    } else {
                        int i17 = 4 / 0;
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    int i18 = onNavigationEvent + 59;
                    onWarmupCompleted = i18 % 128;
                    if (i18 % 2 == 0) {
                        throw null;
                    }
                    return;
            }
        }
    }
}
