package com.google.android.datatransport.runtime;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;
import java.lang.reflect.Method;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.INSTANCE);
        encoderConfig.registerEncoder(ClientMetrics.class, ClientMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(TimeWindow.class, TimeWindowEncoder.INSTANCE);
        encoderConfig.registerEncoder(LogSourceMetrics.class, LogSourceMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(LogEventDropped.class, LogEventDroppedEncoder.INSTANCE);
        encoderConfig.registerEncoder(GlobalMetrics.class, GlobalMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(StorageMetrics.class, StorageMetricsEncoder.INSTANCE);
    }

    static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {
        static final ProtoEncoderDoNotUseEncoder INSTANCE = new ProtoEncoderDoNotUseEncoder();
        private static final FieldDescriptor CLIENTMETRICS_DESCRIPTOR = FieldDescriptor.of("clientMetrics");

        private ProtoEncoderDoNotUseEncoder() {
        }

        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CLIENTMETRICS_DESCRIPTOR, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {
        static final ClientMetricsEncoder INSTANCE = new ClientMetricsEncoder();
        private static final FieldDescriptor WINDOW_DESCRIPTOR = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor LOGSOURCEMETRICS_DESCRIPTOR = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();
        private static final FieldDescriptor GLOBALMETRICS_DESCRIPTOR = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();
        private static final FieldDescriptor APPNAMESPACE_DESCRIPTOR = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        private ClientMetricsEncoder() {
        }

        public void encode(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(WINDOW_DESCRIPTOR, clientMetrics.getWindowInternal());
            objectEncoderContext.add(LOGSOURCEMETRICS_DESCRIPTOR, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(GLOBALMETRICS_DESCRIPTOR, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(APPNAMESPACE_DESCRIPTOR, clientMetrics.getAppNamespace());
        }
    }

    static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final FieldDescriptor EVENTSDROPPEDCOUNT_DESCRIPTOR;
        private static int IAuthTabCallback = 1;
        static final LogEventDroppedEncoder INSTANCE;
        private static final FieldDescriptor REASON_DESCRIPTOR;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 23 - TextUtils.lastIndexOf("", '0'), 19627 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 59 - Color.alpha(0), (ViewConfiguration.getTouchSlop() >> 8) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i5 = $10 + 75;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 58 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            String str = new String(cArr2);
            int i7 = $11 + 17;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
        }

        private LogEventDroppedEncoder() {
        }

        public /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object obj3 = null;
            encode((LogEventDropped) obj, (ObjectEncoderContext) obj2);
            if (i4 != 0) {
                throw null;
            }
            int i5 = onWarmupCompleted + 59;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj3.hashCode();
            throw null;
        }

        static {
            onWarmupCompleted();
            INSTANCE = new LogEventDroppedEncoder();
            EVENTSDROPPEDCOUNT_DESCRIPTOR = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();
            Object[] objArr = new Object[1];
            a(new char[]{56816, 20544, 50861, 29956, 60273, 6575}, 36263 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            REASON_DESCRIPTOR = FieldDescriptor.builder(((String) objArr[0]).intern()).withProperty(AtProtobuf.builder().tag(3).build()).build();
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        public void encode(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) throws IOException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 65;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                objectEncoderContext.add(EVENTSDROPPEDCOUNT_DESCRIPTOR, logEventDropped.getEventsDroppedCount());
                objectEncoderContext.add(REASON_DESCRIPTOR, logEventDropped.getReason());
                int i4 = IAuthTabCallback + 79;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 99 / 0;
                    return;
                }
                return;
            }
            objectEncoderContext.add(EVENTSDROPPEDCOUNT_DESCRIPTOR, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(REASON_DESCRIPTOR, logEventDropped.getReason());
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void onWarmupCompleted() {
            onExtraCallbackWithResult = 7073648711945705653L;
        }
    }

    static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {
        static final TimeWindowEncoder INSTANCE = new TimeWindowEncoder();
        private static final FieldDescriptor STARTMS_DESCRIPTOR = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor ENDMS_DESCRIPTOR = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private TimeWindowEncoder() {
        }

        public void encode(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(STARTMS_DESCRIPTOR, timeWindow.getStartMs());
            objectEncoderContext.add(ENDMS_DESCRIPTOR, timeWindow.getEndMs());
        }
    }

    static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {
        static final LogSourceMetricsEncoder INSTANCE = new LogSourceMetricsEncoder();
        private static final FieldDescriptor LOGSOURCE_DESCRIPTOR = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor LOGEVENTDROPPED_DESCRIPTOR = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private LogSourceMetricsEncoder() {
        }

        public void encode(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(LOGSOURCE_DESCRIPTOR, logSourceMetrics.getLogSource());
            objectEncoderContext.add(LOGEVENTDROPPED_DESCRIPTOR, logSourceMetrics.getLogEventDroppedList());
        }
    }

    static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {
        static final GlobalMetricsEncoder INSTANCE = new GlobalMetricsEncoder();
        private static final FieldDescriptor STORAGEMETRICS_DESCRIPTOR = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private GlobalMetricsEncoder() {
        }

        public void encode(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(STORAGEMETRICS_DESCRIPTOR, globalMetrics.getStorageMetricsInternal());
        }
    }

    static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {
        static final StorageMetricsEncoder INSTANCE = new StorageMetricsEncoder();
        private static final FieldDescriptor CURRENTCACHESIZEBYTES_DESCRIPTOR = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor MAXCACHESIZEBYTES_DESCRIPTOR = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private StorageMetricsEncoder() {
        }

        public void encode(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CURRENTCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(MAXCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getMaxCacheSizeBytes());
        }
    }
}
