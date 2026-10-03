package viva.republica.toss.common.affiliate;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.nc;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.affiliate.TossAffiliateCipherInterface;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface TossAffiliateCipherInterface {

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[KeyType.values().length];
            try {
                iArr[KeyType.SHARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyType.PERSONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
        }
    }

    String onExtraCallback(@Nullable KeyType keyType, @NotNull byte[] bArr);

    String onExtraCallbackWithResult();

    String onNavigationEvent();

    default String onExtraCallback(@Nullable KeyType keyType) {
        int i = keyType == null ? -1 : onExtraCallback.onExtraCallback[keyType.ordinal()];
        if (i == 1) {
            return onExtraCallbackWithResult();
        }
        if (i != 2) {
            return null;
        }
        return onNavigationEvent();
    }

    default String onExtraCallback(@Nullable KeyType keyType, @Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return onExtraCallback(keyType, bytes);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class KeyType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ KeyType[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;

        @SerializedName("P")
        @nc(IAuthTabCallback = "P")
        public static final KeyType PERSONAL;

        @SerializedName("S")
        @nc(IAuthTabCallback = "S")
        public static final KeyType SHARED;
        private static int onExtraCallback;
        private static int onNavigationEvent;
        private static final byte[] $$a = {15, -74, 84, -51};
        private static final int $$b = 79;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r5, short r6, short r7) {
            /*
                int r6 = r6 * 3
                int r6 = r6 + 4
                byte[] r0 = viva.republica.toss.common.affiliate.TossAffiliateCipherInterface.KeyType.$$a
                int r5 = r5 * 2
                int r5 = 105 - r5
                int r7 = r7 * 2
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r5
                r5 = r7
                r4 = r2
                goto L27
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L25:
                r3 = r0[r6]
            L27:
                int r5 = r5 + r3
                int r6 = r6 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.affiliate.TossAffiliateCipherInterface.KeyType.$$c(byte, short, short):java.lang.String");
        }

        public static /* synthetic */ KSerializer $r8$lambda$fLRRjmnMKmq6gA1f10tUHNgCLPw() throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i4 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 24 / 0;
            }
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ KeyType[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KeyType keyType = SHARED;
            if (i3 == 0) {
                return new KeyType[]{keyType, PERSONAL};
            }
            KeyType keyType2 = PERSONAL;
            KeyType[] keyTypeArr = new KeyType[3];
            keyTypeArr[0] = keyType;
            keyTypeArr[1] = keyType2;
            return keyTypeArr;
        }

        public static EnumEntries<KeyType> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<KeyType> enumEntries = $ENTRIES;
            int i5 = i2 + 39;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static KeyType valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KeyType keyType = (KeyType) Enum.valueOf(KeyType.class, str);
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            int i5 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return keyType;
        }

        public static KeyType[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            KeyType[] keyTypeArr = (KeyType[]) $VALUES.clone();
            int i3 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return keyTypeArr;
            }
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
                return (KSerializer) KeyType.access$get$cachedSerializer$delegate$cp().getValue();
            }

            public final KSerializer<KeyType> serializer() {
                return onExtraCallbackWithResult();
            }
        }

        private KeyType(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KeyType[] keyTypeArrValues = values();
            Object[] objArr = new Object[1];
            a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{0}, false, 139 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(1 - View.MeasureSpec.getMode(0), Color.green(0) + 1, new char[]{0}, true, 135 - TextUtils.lastIndexOf("", '0'), objArr2);
            Object[] objArr3 = new Object[1];
            a(74 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Color.green(0) + 47, new char[]{65483, 65534, 3, 3, 6, '\t', 6, 65534, 17, 2, 65483, 65521, '\f', 16, 16, 65502, 3, 3, 6, '\t', 6, 65534, 17, 2, 65504, 6, '\r', 5, 2, 15, 65510, 11, 17, 2, 15, 3, 65534, 0, 2, 65483, 65512, 2, 22, 65521, 22, '\r', 2, 19, 6, 19, 65534, 65483, 15, 2, '\r', 18, 65535, '\t', 6, 0, 65534, 65483, 17, '\f', 16, 16, 65483, 0, '\f', '\n', '\n', '\f', 11}, false, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 155, objArr3);
            KSerializer kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent(((String) objArr3[0]).intern(), keyTypeArrValues, new String[]{strIntern, ((String) objArr2[0]).intern()}, new Annotation[][]{null, null}, (Annotation[]) null);
            int i4 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            int i5 = i3 + 1;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
            }
            return lazy;
        }

        static {
            onExtraCallback = 0;
            onWarmupCompleted();
            Object[] objArr = new Object[1];
            a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, View.resolveSizeAndState(0, 0, 0) + 5, new char[]{65535, 65528, '\t', 65532, 65531, '\n'}, false, (Process.myTid() >> 22) + 129, objArr);
            SHARED = new KeyType(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(8 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 4 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{3, 2, 65525, 0, 4, 65529, 6, 7}, false, 133 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            PERSONAL = new KeyType(((String) objArr2[0]).intern(), 1);
            KeyType[] keyTypeArr$values = $values();
            $VALUES = keyTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(keyTypeArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.common.affiliate.TossAffiliateCipherInterface$KeyType$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return TossAffiliateCipherInterface.KeyType.$r8$lambda$fLRRjmnMKmq6gA1f10tUHNgCLPw();
                }
            });
            int i = onWarmupCompleted + 117;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x017a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.affiliate.TossAffiliateCipherInterface.KeyType.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        static void onWarmupCompleted() {
            onNavigationEvent = 478308881;
        }
    }
}
