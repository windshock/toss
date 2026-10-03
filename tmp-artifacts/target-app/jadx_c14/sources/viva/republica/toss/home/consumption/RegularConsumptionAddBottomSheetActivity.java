package viva.republica.toss.home.consumption;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import im.toss.features.password.api.annotation.RequiresAuth;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.TimelineExternalSyntheticLambda0;
import o.UTF8Decoder;
import o.addExtra;
import o.getTypedExportedConstants;
import o.initMiniApp;
import o.logAndOpenStore;
import o.setProxySelectorokhttp;
import o.varyMatches;
import o.zzbq;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.home.consumption.RegularConsumptionAddBottomSheetActivity$;

@RequiresAuth(onExtraCallbackWithResult = true, onWarmupCompleted = UTF8Decoder.HOME_CONSUMPTION_ADD_BOTTOM_SHEET)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RegularConsumptionAddBottomSheetActivity extends Hilt_RegularConsumptionAddBottomSheetActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackDefault = 7811478665043678604L;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;

    @Inject
    public SessionTrackerb tossRouter;

    public static /* synthetic */ void onNavigationEvent(RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption, gettypedexportedconstants, view);
        int i4 = asInterface + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(RegularConsumptionAddBottomSheetActivity regularConsumptionAddBottomSheetActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(regularConsumptionAddBottomSheetActivity, dialogInterface);
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 63;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 47;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = i2 + 41;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return 1216981L;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 115;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i5 = i2 + 55;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = IAuthTabCallbackStub + 113;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 41 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        Map<String, Object> mapIAuthTabCallback = zzbq.IAuthTabCallback(intent);
        int i4 = IAuthTabCallbackStub + 15;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.home.consumption.Hilt_RegularConsumptionAddBottomSheetActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        IAuthTabCallback();
        int i4 = asInterface + 111;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackDefault ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 117;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 45812), 132 - AndroidCharacter.getMirror('0'), 21233 - TextUtils.getCapsMode("", 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14185), ImageFormat.getBitsPerPixel(0) + 20, 8807 - ((byte) KeyEvent.getModifierMetaStateMask()), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 49;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static final void onExtraCallbackWithResult(RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.IAuthTabCallback();
            gettypedexportedconstants.dismiss();
        } else {
            regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.IAuthTabCallback();
            gettypedexportedconstants.dismiss();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final void onNavigationEvent(RegularConsumptionAddBottomSheetActivity regularConsumptionAddBottomSheetActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        regularConsumptionAddBottomSheetActivity.finish();
        int i4 = asInterface + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        String string = getString(R.string.app_home_consumption___0a9a34191c);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = new Object[1];
        a(new char[]{37653, 54408, 63360, 52538, 37757, 14972, 10996, 1738, 10598, 31794, 24751, 18581, 59238, 46716, 42721, 62158, 48508, 51307, 64686, 13518, 31610, 635, 13043, 32404, 12668, 17509, 34991, 41171, 53110, 40551, 52974, 60105, 34106, 53368, 1262, 11485, 17210, 27196, 23288, 22165, 6524, 44139, 37103, 39124, 55096, 58987, 55020, 49877, 28022, 14435, 11438, 1226, 11131, 29295}, View.getDefaultSize(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{23734, 64157, 17596, 25386, 23749, 5224, 39372, 43215, 59076, 21097, 54227, 59097, 10437, 38951, 5523, 23685, 29406, 58994, 20433, 39631, 46233, 11390, 33235, 53444, 65221, 27240, 15313, 3802, 194, 45172, 32211, 17604, 19097, 65135, 47065, 33485, 36035, 17521, 59869, 63704, 54937, 33400, 9176, 14019, 6338, 51250, 26077, 27854, 41682, 5666, 40910, 43727, 58576, 23672, 53710, 57560, 11987, 39535, 2945, 24265, 28889, 57459, 19919, 38111, 47835, 11885, 34760, 53955, 64729, 29811, 14738, 2248, 1753, 45673, 29640, 18117, 18651, 63554, 46543, 48322, 37587, 18040, 61384, 64132, 54468, 35960, 8667, 12511, 7898, 51836, 23502, 28405, 41171, 4217, 40405, 42206, 60056, 24175, 55257, 58057, 11475, 42099, 2504}, KeyEvent.keyCodeFromString(""), objArr2);
        List<RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption> listMutableListOf = CollectionsKt.mutableListOf(new RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption[]{new RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption(this, "RECENT", strIntern, string, ((String) objArr2[0]).intern())});
        if (addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted)) {
            String string2 = getString(R.string.app_home_consumption___9f700be046);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Object[] objArr3 = new Object[1];
            a(new char[]{57116, 57436, 26579, 50573, 57204, 3752, 47783, 3709, 25967, 18662, 61692, 16418, 43887, 33448, 14002, 64121, 61813, 64703, 27901, 15481, 14195, 13999, 41632, 30243, 32117, 28849, 6396, 43108, 33663, 43699, 24253, 57982, 51507, 58540, 38077, 9322, 3891, 24296, 51883, 24098, 21877, 39103, 188, 36963, 39729, 53951, 18098, 51839, 8568, 3313, 48305, 3169, 26473, 18105, 62205, 18045, 44402, 32955}, ViewConfiguration.getLongPressTimeout() >> 16, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new char[]{12325, 16350, 18062, 47424, 12374, 53547, 39934, 29349, 35415, 38698, 53729, 15539, 17494, 23908, 6049, 34543, 7750, 9023, 19964, 16548, 55306, 59692, 33771, 2727, 37452, 44845, 14842, 54437, 27735, 30049, 32744, 40626, 9802, 15155, 46515, 22696, 57418, 33075, 60395, 8934, 47703, 18235, 8680, 60581, 29783, 3372, 26603, 46770, 52760, 54077, 40417, 28846, 34902, 39211, 54243, 15024, 16977, 24375, 2529, 33966, 7179, 9532, 20449, 20148, 54865, 60209, 34275, 2207, 36950, 45366, 15339, 53925, 27217, 30576, 29180, 40101, 9282, 15659, 47074, 26273, 65111, 33537, 60907, 8356, 47180, 18730, 9120, 60067, 29252, 3884, 23018}, ViewConfiguration.getEdgeSlop() >> 16, objArr4);
            listMutableListOf.add(new RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption(this, "CARD", strIntern2, string2, ((String) objArr4[0]).intern()));
            int i2 = asInterface + 61;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        String string3 = getString(R.string.app_home_consumption___917dcdf9f9);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        Object[] objArr5 = new Object[1];
        a(new char[]{9496, 14252, 1620, 32484, 9584, 55640, 56096, 46356, 40811, 40726, 37243, 64331, 20843, 21848, 22325, 16656, 2929, 11087, 3450, 34576, 52599, 57695, 49959, 52554, 34673, 42817, 31099, 4877, 31099, 32067, 16186, 22807, 13111, 13148, 62778, 40707, 62775, 35096, 43820, 58699, 44913, 20303, 24891, 11018, 24885, 1357, 10039, 28935, 56183, 56153, 56634, 46864, 40246, 37212, 37690, 64771}, 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{19578, 35516, 60421, 21171, 19465, 25673, 12661, 39254, 62984, 8776, 31594, 55104, 14345, 59398, 48426, 27932, 25112, 38493, 59243, 43864, 42069, 23630, 10592, 57684, 60947, 6735, 37745, 16214, 4104, 49155, 54627, 30017, 23061, 36433, 7992, 45915, 39957, 13393, 16736, 51477, 50696, 62041, 35683, 1878, 2056, 47182, 52576, 23873, 45639, 26207, 14186, 39773, 62473, 11337, 31080, 53571, 15886, 59989, 41834, 28509, 24660, 36958, 58730, 42311, 43534, 24147, 12136, 58220, 60425, 1108, 37216, 14678, 5646, 49682, 56183, 30550, 22557, 34889, 7529, 36178, 33288, 13923, 18272, 52055, 50195, 64584, 35115, 338, 3609, 47711, 62314, 24390, 45076, 24648}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr6);
        listMutableListOf.add(new RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption(this, "ACCOUNT", strIntern3, string3, ((String) objArr6[0]).intern()));
        RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$$inlined$bottomSheetV2$default$1 regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$$inlined$bottomSheetV2$default$1 = new Function1<initMiniApp.onWarmupCompleted, Unit>() { // from class: viva.republica.toss.home.consumption.RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$$inlined$bottomSheetV2$default$1
            public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            }

            public /* synthetic */ Object invoke(Object obj) {
                IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
                return Unit.INSTANCE;
            }
        };
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        Dialog dialog = gettypedexportedconstants;
        Dialog gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$$inlined$bottomSheetV2$default$1, 14, (DefaultConstructorMarker) null);
        Context context = dialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        DisplayMetrics displayMetrics = linearLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), varyMatches.onNavigationEvent(16, displayMetrics));
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setShowCloseIcon(false);
        bottomSheetHeader.setTitle(getString(R.string.app_home_consumption___c4d26a2592));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        for (RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption : listMutableListOf) {
            Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context3, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            tdsListRowV1View.setPaddingTop(varyMatches.onNavigationEvent(20, displayMetrics2));
            DisplayMetrics displayMetrics3 = tdsListRowV1View.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            tdsListRowV1View.setPaddingBottom(varyMatches.onNavigationEvent(20, displayMetrics3));
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            DisplayMetrics displayMetrics4 = tdsListRowV1View.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics4);
            DisplayMetrics displayMetrics5 = tdsListRowV1View.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics5));
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1A);
            tdsListRowV1View.setRightArrow(true);
            tdsListRowV1View.setLeftImage(regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.onExtraCallback());
            tdsListRowV1View.setCenterText1(regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.onNavigationEvent());
            Dialog dialog2 = dialog;
            tdsListRowV1View.setOnClickListener(new RegularConsumptionAddBottomSheetActivity$.ExternalSyntheticLambda0(regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption, dialog2));
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
            int i4 = IAuthTabCallbackStub + 123;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            dialog = dialog2;
        }
        Dialog dialog3 = dialog;
        dialog3.setContentView(linearLayout);
        dialog3.setOnDismissListener(new RegularConsumptionAddBottomSheetActivity$.ExternalSyntheticLambda1(this));
        dialog3.show();
    }

    @Override // viva.republica.toss.home.consumption.Hilt_RegularConsumptionAddBottomSheetActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.home.consumption.Hilt_RegularConsumptionAddBottomSheetActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asInterface + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.home.consumption.Hilt_RegularConsumptionAddBottomSheetActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.home.consumption.Hilt_RegularConsumptionAddBottomSheetActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asInterface + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }
}
