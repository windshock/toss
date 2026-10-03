package viva.republica.toss.card;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.common.collect.Synchronized;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
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
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.AppLovinAdImpl;
import o.BuildConfigApi;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DefaultMediaViewVideoRendererApi;
import o.IPostMessageServiceStubProxy;
import o.KeyAgreeRecipientIdentifier;
import o.SessionTrackera;
import o.SetDetectableSize;
import o.access8100;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.getDummyAd;
import o.getParamImp;
import o.getRKeyID;
import o.getVersionOverride;
import o.getWrite;
import o.initMiniApp;
import o.onVisit;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.writeRaw;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.card.UserCardSettingActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UserCardSettingActivity extends Hilt_UserCardSettingActivity implements KeyAgreeRecipientIdentifier {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int IAuthTabCallbackStub = 8;
    private Function1<? super Boolean, Unit> asBinder;

    @Inject
    public getDummyAd termsIntent;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.card.UserCardSettingActivity$$ExternalSyntheticLambda17
        public final Object invoke() {
            return UserCardSettingActivity.IAuthTabCallback(this.f$0);
        }
    });
    private final SessionTrackera onTransact = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.card.UserCardSettingActivity$$ExternalSyntheticLambda18
        public final Object invoke(Object obj) {
            return UserCardSettingActivity.onNavigationEvent(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        }
    });

    public long getScreenId() {
        return 1000998L;
    }

    public final getDummyAd IAuthTabCallback() {
        getDummyAd getdummyad = this.termsIntent;
        if (getdummyad != null) {
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public Map<String, Object> getScreenParams() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("reference_id", onNavigationEvent()), getWrite.IAuthTabCallback("dst_yn", "N")});
    }

    @Override // o.KeyAgreeRecipientIdentifier
    public SessionTrackera ITrustedWebActivityCallbackStubProxy() {
        return this.onTransact;
    }

    @Override // o.KeyAgreeRecipientIdentifier
    public void onExtraCallback(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.asBinder = function1;
    }

    private final String onNavigationEvent() {
        return (String) this.IAuthTabCallbackDefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String IAuthTabCallback(UserCardSettingActivity userCardSettingActivity) {
        Uri data = userCardSettingActivity.getIntent().getData();
        if (data != null) {
            return data.getQueryParameter("referenceId");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(UserCardSettingActivity userCardSettingActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        Function1<? super Boolean, Unit> function1 = userCardSettingActivity.asBinder;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()));
        }
        userCardSettingActivity.asBinder = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, im.toss.uikit.base.UIKitBaseActivity, viva.republica.toss.card.UserCardSettingActivity] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object[]] */
    @Override // viva.republica.toss.card.Hilt_UserCardSettingActivity
    public void onCreate(@Nullable Bundle bundle) {
        Bundle extras;
        ?? string;
        Object next;
        super.onCreate(bundle);
        setContentView(R.layout.activity_user_card_setting);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            Unit unit = Unit.INSTANCE;
        }
        View viewFindViewById = findViewById(R.id.rootView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(viewFindViewById, findViewById(R.id.appBarLayout), (View) null, (View) null, false, 14, (Object) null);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("cardCode")) {
            if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("cardCode")) != 0) {
                    if (Intrinsics.areEqual(Integer.class, Integer.class)) {
                        string = StringsKt.toIntOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Long.class)) {
                        string = StringsKt.toLongOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Float.class)) {
                        string = StringsKt.toFloatOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Double.class)) {
                        string = StringsKt.toDoubleOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Short.class)) {
                        string = StringsKt.toShortOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Byte.class)) {
                        string = StringsKt.toByteOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Boolean.class)) {
                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                    } else {
                        if (Intrinsics.areEqual(Integer.class, Character.class)) {
                            string = Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(Integer.class, String.class)) {
                            if (Intrinsics.areEqual(Integer.class, Integer[].class)) {
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
                            } else if (Intrinsics.areEqual(Integer.class, Long[].class)) {
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
                            } else if (Intrinsics.areEqual(Integer.class, Float[].class)) {
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
                            } else if (Intrinsics.areEqual(Integer.class, Double[].class)) {
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
                            } else if (Intrinsics.areEqual(Integer.class, Short[].class)) {
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
                            } else if (Intrinsics.areEqual(Integer.class, Byte[].class)) {
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
                            } else if (Intrinsics.areEqual(Integer.class, Boolean[].class)) {
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
                            } else if (Intrinsics.areEqual(Integer.class, Character[].class)) {
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
                            } else if (Intrinsics.areEqual(Integer.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj9 : listSplit$default9) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList17.add(obj9);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = Integer.class.getEnumConstants();
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
                                        throw new IllegalArgumentException(Integer.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                    }
                    num = string instanceof Integer ? string : null;
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Integer num = extras3 != null ? extras3.get("cardCode") : null;
                num = num instanceof Integer ? num : null;
            }
        }
        int iIntValue = (num != null ? num : -1).intValue();
        if (iIntValue == -1) {
            finish();
            return;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallback = getRKeyID.onWarmupCompleted.IAuthTabCallback(iIntValue).onExtraCallback(new UserCardSettingActivity$.ExternalSyntheticLambda7(new UserCardSettingActivity$.ExternalSyntheticLambda6((UserCardSettingActivity) this)), new UserCardSettingActivity$.ExternalSyntheticLambda9(new UserCardSettingActivity$.ExternalSyntheticLambda8((UserCardSettingActivity) this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallback, "");
        onNavigationEvent(deserializeurinullablecollectionOnExtraCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(UserCardSettingActivity userCardSettingActivity, getVersionOverride getversionoverride) {
        Intrinsics.checkNotNull(getversionoverride);
        userCardSettingActivity.onExtraCallback(getversionoverride);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access000(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(UserCardSettingActivity userCardSettingActivity, Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(onVisit.IAuthTabCallback(userCardSettingActivity), th);
        userCardSettingActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(getVersionOverride getversionoverride) {
        TextView textView = (TextView) findViewById(R.id.card_name);
        if (textView != null) {
            textView.setText(getversionoverride.onNavigationEvent());
        }
        TextView textView2 = (TextView) findViewById(R.id.card_no);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        String strAccess100 = getversionoverride.access100();
        if (strAccess100 != null && strAccess100.length() != 0) {
            TdsListRowV1View tdsListRowV1ViewFindViewById = findViewById(R.id.call_center);
            tdsListRowV1ViewFindViewById.setCenterText1(getString(R.string.app_card___46d65ab1e0, getversionoverride.onNavigationEvent()));
            tdsListRowV1ViewFindViewById.setRightType(TdsListRowV1View.asBinder.ROW1B);
            tdsListRowV1ViewFindViewById.setRightText1(strAccess100);
            tdsListRowV1ViewFindViewById.setVisibility(0);
        }
        TdsListRowV1View tdsListRowV1ViewFindViewById2 = findViewById(R.id.close_card);
        if (tdsListRowV1ViewFindViewById2 != null) {
            tdsListRowV1ViewFindViewById2.setVisibility(8);
        }
        TdsListRowV1View tdsListRowV1ViewFindViewById3 = findViewById(R.id.delete_card);
        if (tdsListRowV1ViewFindViewById3 != null) {
            tdsListRowV1ViewFindViewById3.setVisibility(8);
        }
        onExtraCallbackWithResult(getversionoverride.IAuthTabCallback(), getversionoverride.onNavigationEvent());
    }

    private final void onExtraCallbackWithResult(int i, String str) {
        getRKeyID.onWarmupCompleted.IAuthTabCallback(i).onExtraCallback(new UserCardSettingActivity$.ExternalSyntheticLambda1(new UserCardSettingActivity$.ExternalSyntheticLambda0(this, str, i)), new UserCardSettingActivity$.ExternalSyntheticLambda3(new UserCardSettingActivity$.ExternalSyntheticLambda2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallbackWithResult(UserCardSettingActivity userCardSettingActivity, String str, int i, getVersionOverride getversionoverride) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = getversionoverride.getInterfaceDescriptor() == DefaultMediaViewVideoRendererApi.SUBSCRIBE;
        TdsListRowV1View tdsListRowV1ViewFindViewById = userCardSettingActivity.findViewById(R.id.card_notification);
        if (tdsListRowV1ViewFindViewById != null) {
            tdsListRowV1ViewFindViewById.setVisibility(0);
            tdsListRowV1ViewFindViewById.setRightType(TdsListRowV1View.asBinder.SWITCH);
            ConvertByteArrayToFloatArray.onExtraCallback(1010441L, false, (String) null, (Map) null, new UserCardSettingActivity$.ExternalSyntheticLambda4(userCardSettingActivity, str), 14, (Object) null);
            String string = userCardSettingActivity.getString(R.string.app_card___2e8856b730, str);
            Intrinsics.checkNotNullExpressionValue(string, "");
            userCardSettingActivity.asInterface(string);
            TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1ViewFindViewById, booleanRef.element, false, 2, (Object) null);
            TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1ViewFindViewById}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (tdsSwitchV1View != null) {
                tdsSwitchV1View.setOnCheckedChangeListener(new UserCardSettingActivity$.ExternalSyntheticLambda5(booleanRef, userCardSettingActivity, i, str, tdsListRowV1ViewFindViewById));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(UserCardSettingActivity userCardSettingActivity, String str, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(userCardSettingActivity.getScreenParams());
        setDetectableSize.onExtraCallback("card_vendor_name", str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Ref.BooleanRef booleanRef, UserCardSettingActivity userCardSettingActivity, int i, String str, TdsListRowV1View tdsListRowV1View, CompoundButton compoundButton, boolean z) throws Throwable {
        writeRaw<BuildConfigApi> writerawIAuthTabCallback;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        if (booleanRef.element == z) {
            return;
        }
        if (z) {
            ConvertByteArrayToFloatArray.onExtraCallback(1007703L, false, (String) null, (Map) null, new UserCardSettingActivity$.ExternalSyntheticLambda11(userCardSettingActivity, str), 14, (Object) null);
            writerawIAuthTabCallback = getRKeyID.IAuthTabCallback(getRKeyID.onWarmupCompleted, userCardSettingActivity, userCardSettingActivity.IAuthTabCallback(), i, false, "card_setting", false, 40, null);
        } else {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1007705L, false, (String) null, (Map) null, new UserCardSettingActivity$.ExternalSyntheticLambda12(userCardSettingActivity, str), 14, (Object) null);
            writerawIAuthTabCallback = getRKeyID.onWarmupCompleted.IAuthTabCallback(userCardSettingActivity, Integer.valueOf(i), "card_setting");
        }
        writerawIAuthTabCallback.onNavigationEvent(new UserCardSettingActivity$.ExternalSyntheticLambda14(new UserCardSettingActivity$.ExternalSyntheticLambda13(booleanRef, z, tdsListRowV1View)), new UserCardSettingActivity$.ExternalSyntheticLambda16(new UserCardSettingActivity$.ExternalSyntheticLambda15(userCardSettingActivity, tdsListRowV1View, z)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(UserCardSettingActivity userCardSettingActivity, String str, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(userCardSettingActivity.getScreenParams());
        setDetectableSize.onExtraCallback("card_vendor_name", str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asInterface(UserCardSettingActivity userCardSettingActivity, String str, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(userCardSettingActivity.getScreenParams());
        setDetectableSize.onExtraCallback("card_vendor_name", str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access100(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(Ref.BooleanRef booleanRef, boolean z, TdsListRowV1View tdsListRowV1View, BuildConfigApi buildConfigApi) {
        if (buildConfigApi.onWarmupCompleted()) {
            booleanRef.element = z;
        } else {
            TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View, !z, false, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onNavigationEvent(UserCardSettingActivity userCardSettingActivity, TdsListRowV1View tdsListRowV1View, boolean z, Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("UserCardSettingActivity", th);
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, userCardSettingActivity, false, (initMiniApp) null, (Function0) null, new UserCardSettingActivity$.ExternalSyntheticLambda10(tdsListRowV1View, z), 14, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(TdsListRowV1View tdsListRowV1View, boolean z, DialogInterface dialogInterface) {
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View, !z, false, 2, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asInterface(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void extraCallbackWithResult(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    @Override // viva.republica.toss.card.Hilt_UserCardSettingActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.card.Hilt_UserCardSettingActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.card.Hilt_UserCardSettingActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.card.Hilt_UserCardSettingActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
