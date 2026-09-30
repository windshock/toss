package com.tmoney.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.TmoneyMsg;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.ota.dto.OTAData02;
import com.tmoney.ota.dto.Product;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class u extends BaseTmoneyCallback {
    private final String a;
    private Context b;
    private TmoneyData c;
    private Handler d;

    public u(Context context, ResultListener resultListener) {
        super(resultListener);
        this.a = "TmoneyKsccIssueInstance";
        this.d = new Handler(Looper.getMainLooper()) { // from class: com.tmoney.c.u.9
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                u.this.onResult((TmoneyCallback.ResultType) message.obj);
            }
        };
        this.b = context;
        this.c = TmoneyData.getInstance(context);
    }

    private void a() {
        this.c.setTmoney2IssueFromEnableChek(false);
        LogHelper.d("TmoneyKsccIssueInstance", "DONOT statusCheck");
        Runnable runnable = new Runnable() { // from class: com.tmoney.c.u.2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                u.a(u.this);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    static /* synthetic */ void a(u uVar) throws Throwable {
        new com.tmoney.ota.a.e(uVar.b, new ResultListener() { // from class: com.tmoney.c.u.6
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                    u.this.a(resultType);
                    return;
                }
                OTAData02 oTAData02 = (OTAData02) resultType.getData()[0];
                if (oTAData02.getProdList().size() == 1) {
                    u.a(u.this, oTAData02.getProdList().get(0));
                } else if (oTAData02.getProdList().size() > 1) {
                    u.a(u.this, oTAData02.getProdList().get(1));
                } else {
                    u.this.a(TmoneyCallback.ResultType.TODO.setError(ResultError.NEED_1TH_ISSUE).setMessage(TmoneyMsg.makeMessage("OTA", -1, ResultDetailCode.NEED_1TH_ISSUE.getMessage())));
                }
            }
        }).getTmoneyProdList(uVar.c.getIssueDataCardNo(), DeviceInfoHelper.getSimSerialNumber(uVar.b), DeviceInfoHelper.getLine1NumberLocaleRemove(uVar.b), DeviceInfoHelper.getOtaTelecom(uVar.b));
    }

    static /* synthetic */ void a(u uVar, TmoneyCallback.ResultType resultType) throws Throwable {
        try {
            if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                uVar.b();
            } else {
                uVar.a(resultType);
            }
        } catch (Exception e) {
            LogHelper.exception("TmoneyKsccIssueInstance", e);
        }
    }

    static /* synthetic */ void a(u uVar, Product product) {
        LogHelper.d("TmoneyKsccIssueInstance", "tmoneyIssue:" + product.getCARD_PRD_NM() + "," + product.getCARD_PRD_ID());
        new com.tmoney.ota.d.a(uVar.b).issue(product, new ResultListener() { // from class: com.tmoney.c.u.4
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                u.this.a(resultType);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        LogHelper.d("TmoneyKsccIssueInstance", "onTmoney2thIssueResult " + resultType + "(delay:300) " + resultType.getError() + "/" + resultType.getMessage());
        Message messageObtain = Message.obtain();
        messageObtain.obj = resultType;
        this.d.sendMessageDelayed(messageObtain, 300L);
    }

    private void b() throws Throwable {
        LogHelper.d("TmoneyKsccIssueInstance", "statusCheck");
        if (this.c.isTmoney2IssueFromEnableChek()) {
            a();
        } else {
            LogHelper.d("TmoneyKsccIssueInstance", "DOING statusCheck");
            new com.tmoney.ota.a.d(this.b.getApplicationContext(), new ResultListener() { // from class: com.tmoney.c.u.3
                private static int $10 = 0;
                private static int $11 = 1;
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;
                private static char[] onWarmupCompleted = {27192, 27145, 27222};

                @Override // com.tmoney.listener.ResultListener
                public final void onResult(TmoneyCallback.ResultType resultType) throws Throwable {
                    int i = 2 % 2;
                    if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                        u.this.a(resultType);
                        int i2 = IAuthTabCallback + 25;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        return;
                    }
                    String detailCode = resultType.getDetailCode();
                    Object[] objArr = new Object[1];
                    b(new int[]{0, 1, 189, 0}, true, new byte[]{1}, objArr);
                    if (TextUtils.equals(detailCode, ((String) objArr[0]).intern())) {
                        u.a(u.this);
                        return;
                    }
                    String detailCode2 = resultType.getDetailCode();
                    Object[] objArr2 = new Object[1];
                    b(new int[]{1, 1, 93, 1}, false, new byte[]{1}, objArr2);
                    if (TextUtils.equals(detailCode2, ((String) objArr2[0]).intern())) {
                        u.b(u.this);
                        return;
                    }
                    String detailCode3 = resultType.getDetailCode();
                    Object[] objArr3 = new Object[1];
                    b(new int[]{2, 1, 0, 1}, false, new byte[]{1}, objArr3);
                    if (TextUtils.equals(detailCode3, ((String) objArr3[0]).intern())) {
                        if (!"0000000000".equals(u.this.c.getIssueDataAlias()) || !"07".equals(u.this.c.getIssueDataLifeCycle())) {
                            u.e(u.this);
                            return;
                        }
                        int i4 = IAuthTabCallback + 87;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 != 0) {
                            u.d(u.this);
                        } else {
                            u.d(u.this);
                            throw null;
                        }
                    }
                }

                private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                    char[] cArr;
                    int i;
                    int i2 = 2 % 2;
                    TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int i5 = iArr[2];
                    int i6 = iArr[3];
                    char[] cArr2 = onWarmupCompleted;
                    long j = 0;
                    Object obj = null;
                    if (cArr2 != null) {
                        int i7 = $11 + 33;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i9 = 0;
                        while (i9 < length) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1))), 36 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 14239 - ((Process.getThreadPriority(0) + 20) >> 6), -884206168, false, "t", new Class[]{Integer.TYPE});
                                }
                                cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                                i9++;
                                j = 0;
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
                    char[] cArr4 = new char[i4];
                    System.arraycopy(cArr2, i3, cArr4, 0, i4);
                    if (bArr != null) {
                        char[] cArr5 = new char[i4];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        char c = 0;
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                            if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                                int i10 = $11 + 51;
                                $10 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                                    if (objOnExtraCallback2 == null) {
                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10934), 64 - TextUtils.lastIndexOf("", '0'), TextUtils.getOffsetBefore("", 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                                    obj.hashCode();
                                    throw null;
                                }
                                int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                                Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 65 - TextUtils.getOffsetAfter("", 0), Drawable.resolveOpacity(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                            } else {
                                int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                                Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 29, 17656 - TextUtils.indexOf((CharSequence) "", '0', 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            }
                            c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                            Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 49467), Gravity.getAbsoluteGravity(0, 0) + 70, 12485 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback5).invoke(null, objArr6);
                        }
                        int i14 = $10 + 57;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        cArr4 = cArr5;
                    }
                    if (i6 > 0) {
                        int i16 = $11 + 61;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            char[] cArr6 = new char[i4];
                            System.arraycopy(cArr4, 0, cArr6, 1, i4);
                            System.arraycopy(cArr6, 1, cArr4, i4 >>> i6, i6);
                            System.arraycopy(cArr6, i6, cArr4, 1, i4 - i6);
                        } else {
                            char[] cArr7 = new char[i4];
                            System.arraycopy(cArr4, 0, cArr7, 0, i4);
                            int i17 = i4 - i6;
                            System.arraycopy(cArr7, 0, cArr4, i17, i6);
                            System.arraycopy(cArr7, i6, cArr4, 0, i17);
                        }
                    }
                    if (z) {
                        int i18 = $11 + 31;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            cArr = new char[i4];
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                        } else {
                            cArr = new char[i4];
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        }
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                            int i19 = $11 + 15;
                            $10 = i19 % 128;
                            if (i19 % 2 != 0) {
                                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent];
                                i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            } else {
                                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                                i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                            }
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                        }
                        cArr4 = cArr;
                    }
                    if (i5 > 0) {
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                            cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                            trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                        }
                    }
                    objArr[0] = new String(cArr4);
                }
            }).issueStatusCheck(this.c.getIssueDataCardNo());
        }
    }

    static /* synthetic */ void b(u uVar) {
        new com.tmoney.ota.d.a(uVar.b).reIssue(uVar.c.getIssueDataCardNo(), new ResultListener() { // from class: com.tmoney.c.u.5
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                u.this.a(resultType);
            }
        });
    }

    static /* synthetic */ void d(u uVar) {
        new com.tmoney.ota.d.a(uVar.b).alias(uVar.c.getIssueDataCardNo(), new ResultListener() { // from class: com.tmoney.c.u.7
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                u.this.a(resultType);
            }
        });
    }

    static /* synthetic */ void e(u uVar) {
        com.tmoney.a.getInstance().cardInfo(new ResultListener() { // from class: com.tmoney.c.u.8
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                    u.this.a(resultType);
                    return;
                }
                String string = resultType.getData()[0].toString();
                u.this.c.setCardNumber(string);
                if (!TextUtils.isEmpty(string) && !"0000000000000000".equals(string)) {
                    u.this.a(resultType);
                    return;
                }
                u uVar2 = u.this;
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.ISSUE_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.ISSUE_ERROR;
                uVar2.a(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(TmoneyMsg.makeMessage("OTA", -1, resultDetailCode.getMessage())));
            }
        });
    }

    public final void excute2thIssue() {
        if (!this.c.isTelecomTypeSk()) {
            b();
        } else {
            LogHelper.d("TmoneyKsccIssueInstance", "tmoneySktIssueCheck");
            new y(this.b, new ResultListener() { // from class: com.tmoney.c.u.1
                @Override // com.tmoney.listener.ResultListener
                public final void onResult(TmoneyCallback.ResultType resultType) throws Throwable {
                    u.a(u.this, resultType);
                }
            }).excuteSktIssueCheck(true);
        }
    }
}
