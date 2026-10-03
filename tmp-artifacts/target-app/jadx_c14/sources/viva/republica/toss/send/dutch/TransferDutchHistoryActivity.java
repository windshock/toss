package viva.republica.toss.send.dutch;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import im.toss.network.model.BaseApiResponse;
import im.toss.uikit.widget.tab.TdsTabV1View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMS_GetCertCountWithSignedData;
import o.ConvertByteArrayToFloatArray;
import o.IPostMessageServiceStubProxy;
import o.JavaOnlyMapCompanionWhenMappings;
import o.JsonReaderUnknownNumberParsing;
import o.MapConverter;
import o.NetConverter3;
import o.RightClickGesturesKtonRightClickDown2;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.addOperation;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.getIconPaddingLeft;
import o.getJavaScriptModule;
import o.getParamImp;
import o.initMiniApp;
import o.mapValue;
import o.nextKey;
import o.onPaused;
import o.setMessageBytes;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.send.dutch.TransferDutchHistoryActivity$;
import viva.republica.toss.send.dutch.TransferDutchHistoryActivity$initTab$1$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferDutchHistoryActivity extends Hilt_TransferDutchHistoryActivity {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallbackDefault = 8;
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallbackWithResult(this));
    private final Lazy asBinder = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(getJavaScriptModule.class), new asBinder(this), new onNavigationEvent(this), new asInterface(null, this));

    public long getScreenId() {
        return 1007467L;
    }

    public static final class onExtraCallbackWithResult implements Function0<CMS_GetCertCountWithSignedData> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onExtraCallbackWithResult(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CMS_GetCertCountWithSignedData invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_GetCertCountWithSignedData.onNavigationEvent(layoutInflater);
        }
    }

    private final CMS_GetCertCountWithSignedData IAuthTabCallback() {
        return (CMS_GetCertCountWithSignedData) this.IAuthTabCallbackStub.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getJavaScriptModule onNavigationEvent() {
        return (getJavaScriptModule) this.asBinder.getValue();
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchHistoryActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        setContentView(IAuthTabCallback().getRoot());
        ConstraintLayout root = IAuthTabCallback().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, IAuthTabCallback().onExtraCallback, (View) null, (View) null, false, 14, (Object) null);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        ICustomTabsServiceDefault();
        setEngagementSignalsCallback();
    }

    private final void setEngagementSignalsCallback() {
        getIconPaddingLeft geticonpaddingleft = getIconPaddingLeft.IAuthTabCallback;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = geticonpaddingleft.onWarmupCompleted().onExtraCallback(JavaOnlyMapCompanionWhenMappings.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, (Function1) null, (Function0) null, new TransferDutchHistoryActivity$.ExternalSyntheticLambda0(this), 3, (Object) null));
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback2 = geticonpaddingleft.onWarmupCompleted().onExtraCallback(nextKey.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback2, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = jsonReaderUnknownNumberParsingOnExtraCallback2.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted2, "");
        onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted2, (Function1) null, (Function0) null, new TransferDutchHistoryActivity$.ExternalSyntheticLambda1(this), 3, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(TransferDutchHistoryActivity transferDutchHistoryActivity, JavaOnlyMapCompanionWhenMappings javaOnlyMapCompanionWhenMappings) {
        TabLayout.Tab tabOnExtraCallback;
        transferDutchHistoryActivity.validateRelationship();
        if (transferDutchHistoryActivity.onNavigationEvent().onExtraCallback().isEmpty() && (tabOnExtraCallback = transferDutchHistoryActivity.IAuthTabCallback().IAuthTabCallback.onExtraCallback(1)) != null) {
            tabOnExtraCallback.select();
        }
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public onNavigationEvent(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onExtraCallbackWithResult.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(TransferDutchHistoryActivity transferDutchHistoryActivity, nextKey nextkey) throws Throwable {
        transferDutchHistoryActivity.ICustomTabsServiceDefault();
        return Unit.INSTANCE;
    }

    public static final class asBinder implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public asBinder(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onNavigationEvent.getViewModelStore();
        }
    }

    private final void ICustomTabsServiceDefault() throws Throwable {
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 22, (ViewConfiguration.getPressedStateDuration() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1550062933);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getFadingEdgeLength() >> 16)), View.MeasureSpec.getMode(0) + 22, 24782 - AndroidCharacter.getMirror('0'), 1831136197, false, "readTypedObject", new Class[0]);
            }
            writeRaw<BaseApiResponse<List<addOperation>>> writerawOnWarmupCompleted = ((onPaused) ((Method) objOnExtraCallback2).invoke(obj, null)).onWarmupCompleted();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            writeRaw writerawOnWarmupCompleted2 = writerawIAuthTabCallback.onExtraCallback(new TransferDutchHistoryActivity$.ExternalSyntheticLambda3(new TransferDutchHistoryActivity$.ExternalSyntheticLambda2(this))).onWarmupCompleted(new TransferDutchHistoryActivity$.ExternalSyntheticLambda4(this));
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted2, "");
            onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted2, new TransferDutchHistoryActivity$.ExternalSyntheticLambda5(this), new TransferDutchHistoryActivity$.ExternalSyntheticLambda6(this)));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final class asInterface implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;
        final /* synthetic */ Function0 onNavigationEvent;

        public asInterface(Function0 function0, ComponentActivity componentActivity) {
            this.onNavigationEvent = function0;
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onNavigationEvent;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.IAuthTabCallback.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asBinder(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(TransferDutchHistoryActivity transferDutchHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        ProgressBar progressBar = transferDutchHistoryActivity.IAuthTabCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(progressBar, "");
        progressBar.setVisibility(0);
        TdsTabV1View tdsTabV1View = transferDutchHistoryActivity.IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTabV1View, "");
        tdsTabV1View.setVisibility(4);
        ViewPager viewPager = transferDutchHistoryActivity.IAuthTabCallback().asBinder;
        Intrinsics.checkNotNullExpressionValue(viewPager, "");
        viewPager.setVisibility(4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(TransferDutchHistoryActivity transferDutchHistoryActivity) {
        ProgressBar progressBar = transferDutchHistoryActivity.IAuthTabCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(progressBar, "");
        progressBar.setVisibility(8);
        TdsTabV1View tdsTabV1View = transferDutchHistoryActivity.IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTabV1View, "");
        tdsTabV1View.setVisibility(0);
        ViewPager viewPager = transferDutchHistoryActivity.IAuthTabCallback().asBinder;
        Intrinsics.checkNotNullExpressionValue(viewPager, "");
        viewPager.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallback(TransferDutchHistoryActivity transferDutchHistoryActivity, List list) {
        TabLayout.Tab tabOnExtraCallback;
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            addOperation addoperation = (addOperation) obj;
            if (addoperation.onExtraCallbackWithResult() || addoperation.onExtraCallback() || addoperation.access100()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        transferDutchHistoryActivity.onNavigationEvent().IAuthTabCallback(CollectionsKt.toMutableList((Collection) pair.getSecond()));
        transferDutchHistoryActivity.onNavigationEvent().onNavigationEvent(CollectionsKt.toMutableList((Collection) pair.getFirst()));
        transferDutchHistoryActivity.onExtraCallbackWithResult((List<addOperation>) list);
        if (transferDutchHistoryActivity.getIntent().getBooleanExtra("fromRoomScheme", false)) {
            transferDutchHistoryActivity.getIntent().removeExtra("fromRoomScheme");
            if (transferDutchHistoryActivity.onNavigationEvent().onExtraCallback().isEmpty() && (tabOnExtraCallback = transferDutchHistoryActivity.IAuthTabCallback().IAuthTabCallback.onExtraCallback(1)) != null) {
                tabOnExtraCallback.select();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit IAuthTabCallback(TransferDutchHistoryActivity transferDutchHistoryActivity, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, transferDutchHistoryActivity, false, (initMiniApp) null, (Function0) null, new TransferDutchHistoryActivity$.ExternalSyntheticLambda7(transferDutchHistoryActivity), 14, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(TransferDutchHistoryActivity transferDutchHistoryActivity, DialogInterface dialogInterface) {
        transferDutchHistoryActivity.finish();
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(List<addOperation> list) {
        boolean z = true;
        if (list.size() > 1 && list.get(0).onWarmupCompleted() <= list.get(1).onWarmupCompleted()) {
            z = false;
        }
        IAuthTabCallback().asBinder.setAdapter(new mapValue(this, z));
        TdsTabV1View tdsTabV1View = IAuthTabCallback().IAuthTabCallback;
        tdsTabV1View.onNavigationEvent(new onExtraCallback());
        ViewPager viewPager = IAuthTabCallback().asBinder;
        Intrinsics.checkNotNullExpressionValue(viewPager, "");
        tdsTabV1View.setupWithViewPager(viewPager);
        TabLayout.Tab tabOnExtraCallback = tdsTabV1View.onExtraCallback(0);
        if (tabOnExtraCallback != null) {
            tabOnExtraCallback.select();
        }
        validateRelationship();
    }

    public static final class onExtraCallback implements TabLayout.OnTabSelectedListener {
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }

        onExtraCallback() {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            ConvertByteArrayToFloatArray.onExtraCallback(1007477L, false, (String) null, (Map) null, new TransferDutchHistoryActivity$initTab$1$1$.ExternalSyntheticLambda0(tab, TransferDutchHistoryActivity.this), 14, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(TabLayout.Tab tab, TransferDutchHistoryActivity transferDutchHistoryActivity, SetDetectableSize setDetectableSize) {
            String str;
            boolean zIsEmpty;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Integer numValueOf = tab != null ? Integer.valueOf(tab.getPosition()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                str = "progress_list";
            } else {
                if (numValueOf == null || numValueOf.intValue() != 1) {
                    return Unit.INSTANCE;
                }
                str = "done_list";
            }
            setDetectableSize.onExtraCallback("tab_name", str);
            int position = tab.getPosition();
            if (position == 0) {
                zIsEmpty = transferDutchHistoryActivity.onNavigationEvent().onExtraCallback().isEmpty();
            } else if (position == 1) {
                zIsEmpty = transferDutchHistoryActivity.onNavigationEvent().onWarmupCompleted().isEmpty();
            } else {
                return Unit.INSTANCE;
            }
            setDetectableSize.onExtraCallback("list_yn", zIsEmpty ^ true ? "Y" : "N");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void validateRelationship() {
        TdsTabV1View tdsTabV1View = IAuthTabCallback().IAuthTabCallback;
        TabLayout.Tab tabOnExtraCallback = tdsTabV1View.onExtraCallback(0);
        if (tabOnExtraCallback != null) {
            tabOnExtraCallback.setText(getString(R.string.app_send_dutch___6653ec5e1f, Integer.valueOf(onNavigationEvent().onExtraCallback().size())));
        }
        TabLayout.Tab tabOnExtraCallback2 = tdsTabV1View.onExtraCallback(1);
        if (tabOnExtraCallback2 != null) {
            tabOnExtraCallback2.setText(getString(R.string.complete));
        }
    }

    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        getMenuInflater().inflate(R.menu.menu_transfer_dutch_history, menu);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() == R.id.menu_guide) {
            startActivity(TransferDutchDisclaimerActivity.Companion.IAuthTabCallback(this));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        if (i == 30004 && i2 == -1) {
            ICustomTabsServiceDefault();
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ Intent onWarmupCompleted(IAuthTabCallback iAuthTabCallback, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return iAuthTabCallback.onExtraCallback(context, z);
        }

        public final Intent onExtraCallback(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) TransferDutchHistoryActivity.class).putExtra("fromRoomScheme", z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchHistoryActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchHistoryActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchHistoryActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchHistoryActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
