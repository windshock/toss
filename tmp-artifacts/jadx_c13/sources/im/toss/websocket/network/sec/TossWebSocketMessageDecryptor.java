package im.toss.websocket.network.sec;

import android.util.Base64;
import im.toss.websocket.network.model.TossWebSocketMessageDto;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BaseRoundCornerProgressBarOnProgressChangedListener;
import o.EndMotionInteraction;
import o.TTHistoryActivity2;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.setProgressColor;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossWebSocketMessageDecryptor {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final BaseRoundCornerProgressBarOnProgressChangedListener IAuthTabCallback;
    private final wie2 onNavigationEvent;

    public TossWebSocketMessageDecryptor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = EndMotionInteraction.onExtraCallback();
        this.IAuthTabCallback = setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, str, (IvParameterSpec) null, 2, (Object) null);
    }

    public final TossWebSocketMessageDto onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        TossWebSocketMessageDto tossWebSocketMessageDto = (TossWebSocketMessageDto) onExtraCallback(onExtraCallback(onWarmupCompleted(((EncryptedMessageDto) onExtraCallback(str, EncryptedMessageDto.Companion.serializer())).onExtraCallback())), TossWebSocketMessageDto.Companion.serializer());
        int i3 = onExtraCallback + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return tossWebSocketMessageDto;
        }
        obj.hashCode();
        throw null;
    }

    private final byte[] onWarmupCompleted(String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                int i4 = onWarmupCompleted + 93;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListener = this.IAuthTabCallback;
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                byte[] bArrDecode = Base64.decode(bytes, 2);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
                byte[] bArrOnExtraCallbackWithResult = baseRoundCornerProgressBarOnProgressChangedListener.onExtraCallbackWithResult(bArrDecode);
                int i6 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return bArrOnExtraCallbackWithResult;
            }
        }
        byte[] bArr = new byte[0];
        int i8 = onExtraCallback + 17;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return bArr;
    }

    private final <T> T onExtraCallback(String str, KSerializer<T> kSerializer) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        T t = (T) this.onNavigationEvent.onExtraCallback(kSerializer, str);
        int i4 = onExtraCallback + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return t;
    }

    private final String onExtraCallback(byte[] bArr) {
        int i = 2 % 2;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bArr)), Charsets.UTF_8), TTHistoryActivity2.SIZE);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                int i2 = onWarmupCompleted + 49;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return text;
                }
                throw null;
            } finally {
            }
        } catch (Throwable unused) {
            return new String(bArr, Charsets.UTF_8);
        }
    }

    @liq
    public static final class EncryptedMessageDto {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final String data;

        static {
            int i = onExtraCallback + 37;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof EncryptedMessageDto) {
                if (!(!Intrinsics.areEqual(this.data, ((EncryptedMessageDto) obj).data))) {
                    return true;
                }
                int i5 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = i2 + 9;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.data;
            if (str == null) {
                return 0;
            }
            int iHashCode = str.hashCode();
            int i3 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EncryptedMessageDto(data=" + this.data + ")";
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EncryptedMessageDto> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TossWebSocketMessageDecryptor$EncryptedMessageDto$$serializer tossWebSocketMessageDecryptor$EncryptedMessageDto$$serializer = TossWebSocketMessageDecryptor$EncryptedMessageDto$$serializer.INSTANCE;
                int i4 = onExtraCallback + 69;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return tossWebSocketMessageDecryptor$EncryptedMessageDto$$serializer;
                }
                throw null;
            }
        }

        public /* synthetic */ EncryptedMessageDto(int i, String str, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i2 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, TossWebSocketMessageDecryptor$EncryptedMessageDto$$serializer.INSTANCE.getDescriptor());
                int i4 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            this.data = str;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(EncryptedMessageDto encryptedMessageDto, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, encryptedMessageDto.data);
            int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.data;
            int i5 = i3 + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
