package com.google.firebase.messaging;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.engine.api.common.log.IgnoreLogUtils;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.INSTANCE);
        encoderConfig.registerEncoder(MessagingClientEventExtension.class, MessagingClientEventExtensionEncoder.INSTANCE);
        encoderConfig.registerEncoder(MessagingClientEvent.class, MessagingClientEventEncoder.INSTANCE);
    }

    static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {
        static final ProtoEncoderDoNotUseEncoder INSTANCE = new ProtoEncoderDoNotUseEncoder();
        private static final FieldDescriptor MESSAGINGCLIENTEVENTEXTENSION_DESCRIPTOR = FieldDescriptor.of("messagingClientEventExtension");

        private ProtoEncoderDoNotUseEncoder() {
        }

        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(MESSAGINGCLIENTEVENTEXTENSION_DESCRIPTOR, protoEncoderDoNotUse.getMessagingClientEventExtension());
        }
    }

    static final class MessagingClientEventExtensionEncoder implements ObjectEncoder<MessagingClientEventExtension> {
        static final MessagingClientEventExtensionEncoder INSTANCE = new MessagingClientEventExtensionEncoder();
        private static final FieldDescriptor MESSAGINGCLIENTEVENT_DESCRIPTOR = FieldDescriptor.builder("messagingClientEvent").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private MessagingClientEventExtensionEncoder() {
        }

        public void encode(MessagingClientEventExtension messagingClientEventExtension, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(MESSAGINGCLIENTEVENT_DESCRIPTOR, messagingClientEventExtension.getMessagingClientEventInternal());
        }
    }

    static final class MessagingClientEventEncoder implements ObjectEncoder<MessagingClientEvent> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final FieldDescriptor ANALYTICSLABEL_DESCRIPTOR;
        private static final FieldDescriptor BULKID_DESCRIPTOR;
        private static final FieldDescriptor CAMPAIGNID_DESCRIPTOR;
        private static final FieldDescriptor COLLAPSEKEY_DESCRIPTOR;
        private static final FieldDescriptor COMPOSERLABEL_DESCRIPTOR;
        private static final FieldDescriptor EVENT_DESCRIPTOR;
        private static long IAuthTabCallback = 0;
        static final MessagingClientEventEncoder INSTANCE;
        private static final FieldDescriptor INSTANCEID_DESCRIPTOR;
        private static final FieldDescriptor MESSAGEID_DESCRIPTOR;
        private static final FieldDescriptor MESSAGETYPE_DESCRIPTOR;
        private static final FieldDescriptor PACKAGENAME_DESCRIPTOR;
        private static final FieldDescriptor PRIORITY_DESCRIPTOR;
        private static final FieldDescriptor PROJECTNUMBER_DESCRIPTOR;
        private static final FieldDescriptor SDKPLATFORM_DESCRIPTOR;
        private static final FieldDescriptor TOPIC_DESCRIPTOR;
        private static final FieldDescriptor TTL_DESCRIPTOR;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private MessagingClientEventEncoder() {
        }

        public /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            encode((MessagingClientEvent) obj, (ObjectEncoderContext) obj2);
            if (i4 != 0) {
                throw null;
            }
        }

        static {
            onWarmupCompleted();
            INSTANCE = new MessagingClientEventEncoder();
            PROJECTNUMBER_DESCRIPTOR = FieldDescriptor.builder("projectNumber").withProperty(AtProtobuf.builder().tag(1).build()).build();
            MESSAGEID_DESCRIPTOR = FieldDescriptor.builder("messageId").withProperty(AtProtobuf.builder().tag(2).build()).build();
            INSTANCEID_DESCRIPTOR = FieldDescriptor.builder("instanceId").withProperty(AtProtobuf.builder().tag(3).build()).build();
            MESSAGETYPE_DESCRIPTOR = FieldDescriptor.builder("messageType").withProperty(AtProtobuf.builder().tag(4).build()).build();
            SDKPLATFORM_DESCRIPTOR = FieldDescriptor.builder("sdkPlatform").withProperty(AtProtobuf.builder().tag(5).build()).build();
            PACKAGENAME_DESCRIPTOR = FieldDescriptor.builder("packageName").withProperty(AtProtobuf.builder().tag(6).build()).build();
            COLLAPSEKEY_DESCRIPTOR = FieldDescriptor.builder("collapseKey").withProperty(AtProtobuf.builder().tag(7).build()).build();
            Object[] objArr = new Object[1];
            a(new char[]{1245, 25077, 3567, 39458, 1197, 63415, 8678, 22749, 23663, 36716, 35003, 33035}, View.MeasureSpec.getSize(0), objArr);
            PRIORITY_DESCRIPTOR = FieldDescriptor.builder(((String) objArr[0]).intern()).withProperty(AtProtobuf.builder().tag(8).build()).build();
            TTL_DESCRIPTOR = FieldDescriptor.builder("ttl").withProperty(AtProtobuf.builder().tag(9).build()).build();
            TOPIC_DESCRIPTOR = FieldDescriptor.builder("topic").withProperty(AtProtobuf.builder().tag(10).build()).build();
            BULKID_DESCRIPTOR = FieldDescriptor.builder("bulkId").withProperty(AtProtobuf.builder().tag(11).build()).build();
            EVENT_DESCRIPTOR = FieldDescriptor.builder(IgnoreLogUtils.TYPE_EVENT).withProperty(AtProtobuf.builder().tag(12).build()).build();
            ANALYTICSLABEL_DESCRIPTOR = FieldDescriptor.builder("analyticsLabel").withProperty(AtProtobuf.builder().tag(13).build()).build();
            CAMPAIGNID_DESCRIPTOR = FieldDescriptor.builder("campaignId").withProperty(AtProtobuf.builder().tag(14).build()).build();
            COMPOSERLABEL_DESCRIPTOR = FieldDescriptor.builder("composerLabel").withProperty(AtProtobuf.builder().tag(15).build()).build();
            int i2 = onExtraCallbackWithResult + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i2);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i4 = $11 + 111;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i6 = $11 + 99;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - MotionEvent.axisFromString("")), 84 - Drawable.resolveOpacity(0, 0), 21232 - Process.getGidForName(""), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14233 - AndroidCharacter.getMirror('0')), 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 8808 - KeyEvent.normalizeMetaState(0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        public void encode(MessagingClientEvent messagingClientEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            objectEncoderContext.add(PROJECTNUMBER_DESCRIPTOR, messagingClientEvent.getProjectNumber());
            objectEncoderContext.add(MESSAGEID_DESCRIPTOR, messagingClientEvent.getMessageId());
            objectEncoderContext.add(INSTANCEID_DESCRIPTOR, messagingClientEvent.getInstanceId());
            objectEncoderContext.add(MESSAGETYPE_DESCRIPTOR, messagingClientEvent.getMessageType());
            objectEncoderContext.add(SDKPLATFORM_DESCRIPTOR, messagingClientEvent.getSdkPlatform());
            objectEncoderContext.add(PACKAGENAME_DESCRIPTOR, messagingClientEvent.getPackageName());
            objectEncoderContext.add(COLLAPSEKEY_DESCRIPTOR, messagingClientEvent.getCollapseKey());
            objectEncoderContext.add(PRIORITY_DESCRIPTOR, messagingClientEvent.getPriority());
            objectEncoderContext.add(TTL_DESCRIPTOR, messagingClientEvent.getTtl());
            objectEncoderContext.add(TOPIC_DESCRIPTOR, messagingClientEvent.getTopic());
            objectEncoderContext.add(BULKID_DESCRIPTOR, messagingClientEvent.getBulkId());
            objectEncoderContext.add(EVENT_DESCRIPTOR, messagingClientEvent.getEvent());
            objectEncoderContext.add(ANALYTICSLABEL_DESCRIPTOR, messagingClientEvent.getAnalyticsLabel());
            objectEncoderContext.add(CAMPAIGNID_DESCRIPTOR, messagingClientEvent.getCampaignId());
            objectEncoderContext.add(COMPOSERLABEL_DESCRIPTOR, messagingClientEvent.getComposerLabel());
            int i5 = onNavigationEvent + 55;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        static void onWarmupCompleted() {
            IAuthTabCallback = -2249646851615756996L;
        }
    }
}
