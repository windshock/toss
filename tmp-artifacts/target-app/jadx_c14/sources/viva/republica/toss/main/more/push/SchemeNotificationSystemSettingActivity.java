package viva.republica.toss.main.more.push;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import im.toss.deeplink.annotation.TransparentDeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.EncodedDataImplExternalSyntheticLambda0;
import o.onJsBridgeReady;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.trackCheckout;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.push.SchemeNotificationSystemSettingActivity$;

@TransparentDeepLink
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeNotificationSystemSettingActivity extends Hilt_SchemeNotificationSystemSettingActivity {
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.main.more.push.SchemeNotificationSystemSettingActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            return Boolean.valueOf(SchemeNotificationSystemSettingActivity.IAuthTabCallback(this.f$0));
        }
    });

    @Inject
    public trackCheckout notificationHelper;

    public long getScreenId() {
        return -1L;
    }

    public final trackCheckout IAuthTabCallback() {
        trackCheckout trackcheckout = this.notificationHelper;
        if (trackcheckout != null) {
            return trackcheckout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.app.Activity, viva.republica.toss.main.more.push.SchemeNotificationSystemSettingActivity] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v65, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v74, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v81, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r4v82, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v83, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r4v84, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r4v85, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r4v86, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r4v87, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r4v89, types: [java.lang.Integer] */
    public static final boolean IAuthTabCallback(SchemeNotificationSystemSettingActivity schemeNotificationSystemSettingActivity) {
        Bundle extras;
        ?? string;
        Object next;
        Intent intent = schemeNotificationSystemSettingActivity.getIntent();
        ?? r0 = Boolean.FALSE;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("forced")) {
            if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("forced")) != 0) {
                    if (Intrinsics.areEqual(Boolean.class, Integer.class)) {
                        string = StringsKt.toIntOrNull((String) string);
                    } else if (Intrinsics.areEqual(Boolean.class, Long.class)) {
                        string = StringsKt.toLongOrNull((String) string);
                    } else if (Intrinsics.areEqual(Boolean.class, Float.class)) {
                        string = StringsKt.toFloatOrNull((String) string);
                    } else if (Intrinsics.areEqual(Boolean.class, Double.class)) {
                        string = StringsKt.toDoubleOrNull((String) string);
                    } else if (Intrinsics.areEqual(Boolean.class, Short.class)) {
                        string = StringsKt.toShortOrNull((String) string);
                    } else if (Intrinsics.areEqual(Boolean.class, Byte.class)) {
                        string = StringsKt.toByteOrNull((String) string);
                    } else if (Intrinsics.areEqual(Boolean.class, Boolean.class)) {
                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                    } else {
                        if (Intrinsics.areEqual(Boolean.class, Character.class)) {
                            string = Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(Boolean.class, String.class)) {
                            if (Intrinsics.areEqual(Boolean.class, Integer[].class)) {
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
                            } else if (Intrinsics.areEqual(Boolean.class, Long[].class)) {
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
                            } else if (Intrinsics.areEqual(Boolean.class, Float[].class)) {
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
                            } else if (Intrinsics.areEqual(Boolean.class, Double[].class)) {
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
                            } else if (Intrinsics.areEqual(Boolean.class, Short[].class)) {
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
                            } else if (Intrinsics.areEqual(Boolean.class, Byte[].class)) {
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
                            } else if (Intrinsics.areEqual(Boolean.class, Boolean[].class)) {
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
                            } else if (Intrinsics.areEqual(Boolean.class, Character[].class)) {
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
                            } else if (Intrinsics.areEqual(Boolean.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj9 : listSplit$default9) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList17.add(obj9);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = Boolean.class.getEnumConstants();
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
                                        throw new IllegalArgumentException(Boolean.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                    }
                    obj = (Boolean) (string instanceof Boolean ? string : null);
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Object obj11 = extras3 != null ? extras3.get("forced") : null;
                obj = (Boolean) (obj11 instanceof Boolean ? obj11 : null);
            }
        }
        if (obj != null) {
            r0 = obj;
        }
        return r0.booleanValue();
    }

    private final boolean onNavigationEvent() {
        return ((Boolean) this.IAuthTabCallbackDefault.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.main.more.push.Hilt_SchemeNotificationSystemSettingActivity
    public void onCreate(@Nullable Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        String host = data != null ? data.getHost() : null;
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -848629812) {
                if (iHashCode == 595233003 && host.equals("notification")) {
                    if (onNavigationEvent() || !EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(this).onWarmupCompleted()) {
                        r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI systemNotificationBottomSheetDialog = new SystemNotificationBottomSheetDialog(this, null, null, null, null, null, null, 126, null);
                        systemNotificationBottomSheetDialog.setOnDismissListener(new SchemeNotificationSystemSettingActivity$.ExternalSyntheticLambda0(this));
                        systemNotificationBottomSheetDialog.show();
                        return;
                    } else {
                        onJsBridgeReady.IAuthTabCallback(this, R.string.notification_system_setting_already_on, 0, 2, (Object) null);
                        finish();
                        return;
                    }
                }
            } else if (host.equals("osSetting")) {
                if (onNavigationEvent() || !EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(this).onWarmupCompleted()) {
                    IAuthTabCallback().asBinder(this);
                    finish();
                    return;
                } else {
                    onJsBridgeReady.IAuthTabCallback(this, R.string.notification_system_setting_already_on, 0, 2, (Object) null);
                    finish();
                    return;
                }
            }
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(SchemeNotificationSystemSettingActivity schemeNotificationSystemSettingActivity, DialogInterface dialogInterface) {
        schemeNotificationSystemSettingActivity.finish();
    }

    public String getScreenName() {
        return "";
    }

    @Override // viva.republica.toss.main.more.push.Hilt_SchemeNotificationSystemSettingActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.main.more.push.Hilt_SchemeNotificationSystemSettingActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.main.more.push.Hilt_SchemeNotificationSystemSettingActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.main.more.push.Hilt_SchemeNotificationSystemSettingActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
