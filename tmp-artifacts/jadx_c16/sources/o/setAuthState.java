package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.features.home.legacy.view.consumption.analysis.list.delegate.SectionItemCategoryDelegate$;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access502;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setAuthState {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final Function1<RecyclerView.ViewHolder, Unit> IAuthTabCallback;
    private final Function1<Object, Boolean> asInterface;
    private final Function2<AppMsgReceiver2<FlipperPlugin>, FlipperPlugin, Unit> onExtraCallback;
    private final onExtraCallback onNavigationEvent;
    private final exitAllPages<NativeKeyboardObserverSpec> onWarmupCompleted;
    public static final onNavigationEvent Companion = new onNavigationEvent((DefaultConstructorMarker) null);
    private static final int onExtraCallbackWithResult = R.layout.item_tds_list_row_v1;

    public static /* synthetic */ boolean onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(obj);
        int i4 = asBinder + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(viewHolder);
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 5;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setAuthState setauthstate, AppMsgReceiver2 appMsgReceiver2, FlipperPlugin flipperPlugin) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setauthstate, appMsgReceiver2, flipperPlugin);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        int i5 = asBinder + 47;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(setAuthState setauthstate, NativeVibrationSpec nativeVibrationSpec, FlipperPlugin flipperPlugin, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(setauthstate, nativeVibrationSpec, flipperPlugin, view);
        int i4 = asBinder + 67;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback implements Function1<Object, Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = onNavigationEvent + 61;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnNavigationEvent = onNavigationEvent(obj);
            if (i3 != 0) {
                int i4 = 5 / 0;
            }
            int i5 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return boolOnNavigationEvent;
        }

        public final Boolean onNavigationEvent(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(obj, "");
            Boolean boolValueOf = Boolean.valueOf(obj instanceof FlipperPlugin);
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
            return boolValueOf;
        }
    }

    public setAuthState(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages, @NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onWarmupCompleted = exitallpages;
        this.onNavigationEvent = onextracallback;
        this.asInterface = new SectionItemCategoryDelegate$.ExternalSyntheticLambda0();
        this.IAuthTabCallback = new SectionItemCategoryDelegate$.ExternalSyntheticLambda1();
        this.onExtraCallback = new SectionItemCategoryDelegate$.ExternalSyntheticLambda2(this);
    }

    private static final boolean onWarmupCompleted(Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            boolean z = obj instanceof FlipperPlugin;
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        if (!(obj instanceof FlipperPlugin) || ((FlipperPlugin) obj).access000() != FlipperClient.CONSUMPTION_CATEGORY) {
            return false;
        }
        int i3 = asBinder;
        int i4 = i3 + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 1;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View2.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View2, 40), varyMatches.IAuthTabCallback(tdsListRowV1View2, 40));
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onRelationshipValidationResult());
        Context context2 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View2.setCenterText2Color(new getUrlokhttp(new onWarmupCompleted(configuration2)).ICustomTabsCallbackStubProxy());
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1A);
        Context context3 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsListRowV1View2.setRightText1Color(new getUrlokhttp(new IAuthTabCallbackDefault(configuration3)).ICustomTabsCallbackStubProxy());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(setAuthState setauthstate, NativeVibrationSpec nativeVibrationSpec, FlipperPlugin flipperPlugin, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setauthstate.onNavigationEvent.onNavigationEvent(nativeVibrationSpec, flipperPlugin);
        int i4 = asBinder + 121;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(setAuthState setauthstate, AppMsgReceiver2 appMsgReceiver2, FlipperPlugin flipperPlugin) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(flipperPlugin, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        setauthstate.onNavigationEvent.onWarmupCompleted(flipperPlugin);
        deleteTimer deletetimer = (deleteTimer) CollectionsKt.firstOrNull(flipperPlugin.asBinder());
        if (deletetimer != null) {
            int i3 = IAuthTabCallbackDefault + 111;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            UST_PKCS12_MakePFX.onExtraCallbackWithResult(tdsListRowV1View2, deletetimer.onWarmupCompleted(tdsListRowV1View2.getContext()), false, 0, 8, (Object) null);
            i = asBinder + 71;
            IAuthTabCallbackDefault = i % 128;
        } else {
            tdsListRowV1View2.setLeftImage((Drawable) null);
            i = IAuthTabCallbackDefault + 81;
            asBinder = i % 128;
        }
        int i5 = i % 2;
        tdsListRowV1View2.setCenterText1(flipperPlugin.asInterface());
        tdsListRowV1View2.setCenterText2(flipperPlugin.IAuthTabCallbackDefault());
        tdsListRowV1View2.setRightText1(flipperPlugin.IAuthTabCallback_Parcel());
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        tdsListRowV1View2.setRightArrow(((Boolean) FlipperPlugin.IAuthTabCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{flipperPlugin}, 1712660905, -1712660904)).booleanValue());
        NativeVibrationSpec nativeVibrationSpecOnNavigationEvent = flipperPlugin.onNavigationEvent();
        if (nativeVibrationSpecOnNavigationEvent != null) {
            tdsListRowV1View2.setOnClickListener(new SectionItemCategoryDelegate$.ExternalSyntheticLambda3(setauthstate, nativeVibrationSpecOnNavigationEvent, flipperPlugin));
        } else {
            tdsListRowV1View2.setOnClickListener((View.OnClickListener) null);
            tdsListRowV1View2.setClickable(false);
            int i6 = asBinder + 67;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    public final access502<FlipperPlugin, NativeKeyboardObserverSpec> onWarmupCompleted() {
        int i = 2 % 2;
        access502<FlipperPlugin, NativeKeyboardObserverSpec> access502VarIAuthTabCallback = new access502.onNavigationEvent().onExtraCallbackWithResult(IAuthTabCallback.onWarmupCompleted).onExtraCallbackWithResult(this.asInterface).onNavigationEvent(onExtraCallbackWithResult).onNavigationEvent(this.IAuthTabCallback).onExtraCallback(this.onExtraCallback).IAuthTabCallback();
        int i2 = asBinder + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return access502VarIAuthTabCallback;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onNavigationEvent)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onNavigationEvent)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            r1 = o.setAuthState.IAuthTabCallbackDefault.IAuthTabCallback + 17;
            o.setAuthState.IAuthTabCallbackDefault.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
            }
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 55;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i5 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onTransact + 79;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }
}
