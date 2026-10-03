package viva.republica.toss.mvno;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import com.google.gson.annotations.SerializedName;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.base.BaseActivity;
import im.toss.uikit.R;
import io.fincube.creditcard.DetectionInfo;
import io.fincube.ocr.OcrScanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx2.RxConvertKt;
import o.ConvertFloatArrayToByteArray;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.IPostMessageServiceStubProxy;
import o.PageJsBridgeReadyListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access14300;
import o.castToBoolean;
import o.findResAndMsg;
import o.getAdTypeString;
import o.getBacktraceNote;
import o.getByteBuffer;
import o.getPOPOSigningKeyInput;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.setRandomHost;
import o.setRipple;
import o.setUrlPrefix;
import o.shouldBeKeptAsChild;
import o.turnOnSDKDebugger;
import o.ycxycx;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.mvno.CardInfoScanConfirmDialog;
import viva.republica.toss.mvno.CardInfoScannerActivity$;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardInfoScannerActivity extends BaseActivity {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int asBinder = 8;
    private final Lazy IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private OcrScanner IAuthTabCallback_Parcel;
    private CardInfoScanConfirmDialog asInterface;
    private boolean onTransact;

    public long getScreenId() {
        return -1L;
    }

    public static final class asInterface implements Function0<getPOPOSigningKeyInput> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public asInterface(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getPOPOSigningKeyInput invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return getPOPOSigningKeyInput.IAuthTabCallback(layoutInflater);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardInfoScannerActivity() {
        getDelegate().onNavigationEvent(2);
        this.IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asInterface(this));
        this.IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new CardInfoScannerActivity$.ExternalSyntheticLambda2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getPOPOSigningKeyInput onNavigationEvent() {
        return (getPOPOSigningKeyInput) this.IAuthTabCallbackDefault.getValue();
    }

    private final getAdTypeString IAuthTabCallback() {
        return (getAdTypeString) this.IAuthTabCallbackStub.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v65, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r3v82, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v83, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r3v84, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r3v85, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r3v86, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r3v87, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.app.Activity, viva.republica.toss.mvno.CardInfoScannerActivity] */
    public static final getAdTypeString asBinder(CardInfoScannerActivity cardInfoScannerActivity) {
        Bundle extras;
        ?? string;
        Object next;
        Intent intent = cardInfoScannerActivity.getIntent();
        setUrlPrefix seturlprefix = null;
        seturlprefix = null;
        seturlprefix = null;
        seturlprefix = null;
        seturlprefix = null;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("KEY_CARD_INFO_SCAN_LOG_DATA")) {
            if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("KEY_CARD_INFO_SCAN_LOG_DATA")) != 0) {
                    if (Intrinsics.areEqual(setUrlPrefix.class, Integer.class)) {
                        string = StringsKt.toIntOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Long.class)) {
                        string = StringsKt.toLongOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Float.class)) {
                        string = StringsKt.toFloatOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Double.class)) {
                        string = StringsKt.toDoubleOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Short.class)) {
                        string = StringsKt.toShortOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Byte.class)) {
                        string = StringsKt.toByteOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Boolean.class)) {
                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                    } else {
                        if (Intrinsics.areEqual(setUrlPrefix.class, Character.class)) {
                            string = Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(setUrlPrefix.class, String.class)) {
                            if (Intrinsics.areEqual(setUrlPrefix.class, Integer[].class)) {
                                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : listSplit$default) {
                                    if (((String) obj).length() > 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                }
                                string = arrayList2.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(setUrlPrefix.class, Long[].class)) {
                                List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : listSplit$default2) {
                                    if (((String) obj2).length() > 0) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                }
                                string = arrayList4.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(setUrlPrefix.class, Float[].class)) {
                                List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : listSplit$default3) {
                                    if (((String) obj3).length() > 0) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                }
                                string = arrayList6.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(setUrlPrefix.class, Double[].class)) {
                                List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj4 : listSplit$default4) {
                                    if (((String) obj4).length() > 0) {
                                        arrayList7.add(obj4);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                }
                                string = arrayList8.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(setUrlPrefix.class, Short[].class)) {
                                List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj5 : listSplit$default5) {
                                    if (((String) obj5).length() > 0) {
                                        arrayList9.add(obj5);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it5 = arrayList9.iterator();
                                while (it5.hasNext()) {
                                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                                }
                                string = arrayList10.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(setUrlPrefix.class, Byte[].class)) {
                                List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj6 : listSplit$default6) {
                                    if (((String) obj6).length() > 0) {
                                        arrayList11.add(obj6);
                                    }
                                }
                                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                Iterator it6 = arrayList11.iterator();
                                while (it6.hasNext()) {
                                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                }
                                string = arrayList12.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(setUrlPrefix.class, Boolean[].class)) {
                                List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList13 = new ArrayList();
                                for (Object obj7 : listSplit$default7) {
                                    if (((String) obj7).length() > 0) {
                                        arrayList13.add(obj7);
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                Iterator it7 = arrayList13.iterator();
                                while (it7.hasNext()) {
                                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                                }
                                string = arrayList14.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(setUrlPrefix.class, Character[].class)) {
                                List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj8 : listSplit$default8) {
                                    if (((String) obj8).length() > 0) {
                                        arrayList15.add(obj8);
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                Iterator it8 = arrayList15.iterator();
                                while (it8.hasNext()) {
                                    arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                                }
                                string = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(setUrlPrefix.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj9 : listSplit$default9) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList17.add(obj9);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = setUrlPrefix.class.getEnumConstants();
                                if (enumConstants != null) {
                                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                    for (Object obj10 : enumConstants) {
                                        Intrinsics.checkNotNull(obj10, "");
                                        arrayList18.add((Enum) obj10);
                                    }
                                    Iterator it9 = arrayList18.iterator();
                                    while (true) {
                                        if (!it9.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it9.next();
                                        if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                            break;
                                        }
                                    }
                                    string = (Enum) next;
                                } else {
                                    string = 0;
                                }
                                if (string == 0) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(setUrlPrefix.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                    }
                    seturlprefix = string instanceof setUrlPrefix ? string : null;
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Object obj11 = extras3 != null ? extras3.get("KEY_CARD_INFO_SCAN_LOG_DATA") : null;
                seturlprefix = (setUrlPrefix) (obj11 instanceof setUrlPrefix ? obj11 : null);
            }
        }
        return new getAdTypeString(seturlprefix);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(onNavigationEvent().onExtraCallback());
        setEngagementSignalsCallback();
        getAdTypeString getadtypestringIAuthTabCallback = IAuthTabCallback();
        CharSequence title = onNavigationEvent().writeTypedObject.getTitle();
        getadtypestringIAuthTabCallback.onNavigationEvent(title != null ? title.toString() : null);
        getSupportFragmentManager().onNavigationEvent("REQUEST_KEY_CARD_INFO_SCAN", this, new CardInfoScannerActivity$.ExternalSyntheticLambda1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWarmupCompleted(CardInfoScannerActivity cardInfoScannerActivity, String str, Bundle bundle) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        boolean z = bundle.getBoolean("RESULT_KEY_CARD_INFO_OK", false);
        if (z) {
            turnOnSDKDebugger parcelable = bundle.getParcelable("KEY_CONFIRMED_DATA");
            cardInfoScannerActivity.setResult(-1, new Intent().putExtra("EXTRA_SCAN_RESULT", new onExtraCallback("CAPTURED", parcelable != null ? parcelable.onExtraCallback() : null, parcelable != null ? parcelable.onNavigationEvent() : null)));
            cardInfoScannerActivity.finish();
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(cardInfoScannerActivity), (CoroutineContext) null, (setRandomHost) null, cardInfoScannerActivity.new IAuthTabCallbackStub(null), 3, (Object) null);
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardInfoScannerActivity.this.new IAuthTabCallbackStub(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                CardInfoScannerActivity cardInfoScannerActivity = CardInfoScannerActivity.this;
                this.label = 1;
                if (cardInfoScannerActivity.IAuthTabCallback((access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public void onResume() {
        super.onResume();
        CardInfoScanConfirmDialog cardInfoScanConfirmDialog = this.asInterface;
        if (cardInfoScanConfirmDialog == null || !cardInfoScanConfirmDialog.isAdded()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(null), 3, (Object) null);
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardInfoScannerActivity.this.new IAuthTabCallbackDefault(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                CardInfoScannerActivity cardInfoScannerActivity = CardInfoScannerActivity.this;
                this.label = 1;
                if (cardInfoScannerActivity.IAuthTabCallback((access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public void onPause() {
        super.onPause();
        OcrScanner ocrScanner = this.IAuthTabCallback_Parcel;
        if (ocrScanner != null) {
            ocrScanner.IAuthTabCallback();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        OcrScanner ocrScanner = this.IAuthTabCallback_Parcel;
        if (ocrScanner != null) {
            ocrScanner.onNavigationEvent();
        }
    }

    private final void setEngagementSignalsCallback() {
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        onNavigationEvent().extraCallbackWithResult.setOnClickListener(new CardInfoScannerActivity$.ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWarmupCompleted(CardInfoScannerActivity cardInfoScannerActivity, View view) {
        getAdTypeString getadtypestringIAuthTabCallback = cardInfoScannerActivity.IAuthTabCallback();
        CharSequence title = cardInfoScannerActivity.onNavigationEvent().writeTypedObject.getTitle();
        getadtypestringIAuthTabCallback.onExtraCallback(title != null ? title.toString() : null);
        cardInfoScannerActivity.setResult(-1, new Intent().putExtra("EXTRA_SCAN_RESULT", new onExtraCallback("MANUAL_INPUT", null, null)));
        cardInfoScannerActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(new onWarmupCompleted(this, (access13800) null), access13800Var);
        return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ICustomTabsServiceStub() {
        try {
            OcrScanner ocrScanner = this.IAuthTabCallback_Parcel;
            if (ocrScanner != null) {
                ocrScanner.onExtraCallback();
            }
        } catch (RuntimeException e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CardInfoScannerActivity", "OcrScanner.startScan error", e, (Map) null, 8, (Object) null);
            onJsBridgeReady.IAuthTabCallback(this, R.string.alert_message_camera_failed, 0, 2, (Object) null);
            finish();
        }
    }

    private final Object onExtraCallbackWithResult(Function1<? super access13800<? super Unit>, ? extends Object> function1, access13800<? super Unit> access13800Var) {
        if (this.onTransact) {
            return Unit.INSTANCE;
        }
        getByteBuffer getbytebufferAsBinder = new RxPermissions(this).onExtraCallbackWithResult(new String[]{"android.permission.CAMERA"}).onExtraCallback(1L).asBinder();
        Intrinsics.checkNotNullExpressionValue(getbytebufferAsBinder, "");
        Object objCollect = ycxycx.onWarmupCompleted(RxConvertKt.IAuthTabCallback(getbytebufferAsBinder), new onNavigationEvent(null)).collect(new IAuthTabCallback(this, function1), access13800Var);
        return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements getBacktraceNote<setRipple<? super shouldBeKeptAsChild>, Throwable, access13800<? super Unit>, Object> {
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(3, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super shouldBeKeptAsChild> setripple, Throwable th, access13800<? super Unit> access13800Var) {
            return CardInfoScannerActivity.this.new onNavigationEvent(access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            BaseActivity baseActivity = CardInfoScannerActivity.this;
            onJsBridgeReady.onNavigationEvent(baseActivity, baseActivity.getString(viva.republica.toss.R.string.cardscan_camera_permission_required), 0, 2, (Object) null);
            CardInfoScannerActivity.this.validateRelationship();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, im.toss.base.BaseActivity, viva.republica.toss.mvno.CardInfoScannerActivity] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object[]] */
    public final void onWarmupCompleted(DetectionInfo detectionInfo) {
        Bundle extras;
        ?? string;
        Object next;
        BaseActivity.IAuthTabCallback((BaseActivity) this, (String) null, false, 3, (Object) null);
        String string2 = PageJsBridgeReadyListener.onWarmupCompleted(detectionInfo).toString();
        String strIAuthTabCallback = (detectionInfo.expiry_year <= 0 || detectionInfo.expiry_month <= 0) ? "" : PageJsBridgeReadyListener.IAuthTabCallback(detectionInfo, "");
        CardInfoScanConfirmDialog.onExtraCallback onextracallback = CardInfoScanConfirmDialog.Companion;
        turnOnSDKDebugger turnonsdkdebugger = new turnOnSDKDebugger(string2, strIAuthTabCallback);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("KEY_CARD_INFO_SCAN_LOG_DATA")) {
            if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("KEY_CARD_INFO_SCAN_LOG_DATA")) != 0) {
                    if (Intrinsics.areEqual(setUrlPrefix.class, Integer.class)) {
                        string = StringsKt.toIntOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Long.class)) {
                        string = StringsKt.toLongOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Float.class)) {
                        string = StringsKt.toFloatOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Double.class)) {
                        string = StringsKt.toDoubleOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Short.class)) {
                        string = StringsKt.toShortOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Byte.class)) {
                        string = StringsKt.toByteOrNull((String) string);
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Boolean.class)) {
                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                    } else if (Intrinsics.areEqual(setUrlPrefix.class, Character.class)) {
                        string = Character.valueOf(string.charAt(0));
                    } else if (!Intrinsics.areEqual(setUrlPrefix.class, String.class)) {
                        if (Intrinsics.areEqual(setUrlPrefix.class, Integer[].class)) {
                            List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : listSplit$default) {
                                if (((String) obj).length() > 0) {
                                    arrayList.add(obj);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                            }
                            string = arrayList2.toArray(new Integer[0]);
                        } else if (Intrinsics.areEqual(setUrlPrefix.class, Long[].class)) {
                            List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : listSplit$default2) {
                                if (((String) obj2).length() > 0) {
                                    arrayList3.add(obj2);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                            }
                            string = arrayList4.toArray(new Long[0]);
                        } else if (Intrinsics.areEqual(setUrlPrefix.class, Float[].class)) {
                            List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj3 : listSplit$default3) {
                                if (((String) obj3).length() > 0) {
                                    arrayList5.add(obj3);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                            }
                            string = arrayList6.toArray(new Float[0]);
                        } else if (Intrinsics.areEqual(setUrlPrefix.class, Double[].class)) {
                            List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj4 : listSplit$default4) {
                                if (((String) obj4).length() > 0) {
                                    arrayList7.add(obj4);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                            }
                            string = arrayList8.toArray(new Double[0]);
                        } else if (Intrinsics.areEqual(setUrlPrefix.class, Short[].class)) {
                            List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj5 : listSplit$default5) {
                                if (((String) obj5).length() > 0) {
                                    arrayList9.add(obj5);
                                }
                            }
                            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                            Iterator it5 = arrayList9.iterator();
                            while (it5.hasNext()) {
                                arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                            }
                            string = arrayList10.toArray(new Short[0]);
                        } else if (Intrinsics.areEqual(setUrlPrefix.class, Byte[].class)) {
                            List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj6 : listSplit$default6) {
                                if (((String) obj6).length() > 0) {
                                    arrayList11.add(obj6);
                                }
                            }
                            ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                            Iterator it6 = arrayList11.iterator();
                            while (it6.hasNext()) {
                                arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                            }
                            string = arrayList12.toArray(new Byte[0]);
                        } else if (Intrinsics.areEqual(setUrlPrefix.class, Boolean[].class)) {
                            List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList13 = new ArrayList();
                            for (Object obj7 : listSplit$default7) {
                                if (((String) obj7).length() > 0) {
                                    arrayList13.add(obj7);
                                }
                            }
                            ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                            Iterator it7 = arrayList13.iterator();
                            while (it7.hasNext()) {
                                arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                            }
                            string = arrayList14.toArray(new Boolean[0]);
                        } else if (Intrinsics.areEqual(setUrlPrefix.class, Character[].class)) {
                            List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList15 = new ArrayList();
                            for (Object obj8 : listSplit$default8) {
                                if (((String) obj8).length() > 0) {
                                    arrayList15.add(obj8);
                                }
                            }
                            ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                            Iterator it8 = arrayList15.iterator();
                            while (it8.hasNext()) {
                                arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                            }
                            string = arrayList16.toArray(new Character[0]);
                        } else if (Intrinsics.areEqual(setUrlPrefix.class, String[].class)) {
                            List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList17 = new ArrayList();
                            for (Object obj9 : listSplit$default9) {
                                if (((String) obj9).length() > 0) {
                                    arrayList17.add(obj9);
                                }
                            }
                            string = arrayList17.toArray(new String[0]);
                        } else {
                            Object[] enumConstants = setUrlPrefix.class.getEnumConstants();
                            if (enumConstants != null) {
                                ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                for (Object obj10 : enumConstants) {
                                    Intrinsics.checkNotNull(obj10, "");
                                    arrayList18.add((Enum) obj10);
                                }
                                Iterator it9 = arrayList18.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        next = it9.next();
                                        if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                string = (Enum) next;
                            } else {
                                string = 0;
                            }
                            if (string == 0) {
                                if (zzaj.onNavigationEvent().onActivityLayout()) {
                                    throw new IllegalArgumentException(setUrlPrefix.class.getSimpleName() + " is not supported");
                                }
                                string = 0;
                            }
                        }
                    }
                    seturlprefix = string instanceof setUrlPrefix ? string : null;
                }
            } else {
                Bundle extras3 = intent.getExtras();
                setUrlPrefix seturlprefix = extras3 != null ? extras3.get("KEY_CARD_INFO_SCAN_LOG_DATA") : null;
                seturlprefix = seturlprefix instanceof setUrlPrefix ? seturlprefix : null;
            }
        }
        onExtraCallbackWithResult(onextracallback.IAuthTabCallback(turnonsdkdebugger, seturlprefix));
        castToBoolean.onExtraCallbackWithResult(detectionInfo);
        bo_();
    }

    private final void onExtraCallbackWithResult(CardInfoScanConfirmDialog cardInfoScanConfirmDialog) {
        this.asInterface = cardInfoScanConfirmDialog;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        cardInfoScanConfirmDialog.show(supportFragmentManager, "CardInfoScannerActivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateRelationship() {
        finish();
    }

    public static final class onExtraCallback implements Parcelable {
        public static final Parcelable.Creator<onExtraCallback> CREATOR = new IAuthTabCallback();

        @SerializedName("cardNo")
        private final String onExtraCallbackWithResult;

        @SerializedName("cardExpiry")
        private final String onNavigationEvent;

        @SerializedName("resultType")
        private final String onWarmupCompleted;

        public static final class IAuthTabCallback implements Parcelable.Creator<onExtraCallback> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final onExtraCallback createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new onExtraCallback(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final onExtraCallback[] newArray(int i) {
                return new onExtraCallback[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.onWarmupCompleted);
            parcel.writeString(this.onExtraCallbackWithResult);
            parcel.writeString(this.onNavigationEvent);
        }

        public onExtraCallback(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = str2;
            this.onNavigationEvent = str3;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull setUrlPrefix seturlprefix) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(seturlprefix, "");
            Intent intent = new Intent(context, (Class<?>) CardInfoScannerActivity.class);
            intent.putExtra("KEY_CARD_INFO_SCAN_LOG_DATA", (Parcelable) seturlprefix);
            return intent;
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
