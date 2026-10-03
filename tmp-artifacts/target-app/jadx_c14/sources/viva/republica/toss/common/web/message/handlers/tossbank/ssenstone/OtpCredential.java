package viva.republica.toss.common.web.message.handlers.tossbank.ssenstone;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class OtpCredential {
    public static final int $stable = 0;

    public /* synthetic */ OtpCredential(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OtpCredential() {
    }

    @liq
    public static final class Pin extends OtpCredential {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int asBinder = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char onNavigationEvent;
        private static char[] onWarmupCompleted;
        private final String secret;

        static {
            onExtraCallback();
            Companion = new Companion(null);
            int i = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 33;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (obj instanceof Pin) {
                return Intrinsics.areEqual(this.secret, ((Pin) obj).secret);
            }
            int i7 = i3 + 125;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.secret.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.secret.hashCode();
            int i3 = onExtraCallback + 35;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.secret;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{2, 6, 7, 1, 2, '\t', 0, '\f', 11, '\b', 13770}, (byte) (Color.rgb(0, 0, 0) + 16777251), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(new char[]{13844}, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 96), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = asBinder + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Pin> serializer() {
                return OtpCredential$Pin$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Pin(int i, String str, okycx okycxVar) {
            super(null);
            if (1 != (i & 1)) {
                int i2 = asBinder + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, OtpCredential$Pin$$serializer.INSTANCE.getDescriptor());
                int i4 = onExtraCallback + 111;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this.secret = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pin(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.secret = str;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(Pin pin, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = asBinder + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, pin.secret);
            int i4 = asBinder + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final String onExtraCallbackWithResult() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                str = this.secret;
                int i4 = 90 / 0;
            } else {
                str = this.secret;
            }
            int i5 = i3 + 39;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onWarmupCompleted;
            long j = 0;
            if (cArr2 != null) {
                int i5 = $11 + 49;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 125;
                    $10 = i8 % 128;
                    if (i8 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionChild(j) + 27, TextUtils.getCapsMode("", 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 26 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i7++;
                    }
                    i3 = 2;
                    j = 0;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 26 - Gravity.getAbsoluteGravity(0, 0), 23140 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i9 = $11 + 65;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    i2 = i + 103;
                    cArr4[i2] = (char) (cArr[i2] * b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 24824), (ViewConfiguration.getPressedStateDuration() >> 16) + 74, 8088 - View.combineMeasuredStates(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29, ExpandableListView.getPackedPositionChild(0L) + 19489, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = $11 + 67;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        static void onExtraCallback() {
            onWarmupCompleted = new char[]{64910, 64960, 64986, 64923, 64901, 64989, 64922, 64897, 64961, 64896, 64982, 64967, 64976, 64898, 64995, 64899};
            onNavigationEvent = (char) 51245;
        }
    }

    public static abstract class Card extends OtpCredential {
        public static final int $stable = 0;

        public /* synthetic */ Card(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String onExtraCallbackWithResult();

        private Card() {
            super(null);
        }

        @liq
        public static final class Stored extends Card {
            private static int $10 = 0;
            private static int $11 = 1;
            public static final int $stable = 0;
            public static final Companion Companion;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static long onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final String cardId;
            private final String secret;

            static {
                IAuthTabCallback();
                Companion = new Companion(null);
                int i = onNavigationEvent + 41;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 103;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Stored)) {
                    int i5 = i2 + 113;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                Stored stored = (Stored) obj;
                if (Intrinsics.areEqual(this.cardId, stored.cardId)) {
                    return !(Intrinsics.areEqual(this.secret, stored.secret) ^ true);
                }
                int i6 = IAuthTabCallback + 77;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 23;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (this.cardId.hashCode() * 31) + this.secret.hashCode();
                int i4 = IAuthTabCallback + 121;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() throws Throwable {
                int i = 2 % 2;
                String str = this.cardId;
                String str2 = this.secret;
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a(new char[]{997, 27765, 950, 8799, 54516, 10746, 43462, 1399, 5228, 12790, 33173, 15690, 11356, 6612, 39413, 54644, 17477, 57847}, 1 - Color.argb(0, 0, 0, 0), objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(str);
                Object[] objArr2 = new Object[1];
                a(new char[]{33481, 65021, 33509, 37226, 63118, 47142, 6895, 10010, 38214, 41064, 13037, 7975, 44332}, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(str2);
                Object[] objArr3 = new Object[1];
                a(new char[]{30127, 11424, 30086, 12286, 50834}, View.MeasureSpec.getMode(0) + 1, objArr3);
                sb.append(((String) objArr3[0]).intern());
                String string = sb.toString();
                int i2 = onWarmupCompleted + 71;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return string;
                }
                throw null;
            }

            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Stored> serializer() {
                    return OtpCredential$Card$Stored$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Stored(int i, String str, String str2, okycx okycxVar) {
                super(null);
                if (3 != (i & 3)) {
                    int i2 = IAuthTabCallback + 93;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    htf31.onExtraCallbackWithResult(i, 3, OtpCredential$Card$Stored$$serializer.INSTANCE.getDescriptor());
                    int i4 = 2 % 2;
                }
                this.cardId = str;
                this.secret = str2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Stored(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.cardId = str;
                this.secret = str2;
            }

            @JvmStatic
            public static final /* synthetic */ void onExtraCallbackWithResult(Stored stored, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    vylVar.onExtraCallback(serialDescriptor, 1, stored.onExtraCallbackWithResult());
                    vylVar.onExtraCallback(serialDescriptor, 0, stored.secret);
                } else {
                    vylVar.onExtraCallback(serialDescriptor, 0, stored.onExtraCallbackWithResult());
                    vylVar.onExtraCallback(serialDescriptor, 1, stored.secret);
                }
                int i3 = onWarmupCompleted + 77;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override // viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential.Card
            public String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 25;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                String str = this.cardId;
                int i4 = i3 + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            public final String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 99;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.secret;
                }
                throw null;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
                timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                    int i3 = $11 + 111;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                    int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - TextUtils.getOffsetBefore("", 0)), 84 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 21233 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19, 8808 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
                String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                int i6 = $11 + 17;
                $10 = i6 % 128;
                if (i6 % 2 == 0) {
                    objArr[0] = str;
                } else {
                    int i7 = 5 / 0;
                    objArr[0] = str;
                }
            }

            static void IAuthTabCallback() {
                onExtraCallbackWithResult = 1658087259042692855L;
            }
        }

        @liq
        public static final class PendingMigration_5_255_256 extends Card {
            public static final int $stable = 0;
            public static final Companion Companion;
            private static int IAuthTabCallback;
            private static int onExtraCallback;
            private final String cardId;
            private final String sKey;
            private final String seed;
            private static final byte[] $$a = {102, 29, -34, 39};
            private static final int $$b = 90;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$c(int r6, short r7, int r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = 105 - r7
                    int r8 = r8 + 4
                    byte[] r0 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential.Card.PendingMigration_5_255_256.$$a
                    int r6 = r6 * 3
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L2b
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r8 = r8 + 1
                    if (r3 != r6) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L22:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L2b:
                    int r7 = -r7
                    int r7 = r7 + r8
                    r8 = r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential.Card.PendingMigration_5_255_256.$$c(int, short, int):java.lang.String");
            }

            static {
                onExtraCallback = 0;
                onWarmupCompleted();
                Companion = new Companion(null);
                int i = onWarmupCompleted + 111;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 23;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 23;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
                if (!(obj instanceof PendingMigration_5_255_256)) {
                    return false;
                }
                PendingMigration_5_255_256 pendingMigration_5_255_256 = (PendingMigration_5_255_256) obj;
                if (!Intrinsics.areEqual(this.cardId, pendingMigration_5_255_256.cardId)) {
                    int i6 = onNavigationEvent + 53;
                    onExtraCallbackWithResult = i6 % 128;
                    return i6 % 2 != 0;
                }
                if (!Intrinsics.areEqual(this.seed, pendingMigration_5_255_256.seed)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.sKey, pendingMigration_5_255_256.sKey)) {
                    return true;
                }
                int i7 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((this.cardId.hashCode() * 31) + this.seed.hashCode()) * 31) + this.sKey.hashCode();
                int i4 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() throws Throwable {
                int i = 2 % 2;
                String str = this.cardId;
                String str2 = this.seed;
                String str3 = this.sKey;
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a(33 - ImageFormat.getBitsPerPixel(0), 33 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{'\r', 65522, '\r', 27, '\n', '\f', 65489, 65503, 65502, 65499, '\b', 65502, 65502, 65499, '\b', 65502, '\b', 23, 24, 18, 29, '\n', 27, 16, 18, 65526, 16, 23, 18, '\r', 23, 14, 65529, 65510}, true, Color.blue(0) + 283, objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(str);
                Object[] objArr2 = new Object[1];
                a(TextUtils.getOffsetAfter("", 0) + 7, View.getDefaultSize(0, 0) + 6, new char[]{65489, '$', 22, 22, 21, 65518, 65501}, false, 275 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(str2);
                Object[] objArr3 = new Object[1];
                a(8 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 7 - KeyEvent.getDeadChar(0, 0), new char[]{65519, '+', 23, 65533, '%', 65490, 65502}, true, (ViewConfiguration.getTapTimeout() >> 16) + 274, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(str3);
                Object[] objArr4 = new Object[1];
                a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, Color.green(0) + 1, new char[]{0}, true, 237 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
                sb.append(((String) objArr4[0]).intern());
                String string = sb.toString();
                int i2 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return string;
            }

            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<PendingMigration_5_255_256> serializer() {
                    return OtpCredential$Card$PendingMigration_5_255_256$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ PendingMigration_5_255_256(int i, String str, String str2, String str3, okycx okycxVar) {
                super(null);
                if (7 != (i & 7)) {
                    int i2 = onExtraCallbackWithResult + 1;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    htf31.onExtraCallbackWithResult(i, 7, OtpCredential$Card$PendingMigration_5_255_256$$serializer.INSTANCE.getDescriptor());
                    int i4 = onNavigationEvent + 69;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 % 2;
                    }
                }
                this.cardId = str;
                this.seed = str2;
                this.sKey = str3;
            }

            @JvmStatic
            public static final /* synthetic */ void onExtraCallback(PendingMigration_5_255_256 pendingMigration_5_255_256, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                vylVar.onExtraCallback(serialDescriptor, 0, pendingMigration_5_255_256.onExtraCallbackWithResult());
                vylVar.onExtraCallback(serialDescriptor, 1, pendingMigration_5_255_256.seed);
                vylVar.onExtraCallback(serialDescriptor, 2, pendingMigration_5_255_256.sKey);
                int i4 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            @Override // viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential.Card
            public String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 105;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.cardId;
                int i5 = i2 + 119;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.seed;
                }
                throw null;
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.sKey;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0181  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 404
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential.Card.PendingMigration_5_255_256.a(int, int, char[], boolean, int, java.lang.Object[]):void");
            }

            static void onWarmupCompleted() {
                IAuthTabCallback = 478309101;
            }
        }
    }
}
