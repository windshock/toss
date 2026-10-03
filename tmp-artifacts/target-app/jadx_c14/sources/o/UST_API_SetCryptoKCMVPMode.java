package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class UST_API_SetCryptoKCMVPMode {
    public /* synthetic */ UST_API_SetCryptoKCMVPMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UST_API_SetCryptoKCMVPMode() {
    }

    public static final class IAuthTabCallback extends UST_API_SetCryptoKCMVPMode {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 1;
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final String onNavigationEvent;
        private static char[] onWarmupCompleted = {32568, 32606, 32552, 32558, 32600, 32739, 32559, 32554, 32607, 32534, 32743, 32747, 32601, 32527, 32546, 32556, 32549, 32573, 32551, 32738};
        private static int onExtraCallbackWithResult = -1184333877;
        private static boolean IAuthTabCallbackDefault = true;
        private static boolean asBinder = true;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 91;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i5 = i2 + 99;
                IAuthTabCallbackStub = i5 % 128;
                return i5 % 2 != 0;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            Object obj2 = null;
            if (!Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent)) {
                int i6 = onTransact + 7;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallback.onExtraCallback)) {
                int i7 = onTransact + 103;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback)) {
                return true;
            }
            int i9 = onTransact;
            int i10 = i9 + 101;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 95;
            IAuthTabCallbackStub = i12 % 128;
            if (i12 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            String str;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 107;
            onTransact = i2 % 128;
            int i3 = 0;
            if (i2 % 2 == 0) {
                iHashCode = this.onNavigationEvent.hashCode();
                str = this.onExtraCallback;
                iHashCode2 = 1;
                if (str != null) {
                    i3 = 1;
                    int iHashCode3 = str.hashCode();
                    int i4 = onTransact + 117;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode2 = i3;
                    i3 = iHashCode3;
                }
            } else {
                iHashCode = this.onNavigationEvent.hashCode();
                str = this.onExtraCallback;
                if (str == null) {
                    iHashCode2 = 0;
                } else {
                    int iHashCode32 = str.hashCode();
                    int i42 = onTransact + 117;
                    IAuthTabCallbackStub = i42 % 128;
                    int i52 = i42 % 2;
                    iHashCode2 = i3;
                    i3 = iHashCode32;
                }
            }
            String str2 = this.IAuthTabCallback;
            if (str2 != null) {
                iHashCode2 = str2.hashCode();
            }
            return (((iHashCode * 31) + i3) * 31) + iHashCode2;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.onNavigationEvent;
            String str2 = this.onExtraCallback;
            String str3 = this.IAuthTabCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-118, -120, -119, -120, -121, -122, -123, -123, -124, -125, -125, -126, -127}, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-118, -120, -119, -120, -114, -115, -124, -123, -126, -116, -117}, 127 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str2);
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-118, -124, -126, -109, -120, -110, -111, -112, -113, -123, -116, -117}, 127 - TextUtils.getTrimmedLength(""), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(str3);
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-108}, 127 - ExpandableListView.getPackedPositionType(0L), objArr4);
            sb.append(((String) objArr4[0]).intern());
            String string = sb.toString();
            int i2 = onTransact + 33;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
            this.onExtraCallback = str2;
            this.IAuthTabCallback = str3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onTransact + 81;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i3 = IAuthTabCallbackStub + 33;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                str3 = null;
            }
            this(str, str2, str3);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 115;
            IAuthTabCallbackStub = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i2 + 79;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 71;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 53;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 61;
            int i3 = i2 % 128;
            onTransact = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallback;
            int i4 = i3 + 103;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int length;
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onWarmupCompleted;
            if (cArr3 != null) {
                int i3 = $11 + 55;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 77 - Color.blue(0), 20952 - View.MeasureSpec.makeMeasureSpec(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            try {
                Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 75 - View.resolveSize(0, 0), 16037 - TextUtils.getCapsMode("", 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i5 = 1052772399;
                if (asBinder) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 63, 12214 - TextUtils.getCapsMode("", 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i5 = 1052772399;
                    }
                    String str = new String(cArr4);
                    int i6 = $11 + 83;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    objArr[0] = str;
                    return;
                }
                if (!IAuthTabCallbackDefault) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    int i8 = $11 + 67;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i10 = $10 + 95;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i12 = $11 + 73;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] * iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 63, 12214 - (Process.myPid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } else {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 63 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 12214 - (ViewConfiguration.getPressedStateDuration() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    }
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    public static abstract class onExtraCallback extends UST_API_SetCryptoKCMVPMode {
        private final String onExtraCallbackWithResult;
        private final UST_CERT_GetAuthorityInformationAccess onWarmupCompleted;

        public /* synthetic */ onExtraCallback(UST_CERT_GetAuthorityInformationAccess uST_CERT_GetAuthorityInformationAccess, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(uST_CERT_GetAuthorityInformationAccess, str);
        }

        public String onExtraCallback() {
            return null;
        }

        private onExtraCallback(UST_CERT_GetAuthorityInformationAccess uST_CERT_GetAuthorityInformationAccess, String str) {
            super(null);
            this.onWarmupCompleted = uST_CERT_GetAuthorityInformationAccess;
            this.onExtraCallbackWithResult = str;
        }

        public /* synthetic */ onExtraCallback(UST_CERT_GetAuthorityInformationAccess uST_CERT_GetAuthorityInformationAccess, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uST_CERT_GetAuthorityInformationAccess, (i & 2) != 0 ? null : str, null);
        }

        public final UST_CERT_GetAuthorityInformationAccess IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public static final class IAuthTabCallback extends onExtraCallback {
            private final String IAuthTabCallback;

            public /* synthetic */ IAuthTabCallback(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            @Override // o.UST_API_SetCryptoKCMVPMode.onExtraCallback
            public String onExtraCallback() {
                return this.IAuthTabCallback;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IAuthTabCallback(@NotNull String str, @Nullable String str2) {
                super(UST_CERT_GetAuthorityInformationAccess.INVALID_REGISTER_DATA, str2, null);
                Intrinsics.checkNotNullParameter(str, "");
                this.IAuthTabCallback = str;
            }
        }

        public static final class onNavigationEvent extends onExtraCallback {
            private final String onExtraCallback;

            public /* synthetic */ onNavigationEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            @Override // o.UST_API_SetCryptoKCMVPMode.onExtraCallback
            public String onExtraCallback() {
                return this.onExtraCallback;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(@NotNull String str, @Nullable String str2) {
                super(UST_CERT_GetAuthorityInformationAccess.FAILED_TO_INITIALIZE, str2, null);
                Intrinsics.checkNotNullParameter(str, "");
                this.onExtraCallback = str;
            }
        }

        /* renamed from: o.UST_API_SetCryptoKCMVPMode$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0004onExtraCallback extends onExtraCallback {
            private final String onExtraCallbackWithResult;

            public /* synthetic */ C0004onExtraCallback(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            @Override // o.UST_API_SetCryptoKCMVPMode.onExtraCallback
            public String onExtraCallback() {
                return this.onExtraCallbackWithResult;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0004onExtraCallback(@NotNull String str, @Nullable String str2) {
                super(UST_CERT_GetAuthorityInformationAccess.FAILED_TO_GENERATE, str2, null);
                Intrinsics.checkNotNullParameter(str, "");
                this.onExtraCallbackWithResult = str;
            }
        }

        public static final class onWarmupCompleted extends onExtraCallback {
            private static int $10 = 0;
            private static int $11 = 1;
            public static final onWarmupCompleted IAuthTabCallback;
            private static int IAuthTabCallbackDefault = 1;
            private static int asInterface = 0;
            private static int onExtraCallback = 0;
            private static char[] onExtraCallbackWithResult = null;
            private static int onNavigationEvent = 1;
            private static char onWarmupCompleted;

            static {
                onNavigationEvent();
                IAuthTabCallback = new onWarmupCompleted();
                int i = onExtraCallback + 43;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallbackDefault + 119;
                    asInterface = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    int i4 = asInterface + 53;
                    IAuthTabCallbackDefault = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = asInterface + 81;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 93;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 123;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return -1542717094;
                }
                throw null;
            }

            public String toString() throws Throwable {
                int i = 2 % 2;
                int i2 = asInterface + 9;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[1];
                a(new char[]{11, '\t', 0, 14, 0, 1, 0, 5, '\r', '\b', '\r', 15, 13875, 13875, '\t', '\f'}, (byte) (74 - TextUtils.indexOf((CharSequence) "", '0')), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                String strIntern = ((String) objArr[0]).intern();
                int i4 = asInterface + 49;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return strIntern;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private onWarmupCompleted() {
                String str = null;
                super(UST_CERT_GetAuthorityInformationAccess.NO_SAVED_DATA, str, 2, str);
            }

            private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
                char[] cArr2 = onExtraCallbackWithResult;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 26 - Color.green(0), View.resolveSizeAndState(0, 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i5 = $10 + 81;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 26, 23139 - KeyEvent.normalizeMetaState(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
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
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 24825), ImageFormat.getBitsPerPixel(0) + 75, 8088 - (ViewConfiguration.getLongPressTimeout() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), Process.getGidForName("") + 31, View.resolveSizeAndState(0, 0, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        int i8 = $11 + 9;
                                        $10 = i8 % 128;
                                        int i9 = i8 % 2;
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                    } else {
                                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                        int i14 = $11 + 89;
                                        $10 = i14 % 128;
                                        int i15 = i14 % 2;
                                    }
                                }
                            }
                            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                            obj2 = obj;
                        }
                    }
                    for (int i16 = 0; i16 < i; i16++) {
                        cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                    }
                    objArr[0] = new String(cArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            static void onNavigationEvent() {
                onExtraCallbackWithResult = new char[]{64982, 64983, 64992, 64965, 65015, 65069, 65064, 65066, 64988, 64967, 65021, 65067, 64978, 64961, 65014, 65065};
                onWarmupCompleted = (char) 51245;
            }
        }

        public static final class onExtraCallbackWithResult extends onExtraCallback {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int asInterface = 1;
            private static int onExtraCallback = 0;
            public static final onExtraCallbackWithResult onExtraCallbackWithResult;
            private static int onNavigationEvent = 1;
            private static char[] onWarmupCompleted;

            static {
                onWarmupCompleted();
                onExtraCallbackWithResult = new onExtraCallbackWithResult();
                int i = onNavigationEvent + 53;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    int i2 = asInterface + 71;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = asInterface + 27;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 57;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return 1507712270;
                }
                throw null;
            }

            public String toString() throws Throwable {
                Object obj;
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 21, 55, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0}, objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new int[]{0, 21, 55, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0}, objArr2);
                    obj = objArr2[0];
                }
                String strIntern = ((String) obj).intern();
                int i3 = onExtraCallback + 3;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return strIntern;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private onExtraCallbackWithResult() {
                String str = null;
                super(UST_CERT_GetAuthorityInformationAccess.CARD_ID_MISMATCHED, str, 2, str);
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i;
                int i2 = 2;
                int i3 = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr = onWarmupCompleted;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 123;
                        $10 = i9 % 128;
                        if (i9 % i2 != 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - KeyEvent.normalizeMetaState(0)), 34 - MotionEvent.axisFromString(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                                }
                                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35, 14239 - TextUtils.indexOf("", "", 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i8++;
                        }
                        i2 = 2;
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i5];
                System.arraycopy(cArr, i4, cArr3, 0, i5);
                if (bArr != null) {
                    char[] cArr4 = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    char c = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        int i10 = $11 + 69;
                        $10 = i10 % 128;
                        if (i10 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                            int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 17658 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } else {
                            int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 10935), 65 - View.resolveSize(0, 0), View.resolveSize(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        }
                        c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 49467), 70 - TextUtils.getTrimmedLength(""), 12485 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    char[] cArr5 = new char[i5];
                    System.arraycopy(cArr3, 0, cArr5, 0, i5);
                    int i13 = i5 - i7;
                    System.arraycopy(cArr5, 0, cArr3, i13, i7);
                    System.arraycopy(cArr5, i7, cArr3, 0, i13);
                }
                if (z) {
                    char[] cArr6 = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        int i14 = $10 + 125;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[i15] = cArr3[0];
                            i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 1;
                        } else {
                            cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                            i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                        }
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                    }
                    cArr3 = cArr6;
                }
                if (i6 > 0) {
                    int i17 = $10 + 117;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            static void onWarmupCompleted() {
                onWarmupCompleted = new char[]{27162, 27369, 27369, 27367, 27356, 27333, 27349, 27347, 27346, 27372, 27375, 27344, 27369, 27371, 27356, 27329, 27331, 27331, 27372, 27374, 27335};
            }
        }
    }
}
