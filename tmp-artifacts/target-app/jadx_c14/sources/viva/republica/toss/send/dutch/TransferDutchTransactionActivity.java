package viva.republica.toss.send.dutch;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.base.BaseActivity;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.access8100;
import o.getNavigationBar;
import o.getWrite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.send.dutch.TransferDutchInviteActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferDutchTransactionActivity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char[] asBinder = null;
    private static int asInterface = 0;
    private static int onTransact = 1;

    static {
        IAuthTabCallback();
        Companion = new onWarmupCompleted(null);
        int i = IAuthTabCallbackDefault + 19;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 22 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 2, '\t', 3, 13823, 13823, 2, '\r'}, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 24), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = getIntent();
        Object[] objArr2 = new Object[1];
        a(new char[]{'\r', 2, '\t', 3, 13823, 13823, 2, '\r'}, (byte) (Gravity.getAbsoluteGravity(0, 0) + 23), TextUtils.lastIndexOf("", '0') + 9, objArr2);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()))});
        int i4 = asInterface + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (!setEngagementSignalsCallback()) {
            Intent intentIAuthTabCallback = TransferDutchInputAmountActivity.Companion.IAuthTabCallback(this);
            Object obj = null;
            Object[] objArr = new Object[1];
            a(new char[]{'\r', 2, '\t', 3, 13823, 13823, 2, '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022895).substring(0, 9).length() + 14), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Intent intent = getIntent();
            Object[] objArr2 = new Object[1];
            a(new char[]{'\r', 2, '\t', 3, 13823, 13823, 2, '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022712).substring(0, 17).codePointAt(14) - 91), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 93, objArr2);
            intentIAuthTabCallback.putExtra(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()));
            startActivityForResult(intentIAuthTabCallback, 30004);
            int i4 = IAuthTabCallbackStubProxy + 97;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallbackStubProxy + 93;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x1056  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x106e  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x1072  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x1088 A[LOOP:0: B:585:0x1086->B:586:0x1088, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v122, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v127, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v132, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v137, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v142, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v147, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v152, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v157, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v164, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v172, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r1v174, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v175, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r1v176, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r1v177, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v178, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v179, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v180 */
    /* JADX WARN: Type inference failed for: r1v187, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r29v0, types: [android.app.Activity, android.content.Context, androidx.activity.ComponentActivity, viva.republica.toss.send.dutch.TransferDutchTransactionActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean setEngagementSignalsCallback() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 4520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchTransactionActivity.setEngagementSignalsCallback():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r2 = new org.json.JSONArray(r1);
        r1 = r2.length();
        r4 = new java.util.ArrayList(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r5 = viva.republica.toss.send.dutch.TransferDutchTransactionActivity.IAuthTabCallbackStubProxy + 117;
        viva.republica.toss.send.dutch.TransferDutchTransactionActivity.asInterface = r5 % 128;
        r5 = r5 % 2;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r5 >= r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r6 = viva.republica.toss.send.dutch.TransferDutchTransactionActivity.asInterface + 53;
        viva.republica.toss.send.dutch.TransferDutchTransactionActivity.IAuthTabCallbackStubProxy = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        r6 = r2.getJSONObject(r5);
        r12 = new java.lang.Object[1];
        a(new char[]{1, '\b', 6, 5, 0, '\r', 2, 6}, (byte) (5 - android.graphics.Color.argb(0, 0, 0, 0)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8, r12);
        r8 = r6.optString(((java.lang.String) r12[0]).intern());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        if (r8.length() <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        r7 = new java.lang.Object[1];
        a(new char[]{'\b', 2, 14, 6, 13867}, (byte) (44 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 5 - android.view.KeyEvent.keyCodeFromString(""), r7);
        r7 = r6.optString(((java.lang.String) r7[0]).intern());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (r7.length() <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        r14 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r7 = viva.republica.toss.send.dutch.TransferDutchTransactionActivity.asInterface + 17;
        viva.republica.toss.send.dutch.TransferDutchTransactionActivity.IAuthTabCallbackStubProxy = r7 % 128;
        r7 = r7 % 2;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        r4.add(new o.accesssetEnqueuedAnimationOnFramep(r13, r14, r6.getLong("amount"), null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
    
        return kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r1 = viva.republica.toss.send.dutch.TransferDutchTransactionActivity.asInterface + 75;
        viva.republica.toss.send.dutch.TransferDutchTransactionActivity.IAuthTabCallbackStubProxy = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<o.accesssetEnqueuedAnimationOnFramep> onNavigationEvent() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchTransactionActivity.onNavigationEvent():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(long j) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intentIAuthTabCallback = TransferDutchInviteActivity.IAuthTabCallback.IAuthTabCallback(TransferDutchInviteActivity.Companion, this, j, CollectionsKt.emptyList(), false, 8, null);
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 2, '\t', 3, 13823, 13823, 2, '\r'}, (byte) (Drawable.resolveOpacity(0, 0) + 23), TextUtils.getOffsetBefore("", 0) + 8, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = getIntent();
        Object obj = null;
        Object[] objArr2 = new Object[1];
        a(new char[]{'\r', 2, '\t', 3, 13823, 13823, 2, '\r'}, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132023906).substring(0, 12).length() - 4, objArr2);
        intentIAuthTabCallback.putExtra(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()));
        getNavigationBar.IAuthTabCallback(intentIAuthTabCallback, this, 30004);
        int i4 = IAuthTabCallbackStubProxy + 43;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            int i4 = asInterface + 121;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                finish();
                return;
            }
            finish();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i == 30004) {
            setResult(-1);
            finish();
            int i5 = IAuthTabCallbackStubProxy + 25;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
                return;
            }
            return;
        }
        int i7 = asInterface + 89;
        int i8 = i7 % 128;
        IAuthTabCallbackStubProxy = i8;
        int i9 = i7 % 2;
        if (i == 30005) {
            int i10 = i8 + 43;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            long longExtra = intent != null ? intent.getLongExtra("result.amount", -1L) : -1L;
            if (longExtra < 0) {
                return;
            }
            onNavigationEvent(longExtra);
            int i12 = IAuthTabCallbackStubProxy + 55;
            asInterface = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 19 / 0;
            }
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context, (Class<?>) TransferDutchTransactionActivity.class);
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = asBinder;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 26 - Color.blue(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            char c2 = '0';
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - TextUtils.lastIndexOf("", '0', 0), 23139 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $11 + 25;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    i2 = i + 108;
                    cArr4[i2] = (char) (cArr[i2] % b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i6 = $10 + 93;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback >>> b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback / b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        c = c2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 24824), 73 - TextUtils.lastIndexOf("", c2, 0), 8088 - View.MeasureSpec.getSize(0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                c = '0';
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionType(0L) + 30, 19487 - TextUtils.lastIndexOf("", '0', 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '0';
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                        } else {
                            c = '0';
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i8 = $10 + 21;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                int i12 = $10 + 101;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                            } else {
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    c2 = c;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 53;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStubProxy + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        asBinder = new char[]{64986, 64982, 64991, 64983, 64980, 64978, 64976, 64979, 64988, 64990, 64967, 64981, 64998, 64977, 64961, 64989};
        IAuthTabCallbackStub = (char) 51245;
    }
}
