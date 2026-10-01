package o;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 extends RuntimeException implements WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2 {
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallback = 8;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String code;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = onExtraCallback + 93;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27(String str, String str2) {
        super(str2);
        this.code = str;
    }

    public /* bridge */ Map<String, Object> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return mapOnExtraCallbackWithResult;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.code;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStub extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 {
        private static int IAuthTabCallbackStub = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onTransact = 1;
        public static final IAuthTabCallbackStub onWarmupCompleted = new IAuthTabCallbackStub();
        public static final int onExtraCallbackWithResult = 8;

        static {
            int i = onNavigationEvent + 125;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 121;
            int i4 = i3 % 128;
            onTransact = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i5 = i4 + 41;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof IAuthTabCallbackStub)) {
                int i6 = i2 + 91;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = i4 + 101;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 86 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 105;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 47;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 98 / 0;
            }
            return -1033318549;
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 97;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 3;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 8 / 0;
            }
            return "ServerError";
        }

        private IAuthTabCallbackStub() {
            super("INTERNAL_ERROR", "내부 오류가 발생했습니다. 잠시 후 다시 시도해주세요.", null);
        }
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 42554;
        private static int IAuthTabCallbackStub = 1;
        private static char onExtraCallback = 44380;
        private static char onExtraCallbackWithResult = 32091;
        private static char onNavigationEvent = 43151;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 onExtraCallbackWithResult(@NotNull String str) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallbackStub = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                str.hashCode();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1918136183:
                    if (str.equals("TOSS_SERVER_VERIFICATION_FAILED")) {
                        return IAuthTabCallbackDefault.onExtraCallback;
                    }
                    break;
                case -879828873:
                    if (str.equals("NETWORK_ERROR")) {
                        return onNavigationEvent.onNavigationEvent;
                    }
                    break;
                case -757368942:
                    if (str.equals("ITEM_ALREADY_OWNED")) {
                        int i3 = onWarmupCompleted + 121;
                        IAuthTabCallbackStub = i3 % 128;
                        if (i3 % 2 != 0) {
                            return onWarmupCompleted.onExtraCallback;
                        }
                        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onExtraCallback;
                        obj.hashCode();
                        throw null;
                    }
                    break;
                case -485608986:
                    if (str.equals("INTERNAL_ERROR")) {
                        int i4 = IAuthTabCallbackStub + 113;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            return IAuthTabCallbackStub.onWarmupCompleted;
                        }
                        IAuthTabCallbackStub iAuthTabCallbackStub = IAuthTabCallbackStub.onWarmupCompleted;
                        throw null;
                    }
                    break;
                case 254745831:
                    if (!(!str.equals("INVALID_USER_ENVIRONMENT"))) {
                        return IAuthTabCallback_Parcel.onExtraCallbackWithResult;
                    }
                    break;
                case 465291763:
                    if (str.equals("INVALID_PRODUCT_ID")) {
                        return asBinder.onExtraCallback;
                    }
                    break;
                case 1039652493:
                    Object[] objArr = new Object[1];
                    a(new char[]{13051, 49473, 42675, 65269, 7730, 20751, 43211, 32325, 44576, 27691, 50590, 25912, 47691, 65231}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, objArr);
                    if (str.equals(((String) objArr[0]).intern())) {
                        return IAuthTabCallbackStubProxy.onWarmupCompleted;
                    }
                    break;
                case 1615777632:
                    if (str.equals("PRODUCT_NOT_GRANTED_BY_PARTNER")) {
                        return onTransact.onExtraCallback;
                    }
                    break;
                case 1862415390:
                    if (str.equals("PAYMENT_PENDING")) {
                        int i5 = onWarmupCompleted + 3;
                        IAuthTabCallbackStub = i5 % 128;
                        if (i5 % 2 != 0) {
                            return asInterface.onExtraCallbackWithResult;
                        }
                        asInterface asinterface = asInterface.onExtraCallbackWithResult;
                        throw null;
                    }
                    break;
                case 2122293753:
                    if (str.equals("KOREAN_ACCOUNT_ONLY")) {
                        return IAuthTabCallback.onNavigationEvent;
                    }
                    break;
            }
            return IAuthTabCallbackStub.onWarmupCompleted;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i4 = $11 + 67;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $11 + 45;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onNavigationEvent);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int i12 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, i12, longPressTimeout, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 12434 - ExpandableListView.getPackedPositionType(0L), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 16015), 14 - Drawable.resolveOpacity(0, 0), 19901 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }
}
