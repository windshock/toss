package viva.republica.toss.share;

import o.MessageQueueThreadSpec;
import o.startNewBackgroundThreadlambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ShareToSNSDialog$onWarmupCompleted {
    public static final /* synthetic */ int[] onExtraCallback;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[startNewBackgroundThreadlambda0.values().length];
        try {
            iArr[startNewBackgroundThreadlambda0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[startNewBackgroundThreadlambda0.NIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        onExtraCallback = iArr;
        int[] iArr2 = new int[MessageQueueThreadSpec.values().length];
        try {
            iArr2[MessageQueueThreadSpec.COPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MessageQueueThreadSpec.INSTAGRAM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MessageQueueThreadSpec.TWITTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MessageQueueThreadSpec.TIKTOK.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MessageQueueThreadSpec.KAKAO_TALK.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[MessageQueueThreadSpec.FB.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[MessageQueueThreadSpec.FB_MESSENGER.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[MessageQueueThreadSpec.BAND.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[MessageQueueThreadSpec.KAKAO_STORY.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[MessageQueueThreadSpec.OS_MESSAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[MessageQueueThreadSpec.MORE_ACTION.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        onWarmupCompleted = iArr2;
    }
}
