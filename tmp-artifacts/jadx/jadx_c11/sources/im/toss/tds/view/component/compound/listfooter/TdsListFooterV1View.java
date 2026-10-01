package im.toss.tds.view.component.compound.listfooter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.text.BaseTextView;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.ICrashFilter;
import o.IOOMCallback;
import o.ProtocolCompanion;
import o.RequestBodyCompanion;
import o.VectorConvertersKtExternalSyntheticLambda8;
import o.authParams;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.enableThreadsBoost;
import o.forJavaName;
import o.getDid;
import o.getTagsokhttp;
import o.getUrlokhttp;
import o.head;
import o.initMiniApp;
import o.initSDK;
import o.isMuted;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.setBodyokhttp;
import o.setCustomDataCallback;
import o.setHasUserConsent;
import o.setVisitUrl;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsListFooterV1View extends ConstraintLayout implements registerCrashCallback {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final int IAuthTabCallback = R.color.text_brand;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private static int writeTypedObject = 1;
    private final Paint IAuthTabCallbackDefault;
    private final float[] IAuthTabCallbackStub;
    private final head IAuthTabCallbackStubProxy;
    private forJavaName access000;
    private Integer asBinder;
    private float asInterface;
    private final Lazy onExtraCallback;
    private Integer onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int[] onTransact;
    private int onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[ProtocolCompanion.values().length];
            try {
                iArr[ProtocolCompanion.LEFT24.ordinal()] = 1;
                int i = IAuthTabCallback + 53;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtocolCompanion.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[getTagsokhttp.values().length];
            try {
                iArr2[getTagsokhttp.TYPE1.ordinal()] = 1;
                int i4 = IAuthTabCallback + 47;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[getTagsokhttp.TYPE2.ordinal()] = 2;
                int i6 = onWarmupCompleted + 117;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[getTagsokhttp.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallback = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListFooterV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListFooterV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(TdsListFooterV1View tdsListFooterV1View, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onExtraCallback(tdsListFooterV1View, z);
        int i4 = access100 + 121;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsOnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i4) | i7);
        int i9 = ~(i | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i4;
        int i12 = ~(i7 | i4);
        int i13 = i3 + i4 + i5 + (1577873432 * i6) + (977123338 * i2);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i3) - 865599488) + ((-647756440) * i4) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i5) + ((-767557632) * i6) + (1290797056 * i2) + ((-539361280) * i14);
        int i16 = (i3 * (-1177406726)) + 1326046462 + (i4 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i5 * (-1177406223)) + (i6 * 1546282648) + (i2 * (-1884272278)) + (i14 * 70909952);
        int i17 = i15 + (i16 * i16 * 451280896);
        if (i17 == 1) {
            return onExtraCallback(objArr);
        }
        if (i17 == 2) {
            return IAuthTabCallback(objArr);
        }
        registerCrashCallback registercrashcallback = (TdsListFooterV1View) objArr[0];
        int i18 = 2 % 2;
        int i19 = getInterfaceDescriptor + 123;
        access100 = i19 % 128;
        int i20 = i19 % 2;
        View viewFindViewById = registercrashcallback.findViewById(im.toss.tds.view.R.id.clickView);
        Intrinsics.checkNotNull(viewFindViewById);
        int i21 = getInterfaceDescriptor + 67;
        access100 = i21 % 128;
        int i22 = i21 % 2;
        return viewFindViewById;
    }

    public static /* synthetic */ void onWarmupCompleted(TdsListFooterV1View tdsListFooterV1View, View.OnClickListener onClickListener, View view) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tdsListFooterV1View, onClickListener, view);
        int i4 = getInterfaceDescriptor + 67;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsListFooterV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = reportCustomErr.onNavigationEvent(this, IOOMCallback.ListFooter, false, (Function0) null, (Function1) null, 14, (Object) null);
        this.onNavigationEvent = getResources().getDimensionPixelSize(im.toss.tds.view.R.dimen.list_footer_border_height);
        this.IAuthTabCallbackDefault = new Paint(1);
        this.onTransact = new int[]{RequestBodyCompanion.onNavigationEvent(this, authParams.FillPressed), 0};
        this.IAuthTabCallbackStub = new float[]{0.0f, 1.0f};
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        this.access000 = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).IAuthTabCallback();
        this.onWarmupCompleted = 500;
        if (getId() == -1) {
            setId(im.toss.tds.view.R.id.tds_list_footer_v1);
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -2));
        }
        LayoutInflater.from(context).inflate(im.toss.tds.view.R.layout.tds_list_footer_v1, (ViewGroup) this, true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinimumHeight(varyMatches.onNavigationEvent(Float.valueOf(60.0f), displayMetrics));
        ColorStateList colorStateList = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, im.toss.tds.view.R.styleable.TdsListFooterV1, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_title) {
                    setTitle(typedArrayObtainStyledAttributes.getString(index));
                } else {
                    if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_titleColor) {
                        int i3 = access100 + 25;
                        getInterfaceDescriptor = i3 % 128;
                        int i4 = i3 % 2;
                        colorStateList = typedArrayObtainStyledAttributes.getColorStateList(index);
                    } else if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_titleFont) {
                        setTitleFont(typedArrayObtainStyledAttributes.getResourceId(index, 0));
                        int i5 = access100 + 87;
                        getInterfaceDescriptor = i5 % 128;
                        int i6 = i5 % 2;
                    } else if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_border) {
                        setBorder(typedArrayObtainStyledAttributes.getBoolean(index, false));
                    } else if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_borderType) {
                        setBorderType((ProtocolCompanion) ProtocolCompanion.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                    } else if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_topBorder) {
                        setTopBorder(typedArrayObtainStyledAttributes.getBoolean(index, false));
                    } else if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_topBorderType) {
                        setTopBorderType((ProtocolCompanion) ProtocolCompanion.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                    } else if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_disabledType) {
                        setDisabledType((getTagsokhttp) getTagsokhttp.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                    } else if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_icon) {
                        setIcon(typedArrayObtainStyledAttributes.getDrawable(index));
                    } else if (index == im.toss.tds.view.R.styleable.TdsListFooterV1_iconColor) {
                        setIconColor(typedArrayObtainStyledAttributes.getColorStateList(index));
                    }
                    int i7 = 2 % 2;
                }
            }
        }
        if (colorStateList != null) {
            setTitleColor(colorStateList);
        } else {
            setTitleColor(ResourcesCompat.onExtraCallbackWithResult(getResources(), IAuthTabCallback, context.getTheme()));
            int i8 = getInterfaceDescriptor + 45;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        }
        ((View) onWarmupCompleted(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -351083808, 351083808, new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback())).setBackgroundColor(0);
        this.IAuthTabCallbackStubProxy = new head(this, onPostMessage(), false, new Function1() { // from class: im.toss.tds.view.component.compound.listfooter.TdsListFooterV1View$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i11 = 2 % 2;
                int i12 = onWarmupCompleted + 29;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                TdsListFooterV1View tdsListFooterV1View = this.f$0;
                Boolean bool = (Boolean) obj;
                if (i13 == 0) {
                    return TdsListFooterV1View.onNavigationEvent(tdsListFooterV1View, bool.booleanValue());
                }
                TdsListFooterV1View.onNavigationEvent(tdsListFooterV1View, bool.booleanValue());
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 4, (DefaultConstructorMarker) null);
        setDisabledType(getTagsokhttp.TYPE2);
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = access100 + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallbackWriteTypedObject = writeTypedObject();
        int i4 = access100 + 93;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return setcustomdatacallbackWriteTypedObject;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i4 = access100 + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return setIAuthTabCallbackStub;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = access100 + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = access100 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        int i4 = getInterfaceDescriptor + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = access100 + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        int i4 = getInterfaceDescriptor + 111;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventAccess000;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i4 = getInterfaceDescriptor + 25;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        Function1<ICrashFilter, Boolean> function1AsBinder;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
            int i3 = 38 / 0;
        } else {
            function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        }
        int i4 = getInterfaceDescriptor + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.extraCallback();
        }
        super/*o.MonitorCrashConfig*/.extraCallback();
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        initSDK.onNavigationEvent interfaceDescriptor;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
            int i3 = 50 / 0;
        } else {
            interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        }
        int i4 = getInterfaceDescriptor + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return onnavigationeventOnExtraCallback;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = access100 + 77;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return initminiappOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        int i4 = access100 + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return enablethreadsboostOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        int i4 = access100 + 109;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = access100 + 51;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        int i4 = access100 + 101;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i4 = access100 + 59;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getdidOnTransact;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i4 = getInterfaceDescriptor + 101;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return mapOnWarmupCompleted;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = access100 + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        int i4 = getInterfaceDescriptor + 57;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = access100 + 75;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = getInterfaceDescriptor + 47;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = getInterfaceDescriptor + 59;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = access100 + 87;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = access100 + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsListFooterV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = access100;
            int i4 = i3 + 67;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 7;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public setCustomDataCallback writeTypedObject() {
        int i = 2 % 2;
        int i2 = access100 + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onExtraCallback.getValue();
        int i4 = getInterfaceDescriptor + 11;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return setcustomdatacallback;
    }

    private final int onActivityResized() {
        int i = 2 % 2;
        int i2 = access100 + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onWarmupCompleted;
        return i3 == 0 ? i4 >>> 38 : i4 + 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final AppLovinSdkSettings onExtraCallback(final TdsListFooterV1View tdsListFooterV1View, boolean z) {
        final int iIntValue;
        final int iIntValue2;
        deprecated_dns deprecated_dnsVarOnNavigationEvent;
        float f;
        int i = 2 % 2;
        Integer num = tdsListFooterV1View.asBinder;
        final int iIntValue3 = num != null ? num.intValue() : tdsListFooterV1View.onMinimized().getCurrentTextColor();
        Integer num2 = tdsListFooterV1View.onExtraCallbackWithResult;
        if (num2 != null) {
            int i2 = access100 + 63;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                num2.intValue();
                throw null;
            }
            iIntValue = num2.intValue();
        } else {
            iIntValue = iIntValue3;
        }
        Integer numOnWarmupCompleted = tdsListFooterV1View.access000.onWarmupCompleted(tdsListFooterV1View.onActivityResized());
        if (numOnWarmupCompleted != null) {
            iIntValue2 = numOnWarmupCompleted.intValue();
        } else {
            int i3 = getInterfaceDescriptor + 1;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            iIntValue2 = 0;
        }
        float f2 = tdsListFooterV1View.asInterface;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        if (z) {
            deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.asInterface();
        } else {
            deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.onNavigationEvent();
            int i5 = getInterfaceDescriptor + 67;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            }
        }
        AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_dnsVarOnNavigationEvent}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(((View) onWarmupCompleted(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -351083808, 351083808, new Object[]{tdsListFooterV1View}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback())).getScaleX()), Float.valueOf(z ? 0.96f : 1.0f), null, 4, null);
        if (z) {
            int i7 = getInterfaceDescriptor + 39;
            access100 = i7 % 128;
            f = i7 % 2 != 0 ? 0.0f : 1.0f;
        }
        return (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettingsAsBinder, Float.valueOf(f2), Float.valueOf(f), new Function1() { // from class: im.toss.tds.view.component.compound.listfooter.TdsListFooterV1View$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 45;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallbackWithResult = TdsListFooterV1View.onExtraCallbackWithResult(iIntValue3, iIntValue2, iIntValue, tdsListFooterV1View, ((Float) obj).floatValue());
                int i11 = onExtraCallback + 115;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit onExtraCallbackWithResult(int i, int i2, int i3, TdsListFooterV1View tdsListFooterV1View, float f) {
        int i4 = 2 % 2;
        int iIntValue = new setHasUserConsent(i, i2).IAuthTabCallback(f).intValue();
        int iIntValue2 = new setHasUserConsent(i3, i2).IAuthTabCallback(f).intValue();
        tdsListFooterV1View.onMinimized().setTextColor(iIntValue);
        VectorConvertersKtExternalSyntheticLambda8.onWarmupCompleted(tdsListFooterV1View.onMinimized(), ColorStateList.valueOf(iIntValue2));
        tdsListFooterV1View.asInterface = f;
        tdsListFooterV1View.postInvalidateOnAnimation();
        Unit unit = Unit.INSTANCE;
        int i5 = getInterfaceDescriptor + 111;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onMinimized().setText(charSequence);
        int i4 = getInterfaceDescriptor + 51;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        if (colorStateList != null) {
            int i2 = access100 + 75;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            onMinimized().setTextColor(colorStateList);
            Integer numValueOf = Integer.valueOf(onMinimized().getCurrentTextColor());
            IAuthTabCallback(numValueOf.intValue());
            this.asBinder = numValueOf;
            return;
        }
        if (this.onExtraCallbackWithResult == null) {
            int i4 = getInterfaceDescriptor + 29;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            VectorConvertersKtExternalSyntheticLambda8.onWarmupCompleted(onMinimized(), (ColorStateList) null);
        }
    }

    public final void setTitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 111;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            onMinimized().setTextColor(i);
            this.asBinder = Integer.valueOf(i);
            IAuthTabCallback(i);
        } else {
            onMinimized().setTextColor(i);
            this.asBinder = Integer.valueOf(i);
            IAuthTabCallback(i);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        forJavaName forjavanameOnNavigationEvent = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onNavigationEvent(i);
        if (forjavanameOnNavigationEvent == null) {
            int currentTextColor = onMinimized().getCurrentTextColor();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            Object[] objArr = {new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            if (currentTextColor == ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1612582679, 1612582689, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue()) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration3 = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                forjavanameOnNavigationEvent = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration3)).IAuthTabCallback();
                this.onWarmupCompleted = 500;
            } else {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Configuration configuration4 = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration4, "");
                forjavanameOnNavigationEvent = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration4)).ICustomTabsCallbackDefault();
                this.onWarmupCompleted = 600;
            }
        }
        this.access000 = forjavanameOnNavigationEvent;
        if (this.onExtraCallbackWithResult == null) {
            int i3 = getInterfaceDescriptor + 1;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            VectorConvertersKtExternalSyntheticLambda8.onWarmupCompleted(onMinimized(), ColorStateList.valueOf(i));
            if (i4 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setTitleFont(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 111;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if (i != 0) {
            onMinimized().onWarmupCompleted(i);
            int i5 = access100 + 93;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = getInterfaceDescriptor + 63;
        access100 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final void setBorder(boolean z) {
        View viewAsInterface;
        int i;
        int i2 = 2 % 2;
        int i3 = access100;
        int i4 = i3 + 55;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        if (z) {
            int i6 = i3 + 103;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 == 0) {
                viewAsInterface = asInterface();
                i = 1;
            } else {
                viewAsInterface = asInterface();
                i = 0;
            }
            viewAsInterface.setVisibility(i);
            return;
        }
        asInterface().setVisibility(8);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setBorderType(@NotNull ProtocolCompanion protocolCompanion) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(protocolCompanion, "");
        int i2 = onExtraCallbackWithResult.onNavigationEvent[protocolCompanion.ordinal()];
        if (i2 == 1) {
            ViewGroup.LayoutParams layoutParams = asInterface().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics);
            return;
        }
        int i3 = getInterfaceDescriptor + 67;
        access100 = i3 % 128;
        if (i3 % 2 == 0 ? i2 != 2 : i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ViewGroup.LayoutParams layoutParams2 = asInterface().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "");
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = varyMatches.onNavigationEvent(Float.valueOf(0.0f), displayMetrics2);
        int i4 = getInterfaceDescriptor + 73;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTopBorder(boolean z) {
        int i = 2 % 2;
        if (!(!z)) {
            int i2 = getInterfaceDescriptor + 83;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            ((View) onWarmupCompleted(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 279191996, -279191995, new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback())).setVisibility(0);
            return;
        }
        ((View) onWarmupCompleted(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 279191996, -279191995, new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback())).setVisibility(8);
        int i4 = getInterfaceDescriptor + 51;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setTopBorderType(@NotNull ProtocolCompanion protocolCompanion) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(protocolCompanion, "");
        int i2 = onExtraCallbackWithResult.onNavigationEvent[protocolCompanion.ordinal()];
        if (i2 == 1) {
            int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            ViewGroup.LayoutParams layoutParams = ((View) onWarmupCompleted(iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 279191996, -279191995, new Object[]{this}, iOnExtraCallback2, iOnExtraCallback3)).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics);
            return;
        }
        int i3 = access100 + 31;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0 ? i2 != 2 : i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int iOnExtraCallback4 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback5 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback6 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        ViewGroup.LayoutParams layoutParams2 = ((View) onWarmupCompleted(iOnExtraCallback4, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 279191996, -279191995, new Object[]{this}, iOnExtraCallback5, iOnExtraCallback6)).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "");
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = varyMatches.onNavigationEvent(Float.valueOf(0.0f), displayMetrics2);
        int i4 = access100 + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setDisabledType(@NotNull getTagsokhttp gettagsokhttp) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access100 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(gettagsokhttp, "");
        int i4 = onExtraCallbackWithResult.onExtraCallback[gettagsokhttp.ordinal()];
        if (i4 == 1) {
            readTypedObject().setBackgroundResource(im.toss.tds.view.R.drawable.tds_list_row_v1_disabled_type1_bg);
            return;
        }
        if (i4 == 2) {
            readTypedObject().setBackgroundResource(im.toss.tds.view.R.drawable.tds_list_row_v1_disabled_type2_bg);
            int i5 = access100 + 63;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = getInterfaceDescriptor + 105;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        readTypedObject().setBackgroundColor(0);
        int i9 = getInterfaceDescriptor + 93;
        access100 = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 23;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            setIcon(ResourcesCompat.onExtraCallback(getResources(), i, (Resources.Theme) null));
        } else {
            setIcon(ResourcesCompat.onExtraCallback(getResources(), i, (Resources.Theme) null));
            throw null;
        }
    }

    public final void setIcon(@Nullable Drawable drawable) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = access100 + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onMinimized().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            AppCompatTextView appCompatTextViewOnMinimized = onMinimized();
            Integer num = this.onExtraCallbackWithResult;
            if (num == null && (num = this.asBinder) == null) {
                int i3 = getInterfaceDescriptor + 119;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                iIntValue = onMinimized().getCurrentTextColor();
            } else {
                iIntValue = num.intValue();
            }
            VectorConvertersKtExternalSyntheticLambda8.onWarmupCompleted(appCompatTextViewOnMinimized, ColorStateList.valueOf(iIntValue));
            return;
        }
        onMinimized().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        onMinimized();
        throw null;
    }

    public final void setIconColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (colorStateList != null) {
            VectorConvertersKtExternalSyntheticLambda8.onWarmupCompleted(onMinimized(), colorStateList);
        }
        int i4 = getInterfaceDescriptor + 85;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setIconColor(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 115;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.onExtraCallbackWithResult = Integer.valueOf(i);
            VectorConvertersKtExternalSyntheticLambda8.onWarmupCompleted(onMinimized(), ColorStateList.valueOf(i));
            int i4 = getInterfaceDescriptor + 111;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.onExtraCallbackWithResult = Integer.valueOf(i);
        VectorConvertersKtExternalSyntheticLambda8.onWarmupCompleted(onMinimized(), ColorStateList.valueOf(i));
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.IAuthTabCallbackStubProxy.onNavigationEvent(motionEvent);
        if (!onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        int i4 = access100;
        int i5 = i4 + 53;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 67;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.setPressed(z);
        this.IAuthTabCallbackStubProxy.onNavigationEvent(z);
        int i4 = access100 + 95;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (onClickListener != null) {
            super/*android.view.View*/.setOnClickListener(new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.listfooter.TdsListFooterV1View$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 107;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    TdsListFooterV1View tdsListFooterV1View = this.f$0;
                    if (i6 != 0) {
                        TdsListFooterV1View.onWarmupCompleted(tdsListFooterV1View, onClickListener, view);
                    } else {
                        TdsListFooterV1View.onWarmupCompleted(tdsListFooterV1View, onClickListener, view);
                        int i7 = 42 / 0;
                    }
                }
            });
            return;
        }
        int i4 = i3 + 103;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        super/*android.view.View*/.setOnClickListener(null);
        int i6 = access100 + 61;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onNavigationEvent(TdsListFooterV1View tdsListFooterV1View, View.OnClickListener onClickListener, View view) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, tdsListFooterV1View, (initMiniApp) null, 2, (Object) null);
        onClickListener.onClick(view);
        int i4 = getInterfaceDescriptor + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        onExtraCallback(canvas);
        super.dispatchDraw(canvas);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        int i4 = access100 + 11;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(Canvas canvas) {
        int i = 2 % 2;
        Paint paint = this.IAuthTabCallbackDefault;
        paint.setShader(new RadialGradient(getMeasuredWidth() / 2.0f, 0.0f, (getMeasuredWidth() * 1.2f) / 2.0f, this.onTransact, this.IAuthTabCallbackStub, Shader.TileMode.CLAMP));
        paint.setAlpha((int) (this.asInterface * 255.0f));
        canvas.drawRect(new RectF(getPaddingLeft(), this.onNavigationEvent + getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom()), this.IAuthTabCallbackDefault);
        int i2 = getInterfaceDescriptor + 35;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView onMinimized() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objFindViewById = findViewById(im.toss.tds.view.R.id.title);
        Intrinsics.checkNotNull(objFindViewById);
        BaseTextView baseTextView = (BaseTextView) objFindViewById;
        int i4 = getInterfaceDescriptor + 61;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return baseTextView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(im.toss.tds.view.R.id.border);
        if (i3 != 0) {
            Intrinsics.checkNotNull(viewFindViewById);
            return viewFindViewById;
        }
        Intrinsics.checkNotNull(viewFindViewById);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        registerCrashCallback registercrashcallback = (TdsListFooterV1View) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(registercrashcallback.findViewById(im.toss.tds.view.R.id.topBorder));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View viewFindViewById = registercrashcallback.findViewById(im.toss.tds.view.R.id.topBorder);
        Intrinsics.checkNotNull(viewFindViewById);
        int i3 = access100 + 53;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View readTypedObject() {
        int i = 2 % 2;
        int i2 = access100 + 73;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(findViewById(im.toss.tds.view.R.id.overlay));
            obj.hashCode();
            throw null;
        }
        View viewFindViewById = findViewById(im.toss.tds.view.R.id.overlay);
        Intrinsics.checkNotNull(viewFindViewById);
        int i3 = access100 + 69;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return viewFindViewById;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        registerCrashCallback registercrashcallback = (TdsListFooterV1View) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = registercrashcallback.findViewById(im.toss.tds.view.R.id.spaceTop);
        Intrinsics.checkNotNull(viewFindViewById);
        if (i3 == 0) {
            return viewFindViewById;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(findViewById(im.toss.tds.view.R.id.spaceBottom));
            throw null;
        }
        View viewFindViewById = findViewById(im.toss.tds.view.R.id.spaceBottom);
        Intrinsics.checkNotNull(viewFindViewById);
        int i3 = access100 + 85;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return viewFindViewById;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Layer onPostMessage() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(findViewById(im.toss.tds.view.R.id.clickLayer));
            throw null;
        }
        Layer layerFindViewById = findViewById(im.toss.tds.view.R.id.clickLayer);
        Intrinsics.checkNotNull(layerFindViewById);
        Layer layer = layerFindViewById;
        int i3 = getInterfaceDescriptor + 61;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return layer;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        int i = IAuthTabCallback_Parcel + 31;
        writeTypedObject = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
    }

    public final View extraCallbackWithResult() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (View) onWarmupCompleted(iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -351083808, 351083808, new Object[]{this}, iOnExtraCallback2, iOnExtraCallback3);
    }

    public final View onMessageChannelReady() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (View) onWarmupCompleted(iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1727168375, -1727168373, new Object[]{this}, iOnExtraCallback2, iOnExtraCallback3);
    }

    public final View onActivityLayout() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (View) onWarmupCompleted(iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 279191996, -279191995, new Object[]{this}, iOnExtraCallback2, iOnExtraCallback3);
    }
}
