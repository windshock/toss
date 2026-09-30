package im.toss.components.tuba.variable.v1.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skt.usp.UCPApiConstants;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.decryptType4;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CdnVar {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static long onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Lazy defaultValue$delegate;
    private final String key;
    private final VersionConstraints maxVerConstraints;
    private final VersionConstraints minVerConstraints;
    private final JsonPrimitive value;

    static {
        IAuthTabCallback();
        Companion = new Companion(null);
        int i = IAuthTabCallback + 51;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ JsonPrimitive IAuthTabCallback(CdnVar cdnVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        JsonPrimitive jsonPrimitiveOnNavigationEvent = onNavigationEvent(cdnVar);
        int i4 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jsonPrimitiveOnNavigationEvent;
    }

    public static /* synthetic */ JsonPrimitive onExtraCallback(CdnVar cdnVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JsonPrimitive jsonPrimitiveOnWarmupCompleted = onWarmupCompleted(cdnVar);
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return jsonPrimitiveOnWarmupCompleted;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof CdnVar) {
            CdnVar cdnVar = (CdnVar) obj;
            return Intrinsics.areEqual(this.key, cdnVar.key) && Intrinsics.areEqual(this.value, cdnVar.value) && Intrinsics.areEqual(this.minVerConstraints, cdnVar.minVerConstraints) && Intrinsics.areEqual(this.maxVerConstraints, cdnVar.maxVerConstraints);
        }
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3 r4
      0x0032: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v5 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v3 im.toss.components.tuba.variable.v1.model.CdnVar$VersionConstraints) = 
      (r4v0 im.toss.components.tuba.variable.v1.model.CdnVar$VersionConstraints)
      (r4v5 im.toss.components.tuba.variable.v1.model.CdnVar$VersionConstraints)
     binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v2 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        VersionConstraints versionConstraints;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.key.hashCode();
            iHashCode2 = this.value.hashCode();
            versionConstraints = this.minVerConstraints;
            if (versionConstraints == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = versionConstraints.hashCode();
                int i3 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            iHashCode = this.key.hashCode();
            iHashCode2 = this.value.hashCode();
            versionConstraints = this.minVerConstraints;
            if (versionConstraints == null) {
            }
        }
        VersionConstraints versionConstraints2 = this.maxVerConstraints;
        int iHashCode4 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (versionConstraints2 != null ? versionConstraints2.hashCode() : 0);
        int i5 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode4;
        }
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.key;
        JsonPrimitive jsonPrimitive = this.value;
        VersionConstraints versionConstraints = this.minVerConstraints;
        VersionConstraints versionConstraints2 = this.maxVerConstraints;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{16541, 16606, 38519, 1944, 35298, 14356, 13742, 27179, 16184, 5669, 34714, 59986, 49008, 38626, 1859}, 1 - KeyEvent.getDeadChar(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new char[]{53621, 53593, 8744, 10175, 15865, 6187, 62941, 43631, 44765, 41529, 42984, 10871}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(jsonPrimitive);
        Object[] objArr3 = new Object[1];
        a(new char[]{7926, 7898, 61575, 41427, 61270, 40540, 45022, 61540, 24924, 28853, 8607, 28731, 57661, 61504, 41304, 61686, 25038, 28697, 8467, 28840, 57736, 61475, 41181, 61696}, 1 - Gravity.getAbsoluteGravity(0, 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(versionConstraints);
        Object[] objArr4 = new Object[1];
        a(new char[]{42385, 42429, 47163, 59403, 42986, 55172, 54897, 35267, 55853, 14345, 26695, 2452, 23130, 47356, 59520, 35161, 55977, 14501, 26827, 2311, 23279, 47263, 59653, 34991}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(versionConstraints2);
        Object[] objArr5 = new Object[1];
        a(new char[]{20982, 20959, 46956, 20243, 36058}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CdnVar> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            CdnVar$$serializer cdnVar$$serializer = CdnVar$$serializer.INSTANCE;
            if (i3 != 0) {
                return cdnVar$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ CdnVar(int i, String str, JsonPrimitive jsonPrimitive, VersionConstraints versionConstraints, VersionConstraints versionConstraints2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, CdnVar$$serializer.INSTANCE.getDescriptor());
        }
        this.key = str;
        this.value = jsonPrimitive;
        if ((i & 4) == 0) {
            this.minVerConstraints = null;
        } else {
            this.minVerConstraints = versionConstraints;
            int i4 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = 2 % 2;
        if ((i & 8) == 0) {
            this.maxVerConstraints = null;
        } else {
            this.maxVerConstraints = versionConstraints2;
        }
        int i7 = 2 % 2;
        this.defaultValue$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v1.model.CdnVar$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                JsonPrimitive jsonPrimitiveIAuthTabCallback = CdnVar.IAuthTabCallback(this.f$0);
                int i11 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                return jsonPrimitiveIAuthTabCallback;
            }
        });
        int i8 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public CdnVar(@NotNull String str, @NotNull JsonPrimitive jsonPrimitive, @Nullable VersionConstraints versionConstraints, @Nullable VersionConstraints versionConstraints2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        this.key = str;
        this.value = jsonPrimitive;
        this.minVerConstraints = versionConstraints;
        this.maxVerConstraints = versionConstraints2;
        this.defaultValue$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v1.model.CdnVar$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                JsonPrimitive jsonPrimitiveOnExtraCallback = CdnVar.onExtraCallback(this.f$0);
                int i4 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return jsonPrimitiveOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(CdnVar cdnVar, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, cdnVar.key);
        vylVar.onNavigationEvent(serialDescriptor, 1, decryptType4.onExtraCallback, cdnVar.value);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (cdnVar.minVerConstraints != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, CdnVar$VersionConstraints$$serializer.INSTANCE, cdnVar.minVerConstraints);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 3)) || cdnVar.maxVerConstraints != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, CdnVar$VersionConstraints$$serializer.INSTANCE, cdnVar.maxVerConstraints);
        }
        int i6 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return str;
    }

    @liq
    public static final class VersionConstraints {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static char onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static char[] onWarmupCompleted;
        private final String androidVersion;
        private final JsonPrimitive defaultValue;

        static {
            IAuthTabCallback();
            Companion = new Companion(null);
            int i = onExtraCallbackWithResult + 93;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 6 / 0;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public VersionConstraints() {
            JsonPrimitive jsonPrimitive = null;
            this(jsonPrimitive, (String) jsonPrimitive, 3, (DefaultConstructorMarker) jsonPrimitive);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VersionConstraints)) {
                int i2 = IAuthTabCallback + 125;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            VersionConstraints versionConstraints = (VersionConstraints) obj;
            if (Intrinsics.areEqual(this.defaultValue, versionConstraints.defaultValue)) {
                return Intrinsics.areEqual(this.androidVersion, versionConstraints.androidVersion);
            }
            int i4 = IAuthTabCallbackDefault + 99;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 55;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            JsonPrimitive jsonPrimitive;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 115;
            IAuthTabCallback = i2 % 128;
            int iHashCode = 0;
            int iHashCode2 = (i2 % 2 == 0 ? (jsonPrimitive = this.defaultValue) != null : (jsonPrimitive = this.defaultValue) != null) ? jsonPrimitive.hashCode() : 0;
            String str = this.androidVersion;
            if (str != null) {
                int i3 = IAuthTabCallback + 97;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = str.hashCode();
                int i5 = IAuthTabCallbackDefault + 113;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            JsonPrimitive jsonPrimitive = this.defaultValue;
            String str = this.androidVersion;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{16, '\b', 17, 18, 6, 22, 20, 24, 22, 20, 19, '\f', 17, 21, '\t', 22, '\f', 19, 21, '\n', 11, 6, 24, 7, 24, 19, 17, 23, 24, 14, 7, '\t'}, (byte) (65 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 32 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(jsonPrimitive);
            Object[] objArr2 = new Object[1];
            a(new char[]{17, 7, 23, 20, 16, 21, 22, 6, '\r', 16, 11, 21, 22, '\f', 22, 20, 13818}, (byte) (83 - View.MeasureSpec.getSize(0)), 17 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str);
            Object[] objArr3 = new Object[1];
            a(new char[]{13826}, (byte) (Color.alpha(0) + 79), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
            sb.append(((String) objArr3[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallbackDefault + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<VersionConstraints> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 3;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                CdnVar$VersionConstraints$$serializer cdnVar$VersionConstraints$$serializer = CdnVar$VersionConstraints$$serializer.INSTANCE;
                int i4 = onExtraCallback + 101;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return cdnVar$VersionConstraints$$serializer;
            }
        }

        public /* synthetic */ VersionConstraints(int i, JsonPrimitive jsonPrimitive, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.defaultValue = null;
                int i2 = IAuthTabCallbackDefault + 1;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.defaultValue = jsonPrimitive;
            }
            if ((i & 2) != 0) {
                this.androidVersion = str;
                return;
            }
            int i4 = IAuthTabCallbackDefault + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            this.androidVersion = null;
        }

        public VersionConstraints(@Nullable JsonPrimitive jsonPrimitive, @Nullable String str) {
            this.defaultValue = jsonPrimitive;
            this.androidVersion = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(VersionConstraints versionConstraints, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, decryptType4.onExtraCallback, versionConstraints.defaultValue);
                int i3 = IAuthTabCallbackDefault + 85;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            } else if (versionConstraints.defaultValue != null) {
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || versionConstraints.androidVersion != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, versionConstraints.androidVersion);
            }
            int i5 = IAuthTabCallback + 27;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ VersionConstraints(JsonPrimitive jsonPrimitive, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback;
                int i3 = i2 + 109;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 31 / 0;
                }
                int i5 = i2 + 71;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                jsonPrimitive = null;
            }
            this(jsonPrimitive, (i & 2) != 0 ? null : str);
        }

        public final JsonPrimitive onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 53;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            JsonPrimitive jsonPrimitive = this.defaultValue;
            int i4 = i3 + 35;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return jsonPrimitive;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.androidVersion;
            int i5 = i3 + 101;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int length;
            char[] cArr2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = onWarmupCompleted;
            long j = 0;
            Object obj2 = null;
            if (cArr3 != null) {
                int i4 = $11 + 27;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.red(0) + 26, 23140 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - View.combineMeasuredStates(0, 0), (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i6 = $11 + 87;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    i2 = i + UCPApiConstants.ARAM_TIME_OUT;
                    cArr4[i2] = (char) (cArr[i2] << b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i7 = $11 + 51;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (Process.myTid() >> 22)), (ViewConfiguration.getLongPressTimeout() >> 16) + 74, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 30 - TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19487, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i9];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                            } else {
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i14 = 0;
            while (i14 < i) {
                int i15 = $11 + 59;
                int i16 = i15 % 128;
                $10 = i16;
                int i17 = i15 % 2;
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
                i14++;
                int i18 = i16 + 99;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 4 / 2;
                }
            }
            objArr[0] = new String(cArr4);
        }

        static void IAuthTabCallback() {
            onWarmupCompleted = new char[]{64922, 64981, 64915, 64914, 64925, 64924, 64982, 64986, 64910, 64966, 64913, 64983, 64927, 64912, 64967, 64926, 64961, 64960, 64997, 64991, 64923, 64988, 64978, 65008, 64989};
            onExtraCallback = (char) 51244;
        }
    }

    private static final JsonPrimitive onNavigationEvent(CdnVar cdnVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JsonPrimitive jsonPrimitiveOnNavigationEvent = cdnVar.onNavigationEvent(zzaj.onNavigationEvent().getSmallIconBitmap());
        int i4 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jsonPrimitiveOnNavigationEvent;
    }

    private static final JsonPrimitive onWarmupCompleted(CdnVar cdnVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JsonPrimitive jsonPrimitiveOnNavigationEvent = cdnVar.onNavigationEvent(zzaj.onNavigationEvent().getSmallIconBitmap());
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonPrimitiveOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JsonPrimitive onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.defaultValue$delegate.getValue();
        int i3 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return jsonPrimitive;
    }

    private final JsonPrimitive onNavigationEvent(String str) {
        String strOnNavigationEvent;
        String strOnNavigationEvent2;
        int i = 2 % 2;
        VersionConstraints versionConstraints = this.minVerConstraints;
        Object obj = null;
        if (versionConstraints != null) {
            strOnNavigationEvent = versionConstraints.onNavigationEvent();
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        } else {
            strOnNavigationEvent = null;
        }
        if (strOnNavigationEvent != null && onExtraCallback(str, this.minVerConstraints.onNavigationEvent()) < 0) {
            int i4 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return this.minVerConstraints.onWarmupCompleted();
            }
            int i5 = 22 / 0;
            return this.minVerConstraints.onWarmupCompleted();
        }
        VersionConstraints versionConstraints2 = this.maxVerConstraints;
        if (versionConstraints2 != null) {
            int i6 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                versionConstraints2.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            strOnNavigationEvent2 = versionConstraints2.onNavigationEvent();
        } else {
            strOnNavigationEvent2 = null;
        }
        if (strOnNavigationEvent2 == null || onExtraCallback(str, this.maxVerConstraints.onNavigationEvent()) <= 0) {
            JsonPrimitive jsonPrimitive = this.value;
            int i7 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return jsonPrimitive;
        }
        int i9 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 == 0) {
            return this.maxVerConstraints.onWarmupCompleted();
        }
        this.maxVerConstraints.onWarmupCompleted();
        obj.hashCode();
        throw null;
    }

    private final int onExtraCallback(String str, String str2) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{6842, 6804, 13338, 47221, 22903}, View.resolveSizeAndState(0, 0, 0) + 1, objArr);
        List listSplit$default = StringsKt.split$default(str, new String[]{((String) objArr[0]).intern()}, false, 0, 6, (Object) null);
        Object[] objArr2 = new Object[1];
        a(new char[]{6842, 6804, 13338, 47221, 22903}, KeyEvent.getDeadChar(0, 0) + 1, objArr2);
        List listSplit$default2 = StringsKt.split$default(str2, new String[]{((String) objArr2[0]).intern()}, false, 0, 6, (Object) null);
        int iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
        int i5 = 0;
        while (i5 < iMax) {
            int i6 = i5 < listSplit$default.size() ? Integer.parseInt((String) listSplit$default.get(i5)) : 0;
            if (i5 < listSplit$default2.size()) {
                i = Integer.parseInt((String) listSplit$default2.get(i5));
            } else {
                int i7 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                i = 0;
            }
            if (i6 < i) {
                return -1;
            }
            if (i6 > i) {
                return 1;
            }
            i5++;
            int i9 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        return 0;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 65;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 % 3;
        }
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 61;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (KeyEvent.getMaxKeyCode() >> 16)), 84 - (ViewConfiguration.getTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14184), TextUtils.getCapsMode("", 0, 0) + 19, Color.rgb(0, 0, 0) + 16786024, 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    static void IAuthTabCallback() {
        onNavigationEvent = -4301787628347366147L;
    }
}
