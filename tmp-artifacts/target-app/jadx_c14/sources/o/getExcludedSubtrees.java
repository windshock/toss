package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import im.toss.base.BaseActivity;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.featurescommon.contacts.library.realm.model.ProfileName;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import o.SessionTrackera;
import o.onOutOfMemory;
import o.setIconPaddingBottom;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.FetchContactsHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getExcludedSubtrees extends surfaceDestroyed {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static char[] onNavigationEvent = {64982, 65018, 64967, 64986, 65068, 64990, 64998, 64981, 65071, 64960, 64966, 65067, 64991, 64978, 65065, 65022, 64999, 64977, 64980, 65064, 65066, 64988, 64961, 64963, 65069};
    private static char onExtraCallbackWithResult = 51244;

    static final /* synthetic */ class onExtraCallbackWithResult implements onSessionEnded, FunctionAdapter {
        private final /* synthetic */ Function1 onNavigationEvent;

        onExtraCallbackWithResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof onSessionEnded) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onNavigationEvent;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onActivityResult(Object obj) {
            this.onNavigationEvent.invoke(obj);
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i4)) | i8;
        int i10 = ~i6;
        int i11 = ~(i10 | i5);
        int i12 = i8 | i11 | (~(i10 | i4));
        int i13 = (~((~i4) | i10)) | i8 | i11;
        int i14 = i5 + i6 + i3 + ((-369695973) * i) + (1794320298 * i2);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i5) + 1478230016 + (776760710 * i6) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i3) + (217841664 * i) + ((-410517504) * i2) + ((-175177728) * i15);
        int i17 = ((i5 * 1872133577) - 2052485254) + (i6 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i3 * 1872134975) + (i * (-1328892763)) + (i2 * (-1296121642)) + (i15 * (-1691287552));
        return i16 + ((i17 * i17) * (-1729036288)) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        startRunning startrunning = (startRunning) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{startrunning}, iOnWarmupCompleted, 1155215266, -1155215265);
        int i4 = onExtraCallback + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getExcludedSubtrees getexcludedsubtrees, FragmentActivity fragmentActivity, int i, int i2, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, WebViewContentOwner webViewContentOwner, String str2, setIconImageResource seticonimageresource) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onWarmupCompleted(getexcludedsubtrees, fragmentActivity, i, i2, settopguidebackgroundcolor, str, webViewContentOwner, str2, seticonimageresource);
        }
        onWarmupCompleted(getexcludedsubtrees, fragmentActivity, i, i2, settopguidebackgroundcolor, str, webViewContentOwner, str2, seticonimageresource);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseActivity baseActivity, Function0 function0, Function0 function02, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(baseActivity, function0, function02, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(baseActivity, function0, function02, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = IAuthTabCallback + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(settopguidebackgroundcolor);
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        int i4 = onExtraCallback + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new FetchContactsHandler$.ExternalSyntheticLambda2());
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return filterCreatePageParams.IAuthTabCallback(Uri.parse(str));
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i3 = 86 / 0;
        return filterCreatePageParams.IAuthTabCallback(Uri.parse(str));
    }

    public setIconImageResource onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setIconImageResource seticonimageresourceOnNavigationEvent = TinyBlurMenu3.onNavigationEvent();
        int i4 = onExtraCallback + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return seticonimageresourceOnNavigationEvent;
        }
        throw null;
    }

    public JsonObject onExtraCallbackWithResult(@NotNull setIconPaddingBottom.onExtraCallback onextracallback) throws Throwable {
        long jOnExtraCallbackWithResult;
        boolean zIAuthTabCallbackDefault;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        JsonObject jsonObjectOnExtraCallbackWithResult = super.onExtraCallbackWithResult(onextracallback);
        ProfileName profileNameIAuthTabCallback = dismissBadgeView.IAuthTabCallback.IAuthTabCallback(onextracallback.onExtraCallback());
        if (profileNameIAuthTabCallback != null) {
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                jOnExtraCallbackWithResult = profileNameIAuthTabCallback.onExtraCallbackWithResult();
                int i3 = 18 / 0;
            } else {
                jOnExtraCallbackWithResult = profileNameIAuthTabCallback.onExtraCallbackWithResult();
            }
        } else {
            jOnExtraCallbackWithResult = -1;
        }
        String strOnExtraCallbackWithResult = TitleBarRightButtonView.onExtraCallback.onExtraCallbackWithResult(jOnExtraCallbackWithResult);
        String str = strOnExtraCallbackWithResult != null ? strOnExtraCallbackWithResult : "";
        if (profileNameIAuthTabCallback != null) {
            zIAuthTabCallbackDefault = profileNameIAuthTabCallback.IAuthTabCallbackDefault();
            int i4 = IAuthTabCallback + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = IAuthTabCallback + 117;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            zIAuthTabCallbackDefault = false;
        }
        Object[] objArr = new Object[1];
        c((byte) (93 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ImageFormat.getBitsPerPixel(0) + 16, new char[]{24, 23, 22, 6, 2, '\r', 1, 2, '\b', '\n', 15, 3, 7, 21, 13907}, objArr);
        jsonObjectOnExtraCallbackWithResult.addProperty(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        c((byte) (Drawable.resolveOpacity(0, 0) + 38), 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{4, '\b', 21, 1, 13839, 13839, 20, 5, 7, 15, 2, 20}, objArr2);
        jsonObjectOnExtraCallbackWithResult.addProperty(((String) objArr2[0]).intern(), Boolean.valueOf(zIAuthTabCallbackDefault));
        return jsonObjectOnExtraCallbackWithResult;
    }

    public void onNavigationEvent(@NotNull FragmentActivity fragmentActivity, int i, int i2, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, @NotNull String str, @NotNull WebViewContentOwner webViewContentOwner, @NotNull String str2, @NotNull setIconImageResource seticonimageresource) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(seticonimageresource, "");
        onExtraCallback(webViewContentOwner, new FetchContactsHandler$.ExternalSyntheticLambda3(this, fragmentActivity, i, i2, settopguidebackgroundcolor, str, webViewContentOwner, str2, seticonimageresource), new FetchContactsHandler$.ExternalSyntheticLambda4(settopguidebackgroundcolor), str2);
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    private static final Unit onWarmupCompleted(getExcludedSubtrees getexcludedsubtrees, FragmentActivity fragmentActivity, int i, int i2, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, WebViewContentOwner webViewContentOwner, String str2, setIconImageResource seticonimageresource) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(fragmentActivity, i, i2, settopguidebackgroundcolor, str, webViewContentOwner, str2, seticonimageresource);
        Unit unit = Unit.INSTANCE;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = onExtraCallback + 111;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 29 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        startRunning startrunning = (startRunning) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        Object[] objArr2 = {startrunning, getEmbedViewManager.onNavigationEvent(CollectionsKt.emptyList())};
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr2, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Object[] objArr3 = new Object[1];
        c((byte) (70 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getTouchSlop() >> 8) + 4, new char[]{7, 2, 15, 5}, objArr3);
        Object[] objArr4 = {startrunning, ((String) objArr3[0]).intern()};
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr4, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        settopguidebackgroundcolor.IAuthTabCallback(new FetchContactsHandler$.ExternalSyntheticLambda0());
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onTransact = 1;
        final /* synthetic */ BaseActivity $activity;
        final /* synthetic */ Function0<Unit> $onGranted;
        int label;
        private static char[] onNavigationEvent = {32612, 32614, 32403, 32551, 32395, 32400, 32600, 32405, 32410, 32404, 32394, 32402, 32613, 32409, 32414, 32401, 32393, 32412, 32392, 32415};
        private static int onExtraCallbackWithResult = -1184334073;
        private static boolean IAuthTabCallback = true;
        private static boolean onWarmupCompleted = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(BaseActivity baseActivity, Function0<Unit> function0, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$activity = baseActivity;
            this.$onGranted = function0;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 99;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$activity, this.$onGranted, access13800Var);
            int i2 = onTransact + 75;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onTransact + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 != 0) {
                int i3 = onTransact + 29;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                setCloseButtonOnClickListener setclosebuttononclicklistenerOnExtraCallback = setCloseButtonOnClickListener.Companion.onExtraCallback(this.$activity);
                BaseActivity baseActivity = this.$activity;
                this.label = 1;
                if (setclosebuttononclicklistenerOnExtraCallback.onNavigationEvent(baseActivity, true, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallback;
                    int i6 = i5 + 25;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    int i7 = i5 + 59;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            this.$onGranted.invoke();
            return Unit.INSTANCE;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onNavigationEvent;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $10 + 57;
                    $11 = i5 % 128;
                    int i6 = i5 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 77, 20952 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 74 - ExpandableListView.getPackedPositionChild(0L), (KeyEvent.getMaxKeyCode() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                char c = '0';
                if (onWarmupCompleted) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i7 = $10 + 25;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 62 - TextUtils.indexOf("", c, 0), (-16765002) - Color.rgb(0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        c = '0';
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (IAuthTabCallback) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.getOffsetAfter("", 0) + 63, (ViewConfiguration.getScrollBarSize() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i9 = $10 + 13;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 4 / 5;
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

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ BaseActivity $activity;
        final /* synthetic */ Function1<r8lambda6V0YVgpvgCQzEji1GNetQSIYsE, Unit> $activityResultCallback;
        final /* synthetic */ Function0<Unit> $onGranted;
        final /* synthetic */ String $serviceReferrer;
        final /* synthetic */ getDummyAd $standardTermsV2Intent;
        int label;
        private static final byte[] $$a = {23, -38, -83, 70};
        private static final int $$b = 32;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onExtraCallback = 7798559133331975163L;
        private static int IAuthTabCallback = -1776194565;
        private static char onWarmupCompleted = 57642;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r5, byte r6, int r7) {
            /*
                int r6 = 110 - r6
                byte[] r0 = o.getExcludedSubtrees.onWarmupCompleted.$$a
                int r7 = r7 * 3
                int r1 = 1 - r7
                int r5 = r5 * 2
                int r5 = r5 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L16
                r4 = r7
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L22:
                int r3 = r3 + 1
                r4 = r0[r5]
            L26:
                int r5 = r5 + 1
                int r6 = r6 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getExcludedSubtrees.onWarmupCompleted.$$c(byte, byte, int):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Function0<Unit> function0, BaseActivity baseActivity, getDummyAd getdummyad, Function1<? super r8lambda6V0YVgpvgCQzEji1GNetQSIYsE, Unit> function1, String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$onGranted = function0;
            this.$activity = baseActivity;
            this.$standardTermsV2Intent = getdummyad;
            this.$activityResultCallback = function1;
            this.$serviceReferrer = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$onGranted, this.$activity, this.$standardTermsV2Intent, this.$activityResultCallback, this.$serviceReferrer, access13800Var);
            int i2 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
            return objIAuthTabCallback;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            char c2;
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i3 = $10 + 75;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 % 2;
            }
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i5 = $10 + 43;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44, 1451 - (Process.myTid() >> 22), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getCapsMode("", 0, 0)), 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1494 - TextUtils.indexOf("", ""), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 23972), 50 - TextUtils.getTrimmedLength(""), KeyEvent.getDeadChar(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        c2 = 2;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 45849), Color.rgb(0, 0, 0) + 16777245, 12577 - Color.argb(0, 0, 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        c2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
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

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) - 1718560965, new char[]{2339, 23373, 12738, 56593, 56191, 2777, 65469, 4711, 55620, 33327, 13746, 33234, 12221, 45895, 17581, 30750, 50515, 29405, 44627, 35765, 58734, 4019, 49296, 63855, 53048, 27509, 28149, 12039, 39639, 58215, 57502, 19921, 53393, 2651, 47121, 12795, 30929, 27543, 36646, 45889, 17030, 61016, 13065, 17887, 4319, 30316, 40596}, new char[]{0, 0, 0, 0}, new char[]{14996, 37079, 55449, 42905}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                H5TinyPopMenuTitleBarTheme h5TinyPopMenuTitleBarTheme = H5TinyPopMenuTitleBarTheme.IAuthTabCallback;
                this.label = 1;
                obj = h5TinyPopMenuTitleBarTheme.IAuthTabCallback(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                int i4 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    this.$onGranted.invoke();
                    throw null;
                }
                this.$onGranted.invoke();
                int i5 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                H5TinyPopMenuTitleBarTheme h5TinyPopMenuTitleBarTheme2 = H5TinyPopMenuTitleBarTheme.IAuthTabCallback;
                BaseActivity baseActivity = this.$activity;
                getDummyAd getdummyad = this.$standardTermsV2Intent;
                SessionTrackera.onExtraCallbackWithResult onextracallbackwithresult = SessionTrackera.Companion;
                IEngagementSignalsCallbackStubProxy activityResultRegistry = baseActivity.getActivityResultRegistry();
                Object[] objArr2 = new Object[1];
                a((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17153), Color.blue(0) + 787851721, new char[]{25987, 65196, 21432, 51883, 1253, 30343, 57258, 28609, 27418, 22803, 38755, 35141, 36039}, new char[]{0, 0, 0, 0}, new char[]{51518, 62889, 558, 59715}, objArr2);
                h5TinyPopMenuTitleBarTheme2.onNavigationEvent(baseActivity, getdummyad, onextracallbackwithresult.onExtraCallback(activityResultRegistry.onExtraCallback(((String) objArr2[0]).intern(), AppLovinAdImpl.onExtraCallbackWithResult(), new onExtraCallbackWithResult(this.$activityResultCallback))), this.$serviceReferrer);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(BaseActivity baseActivity, Function0 function0, Function0 function02, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        boolean zIsSucceed = r8lambda6v0yvgpvgcqzeji1gnetqsiyse.IAuthTabCallback().isSucceed();
        H5TinyPopMenuTitleBarTheme.IAuthTabCallback.IAuthTabCallback(zIsSucceed);
        if (zIsSucceed) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(baseActivity), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(baseActivity, function02, null), 3, (Object) null);
            i = onExtraCallback + 93;
            i2 = i % 128;
        } else {
            function0.invoke();
            i = onExtraCallback + 57;
            i2 = i % 128;
        }
        IAuthTabCallback = i2;
        int i4 = i % 2;
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(WebViewContentOwner webViewContentOwner, Function0<Unit> function0, Function0<Unit> function02, String str) {
        int i = 2 % 2;
        BaseActivity activity = webViewContentOwner.getActivity();
        BaseActivity baseActivity = null;
        if (activity instanceof BaseActivity) {
            int i2 = onExtraCallback + 31;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            baseActivity = activity;
            int i4 = i3 + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        BaseActivity baseActivity2 = baseActivity;
        if (baseActivity2 == null) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(baseActivity2), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(function0, baseActivity2, getDummyAd.Companion.onNavigationEvent(baseActivity2), new FetchContactsHandler$.ExternalSyntheticLambda1(baseActivity2, function02, function0), str, null), 3, (Object) null);
    }

    private static void c(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        Object obj2 = null;
        float f = 0.0f;
        if (cArr2 != null) {
            int i4 = $10;
            int i5 = i4 + 61;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = i4 + 109;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 27 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), 23139 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Color.green(0) + 26, (ViewConfiguration.getPressedStateDuration() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
            int i10 = $11 + 75;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
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
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24823), View.MeasureSpec.makeMeasureSpec(0, 0) + 74, 8088 - View.MeasureSpec.getSize(0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), (KeyEvent.getMaxKeyCode() >> 16) + 30, 19488 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            int i17 = $11 + 101;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onNavigationEvent(startRunning startrunning) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{startrunning}, iOnWarmupCompleted, -1032907700, 1032907700);
    }

    private static final Unit onExtraCallbackWithResult(startRunning startrunning) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{startrunning}, iOnWarmupCompleted, 1155215266, -1155215265);
    }
}
