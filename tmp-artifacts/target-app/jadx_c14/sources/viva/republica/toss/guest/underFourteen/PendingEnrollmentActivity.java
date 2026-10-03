package viva.republica.toss.guest.underFourteen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.base.BaseActivity;
import im.toss.define.MobileCarrier;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography5;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMS_SignedDataWithSignNAuthAttributes;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda8;
import o.CheckMask;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.N_;
import o.RecomposerawaitIdle2;
import o.Recomposerjoin2;
import o.RecomposerrecompositionRunner2;
import o.ResetInputBGRLivenessChecker;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.createPaints;
import o.getAdService;
import o.getMaxScale;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.readIntokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.certify.CertifyGuestActivity;
import viva.republica.toss.guest.underFourteen.PendingEnrollmentActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PendingEnrollmentActivity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static char access100 = 0;
    public static final int asBinder;
    private static char asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static char onTransact;
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallbackWithResult(this));

    static {
        onNavigationEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        asBinder = 8;
        int i = getInterfaceDescriptor + 119;
        access000 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(PendingEnrollmentActivity pendingEnrollmentActivity, long j, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(pendingEnrollmentActivity, j, view);
        int i4 = IAuthTabCallback_Parcel + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = (~((~i3) | i8)) | i7;
        int i10 = i6 | i8;
        int i11 = (~(i3 | i7 | i8)) | (~(i | i6));
        int i12 = i + i6 + i4 + (2049387148 * i5) + ((-609071723) * i2);
        int i13 = i12 * i12;
        int i14 = ((1483459036 * i) - 1284505600) + (2005429323 * i6) + (i9 * 1605645861) + (1083675574 * i10) + (1605645861 * i11) + ((-1205862400) * i4) + ((-243269632) * i5) + ((-895483904) * i2) + ((-1334837248) * i13);
        int i15 = ((i * 335895516) - 1139737737) + (i6 * 335898315) + (i9 * 933) + (i10 * (-1866)) + (i11 * 933) + (i4 * 335896449) + (i5 * (-616405876)) + (i2 * 126640917) + (i13 * 2020605952);
        if (i14 + (i15 * i15 * (-544210944)) == 1) {
            return onExtraCallback(objArr);
        }
        PendingEnrollmentActivity pendingEnrollmentActivity = (PendingEnrollmentActivity) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        View view = (View) objArr[2];
        int i16 = 2 % 2;
        int i17 = IAuthTabCallback_Parcel + 121;
        IAuthTabCallbackStubProxy = i17 % 128;
        int i18 = i17 % 2;
        onExtraCallback(pendingEnrollmentActivity, jLongValue, view);
        int i19 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(PendingEnrollmentActivity pendingEnrollmentActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pendingEnrollmentActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<CMS_SignedDataWithSignNAuthAttributes> {
        final /* synthetic */ Activity onNavigationEvent;

        public onExtraCallbackWithResult(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CMS_SignedDataWithSignNAuthAttributes invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_SignedDataWithSignNAuthAttributes.onExtraCallbackWithResult(layoutInflater);
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback4 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        if (i3 != 0) {
            ((Boolean) onExtraCallback(1622058012, iOnExtraCallback4, objArr, iOnExtraCallback, iOnExtraCallback2, iOnExtraCallback3, -1622058011)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!((Boolean) onExtraCallback(1622058012, iOnExtraCallback4, objArr, iOnExtraCallback, iOnExtraCallback2, iOnExtraCallback3, -1622058011)).booleanValue()) {
            return -1L;
        }
        int i4 = IAuthTabCallback_Parcel + 113;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return 1217495L;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
            if (!((Boolean) onExtraCallback(1622058012, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1622058011)).booleanValue()) {
                return null;
            }
        } else {
            if (!((Boolean) onExtraCallback(1622058012, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1622058011)).booleanValue()) {
                return null;
            }
        }
        int i4 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("birthday", getMaxScale.IAuthTabCallback.onNavigationEvent())});
        }
        Pair[] pairArr = new Pair[0];
        pairArr[0] = getWrite.IAuthTabCallback("birthday", getMaxScale.IAuthTabCallback.onNavigationEvent());
        return access8100.IAuthTabCallback(pairArr);
    }

    private final CMS_SignedDataWithSignNAuthAttributes IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.IAuthTabCallbackStub.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            throw null;
        }
        Object value2 = this.IAuthTabCallbackStub.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        CMS_SignedDataWithSignNAuthAttributes cMS_SignedDataWithSignNAuthAttributes = (CMS_SignedDataWithSignNAuthAttributes) value2;
        int i3 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 60 / 0;
        }
        return cMS_SignedDataWithSignNAuthAttributes;
    }

    private final Typography1 updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(IAuthTabCallback().onExtraCallbackWithResult, "");
            throw null;
        }
        Typography1 typography1 = IAuthTabCallback().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(typography1, "");
        return typography1;
    }

    private final Typography5 validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Typography5 typography5 = IAuthTabCallback().onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            return typography5;
        }
        Typography5 typography52 = IAuthTabCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(typography52, "");
        int i3 = 18 / 0;
        return typography52;
    }

    private final TdsButtonV1View setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TdsButtonV1View tdsButtonV1View = IAuthTabCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        int i4 = IAuthTabCallback_Parcel + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return tdsButtonV1View;
    }

    private final TdsImageView ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsImageView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(PendingEnrollmentActivity pendingEnrollmentActivity, long j, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        pendingEnrollmentActivity.IEngagementSignalsCallback();
        pendingEnrollmentActivity.startActivity(CertifyGuestActivity.onExtraCallbackWithResult.IAuthTabCallback(CertifyGuestActivity.Companion, pendingEnrollmentActivity, j, 0L, null, null, null, false, false, false, null, 1020, null));
        pendingEnrollmentActivity.finish();
        int i4 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(PendingEnrollmentActivity pendingEnrollmentActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{43246, 24812, 10418, 20475, 25282, 56759, 52297, 42680, 37082, 27610, 58119, 16385, 27156, 3516, 38157, 27439}, 16 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = pendingEnrollmentActivity.getIntent();
        Object[] objArr2 = new Object[1];
        a(new char[]{39498, 30887, 58696, 34341, 3855, 20518, 33319, 6135, 18983, 42773, 49946, 6850, 44586, 23618, 42983, 62450, 44747, 32709, 7687, 25708, 48363, 60519}, 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(strIntern, Long.valueOf(intent.getLongExtra(((String) objArr2[0]).intern(), 0L)));
        Object[] objArr3 = new Object[1];
        a(new char[]{25483, 61500, 4918, 6508, 16145, 33922}, 5 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), pendingEnrollmentActivity.setEngagementSignalsCallback().getText());
        setDetectableSize.onExtraCallback("birthday", getMaxScale.IAuthTabCallback.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(PendingEnrollmentActivity pendingEnrollmentActivity, long j, View view) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1217497L, false, (String) null, (Map) null, new PendingEnrollmentActivity$.ExternalSyntheticLambda0(pendingEnrollmentActivity), 14, (Object) null);
        pendingEnrollmentActivity.IEngagementSignalsCallback();
        getMaxScale.IAuthTabCallback.onExtraCallbackWithResult();
        pendingEnrollmentActivity.startActivity(CertifyGuestActivity.onExtraCallbackWithResult.IAuthTabCallback(CertifyGuestActivity.Companion, pendingEnrollmentActivity, j, 0L, null, null, null, false, false, false, null, 1020, null));
        pendingEnrollmentActivity.finish();
        int i2 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            setContentView(IAuthTabCallback().onNavigationEvent);
            getMaxScale getmaxscale = getMaxScale.IAuthTabCallback;
            if (!getmaxscale.asInterface()) {
                finish();
                return;
            }
            Intent intent = getIntent();
            Object[] objArr = new Object[1];
            a(new char[]{39498, 30887, 58696, 34341, 3855, 20518, 33319, 6135, 18983, 42773, 49946, 6850, 44586, 23618, 42983, 62450, 44747, 32709, 7687, 25708, 48363, 60519}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026229).substring(0, 2).length() + 20, objArr);
            long longExtra = intent.getLongExtra(((String) objArr[0]).intern(), 0L);
            if (getmaxscale.IAuthTabCallbackDefault() > 0) {
                Typography1 typography1UpdateVisuals = updateVisuals();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getString(R.string.pending_enrollment_remains_title);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(getmaxscale.IAuthTabCallbackDefault())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                typography1UpdateVisuals.setText(str);
                Typography5 typography5ValidateRelationship = validateRelationship();
                String string2 = getString(R.string.pending_enrollment_remains_description);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String str2 = String.format(string2, Arrays.copyOf(new Object[]{getmaxscale.onWarmupCompleted(), ResetInputBGRLivenessChecker.onExtraCallback(CheckMask.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback(), getmaxscale.onTransact(), this, (TimeZone) null, 4, (Object) null)}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                typography5ValidateRelationship.setText(str2);
                setEngagementSignalsCallback().setText(getString(R.string.pending_enrollment_remains_cta_title));
                TdsButtonV1View.setTheme$default(setEngagementSignalsCallback(), (TdsButtonV1View.IAuthTabCallbackStub) null, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 13, (Object) null);
                setEngagementSignalsCallback().setOnClickListener(new PendingEnrollmentActivity$.ExternalSyntheticLambda1(this, longExtra));
                TdsImageView tdsImageViewICustomTabsServiceStub = ICustomTabsServiceStub();
                CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(tdsImageViewICustomTabsServiceStub.getContext());
                RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(tdsImageViewICustomTabsServiceStub.getContext());
                Object[] objArr2 = new Object[1];
                a(new char[]{6047, 12886, 61117, 16831, 15693, 12617, 62726, 7018, 57282, 30179, 26033, 36783, 50219, 4025, 55307, 27395, 61884, 31999, 22722, 32428, 20419, 30868, 19799, 56337, 49977, 235, 46710, 58924, 61710, 30208, 14740, 45462, 11963, 63529, 5582, 51804, 1020, 8859, 26096, 36424, 13722, 5234, 14896, 27588, 5097, 59967, 14896, 27588}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132025282).substring(0, 1).codePointAt(0) + 11, objArr2);
                RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = Recomposerjoin2.onExtraCallback(onnavigationevent.onExtraCallback(((String) objArr2[0]).intern()), tdsImageViewICustomTabsServiceStub);
                RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, true);
                N_.onExtraCallback(onnavigationeventOnExtraCallback, 0);
                carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(onnavigationeventOnExtraCallback.onExtraCallbackWithResult());
                return;
            }
            Typography1 typography1UpdateVisuals2 = updateVisuals();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string3 = getString(R.string.pending_enrollment_ready_title);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            String str3 = String.format(string3, Arrays.copyOf(new Object[]{getmaxscale.onWarmupCompleted()}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            typography1UpdateVisuals2.setText(str3);
            Typography5 typography5ValidateRelationship2 = validateRelationship();
            String string4 = getString(R.string.pending_enrollment_ready_description);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String str4 = String.format(string4, Arrays.copyOf(new Object[]{getmaxscale.onWarmupCompleted()}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            typography5ValidateRelationship2.setText(str4);
            Typography1 typography1UpdateVisuals3 = updateVisuals();
            Configuration configuration = getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            typography1UpdateVisuals3.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).requestPostMessageChannel().ICustomTabsCallbackDefault());
            Typography5 typography5ValidateRelationship3 = validateRelationship();
            Configuration configuration2 = getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            typography5ValidateRelationship3.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration2)).requestPostMessageChannel().ICustomTabsCallbackStubProxy());
            setEngagementSignalsCallback().setText(getString(R.string.pending_enrollment_ready_cta_title));
            setEngagementSignalsCallback().setOnClickListener(new PendingEnrollmentActivity$.ExternalSyntheticLambda2(this, longExtra));
            TdsImageView tdsImageViewICustomTabsServiceStub2 = ICustomTabsServiceStub();
            CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult2 = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(tdsImageViewICustomTabsServiceStub2.getContext());
            RecomposerawaitIdle2.onNavigationEvent onnavigationevent2 = new RecomposerawaitIdle2.onNavigationEvent(tdsImageViewICustomTabsServiceStub2.getContext());
            Object[] objArr3 = new Object[1];
            a(new char[]{6047, 12886, 61117, 16831, 15693, 12617, 62726, 7018, 57282, 30179, 26033, 36783, 50219, 4025, 55307, 27395, 61884, 31999, 22722, 32428, 20419, 30868, 19799, 56337, 49977, 235, 46710, 58924, 61710, 30208, 14740, 45462, 11963, 63529, 5582, 51804, 1918, 21923, 44623, 29088, 13722, 5234, 14896, 27588, 5097, 59967, 14896, 27588}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 29, objArr3);
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback2 = Recomposerjoin2.onExtraCallback(onnavigationevent2.onExtraCallback(((String) objArr3[0]).intern()), tdsImageViewICustomTabsServiceStub2);
            RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback2, true);
            N_.onExtraCallback(onnavigationeventOnExtraCallback2, 0);
            carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult2.onWarmupCompleted(onnavigationeventOnExtraCallback2.onExtraCallbackWithResult());
            TdsButtonV1View.setTheme$default(setEngagementSignalsCallback(), (TdsButtonV1View.IAuthTabCallbackStub) null, TdsButtonV1View.IAuthTabCallbackDefault.FILL, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 13, (Object) null);
            int i3 = IAuthTabCallback_Parcel + 75;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onCreate(bundle);
        setContentView(IAuthTabCallback().onNavigationEvent);
        getMaxScale.IAuthTabCallback.asInterface();
        throw null;
    }

    public static final class onExtraCallback {
        private static final byte[] $$a = {101, 74, 115, 66};
        private static final int $$b = 114;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onExtraCallback = 1;
        private static char[] IAuthTabCallback = {60817, 28446, 59556, 27184, 59357, 24913, 58111, 31871, 63745, 31397, 62516, 29133, 62303, 19707, 52859, 19209, 50365, 17961, 50142, 23901, 57077, 22634};
        private static long onNavigationEvent = 8780524081252167494L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, byte r7, byte r8) {
            /*
                int r6 = r6 * 4
                int r6 = 97 - r6
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r0 = r8 + 1
                byte[] r1 = viva.republica.toss.guest.underFourteen.PendingEnrollmentActivity.onExtraCallback.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2a
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2a:
                int r7 = -r7
                int r3 = r3 + 1
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.underFourteen.PendingEnrollmentActivity.onExtraCallback.$$c(int, byte, byte):java.lang.String");
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0235  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r32, int r33, char r34, java.lang.Object[] r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 574
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.underFourteen.PendingEnrollmentActivity.onExtraCallback.a(int, int, char, java.lang.Object[]):void");
        }

        private onExtraCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) PendingEnrollmentActivity.class);
            Object[] objArr = new Object[1];
            a(View.combineMeasuredStates(0, 0), 22 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), j);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return intentPutExtra;
            }
            throw null;
        }
    }

    private final void IEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        createPaints createpaints = createPaints.IAuthTabCallback;
        getMaxScale getmaxscale = getMaxScale.IAuthTabCallback;
        createpaints.onNavigationEvent(getmaxscale.IAuthTabCallback());
        createpaints.asInterface(getmaxscale.onWarmupCompleted());
        createpaints.IAuthTabCallback(getmaxscale.onNavigationEvent());
        createpaints.onExtraCallback(getmaxscale.asBinder());
        Object obj = MobileCarrier.Companion;
        try {
            Object[] objArr = {getmaxscale.onExtraCallback()};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1901493767);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 46 - TextUtils.indexOf("", "", 0), 6951 - ((Process.getThreadPriority(0) + 20) >> 6), 1075216535, false, "onExtraCallback", new Class[]{String.class});
            }
            createpaints.onNavigationEvent((MobileCarrier) ((Method) objOnExtraCallback).invoke(obj, objArr));
            int i4 = IAuthTabCallbackStubProxy + 115;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getMaxScale.IAuthTabCallback.IAuthTabCallbackDefault();
            throw null;
        }
        if (getMaxScale.IAuthTabCallback.IAuthTabCallbackDefault() <= 0) {
            return true;
        }
        int i3 = IAuthTabCallback_Parcel + 95;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 77;
            $10 = i5 % 128;
            int i6 = 58224;
            char c = 1;
            if (i5 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $10 + 11;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(access100);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
                        int iAlpha = Color.alpha(0) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), absoluteGravity, iAlpha, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, 12434 - TextUtils.indexOf("", "", 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16013), 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getSize(0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final boolean ICustomTabsServiceDefault() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Boolean) onExtraCallback(1622058012, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, iOnExtraCallback, iOnExtraCallback2, iOnExtraCallback3, -1622058011)).booleanValue();
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 57;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    static void onNavigationEvent() {
        onTransact = (char) 28808;
        asInterface = (char) 16330;
        IAuthTabCallbackDefault = (char) 22891;
        access100 = (char) 24108;
    }
}
