package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFaceFeatureValue implements ALCFaceLivenessMode {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final Map<Character, ALCFaceAuthInfo> IAuthTabCallback;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static final Map<Character, ALCFaceAuthInfo> asBinder;
    private static final ALCFaceAuthInfo[] asInterface;
    private static int getInterfaceDescriptor = 1;
    private static final ALCFaceAuthInfo[] onExtraCallback;
    private static final Map<Character, ALCFaceAuthInfo> onExtraCallbackWithResult;
    private static final ALCFaceAuthInfo[] onNavigationEvent;
    private static final Set<ALCFaceAuthInfo> onWarmupCompleted;
    private final ALCFaceAuthInfo IAuthTabCallbackDefault;
    private final ALCFaceAuthInfo IAuthTabCallbackStub;
    private final ALCFaceAuthInfo onTransact;

    public static /* synthetic */ getFaceFeatureValue onWarmupCompleted(getFaceFeatureValue getfacefeaturevalue, ALCFaceAuthInfo aLCFaceAuthInfo, ALCFaceAuthInfo aLCFaceAuthInfo2, ALCFaceAuthInfo aLCFaceAuthInfo3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallbackStubProxy + 9;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                ALCFaceAuthInfo aLCFaceAuthInfo4 = getfacefeaturevalue.IAuthTabCallbackDefault;
                throw null;
            }
            aLCFaceAuthInfo = getfacefeaturevalue.IAuthTabCallbackDefault;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback_Parcel + 95;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                ALCFaceAuthInfo aLCFaceAuthInfo5 = getfacefeaturevalue.onTransact;
                throw null;
            }
            aLCFaceAuthInfo2 = getfacefeaturevalue.onTransact;
        }
        if ((i & 4) != 0) {
            aLCFaceAuthInfo3 = getfacefeaturevalue.IAuthTabCallbackStub;
        }
        return getfacefeaturevalue.onExtraCallbackWithResult(aLCFaceAuthInfo, aLCFaceAuthInfo2, aLCFaceAuthInfo3);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFaceFeatureValue)) {
            int i2 = IAuthTabCallback_Parcel + 119;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getFaceFeatureValue getfacefeaturevalue = (getFaceFeatureValue) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, getfacefeaturevalue.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.onTransact, getfacefeaturevalue.onTransact)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallbackStub, getfacefeaturevalue.IAuthTabCallbackStub)) {
            return true;
        }
        int i4 = IAuthTabCallback_Parcel + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.IAuthTabCallbackDefault.hashCode() * 31) + this.onTransact.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode();
        int i4 = IAuthTabCallbackStubProxy + 57;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final getFaceFeatureValue onExtraCallbackWithResult(@NotNull ALCFaceAuthInfo aLCFaceAuthInfo, @NotNull ALCFaceAuthInfo aLCFaceAuthInfo2, @NotNull ALCFaceAuthInfo aLCFaceAuthInfo3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceAuthInfo, "");
        Intrinsics.checkNotNullParameter(aLCFaceAuthInfo2, "");
        Intrinsics.checkNotNullParameter(aLCFaceAuthInfo3, "");
        getFaceFeatureValue getfacefeaturevalue = new getFaceFeatureValue(aLCFaceAuthInfo, aLCFaceAuthInfo2, aLCFaceAuthInfo3);
        int i2 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return getfacefeaturevalue;
    }

    public getFaceFeatureValue(@NotNull ALCFaceAuthInfo aLCFaceAuthInfo, @NotNull ALCFaceAuthInfo aLCFaceAuthInfo2, @NotNull ALCFaceAuthInfo aLCFaceAuthInfo3) {
        Intrinsics.checkNotNullParameter(aLCFaceAuthInfo, "");
        Intrinsics.checkNotNullParameter(aLCFaceAuthInfo2, "");
        Intrinsics.checkNotNullParameter(aLCFaceAuthInfo3, "");
        this.IAuthTabCallbackDefault = aLCFaceAuthInfo;
        this.onTransact = aLCFaceAuthInfo2;
        this.IAuthTabCallbackStub = aLCFaceAuthInfo3;
    }

    public static final /* synthetic */ ALCFaceAuthInfo[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface;
        }
        throw null;
    }

    public static final /* synthetic */ ALCFaceAuthInfo[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceAuthInfo[] aLCFaceAuthInfoArr = onExtraCallback;
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return aLCFaceAuthInfoArr;
    }

    public static final /* synthetic */ ALCFaceAuthInfo[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceAuthInfo[] aLCFaceAuthInfoArr = onNavigationEvent;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return aLCFaceAuthInfoArr;
    }

    public static final /* synthetic */ Set onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ALCFaceAuthInfo onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 25;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        ALCFaceAuthInfo aLCFaceAuthInfo = this.IAuthTabCallbackStub;
        int i5 = i2 + 77;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return aLCFaceAuthInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getFaceFeatureValue(char c, char c2, char c3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallbackStubProxy + 85;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            c3 = 0;
        }
        this(c, c2, c3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getFaceFeatureValue(char c, char c2, char c3) {
        ALCFaceAuthInfo aLCFaceAuthInfoOnExtraCallback = IAuthTabCallback.get(Character.valueOf(c));
        if (aLCFaceAuthInfoOnExtraCallback == null) {
            int i = IAuthTabCallbackStubProxy + 95;
            IAuthTabCallback_Parcel = i % 128;
            int i2 = i % 2;
            aLCFaceAuthInfoOnExtraCallback = ALCFaceAuthInfo.Companion.onExtraCallback();
            int i3 = 2 % 2;
        }
        ALCFaceAuthInfo aLCFaceAuthInfoOnExtraCallback2 = asBinder.get(Character.valueOf(c2));
        if (aLCFaceAuthInfoOnExtraCallback2 == null) {
            aLCFaceAuthInfoOnExtraCallback2 = ALCFaceAuthInfo.Companion.onExtraCallback();
            int i4 = IAuthTabCallbackStubProxy + 25;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        ALCFaceAuthInfo aLCFaceAuthInfo = onExtraCallbackWithResult.get(Character.valueOf(c3));
        this(aLCFaceAuthInfoOnExtraCallback, aLCFaceAuthInfoOnExtraCallback2, aLCFaceAuthInfo == null ? ALCFaceAuthInfo.Companion.onExtraCallback() : aLCFaceAuthInfo);
    }

    public char IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIndexOf = ArraysKt.indexOf(onExtraCallback, this.IAuthTabCallbackDefault);
        ALCFaceAuthInfo[] aLCFaceAuthInfoArr = asInterface;
        int length = aLCFaceAuthInfoArr.length;
        ALCFaceAuthInfo[] aLCFaceAuthInfoArr2 = onNavigationEvent;
        char length2 = (char) ((iIndexOf * length * aLCFaceAuthInfoArr2.length) + 44032 + (ArraysKt.indexOf(aLCFaceAuthInfoArr, this.onTransact) * aLCFaceAuthInfoArr2.length) + ArraysKt.indexOf(aLCFaceAuthInfoArr2, this.IAuthTabCallbackStub));
        int i4 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return length2;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(IAuthTabCallbackDefault());
        int i4 = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strValueOf;
    }

    public static /* synthetic */ getFaceFeatureValue onExtraCallbackWithResult(getFaceFeatureValue getfacefeaturevalue, Character ch, Character ch2, Character ch3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 113;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            ch = null;
        }
        if ((i & 2) != 0) {
            ch2 = null;
        }
        if ((i & 4) != 0) {
            ch3 = null;
        }
        getFaceFeatureValue getfacefeaturevalueOnExtraCallbackWithResult = getfacefeaturevalue.onExtraCallbackWithResult(ch, ch2, ch3);
        int i5 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return getfacefeaturevalueOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getFaceFeatureValue onExtraCallbackWithResult(@Nullable Character ch, @Nullable Character ch2, @Nullable Character ch3) {
        ALCFaceAuthInfo aLCFaceAuthInfo;
        ALCFaceAuthInfo aLCFaceAuthInfo2;
        ALCFaceAuthInfo aLCFaceAuthInfo3;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
            if (ch != null) {
                aLCFaceAuthInfo = IAuthTabCallback.get(ch);
                if (aLCFaceAuthInfo == null) {
                    aLCFaceAuthInfo = this.IAuthTabCallbackDefault;
                }
            }
        } else if (ch != null) {
        }
        if (ch2 != null) {
            int i4 = IAuthTabCallbackStubProxy + 31;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            aLCFaceAuthInfo2 = asBinder.get(ch2);
            if (aLCFaceAuthInfo2 == null) {
                aLCFaceAuthInfo2 = this.onTransact;
            }
        }
        if (ch3 == null || (aLCFaceAuthInfo3 = onExtraCallbackWithResult.get(ch3)) == null) {
            aLCFaceAuthInfo3 = this.IAuthTabCallbackStub;
        }
        return onExtraCallbackWithResult(aLCFaceAuthInfo, aLCFaceAuthInfo2, aLCFaceAuthInfo3);
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 99;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (44032 > i || i >= 55216) {
                return false;
            }
            int i6 = i4 + 85;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }

        private onExtraCallbackWithResult() {
        }

        public final getFaceFeatureValue IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 63;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                if (!onNavigationEvent(i)) {
                    throw new IllegalArgumentException("한글이 아닙니다.");
                }
                int i4 = i - 44032;
                int length = i4 / (onExtraCallbackWithResult().length * IAuthTabCallback().length);
                int length2 = (i4 % (onExtraCallbackWithResult().length * IAuthTabCallback().length)) / IAuthTabCallback().length;
                int length3 = onExtraCallbackWithResult().length;
                int length4 = IAuthTabCallback().length;
                getFaceFeatureValue getfacefeaturevalue = new getFaceFeatureValue(onExtraCallback()[length], onExtraCallbackWithResult()[length2], IAuthTabCallback()[(i4 % (length3 * length4)) % IAuthTabCallback().length]);
                int i5 = onWarmupCompleted + 15;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return getfacefeaturevalue;
            }
            onNavigationEvent(i);
            throw null;
        }

        public final ALCFaceAuthInfo[] onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return getFaceFeatureValue.onExtraCallback();
            }
            getFaceFeatureValue.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ALCFaceAuthInfo[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getFaceFeatureValue.IAuthTabCallback();
                throw null;
            }
            ALCFaceAuthInfo[] aLCFaceAuthInfoArrIAuthTabCallback = getFaceFeatureValue.IAuthTabCallback();
            int i3 = onWarmupCompleted + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return aLCFaceAuthInfoArrIAuthTabCallback;
        }

        public final ALCFaceAuthInfo[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return getFaceFeatureValue.onNavigationEvent();
            }
            getFaceFeatureValue.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Set<ALCFaceAuthInfo> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return getFaceFeatureValue.onWarmupCompleted();
            }
            getFaceFeatureValue.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        ALCFaceAuthInfo[] aLCFaceAuthInfoArr = {new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12593), (char) 12593), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12593, (char) 12593}), (char) 12594), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12596), (char) 12596), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12599), (char) 12599), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12599, (char) 12599}), (char) 12600), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12601), (char) 12601), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12609), (char) 12609), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12610), (char) 12610), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12610, (char) 12610}), (char) 12611), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12613), (char) 12613), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12613, (char) 12613}), (char) 12614), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12615), (char) 12615), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12616), (char) 12616), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12616, (char) 12616}), (char) 12617), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12618), (char) 12618), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12619), (char) 12619), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12620), (char) 12620), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12621), (char) 12621), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12622), (char) 12622)};
        onExtraCallback = aLCFaceAuthInfoArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(19), 16));
        int i = access000 + 123;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
        int i3 = 2 % 2;
        int i4 = 0;
        while (i4 < 19) {
            int i5 = access000 + 117;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            ALCFaceAuthInfo aLCFaceAuthInfo = aLCFaceAuthInfoArr[i4];
            linkedHashMap.put(Character.valueOf(aLCFaceAuthInfo.IAuthTabCallback()), aLCFaceAuthInfo);
            i4++;
            int i7 = access000 + 87;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        }
        IAuthTabCallback = linkedHashMap;
        ALCFaceAuthInfo[] aLCFaceAuthInfoArr2 = {new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12623), (char) 12623), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12624), (char) 12624), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12625), (char) 12625), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12626), (char) 12626), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12627), (char) 12627), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12628), (char) 12628), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12629), (char) 12629), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12630), (char) 12630), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12631), (char) 12631), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12631, 12623}), (char) 12632), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12631, 12624}), (char) 12633), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12631, (char) 12643}), (char) 12634), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12635), (char) 12635), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12636), (char) 12636), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12636, 12627}), (char) 12637), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12636, 12628}), (char) 12638), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12636, (char) 12643}), (char) 12639), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12640), (char) 12640), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12641), (char) 12641), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{12641, (char) 12643}), (char) 12642), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12643), (char) 12643)};
        asInterface = aLCFaceAuthInfoArr2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(21), 16));
        for (int i9 = 0; i9 < 21; i9++) {
            ALCFaceAuthInfo aLCFaceAuthInfo2 = aLCFaceAuthInfoArr2[i9];
            linkedHashMap2.put(Character.valueOf(aLCFaceAuthInfo2.IAuthTabCallback()), aLCFaceAuthInfo2);
        }
        asBinder = linkedHashMap2;
        ALCFaceAuthInfo[] aLCFaceAuthInfoArr3 = {ALCFaceAuthInfo.Companion.onExtraCallback(), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12593), (char) 12593), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12593, (char) 12593}), (char) 12594), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12593, (char) 12613}), (char) 12595), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12596), (char) 12596), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12596, (char) 12616}), (char) 12597), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12596, (char) 12622}), (char) 12598), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12599), (char) 12599), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12601), (char) 12601), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12601, (char) 12593}), (char) 12602), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12601, (char) 12609}), (char) 12603), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12601, (char) 12610}), (char) 12604), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12601, (char) 12613}), (char) 12605), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12601, (char) 12620}), (char) 12606), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12601, (char) 12621}), (char) 12607), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12601, (char) 12622}), (char) 12608), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12609), (char) 12609), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12610), (char) 12610), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12610, (char) 12613}), (char) 12612), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12613), (char) 12613), new ALCFaceAuthInfo(CollectionsKt.listOf(new Character[]{(char) 12613, (char) 12613}), (char) 12614), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12615), (char) 12615), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12616), (char) 12616), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12618), (char) 12618), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12619), (char) 12619), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12620), (char) 12620), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12621), (char) 12621), new ALCFaceAuthInfo(CollectionsKt.listOf((char) 12622), (char) 12622)};
        onNavigationEvent = aLCFaceAuthInfoArr3;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(28), 16));
        for (int i10 = 0; i10 < 28; i10++) {
            int i11 = access000 + 117;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            ALCFaceAuthInfo aLCFaceAuthInfo3 = aLCFaceAuthInfoArr3[i10];
            linkedHashMap3.put(Character.valueOf(aLCFaceAuthInfo3.IAuthTabCallback()), aLCFaceAuthInfo3);
        }
        onExtraCallbackWithResult = linkedHashMap3;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(onExtraCallback);
        spreadBuilder.addSpread(onNavigationEvent);
        onWarmupCompleted = clearFaultAdjacentMetadata.onExtraCallback(spreadBuilder.toArray(new ALCFaceAuthInfo[spreadBuilder.size()]));
    }
}
