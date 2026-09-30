package im.toss.features.credit.ui.plus.intro.component;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.credit.ui.plus.R;
import im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection3$;
import im.toss.tds.view.compat.component.TdsComposeView;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography6;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ArchiveMatcherSingletonHolder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.ParamUtils;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.initSDK;
import o.readIntokhttp;
import o.response;
import o.updateFileSpaceCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusIntroComponentSection3 extends FrameLayout implements updateFileSpaceCache {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 33841;
    private static int IAuthTabCallbackStub = 1;
    private static char onExtraCallback = 21078;
    private static char onExtraCallbackWithResult = 33921;
    private static char onNavigationEvent = 5185;
    private static int onTransact;
    private final ArchiveMatcherSingletonHolder onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public CreditPlusIntroComponentSection3(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, initSDK.onNavigationEvent onnavigationevent) {
        int i2 = 2 % 2;
        int i3 = onTransact + 35;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, onnavigationevent);
        int i5 = IAuthTabCallbackStub + 21;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, view);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        int i5 = onTransact + 57;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditPlusIntroComponentSection3(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ArchiveMatcherSingletonHolder archiveMatcherSingletonHolderIAuthTabCallback = ArchiveMatcherSingletonHolder.IAuthTabCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(archiveMatcherSingletonHolderIAuthTabCallback, "");
        this.onWarmupCompleted = archiveMatcherSingletonHolderIAuthTabCallback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditPlusIntroComponentSection3(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onTransact;
            int i3 = i2 + 91;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 79;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @Override // o.updateFileSpaceCache
    public /* bridge */ void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
    }

    private static final Unit onExtraCallback(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            function0.invoke();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        int i3 = 3 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(int i, initSDK.onNavigationEvent onnavigationevent) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 123;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onnavigationevent.onExtraCallbackWithResult("order", Integer.valueOf(i));
            unit = Unit.INSTANCE;
            int i4 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onnavigationevent.onExtraCallbackWithResult("order", Integer.valueOf(i));
            unit = Unit.INSTANCE;
        }
        int i5 = IAuthTabCallbackStub + 35;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.updateFileSpaceCache
    public void onNavigationEvent(int i, int i2, @NotNull Function0<Unit> function0) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Object[] objArr = {this.onWarmupCompleted.onExtraCallbackWithResult, ParamUtils.NORMAL, new CreditPlusIntroComponentSection3$.ExternalSyntheticLambda0(function0)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        TdsListHeaderV3View tdsListHeaderV3View = this.onWarmupCompleted.onExtraCallback;
        tdsListHeaderV3View.setTitleText(tdsListHeaderV3View.getContext().getString(R.string.credit_ui_plus_intro_section3_top_title));
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.LARGE);
        tdsListHeaderV3View.setTitleWidthRatioValue(1.0f);
        Intrinsics.checkNotNull(tdsListHeaderV3View);
        Context context = tdsListHeaderV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult());
        Object[] objArr2 = {tdsListHeaderV3View, new CreditPlusIntroComponentSection3$.ExternalSyntheticLambda1(i)};
        TdsComposeView.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr2, -122849947, JsParamKeys.onExtraCallbackWithResult(), 122849948);
        TdsImageView tdsImageView = this.onWarmupCompleted.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Object[] objArr3 = new Object[1];
        a(new char[]{59132, 29301, 62855, 4787, 38466, 15904, 40557, 59873, 27710, 32295, 52952, 29609, 56763, 40876, 61574, 30991, 10605, 23479, 41096, 23, 27768, 41193, 59376, 5182, 30701, 39453, 36627, 54230, 6379, 12000, 43703, 27754, 6993, 6106, 63086, 4207, 35943, 10925, 36215, 23214, 8341, 37054, 21914, 17025, 56570, 31825, 20861, 11187, 51512, 7213, 15551, 44103, 55183, 54404, 15551, 44103, 45732, 5053}, TextUtils.getCapsMode("", 0, 0) + 57, objArr3);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr3[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        Typography3 typography3 = this.onWarmupCompleted.onNavigationEvent;
        typography3.setText(R.string.credit_ui_plus_intro_section3_description_1);
        typography3.onNavigationEvent(response.Bold);
        Intrinsics.checkNotNull(typography3);
        Context context2 = typography3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        typography3.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration2)).ICustomTabsCallbackStubProxy());
        Typography6 typography6 = this.onWarmupCompleted.onWarmupCompleted;
        Intrinsics.checkNotNull(typography6);
        Context context3 = typography6.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        typography6.setTextColor(new getUrlokhttp(new onExtraCallback(configuration3)).onPostMessage());
        typography6.setText(typography6.getContext().getString(R.string.credit_ui_plus_intro_section3_description_2));
        int i4 = IAuthTabCallbackStub + 39;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onNavigationEvent + 67;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = onNavigationEvent + 7;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                int i5 = onNavigationEvent + 65;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                if (i6 == 0) {
                    return getspecialfeatureoptinstatus2;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            Object obj = null;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i3 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 71;
            $11 = i6 % 128;
            int i7 = 58224;
            if (i6 % i3 == 0) {
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % i5];
                i2 = 1;
            } else {
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i5;
            }
            while (i2 < 16) {
                int i8 = $11 + 79;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                char[] cArr4 = cArr3;
                int i10 = (c2 + i7) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[i3] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cRed = (char) Color.red(0);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, longPressTimeout, scrollDefaultDelay, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11, View.MeasureSpec.getMode(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 16014), 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $10 + 47;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i3 = 2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
