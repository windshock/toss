package com.skt.usp.tools.dao.protocol.urms;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
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
import com.skt.usp.tools.dao.URMSApplets;
import com.skt.usp.tools.dao.URMSComponents;
import com.skt.usp.tools.dao.URMSCredits;
import com.skt.usp.tools.dao.URMSPartners;
import com.skt.usp.tools.dao.URMSTcses;
import java.lang.reflect.Method;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.TimelineExternalSyntheticLambda1;
import o.measureChild;
import o.onAddFocusables;
import o.onInterceptFocusSearch;
import o.onItemsAdded;
import o.onItemsRemoved;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IGetPackageAllRight {

    public static class Request extends AbstractDao {
        private static final byte[] $$a = {113, 66, 51, 67};
        private static final int $$b = 108;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onWarmupCompleted = {19636, 33896, 56616, 5868, 28591, 42790, 63603, 12723, 2729, 17006, 39729, 60655, 9714, 32105, 46639, 36844, 49394, 6255, 20791, 43752, 58297, 15216, 3129, 17919, 40627, 54897, 12146, 24831, 47539, 61809, 51814, 932, 21736, 44072, 58735, 52175, 787, 23123, 37271, 59604, 8285, 32520, 46792, 36306, 50453, 7242, 27540, 41610, 64019, 12610, 2196, 18387, 40777, 54866, 11668, 25815, 48201, 35668, 49804, 6611, 20738, 43083, 59266, 16068, 30216, 19786, 33993, 54212, 11016, 25162, 47581, 61599, 51283, 1811, 24276};
        private static long onExtraCallbackWithResult = 1148542468821230868L;
        protected HeaderOfUrms header = null;
        protected ReqBodyOfIGetPackageAllRight body = null;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, short s3) {
            int i;
            int i2 = s2 * 3;
            int i3 = (s * 2) + 4;
            byte[] bArr = $$a;
            int i4 = 97 - (s3 * 3);
            byte[] bArr2 = new byte[i2 + 1];
            if (bArr == null) {
                int i5 = i4;
                int i6 = 0;
                i4 = i2;
                i3++;
                i4 += i5;
                i = i6;
                bArr2[i] = (byte) i4;
                i6 = i + 1;
                if (i == i2) {
                    return new String(bArr2, 0);
                }
                i5 = bArr[i3];
                i3++;
                i4 += i5;
                i = i6;
                bArr2[i] = (byte) i4;
                i6 = i + 1;
                if (i == i2) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i4;
                i6 = i + 1;
                if (i == i2) {
                }
            }
        }

        public void setHeader(HeaderOfUrms headerOfUrms) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 119;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.header = headerOfUrms;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i2 + 9;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public HeaderOfUrms getHeader() {
            HeaderOfUrms headerOfUrms;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 123;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                headerOfUrms = this.header;
                int i4 = 87 / 0;
            } else {
                headerOfUrms = this.header;
            }
            int i5 = i2 + 119;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
            return headerOfUrms;
        }

        public void setBody(ReqBodyOfIGetPackageAllRight reqBodyOfIGetPackageAllRight) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            this.body = reqBodyOfIGetPackageAllRight;
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
            }
        }

        public ReqBodyOfIGetPackageAllRight getBody() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            ReqBodyOfIGetPackageAllRight reqBodyOfIGetPackageAllRight = this.body;
            int i5 = i3 + 111;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 13 / 0;
            }
            return reqBodyOfIGetPackageAllRight;
        }

        public String generateUrl() throws Throwable {
            String strIntern;
            int i = 2 % 2;
            if (UCPLibraryFeatures.isREAL_SERVER()) {
                int i2 = onExtraCallback + 39;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[1];
                a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 35 - ExpandableListView.getPackedPositionGroup(0L), (char) (Color.alpha(0) + 41224), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35, View.MeasureSpec.getMode(0) + 40, (char) (Drawable.resolveOpacity(0, 0) + 9843), objArr2);
                String strIntern2 = ((String) objArr2[0]).intern();
                int i4 = IAuthTabCallback + 103;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 2;
                }
                strIntern = strIntern2;
            }
            return String.format("%s/nrms/getPackageAllRights", strIntern);
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $10 + 23;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.getOffsetAfter("", 0)), (KeyEvent.getMaxKeyCode() >> 16) + 17, 10974 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 46134), 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 20221 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 49123), 44 - View.resolveSize(0, 0), View.MeasureSpec.getSize(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getLongPressTimeout() >> 16) + 44, 1494 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr);
            int i7 = $10 + 85;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            jsonWriter.beginObject();
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            if (i3 != 0) {
                jsonWriter.endObject();
                int i4 = 45 / 0;
            } else {
                jsonWriter.endObject();
            }
            int i5 = IAuthTabCallback + 109;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this != this.body) {
                int i4 = i3 + 85;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                ReqBodyOfIGetPackageAllRight reqBodyOfIGetPackageAllRight = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, ReqBodyOfIGetPackageAllRight.class, reqBodyOfIGetPackageAllRight).write(jsonWriter, reqBodyOfIGetPackageAllRight);
            }
            if (this != this.header) {
                int i6 = IAuthTabCallback + 113;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 833);
                HeaderOfUrms headerOfUrms = this.header;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, HeaderOfUrms.class, headerOfUrms).write(jsonWriter, headerOfUrms);
                if (i7 != 0) {
                    int i8 = 17 / 0;
                }
            }
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            int i = 2 % 2;
            jsonReader.beginObject();
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            while (jsonReader.hasNext()) {
                int i4 = IAuthTabCallback + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
            int i2 = 2 % 2;
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 130) {
                if (!z) {
                    this.header = null;
                    jsonReader.nextNull();
                    return;
                }
                int i3 = IAuthTabCallback + 1;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                this.header = (HeaderOfUrms) gson.getAdapter(HeaderOfUrms.class).read(jsonReader);
                int i5 = IAuthTabCallback + 61;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            if (i != 464) {
                IAuthTabCallback(gson, jsonReader, i);
                int i7 = onExtraCallback + 73;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                return;
            }
            if (!z) {
                this.body = null;
                jsonReader.nextNull();
            } else {
                int i8 = IAuthTabCallback + 23;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                this.body = (ReqBodyOfIGetPackageAllRight) gson.getAdapter(ReqBodyOfIGetPackageAllRight.class).read(jsonReader);
            }
        }
    }

    public static class ReqBodyOfIGetPackageAllRight extends AbstractDao {
        protected String st_id = null;
        protected String pkg_name = null;
        protected String mdn = null;

        public void setStId(String str) {
            this.st_id = str;
        }

        public String getStId() {
            return this.st_id;
        }

        public void setPkgName(String str) {
            this.pkg_name = str;
        }

        public String getPkgName() {
            return this.pkg_name;
        }

        public String getMdn() {
            return this.mdn;
        }

        public void setMdn(String str) {
            this.mdn = str;
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.mdn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 16);
                jsonWriter.value(this.mdn);
            }
            if (this != this.pkg_name) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 15);
                jsonWriter.value(this.pkg_name);
            }
            if (this != this.st_id) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 719);
                jsonWriter.value(this.st_id);
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
            if (i == 208) {
                if (!z) {
                    this.st_id = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.st_id = jsonReader.nextString();
                    return;
                } else {
                    this.st_id = Boolean.toString(jsonReader.nextBoolean());
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
            if (i != 677) {
                IAuthTabCallback(gson, jsonReader, i);
                return;
            }
            if (!z) {
                this.pkg_name = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.pkg_name = jsonReader.nextString();
            } else {
                this.pkg_name = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }

    public static class Response extends AbstractDao {
        protected HeaderOfUrms header = null;
        protected ResBodyOfIGetPackageAllRight body = null;

        public void setHeader(HeaderOfUrms headerOfUrms) {
            this.header = headerOfUrms;
        }

        public HeaderOfUrms getHeader() {
            return this.header;
        }

        public void setBody(ResBodyOfIGetPackageAllRight resBodyOfIGetPackageAllRight) {
            this.body = resBodyOfIGetPackageAllRight;
        }

        public ResBodyOfIGetPackageAllRight getBody() {
            return this.body;
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.body) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
                ResBodyOfIGetPackageAllRight resBodyOfIGetPackageAllRight = this.body;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, ResBodyOfIGetPackageAllRight.class, resBodyOfIGetPackageAllRight).write(jsonWriter, resBodyOfIGetPackageAllRight);
            }
            if (this != this.header) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 833);
                HeaderOfUrms headerOfUrms = this.header;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, HeaderOfUrms.class, headerOfUrms).write(jsonWriter, headerOfUrms);
            }
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 130) {
                if (z) {
                    this.header = (HeaderOfUrms) gson.getAdapter(HeaderOfUrms.class).read(jsonReader);
                    return;
                } else {
                    this.header = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i != 464) {
                IAuthTabCallback(gson, jsonReader, i);
            } else if (z) {
                this.body = (ResBodyOfIGetPackageAllRight) gson.getAdapter(ResBodyOfIGetPackageAllRight.class).read(jsonReader);
            } else {
                this.body = null;
                jsonReader.nextNull();
            }
        }
    }

    public static class ResBodyOfIGetPackageAllRight extends AbstractDao {
        protected String st_id = null;
        protected String pkg_name = null;
        protected List<URMSComponents> components = null;
        protected List<URMSApplets> applets = null;
        protected List<URMSPartners> partners = null;
        protected List<URMSCredits> credits = null;
        protected List<URMSTcses> tcses = null;
        protected String mno_code = null;

        public void setStId(String str) {
            this.st_id = str;
        }

        public String getStId() {
            return this.st_id;
        }

        public void setPkgName(String str) {
            this.pkg_name = str;
        }

        public String getPkgName() {
            return this.pkg_name;
        }

        public void setComponents(List<URMSComponents> list) {
            this.components = list;
        }

        public List<URMSComponents> getComponents() {
            return this.components;
        }

        public void setApplets(List<URMSApplets> list) {
            this.applets = list;
        }

        public List<URMSApplets> getApplets() {
            return this.applets;
        }

        public void setPartners(List<URMSPartners> list) {
            this.partners = list;
        }

        public List<URMSPartners> getPartners() {
            return this.partners;
        }

        public void setCredits(List<URMSCredits> list) {
            this.credits = list;
        }

        public List<URMSCredits> getCredits() {
            return this.credits;
        }

        public void setTcses(List<URMSTcses> list) {
            this.tcses = list;
        }

        public List<URMSTcses> getTcses() {
            return this.tcses;
        }

        public String getMno_code() {
            return this.mno_code;
        }

        public void setMno_code(String str) {
            this.mno_code = str;
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.applets) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 859);
                onAddFocusables onaddfocusables = new onAddFocusables();
                List<URMSApplets> list = this.applets;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, onaddfocusables, list).write(jsonWriter, list);
            }
            if (this != this.components) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 39);
                measureChild measurechild = new measureChild();
                List<URMSComponents> list2 = this.components;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, measurechild, list2).write(jsonWriter, list2);
            }
            if (this != this.credits) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 220);
                onItemsAdded onitemsadded = new onItemsAdded();
                List<URMSCredits> list3 = this.credits;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, onitemsadded, list3).write(jsonWriter, list3);
            }
            if (this != this.mno_code) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 371);
                jsonWriter.value(this.mno_code);
            }
            if (this != this.partners) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 454);
                onItemsRemoved onitemsremoved = new onItemsRemoved();
                List<URMSPartners> list4 = this.partners;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, onitemsremoved, list4).write(jsonWriter, list4);
            }
            if (this != this.pkg_name) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 15);
                jsonWriter.value(this.pkg_name);
            }
            if (this != this.st_id) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 719);
                jsonWriter.value(this.st_id);
            }
            if (this != this.tcses) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 144);
                onInterceptFocusSearch oninterceptfocussearch = new onInterceptFocusSearch();
                List<URMSTcses> list5 = this.tcses;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, oninterceptfocussearch, list5).write(jsonWriter, list5);
            }
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 76) {
                if (z) {
                    this.components = (List) gson.getAdapter(new measureChild()).read(jsonReader);
                    return;
                } else {
                    this.components = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i == 208) {
                if (!z) {
                    this.st_id = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.st_id = jsonReader.nextString();
                    return;
                } else {
                    this.st_id = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 221) {
                if (z) {
                    this.applets = (List) gson.getAdapter(new onAddFocusables()).read(jsonReader);
                    return;
                } else {
                    this.applets = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i == 265) {
                if (!z) {
                    this.mno_code = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.mno_code = jsonReader.nextString();
                    return;
                } else {
                    this.mno_code = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 313) {
                if (z) {
                    this.credits = (List) gson.getAdapter(new onItemsAdded()).read(jsonReader);
                    return;
                } else {
                    this.credits = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i == 372) {
                if (z) {
                    this.partners = (List) gson.getAdapter(new onItemsRemoved()).read(jsonReader);
                    return;
                } else {
                    this.partners = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i != 677) {
                if (i != 684) {
                    IAuthTabCallback(gson, jsonReader, i);
                    return;
                } else if (z) {
                    this.tcses = (List) gson.getAdapter(new onInterceptFocusSearch()).read(jsonReader);
                    return;
                } else {
                    this.tcses = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (!z) {
                this.pkg_name = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.pkg_name = jsonReader.nextString();
            } else {
                this.pkg_name = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }
}
