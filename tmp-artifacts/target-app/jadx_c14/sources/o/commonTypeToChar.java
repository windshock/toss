package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class commonTypeToChar {
    public static final commonTypeToChar onExtraCallbackWithResult = new commonTypeToChar();
    private static final Regex onExtraCallback = new Regex("^((02)([\\d]{3,4})([\\d]{4}))|((0[3-9][\\d])([\\d]{3,4})([\\d]{4}))$");
    private static final Regex onNavigationEvent = new Regex("^(01[\\d])([\\d]{3,4})([\\d]{4})$");
    private static final Regex onWarmupCompleted = new Regex("^((1[3-9][\\d]{2})([\\d]{4}))$");
    public static final int IAuthTabCallback = 8;

    private commonTypeToChar() {
    }

    public final void onWarmupCompleted() {
        addPolicy.ITrustedWebActivityServiceStub().onNavigationEvent("pref.plcc.tutorialShown", true);
    }

    public final boolean onExtraCallbackWithResult() {
        return addPolicy.ITrustedWebActivityServiceStub().onExtraCallback("pref.plcc.tutorialShown", false);
    }

    public static final class onExtraCallbackWithResult implements Parcelable {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final Parcelable.Creator<onExtraCallbackWithResult> CREATOR;
        private static char[] IAuthTabCallbackDefault = null;
        private static int IAuthTabCallbackStub = 0;
        private static char asBinder = 0;
        private static int asInterface = 0;
        private static int getInterfaceDescriptor = 1;
        private static int onTransact = 1;
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public static final class IAuthTabCallback implements Parcelable.Creator<onExtraCallbackWithResult> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final onExtraCallbackWithResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new onExtraCallbackWithResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final onExtraCallbackWithResult[] newArray(int i) {
                return new onExtraCallbackWithResult[i];
            }
        }

        static {
            asInterface();
            CREATOR = new IAuthTabCallback();
            int i = onTransact + 75;
            asInterface = i % 128;
            if (i % 2 != 0) {
                int i2 = 59 / 0;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 51;
            IAuthTabCallbackStub = i2 % 128;
            return 1 ^ (i2 % 2 != 0 ? 0 : 1);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                int i2 = getInterfaceDescriptor + 57;
                IAuthTabCallbackStub = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                int i3 = getInterfaceDescriptor + 31;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) || this.onExtraCallbackWithResult != onextracallbackwithresult.onExtraCallbackWithResult) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                return true;
            }
            int i5 = IAuthTabCallbackStub + 111;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = this.IAuthTabCallback.hashCode();
            String str = this.onWarmupCompleted;
            int iHashCode4 = 0;
            if (str == null) {
                int i2 = IAuthTabCallbackStub + 61;
                getInterfaceDescriptor = i2 % 128;
                iHashCode = i2 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.onExtraCallback;
            if (str2 == null) {
                int i3 = IAuthTabCallbackStub + 69;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
            }
            int iHashCode5 = Boolean.hashCode(this.onExtraCallbackWithResult);
            String str3 = this.onNavigationEvent;
            if (str3 != null) {
                int i5 = IAuthTabCallbackStub + 79;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                iHashCode4 = str3.hashCode();
                int i7 = IAuthTabCallbackStub + 1;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
            }
            return (((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LogParams(step=" + this.IAuthTabCallback + ", button=" + this.onWarmupCompleted + ", group=" + this.onExtraCallback + ", simpleApply=" + this.onExtraCallbackWithResult + ", sessionId=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallbackStub + 113;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor + 57;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.IAuthTabCallback);
            parcel.writeString(this.onWarmupCompleted);
            parcel.writeString(this.onExtraCallback);
            parcel.writeInt(this.onExtraCallbackWithResult ? 1 : 0);
            parcel.writeString(this.onNavigationEvent);
            int i5 = IAuthTabCallbackStub + 63;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallbackWithResult(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = str2;
            this.onExtraCallback = str3;
            this.onExtraCallbackWithResult = z;
            this.onNavigationEvent = str4;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 19;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallback;
            int i4 = i3 + 99;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 85;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 55;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 23;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 30 / 0;
            }
            return str;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 13;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onExtraCallbackWithResult;
            int i5 = i2 + 47;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final Map<String, Object> IAuthTabCallback() throws Throwable {
            Object obj;
            int i = 2 % 2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("service", "tosscreditcard");
            Object[] objArr = new Object[1];
            a(new char[]{'\b', '\f', 1, 11}, (byte) (51 - Drawable.resolveOpacity(0, 0)), TextUtils.lastIndexOf("", '0') + 5, objArr);
            linkedHashMap.put(((String) objArr[0]).intern(), "new");
            linkedHashMap.put("step", this.IAuthTabCallback);
            linkedHashMap.put("simple_apply", Boolean.valueOf(this.onExtraCallbackWithResult));
            String str = this.onWarmupCompleted;
            if (str != null) {
                int i2 = getInterfaceDescriptor + 107;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{'\r', 3, 13874, 13874, '\t', 15}, (byte) (KeyEvent.getDeadChar(1, 1) + 126), 13 / Color.argb(0, 0, 0, 0), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{'\r', 3, 13874, 13874, '\t', 15}, (byte) (68 - KeyEvent.getDeadChar(0, 0)), 6 - Color.argb(0, 0, 0, 0), objArr3);
                    obj = objArr3[0];
                }
                linkedHashMap.put(((String) obj).intern(), str);
            }
            String str2 = this.onExtraCallback;
            if (str2 != null) {
                int i3 = IAuthTabCallbackStub + 47;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                linkedHashMap.put("group", str2);
            }
            String str3 = this.onNavigationEvent;
            if (str3 != null) {
                int i5 = IAuthTabCallbackStub + 41;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr4 = new Object[1];
                a(new char[]{5, 11, 13853, 13853, 15, '\b', 14, 15, 13874}, (byte) (52 - (ViewConfiguration.getEdgeSlop() >> 16)), 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
                linkedHashMap.put(((String) objArr4[0]).intern(), str3);
            }
            return linkedHashMap;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int length;
            char[] cArr2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = IAuthTabCallbackDefault;
            int i4 = -1310771303;
            Object obj2 = null;
            if (cArr3 != null) {
                int i5 = $11 + 87;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 26 - KeyEvent.normalizeMetaState(0), TextUtils.getCapsMode("", 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        i4 = -1310771303;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i7 = $10 + 23;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr3 = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(asBinder)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "") + 26, 23139 - (ViewConfiguration.getTouchSlop() >> 8), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i9 = $11 + 11;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
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
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 24824), TextUtils.indexOf((CharSequence) "", '0', 0) + 75, TextUtils.getTrimmedLength("") + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "") + 30, 19488 - View.resolveSize(0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i12 = $11 + 45;
                                $10 = i12 % 128;
                                int i13 = i12 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                            } else {
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i16];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i17];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i18 = 0;
            while (i18 < i) {
                int i19 = $10 + 15;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr4[i18] = (char) (cArr4[i18] ^ 7283);
                    i18 += 44;
                } else {
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                    i18++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        static void asInterface() {
            IAuthTabCallbackDefault = new char[]{51245, 64966, 64983, 64963, 64967, 51240, 51243, 64960, 64970, 64982, 51242, 64988, 64986, 64989, 65018, 64977};
            asBinder = (char) 51245;
        }
    }
}
