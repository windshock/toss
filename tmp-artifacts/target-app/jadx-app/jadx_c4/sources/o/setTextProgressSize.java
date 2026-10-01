package o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setTextProgressSize {
    private static int IAuthTabCallback = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent;
    public static final setTextProgressSize onWarmupCompleted = new setTextProgressSize();
    private static final TextRoundCornerProgressBar1<MessageDigest> onExtraCallbackWithResult = new TextRoundCornerProgressBar1<>("message-digest-sha256-pool", new onNavigationEvent(), 4);
    private static final TextRoundCornerProgressBar1<MessageDigest> onExtraCallback = new TextRoundCornerProgressBar1<>("message-digest-md5-pool", new onExtraCallback(), 4);

    private setTextProgressSize() {
    }

    public final TextRoundCornerProgressBar1<MessageDigest> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBar1<MessageDigest> textRoundCornerProgressBar1 = onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return textRoundCornerProgressBar1;
    }

    public static final class onNavigationEvent implements setProgressText<MessageDigest> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public void onWarmupCompleted(MessageDigest messageDigest) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(messageDigest, "");
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        onNavigationEvent() {
        }

        @Override // o.setProgressText
        public /* synthetic */ void IAuthTabCallback(MessageDigest messageDigest) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(messageDigest);
            int i4 = onWarmupCompleted + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
            }
        }

        @Override // o.setProgressText
        public /* synthetic */ void onExtraCallbackWithResult(MessageDigest messageDigest) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(messageDigest);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onNavigationEvent + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.setProgressText
        public /* synthetic */ MessageDigest onNavigationEvent() throws NoSuchAlgorithmException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            MessageDigest messageDigestIAuthTabCallback = IAuthTabCallback();
            int i4 = onWarmupCompleted + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return messageDigestIAuthTabCallback;
        }

        public MessageDigest IAuthTabCallback() throws NoSuchAlgorithmException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Intrinsics.checkNotNullExpressionValue(messageDigest, "");
                return messageDigest;
            }
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
            Intrinsics.checkNotNullExpressionValue(messageDigest2, "");
            int i3 = 66 / 0;
            return messageDigest2;
        }

        public void onExtraCallback(MessageDigest messageDigest) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(messageDigest, "");
                messageDigest.reset();
                throw null;
            }
            Intrinsics.checkNotNullParameter(messageDigest, "");
            messageDigest.reset();
            int i3 = onNavigationEvent + 11;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        int i = IAuthTabCallback + 97;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public final TextRoundCornerProgressBar1<MessageDigest> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback implements setProgressText<MessageDigest> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public void onNavigationEvent(MessageDigest messageDigest) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(messageDigest, "");
            int i4 = onWarmupCompleted + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        onExtraCallback() {
        }

        @Override // o.setProgressText
        public /* synthetic */ void IAuthTabCallback(MessageDigest messageDigest) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(messageDigest);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.setProgressText
        public /* synthetic */ void onExtraCallbackWithResult(MessageDigest messageDigest) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(messageDigest);
            if (i3 != 0) {
                throw null;
            }
        }

        @Override // o.setProgressText
        public /* synthetic */ MessageDigest onNavigationEvent() throws NoSuchAlgorithmException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            MessageDigest messageDigestOnWarmupCompleted = onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 84 / 0;
            }
            return messageDigestOnWarmupCompleted;
        }

        public MessageDigest onWarmupCompleted() throws NoSuchAlgorithmException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Intrinsics.checkNotNullExpressionValue(messageDigest, "");
            int i4 = onWarmupCompleted + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return messageDigest;
        }

        public void onExtraCallback(MessageDigest messageDigest) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(messageDigest, "");
            messageDigest.reset();
            int i4 = onWarmupCompleted + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
