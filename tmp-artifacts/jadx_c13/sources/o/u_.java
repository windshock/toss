package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class u_ {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u_[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    /* renamed from: 모음일때, reason: contains not printable characters */
    private final String f9;

    /* renamed from: 자음일때, reason: contains not printable characters */
    private final String f10;

    /* renamed from: 을_를, reason: contains not printable characters */
    public static final u_ f7_ = new u_("을_를", 0, "을", "를");

    /* renamed from: 이_가, reason: contains not printable characters */
    public static final u_ f8_ = new u_("이_가", 1, "이", "가");

    /* renamed from: 은_는, reason: contains not printable characters */
    public static final u_ f6_ = new u_("은_는", 2, "은", "는");

    /* renamed from: 으로_로, reason: contains not printable characters */
    public static final u_ f5_ = new u_("으로_로", 3, "으로", "로");

    private static final /* synthetic */ u_[] $values() {
        u_[] u_VarArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            u_ u_Var = f7_;
            u_ u_Var2 = f8_;
            u_ u_Var3 = f6_;
            u_ u_Var4 = f5_;
            u_VarArr = new u_[3];
            u_VarArr[1] = u_Var;
            u_VarArr[1] = u_Var2;
            u_VarArr[4] = u_Var3;
            u_VarArr[5] = u_Var4;
        } else {
            u_VarArr = new u_[]{f7_, f8_, f6_, f5_};
        }
        int i4 = i3 + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return u_VarArr;
    }

    public static EnumEntries<u_> getEntries() {
        EnumEntries<u_> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 89 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return enumEntries;
    }

    public static u_ valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        u_ u_Var = (u_) Enum.valueOf(u_.class, str);
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return u_Var;
    }

    public static u_[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        u_[] u_VarArr = (u_[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return u_VarArr;
        }
        throw null;
    }

    private u_(String str, int i, String str2, String str3) {
        this.f10 = str2;
        this.f9 = str3;
    }

    /* renamed from: get모음일때, reason: contains not printable characters */
    public final String m159get() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f9;
        int i5 = i2 + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: get자음일때, reason: contains not printable characters */
    public final String m160get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.f10;
        int i5 = i3 + 119;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        u_[] u_VarArr$values = $values();
        $VALUES = u_VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(u_VarArr$values);
        int i = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r6 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        return r5.f9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[PHI: r3
      0x0032: PHI (r3v2 o.FaceDetectCallBack) = (r3v1 o.FaceDetectCallBack), (r3v3 o.FaceDetectCallBack) binds: [B:10:0x0030, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[PHI: r1
      0x004e: PHI (r1v9 char) = (r1v5 char), (r1v14 char) binds: [B:10:0x0030, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String invoke(@NotNull String str) {
        char cCharValue;
        FaceDetectCallBack faceDetectCallBack;
        boolean zIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Character chLastOrNull = StringsKt___StringsKt.lastOrNull(str);
        if (chLastOrNull == null) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            cCharValue = chLastOrNull.charValue();
            faceDetectCallBack = FaceDetectCallBack.onExtraCallbackWithResult;
            if (faceDetectCallBack.IAuthTabCallback(cCharValue)) {
                int i3 = IAuthTabCallback + 75;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                zIAuthTabCallback = faceDetectCallBack.IAuthTabCallback(str, this == f5_);
            } else {
                if (!Character.isDigit(cCharValue)) {
                    if (Character.isLetter(cCharValue)) {
                        int i4 = IAuthTabCallback + 103;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        char lowerCase = Character.toLowerCase(cCharValue);
                        if (this == f5_) {
                            int i6 = onExtraCallback + 51;
                            IAuthTabCallback = i6 % 128;
                            if (i6 % 2 == 0) {
                            }
                        }
                        zIAuthTabCallback = AFh1xSDK.onNavigationEvent().contains(Character.valueOf(lowerCase));
                    }
                    return this.f10;
                }
                zIAuthTabCallback = AFh1xSDK.onWarmupCompleted().contains(chLastOrNull);
            }
        } else {
            cCharValue = chLastOrNull.charValue();
            faceDetectCallBack = FaceDetectCallBack.onExtraCallbackWithResult;
            if (faceDetectCallBack.IAuthTabCallback(cCharValue)) {
            }
        }
    }
}
