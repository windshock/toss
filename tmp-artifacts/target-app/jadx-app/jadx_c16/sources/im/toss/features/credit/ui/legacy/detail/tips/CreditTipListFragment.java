package im.toss.features.credit.ui.legacy.detail.tips;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.credit.data.legacy.detail.Link;
import im.toss.features.credit.data.legacy.detail.Tips;
import im.toss.features.credit.ui.legacy.R;
import im.toss.features.credit.ui.legacy.detail.tips.CreditTipListFragment$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.AUTextView;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.OfficeFileType;
import o.PageContext;
import o.SessionTrackerb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UST_CMS_EncryptedData;
import o.access8100;
import o.addAllCommandLine;
import o.clearExpired;
import o.convertAnyToMap;
import o.getAdService;
import o.getCharsetName;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getParam;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.h5ScreenShotObserverOnChangeOpt;
import o.preFillDefault;
import o.readIntokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditTipListFragment extends Hilt_CreditTipListFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100;
    private static int[] asInterface;
    public static final int onExtraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static int onTransact;
    private final PageContext IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private Tips asBinder;
    private final getParam onExtraCallback;
    private String onWarmupCompleted;

    @Inject
    public SessionTrackerb tossRouter;

    static {
        onExtraCallback();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(CreditTipListFragment.class, "binding", "getBinding()Lim/toss/features/credit/ui/legacy/databinding/FragmentCreditTipListBinding;", 0)};
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallbackWithResult = 8;
        int i = access100 + 83;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ String IAuthTabCallback(CreditTipListFragment creditTipListFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(creditTipListFragment);
        int i4 = onTransact + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallback(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditTipListFragment creditTipListFragment, UST_CMS_EncryptedData uST_CMS_EncryptedData) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditTipListFragment, uST_CMS_EncryptedData);
        int i4 = onTransact + 33;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i));
        int i12 = (~(i | i7)) | (~(i8 | i10));
        int i13 = ~(i6 | i2);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i6 + i2 + i4 + ((-1585779005) * i5) + (640148872 * i3);
        int i17 = i16 * i16;
        int i18 = (i6 * 308833806) + 153878528 + (308833806 * i2) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i4) + (1159200768 * i5) + ((-734003200) * i3) + (2089549824 * i17);
        int i19 = (i6 * (-1291220770)) + 263398195 + (i2 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i4 * (-1291221671)) + (i5 * (-1079815989)) + (i3 * 669414472) + (i17 * 145489920);
        return i18 + ((i19 * i19) * (-1699479552)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return 1247395L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CreditTipListFragment() {
        super(R.layout.fragment_credit_tip_list);
        this.IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new CreditTipListFragment$.ExternalSyntheticLambda2(this));
        this.onWarmupCompleted = "";
        this.onExtraCallback = new getParam();
        this.IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onWarmupCompleted);
    }

    public static final class onExtraCallbackWithResult {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final CreditTipListFragment onNavigationEvent(@NotNull Tips tips, @NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(tips, "");
            Intrinsics.checkNotNullParameter(str, "");
            CreditTipListFragment creditTipListFragment = new CreditTipListFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_tips", tips);
            bundle.putString("tab_type", str);
            creditTipListFragment.setArguments(bundle);
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return creditTipListFragment;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditTipListFragment creditTipListFragment = (CreditTipListFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) creditTipListFragment.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String onExtraCallback(CreditTipListFragment creditTipListFragment) throws Throwable {
        int i = 2 % 2;
        Intent intent = creditTipListFragment.requireActivity().getIntent();
        Object[] objArr = new Object[1];
        a(new int[]{2144242515, 2097169953}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null || StringsKt.isBlank(stringExtra)) {
            int i2 = onTransact + 33;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            stringExtra = null;
        }
        if (stringExtra != null) {
            return stringExtra;
        }
        int i3 = IAuthTabCallbackStub + 123;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            creditTipListFragment.getArguments();
            string.hashCode();
            throw null;
        }
        Bundle arguments = creditTipListFragment.getArguments();
        string = arguments != null ? arguments.getString("tab_type") : null;
        if (string == null) {
            return "";
        }
        int i4 = IAuthTabCallbackStub + 57;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return string;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, clearExpired> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onExtraCallback + 13;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onExtraCallback() {
            super(1, clearExpired.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/credit/ui/legacy/databinding/FragmentCreditTipListBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            clearExpired clearexpiredOnWarmupCompleted = onWarmupCompleted((View) obj);
            int i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return clearexpiredOnWarmupCompleted;
            }
            throw null;
        }

        public final clearExpired onWarmupCompleted(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            clearExpired clearexpiredOnWarmupCompleted = clearExpired.onWarmupCompleted(view);
            int i4 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return clearexpiredOnWarmupCompleted;
            }
            throw null;
        }
    }

    private final clearExpired onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        clearExpired clearexpiredOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(this, onNavigationEvent[0]);
        Intrinsics.checkNotNullExpressionValue(clearexpiredOnExtraCallbackWithResult, "");
        clearExpired clearexpired = clearexpiredOnExtraCallbackWithResult;
        int i4 = IAuthTabCallbackStub + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return clearexpired;
    }

    private final RecyclerView asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            RecyclerView recyclerView = onTransact().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            return recyclerView;
        }
        RecyclerView recyclerView2 = onTransact().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        int i3 = 27 / 0;
        return recyclerView2;
    }

    public final SessionTrackerb onExtraCallbackWithResult() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = onTransact + 39;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = onTransact + 71;
        int i5 = i4 % 128;
        IAuthTabCallbackStub = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 111;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return sessionTrackerb;
        }
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        Tips tips;
        int i = 2 % 2;
        super.onCreate(bundle);
        this.onWarmupCompleted = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(requireActivity().getIntent());
        if (bundle != null) {
            this.asBinder = bundle.getParcelable("key_tips");
            return;
        }
        Bundle arguments = getArguments();
        Object obj = null;
        if (arguments != null) {
            int i2 = onTransact + 1;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            tips = (Tips) arguments.getParcelable("key_tips");
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallbackStub + 79;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            tips = null;
        }
        this.asBinder = tips;
        int i6 = IAuthTabCallbackStub + 43;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
            bundle.putAll(getArguments());
            throw null;
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
        bundle.putAll(getArguments());
        int i3 = IAuthTabCallbackStub + 105;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onWarmupCompleted))) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            IAuthTabCallbackStub();
            asInterface().setAdapter(this.onExtraCallback);
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IAuthTabCallbackStub();
        asInterface().setAdapter(this.onExtraCallback);
        Tips tips = this.asBinder;
        if (tips != null) {
            getParam getparam = this.onExtraCallback;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            getUrlokhttp geturlokhttp = new getUrlokhttp(new IAuthTabCallback(configuration));
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Resources resources = context2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration2 = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            getDEFAULT_CONNECTION_SPECSokhttp getdefault_connection_specsokhttp = new getDEFAULT_CONNECTION_SPECSokhttp(new onNavigationEvent(configuration2));
            String str = this.onWarmupCompleted;
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            getparam.onWarmupCompleted(geturlokhttp, getdefault_connection_specsokhttp, tips, str, (String) onWarmupCompleted(iOnExtraCallback, 136139169, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, iOnExtraCallback3, -136139169));
        }
        int i3 = IAuthTabCallbackStub + 25;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        this.onExtraCallback.asInterface().onTransact(500L, TimeUnit.MILLISECONDS).IAuthTabCallback(new CreditTipListFragment$.ExternalSyntheticLambda1(new CreditTipListFragment$.ExternalSyntheticLambda0(this)));
        int i2 = IAuthTabCallbackStub + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(CreditTipListFragment creditTipListFragment, UST_CMS_EncryptedData uST_CMS_EncryptedData) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
            if (uST_CMS_EncryptedData.IAuthTabCallback() == OfficeFileType.Companion.onExtraCallbackWithResult()) {
                String strOnExtraCallbackWithResult = null;
                getCharsetName getcharsetname = uST_CMS_EncryptedData instanceof getCharsetName ? (getCharsetName) uST_CMS_EncryptedData : null;
                if (getcharsetname == null) {
                    Unit unit = Unit.INSTANCE;
                    int i4 = onTransact + 91;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
                Link linkOnExtraCallbackWithResult = getcharsetname.IAuthTabCallbackDefault().onExtraCallbackWithResult();
                if (linkOnExtraCallbackWithResult != null) {
                    int i5 = IAuthTabCallbackStub + 49;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    strOnExtraCallbackWithResult = linkOnExtraCallbackWithResult.onExtraCallbackWithResult();
                }
                if (strOnExtraCallbackWithResult == null) {
                    strOnExtraCallbackWithResult = "";
                }
                if (strOnExtraCallbackWithResult.length() == 0) {
                    return Unit.INSTANCE;
                }
                Context context = creditTipListFragment.getContext();
                if (context != null) {
                    SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = creditTipListFragment.onExtraCallbackWithResult();
                    Object[] objArr = new Object[1];
                    a(new int[]{-1874617495, 1546989194, 190595336, -1152563484}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, objArr);
                    SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnExtraCallbackWithResult, context, convertAnyToMap.IAuthTabCallback(strOnExtraCallbackWithResult, ((String) objArr[0]).intern(), "credit__my_detail_info_custom_tips"), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                }
            }
        } else if (uST_CMS_EncryptedData.IAuthTabCallback() == OfficeFileType.Companion.onExtraCallbackWithResult()) {
        }
        return Unit.INSTANCE;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{-1874617495, 1546989194, 190595336, -1152563484}, 7 - TextUtils.lastIndexOf("", '0'), objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onWarmupCompleted), getWrite.IAuthTabCallback("info_type", (String) onWarmupCompleted(AUTextView.onExtraCallbackWithResult.onExtraCallback(), 136139169, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{this}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -136139169))});
        int i4 = onTransact + 107;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = asInterface;
        int i4 = -1469660336;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0, 0) + 73, TextUtils.lastIndexOf("", '0') + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = asInterface;
        if (iArr6 != null) {
            int i6 = $10 + 125;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i7 = $10 + 45;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr6[i2])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 72 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.getDeadChar(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i2++;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i9 = $11 + 69;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i11 = $10 + 113;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            for (int i13 = 0; i13 < 16; i13++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - ImageFormat.getBitsPerPixel(0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, 10302 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 4033), 77 - ExpandableListView.getPackedPositionChild(0L), (Process.myTid() >> 22) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i17 = $10 + 113;
        $11 = i17 % 128;
        if (i17 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onWarmupCompleted(iOnExtraCallback, -877307706, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback2, iOnExtraCallback3, 877307707);
    }

    private final String asBinder() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (String) onWarmupCompleted(iOnExtraCallback, 136139169, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, iOnExtraCallback3, -136139169);
    }

    static void onExtraCallback() {
        asInterface = new int[]{-266391426, 1934258320, 1654161552, -2075648856, 1727291471, -955244125, -684295548, 737006772, 923933618, -267918502, -2141919128, 1204828868, -1808161334, -1955297982, -1336783633, 1995376167, -1483016910, 21497731};
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = IAuthTabCallback + 77;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
