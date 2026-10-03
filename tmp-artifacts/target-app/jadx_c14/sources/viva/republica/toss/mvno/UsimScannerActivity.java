package viva.republica.toss.mvno;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import com.google.gson.annotations.SerializedName;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.dm7.barcodescanner.zbar.Result;
import net.sourceforge.zbar.Image;
import net.sourceforge.zbar.Symbol;
import o.AdSize;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.IPostMessageServiceStubProxy;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.fromWidthAndHeight;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.setVideoAutoplayOnMobile;
import o.shouldBeKeptAsChild;
import o.zzad;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.mvno.UsimScannerActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UsimScannerActivity extends BaseActivity implements ImprovedZBarScannerView$onExtraCallback, AdSize {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int asInterface = 8;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;

    public long getScreenId() {
        return -1L;
    }

    public UsimScannerActivity() {
        getDelegate().onNavigationEvent(2);
    }

    private final UsimScanner onNavigationEvent() {
        UsimScanner usimScannerFindViewById = findViewById(R.id.scanner_view);
        Intrinsics.checkNotNullExpressionValue(usimScannerFindViewById, "");
        return usimScannerFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, android.content.Context, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, im.toss.uikit.base.UIKitBaseActivity, viva.republica.toss.mvno.UsimScannerActivity] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object[]] */
    public void onCreate(@Nullable Bundle bundle) {
        Bundle extras;
        ?? string;
        Object next;
        super.onCreate(bundle);
        setContentView(R.layout.activity_usim_scanner);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            supportActionBar.onWarmupCompleted(new ColorDrawable(ContextCompat.getColor((Context) this, im.toss.uikit.R.color.transparent)));
            Unit unit = Unit.INSTANCE;
        }
        UsimViewFinder usimViewFinderIAuthTabCallbackDefault = onNavigationEvent().IAuthTabCallbackDefault();
        UsimViewFinder usimViewFinder = usimViewFinderIAuthTabCallbackDefault instanceof UsimViewFinder ? usimViewFinderIAuthTabCallbackDefault : null;
        if (usimViewFinder != null) {
            Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("extra.scanGuideText")) {
                if (zzbq.onNavigationEvent(intent)) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null && (string = extras2.getString("extra.scanGuideText")) != 0) {
                        if (Intrinsics.areEqual(fromWidthAndHeight.class, Integer.class)) {
                            string = StringsKt.toIntOrNull((String) string);
                        } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Long.class)) {
                            string = StringsKt.toLongOrNull((String) string);
                        } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Float.class)) {
                            string = StringsKt.toFloatOrNull((String) string);
                        } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Double.class)) {
                            string = StringsKt.toDoubleOrNull((String) string);
                        } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Short.class)) {
                            string = StringsKt.toShortOrNull((String) string);
                        } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Byte.class)) {
                            string = StringsKt.toByteOrNull((String) string);
                        } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Boolean.class)) {
                            string = Boolean.valueOf(Boolean.parseBoolean(string));
                        } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Character.class)) {
                            string = Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(fromWidthAndHeight.class, String.class)) {
                            if (Intrinsics.areEqual(fromWidthAndHeight.class, Integer[].class)) {
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
                            } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Long[].class)) {
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
                            } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Float[].class)) {
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
                            } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Double[].class)) {
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
                            } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Short[].class)) {
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
                            } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Byte[].class)) {
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
                            } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Boolean[].class)) {
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
                            } else if (Intrinsics.areEqual(fromWidthAndHeight.class, Character[].class)) {
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
                            } else if (Intrinsics.areEqual(fromWidthAndHeight.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj9 : listSplit$default9) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList17.add(obj9);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = fromWidthAndHeight.class.getEnumConstants();
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
                                        throw new IllegalArgumentException(fromWidthAndHeight.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                        fromwidthandheight = string instanceof fromWidthAndHeight ? string : null;
                    }
                } else {
                    Bundle extras3 = intent.getExtras();
                    fromWidthAndHeight fromwidthandheight = extras3 != null ? extras3.get("extra.scanGuideText") : null;
                    fromwidthandheight = fromwidthandheight instanceof fromWidthAndHeight ? fromwidthandheight : null;
                }
            }
            if (fromwidthandheight != null) {
                setTitle(fromwidthandheight.onWarmupCompleted());
                usimViewFinder.setScanGuideText(fromwidthandheight.onExtraCallbackWithResult(), fromwidthandheight.IAuthTabCallback(), fromwidthandheight.onExtraCallback());
                Unit unit2 = Unit.INSTANCE;
            }
            usimViewFinder.onNavigationEvent().setOnClickListener(new UsimScannerActivity$.ExternalSyntheticLambda0((UsimScannerActivity) this));
            Unit unit3 = Unit.INSTANCE;
        }
        this.IAuthTabCallbackDefault = bundle != null ? bundle.getBoolean("e2eTestImageInputDismissed") : false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(UsimScannerActivity usimScannerActivity, View view) {
        usimScannerActivity.validateRelationship();
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("e2eTestImageInputDismissed", this.IAuthTabCallbackDefault);
    }

    private final void validateRelationship() {
        onExtraCallbackWithResult(new onExtraCallback("MANUAL_INPUT", null));
    }

    private final void IAuthTabCallback(String str) {
        onExtraCallbackWithResult(new onExtraCallback("CAPTURED", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(onExtraCallback onextracallback) {
        setResult(-1, new Intent().putExtra("extra.scanResult", onextracallback));
        finish();
    }

    public void onPause() {
        super.onPause();
        onNavigationEvent().onWarmupCompleted();
    }

    public void onResume() {
        super.onResume();
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return UsimScannerActivity.this.new onExtraCallbackWithResult(access13800Var);
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
                zzad zzadVarOnNavigationEvent = zzaj.onNavigationEvent();
                this.label = 1;
                obj = zzadVarOnNavigationEvent.onWarmupCompleted(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (((Boolean) obj).booleanValue() && !UsimScannerActivity.this.IAuthTabCallbackDefault) {
                UsimScannerActivity.this.updateVisuals();
                return Unit.INSTANCE;
            }
            if (UsimScannerActivity.this.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED)) {
                UsimScannerActivity.this.ICustomTabsServiceStub();
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ICustomTabsServiceStub() {
        if (!this.IAuthTabCallbackStub) {
            setEngagementSignalsCallback();
        } else if (new RxPermissions(this).onExtraCallbackWithResult("android.permission.CAMERA")) {
            ICustomTabsServiceDefault();
        }
    }

    private final void setEngagementSignalsCallback() {
        new RxPermissions(this).onExtraCallbackWithResult(new String[]{"android.permission.CAMERA"}).IAuthTabCallback(new UsimScannerActivity$.ExternalSyntheticLambda4(new UsimScannerActivity$.ExternalSyntheticLambda3(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallback(UsimScannerActivity usimScannerActivity, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        if (shouldbekeptaschild.onNavigationEvent) {
            usimScannerActivity.ICustomTabsServiceDefault();
        } else if (shouldbekeptaschild.onExtraCallbackWithResult) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 46481), 13 - View.MeasureSpec.getMode(0), View.MeasureSpec.getSize(0) + 22731, -1820028492, false, "IAuthTabCallback", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object[] objArr = {usimScannerActivity, usimScannerActivity.getString(R.string.app_mvno___ac0f0e974e)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-899718983);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46479), (ViewConfiguration.getTapTimeout() >> 16) + 13, 22730 - TextUtils.lastIndexOf("", '0'), -81813975, false, "onNavigationEvent", new Class[]{Context.class, String.class});
                }
                ((Method) objOnExtraCallback2).invoke(obj, objArr);
                usimScannerActivity.finish();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            String string = usimScannerActivity.getString(R.string.app_mvno___5253403f72);
            Intrinsics.checkNotNullExpressionValue(string, "");
            usimScannerActivity.IAuthTabCallback(string, true);
        }
        usimScannerActivity.IAuthTabCallbackStub = true;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() {
        if (isFinishing()) {
            return;
        }
        try {
            onNavigationEvent().setResultHandler(this);
            onNavigationEvent().onNavigationEvent();
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("UsimScannerActivity", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(String str, boolean z) {
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.Companion.onExtraCallback(this).onNavigationEvent(false)).onExtraCallbackWithResult(str), R.string.permission_action_go_to_setting, new UsimScannerActivity$.ExternalSyntheticLambda1(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        String string = getString(im.toss.uikit.R.string.uikit_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {onwarmupcompletedOnExtraCallbackWithResult, string, new UsimScannerActivity$.ExternalSyntheticLambda2(z, this), null, false, 12, null};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), objArr, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1871975236, 1871975236, iOnExtraCallbackWithResult2)).readTypedObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onExtraCallbackWithResult(UsimScannerActivity usimScannerActivity, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + usimScannerActivity.getApplicationContext().getPackageName()));
        usimScannerActivity.startActivity(intent);
        usimScannerActivity.IAuthTabCallbackStub = false;
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(boolean z, UsimScannerActivity usimScannerActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (z) {
            usimScannerActivity.finish();
        }
    }

    @Override // viva.republica.toss.mvno.ImprovedZBarScannerView$onExtraCallback
    public void onExtraCallback(@Nullable Result result) {
        String strOnWarmupCompleted;
        if (result == null || (strOnWarmupCompleted = result.onWarmupCompleted()) == null) {
            strOnWarmupCompleted = "";
        }
        IAuthTabCallback(strOnWarmupCompleted);
    }

    private final UsimScanE2eTestImageInputSheet IAuthTabCallback() {
        UsimScanE2eTestImageInputSheet usimScanE2eTestImageInputSheetFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("UsimScanE2eTestImageInputSheet");
        if (usimScanE2eTestImageInputSheetFindFragmentByTag instanceof UsimScanE2eTestImageInputSheet) {
            return usimScanE2eTestImageInputSheetFindFragmentByTag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVisuals() {
        if (IAuthTabCallback() != null || getSupportFragmentManager().ICustomTabsService()) {
            return;
        }
        UsimScanE2eTestImageInputSheet usimScanE2eTestImageInputSheet = new UsimScanE2eTestImageInputSheet();
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        usimScanE2eTestImageInputSheet.show(supportFragmentManager, "UsimScanE2eTestImageInputSheet");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AdSize
    public void onWarmupCompleted(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        String strOnExtraCallback = onExtraCallback(bitmap);
        if (strOnExtraCallback != null) {
            IAuthTabCallback(strOnExtraCallback);
            return;
        }
        UsimScanE2eTestImageInputSheet usimScanE2eTestImageInputSheetIAuthTabCallback = IAuthTabCallback();
        if (usimScanE2eTestImageInputSheetIAuthTabCallback != null) {
            String string = getString(R.string.e2e_test_usim_barcode_not_found);
            Intrinsics.checkNotNullExpressionValue(string, "");
            usimScanE2eTestImageInputSheetIAuthTabCallback.onWarmupCompleted(string);
        }
    }

    @Override // o.AdSize
    public void onExtraCallbackWithResult() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ICustomTabsServiceStub();
    }

    private final String onExtraCallback(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            bArr[i2] = (byte) ((((((i3 >> 16) & 255) * 299) + (((i3 >> 8) & 255) * 587)) + ((i3 & 255) * 114)) / 1000);
        }
        Image image = new Image(width, height, "Y800");
        image.setData(bArr);
        Symbol symbolOnWarmupCompleted = setVideoAutoplayOnMobile.onWarmupCompleted(setVideoAutoplayOnMobile.IAuthTabCallback(onNavigationEvent().onExtraCallbackWithResult()), image);
        if (symbolOnWarmupCompleted != null) {
            return setVideoAutoplayOnMobile.onWarmupCompleted(symbolOnWarmupCompleted);
        }
        return null;
    }

    public static final class onExtraCallback implements Parcelable {
        public static final Parcelable.Creator<onExtraCallback> CREATOR = new onExtraCallbackWithResult();

        @SerializedName("usimNumber")
        private final String onExtraCallback;

        @SerializedName("resultType")
        private final String onWarmupCompleted;

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<onExtraCallback> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final onExtraCallback[] newArray(int i) {
                return new onExtraCallback[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final onExtraCallback createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new onExtraCallback(parcel.readString(), parcel.readString());
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
            parcel.writeString(this.onExtraCallback);
        }

        public onExtraCallback(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
            this.onExtraCallback = str2;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull fromWidthAndHeight fromwidthandheight) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(fromwidthandheight, "");
            Intent intent = new Intent(context, (Class<?>) UsimScannerActivity.class);
            intent.putExtra("extra.scanGuideText", (Parcelable) fromwidthandheight);
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
