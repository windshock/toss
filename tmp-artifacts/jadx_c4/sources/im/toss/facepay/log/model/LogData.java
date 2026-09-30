package im.toss.facepay.log.model;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.log.model.LogData;
import im.toss.facepay.log.model.LogData$;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access15300;
import o.encryptType4;
import o.htf31;
import o.liq;
import o.nc;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LogData {
    private static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion;
    private static boolean IAuthTabCallback;
    private static char asBinder;
    private static int asInterface;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onTransact;
    private static char[] onWarmupCompleted;
    private final JsonObject extParam1;
    private final JsonObject extParam2;
    private final JsonObject extParam3;
    private final String resultCode;
    private final String resultMessage;
    private final LogStatus status;
    private final SuccessYn successYn;
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3 = i + 109;
        byte[] bArr = $$a;
        int i4 = b * 3;
        int i5 = 4 - (s * 3);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            int i10 = i5 + i8;
            i2 = i9;
            i5 = i7 + 1;
            i3 = i10;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i5];
            int i11 = i5;
            i5 = i3;
            i7 = i11;
            int i102 = i5 + i8;
            i2 = i9;
            i5 = i7 + 1;
            i3 = i102;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 103;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogData)) {
            return false;
        }
        LogData logData = (LogData) obj;
        if (this.status != logData.status) {
            int i5 = i2 + 121;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 + 77;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.successYn != logData.successYn) {
            int i9 = i2 + 29;
            IAuthTabCallbackStub = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.resultCode, logData.resultCode)) {
            int i10 = IAuthTabCallbackStub + 35;
            IAuthTabCallback_Parcel = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.resultMessage, logData.resultMessage)) {
            int i12 = IAuthTabCallbackStub + 29;
            IAuthTabCallback_Parcel = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 81 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.extParam1, logData.extParam1) || !Intrinsics.areEqual(this.extParam2, logData.extParam2)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.extParam3, logData.extParam3))) {
            return true;
        }
        int i14 = IAuthTabCallbackStub + 123;
        IAuthTabCallback_Parcel = i14 % 128;
        return i14 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.status.hashCode();
        SuccessYn successYn = this.successYn;
        if (successYn == null) {
            int i4 = IAuthTabCallback_Parcel + 15;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = successYn.hashCode();
        }
        int iHashCode4 = this.resultCode.hashCode();
        int iHashCode5 = this.resultMessage.hashCode();
        int iHashCode6 = this.extParam1.hashCode();
        JsonObject jsonObject = this.extParam2;
        if (jsonObject == null) {
            int i6 = IAuthTabCallbackStub + 61;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = jsonObject.hashCode();
        }
        JsonObject jsonObject2 = this.extParam3;
        int iHashCode7 = (((((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + (jsonObject2 != null ? jsonObject2.hashCode() : 0);
        int i8 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return iHashCode7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        LogStatus logStatus = this.status;
        SuccessYn successYn = this.successYn;
        String str = this.resultCode;
        String str2 = this.resultMessage;
        JsonObject jsonObject = this.extParam1;
        JsonObject jsonObject2 = this.extParam2;
        JsonObject jsonObject3 = this.extParam3;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-118, -120, -119, -122, -123, -122, -120, -121, -123, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(logStatus);
        Object[] objArr2 = new Object[1];
        b(Process.myPid() >> 22, (char) View.MeasureSpec.getSize(0), new char[]{43553, 5325, 57271, 58104, 52707, 5359, 30178, 19948, 28983, 25037, 9202, 58488}, new char[]{61295, 1150, 18129, 55174}, new char[]{0, 0, 0, 0}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(successYn);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-118, -114, -111, -126, -112, -122, -113, -119, -120, -114, -115, -116, -117}, 127 - View.MeasureSpec.getMode(0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str);
        Object[] objArr4 = new Object[1];
        b(KeyEvent.normalizeMetaState(0), (char) (Color.red(0) + 46808), new char[]{24612, 4456, 31271, 17615, 38950, 26397, 59690, 16226, 46398, 42336, 55624, 36839, 35280, 37339, 18726, 60823}, new char[]{9782, 23640, 55465, 51126}, new char[]{0, 0, 0, 0}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str2);
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-118, -107, -108, -123, -115, -123, -109, -122, -110, -114, -116, -117}, 127 - ((Process.getThreadPriority(0) + 20) >> 6), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(jsonObject);
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-118, -106, -108, -123, -115, -123, -109, -122, -110, -114, -116, -117}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(jsonObject2);
        Object[] objArr7 = new Object[1];
        b(AndroidCharacter.getMirror('0') - '0', (char) (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{10315, 7865, 24108, 63598, 13114, 42711, 50541, 65152, 60192, 63817, 47095, 8185}, new char[]{65278, 31592, 43316, 51285}, new char[]{0, 0, 0, 0}, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(jsonObject3);
        Object[] objArr8 = new Object[1];
        b((ViewConfiguration.getWindowTouchSlop() >> 8) + 1386008192, (char) (63969 - View.resolveSize(0, 0)), new char[]{64954}, new char[]{33017, 40142, 57682, 9977}, new char[]{0, 0, 0, 0}, objArr8);
        sb.append(((String) objArr8[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackStub + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LogData> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LogData$.serializer serializerVar = LogData$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        asInterface = 1;
        IAuthTabCallbackStub();
        Companion = new Companion(null);
        $childSerializers = new KSerializer[]{LogStatus.Companion.serializer(), SuccessYn.Companion.serializer(), null, null, null, null, null};
        int i = IAuthTabCallbackDefault + 109;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LogData(int i, LogStatus logStatus, SuccessYn successYn, String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, okycx okycxVar) {
        if (17 != (i & 17)) {
            htf31.onExtraCallbackWithResult(i, 17, LogData$.serializer.INSTANCE.getDescriptor());
        }
        this.status = logStatus;
        if ((i & 2) == 0) {
            this.successYn = null;
        } else {
            this.successYn = successYn;
        }
        if ((i & 4) == 0) {
            this.resultCode = "";
        } else {
            this.resultCode = str;
        }
        if ((i & 8) == 0) {
            int i2 = IAuthTabCallbackStub + 23;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            this.resultMessage = "";
        } else {
            this.resultMessage = str2;
            int i4 = 2 % 2;
        }
        this.extParam1 = jsonObject;
        if ((i & 32) == 0) {
            this.extParam2 = null;
            int i5 = IAuthTabCallback_Parcel + 67;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 5;
            }
            if ((i & 64) != 0) {
                this.extParam3 = null;
                return;
            }
            this.extParam3 = jsonObject3;
            int i7 = IAuthTabCallback_Parcel + 47;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        this.extParam2 = jsonObject2;
        int i9 = 2 % 2;
        if ((i & 64) != 0) {
        }
    }

    public static final /* synthetic */ KSerializer[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 77;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        int i5 = i2 + 105;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return kSerializerArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(LogData logData, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        py[] pyVarArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, pyVarArr[0], logData.status);
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || logData.successYn != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, pyVarArr[1], logData.successYn);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i2 = IAuthTabCallback_Parcel + 59;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(logData.resultCode, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, logData.resultCode);
                int i4 = IAuthTabCallback_Parcel + 63;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(logData.resultMessage, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, logData.resultMessage);
        }
        encryptType4 encrypttype4 = encryptType4.IAuthTabCallback;
        vylVar.onNavigationEvent(serialDescriptor, 4, encrypttype4, logData.extParam1);
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || logData.extParam2 != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, encrypttype4, logData.extParam2);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i6 = IAuthTabCallbackStub + 123;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                JsonObject jsonObject = logData.extParam3;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (logData.extParam3 == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, encrypttype4, logData.extParam3);
    }

    public LogData(@NotNull LogStatus logStatus, @Nullable SuccessYn successYn, @NotNull String str, @NotNull String str2, @NotNull JsonObject jsonObject, @Nullable JsonObject jsonObject2, @Nullable JsonObject jsonObject3) {
        Intrinsics.checkNotNullParameter(logStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.status = logStatus;
        this.successYn = successYn;
        this.resultCode = str;
        this.resultMessage = str2;
        this.extParam1 = jsonObject;
        this.extParam2 = jsonObject2;
        this.extParam3 = jsonObject3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LogData(LogStatus logStatus, SuccessYn successYn, String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        SuccessYn successYn2;
        String str3;
        JsonObject jsonObject4;
        Object obj = null;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            successYn2 = null;
        } else {
            successYn2 = successYn;
        }
        String str4 = (i & 4) != 0 ? "" : str;
        if ((i & 8) != 0) {
            int i3 = IAuthTabCallbackStub + 15;
            int i4 = i3 % 128;
            IAuthTabCallback_Parcel = i4;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 87;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str3 = "";
        } else {
            str3 = str2;
        }
        if ((i & 32) != 0) {
            int i7 = IAuthTabCallbackStub + 83;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            jsonObject4 = null;
        } else {
            jsonObject4 = jsonObject2;
        }
        this(logStatus, successYn2, str4, str3, jsonObject, jsonObject4, (i & 64) != 0 ? null : jsonObject3);
    }

    public final LogStatus onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 33;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        LogStatus logStatus = this.status;
        int i5 = i2 + 37;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return logStatus;
        }
        throw null;
    }

    public final SuccessYn IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SuccessYn successYn = this.successYn;
        int i5 = i3 + 113;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return successYn;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = this.resultCode;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 15;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resultMessage;
        int i5 = i2 + 15;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JsonObject onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 27;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        JsonObject jsonObject = this.extParam1;
        int i5 = i2 + 109;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return jsonObject;
    }

    public final JsonObject IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        JsonObject jsonObject = this.extParam2;
        int i4 = i3 + 95;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return jsonObject;
    }

    public final JsonObject onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 45;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        JsonObject jsonObject = this.extParam3;
        int i5 = i2 + 5;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return jsonObject;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class SuccessYn {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SuccessYn[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private static long IAuthTabCallback = 0;

        @nc(IAuthTabCallback = "N")
        public static final SuccessYn N;

        @nc(IAuthTabCallback = "Y")
        public static final SuccessYn Y;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final String value;

        public static /* synthetic */ KSerializer $r8$lambda$rm9m8GALHz3KCbVWPgxkHw66IKQ() throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                _init_$_anonymous_();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i3 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ SuccessYn[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            SuccessYn[] successYnArr = {Y, N};
            int i5 = i3 + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return successYnArr;
        }

        public static EnumEntries<SuccessYn> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<SuccessYn> enumEntries = $ENTRIES;
            int i5 = i2 + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) SuccessYn.access$get$cachedSerializer$delegate$cp().getValue();
                int i4 = IAuthTabCallback + 7;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer;
                }
                throw null;
            }

            public final KSerializer<SuccessYn> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<SuccessYn> kSerializerOnNavigationEvent = onNavigationEvent();
                int i4 = onWarmupCompleted + 95;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnNavigationEvent;
            }
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            SuccessYn[] successYnArrValues = values();
            Object[] objArr = new Object[1];
            a(new char[]{19636, 19693, 13311, 13082, 43408}, TextUtils.indexOf("", "", 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{28449, 28527, 29361, 40776, 32643}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            Object[] objArr3 = new Object[1];
            a(new char[]{211, 186, 15258, 51105, 54209, 11075, 9620, 53474, 61924, 10876, 49460, 13974, 57861, 6342, 61564, 1845, 54443, 6046, 59278, 6598, 50655, 1656, 38184, 27310, 46598, 29888, 33859, 31549, 43183, 25577, 35763, 19871, 39388, 21083, 47414, 24316, 35442, 16537, 43132, 44885, 31912, 49068, 24546, 41355, 28112, 44606, 19761}, KeyEvent.getMaxKeyCode() >> 16, objArr3);
            KSerializer kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent(((String) objArr3[0]).intern(), successYnArrValues, new String[]{strIntern, ((String) objArr2[0]).intern()}, new Annotation[][]{null, null}, (Annotation[]) null);
            int i4 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            int i5 = i3 + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return lazy;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private SuccessYn(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.value;
            }
            throw null;
        }

        static {
            onExtraCallback();
            Object[] objArr = new Object[1];
            a(new char[]{19636, 19693, 13311, 13082, 43408}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{19636, 19693, 13311, 13082, 43408}, Process.myPid() >> 22, objArr2);
            Y = new SuccessYn(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(new char[]{28449, 28527, 29361, 40776, 32643}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new char[]{28449, 28527, 29361, 40776, 32643}, View.MeasureSpec.getSize(0), objArr4);
            N = new SuccessYn(strIntern2, 1, ((String) objArr4[0]).intern());
            SuccessYn[] successYnArr$values = $values();
            $VALUES = successYnArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(successYnArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.facepay.log.model.LogData$SuccessYn$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() throws Throwable {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 1;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return LogData.SuccessYn.$r8$lambda$rm9m8GALHz3KCbVWPgxkHw66IKQ();
                    }
                    LogData.SuccessYn.$r8$lambda$rm9m8GALHz3KCbVWPgxkHw66IKQ();
                    throw null;
                }
            });
            int i = onWarmupCompleted + 125;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public static SuccessYn valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SuccessYn successYn = (SuccessYn) Enum.valueOf(SuccessYn.class, str);
            int i4 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return successYn;
        }

        public static SuccessYn[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SuccessYn[] successYnArr = (SuccessYn[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return successYnArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (true) {
                obj = null;
                if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                    break;
                }
                int i3 = $11 + 63;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 45812), 84 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 21233 - View.combineMeasuredStates(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (Process.myPid() >> 22) + 19, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 31;
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                objArr[0] = str;
            } else {
                obj.hashCode();
                throw null;
            }
        }

        static void onExtraCallback() {
            IAuthTabCallback = -4610291508643002534L;
        }
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 103;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 43;
                    int maximumFlingVelocity = 1451 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b = (byte) ($$b & 7);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, iIndexOf, maximumFlingVelocity, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16728093) - Color.rgb(0, 0, 0)), TextUtils.getOffsetBefore("", 0) + 44, (KeyEvent.getMaxKeyCode() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23971), 50 - (ViewConfiguration.getTapTimeout() >> 16), 22939 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 45849), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, TextUtils.getOffsetBefore("", 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onTransact ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int i4 = $11 + 105;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 53;
                $10 = i7 % 128;
                if (i7 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 77 - Color.alpha(0), Gravity.getAbsoluteGravity(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 77, 20952 - KeyEvent.getDeadChar(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i2 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.indexOf((CharSequence) "", '0') + 76, ExpandableListView.getPackedPositionChild(0L) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 63 - KeyEvent.normalizeMetaState(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i8 = $10 + 31;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $11 + 47;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 29;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 62, 12214 - ExpandableListView.getPackedPositionType(0L), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallbackStub() {
        onWarmupCompleted = new char[]{32404, 32425, 32433, 32412, 32447, 32428, 32624, 32429, 32419, 32411, 32628, 32632, 32430, 32435, 32436, 32413, 32444, 32416, 32392, 32427, 32623, 32622};
        onExtraCallback = -1184333992;
        onNavigationEvent = true;
        IAuthTabCallback = true;
        onExtraCallbackWithResult = 7798559133331975163L;
        onTransact = -1776194565;
        asBinder = (char) 61997;
    }
}
