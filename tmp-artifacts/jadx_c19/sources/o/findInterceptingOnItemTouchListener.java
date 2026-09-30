package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ariver.kernel.RVParams;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class findInterceptingOnItemTouchListener {
    public int extraCommand;
    public EditText onWarmupCompleted;
    private Activity requestPostMessageChannel;
    private String updateVisuals;
    private boolean writeTypedList;
    public EditText access100 = null;
    public ImageButton onMinimized = null;
    public ImageButton onExtraCallback = null;
    public TextView ICustomTabsCallbackStub = null;
    public String mayLaunchUrl = null;
    public int receiveFile = 0;
    public int IAuthTabCallbackDefault = 0;
    public TextView isEngagementSignalsApiAvailable = null;
    public String IAuthTabCallback_Parcel = null;
    public String ICustomTabsService = null;
    public int IAuthTabCallbackStub = 0;
    public TextView onNavigationEvent = null;
    public String ICustomTabsCallbackDefault = null;
    private RelativeLayout onVerticalScrollEvent = null;
    private LinearLayout warmup = null;
    private LinearLayout ICustomTabsService_Parcel = null;
    private LinearLayout ICustomTabsServiceStubProxy = null;
    private LinearLayout IEngagementSignalsCallback = null;
    private LinearLayout requestPostMessageChannelWithExtras = null;
    private LinearLayout access200 = null;
    private LinearLayout ICustomTabsServiceDefault = null;
    public boolean IAuthTabCallback = false;
    private ImageView ICustomTabsServiceStub = null;
    public boolean writeTypedObject = false;
    public String asInterface = null;
    public String IAuthTabCallbackStubProxy = null;
    public boolean onRelationshipValidationResult = false;
    public boolean getInterfaceDescriptor = false;
    public boolean prefetch = false;
    public Bitmap asBinder = null;
    public EditText[] postMessage = null;
    public int onUnminimized = 0;
    public int access000 = 0;
    public int newSessionWithExtras = 3;
    public String ICustomTabsCallback_Parcel = "";
    public int newSession = 0;
    public String onTransact = "";
    public int ICustomTabsCallbackStubProxy = 0;
    public int[] setEngagementSignalsCallback = null;
    public boolean onMessageChannelReady = false;
    private String prefetchWithMultipleUrls = "";
    private Handler validateRelationship = new Handler();
    public String readTypedObject = null;
    public String onActivityResized = null;
    public String onPostMessage = null;
    public int extraCallbackWithResult = 0;
    public int ICustomTabsCallback = 0;
    public int onActivityLayout = 0;
    public int onExtraCallbackWithResult = 1;
    public boolean extraCallback = false;
    public boolean newAuthTabSession = false;

    public static String onNavigationEvent(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i2 = length - 1;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ '`');
            if (i3 < 0) {
                break;
            }
            i2 -= 2;
            cArr[i3] = (char) (str.charAt(i3) ^ '#');
        }
        return new String(cArr);
    }

    public findInterceptingOnItemTouchListener(Context context, String str) {
        this.requestPostMessageChannel = null;
        this.updateVisuals = "";
        this.extraCommand = 0;
        this.writeTypedList = false;
        Activity activity = (Activity) context;
        this.requestPostMessageChannel = activity;
        this.updateVisuals = str;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.extraCommand = displayMetrics.densityDpi;
        this.writeTypedList = (context.getResources().getConfiguration().screenLayout & 15) == 4;
    }

    public void onNavigationEvent() throws NumberFormatException, SecurityException {
        LinearLayout linearLayout;
        String str;
        String[] strArrSplit;
        String str2;
        String str3;
        nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwbnAOCk`zUtYo");
        dispatchLayoutStep1.onExtraCallback("SZS@");
        if (this.ICustomTabsServiceStubProxy == null) {
            Activity activity = this.requestPostMessageChannel;
            this.onVerticalScrollEvent = (RelativeLayout) activity.findViewById(activity.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("B}shIiEz@DBnAD@zUtYo"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            String str4 = this.asInterface;
            if (str4 != null && !str4.equals("")) {
                Activity activity2 = this.requestPostMessageChannel;
                LinearLayout linearLayout2 = (LinearLayout) activity2.findViewById(activity2.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("B}spIbsiClshIiEz@*"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
                layoutParams.topMargin = 0;
                linearLayout2.setLayoutParams(layoutParams);
                this.onVerticalScrollEvent.setBackgroundColor(Color.parseColor(this.asInterface));
            }
            if (this.extraCallbackWithResult > 0 && this.writeTypedList) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.extraCallbackWithResult, -1);
                layoutParams2.gravity = this.onExtraCallbackWithResult;
                layoutParams2.leftMargin = this.ICustomTabsCallback;
                layoutParams2.rightMargin = this.onActivityLayout;
                this.onVerticalScrollEvent.setLayoutParams(layoutParams2);
            }
            Activity activity3 = this.requestPostMessageChannel;
            LinearLayout linearLayout3 = (LinearLayout) activity3.findViewById(activity3.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("B}shIiEz@DBnADMxXrZrXb"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            this.ICustomTabsService_Parcel = linearLayout3;
            this.prefetchWithMultipleUrls = getFullClassName.onWarmupCompleted((String) linearLayout3.getTag());
            nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwxt\\WMbCnX;EuEo");
            new StringBuilder().insert(0, dispatchLayoutStep1.onExtraCallback("X[MUAN\u0014lQHGS[T\u0014\u0000\u000e")).append(this.prefetchWithMultipleUrls);
            Activity activity4 = this.requestPostMessageChannel;
            this.warmup = (LinearLayout) activity4.findViewById(activity4.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("uJD_~^rMwsuYvsoCkskMiIuXD@zUtYo"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            Activity activity5 = this.requestPostMessageChannel;
            this.ICustomTabsServiceStubProxy = (LinearLayout) activity5.findViewById(activity5.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("B}shIiEz@DBnADXt\\D@zUtYo"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            Activity activity6 = this.requestPostMessageChannel;
            this.IEngagementSignalsCallback = (LinearLayout) activity6.findViewById(activity6.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("uJD_~^rMwsuYvsrBkYoNtTD@zUtYo"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            Activity activity7 = this.requestPostMessageChannel;
            this.requestPostMessageChannelWithExtras = (LinearLayout) activity7.findViewById(activity7.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("B}shIiEz@DBnADEu\\nXyCcs~HrXD@zUtYo"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            Activity activity8 = this.requestPostMessageChannel;
            this.ICustomTabsServiceDefault = (LinearLayout) activity8.findViewById(activity8.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("uJD_~^rMwsuYvstGxMuO~@D@zUtYo"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            Activity activity9 = this.requestPostMessageChannel;
            this.ICustomTabsCallbackStub = (TextView) activity9.findViewById(activity9.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("B}shIiEz@DBnADH~_x"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            String str5 = this.mayLaunchUrl;
            if (str5 != null && !str5.equals("")) {
                this.ICustomTabsCallbackStub.setTextColor(Color.parseColor(this.mayLaunchUrl));
            }
            if (this.receiveFile != 0) {
                nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwsUYvxt\\WMbCnX;EuEo\u00042");
                new StringBuilder().insert(0, dispatchLayoutStep1.onExtraCallback("P_GYgSN_\u0014\u0004\n\u0004\u0014")).append(this.receiveFile);
                this.ICustomTabsCallbackStub.setTextSize(this.IAuthTabCallbackDefault, this.receiveFile);
            }
            String str6 = this.IAuthTabCallback_Parcel;
            if (str6 != null && !str6.equals("")) {
                Activity activity10 = this.requestPostMessageChannel;
                TextView textView = (TextView) activity10.findViewById(activity10.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("uJD_~^rMwsuYvs\u007fIhOD_~OtB\u007f"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
                this.isEngagementSignalsApiAvailable = textView;
                textView.setText(this.IAuthTabCallback_Parcel);
                this.isEngagementSignalsApiAvailable.setGravity(17);
                this.isEngagementSignalsApiAvailable.setVisibility(0);
                if (!this.ICustomTabsService.equals("") && (str3 = this.ICustomTabsService) != null) {
                    this.isEngagementSignalsApiAvailable.setTextColor(Color.parseColor(str3));
                }
                int i2 = this.IAuthTabCallbackStub;
                if (i2 != 0) {
                    this.isEngagementSignalsApiAvailable.setTextSize(0, i2);
                }
            }
            Activity activity11 = this.requestPostMessageChannel;
            this.onWarmupCompleted = (EditText) activity11.findViewById(activity11.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("B}shIiEz@DBnADI\u007fEox~To"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwbnAOCk`zUtYo");
            new StringBuilder().insert(0, dispatchLayoutStep1.onExtraCallback("WOGN[Wq^]NbSQMx[MUANz[Y_\u0014\u0004\n\u0004\u0014")).append(this.ICustomTabsCallback_Parcel);
            nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwbnAOCk`zUtYo");
            new StringBuilder().insert(0, dispatchLayoutStep1.onExtraCallback("YAI@UY\u007fPS@l]_CvUC[O@y[OZN\u0014\u0004\n\u0004\u0014")).append(this.newSession);
            try {
                Activity activity12 = this.requestPostMessageChannel;
                linearLayout = (LinearLayout) activity12.findViewById(activity12.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("uJD_~^rMwsuYvsxYhXtADI\u007fEoZrIl"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
            } catch (Exception unused) {
                linearLayout = null;
            }
            if (linearLayout != null && (str2 = this.ICustomTabsCallback_Parcel) != null && !str2.equals("")) {
                nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwbnAOCk`zUtYo");
                dispatchLayoutStep1.onExtraCallback("YAI@UY\u007fPS@l]_CvUC[O@y[OZN\u0014\u0004\n\u0004\u0014SR\u001a\u0014");
                this.onWarmupCompleted.setVisibility(8);
                linearLayout.setVisibility(0);
                Activity activity13 = this.requestPostMessageChannel;
                ((LinearLayout) activity13.findViewById(activity13.getResources().getIdentifier(this.ICustomTabsCallback_Parcel, nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals))).setVisibility(0);
                this.postMessage = new EditText[this.newSession];
                for (int i3 = 0; i3 < this.newSession; i3++) {
                    EditText[] editTextArr = this.postMessage;
                    Activity activity14 = this.requestPostMessageChannel;
                    Resources resources = activity14.getResources();
                    StringBuilder sbInsert = new StringBuilder().insert(0, this.ICustomTabsCallback_Parcel);
                    sbInsert.append(dispatchLayoutStep1.onExtraCallback("k"));
                    sbInsert.append(i3);
                    editTextArr[i3] = (EditText) activity14.findViewById(resources.getIdentifier(sbInsert.toString(), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
                }
            } else if (linearLayout == null || (str = this.onTransact) == null || str.equals("")) {
                dispatchLayoutStep1.onExtraCallback("z|]V@_FiQH][XtAW`UDvUC[O@");
                nestedScrollByInternal.onExtraCallbackWithResult("On_oCvi\u007fEozrIl`zUtYootYuX;\u0012%\u0012;Iw_~\f;");
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                this.onWarmupCompleted.setVisibility(0);
                if (this.onMessageChannelReady) {
                    dispatchLayoutStep1.onExtraCallback("z|]V@_FiQH][XtAW`UDvUC[O@");
                    new StringBuilder().insert(0, nestedScrollByInternal.onExtraCallbackWithResult("JtOn_zNwI;XiY~\u0016;")).append(this.onMessageChannelReady);
                    this.onWarmupCompleted.setFocusable(true);
                    this.onWarmupCompleted.setClickable(false);
                    this.validateRelationship.postAtFrontOfQueue(new onExtraCallbackWithResult());
                    this.onWarmupCompleted.setOnTouchListener(new asBinder(this));
                    try {
                        Method method = null;
                        for (Method method2 : Class.forName(dispatchLayoutStep1.onExtraCallback("UTPH[SP\u0014CSP]QN\u001a\u007fPS@nQB@")).getMethods()) {
                            if (method2.getName().equals(nestedScrollByInternal.onExtraCallbackWithResult("_~XXYhXtAHIwIxXrCumxXrCuatH~oz@wNzOp"))) {
                                dispatchLayoutStep1.onExtraCallback("z|]V@_Fy\\[Fn[Jx[MUAN\u0014SZS@\u001a]T@_F\\UYQ");
                                nestedScrollByInternal.onExtraCallbackWithResult("xD~OpI\u007f");
                                method = method2;
                            }
                        }
                        if (method != null) {
                            dispatchLayoutStep1.onExtraCallback("z|]V@_Fy\\[Fn[Jx[MUAN\u0014SZS@");
                            nestedScrollByInternal.onExtraCallbackWithResult("hIoon_oCv\u007f~@~OoEtBZOoEtBVC\u007fIXMw@yMxG;Eh\f~Tr_o");
                            this.onWarmupCompleted.setCustomSelectionActionModeCallback(new IAuthTabCallback());
                        } else {
                            dispatchLayoutStep1.onExtraCallback("z|]V@_Fy\\[Fn[Jx[MUAN\u0014SZS@");
                            nestedScrollByInternal.onExtraCallbackWithResult("hIoon_oCv\u007f~@~OoEtBZOoEtBVC\u007fIXMw@yMxG;Eh\f~Tr_o");
                        }
                    } catch (ClassNotFoundException unused2) {
                    }
                } else {
                    dispatchLayoutStep1.onExtraCallback("z|]V@_FiQH][XtAW`UDvUC[O@");
                    new StringBuilder().insert(0, nestedScrollByInternal.onExtraCallbackWithResult("}CxYhMy@~\f}Mw_~\u0016;")).append(this.onMessageChannelReady);
                    this.onWarmupCompleted.setFocusable(false);
                    this.onWarmupCompleted.setInputType(0);
                }
                int i4 = this.newSessionWithExtras;
                if (i4 != 3) {
                    this.onWarmupCompleted.setGravity(i4);
                }
                int i5 = this.onUnminimized;
                if (i5 != 0) {
                    this.onWarmupCompleted.setTextSize(i5);
                }
            } else {
                dispatchLayoutStep1.onExtraCallback("z|]V@_FiQH][XtAW`UDvUC[O@");
                new StringBuilder().insert(0, nestedScrollByInternal.onExtraCallbackWithResult("hIiEz@UYvN~^^HrXME~[WMbCnXUMvI;\u0012%\u0012;")).append(this.onTransact);
                this.onWarmupCompleted.setVisibility(8);
                linearLayout.setVisibility(0);
                Activity activity15 = this.requestPostMessageChannel;
                ((LinearLayout) activity15.findViewById(activity15.getResources().getIdentifier(this.onTransact, dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals))).setVisibility(0);
                this.postMessage = new EditText[this.ICustomTabsCallbackStubProxy];
                int i6 = 0;
                while (i6 < this.ICustomTabsCallbackStubProxy) {
                    nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwbnAOCk`zUtYo");
                    StringBuilder sbInsert2 = new StringBuilder().insert(0, dispatchLayoutStep1.onExtraCallback("G_FSUVzOYXQHq^]NbSQMx[MUANz[Y_\u0014\u0004\n\u0004\u0014"));
                    sbInsert2.append(this.onTransact);
                    sbInsert2.append(nestedScrollByInternal.onExtraCallbackWithResult("D"));
                    sbInsert2.append(this.setEngagementSignalsCallback[i6] - 1);
                    EditText[] editTextArr2 = this.postMessage;
                    Activity activity16 = this.requestPostMessageChannel;
                    Resources resources2 = activity16.getResources();
                    StringBuilder sbInsert3 = new StringBuilder().insert(0, this.onTransact);
                    sbInsert3.append(dispatchLayoutStep1.onExtraCallback("k"));
                    sbInsert3.append(this.setEngagementSignalsCallback[i6] - 1);
                    editTextArr2[i6] = (EditText) activity16.findViewById(resources2.getIdentifier(sbInsert3.toString(), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
                    EditText editText = this.postMessage[i6];
                    i6++;
                    editText.setBackgroundResource(this.requestPostMessageChannel.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("Z\\kXSeQ^]NkNQB@"), nestedScrollByInternal.onExtraCallbackWithResult("HiMlMy@~"), this.updateVisuals));
                }
            }
            Activity activity17 = this.requestPostMessageChannel;
            this.access200 = (LinearLayout) activity17.findViewById(activity17.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("TReG_FSUVkTAWkV[]["), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
            String str7 = this.IAuthTabCallbackStubProxy;
            if (str7 == null || str7.equals("")) {
                if (this.onRelationshipValidationResult) {
                    Activity activity18 = this.requestPostMessageChannel;
                    LinearLayout linearLayout4 = (LinearLayout) activity18.findViewById(activity18.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("Z\\kIQH][XeZOYeWOGN[WkV[]["), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
                    if (this.prefetch && this.asBinder != null) {
                        Activity activity19 = this.requestPostMessageChannel;
                        ((ImageView) activity19.findViewById(activity19.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("TReWOGN[WkV[]["), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals))).setImageBitmap(this.asBinder);
                    }
                    linearLayout4.setVisibility(0);
                    this.access200.setVisibility(8);
                }
                strArrSplit = null;
            } else {
                dispatchLayoutStep1.onExtraCallback("z|]V@_FiQH][XtAW`UDvUC[O@");
                new StringBuilder().insert(0, nestedScrollByInternal.onExtraCallbackWithResult("xYhXtAWC|euJt\f%\u0012;")).append(this.IAuthTabCallbackStubProxy);
                strArrSplit = this.IAuthTabCallbackStubProxy.split(dispatchLayoutStep1.onExtraCallback("\u0018"));
                nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwbnAOCk`zUtYo");
                new StringBuilder().insert(0, dispatchLayoutStep1.onExtraCallback("XUSU}TRUo\ni\u001a\n\u0004\u0014")).append(strArrSplit[0]);
                nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwbnAOCk`zUtYo");
                new StringBuilder().insert(0, dispatchLayoutStep1.onExtraCallback("XUSU}TRU\u001aVQTSN\\\u001a\n\u0004\u0014")).append(strArrSplit.length);
                Activity activity20 = this.requestPostMessageChannel;
                ImageView imageView = (ImageView) activity20.findViewById(activity20.getResources().getIdentifier(nestedScrollByInternal.onExtraCallbackWithResult("B}shIiEz@DBnAD@tKtsrAzK~"), dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
                imageView.setVisibility(0);
                this.access200.setBackgroundDrawable(null);
                imageView.setImageResource(this.requestPostMessageChannel.getResources().getIdentifier(strArrSplit[0], nestedScrollByInternal.onExtraCallbackWithResult("HiMlMy@~"), this.updateVisuals));
                if (strArrSplit.length > 1) {
                    dispatchLayoutStep1.onExtraCallback("z|]V@_FtAW`UDvUC[O@");
                    new StringBuilder().insert(0, nestedScrollByInternal.onExtraCallbackWithResult("wC|CRB}C@\u001dF\f%\u0012;")).append(strArrSplit[1]);
                    dispatchLayoutStep1.onExtraCallback("z|]V@_FtAW`UDvUC[O@");
                    new StringBuilder().insert(0, nestedScrollByInternal.onExtraCallbackWithResult("wC|CRB}C@\u001eF\f%\u0012;")).append(strArrSplit[2]);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.access200.getLayoutParams();
                    try {
                        int i7 = Integer.parseInt(strArrSplit[1]);
                        layoutParams3.bottomMargin = i7;
                        layoutParams3.topMargin = i7;
                    } catch (NumberFormatException unused3) {
                        dispatchLayoutStep1.onExtraCallback("Z|]V@_F");
                        nestedScrollByInternal.onExtraCallbackWithResult("@tKtaz^|Eu\fSMh\fuCo\fyI~B;H~JrB~H5");
                    }
                    this.access200.setLayoutParams(layoutParams3);
                    if (!strArrSplit[2].equals("")) {
                        Activity activity21 = this.requestPostMessageChannel;
                        LinearLayout linearLayout5 = (LinearLayout) activity21.findViewById(activity21.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("TReG_FSUVkTAWkV[][eVU@N[WkV]TQ"), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
                        linearLayout5.setVisibility(0);
                        linearLayout5.setBackgroundColor(Color.parseColor(strArrSplit[2]));
                    }
                }
            }
            if (!this.ICustomTabsCallbackDefault.equals("") && this.ICustomTabsCallbackDefault != null) {
                Activity activity22 = this.requestPostMessageChannel;
                TextView textView2 = (TextView) activity22.findViewById(activity22.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("TReG_FSUVkTAWkV[][e@S@VQ"), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
                textView2.setVisibility(0);
                textView2.setText(this.ICustomTabsCallbackDefault);
                this.access200.setGravity(17);
            }
            Activity activity23 = this.requestPostMessageChannel;
            ImageButton imageButton = (ImageButton) activity23.findViewById(activity23.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("TReG_FSUVkTAWkU_"), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
            this.onMinimized = imageButton;
            imageButton.setContentDescription(dispatchLayoutStep1.onExtraCallback("홯음"));
            if (strArrSplit != null && strArrSplit.length > 1 && !strArrSplit[3].equals("")) {
                try {
                    this.onMinimized.setImageResource(this.requestPostMessageChannel.getResources().getIdentifier(strArrSplit[3], nestedScrollByInternal.onExtraCallbackWithResult("HiMlMy@~"), this.updateVisuals));
                } catch (Exception unused4) {
                }
                try {
                    ImageButton imageButton2 = this.onMinimized;
                    Resources resources3 = this.requestPostMessageChannel.getResources();
                    StringBuilder sbInsert4 = new StringBuilder().insert(0, strArrSplit[3]);
                    sbInsert4.append(dispatchLayoutStep1.onExtraCallback("kXS"));
                    imageButton2.setBackgroundResource(resources3.getIdentifier(sbInsert4.toString(), nestedScrollByInternal.onExtraCallbackWithResult("HiMlMy@~"), this.updateVisuals));
                } catch (Exception unused5) {
                }
            }
            Activity activity24 = this.requestPostMessageChannel;
            ImageButton imageButton3 = (ImageButton) activity24.findViewById(activity24.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("TReG_FSUVkTAWkYUTW_X"), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
            this.onExtraCallback = imageButton3;
            imageButton3.setContentDescription(dispatchLayoutStep1.onExtraCallback("췒솸"));
            if (strArrSplit != null && strArrSplit.length > 1 && !strArrSplit[4].equals("")) {
                try {
                    this.onExtraCallback.setImageResource(this.requestPostMessageChannel.getResources().getIdentifier(strArrSplit[4], nestedScrollByInternal.onExtraCallbackWithResult("HiMlMy@~"), this.updateVisuals));
                } catch (Exception unused6) {
                }
                try {
                    ImageButton imageButton4 = this.onExtraCallback;
                    Resources resources4 = this.requestPostMessageChannel.getResources();
                    StringBuilder sbInsert5 = new StringBuilder().insert(0, strArrSplit[4]);
                    sbInsert5.append(dispatchLayoutStep1.onExtraCallback("kXS"));
                    imageButton4.setBackgroundResource(resources4.getIdentifier(sbInsert5.toString(), nestedScrollByInternal.onExtraCallbackWithResult("HiMlMy@~"), this.updateVisuals));
                } catch (Exception unused7) {
                }
            }
            if (!this.IAuthTabCallback) {
                EditText editText2 = this.access100;
                if (editText2 != null) {
                    editText2.setVisibility(8);
                }
                ImageView imageView2 = this.ICustomTabsServiceStub;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    return;
                }
                return;
            }
            Activity activity25 = this.requestPostMessageChannel;
            EditText editText3 = (EditText) activity25.findViewById(activity25.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("Z\\kIQH][XeZOYeQ^]N`_LNk\n\u0006"), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
            this.access100 = editText3;
            int i8 = this.newSessionWithExtras;
            if (i8 != 3) {
                editText3.setGravity(i8);
            }
            int i9 = this.onUnminimized;
            if (i9 != 0) {
                this.access100.setTextSize(i9);
            }
            this.access100.setVisibility(0);
            if (this.onMessageChannelReady) {
                this.access100.setFocusable(true);
                this.access100.setClickable(false);
                this.validateRelationship.postAtFrontOfQueue(new onNavigationEvent());
                this.access100.setOnTouchListener(new onWarmupCompleted(this));
            } else {
                this.access100.setFocusable(false);
                this.access100.setInputType(0);
            }
            Activity activity26 = this.requestPostMessageChannel;
            ImageView imageView3 = (ImageView) activity26.findViewById(activity26.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("Z\\kSPYUHPeV[F"), nestedScrollByInternal.onExtraCallbackWithResult("E\u007f"), this.updateVisuals));
            this.ICustomTabsServiceStub = imageView3;
            imageView3.setVisibility(0);
        }
    }

    public class onNavigationEvent implements Runnable {
        public onNavigationEvent() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) findInterceptingOnItemTouchListener.this.requestPostMessageChannel.getSystemService(initAutofill.onExtraCallbackWithResult("X\u0014A\u000fE%\\\u001fE\u0012^\u001e"))).hideSoftInputFromWindow(findInterceptingOnItemTouchListener.this.access100.getWindowToken(), 2);
        }
    }

    public class IAuthTabCallback implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public IAuthTabCallback() {
        }
    }

    public void onWarmupCompleted(int i2) {
        this.ICustomTabsServiceStubProxy.setVisibility(0);
        TextView textView = this.isEngagementSignalsApiAvailable;
        if (textView != null) {
            textView.setVisibility(0);
        }
        this.IEngagementSignalsCallback.setOrientation(1);
        if (!this.IAuthTabCallback) {
            this.requestPostMessageChannelWithExtras.setOrientation(1);
        } else {
            this.requestPostMessageChannelWithExtras.setOrientation(0);
        }
        if (this.writeTypedObject) {
            return;
        }
        onExtraCallbackWithResult(i2 / 5);
        if (!this.IAuthTabCallback) {
            onWarmupCompleted(this.onWarmupCompleted, (int) (i2 / 1.5d), 15, 40, 40);
        } else {
            int i3 = (int) (i2 / 1.5d);
            onWarmupCompleted(this.onWarmupCompleted, i3, 15, 30, 5);
            onWarmupCompleted(this.access100, i3, 15, 5, 30);
            IAuthTabCallback(this.ICustomTabsServiceStub, 10);
        }
        if (this.getInterfaceDescriptor) {
            onExtraCallback(5, 80);
            onExtraCallbackWithResult(80, 5);
        } else {
            onExtraCallback(80, 5);
            onExtraCallbackWithResult(5, 80);
        }
        asInterface(i2);
    }

    public class onExtraCallbackWithResult implements Runnable {
        public onExtraCallbackWithResult() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) findInterceptingOnItemTouchListener.this.requestPostMessageChannel.getSystemService(getDeepestFocusedViewWithId.onExtraCallbackWithResult("`AyZ}pdJ}GfK"))).hideSoftInputFromWindow(findInterceptingOnItemTouchListener.this.onWarmupCompleted.getWindowToken(), 2);
        }
    }

    public void onWarmupCompleted() {
        this.ICustomTabsServiceStubProxy.setVisibility(8);
        TextView textView = this.isEngagementSignalsApiAvailable;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.IEngagementSignalsCallback.setOrientation(0);
        this.IEngagementSignalsCallback.setGravity(16);
        this.requestPostMessageChannelWithExtras.setOrientation(0);
        this.requestPostMessageChannelWithExtras.setGravity(16);
        if (this.writeTypedObject) {
            return;
        }
        onTransact(15);
        onExtraCallbackWithResult(0);
        if (!this.IAuthTabCallback) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.IEngagementSignalsCallback.getLayoutParams();
            layoutParams.topMargin = 15;
            this.IEngagementSignalsCallback.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.onWarmupCompleted.getLayoutParams();
            layoutParams2.leftMargin = 10;
            layoutParams2.rightMargin = 0;
            layoutParams2.topMargin = 0;
            this.onWarmupCompleted.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.ICustomTabsServiceDefault.getLayoutParams();
            layoutParams3.topMargin = 0;
            this.ICustomTabsServiceDefault.setLayoutParams(layoutParams3);
        } else {
            onWarmupCompleted(this.onWarmupCompleted, -1, 0, 0, 5);
            onWarmupCompleted(this.access100, -1, 0, 5, 0);
            IAuthTabCallback(this.ICustomTabsServiceStub, 0);
        }
        onExtraCallback(5, 5);
        onExtraCallbackWithResult(5, 5);
    }

    public void IAuthTabCallback(int i2) {
        this.access200.setVisibility(8);
        TextView textView = this.isEngagementSignalsApiAvailable;
        if (textView != null) {
            textView.setGravity(0);
        }
        this.IEngagementSignalsCallback.setOrientation(1);
        if (this.IAuthTabCallback) {
            this.requestPostMessageChannelWithExtras.setOrientation(0);
        } else {
            this.requestPostMessageChannelWithExtras.setOrientation(1);
        }
        if (this.writeTypedObject) {
            return;
        }
        if (!this.getInterfaceDescriptor) {
            onExtraCallback(40, 5);
            onExtraCallbackWithResult(5, 40);
        } else {
            onExtraCallback(5, 40);
            onExtraCallbackWithResult(40, 5);
        }
        asInterface(i2);
        if (this.prefetchWithMultipleUrls.equals(dispatchLayoutStep1.onExtraCallback("VSS\\[T@"))) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.onWarmupCompleted.getLayoutParams();
            layoutParams.topMargin = 5;
            this.onWarmupCompleted.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.ICustomTabsServiceDefault.getLayoutParams();
            layoutParams2.topMargin = 5;
            this.ICustomTabsServiceDefault.setLayoutParams(layoutParams2);
            onExtraCallbackWithResult(i2 / 5);
            if (this.IAuthTabCallback) {
                int i3 = (int) (i2 / 1.5d);
                onWarmupCompleted(this.onWarmupCompleted, i3, 15, 30, 5);
                onWarmupCompleted(this.access100, i3, 15, 5, 30);
                IAuthTabCallback(this.ICustomTabsServiceStub, 10);
                return;
            }
            onWarmupCompleted(this.onWarmupCompleted, (int) (i2 / 1.5d), 15, 40, 40);
        }
    }

    public void onExtraCallback() {
        TextView textView = this.isEngagementSignalsApiAvailable;
        if (textView != null) {
            textView.setGravity(8);
        }
        this.IEngagementSignalsCallback.setOrientation(1);
        if (this.IAuthTabCallback) {
            this.requestPostMessageChannelWithExtras.setOrientation(0);
        } else {
            this.requestPostMessageChannelWithExtras.setOrientation(1);
        }
        if (this.writeTypedObject || !this.prefetchWithMultipleUrls.equals(nestedScrollByInternal.onExtraCallbackWithResult("yE|JtBo"))) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.IEngagementSignalsCallback.getLayoutParams();
        layoutParams.topMargin = 2;
        this.IEngagementSignalsCallback.setLayoutParams(layoutParams);
    }

    public void onNavigationEvent(int i2) {
        TextView textView = this.isEngagementSignalsApiAvailable;
        if (textView != null) {
            textView.setGravity(0);
        }
        if (this.writeTypedObject) {
            return;
        }
        IAuthTabCallbackDefault(65);
        int i3 = (int) (i2 * 0.7f);
        this.IEngagementSignalsCallback.setOrientation(1);
        if (!this.IAuthTabCallback) {
            this.requestPostMessageChannelWithExtras.setOrientation(1);
        } else {
            this.requestPostMessageChannelWithExtras.setOrientation(0);
        }
        if (!this.extraCallback && !this.newAuthTabSession) {
            if (this.IAuthTabCallback) {
                onWarmupCompleted(this.onWarmupCompleted, i3, 0, 100, 10);
                onWarmupCompleted(this.access100, i3, 0, 10, 100);
                IAuthTabCallback(this.ICustomTabsServiceStub, 0);
            } else if (!releaseHorizontalGlow.onExtraCallbackWithResult(this.requestPostMessageChannel.getApplicationContext())) {
                onWarmupCompleted(this.onWarmupCompleted, (int) (i2 * 0.5d), -1, 100, 100);
            } else {
                onWarmupCompleted(this.onWarmupCompleted, i3 / 2, -1, 100, 100);
            }
        } else {
            IAuthTabCallback(nestedScrollByInternal.onExtraCallbackWithResult("B}suYvsxYhXtADI\u007fEoZrIl"), this.extraCommand == 160 ? RVParams.WEBVIEW_FONT_SIZE_LARGER : 300, 20);
            onWarmupCompleted(this.onWarmupCompleted, -1, 0, 30, 290);
        }
        onNavigationEvent(50, 50);
        if (this.extraCommand != 160) {
            this.ICustomTabsCallbackStub.setTextSize(0, (int) (r0.getTextSize() * 1.5d));
            onExtraCallbackWithResult(((LinearLayout.LayoutParams) this.ICustomTabsServiceDefault.getLayoutParams()).topMargin << 1);
            this.onMinimized.measure(0, 0);
            this.onExtraCallback.measure(0, 0);
            String str = this.readTypedObject;
            if (str == null || str.equals("")) {
                this.readTypedObject = this.onMinimized.getMeasuredWidth() + dispatchLayoutStep1.onExtraCallback("\u0012") + (this.onMinimized.getMeasuredHeight() / 2);
            }
            String str2 = this.onActivityResized;
            if (str2 == null || str2.equals("")) {
                this.onActivityResized = this.onExtraCallback.getMeasuredWidth() + nestedScrollByInternal.onExtraCallbackWithResult("=") + (this.onExtraCallback.getMeasuredHeight() / 2);
            }
        }
        if (this.getInterfaceDescriptor) {
            onExtraCallback(10, 100);
            onExtraCallbackWithResult(100, 10);
        } else {
            onExtraCallback(100, 10);
            onExtraCallbackWithResult(10, 100);
        }
    }

    public void onExtraCallback(int i2) {
        TextView textView = this.isEngagementSignalsApiAvailable;
        if (textView != null) {
            textView.setGravity(8);
        }
        if (this.writeTypedObject) {
            return;
        }
        IAuthTabCallbackDefault(65);
        this.IEngagementSignalsCallback.setOrientation(1);
        if (!this.IAuthTabCallback) {
            this.requestPostMessageChannelWithExtras.setOrientation(1);
        } else {
            this.requestPostMessageChannelWithExtras.setOrientation(0);
        }
        if (this.extraCallback) {
            IAuthTabCallback(nestedScrollByInternal.onExtraCallbackWithResult("B}shIiEz@DBnADHtXD@~Jo"), 500, 1);
            onWarmupCompleted(this.onWarmupCompleted, (int) (i2 * 0.7d), 0, 40, 500);
        } else if (!this.newAuthTabSession) {
            if (this.IAuthTabCallback) {
                int i3 = (int) (i2 * 0.7d);
                onWarmupCompleted(this.onWarmupCompleted, i3, 0, RVParams.WEBVIEW_FONT_SIZE_LARGEST, 10);
                onWarmupCompleted(this.access100, i3, 0, 10, RVParams.WEBVIEW_FONT_SIZE_LARGEST);
                IAuthTabCallback(this.ICustomTabsServiceStub, 0);
            } else {
                onWarmupCompleted(this.onWarmupCompleted, (int) (i2 * 0.7d), 0, RVParams.WEBVIEW_FONT_SIZE_LARGEST, RVParams.WEBVIEW_FONT_SIZE_LARGEST);
            }
        } else {
            IAuthTabCallback(dispatchLayoutStep1.onExtraCallback("Z\\kIQH][XeZOYePU@eFSSR@"), 1, 500);
            onWarmupCompleted(this.onWarmupCompleted, (int) (i2 * 0.7d), 0, 500, 40);
        }
        onNavigationEvent(25, 25);
        if (!this.getInterfaceDescriptor) {
            onExtraCallback(300, 10);
            onExtraCallbackWithResult(10, 300);
        } else {
            onExtraCallback(10, 300);
            onExtraCallbackWithResult(300, 10);
        }
    }

    public void onNavigationEvent(String str, int i2, int i3) {
        TextView textView = this.isEngagementSignalsApiAvailable;
        if (textView != null) {
            textView.setGravity(8);
        }
        if (!this.writeTypedObject) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ICustomTabsCallbackStub.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 10;
            this.ICustomTabsCallbackStub.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.onWarmupCompleted.getLayoutParams();
            layoutParams2.topMargin = 10;
            layoutParams2.bottomMargin = str.equals(dispatchLayoutStep1.onExtraCallback("DUFNUS@")) ? 20 : 10;
            layoutParams2.weight = 1.0f;
            this.onWarmupCompleted.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.ICustomTabsServiceDefault.getLayoutParams();
            layoutParams3.topMargin = 10;
            layoutParams3.bottomMargin = str.equals(nestedScrollByInternal.onExtraCallbackWithResult("kCiXzEo")) ? 20 : 10;
            layoutParams3.weight = 2.0f;
            this.ICustomTabsServiceDefault.setLayoutParams(layoutParams3);
            this.onWarmupCompleted.measure(0, 0);
            String str2 = this.readTypedObject;
            if (str2 == null || str2.equals("")) {
                this.readTypedObject = dispatchLayoutStep1.onExtraCallback("\u0012");
                StringBuilder sb = new StringBuilder();
                sb.append(this.readTypedObject);
                sb.append(this.extraCommand == 160 ? this.onWarmupCompleted.getMeasuredHeight() : this.onWarmupCompleted.getMeasuredHeight() / 2);
                this.readTypedObject = sb.toString();
            }
            String str3 = this.onActivityResized;
            if (str3 == null || str3.equals("")) {
                this.onActivityResized = nestedScrollByInternal.onExtraCallbackWithResult("=");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.onActivityResized);
                sb2.append(this.extraCommand == 160 ? this.onWarmupCompleted.getMeasuredHeight() : this.onWarmupCompleted.getMeasuredHeight() / 2);
                this.onActivityResized = sb2.toString();
            }
            onExtraCallback(10, 10);
            onExtraCallbackWithResult(10, 10);
            this.warmup.post(new onExtraCallback(i3));
        }
        this.ICustomTabsServiceStubProxy.setBackgroundResource(this.requestPostMessageChannel.getResources().getIdentifier(dispatchLayoutStep1.onExtraCallback("TReP_GYkXS"), nestedScrollByInternal.onExtraCallbackWithResult("HiMlMy@~"), this.updateVisuals));
        if (this.asInterface != null) {
            this.onVerticalScrollEvent.setBackgroundColor(0);
        }
        this.access200.setVisibility(8);
        this.IEngagementSignalsCallback.setOrientation(0);
        this.IEngagementSignalsCallback.setBackgroundColor(-1);
        this.requestPostMessageChannelWithExtras.setOrientation(0);
        this.requestPostMessageChannelWithExtras.setBackgroundColor(-1);
    }

    public class onExtraCallback implements Runnable {
        public final /* synthetic */ int onExtraCallbackWithResult;

        public onExtraCallback(int i2) {
            this.onExtraCallbackWithResult = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            findInterceptingOnItemTouchListener.this.warmup.postInvalidate();
            findInterceptingOnItemTouchListener.this.onVerticalScrollEvent.postInvalidate();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (this.onExtraCallbackWithResult - releaseHorizontalGlow.onNavigationEvent(findInterceptingOnItemTouchListener.this.requestPostMessageChannel)) - findInterceptingOnItemTouchListener.this.warmup.getHeight();
            findInterceptingOnItemTouchListener.this.warmup.setLayoutParams(layoutParams);
            findInterceptingOnItemTouchListener.this.warmup.setVisibility(0);
            findInterceptingOnItemTouchListener.this.ICustomTabsService_Parcel.setVisibility(0);
        }
    }

    private /* synthetic */ void onNavigationEvent(int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ICustomTabsCallbackStub.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.bottomMargin = i3;
        this.ICustomTabsCallbackStub.setLayoutParams(layoutParams);
    }

    private /* synthetic */ void onTransact(int i2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.IEngagementSignalsCallback.getLayoutParams();
        if (i2 == -1) {
            i2 = layoutParams.topMargin;
        }
        layoutParams.topMargin = i2;
        this.IEngagementSignalsCallback.setLayoutParams(layoutParams);
    }

    private /* synthetic */ void onExtraCallback(int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.onMinimized.getLayoutParams();
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i3;
        if (this.readTypedObject != null) {
            dispatchLayoutStep1.onExtraCallback("z|]V@_FiQH][XtAW`UDvUC[O@");
            new StringBuilder().insert(0, nestedScrollByInternal.onExtraCallbackWithResult("CpnnXoCu|z^zA;\u0012;")).append(this.readTypedObject);
            String[] strArrSplit = this.readTypedObject.split(dispatchLayoutStep1.onExtraCallback("\u0012"));
            String str = strArrSplit[0];
            if (str != null && !str.equals("")) {
                layoutParams.width = (int) releaseHorizontalGlow.onExtraCallbackWithResult(Integer.parseInt(strArrSplit[0]), this.requestPostMessageChannel.getApplicationContext());
            }
            String str2 = strArrSplit[1];
            if (str2 != null && !str2.equals("")) {
                layoutParams.height = (int) releaseHorizontalGlow.onExtraCallbackWithResult(Integer.parseInt(strArrSplit[1]), this.requestPostMessageChannel.getApplicationContext());
            }
        }
        this.onMinimized.setLayoutParams(layoutParams);
    }

    private /* synthetic */ void asInterface(int i2) {
        String str = this.readTypedObject;
        if (str == null || str.equals("")) {
            StringBuilder sbInsert = new StringBuilder().insert(0, dispatchLayoutStep1.onExtraCallback("\u0012"));
            sbInsert.append((int) releaseHorizontalGlow.onNavigationEvent((int) (i2 / 1.5d), this.requestPostMessageChannel.getApplicationContext()));
            this.readTypedObject = sbInsert.toString();
        }
        String str2 = this.onActivityResized;
        if (str2 == null || str2.equals("")) {
            StringBuilder sbInsert2 = new StringBuilder().insert(0, nestedScrollByInternal.onExtraCallbackWithResult("="));
            sbInsert2.append((int) releaseHorizontalGlow.onNavigationEvent((int) (i2 / 1.5d), this.requestPostMessageChannel.getApplicationContext()));
            this.onActivityResized = sbInsert2.toString();
        }
    }

    private /* synthetic */ void onExtraCallbackWithResult(int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.onExtraCallback.getLayoutParams();
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i3;
        if (this.onActivityResized != null) {
            nestedScrollByInternal.onExtraCallbackWithResult("Ujr@oIi\u007f~^rMwbnAOCk`zUtYo");
            new StringBuilder().insert(0, dispatchLayoutStep1.onExtraCallback("yUTW_XxAN@UZjUHUW\u0014\u0004\u0014")).append(this.onActivityResized);
            String[] strArrSplit = this.onActivityResized.split(nestedScrollByInternal.onExtraCallbackWithResult("="));
            String str = strArrSplit[0];
            if (str != null && !str.equals("")) {
                layoutParams.width = (int) releaseHorizontalGlow.onExtraCallbackWithResult(Integer.parseInt(strArrSplit[0]), this.requestPostMessageChannel.getApplicationContext());
            }
            String str2 = strArrSplit[1];
            if (str2 != null && !str2.equals("")) {
                layoutParams.height = (int) releaseHorizontalGlow.onExtraCallbackWithResult(Integer.parseInt(strArrSplit[1]), this.requestPostMessageChannel.getApplicationContext());
            }
        }
        this.onExtraCallback.setLayoutParams(layoutParams);
    }

    private /* synthetic */ void IAuthTabCallbackDefault(int i2) {
        if (this.onRelationshipValidationResult) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.access200.getLayoutParams();
        layoutParams.height = i2;
        this.access200.setLayoutParams(layoutParams);
    }

    private /* synthetic */ void IAuthTabCallback(ImageView imageView, int i2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        if (i2 == -1) {
            i2 = layoutParams.topMargin;
        }
        layoutParams.topMargin = i2;
        imageView.setLayoutParams(layoutParams);
    }

    private /* synthetic */ void onWarmupCompleted(EditText editText, int i2, int i3, int i4, int i5) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) editText.getLayoutParams();
        if (i3 == -1) {
            i3 = layoutParams.topMargin;
        }
        layoutParams.topMargin = i3;
        if (i4 == -1) {
            i4 = layoutParams.leftMargin;
        }
        layoutParams.leftMargin = i4;
        if (i5 == -1) {
            i5 = layoutParams.rightMargin;
        }
        layoutParams.rightMargin = i5;
        if (this.onPostMessage != null) {
            dispatchLayoutStep1.onExtraCallback("z|]V@_FiQH][XtAW`UDvUC[O@");
            new StringBuilder().insert(0, nestedScrollByInternal.onExtraCallbackWithResult("I\u007fEox~To|z^zA;\u0012;")).append(this.onPostMessage);
            String[] strArrSplit = this.onPostMessage.split(dispatchLayoutStep1.onExtraCallback("\u0012"));
            if (strArrSplit[0] != null) {
                layoutParams.width = (int) releaseHorizontalGlow.onExtraCallbackWithResult(Integer.parseInt(r5), this.requestPostMessageChannel.getApplicationContext());
            }
            if (strArrSplit[1] != null) {
                layoutParams.height = (int) releaseHorizontalGlow.onExtraCallbackWithResult(Integer.parseInt(r5), this.requestPostMessageChannel.getApplicationContext());
            }
            if (strArrSplit[2] != null) {
                layoutParams.bottomMargin = (int) releaseHorizontalGlow.onExtraCallbackWithResult(Integer.parseInt(r4), this.requestPostMessageChannel.getApplicationContext());
            }
        } else {
            int i6 = this.access000;
            if (i6 != 0) {
                i2 = i6;
            } else if (i2 == -1) {
                i2 = layoutParams.height;
            }
            layoutParams.height = i2;
        }
        editText.setLayoutParams(layoutParams);
    }

    private /* synthetic */ void onExtraCallbackWithResult(int i2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ICustomTabsServiceDefault.getLayoutParams();
        if (i2 == -1) {
            i2 = layoutParams.topMargin;
        }
        layoutParams.topMargin = i2;
        this.ICustomTabsServiceDefault.setLayoutParams(layoutParams);
    }

    private /* synthetic */ void IAuthTabCallback(String str, int i2, int i3) {
        Activity activity = this.requestPostMessageChannel;
        ImageView imageView = (ImageView) activity.findViewById(activity.getResources().getIdentifier(str, dispatchLayoutStep1.onExtraCallback("SP"), this.updateVisuals));
        if (imageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            if (i2 == -1) {
                i2 = layoutParams.leftMargin;
            }
            layoutParams.leftMargin = i2;
            if (i3 == -1) {
                i3 = layoutParams.rightMargin;
            }
            layoutParams.rightMargin = i3;
            imageView.setVisibility(0);
            return;
        }
        nestedScrollByInternal.onExtraCallbackWithResult("b]EwX~^UYv\ftBOCkzrIl\u00042");
        new StringBuilder().insert(0, str).append(dispatchLayoutStep1.onExtraCallback("\u0014OZ\\]TP"));
    }
}
