package viva.republica.toss.send.dutch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulesListExternalSyntheticLambda0;
import o.CMS_EncryptedDataWithEncryptKey;
import o.ConvertFloatArrayToByteArray;
import o.DomainConfigProxy;
import o.EncoderImplExternalSyntheticLambda3;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.M_;
import o.MapConverter;
import o.ParamImpl;
import o.PlayerErrorCode;
import o.Plugin;
import o.PluginInfo;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TitleBarRightButtonView;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.accessgetReactApplicationContextIfActiveOrWarn;
import o.accesssetEnqueuedAnimationOnFramep;
import o.addOperation;
import o.bringChildToFront;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.enableAccessibilityOrder;
import o.getAdService;
import o.getLongName;
import o.getMediationService;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.initMiniApp;
import o.matches;
import o.mergeParams;
import o.minFresh;
import o.noStore;
import o.readIntokhttp;
import o.setHeadersokhttp;
import o.setMessageBytes;
import o.varyMatches;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.send.dutch.TransferDutchAmountActivity$;
import viva.republica.toss.send.dutch.TransferDutchAmountActivity$LinkRow$;
import viva.republica.toss.send.dutch.TransferDutchCompleteActivity;
import viva.republica.toss.widget.NumberEditText;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferDutchAmountActivity extends Hilt_TransferDutchAmountActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static int ICustomTabsCallback = 1;
    private static long access000 = 0;
    private static int access100 = 0;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private long IAuthTabCallbackStubProxy;

    @Inject
    public DomainConfigProxy homeChangeHelper;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));
    private List<accesssetEnqueuedAnimationOnFramep> getInterfaceDescriptor = CollectionsKt.emptyList();
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.dutch.TransferDutchAmountActivity$$ExternalSyntheticLambda2
        public final Object invoke() {
            return TransferDutchAmountActivity.onExtraCallbackWithResult(this.f$0);
        }
    });
    private final ArrayList<onNavigationEvent> IAuthTabCallbackDefault = new ArrayList<>();
    private ArrayList<bringChildToFront> asBinder = new ArrayList<>();
    private final NumberEditText.IAuthTabCallbackStub IAuthTabCallback_Parcel = new onExtraCallbackWithResult();

    static {
        setEngagementSignalsCallback();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackStub = 8;
        int i = readTypedObject + 37;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TransferDutchAmountActivity transferDutchAmountActivity = (TransferDutchAmountActivity) objArr[0];
        enableAccessibilityOrder.onExtraCallbackWithResult onextracallbackwithresult = (enableAccessibilityOrder.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 51;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(1906634463, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{transferDutchAmountActivity, onextracallbackwithresult}, -1906634462, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = writeTypedObject + 101;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferDutchAmountActivity transferDutchAmountActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(transferDutchAmountActivity, th);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(TransferDutchAmountActivity transferDutchAmountActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(transferDutchAmountActivity, view);
        int i4 = access100 + 41;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(449143219, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function1, obj}, -449143213, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = writeTypedObject + 121;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 59;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(-1462205747, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function1, obj}, 1462205754, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            return;
        }
        onNavigationEvent(-1462205747, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function1, obj}, 1462205754, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i3 = 66 / 0;
    }

    public static /* synthetic */ Unit onExtraCallback(TransferDutchAmountActivity transferDutchAmountActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 81;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(transferDutchAmountActivity, th);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(transferDutchAmountActivity, th);
        int i3 = access100 + 23;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(TransferDutchAmountActivity transferDutchAmountActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted(transferDutchAmountActivity, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(transferDutchAmountActivity, setDetectableSize);
        int i3 = access100 + 59;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TransferDutchAmountActivity transferDutchAmountActivity = (TransferDutchAmountActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 117;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(transferDutchAmountActivity, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = writeTypedObject + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ List onExtraCallbackWithResult(TransferDutchAmountActivity transferDutchAmountActivity) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List listOnTransact = onTransact(transferDutchAmountActivity);
        int i4 = writeTypedObject + 65;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return listOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i4 = access100 + 119;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferDutchAmountActivity transferDutchAmountActivity, addOperation addoperation) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(1741031879, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{transferDutchAmountActivity, addoperation}, -1741031870, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = writeTypedObject + 35;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v7, types: [android.app.Activity, android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.send.dutch.TransferDutchAmountActivity] */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        bringChildToFront.onExtraCallbackWithResult onextracallbackwithresult;
        String strIntern;
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i4 | i9;
        int i11 = ~i4;
        int i12 = i9 | (~(i11 | i));
        int i13 = (~(i2 | i7 | i4)) | (~(i8 | i11 | i7));
        int i14 = i + i4 + i3 + ((-619979367) * i6) + (68302741 * i5);
        int i15 = i14 * i14;
        int i16 = (i * 561304900) + 382271488 + (561304900 * i4) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i3) + (1615200256 * i6) + ((-1821507584) * i5) + (428933120 * i15);
        int i17 = ((i * (-96142684)) - 56799437) + (i4 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i3 * (-96141863)) + (i6 * (-1380774991)) + (i5 * (-1175232947)) + (i15 * (-118947840));
        switch (i16 + (i17 * i17 * (-1369505792))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                TransferDutchAmountActivity transferDutchAmountActivity = (TransferDutchAmountActivity) objArr[0];
                accessgetReactApplicationContextIfActiveOrWarn accessgetreactapplicationcontextifactiveorwarn = (accessgetReactApplicationContextIfActiveOrWarn) objArr[1];
                int i18 = 2 % 2;
                int size = transferDutchAmountActivity.asBinder.size();
                if (accessgetreactapplicationcontextifactiveorwarn.onExtraCallback() >= 0) {
                    if (accessgetreactapplicationcontextifactiveorwarn.onWarmupCompleted().length() > 0) {
                        return new bringChildToFront(size, accessgetreactapplicationcontextifactiveorwarn.onWarmupCompleted(), bringChildToFront.onExtraCallbackWithResult.PHONE, accessgetreactapplicationcontextifactiveorwarn.onNavigationEvent(), null, 16, null);
                    }
                    bringChildToFront bringchildtofront = new bringChildToFront(size, String.valueOf(accessgetreactapplicationcontextifactiveorwarn.onExtraCallback()), bringChildToFront.onExtraCallbackWithResult.USER, accessgetreactapplicationcontextifactiveorwarn.onNavigationEvent(), TitleBarRightButtonView.onExtraCallback.onExtraCallback(accessgetreactapplicationcontextifactiveorwarn.onExtraCallback()));
                    int i19 = access100 + 33;
                    writeTypedObject = i19 % 128;
                    int i20 = i19 % 2;
                    return bringchildtofront;
                }
                if (accessgetreactapplicationcontextifactiveorwarn.onWarmupCompleted().length() > 0) {
                    int i21 = writeTypedObject + 91;
                    access100 = i21 % 128;
                    int i22 = i21 % 2;
                    onextracallbackwithresult = bringChildToFront.onExtraCallbackWithResult.USER;
                } else {
                    onextracallbackwithresult = bringChildToFront.onExtraCallbackWithResult.UNKNOWN;
                }
                bringChildToFront.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                if (accessgetreactapplicationcontextifactiveorwarn.onWarmupCompleted().length() > 0) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{26031, 56296, 6405, 24230, 40152, 53818, 5066, 20885, 38764, 54400, 2600, 18522, 35306, 53051, 3347, 17126, 32792, 49599, 2002, 17704, 47794, 63709, 15930, 32643, 48419, 62280, 12428, 30253, 46151, 62971, 11074, 26795, 44746, 60443, 11772, 25542, 41337, 59023, 9251, 39539, 56211, 6449, 24324, 40170, 53766, 4190, 20988, 38663, 54459, 2776, 18476, 35207, 53207, 3428, 17115, 32826, 50753, 2019}, 48731 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                } else {
                    int i23 = access100 + 3;
                    writeTypedObject = i23 % 128;
                    int i24 = i23 % 2;
                    strIntern = "";
                }
                return new bringChildToFront(size, size + "_user", onextracallbackwithresult2, accessgetreactapplicationcontextifactiveorwarn.onNavigationEvent(), strIntern);
            case 5:
                TransferDutchAmountActivity transferDutchAmountActivity2 = (TransferDutchAmountActivity) objArr[0];
                int i25 = 2 % 2;
                int i26 = access100 + 67;
                writeTypedObject = i26 % 128;
                int i27 = i26 % 2;
                CMS_EncryptedDataWithEncryptKey cMS_EncryptedDataWithEncryptKeyValidateRelationship = transferDutchAmountActivity2.validateRelationship();
                int i28 = writeTypedObject + 121;
                access100 = i28 % 128;
                int i29 = i28 % 2;
                return cMS_EncryptedDataWithEncryptKeyValidateRelationship;
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                ?? r14 = (TransferDutchAmountActivity) objArr[0];
                addOperation addoperation = (addOperation) objArr[1];
                int i30 = 2 % 2;
                int i31 = access100 + 113;
                writeTypedObject = i31 % 128;
                int i32 = i31 % 2;
                boolean booleanExtra = r14.getIntent().getBooleanExtra("routeToListOnCompleted", false);
                TransferDutchCompleteActivity.IAuthTabCallback iAuthTabCallback = TransferDutchCompleteActivity.Companion;
                Intrinsics.checkNotNull(addoperation);
                List<accessgetReactApplicationContextIfActiveOrWarn> listUpdateVisuals = r14.updateVisuals();
                Intent intent = r14.getIntent();
                Object[] objArr3 = new Object[1];
                a(new char[]{26037, 38705, 32903, 45595, 45049, 55658, 51920, 51120}, (ViewConfiguration.getTapTimeout() >> 16) + 62099, objArr3);
                r14.startActivity(iAuthTabCallback.IAuthTabCallback(r14, addoperation, listUpdateVisuals, booleanExtra, intent.getStringExtra(((String) objArr3[0]).intern())));
                r14.onNavigationEvent().IAuthTabCallbackStub();
                r14.setResult(-1);
                r14.finish();
                Unit unit = Unit.INSTANCE;
                int i33 = writeTypedObject + 19;
                access100 = i33 % 128;
                int i34 = i33 % 2;
                return unit;
            case 10:
                return asBinder(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ ArrayList onNavigationEvent(TransferDutchAmountActivity transferDutchAmountActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(transferDutchAmountActivity);
            throw null;
        }
        ArrayList arrayListIAuthTabCallbackDefault = IAuthTabCallbackDefault(transferDutchAmountActivity);
        int i3 = access100 + 121;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return arrayListIAuthTabCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TransferDutchAmountActivity transferDutchAmountActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(transferDutchAmountActivity, deserializeurinullablecollection);
        int i4 = access100 + 11;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransferDutchAmountActivity transferDutchAmountActivity, ArrayList arrayList) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(transferDutchAmountActivity, arrayList);
        int i4 = writeTypedObject + 115;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = access100 + 93;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = i3 + 121;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public final class onNavigationEvent {
        private final View IAuthTabCallback;
        private final View IAuthTabCallbackDefault;
        private final TdsImageView asBinder;
        final /* synthetic */ TransferDutchAmountActivity onExtraCallback;
        private final TextView onExtraCallbackWithResult;
        private final bringChildToFront onNavigationEvent;
        private final NumberEditText onWarmupCompleted;

        public static final class IAuthTabCallback implements getAdService {
            final /* synthetic */ Configuration IAuthTabCallback;

            public IAuthTabCallback(Configuration configuration) {
                this.IAuthTabCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onExtraCallbackWithResult implements getAdService {
            final /* synthetic */ Configuration onExtraCallbackWithResult;

            public onExtraCallbackWithResult(Configuration configuration) {
                this.onExtraCallbackWithResult = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        /* renamed from: viva.republica.toss.send.dutch.TransferDutchAmountActivity$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0033onNavigationEvent implements getAdService {
            final /* synthetic */ Configuration onNavigationEvent;

            public C0033onNavigationEvent(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onWarmupCompleted implements getAdService {
            final /* synthetic */ Configuration onWarmupCompleted;

            public onWarmupCompleted(Configuration configuration) {
                this.onWarmupCompleted = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(@NotNull TransferDutchAmountActivity transferDutchAmountActivity, @NotNull bringChildToFront bringchildtofront, View view) {
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback;
            String strIAuthTabCallback;
            Intrinsics.checkNotNullParameter(bringchildtofront, "");
            Intrinsics.checkNotNullParameter(view, "");
            this.onExtraCallback = transferDutchAmountActivity;
            this.onNavigationEvent = bringchildtofront;
            this.IAuthTabCallbackDefault = view;
            TdsImageView tdsImageViewFindViewById = view.findViewById(R.id.thumb_text);
            Intrinsics.checkNotNullExpressionValue(tdsImageViewFindViewById, "");
            TdsImageView tdsImageView = tdsImageViewFindViewById;
            this.asBinder = tdsImageView;
            View viewFindViewById = view.findViewById(R.id.name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            TextView textView = (TextView) viewFindViewById;
            this.onExtraCallbackWithResult = textView;
            View viewFindViewById2 = view.findViewById(R.id.remove);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.IAuthTabCallback = viewFindViewById2;
            NumberEditText numberEditTextFindViewById = view.findViewById(R.id.input_amount);
            Intrinsics.checkNotNullExpressionValue(numberEditTextFindViewById, "");
            NumberEditText numberEditText = numberEditTextFindViewById;
            this.onWarmupCompleted = numberEditText;
            if (bringchildtofront.onNavigationEvent().length() > 0) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                onnavigationeventOnExtraCallback = RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(bringchildtofront.onNavigationEvent()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new Plugin(0.0f, 0.0f, 0.0f, 0, 0, 31, (DefaultConstructorMarker) null)});
            } else {
                int i = onExtraCallback.onWarmupCompleted[bringchildtofront.onExtraCallbackWithResult().ordinal()];
                if (i == 1) {
                    Long longOrNull = StringsKt.toLongOrNull(bringchildtofront.onExtraCallback());
                    long jLongValue = longOrNull != null ? longOrNull.longValue() : -1L;
                    Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    onnavigationeventOnExtraCallback = getMediationService.onExtraCallback(new getMediationService(context2).onNavigationEvent(jLongValue), null, 1, null);
                } else if (i == 2) {
                    String strOnExtraCallback = bringchildtofront.onExtraCallback();
                    Context context3 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    onnavigationeventOnExtraCallback = getMediationService.onExtraCallback(new getMediationService(context3).onExtraCallback(strOnExtraCallback), null, 1, null);
                } else if (i == 3) {
                    Context context4 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context4).onExtraCallback(Integer.valueOf(R.drawable.profile_nonmember));
                } else {
                    Context context5 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    onnavigationeventOnExtraCallback = getMediationService.onExtraCallback(new getMediationService(context5), null, 1, null);
                }
            }
            TdsImageView.setImage$default(tdsImageView, onnavigationeventOnExtraCallback, (Function1) null, (Function1) null, 6, (Object) null);
            tdsImageView.setOnClickListener(null);
            viewFindViewById2.setVisibility(8);
            if (bringchildtofront.IAuthTabCallbackDefault()) {
                strIAuthTabCallback = transferDutchAmountActivity.getString(R.string.app_send_dutch___811e029344);
            } else {
                String strOnWarmupCompleted = bringchildtofront.onWarmupCompleted();
                strIAuthTabCallback = strOnWarmupCompleted == null ? bringchildtofront.IAuthTabCallback() : strOnWarmupCompleted;
            }
            textView.setText(strIAuthTabCallback);
            numberEditText.onExtraCallbackWithResult(transferDutchAmountActivity.IAuthTabCallback());
            numberEditText.setOnFocusChangeListener(new TransferDutchAmountActivity$LinkRow$.ExternalSyntheticLambda0(this, numberEditText));
            numberEditText.setOnEditorActionListener(new TransferDutchAmountActivity$LinkRow$.ExternalSyntheticLambda1(numberEditText, transferDutchAmountActivity));
            view.setOnClickListener(new TransferDutchAmountActivity$LinkRow$.ExternalSyntheticLambda2(this));
        }

        public final bringChildToFront IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public final NumberEditText onWarmupCompleted() {
            return this.onWarmupCompleted;
        }

        public static void onExtraCallback(onNavigationEvent onnavigationevent, NumberEditText numberEditText, View view, boolean z) {
            int iIntValue;
            if (onnavigationevent.onExtraCallback() || z) {
                Context context = numberEditText.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iIntValue = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
            } else {
                Context context2 = numberEditText.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                iIntValue = new getUrlokhttp(new IAuthTabCallback(configuration2)).ICustomTabsCallbackStubProxy();
            }
            onnavigationevent.onExtraCallback(iIntValue);
        }

        public static boolean onExtraCallbackWithResult(NumberEditText numberEditText, TransferDutchAmountActivity transferDutchAmountActivity, TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            M_.onExtraCallback.onExtraCallback(numberEditText);
            ((CMS_EncryptedDataWithEncryptKey) TransferDutchAmountActivity.onNavigationEvent(-537313150, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{transferDutchAmountActivity}, 537313155, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).asBinder.requestFocus();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onNavigationEvent(onNavigationEvent onnavigationevent, View view) {
            Object[] objArr = {M_.onExtraCallback, onnavigationevent.onWarmupCompleted};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            M_.onNavigationEvent(1312897292, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
            onnavigationevent.IAuthTabCallbackDefault.post(new TransferDutchAmountActivity$LinkRow$.ExternalSyntheticLambda3(onnavigationevent));
        }

        public static void IAuthTabCallback(onNavigationEvent onnavigationevent) {
            onnavigationevent.onWarmupCompleted.selectAll();
        }

        public final boolean onExtraCallback() {
            return this.onWarmupCompleted.isSelected();
        }

        public final void onWarmupCompleted(boolean z) {
            int iICustomTabsCallbackStubProxy;
            this.onWarmupCompleted.setSelected(z);
            if (z) {
                Configuration configuration = this.onExtraCallback.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iICustomTabsCallbackStubProxy = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new C0033onNavigationEvent(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
            } else {
                Configuration configuration2 = this.onExtraCallback.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                iICustomTabsCallbackStubProxy = new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).ICustomTabsCallbackStubProxy();
            }
            onExtraCallback(iICustomTabsCallbackStubProxy);
        }

        private final void onExtraCallback(int i) {
            this.onWarmupCompleted.setTextColor(i);
        }
    }

    public static final class onWarmupCompleted implements Function0<CMS_EncryptedDataWithEncryptKey> {
        final /* synthetic */ Activity IAuthTabCallback;

        public onWarmupCompleted(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CMS_EncryptedDataWithEncryptKey invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_EncryptedDataWithEncryptKey.onWarmupCompleted(layoutInflater);
        }
    }

    public static final class IAuthTabCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<addOperation> apply(writeRaw<BaseApiResponse<addOperation>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass5 anonymousClass5 = new Function1<BaseApiResponse<addOperation>, deserializeIp<? extends addOperation>>() { // from class: viva.republica.toss.send.dutch.TransferDutchAmountActivity.IAuthTabCallback.5
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends addOperation> invoke(BaseApiResponse<addOperation> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = addOperation.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass5) { // from class: o.UtilsKtExternalSyntheticLambda17$handleOnBackCancelled
                private final /* synthetic */ Function1 onWarmupCompleted;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass5, "");
                    this.onWarmupCompleted = anonymousClass5;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onWarmupCompleted.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final /* synthetic */ long IAuthTabCallback(TransferDutchAmountActivity transferDutchAmountActivity) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 107;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            long j = transferDutchAmountActivity.IAuthTabCallbackStubProxy;
            throw null;
        }
        long j2 = transferDutchAmountActivity.IAuthTabCallbackStubProxy;
        int i4 = i2 + 115;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return j2;
    }

    public static final /* synthetic */ long IAuthTabCallbackStub(TransferDutchAmountActivity transferDutchAmountActivity) {
        long jICustomTabsServiceStubProxy;
        int i = 2 % 2;
        int i2 = writeTypedObject + 43;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            jICustomTabsServiceStubProxy = transferDutchAmountActivity.ICustomTabsServiceStubProxy();
            int i3 = 69 / 0;
        } else {
            jICustomTabsServiceStubProxy = transferDutchAmountActivity.ICustomTabsServiceStubProxy();
        }
        int i4 = writeTypedObject + 103;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return jICustomTabsServiceStubProxy;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TransferDutchAmountActivity transferDutchAmountActivity = (TransferDutchAmountActivity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 105;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<onNavigationEvent> arrayList = transferDutchAmountActivity.IAuthTabCallbackDefault;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 101;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public static final /* synthetic */ void asBinder(TransferDutchAmountActivity transferDutchAmountActivity) {
        int i = 2 % 2;
        int i2 = access100 + 71;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        transferDutchAmountActivity.IEngagementSignalsCallbackDefault();
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ long asInterface(TransferDutchAmountActivity transferDutchAmountActivity) throws NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return ((Long) onNavigationEvent(1296234202, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132031991).substring(0, 7).codePointAt(4) - 1675519964, new Object[]{transferDutchAmountActivity}, -1296234202, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1150997004)).longValue();
        }
        ((Long) onNavigationEvent(1296234202, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), (-1675519964) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132031991).substring(0, 7).codePointAt(4), new Object[]{transferDutchAmountActivity}, -1296234202, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1150997004)).longValue();
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(TransferDutchAmountActivity transferDutchAmountActivity, NumberEditText numberEditText) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        transferDutchAmountActivity.onWarmupCompleted(numberEditText);
        int i4 = writeTypedObject + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final CMS_EncryptedDataWithEncryptKey validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CMS_EncryptedDataWithEncryptKey cMS_EncryptedDataWithEncryptKey = (CMS_EncryptedDataWithEncryptKey) this.onTransact.getValue();
        int i4 = writeTypedObject + 121;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return cMS_EncryptedDataWithEncryptKey;
        }
        throw null;
    }

    private final List<accessgetReactApplicationContextIfActiveOrWarn> updateVisuals() {
        int i = 2 % 2;
        int i2 = access100 + 25;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<accessgetReactApplicationContextIfActiveOrWarn> list = (List) this.asInterface.getValue();
        int i3 = writeTypedObject + 53;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List onTransact(TransferDutchAmountActivity transferDutchAmountActivity) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = transferDutchAmountActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        if (i3 != 0) {
            ArrayList arrayListOnNavigationEvent = EncoderImplExternalSyntheticLambda3.onNavigationEvent(intent, "dutchInvitations", accessgetReactApplicationContextIfActiveOrWarn.class);
            if (arrayListOnNavigationEvent == null) {
                return CollectionsKt.emptyList();
            }
            int i4 = writeTypedObject + 81;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 0;
            }
            return arrayListOnNavigationEvent;
        }
        EncoderImplExternalSyntheticLambda3.onNavigationEvent(intent, "dutchInvitations", accessgetReactApplicationContextIfActiveOrWarn.class);
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 123;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, TextUtils.lastIndexOf("", '0', 0, 0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() + (access000 % 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), TextUtils.indexOf("", "", 0, 0) + 59, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (access000 ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 60, 6383 - (KeyEvent.getMaxKeyCode() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 41;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 4;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $11 + 67;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.getMode(0) + 59, (ViewConfiguration.getPressedStateDuration() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i9 = 72 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, (KeyEvent.getMaxKeyCode() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i10 = $11 + 111;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 / 3;
            }
        }
        objArr[0] = new String(cArr2);
    }

    public final DomainConfigProxy onNavigationEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        DomainConfigProxy domainConfigProxy = this.homeChangeHelper;
        Object obj = null;
        if (domainConfigProxy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = writeTypedObject + 71;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = i3 + 93;
        writeTypedObject = i7 % 128;
        if (i7 % 2 != 0) {
            return domainConfigProxy;
        }
        obj.hashCode();
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return "dutch__request_detail";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 63;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(new char[]{26037, 38705, 32903, 45595, 45049, 55658, 51920, 51120}, TextUtils.lastIndexOf("", '0', 0, 0) + 62100, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            int i4 = access100 + 87;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{26037, 38705, 32903, 45595, 45049, 55658, 51920, 51120}, (ViewConfiguration.getLongPressTimeout() >> 16) + 62099, objArr2);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), stringExtra)});
        int i6 = access100 + 65;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return mapIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchAmountActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(validateRelationship().getRoot());
        ConstraintLayout root = validateRelationship().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, validateRelationship().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = access100 + 17;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onNavigationEvent(true);
        }
        this.IAuthTabCallbackStubProxy = getIntent().getLongExtra("amount", 0L);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        List<accesssetEnqueuedAnimationOnFramep> listOnNavigationEvent = EncoderImplExternalSyntheticLambda3.onNavigationEvent(intent, "dutchPayments", accesssetEnqueuedAnimationOnFramep.class);
        if (listOnNavigationEvent == null) {
            int i4 = writeTypedObject + 27;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            listOnNavigationEvent = CollectionsKt.emptyList();
        }
        this.getInterfaceDescriptor = listOnNavigationEvent;
        IEngagementSignalsCallbackStub();
        onSessionEnded();
        writeTypedList();
        access200();
        int i6 = access100 + 105;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    private final int ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access100 + 109;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int size = this.IAuthTabCallbackDefault.size();
        int i4 = writeTypedObject + 111;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = access100 + 65;
        writeTypedObject = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, viva.republica.toss.send.dutch.TransferDutchAmountActivity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String string;
        ?? r0 = (TransferDutchAmountActivity) objArr[0];
        enableAccessibilityOrder.onExtraCallbackWithResult onextracallbackwithresult = (enableAccessibilityOrder.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = r0.validateRelationship().onNavigationEvent.onWarmupCompleted();
        if (!onextracallbackwithresult.isOpen()) {
            string = r0.getString(R.string.app_send_dutch___505f16c9a0);
        } else {
            int i2 = writeTypedObject + 73;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            string = r0.getString(im.toss.uikit.R.string.uikit_confirm);
        }
        tdsButtonV1ViewOnWarmupCompleted.setText(string);
        r0.IEngagementSignalsCallbackStubProxy();
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 105;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = enableAccessibilityOrder.onExtraCallbackWithResult.IAuthTabCallback(this).IAuthTabCallback(new TransferDutchAmountActivity$.ExternalSyntheticLambda1(new TransferDutchAmountActivity$.ExternalSyntheticLambda0(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
        int i2 = writeTypedObject + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(TransferDutchAmountActivity transferDutchAmountActivity, View view) {
        int i = 2 % 2;
        new TransferDutchPaymentsBottomSheet(transferDutchAmountActivity, transferDutchAmountActivity.getInterfaceDescriptor).show();
        int i2 = access100 + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSessionEnded() throws Throwable {
        int i = 2 % 2;
        CMS_EncryptedDataWithEncryptKey cMS_EncryptedDataWithEncryptKeyValidateRelationship = validateRelationship();
        TdsListRowV1View tdsListRowV1View = cMS_EncryptedDataWithEncryptKeyValidateRelationship.IAuthTabCallback;
        if (this.getInterfaceDescriptor.isEmpty()) {
            Intrinsics.checkNotNull(tdsListRowV1View);
            tdsListRowV1View.setVisibility(8);
        } else {
            accesssetEnqueuedAnimationOnFramep accesssetenqueuedanimationonframep = (accesssetEnqueuedAnimationOnFramep) CollectionsKt.first(this.getInterfaceDescriptor);
            if (accesssetenqueuedanimationonframep.onWarmupCompleted()) {
                int i2 = access100 + 27;
                writeTypedObject = i2 % 128;
                int i3 = i2 % 2;
                tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.LOTTIE);
                Intrinsics.checkNotNull(tdsListRowV1View);
                TdsListRowV1View.setLeftLottieUrl$default(tdsListRowV1View, accesssetenqueuedanimationonframep.onNavigationEvent(), 0, 2, (Object) null);
                DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
                DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                tdsListRowV1View.setLeftLottieSize(iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics2));
            } else {
                tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext());
                String strOnExtraCallback = accesssetenqueuedanimationonframep.onExtraCallback();
                if (strOnExtraCallback == null) {
                    int i4 = access100 + 37;
                    writeTypedObject = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        a(new char[]{26031, 59252, 24637, 60898, 28328, 59422, 30018, 63129, 29580, 64844, 32352, 64318, 17658, 49599, 17163, 52250, 18904, 51843, 21578, 53548, 21026, 57337, 22770, 55890, 9995, 41179, 11742, 44883, 10336, 46371, 14075, 46065, 15703, 48654, 15310, 34013, 1551, 33660, 3170, 35327, 2748, 38006, 4428, 37580, 8090, 39248, 6761, 26467, 57589, 28081, 61301, 26627, 62917, 30359, 61528, 32040, 65087, 31718, 50358}, Drawable.resolveOpacity(1, 1) * 33479, objArr);
                        strOnExtraCallback = ((String) objArr[0]).intern();
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{26031, 59252, 24637, 60898, 28328, 59422, 30018, 63129, 29580, 64844, 32352, 64318, 17658, 49599, 17163, 52250, 18904, 51843, 21578, 53548, 21026, 57337, 22770, 55890, 9995, 41179, 11742, 44883, 10336, 46371, 14075, 46065, 15703, 48654, 15310, 34013, 1551, 33660, 3170, 35327, 2748, 38006, 4428, 37580, 8090, 39248, 6761, 26467, 57589, 28081, 61301, 26627, 62917, 30359, 61528, 32040, 65087, 31718, 50358}, Drawable.resolveOpacity(0, 0) + 33479, objArr2);
                        strOnExtraCallback = ((String) objArr2[0]).intern();
                    }
                    int i5 = access100 + 23;
                    writeTypedObject = i5 % 128;
                    int i6 = i5 % 2;
                }
                tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationevent.onExtraCallback(strOnExtraCallback), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(0.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 61, (DefaultConstructorMarker) null)}));
                DisplayMetrics displayMetrics3 = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                int iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics3);
                DisplayMetrics displayMetrics4 = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                tdsListRowV1View.setLeftImageSize(iOnNavigationEvent2, varyMatches.onNavigationEvent(24, displayMetrics4));
            }
            if (this.getInterfaceDescriptor.size() > 1) {
                int i7 = access100 + 71;
                writeTypedObject = i7 % 128;
                int i8 = i7 % 2;
                String strOnExtraCallbackWithResult = accesssetenqueuedanimationonframep.onExtraCallbackWithResult();
                charSequenceOnNavigationEvent = new SpannableStringBuilder(strOnExtraCallbackWithResult != null ? BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strOnExtraCallbackWithResult, false, 1, (Object) null) : null).append((CharSequence) getString(R.string.app_send_dutch___0e70fcf4d4, Integer.valueOf(this.getInterfaceDescriptor.size() - 1)));
            } else {
                String strOnExtraCallbackWithResult2 = accesssetenqueuedanimationonframep.onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult2 != null) {
                    charSequenceOnNavigationEvent = BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strOnExtraCallbackWithResult2, false, 1, (Object) null);
                }
            }
            tdsListRowV1View.setCenterText1(charSequenceOnNavigationEvent);
            tdsListRowV1View.setOnClickListener(new TransferDutchAmountActivity$.ExternalSyntheticLambda6(this));
            Intrinsics.checkNotNull(tdsListRowV1View);
            tdsListRowV1View.setVisibility(0);
        }
        cMS_EncryptedDataWithEncryptKeyValidateRelationship.onNavigationEvent.findViewById(R.id.gradient).setVisibility(8);
        TdsScrollView tdsScrollView = cMS_EncryptedDataWithEncryptKeyValidateRelationship.onExtraCallback;
        tdsScrollView.setVerticalFadingEdgeEnabled(true);
        DisplayMetrics displayMetrics5 = tdsScrollView.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        tdsScrollView.setFadingEdgeLength(varyMatches.onNavigationEvent(Float.valueOf(34.0f), displayMetrics5));
        tdsScrollView.setFadingEdgeType(2);
    }

    private final void access200() {
        int i = 2 % 2;
        ArrayList<bringChildToFront> arrayList = this.asBinder;
        arrayList.clear();
        arrayList.add(new bringChildToFront(0L, PlayerErrorCode.onMinimized(), bringChildToFront.onExtraCallbackWithResult.USER, PlayerErrorCode.onPostMessage(), null, 16, null));
        Iterator<T> it = updateVisuals().iterator();
        while (it.hasNext()) {
            int i2 = access100 + 33;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {this, (accessgetReactApplicationContextIfActiveOrWarn) it.next()};
                arrayList.add((bringChildToFront) onNavigationEvent(-1800274553, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 1800274557, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = {this, (accessgetReactApplicationContextIfActiveOrWarn) it.next()};
            arrayList.add((bringChildToFront) onNavigationEvent(-1800274553, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, 1800274557, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback()));
        }
        onVerticalScrollEvent();
    }

    private static final ArrayList IAuthTabCallbackDefault(TransferDutchAmountActivity transferDutchAmountActivity) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (bringChildToFront bringchildtofront : transferDutchAmountActivity.asBinder) {
            int i2 = writeTypedObject + 109;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            View viewICustomTabsService_Parcel = transferDutchAmountActivity.ICustomTabsService_Parcel();
            viewICustomTabsService_Parcel.setTag(bringchildtofront);
            arrayList.add(viewICustomTabsService_Parcel);
        }
        int i4 = access100 + 75;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return arrayList;
    }

    private final void onVerticalScrollEvent() {
        int i = 2 % 2;
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new TransferDutchAmountActivity$.ExternalSyntheticLambda3(this));
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        Object obj = null;
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new TransferDutchAmountActivity$.ExternalSyntheticLambda4(), new TransferDutchAmountActivity$.ExternalSyntheticLambda5(this));
        int i2 = writeTypedObject + 123;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(TransferDutchAmountActivity transferDutchAmountActivity, ArrayList arrayList) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (!transferDutchAmountActivity.isFinishing()) {
            int i4 = access100 + 17;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNull(arrayList);
            transferDutchAmountActivity.onExtraCallbackWithResult((ArrayList<View>) arrayList);
            transferDutchAmountActivity.onGreatestScrollPercentageIncreased();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = access100 + 103;
        writeTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 2 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("TransferDutchAmountActivity", th);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("TransferDutchAmountActivity", th);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void onExtraCallbackWithResult(ArrayList<View> arrayList) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        for (View view : arrayList) {
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "");
            validateRelationship().asBinder.addView(view);
            this.IAuthTabCallbackDefault.add(new onNavigationEvent(this, (bringChildToFront) tag, view));
        }
        int i4 = access100 + 87;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        access100 = i2 % 128;
        View viewInflate = i2 % 2 != 0 ? LayoutInflater.from(this).inflate(R.layout.row_transfer_dutch_item_v2, (ViewGroup) validateRelationship().asBinder, true) : LayoutInflater.from(this).inflate(R.layout.row_transfer_dutch_item_v2, (ViewGroup) validateRelationship().asBinder, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        int i3 = writeTypedObject + 91;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return viewInflate;
        }
        throw null;
    }

    private final void writeTypedList() {
        int i = 2 % 2;
        validateRelationship().onNavigationEvent.onWarmupCompleted().setOnClickListener(new TransferDutchAmountActivity$.ExternalSyntheticLambda7(this));
        int i2 = access100 + 97;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(TransferDutchAmountActivity transferDutchAmountActivity, View view) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (!enableAccessibilityOrder.onExtraCallbackWithResult.onNavigationEvent(transferDutchAmountActivity).isOpen()) {
            Object[] objArr = {transferDutchAmountActivity};
            onNavigationEvent(186776175, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019718).substring(0, 20).codePointAt(11) + 1446958319, objArr, -186776165, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            return;
        }
        ArrayList<onNavigationEvent> arrayList = transferDutchAmountActivity.IAuthTabCallbackDefault;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((onNavigationEvent) it.next()).onWarmupCompleted());
            int i2 = writeTypedObject + 59;
            access100 = i2 % 128;
            int i3 = i2 % 2;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            int i4 = access100 + 67;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Object next = it2.next();
            if (((NumberEditText) next).hasFocus()) {
                obj = next;
                break;
            }
        }
        NumberEditText numberEditText = (NumberEditText) obj;
        if (numberEditText != null) {
            int i6 = access100 + 61;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            M_.onExtraCallback.onExtraCallback(numberEditText);
        }
        transferDutchAmountActivity.validateRelationship().asBinder.requestFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 83;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(R.string.dutch_pay_header_text, getLongName.onNavigationEvent(this.IAuthTabCallbackStubProxy, (ParamImpl) null, 1, (Object) null), Integer.valueOf(ICustomTabsServiceStub()));
        Intrinsics.checkNotNullExpressionValue(string, "");
        validateRelationship().onExtraCallbackWithResult.setUpperText(mergeParams.IAuthTabCallback(string, false, 1, (Object) null));
        int i4 = writeTypedObject + 121;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(TransferDutchAmountActivity transferDutchAmountActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(transferDutchAmountActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 75;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = access100 + 85;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(TransferDutchAmountActivity transferDutchAmountActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        transferDutchAmountActivity.bo_();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 41;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(TransferDutchAmountActivity transferDutchAmountActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, transferDutchAmountActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 16, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, transferDutchAmountActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 119;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asBinder(java.lang.Object[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchAmountActivity.asBinder(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit onWarmupCompleted(TransferDutchAmountActivity transferDutchAmountActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click");
        setDetectableSize.onExtraCallback().put("amount", Long.valueOf(transferDutchAmountActivity.IAuthTabCallbackStubProxy));
        setDetectableSize.onExtraCallback().put("member_cnt", Integer.valueOf(transferDutchAmountActivity.ICustomTabsServiceStub()));
        setDetectableSize.onExtraCallback().put("screen_name", transferDutchAmountActivity.getScreenName());
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final long ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        ArrayList<onNavigationEvent> arrayList = this.IAuthTabCallbackDefault;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (!(!it.hasNext())) {
            int i2 = access100 + 85;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Object next = it.next();
            if (!(!((onNavigationEvent) next).onExtraCallback())) {
                int i4 = writeTypedObject + 93;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        double dDoubleValue = 0.0d;
        while (it2.hasNext()) {
            int i6 = access100 + 87;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            dDoubleValue += ((onNavigationEvent) it2.next()).onWarmupCompleted().onNavigationEvent().doubleValue();
        }
        return Math.min(2000000L, this.IAuthTabCallbackStubProxy - ((long) dDoubleValue));
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TransferDutchAmountActivity transferDutchAmountActivity = (TransferDutchAmountActivity) objArr[0];
        int i = 2 % 2;
        ArrayList<onNavigationEvent> arrayList = transferDutchAmountActivity.IAuthTabCallbackDefault;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        int i2 = writeTypedObject + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                if (arrayList2.size() != 1) {
                    return 0L;
                }
                ArrayList<onNavigationEvent> arrayList3 = transferDutchAmountActivity.IAuthTabCallbackDefault;
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    int i4 = access100 + 105;
                    writeTypedObject = i4 % 128;
                    if (i4 % 2 == 0) {
                        ((onNavigationEvent) it2.next()).onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    Object next = it2.next();
                    if (((onNavigationEvent) next).onExtraCallback()) {
                        arrayList4.add(next);
                    }
                }
                Iterator it3 = arrayList4.iterator();
                double dDoubleValue = 0.0d;
                while (it3.hasNext()) {
                    int i5 = writeTypedObject + 15;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    dDoubleValue += ((onNavigationEvent) it3.next()).onWarmupCompleted().onNavigationEvent().doubleValue();
                }
                return Long.valueOf(transferDutchAmountActivity.IAuthTabCallbackStubProxy - ((long) dDoubleValue));
            }
            Object next2 = it.next();
            if (!((onNavigationEvent) next2).onExtraCallback()) {
                int i7 = access100 + 23;
                writeTypedObject = i7 % 128;
                if (i7 % 2 == 0) {
                    arrayList2.add(next2);
                    obj.hashCode();
                    throw null;
                }
                arrayList2.add(next2);
                int i8 = writeTypedObject + 65;
                access100 = i8 % 128;
                int i9 = i8 % 2;
            }
        }
    }

    private final void onGreatestScrollPercentageIncreased() throws Throwable {
        long j;
        Long lValueOf;
        int i = 2 % 2;
        int size = this.IAuthTabCallbackDefault.size();
        if (size != 0) {
            ArrayList<onNavigationEvent> arrayList = this.IAuthTabCallbackDefault;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((onNavigationEvent) obj).onExtraCallback()) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                int i2 = writeTypedObject + 31;
                access100 = i2 % 128;
                dDoubleValue = i2 % 2 != 0 ? dDoubleValue - ((onNavigationEvent) it.next()).onWarmupCompleted().onNavigationEvent().doubleValue() : dDoubleValue + ((onNavigationEvent) it.next()).onWarmupCompleted().onNavigationEvent().doubleValue();
            }
            long j2 = this.IAuthTabCallbackStubProxy - ((long) dDoubleValue);
            int size2 = size - arrayList2.size();
            if (size2 <= 0) {
                j2 = this.IAuthTabCallbackStubProxy;
            }
            if (size2 > 0) {
                size = size2;
            }
            long j3 = j2 / size;
            long j4 = j2 - ((size - 1) * j3);
            ArrayList<onNavigationEvent> arrayList3 = this.IAuthTabCallbackDefault;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it2 = arrayList3.iterator();
            while (true) {
                Object obj2 = null;
                if (it2.hasNext()) {
                    Object next = it2.next();
                    onNavigationEvent onnavigationevent = (onNavigationEvent) next;
                    if (size2 > 0) {
                        int i3 = writeTypedObject + 1;
                        access100 = i3 % 128;
                        if (i3 % 2 != 0) {
                            onnavigationevent.onExtraCallback();
                            throw null;
                        }
                        if (!onnavigationevent.onExtraCallback()) {
                        }
                    }
                    arrayList4.add(next);
                } else {
                    int i4 = 0;
                    for (Object obj3 : arrayList4) {
                        if (i4 < 0) {
                            int i5 = writeTypedObject + 13;
                            access100 = i5 % 128;
                            int i6 = i5 % 2;
                            CollectionsKt.throwIndexOverflow();
                        }
                        onNavigationEvent onnavigationevent2 = (onNavigationEvent) obj3;
                        if (size2 <= 0) {
                            onnavigationevent2.onWarmupCompleted(false);
                        }
                        onnavigationevent2.onWarmupCompleted().onExtraCallback(this.IAuthTabCallback_Parcel);
                        NumberEditText numberEditTextOnWarmupCompleted = onnavigationevent2.onWarmupCompleted();
                        if (size2 > 0) {
                            int i7 = access100 + 51;
                            writeTypedObject = i7 % 128;
                            int i8 = i7 % 2;
                            lValueOf = Long.valueOf(i4 == 0 ? j4 : j3);
                        } else {
                            if (onnavigationevent2.IAuthTabCallback().IAuthTabCallbackDefault()) {
                                int i9 = access100 + 5;
                                writeTypedObject = i9 % 128;
                                if (i9 % 2 == 0) {
                                    int i10 = 66 / 0;
                                }
                                j = j4;
                            } else {
                                j = j3;
                            }
                            lValueOf = Long.valueOf(j);
                        }
                        numberEditTextOnWarmupCompleted.setNumber(lValueOf);
                        onnavigationevent2.onWarmupCompleted().onExtraCallbackWithResult(this.IAuthTabCallback_Parcel);
                        onnavigationevent2.onWarmupCompleted().setEnabled(true);
                        i4++;
                    }
                    IEngagementSignalsCallbackStubProxy();
                    IPostMessageServiceDefault();
                    Iterator<T> it3 = this.IAuthTabCallbackDefault.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (((onNavigationEvent) next2).onWarmupCompleted().onNavigationEvent().longValue() > 2000000) {
                            obj2 = next2;
                            break;
                        }
                    }
                    onNavigationEvent onnavigationevent3 = (onNavigationEvent) obj2;
                    if (onnavigationevent3 != null) {
                        onWarmupCompleted(onnavigationevent3.onWarmupCompleted());
                    }
                }
            }
        }
        int i11 = access100 + 7;
        writeTypedObject = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 72 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IEngagementSignalsCallbackDefault() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchAmountActivity.IEngagementSignalsCallbackDefault():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IEngagementSignalsCallbackStubProxy() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            o.enableAccessibilityOrder r1 = o.enableAccessibilityOrder.onExtraCallbackWithResult
            o.enableAccessibilityOrder$onExtraCallbackWithResult r1 = r1.onNavigationEvent(r10)
            boolean r1 = r1.isOpen()
            java.util.ArrayList<viva.republica.toss.send.dutch.TransferDutchAmountActivity$onNavigationEvent> r2 = r10.IAuthTabCallbackDefault
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1a
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L1a
            goto L68
        L1a:
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r2.next()
            viva.republica.toss.send.dutch.TransferDutchAmountActivity$onNavigationEvent r5 = (viva.republica.toss.send.dutch.TransferDutchAmountActivity.onNavigationEvent) r5
            o.bringChildToFront r6 = r5.IAuthTabCallback()
            boolean r6 = r6.IAuthTabCallbackDefault()
            if (r6 != 0) goto L46
            viva.republica.toss.widget.NumberEditText r6 = r5.onWarmupCompleted()
            java.lang.Number r6 = r6.onNavigationEvent()
            long r6 = r6.longValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L59
        L46:
            viva.republica.toss.widget.NumberEditText r5 = r5.onWarmupCompleted()
            java.lang.Number r5 = r5.onNavigationEvent()
            long r5 = r5.longValue()
            r7 = 2000000(0x1e8480, double:9.881313E-318)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L1e
        L59:
            int r2 = viva.republica.toss.send.dutch.TransferDutchAmountActivity.access100
            int r2 = r2 + 75
            int r5 = r2 % 128
            viva.republica.toss.send.dutch.TransferDutchAmountActivity.writeTypedObject = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L66
            int r2 = r0 % 5
        L66:
            r2 = r3
            goto L72
        L68:
            int r2 = viva.republica.toss.send.dutch.TransferDutchAmountActivity.writeTypedObject
            int r2 = r2 + 119
            int r5 = r2 % 128
            viva.republica.toss.send.dutch.TransferDutchAmountActivity.access100 = r5
            int r2 = r2 % r0
            r2 = r4
        L72:
            long r5 = r10.IAuthTabCallbackStubProxy
            int r7 = r10.ICustomTabsServiceStub()
            long r7 = (long) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L7f
            r5 = r3
            goto L80
        L7f:
            r5 = r4
        L80:
            r5 = r5 ^ r4
            o.CMS_EncryptedDataWithEncryptKey r6 = r10.validateRelationship()
            im.toss.uikit.widget.KeyboardBottomCta r6 = r6.onNavigationEvent
            im.toss.tds.view.component.atom.button.TdsButtonV1View r6 = r6.onWarmupCompleted()
            if (r1 == r4) goto L9f
            if (r2 == 0) goto La0
            int r1 = viva.republica.toss.send.dutch.TransferDutchAmountActivity.access100
            int r1 = r1 + 17
            int r2 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchAmountActivity.writeTypedObject = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L9d
            if (r5 == 0) goto La0
            goto L9f
        L9d:
            if (r5 == 0) goto La0
        L9f:
            r3 = r4
        La0:
            r6.setEnabled(r3)
            int r1 = viva.republica.toss.send.dutch.TransferDutchAmountActivity.writeTypedObject
            int r1 = r1 + 109
            int r2 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchAmountActivity.access100 = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchAmountActivity.IEngagementSignalsCallbackStubProxy():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(NumberEditText numberEditText) throws Throwable {
        int i = 2 % 2;
        String string = getString(R.string.app_send_dutch___ffdc7849a8);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsToastV1.onNavigationEvent onNavigationEvent2 = TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(this, string), R.drawable.icon_warning_circle, 0, 2, (Object) null);
        KeyboardBottomCta keyboardBottomCta = validateRelationship().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        onNavigationEvent2.onNavigationEvent(keyboardBottomCta).onNavigationEvent();
        try {
            Object[] objArr = {this, numberEditText};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(948703185);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 46480), 13 - (KeyEvent.getMaxKeyCode() >> 16), 22731 - TextUtils.getTrimmedLength(""), 164426049, false, "onExtraCallbackWithResult", new Class[]{Context.class, View.class});
            }
            ((Method) objOnExtraCallback).invoke(null, objArr);
            minFresh.onNavigationEvent(this, noStore.Companion.onWarmupCompleted());
            int i2 = access100 + 61;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final class onExtraCallbackWithResult implements NumberEditText.IAuthTabCallbackStub {
        onExtraCallbackWithResult() {
        }

        public void IAuthTabCallback(NumberEditText numberEditText, String str, Number number) throws Throwable {
            Intrinsics.checkNotNullParameter(numberEditText, "");
            Intrinsics.checkNotNullParameter(number, "");
            numberEditText.setSelected(false);
            long jIAuthTabCallback = TransferDutchAmountActivity.IAuthTabCallback(TransferDutchAmountActivity.this);
            long jIAuthTabCallbackStub = TransferDutchAmountActivity.IAuthTabCallbackStub(TransferDutchAmountActivity.this);
            long jAsInterface = TransferDutchAmountActivity.asInterface(TransferDutchAmountActivity.this);
            long jLongValue = number.longValue();
            try {
                if (jLongValue > jIAuthTabCallback) {
                    numberEditText.setNumber(Long.valueOf(jIAuthTabCallback));
                    Object[] objArr = {TransferDutchAmountActivity.this, numberEditText};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(948703185);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46479), Color.green(0) + 13, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22730, 164426049, false, "onExtraCallbackWithResult", new Class[]{Context.class, View.class});
                    }
                    ((Method) objOnExtraCallback).invoke(null, objArr);
                    minFresh.onNavigationEvent(TransferDutchAmountActivity.this, noStore.Companion.onWarmupCompleted());
                    return;
                }
                if (jLongValue > jIAuthTabCallbackStub) {
                    for (onNavigationEvent onnavigationevent : (ArrayList) TransferDutchAmountActivity.onNavigationEvent(-1735354322, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{TransferDutchAmountActivity.this}, 1735354330, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())) {
                        onnavigationevent.onWarmupCompleted().setSelected(Intrinsics.areEqual(onnavigationevent.onWarmupCompleted(), numberEditText));
                    }
                    if (jLongValue > 2000000) {
                        TransferDutchAmountActivity.onNavigationEvent(TransferDutchAmountActivity.this, numberEditText);
                    }
                    TransferDutchAmountActivity.asBinder(TransferDutchAmountActivity.this);
                    return;
                }
                if (jLongValue < jAsInterface) {
                    numberEditText.setNumber(Long.valueOf(jIAuthTabCallbackStub));
                    Object[] objArr2 = {TransferDutchAmountActivity.this, numberEditText};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(948703185);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - KeyEvent.getDeadChar(0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, 22731 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 164426049, false, "onExtraCallbackWithResult", new Class[]{Context.class, View.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr2);
                    minFresh.onNavigationEvent(TransferDutchAmountActivity.this, noStore.Companion.onWarmupCompleted());
                    return;
                }
                if (Intrinsics.areEqual(number, 0)) {
                    numberEditText.setNumber(0);
                }
                numberEditText.setSelected(true);
                TransferDutchAmountActivity.asBinder(TransferDutchAmountActivity.this);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public final NumberEditText.IAuthTabCallbackStub IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ Intent onWarmupCompleted(onExtraCallback onextracallback, Context context, long j, List list, List list2, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                list2 = null;
            }
            List list3 = list2;
            if ((i & 16) != 0) {
                z = false;
            }
            return onextracallback.onExtraCallbackWithResult(context, j, list, list3, z);
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, long j, @NotNull List<accessgetReactApplicationContextIfActiveOrWarn> list, @Nullable List<accesssetEnqueuedAnimationOnFramep> list2, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intent intent = new Intent(context, (Class<?>) TransferDutchAmountActivity.class);
            intent.putExtra("amount", j);
            intent.putParcelableArrayListExtra("dutchInvitations", new ArrayList<>(list));
            if (list2 != null) {
                intent.putParcelableArrayListExtra("dutchPayments", new ArrayList<>(list2));
            }
            intent.putExtra("routeToListOnCompleted", z);
            return intent;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(TransferDutchAmountActivity transferDutchAmountActivity, enableAccessibilityOrder.onExtraCallbackWithResult onextracallbackwithresult) {
        return (Unit) onNavigationEvent(-380995231, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{transferDutchAmountActivity, onextracallbackwithresult}, 380995234, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    public static final /* synthetic */ CMS_EncryptedDataWithEncryptKey onExtraCallback(TransferDutchAmountActivity transferDutchAmountActivity) {
        return (CMS_EncryptedDataWithEncryptKey) onNavigationEvent(-537313150, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{transferDutchAmountActivity}, 537313155, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    public static final /* synthetic */ ArrayList onWarmupCompleted(TransferDutchAmountActivity transferDutchAmountActivity) {
        return (ArrayList) onNavigationEvent(-1735354322, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{transferDutchAmountActivity}, 1735354330, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private final void ICustomTabsServiceDefault() throws Throwable {
        onNavigationEvent(186776175, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1446958319 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019718).substring(0, 20).codePointAt(11), new Object[]{this}, -186776165, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private static final void asInterface(Function1 function1, Object obj) throws Throwable {
        onNavigationEvent(449143219, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function1, obj}, -449143213, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private static final Unit onExtraCallback(TransferDutchAmountActivity transferDutchAmountActivity, addOperation addoperation) {
        return (Unit) onNavigationEvent(1741031879, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{transferDutchAmountActivity, addoperation}, -1741031870, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private final bringChildToFront onExtraCallbackWithResult(accessgetReactApplicationContextIfActiveOrWarn accessgetreactapplicationcontextifactiveorwarn) {
        return (bringChildToFront) onNavigationEvent(-1800274553, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, accessgetreactapplicationcontextifactiveorwarn}, 1800274557, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private final long IEngagementSignalsCallback() {
        return ((Long) onNavigationEvent(1296234202, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132031991).substring(0, 7).codePointAt(4) - 1675519964, new Object[]{this}, -1296234202, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1150997004)).longValue();
    }

    private static final Unit onWarmupCompleted(TransferDutchAmountActivity transferDutchAmountActivity, enableAccessibilityOrder.onExtraCallbackWithResult onextracallbackwithresult) {
        return (Unit) onNavigationEvent(1906634463, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{transferDutchAmountActivity, onextracallbackwithresult}, -1906634462, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) throws Throwable {
        onNavigationEvent(-1462205747, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function1, obj}, 1462205754, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchAmountActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = writeTypedObject + 35;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchAmountActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access100 + 121;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchAmountActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchAmountActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 11;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static void setEngagementSignalsCallback() {
        access000 = -7401188895699574544L;
    }
}
